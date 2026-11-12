package defpackage;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fdg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("type")
    protected String f33889c;

    @SerializedName("thresholdList")
    protected List<b> e;

    public String d() {
        return this.f33889c;
    }

    public List<b> c() {
        return this.e;
    }

    public String toString() {
        return "DynamicBloodPressureFeatureInfo{type='" + this.f33889c + "', thresholdList=" + this.e + '}';
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("dia")
        protected List<Integer> f33890c;

        @SerializedName(NotificationCompat.CATEGORY_SYSTEM)
        protected List<Integer> d;

        public List<Integer> c() {
            return this.d;
        }

        public List<Integer> b() {
            return this.f33890c;
        }

        public String toString() {
            return "DynamicBloodPressureTypeCategorization{sys=" + this.d + ", dia=" + this.f33890c + '}';
        }
    }
}
