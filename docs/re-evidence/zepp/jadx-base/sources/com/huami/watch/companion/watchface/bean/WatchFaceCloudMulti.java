package com.huami.watch.companion.watchface.bean;

import com.huami.widget.baseadapter.SectionMultiEntity;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceCloudMulti<T> extends SectionMultiEntity<T> {
    public static final int IMAGE_TEXT = 3;
    private String bottom;
    private boolean checked;
    private int headerItemType;
    private boolean isRight;
    private int itemType;

    public WatchFaceCloudMulti(boolean z, int i, String str) {
        super(z, str);
        this.headerItemType = i;
    }

    public String getBottom() {
        return this.bottom;
    }

    @Override // com.huami.widget.baseadapter.SectionMultiEntity
    public int getHeaderType() {
        return this.headerItemType;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.itemType;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public boolean isRight() {
        return this.isRight;
    }

    public void setBottom(String str) {
        this.bottom = str;
    }

    public void setChecked(boolean z) {
        this.checked = z;
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

    public WatchFaceCloudMulti(boolean z, int i, String str, boolean z2) {
        super(z, str);
        this.isRight = z2;
        this.headerItemType = i;
    }

    public WatchFaceCloudMulti(boolean z, int i, String str, String str2, boolean z2) {
        super(z, str);
        this.isRight = z2;
        this.bottom = str2;
        this.headerItemType = i;
    }

    public WatchFaceCloudMulti(T t) {
        super(t);
    }

    public WatchFaceCloudMulti(int i, T t) {
        super(t);
        this.itemType = i;
    }
}
