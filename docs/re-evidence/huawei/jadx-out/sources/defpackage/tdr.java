package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public class tdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f49004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f49005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f49006c;
    private View.OnClickListener d;
    private Drawable e;
    private Drawable f;
    private Map<String, Object> h;
    private String i;
    private CharSequence j;

    public void d(tdr tdrVar) {
        if (tdrVar == null) {
            return;
        }
        this.f49004a = tdrVar.d();
        this.f49006c = tdrVar.e();
        this.e = tdrVar.b();
        this.f49005b = tdrVar.a();
        this.j = tdrVar.j();
        this.f = tdrVar.f();
        this.d = tdrVar.c();
        this.i = tdrVar.g();
        this.h = tdrVar.h();
    }

    public int d() {
        return this.f49004a;
    }

    public void e(int i) {
        this.f49004a = i;
    }

    public int e() {
        return this.f49006c;
    }

    public void d(int i) {
        this.f49006c = i;
    }

    public Drawable b() {
        return this.e;
    }

    public void e(Drawable drawable) {
        this.e = drawable;
    }

    public CharSequence a() {
        return this.f49005b;
    }

    public void c(CharSequence charSequence) {
        this.f49005b = charSequence;
    }

    public CharSequence j() {
        return this.j;
    }

    public void a(CharSequence charSequence) {
        this.j = charSequence;
    }

    public Drawable f() {
        return this.f;
    }

    public void d(Drawable drawable) {
        this.f = drawable;
    }

    public View.OnClickListener c() {
        return this.d;
    }

    public void e(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public String g() {
        return this.i;
    }

    public void c(String str) {
        this.i = str;
    }

    public Map<String, Object> h() {
        return this.h;
    }

    public void d(Map<String, Object> map) {
        this.h = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdr)) {
            return false;
        }
        tdr tdrVar = (tdr) obj;
        return d() == tdrVar.d() && e() == tdrVar.e() && Objects.equals(b(), tdrVar.b()) && e(a(), tdrVar.a()) && e(j(), tdrVar.j()) && Objects.equals(f(), tdrVar.f()) && Objects.equals(c(), tdrVar.c()) && Objects.equals(g(), tdrVar.g()) && Objects.equals(h(), tdrVar.h());
    }

    public int hashCode() {
        int iD = d();
        int iE = e();
        return Objects.hash(Integer.valueOf(iD), Integer.valueOf(iE), b(), a(), j(), f(), c(), g(), h());
    }

    private boolean e(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        return (charSequence == null || charSequence2 == null || !charSequence.toString().equals(charSequence2.toString())) ? false : true;
    }
}
