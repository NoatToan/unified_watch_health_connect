package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.HwEncryptUtil;
import health.compact.a.util.LogUtil;
import java.security.GeneralSecurityException;
import ohos.ace.adapter.capability.web.WebDataBaseColumns;

/* JADX INFO: loaded from: classes11.dex */
public class nao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("wifiModeCapabilities")
    private String f42830a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(WebDataBaseColumns.EntryColumns.COLUMN_NAME_USERPASS)
    private String f42831c;

    @SerializedName("encodeType")
    private int d;

    @SerializedName("wifiSsid")
    private String e;

    public String e() {
        return this.e;
    }

    public void e(String str) {
        this.e = str;
    }

    public String b() {
        return this.f42831c;
    }

    public void d(String str) {
        this.f42831c = str;
    }

    public int c() {
        return this.d;
    }

    public void e(int i) {
        this.d = i;
    }

    public String a() {
        return this.f42830a;
    }

    public void b(String str) {
        this.f42830a = str;
    }

    public String toString() {
        try {
            return "SyncWifiSendMessageEntity{wifiSsid='" + this.e + "', password='" + HwEncryptUtil.b(BaseApplication.getContext()).c(1, this.f42831c) + "', encodeType=" + this.d + "', wifiModeCapabilities=" + this.f42830a + '}';
        } catch (GeneralSecurityException unused) {
            LogUtil.d("SyncWifiSendMessageEntity", "decryptData is error");
            return "";
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return toString().equals(obj.toString());
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
