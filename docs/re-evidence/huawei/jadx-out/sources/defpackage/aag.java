package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValue;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public final class aag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final SettableBeanProperty[] f168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final ValueInstantiator f169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f170c;
    protected final HashMap<String, SettableBeanProperty> d;

    protected aag(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, boolean z, boolean z2) {
        this.f169b = valueInstantiator;
        if (z) {
            this.d = d.c(deserializationContext.getConfig().getLocale());
        } else {
            this.d = new HashMap<>();
        }
        int length = settableBeanPropertyArr.length;
        this.f170c = length;
        this.f168a = new SettableBeanProperty[length];
        if (z2) {
            yi config = deserializationContext.getConfig();
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                if (!settableBeanProperty.isIgnorable()) {
                    List<ys> listFindAliases = settableBeanProperty.findAliases(config);
                    if (!listFindAliases.isEmpty()) {
                        Iterator<ys> it = listFindAliases.iterator();
                        while (it.hasNext()) {
                            this.d.put(it.next().b(), settableBeanProperty);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty2 = settableBeanPropertyArr[i];
            this.f168a[i] = settableBeanProperty2;
            if (!settableBeanProperty2.isIgnorable()) {
                this.d.put(settableBeanProperty2.getName(), settableBeanProperty2);
            }
        }
    }

    public static aag c(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, zr zrVar) throws ym {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanPropertyWithValueDeserializer = settableBeanPropertyArr[i];
            if (!settableBeanPropertyWithValueDeserializer.hasValueDeserializer() && !settableBeanPropertyWithValueDeserializer.isInjectionOnly()) {
                settableBeanPropertyWithValueDeserializer = settableBeanPropertyWithValueDeserializer.withValueDeserializer(deserializationContext.findContextualValueDeserializer(settableBeanPropertyWithValueDeserializer.getType(), settableBeanPropertyWithValueDeserializer));
            }
            settableBeanPropertyArr2[i] = settableBeanPropertyWithValueDeserializer;
        }
        return new aag(deserializationContext, valueInstantiator, settableBeanPropertyArr2, zrVar.b(), true);
    }

    public static aag c(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, boolean z) throws ym {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanPropertyWithValueDeserializer = settableBeanPropertyArr[i];
            if (!settableBeanPropertyWithValueDeserializer.hasValueDeserializer()) {
                settableBeanPropertyWithValueDeserializer = settableBeanPropertyWithValueDeserializer.withValueDeserializer(deserializationContext.findContextualValueDeserializer(settableBeanPropertyWithValueDeserializer.getType(), settableBeanPropertyWithValueDeserializer));
            }
            settableBeanPropertyArr2[i] = settableBeanPropertyWithValueDeserializer;
        }
        return new aag(deserializationContext, valueInstantiator, settableBeanPropertyArr2, z, false);
    }

    public Collection<SettableBeanProperty> c() {
        return this.d.values();
    }

    public SettableBeanProperty e(String str) {
        return this.d.get(str);
    }

    public SettableBeanProperty e(int i) {
        for (SettableBeanProperty settableBeanProperty : this.d.values()) {
            if (settableBeanProperty.getPropertyIndex() == i) {
                return settableBeanProperty;
            }
        }
        return null;
    }

    public aai e(JsonParser jsonParser, DeserializationContext deserializationContext, aah aahVar) {
        return new aai(jsonParser, deserializationContext, this.f170c, aahVar);
    }

    public Object a(DeserializationContext deserializationContext, aai aaiVar) throws IOException {
        Object objCreateFromObjectWith = this.f169b.createFromObjectWith(deserializationContext, this.f168a, aaiVar);
        if (objCreateFromObjectWith == null) {
            return objCreateFromObjectWith;
        }
        Object objC = aaiVar.c(deserializationContext, objCreateFromObjectWith);
        for (PropertyValue propertyValueD = aaiVar.d(); propertyValueD != null; propertyValueD = propertyValueD.next) {
            propertyValueD.assign(objC);
        }
        return objC;
    }

    static class d extends HashMap<String, SettableBeanProperty> {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Locale f171a;

        @Deprecated
        public d() {
            this(Locale.getDefault());
        }

        public d(Locale locale) {
            this.f171a = locale;
        }

        public static d c(Locale locale) {
            return new d(locale);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SettableBeanProperty get(Object obj) {
            return (SettableBeanProperty) super.get(((String) obj).toLowerCase(this.f171a));
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SettableBeanProperty put(String str, SettableBeanProperty settableBeanProperty) {
            return (SettableBeanProperty) super.put(str.toLowerCase(this.f171a), settableBeanProperty);
        }
    }
}
