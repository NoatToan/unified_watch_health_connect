package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.watchface.mvp.model.webview.JsNetwork;

/* JADX INFO: loaded from: classes12.dex */
public class oek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(JsNetwork.NetworkType.MOBILE)
    private String f44238a;

    @SerializedName("requestId")
    private int e;

    public void c(String str) {
        this.f44238a = str;
    }

    public String toString() {
        return "ESDeviceInfo{requestId=" + this.e + '}';
    }

    public void c(int i) {
        this.e = i;
    }
}
