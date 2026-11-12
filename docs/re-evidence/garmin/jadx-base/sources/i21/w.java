package i21;

import c22.c3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li21/w;", "", "Lc22/c3;", "titleResId", "descriptionResId", "Lu4/d;", "icon", "<init>", "(Lc22/c3;Lc22/c3;Lu4/d;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f87371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f87372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u4.d f87373c;

    public w(c3 c3Var, c3 c3Var2, u4.d dVar) {
        c3Var.getClass();
        c3Var2.getClass();
        dVar.getClass();
        this.f87371a = c3Var;
        this.f87372b = c3Var2;
        this.f87373c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f87371a.equals(wVar.f87371a) && this.f87372b.equals(wVar.f87372b) && this.f87373c.equals(wVar.f87373c);
    }

    public final int hashCode() {
        return this.f87373c.hashCode() + ((this.f87372b.hashCode() + (this.f87371a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NutritionUpdateItem(titleResId=" + this.f87371a + ", descriptionResId=" + this.f87372b + ", icon=" + this.f87373c + ")";
    }
}
