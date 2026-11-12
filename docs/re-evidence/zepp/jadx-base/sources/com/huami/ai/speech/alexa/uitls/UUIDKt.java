package com.huami.ai.speech.alexa.uitls;

import android.annotation.SuppressLint;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0001¨\u0006\u0002"}, d2 = {"", "generateUuidString", "speech-alexa_release"}, k = 2, mv = {1, 5, 1})
public final class UUIDKt {
    @SuppressLint({"DefaultLocale"})
    @NotNull
    public static final String generateUuidString() {
        String strReplace$default = m.replace$default(UUID.randomUUID().toString(), Constants.ACCEPT_TIME_SEPARATOR_SERVER, "", false, 4, (Object) null);
        Locale locale = Locale.getDefault();
        Objects.requireNonNull(strReplace$default, "null cannot be cast to non-null type java.lang.String");
        return strReplace$default.toLowerCase(locale);
    }
}
