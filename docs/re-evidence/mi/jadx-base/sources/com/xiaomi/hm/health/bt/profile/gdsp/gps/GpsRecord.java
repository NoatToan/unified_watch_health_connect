package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class GpsRecord implements Serializable {
    private static final long serialVersionUID = 1;
    private SportDetail detail;
    private SportSummary summary;

    public SportDetail getDetail() {
        return this.detail;
    }

    public SportSummary getSummary() {
        return this.summary;
    }

    public void setDetail(SportDetail sportDetail) {
        this.detail = sportDetail;
    }

    public void setSummary(SportSummary sportSummary) {
        this.summary = sportSummary;
    }

    public String toString() {
        return "GpsRecord{detail=" + this.detail + ", summary=" + this.summary + AbstractJsonLexerKt.END_OBJ;
    }
}
