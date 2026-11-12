package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface see extends List {
    Object d(int i);

    List<?> getUnderlyingElements();

    see getUnmodifiableView();

    void y(ByteString byteString);
}
