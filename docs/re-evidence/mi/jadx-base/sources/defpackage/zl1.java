package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41414a;

    public static final class a extends zl1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f41415b;
        public final List<b> c;
        public final List<a> d;

        public a(int i, long j) {
            super(i);
            this.f41415b = j;
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        public void d(a aVar) {
            this.d.add(aVar);
        }

        public void e(b bVar) {
            this.c.add(bVar);
        }

        public a f(int i) {
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = this.d.get(i2);
                if (aVar.f41414a == i) {
                    return aVar;
                }
            }
            return null;
        }

        public b g(int i) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = this.c.get(i2);
                if (bVar.f41414a == i) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // defpackage.zl1
        public String toString() {
            String strA = zl1.a(this.f41414a);
            String string = Arrays.toString(this.c.toArray());
            String string2 = Arrays.toString(this.d.toArray());
            StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 22 + String.valueOf(string).length() + String.valueOf(string2).length());
            sb.append(strA);
            sb.append(" leaves: ");
            sb.append(string);
            sb.append(" containers: ");
            sb.append(string2);
            return sb.toString();
        }
    }

    public static final class b extends zl1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final okh f41416b;

        public b(int i, okh okhVar) {
            super(i);
            this.f41416b = okhVar;
        }
    }

    public zl1(int i) {
        this.f41414a = i;
    }

    public static String a(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public static int b(int i) {
        return i & 16777215;
    }

    public static int c(int i) {
        return (i >> 24) & 255;
    }

    public String toString() {
        return a(this.f41414a);
    }
}
