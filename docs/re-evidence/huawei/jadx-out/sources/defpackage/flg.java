package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class flg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("labelThresholdValue")
    private List<b> f34161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("chooseNum")
    private int f34162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("deliver")
    private int f34163c;

    public List<b> c() {
        return this.f34161a;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("description")
        private String f34164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("technologyCaliber")
        private String f34165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("displayName")
        private String f34166c;

        @SerializedName("thresholdValue")
        private String d;

        public String d() {
            return this.d;
        }

        public String e() {
            return this.f34165b;
        }
    }
}
