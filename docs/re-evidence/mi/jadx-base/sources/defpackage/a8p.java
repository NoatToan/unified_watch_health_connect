package defpackage;

import com.google.protobuf.ByteString;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class a8p {

    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteString f777a;

        public a(ByteString byteString) {
            this.f777a = byteString;
        }

        @Override // a8p.c
        public byte a(int i) {
            return this.f777a.byteAt(i);
        }

        @Override // a8p.c
        public int size() {
            return this.f777a.size();
        }
    }

    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f778a;

        public b(byte[] bArr) {
            this.f778a = bArr;
        }

        @Override // a8p.c
        public byte a(int i) {
            return this.f778a[i];
        }

        @Override // a8p.c
        public int size() {
            return this.f778a.length;
        }
    }

    public interface c {
        byte a(int i);

        int size();
    }

    public static String a(c cVar) {
        StringBuilder sb = new StringBuilder(cVar.size());
        for (int i = 0; i < cVar.size(); i++) {
            byte bA = cVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append(AbstractJsonLexerKt.STRING_ESC);
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String b(ByteString byteString) {
        return a(new a(byteString));
    }

    public static String c(byte[] bArr) {
        return a(new b(bArr));
    }

    public static String d(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    public static String e(String str) {
        return b(ByteString.copyFromUtf8(str));
    }
}
