package com.huami.wallet.accessdoor.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.activity.SimulationFailureActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/wallet/accessdoor/activity/SimulationFailureActivity;", "Lcom/huami/wallet/accessdoor/activity/BaseAccessDoorActivity;", "", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "<init>", "()V", "Companion", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class SimulationFailureActivity extends BaseAccessDoorActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/wallet/accessdoor/activity/SimulationFailureActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "code", "message", "", "open", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void open(@NotNull Context context, @NotNull String code, @NotNull String message) {
            Intent intent = new Intent(context, (Class<?>) SimulationFailureActivity.class);
            intent.putExtra("code", code);
            intent.putExtra("message", message);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SimulationFailureActivity simulationFailureActivity, View view) {
        simulationFailureActivity.finish();
    }

    private final void initView() {
        RainbowTitleBar tvTitleBar = getTvTitleBar();
        if (tvTitleBar == null) {
            return;
        }
        tvTitleBar.setTitle(R.string.access_door_simulation);
        tvTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: nu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimulationFailureActivity.h(this.a, view);
            }
        });
    }

    @JvmStatic
    public static final void open(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        INSTANCE.open(context, str, str2);
    }

    @Override // com.huami.wallet.accessdoor.activity.BaseAccessDoorActivity, com.huami.wallet.accessdoor.activity.BaseDeviceStatusActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.huami.wallet.accessdoor.activity.BaseAccessDoorActivity, com.huami.wallet.accessdoor.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulation_failure);
        initView();
    }
}
