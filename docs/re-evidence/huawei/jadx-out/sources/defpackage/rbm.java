package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class rbm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("title")
    private String f47093a;

    @SerializedName("description")
    private String d;

    @SerializedName("permissions")
    private List<a> e;

    public String c() {
        return this.f47093a;
    }

    public List<a> e() {
        return this.e;
    }

    public String a() {
        return this.d;
    }

    public String toString() {
        return "PermissionsNote{title='" + this.f47093a + "', description='" + this.d + "', permissions=" + this.e + '}';
    }

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("name")
        private String f47094b;

        @SerializedName("description")
        private String d;

        public String d() {
            return this.f47094b;
        }

        public String b() {
            return this.d;
        }

        public String toString() {
            return "PermissionsBean{name='" + this.f47094b + "', description='" + this.d + "'}";
        }
    }
}
