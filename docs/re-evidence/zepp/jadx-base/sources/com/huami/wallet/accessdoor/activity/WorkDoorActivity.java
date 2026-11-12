package com.huami.wallet.accessdoor.activity;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.nfc.door.WorkerInfo;
import com.huami.tools.analytics.DbUtils;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.activity.WorkDoorActivity;
import com.huami.wallet.accessdoor.viewmodel.DoorEntranceViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/huami/wallet/accessdoor/activity/WorkDoorActivity;", "Lcom/huami/wallet/accessdoor/activity/BaseAccessDoorActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class WorkDoorActivity extends BaseAccessDoorActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String e = "WORK_FLAG";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/wallet/accessdoor/activity/WorkDoorActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/nfc/door/WorkerInfo;", "workerInfo", "", "toWorkDoorActivity", "", WorkDoorActivity.e, "Ljava/lang/String;", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void toWorkDoorActivity(@NotNull Context context, @NotNull WorkerInfo workerInfo) {
            Intent intent = new Intent(context, (Class<?>) WorkDoorActivity.class);
            intent.putExtra(WorkDoorActivity.e, workerInfo);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(WorkDoorActivity workDoorActivity, View view) {
        workDoorActivity.finish();
    }

    @Override // com.huami.wallet.accessdoor.activity.BaseAccessDoorActivity, com.huami.wallet.accessdoor.activity.BaseDeviceStatusActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.wallet.accessdoor.activity.BaseAccessDoorActivity, com.huami.wallet.accessdoor.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_door);
        RainbowTitleBar tvTitleBar = getTvTitleBar();
        if (tvTitleBar != null) {
            tvTitleBar.setTitle(R.string.access_door_work_card);
            tvTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: fw8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WorkDoorActivity.h(this.a, view);
                }
            });
        }
        WorkerInfo workerInfo = (WorkerInfo) getIntent().getParcelableExtra(e);
        if (workerInfo == null) {
            finish();
            return;
        }
        final Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.fragment_access_work_card);
        DoorEntranceViewModel doorEntranceViewModel = null;
        if (fragmentFindFragmentById != null) {
            doorEntranceViewModel = (DoorEntranceViewModel) ComponentCallbackExtKt.getViewModel(fragmentFindFragmentById, null, Reflection.getOrCreateKotlinClass(DoorEntranceViewModel.class), new Function0<ViewModelOwner>() { // from class: com.huami.wallet.accessdoor.activity.WorkDoorActivity$onCreate$$inlined$getViewModel$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final ViewModelOwner invoke() {
                    ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                    ComponentCallbacks componentCallbacks = fragmentFindFragmentById;
                    return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
                }
            }, null);
        }
        if (doorEntranceViewModel == null) {
            return;
        }
        doorEntranceViewModel.setWorkInfo(workerInfo);
    }
}
