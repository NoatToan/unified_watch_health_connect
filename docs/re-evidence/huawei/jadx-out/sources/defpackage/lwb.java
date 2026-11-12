package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes10.dex */
public class lwb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("data")
    private d f40953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("code")
    private int f40954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("message")
    private String f40955c;

    @SerializedName("success")
    private boolean d;

    public int e() {
        return this.f40954b;
    }

    public d a() {
        return this.f40953a;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("deviceId")
        private String f40956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("deviceSecret")
        private String f40957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("productId")
        private String f40958c;

        @SerializedName("deviceNo")
        private String d;

        public String e() {
            return this.f40956a;
        }

        public String c() {
            return this.d;
        }

        public String a() {
            return this.f40958c;
        }

        public String d() {
            return this.f40957b;
        }
    }
}
