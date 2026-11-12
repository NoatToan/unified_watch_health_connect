package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes37.dex */
public class lpf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("ImagePath")
    private String f40588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("VideoId")
    private String f40589b;

    @SerializedName("VideoPath")
    private String d;

    @SerializedName("ImageId")
    private String e;

    public lpf(e eVar) {
        this.f40588a = eVar.d;
        this.d = eVar.f40590a;
        this.e = eVar.f40592c;
        this.f40589b = eVar.f40591b;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f40590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f40591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f40592c;
        private String d;

        public e a(String str) {
            this.d = str;
            return this;
        }

        public e e(String str) {
            this.f40590a = str;
            return this;
        }

        public e c(String str) {
            this.f40592c = str;
            return this;
        }

        public e d(String str) {
            this.f40591b = str;
            return this;
        }

        public lpf e() {
            return new lpf(this);
        }
    }
}
