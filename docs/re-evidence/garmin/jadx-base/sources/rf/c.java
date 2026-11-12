package rf;

import dg.l;
import dg.t;
import hf.j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wf.m;
import wf.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lrf/c;", "", "Lhf/j;", "imageLoader", "Lwf/o;", "requestService", "Ldg/l;", "logger", "<init>", "(Lhf/j;Lwf/o;Ldg/l;)V", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f152369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f152370b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f152371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f152372b;

        static {
            int[] iArr = new int[xf.f.values().length];
            try {
                iArr[xf.f.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xf.f.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f152371a = iArr;
            int[] iArr2 = new int[xf.c.values().length];
            try {
                iArr2[xf.c.EXACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[xf.c.INEXACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f152372b = iArr2;
        }
    }

    static {
        new a(null);
    }

    public c(j jVar, o oVar, l lVar) {
        this.f152369a = jVar;
        this.f152370b = oVar;
    }

    public final rf.b.c a(wf.f fVar, rf.b.C2864b c2864b, xf.g gVar, xf.f fVar2) {
        int iAbs;
        wf.c cVar = fVar.f184915n;
        xf.c cVar2 = fVar.f184924w;
        if (cVar.f184897a) {
            rf.b bVarD = this.f152369a.d();
            rf.b.c cVarA = bVarD != null ? bVarD.a(c2864b) : null;
            if (cVarA != null && this.f152370b.b(fVar, cVarA)) {
                String str = c2864b.f152366b.get("coil#size");
                if (str == null) {
                    Object obj = cVarA.f152368b.get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    hf.h hVar = cVarA.f152367a;
                    if (zBooleanValue || (!s.g(gVar, xf.g.f190618c) && cVar2 != xf.c.INEXACT)) {
                        int f196858c = hVar.getF196858c();
                        int f196859d = hVar.getF196859d();
                        xf.g gVar2 = hVar instanceof hf.a ? (xf.g) hf.g.a(fVar, wf.g.f184982b) : xf.g.f190618c;
                        xf.a aVar = gVar.f190619a;
                        int i14 = aVar instanceof xf.a.C3547a ? ((xf.a.C3547a) aVar).f190607a : Integer.MAX_VALUE;
                        xf.a aVar2 = gVar2.f190619a;
                        int iMin = Math.min(i14, aVar2 instanceof xf.a.C3547a ? ((xf.a.C3547a) aVar2).f190607a : Integer.MAX_VALUE);
                        xf.a aVar3 = gVar.f190620b;
                        int i15 = aVar3 instanceof xf.a.C3547a ? ((xf.a.C3547a) aVar3).f190607a : Integer.MAX_VALUE;
                        xf.a aVar4 = gVar2.f190620b;
                        int iMin2 = Math.min(i15, aVar4 instanceof xf.a.C3547a ? ((xf.a.C3547a) aVar4).f190607a : Integer.MAX_VALUE);
                        double d14 = ((double) iMin) / ((double) f196858c);
                        double d15 = ((double) iMin2) / ((double) f196859d);
                        int i16 = b.f152371a[((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? xf.f.FIT : fVar2).ordinal()];
                        if (i16 != 1) {
                            if (i16 != 2) {
                                u0.r();
                                return null;
                            }
                            if (d14 < d15) {
                                iAbs = Math.abs(iMin - f196858c);
                            } else {
                                iAbs = Math.abs(iMin2 - f196859d);
                                d14 = d15;
                            }
                        } else if (d14 > d15) {
                            iAbs = Math.abs(iMin - f196858c);
                        } else {
                            iAbs = Math.abs(iMin2 - f196859d);
                            d14 = d15;
                        }
                        if (iAbs > 1) {
                            int i17 = b.f152372b[cVar2.ordinal()];
                            if (i17 != 1) {
                                if (i17 != 2) {
                                    u0.r();
                                    return null;
                                }
                                if (d14 <= 1.0d) {
                                }
                            } else if (d14 == 1.0d) {
                            }
                        }
                    }
                    return cVarA;
                }
                if (str.equals(gVar.toString())) {
                    return cVarA;
                }
            }
        }
        return null;
    }

    public final rf.b.C2864b b(wf.f fVar, Object obj, m mVar, hf.e eVar) {
        String strA;
        wf.c cVar = fVar.f184915n;
        Map<String, String> map = fVar.f184907f;
        if (cVar != wf.c.DISABLED) {
            String str = fVar.f184906e;
            if (str != null) {
                return new rf.b.C2864b(str, map);
            }
            hf.c f83581d = this.f152369a.getF83581d();
            t.a aVar = t.f59501a;
            List<p<pf.c<? extends Object>, k23.d<? extends Object>>> list = f83581d.f83543c;
            int size = list.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    strA = null;
                    break;
                }
                p<pf.c<? extends Object>, k23.d<? extends Object>> pVar = list.get(i14);
                pf.c<? extends Object> cVar2 = pVar.f128594a;
                if (pVar.f128595b.q(obj)) {
                    cVar2.getClass();
                    strA = cVar2.a(obj, mVar);
                    if (strA != null) {
                        break;
                    }
                }
                i14++;
            }
            if (strA != null) {
                if (((List) hf.g.a(fVar, wf.g.f184981a)).isEmpty()) {
                    return new rf.b.C2864b(strA, map);
                }
                LinkedHashMap linkedHashMapN = p13.u0.n(map);
                linkedHashMapN.put("coil#size", mVar.f184997b.toString());
                return new rf.b.C2864b(strA, linkedHashMapN);
            }
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lrf/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_SIZE", "EXTRA_IS_SAMPLED", "EXTRA_DISK_CACHE_KEY", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
