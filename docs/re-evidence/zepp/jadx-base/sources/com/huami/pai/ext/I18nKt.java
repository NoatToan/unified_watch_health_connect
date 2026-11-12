package com.huami.pai.ext;

import com.google.android.material.timepicker.TimeModel;
import com.huami.watch.ota.UpdateUtils;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0000\u001a\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"", "", "i18nString", "i18n", "", "places", "", "isJapanese", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class I18nKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Integer, CharSequence> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @NotNull
        public final CharSequence a(int i) {
            return UpdateUtils.CMD_FILTER;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @NotNull
    public static final String i18n(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
    }

    public static /* synthetic */ String i18n$default(float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return i18n(f, i);
    }

    @NotNull
    public static final String i18nString(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
    }

    public static final boolean isJapanese() {
        return Intrinsics.areEqual(Locale.getDefault().getLanguage(), Locale.JAPANESE.getLanguage());
    }

    @NotNull
    public static final String i18n(float f, int i) {
        return new DecimalFormat("#." + CollectionsKt___CollectionsKt.joinToString$default(e.downTo(i, 1), "", null, null, 0, null, a.a, 30, null), new DecimalFormatSymbols(Locale.getDefault())).format(Float.valueOf(f));
    }
}
