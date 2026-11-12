package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class fru {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f34454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnClickListener f34456c;
    private CharSequence d;
    private CharSequence e;
    private CharSequence h;

    public CharSequence a() {
        return this.e;
    }

    public void a(CharSequence charSequence) {
        this.e = charSequence;
    }

    public CharSequence h() {
        return this.h;
    }

    public void e(CharSequence charSequence) {
        this.h = charSequence;
    }

    public CharSequence e() {
        return this.f34454a;
    }

    public void d(CharSequence charSequence) {
        this.f34454a = charSequence;
    }

    public int c() {
        return this.f34455b;
    }

    public void b(int i) {
        this.f34455b = i;
    }

    public CharSequence d() {
        return this.d;
    }

    public void b(CharSequence charSequence) {
        this.d = charSequence;
    }

    public void d(View.OnClickListener onClickListener) {
        this.f34456c = onClickListener;
    }

    public View.OnClickListener b() {
        return this.f34456c;
    }

    public String toString() {
        return "ModelCardBean{title=" + ((Object) this.e) + ", value=" + ((Object) this.h) + ", goal=" + ((Object) this.f34454a) + ", describe=" + ((Object) this.d) + ", iconId=" + this.f34455b + '}';
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof fru)) {
            return false;
        }
        fru fruVar = (fru) obj;
        return c() == fruVar.c() && TextUtils.equals(a(), fruVar.a()) && TextUtils.equals(h(), fruVar.h()) && TextUtils.equals(e(), fruVar.e()) && TextUtils.equals(d(), fruVar.d());
    }

    public int hashCode() {
        CharSequence charSequenceA = a();
        CharSequence charSequenceH = h();
        CharSequence charSequenceE = e();
        int iC = c();
        return Objects.hash(charSequenceA, charSequenceH, charSequenceE, Integer.valueOf(iC), d());
    }
}
