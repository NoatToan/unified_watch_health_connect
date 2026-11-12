package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class fsr extends fsn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34497b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34498c;
    private View.OnClickListener d;
    private CharSequence e;
    private int i;
    private String j;

    public fsr() {
    }

    public fsr(String str, CharSequence charSequence, String str2, int i, int i2, View.OnClickListener onClickListener) {
        this.f34498c = str;
        this.e = charSequence;
        this.j = str2;
        this.i = i;
        this.f34496a = i2;
        this.d = onClickListener;
    }

    public fsr d(int i) {
        super.c(i);
        return this;
    }

    public String e() {
        return this.f34498c;
    }

    public CharSequence a() {
        return this.e;
    }

    public String i() {
        return this.j;
    }

    public int j() {
        return this.i;
    }

    public int h() {
        return this.f34496a;
    }

    public View.OnClickListener b() {
        return this.d;
    }

    public boolean g() {
        return !TextUtils.isEmpty(this.f34498c);
    }

    public boolean f() {
        return this.f34497b;
    }

    public void e(boolean z) {
        this.f34497b = z;
    }

    public void a(SpannableString spannableString) {
        this.e = spannableString;
    }
}
