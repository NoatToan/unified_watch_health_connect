package com.xiaomi.fitness.mine.widget;

import android.app.ActivityOptions;
import android.app.Application;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.medal.export.data.MedalEntrance;
import com.xiaomi.fitness.medal.export.data.MineMedalItem;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.util.OnPageCallback;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.m0j;
import defpackage.vni;
import defpackage.zr3;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"com/xiaomi/fitness/mine/widget/MedalEntranceView$pageCallback$1", "Lcom/xiaomi/fitness/util/OnPageCallback;", "Lcom/xiaomi/fitness/medal/export/data/MedalEntrance;", "showSuccess", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "showLoading", "showLoadError", "apiException", "Lcom/xiaomi/fitness/net/response/ApiException;", "showNotLoggedIn", "showNetworkNotConnected", "showPlayChannel", "showWebSyncServiceDisabled", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MedalEntranceView$pageCallback$1 implements OnPageCallback<MedalEntrance> {
    final /* synthetic */ MedalEntranceView this$0;

    public MedalEntranceView$pageCallback$1(MedalEntranceView medalEntranceView) {
        this.this$0 = medalEntranceView;
    }

    @Override // com.xiaomi.fitness.util.OnPageCallback
    public void showLoadError(ApiException apiException) {
        Intrinsics.checkNotNullParameter(apiException, "apiException");
        int errorCode = apiException.getErrorCode();
        Float fValueOf = Float.valueOf(15.0f);
        if (606 == errorCode) {
            this.this$0.showDefaultMedalList();
            final Application application = ApplicationExtKt.getApplication();
            final MedalEntranceView medalEntranceView = this.this$0;
            new zr3(application) { // from class: com.xiaomi.fitness.mine.widget.MedalEntranceView$pageCallback$1$showLoadError$1
                {
                    super(application, this.this$0, null);
                }

                @Override // defpackage.zr3
                public void onCardZoomTriggered(ActivityOptions activityOptions) {
                    this.this$0.jumpToMedalList();
                }
            }.setRadius(ExtUtilsKt.getDp(fValueOf));
            return;
        }
        ConstraintLayout mineMainMedalErrorView = this.this$0.mRootView.I;
        Intrinsics.checkNotNullExpressionValue(mineMainMedalErrorView, "mineMainMedalErrorView");
        ViewExtKt.visible(mineMainMedalErrorView);
        RecyclerView medalEntranceRecyclerView = this.this$0.mRootView.F;
        Intrinsics.checkNotNullExpressionValue(medalEntranceRecyclerView, "medalEntranceRecyclerView");
        ViewExtKt.gone(medalEntranceRecyclerView);
        this.this$0.mRootView.B.setText("");
        final Application application2 = ApplicationExtKt.getApplication();
        final MedalEntranceView medalEntranceView2 = this.this$0;
        new zr3(application2) { // from class: com.xiaomi.fitness.mine.widget.MedalEntranceView$pageCallback$1$showLoadError$2
            {
                super(application2, this.this$0, null);
            }

            @Override // defpackage.zr3
            public void onCardZoomTriggered(ActivityOptions activityOptions) {
                if (NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
                    this.this$0.bindData();
                } else {
                    ToastExtKt.toastShort(ApplicationExtKt.getApplication(), ResourceExtKt.getString(m0j.common_hint_network_unavailable));
                }
            }
        }.setRadius(ExtUtilsKt.getDp(fValueOf));
    }

    @Override // com.xiaomi.fitness.util.OnPageCallback
    public void showLoading() {
    }

    @Override // com.xiaomi.fitness.util.OnPageCallback
    public void showNetworkNotConnected() {
        this.this$0.showDefaultMedalList();
        final Application application = ApplicationExtKt.getApplication();
        final MedalEntranceView medalEntranceView = this.this$0;
        new zr3(application) { // from class: com.xiaomi.fitness.mine.widget.MedalEntranceView$pageCallback$1$showNetworkNotConnected$1
            {
                super(application, this.this$0, null);
            }

            @Override // defpackage.zr3
            public void onCardZoomTriggered(ActivityOptions activityOptions) {
                if (NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
                    this.this$0.bindData();
                } else {
                    ToastExtKt.toastShort(ApplicationExtKt.getApplication(), ResourceExtKt.getString(m0j.common_hint_network_unavailable));
                }
            }
        }.setRadius(ExtUtilsKt.getDp(Float.valueOf(15.0f)));
    }

    @Override // com.xiaomi.fitness.util.OnPageCallback
    public void showNotLoggedIn() {
        this.this$0.showDefaultMedalList();
        final Application application = ApplicationExtKt.getApplication();
        final MedalEntranceView medalEntranceView = this.this$0;
        new zr3(application) { // from class: com.xiaomi.fitness.mine.widget.MedalEntranceView$pageCallback$1$showNotLoggedIn$1
            {
                super(application, this.this$0, null);
            }

            @Override // defpackage.zr3
            public void onCardZoomTriggered(ActivityOptions activityOptions) {
                if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
                    ToastExtKt.toastShort(ApplicationExtKt.getApplication(), ResourceExtKt.getString(m0j.common_hint_network_unavailable));
                    return;
                }
                FragmentActivity curActivity = this.this$0.getCurActivity();
                if (curActivity != null) {
                    CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(curActivity);
                }
            }
        }.setRadius(ExtUtilsKt.getDp(Float.valueOf(15.0f)));
    }

    @Override // com.xiaomi.fitness.util.OnPageCallback
    public void showPlayChannel() {
        ViewExtKt.gone(this.this$0);
    }

    @Override // com.xiaomi.fitness.util.OnPageCallback
    public void showWebSyncServiceDisabled() {
        this.this$0.showDefaultMedalList();
        final Application application = ApplicationExtKt.getApplication();
        final MedalEntranceView medalEntranceView = this.this$0;
        new zr3(application) { // from class: com.xiaomi.fitness.mine.widget.MedalEntranceView$pageCallback$1$showWebSyncServiceDisabled$1
            {
                super(application, this.this$0, null);
            }

            @Override // defpackage.zr3
            public void onCardZoomTriggered(ActivityOptions activityOptions) {
                this.this$0.showSyncWebDialogIfNeed();
            }
        }.setRadius(ExtUtilsKt.getDp(Float.valueOf(15.0f)));
    }

    @Override // com.xiaomi.fitness.util.OnPageCallback
    public void showSuccess(MedalEntrance t) {
        RecyclerView medalEntranceRecyclerView = this.this$0.mRootView.F;
        Intrinsics.checkNotNullExpressionValue(medalEntranceRecyclerView, "medalEntranceRecyclerView");
        ViewExtKt.visible(medalEntranceRecyclerView);
        ConstraintLayout mineMainMedalErrorView = this.this$0.mRootView.I;
        Intrinsics.checkNotNullExpressionValue(mineMainMedalErrorView, "mineMainMedalErrorView");
        ViewExtKt.gone(mineMainMedalErrorView);
        if (!this.this$0.hasDataChanged(t) && this.this$0.lastRowCount == this.this$0.colCountPerRow) {
            Logger.d(MedalEntranceView.TAG, "Medal data unchanged, skip UI update");
            return;
        }
        MedalEntranceView medalEntranceView = this.this$0;
        medalEntranceView.lastRowCount = medalEntranceView.colCountPerRow;
        this.this$0.lastMedalEntrance = t;
        final Application application = ApplicationExtKt.getApplication();
        final MedalEntranceView medalEntranceView2 = this.this$0;
        new zr3(application) { // from class: com.xiaomi.fitness.mine.widget.MedalEntranceView$pageCallback$1$showSuccess$1
            {
                super(application, this.this$0, null);
            }

            @Override // defpackage.zr3
            public void onCardZoomTriggered(ActivityOptions activityOptions) {
                this.this$0.jumpToMedalList();
            }
        }.setRadius(ExtUtilsKt.getDp(Float.valueOf(15.0f)));
        this.this$0.mRootView.B.setText(ApplicationExtKt.getApplication().getString(m0j.F));
        if (t == null || t.getMedals().isEmpty()) {
            this.this$0.showDefaultMedalList();
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = this.this$0.colCountPerRow;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > t.getMedals().size() - 1) {
                arrayList.add(new MineMedalItem(null, Integer.valueOf(vni.z), 2, null));
            } else {
                arrayList.add(new MineMedalItem(null, null, 1, t.getMedals().get(i2)));
            }
        }
        this.this$0.getMedalEntranceAdapter().submitList(arrayList);
    }
}
