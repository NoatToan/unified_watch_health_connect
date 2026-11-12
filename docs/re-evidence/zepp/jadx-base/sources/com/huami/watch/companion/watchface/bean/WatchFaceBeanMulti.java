package com.huami.watch.companion.watchface.bean;

import com.huami.widget.baseadapter.SectionMultiEntity;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceBeanMulti extends SectionMultiEntity<WatchFaceBean> {
    private int headerItemType;
    private boolean isRight;
    private int itemType;

    public WatchFaceBeanMulti(boolean z, int i, String str, boolean z2) {
        super(z, str);
        this.isRight = z2;
        this.headerItemType = i;
    }

    public int getHeaderItemType() {
        return this.headerItemType;
    }

    @Override // com.huami.widget.baseadapter.SectionMultiEntity
    public int getHeaderType() {
        return this.headerItemType;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.itemType;
    }

    public boolean isRight() {
        return this.isRight;
    }

    public void setHeaderItemType(int i) {
        this.headerItemType = i;
    }

    public void setItemType(int i) {
        this.itemType = i;
    }

    public void setRight(boolean z) {
        this.isRight = z;
    }

    public WatchFaceBeanMulti(int i, WatchFaceBean watchFaceBean) {
        super(watchFaceBean);
        this.itemType = i;
    }
}
