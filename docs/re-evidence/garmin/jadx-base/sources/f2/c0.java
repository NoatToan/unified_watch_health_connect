package f2;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lf2/c0;", "", "", FirebaseAnalytics.Param.INDEX, "", "Lf2/a0;", FirebaseAnalytics.Param.ITEMS, "Lf2/l0;", "slots", "", "Lf2/c;", "spans", "", "isVertical", "mainAxisSpacing", "<init>", "(I[Lf2/a0;Lf2/l0;Ljava/util/List;ZI)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0[] f68180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f68181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<c> f68182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f68183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f68184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f68185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f68186h;

    public c0(int i14, a0[] a0VarArr, l0 l0Var, List<c> list, boolean z14, int i15) {
        this.f68179a = i14;
        this.f68180b = a0VarArr;
        this.f68181c = l0Var;
        this.f68182d = list;
        this.f68183e = z14;
        this.f68184f = i15;
        int iMax = 0;
        for (a0 a0Var : a0VarArr) {
            iMax = Math.max(iMax, a0Var.f68163p);
        }
        this.f68185g = iMax;
        int i16 = iMax + this.f68184f;
        this.f68186h = i16 >= 0 ? i16 : 0;
    }

    public final a0[] a(int i14, int i15, int i16) {
        a0[] a0VarArr = this.f68180b;
        int length = a0VarArr.length;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < length) {
            a0 a0Var = a0VarArr[i17];
            int i24 = i18 + 1;
            int i25 = (int) this.f68182d.get(i18).f68178a;
            int i26 = this.f68181c.f68234b[i19];
            int i27 = this.f68179a;
            boolean z14 = this.f68183e;
            a0Var.r(i14, i26, i15, i16, z14 ? i27 : i19, z14 ? i19 : i27);
            Unit unit = Unit.INSTANCE;
            i19 += i25;
            i17++;
            i18 = i24;
        }
        return a0VarArr;
    }
}
