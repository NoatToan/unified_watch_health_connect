package u21;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lu21/i;", "", "", "Ls21/m;", FirebaseAnalytics.Param.ITEMS, "Lu21/e;", "showLimitReachedDialog", "", "showDisableWarningDialog", "Ls21/o;", "navigateBackWithData", "navigateBackToRecommendationsWithData", "<init>", "(Ljava/util/List;Lu21/e;ZLs21/o;Ls21/o;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<s21.m> f168000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f168001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f168002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s21.o f168003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s21.o f168004e;

    public i(List list, e eVar, boolean z14, s21.o oVar, s21.o oVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? p13.j0.f134944a : list, (i14 & 2) != 0 ? null : eVar, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? null : oVar, (i14 & 16) != 0 ? null : oVar2);
    }

    public static i a(i iVar, q13.b bVar, e eVar, boolean z14, s21.o oVar, s21.o oVar2, int i14) {
        List<s21.m> list = bVar;
        if ((i14 & 1) != 0) {
            list = iVar.f168000a;
        }
        List<s21.m> list2 = list;
        if ((i14 & 2) != 0) {
            eVar = iVar.f168001b;
        }
        e eVar2 = eVar;
        if ((i14 & 4) != 0) {
            z14 = iVar.f168002c;
        }
        boolean z15 = z14;
        if ((i14 & 8) != 0) {
            oVar = iVar.f168003d;
        }
        s21.o oVar3 = oVar;
        if ((i14 & 16) != 0) {
            oVar2 = iVar.f168004e;
        }
        iVar.getClass();
        list2.getClass();
        return new i(list2, eVar2, z15, oVar3, oVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.f168000a, iVar.f168000a) && p005kotlin.jvm.internal.s.g(this.f168001b, iVar.f168001b) && this.f168002c == iVar.f168002c && p005kotlin.jvm.internal.s.g(this.f168003d, iVar.f168003d) && p005kotlin.jvm.internal.s.g(this.f168004e, iVar.f168004e);
    }

    public final int hashCode() {
        int iHashCode = this.f168000a.hashCode() * 31;
        e eVar = this.f168001b;
        int iG = q6.f.g((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.f168002c);
        s21.o oVar = this.f168003d;
        int iHashCode2 = (iG + (oVar == null ? 0 : oVar.hashCode())) * 31;
        s21.o oVar2 = this.f168004e;
        return iHashCode2 + (oVar2 != null ? oVar2.hashCode() : 0);
    }

    public final String toString() {
        return "EditMicronutrientsUiState(items=" + this.f168000a + ", showLimitReachedDialog=" + this.f168001b + ", showDisableWarningDialog=" + this.f168002c + ", navigateBackWithData=" + this.f168003d + ", navigateBackToRecommendationsWithData=" + this.f168004e + ")";
    }

    public i() {
        this(null, null, false, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends s21.m> list, e eVar, boolean z14, s21.o oVar, s21.o oVar2) {
        list.getClass();
        this.f168000a = list;
        this.f168001b = eVar;
        this.f168002c = z14;
        this.f168003d = oVar;
        this.f168004e = oVar2;
    }
}
