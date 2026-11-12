package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jbr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static jbr f38353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<jpg> f38354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38355c;
    private List<Integer> d;
    private Bitmap e;
    private jqp f = null;
    private List<jpg> g;

    public static jbr c() {
        if (f38353a == null) {
            f38353a = new jbr();
        }
        return f38353a;
    }

    public void b(jqp jqpVar) {
        this.f = jqpVar;
    }

    public jqp d() {
        return this.f;
    }

    public static void e() {
        jbr jbrVar = f38353a;
        if (jbrVar != null) {
            jbrVar.e = null;
            jbrVar.g = null;
            jbrVar.f = null;
            jbrVar.f38354b = null;
            jbrVar.d = null;
        }
        f38353a = null;
    }

    public void e(boolean z) {
        this.f38355c = z;
    }

    public void e(Bitmap bitmap) {
        this.e = bitmap;
    }

    public boolean a() {
        return this.e != null;
    }

    public Bitmap b() {
        return this.e;
    }

    public void b(List<jpg> list) {
        this.g = list;
    }

    public List<jpg> i() {
        return this.g;
    }

    public List<jpg> f() {
        return this.f38354b;
    }

    public void d(List<jpg> list) {
        this.f38354b = list;
    }

    public List<Integer> h() {
        return this.d;
    }

    public void c(List<Integer> list) {
        this.d = list;
    }
}
