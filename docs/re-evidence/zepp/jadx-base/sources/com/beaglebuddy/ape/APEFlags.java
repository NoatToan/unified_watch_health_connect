package com.beaglebuddy.ape;

/* JADX INFO: loaded from: classes2.dex */
public class APEFlags {
    private static final int f = 4;
    private static final byte g = -128;
    private static final byte h = 64;
    private static final byte i = 32;
    private static final byte j = 6;
    private static final byte k = 1;
    private boolean a;
    private boolean b;
    private boolean c;
    private Type d;
    private boolean e;

    public enum Type {
        UTF_8,
        BINARY,
        EXTERNAL_LINK,
        RESERVED;

        @Override // java.lang.Enum
        public String toString() {
            return "" + ordinal() + " - " + super.toString().toLowerCase();
        }

        public static Type valueOf(int i) {
            for (Type type : values()) {
                if (i == type.ordinal()) {
                    return type;
                }
            }
            throw new IllegalArgumentException("Invalid APE type " + i + ".");
        }
    }

    public APEFlags(byte[] bArr, int i2) {
        int i3 = i2 + 3;
        this.a = (bArr[i3] & (-128)) != 0;
        this.b = (bArr[i3] & 64) != 0;
        this.c = (bArr[i3] & 32) != 0;
        this.e = (bArr[i2] & 1) != 0;
        this.d = Type.valueOf(bArr[i3] & 6);
    }

    public Type getType() {
        return this.d;
    }

    public boolean isFooter() {
        return !this.c;
    }

    public boolean isHeader() {
        return this.c;
    }

    public boolean isReadOnly() {
        return this.e;
    }

    public boolean isTagContainsFooter() {
        return this.b;
    }

    public boolean isTagContainsHeader() {
        return this.a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("flag\n");
        stringBuffer.append("         size...............: 4 bytes\n");
        stringBuffer.append("         tag contains header: " + this.a + "\n");
        stringBuffer.append("         tag contains footer: " + this.b + "\n");
        stringBuffer.append("         is header..........: " + this.c + "\n");
        stringBuffer.append("         data type..........: " + this.d + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append("         is read only.......: ");
        sb.append(this.e);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }
}
