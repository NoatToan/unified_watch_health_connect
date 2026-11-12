package defpackage;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.b0;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes5.dex */
public interface a0e<P> {
    boolean a(String str);

    KeyData b(ByteString byteString) throws GeneralSecurityException;

    P c(ByteString byteString) throws GeneralSecurityException;

    b0 d(ByteString byteString) throws GeneralSecurityException;
}
