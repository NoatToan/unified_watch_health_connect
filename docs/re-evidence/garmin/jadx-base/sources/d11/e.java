package d11;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ld11/e;", "", "", "nameError", "servingError", "atLeastOneIngredientRequiredError", "ingredientsLimitReachedError", "imageFailedToSaveError", "saveError", "loadError", "<init>", "(ZZZZZZZ)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f57060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f57062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f57063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f57064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f57065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f57066g;

    public /* synthetic */ e(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17, (i14 & 16) != 0 ? false : z18, (i14 & 32) != 0 ? false : z19, (i14 & 64) != 0 ? false : z24);
    }

    public static e a(e eVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, int i14) {
        if ((i14 & 1) != 0) {
            z14 = eVar.f57060a;
        }
        boolean z25 = z14;
        if ((i14 & 2) != 0) {
            z15 = eVar.f57061b;
        }
        boolean z26 = z15;
        if ((i14 & 4) != 0) {
            z16 = eVar.f57062c;
        }
        boolean z27 = z16;
        if ((i14 & 8) != 0) {
            z17 = eVar.f57063d;
        }
        boolean z28 = z17;
        if ((i14 & 16) != 0) {
            z18 = eVar.f57064e;
        }
        boolean z29 = z18;
        if ((i14 & 32) != 0) {
            z19 = eVar.f57065f;
        }
        boolean z34 = z19;
        if ((i14 & 64) != 0) {
            z24 = eVar.f57066g;
        }
        eVar.getClass();
        return new e(z25, z26, z27, z28, z29, z34, z24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f57060a == eVar.f57060a && this.f57061b == eVar.f57061b && this.f57062c == eVar.f57062c && this.f57063d == eVar.f57063d && this.f57064e == eVar.f57064e && this.f57065f == eVar.f57065f && this.f57066g == eVar.f57066g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57066g) + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.f57060a) * 31, 31, this.f57061b), 31, this.f57062c), 31, this.f57063d), 31, this.f57064e), 31, this.f57065f);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("ErrorsState(nameError=", ", servingError=", ", atLeastOneIngredientRequiredError=", this.f57060a, this.f57061b);
        kg.f.q(", ingredientsLimitReachedError=", ", imageFailedToSaveError=", sbM, this.f57062c, this.f57063d);
        kg.f.q(", saveError=", ", loadError=", sbM, this.f57064e, this.f57065f);
        return hb.a.k(sbM, this.f57066g, ")");
    }

    public e(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24) {
        this.f57060a = z14;
        this.f57061b = z15;
        this.f57062c = z16;
        this.f57063d = z17;
        this.f57064e = z18;
        this.f57065f = z19;
        this.f57066g = z24;
    }

    public e() {
        this(false, false, false, false, false, false, false, 127, null);
    }
}
