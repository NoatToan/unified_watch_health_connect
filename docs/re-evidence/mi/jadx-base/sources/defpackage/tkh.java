package defpackage;

import androidx.health.platform.client.proto.ByteString;
import androidx.health.platform.client.proto.InvalidProtocolBufferException;
import androidx.health.platform.client.proto.h;
import androidx.health.platform.client.proto.y;

/* JADX INFO: loaded from: classes.dex */
public interface tkh<MessageType> {
    MessageType a(h hVar, y yVar) throws InvalidProtocolBufferException;

    MessageType b(ByteString byteString, y yVar) throws InvalidProtocolBufferException;
}
