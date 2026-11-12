package defpackage;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;

/* JADX INFO: loaded from: classes3.dex */
public class kjs extends CommonResponseInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("data")
    public a f23930a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("urlLink")
        public String f23931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("htmlLink")
        public String f23932b;

        @SerializedName("isPushNotificationSupported")
        public boolean c;

        public String a() {
            return this.f23932b;
        }

        public String b() {
            return this.f23931a;
        }
    }

    public a a() {
        return this.f23930a;
    }
}
