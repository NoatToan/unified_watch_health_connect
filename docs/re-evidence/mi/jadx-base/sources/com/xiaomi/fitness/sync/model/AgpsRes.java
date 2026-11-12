package com.xiaomi.fitness.sync.model;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class AgpsRes extends BaseResult {
    public Result result;

    public static class Result {
        public String agps_fds_url;
        public String source;

        public String toString() {
            return "source=" + this.source + ", agps_fds_url=" + this.agps_fds_url;
        }
    }

    @Override // com.xiaomi.fitness.sync.model.BaseResult
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AgpsRes{result=");
        Result result = this.result;
        sb.append(result == null ? null : result.toString());
        sb.append(", code=");
        sb.append(this.code);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
