package x7;

import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.d1;
import androidx.datastore.preferences.protobuf.e1;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.z;
import androidx.datastore.preferences.protobuf.z0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends x<f, a> implements r0 {
    private static final f DEFAULT_INSTANCE;
    private static volatile z0<f> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private z.d<String> strings_ = d1.f6693d;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        x.n(f.class, fVar);
    }

    private f() {
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
    public static void p(f fVar, Iterable iterable) {
        z.d<String> dVar = fVar.strings_;
        if (!dVar.isModifiable()) {
            int size = dVar.size();
            fVar.strings_ = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        List list = fVar.strings_;
        Charset charset = z.f6936a;
        if (!(iterable instanceof d0)) {
            if (iterable instanceof a1) {
                list.addAll((Collection) iterable);
                return;
            }
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size2 = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size2) + " is null.";
                    for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                        list.remove(size3);
                    }
                    j20.x.l(str);
                    return;
                }
                list.add(obj);
            }
            return;
        }
        List<?> underlyingElements = ((d0) iterable).getUnderlyingElements();
        d0 d0Var = (d0) list;
        int size4 = list.size();
        for (Object obj2 : underlyingElements) {
            if (obj2 == null) {
                String str2 = "Element at index " + (d0Var.size() - size4) + " is null.";
                for (int size5 = d0Var.size() - 1; size5 >= size4; size5--) {
                    d0Var.remove(size5);
                }
                j20.x.l(str2);
                return;
            }
            if (obj2 instanceof androidx.datastore.preferences.protobuf.h) {
                d0Var.s();
            } else if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                androidx.datastore.preferences.protobuf.h.c(0, bArr.length, bArr);
                d0Var.s();
            } else {
                d0Var.add((String) obj2);
            }
        }
    }

    public static f q() {
        return DEFAULT_INSTANCE;
    }

    public static a s() {
        f fVar = DEFAULT_INSTANCE;
        fVar.getClass();
        return (a) ((x.a) fVar.f(x.f.NEW_BUILDER));
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final Object f(x.f fVar) {
        z0 bVar;
        d dVar = null;
        switch (d.f189361a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(dVar);
            case 3:
                return new e1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<f> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (f.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new x.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                com.google.protobuf.a.m();
                return null;
        }
    }

    public final z.d r() {
        return this.strings_;
    }

    public static final class a extends x.a<f, a> implements r0 {
        private a() {
            super(f.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(d dVar) {
            this();
        }
    }
}
