package com.huami.passport.auth;

import com.huami.watch.companion.xiaomiai.EngineProcessor;
import com.unionpay.tsm.constant.TsmResultCode;

/* JADX INFO: loaded from: classes12.dex */
public enum IError {
    EC_10001(10001, "未支持操作错误"),
    EC_10002(10002, "内部程序出错"),
    EC_10003(10003, "校验签名错误"),
    EC_10004(EngineProcessor.MSG_NEW_ANSWER_RESULT, "用户未登录"),
    EC_10005(10005, "网络无法访问"),
    EC_10006(10006, "服务返回未知错误"),
    EC_10007(10007, "用户取消操作"),
    EC_10008(10008, "未配置访问权限错误"),
    EC_10009(10009, "APPID未配置错误"),
    EC_10010(10010, "目标APP版本不支持错误"),
    EC_10011(10011, "未收到数据错误"),
    EC_10012(10012, "数据解析失败"),
    EC_10013(TsmResultCode.ERROR_CARD_DOWNLOAD_FAIL, "当前用户区域设置错误"),
    EC_10014(10014, "目标APP未安装"),
    EC_10015(10015, "参数检查错误");

    public int errorCode;
    public String errorMsg;

    IError(int i, String str) {
        this.errorCode = i;
        this.errorMsg = str;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }
}
