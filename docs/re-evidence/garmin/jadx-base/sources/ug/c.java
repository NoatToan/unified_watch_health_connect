package ug;

/* JADX INFO: loaded from: classes7.dex */
public enum c {
    SUCCEEDED(9000, "处理成功"),
    FAILED(4000, "系统繁忙，请稍后再试"),
    CANCELED(6001, "用户取消"),
    NETWORK_ERROR(6002, "网络连接异常"),
    ACTIVITY_NOT_START_EXIT(6007, "支付未完成"),
    PARAMS_ERROR(4001, "参数错误"),
    DOUBLE_REQUEST(5000, "重复请求"),
    PAY_WAITTING(8000, "支付结果确认中");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f170562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170563b;

    c(int i14, String str) {
        this.f170562a = i14;
        this.f170563b = str;
    }

    public static c a(int i14) {
        if (i14 == 4001) {
            return PARAMS_ERROR;
        }
        if (i14 == 5000) {
            return DOUBLE_REQUEST;
        }
        if (i14 == 8000) {
            return PAY_WAITTING;
        }
        if (i14 == 9000) {
            return SUCCEEDED;
        }
        if (i14 != 6001) {
            return i14 != 6002 ? FAILED : NETWORK_ERROR;
        }
        return CANCELED;
    }
}
