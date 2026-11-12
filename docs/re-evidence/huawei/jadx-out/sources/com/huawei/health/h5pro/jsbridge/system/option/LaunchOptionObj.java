package com.huawei.health.h5pro.jsbridge.system.option;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.huawei.operation.ble.BleConstants;

/* JADX INFO: loaded from: classes28.dex */
class LaunchOptionObj {

    @SerializedName(BleConstants.KEY_PATH)
    private String j = "";

    @SerializedName("isStatusBarTextBlack")
    private int i = 0;

    @SerializedName("isImmerse")
    private int d = 0;

    @SerializedName("isShowStatusBar")
    private int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("isNeedSoftInputAdapter")
    private int f6858a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("forceDarkMode")
    private int f6859b = -1;

    @SerializedName("startFlag")
    private String h = IntentStartFlag.FLAG_ACTIVITY_STANDARD.flagKey;

    @SerializedName(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)
    private int e = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("isKeepCustomizeJsModule")
    private int f6860c = 0;

    public enum IntentStartFlag {
        FLAG_ACTIVITY_SINGLE_TOP("FLAG_ACTIVITY_SINGLE_TOP", 536870912),
        FLAG_ACTIVITY_NEW_TASK("FLAG_ACTIVITY_NEW_TASK", 268435456),
        FLAG_ACTIVITY_STANDARD("FLAG_ACTIVITY_STANDARD", 0);

        private final String flagKey;
        private final int flagValue;

        IntentStartFlag(String str, int i) {
            this.flagKey = str;
            this.flagValue = i;
        }
    }

    public int a() {
        return this.f6858a;
    }

    public int b() {
        return this.f6860c;
    }

    public int c() {
        return this.f6859b;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public int f() {
        String str = this.h;
        IntentStartFlag intentStartFlag = IntentStartFlag.FLAG_ACTIVITY_NEW_TASK;
        if (TextUtils.equals(str, intentStartFlag.flagKey)) {
            return intentStartFlag.flagValue;
        }
        String str2 = this.h;
        IntentStartFlag intentStartFlag2 = IntentStartFlag.FLAG_ACTIVITY_SINGLE_TOP;
        return TextUtils.equals(str2, intentStartFlag2.flagKey) ? intentStartFlag2.flagValue : IntentStartFlag.FLAG_ACTIVITY_STANDARD.flagValue;
    }

    public int g() {
        return this.i;
    }

    public String h() {
        return this.j;
    }

    public int i() {
        return this.f;
    }
}
