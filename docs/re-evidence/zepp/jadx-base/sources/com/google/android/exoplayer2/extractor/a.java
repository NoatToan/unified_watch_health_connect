package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a {
    static {
        ExtractorsFactory extractorsFactory = ExtractorsFactory.EMPTY;
    }

    public static Extractor[] a(ExtractorsFactory _this, Uri uri, Map map) {
        return _this.createExtractors();
    }

    public static /* synthetic */ Extractor[] c() {
        return new Extractor[0];
    }
}
