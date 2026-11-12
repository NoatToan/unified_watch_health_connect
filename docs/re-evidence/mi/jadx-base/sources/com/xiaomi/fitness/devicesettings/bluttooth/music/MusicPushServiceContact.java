package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicBean;
import defpackage.suc;
import defpackage.tuc;
import defpackage.xc6;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u001b\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\u00032\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushServiceContact;", "", "Lkotlin/Function0;", "", "bindSuccess", "bindConnectionService", "(Lkotlin/jvm/functions/Function0;)V", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;", "Lkotlin/collections/ArrayList;", "list", "startPush", "(Ljava/util/ArrayList;)V", "Lsuc;", "musicHandler", "addMusicPushState", "(Lsuc;)V", "removeMusicPushHandler", "flushComplete", "()V", "cancle", "Ltuc;", "musicContact", "Ltuc;", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MusicPushServiceContact {

    @NotNull
    public static final MusicPushServiceContact INSTANCE = new MusicPushServiceContact();

    @Nullable
    private static tuc musicContact;

    private MusicPushServiceContact() {
    }

    public final void addMusicPushState(@NotNull suc musicHandler) throws RemoteException {
        Intrinsics.checkNotNullParameter(musicHandler, "musicHandler");
        tuc tucVar = musicContact;
        if (tucVar != null) {
            tucVar.addMusicPushHandler(musicHandler);
        }
    }

    public final void bindConnectionService(@NotNull final Function0<Unit> bindSuccess) {
        Intrinsics.checkNotNullParameter(bindSuccess, "bindSuccess");
        if (musicContact != null) {
            bindSuccess.invoke();
            xc6.d("MusicPushServiceContact musicContact is bind");
        } else {
            Application app = AppUtil.getApp();
            app.bindService(new Intent(app, (Class<?>) MusicPushService.class), new ServiceConnection() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicPushServiceContact.bindConnectionService.1
                @Override // android.content.ServiceConnection
                public void onServiceConnected(final ComponentName name, IBinder service) throws RemoteException {
                    IBinder iBinderAsBinder;
                    xc6.d("MusicPushServiceContact onServiceConnected name:" + name);
                    MusicPushServiceContact musicPushServiceContact = MusicPushServiceContact.INSTANCE;
                    MusicPushServiceContact.musicContact = tuc.a.asInterface(service);
                    bindSuccess.invoke();
                    tuc tucVar = MusicPushServiceContact.musicContact;
                    if (tucVar == null || (iBinderAsBinder = tucVar.asBinder()) == null) {
                        return;
                    }
                    iBinderAsBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicPushServiceContact$bindConnectionService$1$onServiceConnected$1
                        @Override // android.os.IBinder.DeathRecipient
                        public void binderDied() {
                            IBinder iBinderAsBinder2;
                            xc6.d("MusicPushServiceContact linkToDeath name:" + name);
                            tuc tucVar2 = MusicPushServiceContact.musicContact;
                            if (tucVar2 != null && (iBinderAsBinder2 = tucVar2.asBinder()) != null) {
                                iBinderAsBinder2.unlinkToDeath(this, 0);
                            }
                            MusicPushServiceContact.musicContact = null;
                        }
                    }, 0);
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName name) {
                    xc6.d("onServiceDisconnected name:" + name);
                }
            }, 1);
        }
    }

    public final void cancle() throws RemoteException {
        tuc tucVar = musicContact;
        if (tucVar != null) {
            tucVar.cancel();
        }
    }

    public final void flushComplete() throws RemoteException {
        tuc tucVar = musicContact;
        if (tucVar != null) {
            tucVar.flushComplete();
        }
    }

    public final void removeMusicPushHandler(@NotNull suc musicHandler) throws RemoteException {
        Intrinsics.checkNotNullParameter(musicHandler, "musicHandler");
        tuc tucVar = musicContact;
        if (tucVar != null) {
            tucVar.removeMusicPushHandler(musicHandler);
        }
    }

    public final void startPush(@NotNull ArrayList<MusicBean> list) throws RemoteException {
        Intrinsics.checkNotNullParameter(list, "list");
        tuc tucVar = musicContact;
        if (tucVar != null) {
            tucVar.startPush(list);
        }
    }
}
