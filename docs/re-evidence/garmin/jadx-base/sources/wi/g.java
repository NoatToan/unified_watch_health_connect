package wi;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class g<Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f185295a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f185296b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.d f185297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f185298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f185299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f185300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Class<?> f185301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h.d f185302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ui.h f185303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<Class<?>, ui.l<?>> f185304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Class<Transcode> f185305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f185306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f185307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ui.e f185308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.g f185309o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public j f185310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f185311q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f185312r;

    public final ArrayList a() {
        boolean z14 = this.f185307m;
        ArrayList arrayList = this.f185296b;
        if (!z14) {
            this.f185307m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i14 = 0; i14 < size; i14++) {
                aj.o.a aVar = (aj.o.a) arrayListB.get(i14);
                ui.e eVar = aVar.f3370a;
                List<ui.e> list = aVar.f3371b;
                if (!arrayList.contains(eVar)) {
                    arrayList.add(aVar.f3370a);
                }
                for (int i15 = 0; i15 < list.size(); i15++) {
                    if (!arrayList.contains(list.get(i15))) {
                        arrayList.add(list.get(i15));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z14 = this.f185306l;
        ArrayList arrayList = this.f185295a;
        if (!z14) {
            this.f185306l = true;
            arrayList.clear();
            List listF = this.f185297c.a().f(this.f185298d);
            int size = listF.size();
            for (int i14 = 0; i14 < size; i14++) {
                aj.o.a aVarA = ((aj.o) listF.get(i14)).a(this.f185298d, this.f185299e, this.f185300f, this.f185303i);
                if (aVarA != null) {
                    arrayList.add(aVarA);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v16 wi.s<?, ?, ?>
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final <Data> wi.s<Data, ?, Transcode> c(java.lang.Class<Data> r18) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.g.c(java.lang.Class):wi.s");
    }

    public final <X> ui.d<X> d(X x14) {
        ui.d<X> dVar;
        lj.a aVar = this.f185297c.a().f28442b;
        Class<?> cls = x14.getClass();
        synchronized (aVar) {
            for (lj.a.C2163a c2163a : aVar.f112918a) {
                if (c2163a.f112919a.isAssignableFrom(cls)) {
                    dVar = (ui.d<X>) c2163a.f112920b;
                }
            }
            dVar = null;
        }
        if (dVar != null) {
            return dVar;
        }
        throw new Registry.NoSourceEncoderAvailableException(x14.getClass());
    }

    public final <Z> ui.l<Z> e(Class<Z> cls) {
        ui.l<Z> lVar = (ui.l) this.f185304j.get(cls);
        if (lVar == null) {
            for (Map.Entry<Class<?>, ui.l<?>> entry : this.f185304j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    lVar = (ui.l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f185304j.isEmpty() || !this.f185311q) {
            return cj.c.f27731b;
        }
        vb.h.s(androidx.core.view.j.i(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods."));
        return null;
    }
}
