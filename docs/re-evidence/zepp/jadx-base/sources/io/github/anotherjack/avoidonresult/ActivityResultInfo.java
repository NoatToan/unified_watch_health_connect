package io.github.anotherjack.avoidonresult;

import android.content.Intent;

/* JADX INFO: loaded from: classes22.dex */
public class ActivityResultInfo {
    private int a;
    private Intent b;

    public ActivityResultInfo(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }

    public Intent getData() {
        return this.b;
    }

    public int getResultCode() {
        return this.a;
    }

    public void setData(Intent intent) {
        this.b = intent;
    }

    public void setResultCode(int i) {
        this.a = i;
    }
}
