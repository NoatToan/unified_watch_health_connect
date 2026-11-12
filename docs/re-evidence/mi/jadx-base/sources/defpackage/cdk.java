package defpackage;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.b0;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public final class cdk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f5222a = Logger.getLogger(cdk.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentMap<String, d> f5223b = new ConcurrentHashMap();
    public static final ConcurrentMap<String, c> c = new ConcurrentHashMap();
    public static final ConcurrentMap<String, Boolean> d = new ConcurrentHashMap();
    public static final ConcurrentMap<String, Object> e = new ConcurrentHashMap();
    public static final ConcurrentMap<Class<?>, x8i<?, ?>> f = new ConcurrentHashMap();

    public class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o0e f5224a;

        public a(o0e o0eVar) {
            this.f5224a = o0eVar;
        }

        @Override // cdk.d
        public Class<?> a() {
            return this.f5224a.getClass();
        }

        @Override // cdk.d
        public <Q> a0e<Q> b(Class<Q> cls) throws GeneralSecurityException {
            try {
                return new b0e(this.f5224a, cls);
            } catch (IllegalArgumentException e) {
                throw new GeneralSecurityException("Primitive type not supported", e);
            }
        }

        @Override // cdk.d
        public Set<Class<?>> c() {
            return this.f5224a.h();
        }

        @Override // cdk.d
        public a0e<?> d() {
            o0e o0eVar = this.f5224a;
            return new b0e(o0eVar, o0eVar.a());
        }
    }

    public class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o0e f5225a;

        public b(o0e o0eVar) {
            this.f5225a = o0eVar;
        }
    }

    public interface c {
    }

    public interface d {
        Class<?> a();

        <P> a0e<P> b(Class<P> cls) throws GeneralSecurityException;

        Set<Class<?>> c();

        a0e<?> d();
    }

    public static <T> T a(T t) {
        t.getClass();
        return t;
    }

    public static <KeyProtoT extends b0> d b(o0e<KeyProtoT> o0eVar) {
        return new a(o0eVar);
    }

    public static <KeyProtoT extends b0> c c(o0e<KeyProtoT> o0eVar) {
        return new b(o0eVar);
    }

    public static synchronized void d(String str, Class<?> cls, boolean z) throws GeneralSecurityException {
        ConcurrentMap<String, d> concurrentMap = f5223b;
        if (concurrentMap.containsKey(str)) {
            d dVar = concurrentMap.get(str);
            if (!dVar.a().equals(cls)) {
                f5222a.warning("Attempted overwrite of a registered key manager for key type " + str);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, dVar.a().getName(), cls.getName()));
            }
            if (z && !d.get(str).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
            }
        }
    }

    public static Class<?> e(Class<?> cls) {
        x8i<?, ?> x8iVar = f.get(cls);
        if (x8iVar == null) {
            return null;
        }
        return x8iVar.a();
    }

    public static synchronized d f(String str) throws GeneralSecurityException {
        ConcurrentMap<String, d> concurrentMap;
        concurrentMap = f5223b;
        if (!concurrentMap.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return concurrentMap.get(str);
    }

    public static <P> a0e<P> g(String str, Class<P> cls) throws GeneralSecurityException {
        d dVarF = f(str);
        if (cls == null) {
            return (a0e<P>) dVarF.d();
        }
        if (dVarF.c().contains(cls)) {
            return dVarF.b(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + dVarF.a() + ", supported primitives: " + s(dVarF.c()));
    }

    public static <P> P h(String str, ByteString byteString, Class<P> cls) throws GeneralSecurityException {
        return (P) j(str, byteString, (Class) a(cls));
    }

    public static <P> P i(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) h(str, ByteString.copyFrom(bArr), cls);
    }

    public static <P> P j(String str, ByteString byteString, Class<P> cls) throws GeneralSecurityException {
        return (P) g(str, cls).c(byteString);
    }

    public static <P> v8i<P> k(i1e i1eVar, a0e<P> a0eVar, Class<P> cls) throws GeneralSecurityException {
        return m(i1eVar, a0eVar, (Class) a(cls));
    }

    public static <P> v8i<P> l(i1e i1eVar, Class<P> cls) throws GeneralSecurityException {
        return k(i1eVar, null, cls);
    }

    public static <P> v8i<P> m(i1e i1eVar, a0e<P> a0eVar, Class<P> cls) throws GeneralSecurityException {
        xlq.d(i1eVar.f());
        v8i<P> v8iVarF = v8i.f(cls);
        for (com.google.crypto.tink.proto.a.c cVar : i1eVar.f().J()) {
            if (cVar.K() == KeyStatusType.ENABLED) {
                v8i.b<P> bVarA = v8iVarF.a((a0eVar == null || !a0eVar.a(cVar.H().I())) ? (P) j(cVar.H().I(), cVar.H().J(), cls) : a0eVar.c(cVar.H().J()), cVar);
                if (cVar.I() == i1eVar.f().K()) {
                    v8iVarF.g(bVarA);
                }
            }
        }
        return v8iVarF;
    }

    public static a0e<?> n(String str) throws GeneralSecurityException {
        return f(str).d();
    }

    public static synchronized b0 o(k0e k0eVar) throws GeneralSecurityException {
        a0e<?> a0eVarN;
        a0eVarN = n(k0eVar.I());
        if (!d.get(k0eVar.I()).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + k0eVar.I());
        }
        return a0eVarN.d(k0eVar.J());
    }

    public static synchronized KeyData p(k0e k0eVar) throws GeneralSecurityException {
        a0e<?> a0eVarN;
        a0eVarN = n(k0eVar.I());
        if (!d.get(k0eVar.I()).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + k0eVar.I());
        }
        return a0eVarN.b(k0eVar.J());
    }

    public static synchronized <KeyProtoT extends b0> void q(o0e<KeyProtoT> o0eVar, boolean z) throws GeneralSecurityException {
        try {
            if (o0eVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String strC = o0eVar.c();
            d(strC, o0eVar.getClass(), z);
            ConcurrentMap<String, d> concurrentMap = f5223b;
            if (!concurrentMap.containsKey(strC)) {
                concurrentMap.put(strC, b(o0eVar));
                c.put(strC, c(o0eVar));
            }
            d.put(strC, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized <B, P> void r(x8i<B, P> x8iVar) throws GeneralSecurityException {
        try {
            if (x8iVar == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class<P> clsB = x8iVar.b();
            ConcurrentMap<Class<?>, x8i<?, ?>> concurrentMap = f;
            if (concurrentMap.containsKey(clsB)) {
                x8i<?, ?> x8iVar2 = concurrentMap.get(clsB);
                if (!x8iVar.getClass().equals(x8iVar2.getClass())) {
                    f5222a.warning("Attempted overwrite of a registered SetWrapper for type " + clsB);
                    throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", clsB.getName(), x8iVar2.getClass().getName(), x8iVar.getClass().getName()));
                }
            }
            concurrentMap.put(clsB, x8iVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static String s(Set<Class<?>> set) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls : set) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls.getCanonicalName());
            z = false;
        }
        return sb.toString();
    }

    public static <B, P> P t(v8i<B> v8iVar, Class<P> cls) throws GeneralSecurityException {
        x8i<?, ?> x8iVar = f.get(cls);
        if (x8iVar == null) {
            throw new GeneralSecurityException("No wrapper found for " + v8iVar.d().getName());
        }
        if (x8iVar.a().equals(v8iVar.d())) {
            return (P) x8iVar.c(v8iVar);
        }
        throw new GeneralSecurityException("Wrong input primitive class, expected " + x8iVar.a() + ", got " + v8iVar.d());
    }
}
