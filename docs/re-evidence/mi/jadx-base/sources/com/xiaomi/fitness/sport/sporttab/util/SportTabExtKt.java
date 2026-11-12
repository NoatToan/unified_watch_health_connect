package com.xiaomi.fitness.sport.sporttab.util;

import android.app.ActivityOptions;
import android.content.Context;
import android.view.View;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.sport.utils.ExtensionsKt;
import defpackage.aki;
import defpackage.c1j;
import defpackage.zr3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u0007\u001a;\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052#\u0010\u000e\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u0007\u001a\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012¨\u0006\u0013"}, d2 = {"onClickWithZoomTransformationAnimation", "", "context", "Landroid/content/Context;", "zoomView", "Landroid/view/View;", "intentFunction", "Lkotlin/Function1;", "Landroid/app/ActivityOptions;", "Lkotlin/ParameterName;", "name", "activityOptions", "addClickListenerWithZoomEffect", "view", "callback", "getTotalDistanceTitle", "", DailyRecordKey.sportType, "", "sport_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportTabExtKt {
    public static final void addClickListenerWithZoomEffect(@NotNull Context context, @NotNull View view, @NotNull final Function1<? super ActivityOptions, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callback, "callback");
        new zr3(context, view) { // from class: com.xiaomi.fitness.sport.sporttab.util.SportTabExtKt.addClickListenerWithZoomEffect.1
            @Override // defpackage.zr3
            public void onCardZoomTriggered(ActivityOptions activityOptions) {
                callback.invoke(activityOptions);
            }
        }.setRadius((int) ExtensionsKt.getDp(15));
    }

    @NotNull
    public static final String getTotalDistanceTitle(int i) {
        if (i == 1) {
            return ResourceExtKt.getString(c1j.a4);
        }
        if (i == 2) {
            return ResourceExtKt.getString(c1j.y5);
        }
        if (i != 3 && i == 6) {
            return ResourceExtKt.getString(c1j.b1);
        }
        return ResourceExtKt.getString(c1j.a4);
    }

    public static final void onClickWithZoomTransformationAnimation(@NotNull Context context, @NotNull View zoomView, @NotNull final Function1<? super ActivityOptions, Unit> intentFunction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(zoomView, "zoomView");
        Intrinsics.checkNotNullParameter(intentFunction, "intentFunction");
        new zr3(context, zoomView) { // from class: com.xiaomi.fitness.sport.sporttab.util.SportTabExtKt.onClickWithZoomTransformationAnimation.1
            @Override // defpackage.zr3
            public void onCardZoomTriggered(ActivityOptions activityOptions) {
                intentFunction.invoke(activityOptions);
            }
        }.setRadius((int) ExtensionsKt.getDp(16.0f)).setTransitionBgColorRes(aki.F);
    }
}
