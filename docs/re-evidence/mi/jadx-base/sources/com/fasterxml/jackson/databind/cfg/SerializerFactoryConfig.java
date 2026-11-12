package com.fasterxml.jackson.databind.cfg;

import defpackage.ij1;
import defpackage.kj1;
import defpackage.lh2;
import defpackage.xwl;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class SerializerFactoryConfig implements Serializable {
    private static final long serialVersionUID = 1;
    protected final xwl[] _additionalKeySerializers;
    protected final xwl[] _additionalSerializers;
    protected final lh2[] _modifiers;
    protected static final xwl[] NO_SERIALIZERS = new xwl[0];
    protected static final lh2[] NO_MODIFIERS = new lh2[0];

    public SerializerFactoryConfig() {
        this(null, null, null);
    }

    public boolean hasKeySerializers() {
        return this._additionalKeySerializers.length > 0;
    }

    public boolean hasSerializerModifiers() {
        return this._modifiers.length > 0;
    }

    public boolean hasSerializers() {
        return this._additionalSerializers.length > 0;
    }

    public Iterable<xwl> keySerializers() {
        return new kj1(this._additionalKeySerializers);
    }

    public Iterable<lh2> serializerModifiers() {
        return new kj1(this._modifiers);
    }

    public Iterable<xwl> serializers() {
        return new kj1(this._additionalSerializers);
    }

    public SerializerFactoryConfig withAdditionalKeySerializers(xwl xwlVar) {
        if (xwlVar == null) {
            throw new IllegalArgumentException("Cannot pass null Serializers");
        }
        return new SerializerFactoryConfig(this._additionalSerializers, (xwl[]) ij1.j(this._additionalKeySerializers, xwlVar), this._modifiers);
    }

    public SerializerFactoryConfig withAdditionalSerializers(xwl xwlVar) {
        if (xwlVar != null) {
            return new SerializerFactoryConfig((xwl[]) ij1.j(this._additionalSerializers, xwlVar), this._additionalKeySerializers, this._modifiers);
        }
        throw new IllegalArgumentException("Cannot pass null Serializers");
    }

    public SerializerFactoryConfig withSerializerModifier(lh2 lh2Var) {
        if (lh2Var == null) {
            throw new IllegalArgumentException("Cannot pass null modifier");
        }
        return new SerializerFactoryConfig(this._additionalSerializers, this._additionalKeySerializers, (lh2[]) ij1.j(this._modifiers, lh2Var));
    }

    public SerializerFactoryConfig(xwl[] xwlVarArr, xwl[] xwlVarArr2, lh2[] lh2VarArr) {
        this._additionalSerializers = xwlVarArr == null ? NO_SERIALIZERS : xwlVarArr;
        this._additionalKeySerializers = xwlVarArr2 == null ? NO_SERIALIZERS : xwlVarArr2;
        this._modifiers = lh2VarArr == null ? NO_MODIFIERS : lh2VarArr;
    }
}
