package com.service.mi.entity;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class SpError implements Serializable {
    private String description;
    private String reasonCode;

    public String getDescription() {
        return this.description;
    }

    public String getReasonCode() {
        return this.reasonCode;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setReasonCode(String str) {
        this.reasonCode = str;
    }

    public String toString() {
        return "SpError{reasonCode='" + this.reasonCode + "', description='" + this.description + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
