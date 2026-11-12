package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.os.Handler;
import android.os.Message;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.ItemPushStartBean;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicBean;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.suc;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001bJ)\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushState;", "Lsuc$a;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;", "musicBean", "", "currentIndex", "allSize", "", "onItemPushStart", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;II)V", BroadcastsKt.SILENT_PUSHING_PROGRESS, "onItemPush", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;I)V", "onItemPushEnd", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;)V", "onLowStorage", "()V", "", "list", "onPushEnd", "(Ljava/util/List;)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MusicPushState extends suc.a {

    @NotNull
    private Handler handler;

    public MusicPushState(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handler = handler;
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    @Override // defpackage.suc
    public void onItemPush(@NotNull MusicBean musicBean, int progress) {
        Intrinsics.checkNotNullParameter(musicBean, "musicBean");
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = new Pair(musicBean, Integer.valueOf(progress));
        this.handler.sendMessage(messageObtain);
    }

    @Override // defpackage.suc
    public void onItemPushEnd(@Nullable MusicBean musicBean) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        messageObtain.obj = musicBean;
        this.handler.sendMessage(messageObtain);
    }

    @Override // defpackage.suc
    public void onItemPushStart(@Nullable MusicBean musicBean, int currentIndex, int allSize) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        Intrinsics.checkNotNull(musicBean);
        messageObtain.obj = new ItemPushStartBean(musicBean, currentIndex, allSize);
        this.handler.sendMessage(messageObtain);
    }

    @Override // defpackage.suc
    public void onLowStorage() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        this.handler.sendMessage(messageObtain);
    }

    @Override // defpackage.suc
    public void onPushEnd(@Nullable List<MusicBean> list) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = list;
        this.handler.sendMessage(messageObtain);
    }

    public final void setHandler(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<set-?>");
        this.handler = handler;
    }
}
