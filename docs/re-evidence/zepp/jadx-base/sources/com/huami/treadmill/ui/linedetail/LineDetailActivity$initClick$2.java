package com.huami.treadmill.ui.linedetail;

import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.treadmill.data.ConnectStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/treadmill/data/ConnectStatus;", "status", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class LineDetailActivity$initClick$2 extends Lambda implements Function1<ConnectStatus, Unit> {
    public final /* synthetic */ LineDetailActivity a;

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
    public LineDetailActivity$initClick$2(LineDetailActivity lineDetailActivity) {
        super(1);
        this.a = lineDetailActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ConnectStatus connectStatus, LineDetailActivity lineDetailActivity) {
        int i = WhenMappings.$EnumSwitchMapping$0[connectStatus.ordinal()];
        boolean z = false;
        if (i == 1) {
            LoadingDialog loadingDialog = lineDetailActivity.mLoadingDialog;
            if (loadingDialog != null && loadingDialog.isShowing()) {
                z = true;
            }
            if (z) {
                lineDetailActivity.t();
            }
            lineDetailActivity.J();
            return;
        }
        if (i == 2) {
            LoadingDialog loadingDialog2 = lineDetailActivity.mLoadingDialog;
            if (loadingDialog2 != null && loadingDialog2.isShowing()) {
                z = true;
            }
            if (z) {
                lineDetailActivity.t();
                lineDetailActivity.F();
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        LoadingDialog loadingDialog3 = lineDetailActivity.mLoadingDialog;
        if (loadingDialog3 != null && loadingDialog3.isShowing()) {
            z = true;
        }
        if (z) {
            lineDetailActivity.t();
            lineDetailActivity.F();
        }
    }

    public final void b(@NotNull final ConnectStatus connectStatus) {
        final LineDetailActivity lineDetailActivity = this.a;
        lineDetailActivity.runOnUiThread(new Runnable() { // from class: com.huami.treadmill.ui.linedetail.a
            @Override // java.lang.Runnable
            public final void run() {
                LineDetailActivity$initClick$2.c(connectStatus, lineDetailActivity);
            }
        });
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConnectStatus connectStatus) {
        b(connectStatus);
        return Unit.INSTANCE;
    }
}
