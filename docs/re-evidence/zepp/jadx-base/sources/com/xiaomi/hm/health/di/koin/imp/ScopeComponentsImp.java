package com.xiaomi.hm.health.di.koin.imp;

import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.worldclock.bean.AppType;
import com.huami.worldclock.proxy.BLEStatueListenerAdapterSimple;
import com.huami.worldclock.proxy.ScopeComponents;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/imp/ScopeComponentsImp;", "Lcom/huami/worldclock/proxy/ScopeComponents;", "Lcom/huami/worldclock/bean/AppType;", "getAppType", "", "container", "Landroidx/fragment/app/FragmentManager;", "manager", "Lcom/huami/worldclock/proxy/BLEStatueListenerAdapterSimple;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "getBTStatusFragment", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ScopeComponentsImp implements ScopeComponents {
    @Override // com.huami.worldclock.proxy.ScopeComponents
    @NotNull
    public AppType getAppType() {
        return AppType.MIDONG;
    }

    @Override // com.huami.worldclock.proxy.ScopeComponents
    public void getBTStatusFragment(int container, @NotNull FragmentManager manager, @NotNull final BLEStatueListenerAdapterSimple listener) {
        BTStatusFragment bTStatusFragmentNewInstance = BTStatusFragment.newInstance(container, manager);
        bTStatusFragmentNewInstance.setShowBottomArea(false);
        bTStatusFragmentNewInstance.setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.di.koin.imp.ScopeComponentsImp$getBTStatusFragment$1$1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                listener.onEnableChange(enable);
            }
        });
    }
}
