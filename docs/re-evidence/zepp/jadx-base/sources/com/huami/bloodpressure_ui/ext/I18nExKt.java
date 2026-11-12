package com.huami.bloodpressure_ui.ext;

import com.google.android.material.timepicker.TimeModel;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0003H\u0000\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0000H\u0000¨\u0006\u0006"}, d2 = {"", "", "i18n", "", "", "places", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class I18nExKt {
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
    public static final String i18n(long j) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
    }

    @NotNull
    public static final String i18n(float f, int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), "%." + i + "f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
    }
}
