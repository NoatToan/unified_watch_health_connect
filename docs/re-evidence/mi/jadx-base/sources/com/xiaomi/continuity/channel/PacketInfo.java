package com.xiaomi.continuity.channel;

/* JADX INFO: loaded from: classes7.dex */
public class PacketInfo {
    public final long contentLength;
    public final String contentType;
    public final String filename;
    public final int packetType;
    public final String tag;

    public PacketInfo(int i, long j, String str, String str2, String str3) {
        this.packetType = i;
        this.contentLength = j;
        this.contentType = str;
        this.filename = str2;
        this.tag = str3;
    }
}
