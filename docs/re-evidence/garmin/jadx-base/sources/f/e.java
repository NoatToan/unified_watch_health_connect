package f;

import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import c53.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lf/e;", "", "<init>", "()V", "a", "c", "b", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f67591h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f67592a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f67593b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f67594c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f67595d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f67596e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f67597f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f67598g = new Bundle();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf/e$a;", "O", "", "Lf/b;", "callback", "Lg/a;", "contract", "<init>", "(Lf/b;Lg/a;)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f.b<O> f67599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g.a<?, O> f67600b;

        public a(f.b<O> bVar, g.a<?, O> aVar) {
            bVar.getClass();
            aVar.getClass();
            this.f67599a = bVar;
            this.f67600b = aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf/e$c;", "", "Landroidx/lifecycle/b0;", "lifecycle", "<init>", "(Landroidx/lifecycle/b0;)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b0 f67601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f67602b;

        public c(b0 b0Var) {
            b0Var.getClass();
            this.f67601a = b0Var;
            this.f67602b = new ArrayList();
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v3 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final boolean a(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            java.util.LinkedHashMap r0 = r3.f67592a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L10
            r4 = 0
            return r4
        L10:
            java.util.LinkedHashMap r0 = r3.f67596e
            java.lang.Object r0 = r0.get(r4)
            f.e$a r0 = (f.e.a) r0
            if (r0 == 0) goto L1d
            f.b<O> r1 = r0.f67599a
            goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r1 == 0) goto L37
            java.util.ArrayList r1 = r3.f67595d
            boolean r2 = r1.contains(r4)
            if (r2 == 0) goto L37
            f.b<O> r2 = r0.f67599a
            g.a<?, O> r0 = r0.f67600b
            java.lang.Object r5 = r0.c(r5, r6)
            r2.a(r5)
            r1.remove(r4)
            goto L46
        L37:
            java.util.LinkedHashMap r0 = r3.f67597f
            r0.remove(r4)
            f.a r0 = new f.a
            r0.<init>(r5, r6)
            android.os.Bundle r5 = r3.f67598g
            r5.putParcelable(r4, r0)
        L46:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a(int, int, android.content.Intent):boolean");
    }

    public abstract <I, O> void b(int i14, g.a<I, O> aVar, I i15, z6.b bVar);

    public final f c(final String str, n0 n0Var, final g.a aVar, final f.b bVar) {
        str.getClass();
        n0Var.getClass();
        aVar.getClass();
        bVar.getClass();
        b0 lifecycle = n0Var.getF158017a();
        if (lifecycle.getF7973d().a(b0.b.STARTED)) {
            StringBuilder sb3 = new StringBuilder("LifecycleOwner ");
            sb3.append(n0Var);
            b0.b bVarB = lifecycle.getF7973d();
            sb3.append(" is attempting to register while current state is ");
            sb3.append(bVarB);
            sb3.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb3.toString().toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.f67594c;
        c cVar = (c) linkedHashMap.get(str);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        k0 k0Var = new k0() { // from class: f.d
            @Override // androidx.lifecycle.k0
            public final void onStateChanged(n0 n0Var2, b0.a aVar2) {
                e eVar = this.f67587a;
                LinkedHashMap linkedHashMap2 = eVar.f67596e;
                int i14 = e.f67591h;
                b0.a aVar3 = b0.a.ON_START;
                String str2 = str;
                if (aVar3 != aVar2) {
                    if (b0.a.ON_STOP == aVar2) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (b0.a.ON_DESTROY == aVar2) {
                            eVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = eVar.f67598g;
                LinkedHashMap linkedHashMap3 = eVar.f67597f;
                b bVar2 = bVar;
                g.a aVar4 = aVar;
                linkedHashMap2.put(str2, new e.a(bVar2, aVar4));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    bVar2.a(obj);
                }
                a aVar5 = (a) h7.b.a(bundle, a.class, str2);
                if (aVar5 != null) {
                    bundle.remove(str2);
                    bVar2.a(aVar4.c(aVar5.f67585a, aVar5.f67586b));
                }
            }
        };
        cVar.f67601a.a(k0Var);
        cVar.f67602b.add(k0Var);
        linkedHashMap.put(str, cVar);
        return new f(this, str, aVar);
    }

    public final g d(String str, g.a aVar, f.b bVar) {
        str.getClass();
        aVar.getClass();
        e(str);
        this.f67596e.put(str, new a(bVar, aVar));
        LinkedHashMap linkedHashMap = this.f67597f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            bVar.a(obj);
        }
        Bundle bundle = this.f67598g;
        f.a aVar2 = (f.a) h7.b.a(bundle, f.a.class, str);
        if (aVar2 != null) {
            bundle.remove(str);
            bVar.a(aVar.c(aVar2.f67585a, aVar2.f67586b));
        }
        return new g(this, str, aVar);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f67593b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : (c53.a) q.d(new ey0.a(10))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f67592a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        n23.j.s("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        str.getClass();
        if (!this.f67595d.contains(str) && (num = (Integer) this.f67593b.remove(str)) != null) {
            this.f67592a.remove(num);
        }
        this.f67596e.remove(str);
        LinkedHashMap linkedHashMap = this.f67597f;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f67598g;
        if (bundle.containsKey(str)) {
            Objects.toString((f.a) h7.b.a(bundle, f.a.class, str));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f67594c;
        c cVar = (c) linkedHashMap2.get(str);
        if (cVar != null) {
            ArrayList arrayList = cVar.f67602b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cVar.f67601a.d((k0) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lf/e$b;", "", "<init>", "()V", "", "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", "Ljava/lang/String;", "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", "KEY_COMPONENT_ACTIVITY_PENDING_RESULTS", "LOG_TAG", "", "INITIAL_REQUEST_CODE_VALUE", "I", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
