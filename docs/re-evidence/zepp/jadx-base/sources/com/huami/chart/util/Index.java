package com.huami.chart.util;

import androidx.annotation.Nullable;
import com.huami.chart.data.BaseIndex;

/* JADX INFO: loaded from: classes6.dex */
public class Index {
    public static final Index INVALID_INDEX = new Index(-1, null);
    private static final String d = "Index";
    private int a;
    private BaseIndex b;
    private float c = -1.0f;

    public Index() {
    }

    public Index addIndex(Index index) {
        if (index.isInvalidate()) {
            return this;
        }
        setDataIndex(getDataIndex() + index.getDataIndex());
        if (index.getPosiIndex() != null && getPosiIndex() != null) {
            setPosiIndex(new BaseIndex(getPosiIndex().getStart() + index.getPosiIndex().getStart(), getPosiIndex().getEnd() + index.getPosiIndex().getEnd()));
        }
        return this;
    }

    public float getCenterX() {
        return this.c;
    }

    public int getDataIndex() {
        return this.a;
    }

    public BaseIndex getPosiIndex() {
        return this.b;
    }

    public boolean isInvalidate() {
        return this.a == -1 && this.b == null;
    }

    public void setCenterX(float f) {
        this.c = f;
    }

    public void setDataIndex(int i) {
        this.a = i;
    }

    public void setPosiIndex(BaseIndex baseIndex) {
        this.b = baseIndex;
    }

    public String toString() {
        return "dataIndex: " + this.a + " positionIndex: " + this.b + " centerX: " + this.c;
    }

    public Index(int i, @Nullable BaseIndex baseIndex) {
        this.a = i;
        this.b = baseIndex;
    }
}
