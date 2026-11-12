package com.huami.worldclock.proxy;

import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.worldclock.bean.AppType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/huami/worldclock/proxy/ScopeComponents;", "", "", "container", "Landroidx/fragment/app/FragmentManager;", "manager", "Lcom/huami/worldclock/proxy/BLEStatueListenerAdapterSimple;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "getBTStatusFragment", "Lcom/huami/worldclock/bean/AppType;", "getAppType", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public interface ScopeComponents {
    @NotNull
    AppType getAppType();

    void getBTStatusFragment(int container, @NotNull FragmentManager manager, @NotNull BLEStatueListenerAdapterSimple listener);
}
