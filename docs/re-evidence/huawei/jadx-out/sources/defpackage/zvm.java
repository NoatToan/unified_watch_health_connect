package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.option.OptionDefinition;
import org.eclipse.californium.core.coap.option.OptionRegistry;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zvm implements OptionRegistry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f54613b = aaex.a((Class<?>) zvm.class);
    protected final Map<Integer, OptionDefinition> e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, OptionDefinition> f54614c = new ConcurrentHashMap();

    @Deprecated
    protected OptionDefinition d(int i) {
        return null;
    }

    public zvm(OptionDefinition... optionDefinitionArr) {
        try {
            for (OptionDefinition optionDefinition : optionDefinitionArr) {
                a(optionDefinition);
            }
        } catch (IllegalArgumentException e) {
            f54613b.error("{}", e.getMessage());
            throw e;
        }
    }

    protected void b(OptionRegistry optionRegistry) {
        for (OptionRegistry.Entry entry : optionRegistry) {
            d(entry.getKey(), entry.getOptioneDefinition());
        }
    }

    protected void a(OptionDefinition optionDefinition) {
        d(d(0, optionDefinition.getNumber()), optionDefinition);
    }

    protected void d(int i, OptionDefinition optionDefinition) {
        synchronized (this) {
            OptionDefinition optionDefinition2 = this.e.get(Integer.valueOf(i));
            if (optionDefinition2 != null) {
                throw new IllegalArgumentException("Number " + optionDefinition.getNumber() + " already in use for " + optionDefinition2.getName());
            }
            OptionDefinition optionDefinition3 = this.f54614c.get(optionDefinition.getName());
            if (optionDefinition3 != null) {
                throw new IllegalArgumentException("Name " + optionDefinition.getName() + " already in use for " + optionDefinition3.getNumber());
            }
            this.e.put(Integer.valueOf(i), optionDefinition);
            this.f54614c.put(optionDefinition.getName(), optionDefinition);
        }
    }

    @Override // org.eclipse.californium.core.coap.option.OptionRegistry
    public OptionDefinition getDefinitionByNumber(int i, int i2) {
        int iD = d(i, i2);
        OptionDefinition optionDefinitionA = a(iD);
        return (optionDefinitionA == null && iD == i2) ? d(i2) : optionDefinitionA;
    }

    @Override // org.eclipse.californium.core.coap.option.OptionRegistry
    public OptionDefinition getDefinitionByNumber(int i) {
        OptionDefinition optionDefinitionA = a(d(0, i));
        return optionDefinitionA == null ? d(i) : optionDefinitionA;
    }

    protected OptionDefinition a(int i) {
        return this.e.get(Integer.valueOf(i));
    }

    @Override // org.eclipse.californium.core.coap.option.OptionRegistry
    public OptionDefinition getDefinitionByName(String str) {
        return this.f54614c.get(str);
    }

    @Override // org.eclipse.californium.core.coap.option.OptionRegistry
    public boolean contains(OptionDefinition optionDefinition) {
        if (this.e.containsValue(optionDefinition)) {
            return true;
        }
        OptionDefinition optionDefinition2 = this.e.get(Integer.valueOf(optionDefinition.getNumber()));
        if (optionDefinition2 == null) {
            return false;
        }
        Logger logger = f54613b;
        int number = optionDefinition.getNumber();
        logger.debug("{}/{} => {}/{}: {}.", Integer.valueOf(number), optionDefinition.getName(), Integer.valueOf(optionDefinition2.getNumber()), optionDefinition2.getName(), Boolean.valueOf(optionDefinition2 == optionDefinition));
        return optionDefinition.equals(optionDefinition2);
    }

    @Override // java.lang.Iterable
    public Iterator<OptionRegistry.Entry> iterator() {
        return new Iterator<OptionRegistry.Entry>() { // from class: zvm.1
            private final Iterator<Map.Entry<Integer, OptionDefinition>> e;

            {
                this.e = zvm.this.e.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.e.hasNext();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public OptionRegistry.Entry next() {
                return new d(this.e.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.e.remove();
            }
        };
    }

    static class d implements OptionRegistry.Entry {
        private final Map.Entry<Integer, OptionDefinition> d;

        private d(Map.Entry<Integer, OptionDefinition> entry) {
            this.d = entry;
        }

        @Override // org.eclipse.californium.core.coap.option.OptionRegistry.Entry
        public int getKey() {
            return this.d.getKey().intValue();
        }

        @Override // org.eclipse.californium.core.coap.option.OptionRegistry.Entry
        public OptionDefinition getOptioneDefinition() {
            return this.d.getValue();
        }
    }

    protected static int d(int i, int i2) {
        if (i2 <= 65535 && i2 >= 0) {
            return CoAP.e(i) == CoAP.CodeClass.SIGNAL.value ? (i2 & 65535) + (i << 16) : i2;
        }
        throw new IllegalArgumentException(i2 + " invalid option number!");
    }
}
