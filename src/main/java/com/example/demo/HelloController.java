package com.example.demo;
import org.springframework.stereotype.Controller;//Controllerアノテーション
import org.springframework.ui.Model;//Modelインターフェース
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller//下記クラスは、コントローラとして機能します
public class HelloController {
	//RequestMappingとは「このアドレスにアクセスしたら、このメソッドを実行する」という、アドレスと実行する処理(メソッド)を設定
	//＠RequestMapping( value =アドレス, method = メソッド)←アノテーションの引数の書き方
	//methodでは、リクエストのメソッド(RequestMethodくらすのGET/POST)を指定する。
	//GET：指定したURLの内容をWebサーバから取り出す
	//POST：クライアントが入力した内容をWebサーバに送る
	//”/”にGETでアクセスしたら、indexメソッドを処理する。
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
    	model.addAttribute("message", "Hello World!!");
        return "index";  //表示するHTMLファイルの名前（拡張子不要）を指定
    } 
}
