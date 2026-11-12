package com.huawei.openalliance.ad.beans.metadata;

import android.content.Context;
import android.util.Pair;
import com.huawei.openalliance.ad.annotations.a;
import com.huawei.openalliance.ad.utils.cb;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class Network {

    @a
    private List<CellInfo> cellInfo;
    private int type;

    public List<CellInfo> b() {
        return this.cellInfo;
    }

    public int a() {
        return this.type;
    }

    public Network(Context context, boolean z) {
        Pair<Integer, Pair<String, String>> pairF;
        this.type = 0;
        this.cellInfo = new ArrayList(4);
        this.type = cb.d(context);
        if (!z || (pairF = cb.f(context)) == null) {
            return;
        }
        CellInfo cellInfo = new CellInfo();
        cellInfo.a(pairF);
        this.cellInfo.add(cellInfo);
    }

    public Network() {
        this.type = 0;
        this.cellInfo = new ArrayList(4);
    }
}
