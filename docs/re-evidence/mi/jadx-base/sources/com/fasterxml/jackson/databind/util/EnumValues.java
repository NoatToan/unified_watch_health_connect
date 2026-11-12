package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import defpackage.h04;
import defpackage.owl;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class EnumValues implements Serializable {
    private static final long serialVersionUID = 1;
    private transient EnumMap<?, owl> _asMap;
    private final Class<Enum<?>> _enumClass;
    private final owl[] _textual;
    private final Enum<?>[] _values;

    private EnumValues(Class<Enum<?>> cls, owl[] owlVarArr) {
        this._enumClass = cls;
        this._values = cls.getEnumConstants();
        this._textual = owlVarArr;
    }

    public static EnumValues construct(SerializationConfig serializationConfig, Class<Enum<?>> cls) {
        return serializationConfig.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING) ? constructFromToString(serializationConfig, cls) : constructFromName(serializationConfig, cls);
    }

    public static EnumValues constructFromName(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Class<? extends Enum<?>> clsQ = h04.q(cls);
        Enum<?>[] enumArr = (Enum[]) clsQ.getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class " + cls.getName());
        }
        String[] strArrFindEnumValues = mapperConfig.getAnnotationIntrospector().findEnumValues(clsQ, enumArr, new String[enumArr.length]);
        owl[] owlVarArr = new owl[enumArr.length];
        int length = enumArr.length;
        for (int i = 0; i < length; i++) {
            Enum<?> r5 = enumArr[i];
            String strName = strArrFindEnumValues[i];
            if (strName == null) {
                strName = r5.name();
            }
            owlVarArr[r5.ordinal()] = mapperConfig.compileString(strName);
        }
        return new EnumValues(cls, owlVarArr);
    }

    public static EnumValues constructFromToString(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Enum[] enumArr = (Enum[]) h04.q(cls).getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class " + cls.getName());
        }
        owl[] owlVarArr = new owl[enumArr.length];
        for (Enum r4 : enumArr) {
            owlVarArr[r4.ordinal()] = mapperConfig.compileString(r4.toString());
        }
        return new EnumValues(cls, owlVarArr);
    }

    public List<Enum<?>> enums() {
        return Arrays.asList(this._values);
    }

    public Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }

    public EnumMap<?, owl> internalMap() {
        EnumMap<?, owl> enumMap = this._asMap;
        if (enumMap != null) {
            return enumMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Enum<?> r4 : this._values) {
            linkedHashMap.put(r4, this._textual[r4.ordinal()]);
        }
        return new EnumMap<>(linkedHashMap);
    }

    public owl serializedValueFor(Enum<?> r2) {
        return this._textual[r2.ordinal()];
    }

    public Collection<owl> values() {
        return Arrays.asList(this._textual);
    }
}
