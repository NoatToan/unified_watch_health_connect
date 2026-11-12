package l91;

import am.j;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import b63.o;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import d91.h;
import d91.k;
import d91.q;
import d91.r;
import ez0.c;
import fz0.d;
import ht.s;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import lt.e;
import o82.g;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.h0;
import zy0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ll91/b;", "Ll91/a;", "<init>", "()V", "a", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements l91.a {

    /* JADX INFO: renamed from: l91.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C2136b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f111585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f111586c;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.ONE_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.SEVEN_DAYS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r.FOUR_WEEKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[r.FIFTY_TWO_WEEKS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[r.ONE_YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[r.WEEKLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[r.MONTHLY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f111584a = iArr;
            int[] iArr2 = new int[g.values().length];
            try {
                iArr2[g.f130849b.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[g.f130853f.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f111585b = iArr2;
            int[] iArr3 = new int[d91.a.values().length];
            try {
                iArr3[d91.a.INTENSITY_MINUTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[d91.a.STRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[d91.a.BODY_BATTERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[d91.a.HRV_STATUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[d91.a.FLOORS.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[d91.a.HEALTH_STATUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[d91.a.SLEEP_SCORE.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[d91.a.SLEEP_NEED.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[d91.a.ACUTE_LOAD.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[d91.a.LOAD_FOCUS.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[d91.a.TRAINING_STATUS.ordinal()] = 11;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[d91.a.STEPS.ordinal()] = 12;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[d91.a.PUSHES.ordinal()] = 13;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[d91.a.ACTIVITIES.ordinal()] = 14;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[d91.a.WEIGHT_EDIT.ordinal()] = 15;
            } catch (NoSuchFieldError unused25) {
            }
            f111586c = iArr3;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0114  */
    /* JADX WARN: Code duplicated, block: B:63:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x0128  */
    @Override // l91.a
    public final void a(Context context, h hVar) {
        ArrayList arrayList;
        g gVar;
        k kVar;
        int i14;
        int i15;
        k kVar2;
        context.getClass();
        hVar.getClass();
        d91.a aVar = hVar.f58540a;
        Object obj = null;
        String strK = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).k(c.GC_WEB_URL);
        List<k> list = hVar.f58543d;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((k) obj2).f58550a == q.INTERVAL) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        r rVar = (arrayList == null || (kVar2 = (k) h0.e0(0, arrayList)) == null) ? null : kVar2.f58551b;
        switch (rVar == null ? -1 : C2136b.f111584a[rVar.ordinal()]) {
            case 1:
                gVar = g.f130849b;
                break;
            case 2:
                gVar = g.f130850c;
                break;
            case 3:
                gVar = g.f130851d;
                break;
            case 4:
                gVar = g.f130853f;
                break;
            case 5:
            case 6:
                gVar = g.f130856i;
                break;
            default:
                gVar = g.f130849b;
                break;
        }
        String string = d.a(g22.l.d(o.INSTANCE)).toString();
        int i16 = rVar == null ? -1 : C2136b.f111584a[rVar.ordinal()];
        String str = "0";
        if (i16 != 2) {
            if (i16 == 3) {
                str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            } else if (i16 == 4) {
                str = "2";
            } else if (i16 == 5) {
                str = "3";
            }
        }
        String strO = j.o("/", str, e5.l(strK, "/app/", aVar.a(), "/", string));
        s sVar = s.f85508a;
        e.j jVar = new e.j(e.a.Tapped, null, aVar.name(), gVar.name());
        sVar.getClass();
        s.a(jVar);
        switch (C2136b.f111586c[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strO)));
                break;
            case 8:
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strO));
                intent.putExtra("GCM_extra_sleep_page_scroll_target", "SLEEP_PAGE_SLEEP_NEED_SCROLL_TARGET");
                context.startActivity(intent);
                break;
            case 9:
            case 10:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strK + "/app/" + aVar.a())));
                break;
            case 11:
                int i17 = C2136b.f111585b[gVar.ordinal()];
                String str2 = "current";
                if (i17 != 1 && i17 == 2) {
                    str2 = "last_four_weeks";
                }
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strK + "/app/" + aVar.a() + "/" + str2)));
                break;
            case 12:
            case 13:
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(strO));
                if (list != null) {
                    for (Object obj3 : list) {
                        if (((k) obj3).f58550a == q.TYPE) {
                            obj = obj3;
                            kVar = (k) obj;
                            if (kVar != null) {
                                r rVar2 = kVar.f58551b;
                                i14 = rVar2 != null ? C2136b.f111584a[rVar2.ordinal()] : -1;
                                if (i14 == 7 && i14 == 8) {
                                    i15 = 1;
                                } else {
                                    i15 = 0;
                                }
                                intent2.putExtra("initialTab", i15);
                            }
                        }
                    }
                    kVar = (k) obj;
                    if (kVar != null) {
                        r rVar3 = kVar.f58551b;
                        if (rVar3 != null) {
                        }
                        if (i14 == 7) {
                            i15 = 0;
                        } else {
                            i15 = 0;
                        }
                        intent2.putExtra("initialTab", i15);
                    }
                }
                context.startActivity(intent2);
                break;
            case 14:
                break;
            case 15:
                Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse(strO));
                intent3.putExtra("EXTRA_SHOW_EDIT_WEIGHT_GOAL", true);
                context.startActivity(intent3);
                break;
            default:
                u0.r();
                break;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll91/b$a;", "", "<init>", "()V", "", "INITIAL_TAB_KEY", "Ljava/lang/String;", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
