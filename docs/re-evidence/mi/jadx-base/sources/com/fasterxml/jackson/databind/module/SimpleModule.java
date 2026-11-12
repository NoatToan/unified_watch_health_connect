package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.a;
import com.fasterxml.jackson.databind.deser.b;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import defpackage.esd;
import defpackage.eud;
import defpackage.hh2;
import defpackage.lh2;
import defpackage.vzd;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleModule extends a implements Serializable {
    private static final long serialVersionUID = 1;
    protected SimpleAbstractTypeResolver _abstractTypes;
    protected hh2 _deserializerModifier;
    protected SimpleDeserializers _deserializers;
    protected SimpleKeyDeserializers _keyDeserializers;
    protected SimpleSerializers _keySerializers;
    protected HashMap<Class<?>, Class<?>> _mixins;
    protected final String _name;
    protected PropertyNamingStrategy _namingStrategy;
    protected lh2 _serializerModifier;
    protected SimpleSerializers _serializers;
    protected LinkedHashSet<NamedType> _subtypes;
    protected SimpleValueInstantiators _valueInstantiators;
    protected final Version _version;

    public SimpleModule() {
        String name;
        this._serializers = null;
        this._deserializers = null;
        this._keySerializers = null;
        this._keyDeserializers = null;
        this._abstractTypes = null;
        this._valueInstantiators = null;
        this._deserializerModifier = null;
        this._serializerModifier = null;
        this._mixins = null;
        this._subtypes = null;
        this._namingStrategy = null;
        if (getClass() == SimpleModule.class) {
            name = "SimpleModule-" + System.identityHashCode(this);
        } else {
            name = getClass().getName();
        }
        this._name = name;
        this._version = Version.unknownVersion();
    }

    public void _checkNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("Cannot pass `null` as %s", str));
        }
    }

    public <T> SimpleModule addAbstractTypeMapping(Class<T> cls, Class<? extends T> cls2) {
        _checkNotNull(cls, "abstract type to map");
        _checkNotNull(cls2, "concrete type to map to");
        if (this._abstractTypes == null) {
            this._abstractTypes = new SimpleAbstractTypeResolver();
        }
        this._abstractTypes = this._abstractTypes.addMapping(cls, cls2);
        return this;
    }

    public <T> SimpleModule addDeserializer(Class<T> cls, esd<? extends T> esdVar) {
        _checkNotNull(cls, "type to register deserializer for");
        _checkNotNull(esdVar, "deserializer");
        if (this._deserializers == null) {
            this._deserializers = new SimpleDeserializers();
        }
        this._deserializers.addDeserializer(cls, esdVar);
        return this;
    }

    public SimpleModule addKeyDeserializer(Class<?> cls, vzd vzdVar) {
        _checkNotNull(cls, "type to register key deserializer for");
        _checkNotNull(vzdVar, "key deserializer");
        if (this._keyDeserializers == null) {
            this._keyDeserializers = new SimpleKeyDeserializers();
        }
        this._keyDeserializers.addDeserializer(cls, vzdVar);
        return this;
    }

    public <T> SimpleModule addKeySerializer(Class<? extends T> cls, eud<T> eudVar) {
        _checkNotNull(cls, "type to register key serializer for");
        _checkNotNull(eudVar, "key serializer");
        if (this._keySerializers == null) {
            this._keySerializers = new SimpleSerializers();
        }
        this._keySerializers.addSerializer(cls, eudVar);
        return this;
    }

    public SimpleModule addSerializer(eud<?> eudVar) {
        _checkNotNull(eudVar, "serializer");
        if (this._serializers == null) {
            this._serializers = new SimpleSerializers();
        }
        this._serializers.addSerializer(eudVar);
        return this;
    }

    public SimpleModule addValueInstantiator(Class<?> cls, b bVar) {
        _checkNotNull(cls, "class to register value instantiator for");
        _checkNotNull(bVar, "value instantiator");
        if (this._valueInstantiators == null) {
            this._valueInstantiators = new SimpleValueInstantiators();
        }
        this._valueInstantiators = this._valueInstantiators.addValueInstantiator(cls, bVar);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.a
    public String getModuleName() {
        return this._name;
    }

    @Override // com.fasterxml.jackson.databind.a
    public Object getTypeId() {
        if (getClass() == SimpleModule.class) {
            return null;
        }
        return super.getTypeId();
    }

    public SimpleModule registerSubtypes(Class<?>... clsArr) {
        if (this._subtypes == null) {
            this._subtypes = new LinkedHashSet<>();
        }
        for (Class<?> cls : clsArr) {
            _checkNotNull(cls, "subtype to register");
            this._subtypes.add(new NamedType(cls));
        }
        return this;
    }

    public void setAbstractTypes(SimpleAbstractTypeResolver simpleAbstractTypeResolver) {
        this._abstractTypes = simpleAbstractTypeResolver;
    }

    public SimpleModule setDeserializerModifier(hh2 hh2Var) {
        this._deserializerModifier = hh2Var;
        return this;
    }

    public void setDeserializers(SimpleDeserializers simpleDeserializers) {
        this._deserializers = simpleDeserializers;
    }

    public void setKeyDeserializers(SimpleKeyDeserializers simpleKeyDeserializers) {
        this._keyDeserializers = simpleKeyDeserializers;
    }

    public void setKeySerializers(SimpleSerializers simpleSerializers) {
        this._keySerializers = simpleSerializers;
    }

    public SimpleModule setMixInAnnotation(Class<?> cls, Class<?> cls2) {
        _checkNotNull(cls, "target type");
        _checkNotNull(cls2, "mixin class");
        if (this._mixins == null) {
            this._mixins = new HashMap<>();
        }
        this._mixins.put(cls, cls2);
        return this;
    }

    public SimpleModule setNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this._namingStrategy = propertyNamingStrategy;
        return this;
    }

    public SimpleModule setSerializerModifier(lh2 lh2Var) {
        this._serializerModifier = lh2Var;
        return this;
    }

    public void setSerializers(SimpleSerializers simpleSerializers) {
        this._serializers = simpleSerializers;
    }

    public void setValueInstantiators(SimpleValueInstantiators simpleValueInstantiators) {
        this._valueInstantiators = simpleValueInstantiators;
    }

    @Override // com.fasterxml.jackson.databind.a
    public void setupModule(a.InterfaceC0177a interfaceC0177a) {
        SimpleSerializers simpleSerializers = this._serializers;
        if (simpleSerializers != null) {
            interfaceC0177a.b(simpleSerializers);
        }
        SimpleDeserializers simpleDeserializers = this._deserializers;
        if (simpleDeserializers != null) {
            interfaceC0177a.h(simpleDeserializers);
        }
        SimpleSerializers simpleSerializers2 = this._keySerializers;
        if (simpleSerializers2 != null) {
            interfaceC0177a.k(simpleSerializers2);
        }
        SimpleKeyDeserializers simpleKeyDeserializers = this._keyDeserializers;
        if (simpleKeyDeserializers != null) {
            interfaceC0177a.a(simpleKeyDeserializers);
        }
        SimpleAbstractTypeResolver simpleAbstractTypeResolver = this._abstractTypes;
        if (simpleAbstractTypeResolver != null) {
            interfaceC0177a.j(simpleAbstractTypeResolver);
        }
        SimpleValueInstantiators simpleValueInstantiators = this._valueInstantiators;
        if (simpleValueInstantiators != null) {
            interfaceC0177a.f(simpleValueInstantiators);
        }
        hh2 hh2Var = this._deserializerModifier;
        if (hh2Var != null) {
            interfaceC0177a.d(hh2Var);
        }
        lh2 lh2Var = this._serializerModifier;
        if (lh2Var != null) {
            interfaceC0177a.e(lh2Var);
        }
        LinkedHashSet<NamedType> linkedHashSet = this._subtypes;
        if (linkedHashSet != null && linkedHashSet.size() > 0) {
            LinkedHashSet<NamedType> linkedHashSet2 = this._subtypes;
            interfaceC0177a.g((NamedType[]) linkedHashSet2.toArray(new NamedType[linkedHashSet2.size()]));
        }
        PropertyNamingStrategy propertyNamingStrategy = this._namingStrategy;
        if (propertyNamingStrategy != null) {
            interfaceC0177a.l(propertyNamingStrategy);
        }
        HashMap<Class<?>, Class<?>> map = this._mixins;
        if (map != null) {
            for (Map.Entry<Class<?>, Class<?>> entry : map.entrySet()) {
                interfaceC0177a.i(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.a
    public Version version() {
        return this._version;
    }

    public <T> SimpleModule addSerializer(Class<? extends T> cls, eud<T> eudVar) {
        _checkNotNull(cls, "type to register serializer for");
        _checkNotNull(eudVar, "serializer");
        if (this._serializers == null) {
            this._serializers = new SimpleSerializers();
        }
        this._serializers.addSerializer(cls, eudVar);
        return this;
    }

    public SimpleModule registerSubtypes(NamedType... namedTypeArr) {
        if (this._subtypes == null) {
            this._subtypes = new LinkedHashSet<>();
        }
        for (NamedType namedType : namedTypeArr) {
            _checkNotNull(namedType, "subtype to register");
            this._subtypes.add(namedType);
        }
        return this;
    }

    public SimpleModule registerSubtypes(Collection<Class<?>> collection) {
        if (this._subtypes == null) {
            this._subtypes = new LinkedHashSet<>();
        }
        for (Class<?> cls : collection) {
            _checkNotNull(cls, "subtype to register");
            this._subtypes.add(new NamedType(cls));
        }
        return this;
    }

    public SimpleModule(String str) {
        this(str, Version.unknownVersion());
    }

    public SimpleModule(Version version) {
        this._serializers = null;
        this._deserializers = null;
        this._keySerializers = null;
        this._keyDeserializers = null;
        this._abstractTypes = null;
        this._valueInstantiators = null;
        this._deserializerModifier = null;
        this._serializerModifier = null;
        this._mixins = null;
        this._subtypes = null;
        this._namingStrategy = null;
        this._name = version.getArtifactId();
        this._version = version;
    }

    public SimpleModule(String str, Version version) {
        this._serializers = null;
        this._deserializers = null;
        this._keySerializers = null;
        this._keyDeserializers = null;
        this._abstractTypes = null;
        this._valueInstantiators = null;
        this._deserializerModifier = null;
        this._serializerModifier = null;
        this._mixins = null;
        this._subtypes = null;
        this._namingStrategy = null;
        this._name = str;
        this._version = version;
    }

    public SimpleModule(String str, Version version, Map<Class<?>, esd<?>> map) {
        this(str, version, map, null);
    }

    public SimpleModule(String str, Version version, List<eud<?>> list) {
        this(str, version, null, list);
    }

    public SimpleModule(String str, Version version, Map<Class<?>, esd<?>> map, List<eud<?>> list) {
        this._serializers = null;
        this._deserializers = null;
        this._keySerializers = null;
        this._keyDeserializers = null;
        this._abstractTypes = null;
        this._valueInstantiators = null;
        this._deserializerModifier = null;
        this._serializerModifier = null;
        this._mixins = null;
        this._subtypes = null;
        this._namingStrategy = null;
        this._name = str;
        this._version = version;
        if (map != null) {
            this._deserializers = new SimpleDeserializers(map);
        }
        if (list != null) {
            this._serializers = new SimpleSerializers(list);
        }
    }
}
