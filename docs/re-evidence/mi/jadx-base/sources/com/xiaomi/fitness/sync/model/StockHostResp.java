package com.xiaomi.fitness.sync.model;

import com.xiaomi.fitness.sync.export.model.StockModel;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class StockHostResp {
    public ArrayList<StockModel.StockHost> items;
    public int ret = -1;

    public String toString() {
        return "StockHostResp{ret=" + this.ret + ", items=" + this.items + AbstractJsonLexerKt.END_OBJ;
    }
}
