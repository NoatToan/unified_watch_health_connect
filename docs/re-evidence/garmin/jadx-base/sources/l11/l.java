package l11;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll11/l;", "", "Lb11/a$b;", "meal", "Lb63/v;", "time", "Lg21/h;", "dailySummary", "Li53/c;", "Lb11/l;", "mealWindows", "", "isTimelineView", "<init>", "(Lb11/a$b;Lb63/v;Lg21/h;Li53/c;Z)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b11.a.b f108179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.v f108180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g21.h f108181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<b11.l> f108182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f108183e;

    public l(b11.a.b bVar, b63.v vVar, g21.h hVar, i53.c<b11.l> cVar, boolean z14) {
        bVar.getClass();
        vVar.getClass();
        hVar.getClass();
        cVar.getClass();
        this.f108179a = bVar;
        this.f108180b = vVar;
        this.f108181c = hVar;
        this.f108182d = cVar;
        this.f108183e = z14;
    }

    public static l a(l lVar, b11.a.b bVar, b63.v vVar, int i14) {
        if ((i14 & 1) != 0) {
            bVar = lVar.f108179a;
        }
        b11.a.b bVar2 = bVar;
        if ((i14 & 2) != 0) {
            vVar = lVar.f108180b;
        }
        b63.v vVar2 = vVar;
        g21.h hVar = lVar.f108181c;
        i53.c<b11.l> cVar = lVar.f108182d;
        boolean z14 = lVar.f108183e;
        lVar.getClass();
        vVar2.getClass();
        return new l(bVar2, vVar2, hVar, cVar, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f108179a.equals(lVar.f108179a) && this.f108180b.equals(lVar.f108180b) && this.f108181c.equals(lVar.f108181c) && this.f108182d.equals(lVar.f108182d) && this.f108183e == lVar.f108183e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f108183e) + l2.a(this.f108182d, (this.f108181c.hashCode() + l2.c(this.f108180b.f16219a, this.f108179a.hashCode() * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MealDetailsData(meal=");
        sb3.append(this.f108179a);
        sb3.append(", time=");
        sb3.append(this.f108180b);
        sb3.append(", dailySummary=");
        sb3.append(this.f108181c);
        sb3.append(", mealWindows=");
        sb3.append(this.f108182d);
        sb3.append(", isTimelineView=");
        return hb.a.k(sb3, this.f108183e, ")");
    }
}
