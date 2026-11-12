package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qtg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46795c;
    private List<c> e;

    public int e() {
        return this.f46795c;
    }

    public void c(int i) {
        this.f46795c = i < 4 ? 3 : 4;
    }

    public List<c> d() {
        return this.e;
    }

    public void c(List<c> list) {
        this.e = list;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LinearGradient f46796a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LinearGradient f46797c;
        private Drawable d;
        private float e;

        public c(a aVar) {
            this.d = aVar.f46798a;
            this.e = aVar.d;
            this.f46797c = aVar.f46799c;
            this.f46796a = aVar.e;
        }

        public Drawable c() {
            return this.d;
        }

        public float e() {
            return this.e;
        }

        public LinearGradient d() {
            return this.f46797c;
        }

        public LinearGradient a() {
            return this.f46796a;
        }

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Drawable f46798a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private LinearGradient f46799c;
            private float d;
            private LinearGradient e;

            public a c(Drawable drawable) {
                this.f46798a = drawable;
                return this;
            }

            public a b(float f) {
                this.d = f;
                return this;
            }

            public a d(int[] iArr) {
                this.f46799c = new LinearGradient(0.0f, 78.993f, 0.0f, 0.0f, qre.e(iArr[0]), qre.e(iArr[1]), Shader.TileMode.CLAMP);
                return this;
            }

            public a b(int[] iArr) {
                this.e = new LinearGradient(0.0f, 78.993f, 0.0f, 0.0f, qre.e(iArr[0]), qre.e(iArr[1]), Shader.TileMode.CLAMP);
                return this;
            }

            public c c() {
                return new c(this);
            }
        }

        public String toString() {
            return "LeafData{, lightUpPercent=" + this.e + '}';
        }
    }

    public String toString() {
        return "CloverData{mLeafCount=" + this.f46795c + ", mLeafList=" + this.e + '}';
    }
}
