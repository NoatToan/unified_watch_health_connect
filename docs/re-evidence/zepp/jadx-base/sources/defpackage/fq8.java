package defpackage;

import com.huami.discovery.bridge.WebUserAgenter;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class fq8 {
    public static String a(WebUserAgenter _this, String str) {
        return (str.contains(" wv") ? str.replace(" wv", "") : str.replace("Version/", "xxx/")) + _this.getUAString();
    }
}
