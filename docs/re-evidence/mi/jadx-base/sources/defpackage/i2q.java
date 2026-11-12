package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface i2q {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20714b;
        public final byte[] c;

        public a(String str, int i, byte[] bArr) {
            this.f20713a = str;
            this.f20714b = i;
            this.c = bArr;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f20716b;
        public final List<a> c;
        public final byte[] d;

        public b(int i, String str, List<a> list, byte[] bArr) {
            this.f20715a = i;
            this.f20716b = str;
            this.c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.d = bArr;
        }
    }

    public interface c {
        i2q a(int i, b bVar);

        SparseArray<i2q> b();
    }

    void a(okh okhVar, int i) throws ParserException;

    void b(rfp rfpVar, kl8 kl8Var, d dVar);

    void c();

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20718b;
        public final int c;
        public int d;
        public String e;

        public d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public void a() {
            int i = this.d;
            int i2 = i == Integer.MIN_VALUE ? this.f20718b : i + this.c;
            this.d = i2;
            String str = this.f20717a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
            sb.append(str);
            sb.append(i2);
            this.e = sb.toString();
        }

        public String b() {
            d();
            return this.e;
        }

        public int c() {
            d();
            return this.d;
        }

        public final void d() {
            if (this.d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public d(int i, int i2, int i3) {
            String string;
            if (i != Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(12);
                sb.append(i);
                sb.append("/");
                string = sb.toString();
            } else {
                string = "";
            }
            this.f20717a = string;
            this.f20718b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
            this.e = "";
        }
    }
}
