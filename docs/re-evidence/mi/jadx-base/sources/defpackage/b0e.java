package defpackage;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.b0;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes5.dex */
public class b0e<PrimitiveT, KeyProtoT extends b0> implements a0e<PrimitiveT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0e<KeyProtoT> f3647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<PrimitiveT> f3648b;

    public static class a<KeyFormatProtoT extends b0, KeyProtoT extends b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o0e.a<KeyFormatProtoT, KeyProtoT> f3649a;

        public a(o0e.a<KeyFormatProtoT, KeyProtoT> aVar) {
            this.f3649a = aVar;
        }

        public KeyProtoT a(ByteString byteString) throws InvalidProtocolBufferException, GeneralSecurityException {
            return (KeyProtoT) b(this.f3649a.c(byteString));
        }

        public final KeyProtoT b(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException {
            this.f3649a.d(keyformatprotot);
            return this.f3649a.a(keyformatprotot);
        }
    }

    public b0e(o0e<KeyProtoT> o0eVar, Class<PrimitiveT> cls) {
        if (!o0eVar.h().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", o0eVar.toString(), cls.getName()));
        }
        this.f3647a = o0eVar;
        this.f3648b = cls;
    }

    @Override // defpackage.a0e
    public final boolean a(String str) {
        return str.equals(e());
    }

    @Override // defpackage.a0e
    public final KeyData b(ByteString byteString) throws GeneralSecurityException {
        try {
            return KeyData.K().u(e()).v(f().a(byteString).toByteString()).t(this.f3647a.f()).build();
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // defpackage.a0e
    public final PrimitiveT c(ByteString byteString) throws GeneralSecurityException {
        try {
            return g(this.f3647a.g(byteString));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f3647a.b().getName(), e);
        }
    }

    @Override // defpackage.a0e
    public final b0 d(ByteString byteString) throws GeneralSecurityException {
        try {
            return f().a(byteString);
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f3647a.e().b().getName(), e);
        }
    }

    public final String e() {
        return this.f3647a.c();
    }

    public final a<?, KeyProtoT> f() {
        return new a<>(this.f3647a.e());
    }

    public final PrimitiveT g(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (Void.class.equals(this.f3648b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f3647a.i(keyprotot);
        return (PrimitiveT) this.f3647a.d(keyprotot, this.f3648b);
    }
}
