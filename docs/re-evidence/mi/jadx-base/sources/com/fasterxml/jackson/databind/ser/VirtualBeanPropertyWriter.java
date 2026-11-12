package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.ser.impl.a;
import defpackage.e5q;
import defpackage.eud;
import defpackage.ih2;
import defpackage.ld1;
import defpackage.wwl;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VirtualBeanPropertyWriter extends BeanPropertyWriter implements Serializable {
    private static final long serialVersionUID = 1;

    @Deprecated
    public VirtualBeanPropertyWriter(ih2 ih2Var, ld1 ld1Var, JavaType javaType, eud<?> eudVar, e5q e5qVar, JavaType javaType2, JsonInclude.Value value) {
        this(ih2Var, ld1Var, javaType, eudVar, e5qVar, javaType2, value, null);
    }

    public static boolean _suppressNulls(JsonInclude.Value value) {
        JsonInclude.Include valueInclusion;
        return (value == null || (valueInclusion = value.getValueInclusion()) == JsonInclude.Include.ALWAYS || valueInclusion == JsonInclude.Include.USE_DEFAULTS) ? false : true;
    }

    public static Object _suppressableValue(JsonInclude.Value value) {
        if (value == null) {
            return Boolean.FALSE;
        }
        JsonInclude.Include valueInclusion = value.getValueInclusion();
        if (valueInclusion == JsonInclude.Include.ALWAYS || valueInclusion == JsonInclude.Include.NON_NULL || valueInclusion == JsonInclude.Include.USE_DEFAULTS) {
            return null;
        }
        return BeanPropertyWriter.MARKER_FOR_EMPTY;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase
    public boolean isVirtual() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception {
        Object objValue = value(obj, jsonGenerator, wwlVar);
        if (objValue == null) {
            eud<Object> eudVar = this._nullSerializer;
            if (eudVar != null) {
                eudVar.serialize(null, jsonGenerator, wwlVar);
                return;
            } else {
                jsonGenerator.s0();
                return;
            }
        }
        eud<?> eudVar_findAndAddDynamic = this._serializer;
        if (eudVar_findAndAddDynamic == null) {
            Class<?> cls = objValue.getClass();
            a aVar = this._dynamicSerializers;
            eud<?> eudVarI = aVar.i(cls);
            eudVar_findAndAddDynamic = eudVarI == null ? _findAndAddDynamic(aVar, cls, wwlVar) : eudVarI;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (BeanPropertyWriter.MARKER_FOR_EMPTY == obj2) {
                if (eudVar_findAndAddDynamic.isEmpty(wwlVar, objValue)) {
                    serializeAsPlaceholder(obj, jsonGenerator, wwlVar);
                    return;
                }
            } else if (obj2.equals(objValue)) {
                serializeAsPlaceholder(obj, jsonGenerator, wwlVar);
                return;
            }
        }
        if (objValue == obj && _handleSelfReference(obj, jsonGenerator, wwlVar, eudVar_findAndAddDynamic)) {
            return;
        }
        e5q e5qVar = this._typeSerializer;
        if (e5qVar == null) {
            eudVar_findAndAddDynamic.serialize(objValue, jsonGenerator, wwlVar);
        } else {
            eudVar_findAndAddDynamic.serializeWithType(objValue, jsonGenerator, wwlVar, e5qVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception {
        Object objValue = value(obj, jsonGenerator, wwlVar);
        if (objValue == null) {
            if (this._nullSerializer != null) {
                jsonGenerator.o0(this._name);
                this._nullSerializer.serialize(null, jsonGenerator, wwlVar);
                return;
            }
            return;
        }
        eud<?> eudVar_findAndAddDynamic = this._serializer;
        if (eudVar_findAndAddDynamic == null) {
            Class<?> cls = objValue.getClass();
            a aVar = this._dynamicSerializers;
            eud<?> eudVarI = aVar.i(cls);
            eudVar_findAndAddDynamic = eudVarI == null ? _findAndAddDynamic(aVar, cls, wwlVar) : eudVarI;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (BeanPropertyWriter.MARKER_FOR_EMPTY == obj2) {
                if (eudVar_findAndAddDynamic.isEmpty(wwlVar, objValue)) {
                    return;
                }
            } else if (obj2.equals(objValue)) {
                return;
            }
        }
        if (objValue == obj && _handleSelfReference(obj, jsonGenerator, wwlVar, eudVar_findAndAddDynamic)) {
            return;
        }
        jsonGenerator.o0(this._name);
        e5q e5qVar = this._typeSerializer;
        if (e5qVar == null) {
            eudVar_findAndAddDynamic.serialize(objValue, jsonGenerator, wwlVar);
        } else {
            eudVar_findAndAddDynamic.serializeWithType(objValue, jsonGenerator, wwlVar, e5qVar);
        }
    }

    public abstract Object value(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception;

    public abstract VirtualBeanPropertyWriter withConfig(MapperConfig<?> mapperConfig, com.fasterxml.jackson.databind.introspect.a aVar, ih2 ih2Var, JavaType javaType);

    public VirtualBeanPropertyWriter(ih2 ih2Var, ld1 ld1Var, JavaType javaType) {
        this(ih2Var, ld1Var, javaType, null, null, null, ih2Var.c());
    }

    public VirtualBeanPropertyWriter() {
    }

    public VirtualBeanPropertyWriter(ih2 ih2Var, ld1 ld1Var, JavaType javaType, eud<?> eudVar, e5q e5qVar, JavaType javaType2, JsonInclude.Value value, Class<?>[] clsArr) {
        super(ih2Var, ih2Var.s(), ld1Var, javaType, eudVar, e5qVar, javaType2, _suppressNulls(value), _suppressableValue(value), clsArr);
    }

    public VirtualBeanPropertyWriter(VirtualBeanPropertyWriter virtualBeanPropertyWriter) {
        super(virtualBeanPropertyWriter);
    }

    public VirtualBeanPropertyWriter(VirtualBeanPropertyWriter virtualBeanPropertyWriter, PropertyName propertyName) {
        super(virtualBeanPropertyWriter, propertyName);
    }
}
