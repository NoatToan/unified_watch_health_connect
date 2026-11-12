package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.ak4;
import defpackage.cj4;
import defpackage.dqk;
import defpackage.e5q;
import defpackage.eud;
import defpackage.h04;
import defpackage.ksd;
import defpackage.rfl;
import defpackage.wwl;
import defpackage.zsd;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public class StdDelegatingSerializer extends StdSerializer<Object> implements cj4, dqk, rfl {
    protected final ak4<Object, ?> _converter;
    protected final eud<Object> _delegateSerializer;
    protected final JavaType _delegateType;

    public <T> StdDelegatingSerializer(Class<T> cls, ak4<T, ?> ak4Var) {
        super(cls, false);
        this._converter = ak4Var;
        this._delegateType = null;
        this._delegateSerializer = null;
    }

    public eud<Object> _findSerializer(Object obj, wwl wwlVar) throws JsonMappingException {
        return wwlVar.findValueSerializer(obj.getClass());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        eud<Object> eudVar = this._delegateSerializer;
        if (eudVar != null) {
            eudVar.acceptJsonFormatVisitor(ksdVar, javaType);
        }
    }

    public Object convertValue(Object obj) {
        return this._converter.convert(obj);
    }

    @Override // defpackage.cj4
    public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        eud<?> eudVarHandleSecondaryContextualization = this._delegateSerializer;
        JavaType javaTypeB = this._delegateType;
        if (eudVarHandleSecondaryContextualization == null) {
            if (javaTypeB == null) {
                javaTypeB = this._converter.b(wwlVar.getTypeFactory());
            }
            if (!javaTypeB.isJavaLangObject()) {
                eudVarHandleSecondaryContextualization = wwlVar.findValueSerializer(javaTypeB);
            }
        }
        if (eudVarHandleSecondaryContextualization instanceof cj4) {
            eudVarHandleSecondaryContextualization = wwlVar.handleSecondaryContextualization(eudVarHandleSecondaryContextualization, beanProperty);
        }
        return (eudVarHandleSecondaryContextualization == this._delegateSerializer && javaTypeB == this._delegateType) ? this : withDelegate(this._converter, javaTypeB, eudVarHandleSecondaryContextualization);
    }

    public ak4<Object, ?> getConverter() {
        return this._converter;
    }

    @Override // defpackage.eud
    public eud<?> getDelegatee() {
        return this._delegateSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
    public zsd getSchema(wwl wwlVar, Type type) throws JsonMappingException {
        Object obj = this._delegateSerializer;
        return obj instanceof rfl ? ((rfl) obj).getSchema(wwlVar, type) : super.getSchema(wwlVar, type);
    }

    @Override // defpackage.eud
    public boolean isEmpty(wwl wwlVar, Object obj) {
        Object objConvertValue = convertValue(obj);
        if (objConvertValue == null) {
            return true;
        }
        eud<Object> eudVar = this._delegateSerializer;
        if (eudVar == null) {
            return obj == null;
        }
        return eudVar.isEmpty(wwlVar, objConvertValue);
    }

    @Override // defpackage.dqk
    public void resolve(wwl wwlVar) throws JsonMappingException {
        Object obj = this._delegateSerializer;
        if (obj == null || !(obj instanceof dqk)) {
            return;
        }
        ((dqk) obj).resolve(wwlVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        Object objConvertValue = convertValue(obj);
        if (objConvertValue == null) {
            wwlVar.defaultSerializeNull(jsonGenerator);
            return;
        }
        eud<Object> eudVar_findSerializer = this._delegateSerializer;
        if (eudVar_findSerializer == null) {
            eudVar_findSerializer = _findSerializer(objConvertValue, wwlVar);
        }
        eudVar_findSerializer.serialize(objConvertValue, jsonGenerator, wwlVar);
    }

    @Override // defpackage.eud
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        Object objConvertValue = convertValue(obj);
        eud<Object> eudVar_findSerializer = this._delegateSerializer;
        if (eudVar_findSerializer == null) {
            eudVar_findSerializer = _findSerializer(obj, wwlVar);
        }
        eudVar_findSerializer.serializeWithType(objConvertValue, jsonGenerator, wwlVar, e5qVar);
    }

    public StdDelegatingSerializer withDelegate(ak4<Object, ?> ak4Var, JavaType javaType, eud<?> eudVar) {
        h04.j0(StdDelegatingSerializer.class, this, "withDelegate");
        return new StdDelegatingSerializer(ak4Var, javaType, eudVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
    public zsd getSchema(wwl wwlVar, Type type, boolean z) throws JsonMappingException {
        Object obj = this._delegateSerializer;
        if (obj instanceof rfl) {
            return ((rfl) obj).getSchema(wwlVar, type, z);
        }
        return super.getSchema(wwlVar, type);
    }

    public StdDelegatingSerializer(ak4<?, ?> ak4Var) {
        super(Object.class);
        this._converter = ak4Var;
        this._delegateType = null;
        this._delegateSerializer = null;
    }

    public StdDelegatingSerializer(ak4<Object, ?> ak4Var, JavaType javaType, eud<?> eudVar) {
        super(javaType);
        this._converter = ak4Var;
        this._delegateType = javaType;
        this._delegateSerializer = eudVar;
    }
}
