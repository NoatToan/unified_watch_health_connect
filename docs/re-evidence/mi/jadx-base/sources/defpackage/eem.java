package defpackage;

import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.camera.core.f;
import androidx.camera.core.m;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class eem extends f {

    @GuardedBy("this")
    public boolean c;

    public eem(m mVar) {
        super(mVar);
        this.c = false;
    }

    @Override // androidx.camera.core.f, androidx.camera.core.m, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.c) {
            this.c = true;
            super.close();
        }
    }
}
