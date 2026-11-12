package com.alipay.sdk.m.j;

import com.alipay.sdk.app.OpenAuthTask;
import com.google.android.exoplayer2.PlaybackException;

/* JADX INFO: loaded from: classes2.dex */
public enum c {
    SUCCEEDED(OpenAuthTask.OK, "处理成功"),
    FAILED(4000, "系统繁忙，请稍后再试"),
    CANCELED(PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED, "用户取消"),
    NETWORK_ERROR(PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED, "网络连接异常"),
    ACTIVITY_NOT_START_EXIT(PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED, "支付未完成"),
    PARAMS_ERROR(4001, "参数错误"),
    DOUBLE_REQUEST(5000, "重复请求"),
    PAY_WAITTING(8000, "支付结果确认中");

    public int a;
    public String b;

    c(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public void a(int i) {
        this.a = i;
    }

    public int b() {
        return this.a;
    }

    public static c b(int i) {
        if (i == 4001) {
            return PARAMS_ERROR;
        }
        if (i == 5000) {
            return DOUBLE_REQUEST;
        }
        if (i == 8000) {
            return PAY_WAITTING;
        }
        if (i == 9000) {
            return SUCCEEDED;
        }
        if (i != 6001) {
            return i != 6002 ? FAILED : NETWORK_ERROR;
        }
        return CANCELED;
    }

    public void a(String str) {
        this.b = str;
    }

    public String a() {
        return this.b;
    }
}
