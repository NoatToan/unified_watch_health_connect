package com.huami.chart.data;

import com.huami.chart.listener.IDataExtendListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BaseData {
    private List<IDataExtendListener<?>> a = new ArrayList();
    private BaseIndex b;

    public BaseData(BaseIndex baseIndex) {
        this.b = baseIndex;
    }

    public void addExtends(IDataExtendListener<?> iDataExtendListener) {
        this.a.add(iDataExtendListener);
    }

    public BaseIndex getBaseIndex() {
        return this.b;
    }

    public List<IDataExtendListener<?>> getDataExtends() {
        return this.a;
    }

    public int getEnd() {
        return this.b.getEnd();
    }

    public int getIndex() {
        return this.b.getIndex();
    }

    public int getStart() {
        return this.b.getStart();
    }
}
