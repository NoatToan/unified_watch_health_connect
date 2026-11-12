package defpackage;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class aea extends Module implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected BeanDeserializerModifier f314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected aec f315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected adz f316c;
    protected aed d;
    protected adx e;
    protected BeanSerializerModifier f;
    protected HashMap<Class<?>, Class<?>> g;
    protected final String h;
    protected adz i;
    protected PropertyNamingStrategy j;
    protected final wu l;
    protected aeb m;
    protected LinkedHashSet<adg> n;

    public aea() {
        String name;
        this.i = null;
        this.f315b = null;
        this.f316c = null;
        this.d = null;
        this.e = null;
        this.m = null;
        this.f314a = null;
        this.f = null;
        this.g = null;
        this.n = null;
        this.j = null;
        if (getClass() == aea.class) {
            name = "SimpleModule-" + System.identityHashCode(this);
        } else {
            name = getClass().getName();
        }
        this.h = name;
        this.l = wu.d();
    }

    public aea(String str) {
        this(str, wu.d());
    }

    public aea(String str, wu wuVar) {
        this.i = null;
        this.f315b = null;
        this.f316c = null;
        this.d = null;
        this.e = null;
        this.m = null;
        this.f314a = null;
        this.f = null;
        this.g = null;
        this.n = null;
        this.j = null;
        this.h = str;
        this.l = wuVar;
    }

    @Override // com.fasterxml.jackson.databind.Module
    public Object getTypeId() {
        if (getClass() == aea.class) {
            return null;
        }
        return super.getTypeId();
    }

    public aea e(JsonSerializer<?> jsonSerializer) {
        d(jsonSerializer, "serializer");
        if (this.i == null) {
            this.i = new adz();
        }
        this.i.c(jsonSerializer);
        return this;
    }

    public <T> aea d(Class<T> cls, JsonDeserializer<? extends T> jsonDeserializer) {
        d(cls, "type to register deserializer for");
        d(jsonDeserializer, "deserializer");
        if (this.f315b == null) {
            this.f315b = new aec();
        }
        this.f315b.e(cls, jsonDeserializer);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.Module
    public String getModuleName() {
        return this.h;
    }

    @Override // com.fasterxml.jackson.databind.Module
    public void setupModule(Module.SetupContext setupContext) {
        adz adzVar = this.i;
        if (adzVar != null) {
            setupContext.addSerializers(adzVar);
        }
        aec aecVar = this.f315b;
        if (aecVar != null) {
            setupContext.addDeserializers(aecVar);
        }
        adz adzVar2 = this.f316c;
        if (adzVar2 != null) {
            setupContext.addKeySerializers(adzVar2);
        }
        aed aedVar = this.d;
        if (aedVar != null) {
            setupContext.addKeyDeserializers(aedVar);
        }
        adx adxVar = this.e;
        if (adxVar != null) {
            setupContext.addAbstractTypeResolver(adxVar);
        }
        aeb aebVar = this.m;
        if (aebVar != null) {
            setupContext.addValueInstantiators(aebVar);
        }
        BeanDeserializerModifier beanDeserializerModifier = this.f314a;
        if (beanDeserializerModifier != null) {
            setupContext.addBeanDeserializerModifier(beanDeserializerModifier);
        }
        BeanSerializerModifier beanSerializerModifier = this.f;
        if (beanSerializerModifier != null) {
            setupContext.addBeanSerializerModifier(beanSerializerModifier);
        }
        LinkedHashSet<adg> linkedHashSet = this.n;
        if (linkedHashSet != null && linkedHashSet.size() > 0) {
            LinkedHashSet<adg> linkedHashSet2 = this.n;
            setupContext.registerSubtypes((adg[]) linkedHashSet2.toArray(new adg[linkedHashSet2.size()]));
        }
        PropertyNamingStrategy propertyNamingStrategy = this.j;
        if (propertyNamingStrategy != null) {
            setupContext.setNamingStrategy(propertyNamingStrategy);
        }
        HashMap<Class<?>, Class<?>> map = this.g;
        if (map != null) {
            for (Map.Entry<Class<?>, Class<?>> entry : map.entrySet()) {
                setupContext.setMixInAnnotations(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.Module, com.fasterxml.jackson.core.Versioned
    public wu version() {
        return this.l;
    }

    protected void d(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("Cannot pass `null` as %s", str));
        }
    }
}
