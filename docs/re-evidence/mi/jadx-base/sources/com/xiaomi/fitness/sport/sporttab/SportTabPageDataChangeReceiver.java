package com.xiaomi.fitness.sport.sporttab;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.data.common.constant.FitnessDataConstants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.sport.sporttab.holder.PageRefreshTriggerHolder;
import com.xiaomi.fitness.sport.sporttab.holder.SportModelListHolder;
import defpackage.c1j;
import defpackage.mhs;
import defpackage.ze2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/SportTabPageDataChangeReceiver;", "Landroid/content/BroadcastReceiver;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "mViewModel", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "sportModelListHolder", "Lcom/xiaomi/fitness/sport/sporttab/holder/SportModelListHolder;", "refreshTriggerHolder", "Lcom/xiaomi/fitness/sport/sporttab/holder/PageRefreshTriggerHolder;", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;Lcom/xiaomi/fitness/sport/sporttab/holder/SportModelListHolder;Lcom/xiaomi/fitness/sport/sporttab/holder/PageRefreshTriggerHolder;)V", "getFragmentActivity", "()Landroidx/fragment/app/FragmentActivity;", "getMViewModel", "()Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportTabPageDataChangeReceiver extends BroadcastReceiver {

    @NotNull
    public static final String TAG = "SportTabPageDataChangeReceiver";

    @NotNull
    private final FragmentActivity fragmentActivity;

    @NotNull
    private final SportTabV4ViewModel mViewModel;

    @NotNull
    private final PageRefreshTriggerHolder refreshTriggerHolder;

    @NotNull
    private final SportModelListHolder sportModelListHolder;

    public SportTabPageDataChangeReceiver(@NotNull FragmentActivity fragmentActivity, @NotNull SportTabV4ViewModel mViewModel, @NotNull SportModelListHolder sportModelListHolder, @NotNull PageRefreshTriggerHolder refreshTriggerHolder) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
        Intrinsics.checkNotNullParameter(sportModelListHolder, "sportModelListHolder");
        Intrinsics.checkNotNullParameter(refreshTriggerHolder, "refreshTriggerHolder");
        this.fragmentActivity = fragmentActivity;
        this.mViewModel = mViewModel;
        this.sportModelListHolder = sportModelListHolder;
        this.refreshTriggerHolder = refreshTriggerHolder;
    }

    @NotNull
    public final FragmentActivity getFragmentActivity() {
        return this.fragmentActivity;
    }

    @NotNull
    public final SportTabV4ViewModel getMViewModel() {
        return this.mViewModel;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        ze2.b bVarF;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String action = intent.getAction();
        if (action != null && action.hashCode() == 1484986885 && action.equals("recent_data_changed_broadcast")) {
            String stringExtra = intent.getStringExtra(FitnessDataConstants.EXTRA_DATA_CHANGED_REASON);
            int intExtra = intent.getIntExtra("error_code", -1);
            if (!intent.getBooleanExtra(FitnessDataConstants.EXTRA_BOOLEAN_RESULT, true) && this.refreshTriggerHolder.getMTrigger() != null) {
                mhs mTrigger = this.refreshTriggerHolder.getMTrigger();
                Intrinsics.checkNotNull(mTrigger);
                if (mTrigger.Z()) {
                    if (intExtra == 3) {
                        HealthPageExtKt.getInstance(IHealthPage.INSTANCE).showSyncSwitchOpenDialog(this.fragmentActivity);
                    } else if (intExtra == 4) {
                        ToastExtKt.toastShort(ApplicationExtKt.getApplication(), c1j.H);
                    } else if (intExtra != 5) {
                        ToastExtKt.toastShort(ApplicationExtKt.getApplication(), c1j.common_load_fail);
                    } else {
                        HealthPageExtKt.getInstance(IHealthPage.INSTANCE).showLoginConfirmDialog(this.fragmentActivity);
                    }
                }
            }
            this.sportModelListHolder.refreshFitnessdata();
            FitnessLogUtils.i("SportTabPageDataChangeReceiver", "onReceive: data changed reason = " + stringExtra + ", code = " + intExtra);
            mhs mTrigger2 = this.refreshTriggerHolder.getMTrigger();
            if (mTrigger2 == null || (bVarF = mTrigger2.f()) == null) {
                return;
            }
            bVarF.notifyLoadComplete();
        }
    }
}
