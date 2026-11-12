package u21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu21/e0;", "", "", "caloriesGoal", "", "showOverrideWarning", "showCaloriesTooLowWarning", "navigateBackWithData", "<init>", "(Ljava/lang/Integer;ZZZ)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f167938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f167941d;

    public /* synthetic */ e0(Integer num, boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? false : z16);
    }

    public static e0 a(e0 e0Var, Integer num, boolean z14, boolean z15, boolean z16, int i14) {
        if ((i14 & 1) != 0) {
            num = e0Var.f167938a;
        }
        if ((i14 & 2) != 0) {
            z14 = e0Var.f167939b;
        }
        if ((i14 & 4) != 0) {
            z15 = e0Var.f167940c;
        }
        if ((i14 & 8) != 0) {
            z16 = e0Var.f167941d;
        }
        e0Var.getClass();
        return new e0(num, z14, z15, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return p005kotlin.jvm.internal.s.g(this.f167938a, e0Var.f167938a) && this.f167939b == e0Var.f167939b && this.f167940c == e0Var.f167940c && this.f167941d == e0Var.f167941d;
    }

    public final int hashCode() {
        Integer num = this.f167938a;
        return Boolean.hashCode(this.f167941d) + q6.f.g(q6.f.g((num == null ? 0 : num.hashCode()) * 31, 31, this.f167939b), 31, this.f167940c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NutritionSetupCaloriesGoalUiModel(caloriesGoal=");
        sb3.append(this.f167938a);
        sb3.append(", showOverrideWarning=");
        sb3.append(this.f167939b);
        sb3.append(", showCaloriesTooLowWarning=");
        return com.airbnb.lottie.animation.keyframe.a.f(", navigateBackWithData=", ")", sb3, this.f167940c, this.f167941d);
    }

    public e0(Integer num, boolean z14, boolean z15, boolean z16) {
        this.f167938a = num;
        this.f167939b = z14;
        this.f167940c = z15;
        this.f167941d = z16;
    }

    public e0() {
        this(null, false, false, false, 15, null);
    }
}
