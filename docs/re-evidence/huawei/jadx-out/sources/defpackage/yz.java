package defpackage;

import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.Serializers;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public final class yz implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Serializers[] f53912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Serializers[] f53913c;
    protected final BeanSerializerModifier[] e;
    protected static final Serializers[] d = new Serializers[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final BeanSerializerModifier[] f53911a = new BeanSerializerModifier[0];

    public yz() {
        this(null, null, null);
    }

    protected yz(Serializers[] serializersArr, Serializers[] serializersArr2, BeanSerializerModifier[] beanSerializerModifierArr) {
        this.f53913c = serializersArr == null ? d : serializersArr;
        this.f53912b = serializersArr2 == null ? d : serializersArr2;
        this.e = beanSerializerModifierArr == null ? f53911a : beanSerializerModifierArr;
    }

    public yz b(Serializers serializers) {
        if (serializers == null) {
            throw new IllegalArgumentException("Cannot pass null Serializers");
        }
        return new yz((Serializers[]) aht.d(this.f53913c, serializers), this.f53912b, this.e);
    }

    public yz a(Serializers serializers) {
        if (serializers == null) {
            throw new IllegalArgumentException("Cannot pass null Serializers");
        }
        return new yz(this.f53913c, (Serializers[]) aht.d(this.f53912b, serializers), this.e);
    }

    public yz d(BeanSerializerModifier beanSerializerModifier) {
        if (beanSerializerModifier == null) {
            throw new IllegalArgumentException("Cannot pass null modifier");
        }
        return new yz(this.f53913c, this.f53912b, (BeanSerializerModifier[]) aht.d(this.e, beanSerializerModifier));
    }

    public boolean d() {
        return this.f53912b.length > 0;
    }

    public boolean e() {
        return this.e.length > 0;
    }

    public Iterable<Serializers> a() {
        return new ahs(this.f53913c);
    }

    public Iterable<Serializers> b() {
        return new ahs(this.f53912b);
    }

    public Iterable<BeanSerializerModifier> c() {
        return new ahs(this.e);
    }
}
