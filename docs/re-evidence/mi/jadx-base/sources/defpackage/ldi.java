package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.b;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ldi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f24941b;
    public final HashMap<String, SettableBeanProperty> c;
    public final SettableBeanProperty[] d;

    public static class a extends HashMap<String, SettableBeanProperty> {
        private static final long serialVersionUID = 1;

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SettableBeanProperty get(Object obj) {
            return (SettableBeanProperty) super.get(((String) obj).toLowerCase());
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SettableBeanProperty put(String str, SettableBeanProperty settableBeanProperty) {
            return (SettableBeanProperty) super.put(str.toLowerCase(), settableBeanProperty);
        }
    }

    public ldi(DeserializationContext deserializationContext, b bVar, SettableBeanProperty[] settableBeanPropertyArr, boolean z, boolean z2) {
        this.f24941b = bVar;
        if (z) {
            this.c = new a();
        } else {
            this.c = new HashMap<>();
        }
        int length = settableBeanPropertyArr.length;
        this.f24940a = length;
        this.d = new SettableBeanProperty[length];
        if (z2) {
            DeserializationConfig config = deserializationContext.getConfig();
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                if (!settableBeanProperty.isIgnorable()) {
                    List<PropertyName> listFindAliases = settableBeanProperty.findAliases(config);
                    if (!listFindAliases.isEmpty()) {
                        Iterator<PropertyName> it = listFindAliases.iterator();
                        while (it.hasNext()) {
                            this.c.put(it.next().getSimpleName(), settableBeanProperty);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty2 = settableBeanPropertyArr[i];
            this.d[i] = settableBeanProperty2;
            if (!settableBeanProperty2.isIgnorable()) {
                this.c.put(settableBeanProperty2.getName(), settableBeanProperty2);
            }
        }
    }

    public static ldi b(DeserializationContext deserializationContext, b bVar, SettableBeanProperty[] settableBeanPropertyArr, BeanPropertyMap beanPropertyMap) throws JsonMappingException {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanPropertyWithValueDeserializer = settableBeanPropertyArr[i];
            if (!settableBeanPropertyWithValueDeserializer.hasValueDeserializer()) {
                settableBeanPropertyWithValueDeserializer = settableBeanPropertyWithValueDeserializer.withValueDeserializer(deserializationContext.findContextualValueDeserializer(settableBeanPropertyWithValueDeserializer.getType(), settableBeanPropertyWithValueDeserializer));
            }
            settableBeanPropertyArr2[i] = settableBeanPropertyWithValueDeserializer;
        }
        return new ldi(deserializationContext, bVar, settableBeanPropertyArr2, beanPropertyMap.isCaseInsensitive(), beanPropertyMap.hasAliases());
    }

    public static ldi c(DeserializationContext deserializationContext, b bVar, SettableBeanProperty[] settableBeanPropertyArr, boolean z) throws JsonMappingException {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanPropertyWithValueDeserializer = settableBeanPropertyArr[i];
            if (!settableBeanPropertyWithValueDeserializer.hasValueDeserializer()) {
                settableBeanPropertyWithValueDeserializer = settableBeanPropertyWithValueDeserializer.withValueDeserializer(deserializationContext.findContextualValueDeserializer(settableBeanPropertyWithValueDeserializer.getType(), settableBeanPropertyWithValueDeserializer));
            }
            settableBeanPropertyArr2[i] = settableBeanPropertyWithValueDeserializer;
        }
        return new ldi(deserializationContext, bVar, settableBeanPropertyArr2, z, false);
    }

    public Object a(DeserializationContext deserializationContext, qdi qdiVar) throws IOException {
        Object objCreateFromObjectWith = this.f24941b.createFromObjectWith(deserializationContext, this.d, qdiVar);
        if (objCreateFromObjectWith != null) {
            objCreateFromObjectWith = qdiVar.h(deserializationContext, objCreateFromObjectWith);
            for (pdi pdiVarF = qdiVar.f(); pdiVarF != null; pdiVarF = pdiVarF.f30292a) {
                pdiVarF.a(objCreateFromObjectWith);
            }
        }
        return objCreateFromObjectWith;
    }

    public SettableBeanProperty d(int i) {
        for (SettableBeanProperty settableBeanProperty : this.c.values()) {
            if (settableBeanProperty.getPropertyIndex() == i) {
                return settableBeanProperty;
            }
        }
        return null;
    }

    public SettableBeanProperty e(String str) {
        return this.c.get(str);
    }

    public Collection<SettableBeanProperty> f() {
        return this.c.values();
    }

    public qdi g(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectIdReader objectIdReader) {
        return new qdi(jsonParser, deserializationContext, this.f24940a, objectIdReader);
    }
}
