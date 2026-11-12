package qw0;

import am.f2;
import am.x0;
import am.z0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.Util;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.c0;
import p13.h0;
import p13.j0;
import ps.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lqw0/z;", "Lpo/h;", "Lcom/garmin/android/library/mapsdkadapter/i$n;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z extends po.h implements com.garmin.android.library.mapsdkadapter.i.n {
    public static final /* synthetic */ int M1 = 0;
    public final ArrayList F1 = new ArrayList();
    public final ArrayList G1 = new ArrayList();
    public final ArrayList H1 = new ArrayList();
    public final ArrayList I1 = new ArrayList();
    public final ArrayList J1 = new ArrayList();
    public final ArrayList K1 = new ArrayList();
    public uw0.g L1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqw0/z$a;", "Lcom/garmin/android/library/mapsdkadapter/i$c;", "<init>", "(Lqw0/z;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a implements com.garmin.android.library.mapsdkadapter.i.c {
        public a() {
        }

        @Override // com.garmin.android.library.mapsdkadapter.i.c
        public final void a(ie2.j jVar) {
        }

        /* JADX WARN: Code duplicated, block: B:45:0x0115  */
        @Override // com.garmin.android.library.mapsdkadapter.i.c
        public final View b(ie2.j jVar) {
            x1 x1Var;
            uw0.e aVar;
            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar;
            Object next;
            z zVar = z.this;
            boolean zU7 = zVar.u7();
            ArrayList arrayList = zVar.J1;
            if (zU7 && !zVar.f190663m && !arrayList.isEmpty()) {
                String title = jVar.getTitle();
                int i14 = title != null ? Integer.parseInt(title) : -1;
                Drawable drawable = null;
                if ((i14 >= 0 ? zVar.f138861r.get(i14) : -1) >= 0) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        Integer messageIndex = ((x1) next).getMessageIndex();
                        int i15 = i14 - 1;
                        if (messageIndex != null && messageIndex.intValue() == i15) {
                            break;
                        }
                    }
                    x1Var = (x1) next;
                } else {
                    x1Var = null;
                }
                String strValueOf = String.valueOf(i14);
                if (x1Var != null) {
                    Context context = zVar.f138869w.getContext();
                    new uw0.f();
                    context.getClass();
                    l22.a aVar2 = new l22.a(context);
                    x0 x0VarC = zVar.f138857p.C();
                    x0VarC.getClass();
                    switch (uw0.f.e.f172985a[x0VarC.ordinal()]) {
                        case 1:
                        case 2:
                            aVar = new uw0.f.a(aVar2);
                            break;
                        case 3:
                            aVar = new uw0.f.a(aVar2);
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            aVar = new uw0.f.d(aVar2);
                            break;
                        case 9:
                        case 10:
                            aVar = new uw0.f.c(aVar2);
                            break;
                        default:
                            aVar = new uw0.f.b(aVar2);
                            break;
                    }
                    zVar.D7(aVar.l(), aVar.k(), 8);
                    zVar.r7();
                    zVar.f138869w.setText(aVar.e(strValueOf));
                    Drawable[] drawableArrJ = aVar.j(context, x1Var.a2());
                    ImageView imageView = zVar.f138871x;
                    imageView.getClass();
                    for (Drawable drawable2 : drawableArrJ) {
                        if (drawable2 != null) {
                            drawable = drawable2;
                            v22.e.k(imageView, drawable);
                            zVar.D.setText(aVar.c());
                            zVar.E.setText(aVar.d(x1Var));
                            zVar.L0.setText(aVar.f());
                            zVar.F.setText(aVar.g(x1Var));
                            zVar.P.setVisibility(aVar.a());
                            zVar.P.setText(aVar.h(context, x1Var));
                            zVar.I.setVisibility(aVar.a());
                            hVar = zVar.f138857p;
                            if (hVar != null) {
                                TextView textView = zVar.I;
                                x0 x0VarC2 = hVar.C();
                                x0VarC2.getClass();
                                textView.setText(aVar.i(x1Var, x0VarC2));
                            }
                        }
                    }
                    v22.e.k(imageView, drawable);
                    zVar.D.setText(aVar.c());
                    zVar.E.setText(aVar.d(x1Var));
                    zVar.L0.setText(aVar.f());
                    zVar.F.setText(aVar.g(x1Var));
                    zVar.P.setVisibility(aVar.a());
                    zVar.P.setText(aVar.h(context, x1Var));
                    zVar.I.setVisibility(aVar.a());
                    hVar = zVar.f138857p;
                    if (hVar != null) {
                        TextView textView2 = zVar.I;
                        x0 x0VarC3 = hVar.C();
                        x0VarC3.getClass();
                        textView2.setText(aVar.i(x1Var, x0VarC3));
                    }
                }
            }
            View view2 = zVar.f138864t;
            view2.getClass();
            return view2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            DateTime startDateTime = ((x1) t7).getStartDateTime();
            Long lValueOf = Long.valueOf(startDateTime != null ? startDateTime.getMillis() : 0L);
            DateTime startDateTime2 = ((x1) t14).getStartDateTime();
            return r13.a.b(lValueOf, Long.valueOf(startDateTime2 != null ? startDateTime2.getMillis() : 0L));
        }
    }

    @Override // po.h
    public final boolean F7(boolean z14) {
        O7(z14);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072 A[LOOP:3: B:18:0x0064->B:22:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x007d A[SYNTHETIC] */
    @Override // po.h
    public final void L7() {
        int i14;
        List<x1> list = this.V0;
        list.getClass();
        if (list.size() > 1) {
            c0.u(list, new b());
        }
        int i15 = 0;
        if (this.V0.size() > 1) {
            List<x1> list2 = this.V0;
            list2.getClass();
            ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                Integer messageIndex = ((x1) it.next()).getMessageIndex();
                arrayList.add(Integer.valueOf(messageIndex != null ? messageIndex.intValue() : 0));
            }
            if (h0.g1(arrayList).size() <= 1) {
                List<x1> list3 = this.V0;
                list3.getClass();
                for (Object obj : list3) {
                    i14 = i15 + 1;
                    if (i15 >= 0) {
                        p13.x.q();
                        throw null;
                    }
                    ((x1) obj).q3(Integer.valueOf(i15));
                    i15 = i14;
                }
            }
        } else {
            List<x1> list4 = this.V0;
            list4.getClass();
            while (r0.hasNext()) {
                i14 = i15 + 1;
                if (i15 >= 0) {
                    p13.x.q();
                    throw null;
                }
                ((x1) obj).q3(Integer.valueOf(i15));
                i15 = i14;
            }
        }
        ArrayList arrayList2 = this.I1;
        arrayList2.clear();
        List<x1> list5 = this.V0;
        ArrayList arrayListL = androidx.core.view.j.l(list5);
        for (Object obj2 : list5) {
            qs.x xVarA2 = ((x1) obj2).a2();
            if (xVarA2 != null && P7().f172989d.contains(xVarA2)) {
                arrayListL.add(obj2);
            }
        }
        arrayList2.addAll(tq.k.c(arrayListL));
        ArrayList arrayList3 = this.J1;
        arrayList3.clear();
        List<x1> list6 = this.V0;
        ArrayList arrayListL2 = androidx.core.view.j.l(list6);
        for (Object obj3 : list6) {
            qs.x xVarA3 = ((x1) obj3).a2();
            if (xVarA3 != null && P7().f172990e.contains(xVarA3)) {
                arrayListL2.add(obj3);
            }
        }
        arrayList3.addAll(arrayListL2);
    }

    @Override // po.h, xf1.d, com.garmin.android.library.mapsdkadapter.i.m
    public final boolean O2(ie2.j jVar) {
        List<x1> list = this.V0;
        if (list == null || list.isEmpty()) {
            return super.O2(jVar);
        }
        Q7(new qe2.f(jVar, 1));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v3, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v7, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r13v8 */
    public final void O7(boolean z14) {
        boolean z15;
        Collection<com.garmin.android.library.mapsdkadapter.q> immutableList;
        boolean z16;
        ArrayList<ArrayList<Double>> arrayListA;
        com.garmin.android.library.mapsdkadapter.e eVarA;
        ?? arrayList;
        ?? arrayList2;
        com.garmin.android.library.mapsdkadapter.p pVar;
        qe2.h hVar;
        com.garmin.android.library.mapsdkadapter.p pVar2;
        qe2.h hVar2;
        ArrayList<ArrayList<Double>> arrayListA2;
        if (getActivity() != null) {
            qe2.h hVar3 = this.f148294e;
            if (hVar3 != null) {
                hVar3.clear();
            }
            ArrayList arrayList3 = this.G1;
            arrayList3.clear();
            ArrayList<ie2.j> arrayList4 = this.H1;
            arrayList4.clear();
            String str = this.f138857p.C().f4358a;
            z0 z0Var = z0.f4390a;
            if (z0.b(x0.W1, str) || z0.o(this.f138857p.C().f4358a)) {
                z15 = true;
            } else if (z0.b(x0.X1, this.f138857p.C().f4358a) || z0.x(this.f138857p.C().f4358a)) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean zX = z0.X(this.f138857p.C().f4358a);
            uw0.g gVarP7 = P7();
            to.f fVar = this.Y0;
            uo.a aVarB = f2.b(gVarP7, (fVar == null || (arrayListA2 = fVar.a()) == null) ? this.T0.D().C() : oe2.f.f(arrayListA2), this.V0, z15, zX);
            qe2.h hVar4 = this.f148294e;
            if (hVar4 != null) {
                List immutableList2 = aVarB != null ? Util.toImmutableList(aVarB.f172068b) : null;
                x0 x0VarC = this.f138857p.C();
                x0VarC.getClass();
                String str2 = x0VarC.f4358a;
                if (z0.X(str2) || z0.a0(str2)) {
                    if (immutableList2 != null) {
                        arrayList = new ArrayList();
                        for (Object obj : immutableList2) {
                            if (immutableList2.indexOf((com.garmin.android.library.mapsdkadapter.p) obj) % 2 == 0) {
                                arrayList.add(obj);
                            }
                        }
                    } else {
                        arrayList = j0.f134944a;
                    }
                    Iterable iterable = (Iterable) arrayList;
                    ArrayList arrayList5 = new ArrayList(p13.y.r(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(hVar4.x((com.garmin.android.library.mapsdkadapter.p) it.next()));
                    }
                    arrayList3.addAll(arrayList5);
                    if (immutableList2 != null) {
                        arrayList2 = new ArrayList();
                        for (Object obj2 : immutableList2) {
                            if (immutableList2.indexOf((com.garmin.android.library.mapsdkadapter.p) obj2) % 2 == 1) {
                                arrayList2.add(obj2);
                            }
                        }
                    } else {
                        arrayList2 = j0.f134944a;
                    }
                    Iterable iterable2 = (Iterable) arrayList2;
                    ArrayList arrayList6 = new ArrayList(p13.y.r(iterable2, 10));
                    Iterator it3 = iterable2.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(hVar4.x((com.garmin.android.library.mapsdkadapter.p) it3.next()));
                    }
                    arrayList4.addAll(arrayList6);
                } else {
                    ArrayList arrayList7 = this.K1;
                    if (immutableList2 != null && (pVar2 = (com.garmin.android.library.mapsdkadapter.p) h0.d0(immutableList2)) != null && (hVar2 = this.f148294e) != null) {
                        arrayList7.add(hVar2.x(pVar2));
                    }
                    if (immutableList2 != null && (pVar = (com.garmin.android.library.mapsdkadapter.p) h0.n0(immutableList2)) != null && (hVar = this.f148294e) != null) {
                        arrayList7.add(hVar.x(pVar));
                    }
                    if (!z14) {
                        for (ie2.j jVar : arrayList4) {
                            qe2.h hVar5 = this.f148294e;
                            if (hVar5 != null) {
                                hVar5.n(jVar);
                            }
                        }
                    } else if (immutableList2 != null) {
                        List listSubList = immutableList2.subList(1, immutableList2.size() - 1);
                        ArrayList arrayList8 = new ArrayList(p13.y.r(listSubList, 10));
                        Iterator it4 = listSubList.iterator();
                        while (it4.hasNext()) {
                            arrayList8.add(hVar4.x((com.garmin.android.library.mapsdkadapter.p) it4.next()));
                        }
                        arrayList4.addAll(arrayList8);
                    }
                }
            }
            com.garmin.android.library.mapsdkadapter.e.a aVar = new com.garmin.android.library.mapsdkadapter.e.a();
            if (aVarB == null || (immutableList = Util.toImmutableList(aVarB.f172067a)) == null) {
                immutableList = j0.f134944a;
            }
            if (immutableList.isEmpty()) {
                to.f fVar2 = this.Y0;
                List<com.garmin.android.apps.connectmobile.activities.newmodel.a0> listC = (fVar2 == null || (arrayListA = fVar2.a()) == null) ? this.T0.D().C() : oe2.f.f(arrayListA);
                listC.getClass();
                Iterator it5 = listC.iterator();
                z16 = false;
                while (it5.hasNext()) {
                    aVar.b(new com.garmin.android.library.mapsdkadapter.f(((com.garmin.android.apps.connectmobile.activities.newmodel.a0) it5.next()).D(), com.garmin.android.library.mapsdkadapter.i.b.WGS84));
                    z16 = true;
                }
            } else {
                z16 = false;
                for (com.garmin.android.library.mapsdkadapter.q qVar : immutableList) {
                    Iterator it6 = qVar.f50328a.f93153a.iterator();
                    while (it6.hasNext()) {
                        aVar.b((com.garmin.android.library.mapsdkadapter.f) it6.next());
                        z16 = true;
                    }
                    qe2.h hVar6 = this.f148294e;
                    if (hVar6 != null) {
                        this.F1.add(hVar6.h(qVar));
                    }
                }
            }
            com.garmin.android.library.mapsdkadapter.e.a aVar2 = z16 ? aVar : null;
            if (aVar2 == null || (eVarA = aVar2.a()) == null) {
                return;
            }
            qe2.h hVar7 = this.f148294e;
            if (hVar7 != null) {
                hVar7.k(new a());
            }
            qe2.h hVar8 = this.f148294e;
            if (hVar8 != null) {
                uw0.g gVarP8 = P7();
                hVar8.c(eVarA, gVarP8.b() != 0 ? (int) gVarP8.f172986a.getDimension(R.dimen.surf_legend_controls_padding) : 0);
            }
        }
    }

    public final uw0.g P7() {
        uw0.g gVar = this.L1;
        if (gVar != null) {
            return gVar;
        }
        p005kotlin.jvm.internal.s.m("mapConfiguration");
        throw null;
    }

    public final void Q7(e23.l lVar) {
        x1 x1Var;
        Object next;
        Object obj;
        int iIntValue;
        String title;
        T7();
        qe2.h hVar = this.f148294e;
        if (hVar != null) {
            com.garmin.android.library.mapsdkadapter.i iVar = hVar.f144584a;
            for (com.garmin.android.library.mapsdkadapter.l lVar2 : iVar.s()) {
                if (((Boolean) lVar.invoke(lVar2)).booleanValue() && (x1Var = (x1) h0.e0((iVar.s().indexOf(lVar2) - 1) / 2, this.I1)) != null) {
                    lVar2.f(P7().a(x1Var, false, true));
                    Iterator it = this.G1.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        ie2.j jVar = (ie2.j) next;
                        double d14 = jVar.getPosition().f50283a.latitude;
                        com.garmin.android.library.mapsdkadapter.f fVar = (com.garmin.android.library.mapsdkadapter.f) h0.d0(lVar2.d());
                        if (p005kotlin.jvm.internal.s.a(d14, fVar != null ? Double.valueOf(fVar.f50283a.latitude) : null)) {
                            double d15 = jVar.getPosition().f50283a.longitude;
                            com.garmin.android.library.mapsdkadapter.f fVar2 = (com.garmin.android.library.mapsdkadapter.f) h0.d0(lVar2.d());
                            if (p005kotlin.jvm.internal.s.a(d15, fVar2 != null ? Double.valueOf(fVar2.f50283a.longitude) : null)) {
                                break;
                            }
                        }
                    }
                    ie2.j jVar2 = (ie2.j) next;
                    Iterator it3 = this.H1.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next2 = it3.next();
                        ie2.j jVar3 = (ie2.j) next2;
                        double d16 = jVar3.getPosition().f50283a.latitude;
                        com.garmin.android.library.mapsdkadapter.f fVar3 = (com.garmin.android.library.mapsdkadapter.f) h0.n0(lVar2.d());
                        if (p005kotlin.jvm.internal.s.a(d16, fVar3 != null ? Double.valueOf(fVar3.f50283a.latitude) : null)) {
                            double d17 = jVar3.getPosition().f50283a.longitude;
                            com.garmin.android.library.mapsdkadapter.f fVar4 = (com.garmin.android.library.mapsdkadapter.f) h0.n0(lVar2.d());
                            if (p005kotlin.jvm.internal.s.a(d17, fVar4 != null ? Double.valueOf(fVar4.f50283a.longitude) : null)) {
                                obj = next2;
                                break;
                            }
                        }
                    }
                    ie2.j jVar4 = (ie2.j) obj;
                    if (jVar4 == null || (title = jVar4.getTitle()) == null || !TextUtils.isDigitsOnly(title)) {
                        Integer messageIndex = x1Var.getMessageIndex();
                        iIntValue = (messageIndex != null ? messageIndex.intValue() : 0) + 1;
                    } else {
                        String title2 = jVar4.getTitle();
                        title2.getClass();
                        iIntValue = Integer.parseInt(title2);
                    }
                    qs.x xVarA2 = x1Var.a2();
                    uw0.g gVarP7 = P7();
                    uw0.c cVar = gVarP7.f172988c;
                    Bitmap bitmapG = gVarP7.f172993h ? cVar.g() : cVar.h(xVarA2);
                    uw0.g gVarP8 = P7();
                    uw0.c cVar2 = gVarP8.f172988c;
                    Bitmap bitmapJ = gVarP8.f172993h ? cVar2.j(iIntValue) : cVar2.k();
                    if (bitmapG != null && jVar2 != null) {
                        jVar2.f(bitmapG);
                    }
                    if (bitmapJ != null && jVar4 != null) {
                        jVar4.f(bitmapJ);
                    }
                    if (jVar2 != null) {
                        jVar2.k();
                    }
                    if (jVar4 != null) {
                        jVar4.k();
                    }
                    if (!P7().f172996k) {
                        jVar2 = jVar4;
                    }
                    if (jVar2 != null) {
                        jVar2.m();
                    }
                }
            }
        }
    }

    public final void R7() {
        qe2.h hVar;
        androidx.fragment.app.m activity = getActivity();
        if (activity == null || this.f138857p == null) {
            return;
        }
        uw0.g.a aVar = new uw0.g.a();
        x0 x0VarC = this.f138857p.C();
        x0VarC.getClass();
        aVar.f172998b = x0VarC;
        aVar.f172997a = false;
        Resources resources = activity.getResources();
        resources.getClass();
        this.L1 = aVar.a(resources);
        if (!P7().f172994i || (hVar = this.f148294e) == null) {
            return;
        }
        ie2.k uiSettings = hVar.f144584a.getUiSettings();
        if (uiSettings != null) {
            uiSettings.setZoomControlsEnabled(false);
        }
        qe2.h hVar2 = this.f148294e;
        if (hVar2 != null) {
            hVar2.O(this);
        }
        qe2.h hVar3 = this.f148294e;
        if (hVar3 != null) {
            hVar3.K(this);
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.n
    public final boolean T0(com.garmin.android.library.mapsdkadapter.l lVar) {
        List<x1> list = this.V0;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Q7(new qe2.g(lVar, 1));
        return true;
    }

    public final void T7() {
        qe2.h hVar = this.f148294e;
        if (hVar != null) {
            for (com.garmin.android.library.mapsdkadapter.l lVar : hVar.f144584a.s()) {
                int zIndex = ((int) lVar.getZIndex()) - 1;
                if (zIndex >= 0) {
                    ArrayList arrayList = this.I1;
                    if (zIndex < arrayList.size()) {
                        x1 x1Var = (x1) arrayList.get(zIndex);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Double distance = ((x1) it.next()).getDistance();
                            if (distance != null) {
                                arrayList2.add(distance);
                            }
                        }
                        lVar.f(P7().a(x1Var, p005kotlin.jvm.internal.s.d(h0.p0(arrayList2), x1Var.getDistance()), false));
                    }
                }
            }
        }
        y yVar = new y(this, 0);
        for (ie2.j jVar : this.G1) {
            boolean zBooleanValue = ((Boolean) yVar.invoke(jVar)).booleanValue();
            uw0.g gVarP7 = P7();
            String title = jVar.getTitle();
            title.getClass();
            qs.x xVarA2 = ((x1) this.J1.get(Integer.parseInt(title) - 1)).a2();
            uw0.c cVar = gVarP7.f172988c;
            Bitmap bitmapF = (zBooleanValue && gVarP7.f172992g) ? cVar.f() : cVar.h(xVarA2);
            if (bitmapF != null) {
                jVar.f(bitmapF);
            }
        }
        for (ie2.j jVar2 : this.H1) {
            boolean zBooleanValue2 = ((Boolean) yVar.invoke(jVar2)).booleanValue();
            uw0.g gVarP8 = P7();
            String title2 = jVar2.getTitle();
            title2.getClass();
            Integer.parseInt(title2);
            uw0.c cVar2 = gVarP8.f172988c;
            Bitmap bitmapI = (zBooleanValue2 && gVarP8.f172992g) ? cVar2.i() : cVar2.k();
            if (bitmapI != null) {
                jVar2.f(bitmapI);
            }
        }
    }

    @Override // xf1.d, com.garmin.android.library.mapsdkadapter.i.j
    public final void X(com.garmin.android.library.mapsdkadapter.f fVar) {
        T7();
    }

    @Override // po.h
    public final void d7() {
        Object next;
        int iB;
        List<x1> list = this.V0;
        list.getClass();
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((x1) next).a2() == null);
        boolean z14 = next == null;
        List<x1> list2 = this.V0;
        if (list2 == null || list2.isEmpty() || z14) {
            super.d7();
            return;
        }
        po.h.d dVar = new po.h.d();
        this.f138859q = dVar;
        dVar.f138882b = new ArrayList<>();
        qe2.h hVar = this.f148294e;
        if (hVar != null) {
            hVar.clear();
        }
        this.F1.clear();
        this.G1.clear();
        this.H1.clear();
        List<x1> list3 = this.V0;
        if (list3 != null && !list3.isEmpty()) {
            List<x1> list4 = this.V0;
            list4.getClass();
            if (list4.size() > 1) {
                c0.u(list4, new a0());
            }
            int size = this.V0.size();
            this.f138861r = new SparseIntArray(size);
            if (size > 1) {
                int i14 = 0;
                while (i14 < size) {
                    int i15 = i14 + 1;
                    this.f138861r.put(i15, i14);
                    i14 = i15;
                }
            }
        }
        O7(this.f138868v1.e());
        qe2.h hVar2 = this.f148294e;
        if (hVar2 != null) {
            uw0.g gVarP7 = P7();
            hVar2.setPadding(0, 0, 0, gVarP7.b() != 0 ? (int) gVarP7.f172986a.getDimension(R.dimen.surf_legend_controls_padding) : 0);
        }
        androidx.fragment.app.m activity = getActivity();
        if (activity != null && (iB = P7().b()) != 0) {
            View viewInflate = activity.getLayoutInflater().inflate(iB, (ViewGroup) null);
            FrameLayout frameLayout = this.f148292c;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            FrameLayout frameLayout2 = this.f148292c;
            if (frameLayout2 != null) {
                frameLayout2.removeAllViews();
            }
            FrameLayout frameLayout3 = this.f148292c;
            if (frameLayout3 != null) {
                frameLayout3.addView(viewInflate);
            }
            FrameLayout frameLayout4 = this.f148292c;
            if (frameLayout4 != null) {
                frameLayout4.requestLayout();
            }
        }
        f7();
    }

    @Override // po.h, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        R7();
    }

    @Override // po.h
    public final void v7(com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, to.f fVar) {
        super.v7(hVar, fVar);
        R7();
    }
}
