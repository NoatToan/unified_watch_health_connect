package gy;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import gs1.j;
import gs1.t;
import gs1.v;
import gs1.x;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.w;
import qz.c;
import xz.f;
import xz.g;
import xz.h;
import yz.k;
import zx0.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lgy/b;", "Lqz/c;", "Lgs1/t;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lyz/k;", "timeInMinutesFormatter", "Lbf0/a;", "heartRateDataConfig", "", "enableMovementLegend", "<init>", "(Landroid/content/Context;Lyz/k;Lbf0/a;Z)V", "a", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements c<t, ILineDataSet> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final LocalDateTime f80082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LocalDateTime f80083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final LocalDateTime f80084j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f80085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f80086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bf0.a f80087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f80088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f80089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ay.c f80090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f80091g;

    static {
        new a(null);
        f80082h = LocalDateTime.now().withTime(0, 0, 0, 0);
        f80083i = LocalDateTime.now().withTime(12, 0, 0, 0);
        f80084j = LocalDateTime.now().withTime(23, 0, 0, 0);
    }

    public b(Context context, k kVar, bf0.a aVar, boolean z14) {
        context.getClass();
        kVar.getClass();
        aVar.getClass();
        this.f80085a = context;
        this.f80086b = kVar;
        this.f80087c = aVar;
        this.f80088d = z14;
        l22.a aVar2 = new l22.a(context);
        this.f80090f = new ay.c(context);
        this.f80091g = new f(aVar2.getString(R.string.lbl_movement), null, Integer.valueOf(context.getColor(R.color.palette_delta_7)), null, g.a.f192745a, null, null, 106, null);
    }

    @Override // qz.c
    public final List<ILineDataSet> a(t tVar) throws ParseException {
        t tVar2 = tVar;
        List<ILineDataSet> listA = (this.f80089e == gy.a.MOVEMENT || !(tVar2 == null || tVar2.y())) ? this.f80090f.a(tVar2 != null ? tVar2.getDailyMovementDTO() : null) : j0.f134944a;
        List<ILineDataSet> listA2 = this.f80087c.a(tVar2);
        if (!((ArrayList) listA2).isEmpty()) {
            for (ILineDataSet iLineDataSet : listA) {
                LineDataSet lineDataSet = iLineDataSet instanceof LineDataSet ? (LineDataSet) iLineDataSet : null;
                if (lineDataSet != null) {
                    lineDataSet.setFillColor(this.f80085a.getColor(R.color.palette_blue_23));
                    lineDataSet.setFillAlpha(127);
                }
            }
        }
        return h0.C0(listA, listA2);
    }

    @Override // qz.c
    public final Shader b(float f14, float f15, Object obj) {
        return this.f80087c.b((t) obj, f14, f15);
    }

    @Override // qz.c
    public final Integer c(t tVar) {
        t tVar2 = tVar;
        return Integer.valueOf(Math.abs(MathKt.c(q(tVar2) - e(tVar2))));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(t tVar) {
        return false;
    }

    @Override // qz.c
    public final List f(t tVar) {
        return this.f80087c.f(tVar);
    }

    @Override // qz.c
    public final List g(t tVar) {
        t tVar2 = tVar;
        List<v> listE = m.e(tVar2 != null ? fs1.b.c(tVar2) : null);
        v.a.c cVar = new v.a.c(null);
        LocalDateTime localDateTime = f80082h;
        v vVarB = x.b(localDateTime, localDateTime, cVar, null);
        if (vVarB == null) {
            return j0.f134944a;
        }
        int i14 = vVarB.f78884b;
        k kVar = this.f80086b;
        h hVar = new h(i14, null, kVar.a(i14));
        v.a.c cVar2 = new v.a.c(null);
        LocalDateTime localDateTime2 = f80083i;
        v vVarB2 = x.b(localDateTime2, localDateTime2, cVar2, null);
        if (vVarB2 == null) {
            return j0.f134944a;
        }
        int i15 = vVarB2.f78884b;
        h hVar2 = new h(i15, null, kVar.a(i15));
        v.a.c cVar3 = new v.a.c(null);
        LocalDateTime localDateTime3 = f80084j;
        v vVarB3 = x.b(localDateTime3, localDateTime3, cVar3, null);
        if (vVarB3 == null) {
            return j0.f134944a;
        }
        int i16 = vVarB3.f78884b;
        h hVar3 = new h(i16, null, kVar.a(i16));
        ArrayList arrayListM = p13.x.m(hVar, hVar2, hVar3);
        int iE = (int) e(tVar2);
        int iQ = (int) q(tVar2);
        for (v vVar : listE) {
            v.a aVar = vVar.f78883a;
            int i17 = vVar.f78884b;
            boolean zG = s.g(aVar, v.a.e.C1590a.f78888b);
            Context context = this.f80085a;
            int i18 = hVar2.f192754a;
            if (zG) {
                if (hVar.f192754a != iE) {
                    arrayListM.remove(hVar);
                }
                arrayListM.add(new h(i17, m.c(context, aVar), kVar.a(i17)));
                if (Math.abs(i17 - i18) < 120) {
                    arrayListM.remove(hVar2);
                }
            } else if (s.g(aVar, v.a.e.c.f78890b)) {
                if (iQ >= i17 && Math.abs(i17 - hVar3.f192754a) < 120) {
                    arrayListM.remove(hVar3);
                }
                arrayListM.add(new h(i17, m.c(context, aVar), kVar.a(i17)));
                if (Math.abs(i17 - i18) < 120) {
                    arrayListM.remove(hVar2);
                }
            } else {
                int iH = m.h(vVar);
                if (iE <= iH && iH <= iQ) {
                    arrayListM.add(new h(iH, m.c(context, aVar), null, 4, null));
                }
            }
        }
        return arrayListM;
    }

    @Override // qz.c
    public final float i(t tVar) {
        return this.f80087c.i(tVar);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(t tVar) {
        return null;
    }

    @Override // qz.c
    public final float m(t tVar) {
        this.f80090f.getClass();
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(t tVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(t tVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(t tVar) {
        return null;
    }

    @Override // qz.c
    public final void s(Object obj) {
        this.f80089e = obj;
    }

    @Override // qz.c
    public final float t(t tVar) {
        return this.f80087c.t(tVar);
    }

    @Override // qz.c
    public final List u(t tVar) {
        List listC;
        j.c payload;
        t tVar2 = tVar;
        List<j.b> listD = null;
        if (tVar2 == null) {
            return null;
        }
        List<f> listU = this.f80087c.u(tVar2);
        if (!this.f80088d || (this.f80089e != gy.a.MOVEMENT && tVar2.y())) {
            listC = j0.f134944a;
        } else if (tVar2.y()) {
            listC = w.c(this.f80091g);
        } else {
            j dailyMovementDTO = tVar2.getDailyMovementDTO();
            ay.c cVar = this.f80090f;
            cVar.getClass();
            if (dailyMovementDTO != null && (payload = dailyMovementDTO.getPayload()) != null) {
                listD = payload.d();
            }
            listC = (listD == null || listD.isEmpty()) ? j0.f134944a : w.c(cVar.f13651b);
        }
        if (listU == null || listU.isEmpty()) {
            return listC;
        }
        if (listC == null || listC.isEmpty()) {
            return listU;
        }
        ArrayList arrayList = new ArrayList(listU);
        arrayList.add(1, h0.b0(listC));
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(t tVar) {
        return null;
    }

    @Override // qz.c
    public final float w(t tVar) {
        this.f80090f.getClass();
        return 10.0f;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    @Override // qz.c
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final float q(t tVar) {
        float f14;
        Float fValueOf;
        Object next;
        v vVar = null;
        Object obj = null;
        if (tVar != null) {
            Iterator it = fs1.b.c(tVar).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.g(((v) next).f78883a, v.a.e.C1590a.f78888b));
            v vVar2 = (v) next;
            if (vVar2 != null) {
                f14 = vVar2.f78884b;
            } else {
                f14 = 0.0f;
            }
        } else {
            f14 = 0.0f;
        }
        if (tVar != null) {
            ArrayList arrayListC = fs1.b.c(tVar);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : arrayListC) {
                if (((v) obj2).f78883a instanceof v.a.d) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Integer num = ((v) it3.next()).f78885c;
                if (num != null) {
                    arrayList2.add(num);
                }
            }
            Integer num2 = (Integer) h0.o0(arrayList2);
            if (num2 != null) {
                fValueOf = Float.valueOf(num2.intValue());
            } else {
                fValueOf = null;
            }
        } else {
            fValueOf = null;
        }
        if (tVar != null) {
            for (Object obj3 : fs1.b.c(tVar)) {
                if (s.g(((v) obj3).f78883a, v.a.e.c.f78890b)) {
                    obj = obj3;
                    break;
                }
            }
            vVar = (v) obj;
        }
        float fMax = Math.max(vVar != null ? vVar.f78884b : 1440.0f, fValueOf != null ? fValueOf.floatValue() : 0.0f);
        if (fMax <= f14 || fMax > 1440.0f) {
            return 1440.0f;
        }
        return fMax;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    @Override // qz.c
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final float e(t tVar) {
        float f14;
        Float fValueOf;
        Integer numValueOf;
        Object next;
        v vVar = null;
        Object obj = null;
        if (tVar != null) {
            Iterator it = fs1.b.c(tVar).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.g(((v) next).f78883a, v.a.e.C1590a.f78888b));
            v vVar2 = (v) next;
            if (vVar2 != null) {
                f14 = vVar2.f78884b;
            } else {
                f14 = 0.0f;
            }
        } else {
            f14 = 0.0f;
        }
        if (tVar != null) {
            ArrayList arrayListC = fs1.b.c(tVar);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : arrayListC) {
                if (((v) obj2).f78883a instanceof v.a.d) {
                    arrayList.add(obj2);
                }
            }
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                numValueOf = Integer.valueOf(((v) it3.next()).f78884b);
                while (it3.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(((v) it3.next()).f78884b);
                    if (numValueOf.compareTo(numValueOf2) > 0) {
                        numValueOf = numValueOf2;
                    }
                }
            } else {
                numValueOf = null;
            }
            if (numValueOf != null) {
                fValueOf = Float.valueOf(numValueOf.intValue());
            } else {
                fValueOf = null;
            }
        } else {
            fValueOf = null;
        }
        if (tVar != null) {
            for (Object obj3 : fs1.b.c(tVar)) {
                if (s.g(((v) obj3).f78883a, v.a.e.c.f78890b)) {
                    obj = obj3;
                    break;
                }
            }
            vVar = (v) obj;
        }
        float f15 = vVar != null ? vVar.f78884b : 1440.0f;
        float fMin = Math.min(f14, fValueOf != null ? fValueOf.floatValue() : 1440.0f);
        if (fMin < 0.0f || fMin >= f15) {
            return 0.0f;
        }
        return fMin;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001c\u0010\f\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lgy/b$a;", "", "<init>", "()V", "", "MINUTES_IN_AN_HOUR", "I", "Lorg/joda/time/LocalDateTime;", "kotlin.jvm.PlatformType", "START_DAY_TIMELINE_ENTRY_DATE", "Lorg/joda/time/LocalDateTime;", "MID_DAY_TIMELINE_ENTRY_DATE", "END_DAY_TIMELINE_ENTRY_DATE", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
