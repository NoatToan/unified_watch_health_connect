package com.huami.applet.extension;

import com.huami.applet.jsengine.engine.JsEngine;
import com.huami.applet.utils.UtilsKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\b"}, d2 = {"Lcom/huami/applet/jsengine/engine/JsEngine;", "", "byteArray", "", "onBlueMessage", "", "msg", "loadFileAsScript", "applet_release"}, k = 2, mv = {1, 5, 1})
public final class JsEngineExtKt {
    public static final void loadFileAsScript(@NotNull JsEngine jsEngine, @NotNull String str) {
        jsEngine.eval("window._loadFileAsScript(\"" + str + "\")");
    }

    public static final void onBlueMessage(@NotNull JsEngine jsEngine, @NotNull byte[] bArr) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        sb.append((Object) UtilsKt.byteToHexString(bArr));
        sb.append('\"');
        jsEngine.eval(String.format("window.BLE.onMessage(%s)", Arrays.copyOf(new Object[]{sb.toString()}, 1)));
    }
}
