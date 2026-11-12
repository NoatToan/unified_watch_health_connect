package defpackage;

import android.util.SparseArray;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class sdt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray<a> f33548a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33549b = 2;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f33551b;

        public a(int i, int i2) {
            this.f33550a = i;
            this.f33551b = i2;
        }

        public String toString() {
            return "{touchTime=" + this.f33550a + ",flyTime=" + this.f33551b + "}";
        }
    }

    public void a(int i) {
        this.f33549b = i;
    }

    public void b(int i, int i2, int i3) {
        this.f33548a.put(i, new a(i2, i3));
    }

    public String toString() {
        return "GaitInfo{gaits=" + this.f33548a + ", type=" + this.f33549b + AbstractJsonLexerKt.END_OBJ;
    }
}
