package com.xiaomi.continuity.channel;

import android.net.Uri;
import android.os.Bundle;
import com.xiaomi.continuity.jni.NObject;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
class NPacket extends NObject implements Packet {
    private final Bundle mBundle;
    private final PacketInfo mPacketInfo;

    private NPacket(PacketInfo packetInfo, Bundle bundle) {
        this.mPacketInfo = packetInfo;
        this.mBundle = bundle;
    }

    public static native NPacket fromBytes(byte[] bArr);

    public static NPacket fromFile(Uri uri, String str) {
        return fromFile(new File(uri.getPath()), str);
    }

    public static native NPacket fromFile(File file, String str);

    public static native NPacket fromInputStream(InputStream inputStream, long j, String str, String str2, String str3);

    @Override // com.xiaomi.continuity.channel.Packet
    public native byte[] asBytes();

    @Override // com.xiaomi.continuity.channel.Packet
    public native void asFile(File file);

    @Override // com.xiaomi.continuity.channel.Packet
    public native InputStream asInputStream();

    @Override // com.xiaomi.continuity.channel.Packet
    public native void asOutput(OutputStream outputStream);

    @Override // com.xiaomi.continuity.channel.Packet
    public native void discard();

    @Override // com.xiaomi.continuity.channel.Packet
    public long getContentLength() {
        return this.mPacketInfo.contentLength;
    }

    @Override // com.xiaomi.continuity.channel.Packet
    public String getFilename() {
        return this.mPacketInfo.filename;
    }

    @Override // com.xiaomi.continuity.channel.Packet
    public int getPacketType() {
        return this.mPacketInfo.packetType;
    }

    @Override // com.xiaomi.continuity.channel.Packet
    public String getTag() {
        return this.mPacketInfo.tag;
    }

    @Override // com.xiaomi.continuity.channel.Packet
    public native boolean isDiscarded();

    @Override // com.xiaomi.continuity.channel.Packet
    public native boolean isReceived();

    @Override // com.xiaomi.continuity.channel.Packet
    public void putExtras(Bundle bundle) {
        this.mBundle.putAll(bundle);
    }
}
