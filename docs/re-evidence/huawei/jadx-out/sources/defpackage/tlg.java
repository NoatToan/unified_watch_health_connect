package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes18.dex */
public class tlg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("responseCode")
    private String f49318a;

    @SerializedName("responseDesc")
    private String d;

    @SerializedName("responseData")
    private e e;

    public class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("languageCode")
        private String f49320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("isChildren")
        private String f49321c;

        @SerializedName("isSupport")
        private String d;

        @SerializedName("siteCode")
        private String e;

        @SerializedName("url")
        private String h;

        public e() {
        }

        public String c() {
            return this.d;
        }

        public String d() {
            return this.e;
        }

        public String b() {
            return this.f49320b;
        }

        public String e() {
            return this.h;
        }
    }

    public e b() {
        if (this.e == null) {
            this.e = new e();
        }
        return this.e;
    }
}
