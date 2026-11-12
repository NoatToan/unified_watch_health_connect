package com.xiaomi.continuity.channel;

import android.net.Uri;
import android.os.Bundle;
import defpackage.j3s;
import defpackage.jdq;
import defpackage.uoe;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public interface Packet {
    public static final String TAG = "Packet";

    static Packet fromBytes(byte[] bArr) {
        return NPacket.fromBytes(bArr);
    }

    static Packet fromFile(File file) {
        return NPacket.fromFile(file, "");
    }

    static Packet fromFileStream(InputStream inputStream) {
        return NPacket.fromInputStream(inputStream, -1L, "", "", "");
    }

    static Packet fromUri(Uri uri) {
        return fromUri(uri, "");
    }

    byte[] asBytes();

    default void asFile(Uri uri) {
        asFile(new File(uri.getPath()));
    }

    void asFile(File file);

    InputStream asInputStream();

    void asOutput(OutputStream outputStream);

    void discard();

    long getContentLength();

    String getFilename();

    int getPacketType();

    String getTag();

    boolean isDiscarded();

    boolean isReceived();

    void putExtras(Bundle bundle);

    static Packet fromFile(File file, String str) {
        return NPacket.fromFile(file, str);
    }

    static Packet fromFileStream(InputStream inputStream, String str) {
        return NPacket.fromInputStream(inputStream, -1L, "", "", str);
    }

    static Packet fromUri(Uri uri, String str) {
        uoe.e(TAG, "fromUri:fileUri = " + uri + ", tag = " + str);
        try {
            String strC = jdq.c(uri);
            String strD = jdq.d(uri);
            return "file".equals(uri.getScheme()) ? NPacket.fromInputStream(new FileInputStream(uri.getPath()), -1L, strD, strC, str) : NPacket.fromInputStream(jdq.e(uri), -1L, strD, strC, str);
        } catch (FileNotFoundException e) {
            StringBuilder sbA = j3s.a("fromUri:");
            sbA.append(e.getMessage());
            uoe.b(TAG, sbA.toString());
            return null;
        }
    }

    default void asFile(FileDescriptor fileDescriptor) {
        asOutput(new FileOutputStream(fileDescriptor));
    }

    static Packet fromFile(FileDescriptor fileDescriptor) {
        return fromFileStream(new FileInputStream(fileDescriptor));
    }

    static Packet fromFileStream(InputStream inputStream, String str, String str2) {
        return NPacket.fromInputStream(inputStream, -1L, "", str, str2);
    }

    static Packet fromFile(FileDescriptor fileDescriptor, String str) {
        return fromFileStream(new FileInputStream(fileDescriptor), str);
    }
}
