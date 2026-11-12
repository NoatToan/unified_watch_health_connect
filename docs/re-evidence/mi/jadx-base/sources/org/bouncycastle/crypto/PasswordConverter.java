package org.bouncycastle.crypto;

import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.sfh;
import defpackage.wt3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class PasswordConverter implements wt3 {
    private static final /* synthetic */ PasswordConverter[] $VALUES;
    public static final PasswordConverter ASCII;
    public static final PasswordConverter PKCS12;
    public static final PasswordConverter UTF8;

    public static enum a extends PasswordConverter {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // org.bouncycastle.crypto.PasswordConverter, defpackage.wt3
        public byte[] convert(char[] cArr) {
            return sfh.b(cArr);
        }

        @Override // org.bouncycastle.crypto.PasswordConverter, defpackage.wt3
        public String getType() {
            return HTTP.ASCII;
        }
    }

    static {
        a aVar = new a(HTTP.ASCII, 0);
        ASCII = aVar;
        PasswordConverter passwordConverter = new PasswordConverter("UTF8", 1) { // from class: org.bouncycastle.crypto.PasswordConverter.b
            {
                a aVar2 = null;
            }

            @Override // org.bouncycastle.crypto.PasswordConverter, defpackage.wt3
            public byte[] convert(char[] cArr) {
                return sfh.c(cArr);
            }

            @Override // org.bouncycastle.crypto.PasswordConverter, defpackage.wt3
            public String getType() {
                return "UTF8";
            }
        };
        UTF8 = passwordConverter;
        PasswordConverter passwordConverter2 = new PasswordConverter("PKCS12", 2) { // from class: org.bouncycastle.crypto.PasswordConverter.c
            {
                a aVar2 = null;
            }

            @Override // org.bouncycastle.crypto.PasswordConverter, defpackage.wt3
            public byte[] convert(char[] cArr) {
                return sfh.a(cArr);
            }

            @Override // org.bouncycastle.crypto.PasswordConverter, defpackage.wt3
            public String getType() {
                return "PKCS12";
            }
        };
        PKCS12 = passwordConverter2;
        $VALUES = new PasswordConverter[]{aVar, passwordConverter, passwordConverter2};
    }

    private PasswordConverter(String str, int i) {
        super(str, i);
    }

    public static PasswordConverter valueOf(String str) {
        return (PasswordConverter) Enum.valueOf(PasswordConverter.class, str);
    }

    public static PasswordConverter[] values() {
        return (PasswordConverter[]) $VALUES.clone();
    }

    @Override // defpackage.wt3
    public abstract /* synthetic */ byte[] convert(char[] cArr);

    @Override // defpackage.wt3
    public abstract /* synthetic */ String getType();

    public /* synthetic */ PasswordConverter(String str, int i, a aVar) {
        this(str, i);
    }
}
