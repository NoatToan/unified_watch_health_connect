package com.xiaomi.hm.health.training.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class TraInitOption implements Serializable {
    private String a;
    private String b;
    private int c;
    private int d;
    private boolean e;

    public int getBackgroundColor() {
        return this.d;
    }

    public int getImageResId() {
        return this.c;
    }

    public String getOptionContent() {
        return this.b;
    }

    public String getOptionTitle() {
        return this.a;
    }

    public boolean isChecked() {
        return this.e;
    }

    public void setBackgroundColor(int i) {
        this.d = i;
    }

    public void setChecked(boolean z) {
        this.e = z;
    }

    public void setImageResId(int i) {
        this.c = i;
    }

    public void setOptionContent(String str) {
        this.b = str;
    }

    public void setOptionTitle(String str) {
        this.a = str;
    }
}
