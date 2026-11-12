package defpackage;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/* JADX INFO: loaded from: classes21.dex */
public class aak extends ObjectIdGenerators.PropertyGenerator {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator<Object> newForSerialization(Object obj) {
        return this;
    }

    public aak(Class<?> cls) {
        super(cls);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerators.Base, com.fasterxml.jackson.annotation.ObjectIdGenerator
    public Object generateId(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator<Object> forScope(Class<?> cls) {
        return cls == this._scope ? this : new aak(cls);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator.c key(Object obj) {
        if (obj == null) {
            return null;
        }
        return new ObjectIdGenerator.c(getClass(), this._scope, obj);
    }
}
