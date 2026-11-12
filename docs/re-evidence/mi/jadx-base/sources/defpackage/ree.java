package defpackage;

import com.google.protobuf.ByteString;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface ree extends bei {
    Object d(int i);

    ByteString getByteString(int i);

    List<?> getUnderlyingElements();

    ree getUnmodifiableView();

    void n(ByteString byteString);
}
