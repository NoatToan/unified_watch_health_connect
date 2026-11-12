package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class b8p {

    public static class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteString f3927a;

        public a(ByteString byteString) {
            this.f3927a = byteString;
        }

        @Override // b8p.b
        public byte a(int i) {
            return this.f3927a.byteAt(i);
        }

        @Override // b8p.b
        public int size() {
            return this.f3927a.size();
        }
    }

    public interface b {
        byte a(int i);

        int size();
    }

    public static String a(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i = 0; i < bVar.size(); i++) {
            byte bA = bVar.a(i);
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

    public static String c(String str) {
        return b(ByteString.copyFromUtf8(str));
    }
}
