package com.xiaomi.fitness.common.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/common/utils/SpanPropKey;", "", "css", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCss", "()Ljava/lang/String;", "FONT_COLOR", "BACKGROUND_COLOR", "FONT_SIZE", "FONT_WEIGHT", "FONT_STYLE", "TEXT_DECORATION", "NUMBER_FORMAT", "NUMBER_PRECISION", "MARGIN", "TEXT_REPLACE", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum SpanPropKey {
    FONT_COLOR("color"),
    BACKGROUND_COLOR("background-color"),
    FONT_SIZE("font-size"),
    FONT_WEIGHT("font-weight"),
    FONT_STYLE("font-style"),
    TEXT_DECORATION("text-decoration"),
    NUMBER_FORMAT("number-format"),
    NUMBER_PRECISION("precision"),
    MARGIN("margin"),
    TEXT_REPLACE("replace");


    @NotNull
    private final String css;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/common/utils/SpanPropKey$Companion;", "", "<init>", "()V", "fromCss", "Lcom/xiaomi/fitness/common/utils/SpanPropKey;", "cssName", "", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nStyledStringUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StyledStringUtils.kt\ncom/xiaomi/fitness/common/utils/SpanPropKey$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1251:1\n1310#2,2:1252\n*S KotlinDebug\n*F\n+ 1 StyledStringUtils.kt\ncom/xiaomi/fitness/common/utils/SpanPropKey$Companion\n*L\n99#1:1252,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SpanPropKey fromCss(@NotNull String cssName) {
            Intrinsics.checkNotNullParameter(cssName, "cssName");
            for (SpanPropKey spanPropKey : SpanPropKey.values()) {
                if (StringsKt__StringsJVMKt.equals(spanPropKey.getCss(), cssName, true)) {
                    return spanPropKey;
                }
            }
            return null;
        }
    }

    SpanPropKey(String str) {
        this.css = str;
    }

    @NotNull
    public static EnumEntries<SpanPropKey> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getCss() {
        return this.css;
    }
}
