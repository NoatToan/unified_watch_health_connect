package defpackage;

import androidx.health.connect.client.records.MealType;
import com.google.gson.annotations.SerializedName;
import com.huawei.health.knit.ui.KnitFragment;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class iuy implements Serializable {
    private static final long serialVersionUID = 7505480085796770549L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(MealType.BREAKFAST)
    private int f38060a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(MealType.LUNCH)
    private int f38061c;

    @SerializedName(KnitFragment.KEY_EXTRA)
    private int d;

    @SerializedName(MealType.DINNER)
    private int e;

    public void a(int i) {
        this.f38060a = i;
    }

    public void d(int i) {
        this.f38061c = i;
    }

    public void b(int i) {
        this.e = i;
    }

    public void c(int i) {
        this.d = i;
    }

    public String toString() {
        return "ProportionMeal{mBreakfast=" + this.f38060a + ", mLunch=" + this.f38061c + ", mDinner=" + this.e + ", mExtra=" + this.d + '}';
    }
}
