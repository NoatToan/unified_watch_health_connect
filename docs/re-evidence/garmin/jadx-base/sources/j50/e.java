package j50;

import am.x0;
import am.z0;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import gg1.o0;
import i50.h;
import i50.i;
import i50.j;
import j20.x;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k30.n;
import k30.o;
import lc.u0;
import p13.h0;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97053a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.f4308n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.J0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.f4312o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.X0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x0.Z0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x0.V0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x0.f4320q.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[x0.f4346x.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f97053a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe A[LOOP:4: B:55:0x00f8->B:57:0x00fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0121  */
    public static final j a(Context context, h hVar, List<com.garmin.android.apps.connectmobile.courses.model.d> list, i iVar, boolean z14, o0 o0Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        HashSet hashSetZ0;
        ArrayList arrayList3;
        List<com.garmin.android.apps.connectmobile.courses.model.d> listN0;
        i50.d dVar;
        i50.d dVar2;
        String string = null;
        if (hVar.f91767f) {
            i53.c cVarE = i53.a.e(j0.f134944a);
            String string2 = context.getString(R.string.message_course_loading_fail);
            string2.getClass();
            return new j(cVarE, new i50.d(2131231916, string2, null, null), null, z14, o0Var);
        }
        i50.b bVar = hVar.f91762a;
        j50.a aVar = j50.a.f97050a;
        int i14 = hVar.f91763b;
        boolean zD = bVar.d();
        boolean z15 = bVar.f91697d;
        aVar.getClass();
        list.getClass();
        iVar.getClass();
        boolean z16 = iVar == i.FAVORITES;
        long j8 = i14;
        if (zD || z15) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                com.garmin.android.apps.connectmobile.courses.model.d dVar3 = (com.garmin.android.apps.connectmobile.courses.model.d) obj;
                if (!z16 ? j8 != dVar3.userProfileId : !(dVar3.isFavorite && j8 == dVar3.userProfileId)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                com.garmin.android.apps.connectmobile.courses.model.d dVar4 = (com.garmin.android.apps.connectmobile.courses.model.d) obj2;
                if (z16 ? dVar4.isFavorite : j8 == dVar4.userProfileId) {
                    arrayList.add(obj2);
                }
            }
        }
        j50.a aVar2 = j50.a.f97050a;
        n nVar = hVar.f91764c;
        aVar2.getClass();
        nVar.getClass();
        int i15 = j30.j.f96863a;
        i53.c<o> cVar = nVar.f102576b;
        if (cVar.size() != com.garmin.android.apps.connectmobile.courses.model.i.f32978q.getF134973e()) {
            ArrayList arrayListA = j30.j.a(nVar);
            arrayList2 = new ArrayList(y.r(arrayListA, 10));
            it = arrayListA.iterator();
            while (it.hasNext()) {
                arrayList2.add(context.getString(((com.garmin.android.apps.connectmobile.courses.model.i) it.next()).f32979a));
            }
            hashSetZ0 = h0.Z0(arrayList2);
            arrayList3 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (hashSetZ0.contains(dh.b.A(context, ((com.garmin.android.apps.connectmobile.courses.model.d) obj3).C().f4360c))) {
                    arrayList3.add(obj3);
                }
            }
        } else {
            if (!cVar.isEmpty()) {
                Iterator<o> it3 = cVar.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (!it3.next().f102580b) {
                            ArrayList arrayListA2 = j30.j.a(nVar);
                            arrayList2 = new ArrayList(y.r(arrayListA2, 10));
                            it = arrayListA2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(context.getString(((com.garmin.android.apps.connectmobile.courses.model.i) it.next()).f32979a));
                            }
                            hashSetZ0 = h0.Z0(arrayList2);
                            arrayList3 = new ArrayList();
                            while (r11.hasNext()) {
                                if (hashSetZ0.contains(dh.b.A(context, ((com.garmin.android.apps.connectmobile.courses.model.d) obj3).C().f4360c))) {
                                    arrayList3.add(obj3);
                                }
                            }
                        }
                    }
                }
            }
            arrayList3 = arrayList;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayList3) {
            double d14 = nVar.f102577c;
            double d15 = nVar.f102578d;
            double d16 = ((com.garmin.android.apps.connectmobile.courses.model.d) obj4).distanceInMeters;
            if (d14 <= d16 && d16 <= d15) {
                arrayList4.add(obj4);
            }
        }
        int i16 = j50.a.C1853a.f97051a[nVar.f102575a.ordinal()];
        if (i16 == 1) {
            listN0 = h0.N0(arrayList4, new b());
        } else if (i16 != 2) {
            Comparator comparator = String.CASE_INSENSITIVE_ORDER;
            if (i16 == 3) {
                u.s(p005kotlin.jvm.internal.x0.f105818a);
                listN0 = h0.N0(arrayList4, new d(comparator));
            } else {
                if (i16 != 4) {
                    u0.r();
                    return null;
                }
                u.s(p005kotlin.jvm.internal.x0.f105818a);
                Comparator comparatorReversed = new d(comparator).reversed();
                comparatorReversed.getClass();
                listN0 = h0.N0(arrayList4, comparatorReversed);
            }
        } else {
            listN0 = h0.N0(arrayList4, new c());
        }
        boolean z17 = listN0.size() != arrayList.size();
        if (!listN0.isEmpty() || hVar.f91765d || hVar.f91766e) {
            dVar = null;
        } else {
            boolean zB = bVar.b();
            boolean zC = bVar.c();
            boolean zD2 = bVar.d();
            if (iVar == i.FAVORITES) {
                if (zB) {
                    String string3 = context.getString(R.string.msg_no_pace_pro_courses_favorite);
                    string3.getClass();
                    dVar = new i50.d(2131231064, string3, null, context.getString(R.string.pacepro_no_courses_search_running_courses));
                } else if (zC) {
                    String string4 = context.getString(R.string.msg_no_pace_pro_courses_favorite);
                    string4.getClass();
                    dVar = new i50.d(2131231064, string4, null, context.getString(R.string.power_guide_search_lbl));
                } else if (z17) {
                    String string5 = context.getString(R.string.message_no_results_filter);
                    string5.getClass();
                    dVar = new i50.d(2131231064, string5, null, null);
                } else {
                    String string6 = context.getString(R.string.msg_no_courses_favorite);
                    string6.getClass();
                    dVar = new i50.d(2131231913, string6, null, null);
                }
            } else if (zB) {
                String string7 = context.getString(R.string.pacepro_no_running_courses_empty_state_label);
                string7.getClass();
                dVar = new i50.d(2131231063, string7, null, context.getString(R.string.lbl_create_a_course));
            } else if (zC) {
                String string8 = context.getString(R.string.power_guide_no_course_title);
                string8.getClass();
                dVar = new i50.d(2131231915, string8, sa1.h.d(context), context.getString(R.string.lbl_create_a_course));
            } else {
                if (zD2 || z17) {
                    String string9 = context.getString(R.string.message_no_results_filter);
                    string9.getClass();
                    dVar2 = new i50.d(2131231915, string9, null, null);
                } else {
                    String string10 = context.getString(R.string.msg_no_courses_created_by_you);
                    string10.getClass();
                    dVar2 = new i50.d(2131231915, string10, null, null);
                }
                dVar = dVar2;
            }
        }
        if (!listN0.isEmpty() && (bVar.a() || (bVar.d() && bVar.f91699f))) {
            x0 x0Var = bVar.f91701h;
            if (x0Var == null) {
                x0Var = x0.f4346x;
            }
            String strA = dh.b.A(context, z0.e(x0Var, bVar.f91700g));
            Locale locale = Locale.ROOT;
            string = context.getString(R.string.event_course_footer, x.f(locale, strA, locale));
        }
        String str = string;
        ArrayList arrayList5 = new ArrayList(y.r(listN0, 10));
        for (com.garmin.android.apps.connectmobile.courses.model.d dVar5 : listN0) {
            String str2 = dVar5.courseId;
            String str3 = dVar5.courseName;
            com.garmin.android.apps.connectmobile.courses.model.i.a aVar3 = com.garmin.android.apps.connectmobile.courses.model.i.f32968g;
            x0 x0VarC = dVar5.C();
            aVar3.getClass();
            arrayList5.add(new i50.f(str2, str3, com.garmin.android.apps.connectmobile.courses.model.i.a.a(x0VarC), dVar5.distanceInMeters, dVar5.elevationGainInMeters, dVar5.isFavorite, dVar5.F(), dVar5.powerGuideId != 0, dVar5));
        }
        return new j(i53.a.e(arrayList5), dVar, str, z14, o0Var);
    }

    public static final f b(Context context, x0 x0Var, boolean z14) {
        if (x0Var == null) {
            x0Var = x0.f4346x;
        }
        String string = context.getString(R.string.courses_lbl_singular, dh.b.A(context, z0.e(x0Var, z14)));
        string.getClass();
        if (z0.g0(x0Var)) {
            String string2 = context.getString(R.string.select_bike_course);
            return new f(string, string2, p6.b.d(context, R.string.add_bike_course_later, string2));
        }
        if (z0.h0(x0Var)) {
            String string3 = context.getString(R.string.select_run_course);
            return new f(string, string3, p6.b.d(context, R.string.add_run_course_later, string3));
        }
        String string4 = context.getString(R.string.pacepro_lbl_select_course);
        return new f(string, string4, p6.b.d(context, R.string.add_course_later, string4));
    }
}
