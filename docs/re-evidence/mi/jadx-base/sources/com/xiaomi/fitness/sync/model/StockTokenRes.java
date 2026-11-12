package com.xiaomi.fitness.sync.model;

import android.text.TextUtils;
import com.xiaomi.fitness.sync.export.model.StockModel;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class StockTokenRes {
    public StockModel.StockToken data;
    public boolean is_succ;

    public boolean oK() {
        StockModel.StockToken stockToken;
        return (!this.is_succ || (stockToken = this.data) == null || TextUtils.isEmpty(stockToken.access_token)) ? false : true;
    }

    public String toString() {
        return "StockTokenRes{is_succ=" + this.is_succ + ", data=" + this.data + AbstractJsonLexerKt.END_OBJ;
    }
}
