package com.xiaomi.fitness.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.target.Target;
import coil.transform.RoundedCornersTransformation;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.SportReportKey;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport_export.IRunningRouteApi;
import com.xiaomi.fitness.sport_export.RunningRouteAccessExportExtKt;
import com.xiaomi.fitness.sport_export.bean.RunningRecordBindStatus;
import com.xiaomi.fitness.util.RunningRouteCardExtKt;
import defpackage.bsi;
import defpackage.byi;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.nuf;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000b\u001a(\u0010\f\u001a\u00020\u0001*\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u001a0\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b\u001a \u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007¨\u0006\u001f"}, d2 = {"bindRunningRouteCardData", "", "group", "Landroid/view/View;", "status", "", "routeName", "", "length", "", "routeIcon", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)V", "loadImageWithUrl", "Landroid/widget/ImageView;", "url", "iconWidth", "roundedCorner", "", "showRunningRouteCardAndSetCallback", "context", "Landroid/content/Context;", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "mBasicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportRouteEntranceView", "runningRecordBindStatus", "Lcom/xiaomi/fitness/sport_export/bean/RunningRecordBindStatus;", "navigateToRouteDetailActivity", "routeId", "routeUrl", "sport-record_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRunningRouteCardExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningRouteCardExt.kt\ncom/xiaomi/fitness/util/RunningRouteCardExtKt\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,176:1\n54#2,3:177\n24#2:180\n59#2,4:181\n63#2,2:194\n844#3,9:185\n*S KotlinDebug\n*F\n+ 1 RunningRouteCardExt.kt\ncom/xiaomi/fitness/util/RunningRouteCardExtKt\n*L\n102#1:177,3\n102#1:180\n102#1:181,4\n102#1:194,2\n108#1:185,9\n*E\n"})
public final class RunningRouteCardExtKt {
    public static final void bindRunningRouteCardData(@NotNull View group, @Nullable Integer num, @Nullable String str, @Nullable Float f, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(group, "group");
        View viewFindViewById = group.findViewById(bsi.i3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = group.findViewById(bsi.B5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById2;
        View viewFindViewById3 = group.findViewById(bsi.W5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = group.findViewById(bsi.Y5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView3 = (TextView) viewFindViewById4;
        View viewFindViewById5 = group.findViewById(bsi.U5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById5;
        View viewFindViewById6 = group.findViewById(bsi.V5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        TextView textView4 = (TextView) viewFindViewById6;
        View viewFindViewById7 = group.findViewById(bsi.T5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        TextView textView5 = (TextView) viewFindViewById7;
        if (str2 != null) {
            loadImageWithUrl(imageView2, str2, ExtUtilsKt.getDp(72), true);
        }
        if (str != null) {
            textView4.setText(str);
        }
        if (f != null) {
            textView5.setText(ApplicationExtKt.getApplication().getResources().getQuantityString(byi.o, (int) f.floatValue(), f));
        }
        Logger.d("bindRunningRouteCardData status=" + num, new Object[0]);
        if (num != null && num.intValue() == 2) {
            ViewExtKt.visible(group);
            ViewExtKt.gone(textView);
            ViewExtKt.visible(imageView);
            ViewExtKt.gone(textView3);
            ViewExtKt.visible(textView2);
            return;
        }
        if (num != null && num.intValue() == 1) {
            ViewExtKt.visible(group);
            ViewExtKt.gone(textView);
            ViewExtKt.visible(imageView);
            ViewExtKt.visible(textView3);
            ViewExtKt.gone(textView2);
            return;
        }
        if (num == null || num.intValue() != 3) {
            ViewExtKt.gone(group);
            return;
        }
        ViewExtKt.visible(group);
        ViewExtKt.visible(textView);
        ViewExtKt.gone(imageView);
        ViewExtKt.gone(textView3);
        ViewExtKt.visible(textView2);
    }

    public static /* synthetic */ void bindRunningRouteCardData$default(View view, Integer num, String str, Float f, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            f = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        bindRunningRouteCardData(view, num, str, f, str2);
    }

    public static final void loadImageWithUrl(@NotNull final ImageView imageView, @Nullable String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (str == null || TextUtils.isEmpty(str)) {
            imageView.setImageResource(hoi.p);
            return;
        }
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(str).target(imageView);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        builderTarget.size(i, i);
        if (z) {
            builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(Float.valueOf(16.0f))));
        }
        builderTarget.target(new Target() { // from class: com.xiaomi.fitness.util.RunningRouteCardExtKt$loadImageWithUrl$lambda$2$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
                imageView.setImageResource(hoi.p);
            }

            @Override // coil.target.Target
            public void onStart(@Nullable Drawable placeholder) {
            }

            @Override // coil.target.Target
            public void onSuccess(@NotNull Drawable result) {
                Intrinsics.checkNotNull(result, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                imageView.setImageBitmap(((BitmapDrawable) result).getBitmap());
            }
        });
        builderTarget.placeholder(hoi.p);
        imageLoader.enqueue(builderTarget.build());
    }

    public static /* synthetic */ void loadImageWithUrl$default(ImageView imageView, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = ExtUtilsKt.getDp(46);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        loadImageWithUrl(imageView, str, i, z);
    }

    public static final void navigateToRouteDetailActivity(@NotNull Context context, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        RunningRouteAccessExportExtKt.getINSTANCE(IRunningRouteApi.INSTANCE).goToRouteDetailActivity(context, i, str);
    }

    public static final void showRunningRouteCardAndSetCallback(@NotNull final Context context, @NotNull final LifecycleOwner viewLifecycleOwner, @Nullable final SportBasicReport sportBasicReport, @NotNull View sportRouteEntranceView, @NotNull final RunningRecordBindStatus runningRecordBindStatus) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(sportRouteEntranceView, "sportRouteEntranceView");
        Intrinsics.checkNotNullParameter(runningRecordBindStatus, "runningRecordBindStatus");
        SportReportKey sportReportKey = FitnessPersistKey.INSTANCE.getSportReportKey(1);
        final String key = sportReportKey != null ? sportReportKey.getKey() : null;
        Intrinsics.checkNotNull(key);
        Logger.d("SportDetailFragment", "showRunningRouteCardAndSetCallback runningRecordBindStatus=" + runningRecordBindStatus + " mBasicReport=" + sportBasicReport);
        if (sportBasicReport == null) {
            return;
        }
        TextView textView = (TextView) sportRouteEntranceView.findViewById(bsi.i3);
        bindRunningRouteCardData(sportRouteEntranceView, Integer.valueOf(runningRecordBindStatus.getBindStatus()), runningRecordBindStatus.getRouteName(), Float.valueOf(runningRecordBindStatus.getLength()), runningRecordBindStatus.getRouteIcon());
        ViewExtKt.clickWithTrigger$default(sportRouteEntranceView, 0L, new Function1() { // from class: r2l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RunningRouteCardExtKt.showRunningRouteCardAndSetCallback$lambda$3(context, runningRecordBindStatus, (View) obj);
            }
        }, 1, null);
        boolean z = runningRecordBindStatus.getBindStatus() == 3;
        nuf.f(textView);
        if (z) {
            nuf.f(sportRouteEntranceView);
            ViewExtKt.clickWithTrigger$default(textView, 0L, new Function1() { // from class: s2l
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RunningRouteCardExtKt.showRunningRouteCardAndSetCallback$lambda$5(sportBasicReport, key, runningRecordBindStatus, viewLifecycleOwner, context, (TextView) obj);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRunningRouteCardAndSetCallback$lambda$3(Context context, RunningRecordBindStatus runningRecordBindStatus, View it) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(runningRecordBindStatus, "$runningRecordBindStatus");
        Intrinsics.checkNotNullParameter(it, "it");
        navigateToRouteDetailActivity(context, runningRecordBindStatus.getRouteId(), runningRecordBindStatus.getTraceFileUrl());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRunningRouteCardAndSetCallback$lambda$5(SportBasicReport sportBasicReport, String sportRecordKey, final RunningRecordBindStatus runningRecordBindStatus, LifecycleOwner viewLifecycleOwner, final Context context, TextView textView) {
        Intrinsics.checkNotNullParameter(sportRecordKey, "$sportRecordKey");
        Intrinsics.checkNotNullParameter(runningRecordBindStatus, "$runningRecordBindStatus");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "$viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(context, "$context");
        RunningRouteAccessExportExtKt.getINSTANCE(IRunningRouteApi.INSTANCE).getRouteClockInSuccessLiveData(sportBasicReport.getSid(), sportRecordKey, sportBasicReport.getTimeStamp(), runningRecordBindStatus.getRouteId(), runningRecordBindStatus.getScore()).observe(viewLifecycleOwner, new RunningRouteCardExtKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: q2l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RunningRouteCardExtKt.showRunningRouteCardAndSetCallback$lambda$5$lambda$4(context, runningRecordBindStatus, (Boolean) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRunningRouteCardAndSetCallback$lambda$5$lambda$4(Context context, RunningRecordBindStatus runningRecordBindStatus, Boolean bool) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(runningRecordBindStatus, "$runningRecordBindStatus");
        if (bool.booleanValue()) {
            ToastExtKt.toast$default(ApplicationExtKt.getApplication(), j1j.v0, 0, 0, 0L, 14, null);
            navigateToRouteDetailActivity(context, runningRecordBindStatus.getRouteId(), runningRecordBindStatus.getTraceFileUrl());
        } else {
            ToastExtKt.toast$default(ApplicationExtKt.getApplication(), j1j.H, 0, 0, 0L, 14, null);
        }
        return Unit.INSTANCE;
    }
}
