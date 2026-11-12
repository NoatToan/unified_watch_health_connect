package org.java_websocket.handshake;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes23.dex */
public class HandshakedataImpl1 implements HandshakeBuilder {
    private byte[] a;
    private TreeMap<String, String> b = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    @Override // org.java_websocket.handshake.Handshakedata
    public byte[] getContent() {
        return this.a;
    }

    @Override // org.java_websocket.handshake.Handshakedata
    public String getFieldValue(String str) {
        String str2 = this.b.get(str);
        return str2 == null ? "" : str2;
    }

    @Override // org.java_websocket.handshake.Handshakedata
    public boolean hasFieldValue(String str) {
        return this.b.containsKey(str);
    }

    @Override // org.java_websocket.handshake.Handshakedata
    public Iterator<String> iterateHttpFields() {
        return Collections.unmodifiableSet(this.b.keySet()).iterator();
    }

    @Override // org.java_websocket.handshake.HandshakeBuilder
    public void put(String str, String str2) {
        this.b.put(str, str2);
    }

    @Override // org.java_websocket.handshake.HandshakeBuilder
    public void setContent(byte[] bArr) {
        this.a = bArr;
    }
}
