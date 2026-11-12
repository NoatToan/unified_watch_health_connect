package w02;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.k1;
import f5.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import l72.i3;
import lc.m0;
import lc.u0;
import o4.t0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p008y1.b2;
import p13.h0;
import p3.i0;
import p3.p1;
import p3.x3;
import w5.j0;
import w5.l0;
import w5.n0;
import w5.r0;
import w5.v0;
import w5.w0;
import w52.f1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f181059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f181060c;

    public /* synthetic */ b(int i14, Object obj, Object obj2) {
        this.f181058a = i14;
        this.f181059b = obj;
        this.f181060c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:130:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:132:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:155:0x044c  */
    /* JADX WARN: Code duplicated, block: B:158:0x045e  */
    /* JADX WARN: Code duplicated, block: B:160:0x046f  */
    /* JADX WARN: Code duplicated, block: B:183:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:186:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:188:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:192:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:194:0x0505  */
    /* JADX WARN: Code duplicated, block: B:196:0x0511  */
    /* JADX WARN: Code duplicated, block: B:199:0x051e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0528  */
    /* JADX WARN: Code duplicated, block: B:205:0x0532  */
    /* JADX WARN: Code duplicated, block: B:206:0x0534  */
    /* JADX WARN: Code duplicated, block: B:208:0x053a  */
    /* JADX WARN: Code duplicated, block: B:211:0x0544  */
    /* JADX WARN: Code duplicated, block: B:216:0x054f  */
    /* JADX WARN: Code duplicated, block: B:219:0x0561  */
    /* JADX WARN: Code duplicated, block: B:221:0x0572  */
    /* JADX WARN: Code duplicated, block: B:321:0x0720  */
    /* JADX WARN: Code duplicated, block: B:322:0x0722  */
    /* JADX WARN: Code duplicated, block: B:407:0x03fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x0472 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x04eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x054a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x0545 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x0575 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        ComposeView composeView;
        o13.p pVar;
        Object aVar;
        Object objInvoke;
        w5.j.a aVarD;
        Object bVar;
        ArrayList arrayList;
        int size;
        int i14;
        w5.f0 f0Var;
        int size2;
        int i15;
        w5.f0 f0Var2;
        w5.f0 f0Var3;
        int size3;
        int i16;
        w5.p pVar2;
        w5.f0 f182145b;
        int i17;
        int i18;
        w5.p pVar3;
        int size4;
        int i19;
        w5.p pVar4;
        int size5;
        int i24;
        w5.p pVar5;
        p005kotlin.jvm.internal.j jVar;
        Typeface typefaceA;
        w0.b bVar2;
        T t7;
        boolean z14 = false;
        switch (this.f181058a) {
            case 0:
                r rVar = (r) this.f181059b;
                p1 p1Var = (p1) this.f181060c;
                ((i0) obj).getClass();
                return new f(rVar, p1Var);
            case 1:
                b2 b2Var = (b2) this.f181059b;
                r rVar2 = ((h) this.f181060c).f181108b;
                t0 t0Var = (t0) obj;
                t0Var.getClass();
                int i25 = h.a.f181106a[b2Var.ordinal()];
                if (i25 == 1) {
                    t0Var.q(rVar2.e());
                } else {
                    if (i25 != 2) {
                        u0.r();
                        return null;
                    }
                    t0Var.x(rVar2.e());
                }
                return Unit.INSTANCE;
            case 2:
                r rVar3 = (r) this.f181059b;
                x3 x3Var = (x3) this.f181060c;
                t0 t0Var2 = (t0) obj;
                t0Var2.getClass();
                int i26 = m.a.f181116a[((b2) x3Var.getF182175a()).ordinal()];
                if (i26 == 1) {
                    t0Var2.q(rVar3.e());
                } else {
                    if (i26 != 2) {
                        u0.r();
                        return null;
                    }
                    t0Var2.x(rVar3.e());
                }
                return Unit.INSTANCE;
            case 3:
                w10.e eVar = (w10.e) this.f181059b;
                w10.c cVar = (w10.c) this.f181060c;
                ud.a aVar2 = (ud.a) obj;
                w10.e.b bVar3 = w10.e.f181186d;
                aVar2.getClass();
                eVar.f181188b.d(aVar2, cVar);
                return Unit.INSTANCE;
            case 4:
                ArrayList arrayList2 = (ArrayList) this.f181059b;
                ArrayList arrayList3 = (ArrayList) this.f181060c;
                v1.a aVar3 = (v1.a) obj;
                aVar3.getClass();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    v1.a.B(aVar3, (v1) it.next(), 0, 0);
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    v1.a.B(aVar3, (v1) it3.next(), 0, 0);
                }
                return Unit.INSTANCE;
            case 5:
                j1.d dVar = (j1.d) this.f181059b;
                ExecutorService executorService = (ExecutorService) this.f181060c;
                ((j1.k) obj).getClass();
                j0.u.a();
                dVar.G = null;
                dVar.f96214m = null;
                j1.n nVar = dVar.f96215n;
                if (nVar != null) {
                    nVar.c();
                }
                executorService.shutdown();
                return Unit.INSTANCE;
            case 6:
                s1.b bVar4 = (s1.b) this.f181059b;
                s1.b bVar5 = (s1.b) this.f181060c;
                t0 t0Var3 = (t0) obj;
                t0Var3.getClass();
                t0Var3.v(((Number) bVar4.e()).floatValue());
                t0Var3.w(((Number) bVar4.e()).floatValue());
                t0Var3.c(((Number) bVar5.e()).floatValue());
                t0Var3.g(false);
                return Unit.INSTANCE;
            case 7:
                Context context = (Context) this.f181059b;
                m0 m0Var = (m0) this.f181060c;
                List list = (List) obj;
                bv.b.f21239a.getClass();
                bv.b.a();
                boolean zE = k1.f37122a.E();
                if (list == null || list.isEmpty() || !zE) {
                    context.getClass();
                    ((u32.a) KoinJavaComponent.get$default(u32.a.class, null, null, 6, null)).c(context);
                } else {
                    m0Var.getClass();
                    lc.y.l(m0Var, new w32.c((ro0.i) null, new c42.b(list), 1, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0)));
                }
                return Unit.INSTANCE;
            case 8:
                View view2 = (View) this.f181059b;
                w40.e eVar2 = (w40.e) this.f181060c;
                g3 g3Var = (g3) obj;
                w40.e.a aVar4 = w40.e.f181932h;
                if (g3Var != null && (composeView = (ComposeView) view2.findViewById(R.id.course_demands_container)) != null) {
                    composeView.setContent(new z3.e(-158667356, true, new vq0.a(20, g3Var, eVar2)));
                }
                return Unit.INSTANCE;
            case 9:
                w5.s sVar = (w5.s) this.f181059b;
                w5.u0 u0Var = (w5.u0) this.f181060c;
                e23.l lVar = (e23.l) obj;
                w5.x xVar = sVar.f182158d;
                l0 l0Var = sVar.f182155a;
                vu1.b bVar6 = sVar.f182160f;
                xVar.getClass();
                w5.q qVar = u0Var.f182166a;
                if (qVar instanceof w5.w) {
                    w5.a0 a0Var = w5.x.f182177c;
                    List<w5.p> list2 = ((w5.w) qVar).f182173g;
                    w5.f0 f0Var4 = u0Var.f182167b;
                    int i27 = u0Var.f182168c;
                    a0Var.getClass();
                    ArrayList arrayList4 = new ArrayList(list2.size());
                    int size6 = list2.size();
                    int i28 = 0;
                    while (i28 < size6) {
                        boolean z15 = z14;
                        w5.p pVar6 = list2.get(i28);
                        w5.p pVar7 = pVar6;
                        if (p005kotlin.jvm.internal.s.g(pVar7.getF182145b(), f0Var4)) {
                            int f182146c = pVar7.getF182146c();
                            w5.b0.a aVar5 = w5.b0.f182070b;
                            if (f182146c == i27) {
                                arrayList4.add(pVar6);
                            }
                        }
                        i28++;
                        z14 = z15;
                    }
                    boolean z16 = z14;
                    if (arrayList4.isEmpty()) {
                        ArrayList arrayList5 = new ArrayList(list2.size());
                        int size7 = list2.size();
                        for (int i29 = z16 ? 1 : 0; i29 < size7; i29++) {
                            w5.p pVar8 = list2.get(i29);
                            int f182146c2 = pVar8.getF182146c();
                            w5.b0.a aVar6 = w5.b0.f182070b;
                            if (f182146c2 == i27) {
                                arrayList5.add(pVar8);
                            }
                        }
                        if (!arrayList5.isEmpty()) {
                            list2 = arrayList5;
                        }
                        w5.f0.f182097b.getClass();
                        int iCompareTo = f0Var4.compareTo(w5.f0.f182098c);
                        int i30 = f0Var4.f182107a;
                        if (iCompareTo < 0) {
                            int size8 = list2.size();
                            w5.f0 f0Var5 = null;
                            w5.f0 f0Var6 = null;
                            for (int i34 = z16 ? 1 : 0; i34 < size8; i34++) {
                                w5.f0 f182145b2 = list2.get(i34).getF182145b();
                                int i35 = f182145b2.f182107a;
                                if (p005kotlin.jvm.internal.s.h(i35, i30) < 0) {
                                    if (f0Var5 == null || p005kotlin.jvm.internal.s.h(i35, f0Var5.f182107a) > 0) {
                                        f0Var5 = f182145b2;
                                    }
                                } else if (p005kotlin.jvm.internal.s.h(i35, i30) <= 0) {
                                    f0Var5 = f182145b2;
                                    f0Var6 = f0Var5;
                                    if (f0Var5 == null) {
                                        f0Var5 = f0Var6;
                                    }
                                    arrayList = new ArrayList(list2.size());
                                    size5 = list2.size();
                                    for (i24 = z16 ? 1 : 0; i24 < size5; i24++) {
                                        pVar5 = list2.get(i24);
                                        if (p005kotlin.jvm.internal.s.g(pVar5.getF182145b(), f0Var5)) {
                                            arrayList.add(pVar5);
                                        }
                                    }
                                } else if (f0Var6 == null || p005kotlin.jvm.internal.s.h(i35, f0Var6.f182107a) < 0) {
                                    f0Var6 = f182145b2;
                                }
                            }
                            if (f0Var5 == null) {
                                f0Var5 = f0Var6;
                            }
                            arrayList = new ArrayList(list2.size());
                            size5 = list2.size();
                            while (i24 < size5) {
                                pVar5 = list2.get(i24);
                                if (p005kotlin.jvm.internal.s.g(pVar5.getF182145b(), f0Var5)) {
                                    arrayList.add(pVar5);
                                }
                            }
                        } else {
                            w5.f0 f0Var7 = w5.f0.f182099d;
                            if (f0Var4.compareTo(f0Var7) > 0) {
                                int size9 = list2.size();
                                w5.f0 f0Var8 = null;
                                w5.f0 f0Var9 = null;
                                for (int i36 = z16 ? 1 : 0; i36 < size9; i36++) {
                                    w5.f0 f182145b3 = list2.get(i36).getF182145b();
                                    int i37 = f182145b3.f182107a;
                                    if (p005kotlin.jvm.internal.s.h(i37, i30) < 0) {
                                        if (f0Var8 == null || p005kotlin.jvm.internal.s.h(i37, f0Var8.f182107a) > 0) {
                                            f0Var8 = f182145b3;
                                        }
                                    } else if (p005kotlin.jvm.internal.s.h(i37, i30) <= 0) {
                                        f0Var8 = f182145b3;
                                        f0Var9 = f0Var8;
                                        if (f0Var9 != null) {
                                            f0Var8 = f0Var9;
                                        }
                                        arrayList4 = new ArrayList(list2.size());
                                        size4 = list2.size();
                                        for (i19 = z16 ? 1 : 0; i19 < size4; i19++) {
                                            pVar4 = list2.get(i19);
                                            if (p005kotlin.jvm.internal.s.g(pVar4.getF182145b(), f0Var8)) {
                                                arrayList4.add(pVar4);
                                            }
                                        }
                                    } else if (f0Var9 == null || p005kotlin.jvm.internal.s.h(i37, f0Var9.f182107a) < 0) {
                                        f0Var9 = f182145b3;
                                    }
                                }
                                if (f0Var9 != null) {
                                    f0Var8 = f0Var9;
                                }
                                arrayList4 = new ArrayList(list2.size());
                                size4 = list2.size();
                                while (i19 < size4) {
                                    pVar4 = list2.get(i19);
                                    if (p005kotlin.jvm.internal.s.g(pVar4.getF182145b(), f0Var8)) {
                                        arrayList4.add(pVar4);
                                    }
                                }
                            } else {
                                int size10 = list2.size();
                                int i38 = z16 ? 1 : 0;
                                w5.f0 f0Var10 = null;
                                w5.f0 f0Var11 = null;
                                while (i38 < size10) {
                                    w5.f0 f182145b4 = list2.get(i38).getF182145b();
                                    int i39 = size10;
                                    if (p005kotlin.jvm.internal.s.h(f182145b4.f182107a, f0Var7.f182107a) <= 0) {
                                        int i44 = f182145b4.f182107a;
                                        if (p005kotlin.jvm.internal.s.h(i44, i30) < 0) {
                                            if (f0Var10 == null || p005kotlin.jvm.internal.s.h(i44, f0Var10.f182107a) > 0) {
                                                f0Var10 = f182145b4;
                                            }
                                        } else if (p005kotlin.jvm.internal.s.h(i44, i30) <= 0) {
                                            f0Var10 = f182145b4;
                                            f0Var11 = f0Var10;
                                            if (f0Var11 != null) {
                                                f0Var10 = f0Var11;
                                            }
                                            arrayList = new ArrayList(list2.size());
                                            size = list2.size();
                                            for (i14 = z16 ? 1 : 0; i14 < size; i14++) {
                                                pVar3 = list2.get(i14);
                                                if (p005kotlin.jvm.internal.s.g(pVar3.getF182145b(), f0Var10)) {
                                                    arrayList.add(pVar3);
                                                }
                                            }
                                            if (arrayList.isEmpty()) {
                                                w5.f0.f182097b.getClass();
                                                f0Var = w5.f0.f182099d;
                                                size2 = list2.size();
                                                i15 = z16 ? 1 : 0;
                                                f0Var2 = null;
                                                f0Var3 = null;
                                                while (i15 < size2) {
                                                    f182145b = list2.get(i15).getF182145b();
                                                    if (f0Var != null) {
                                                        i17 = size2;
                                                        if (p005kotlin.jvm.internal.s.h(f182145b.f182107a, f0Var.f182107a) < 0) {
                                                            continue;
                                                        }
                                                        i15++;
                                                        size2 = i17;
                                                    } else {
                                                        i17 = size2;
                                                    }
                                                    i18 = f182145b.f182107a;
                                                    if (p005kotlin.jvm.internal.s.h(i18, i30) < 0) {
                                                        if (f0Var2 != null || p005kotlin.jvm.internal.s.h(i18, f0Var2.f182107a) > 0) {
                                                            f0Var2 = f182145b;
                                                        }
                                                    } else if (p005kotlin.jvm.internal.s.h(i18, i30) > 0) {
                                                        f0Var2 = f182145b;
                                                        f0Var3 = f0Var2;
                                                        if (f0Var3 != null) {
                                                            f0Var2 = f0Var3;
                                                        }
                                                        arrayList = new ArrayList(list2.size());
                                                        size3 = list2.size();
                                                        for (i16 = z16 ? 1 : 0; i16 < size3; i16++) {
                                                            pVar2 = list2.get(i16);
                                                            if (p005kotlin.jvm.internal.s.g(pVar2.getF182145b(), f0Var2)) {
                                                                arrayList.add(pVar2);
                                                            }
                                                        }
                                                    } else if (f0Var3 != null || p005kotlin.jvm.internal.s.h(i18, f0Var3.f182107a) < 0) {
                                                        f0Var3 = f182145b;
                                                    }
                                                    i15++;
                                                    size2 = i17;
                                                }
                                                if (f0Var3 != null) {
                                                    f0Var2 = f0Var3;
                                                }
                                                arrayList = new ArrayList(list2.size());
                                                size3 = list2.size();
                                                while (i16 < size3) {
                                                    pVar2 = list2.get(i16);
                                                    if (p005kotlin.jvm.internal.s.g(pVar2.getF182145b(), f0Var2)) {
                                                        arrayList.add(pVar2);
                                                    }
                                                }
                                            }
                                        } else if (f0Var11 == null || p005kotlin.jvm.internal.s.h(i44, f0Var11.f182107a) < 0) {
                                            f0Var11 = f182145b4;
                                        }
                                    }
                                    i38++;
                                    size10 = i39;
                                }
                                if (f0Var11 != null) {
                                    f0Var10 = f0Var11;
                                }
                                arrayList = new ArrayList(list2.size());
                                size = list2.size();
                                while (i14 < size) {
                                    pVar3 = list2.get(i14);
                                    if (p005kotlin.jvm.internal.s.g(pVar3.getF182145b(), f0Var10)) {
                                        arrayList.add(pVar3);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    w5.f0.f182097b.getClass();
                                    f0Var = w5.f0.f182099d;
                                    size2 = list2.size();
                                    i15 = z16 ? 1 : 0;
                                    f0Var2 = null;
                                    f0Var3 = null;
                                    while (i15 < size2) {
                                        f182145b = list2.get(i15).getF182145b();
                                        if (f0Var != null) {
                                            i17 = size2;
                                            if (p005kotlin.jvm.internal.s.h(f182145b.f182107a, f0Var.f182107a) < 0) {
                                                continue;
                                            }
                                            i15++;
                                            size2 = i17;
                                        } else {
                                            i17 = size2;
                                        }
                                        i18 = f182145b.f182107a;
                                        if (p005kotlin.jvm.internal.s.h(i18, i30) < 0) {
                                            if (f0Var2 != null) {
                                                f0Var2 = f182145b;
                                            } else {
                                                f0Var2 = f182145b;
                                            }
                                        } else if (p005kotlin.jvm.internal.s.h(i18, i30) > 0) {
                                            f0Var2 = f182145b;
                                            f0Var3 = f0Var2;
                                            if (f0Var3 != null) {
                                                f0Var2 = f0Var3;
                                            }
                                            arrayList = new ArrayList(list2.size());
                                            size3 = list2.size();
                                            while (i16 < size3) {
                                                pVar2 = list2.get(i16);
                                                if (p005kotlin.jvm.internal.s.g(pVar2.getF182145b(), f0Var2)) {
                                                    arrayList.add(pVar2);
                                                }
                                            }
                                        } else if (f0Var3 != null) {
                                            f0Var3 = f182145b;
                                        } else {
                                            f0Var3 = f182145b;
                                        }
                                        i15++;
                                        size2 = i17;
                                    }
                                    if (f0Var3 != null) {
                                        f0Var2 = f0Var3;
                                    }
                                    arrayList = new ArrayList(list2.size());
                                    size3 = list2.size();
                                    while (i16 < size3) {
                                        pVar2 = list2.get(i16);
                                        if (p005kotlin.jvm.internal.s.g(pVar2.getF182145b(), f0Var2)) {
                                            arrayList.add(pVar2);
                                        }
                                    }
                                }
                            }
                        }
                        arrayList4 = arrayList;
                    }
                    w5.j jVar2 = xVar.f182179a;
                    int size11 = arrayList4.size();
                    int i45 = z16 ? 1 : 0;
                    ArrayList arrayListM = null;
                    while (true) {
                        if (i45 < size11) {
                            w5.p pVar9 = (w5.p) arrayList4.get(i45);
                            int f182148e = pVar9.getF182064a();
                            w5.z.f182183b.getClass();
                            if (f182148e == 0) {
                                synchronized (jVar2.f182128c) {
                                    try {
                                        w5.j.b bVar7 = new w5.j.b(pVar9, l0Var.getF182139b());
                                        w5.j.a aVarD2 = jVar2.f182126a.get(bVar7);
                                        if (aVarD2 == null) {
                                            aVarD2 = jVar2.f182127b.d(bVar7);
                                        }
                                        if (aVarD2 != null) {
                                            objInvoke = aVarD2.f182129a;
                                        } else {
                                            Unit unit = Unit.INSTANCE;
                                            try {
                                                objInvoke = l0Var.c(pVar9);
                                            } catch (Exception unused) {
                                                objInvoke = bVar6.invoke(u0Var);
                                            }
                                            w5.j.a(jVar2, pVar9, l0Var, objInvoke);
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                    break;
                                }
                                if (objInvoke == null) {
                                    objInvoke = bVar6.invoke(u0Var);
                                }
                                pVar = new o13.p(arrayListM, w5.d0.a(u0Var.f182169d, objInvoke, pVar9, u0Var.f182167b, u0Var.f182168c));
                            } else {
                                if (f182148e != w5.z.f182184c) {
                                    if (f182148e == w5.z.f182185d) {
                                        jVar2.getClass();
                                        w5.j.b bVar8 = new w5.j.b(pVar9, l0Var.getF182139b());
                                        synchronized (jVar2.f182128c) {
                                            aVarD = jVar2.f182126a.get(bVar8);
                                            if (aVarD == null) {
                                                aVarD = jVar2.f182127b.d(bVar8);
                                            }
                                            break;
                                        }
                                        if (aVarD != null) {
                                            Object obj2 = aVarD.f182129a;
                                            if (obj2 != null) {
                                                pVar = new o13.p(arrayListM, w5.d0.a(u0Var.f182169d, obj2, pVar9, u0Var.f182167b, u0Var.f182168c));
                                            }
                                        } else if (arrayListM == null) {
                                            w5.p[] pVarArr = new w5.p[1];
                                            pVarArr[z16 ? 1 : 0] = pVar9;
                                            arrayListM = p13.x.m(pVarArr);
                                        } else {
                                            arrayListM.add(pVar9);
                                        }
                                        i45++;
                                    } else {
                                        com.google.firebase.messaging.l.n(pVar9, "Unknown font type ");
                                    }
                                    return null;
                                }
                                synchronized (jVar2.f182128c) {
                                    try {
                                        w5.j.b bVar9 = new w5.j.b(pVar9, l0Var.getF182139b());
                                        w5.j.a aVarD3 = jVar2.f182126a.get(bVar9);
                                        if (aVarD3 == null) {
                                            aVarD3 = jVar2.f182127b.d(bVar9);
                                        }
                                        if (aVarD3 != null) {
                                            bVar = aVarD3.f182129a;
                                        } else {
                                            Unit unit2 = Unit.INSTANCE;
                                            try {
                                                int i46 = o13.q.f128596b;
                                                bVar = l0Var.c(pVar9);
                                            } catch (Throwable th4) {
                                                int i47 = o13.q.f128596b;
                                                bVar = new o13.q.b(th4);
                                            }
                                            if (bVar instanceof o13.q.b) {
                                                bVar = null;
                                            }
                                            w5.j.a(jVar2, pVar9, l0Var, bVar);
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                    break;
                                }
                                if (bVar != null) {
                                    pVar = new o13.p(arrayListM, w5.d0.a(u0Var.f182169d, bVar, pVar9, u0Var.f182167b, u0Var.f182168c));
                                } else {
                                    i45++;
                                }
                            }
                        } else {
                            pVar = new o13.p(arrayListM, bVar6.invoke(u0Var));
                        }
                    }
                    List list3 = (List) pVar.f128594a;
                    B b14 = pVar.f128595b;
                    if (list3 == null) {
                        aVar = new w0.b(b14, z16, 2, null);
                    } else {
                        w5.i iVar = new w5.i(list3, b14, u0Var, xVar.f182179a, lVar, l0Var);
                        ge1.b.T(xVar.f182180b, null, o53.d0.UNDISPATCHED, new w5.y(iVar, null), 1);
                        aVar = new w0.a(iVar);
                    }
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    return aVar;
                }
                n0 n0Var = sVar.f182159e.f182137a;
                w5.q qVar2 = u0Var.f182166a;
                int i48 = u0Var.f182168c;
                w5.f0 f0Var12 = u0Var.f182167b;
                if (qVar2 == null || (qVar2 instanceof w5.l)) {
                    n0Var.getClass();
                    jVar = null;
                    typefaceA = n0.a(null, f0Var12, i48);
                } else {
                    if (!(qVar2 instanceof w5.i0)) {
                        if (qVar2 instanceof j0) {
                            r0 r0Var = ((j0) qVar2).f182132g;
                            r0Var.getClass();
                            typefaceA = ((a6.i) r0Var).getF1510a();
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 != null) {
                            return bVar2;
                        }
                        vb.h.z("Could not load font");
                        return null;
                    }
                    n0Var.getClass();
                    typefaceA = n0.a(((w5.i0) qVar2).f182124g, f0Var12, i48);
                    jVar = null;
                }
                bVar2 = new w0.b(typefaceA, false, 2, jVar);
                if (bVar2 != null) {
                    return bVar2;
                }
                vb.h.z("Could not load font");
                return null;
            case 10:
                v0 v0Var = (v0) this.f181059b;
                w5.u0 u0Var2 = (w5.u0) this.f181060c;
                w0 w0Var = (w0) obj;
                synchronized (v0Var.f182171a) {
                    try {
                        boolean f182176b = w0Var.getF182176b();
                        p1.c0<w5.u0, w0> c0Var = v0Var.f182172b;
                        if (f182176b) {
                            c0Var.put(u0Var2, w0Var);
                        } else {
                            c0Var.remove(u0Var2);
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return Unit.INSTANCE;
            case 11:
                androidx.lifecycle.n0 n0Var2 = (androidx.lifecycle.n0) this.f181059b;
                p1 p1Var2 = (p1) this.f181060c;
                ((i0) obj).getClass();
                g02.f0 f0Var13 = new g02.f0(p1Var2, 1);
                n0Var2.getF158016a().a(f0Var13);
                return new w52.b.C3393b(n0Var2, f0Var13);
            case 12:
                p005kotlin.jvm.internal.r0 r0Var2 = (p005kotlin.jvm.internal.r0) this.f181059b;
                p005kotlin.jvm.internal.r0 r0Var3 = (p005kotlin.jvm.internal.r0) this.f181060c;
                oi0.b bVar10 = (oi0.b) obj;
                bVar10.getClass();
                String strV = d53.u.v(bVar10.f132238b, "·", StringUtils.SPACE, false);
                bVar10.f132238b = strV;
                T t14 = r0Var2.f105810a;
                if (t14 != 0 && (t7 = r0Var3.f105810a) != 0) {
                    bVar10.f132238b = d53.u.v(strV, (String) t14, (String) t7, true);
                }
                return Unit.INSTANCE;
            case 13:
                p005kotlin.jvm.internal.m0 m0Var2 = (p005kotlin.jvm.internal.m0) this.f181059b;
                ArrayList arrayList6 = (ArrayList) this.f181060c;
                l52.i.a aVar7 = (l52.i.a) obj;
                aVar7.getClass();
                f1.c(arrayList6, aVar7);
                m0Var2.f105804a = ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar7.getData()).f48217c == m52.d.REST || ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar7.getData()).f48217c == m52.d.RECOVERY;
                return Unit.INSTANCE;
            case 14:
                e23.l lVar2 = (e23.l) this.f181059b;
                w70.g gVar = (w70.g) this.f181060c;
                DashboardRoute dashboardRoute = (DashboardRoute) obj;
                dashboardRoute.getClass();
                lVar2.invoke(dashboardRoute);
                if ((dashboardRoute.equals(DashboardRoute.EditInFocus.INSTANCE) || dashboardRoute.equals(DashboardRoute.EditSecondaryStats.INSTANCE) || dashboardRoute.equals(DashboardRoute.EditEssentials.INSTANCE)) && !p005kotlin.jvm.internal.s.g(gVar.f183496i, gVar.f183497j.getValue())) {
                    gVar.y4(false);
                }
                return Unit.INSTANCE;
            case 15:
                qi2.c cVar2 = (qi2.c) this.f181059b;
                Context context2 = (Context) this.f181060c;
                ((CreationExtras) obj).getClass();
                return new wi2.e(cVar2, new vi2.c(), new vi2.b(), new vi2.e(), new xi2.c(context2));
            case 16:
                qi2.c cVar3 = (qi2.c) this.f181059b;
                androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) this.f181060c;
                ((CreationExtras) obj).getClass();
                return new wi2.p(cVar3, b0Var);
            case 17:
                androidx.lifecycle.n0 n0Var3 = (androidx.lifecycle.n0) this.f181059b;
                wn0.l lVar3 = (wn0.l) this.f181060c;
                ((i0) obj).getClass();
                androidx.lifecycle.a0 a0Var2 = new androidx.lifecycle.a0(lVar3, 15);
                n0Var3.getF158016a().a(a0Var2);
                return new wn0.j(n0Var3, a0Var2);
            case 18:
                nk0.l lVar4 = (nk0.l) this.f181059b;
                nk0.l lVar5 = (nk0.l) this.f181060c;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                String str = i3Var.f111063a;
                if (p005kotlin.jvm.internal.s.g(str, "HELP")) {
                    lVar4.invoke();
                } else if (p005kotlin.jvm.internal.s.g(str, "STATUS_ALERTS")) {
                    lVar5.invoke();
                }
                return Unit.INSTANCE;
            case 19:
                com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar8 = (com.garmin.feature.garminpay.providers.felica.ui.account.developer.a) this.f181059b;
                String str2 = (String) this.f181060c;
                aVar8.f51039m.j(str2 + ": Failed - " + ((Throwable) obj).getMessage());
                return Unit.INSTANCE;
            case 20:
                androidx.fragment.app.v vVar = (androidx.fragment.app.v) this.f181059b;
                wu0.d dVar2 = (wu0.d) this.f181060c;
                Fragment fragment = (Fragment) obj;
                int i49 = wu0.d.f187242m;
                fragment.getClass();
                androidx.fragment.app.a aVar9 = new androidx.fragment.app.a(vVar);
                aVar9.l(dVar2.f187252j, fragment, "CONSENT_FRAGMENT");
                aVar9.e();
                return Unit.INSTANCE;
            case 21:
                qv1.b bVar11 = (qv1.b) this.f181059b;
                m0 m0Var3 = (m0) this.f181060c;
                LocalDate localDate = (LocalDate) obj;
                localDate.getClass();
                rt1.l.f154545a.getClass();
                rt1.l.a("GarminCoachReportCreateNewPlanTapped");
                bVar11.I4(localDate);
                lc.y.k(wv1.c.C3487c.f187460b.f187457a, m0Var3);
                return Unit.INSTANCE;
            case 22:
                e23.l lVar6 = (e23.l) this.f181059b;
                mx1.c cVar4 = (mx1.c) this.f181060c;
                ((Boolean) obj).getClass();
                lVar6.invoke(cVar4);
                return Unit.INSTANCE;
            case 23:
                e23.p pVar10 = (e23.p) this.f181059b;
                o13.p pVar11 = (o13.p) this.f181060c;
                String str3 = (String) obj;
                str3.getClass();
                pVar10.invoke(pVar11.f128594a, str3);
                return Unit.INSTANCE;
            case 24:
                e23.l lVar7 = (e23.l) this.f181059b;
                mx1.d dVar3 = (mx1.d) this.f181060c;
                ((Boolean) obj).getClass();
                lVar7.invoke(dVar3);
                return Unit.INSTANCE;
            case 25:
                e23.a aVar10 = (e23.a) this.f181059b;
                x1.k kVar = (x1.k) this.f181060c;
                aVar10.invoke();
                kVar.f188365a.setValue(new x1.k.a.b(((n4.c) obj).f123544a, null));
                return Unit.INSTANCE;
            case 26:
                CreateCustomCourseActivity createCustomCourseActivity = (CreateCustomCourseActivity) this.f181059b;
                Long l14 = (Long) this.f181060c;
                ((Integer) obj).getClass();
                CreateCustomCourseActivity.a aVar11 = CreateCustomCourseActivity.f33013f;
                x40.l0 l0VarFa = createCustomCourseActivity.fa();
                l0VarFa.getClass();
                l0VarFa.D4(new a50.e.f0(l14));
                createCustomCourseActivity.fa().A4();
                return Unit.INSTANCE;
            case 27:
                CreateCustomCourseActivity createCustomCourseActivity2 = (CreateCustomCourseActivity) this.f181059b;
                com.garmin.android.apps.connectmobile.courses.model.e eVar3 = (com.garmin.android.apps.connectmobile.courses.model.e) this.f181060c;
                ((Integer) obj).getClass();
                CreateCustomCourseActivity.a aVar12 = CreateCustomCourseActivity.f33013f;
                CourseDetailsActivity.a aVar13 = CourseDetailsActivity.f33024k;
                boolean z17 = createCustomCourseActivity2.f33014a;
                aVar13.getClass();
                CourseDetailsActivity.a.c(createCustomCourseActivity2, eVar3, z17);
                createCustomCourseActivity2.setResult(-1);
                createCustomCourseActivity2.finish();
                return Unit.INSTANCE;
            case 28:
                CreateCustomCourseActivity createCustomCourseActivity3 = (CreateCustomCourseActivity) this.f181059b;
                com.garmin.android.apps.connectmobile.courses.model.g gVar2 = (com.garmin.android.apps.connectmobile.courses.model.g) this.f181060c;
                GeoPointDTO geoPointDTO = (GeoPointDTO) obj;
                CreateCustomCourseActivity.a aVar14 = CreateCustomCourseActivity.f33013f;
                geoPointDTO.getClass();
                createCustomCourseActivity3.ha(new a50.c.i0(gVar2, geoPointDTO));
                return Unit.INSTANCE;
            default:
                List list4 = (List) this.f181059b;
                CreateCustomCourseActivity createCustomCourseActivity4 = (CreateCustomCourseActivity) this.f181060c;
                ClimbDTO climbDTO = (ClimbDTO) h0.e0(((Integer) obj).intValue(), list4);
                if (climbDTO != null) {
                    CreateCustomCourseActivity.a aVar15 = CreateCustomCourseActivity.f33013f;
                    x40.l0 l0VarFa2 = createCustomCourseActivity4.fa();
                    l0VarFa2.getClass();
                    l0VarFa2.D4(new a50.e.a0(climbDTO));
                }
                return Unit.INSTANCE;
        }
    }
}
