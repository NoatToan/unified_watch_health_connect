package com.xiaomi.fitness.watch.face.viewmodel;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\u000b\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/xiaomi/fitness/watch/face/viewmodel/FaceHMInfoViewModel$handler$2$1", "Landroid/os/Handler;", "setMaxProgress", "", "type", "", "handleMessage", "msg", "Landroid/os/Message;", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"HandlerLeak"})
public final class FaceHMInfoViewModel$handler$2$1 extends Handler {
    final /* synthetic */ Ref.IntRef $maxPro;
    final /* synthetic */ Ref.IntRef $proType;
    final /* synthetic */ FaceHMInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceHMInfoViewModel$handler$2$1(Ref.IntRef intRef, Ref.IntRef intRef2, FaceHMInfoViewModel faceHMInfoViewModel, Looper looper) {
        super(looper);
        this.$proType = intRef;
        this.$maxPro = intRef2;
        this.this$0 = faceHMInfoViewModel;
    }

    @Override // android.os.Handler
    public void handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i = msg.what;
        this.this$0.getInstallRet().setCodeOrProgress(1);
        this.this$0.getInstallRet().setType(this.$proType.element);
        if (i <= this.$maxPro.element) {
            i++;
            sendEmptyMessageDelayed(i, 800L);
            this.this$0.getInstall().setValue(this.this$0.getInstallRet());
        }
        Logger.d(this.this$0.getTAG(), "handleMessage: " + i);
    }

    public final void setMaxProgress(int type) {
        this.$proType.element = type;
        this.$maxPro.element = type == 1 ? 6 : 12;
    }
}
