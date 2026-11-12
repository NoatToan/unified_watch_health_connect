package defpackage;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.health.h5pro.webkit.HpkManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class exi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("bg")
    private String f33615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("bgPadDark")
    private String f33616c;

    @SerializedName("bgDark")
    private String d;

    @SerializedName("bgPad")
    private String e;

    @SerializedName("iconDark")
    private String f;

    @SerializedName("icon")
    private String h;

    @SerializedName("color")
    private String i;

    private String d(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f33614a)) {
            return "";
        }
        Locale locale = Locale.ENGLISH;
        return this.f33614a + str;
    }

    public void a(String str) {
        this.f33614a = HpkManager.e.getBaseUrl(str);
    }

    public String c() {
        return this.i;
    }

    public String d() {
        return d(this.f33615b);
    }

    public String toString() {
        return "LoadingConfigObj{baseUrl='" + this.f33614a + "', color='" + this.i + "', bg='" + this.f33615b + "', bgDark='" + this.d + "', bgPad='" + this.e + "', bgPadDark='" + this.f33616c + "', icon='" + this.h + "', iconDark='" + this.f + "'}";
    }
}
