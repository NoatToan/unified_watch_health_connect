package com.xiaomi.hm.health.running;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.core.GPSDataRecover;
import com.huami.mifit.sportlib.services.util.SportNotification;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.ui.event.EventCurrSportFinished;
import com.huami.moving.ui.sport.in.NotificationForSporting;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.running.SportRestoreUtils;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import com.xiaomi.hm.health.ui.sportfitness.manager.SportDeviceManager;
import com.xiaomi.hm.health.ui.sportfitness.utils.SportStartDelegate;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J \u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0007R\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/running/SportRestoreUtils;", "", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "getRestoreRecord", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "record", "", "showRestoreDialog", "", "RESTORE_DIALOG_TAG", "Ljava/lang/String;", "", "a", LogUtil.I, "RESTORE", "b", "END_AND_SAVE", "c", "CANCEL", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SportRestoreUtils {

    @NotNull
    public static final SportRestoreUtils INSTANCE = new SportRestoreUtils();

    @NotNull
    public static final String RESTORE_DIALOG_TAG = "SportRestoreDialogFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int RESTORE = 0;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int END_AND_SAVE = 1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int CANCEL = 2;

    private SportRestoreUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Trackrecord trackrecord, Context context, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Long trackid = trackrecord.getTrackid();
        if (i == 0) {
            Analytics.recordEvent(new CountEventBuilder(SportAnalytics.EVENT_RUNNING_RECOVER));
            SportNotification.getInstance().setNotificationInitializer(NotificationForSporting.getInstance());
            SportDeviceManager.getInstance(context).registerSportUsingDevice(trackrecord.getType().intValue());
            SportStartDelegate.INSTANCE.startSport(context, trackrecord);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                return;
            }
            GPSDataRecover.cancelRun(trackid.longValue());
        } else {
            GPSDataRecover.saveRun(trackid.longValue());
            HistoryRecordManager.getInstance().updateTrackRecordToStatData(trackid.longValue(), 0);
            EventBus.getDefault().post(new EventCurrSportFinished(trackid.longValue(), 0));
        }
    }

    @JvmStatic
    @Nullable
    public static final Trackrecord getRestoreRecord() {
        Trackrecord needRecoverTrackRecord = TrackRecordManager.getInstance().getNeedRecoverTrackRecord(null);
        if (needRecoverTrackRecord != null && needRecoverTrackRecord.getTrackid().longValue() > 0) {
            return needRecoverTrackRecord;
        }
        return null;
    }

    @JvmStatic
    public static final void showRestoreDialog(@NotNull final Context context, @NotNull FragmentManager fragmentManager, @NotNull final Trackrecord record) {
        if (fragmentManager.findFragmentByTag(RESTORE_DIALOG_TAG) != null) {
            return;
        }
        new AlertDialogFragment.Builder(context).setTitle(R.string.running_recover_title).setCancelable(false).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItemChoice(0).setItems(R.array.recover_choose_items), new DialogInterface.OnClickListener() { // from class: tb7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SportRestoreUtils.b(record, context, dialogInterface, i);
            }
        }).show(fragmentManager, RESTORE_DIALOG_TAG);
    }
}
