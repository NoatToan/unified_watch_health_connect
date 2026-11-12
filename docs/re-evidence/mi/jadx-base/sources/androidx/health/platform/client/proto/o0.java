package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface o0 extends zrf {

    public interface a extends zrf, Cloneable {
        a P(h hVar, y yVar) throws IOException;

        o0 build();

        o0 buildPartial();

        a mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;

        a o(o0 o0Var);
    }

    void b(CodedOutputStream codedOutputStream) throws IOException;

    tkh<? extends o0> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    ByteString toByteString();
}
