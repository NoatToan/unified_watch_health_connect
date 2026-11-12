package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes8.dex */
public class gzj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("lang")
    private String f36275a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("workoutPackageId")
    private String f36276c;

    private gzj(c cVar) {
        this.f36275a = cVar.f36277a;
        this.f36276c = cVar.f36278b;
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f36278b;

        public c(String str) {
            this.f36278b = str;
        }

        public c c(String str) {
            this.f36277a = str;
            return this;
        }

        public gzj c() {
            return new gzj(this);
        }
    }

    public String d() {
        return this.f36275a;
    }

    public String e() {
        return this.f36276c;
    }
}
