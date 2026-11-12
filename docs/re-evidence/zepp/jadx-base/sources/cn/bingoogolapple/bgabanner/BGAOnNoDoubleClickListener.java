package cn.bingoogolapple.bgabanner;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BGAOnNoDoubleClickListener implements View.OnClickListener {
    private int a;
    private long b;

    public BGAOnNoDoubleClickListener() {
        this.a = 1000;
        this.b = 0L;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.b > this.a) {
            this.b = jCurrentTimeMillis;
            onNoDoubleClick(view);
        }
    }

    public abstract void onNoDoubleClick(View view);

    public BGAOnNoDoubleClickListener(int i) {
        this.a = 1000;
        this.b = 0L;
        this.a = i;
    }
}
