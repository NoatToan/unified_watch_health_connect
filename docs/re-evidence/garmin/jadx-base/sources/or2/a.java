package or2;

import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import o2.c;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lor2/a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f133422a = new a();

    /* JADX INFO: renamed from: or2.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2536a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133423a;

        static {
            int[] iArr = new int[qs2.a.values().length];
            try {
                iArr[qs2.a.f147378g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qs2.a.f147379h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qs2.a.f147380i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[qs2.a.f147381j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[qs2.a.f147382k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[qs2.a.f147383l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[qs2.a.f147385n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[qs2.a.f147384m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[qs2.a.f147387p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[qs2.a.f147386o.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[qs2.a.f147388q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[qs2.a.f147389r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[qs2.a.f147390t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[qs2.a.f147391v.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[qs2.a.f147392w.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[qs2.a.f147393x.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[qs2.a.f147394y.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f133423a = iArr;
        }
    }

    private a() {
    }

    public static int a(qs2.a aVar) {
        aVar.getClass();
        switch (C2536a.f133423a[aVar.ordinal()]) {
            case 1:
                return 2131233597;
            case 2:
                return 2131232993;
            case 3:
                return 2131231547;
            case 4:
                return 2131232942;
            case 5:
                return 2131233548;
            case 6:
                c.m("Not yet implemented");
                return 0;
            case 7:
            case 8:
            case 9:
                c.m("No resource available for preload cards since they even cannot be added");
                return 0;
            case 10:
                return 2131232604;
            case 11:
                c.m("Beijing TUnion card icon should come from API.");
                return 0;
            case 12:
                c.m("Not yet implemented");
                return 0;
            case 13:
                return R.drawable.amex_card;
            case 14:
                return R.drawable.diners_card;
            case 15:
                return R.drawable.jcb_card;
            case 16:
                return 2131231778;
            case 17:
                c.m("Alipay applet can be added through device request. Add card flow does not support it.");
                return 0;
            default:
                u0.r();
                return 0;
        }
    }

    public static int b(qs2.a aVar) {
        aVar.getClass();
        switch (C2536a.f133423a[aVar.ordinal()]) {
            case 1:
                return 7000;
            case 2:
            case 10:
                return 23000;
            case 3:
                return 68000;
            case 4:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
                return 0;
            case 5:
                return 62000;
            case 6:
                return 4000;
            case 7:
            case 8:
            case 9:
                h.z("Preload cards already reside in device");
                return 0;
            case 12:
                c.m("Not yet implemented");
                return 0;
            case 17:
                return 696;
            default:
                u0.r();
                return 0;
        }
    }
}
