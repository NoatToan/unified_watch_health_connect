package g50;

import am.x0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.b2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity.c;
import com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity.d;
import com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity.e;
import e23.p;
import gg1.o0;
import i3.e9;
import i3.mc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.l0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoursesActivity f75888b;

    public /* synthetic */ c(CoursesActivity coursesActivity, int i14) {
        this.f75887a = i14;
        this.f75888b = coursesActivity;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00eb A[PHI: r11
      0x00eb: PHI (r11v2 java.util.List<com.garmin.android.apps.connectmobile.courses.model.d>) = 
      (r11v1 java.util.List<com.garmin.android.apps.connectmobile.courses.model.d>)
      (r11v22 java.util.List<com.garmin.android.apps.connectmobile.courses.model.d>)
     binds: [B:11:0x006c, B:26:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        i50.e eVar;
        String str;
        String str2;
        String string;
        String string2;
        int i14 = this.f75887a;
        CoursesActivity coursesActivity = this.f75888b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = CoursesActivity.f33039i;
                int i16 = 1;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1933184889, new c(coursesActivity, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = CoursesActivity.f33039i;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    p1 p1VarC = s9.c.c(coursesActivity.ma().f75904j, mVar2);
                    Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                    i50.h hVar = (i50.h) p1VarC.getF182175a();
                    context.getClass();
                    hVar.getClass();
                    boolean z14 = hVar.f91772k;
                    boolean z15 = hVar.f91771j;
                    i50.b bVar = hVar.f91762a;
                    f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
                    boolean zY = lVar.y();
                    o0 o0VarG = lVar.g();
                    boolean zD = bVar.d();
                    boolean z16 = bVar.f91700g;
                    x0 x0Var = bVar.f91701h;
                    List<com.garmin.android.apps.connectmobile.courses.model.d> list = hVar.f91768g;
                    if (zD) {
                        if (bVar.f91699f) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : list) {
                                String str3 = ((com.garmin.android.apps.connectmobile.courses.model.d) obj3).consumer;
                                if (str3 == null || str3.length() == 0) {
                                    arrayList.add(obj3);
                                }
                            }
                            list = arrayList;
                        }
                        int i18 = bVar.f91703j;
                        if (i18 != -1) {
                            o13.p pVarC = b2.c(i18);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                com.garmin.android.apps.connectmobile.courses.model.d dVar = (com.garmin.android.apps.connectmobile.courses.model.d) next;
                                boolean z17 = z14;
                                Context context2 = context;
                                Iterator it3 = it;
                                if (dVar.distanceInMeters >= ((Number) pVarC.f128594a).doubleValue() && dVar.distanceInMeters <= ((Number) pVarC.f128595b).doubleValue()) {
                                    arrayList2.add(next);
                                }
                                context = context2;
                                z14 = z17;
                                it = it3;
                            }
                            list = arrayList2;
                        }
                    }
                    boolean z18 = z14;
                    Context context3 = context;
                    List<com.garmin.android.apps.connectmobile.courses.model.d> list2 = list;
                    i50.j jVarA = j50.e.a(context3, hVar, list2, i50.i.CREATED_BY_YOU, zY, o0VarG);
                    i50.j jVarA2 = j50.e.a(context3, hVar, list2, i50.i.FAVORITES, zY, o0VarG);
                    boolean z19 = (bVar.d() || bVar.a() || bVar.f91697d) ? false : (bVar.b() || bVar.c()) ? jVarA.f91780b == null : true;
                    String strD = (bVar.c() && z19) ? sa1.h.d(context3) : null;
                    if (z18) {
                        boolean z24 = x0Var == x0.f4320q;
                        String string3 = z24 ? context3.getString(R.string.add_course_later_title) : context3.getString(R.string.adding_course_to_event);
                        string3.getClass();
                        if (z24) {
                            string2 = context3.getString(R.string.lbl_create_course_hiking_subtext2_genesis);
                        } else {
                            switch (x0Var == null ? -1 : j50.e.a.f97053a[x0Var.ordinal()]) {
                                case 1:
                                    string = context3.getString(R.string.event_type_enum_running);
                                    break;
                                case 2:
                                    string = context3.getString(R.string.event_type_enum_trail_running);
                                    break;
                                case 3:
                                case 4:
                                    string = context3.getString(R.string.event_type_enum_cycling);
                                    break;
                                case 5:
                                    string = context3.getString(R.string.event_type_enum_gravel_cycling);
                                    break;
                                case 6:
                                    string = context3.getString(R.string.event_type_enum_mountain_biking);
                                    break;
                                case 7:
                                    string = context3.getString(R.string.event_type_enum_hiking);
                                    break;
                                case 8:
                                    string = context3.getString(R.string.event_type_enum_other);
                                    break;
                                default:
                                    string = null;
                                    break;
                            }
                            if (string == null) {
                                string = "";
                            }
                            string2 = context3.getString(R.string.no_event_courses_message, string);
                        }
                        String str4 = string2;
                        str4.getClass();
                        eVar = new i50.e(2131231915, string3, null, str4, false);
                    } else {
                        eVar = null;
                    }
                    if (bVar.d() && z15) {
                        j50.f fVarB = j50.e.b(context3, x0Var, z16);
                        String str5 = fVarB.f97054a;
                        str2 = fVarB.f97055b;
                        str = str5;
                    } else {
                        str = null;
                        str2 = null;
                    }
                    String string4 = (!z18 && bVar.d()) ? z15 ? j50.e.b(context3, x0Var, z16).f97056c : context3.getString(R.string.add_course_later) : null;
                    boolean z25 = hVar.f91772k;
                    i50.g gVar = new i50.g(hVar.f91765d, hVar.f91766e, z25, strD, bVar.d() && !z15, str, str2, z19, hVar.f91770i, jVarA, jVarA2, eVar, string4, z25 && !bVar.f91698e);
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = l0.j(t13.h.f161748a, mVar2);
                        mVar2.K(objQ);
                    }
                    b0 b0Var = (b0) objQ;
                    g gVarMa = coursesActivity.ma();
                    boolean zR = mVar2.r(gVarMa);
                    Object objQ2 = mVar2.q();
                    if (zR || objQ2 == c2565a) {
                        objQ2 = new CoursesActivity.b(gVarMa);
                        mVar2.K(objQ2);
                    }
                    e.a(gVar, (e23.l) ((k23.g) objQ2), mVar2, 0);
                    Boolean boolValueOf = Boolean.valueOf(((i50.h) p1VarC.getF182175a()).f91765d);
                    boolean zB = mVar2.B(p1VarC) | mVar2.r(coursesActivity);
                    Object objQ3 = mVar2.q();
                    if (zB || objQ3 == c2565a) {
                        objQ3 = coursesActivity.new c(p1VarC, null);
                        mVar2.K(objQ3);
                    }
                    l0.e((p) objQ3, boolValueOf, mVar2);
                    Unit unit = Unit.INSTANCE;
                    boolean zR2 = mVar2.r(coursesActivity);
                    Object objQ4 = mVar2.q();
                    if (zR2 || objQ4 == c2565a) {
                        objQ4 = coursesActivity.new d(null);
                        mVar2.K(objQ4);
                    }
                    l0.e((p) objQ4, unit, mVar2);
                    Boolean boolValueOf2 = Boolean.valueOf(((i50.h) p1VarC.getF182175a()).f91772k);
                    boolean zR3 = mVar2.r(coursesActivity);
                    Object objQ5 = mVar2.q();
                    if (zR3 || objQ5 == c2565a) {
                        objQ5 = coursesActivity.new e(null);
                        mVar2.K(objQ5);
                    }
                    l0.e((p) objQ5, boolValueOf2, mVar2);
                    mc mcVarF = e9.f(true, null, mVar2, 6, 2);
                    Boolean boolValueOf3 = Boolean.valueOf(((i50.h) p1VarC.getF182175a()).f91775n);
                    boolean zB2 = mVar2.B(p1VarC) | mVar2.B(mcVarF);
                    Object objQ6 = mVar2.q();
                    if (zB2 || objQ6 == c2565a) {
                        objQ6 = new CoursesActivity.f(mcVarF, p1VarC, null);
                        mVar2.K(objQ6);
                    }
                    l0.e((p) objQ6, boolValueOf3, mVar2);
                    if (((i50.h) p1VarC.getF182175a()).f91775n) {
                        mVar2.C(-293338639);
                        boolean zR4 = mVar2.r(b0Var) | mVar2.B(mcVarF) | mVar2.r(coursesActivity);
                        Object objQ7 = mVar2.q();
                        if (zR4 || objQ7 == c2565a) {
                            objQ7 = new fk0.a(b0Var, 8, mcVarF, coursesActivity);
                            mVar2.K(objQ7);
                        }
                        n.a((e23.a) objQ7, mcVarF, mVar2, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(-292960005);
                        mVar2.f();
                    }
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
