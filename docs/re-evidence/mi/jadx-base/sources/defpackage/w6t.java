package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class w6t extends v6t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f37675b;
    public boolean c;

    public w6t(Context context, boolean z) {
        this.f37675b = context;
        this.c = z;
    }

    @Override // defpackage.v6t
    public final boolean d() {
        return h0t.K(this.f37675b) == 1 || this.c;
    }
}
