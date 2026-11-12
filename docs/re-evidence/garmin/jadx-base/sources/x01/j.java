package x01;

import b21.fb;
import b21.l4;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lx01/j;", "", "", "isLoading", "Lb21/fb;", "startDestination", "Lb21/l4;", "route", "showError", "Lx01/e;", "featureState", "<init>", "(ZLb21/fb;Lb21/l4;ZLx01/e;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f188282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fb f188283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l4 f188284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f188285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f188286e;

    public /* synthetic */ j(boolean z14, fb fbVar, l4 l4Var, boolean z15, e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : fbVar, (i14 & 4) == 0 ? l4Var : null, (i14 & 8) == 0 ? z15 : false, (i14 & 16) != 0 ? new e(null, null, null, null, false, false, false, 127, null) : eVar);
    }

    public static j a(j jVar, boolean z14, fb fbVar, l4 l4Var, e eVar, int i14) {
        if ((i14 & 2) != 0) {
            fbVar = jVar.f188283b;
        }
        fb fbVar2 = fbVar;
        if ((i14 & 4) != 0) {
            l4Var = jVar.f188284c;
        }
        l4 l4Var2 = l4Var;
        boolean z15 = (i14 & 8) != 0 ? jVar.f188285d : true;
        if ((i14 & 16) != 0) {
            eVar = jVar.f188286e;
        }
        e eVar2 = eVar;
        jVar.getClass();
        eVar2.getClass();
        return new j(z14, fbVar2, l4Var2, z15, eVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f188282a == jVar.f188282a && s.g(this.f188283b, jVar.f188283b) && s.g(this.f188284c, jVar.f188284c) && this.f188285d == jVar.f188285d && s.g(this.f188286e, jVar.f188286e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f188282a) * 31;
        fb fbVar = this.f188283b;
        int iHashCode2 = (iHashCode + (fbVar == null ? 0 : fbVar.hashCode())) * 31;
        l4 l4Var = this.f188284c;
        return this.f188286e.hashCode() + q6.f.g((iHashCode2 + (l4Var != null ? l4Var.hashCode() : 0)) * 31, 31, this.f188285d);
    }

    public final String toString() {
        return "NutritionUIState(isLoading=" + this.f188282a + ", startDestination=" + this.f188283b + ", route=" + this.f188284c + ", showError=" + this.f188285d + ", featureState=" + this.f188286e + ")";
    }

    public j(boolean z14, fb fbVar, l4 l4Var, boolean z15, e eVar) {
        eVar.getClass();
        this.f188282a = z14;
        this.f188283b = fbVar;
        this.f188284c = l4Var;
        this.f188285d = z15;
        this.f188286e = eVar;
    }

    public j() {
        this(false, null, null, false, null, 31, null);
    }
}
