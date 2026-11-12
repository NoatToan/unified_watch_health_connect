package com.xiaomi.fitness.sport.sporttab;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.data.common.constant.FitnessDataConstants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/SportTabRNPageDataChangeReceiver;", "Landroid/content/BroadcastReceiver;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "getFragmentActivity", "()Landroidx/fragment/app/FragmentActivity;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportTabRNPageDataChangeReceiver extends BroadcastReceiver {

    @NotNull
    public static final String TAG = "SportTabPageDataChangeReceiver";

    @NotNull
    private final FragmentActivity fragmentActivity;

    public SportTabRNPageDataChangeReceiver(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.fragmentActivity = fragmentActivity;
    }

    @NotNull
    public final FragmentActivity getFragmentActivity() {
        return this.fragmentActivity;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String action = intent.getAction();
        if (action != null && action.hashCode() == 1484986885 && action.equals("recent_data_changed_broadcast")) {
            String stringExtra = intent.getStringExtra(FitnessDataConstants.EXTRA_DATA_CHANGED_REASON);
            int intExtra = intent.getIntExtra("error_code", -1);
            boolean booleanExtra = intent.getBooleanExtra(FitnessDataConstants.EXTRA_BOOLEAN_RESULT, true);
            SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).notifySportDataChanged();
            FitnessLogUtils.i("SportTabPageDataChangeReceiver", "onReceive: data changed reason = " + stringExtra + ", code = " + intExtra + " result:" + booleanExtra);
        }
    }
}
