package defpackage;

import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class yx implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Deserializers[] f;
    protected final KeyDeserializers[] g;
    protected final AbstractTypeResolver[] h;
    protected final ValueInstantiators[] i;
    protected final BeanDeserializerModifier[] j;
    protected static final Deserializers[] d = new Deserializers[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final BeanDeserializerModifier[] f53890a = new BeanDeserializerModifier[0];
    protected static final AbstractTypeResolver[] e = new AbstractTypeResolver[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final ValueInstantiators[] f53891b = new ValueInstantiators[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final KeyDeserializers[] f53892c = {new abl()};

    public yx() {
        this(null, null, null, null, null);
    }

    protected yx(Deserializers[] deserializersArr, KeyDeserializers[] keyDeserializersArr, BeanDeserializerModifier[] beanDeserializerModifierArr, AbstractTypeResolver[] abstractTypeResolverArr, ValueInstantiators[] valueInstantiatorsArr) {
        this.f = deserializersArr == null ? d : deserializersArr;
        this.g = keyDeserializersArr == null ? f53892c : keyDeserializersArr;
        this.j = beanDeserializerModifierArr == null ? f53890a : beanDeserializerModifierArr;
        this.h = abstractTypeResolverArr == null ? e : abstractTypeResolverArr;
        this.i = valueInstantiatorsArr == null ? f53891b : valueInstantiatorsArr;
    }

    public yx e(Deserializers deserializers) {
        if (deserializers == null) {
            throw new IllegalArgumentException("Cannot pass null Deserializers");
        }
        return new yx((Deserializers[]) aht.d(this.f, deserializers), this.g, this.j, this.h, this.i);
    }

    public yx d(KeyDeserializers keyDeserializers) {
        if (keyDeserializers == null) {
            throw new IllegalArgumentException("Cannot pass null KeyDeserializers");
        }
        return new yx(this.f, (KeyDeserializers[]) aht.d(this.g, keyDeserializers), this.j, this.h, this.i);
    }

    public yx b(BeanDeserializerModifier beanDeserializerModifier) {
        if (beanDeserializerModifier == null) {
            throw new IllegalArgumentException("Cannot pass null modifier");
        }
        return new yx(this.f, this.g, (BeanDeserializerModifier[]) aht.d(this.j, beanDeserializerModifier), this.h, this.i);
    }

    public yx a(AbstractTypeResolver abstractTypeResolver) {
        if (abstractTypeResolver == null) {
            throw new IllegalArgumentException("Cannot pass null resolver");
        }
        return new yx(this.f, this.g, this.j, (AbstractTypeResolver[]) aht.d(this.h, abstractTypeResolver), this.i);
    }

    public yx e(ValueInstantiators valueInstantiators) {
        if (valueInstantiators == null) {
            throw new IllegalArgumentException("Cannot pass null resolver");
        }
        return new yx(this.f, this.g, this.j, this.h, (ValueInstantiators[]) aht.d(this.i, valueInstantiators));
    }

    public boolean j() {
        return this.g.length > 0;
    }

    public boolean d() {
        return this.j.length > 0;
    }

    public boolean c() {
        return this.h.length > 0;
    }

    public boolean g() {
        return this.i.length > 0;
    }

    public Iterable<Deserializers> b() {
        return new ahs(this.f);
    }

    public Iterable<KeyDeserializers> h() {
        return new ahs(this.g);
    }

    public Iterable<BeanDeserializerModifier> e() {
        return new ahs(this.j);
    }

    public Iterable<AbstractTypeResolver> a() {
        return new ahs(this.h);
    }

    public Iterable<ValueInstantiators> f() {
        return new ahs(this.i);
    }
}
