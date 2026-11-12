package com.xiaomi.fitness.relative.ui.util;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.target.Target;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainHelper;
import com.xiaomi.fitness.main.export.MainTab;
import defpackage.aoi;
import defpackage.av6;
import defpackage.t0j;
import defpackage.zr3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J;\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00070\rJ\"\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018J*\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u0018J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ&\u0010 \u001a\u00020\u00052\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eJ\u001c\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070'J\b\u0010(\u001a\u00020\u0007H\u0002J\u0014\u0010)\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070'J$\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070'J\u000e\u0010/\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/util/RelativeCareUtil;", "", "<init>", "()V", "isFoldableDeviceAndExpandedState", "", "cardZoom", "", "context", "Landroid/content/Context;", "zoomView", "Landroid/view/View;", "intentFunction", "Lkotlin/Function1;", "Landroid/app/ActivityOptions;", "Lkotlin/ParameterName;", "name", "activityOptions", "loadImageWithUrl", "imageView", "Landroid/widget/ImageView;", "url", "", "iconWidth", "", "loadDrawableWithResId", "resId", "width", "height", "constructRelativeCareShareableDataTypeList", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "hasSameAuthData", "oldList", "newList", "checkHealthCloudSynchronizationAndProceedIfNeed", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "function", "Lkotlin/Function0;", "turnOnCloudSynchronization", "checkNetworkAndProcessIfAvailable", "availableCallback", "handleUnavailableNetworkAndShowFallbackPageIfNeed", "noNetwork", "contentView", "loadData", "jumpToMineTabPage", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRelativeCareUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelativeCareUtil.kt\ncom/xiaomi/fitness/relative/ui/util/RelativeCareUtil\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,186:1\n54#2,3:187\n24#2:190\n59#2,4:191\n63#2,2:204\n54#2,3:206\n24#2:209\n59#2,4:210\n63#2,2:223\n844#3,9:195\n844#3,9:214\n1863#4,2:225\n*S KotlinDebug\n*F\n+ 1 RelativeCareUtil.kt\ncom/xiaomi/fitness/relative/ui/util/RelativeCareUtil\n*L\n58#1:187,3\n58#1:190\n58#1:191,4\n58#1:204,2\n78#1:206,3\n78#1:209\n78#1:210,4\n78#1:223,2\n61#1:195,9\n81#1:214,9\n111#1:225,2\n*E\n"})
public final class RelativeCareUtil {

    @NotNull
    public static final RelativeCareUtil INSTANCE = new RelativeCareUtil();

    private RelativeCareUtil() {
    }

    public static /* synthetic */ void loadDrawableWithResId$default(RelativeCareUtil relativeCareUtil, ImageView imageView, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = ExtUtilsKt.getDp(44);
        }
        if ((i4 & 8) != 0) {
            i3 = ExtUtilsKt.getDp(44);
        }
        relativeCareUtil.loadDrawableWithResId(imageView, i, i2, i3);
    }

    public static /* synthetic */ void loadImageWithUrl$default(RelativeCareUtil relativeCareUtil, ImageView imageView, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = ExtUtilsKt.getDp(46);
        }
        relativeCareUtil.loadImageWithUrl(imageView, str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void turnOnCloudSynchronization() {
        RegionPreference regionPreference = RegionPreference.INSTANCE;
        regionPreference.setSyncWeb(true);
        regionPreference.setSettingSyncWeb(true);
        FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), true, "cloud_sync_switch", null, 4, null);
    }

    public final void cardZoom(@NotNull Context context, @NotNull View zoomView, @NotNull final Function1<? super ActivityOptions, Unit> intentFunction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(zoomView, "zoomView");
        Intrinsics.checkNotNullParameter(intentFunction, "intentFunction");
        new zr3(context, zoomView) { // from class: com.xiaomi.fitness.relative.ui.util.RelativeCareUtil.cardZoom.1
            @Override // defpackage.zr3
            public void onCardZoomTriggered(ActivityOptions activityOptions) {
                intentFunction.invoke2(activityOptions);
            }
        }.setRadius(ExtUtilsKt.getDp(Float.valueOf(16.0f)));
    }

    public final void checkHealthCloudSynchronizationAndProceedIfNeed(@NotNull FragmentActivity activity, @NotNull final Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(function, "function");
        if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            ToastExtKt.toastShort(activity, t0j.d0);
        } else if (RegionPreference.INSTANCE.getSyncWeb()) {
            function.invoke();
        } else {
            MainExtKt.getInstance(MainHelper.INSTANCE).showSyncWebDialog(activity, new av6() { // from class: com.xiaomi.fitness.relative.ui.util.RelativeCareUtil.checkHealthCloudSynchronizationAndProceedIfNeed.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -1) {
                        RelativeCareUtil.INSTANCE.turnOnCloudSynchronization();
                        function.invoke();
                    }
                }
            });
        }
    }

    public final void checkNetworkAndProcessIfAvailable(@NotNull Function0<Unit> availableCallback) {
        Intrinsics.checkNotNullParameter(availableCallback, "availableCallback");
        if (NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            availableCallback.invoke();
        } else {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), t0j.f);
        }
    }

    @NotNull
    public final List<HomeDataType> constructRelativeCareShareableDataTypeList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(HomeDataType.RAINBOW);
        arrayList.add(HomeDataType.HR);
        arrayList.add(HomeDataType.SLEEP);
        arrayList.add(HomeDataType.BLOOD_PRESSURE);
        arrayList.add(HomeDataType.STEP);
        arrayList.add(HomeDataType.CALORIE);
        arrayList.add(HomeDataType.VALID_STAND);
        arrayList.add(HomeDataType.MH_STRENGTH);
        arrayList.add(HomeDataType.WEIGHT);
        arrayList.add(HomeDataType.SPO2);
        return arrayList;
    }

    public final void handleUnavailableNetworkAndShowFallbackPageIfNeed(@NotNull View noNetwork, @NotNull View contentView, @NotNull Function0<Unit> loadData) {
        Intrinsics.checkNotNullParameter(noNetwork, "noNetwork");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(loadData, "loadData");
        if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            ViewExtKt.visible(noNetwork);
            ViewExtKt.gone(contentView);
        } else {
            ViewExtKt.gone(noNetwork);
            ViewExtKt.visible(contentView);
            loadData.invoke();
        }
    }

    public final boolean hasSameAuthData(@Nullable List<? extends HomeDataType> oldList, @Nullable List<? extends HomeDataType> newList) {
        if (oldList == null && newList == null) {
            return true;
        }
        if (oldList == null || newList == null || oldList.size() != newList.size()) {
            return false;
        }
        Iterator<T> it = oldList.iterator();
        while (it.hasNext()) {
            if (!newList.contains((HomeDataType) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isFoldableDeviceAndExpandedState() {
        return SystemProperties.INSTANCE.isFoldDisplay() && !SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndFolded();
    }

    public final void jumpToMineTabPage(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Bundle bundle = new Bundle();
        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_ME());
        MainExtKt.showMainActivity(activity, null, bundle);
    }

    public final void loadDrawableWithResId(@NotNull final ImageView imageView, int resId, int width, int height) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Integer numValueOf = Integer.valueOf(resId);
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(numValueOf).target(imageView);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        builderTarget.size(width, height);
        builderTarget.target(new Target() { // from class: com.xiaomi.fitness.relative.ui.util.RelativeCareUtil$loadDrawableWithResId$lambda$5$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
                imageView.setImageResource(aoi.e);
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
        builderTarget.placeholder(aoi.e);
        imageLoader.enqueue(builderTarget.build());
    }

    public final void loadImageWithUrl(@NotNull final ImageView imageView, @Nullable String url, int iconWidth) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        if (url == null || TextUtils.isEmpty(url)) {
            imageView.setImageResource(aoi.e);
            return;
        }
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(url).target(imageView);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        builderTarget.size(iconWidth, iconWidth);
        builderTarget.target(new Target() { // from class: com.xiaomi.fitness.relative.ui.util.RelativeCareUtil$loadImageWithUrl$lambda$2$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
                imageView.setImageResource(aoi.e);
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
        builderTarget.placeholder(aoi.e);
        imageLoader.enqueue(builderTarget.build());
    }
}
