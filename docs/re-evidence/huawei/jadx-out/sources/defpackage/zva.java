package defpackage;

/* JADX INFO: loaded from: classes20.dex */
public final class zva {
    private final int e;

    public zva(int i) {
        if (i < 0 || i > 255) {
            throw new IllegalArgumentException("No-Response option " + i + " must be between 0 and 255 inclusive");
        }
        this.e = i;
    }

    public byte[] e() {
        int i = this.e;
        if (i == 0) {
            return zzg.f54809a;
        }
        return new byte[]{(byte) i};
    }

    public zvc c() {
        return zvo.k.create(e());
    }

    public String toString() {
        if ((this.e & 26) != 0) {
            StringBuilder sb = new StringBuilder("NO ");
            if ((this.e & 2) != 0) {
                sb.append("SUCCESS,");
            }
            if ((this.e & 8) != 0) {
                sb.append("CLIENT_ERROR,");
            }
            if ((this.e & 16) != 0) {
                sb.append("SERVER_ERROR,");
            }
            sb.setLength(sb.length() - 1);
            return sb.toString();
        }
        return "ALL";
    }

    public boolean equals(Object obj) {
        return (obj instanceof zva) && this.e == ((zva) obj).e;
    }

    public int hashCode() {
        return this.e;
    }
}
