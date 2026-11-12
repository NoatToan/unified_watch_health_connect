package com.xiaomi.fitness.webview;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class OptionShare implements Serializable {
    private String description;
    private String imageUrl;
    private String title;
    private String url;

    public String getDescription() {
        return this.description;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "OptionShare{description='" + this.description + "', imageUrl='" + this.imageUrl + "', title='" + this.title + "', url='" + this.url + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
