package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.l;

/* JADX INFO: loaded from: classes.dex */
public interface ykh<MessageType> {
    MessageType a(g gVar, l lVar) throws InvalidProtocolBufferException;

    MessageType b(ByteString byteString, l lVar) throws InvalidProtocolBufferException;
}
