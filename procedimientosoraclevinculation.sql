CREATE OR REPLACE PROCEDURE ObtenerDatosComplementaryActivityCompany(
    resultados OUT SYS_REFCURSOR
)
AS
BEGIN
    OPEN resultados FOR
        SELECT
            cac.idComplementaryActivityCompany,
            c.idcompany AS idcompany,
            c.name AS name,
            cac.idcomplementaryactivity AS idcomplementaryactivity,
            ca.activityname AS activityname
        FROM
            ComplementaryActivityCompany cac
        INNER JOIN
            Company c ON cac.idcompany = c.idcompany
        INNER JOIN
            ComplementaryActivity ca ON cac.idcomplementaryactivity = ca.idcomplementaryactivity
		WHERE cac.status = 1
        order by cac.idComplementaryActivityCompany;
END ObtenerDatosComplementaryActivityCompany;