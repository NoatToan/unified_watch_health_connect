package com.huami.bodymeasurements.temperature.model.converter;

import android.util.Base64;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/converter/Base64Utils;", "", "", "input", "", "encodeToString", "str", "decode", "<init>", "()V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class Base64Utils {

    @NotNull
    public static final Base64Utils INSTANCE = new Base64Utils();

    private Base64Utils() {
    }

    @NotNull
    public final byte[] decode(@NotNull String str) {
        return Base64.decode(str, 2);
    }

    @NotNull
    public final String encodeToString(@NotNull byte[] input) {
        return Base64.encodeToString(input, 2);
    }
}
