package org.eclipse.californium.scandium.util;

import defpackage.zzp;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.eclipse.californium.elements.util.StandardCharsets;

/* JADX INFO: loaded from: classes20.dex */
public class ServerName {
    public static final Charset d = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NameType f44586a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f44587c;
    private final int e;

    private ServerName(NameType nameType, byte[] bArr) {
        this.f44586a = nameType;
        this.f44587c = bArr;
        this.e = (Arrays.hashCode(bArr) * 31) + nameType.hashCode();
    }

    public static ServerName a(NameType nameType, byte[] bArr) {
        if (nameType == null) {
            throw new NullPointerException("type must not be null");
        }
        if (bArr == null) {
            throw new NullPointerException("name must not be null");
        }
        if (nameType == NameType.HOST_NAME) {
            return d(new String(bArr, d));
        }
        return new ServerName(nameType, bArr);
    }

    public static ServerName d(String str) {
        if (str == null) {
            throw new NullPointerException("host name must not be null");
        }
        if (zzp.a(str)) {
            return new ServerName(NameType.HOST_NAME, str.toLowerCase().getBytes(d));
        }
        throw new IllegalArgumentException("not a valid host name");
    }

    public int a() {
        return this.f44587c.length;
    }

    public byte[] e() {
        return this.f44587c;
    }

    public String b() {
        return new String(this.f44587c, d);
    }

    public NameType c() {
        return this.f44586a;
    }

    public int hashCode() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerName serverName = (ServerName) obj;
        if (this.f44586a != serverName.f44586a) {
            return false;
        }
        return Arrays.equals(this.f44587c, serverName.f44587c);
    }

    public enum NameType {
        HOST_NAME((byte) 0),
        UNDEFINED((byte) -1);

        private final byte code;

        NameType(byte b2) {
            this.code = b2;
        }

        public byte getCode() {
            return this.code;
        }

        public static NameType fromCode(byte b2) {
            for (NameType nameType : values()) {
                if (nameType.code == b2) {
                    return nameType;
                }
            }
            return UNDEFINED;
        }
    }
}
