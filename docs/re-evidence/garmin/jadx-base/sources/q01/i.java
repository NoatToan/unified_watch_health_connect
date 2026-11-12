package q01;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import s21.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lq01/i;", "", "Lq01/h;", "recipeData", "", "Lg01/c;", "units", "Ls21/o;", "micronutrientsSettings", "<init>", "(Lq01/h;Ljava/util/List;Ls21/o;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f142032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g01.c> f142033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f142034c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(h hVar, List<? extends g01.c> list, o oVar) {
        hVar.getClass();
        list.getClass();
        this.f142032a = hVar;
        this.f142033b = list;
        this.f142034c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f142032a, iVar.f142032a) && s.g(this.f142033b, iVar.f142033b) && s.g(this.f142034c, iVar.f142034c);
    }

    public final int hashCode() {
        int iB = u0.b(this.f142032a.hashCode() * 31, 31, this.f142033b);
        o oVar = this.f142034c;
        return iB + (oVar == null ? 0 : oVar.hashCode());
    }

    public final String toString() {
        return "RecipeDetailsData(recipeData=" + this.f142032a + ", units=" + this.f142033b + ", micronutrientsSettings=" + this.f142034c + ")";
    }

    public /* synthetic */ i(h hVar, List list, o oVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(hVar, list, (i14 & 4) != 0 ? null : oVar);
    }
}
