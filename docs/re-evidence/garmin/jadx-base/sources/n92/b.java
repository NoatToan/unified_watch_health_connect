package n92;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import m92.h0;
import m92.i0;
import n63.w;
import o4.e0;
import o4.v0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import s5.q0;
import s5.s0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ln92/b;", "Ln92/n;", "", "", "labels", "Ln92/k;", "timelineEntries", "Ln92/c;", "dotPattern", "", "drawDotForEmptyLabels", "", "interval", "Lkotlin/Function1;", "", "horizontalAdjustment", "Ls5/s0;", "textMeasurer", "Ls5/x0;", TtmlNode.TAG_STYLE, "<init>", "(Ljava/util/List;Ln92/k;Ln92/c;ZILe23/l;Ls5/s0;Ls5/x0;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f125060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f125061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f125062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f125063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f125064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e23.l<Float, Float> f125065h;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125066a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.STANDARD_DOT_PATTERN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.ALL_LARGE_DOT_PATTERN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.LARGE_LIMIT_DOT_PATTERN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.ONE_BIG_THREE_SMALL_DOT_PATTERN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.NON_EMPTY_LABEL_LARGE_DOT_PATTERN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f125066a = iArr;
        }
    }

    public /* synthetic */ b(List list, k kVar, c cVar, boolean z14, int i14, e23.l lVar, s0 s0Var, x0 x0Var, int i15, p005kotlin.jvm.internal.j jVar) {
        this(list, (i15 & 2) != 0 ? new k.a(null, 1, null) : kVar, (i15 & 4) != 0 ? c.LARGE_LIMIT_DOT_PATTERN : cVar, (i15 & 8) != 0 ? true : z14, (i15 & 16) != 0 ? 1 : i14, (i15 & 32) != 0 ? new w(6) : lVar, s0Var, x0Var);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x013a  */
    @Override // n92.n
    public final void a(q4.f fVar, float f14) {
        int i14;
        q0 q0VarA;
        x0 x0Var;
        int i15;
        long j8;
        float fIntBitsToFloat;
        fVar.getClass();
        d92.b.f58623a.getClass();
        j92.b bVar = d92.b.f58625c;
        bVar.getClass();
        j92.e eVar = j92.b.f97899b;
        float f15 = eVar.f97918c;
        bVar.getClass();
        float f16 = eVar.f97917b;
        char c14 = ' ';
        float fFloatValue = this.f125065h.invoke(Float.valueOf(Float.intBitsToFloat((int) (fVar.b() >> 32)))).floatValue();
        List<String> list = this.f125060c;
        Iterator<T> it = list.iterator();
        int i16 = 0;
        int i17 = 0;
        q0 q0Var = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            k kVar = this.f125061d;
            if (!zHasNext) {
                char c15 = c14;
                int i18 = 1;
                int i19 = 2;
                if (kVar.a()) {
                    return;
                }
                if (kVar instanceof k.a) {
                    Map<Integer, v0> map = ((k.a) kVar).f125086a;
                    if (map.isEmpty()) {
                        return;
                    }
                    int i24 = 0;
                    for (Object obj : list) {
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            x.q();
                            throw null;
                        }
                        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (fVar.b() >> c15)) / (list.size() - 1)) * i24;
                        v0 v0Var = map.get(Integer.valueOf(i24));
                        if (v0Var != null) {
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2 - (v0Var.getWidth() / 2.0f))) << c15) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - (q0Var != null ? (int) (q0Var.f157282c & 4294967295L) : 0)) - (v0Var.getHeight() / 2.0f))) & 4294967295L);
                            n4.c.a aVar = n4.c.f123541b;
                            q4.f.w0(fVar, v0Var, jFloatToRawIntBits, null, 60);
                        }
                        i24 = i25;
                    }
                    return;
                }
                if (!(kVar instanceof k.b)) {
                    u0.r();
                    return;
                }
                k.b bVar2 = (k.b) kVar;
                i53.c<h0.e.C2226e> cVar = bVar2.f125087a;
                if (cVar.isEmpty()) {
                    return;
                }
                for (h0.e.C2226e c2226e : cVar) {
                    float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (fVar.b() >> c15)) / (list.size() - i18)) * i0.b(c2226e);
                    float fS0 = fVar.s0(c2226e.f117360e);
                    float fS1 = fVar.s0(bVar2.f125088b);
                    float f17 = i19;
                    float f18 = fS1 / f17;
                    float fIntBitsToFloat4 = ((Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - (q0Var != null ? (int) (q0Var.f157282c & 4294967295L) : 0)) - f18) + f18;
                    int i26 = i19;
                    o92.d.b(fVar, fIntBitsToFloat3, fIntBitsToFloat4, c2226e.f117357b, fS1, fS1);
                    float f19 = fS0 / f17;
                    float f22 = fIntBitsToFloat3 - f19;
                    float f24 = fIntBitsToFloat4 - f19;
                    fVar.getF142543b().f142550a.h(f22, f24);
                    try {
                        t4.d dVar = c2226e.f117358c;
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fS0)) << c15) | (((long) Float.floatToRawIntBits(fS0)) & 4294967295L);
                        n4.g.a aVar2 = n4.g.f123559b;
                        t4.d.m500drawx_KDEd0$default(dVar, fVar, jFloatToRawIntBits2, 0.0f, e0.a.a(e0.f128843b, c2226e.f117359d), 2, null);
                        Unit unit = Unit.INSTANCE;
                        fVar.getF142543b().f142550a.h(-f22, -f24);
                        i19 = i26;
                        i18 = 1;
                    } catch (Throwable th3) {
                        fVar.getF142543b().f142550a.h(-f22, -f24);
                        throw th3;
                    }
                }
                return;
            }
            Object next = it.next();
            int i27 = i16 + 1;
            if (i16 < 0) {
                x.q();
                throw null;
            }
            String str = (String) next;
            if (i16 == 0 || i16 == list.size() - 1 || i16 % this.f125064g == 0) {
                float fIntBitsToFloat5 = (i16 > 0 ? ((Float.intBitsToFloat((int) (fVar.b() >> c14)) - (2 * fFloatValue)) / (list.size() - 1)) * i16 : 0.0f) + fFloatValue;
                boolean zJ = d53.w.J(str);
                x0 x0Var2 = this.f125092b;
                s0 s0Var = this.f125091a;
                if (zJ) {
                    i14 = 1;
                    q0VarA = s0.a(s0Var, StringUtils.SPACE, x0Var2, 0L, 1020);
                    x0Var = x0Var2;
                } else {
                    x0Var = x0Var2;
                    q0 q0VarA2 = s0.a(s0Var, str, x0Var, 0L, 1020);
                    long j14 = q0VarA2.f157282c;
                    if (kVar.a()) {
                        j8 = j14;
                        fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2.0f);
                    } else {
                        fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                        j8 = j14;
                    }
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat5 - (((int) (j8 >> c14)) / 2.0f))) << c14) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                    n4.c.a aVar3 = n4.c.f123541b;
                    i14 = 1;
                    s5.v0.b(fVar, q0VarA2, 0L, jFloatToRawIntBits3, 250);
                    q0VarA = q0VarA2;
                }
                if (str.length() > 0 || this.f125063f) {
                    int i28 = a.f125066a[this.f125062e.ordinal()];
                    if (i28 == i14) {
                        i15 = 0;
                    } else {
                        if (i28 != 2) {
                            if (i28 != 3) {
                                if (i28 != 4) {
                                    if (i28 != 5) {
                                        u0.r();
                                        return;
                                    } else if (str.length() <= 0) {
                                        i15 = 0;
                                    }
                                } else if (i17 % 4 != 0) {
                                    i15 = 0;
                                }
                            } else if (i16 != 0 && i16 != list.size() - i14) {
                                i15 = 0;
                            }
                        }
                        i15 = i14;
                    }
                    long jC = x0Var.c();
                    float f25 = i15 != 0 ? f15 : f16;
                    long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << c14) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - ((int) (q0VarA.f157282c & 4294967295L)))) & 4294967295L);
                    n4.c.a aVar4 = n4.c.f123541b;
                    q4.f.o0(fVar, jC, f25, jFloatToRawIntBits4, null, 0, 120);
                    i17++;
                }
                q0Var = q0VarA;
            } else {
                c14 = c14;
            }
            i16 = i27;
            c14 = c14;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(List<String> list, k kVar, c cVar, boolean z14, int i14, e23.l<? super Float, Float> lVar, s0 s0Var, x0 x0Var) {
        super(s0Var, x0Var);
        list.getClass();
        kVar.getClass();
        cVar.getClass();
        lVar.getClass();
        s0Var.getClass();
        x0Var.getClass();
        this.f125060c = list;
        this.f125061d = kVar;
        this.f125062e = cVar;
        this.f125063f = z14;
        this.f125064g = i14;
        this.f125065h = lVar;
    }
}
