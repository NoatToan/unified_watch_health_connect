package com.huami.treadmill.ui.running;

import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.tools.log.HMLog;
import com.huami.treadmill.R;
import com.huami.treadmill.data.ConnectStatus;
import com.huami.treadmill.proxy.ProxyTreadmill;
import com.huami.treadmill.util.SportDataHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/treadmill/data/ConnectStatus;", "status", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class LineRunningActivity$registerReceiver$1 extends Lambda implements Function1<ConnectStatus, Unit> {
    public final /* synthetic */ LineRunningActivity a;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectStatus.values().length];
            iArr[ConnectStatus.CONNECTED.ordinal()] = 1;
            iArr[ConnectStatus.CONNECTING_TIMEOUT.ordinal()] = 2;
            iArr[ConnectStatus.DISCONNECTED.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineRunningActivity$registerReceiver$1(LineRunningActivity lineRunningActivity) {
        super(1);
        this.a = lineRunningActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ConnectStatus connectStatus, LineRunningActivity lineRunningActivity) {
        boolean z = false;
        HMLog.i(LineRunningActivity.J, Intrinsics.stringPlus("connect status: ", connectStatus), new Object[0]);
        int i = WhenMappings.$EnumSwitchMapping$0[connectStatus.ordinal()];
        if (i == 1) {
            LoadingDialog loadingDialog = lineRunningActivity.mLoadingDialog;
            if (loadingDialog != null && loadingDialog.isShowing()) {
                z = true;
            }
            if (z) {
                lineRunningActivity.p();
            }
            SportDataHelper.INSTANCE.getInstance().registerSportData();
            return;
        }
        if (i != 2) {
            if (i == 3 && !lineRunningActivity.t()) {
                ProxyTreadmill.INSTANCE.getInstance().connectBolt();
                lineRunningActivity.I(lineRunningActivity.getString(R.string.td_connecting));
                return;
            }
            return;
        }
        LoadingDialog loadingDialog2 = lineRunningActivity.mLoadingDialog;
        if (loadingDialog2 != null && loadingDialog2.isShowing()) {
            z = true;
        }
        if (z) {
            lineRunningActivity.p();
            lineRunningActivity.E();
        }
    }

    public final void b(@NotNull final ConnectStatus connectStatus) {
        final LineRunningActivity lineRunningActivity = this.a;
        lineRunningActivity.runOnUiThread(new Runnable() { // from class: com.huami.treadmill.ui.running.a
            @Override // java.lang.Runnable
            public final void run() {
                LineRunningActivity$registerReceiver$1.c(connectStatus, lineRunningActivity);
            }
        });
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConnectStatus connectStatus) {
        b(connectStatus);
        return Unit.INSTANCE;
    }
}
