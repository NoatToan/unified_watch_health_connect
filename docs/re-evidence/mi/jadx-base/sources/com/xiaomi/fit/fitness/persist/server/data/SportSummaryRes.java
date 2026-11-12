package com.xiaomi.fit.fitness.persist.server.data;

import com.xiaomi.fit.data.common.data.sport.SportSummary;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class SportSummaryRes {
    public String next_key;
    public ArrayList<SportSummary> summaries;

    public String toString() {
        return "SportSummaryRes{summaries=" + this.summaries + AbstractJsonLexerKt.END_OBJ;
    }
}
