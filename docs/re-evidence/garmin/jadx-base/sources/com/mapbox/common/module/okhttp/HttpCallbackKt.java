package com.mapbox.common.module.okhttp;

import java.util.HashMap;
import java.util.Locale;
import okhttp3.Headers;
import okhttp3.Response;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"generateOutputHeaders", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "response", "Lokhttp3/Response;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class HttpCallbackKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap<String, String> generateOutputHeaders(Response response) {
        HashMap<String, String> map = new HashMap<>();
        Headers headers = response.headers();
        int size = headers.size();
        for (int i14 = 0; i14 < size; i14++) {
            String lowerCase = headers.name(i14).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            map.put(lowerCase, headers.value(i14));
        }
        return map;
    }
}
