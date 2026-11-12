package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class fsg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f34472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnClickListener f34474c;
    private int d;
    private Drawable e;
    private Drawable g;
    private Map<String, Object> h;
    private String i;
    private CharSequence j;

    public void b(fsg fsgVar) {
        if (fsgVar == null) {
            return;
        }
        this.f34473b = fsgVar.e();
        this.d = fsgVar.d();
        this.e = fsgVar.c();
        this.f34472a = fsgVar.a();
        this.j = fsgVar.i();
        this.g = fsgVar.f();
        this.f34474c = fsgVar.b();
        this.i = fsgVar.g();
        this.h = fsgVar.h();
    }

    public int e() {
        return this.f34473b;
    }

    public void d(int i) {
        this.f34473b = i;
    }

    public int d() {
        return this.d;
    }

    public void e(int i) {
        this.d = i;
    }

    public Drawable c() {
        return this.e;
    }

    public void d(Drawable drawable) {
        this.e = drawable;
    }

    public CharSequence a() {
        return this.f34472a;
    }

    public void a(CharSequence charSequence) {
        this.f34472a = charSequence;
    }

    public CharSequence i() {
        return this.j;
    }

    public void c(CharSequence charSequence) {
        this.j = charSequence;
    }

    public Drawable f() {
        return this.g;
    }

    public View.OnClickListener b() {
        return this.f34474c;
    }

    public void d(View.OnClickListener onClickListener) {
        this.f34474c = onClickListener;
    }

    public String g() {
        return this.i;
    }

    public Map<String, Object> h() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsg)) {
            return false;
        }
        fsg fsgVar = (fsg) obj;
        return e() == fsgVar.e() && d() == fsgVar.d() && Objects.equals(c(), fsgVar.c()) && c(a(), fsgVar.a()) && c(i(), fsgVar.i()) && Objects.equals(f(), fsgVar.f()) && Objects.equals(b(), fsgVar.b()) && Objects.equals(g(), fsgVar.g()) && Objects.equals(h(), fsgVar.h());
    }

    public int hashCode() {
        int iE = e();
        int iD = d();
        return Objects.hash(Integer.valueOf(iE), Integer.valueOf(iD), c(), a(), i(), f(), b(), g(), h());
    }

    private boolean c(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        return (charSequence == null || charSequence2 == null || !charSequence.toString().equals(charSequence2.toString())) ? false : true;
    }
}
