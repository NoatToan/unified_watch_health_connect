package s12;

import android.os.Parcelable;
import li0.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ls12/n;", "", "", "isOwner", "ableToReportProfileImage", "Lkotlin/Function0;", "", "onReportProfileImage", "Lli0/d0;", "data", "Lli0/f;", "action", "<init>", "(ZZLe23/a;Lli0/d0;Lli0/f;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f155983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f155984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f155985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f155986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final li0.f f155987e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155988a;

        static {
            int[] iArr = new int[hi0.e.b.values().length];
            try {
                iArr[hi0.e.b.FOLLOWING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hi0.e.b.MUTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hi0.e.b.FOLLOWED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f155988a = iArr;
        }
    }

    static {
        li0.f.a aVar = li0.f.f112657g;
        Parcelable.Creator<d0> creator = d0.CREATOR;
    }

    public /* synthetic */ n(boolean z14, boolean z15, e23.a aVar, d0 d0Var, li0.f fVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, aVar, d0Var, fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f155983a == nVar.f155983a && this.f155984b == nVar.f155984b && s.g(this.f155985c, nVar.f155985c) && s.g(this.f155986d, nVar.f155986d) && s.g(this.f155987e, nVar.f155987e);
    }

    public final int hashCode() {
        return this.f155987e.hashCode() + ((this.f155986d.hashCode() + q6.f.f(q6.f.g(Boolean.hashCode(this.f155983a) * 31, 31, this.f155984b), 31, this.f155985c)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("ProfileOverflowMenuData(isOwner=", ", ableToReportProfileImage=", ", onReportProfileImage=", this.f155983a, this.f155984b);
        sbM.append(this.f155985c);
        sbM.append(", data=");
        sbM.append(this.f155986d);
        sbM.append(", action=");
        sbM.append(this.f155987e);
        sbM.append(")");
        return sbM.toString();
    }

    public n(boolean z14, boolean z15, e23.a<Unit> aVar, d0 d0Var, li0.f fVar) {
        aVar.getClass();
        d0Var.getClass();
        fVar.getClass();
        this.f155983a = z14;
        this.f155984b = z15;
        this.f155985c = aVar;
        this.f155986d = d0Var;
        this.f155987e = fVar;
    }
}
