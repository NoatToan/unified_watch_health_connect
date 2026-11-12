package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import defpackage.hh2;
import defpackage.ij1;
import defpackage.kj1;
import defpackage.oz5;
import defpackage.pnq;
import defpackage.wzd;
import defpackage.x10;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class DeserializerFactoryConfig implements Serializable {
    private static final long serialVersionUID = 1;
    protected final x10[] _abstractTypeResolvers;
    protected final oz5[] _additionalDeserializers;
    protected final wzd[] _additionalKeyDeserializers;
    protected final hh2[] _modifiers;
    protected final pnq[] _valueInstantiators;
    protected static final oz5[] NO_DESERIALIZERS = new oz5[0];
    protected static final hh2[] NO_MODIFIERS = new hh2[0];
    protected static final x10[] NO_ABSTRACT_TYPE_RESOLVERS = new x10[0];
    protected static final pnq[] NO_VALUE_INSTANTIATORS = new pnq[0];
    protected static final wzd[] DEFAULT_KEY_DESERIALIZERS = {new StdKeyDeserializers()};

    public DeserializerFactoryConfig() {
        this(null, null, null, null, null);
    }

    public Iterable<x10> abstractTypeResolvers() {
        return new kj1(this._abstractTypeResolvers);
    }

    public Iterable<hh2> deserializerModifiers() {
        return new kj1(this._modifiers);
    }

    public Iterable<oz5> deserializers() {
        return new kj1(this._additionalDeserializers);
    }

    public boolean hasAbstractTypeResolvers() {
        return this._abstractTypeResolvers.length > 0;
    }

    public boolean hasDeserializerModifiers() {
        return this._modifiers.length > 0;
    }

    public boolean hasDeserializers() {
        return this._additionalDeserializers.length > 0;
    }

    public boolean hasKeyDeserializers() {
        return this._additionalKeyDeserializers.length > 0;
    }

    public boolean hasValueInstantiators() {
        return this._valueInstantiators.length > 0;
    }

    public Iterable<wzd> keyDeserializers() {
        return new kj1(this._additionalKeyDeserializers);
    }

    public Iterable<pnq> valueInstantiators() {
        return new kj1(this._valueInstantiators);
    }

    public DeserializerFactoryConfig withAbstractTypeResolver(x10 x10Var) {
        if (x10Var == null) {
            throw new IllegalArgumentException("Cannot pass null resolver");
        }
        return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, this._modifiers, (x10[]) ij1.j(this._abstractTypeResolvers, x10Var), this._valueInstantiators);
    }

    public DeserializerFactoryConfig withAdditionalDeserializers(oz5 oz5Var) {
        if (oz5Var != null) {
            return new DeserializerFactoryConfig((oz5[]) ij1.j(this._additionalDeserializers, oz5Var), this._additionalKeyDeserializers, this._modifiers, this._abstractTypeResolvers, this._valueInstantiators);
        }
        throw new IllegalArgumentException("Cannot pass null Deserializers");
    }

    public DeserializerFactoryConfig withAdditionalKeyDeserializers(wzd wzdVar) {
        if (wzdVar == null) {
            throw new IllegalArgumentException("Cannot pass null KeyDeserializers");
        }
        return new DeserializerFactoryConfig(this._additionalDeserializers, (wzd[]) ij1.j(this._additionalKeyDeserializers, wzdVar), this._modifiers, this._abstractTypeResolvers, this._valueInstantiators);
    }

    public DeserializerFactoryConfig withDeserializerModifier(hh2 hh2Var) {
        if (hh2Var == null) {
            throw new IllegalArgumentException("Cannot pass null modifier");
        }
        return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, (hh2[]) ij1.j(this._modifiers, hh2Var), this._abstractTypeResolvers, this._valueInstantiators);
    }

    public DeserializerFactoryConfig withValueInstantiators(pnq pnqVar) {
        if (pnqVar == null) {
            throw new IllegalArgumentException("Cannot pass null resolver");
        }
        return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, this._modifiers, this._abstractTypeResolvers, (pnq[]) ij1.j(this._valueInstantiators, pnqVar));
    }

    public DeserializerFactoryConfig(oz5[] oz5VarArr, wzd[] wzdVarArr, hh2[] hh2VarArr, x10[] x10VarArr, pnq[] pnqVarArr) {
        this._additionalDeserializers = oz5VarArr == null ? NO_DESERIALIZERS : oz5VarArr;
        this._additionalKeyDeserializers = wzdVarArr == null ? DEFAULT_KEY_DESERIALIZERS : wzdVarArr;
        this._modifiers = hh2VarArr == null ? NO_MODIFIERS : hh2VarArr;
        this._abstractTypeResolvers = x10VarArr == null ? NO_ABSTRACT_TYPE_RESOLVERS : x10VarArr;
        this._valueInstantiators = pnqVarArr == null ? NO_VALUE_INSTANTIATORS : pnqVarArr;
    }
}
