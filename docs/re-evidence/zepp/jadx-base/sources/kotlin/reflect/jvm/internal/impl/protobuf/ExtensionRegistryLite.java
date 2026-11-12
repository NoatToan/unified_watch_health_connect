package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class ExtensionRegistryLite {
    private static volatile boolean b = false;
    private static final ExtensionRegistryLite c = new ExtensionRegistryLite(true);
    private final Map<a, GeneratedMessageLite.GeneratedExtension<?, ?>> a;

    public static final class a {
        private final Object a;
        private final int b;

        public a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    public ExtensionRegistryLite() {
        this.a = new HashMap();
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        return c;
    }

    public static ExtensionRegistryLite newInstance() {
        return new ExtensionRegistryLite();
    }

    public final void add(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.a.put(new a(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.GeneratedExtension) this.a.get(new a(containingtype, i));
    }

    private ExtensionRegistryLite(boolean z) {
        this.a = Collections.emptyMap();
    }
}
