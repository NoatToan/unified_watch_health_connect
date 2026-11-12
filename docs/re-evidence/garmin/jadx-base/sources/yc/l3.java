package yc;

import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class l3 {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"yc/l3$a", "Landroidx/recyclerview/widget/o$b;", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends androidx.recyclerview.widget.o.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k3<T> f196146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k3<T> f196147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.recyclerview.widget.o.f<T> f196148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f196149d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f196150e;

        public a(k3<T> k3Var, k3<T> k3Var2, androidx.recyclerview.widget.o.f<T> fVar, int i14, int i15) {
            this.f196146a = k3Var;
            this.f196147b = k3Var2;
            this.f196148c = fVar;
            this.f196149d = i14;
            this.f196150e = i15;
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
        @Override // androidx.recyclerview.widget.o.b
        public final boolean a(int i14, int i15) {
            Object item = this.f196146a.getItem(i14);
            Object item2 = this.f196147b.getItem(i15);
            if (item == item2) {
                return true;
            }
            return this.f196148c.a(item, item2);
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
        @Override // androidx.recyclerview.widget.o.b
        public final boolean b(int i14, int i15) {
            Object item = this.f196146a.getItem(i14);
            Object item2 = this.f196147b.getItem(i15);
            if (item == item2) {
                return true;
            }
            return this.f196148c.b(item, item2);
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
        @Override // androidx.recyclerview.widget.o.b
        public final Object c(int i14, int i15) {
            Object item = this.f196146a.getItem(i14);
            Object item2 = this.f196147b.getItem(i15);
            return item == item2 ? Boolean.TRUE : this.f196148c.c(item, item2);
        }

        @Override // androidx.recyclerview.widget.o.b
        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getF196150e() {
            return this.f196150e;
        }

        @Override // androidx.recyclerview.widget.o.b
        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getF196149d() {
            return this.f196149d;
        }
    }

    public static final <T> j3 a(k3<T> k3Var, k3<T> k3Var2, androidx.recyclerview.widget.o.f<T> fVar) {
        k3Var.getClass();
        k3Var2.getClass();
        fVar.getClass();
        androidx.recyclerview.widget.o.e eVarA = androidx.recyclerview.widget.o.a(new a(k3Var, k3Var2, fVar, k3Var.getF196452f(), k3Var2.getF196452f()));
        boolean z14 = false;
        Iterable iterableO = j23.t.o(0, k3Var.getF196452f());
        if (!(iterableO instanceof Collection) || !((Collection) iterableO).isEmpty()) {
            Iterator<Integer> it = iterableO.iterator();
            while (((j23.k) it).f96801c) {
                if (eVarA.a(((p13.p0) it).nextInt()) != -1) {
                    z14 = true;
                    break;
                }
            }
        }
        return new j3(eVarA, z14);
    }

    public static final <T> void b(k3<T> k3Var, androidx.recyclerview.widget.y yVar, k3<T> k3Var2, j3 j3Var) {
        k3Var.getClass();
        yVar.getClass();
        k3Var2.getClass();
        j3Var.getClass();
        if (j3Var.f196094b) {
            l1.f196136a.getClass();
            l1.a aVar = new l1.a(k3Var, k3Var2, yVar);
            j3Var.f196093a.b(aVar);
            k3<T> k3Var3 = aVar.f196137a;
            int iMin = Math.min(k3Var3.getF196448b(), aVar.f196140d);
            k3<T> k3Var4 = aVar.f196138b;
            int f196448b = k3Var4.getF196448b() - aVar.f196140d;
            androidx.recyclerview.widget.y yVar2 = aVar.f196139c;
            if (f196448b > 0) {
                if (iMin > 0) {
                    yVar2.b(0, iMin, z.PLACEHOLDER_POSITION_CHANGE);
                }
                yVar2.c(0, f196448b);
            } else if (f196448b < 0) {
                yVar2.a(0, -f196448b);
                int i14 = iMin + f196448b;
                if (i14 > 0) {
                    yVar2.b(0, i14, z.PLACEHOLDER_POSITION_CHANGE);
                }
            }
            aVar.f196140d = k3Var4.getF196448b();
            int iMin2 = Math.min(k3Var3.getF196449c(), aVar.f196141e);
            int f196449c = k3Var4.getF196449c();
            int i15 = aVar.f196141e;
            int i16 = f196449c - i15;
            int i17 = aVar.f196140d + aVar.f196142f + i15;
            int i18 = i17 - iMin2;
            boolean z14 = i18 != k3Var3.getSize() - iMin2;
            if (i16 > 0) {
                yVar2.c(i17, i16);
            } else if (i16 < 0) {
                yVar2.a(i17 + i16, -i16);
                iMin2 += i16;
            }
            if (iMin2 > 0 && z14) {
                yVar2.b(i18, iMin2, z.PLACEHOLDER_POSITION_CHANGE);
            }
            aVar.f196141e = k3Var4.getF196449c();
            return;
        }
        a0.f195723a.getClass();
        int iMax = Math.max(k3Var.getF196448b(), k3Var2.getF196448b());
        int iMin3 = Math.min(k3Var.getF196452f() + k3Var.getF196448b(), k3Var2.getF196452f() + k3Var2.getF196448b());
        int i19 = iMin3 - iMax;
        if (i19 > 0) {
            yVar.a(iMax, i19);
            yVar.c(iMax, i19);
        }
        int iMin4 = Math.min(iMax, iMin3);
        int iMax2 = Math.max(iMax, iMin3);
        int f196448b2 = k3Var.getF196448b();
        int size = k3Var2.getSize();
        if (f196448b2 > size) {
            f196448b2 = size;
        }
        int f196452f = k3Var.getF196452f() + k3Var.getF196448b();
        int size2 = k3Var2.getSize();
        if (f196452f > size2) {
            f196452f = size2;
        }
        z zVar = z.ITEM_TO_PLACEHOLDER;
        int i24 = iMin4 - f196448b2;
        if (i24 > 0) {
            yVar.b(f196448b2, i24, zVar);
        }
        int i25 = f196452f - iMax2;
        if (i25 > 0) {
            yVar.b(iMax2, i25, zVar);
        }
        int f196448b3 = k3Var2.getF196448b();
        int size3 = k3Var.getSize();
        if (f196448b3 > size3) {
            f196448b3 = size3;
        }
        int f196452f2 = k3Var2.getF196452f() + k3Var2.getF196448b();
        int size4 = k3Var.getSize();
        if (f196452f2 > size4) {
            f196452f2 = size4;
        }
        z zVar2 = z.PLACEHOLDER_TO_ITEM;
        int i26 = iMin4 - f196448b3;
        if (i26 > 0) {
            yVar.b(f196448b3, i26, zVar2);
        }
        int i27 = f196452f2 - iMax2;
        if (i27 > 0) {
            yVar.b(iMax2, i27, zVar2);
        }
        int size5 = k3Var2.getSize() - k3Var.getSize();
        if (size5 > 0) {
            yVar.c(k3Var.getSize(), size5);
        } else if (size5 < 0) {
            yVar.a(k3Var.getSize() + size5, -size5);
        }
    }

    public static final int c(k3<?> k3Var, j3 j3Var, k3<?> k3Var2, int i14) {
        int iA;
        k3Var.getClass();
        k3Var2.getClass();
        if (!j3Var.f196094b) {
            return j23.t.f(i14, j23.t.o(0, k3Var2.getSize()));
        }
        int f196448b = i14 - k3Var.getF196448b();
        int f196452f = k3Var.getF196452f();
        if (f196448b >= 0 && f196448b < f196452f) {
            for (int i15 = 0; i15 < 30; i15++) {
                int i16 = ((i15 / 2) * (i15 % 2 == 1 ? -1 : 1)) + f196448b;
                if (i16 >= 0 && i16 < k3Var.getF196452f() && (iA = j3Var.f196093a.a(i16)) != -1) {
                    return k3Var2.getF196448b() + iA;
                }
            }
        }
        return j23.t.f(i14, j23.t.o(0, k3Var2.getSize()));
    }
}
