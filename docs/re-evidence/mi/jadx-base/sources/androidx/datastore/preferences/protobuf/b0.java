package androidx.datastore.preferences.protobuf;

import defpackage.csf;
import defpackage.ykh;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface b0 extends csf {

    public interface a extends csf, Cloneable {
        b0 build();

        b0 buildPartial();

        a m(b0 b0Var);

        a mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;
    }

    void a(CodedOutputStream codedOutputStream) throws IOException;

    ykh<? extends b0> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    ByteString toByteString();
}
