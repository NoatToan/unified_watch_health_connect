package com.zhouyou.recyclerview.group;

/* JADX INFO: loaded from: classes22.dex */
public class GroupStructure {
    private boolean a;
    private boolean b;
    private int c;

    public GroupStructure(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    public int getChildrenCount() {
        return this.c;
    }

    public boolean hasFooter() {
        return this.b;
    }

    public boolean hasHeader() {
        return this.a;
    }

    public void setChildrenCount(int i) {
        this.c = i;
    }

    public void setHasFooter(boolean z) {
        this.b = z;
    }

    public void setHasHeader(boolean z) {
        this.a = z;
    }
}
