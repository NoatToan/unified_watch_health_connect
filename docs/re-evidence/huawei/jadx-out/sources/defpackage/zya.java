package defpackage;

import java.net.InetSocketAddress;
import java.security.Principal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.californium.elements.EndpointContext;

/* JADX INFO: loaded from: classes20.dex */
public class zya extends zxr {
    public static final zxv<zxs<?>> u = new zxv<zxs<?>>("EndpointContextAttributes") { // from class: zya.4
        @Override // defpackage.zxv
        public zxs<?> d(zxs<?> zxsVar) {
            zxsVar.getClass();
            Class<?> valueType = zxsVar.getValueType();
            if (valueType != String.class && valueType != Integer.class && valueType != Long.class && valueType != Boolean.class && valueType != InetSocketAddress.class && !zzg.class.isAssignableFrom(valueType)) {
                throw new IllegalArgumentException(valueType + " is not supported, only String, Integer, Long, Boolean, InetSocketAddress and Bytes!");
            }
            return super.d(zxsVar);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f54763c;
    private final Map<zxs<?>, Object> e;

    public zya(InetSocketAddress inetSocketAddress, Principal principal, e eVar) {
        this(inetSocketAddress, null, principal, eVar);
    }

    public zya(InetSocketAddress inetSocketAddress, String str, Principal principal, e eVar) {
        super(inetSocketAddress, str, principal);
        if (eVar == null) {
            throw new NullPointerException("missing attributes map, must not be null!");
        }
        eVar.c();
        Map<zxs<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(eVar.d);
        this.e = mapUnmodifiableMap;
        this.f54763c = c(mapUnmodifiableMap);
    }

    private static final boolean c(Map<zxs<?>, Object> map) {
        Iterator<zxs<?>> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!it.next().getKey().startsWith("*")) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zxr, org.eclipse.californium.elements.EndpointContext
    public <T> T get(zxs<T> zxsVar) {
        return (T) this.e.get(zxsVar);
    }

    @Override // defpackage.zxr, org.eclipse.californium.elements.EndpointContext
    public Map<zxs<?>, Object> entries() {
        return this.e;
    }

    @Override // defpackage.zxr, org.eclipse.californium.elements.EndpointContext
    public boolean hasCriticalEntries() {
        return this.f54763c;
    }

    @Override // defpackage.zxr
    public String toString() {
        return String.format("MAP(%s)", c());
    }

    public static zya a(EndpointContext endpointContext, e eVar) {
        return new zya(endpointContext.getPeerAddress(), endpointContext.getVirtualHost(), endpointContext.getPeerIdentity(), eVar);
    }

    public static zya d(EndpointContext endpointContext, e eVar) {
        e eVar2 = new e(endpointContext.entries());
        eVar2.d(eVar);
        return a(endpointContext, eVar2);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f54764a;
        private final Map<zxs<?>, Object> d;

        public e() {
            this.d = new HashMap();
        }

        private e(Map<zxs<?>, Object> map) {
            HashMap map2 = new HashMap();
            this.d = map2;
            map2.putAll(map);
        }

        public e c() {
            this.f54764a = true;
            return this;
        }

        public e d(e eVar) {
            if (this.f54764a) {
                throw new IllegalStateException("Already in use!");
            }
            this.d.putAll(eVar.d);
            return this;
        }

        public <T> e d(zxs<T> zxsVar, T t) {
            if (this.f54764a) {
                throw new IllegalStateException("Already in use!");
            }
            if (zxsVar == null) {
                throw new NullPointerException("key is null");
            }
            if (t == null && !zxsVar.getKey().startsWith("*")) {
                throw new NullPointerException("value is null");
            }
            if (!zya.u.e(zxsVar)) {
                throw new IllegalArgumentException(zxsVar + " is not supported!");
            }
            if (t == null) {
                this.d.remove(zxsVar);
                return this;
            }
            if (this.d.put(zxsVar, t) == null) {
                return this;
            }
            throw new IllegalArgumentException("'" + zxsVar + "' already contained!");
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof e)) {
                return this.d.equals(((e) obj).d);
            }
            return false;
        }
    }
}
