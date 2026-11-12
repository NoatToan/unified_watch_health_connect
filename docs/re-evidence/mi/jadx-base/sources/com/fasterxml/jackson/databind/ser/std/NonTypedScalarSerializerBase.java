package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import defpackage.e5q;
import defpackage.wwl;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class NonTypedScalarSerializerBase<T> extends StdScalarSerializer<T> {
    public NonTypedScalarSerializerBase(Class<T> cls) {
        super(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, defpackage.eud
    public final void serializeWithType(T t, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        serialize(t, jsonGenerator, wwlVar);
    }

    public NonTypedScalarSerializerBase(Class<?> cls, boolean z) {
        super(cls, z);
    }
}
