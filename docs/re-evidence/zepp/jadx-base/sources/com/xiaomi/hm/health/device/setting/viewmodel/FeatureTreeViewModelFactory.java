package com.xiaomi.hm.health.device.setting.viewmodel;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelProvider;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.setting.find.FindDeviceViewModel;
import com.xiaomi.hm.health.device.setting.pattern.FeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.FeatureTreeFactory;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/viewmodel/FeatureTreeViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTreeFactory;", "a", "Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTreeFactory;", "featureTree", "Landroid/content/Context;", "b", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTreeFactory;Landroid/content/Context;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FeatureTreeViewModelFactory implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FeatureTreeFactory featureTree;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    public FeatureTreeViewModelFactory(@NotNull FeatureTreeFactory featureTreeFactory, @NotNull Context context) {
        this.featureTree = featureTreeFactory;
        this.context = context;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) throws IllegalAccessException, NoSuchMethodException {
        if (Intrinsics.areEqual(modelClass.getSimpleName(), FeatureViewModel.class.getSimpleName())) {
            return modelClass.getConstructor(FeatureTree.class, Context.class).newInstance(this.featureTree.realCreate(), this.context);
        }
        if (Intrinsics.areEqual(modelClass.getSimpleName(), UserInfoViewModel.class.getSimpleName())) {
            return modelClass.getConstructor(Context.class).newInstance(this.context);
        }
        if (!Intrinsics.areEqual(modelClass.getSimpleName(), DeviceFeatureViewModel.class.getSimpleName()) && !Intrinsics.areEqual(modelClass.getSimpleName(), FindDeviceViewModel.class.getSimpleName())) {
            Constructor<T> constructor = modelClass.getConstructor(new Class[0]);
            if (constructor.getParameterTypes().length == 0) {
                return constructor.newInstance(new Object[0]);
            }
            throw new IllegalAccessException("没有对应的ViewModel");
        }
        return modelClass.getConstructor(FeatureTree.class, Context.class).newInstance(this.featureTree.realCreate(), this.context);
    }
}
