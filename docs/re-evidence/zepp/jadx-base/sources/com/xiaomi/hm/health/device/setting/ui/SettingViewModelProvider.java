package com.xiaomi.hm.health.device.setting.ui;

import android.content.Context;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStoreOwner;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.setting.pattern.FeatureTreeFactory;
import com.xiaomi.hm.health.device.setting.viewmodel.FeatureTreeViewModelFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/SettingViewModelProvider;", "Landroidx/lifecycle/ViewModelProvider;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/lifecycle/ViewModelStoreOwner;", "storeOwner", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/ViewModelStoreOwner;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SettingViewModelProvider extends ViewModelProvider {
    public SettingViewModelProvider(@NotNull Context context, @NotNull ViewModelStoreOwner viewModelStoreOwner) {
        super(viewModelStoreOwner, new FeatureTreeViewModelFactory(FeatureTreeFactory.INSTANCE, context));
    }
}
