package org.java_websocket.protocols;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes23.dex */
public class Protocol implements IProtocol {
    private static final Pattern b = Pattern.compile(" ");
    private static final Pattern c = Pattern.compile(",");
    private final String a;

    public Protocol(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.a = str;
    }

    @Override // org.java_websocket.protocols.IProtocol
    public boolean acceptProvidedProtocol(String str) {
        for (String str2 : c.split(b.matcher(str).replaceAll(""))) {
            if (this.a.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.java_websocket.protocols.IProtocol
    public IProtocol copyInstance() {
        return new Protocol(getProvidedProtocol());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((Protocol) obj).a);
    }

    @Override // org.java_websocket.protocols.IProtocol
    public String getProvidedProtocol() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // org.java_websocket.protocols.IProtocol
    public String toString() {
        return getProvidedProtocol();
    }
}
