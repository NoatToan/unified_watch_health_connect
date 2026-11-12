package e2;

import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import f5.a1;
import f5.e2;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.b2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u009f\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Le2/x;", "Le2/v;", "Lf5/a1;", "Le2/y;", "firstVisibleItem", "", "firstVisibleItemScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "scrollBackAmount", "remeasureNeeded", "Lo53/b0;", "coroutineScope", "Lg6/c;", "density", "Lg6/a;", "childConstraints", "", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Le2/y;IZFLf5/a1;FZLo53/b0;Lg6/c;JLjava/util/List;IIIZLy1/b2;IILkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x implements v, a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f62541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f62543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f62544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a1 f62545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f62546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f62547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o53.b0 f62548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g6.c f62549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f62550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<y> f62551k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f62552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f62553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f62554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f62555o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b2 f62556p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f62557q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f62558r;

    private x(y yVar, int i14, boolean z14, float f14, a1 a1Var, float f15, boolean z15, o53.b0 b0Var, g6.c cVar, long j8, List<y> list, int i15, int i16, int i17, boolean z16, b2 b2Var, int i18, int i19) {
        this.f62541a = yVar;
        this.f62542b = i14;
        this.f62543c = z14;
        this.f62544d = f14;
        this.f62545e = a1Var;
        this.f62546f = f15;
        this.f62547g = z15;
        this.f62548h = b0Var;
        this.f62549i = cVar;
        this.f62550j = j8;
        this.f62551k = list;
        this.f62552l = i15;
        this.f62553m = i16;
        this.f62554n = i17;
        this.f62555o = z16;
        this.f62556p = b2Var;
        this.f62557q = i18;
        this.f62558r = i19;
    }

    @Override // e2.v
    public final long a() {
        a1 a1Var = this.f62545e;
        long f81748b = (((long) a1Var.getF81748b()) << 32) | (((long) a1Var.getF81749c()) & 4294967295L);
        g6.m.a aVar = g6.m.f76012b;
        return f81748b;
    }

    @Override // e2.v
    public final int b() {
        return -this.f62552l;
    }

    @Override // e2.v
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF62557q() {
        return this.f62557q;
    }

    @Override // e2.v
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF62554n() {
        return this.f62554n;
    }

    @Override // e2.v
    public final List<y> e() {
        return this.f62551k;
    }

    @Override // e2.v
    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getF62552l() {
        return this.f62552l;
    }

    @Override // e2.v
    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getF62553m() {
        return this.f62553m;
    }

    @Override // f5.a1
    /* JADX INFO: renamed from: getHeight */
    public final int getF81749c() {
        return this.f62545e.getF81749c();
    }

    @Override // e2.v
    /* JADX INFO: renamed from: getOrientation, reason: from getter */
    public final b2 getF62556p() {
        return this.f62556p;
    }

    @Override // f5.a1
    /* JADX INFO: renamed from: getWidth */
    public final int getF81748b() {
        return this.f62545e.getF81748b();
    }

    @Override // e2.v
    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getF62558r() {
        return this.f62558r;
    }

    @Override // e2.v
    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getF62555o() {
        return this.f62555o;
    }

    public final x j(int i14, boolean z14) {
        y yVar;
        int i15;
        int i16;
        if (this.f62547g) {
            return null;
        }
        List<y> list = this.f62551k;
        if (list.isEmpty() || (yVar = this.f62541a) == null) {
            return null;
        }
        int i17 = yVar.f62577s;
        int i18 = this.f62542b - i14;
        if (i18 < 0 || i18 >= i17) {
            return null;
        }
        y yVar2 = (y) p13.h0.b0(list);
        y yVar3 = (y) p13.h0.m0(list);
        if (yVar2.f62579u || yVar3.f62579u) {
            return null;
        }
        int i19 = yVar2.f62574p;
        int i24 = this.f62553m;
        int i25 = this.f62552l;
        if (i14 < 0) {
            if (Math.min((i19 + yVar2.f62577s) - i25, (yVar3.f62574p + yVar3.f62577s) - i24) <= (-i14)) {
                return null;
            }
        } else if (Math.min(i25 - i19, i24 - yVar3.f62574p) <= i14) {
            return null;
        }
        int size = list.size();
        int i26 = 0;
        while (i26 < size) {
            y yVar4 = list.get(i26);
            boolean z15 = yVar4.f62561c;
            int[] iArr = yVar4.f62583y;
            if (!yVar4.f62579u) {
                yVar4.f62574p += i14;
                int length = iArr.length;
                for (int i27 = 0; i27 < length; i27++) {
                    int i28 = i27 & 1;
                    if ((z15 && i28 != 0) || (!z15 && i28 == 0)) {
                        iArr[i27] = iArr[i27] + i14;
                    }
                }
                if (z14) {
                    int size2 = yVar4.f62560b.size();
                    int i29 = 0;
                    while (i29 < size2) {
                        g2.v vVarA = yVar4.f62572n.a(i29, yVar4.f62570l);
                        if (vVarA != null) {
                            long j8 = vVarA.f75263l;
                            if (z15) {
                                g6.k.a aVar = g6.k.f76003b;
                                i15 = (int) (j8 >> 32);
                                i16 = ((int) (j8 & 4294967295L)) + i14;
                            } else {
                                g6.k.a aVar2 = g6.k.f76003b;
                                i15 = ((int) (j8 >> 32)) + i14;
                                i16 = (int) (j8 & 4294967295L);
                            }
                            vVarA.f75263l = (((long) i16) & 4294967295L) | (((long) i15) << 32);
                        } else {
                            i26 = i26;
                        }
                        i29++;
                        i26 = i26;
                    }
                }
            }
            i26++;
        }
        return new x(this.f62541a, i18, this.f62543c || i14 > 0, i14, this.f62545e, this.f62546f, this.f62547g, this.f62548h, this.f62549i, this.f62550j, this.f62551k, this.f62552l, this.f62553m, this.f62554n, this.f62555o, this.f62556p, this.f62557q, this.f62558r, null);
    }

    @Override // f5.a1
    public final Map<f5.a, Integer> p() {
        return this.f62545e.p();
    }

    @Override // f5.a1
    public final void q() {
        this.f62545e.q();
    }

    @Override // f5.a1
    public final e23.l<e2, Unit> r() {
        return this.f62545e.r();
    }

    public /* synthetic */ x(y yVar, int i14, boolean z14, float f14, a1 a1Var, float f15, boolean z15, o53.b0 b0Var, g6.c cVar, long j8, List list, int i15, int i16, int i17, boolean z16, b2 b2Var, int i18, int i19, p005kotlin.jvm.internal.j jVar) {
        this(yVar, i14, z14, f14, a1Var, f15, z15, b0Var, cVar, j8, list, i15, i16, i17, z16, b2Var, i18, i19);
    }
}
