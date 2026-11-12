package com.huawei.openalliance.ad.inter.data;

import android.text.TextUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class FeedbackInfo implements Serializable {
    private static final long serialVersionUID = 30456300;
    private long id;
    private String label;
    private int type;

    public int getType() {
        return this.type;
    }

    public String getLabel() {
        return this.label;
    }

    public boolean b() {
        if (TextUtils.isEmpty(this.label)) {
            return false;
        }
        int i = this.type;
        return i == 1 || i == 2 || i == 3;
    }

    public void a(String str) {
        this.label = str;
    }

    public void a(long j) {
        this.id = j;
    }

    public void a(int i) {
        this.type = i;
    }

    public long a() {
        return this.id;
    }
}
