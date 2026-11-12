package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class pcn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("resultCode")
    private int f45169b;

    @SerializedName("recommendResources")
    private List<a> e;

    public List<a> e() {
        return this.e;
    }

    public String toString() {
        return "RecommendResourcesBean{resultCode=" + this.f45169b + ", recommendResourceList=" + this.e + '}';
    }

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("icon")
        private String f45170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("category")
        private String f45171c;

        @SerializedName("name")
        private String d;

        @SerializedName("id")
        private String e;

        public String a() {
            return this.d;
        }

        public String e() {
            return this.e;
        }

        public String b() {
            return this.f45170b;
        }

        public String toString() {
            return "RecommendResource{name='" + this.d + "', category='" + this.f45171c + "', id='" + this.e + "', icon='" + this.f45170b + "'}";
        }
    }
}
