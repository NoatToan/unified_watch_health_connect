package com.google.protobuf;

import com.huami.watch.notification.TransportUri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ExtensionRegistryLite {
    private static volatile boolean b = false;
    private static boolean c = true;
    public static final String d = "com.google.protobuf.Extension";
    private static volatile ExtensionRegistryLite e;
    public static final ExtensionRegistryLite f = new ExtensionRegistryLite(true);
    private final Map<b, GeneratedMessageLite.GeneratedExtension<?, ?>> a;

    public static class a {
        public static final Class<?> a = a();

        private a() {
        }

        public static Class<?> a() {
            try {
                return Class.forName(ExtensionRegistryLite.d);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
    }

    public static final class b {
        private final Object a;
        private final int b;

        public b(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    public ExtensionRegistryLite() {
        this.a = new HashMap();
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        ExtensionRegistryLite extensionRegistryLiteB = e;
        if (extensionRegistryLiteB == null) {
            synchronized (ExtensionRegistryLite.class) {
                extensionRegistryLiteB = e;
                if (extensionRegistryLiteB == null) {
                    extensionRegistryLiteB = c ? d.b() : f;
                    e = extensionRegistryLiteB;
                }
            }
        }
        return extensionRegistryLiteB;
    }

    public static boolean isEagerlyParseMessageSets() {
        return b;
    }

    public static ExtensionRegistryLite newInstance() {
        return c ? d.a() : new ExtensionRegistryLite();
    }

    public static void setEagerlyParseMessageSets(boolean z) {
        b = z;
    }

    public final void add(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.a.put(new b(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.GeneratedExtension) this.a.get(new b(containingtype, i));
    }

    public ExtensionRegistryLite getUnmodifiable() {
        return new ExtensionRegistryLite(this);
    }

    public ExtensionRegistryLite(ExtensionRegistryLite extensionRegistryLite) {
        if (extensionRegistryLite == f) {
            this.a = Collections.emptyMap();
        } else {
            this.a = Collections.unmodifiableMap(extensionRegistryLite.a);
        }
    }

    public final void add(ExtensionLite<?, ?> extensionLite) {
        if (GeneratedMessageLite.GeneratedExtension.class.isAssignableFrom(extensionLite.getClass())) {
            add((GeneratedMessageLite.GeneratedExtension<?, ?>) extensionLite);
        }
        if (c && d.d(this)) {
            try {
                getClass().getMethod(TransportUri.ACTION_ADD, a.a).invoke(this, extensionLite);
            } catch (Exception e2) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", extensionLite), e2);
            }
        }
    }

    public ExtensionRegistryLite(boolean z) {
        this.a = Collections.emptyMap();
    }
}
