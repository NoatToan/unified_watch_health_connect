package s21;

import com.google.firebase.perf.util.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ls21/i;", "", "", "mealIndex", "", "mealName", "", "isTranslated", Constants.ENABLE_DISABLE, "<init>", "(ILjava/lang/String;ZZ)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f156127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f156128d;

    public i(int i14, String str, boolean z14, boolean z15) {
        str.getClass();
        this.f156125a = i14;
        this.f156126b = str;
        this.f156127c = z14;
        this.f156128d = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f156125a == iVar.f156125a && this.f156126b.equals(iVar.f156126b) && this.f156127c == iVar.f156127c && this.f156128d == iVar.f156128d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f156128d) + q6.f.g(wr.g.j(Integer.hashCode(this.f156125a) * 31, 31, this.f156126b), 31, this.f156127c);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.f(", isEnabled=", ")", wr.g.r(this.f156125a, "ManageableMealItem(mealIndex=", ", mealName=", this.f156126b, ", isTranslated="), this.f156127c, this.f156128d);
    }
}
