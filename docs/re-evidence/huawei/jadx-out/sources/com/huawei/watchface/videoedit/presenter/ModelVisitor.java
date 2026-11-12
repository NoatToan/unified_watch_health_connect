package com.huawei.watchface.videoedit.presenter;

import com.huawei.watchface.videoedit.param.TemplateModel;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ModelVisitor<T> {
    private final int flag;
    public T selfStorage;

    public ModelVisitor(int i) {
        this.flag = i;
    }

    public int getFlag() {
        return this.flag;
    }

    public T getVisitorModel() {
        return this.selfStorage;
    }

    public abstract void onDataSetChanged(TemplateModel templateModel);
}
