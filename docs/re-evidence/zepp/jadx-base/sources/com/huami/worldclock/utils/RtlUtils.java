package com.huami.worldclock.utils;

import androidx.core.text.TextUtilsCompat;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/worldclock/utils/RtlUtils;", "", "", "isRTL", "<init>", "()V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class RtlUtils {

    @NotNull
    public static final RtlUtils INSTANCE = new RtlUtils();

    private RtlUtils() {
    }

    public final boolean isRTL() {
        return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }
}
