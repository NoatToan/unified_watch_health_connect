package h2;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import f5.v1;
import java.util.List;
import p005kotlin.Metadata;
import p008y1.b2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lh2/h;", "Lh2/i;", "", FirebaseAnalytics.Param.INDEX, "size", "", "Lf5/v1;", "placeables", "Lg6/k;", "visualOffset", "", Action.KEY_ATTRIBUTE, "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "Lh4/d$b;", "horizontalAlignment", "Lh4/d$c;", "verticalAlignment", "Lg6/o;", "layoutDirection", "", "reverseLayout", "<init>", "(IILjava/util/List;JLjava/lang/Object;Ly1/b2;Lh4/d$b;Lh4/d$c;Lg6/o;ZLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<v1> f80908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f80909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f80910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h4.d.b f80911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h4.d.c f80912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g6.o f80913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f80914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f80915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f80916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f80917l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f80918m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f80919n;

    /* JADX WARN: Multi-variable type inference failed */
    private h(int i14, int i15, List<? extends v1> list, long j8, Object obj, b2 b2Var, h4.d.b bVar, h4.d.c cVar, g6.o oVar, boolean z14) {
        this.f80906a = i14;
        this.f80907b = i15;
        this.f80908c = list;
        this.f80909d = j8;
        this.f80910e = obj;
        this.f80911f = bVar;
        this.f80912g = cVar;
        this.f80913h = oVar;
        this.f80914i = z14;
        this.f80915j = b2Var == b2.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i16 = 0; i16 < size; i16++) {
            v1 v1Var = (v1) list.get(i16);
            iMax = Math.max(iMax, !this.f80915j ? v1Var.f69145b : v1Var.f69144a);
        }
        this.f80916k = iMax;
        this.f80917l = new int[this.f80908c.size() * 2];
        this.f80919n = Integer.MIN_VALUE;
    }

    public final void a(int i14) {
        this.f80918m += i14;
        int[] iArr = this.f80917l;
        int length = iArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            boolean z14 = this.f80915j;
            if ((z14 && i15 % 2 == 1) || (!z14 && i15 % 2 == 0)) {
                iArr[i15] = iArr[i15] + i14;
            }
        }
    }

    public final void b(int i14, int i15, int i16) {
        int i17;
        this.f80918m = i14;
        boolean z14 = this.f80915j;
        this.f80919n = z14 ? i16 : i15;
        List<v1> list = this.f80908c;
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            v1 v1Var = list.get(i18);
            int i19 = i18 * 2;
            int[] iArr = this.f80917l;
            if (z14) {
                h4.d.b bVar = this.f80911f;
                if (bVar == null) {
                    b2.e.b("null horizontalAlignment");
                    o2.c.f();
                    return;
                } else {
                    iArr[i19] = bVar.a(v1Var.f69144a, i15, this.f80913h);
                    iArr[i19 + 1] = i14;
                    i17 = v1Var.f69145b;
                }
            } else {
                iArr[i19] = i14;
                int i24 = i19 + 1;
                h4.d.c cVar = this.f80912g;
                if (cVar == null) {
                    b2.e.b("null verticalAlignment");
                    o2.c.f();
                    return;
                } else {
                    iArr[i24] = cVar.a(v1Var.f69145b, i16);
                    i17 = v1Var.f69144a;
                }
            }
            i14 += i17;
        }
    }

    @Override // h2.i
    /* JADX INFO: renamed from: getIndex, reason: from getter */
    public final int getF80906a() {
        return this.f80906a;
    }

    @Override // h2.i
    /* JADX INFO: renamed from: getOffset, reason: from getter */
    public final int getF80918m() {
        return this.f80918m;
    }

    public /* synthetic */ h(int i14, int i15, List list, long j8, Object obj, b2 b2Var, h4.d.b bVar, h4.d.c cVar, g6.o oVar, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, list, j8, obj, b2Var, bVar, cVar, oVar, z14);
    }
}
