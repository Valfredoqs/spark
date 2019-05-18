package br.senai.spark.exemplospark.api;

import static spark.Spark.delete;
import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.put;

public class ClassePrincipal {

	public static void main(String[] args) {

		get("/teste01", (req, res) -> {
			return "Opa get spark";
		});

		post("/teste01", (req, res) -> {
			return req.body();
		});

		put("/teste01", (req, res) -> {
			return "Atualizado com sucesso";
		});

		delete("/teste01/:id", (req, res) -> {
			return "Apagado o id == " + req.params(":id");
		});
	}

}
