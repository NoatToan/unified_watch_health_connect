package com.huami.worldclock.add.alphabetic;

import android.os.Build;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/huami/worldclock/add/alphabetic/LabelProcess;", "", "Ljava/util/Locale;", "locale", "", "label", "labelUnifiedProcessing", "<init>", "()V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class LabelProcess {

    @NotNull
    public static final LabelProcess INSTANCE = new LabelProcess();

    private LabelProcess() {
    }

    @NotNull
    public final String labelUnifiedProcessing(@NotNull Locale locale, @NotNull String label) {
        if ((Intrinsics.areEqual(locale, Locale.TRADITIONAL_CHINESE) || Intrinsics.areEqual(locale, new Locale("zh", "HK"))) && label.length() >= 2) {
            return StringsKt__StringsKt.substring(label, new IntRange(0, label.length() - 2));
        }
        return (Build.VERSION.SDK_INT < 21 || label.length() < 2 || !Intrinsics.areEqual(locale, new Locale.Builder().setLanguage("zh").setRegion("CN").setScript("Hant").build())) ? label : StringsKt__StringsKt.substring(label, new IntRange(0, label.length() - 2));
    }
}
