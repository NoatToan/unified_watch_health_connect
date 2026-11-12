package com.mapbox.maps.extension.style.utils;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.maps.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0000\u001a(\u0010\u0005\u001a\u0002H\u0006\"\u0006\b\u0000\u0010\u0006\u0018\u0001*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u0002H\u0080\b¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"check", "", "Lcom/mapbox/bindgen/Expected;", "", "Lcom/mapbox/bindgen/None;", "take", "T", "(Lcom/mapbox/bindgen/Expected;)Ljava/lang/Object;", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ExpectedUtilsKt {
    public static final void check(Expected<String, None> expected) {
        if (expected == null) {
            p.n("Plugin is not added to Style yet.");
            return;
        }
        String error = expected.getError();
        if (error == null) {
            return;
        }
        p.n(error);
    }

    public static final /* synthetic */ <T> T take(Expected<String, T> expected) {
        if (expected != null) {
            String error = expected.getError();
            if (error != null) {
                p.n(error);
                return null;
            }
            T value = expected.getValue();
            if (value != null) {
                return value;
            }
        }
        p.n("Plugin is not added to Style yet.");
        return null;
    }
}
