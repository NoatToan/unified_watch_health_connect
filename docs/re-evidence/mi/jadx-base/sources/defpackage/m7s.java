package defpackage;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public final class m7s extends g6s {
    public final int c;
    public final String d;
    public final int e;
    public final /* synthetic */ j8s f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7s(j8s j8sVar, TaskCompletionSource taskCompletionSource, int i, String str, int i2) {
        super(j8sVar, taskCompletionSource);
        this.f = j8sVar;
        this.c = i;
        this.d = str;
        this.e = i2;
    }

    @Override // defpackage.g6s, defpackage.cxs
    public final void Y1(Bundle bundle) {
        this.f.d.u(this.f18659a);
        j8s.g.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i = this.e;
        if (i > 0) {
            this.f.j(this.c, this.d, i - 1);
        }
    }
}
