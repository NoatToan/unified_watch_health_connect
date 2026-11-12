package com.xiaomi.hm.health.bodyfat.utils;

import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\b\u001a\u00020\u00038\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001e\u0010\r\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/utils/BodyFatDecimalUtil;", "", "", "", "toStr", "(Ljava/lang/Float;)Ljava/lang/String;", "a", "Ljava/lang/String;", "DEFAUL_VALUE", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "b", "Ljava/text/NumberFormat;", "nf", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class BodyFatDecimalUtil {

    @NotNull
    public static final BodyFatDecimalUtil INSTANCE = new BodyFatDecimalUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String DEFAUL_VALUE = "0";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final NumberFormat nf = NumberFormat.getInstance(Locale.ENGLISH);

    private BodyFatDecimalUtil() {
    }

    @Nullable
    public final String toStr(@Nullable Float f) {
        if (f == null) {
            return DEFAUL_VALUE;
        }
        NumberFormat numberFormat = nf;
        numberFormat.setMaximumFractionDigits(6);
        return numberFormat.format(f);
    }
}
