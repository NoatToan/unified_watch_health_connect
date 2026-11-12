package com.xiaomi.hm.health.baseutil;

import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/baseutil/StringConvertUtils;", "", "()V", "Companion", "hmutil_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class StringConvertUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final NumberFormat nf;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/baseutil/StringConvertUtils$Companion;", "", "()V", "nf", "Ljava/text/NumberFormat;", "getNf", "()Ljava/text/NumberFormat;", "stringConvertDouble", "", "str", "", "stringConvertFloat", "", "stringConvertInt", "", "hmutil_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NumberFormat getNf() {
            return StringConvertUtils.nf;
        }

        public final double stringConvertDouble(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "str");
            if (StringsKt__StringsKt.isBlank(str)) {
                return 0.0d;
            }
            return getNf().parse(str).doubleValue();
        }

        public final float stringConvertFloat(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "str");
            if (StringsKt__StringsKt.isBlank(str)) {
                return 0.0f;
            }
            return getNf().parse(str).floatValue();
        }

        public final int stringConvertInt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "str");
            if (StringsKt__StringsKt.isBlank(str)) {
                return 0;
            }
            return getNf().parse(str).intValue();
        }
    }

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.ENGLISH);
        Intrinsics.checkNotNullExpressionValue(numberFormat, "getInstance(Locale.ENGLISH)");
        nf = numberFormat;
    }
}
