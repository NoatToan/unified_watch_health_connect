package com.xiaomi.fitness.statistics.page;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackConstant;
import com.example.statistics.export.OneTrackExtKt;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006*\u0001\u0019\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/statistics/page/FragmentPageLifecycleCallback;", "Landroidx/fragment/app/FragmentManager$l;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "fragment", "", "visible", "", "dealFragmentVisibleChange", "(Lcom/xiaomi/fitness/baseui/view/BaseFragment;Z)V", "Landroidx/fragment/app/Fragment;", "", "getPageName", "(Landroidx/fragment/app/Fragment;)Ljava/lang/String;", "key", PluginDeviceInfo.FBLUETOOTHPAIR, "getFragmentStringValue", "(Ljava/lang/String;Landroidx/fragment/app/Fragment;)Ljava/lang/String;", "Landroidx/fragment/app/FragmentManager;", "fm", "Landroid/os/Bundle;", "savedInstanceState", "onFragmentCreated", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V", "onFragmentDestroyed", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V", "com/xiaomi/fitness/statistics/page/FragmentPageLifecycleCallback$fragmentVisibleCallback$1", "fragmentVisibleCallback", "Lcom/xiaomi/fitness/statistics/page/FragmentPageLifecycleCallback$fragmentVisibleCallback$1;", "<init>", "()V", "statistics_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FragmentPageLifecycleCallback extends FragmentManager.l {

    @NotNull
    private final FragmentPageLifecycleCallback$fragmentVisibleCallback$1 fragmentVisibleCallback = new BaseFragment.FragmentVisibleCallback() { // from class: com.xiaomi.fitness.statistics.page.FragmentPageLifecycleCallback$fragmentVisibleCallback$1
        @Override // com.xiaomi.fitness.baseui.view.BaseFragment.FragmentVisibleCallback
        public void onFragmentVisibleChanged(BaseFragment fragment, boolean visible) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.this$0.dealFragmentVisibleChange(fragment, visible);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public final void dealFragmentVisibleChange(BaseFragment fragment, boolean visible) {
        String pageName = getPageName(fragment);
        if (StringsKt__StringsKt.isBlank(pageName)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(StatConstants.KEY_FRAGMENT_NAME, pageName);
        linkedHashMap.put("tip", OneTrackConstant.VALUE_AUTO_TRACK_TIP);
        if (visible) {
            String fragmentStringValue = getFragmentStringValue("origin", fragment);
            String fragmentStringValue2 = getFragmentStringValue("type", fragment);
            linkedHashMap.put(StatConstants.KEY_PAGE_EVENT_TYPE, StatConstants.PARAM_START);
            if (fragmentStringValue != null) {
                linkedHashMap.put("origin", fragmentStringValue);
            }
            if (fragmentStringValue2 != null) {
                linkedHashMap.put(StatConstants.KEY_PAGE_CUSTOM_TYPE, fragmentStringValue2);
            }
            AutoTrackPageManager autoTrackPageManager = AutoTrackPageManager.INSTANCE;
            String currentFragmentName = autoTrackPageManager.getCurrentFragmentName();
            if (currentFragmentName != null) {
                if (Intrinsics.areEqual(currentFragmentName, pageName)) {
                    currentFragmentName = "self";
                }
                linkedHashMap.put(StatConstants.KEY_FRAGMENT_REFERRER, currentFragmentName);
            }
            autoTrackPageManager.setCurrentFragmentName(pageName);
            autoTrackPageManager.onPageVisible(pageName, System.currentTimeMillis() / ((long) 1000));
        } else {
            linkedHashMap.put(StatConstants.KEY_PAGE_EVENT_TYPE, StatConstants.PARAM_END);
            AutoTrackPageManager autoTrackPageManager2 = AutoTrackPageManager.INSTANCE;
            Long pageVisibleTimeSec = autoTrackPageManager2.getPageVisibleTimeSec(pageName);
            if (pageVisibleTimeSec != null) {
                linkedHashMap.put("duration_sec", Long.valueOf((System.currentTimeMillis() / ((long) 1000)) - pageVisibleTimeSec.longValue()));
            }
            autoTrackPageManager2.onPageInvisible(pageName);
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(OneTrackConstant.EVENT_AUTO_TRACK, linkedHashMap);
        Logger.i("AutoPageTrack-Fragment", "onFragment " + (visible ? "visible" : "invisible") + " stat " + linkedHashMap);
    }

    private final String getFragmentStringValue(String key, Fragment f) {
        Bundle arguments = f.getArguments();
        if (arguments != null) {
            return arguments.getString(key);
        }
        return null;
    }

    private final String getPageName(Fragment fragment) {
        return fragment instanceof BaseFragment ? ((BaseFragment) fragment).pageName() : "";
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public void onFragmentCreated(@NotNull FragmentManager fm, @NotNull Fragment f, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        super.onFragmentCreated(fm, f, savedInstanceState);
        if (f instanceof BaseFragment) {
            Logger.i("AutoPageTrack-Fragment", "onFragmentCreated " + getPageName(f));
            ((BaseFragment) f).addVisibleCallback(this.fragmentVisibleCallback);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public void onFragmentDestroyed(@NotNull FragmentManager fm, @NotNull Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        super.onFragmentDestroyed(fm, f);
        if (f instanceof BaseFragment) {
            Logger.i("AutoPageTrack-Fragment", "onFragmentDestroyed " + getPageName(f));
            ((BaseFragment) f).removeVisibleCallback(this.fragmentVisibleCallback);
        }
    }
}
