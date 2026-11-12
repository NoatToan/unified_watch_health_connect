package com.xiaomi.ai.edge.common.model;

import defpackage.n08;

/* JADX INFO: loaded from: classes7.dex */
public class FullEdgeRequestEnv extends n08 {
    private String[] currentModels;
    private String[] denyPermissions;
    private boolean selectDefaultCard;

    public String[] getCurrentModels() {
        return this.currentModels;
    }

    public String[] getDenyPermissions() {
        return this.denyPermissions;
    }

    public boolean isSelectDefaultCard() {
        return this.selectDefaultCard;
    }

    public void setCurrentModels(String[] strArr) {
        this.currentModels = strArr;
    }

    public void setDenyPermissions(String[] strArr) {
        this.denyPermissions = strArr;
    }

    public void setSelectDefaultCard(boolean z) {
        this.selectDefaultCard = z;
    }
}
