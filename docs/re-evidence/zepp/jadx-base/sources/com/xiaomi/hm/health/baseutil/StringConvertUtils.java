package com.xiaomi.hm.health.baseutil;

import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/baseutil/StringConvertUtils;", "", "<init>", "()V", "Companion", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public class StringConvertUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final NumberFormat a = NumberFormat.getInstance(Locale.ENGLISH);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u000b\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/baseutil/StringConvertUtils$Companion;", "", "", "str", "", "stringConvertInt", "", "stringConvertFloat", "", "stringConvertDouble", "Ljava/text/NumberFormat;", "nf", "Ljava/text/NumberFormat;", "getNf", "()Ljava/text/NumberFormat;", "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NumberFormat getNf() {
            return StringConvertUtils.a;
        }

        public final double stringConvertDouble(@NotNull String str) {
            if (m.isBlank(str)) {
                return 0.0d;
            }
            return getNf().parse(str).doubleValue();
        }

        public final float stringConvertFloat(@NotNull String str) {
            if (m.isBlank(str)) {
                return 0.0f;
            }
            return getNf().parse(str).floatValue();
        }

        public final int stringConvertInt(@NotNull String str) {
            if (m.isBlank(str)) {
                return 0;
            }
            return getNf().parse(str).intValue();
        }
    }
}
