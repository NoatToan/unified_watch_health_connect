package defpackage;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.b0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o0e<KeyProtoT extends b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<KeyProtoT> f28608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, b<?, KeyProtoT>> f28609b;
    public final Class<?> c;

    public static abstract class a<KeyFormatProtoT extends b0, KeyT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<KeyFormatProtoT> f28610a;

        public a(Class<KeyFormatProtoT> cls) {
            this.f28610a = cls;
        }

        public abstract KeyT a(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

        public final Class<KeyFormatProtoT> b() {
            return this.f28610a;
        }

        public abstract KeyFormatProtoT c(ByteString byteString) throws InvalidProtocolBufferException;

        public abstract void d(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
    }

    public static abstract class b<PrimitiveT, KeyT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<PrimitiveT> f28611a;

        public b(Class<PrimitiveT> cls) {
            this.f28611a = cls;
        }

        public abstract PrimitiveT a(KeyT keyt) throws GeneralSecurityException;

        public final Class<PrimitiveT> b() {
            return this.f28611a;
        }
    }

    @SafeVarargs
    public o0e(Class<KeyProtoT> cls, b<?, KeyProtoT>... bVarArr) {
        this.f28608a = cls;
        HashMap map = new HashMap();
        for (b<?, KeyProtoT> bVar : bVarArr) {
            if (map.containsKey(bVar.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + bVar.b().getCanonicalName());
            }
            map.put(bVar.b(), bVar);
        }
        if (bVarArr.length > 0) {
            this.c = bVarArr[0].b();
        } else {
            this.c = Void.class;
        }
        this.f28609b = Collections.unmodifiableMap(map);
    }

    public final Class<?> a() {
        return this.c;
    }

    public final Class<KeyProtoT> b() {
        return this.f28608a;
    }

    public abstract String c();

    public final <P> P d(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        b<?, KeyProtoT> bVar = this.f28609b.get(cls);
        if (bVar != null) {
            return (P) bVar.a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a<?, KeyProtoT> e();

    public abstract KeyData.KeyMaterialType f();

    public abstract KeyProtoT g(ByteString byteString) throws InvalidProtocolBufferException;

    public final Set<Class<?>> h() {
        return this.f28609b.keySet();
    }

    public abstract void i(KeyProtoT keyprotot) throws GeneralSecurityException;
}
