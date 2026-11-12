package com.huami.widget.baseadapter;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public abstract class SectionMultiEntity<T> implements Serializable, MultiItemEntity {
    public String header;
    public boolean isHeader;
    public T t;

    public SectionMultiEntity(boolean z, String str) {
        this.isHeader = z;
        this.header = str;
        this.t = null;
    }

    public String getHeader() {
        return this.header;
    }

    public abstract int getHeaderType();

    public T getT() {
        return this.t;
    }

    public boolean isHeader() {
        return this.isHeader;
    }

    public void setHeader(boolean z) {
        this.isHeader = z;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void setHeader(String str) {
        this.header = str;
    }

    public SectionMultiEntity(T t) {
        this.isHeader = false;
        this.header = null;
        this.t = t;
    }
}
