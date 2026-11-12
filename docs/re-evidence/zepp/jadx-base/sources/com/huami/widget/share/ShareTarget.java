package com.huami.widget.share;

import android.content.pm.ResolveInfo;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes17.dex */
public class ShareTarget {
    public ResolveInfo a = null;
    public boolean enable = false;
    public int icon;
    public int label;
    public String tag;
    public int type;

    public ShareTarget(int i, int i2, String str, int i3) {
        this.tag = null;
        this.icon = i;
        this.label = i2;
        this.tag = str;
        this.type = i3;
    }

    @NonNull
    public String toString() {
        return "\n<\nicon:" + this.icon + " , label:" + this.label + " , tag:" + this.tag + ", type:" + this.type + "\nresolveInfo:" + this.a + " , enable:" + this.enable;
    }
}
