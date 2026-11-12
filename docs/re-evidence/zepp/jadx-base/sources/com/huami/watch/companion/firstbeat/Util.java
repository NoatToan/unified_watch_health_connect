package com.huami.watch.companion.firstbeat;

import com.huami.watch.companion.util.NumberFormatter;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/watch/companion/firstbeat/Util;", "", "", "isJapanese", "", "onlySupportSomeDevices", "", "value", "", "formatVo2max", "(Ljava/lang/Float;)I", "<init>", "()V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class Util {

    @NotNull
    public static final Util INSTANCE = new Util();

    private Util() {
    }

    public final int formatVo2max(@Nullable Float value) {
        if (value == null) {
            return 0;
        }
        return (int) NumberFormatter.format(value.floatValue(), 0, 1);
    }

    public final boolean isJapanese() {
        return Intrinsics.areEqual(Locale.getDefault(), Locale.JAPAN) || Intrinsics.areEqual(Locale.getDefault(), Locale.JAPANESE) || Intrinsics.areEqual(Locale.getDefault().getLanguage(), Locale.JAPANESE.getLanguage());
    }

    @NotNull
    public final String onlySupportSomeDevices() {
        return "この機能は、一部のデバイスでのみサポートされています";
    }
}
