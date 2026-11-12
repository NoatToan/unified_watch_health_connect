package gl1;

import am.x0;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Environment;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.room.b0;
import androidx.room.l0;
import androidx.room.r0;
import c22.c2;
import c22.c3;
import c22.g2;
import c22.h2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e2.i0;
import f20.e0;
import h5.a1;
import h5.d2;
import h5.e2;
import i3.e5;
import i3.fe;
import ii0.d0;
import ii0.g0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import l30.y0;
import l72.i3;
import lc.m0;
import lc.v0;
import m63.k1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p3.n2;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    public static final ViewParent A(View view2) {
        view2.getClass();
        ViewParent parent = view2.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view2.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final Object B(o43.j jVar, k23.l lVar) {
        jVar.getClass();
        lVar.getClass();
        return jVar.invoke();
    }

    public static final ArrayList C(Context context, DateTime dateTime, DateTimeFormatter dateTimeFormatter) {
        context.getClass();
        dateTime.getClass();
        ArrayList arrayList = new ArrayList();
        DateTime dateTimePlusYears = dateTime.plusYears(1);
        if (dateTime.getMonthOfYear() == dateTimePlusYears.getMonthOfYear()) {
            boolean z14 = dateTime.getDayOfMonth() <= 15;
            for (String str : (ArrayList) fz.a.e(context, 1, dateTime, dateTimePlusYears, dateTimeFormatter)) {
                arrayList.add("");
                if (z14) {
                    arrayList.add("");
                    arrayList.add(str);
                } else {
                    arrayList.add(str);
                    arrayList.add("");
                }
                arrayList.add("");
            }
            return arrayList;
        }
        arrayList.add("");
        arrayList.add("");
        for (String str2 : (ArrayList) fz.a.e(context, 1, dateTime, dateTimePlusYears, dateTimeFormatter)) {
            arrayList.add("");
            arrayList.add(str2);
            arrayList.add("");
            arrayList.add("");
        }
        arrayList.add("");
        arrayList.add("");
        return arrayList;
    }

    public static final void D(i3 i3Var, e23.a aVar, e23.a aVar2, e23.a aVar3) {
        i3Var.getClass();
        aVar2.getClass();
        aVar3.getClass();
        String str = i3Var.f111063a;
        int iHashCode = str.hashCode();
        if (iHashCode == -1339415803) {
            if (str.equals("menu_item_strava_beacon_privacy")) {
                aVar3.invoke();
            }
        } else if (iHashCode == -946395635) {
            if (str.equals("menu_item_help")) {
                aVar.invoke();
            }
        } else if (iHashCode == 1267714364 && str.equals("menu_item_privacy")) {
            aVar2.invoke();
        }
    }

    public static final boolean E(kw0.f fVar) {
        fVar.getClass();
        return !fVar.f106947d.isEmpty();
    }

    public static final boolean F(ge1.a aVar) {
        List<hz.d> list;
        return (aVar == null || (list = aVar.f76996d) == null || !(list.isEmpty() ^ true)) ? false : true;
    }

    public static final boolean G(ge1.a aVar) {
        List<hz.d> list;
        List<hz.d> list2;
        return (aVar == null || (list = aVar.f76994b) == null || !(list.isEmpty() ^ true) || aVar == null || (list2 = aVar.f76995c) == null || !(list2.isEmpty() ^ true)) ? false : true;
    }

    public static final boolean H(kw0.a aVar) {
        aVar.getClass();
        return aVar.f106904b == pv0.s.YES;
    }

    public static final boolean I(LocalDate localDate, LocalDate localDate2) {
        return jg.b.r(localDate, localDate2) == 7;
    }

    public static final boolean J(l20.c cVar) {
        cVar.getClass();
        String strI = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
        if (strI != null) {
            return nb2.a.a(strI);
        }
        return true;
    }

    public static final boolean K(l20.c cVar, e0 e0Var) {
        cVar.getClass();
        e0Var.getClass();
        String strI = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
        if (strI != null) {
            return e0Var.a(strI);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:88:0x013c  */
    public static final List L(List list, List list2) {
        Object next;
        mk0.b bVar;
        Object next2;
        mk0.d dVar;
        String str;
        c80.u uVarB0;
        list.getClass();
        list2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            jk0.b bVar2 = (jk0.b) it.next();
            w13.c cVar = x0.H3;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = bVarN.next();
            } while (!d53.u.q(((x0) next2).f4358a, bVar2.f99233a, true));
            x0 x0Var = (x0) next2;
            if (x0Var != null) {
                Iterable<jk0.d> iterable = bVar2.f99234b;
                if (iterable == null) {
                    iterable = j0.f134944a;
                }
                ArrayList arrayList = new ArrayList();
                for (jk0.d dVar2 : iterable) {
                    String str2 = dVar2.f99240a;
                    if (str2 == null) {
                        dVar = null;
                    } else {
                        if (d53.w.J(str2)) {
                            str2 = null;
                        }
                        if (str2 == null || (str = dVar2.f99241b) == null || (uVarB0 = b0(str)) == null) {
                            dVar = null;
                        } else {
                            dVar = new mk0.d(str2, uVarB0);
                        }
                    }
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    mk0.a aVar = (mk0.a) linkedHashMap.get(x0Var);
                    List<mk0.b> list3 = aVar != null ? aVar.f119098b : null;
                    if (list3 == null) {
                        list3 = j0.f134944a;
                    }
                    List<mk0.d> list4 = aVar != null ? aVar.f119099c : null;
                    if (list4 == null) {
                        list4 = j0.f134944a;
                    }
                    linkedHashMap.put(x0Var, new mk0.a(x0Var, list3, h0.C0(list4, arrayList)));
                }
            }
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            jk0.a aVar2 = (jk0.a) it3.next();
            w13.c cVar2 = x0.H3;
            p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
            do {
                if (!bVarN2.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN2.next();
            } while (!d53.u.q(((x0) next).f4358a, aVar2.f99229a, true));
            x0 x0Var2 = (x0) next;
            if (x0Var2 != null) {
                Iterable<jk0.c> iterable2 = aVar2.f99230b;
                if (iterable2 == null) {
                    iterable2 = j0.f134944a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (jk0.c cVar3 : iterable2) {
                    String str3 = cVar3.f99237a;
                    if (str3 == null) {
                        bVar = null;
                    } else {
                        if (d53.w.J(str3)) {
                            str3 = null;
                        }
                        if (str3 == null) {
                            bVar = null;
                        } else {
                            Iterable iterable3 = cVar3.f99238b;
                            if (iterable3 == null) {
                                iterable3 = j0.f134944a;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it4 = iterable3.iterator();
                            while (it4.hasNext()) {
                                c80.u uVarB1 = b0((String) it4.next());
                                if (uVarB1 != null) {
                                    arrayList3.add(uVarB1);
                                }
                            }
                            bVar = new mk0.b(str3, h0.g1(arrayList3));
                        }
                    }
                    if (bVar != null) {
                        arrayList2.add(bVar);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    mk0.a aVar3 = (mk0.a) linkedHashMap.get(x0Var2);
                    List<mk0.b> list5 = aVar3 != null ? aVar3.f119098b : null;
                    if (list5 == null) {
                        list5 = j0.f134944a;
                    }
                    ArrayList arrayListC0 = h0.C0(list5, arrayList2);
                    List<mk0.d> list6 = aVar3 != null ? aVar3.f119099c : null;
                    if (list6 == null) {
                        list6 = j0.f134944a;
                    }
                    linkedHashMap.put(x0Var2, new mk0.a(x0Var2, arrayListC0, list6));
                }
            }
        }
        return h0.b1(linkedHashMap.values());
    }

    public static final lc.r M(e23.l lVar, String str) {
        str.getClass();
        lc.u uVar = new lc.u();
        lVar.invoke(uVar);
        return new lc.r(str, uVar.f111877a.a());
    }

    public static final int N(h23.c cVar, j23.l lVar) {
        cVar.getClass();
        if (lVar.isEmpty()) {
            com.google.firebase.messaging.l.j(lVar, "Cannot get random in empty range: ");
            return 0;
        }
        int i14 = lVar.f96797b;
        int i15 = lVar.f96796a;
        if (i14 < Integer.MAX_VALUE) {
            return cVar.d(i15, i14 + 1);
        }
        return i15 > Integer.MIN_VALUE ? cVar.d(i15 - 1, i14) + 1 : cVar.b();
    }

    public static final Object O(b0 b0Var, boolean z14, boolean z15, e23.l lVar) {
        b0Var.getClass();
        b0Var.assertNotMainThread();
        b0Var.assertNotSuspendingTransaction();
        t13.g gVar = b0Var.getSuspendingTransactionContext().get();
        if (gVar == null) {
            gVar = t13.h.f161748a;
        }
        return jd.x.a(new md.b(gVar, b0Var, z15, z14, lVar, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object P(b0 b0Var, e23.l lVar, v13.c cVar) throws Throwable {
        md.d dVar;
        b0 b0Var2;
        e23.l lVar2;
        if (cVar instanceof md.d) {
            dVar = (md.d) cVar;
            int i14 = dVar.f117817d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f117817d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new md.d(cVar);
            }
        } else {
            dVar = new md.d(cVar);
        }
        md.d dVar2 = dVar;
        Object objZ = dVar2.f117816c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar2.f117817d;
        if (i15 == 0) {
            o13.r.b(objZ);
            if (b0Var.inCompatibilityMode()) {
                md.e eVar = new md.e(b0Var, lVar, null);
                dVar2.f117817d = 1;
                Object objT = dh.b.T(b0Var, eVar, dVar2);
                if (objT != aVar) {
                    return objT;
                }
            } else if (b0Var.inCompatibilityMode() && b0Var.isOpenInternal$room_runtime() && b0Var.inTransaction()) {
                md.f fVar = new md.f(true, false, b0Var, null, lVar);
                dVar2.f117817d = 2;
                Object objUseConnection = b0Var.useConnection(false, fVar, dVar2);
                if (objUseConnection != aVar) {
                    return objUseConnection;
                }
            } else {
                dVar2.f117814a = b0Var;
                dVar2.f117815b = (v13.i) lVar;
                dVar2.f117817d = 3;
                objZ = z(b0Var, true, dVar2);
                if (objZ != aVar) {
                    b0Var2 = b0Var;
                    lVar2 = lVar;
                }
            }
        }
        if (i15 == 1) {
            o13.r.b(objZ);
            return objZ;
        }
        if (i15 == 2) {
            o13.r.b(objZ);
            return objZ;
        }
        if (i15 != 3) {
            if (i15 == 4) {
                o13.r.b(objZ);
                return objZ;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e23.l lVar3 = (e23.l) dVar2.f117815b;
        b0Var2 = dVar2.f117814a;
        o13.r.b(objZ);
        lVar2 = lVar3;
        md.c cVar2 = new md.c(null, b0Var2, lVar2);
        dVar2.f117814a = null;
        dVar2.f117815b = null;
        dVar2.f117817d = 4;
        Object objE0 = ge1.b.e0((t13.g) objZ, cVar2, dVar2);
        return objE0 == aVar ? aVar : objE0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object Q(b0 b0Var, boolean z14, boolean z15, e23.l lVar, t13.d dVar) throws Throwable {
        md.h hVar;
        b0 b0Var2;
        boolean z16;
        e23.l lVar2;
        if (dVar instanceof md.h) {
            hVar = (md.h) dVar;
            int i14 = hVar.f117851f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f117851f = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new md.h(dVar);
            }
        } else {
            hVar = new md.h(dVar);
        }
        md.h hVar2 = hVar;
        Object obj = hVar2.f117850e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar2.f117851f;
        if (i15 == 0) {
            o13.r.b(obj);
            if (b0Var.inCompatibilityMode() && b0Var.isOpenInternal$room_runtime() && b0Var.inTransaction()) {
                md.i iVar = new md.i(z15, z14, b0Var, null, lVar);
                hVar2.f117851f = 1;
                Object objUseConnection = b0Var.useConnection(z14, iVar, hVar2);
                if (objUseConnection != aVar) {
                    return objUseConnection;
                }
            } else {
                hVar2.f117846a = b0Var;
                hVar2.f117847b = lVar;
                hVar2.f117848c = z14;
                hVar2.f117849d = z15;
                hVar2.f117851f = 2;
                t13.g gVarZ = z(b0Var, z15, hVar2);
                if (gVarZ != aVar) {
                    b0Var2 = b0Var;
                    obj = gVarZ;
                    z16 = z15;
                    lVar2 = lVar;
                }
            }
        }
        if (i15 == 1) {
            o13.r.b(obj);
            return obj;
        }
        if (i15 != 2) {
            if (i15 == 3) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z17 = hVar2.f117849d;
        z14 = hVar2.f117848c;
        e23.l lVar3 = hVar2.f117847b;
        b0 b0Var3 = hVar2.f117846a;
        o13.r.b(obj);
        z16 = z17;
        lVar2 = lVar3;
        b0Var2 = b0Var3;
        md.g gVar = new md.g(null, b0Var2, z14, z16, lVar2);
        hVar2.f117846a = null;
        hVar2.f117847b = null;
        hVar2.f117851f = 3;
        Object objE0 = ge1.b.e0((t13.g) obj, gVar, hVar2);
        return objE0 == aVar ? aVar : objE0;
    }

    public static final Cursor R(b0 b0Var, l0 l0Var) {
        b0Var.getClass();
        return b0Var.query(l0Var, (CancellationSignal) null);
    }

    public static final int S(File file) throws IOException {
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i14 = byteBufferAllocate.getInt();
            channel.close();
            return i14;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(channel, th3);
                throw th4;
            }
        }
    }

    public static final String T(c3 c3Var, p3.m mVar, int i14) {
        String str;
        c3Var.getClass();
        x1 x1Var = p3.n.f135158a;
        if (c3Var instanceof c22.i) {
            mVar.C(-274064936);
            int i15 = ((c22.i) c3Var).f23085a;
            Parcelable.Creator<c22.i> creator = c22.i.CREATOR;
            String strQ = y.Q(mVar, i15);
            mVar.f();
            return strQ;
        }
        if (c3Var instanceof g2) {
            mVar.C(-274063080);
            String strW = W(((g2) c3Var).f23059a);
            mVar.f();
            return strW;
        }
        String strD = null;
        if (!(c3Var instanceof c22.j)) {
            if (!(c3Var instanceof h2)) {
                throw n23.j.m(mVar, -274066315);
            }
            mVar.C(-274059656);
            String str2 = ((h2) c3Var).f23081a;
            str2.getClass();
            c2.f23014a.getClass();
            c2 c2VarA = c2.a.a();
            strD = c2VarA != null ? c2VarA.d(str2) : null;
            str = strD != null ? strD : "";
            mVar.f();
            return str;
        }
        mVar.C(-274061384);
        String str3 = ((c22.j) c3Var).f23098a;
        str3.getClass();
        Parcelable.Creator<c22.j> creator2 = c22.j.CREATOR;
        Integer numD = c22.j.d((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b), str3);
        if (numD == null) {
            mVar.C(1158621791);
        } else {
            mVar.C(1158621792);
            strD = y.Q(mVar, numD.intValue());
        }
        mVar.f();
        str = strD != null ? strD : "";
        mVar.f();
        return str;
    }

    public static final String U(c3 c3Var, Object[] objArr, p3.m mVar) {
        String str;
        c3Var.getClass();
        x1 x1Var = p3.n.f135158a;
        if (c3Var instanceof c22.i) {
            mVar.C(511488376);
            int i14 = ((c22.i) c3Var).f23085a;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
            Parcelable.Creator<c22.i> creator = c22.i.CREATOR;
            String strP = y.P(i14, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length), mVar);
            mVar.f();
            return strP;
        }
        if (c3Var instanceof g2) {
            mVar.C(511490648);
            String strV = V(((g2) c3Var).f23059a, Arrays.copyOf(objArr, objArr.length));
            mVar.f();
            return strV;
        }
        String strB = null;
        if (!(c3Var instanceof c22.j)) {
            if (!(c3Var instanceof h2)) {
                throw n23.j.m(mVar, 511487036);
            }
            mVar.C(511494904);
            String str2 = ((h2) c3Var).f23081a;
            Object[] objArrCopyOf3 = Arrays.copyOf(objArr, objArr.length);
            str2.getClass();
            Object[] objArrCopyOf4 = Arrays.copyOf(objArrCopyOf3, objArrCopyOf3.length);
            Parcelable.Creator<h2> creator2 = h2.CREATOR;
            c2.f23014a.getClass();
            c2 c2VarA = c2.a.a();
            strB = c2VarA != null ? c2VarA.b(str2, Arrays.copyOf(objArrCopyOf4, objArrCopyOf4.length)) : null;
            str = strB != null ? strB : "";
            mVar.f();
            return str;
        }
        mVar.C(511492760);
        String str3 = ((c22.j) c3Var).f23098a;
        Object[] objArrCopyOf5 = Arrays.copyOf(objArr, objArr.length);
        str3.getClass();
        Object[] objArrCopyOf6 = Arrays.copyOf(objArrCopyOf5, objArrCopyOf5.length);
        Parcelable.Creator<c22.j> creator3 = c22.j.CREATOR;
        Integer numD = c22.j.d((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b), str3);
        if (numD == null) {
            mVar.C(-818557157);
        } else {
            mVar.C(-818557156);
            strB = y.P(numD.intValue(), Arrays.copyOf(objArrCopyOf6, objArrCopyOf6.length), mVar);
        }
        mVar.f();
        str = strB != null ? strB : "";
        mVar.f();
        return str;
    }

    public static final String V(String str, Object[] objArr) {
        String strC;
        str.getClass();
        x1 x1Var = p3.n.f135158a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Parcelable.Creator<g2> creator = g2.CREATOR;
        String str2 = "";
        try {
            c2.f23014a.getClass();
            c2 c2VarA = c2.a.a();
            if (c2VarA != null && (strC = c2VarA.c(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))) != null) {
                str2 = strC;
            }
        } catch (Exception e4) {
            int i14 = gt2.c.f79010a;
            gt2.b.f79005a.h("OnDemandStringHandle").error("stringResource with *formatArgs: OnDemandResources is not initialized yet", (Throwable) e4);
        }
        x1 x1Var2 = p3.n.f135158a;
        return str2;
    }

    public static final String W(String str) {
        String strA;
        str.getClass();
        x1 x1Var = p3.n.f135158a;
        Parcelable.Creator<g2> creator = g2.CREATOR;
        String str2 = "";
        try {
            c2.f23014a.getClass();
            c2 c2VarA = c2.a.a();
            if (c2VarA != null && (strA = c2VarA.a(str)) != null) {
                str2 = strA;
            }
        } catch (Exception e4) {
            int i14 = gt2.c.f79010a;
            gt2.b.f79005a.h("OnDemandStringHandle").error("stringResource: OnDemandResources is not initialized yet", (Throwable) e4);
        }
        x1 x1Var2 = p3.n.f135158a;
        return str2;
    }

    public static final long X(String str) {
        str.getClass();
        StringBuilder sb3 = new StringBuilder();
        int length = str.length();
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str.charAt(i14);
            if (!Character.isDigit(cCharAt)) {
                break;
            }
            sb3.append(cCharAt);
        }
        Long lJ = d53.t.j(sb3.toString());
        if (lJ != null) {
            return lJ.longValue();
        }
        return 0L;
    }

    public static final mt0.t Y(hi0.a aVar, boolean z14, boolean z15) {
        com.garmin.android.apps.connectmobile.userprofile.model.j jVarI;
        com.garmin.android.apps.connectmobile.userprofile.model.j jVarI2;
        String displayName;
        String str = null;
        Long lJ = aVar != null ? aVar.getUserId() : null;
        String strF = aVar != null ? aVar.getFullName() : null;
        if (lJ == null || strF == null) {
            return null;
        }
        long jLongValue = lJ.longValue();
        String str2 = (aVar == null || (displayName = aVar.getDisplayName()) == null) ? strF : displayName;
        boolean z16 = z15 ? z14 : false;
        boolean z17 = z15 ? false : z14;
        b12.b bVar = new b12.b((aVar == null || (jVarI2 = aVar.getProfileImageUrls()) == null) ? null : jVarI2.f46879h, null, null, null, null, 30, null);
        if (aVar != null && (jVarI = aVar.getProfileImageUrls()) != null) {
            str = jVarI.f46876e;
        }
        return new mt0.t(jLongValue, strF, str2, bVar, new b12.b(str, null, null, null, null, 30, null), z16, z17);
    }

    public static final ArrayList Z(List list) {
        list.getClass();
        return list instanceof ArrayList ? (ArrayList) list : new ArrayList(list);
    }

    public static final CancellationException a(String str, Throwable th3) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th3);
        return cancellationException;
    }

    public static ArrayList a0(ArrayList arrayList, Context context, DateTime dateTime, DateTime dateTime2, sl1.b bVar, int i14) {
        String strA;
        j00.e eVar = bVar;
        if ((i14 & 8) != 0) {
            eVar = new j00.e(context);
        }
        int i15 = (i14 & 16) != 0 ? 0 : 40;
        context.getClass();
        DateTime dateTimePlusMinutes = dateTime.plusMinutes(i15);
        DateTime dateTimeMinusMinutes = dateTime2.minusMinutes(i15);
        dateTimeMinusMinutes.getClass();
        j23.i iVarA = j23.s.a(dateTimePlusMinutes, dateTimeMinusMinutes);
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DateTime dateTime3 = (DateTime) it.next();
            if (p005kotlin.jvm.internal.s.g(dateTime3, dateTime)) {
                strA = eVar.a(dateTime3, j00.d.START);
            } else if (p005kotlin.jvm.internal.s.g(dateTime3, dateTime2)) {
                strA = eVar.a(dateTime3, j00.d.END);
            } else {
                strA = (dateTime3 != null && j23.g.a.a(iVarA, dateTime3) && dateTime3.getMinuteOfDay() % 60 == 0) ? eVar.a(dateTime3, j00.d.REQUIRED) : eVar.a(dateTime3, j00.d.NOT_REQUIRED);
            }
            arrayList2.add(strA);
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x015e  */
    /* JADX WARN: Code duplicated, block: B:99:0x016b  */
    public static final void b(String str, e23.a aVar, boolean z14, i53.c cVar, i53.c cVar2, e23.l lVar, e23.q qVar, p3.m mVar, int i14, int i15) {
        Object obj;
        int i16;
        Object obj2;
        boolean z15;
        int i17;
        boolean zR;
        int i18;
        int i19;
        boolean zR2;
        int i24;
        int i25;
        e23.l lVar2;
        int i26;
        boolean z16;
        i53.c cVar3;
        i53.c cVar4;
        boolean z17;
        e23.l lVar3;
        p2 p2VarI0;
        boolean z18;
        i53.c cVar5;
        i53.c cVar6;
        e23.l lVar4;
        Object objQ;
        int i27;
        str.getClass();
        aVar.getClass();
        qVar.getClass();
        o0 o0VarE = mVar.E(203768514);
        if ((i14 & 6) == 0) {
            obj = str;
            i16 = (o0VarE.B(obj) ? 4 : 2) | i14;
        } else {
            obj = str;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            obj2 = aVar;
            i16 |= o0VarE.r(obj2) ? 32 : 16;
        } else {
            obj2 = aVar;
        }
        int i28 = i15 & 4;
        if (i28 == 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                i16 |= 3072;
            } else if ((i14 & 3072) == 0) {
                if ((i14 & 4096) == 0) {
                    zR = o0VarE.B(cVar);
                } else {
                    zR = o0VarE.r(cVar);
                }
                if (zR) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            i19 = i15 & 16;
            if (i19 != 0) {
                i16 |= 24576;
            } else if ((i14 & 24576) == 0) {
                if ((32768 & i14) == 0) {
                    zR2 = o0VarE.B(cVar2);
                } else {
                    zR2 = o0VarE.r(cVar2);
                }
                if (zR2) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i16 |= i24;
            }
            i25 = i15 & 32;
            if (i25 != 0) {
                if ((196608 & i14) == 0) {
                    lVar2 = lVar;
                    if (o0VarE.r(lVar2)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i16 |= i26;
                }
                if ((1572864 & i14) == 0) {
                    if (o0VarE.r(qVar)) {
                        i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i27 = 524288;
                    }
                    i16 |= i27;
                }
                if ((599187 & i16) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i28 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i17 != 0) {
                        cVar5 = null;
                    } else {
                        cVar5 = cVar;
                    }
                    if (i19 != 0) {
                        cVar6 = null;
                    } else {
                        cVar6 = cVar2;
                    }
                    if (i25 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar2;
                    }
                    x1 x1Var = p3.n.f135158a;
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
                    }
                    fe feVar = (fe) objQ;
                    z02.d.a(z18, z3.f.c(1198710663, new ix.h(obj, obj2, cVar6, cVar5, lVar4, 19), o0VarE), z3.f.c(-1623978040, new ak0.o(feVar, 25), o0VarE), null, null, z3.f.c(-1502109557, new y0(12, qVar, feVar), o0VarE), o0VarE, ((i16 >> 6) & 14) | 197040, 24);
                    z17 = z18;
                    cVar4 = cVar6;
                    cVar3 = cVar5;
                    lVar3 = lVar4;
                } else {
                    o0VarE.e();
                    cVar3 = cVar;
                    cVar4 = cVar2;
                    z17 = z15;
                    lVar3 = lVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new da0.n(str, aVar, z17, cVar3, cVar4, lVar3, qVar, i14, i15);
                }
            }
            i16 |= 196608;
            lVar2 = lVar;
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(qVar)) {
                    i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i27 = 524288;
                }
                i16 |= i27;
            }
            if ((599187 & i16) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i28 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i17 != 0) {
                    cVar5 = null;
                } else {
                    cVar5 = cVar;
                }
                if (i19 != 0) {
                    cVar6 = null;
                } else {
                    cVar6 = cVar2;
                }
                if (i25 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar2;
                }
                x1 x1Var2 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
                }
                fe feVar2 = (fe) objQ;
                z02.d.a(z18, z3.f.c(1198710663, new ix.h(obj, obj2, cVar6, cVar5, lVar4, 19), o0VarE), z3.f.c(-1623978040, new ak0.o(feVar2, 25), o0VarE), null, null, z3.f.c(-1502109557, new y0(12, qVar, feVar2), o0VarE), o0VarE, ((i16 >> 6) & 14) | 197040, 24);
                z17 = z18;
                cVar4 = cVar6;
                cVar3 = cVar5;
                lVar3 = lVar4;
            } else {
                o0VarE.e();
                cVar3 = cVar;
                cVar4 = cVar2;
                z17 = z15;
                lVar3 = lVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(str, aVar, z17, cVar3, cVar4, lVar3, qVar, i14, i15);
            }
        }
        i16 |= 384;
        z15 = z14;
        i17 = i15 & 8;
        if (i17 != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            if ((i14 & 4096) == 0) {
                zR = o0VarE.B(cVar);
            } else {
                zR = o0VarE.r(cVar);
            }
            if (zR) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i16 |= i18;
        }
        i19 = i15 & 16;
        if (i19 != 0) {
            i16 |= 24576;
        } else if ((i14 & 24576) == 0) {
            if ((32768 & i14) == 0) {
                zR2 = o0VarE.B(cVar2);
            } else {
                zR2 = o0VarE.r(cVar2);
            }
            if (zR2) {
                i24 = 16384;
            } else {
                i24 = 8192;
            }
            i16 |= i24;
        }
        i25 = i15 & 32;
        if (i25 != 0) {
            if ((196608 & i14) == 0) {
                lVar2 = lVar;
                if (o0VarE.r(lVar2)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i16 |= i26;
            }
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(qVar)) {
                    i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i27 = 524288;
                }
                i16 |= i27;
            }
            if ((599187 & i16) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i28 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i17 != 0) {
                    cVar5 = null;
                } else {
                    cVar5 = cVar;
                }
                if (i19 != 0) {
                    cVar6 = null;
                } else {
                    cVar6 = cVar2;
                }
                if (i25 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar2;
                }
                x1 x1Var3 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
                }
                fe feVar3 = (fe) objQ;
                z02.d.a(z18, z3.f.c(1198710663, new ix.h(obj, obj2, cVar6, cVar5, lVar4, 19), o0VarE), z3.f.c(-1623978040, new ak0.o(feVar3, 25), o0VarE), null, null, z3.f.c(-1502109557, new y0(12, qVar, feVar3), o0VarE), o0VarE, ((i16 >> 6) & 14) | 197040, 24);
                z17 = z18;
                cVar4 = cVar6;
                cVar3 = cVar5;
                lVar3 = lVar4;
            } else {
                o0VarE.e();
                cVar3 = cVar;
                cVar4 = cVar2;
                z17 = z15;
                lVar3 = lVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(str, aVar, z17, cVar3, cVar4, lVar3, qVar, i14, i15);
            }
        }
        i16 |= 196608;
        lVar2 = lVar;
        if ((1572864 & i14) == 0) {
            if (o0VarE.r(qVar)) {
                i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i27 = 524288;
            }
            i16 |= i27;
        }
        if ((599187 & i16) != 599186) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i28 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            if (i17 != 0) {
                cVar5 = null;
            } else {
                cVar5 = cVar;
            }
            if (i19 != 0) {
                cVar6 = null;
            } else {
                cVar6 = cVar2;
            }
            if (i25 != 0) {
                lVar4 = null;
            } else {
                lVar4 = lVar2;
            }
            x1 x1Var4 = p3.n.f135158a;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar4 = (fe) objQ;
            z02.d.a(z18, z3.f.c(1198710663, new ix.h(obj, obj2, cVar6, cVar5, lVar4, 19), o0VarE), z3.f.c(-1623978040, new ak0.o(feVar4, 25), o0VarE), null, null, z3.f.c(-1502109557, new y0(12, qVar, feVar4), o0VarE), o0VarE, ((i16 >> 6) & 14) | 197040, 24);
            z17 = z18;
            cVar4 = cVar6;
            cVar3 = cVar5;
            lVar3 = lVar4;
        } else {
            o0VarE.e();
            cVar3 = cVar;
            cVar4 = cVar2;
            z17 = z15;
            lVar3 = lVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.n(str, aVar, z17, cVar3, cVar4, lVar3, qVar, i14, i15);
        }
    }

    public static final c80.u b0(String str) {
        Object obj = null;
        if (str == null) {
            return null;
        }
        w13.c cVar = c80.u.f25612w;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            Object next = bVarN.next();
            if (d53.u.q(((c80.u) next).toString(), str, true)) {
                obj = next;
                break;
            }
        }
        return (c80.u) obj;
    }

    public static final void c(lc.v vVar, d4.c cVar, z3.e eVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(233973821);
        if ((((o0VarE.r(vVar) ? 4 : 2) | i14 | (o0VarE.r(cVar) ? 32 : 16)) & 147) == 146 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = p3.n.f135158a;
            v9.a.f176280a.getClass();
            p3.v.b(new n2[]{v9.a.f176281b.c(vVar), s9.j.f158018a.c(vVar), od.a.f131173a.c(vVar)}, z3.f.c(1808964477, new nc.m(cVar, eVar), o0VarE), o0VarE, 56);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw1.b(vVar, cVar, eVar, i14, 7);
        }
    }

    public static final long c0(String str) {
        str.getClass();
        List listW = d53.w.W(str, new String[]{"."});
        if (listW.size() < 2) {
            vb.h.z(am.j.m("app version ", str, " is not in the format 'major.minor' or 'major.minor.bugfix'"));
            return 0L;
        }
        Long lJ = d53.t.j((String) listW.get(0));
        if (lJ == null) {
            vb.h.z(am.j.m("app version ", str, " 'major' contains non-numeric characters"));
            return 0L;
        }
        long jLongValue = lJ.longValue();
        return (X((String) listW.get(1)) * 1000) + (jLongValue * 1000000) + (listW.size() > 2 ? X((String) listW.get(2)) : 0L);
    }

    public static final void d(String str, zc.d dVar, zc.d dVar2, li0.f fVar, u2.h hVar, p003ji0.a aVar, i0 i0Var, i0 i0Var2, e23.a aVar2, p3.m mVar, int i14) {
        int i15;
        dVar2.getClass();
        fVar.getClass();
        hVar.getClass();
        aVar.getClass();
        i0Var.getClass();
        i0Var2.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(1949138508);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(dVar2) : o0VarE.r(dVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(hVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.B(i0Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.B(i0Var2) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            ii0.f.f93596a.getClass();
            g0.a(str, dVar, dVar2, fVar, hVar, aVar, i0Var, i0Var2, aVar2, ii0.f.f93597b, o0VarE, (i15 & 14) | 805306432 | (i15 & 112) | 512 | (i15 & 896) | (li0.f.f112658h << 9) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (i15 & 234881024));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d0(str, dVar, dVar2, fVar, hVar, aVar, i0Var, i0Var2, aVar2, i14, 1);
        }
    }

    public static final String d0(float f14) {
        if (Float.isNaN(f14)) {
            return "NaN";
        }
        if (Float.isInfinite(f14)) {
            return f14 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f15 = f14 * fPow;
        int i14 = (int) f15;
        if (f15 - i14 >= 0.5f) {
            i14++;
        }
        float f16 = i14 / fPow;
        return iMax > 0 ? String.valueOf(f16) : String.valueOf((int) f16);
    }

    public static final h23.d e(long j8) {
        return new h23.d((int) j8, (int) (j8 >> 32));
    }

    public static final qt1.k e0(lc.v vVar, p3.m mVar) {
        vVar.getClass();
        x1 x1Var = p3.n.f135158a;
        mVar.L(-1614864554);
        u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(qt1.k.class), vVar.getF189591b(), null, CreationExtrasExtKt.defaultExtras(vVar), null, KoinApplicationKt.currentKoinScope(mVar, 0), null);
        mVar.R();
        return (qt1.k) u1VarResolveViewModel;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0  */
    public static final void f(Long l14, String str, kl1.a aVar, ws.a aVar2, l80.b bVar, e23.l lVar, p3.m mVar, int i14) {
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1226667003);
        int i15 = 4;
        int i16 = i14 | (o0VarE.B(l14) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.B(aVar2) ? 2048 : 1024) | (o0VarE.r(bVar) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        int i17 = 1;
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            c.p.f22335a.getClass();
            b.w wVarA = c.p.a(o0VarE);
            b.u onBackPressedDispatcher = wVarA != null ? wVarA.getOnBackPressedDispatcher() : null;
            m0 m0VarI = y.I(new v0[0], o0VarE);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = o0VarE.r(m0VarI) | o0VarE.r(onBackPressedDispatcher);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new ad0.c(m0VarI, onBackPressedDispatcher, i17);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ad0.c(m0VarI, onBackPressedDispatcher, i17);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar4 = (e23.a) objQ;
            g.h hVar = new g.h();
            i17 = (i16 & 458752) != 131072 ? 0 : 1;
            Object objQ2 = o0VarE.q();
            if (i17 == 0) {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new fb0.d(lVar, i15);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new fb0.d(lVar, i15);
                o0VarE.K(objQ2);
            }
            z02.b.a(false, null, null, null, false, z3.f.c(-1123145285, new a11.j(context, onBackPressedDispatcher, c.w.c(hVar, (e23.l) objQ2, o0VarE, 0), aVar4, l14, str, aVar, bVar, m0VarI, aVar2), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.c((Object) l14, (Object) str, (Object) aVar, (Object) aVar2, (Object) bVar, lVar, i14, 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    public static final qt1.k f0(m0 m0Var, p3.m mVar) {
        lc.v vVarH;
        m0Var.getClass();
        qc.h hVar = m0Var.f111904b;
        x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(m0Var);
        Object objQ = mVar.q();
        p3.m.a aVar = p3.m.f135153a;
        if (zB) {
            objQ = hVar.i();
            mVar.K(objQ);
        } else {
            aVar.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = hVar.i();
                mVar.K(objQ);
            }
        }
        boolean zB2 = mVar.B((lc.v) objQ);
        Object objQ2 = mVar.q();
        if (zB2) {
            vVarH = hVar.h(ot1.u.f133824a.d());
            objQ2 = vVarH;
            mVar.K(objQ2);
        } else {
            aVar.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                try {
                    vVarH = hVar.h(ot1.u.f133824a.d());
                } catch (IllegalArgumentException unused) {
                    vVarH = hVar.h(ot1.y.f133845a.d());
                }
                objQ2 = vVarH;
                mVar.K(objQ2);
            }
        }
        lc.v vVar = (lc.v) objQ2;
        mVar.L(-1614864554);
        u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(qt1.k.class), vVar.getF189591b(), null, CreationExtrasExtKt.defaultExtras(vVar), null, KoinApplicationKt.currentKoinScope(mVar, 0), null);
        mVar.R();
        qt1.k kVar = (qt1.k) u1VarResolveViewModel;
        x1 x1Var2 = p3.n.f135158a;
        return kVar;
    }

    public static final void g(d4.c cVar, e23.p pVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(832919318);
        int i15 = (o0VarE.r(cVar) ? 4 : 2) | i14 | (o0VarE.r(pVar) ? 32 : 16);
        if ((i15 & 19) == 18 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new n63.w(7);
                o0VarE.K(objQ);
            }
            e23.l lVar = (e23.l) objQ;
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            t0 t0Var = s0.f105811a;
            k23.d dVarB = t0Var.b(nc.a.class);
            u9.b bVar = new u9.b();
            bVar.a(t0Var.b(nc.a.class), lVar);
            nc.a aVar = (nc.a) v9.b.a(dVarB, viewModelStoreOwnerA, null, bVar.b(), viewModelStoreOwnerA instanceof androidx.lifecycle.y ? ((androidx.lifecycle.y) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, o0VarE);
            aVar.f125258b = new oc.c<>(cVar);
            cVar.d(aVar.f125257a, pVar, o0VarE, ((i15 << 6) & 896) | (i15 & 112));
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw0.i(cVar, pVar, i14, 5);
        }
    }

    public static final qt1.a g0(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        Object objA = mVar.A(c.n.f22332a);
        b.g gVar = objA instanceof b.g ? (b.g) objA : null;
        if (gVar == null) {
            vb.h.z("No ComponentActivity found!");
            return null;
        }
        mVar.L(-1614864554);
        u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(qt1.a.class), gVar.getF189591b(), null, CreationExtrasExtKt.defaultExtras(gVar), null, KoinApplicationKt.currentKoinScope(mVar, 0), null);
        mVar.R();
        return (qt1.a) u1VarResolveViewModel;
    }

    public static String h(String str) {
        try {
            System.clearProperty(str);
        } catch (Throwable unused) {
        }
        if (!oi0.c.g("")) {
            return "";
        }
        String strO = am.j.o(File.separator, str, new StringBuilder(".SystemConfig"));
        try {
            if (y.g()) {
                File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), strO);
                if (file.exists()) {
                    file.delete();
                    return "";
                }
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    public static final void h0(h5.j jVar, Object obj, e23.l lVar) {
        a1 a1Var;
        boolean z14;
        if (!jVar.getNode().getIsAttached()) {
            e5.a.b("visitAncestors called on an unattached node");
        }
        h4.r.c parent = jVar.getNode().getParent();
        h5.e0 e0VarG = h5.k.g(jVar);
        while (e0VarG != null) {
            if ((e0VarG.P.f81685f.getAggregateChildKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                        h4.r.c cVarB = parent;
                        q3.c cVar = null;
                        while (cVarB != null) {
                            if (cVarB instanceof e2) {
                                e2 e2Var = (e2) cVarB;
                                if (!(p005kotlin.jvm.internal.s.g(obj, e2Var.X()) ? ((Boolean) lVar.invoke(e2Var)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z14 = false;
                                }
                            } else {
                                z14 = true;
                            }
                            if (z14) {
                                if (((cVarB.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) && (cVarB instanceof h5.m)) {
                                    int i14 = 0;
                                    for (h4.r.c child = ((h5.m) cVarB).f81888b; child != null; child = child.getChild()) {
                                        if ((child.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                cVarB = child;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (cVarB != null) {
                                                    cVar.b(cVarB);
                                                    cVarB = null;
                                                }
                                                cVar.b(child);
                                            }
                                        }
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                            }
                            cVarB = h5.k.b(cVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            e0VarG = e0VarG.K();
            parent = (e0VarG == null || (a1Var = e0VarG.P) == null) ? null : a1Var.f81684e;
        }
    }

    public static final DateTime i(ActivityListItemDTO activityListItemDTO) {
        DateTime dateTimeQ = g22.k.q(activityListItemDTO != null ? activityListItemDTO.f29262f : null, "yyyy-MM-dd HH:mm:ss", DateTimeZone.UTC);
        if (dateTimeQ != null) {
            return dateTimeQ.plusSeconds(activityListItemDTO != null ? (int) activityListItemDTO.f29275k : 0);
        }
        return null;
    }

    public static final void i0(e2 e2Var, e23.l lVar) {
        a1 a1Var;
        boolean z14;
        if (!e2Var.getNode().getIsAttached()) {
            e5.a.b("visitAncestors called on an unattached node");
        }
        h4.r.c parent = e2Var.getNode().getParent();
        h5.e0 e0VarG = h5.k.g(e2Var);
        while (e0VarG != null) {
            if ((e0VarG.P.f81685f.getAggregateChildKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                        h4.r.c cVarB = parent;
                        q3.c cVar = null;
                        while (cVarB != null) {
                            if (cVarB instanceof e2) {
                                e2 e2Var2 = (e2) cVarB;
                                if (!((p005kotlin.jvm.internal.s.g(e2Var.X(), e2Var2.X()) && e2Var.getClass() == e2Var2.getClass()) ? ((Boolean) lVar.invoke(e2Var2)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z14 = false;
                                }
                            } else {
                                z14 = true;
                            }
                            if (z14) {
                                if (((cVarB.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) && (cVarB instanceof h5.m)) {
                                    int i14 = 0;
                                    for (h4.r.c child = ((h5.m) cVarB).f81888b; child != null; child = child.getChild()) {
                                        if ((child.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                cVarB = child;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (cVarB != null) {
                                                    cVar.b(cVarB);
                                                    cVarB = null;
                                                }
                                                cVar.b(child);
                                            }
                                        }
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                            }
                            cVarB = h5.k.b(cVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            e0VarG = e0VarG.K();
            parent = (e0VarG == null || (a1Var = e0VarG.P) == null) ? null : a1Var.f81684e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    public static final void j(boolean z14, com.garmin.android.apps.connectmobile.courses.model.e eVar, e23.l lVar, e23.l lVar2) {
        ?? arrayList;
        Iterator it;
        Double d14;
        if (eVar == null) {
            return;
        }
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ = eVar.j();
        s20.o oVar = s20.o.f156028a;
        if (listJ != null) {
            arrayList = new ArrayList();
            for (Object obj : listJ) {
                com.garmin.android.apps.connectmobile.courses.model.g gVar = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                if (p005kotlin.jvm.internal.s.g(gVar.getCoursePointType(), com.garmin.android.apps.connectmobile.courses.model.f.MARKER_MILE.f32922a) || p005kotlin.jvm.internal.s.g(gVar.getCoursePointType(), com.garmin.android.apps.connectmobile.courses.model.f.MARKER_KILOMETER.f32922a) || p005kotlin.jvm.internal.s.g(gVar.getCoursePointType(), com.garmin.android.apps.connectmobile.courses.model.f.MARKER_HALF_MARATHON.f32922a)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = j0.f134944a;
        }
        lVar2.invoke(arrayList);
        if (z14) {
            List<GeoPointDTO> list = eVar.geoPoints;
            s20.o oVar2 = s20.o.f156028a;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (list != null && !list.isEmpty()) {
                GeoPointDTO geoPointDTO = (GeoPointDTO) h0.m0(list);
                double dDoubleValue = (geoPointDTO == null || (d14 = geoPointDTO.distance) == null) ? 0.0d : d14.doubleValue();
                Iterator it3 = list.iterator();
                int i14 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    GeoPointDTO geoPointDTO2 = (GeoPointDTO) next;
                    Double d15 = geoPointDTO2.distance;
                    double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
                    if (dDoubleValue2 < 0.996d * dDoubleValue) {
                        com.garmin.android.apps.connectmobile.courses.model.f fVar = com.garmin.android.apps.connectmobile.courses.model.f.MARKER_KILOMETER;
                        Iterator it4 = it3;
                        if (dDoubleValue2 >= fVar.f32927f * ((double) (arrayList2.size() + 1))) {
                            GeoPointDTO geoPointDTO3 = list.get(i14 - 1);
                            it = it4;
                            double size = fVar.f32927f * ((double) (arrayList2.size() + 1));
                            Double d16 = geoPointDTO3.distance;
                            double dDoubleValue3 = size - (d16 != null ? d16.doubleValue() : 0.0d);
                            s20.o.f156028a.getClass();
                            com.garmin.android.apps.connectmobile.courses.model.g gVarA = s20.o.a(geoPointDTO3, geoPointDTO2, dDoubleValue3, fVar);
                            Double d17 = geoPointDTO3.distance;
                            gVarA.o(Double.valueOf((d17 != null ? d17.doubleValue() : 0.0d) + dDoubleValue3));
                            arrayList2.add(gVarA);
                        } else {
                            it = it4;
                        }
                        com.garmin.android.apps.connectmobile.courses.model.f fVar2 = com.garmin.android.apps.connectmobile.courses.model.f.MARKER_MILE;
                        if (dDoubleValue2 >= fVar2.f32927f * ((double) (arrayList3.size() + 1))) {
                            GeoPointDTO geoPointDTO4 = list.get(i14 - 1);
                            double size2 = fVar2.f32927f * ((double) (arrayList3.size() + 1));
                            Double d18 = geoPointDTO4.distance;
                            double dDoubleValue4 = size2 - (d18 != null ? d18.doubleValue() : 0.0d);
                            s20.o.f156028a.getClass();
                            com.garmin.android.apps.connectmobile.courses.model.g gVarA2 = s20.o.a(geoPointDTO4, geoPointDTO2, dDoubleValue4, fVar2);
                            Double d19 = geoPointDTO4.distance;
                            gVarA2.o(Double.valueOf((d19 != null ? d19.doubleValue() : 0.0d) + dDoubleValue4));
                            arrayList3.add(gVarA2);
                        }
                        com.garmin.android.apps.connectmobile.courses.model.f fVar3 = com.garmin.android.apps.connectmobile.courses.model.f.MARKER_HALF_MARATHON;
                        if (dDoubleValue2 >= fVar3.f32927f * ((double) (arrayList4.size() + 1))) {
                            GeoPointDTO geoPointDTO5 = list.get(i14 - 1);
                            double size3 = fVar3.f32927f * ((double) (arrayList4.size() + 1));
                            Double d24 = geoPointDTO5.distance;
                            double dDoubleValue5 = size3 - (d24 != null ? d24.doubleValue() : 0.0d);
                            s20.o.f156028a.getClass();
                            com.garmin.android.apps.connectmobile.courses.model.g gVarA3 = s20.o.a(geoPointDTO5, geoPointDTO2, dDoubleValue5, fVar3);
                            Double d25 = geoPointDTO5.distance;
                            gVarA3.o(Double.valueOf((d25 != null ? d25.doubleValue() : 0.0d) + dDoubleValue5));
                            arrayList4.add(gVarA3);
                        }
                    } else {
                        dDoubleValue = dDoubleValue;
                        it = it3;
                    }
                    it3 = it;
                    i14 = i15;
                    dDoubleValue = dDoubleValue;
                }
            }
            o13.u uVar = new o13.u(arrayList2, arrayList3, arrayList4);
            List list2 = (List) uVar.f128605a;
            List list3 = (List) uVar.f128606b;
            List list4 = (List) uVar.f128607c;
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(s20.o.b(list4, 13.1d, false));
            arrayList5.addAll(s20.o.b(list2, 1.0d, true));
            arrayList5.addAll(s20.o.b(list3, 1.0d, true));
            lVar.invoke(arrayList5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final void j0(h4.r.c cVar, String str, e23.l lVar) {
        if (!cVar.getNode().getIsAttached()) {
            e5.a.b("visitSubtreeIf called on an unattached node");
        }
        q3.c cVar2 = new q3.c(new h4.r.c[16], 0);
        h4.r.c child = cVar.getNode().getChild();
        if (child == null) {
            h5.k.a(cVar2, cVar.getNode());
        } else {
            cVar2.b(child);
        }
        while (true) {
            int i14 = cVar2.f142358c;
            if (i14 == 0) {
                return;
            }
            h4.r.c cVar3 = (h4.r.c) cVar2.k(i14 - 1);
            if ((cVar3.getAggregateChildKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                h4.r.c child2 = cVar3;
                while (true) {
                    if (child2 != null && child2.getIsAttached()) {
                        if ((child2.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                            ?? B = child2;
                            ?? cVar4 = 0;
                            while (B != 0) {
                                if (B instanceof e2) {
                                    e2 e2Var = (e2) B;
                                    d2 d2Var = str.equals(e2Var.X()) ? (d2) lVar.invoke(e2Var) : d2.ContinueTraversal;
                                    if (d2Var != d2.CancelTraversal) {
                                        if (d2Var == d2.SkipSubtreeAndContinueTraversal) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((B.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 && (B instanceof h5.m)) {
                                    h4.r.c child3 = ((h5.m) B).f81888b;
                                    int i15 = 0;
                                    B = B;
                                    cVar4 = cVar4;
                                    while (child3 != null) {
                                        if ((child3.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                                            i15++;
                                            if (i15 == 1) {
                                                cVar4 = cVar4;
                                                B = child3;
                                            } else {
                                                if (cVar4 == 0) {
                                                    cVar4 = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (B != 0) {
                                                    cVar4.b(B);
                                                    B = 0;
                                                }
                                                cVar4.b(child3);
                                            }
                                        }
                                        child3 = child3.getChild();
                                        B = B;
                                        cVar4 = cVar4;
                                    }
                                    if (i15 == 1) {
                                    }
                                }
                                B = h5.k.b(cVar4);
                            }
                        }
                        child2 = child2.getChild();
                    }
                }
            }
            h5.k.a(cVar2, cVar3);
        }
    }

    public static final String k(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void k0(e2 e2Var, e23.l lVar) {
        if (!e2Var.getNode().getIsAttached()) {
            e5.a.b("visitSubtreeIf called on an unattached node");
        }
        q3.c cVar = new q3.c(new h4.r.c[16], 0);
        h4.r.c child = e2Var.getNode().getChild();
        if (child == null) {
            h5.k.a(cVar, e2Var.getNode());
        } else {
            cVar.b(child);
        }
        while (true) {
            int i14 = cVar.f142358c;
            if (i14 == 0) {
                return;
            }
            h4.r.c cVar2 = (h4.r.c) cVar.k(i14 - 1);
            if ((cVar2.getAggregateChildKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                h4.r.c child2 = cVar2;
                while (true) {
                    if (child2 != null && child2.getIsAttached()) {
                        if ((child2.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                            ?? B = child2;
                            ?? cVar3 = 0;
                            while (B != 0) {
                                if (B instanceof e2) {
                                    e2 e2Var2 = (e2) B;
                                    d2 d2Var = (p005kotlin.jvm.internal.s.g(e2Var.X(), e2Var2.X()) && e2Var.getClass() == e2Var2.getClass()) ? (d2) lVar.invoke(e2Var2) : d2.ContinueTraversal;
                                    if (d2Var != d2.CancelTraversal) {
                                        if (d2Var == d2.SkipSubtreeAndContinueTraversal) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((B.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 && (B instanceof h5.m)) {
                                    h4.r.c child3 = ((h5.m) B).f81888b;
                                    int i15 = 0;
                                    B = B;
                                    cVar3 = cVar3;
                                    while (child3 != null) {
                                        if ((child3.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                                            i15++;
                                            if (i15 == 1) {
                                                cVar3 = cVar3;
                                                B = child3;
                                            } else {
                                                if (cVar3 == 0) {
                                                    cVar3 = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (B != 0) {
                                                    cVar3.b(B);
                                                    B = 0;
                                                }
                                                cVar3.b(child3);
                                            }
                                        }
                                        child3 = child3.getChild();
                                        B = B;
                                        cVar3 = cVar3;
                                    }
                                    if (i15 == 1) {
                                    }
                                }
                                B = h5.k.b(cVar3);
                            }
                        }
                        child2 = child2.getChild();
                    }
                }
            }
            h5.k.a(cVar, cVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final i53.c l(boolean z14, p3.m mVar, int i14) {
        if ((i14 & 1) != 0) {
            z14 = false;
        }
        x1 x1Var = p3.n.f135158a;
        Object[] objArr = 0 == true ? 1 : 0;
        ArrayList arrayListM = p13.x.m(new i3("menu_item_help", y.Q(mVar, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null), new i3("menu_item_privacy", y.Q(mVar, R.string.gdpr_livetrack_data_privacy), false, (u4.d) objArr, (String) null, 28, (p005kotlin.jvm.internal.j) null));
        if (z14) {
            mVar.C(638563405);
            arrayListM.add(new i3("menu_item_strava_beacon_privacy", y.Q(mVar, R.string.gdpr_livetrack_strava_beacon_data_privacy), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
            mVar.f();
        } else {
            mVar.C(638772903);
            mVar.f();
        }
        return i53.a.e(arrayListM);
    }

    public static final void l0(com.garmin.android.apps.connectmobile.repcounting.model.c cVar, List list) {
        if (list == null || cVar == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.garmin.android.apps.connectmobile.workouts.data.model.b bVar = (com.garmin.android.apps.connectmobile.workouts.data.model.b) it.next();
            bVar.r(cVar.G(bVar.getBenchmarkCategoryKey(), bVar.getBenchmarkKey()));
        }
    }

    public static final i53.f m(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        return i53.a.a(new i3("menu_item_help", y.Q(mVar, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
    }

    public static final Double n(Double d14, Integer num) {
        if (num == null || d14 == null || num.intValue() < 0) {
            return null;
        }
        double dIntValue = 0.0d;
        if (d14.doubleValue() < 0.0d) {
            return null;
        }
        if (num.intValue() > 0 && num.intValue() < 37.0d && d14.doubleValue() > 0.0d) {
            dIntValue = (36.0d / (37.0d - ((double) num.intValue()))) * d14.doubleValue();
        }
        return Double.valueOf(dIntValue);
    }

    public static final int o(double d14, int i14) {
        return (int) MathKt.d((((double) i14) * d14) / ((double) 100));
    }

    public static final int p(double d14, int i14) {
        if (i14 > 0) {
            return (int) MathKt.d((((double) 100) * d14) / ((double) i14));
        }
        return 1;
    }

    public static final LineDataSet q(List list, String str, boolean z14, Integer num) {
        LineDataSet lineDataSet = new LineDataSet(list, str);
        lineDataSet.setColor(num.intValue());
        lineDataSet.setCircleRadius(4.0f);
        lineDataSet.setDrawCircles(z14);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawValues(false);
        lineDataSet.setLineWidth(2.0f);
        return lineDataSet;
    }

    public static LineDataSet r(List list, String str, boolean z14, Integer num) {
        list.getClass();
        str.getClass();
        LineDataSet lineDataSetQ = q(list, str, z14, num);
        lineDataSetQ.setCircleColor(num.intValue());
        return lineDataSetQ;
    }

    public static final void s(ud.a aVar) {
        aVar.getClass();
        q13.b bVarB = p13.w.b();
        ud.c cVarM0 = aVar.M0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cVarM0.J0()) {
            try {
                bVarB.add(cVarM0.M1(0));
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    zf.b.h(cVarM0, th3);
                    throw th4;
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        zf.b.h(cVarM0, null);
        ListIterator listIterator = p13.w.a(bVarB).listIterator(0);
        while (true) {
            q13.b.c cVar = (q13.b.c) listIterator;
            if (!cVar.hasNext()) {
                return;
            }
            String str = (String) cVar.next();
            if (d53.u.y(str, "room_fts_content_sync_", false)) {
                oe2.f.o(aVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static final com.garmin.android.apps.connectmobile.workouts.data.model.b t(List list, com.garmin.android.apps.connectmobile.repcounting.model.d dVar) {
        String str = dVar.f41102a;
        String str2 = !dVar.f41105d ? dVar.f41106e : dVar.f41104c;
        Object obj = null;
        if (!g22.n.d(str) || !g22.n.d(str2)) {
            return null;
        }
        loop0: for (Object obj2 : list) {
            com.garmin.android.apps.connectmobile.workouts.data.model.b bVar = (com.garmin.android.apps.connectmobile.workouts.data.model.b) obj2;
            if (!p005kotlin.jvm.internal.s.g(bVar.getBenchmarkKey(), str2)) {
                List<com.garmin.android.apps.connectmobile.workouts.data.model.l> listJ = bVar.j();
                if (listJ != null && !listJ.isEmpty()) {
                    Iterator<T> it = listJ.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            com.garmin.android.apps.connectmobile.workouts.data.model.l lVar = (com.garmin.android.apps.connectmobile.workouts.data.model.l) it.next();
                            if (!p005kotlin.jvm.internal.s.g(lVar.getCategoryKey(), str) || !p005kotlin.jvm.internal.s.g(lVar.getExerciseKey(), str2)) {
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            obj = obj2;
        }
        return (com.garmin.android.apps.connectmobile.workouts.data.model.b) obj;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    public static final e2 u(e2 e2Var) {
        a1 a1Var;
        boolean z14 = h4.i.f81563e;
        if (!e2Var.getNode().getIsAttached()) {
            e5.a.b("visitAncestors called on an unattached node");
        }
        h4.r.c parent = e2Var.getNode().getParent();
        h5.e0 e0VarG = h5.k.g(e2Var);
        while (e0VarG != null) {
            if ((e0VarG.P.f81685f.getAggregateChildKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                        h4.r.c cVarB = parent;
                        q3.c cVar = null;
                        while (cVarB != null) {
                            if (cVarB instanceof e2) {
                                e2 e2Var2 = (e2) cVarB;
                                if (p005kotlin.jvm.internal.s.g(e2Var.X(), e2Var2.X()) && e2Var.getClass() == e2Var2.getClass()) {
                                    return e2Var2;
                                }
                                if (z14) {
                                    if ((cVarB.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 0 && (cVarB instanceof h5.m)) {
                                        int i14 = 0;
                                        for (h4.r.c child = ((h5.m) cVarB).f81888b; child != null; child = child.getChild()) {
                                            if ((child.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                                                i14++;
                                                if (i14 == 1) {
                                                    cVarB = child;
                                                } else {
                                                    if (cVar == null) {
                                                        cVar = new q3.c(new h4.r.c[16], 0);
                                                    }
                                                    if (cVarB != null) {
                                                        cVar.b(cVarB);
                                                        cVarB = null;
                                                    }
                                                    cVar.b(child);
                                                }
                                            }
                                        }
                                        if (i14 == 1) {
                                        }
                                    }
                                }
                                cVarB = h5.k.b(cVar);
                            } else {
                                if ((cVarB.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 0) {
                                }
                                cVarB = h5.k.b(cVar);
                            }
                        }
                    }
                    parent = parent.getParent();
                }
            }
            e0VarG = e0VarG.K();
            parent = (e0VarG == null || (a1Var = e0VarG.P) == null) ? null : a1Var.f81684e;
        }
        return null;
    }

    public static final i63.b v(m63.b bVar, l63.c cVar, String str) {
        bVar.getClass();
        i63.b bVarA = bVar.a(cVar, str);
        if (bVarA != null) {
            return bVarA;
        }
        k1.i(str, bVar.c());
        throw null;
    }

    public static final i63.i w(m63.b bVar, l63.f fVar, Object obj) {
        bVar.getClass();
        obj.getClass();
        i63.i iVarB = bVar.b(fVar, obj);
        if (iVarB != null) {
            return iVarB;
        }
        k23.d dVarB = s0.f105811a.b(obj.getClass());
        k23.d dVarC = bVar.c();
        dVarC.getClass();
        String strD = dVarB.D();
        if (strD == null) {
            strD = String.valueOf(dVarB);
        }
        k1.i(strD, dVarC);
        throw null;
    }

    public static final String x(Context context, double d14, double d15, m52.h hVar, int i14) {
        context.getClass();
        if (hVar != m52.h.PERCENT) {
            return e5.g(context.getString(R.string.string_line_string_pattern_no_space, String.valueOf((int) d14), String.valueOf((int) d15)), StringUtils.SPACE, context.getString(R.string.lbl_watts));
        }
        StringBuilder sbL = e5.l(context.getString(R.string.lbl_value_percent, context.getString(R.string.string_line_string_pattern_no_space, String.valueOf((int) d14), String.valueOf((int) d15))), StringUtils.SPACE, context.getString(R.string.lbl_functional_threshold_power_short), " (", x(context, o(d14, i14), o(d15, i14), null, i14));
        sbL.append(")");
        return sbL.toString();
    }

    public static final i53.f y(List list, boolean z14) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((s92.b) obj).f() == z14) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String strB = ((s92.b) it.next()).getCopy();
                if (strB != null) {
                    arrayList2.add(strB);
                }
            }
            i53.f fVarJ = i53.a.j(arrayList2);
            if (fVarJ != null) {
                return fVarJ;
            }
        }
        return j53.l.b();
    }

    public static final t13.g z(b0 b0Var, boolean z14, v13.c cVar) {
        r0 r0Var = (r0) cVar.getF157466b().get(r0.f10943b);
        t13.g gVar = r0Var != null ? r0Var.f10944a : null;
        if (b0Var.inCompatibilityMode()) {
            if (gVar != null) {
                return b0Var.getQueryContext().plus(gVar);
            }
            return z14 ? b0Var.getTransactionContext$room_runtime() : b0Var.getQueryContext();
        }
        t13.g queryContext = b0Var.getQueryContext();
        if (gVar == null) {
            gVar = t13.h.f161748a;
        }
        return queryContext.plus(gVar);
    }
}
