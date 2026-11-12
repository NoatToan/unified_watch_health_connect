package hc;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface f0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f82923b;

        public a(String str, int i14, byte[] bArr) {
            this.f82922a = str;
            this.f82923b = bArr;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f82924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f82926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<a> f82927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f82928e;

        public b(int i14, String str, int i15, List<a> list, byte[] bArr) {
            this.f82924a = i14;
            this.f82925b = str;
            this.f82926c = i15;
            this.f82927d = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.f82928e = bArr;
        }

        public final int a() {
            int i14 = this.f82926c;
            if (i14 != 2) {
                return i14 != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    public interface c {
        f0 a(int i14, b bVar);

        SparseArray<f0> createInitialPayloadReaders();
    }

    void a(fa.w wVar, bb.p pVar, d dVar);

    void b(int i14, fa.r rVar);

    void seek();

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f82930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f82931c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f82932d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f82933e;

        public d(int i14, int i15, int i16) {
            this.f82929a = i14 != Integer.MIN_VALUE ? androidx.core.view.j.f(i14, "/") : "";
            this.f82930b = i15;
            this.f82931c = i16;
            this.f82932d = Integer.MIN_VALUE;
            this.f82933e = "";
        }

        public final void a() {
            int i14 = this.f82932d;
            this.f82932d = i14 == Integer.MIN_VALUE ? this.f82930b : i14 + this.f82931c;
            this.f82933e = this.f82929a + this.f82932d;
        }

        public final void b() {
            if (this.f82932d != Integer.MIN_VALUE) {
                return;
            }
            vb.h.z("generateNewId() must be called before retrieving ids.");
        }

        public d(int i14, int i15) {
            this(Integer.MIN_VALUE, i14, i15);
        }
    }
}
