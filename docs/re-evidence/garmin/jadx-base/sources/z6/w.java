package z6;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f202741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f202742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f202743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f202744d = false;

    public void a(Bundle bundle) {
        if (this.f202744d) {
            bundle.putCharSequence("android.summaryText", this.f202743c);
        }
        CharSequence charSequence = this.f202742b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String strD = d();
        if (strD != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strD);
        }
    }

    public void b(y yVar) {
    }

    public void c(Bundle bundle) {
        bundle.remove("android.summaryText");
        bundle.remove("android.title.big");
        bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
    }

    public String d() {
        return null;
    }

    public void e(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.f202743c = bundle.getCharSequence("android.summaryText");
            this.f202744d = true;
        }
        this.f202742b = bundle.getCharSequence("android.title.big");
    }

    public final void f(q qVar) {
        if (this.f202741a != qVar) {
            this.f202741a = qVar;
            if (qVar != null) {
                qVar.l(this);
            }
        }
    }
}
