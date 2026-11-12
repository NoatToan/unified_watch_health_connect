package defpackage;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("gradeList")
    protected List<b> f33882a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("type")
    protected int f33883c;

    @SerializedName("descriptionid")
    protected int e;

    public int a() {
        return this.f33883c;
    }

    public void d(int i) {
        this.f33883c = i;
    }

    public List<b> e() {
        return this.f33882a;
    }

    public void a(List<b> list) {
        this.f33882a = list;
    }

    public String toString() {
        return "BloodPressureFeatureInfo{type=" + this.f33883c + ", gradeList=" + this.f33882a + '}';
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("dia")
        protected List<Integer> f33884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("orAnd")
        protected int f33885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("grade")
        protected int f33886c;

        @SerializedName(NotificationCompat.CATEGORY_SYSTEM)
        protected List<Integer> d;

        @SerializedName("titleId")
        protected int e;

        public int a() {
            return this.f33886c;
        }

        public void c(int i) {
            this.f33886c = i;
        }

        public int c() {
            return this.e;
        }

        public void d(int i) {
            this.e = i;
        }

        public int b() {
            return this.f33885b;
        }

        public void a(int i) {
            this.f33885b = i;
        }

        public List<Integer> d() {
            return this.d;
        }

        public void e(List<Integer> list) {
            this.d = list;
        }

        public List<Integer> e() {
            return this.f33884a;
        }

        public void c(List<Integer> list) {
            this.f33884a = list;
        }

        public String toString() {
            return "Categorization{grade=" + this.f33886c + ", titleId=" + this.e + ", orAnd=" + this.f33885b + ", sys=" + this.d + ", dia=" + this.f33884a + '}';
        }
    }
}
