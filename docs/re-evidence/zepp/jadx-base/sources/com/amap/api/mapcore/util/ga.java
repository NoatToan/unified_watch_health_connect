package com.amap.api.mapcore.util;

import com.amap.api.maps.AMapException;
import com.huami.sleep.daysleep.daydetail.ui.SleepDetailFragment;
import com.xiaomi.hm.health.training.ui.activity.TrainingSettingActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class ga extends Exception {
    private String a;
    private int b;

    public ga(String str) {
        super(str);
        this.a = "";
        this.b = 1000;
        this.a = str;
        if ("用户签名未通过".equals(str)) {
            this.b = 1001;
            return;
        }
        if ("用户key不正确或过期".equals(str)) {
            this.b = 1002;
            return;
        }
        if ("请求服务不存在".equals(str)) {
            this.b = 1003;
            return;
        }
        if ("访问已超出日访问量".equals(str)) {
            this.b = 1004;
            return;
        }
        if ("用户访问过于频繁".equals(str)) {
            this.b = 1005;
            return;
        }
        if ("用户IP无效".equals(str)) {
            this.b = 1006;
            return;
        }
        if ("用户域名无效".equals(str)) {
            this.b = 1007;
            return;
        }
        if ("用户MD5安全码未通过".equals(str)) {
            this.b = 1008;
            return;
        }
        if ("请求key与绑定平台不符".equals(str)) {
            this.b = 1009;
            return;
        }
        if ("IP访问超限".equals(str)) {
            this.b = 1010;
            return;
        }
        if ("服务不支持https请求".equals(str)) {
            this.b = 1011;
            return;
        }
        if ("权限不足，服务请求被拒绝".equals(str)) {
            this.b = 1012;
            return;
        }
        if ("开发者删除了key，key被删除后无法正常使用".equals(str)) {
            this.b = 1013;
            return;
        }
        if ("请求服务响应错误".equals(str)) {
            this.b = 1100;
            return;
        }
        if ("引擎返回数据异常".equals(str)) {
            this.b = 1101;
            return;
        }
        if ("服务端请求链接超时".equals(str)) {
            this.b = 1102;
            return;
        }
        if ("读取服务结果超时".equals(str)) {
            this.b = 1103;
            return;
        }
        if ("请求参数非法".equals(str)) {
            this.b = SleepDetailFragment.START_VALID_INTO_TIME;
            return;
        }
        if ("缺少必填参数".equals(str)) {
            this.b = 1201;
            return;
        }
        if ("请求协议非法".equals(str)) {
            this.b = 1202;
            return;
        }
        if ("其他未知错误".equals(str)) {
            this.b = 1203;
            return;
        }
        if (AMapException.ERROR_PROTOCOL.equals(str)) {
            this.b = 1801;
            return;
        }
        if (AMapException.ERROR_SOCKE_TIME_OUT.equals(str)) {
            this.b = 1802;
            return;
        }
        if (AMapException.ERROR_URL.equals(str)) {
            this.b = 1803;
            return;
        }
        if (AMapException.ERROR_UNKNOW_HOST.equals(str)) {
            this.b = 1804;
            return;
        }
        if ("未知错误".equals(str)) {
            this.b = 1900;
            return;
        }
        if (AMapException.ERROR_INVALID_PARAMETER.equals(str)) {
            this.b = TrainingSettingActivity.REQUEST_CODE;
            return;
        }
        if ("http或socket连接失败 - ConnectionException".equals(str)) {
            this.b = 1806;
            return;
        }
        if (AMapException.ERROR_IO.equals(str)) {
            this.b = 1902;
        } else if (AMapException.ERROR_NULL_PARAMETER.equals(str)) {
            this.b = 1903;
        } else {
            this.b = 1800;
        }
    }

    public final String a() {
        return this.a;
    }

    public ga() {
        this.a = "";
        this.b = 1000;
    }
}
