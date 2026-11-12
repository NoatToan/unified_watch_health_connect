package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f6784a;

        public a(h hVar) {
            this.f6784a = hVar;
        }
    }

    private l1() {
    }

    public static String a(h hVar) {
        h hVar2 = new a(hVar).f6784a;
        StringBuilder sb3 = new StringBuilder(hVar2.size());
        for (int i14 = 0; i14 < hVar2.size(); i14++) {
            byte bA = hVar2.a(i14);
            if (bA == 34) {
                sb3.append("\\\"");
            } else if (bA == 39) {
                sb3.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb3.append("\\a");
                        break;
                    case 8:
                        sb3.append("\\b");
                        break;
                    case 9:
                        sb3.append("\\t");
                        break;
                    case 10:
                        sb3.append("\\n");
                        break;
                    case 11:
                        sb3.append("\\v");
                        break;
                    case 12:
                        sb3.append("\\f");
                        break;
                    case 13:
                        sb3.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb3.append('\\');
                            sb3.append((char) (((bA >>> 6) & 3) + 48));
                            sb3.append((char) (((bA >>> 3) & 7) + 48));
                            sb3.append((char) ((bA & 7) + 48));
                        } else {
                            sb3.append((char) bA);
                        }
                        break;
                }
            } else {
                sb3.append("\\\\");
            }
        }
        return sb3.toString();
    }
}
