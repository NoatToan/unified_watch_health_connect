package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ClassKey;
import defpackage.fh2;
import defpackage.vzd;
import defpackage.wzd;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleKeyDeserializers implements wzd, Serializable {
    private static final long serialVersionUID = 1;
    protected HashMap<ClassKey, vzd> _classMappings = null;

    public SimpleKeyDeserializers addDeserializer(Class<?> cls, vzd vzdVar) {
        if (this._classMappings == null) {
            this._classMappings = new HashMap<>();
        }
        this._classMappings.put(new ClassKey(cls), vzdVar);
        return this;
    }

    @Override // defpackage.wzd
    public vzd findKeyDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, fh2 fh2Var) {
        HashMap<ClassKey, vzd> map = this._classMappings;
        if (map == null) {
            return null;
        }
        return map.get(new ClassKey(javaType.getRawClass()));
    }
}
