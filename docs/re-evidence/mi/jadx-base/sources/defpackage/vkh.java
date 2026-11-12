package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.j;
import com.google.protobuf.t;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public interface vkh<MessageType> {
    MessageType parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType parseDelimitedFrom(InputStream inputStream, t tVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(ByteString byteString) throws InvalidProtocolBufferException;

    MessageType parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(j jVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(j jVar, t tVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType parseFrom(InputStream inputStream, t tVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException;

    MessageType parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr) throws InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException;
}
