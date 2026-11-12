package com.huami.heartrate.utils;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.Observer;
import com.google.android.material.timepicker.TimeModel;
import com.huami.heartrate.utils.ExtensionUtilsKt;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0002\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001ar\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\t\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t2:\u0010\u0010\u001a6\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00020\u000b\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u0018\u001a\n\u0010\u0019\u001a\u00020\u0016*\u00020\u0012¨\u0006\u001a"}, d2 = {"", "millsToSecond", "secondToMills", "Lcom/huami/mifit/analytics/builder/CountEventBuilder;", "", "identifiedEvent", "T1", "T2", "R", "Landroidx/lifecycle/LiveData;", "liveData", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "a", "b", "transform", "combine", "", "", "isVerify", "(Ljava/lang/Integer;)Z", "", "formatIntOrDefaultText", "(Ljava/lang/Integer;)Ljava/lang/String;", "i18n", "heartrate_release"}, k = 2, mv = {1, 5, 1})
public final class ExtensionUtilsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MediatorLiveData mediatorLiveData, Function2 function2, LiveData liveData, LiveData liveData2, Object obj) {
        mediatorLiveData.setValue(function2.invoke(liveData.getValue(), liveData2.getValue()));
    }

    @NotNull
    public static final <T1, T2, R> LiveData<R> combine(@NotNull final LiveData<T1> liveData, @NotNull final LiveData<T2> liveData2, @NotNull final Function2<? super T1, ? super T2, ? extends R> function2) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer() { // from class: sx1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ExtensionUtilsKt.c(mediatorLiveData, function2, liveData, liveData2, obj);
            }
        });
        mediatorLiveData.addSource(liveData2, new Observer() { // from class: rx1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ExtensionUtilsKt.d(mediatorLiveData, function2, liveData, liveData2, obj);
            }
        });
        return mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(MediatorLiveData mediatorLiveData, Function2 function2, LiveData liveData, LiveData liveData2, Object obj) {
        mediatorLiveData.setValue(function2.invoke(liveData.getValue(), liveData2.getValue()));
    }

    @NotNull
    public static final String formatIntOrDefaultText(@Nullable Integer num) {
        return (num == null || num.intValue() <= 0) ? "--" : i18n(num.intValue());
    }

    @NotNull
    public static final String i18n(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
    }

    public static final void identifiedEvent(@NotNull CountEventBuilder countEventBuilder) {
        countEventBuilder.setIdentified(true);
        countEventBuilder.setAnonymous(false);
        Analytics.recordEvent(countEventBuilder);
    }

    public static final boolean isVerify(@Nullable Integer num) {
        return num != null && num.intValue() > 0;
    }

    public static final long millsToSecond(long j) {
        return j / ((long) 1000);
    }

    public static final long secondToMills(long j) {
        return j * ((long) 1000);
    }
}
