package w5;

import am.z0;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import c22.x0;
import com.garmin.device.datatypes.DeviceProfile;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o53.c2;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.koin.java.KoinJavaComponent;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final void a(String str, String str2, String str3, String str4, String str5, p3.m mVar, int i14) {
        kg.f.p(str2, str3, str4, str5);
        p3.o0 o0VarE = mVar.E(-1273989839);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | (o0VarE.B(str4) ? 2048 : 1024) | (o0VarE.B(str5) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            m92.y.a(str, z3.f.c(-887315968, new a51.h(str2, str4, str3, str5, 5, (byte) 0), o0VarE), o0VarE, (i15 & 14) | 384);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xy.c(str, i14, str2, str3, str4, str5);
        }
    }

    public static final w b(p... pVarArr) {
        List listAsList = Arrays.asList(pVarArr);
        listAsList.getClass();
        return new w(listAsList);
    }

    public static final w63.a0 c(w63.f0 f0Var) {
        f0Var.getClass();
        return new w63.a0(f0Var);
    }

    public static final w63.b0 d(w63.g0 g0Var) {
        g0Var.getClass();
        return new w63.b0(g0Var);
    }

    public static final void e(Fragment fragment, e23.a aVar, e23.a aVar2) {
        fragment.getClass();
        androidx.lifecycle.n0 viewLifecycleOwner = fragment.getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ge1.b.T(o53.f0.w(viewLifecycleOwner), null, null, new wj0.a(aVar2, aVar, fragment, null), 3);
    }

    public static final String f(String str) {
        if (str != null && str.length() == 4) {
            return str;
        }
        List listX = str != null ? d53.w.X(str, new char[]{'-'}) : null;
        if (listX != null && listX.size() == 3) {
            String str2 = (String) listX.get(1);
            if (str2.length() > 1 && Character.isLetter(d53.y.p0(str2))) {
                return d53.y.n0(1, str2);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030 A[RETURN] */
    public static final z23.g g(Annotation[] annotationArr, x33.c cVar) {
        annotationArr.getClass();
        cVar.getClass();
        for (Annotation annotation : annotationArr) {
            if (p005kotlin.jvm.internal.s.g(z23.f.a(dh.b.u(dh.b.s(annotation))).a(), cVar)) {
                if (annotation != null) {
                    return new z23.g(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new z23.g(annotation);
        }
        return null;
    }

    public static final String h(String str, ArrayList arrayList, p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        List listC0 = g22.n.d(str) ? p13.h0.C0(p13.w.c(str), p13.h0.M0(arrayList)) : p13.h0.M0(arrayList);
        if (listC0.isEmpty()) {
            mVar.C(1096408092);
            mVar.f();
            return null;
        }
        if (listC0.size() <= 6) {
            mVar.C(1096462497);
            mVar.f();
            return p13.h0.k0(listC0, ", ", null, null, null, 62);
        }
        mVar.C(1096519785);
        String strK0 = p13.h0.k0(p13.h0.S0(listC0, 6), ", ", null, null, null, 62);
        int size = listC0.size() - 6;
        x0.f23314a.getClass();
        String strV = gl1.d.V(x0.f23408f8, new Object[]{strK0, Integer.valueOf(size)});
        mVar.f();
        return strV;
    }

    public static final ArrayList i(Annotation[] annotationArr) {
        annotationArr.getClass();
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new z23.g(annotation));
        }
        return arrayList;
    }

    public static final ww1.i0 j(List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((ww1.i0) next).b() == am.x0.f4312o) {
                return (ww1.i0) next;
            }
        }
        next = null;
        return (ww1.i0) next;
    }

    public static final List k(List list) {
        list.getClass();
        ww1.i0 i0VarJ = j(list);
        if (i0VarJ == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ww1.i0) obj).f187808c == i0VarJ.f187806a) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Object l(da2.d dVar, long j8, Class cls) {
        dVar.getClass();
        da2.b bVar = dVar.f58886a.f111646e;
        DeviceProfile deviceProfile = (DeviceProfile) p13.u.H(bVar.a(j8));
        if (deviceProfile == null) {
            return null;
        }
        String macAddress = deviceProfile.getMacAddress();
        macAddress.getClass();
        return bVar.getCapability(macAddress, cls);
    }

    public static final ArrayList m(List list) {
        int i14;
        list.getClass();
        int iN = z0.n(am.x0.f4308n);
        int iN2 = z0.n(am.x0.f4312o);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ww1.i0 i0Var = (ww1.i0) obj;
            int i15 = i0Var.f187806a;
            if (i15 != iN && (i14 = i0Var.f187808c) != iN && i15 != iN2 && i14 != iN2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final int n(int i14, int i15, int i16) {
        if (i16 > 0) {
            if (i14 < i15) {
                int i17 = i15 % i16;
                if (i17 < 0) {
                    i17 += i16;
                }
                int i18 = i14 % i16;
                if (i18 < 0) {
                    i18 += i16;
                }
                int i19 = (i17 - i18) % i16;
                if (i19 < 0) {
                    i19 += i16;
                }
                return i15 - i19;
            }
        } else {
            if (i16 >= 0) {
                vb.h.s("Step is zero.");
                return 0;
            }
            if (i14 > i15) {
                int i24 = -i16;
                int i25 = i14 % i24;
                if (i25 < 0) {
                    i25 += i24;
                }
                int i26 = i15 % i24;
                if (i26 < 0) {
                    i26 += i24;
                }
                int i27 = (i25 - i26) % i24;
                if (i27 < 0) {
                    i27 += i24;
                }
                return i27 + i15;
            }
        }
        return i15;
    }

    public static final long o(long j8, long j14, long j15) {
        if (j15 > 0) {
            if (j8 < j14) {
                long j16 = j14 % j15;
                if (j16 < 0) {
                    j16 += j15;
                }
                long j17 = j8 % j15;
                if (j17 < 0) {
                    j17 += j15;
                }
                long j18 = (j16 - j17) % j15;
                if (j18 < 0) {
                    j18 += j15;
                }
                return j14 - j18;
            }
        } else {
            if (j15 >= 0) {
                vb.h.s("Step is zero.");
                return 0L;
            }
            if (j8 > j14) {
                long j19 = -j15;
                long j24 = j8 % j19;
                if (j24 < 0) {
                    j24 += j19;
                }
                long j25 = j14 % j19;
                if (j25 < 0) {
                    j25 += j19;
                }
                long j26 = (j24 - j25) % j19;
                if (j26 < 0) {
                    j26 += j19;
                }
                return j14 + j26;
            }
        }
        return j14;
    }

    public static final ww1.i0 p(List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((ww1.i0) next).b() == am.x0.f4308n) {
                return (ww1.i0) next;
            }
        }
        next = null;
        return (ww1.i0) next;
    }

    public static final List q(List list) {
        list.getClass();
        ww1.i0 i0VarP = p(list);
        if (i0VarP == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ww1.i0) obj).f187808c == i0VarP.f187806a) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean r(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (s((xm1.e) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean s(xm1.e eVar) {
        eVar.getClass();
        j23.l lVar = new j23.l(-28800, 43200);
        j23.l lVar2 = new j23.l(-28800, DateTimeConstants.SECONDS_PER_DAY);
        if (eVar.f191504a == null) {
            return false;
        }
        long j8 = eVar.f191506c;
        if (lVar2.f96796a > j8 || j8 > lVar2.f96797b) {
            return false;
        }
        long j14 = eVar.f191505b;
        return ((long) lVar.f96796a) <= j14 && j14 <= ((long) lVar.f96797b);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    public static final x9.c t(p3.m mVar) {
        v9.a.f176280a.getClass();
        ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar);
        if (viewModelStoreOwnerA == null) {
            vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return null;
        }
        x9.d.f189592a.getClass();
        x1 x1Var = p3.n.f135158a;
        Activity activity = (Activity) mVar.A(c.n.f22332a);
        boolean zR = mVar.r(activity);
        Object objQ = mVar.q();
        p3.m.a aVar = p3.m.f135153a;
        if (zR) {
            objQ = new by1.l(activity, 7);
            mVar.K(objQ);
        } else {
            aVar.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new by1.l(activity, 7);
                mVar.K(objQ);
            }
        }
        e23.a aVar2 = (e23.a) objQ;
        Object objQ2 = p3.p0.q(aVar2, mVar);
        boolean zB = mVar.B(objQ2) | mVar.B(viewModelStoreOwnerA);
        Object objQ3 = mVar.q();
        if (zB) {
            objQ3 = new x9.c(viewModelStoreOwnerA.getF189591b(), aVar2);
            mVar.K(objQ3);
        } else {
            aVar.getClass();
            if (objQ3 == p3.m.a.f135155b) {
                objQ3 = new x9.c(viewModelStoreOwnerA.getF189591b(), aVar2);
                mVar.K(objQ3);
            }
        }
        return (x9.c) objQ3;
    }

    public static final String u(int i14) {
        return kg.f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), i14);
    }

    public static final String v(int i14, Object... objArr) {
        String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(i14, Arrays.copyOf(objArr, objArr.length));
        string.getClass();
        return string;
    }

    public static final c2 w(Fragment fragment, boolean z14, DateTime dateTime, e23.a aVar) {
        androidx.lifecycle.n0 viewLifecycleOwner = fragment.getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        return ge1.b.T(o53.f0.w(viewLifecycleOwner), null, null, new wj0.b(z14, aVar, dateTime, fragment, null), 3);
    }

    public static final w63.f0 x(Socket socket) throws IOException {
        socket.getClass();
        x63.g gVar = new x63.g(socket);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.getClass();
        return gVar.sink(new w63.x(outputStream, gVar));
    }

    public static final w63.s y(InputStream inputStream) {
        inputStream.getClass();
        return new w63.s(inputStream, new w63.h0());
    }

    public static final w63.g0 z(Socket socket) throws IOException {
        socket.getClass();
        x63.g gVar = new x63.g(socket);
        InputStream inputStream = socket.getInputStream();
        inputStream.getClass();
        return gVar.source(new w63.s(inputStream, gVar));
    }
}
