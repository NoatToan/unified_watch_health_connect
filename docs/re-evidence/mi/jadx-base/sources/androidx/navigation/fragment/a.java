package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import androidx.navigation.d;
import androidx.navigation.h;
import androidx.navigation.i;
import defpackage.o3j;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
@i.b("fragment")
public class a extends i<C0048a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentManager f2690b;
    public final int c;
    public ArrayDeque<Integer> d = new ArrayDeque<>();

    /* JADX INFO: renamed from: androidx.navigation.fragment.a$a, reason: collision with other inner class name */
    public static class C0048a extends d {
        public String j;

        public C0048a(i<? extends C0048a> iVar) {
            super(iVar);
        }

        public final String B() {
            String str = this.j;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Fragment class was not set");
        }

        public final C0048a C(String str) {
            this.j = str;
            return this;
        }

        @Override // androidx.navigation.d
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.j;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            return sb.toString();
        }

        @Override // androidx.navigation.d
        public void u(Context context, AttributeSet attributeSet) {
            super.u(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, o3j.i);
            String string = typedArrayObtainAttributes.getString(o3j.j);
            if (string != null) {
                C(string);
            }
            typedArrayObtainAttributes.recycle();
        }
    }

    public static final class b implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap<View, String> f2691a;

        /* JADX INFO: renamed from: androidx.navigation.fragment.a$b$a, reason: collision with other inner class name */
        public static final class C0049a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LinkedHashMap<View, String> f2692a = new LinkedHashMap<>();

            public C0049a a(View view, String str) {
                this.f2692a.put(view, str);
                return this;
            }

            public b b() {
                return new b(this.f2692a);
            }
        }

        public b(Map<View, String> map) {
            LinkedHashMap<View, String> linkedHashMap = new LinkedHashMap<>();
            this.f2691a = linkedHashMap;
            linkedHashMap.putAll(map);
        }

        public Map<View, String> a() {
            return Collections.unmodifiableMap(this.f2691a);
        }
    }

    public a(Context context, FragmentManager fragmentManager, int i) {
        this.f2689a = context;
        this.f2690b = fragmentManager;
        this.c = i;
    }

    @Override // androidx.navigation.i
    public void c(Bundle bundle) {
        int[] intArray;
        if (bundle == null || (intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds")) == null) {
            return;
        }
        this.d.clear();
        for (int i : intArray) {
            this.d.add(Integer.valueOf(i));
        }
    }

    @Override // androidx.navigation.i
    public Bundle d() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.d.size()];
        Iterator<Integer> it = this.d.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    @Override // androidx.navigation.i
    public boolean e() {
        if (this.d.isEmpty() || this.f2690b.T0()) {
            return false;
        }
        this.f2690b.j1(g(this.d.size(), this.d.peekLast().intValue()), 1);
        this.d.removeLast();
        return true;
    }

    @Override // androidx.navigation.i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0048a a() {
        return new C0048a(this);
    }

    public final String g(int i, int i2) {
        return i + "-" + i2;
    }

    @Deprecated
    public Fragment h(Context context, FragmentManager fragmentManager, String str, Bundle bundle) {
        return fragmentManager.x0().a(context.getClassLoader(), str);
    }

    @Override // androidx.navigation.i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public d b(C0048a c0048a, Bundle bundle, h hVar, i.a aVar) {
        if (this.f2690b.T0()) {
            return null;
        }
        String strB = c0048a.B();
        boolean z = false;
        if (strB.charAt(0) == '.') {
            strB = this.f2689a.getPackageName() + strB;
        }
        Fragment fragmentH = h(this.f2689a, this.f2690b, strB, bundle);
        fragmentH.setArguments(bundle);
        k kVarO = this.f2690b.o();
        int iA = hVar != null ? hVar.a() : -1;
        int iB = hVar != null ? hVar.b() : -1;
        int iC = hVar != null ? hVar.c() : -1;
        int iD = hVar != null ? hVar.d() : -1;
        if (iA != -1 || iB != -1 || iC != -1 || iD != -1) {
            if (iA == -1) {
                iA = 0;
            }
            if (iB == -1) {
                iB = 0;
            }
            if (iC == -1) {
                iC = 0;
            }
            if (iD == -1) {
                iD = 0;
            }
            kVarO.A(iA, iB, iC, iD);
        }
        kVarO.w(this.c, fragmentH);
        kVarO.C(fragmentH);
        int iM = c0048a.m();
        boolean zIsEmpty = this.d.isEmpty();
        boolean z2 = hVar != null && !zIsEmpty && hVar.g() && this.d.peekLast().intValue() == iM;
        if (zIsEmpty) {
            z = true;
        } else if (!z2) {
            kVarO.j(g(this.d.size() + 1, iM));
            z = true;
        } else if (this.d.size() > 1) {
            this.f2690b.j1(g(this.d.size(), this.d.peekLast().intValue()), 1);
            kVarO.j(g(this.d.size(), iM));
        }
        if (aVar instanceof b) {
            for (Map.Entry<View, String> entry : ((b) aVar).a().entrySet()) {
                kVarO.i(entry.getKey(), entry.getValue());
            }
        }
        kVarO.D(true);
        kVarO.l();
        if (!z) {
            return null;
        }
        this.d.add(Integer.valueOf(iM));
        return c0048a;
    }
}
