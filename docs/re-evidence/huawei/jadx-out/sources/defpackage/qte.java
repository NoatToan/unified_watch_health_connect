package defpackage;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
public class qte implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View.OnClickListener f46791c;
    private final int d;
    private long e;

    public qte(View.OnClickListener onClickListener) {
        this(1500, onClickListener);
    }

    public qte(int i, View.OnClickListener onClickListener) {
        this.d = i;
        this.f46791c = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (e()) {
            return;
        }
        this.f46791c.onClick(view);
    }

    private boolean e() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.e < this.d) {
            return true;
        }
        this.e = jElapsedRealtime;
        return false;
    }
}
