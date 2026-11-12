package yr2;

import hq2.t;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f199139a;

        static {
            int[] iArr = new int[qs2.a.values().length];
            try {
                iArr[qs2.a.f147386o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qs2.a.f147383l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qs2.a.f147384m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[qs2.a.f147385n.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[qs2.a.f147388q.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[qs2.a.f147378g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[qs2.a.f147379h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[qs2.a.f147380i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[qs2.a.f147381j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[qs2.a.f147382k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[qs2.a.f147387p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[qs2.a.f147390t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[qs2.a.f147391v.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[qs2.a.f147392w.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[qs2.a.f147393x.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[qs2.a.f147394y.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[qs2.a.f147389r.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f199139a = iArr;
        }
    }

    public static final as2.a a(qs2.a aVar) {
        aVar.getClass();
        switch (a.f199139a[aVar.ordinal()]) {
            case 1:
                return new tn2.e(null, 1, null);
            case 2:
            case 3:
            case 4:
                return new t();
            case 5:
                return ko2.c.f105778b;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                o2.c.m("Not supported");
                return null;
            case 17:
                o2.c.m("Not yet implemented");
                return null;
            default:
                u0.r();
                return null;
        }
    }

    public static final boolean b(qs2.a aVar, List<ep2.b> list) {
        Object next;
        List<ep2.a> listD;
        aVar.getClass();
        list.getClass();
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(((ep2.b) next).getCardType(), aVar.name()));
        ep2.b bVar = (ep2.b) next;
        return bVar != null && (listD = bVar.d()) != null && listD.size() == 1 && listD.get(0) == ep2.a.ECOM;
    }
}
