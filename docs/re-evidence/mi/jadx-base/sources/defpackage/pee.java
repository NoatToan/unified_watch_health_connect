package defpackage;

import androidx.health.platform.client.proto.ByteString;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface pee extends List {
    void N(ByteString byteString);

    Object d(int i);

    List<?> getUnderlyingElements();

    pee getUnmodifiableView();
}
