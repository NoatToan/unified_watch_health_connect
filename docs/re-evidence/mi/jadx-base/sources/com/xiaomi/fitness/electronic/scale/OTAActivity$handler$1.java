package com.xiaomi.fitness.electronic.scale;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaomi.fitness.electronic.scale.OTAActivity$handler$1;
import com.xiaomi.fitness.electronic.scale.model.LocalDeviceUpgradeModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.t48;
import defpackage.zzi;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/xiaomi/fitness/electronic/scale/OTAActivity$handler$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OTAActivity$handler$1 extends Handler {
    final /* synthetic */ OTAActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTAActivity$handler$1(OTAActivity oTAActivity, Looper looper) {
        super(looper);
        this.this$0 = oTAActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleMessage$lambda$0(OTAActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    @Override // android.os.Handler
    public void handleMessage(Message msg) {
        String string;
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i = msg.what;
        if (i == 1) {
            int i2 = msg.arg1;
            OTALogExtKt.logi("OTAActivityupdate progress = " + i2);
            this.this$0.handleProgress(i2);
            this.this$0.isTimeOut();
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.this$0.showOTAFail();
                return;
            }
            if (i == 4) {
                RelativeLayout llUpgrading = this.this$0.getMBinding().E;
                Intrinsics.checkNotNullExpressionValue(llUpgrading, "llUpgrading");
                ViewExtKt.setVisible(llUpgrading, true);
                LinearLayout llVersionInfo = this.this$0.getMBinding().F;
                Intrinsics.checkNotNullExpressionValue(llVersionInfo, "llVersionInfo");
                ViewExtKt.setVisible(llVersionInfo, false);
                return;
            }
            if (i != 5) {
                return;
            }
            this.this$0.getMBinding().G.setVisibility(8);
            this.this$0.getMBinding().D.setVisibility(8);
            this.this$0.getMBinding().J.setText(this.this$0.getString(zzi.u4));
            TextView textView = this.this$0.getMBinding().J;
            final OTAActivity oTAActivity = this.this$0;
            textView.setOnClickListener(new View.OnClickListener() { // from class: j3h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OTAActivity$handler$1.handleMessage$lambda$0(oTAActivity, view);
                }
            });
            this.this$0.showPushFinishDialog();
            TimerTask timerTask = this.this$0.timerTask;
            if (timerTask != null) {
                timerTask.cancel();
            }
            this.this$0.timer.cancel();
            return;
        }
        if (this.this$0.latestVersion == null) {
            return;
        }
        LocalDeviceUpgradeModel.CheckUpgradeRequest checkUpgradeRequest = this.this$0.latestVersion;
        Intrinsics.checkNotNull(checkUpgradeRequest, "null cannot be cast to non-null type com.xiaomi.fitness.electronic.scale.model.LocalDeviceUpgradeModel.CheckUpgradeRequest");
        String str = t48.c().f34293a;
        this.this$0.getMBinding().P.setText(this.this$0.getString(zzi.s) + ": " + checkUpgradeRequest.getCurrentVersion(str));
        boolean zNeedUpgrade = checkUpgradeRequest.needUpgrade();
        TextView textView2 = this.this$0.getMBinding().Q;
        if (zNeedUpgrade) {
            string = this.this$0.getString(zzi.m4) + ": " + checkUpgradeRequest.latestVersion;
        } else {
            string = this.this$0.getString(zzi.p4);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        textView2.setText(string);
        this.this$0.getMBinding().L.setText(checkUpgradeRequest.description);
        this.this$0.getMBinding().K.setText(checkUpgradeRequest.description);
        this.this$0.getMBinding().M.setVisibility(zNeedUpgrade ? 0 : 8);
        this.this$0.getMBinding().L.setVisibility(zNeedUpgrade ? 0 : 8);
        this.this$0.getMBinding().O.setVisibility(zNeedUpgrade ? 0 : 8);
        if (zNeedUpgrade) {
            return;
        }
        TimerTask timerTask2 = this.this$0.timerTask;
        if (timerTask2 != null) {
            timerTask2.cancel();
        }
        this.this$0.timer.cancel();
    }
}
