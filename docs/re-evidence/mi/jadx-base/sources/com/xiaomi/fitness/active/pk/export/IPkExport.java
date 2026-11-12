package com.xiaomi.fitness.active.pk.export;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.active.pk.export.entity.EntranceModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H&¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/active/pk/export/IPkExport;", "", "goToPKActivity", "", "pkCount", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/content/Context;", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "goToSendInvitationActivity", "goToPkListActivity", "getInviteReceiveIntent", "Landroid/content/Intent;", "srcIntent", "queryPkEntranceModel", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fitness/active/pk/export/entity/EntranceModel;", "getPkCountInProgress", "Companion", "active-pk-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IPkExport {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/active/pk/export/IPkExport$Companion;", "", "<init>", "()V", "active-pk-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @NotNull
    Intent getInviteReceiveIntent(@Nullable Intent srcIntent);

    @NotNull
    LiveData<Integer> getPkCountInProgress();

    void goToPKActivity(int pkCount, @NotNull Context activity, @Nullable Bundle bundle);

    void goToPkListActivity(@NotNull Context activity, @Nullable Bundle bundle);

    void goToSendInvitationActivity(@NotNull Context activity, @Nullable Bundle bundle);

    @NotNull
    LiveData<EntranceModel> queryPkEntranceModel();
}
