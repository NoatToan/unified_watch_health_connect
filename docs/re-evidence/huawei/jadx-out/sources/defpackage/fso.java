package defpackage;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class fso extends fsn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34489c;
    private View.OnClickListener d;

    public fso() {
    }

    public fso(String str, String str2, int i, View.OnClickListener onClickListener) {
        this.f34488b = str;
        this.f34487a = str2;
        this.f34489c = i;
        this.d = onClickListener;
    }

    public fso a(int i) {
        super.c(i);
        return this;
    }

    public void e(String str) {
        this.f34487a = str;
    }

    public String a() {
        return this.f34488b;
    }

    public String f() {
        return this.f34487a;
    }

    public int e() {
        return this.f34489c;
    }

    public View.OnClickListener b() {
        return this.d;
    }

    public boolean i() {
        return !TextUtils.isEmpty(this.f34488b);
    }
}
