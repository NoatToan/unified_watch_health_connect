package com.xiaomi.hm.health.training.ui.listener;

import android.view.View;
import com.xiaomi.hm.health.training.ui.listener.BlockMultiClickListener;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BlockMultiClickListener implements View.OnClickListener {
    private static long b;
    private long a = 750;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(WeakReference weakReference) {
        View view = (View) weakReference.get();
        if (view != null) {
            view.setEnabled(true);
        }
    }

    public static void conflictClick(View view, long... jArr) {
        view.setEnabled(false);
        long j = (jArr == null || jArr.length <= 0) ? 1000L : jArr[0];
        final WeakReference weakReference = new WeakReference(view);
        view.postDelayed(new Runnable() { // from class: vy
            @Override // java.lang.Runnable
            public final void run() {
                BlockMultiClickListener.b(weakReference);
            }
        }, j);
    }

    public boolean isMultiClick() {
        boolean z = System.currentTimeMillis() - b < this.a;
        b = System.currentTimeMillis();
        return z;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isMultiClick()) {
            return;
        }
        singleClick(view);
    }

    public abstract void singleClick(View view);
}
