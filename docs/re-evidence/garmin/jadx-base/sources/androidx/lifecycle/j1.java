package androidx.lifecycle;

import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import r53.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u001f\b\u0017\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0017¢\u0006\u0004\b\u0005\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/lifecycle/j1;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "b", "a", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f7943c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f7944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9.a f7945b;

    public j1(Map<String, ? extends Object> map) {
        map.getClass();
        this.f7944a = new LinkedHashMap();
        this.f7945b = new t9.a(map);
    }

    public final <T> T a(String str) {
        T t7;
        str.getClass();
        t9.a aVar = this.f7945b;
        aVar.getClass();
        LinkedHashMap linkedHashMap = aVar.f163193a;
        LinkedHashMap linkedHashMap2 = aVar.f163196d;
        try {
            r53.z1 z1Var = (r53.z1) linkedHashMap2.get(str);
            if (z1Var != null && (t7 = (T) z1Var.getValue()) != null) {
                return t7;
            }
            return (T) linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            aVar.f163195c.remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final b b(String str) {
        t9.a aVar = this.f7945b;
        LinkedHashMap linkedHashMap = aVar.f163196d;
        LinkedHashMap linkedHashMap2 = aVar.f163193a;
        if (linkedHashMap.containsKey(str)) {
            vb.h.x(am.j.m("StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '", str, "', but not both."));
            return null;
        }
        LinkedHashMap linkedHashMap3 = this.f7944a;
        Object bVar = linkedHashMap3.get(str);
        if (bVar == null) {
            bVar = linkedHashMap2.containsKey(str) ? new b(this, str, linkedHashMap2.get(str)) : new b(this, str);
            linkedHashMap3.put(str, bVar);
        }
        return (b) bVar;
    }

    public final r53.z1 c(Object obj, String str) {
        if (!this.f7944a.containsKey(str)) {
            return this.f7945b.a(obj, str);
        }
        vb.h.x(am.j.m("StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '", str, "', but not both."));
        return null;
    }

    public final r53.b2 d(Object obj, String str) {
        str.getClass();
        t9.a aVar = this.f7945b;
        if (aVar.f163196d.containsKey(str)) {
            return r53.s.d(aVar.a(obj, str));
        }
        LinkedHashMap linkedHashMap = aVar.f163193a;
        LinkedHashMap linkedHashMap2 = aVar.f163195c;
        Object objA = linkedHashMap2.get(str);
        if (objA == null) {
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, obj);
            }
            objA = q2.a(linkedHashMap.get(str));
            linkedHashMap2.put(str, objA);
        }
        return r53.s.d((r53.z1) objA);
    }

    public final <T> T e(String str) {
        t9.a aVar = this.f7945b;
        aVar.getClass();
        T t7 = (T) aVar.f163193a.remove(str);
        aVar.f163195c.remove(str);
        aVar.f163196d.remove(str);
        b bVar = (b) this.f7944a.remove(str);
        if (bVar != null) {
            bVar.f7947m = null;
        }
        return t7;
    }

    public final void f(Object obj, String str) {
        str.getClass();
        f7943c.getClass();
        if (obj != null) {
            ArrayList arrayList = t9.b.f163198a;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!((Class) it.next()).isInstance(obj));
            }
            androidx.core.view.j.s("Can't put value with type ", obj.getClass(), " into saved state");
            return;
        }
        ArrayList arrayList2 = t9.b.f163198a;
        Object obj2 = this.f7944a.get(str);
        y0 y0Var = obj2 instanceof y0 ? (y0) obj2 : null;
        if (y0Var != null) {
            y0Var.m(obj);
        }
        this.f7945b.b(obj, str);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/j1$a;", "", "<init>", "()V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static j1 a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new j1();
            }
            ClassLoader classLoader = j1.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            q13.c cVar = new q13.c(bundle.size());
            for (String str : bundle.keySet()) {
                str.getClass();
                cVar.put(str, bundle.get(str));
            }
            return new j1(cVar.b());
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/j1$b;", "T", "Landroidx/lifecycle/y0;", "Landroidx/lifecycle/j1;", "handle", "", Action.KEY_ATTRIBUTE, "value", "<init>", "(Landroidx/lifecycle/j1;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/j1;Ljava/lang/String;)V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> extends y0<T> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f7946l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public j1 f7947m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j1 j1Var, String str, T t7) {
            super(t7);
            str.getClass();
            this.f7946l = str;
            this.f7947m = j1Var;
        }

        @Override // androidx.lifecycle.s0
        public final void m(T t7) {
            t9.a aVar;
            j1 j1Var = this.f7947m;
            if (j1Var != null && (aVar = j1Var.f7945b) != null) {
                aVar.b(t7, this.f7946l);
            }
            super.m(t7);
        }

        public b(j1 j1Var, String str) {
            str.getClass();
            this.f7946l = str;
            this.f7947m = j1Var;
        }
    }

    public j1() {
        this.f7944a = new LinkedHashMap();
        this.f7945b = new t9.a(null, 1, null);
    }
}
