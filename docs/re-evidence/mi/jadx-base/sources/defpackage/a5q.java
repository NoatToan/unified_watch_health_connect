package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public class a5q {
    public static void a(int i, z73 z73Var) {
        int i2 = i >>> 24;
        if (i2 != 0 && i2 != 1) {
            switch (i2) {
                case 16:
                case 17:
                case 18:
                case 23:
                    break;
                case 19:
                case 20:
                case 21:
                    z73Var.g(i2);
                    return;
                case 22:
                    break;
                default:
                    switch (i2) {
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            z73Var.i(i);
                            return;
                        default:
                            throw new IllegalArgumentException();
                    }
                    break;
            }
            z73Var.e(i2, (i & 16776960) >> 8);
            return;
        }
        z73Var.k(i >>> 16);
    }
}
