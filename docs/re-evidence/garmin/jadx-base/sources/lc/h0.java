package lc;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.l1;
import p1.m1;
import p1.n1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0002\t\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\u000b"}, d2 = {"Llc/h0;", "", "", "navigatorName", "<init>", "(Ljava/lang/String;)V", "Llc/v0;", "navigator", "(Llc/v0;)V", "b", "a", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class h0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f111771f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qc.j f111773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f111774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f111775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1<s> f111776e;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llc/h0$b;", "", "Llc/h0;", FirebaseAnalytics.Param.DESTINATION, "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "matchingArgs", "", "isExactDeepLink", "", "matchingPathSegments", "hasMatchingAction", "mimeTypeMatchLevel", "<init>", "(Llc/h0;Landroid/os/Bundle;ZIZI)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h0 f111777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bundle f111778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f111779c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f111780d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f111781e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f111782f;

        public b(h0 h0Var, Bundle bundle, boolean z14, int i14, boolean z15, int i15) {
            h0Var.getClass();
            this.f111777a = h0Var;
            this.f111778b = bundle;
            this.f111779c = z14;
            this.f111780d = i14;
            this.f111781e = z15;
            this.f111782f = i15;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(b bVar) {
            bVar.getClass();
            boolean z14 = bVar.f111781e;
            boolean z15 = bVar.f111779c;
            Bundle bundle = bVar.f111778b;
            boolean z16 = this.f111779c;
            if (z16 && !z15) {
                return 1;
            }
            if (!z16 && z15) {
                return -1;
            }
            int i14 = this.f111780d - bVar.f111780d;
            if (i14 > 0) {
                return 1;
            }
            if (i14 < 0) {
                return -1;
            }
            Bundle bundle2 = this.f111778b;
            if (bundle2 != null && bundle == null) {
                return 1;
            }
            if (bundle2 == null && bundle != null) {
                return -1;
            }
            if (bundle2 != null) {
                bundle2.getClass();
                int size = bundle2.size();
                bundle.getClass();
                int size2 = size - bundle.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z17 = this.f111781e;
            if (z17 && !z14) {
                return 1;
            }
            if (z17 || !z14) {
                return this.f111782f - bVar.f111782f;
            }
            return -1;
        }
    }

    static {
        new LinkedHashMap();
    }

    public h0(String str) {
        str.getClass();
        this.f111772a = str;
        this.f111773b = new qc.j(this);
        this.f111776e = new l1<>(0, 1, null);
    }

    public final void a(d0 d0Var) {
        d0Var.getClass();
        qc.j jVar = this.f111773b;
        jVar.getClass();
        ArrayList arrayListD = gl1.y.D(jVar.f144345d, new qc.i(d0Var, 0));
        if (arrayListD.isEmpty()) {
            jVar.f144344c.add(d0Var);
        } else {
            kg.f.m(d0Var.f111732a, "Deep link ", " can't be used to open destination ", jVar.f144342a, ".\nFollowing required arguments are missing: ", arrayListD);
        }
    }

    public final Bundle b(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.f111773b.f144345d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        p13.k0.f134949a.getClass();
        Bundle bundleA = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            t tVar = (t) entry.getValue();
            tVar.getClass();
            str.getClass();
            if (tVar.f111868c && (obj = tVar.f111870e) != null) {
                tVar.f111866a.e(bundleA, str, obj);
            }
        }
        if (bundle != null) {
            bundleA.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                t tVar2 = (t) entry2.getValue();
                boolean z14 = tVar2.f111869d;
                q0<Object> q0Var = tVar2.f111866a;
                if (!z14) {
                    str2.getClass();
                    if (tVar2.f111867b || !bundleA.containsKey(str2) || !nd.b.k(bundleA, str2)) {
                        try {
                            q0Var.a(bundleA, str2);
                        } catch (IllegalStateException unused) {
                        }
                    }
                    kg.f.w(hb.a.l("Wrong argument type for '", str2, "' in argument savedState. "), q0Var.b(), " expected.");
                    return null;
                }
            }
        }
        return bundleA;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    public final int[] c(h0 h0Var) {
        p13.k kVar = new p13.k();
        h0 h0Var2 = this;
        while (true) {
            qc.j jVar = h0Var2.f111773b;
            j0 j0Var = h0Var2.f111774c;
            if ((h0Var != null ? h0Var.f111774c : null) != null) {
                j0 j0Var2 = h0Var.f111774c;
                j0Var2.getClass();
                if (j0Var2.f111791g.b(jVar.f144346e) != h0Var2) {
                    if (j0Var != null || j0Var.f111791g.f144354c != jVar.f144346e) {
                        kVar.addFirst(h0Var2);
                    }
                    if (!p005kotlin.jvm.internal.s.g(j0Var, h0Var) || j0Var == null) {
                        break;
                    }
                    h0Var2 = j0Var;
                } else {
                    kVar.addFirst(h0Var2);
                    break;
                }
            } else {
                if (j0Var != null) {
                    kVar.addFirst(h0Var2);
                } else {
                    kVar.addFirst(h0Var2);
                }
                if (!p005kotlin.jvm.internal.s.g(j0Var, h0Var)) {
                    break;
                }
                h0Var2 = j0Var;
            }
        }
        List listB1 = p13.h0.b1(kVar);
        ArrayList arrayList = new ArrayList(p13.y.r(listB1, 10));
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((h0) it.next()).f111773b.f144346e));
        }
        return p13.h0.a1(arrayList);
    }

    public final s d(int i14) {
        l1<s> l1Var = this.f111776e;
        s sVarC = l1Var.f() == 0 ? null : l1Var.c(i14);
        if (sVarC != null) {
            return sVarC;
        }
        j0 j0Var = this.f111774c;
        if (j0Var != null) {
            return j0Var.d(i14);
        }
        return null;
    }

    public final Map<String, t> e() {
        return p13.u0.m(this.f111773b.f144345d);
    }

    public boolean equals(Object obj) {
        boolean z14;
        boolean z15;
        if (this != obj) {
            if (obj != null && (obj instanceof h0)) {
                qc.j jVar = this.f111773b;
                ArrayList arrayList = jVar.f144344c;
                h0 h0Var = (h0) obj;
                l1<s> l1Var = h0Var.f111776e;
                qc.j jVar2 = h0Var.f111773b;
                boolean zG = p005kotlin.jvm.internal.s.g(arrayList, jVar2.f144344c);
                l1<s> l1Var2 = this.f111776e;
                if (l1Var2.f() != l1Var.f()) {
                    z14 = false;
                    break;
                }
                Iterator it = ((c53.a) c53.q.b(new m1(l1Var2))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z14 = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!p005kotlin.jvm.internal.s.g(l1Var2.c(iIntValue), l1Var.c(iIntValue))) {
                        z14 = false;
                        break;
                    }
                }
                if (e().size() != h0Var.e().size()) {
                    z15 = false;
                    break;
                }
                Iterator it3 = p13.h0.M(e().entrySet()).f134939a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z15 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it3.next();
                    if (!h0Var.e().containsKey(entry.getKey()) || !p005kotlin.jvm.internal.s.g(h0Var.e().get(entry.getKey()), entry.getValue())) {
                        z15 = false;
                        break;
                    }
                }
                if (jVar.f144346e != jVar2.f144346e || !p005kotlin.jvm.internal.s.g(jVar.f144347f, jVar2.f144347f) || !zG || !z14 || !z15) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean g(Bundle bundle, String str) {
        str.getClass();
        qc.j jVar = this.f111773b;
        jVar.getClass();
        if (p005kotlin.jvm.internal.s.g(jVar.f144347f, str)) {
            return true;
        }
        b bVarA = jVar.a(str);
        if (!jVar.f144342a.equals(bVarA != null ? bVarA.f111777a : null)) {
            return false;
        }
        Bundle bundle2 = bVarA.f111778b;
        if (bundle == null || bundle2 == null) {
            return false;
        }
        Set<String> setKeySet = bundle2.keySet();
        setKeySet.getClass();
        for (String str2 : setKeySet) {
            str2.getClass();
            if (!bundle.containsKey(str2)) {
                return false;
            }
            t tVar = bVarA.f111777a.e().get(str2);
            q0<Object> q0Var = tVar != null ? tVar.f111866a : null;
            Object objA = q0Var != null ? q0Var.a(bundle2, str2) : null;
            Object objA2 = q0Var != null ? q0Var.a(bundle, str2) : null;
            if (q0Var != null && !q0Var.g(objA, objA2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:68:0x0139  */
    /* JADX WARN: Code duplicated, block: B:72:0x0152  */
    public b h(g0 g0Var) {
        boolean zD;
        boolean z14;
        int size;
        int iCompareTo;
        b bVar;
        d53.k kVar;
        d53.j jVarC;
        boolean zD2;
        qc.j jVar = this.f111773b;
        LinkedHashMap linkedHashMap = jVar.f144345d;
        String str = g0Var.f111769c;
        Object obj = g0Var.f111768b;
        Uri uri = g0Var.f111767a;
        ArrayList<d0> arrayList = jVar.f144344c;
        if (arrayList.isEmpty()) {
            return null;
        }
        b bVar2 = null;
        for (d0 d0Var : arrayList) {
            d0Var.getClass();
            o13.t tVar = d0Var.f111746o;
            o13.t tVar2 = d0Var.f111737f;
            String str2 = d0Var.f111734c;
            String str3 = d0Var.f111733b;
            if (((d53.k) tVar2.getValue()) == null) {
                zD = true;
            } else if (uri == null) {
                zD = false;
            } else {
                d53.k kVar2 = (d53.k) tVar2.getValue();
                kVar2.getClass();
                zD = kVar2.d(uri.toString());
            }
            if (zD) {
                if (str3 == null ? true : obj == null ? false : str3.equals(obj)) {
                    if (str2 == null) {
                        zD2 = true;
                    } else if (str == null) {
                        zD2 = false;
                    } else {
                        d53.k kVar3 = (d53.k) tVar.getValue();
                        kVar3.getClass();
                        zD2 = kVar3.d(str);
                    }
                    if (zD2) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            if (z14) {
                Bundle bundleC = uri != null ? d0Var.c(uri, linkedHashMap) : null;
                String str4 = d0Var.f111732a;
                if (uri == null || str4 == null) {
                    size = 0;
                } else {
                    List<String> pathSegments = uri.getPathSegments();
                    r0.f111862a.getClass();
                    Uri uri2 = Uri.parse(str4);
                    uri2.getClass();
                    size = p13.h0.h0(pathSegments, uri2.getPathSegments()).size();
                }
                boolean z15 = obj != null && obj.equals(str3);
                if (str == null || str2 == null) {
                    iCompareTo = -1;
                } else {
                    d53.k kVar4 = (d53.k) tVar.getValue();
                    kVar4.getClass();
                    if (kVar4.d(str)) {
                        iCompareTo = new d0.c(str2).compareTo(new d0.c(str));
                    } else {
                        iCompareTo = -1;
                    }
                }
                if (bundleC != null) {
                    bVar = new b(jVar.f144342a, bundleC, d0Var.f111747p, size, z15, iCompareTo);
                    if (bVar2 != null || bVar.compareTo(bVar2) > 0) {
                        bVar2 = bVar;
                    }
                } else if (z15 || iCompareTo > -1) {
                    linkedHashMap.getClass();
                    p13.k0.f134949a.getClass();
                    Bundle bundleA = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
                    if (uri != null && (kVar = (d53.k) tVar2.getValue()) != null && (jVarC = kVar.c(uri.toString())) != null) {
                        d0Var.d(jVarC, bundleA, linkedHashMap);
                        if (((Boolean) d0Var.f111738g.getValue()).booleanValue()) {
                            d0Var.e(uri, bundleA, linkedHashMap);
                        }
                    }
                    if (gl1.y.D(linkedHashMap, new c0(1, bundleA)).isEmpty()) {
                        bVar = new b(jVar.f144342a, bundleC, d0Var.f111747p, size, z15, iCompareTo);
                        if (bVar2 != null) {
                            bVar2 = bVar;
                        } else {
                            bVar2 = bVar;
                        }
                    }
                }
            }
        }
        return bVar2;
    }

    public int hashCode() {
        qc.j jVar = this.f111773b;
        int i14 = jVar.f144346e * 31;
        String str = jVar.f144347f;
        int iHashCode = i14 + (str != null ? str.hashCode() : 0);
        for (d0 d0Var : jVar.f144344c) {
            int i15 = iHashCode * 31;
            String str2 = d0Var.f111732a;
            int iHashCode2 = (i15 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = d0Var.f111733b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = d0Var.f111734c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        l1<s> l1Var = this.f111776e;
        l1Var.getClass();
        n1 n1Var = new n1(l1Var);
        while (n1Var.hasNext()) {
            s sVar = (s) n1Var.next();
            int i16 = ((iHashCode * 31) + sVar.f111863a) * 31;
            o0 o0Var = sVar.f111864b;
            iHashCode = i16 + (o0Var != null ? o0Var.hashCode() : 0);
            Bundle bundle = sVar.f111865c;
            if (bundle != null) {
                iHashCode = gl.b.k(bundle) + (iHashCode * 31);
            }
        }
        for (String str5 : e().keySet()) {
            int iJ = wr.g.j(iHashCode * 31, 31, str5);
            t tVar = e().get(str5);
            iHashCode = iJ + (tVar != null ? tVar.hashCode() : 0);
        }
        return iHashCode;
    }

    public void i(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, mc.a.f117765e);
        typedArrayObtainAttributes.getClass();
        l(typedArrayObtainAttributes.getString(2));
        if (typedArrayObtainAttributes.hasValue(1)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            qc.j jVar = this.f111773b;
            jVar.f144346e = resourceId;
            jVar.f144343b = null;
            qc.f fVar = new qc.f(context);
            int i14 = jVar.f144346e;
            f111771f.getClass();
            jVar.f144343b = a.a(fVar, i14);
        }
        this.f111775d = typedArrayObtainAttributes.getText(0);
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    public final void j(int i14, s sVar) {
        sVar.getClass();
        if (!(this instanceof lc.a.b)) {
            if (i14 != 0) {
                this.f111776e.e(i14, sVar);
                return;
            } else {
                vb.h.s("Cannot have an action with actionId 0");
                return;
            }
        }
        throw new UnsupportedOperationException("Cannot add action " + i14 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void l(String str) {
        qc.j jVar = this.f111773b;
        if (str == null) {
            jVar.f144346e = 0;
            jVar.f144343b = null;
        } else {
            jVar.getClass();
            if (d53.w.J(str)) {
                vb.h.s("Cannot have an empty route");
                return;
            }
            f111771f.getClass();
            String strConcat = "android-app://androidx.navigation/".concat(str);
            d0.a aVar = new d0.a();
            aVar.f111748a = strConcat;
            ArrayList arrayListD = gl1.y.D(jVar.f144345d, new qc.i(aVar.a(), 1));
            if (!arrayListD.isEmpty()) {
                StringBuilder sbL = hb.a.l("Cannot set route \"", str, "\" for destination ");
                sbL.append(jVar.f144342a);
                sbL.append(". Following required arguments are missing: ");
                sbL.append(arrayListD);
                throw new IllegalArgumentException(sbL.toString().toString());
            }
            jVar.f144348g = o13.m.b(new a90.c(strConcat, 10));
            jVar.f144346e = strConcat.hashCode();
            jVar.f144343b = null;
        }
        jVar.f144347f = str;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getClass().getSimpleName());
        sb3.append("(");
        qc.j jVar = this.f111773b;
        String str = jVar.f144343b;
        if (str == null) {
            sb3.append("0x");
            sb3.append(Integer.toHexString(jVar.f144346e));
        } else {
            sb3.append(str);
        }
        sb3.append(")");
        String str2 = jVar.f144347f;
        if (str2 != null && !d53.w.J(str2)) {
            sb3.append(" route=");
            sb3.append(jVar.f144347f);
        }
        if (this.f111775d != null) {
            sb3.append(" label=");
            sb3.append(this.f111775d);
        }
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llc/h0$a;", "", "<init>", "()V", "", "", "Ljava/lang/Class;", "classes", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a(qc.f fVar, int i14) {
            fVar.getClass();
            if (i14 <= 16777215) {
                return String.valueOf(i14);
            }
            try {
                Context context = fVar.f144311a;
                context.getClass();
                String resourceName = context.getResources().getResourceName(i14);
                resourceName.getClass();
                return resourceName;
            } catch (Resources.NotFoundException unused) {
                return String.valueOf(i14);
            }
        }

        public static c53.j b(h0 h0Var) {
            h0Var.getClass();
            return c53.q.e(new l72.b1(11), h0Var);
        }

        public static boolean c(h0 h0Var, k23.d dVar) {
            h0Var.getClass();
            dVar.getClass();
            return rc.l.b(gl1.y.J(dVar)) == h0Var.f111773b.f144346e;
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h0(v0<? extends h0> v0Var) {
        v0Var.getClass();
        w0.a aVar = w0.f111892b;
        Class<?> cls = v0Var.getClass();
        aVar.getClass();
        this(w0.a.a(cls));
    }
}
