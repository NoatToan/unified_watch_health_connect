package p43;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends w43.e<i1<?>, i1<?>> implements Iterable<i1<?>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f135863b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k1 f135864c = new k1(p13.j0.f134944a);

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
    private k1(List<? extends i1<?>> list) {
        for (i1<?> i1Var : list) {
            k23.d<? extends T> dVarB = i1Var.b();
            dVarB.getClass();
            String strW = dVarB.w();
            strW.getClass();
            a aVarB = b();
            int iB = aVarB.b(aVarB.f182062a, strW, new w43.y(aVarB));
            int iA = this.f181997a.a();
            if (iA != 0) {
                if (iA == 1) {
                    Object obj = this.f181997a;
                    try {
                        obj.getClass();
                        w43.o oVar = (w43.o) obj;
                        int i14 = oVar.f182019b;
                        if (i14 == iB) {
                            this.f181997a = new w43.o(i1Var, iB);
                        } else {
                            w43.d dVar = new w43.d();
                            dVar.b(i14, oVar.f182018a);
                            this.f181997a = dVar;
                        }
                    } catch (ClassCastException e4) {
                        com.airbnb.lottie.animation.keyframe.a.x(c(obj, 1, "OneElementArrayMap"), e4);
                        throw null;
                    }
                }
                this.f181997a.b(iB, i1Var);
            } else {
                Object obj2 = this.f181997a;
                if (!(obj2 instanceof w43.i)) {
                    vb.h.z(c(obj2, 0, "EmptyArrayMap"));
                    throw null;
                }
                this.f181997a = new w43.o(i1Var, iB);
            }
        }
    }

    @Override // w43.a
    public final a b() {
        return f135863b;
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
    public final k1 d(q qVar) {
        k23.d<? extends q> dVarB = qVar.b();
        a aVar = f135863b;
        aVar.getClass();
        String strW = dVarB.w();
        strW.getClass();
        if (this.f181997a.get(aVar.b(aVar.f182062a, strW, new w43.y(aVar))) != null) {
            return this;
        }
        return isEmpty() ? new k1(qVar) : a.a(p13.h0.D0(p13.h0.b1(this), qVar));
    }

    public static final class a extends w43.z<i1<?>, i1<?>> {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static k1 a(List list) {
            return list.isEmpty() ? k1.f135864c : new k1(list, null);
        }

        public final int b(ConcurrentHashMap concurrentHashMap, String str, w43.y yVar) {
            int iIntValue;
            concurrentHashMap.getClass();
            Integer num = (Integer) concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(str);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Object objInvoke = yVar.invoke(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(((Number) objInvoke).intValue()));
                        iIntValue = ((Number) objInvoke).intValue();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return iIntValue;
        }

        private a() {
        }
    }

    public /* synthetic */ k1(List list, p005kotlin.jvm.internal.j jVar) {
        this((List<? extends i1<?>>) list);
    }

    private k1(i1<?> i1Var) {
        this((List<? extends i1<?>>) p13.w.c(i1Var));
    }
}
