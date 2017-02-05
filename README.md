# Poker
プログラミング２課題７
テーマ「非対戦型のポーカーゲーム」
目的
掛け金を選び、役を完成させ、役の倍率で掛け金以上の金を得ることでお金を集めていく
主な実装内容
・役の判定
・山札の形成
・手札の形成
・役の説明と倍率
・ゲームによる所持金変動の処理
クラスごとの主な役割
・Mainクラス：Mainmenuクラスへの移動
・Mainmenuクラス：ゲームの開始や終了、ヘルプ閲覧などを行う
・helpクラス：ポーカーの役と倍率の説明を行う
・gameクラス：ゲームの進行を管理するクラス
・Cardstackクラス：山札を形成するクラス
・CardinHandクラス：手札を形成するクラス
・Judgecardクラス：役の判定を行うクラス
・resultクラス：ユーザーの所持金を管理するクラス
