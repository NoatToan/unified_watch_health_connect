package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class u6t extends v6t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35480b;
    public long c;
    public String d;
    public Context e;

    public u6t(Context context, int i, String str, v6t v6tVar) {
        super(v6tVar);
        this.f35480b = i;
        this.d = str;
        this.e = context;
    }

    @Override // defpackage.v6t
    public final void c(boolean z) {
        super.c(z);
        if (z) {
            String str = this.d;
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.c = jCurrentTimeMillis;
            k2t.d(this.e, str, String.valueOf(jCurrentTimeMillis));
        }
    }

    @Override // defpackage.v6t
    public final boolean d() {
        if (this.c == 0) {
            String strA = k2t.a(this.e, this.d);
            this.c = TextUtils.isEmpty(strA) ? 0L : Long.parseLong(strA);
        }
        return System.currentTimeMillis() - this.c >= ((long) this.f35480b);
    }
}
