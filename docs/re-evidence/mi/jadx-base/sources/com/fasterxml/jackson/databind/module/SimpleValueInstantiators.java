package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.b;
import com.fasterxml.jackson.databind.type.ClassKey;
import defpackage.fh2;
import defpackage.pnq;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleValueInstantiators extends pnq.a implements Serializable {
    private static final long serialVersionUID = -8929386427526115130L;
    protected HashMap<ClassKey, b> _classMappings = new HashMap<>();

    public SimpleValueInstantiators addValueInstantiator(Class<?> cls, b bVar) {
        this._classMappings.put(new ClassKey(cls), bVar);
        return this;
    }

    @Override // pnq.a, defpackage.pnq
    public b findValueInstantiator(DeserializationConfig deserializationConfig, fh2 fh2Var, b bVar) {
        b bVar2 = this._classMappings.get(new ClassKey(fh2Var.s()));
        return bVar2 == null ? bVar : bVar2;
    }
}
