package defpackage;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y3h<T> extends ObjectIdGenerator<T> {
    protected final Class<?> _scope;

    public y3h(Class<?> cls) {
        this._scope = cls;
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator) {
        return objectIdGenerator.getClass() == getClass() && objectIdGenerator.getScope() == this._scope;
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public abstract T generateId(Object obj);

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public Class<?> getScope() {
        return this._scope;
    }
}
