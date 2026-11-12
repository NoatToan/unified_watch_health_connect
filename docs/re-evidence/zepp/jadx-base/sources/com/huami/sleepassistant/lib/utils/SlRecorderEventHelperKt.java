package com.huami.sleepassistant.lib.utils;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0002\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0000*\u00020\u0000\u001aF\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\"\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0016\u0010\u0013\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f\"\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000f\"\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000f\"\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"Lcom/huami/mifit/analytics/builder/CountEventBuilder;", "recordUser", "notRecordUser", "realTimeUpload", "notRealTimeUpload", "R", "", "id", "fr", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "withCountBuilder", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "a", "Ljava/lang/String;", "ID", "b", "TP", "FR", "c", "POS", GoogleApiAvailabilityLight.a, "N", "e", "FR_HOME", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class SlRecorderEventHelperKt {

    @NotNull
    public static final String FR = "fr";

    @NotNull
    private static final String a = "id";

    @NotNull
    private static final String b = "tp";

    @NotNull
    private static final String c = "pos";

    @NotNull
    private static final String d = "n";

    @NotNull
    private static final String e = "home";

    @NotNull
    public static final CountEventBuilder notRealTimeUpload(@NotNull CountEventBuilder countEventBuilder) {
        countEventBuilder.setRealTimeRecord(false);
        return countEventBuilder;
    }

    @NotNull
    public static final CountEventBuilder notRecordUser(@NotNull CountEventBuilder countEventBuilder) {
        countEventBuilder.setAnonymous(true);
        countEventBuilder.setIdentified(false);
        return countEventBuilder;
    }

    @NotNull
    public static final CountEventBuilder realTimeUpload(@NotNull CountEventBuilder countEventBuilder) {
        countEventBuilder.setRealTimeRecord(true);
        return countEventBuilder;
    }

    @NotNull
    public static final CountEventBuilder recordUser(@NotNull CountEventBuilder countEventBuilder) {
        countEventBuilder.setAnonymous(false);
        countEventBuilder.setIdentified(true);
        return countEventBuilder;
    }

    public static final <R> R withCountBuilder(@NotNull String str, @Nullable String str2, @NotNull Function1<? super CountEventBuilder, ? extends R> function1) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(str);
        if (str2 != null) {
            countEventBuilder.addExtra("fr", str2);
        }
        return function1.invoke(countEventBuilder);
    }

    public static /* synthetic */ Object withCountBuilder$default(String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        CountEventBuilder countEventBuilder = new CountEventBuilder(str);
        if (str2 != null) {
            countEventBuilder.addExtra("fr", str2);
        }
        return function1.invoke(countEventBuilder);
    }
}
