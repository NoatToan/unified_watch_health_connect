package defpackage;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/* JADX INFO: loaded from: classes21.dex */
public class afn extends ObjectIdGenerators.PropertyGenerator {
    private static final long serialVersionUID = 1;
    protected final aez e;

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator<Object> newForSerialization(Object obj) {
        return this;
    }

    public afn(acv acvVar, aez aezVar) {
        this(acvVar.f(), aezVar);
    }

    protected afn(Class<?> cls, aez aezVar) {
        super(cls);
        this.e = aezVar;
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator, com.fasterxml.jackson.annotation.ObjectIdGenerators.Base, com.fasterxml.jackson.annotation.ObjectIdGenerator
    public boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator) {
        if (objectIdGenerator.getClass() != getClass()) {
            return false;
        }
        afn afnVar = (afn) objectIdGenerator;
        return afnVar.getScope() == this._scope && afnVar.e == this.e;
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerators.Base, com.fasterxml.jackson.annotation.ObjectIdGenerator
    public Object generateId(Object obj) {
        try {
            return this.e.get(obj);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new IllegalStateException("Problem accessing property '" + this.e.getName() + "': " + e2.getMessage(), e2);
        }
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator<Object> forScope(Class<?> cls) {
        return cls == this._scope ? this : new afn(cls, this.e);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator.c key(Object obj) {
        if (obj == null) {
            return null;
        }
        return new ObjectIdGenerator.c(getClass(), this._scope, obj);
    }
}
