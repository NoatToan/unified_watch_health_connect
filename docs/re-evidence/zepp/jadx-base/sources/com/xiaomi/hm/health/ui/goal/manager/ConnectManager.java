package com.xiaomi.hm.health.ui.goal.manager;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.goal.manager.ConnectManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/ui/goal/manager/ConnectManager;", "", "", "enable", "", "b", "", "containerId", "setupBtStatusFragment", "Landroidx/fragment/app/FragmentActivity;", "a", "Landroidx/fragment/app/FragmentActivity;", "host", "Landroid/view/View;", "Landroid/view/View;", "tipLayout", "c", "maskView", "<init>", "(Landroidx/fragment/app/FragmentActivity;Landroid/view/View;Landroid/view/View;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ConnectManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FragmentActivity host;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final View tipLayout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final View maskView;

    public ConnectManager(@NotNull FragmentActivity fragmentActivity, @NotNull View view, @NotNull View view2) {
        this.host = fragmentActivity;
        this.tipLayout = view;
        this.maskView = view2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(boolean enable) {
        if (!enable) {
            this.tipLayout.setVisibility(8);
            this.maskView.setVisibility(8);
        } else {
            this.tipLayout.setVisibility(0);
            this.maskView.setVisibility(0);
            this.maskView.setOnClickListener(new View.OnClickListener() { // from class: cz0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConnectManager.c(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(View view) {
    }

    public final void setupBtStatusFragment(int containerId) {
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        boolean zHasBound = hMDeviceManager.hasBound(HMDeviceType.MILI);
        boolean zHasBound2 = hMDeviceManager.hasBound(HMDeviceType.WATCH);
        HMDeviceType hMDeviceType = HMDeviceType.SENSORHUB;
        boolean zHasBound3 = hMDeviceManager.hasBound(hMDeviceType);
        boolean zHasBound4 = hMDeviceManager.hasBound(HMDeviceType.SHOES);
        if (!zHasBound && !zHasBound2 && !zHasBound3 && !zHasBound4) {
            b(false);
        } else if (HMDeviceManager.getInstance().hasBound(hMDeviceType)) {
            b(false);
        } else {
            final BTStatusFragment bTStatusFragmentNewInstance = BTStatusFragment.newInstance(containerId, this.host.getSupportFragmentManager());
            bTStatusFragmentNewInstance.setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.ui.goal.manager.ConnectManager.setupBtStatusFragment.2
                @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
                @Nullable
                public HMDeviceType getHMDeviceType() {
                    HMDeviceManager hMDeviceManager2 = HMDeviceManager.getInstance();
                    HMDeviceType hMDeviceType2 = HMDeviceType.MILI;
                    if (hMDeviceManager2.hasBound(hMDeviceType2)) {
                        return hMDeviceType2;
                    }
                    HMDeviceType hMDeviceType3 = HMDeviceType.WATCH;
                    if (hMDeviceManager2.hasBound(hMDeviceType3)) {
                        return hMDeviceType3;
                    }
                    HMDeviceType hMDeviceType4 = HMDeviceType.SENSORHUB;
                    if (hMDeviceManager2.hasBound(hMDeviceType4)) {
                        return hMDeviceType4;
                    }
                    HMDeviceType hMDeviceType5 = HMDeviceType.SHOES;
                    if (hMDeviceManager2.hasBound(hMDeviceType5)) {
                        return hMDeviceType5;
                    }
                    return null;
                }

                @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
                @NotNull
                public CharSequence getUnbindStr() {
                    return this.host.getString(R.string.change_sport_goal_tip_not_bound);
                }

                @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
                public void onEnableChange(boolean enable) {
                    bTStatusFragmentNewInstance.setBottomAreaVisible(false);
                    this.b(!enable);
                }
            });
        }
    }
}
