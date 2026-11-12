package com.xiaomi.fitness.sport_manager.music;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicCallback;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicServiceListener;
import com.xiaomi.fitness.sport_manager_export.listener.IPlayerEventListener;
import com.xiaomi.fitness.sport_manager_export.listener.MusicData;
import com.xiaomi.fitness.sport_manager_export.listener.Result;
import defpackage.g1j;
import defpackage.lwc;
import defpackage.mwc;
import defpackage.nwc;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007*\u00019\u0018\u0000 >2\u00020\u0001:\u0001>B\t\b\u0007¢\u0006\u0004\b<\u0010=J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\"\u0010#J\u0011\u0010$\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010\u0007J\u0015\u0010'\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010!\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010.R\"\u0010/\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/music/SportMusicManager;", "Lcom/xiaomi/fitness/sport_manager_export/listener/IMusicPlayer;", "", "getXiaomiPlayerVersion", "()J", "", "hasBindService", "()Z", "Landroid/content/Context;", "context", "Lcom/xiaomi/fitness/sport_manager_export/listener/IMusicServiceListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "bindXiaomiPlayerService", "(Landroid/content/Context;Lcom/xiaomi/fitness/sport_manager_export/listener/IMusicServiceListener;)V", "unBindXiaomiPlayerService", "(Landroid/content/Context;)V", "", "action", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "force", "Lcom/xiaomi/fitness/sport_manager_export/listener/IMusicCallback;", "callback", "executeAsync", "(Ljava/lang/String;Landroid/os/Bundle;ZLcom/xiaomi/fitness/sport_manager_export/listener/IMusicCallback;)V", "", "mode", "goQQPlayer", "(Landroid/content/Context;I)V", "Lcom/xiaomi/fitness/sport_manager_export/listener/IPlayerEventListener;", "setOnPlayerListener", "(Lcom/xiaomi/fitness/sport_manager_export/listener/IPlayerEventListener;)V", "bpm", "setBPM", "(I)V", "isShowMusicPlyer", "()Ljava/lang/Boolean;", "isHasSportPlaylist", "isAppInstalledXiaomiMusic", "(Landroid/content/Context;)Z", "Lnwc;", "playerBinder", "Lnwc;", "iPlayerEventListener", "Lcom/xiaomi/fitness/sport_manager_export/listener/IPlayerEventListener;", "I", "hasSportPlaylist", "Z", "getHasSportPlaylist", "setHasSportPlaylist", "(Z)V", "serviceConnectListener", "Lcom/xiaomi/fitness/sport_manager_export/listener/IMusicServiceListener;", "Landroid/content/ServiceConnection;", "serviceConnection", "Landroid/content/ServiceConnection;", "com/xiaomi/fitness/sport_manager/music/SportMusicManager$eventCallback$1", "eventCallback", "Lcom/xiaomi/fitness/sport_manager/music/SportMusicManager$eventCallback$1;", "<init>", "()V", "Companion", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportMusicManager implements IMusicPlayer {

    @NotNull
    public static final String MI_MUSIC_PACKAGENAME = "com.miui.player";

    @NotNull
    public static final String TAG = "SportMusicManager";
    private int bpm;
    private boolean hasSportPlaylist;

    @Nullable
    private IPlayerEventListener iPlayerEventListener;

    @Nullable
    private nwc playerBinder;

    @Nullable
    private IMusicServiceListener serviceConnectListener;

    @NotNull
    private final ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.xiaomi.fitness.sport_manager.music.SportMusicManager$serviceConnection$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder service) throws RemoteException {
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            Intrinsics.checkNotNullParameter(service, "service");
            this.this$0.playerBinder = nwc.a.s2(service);
            Logger.i(SportMusicManager.TAG, "onServiceConnected , playerBinder:" + this.this$0.playerBinder);
            nwc nwcVar = this.this$0.playerBinder;
            if (nwcVar != null) {
                nwcVar.e4(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"play_state", "play_event", "update_songinfo", "get_bpm"}), this.this$0.eventCallback);
            }
            IMusicServiceListener iMusicServiceListener = this.this$0.serviceConnectListener;
            if (iMusicServiceListener != null) {
                iMusicServiceListener.onServiceConnect(this.this$0.playerBinder != null);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            Logger.i(SportMusicManager.TAG, "onServiceDisconnected");
            this.this$0.playerBinder = null;
            this.this$0.serviceConnectListener = null;
        }
    };

    @NotNull
    private final SportMusicManager$eventCallback$1 eventCallback = new mwc.a() { // from class: com.xiaomi.fitness.sport_manager.music.SportMusicManager$eventCallback$1
        @Override // defpackage.mwc
        public Bundle fetchData(String event) {
            if (!Intrinsics.areEqual(event, "get_bpm")) {
                return new Bundle();
            }
            Bundle bundle = new Bundle();
            SportMusicManager sportMusicManager = this.this$0;
            FitnessLogUtils.i(SportMusicManager.TAG, "BPM:" + sportMusicManager.bpm);
            bundle.putInt("bpm", sportMusicManager.bpm);
            return bundle;
        }

        @Override // defpackage.mwc
        public void onEvent(String event, Bundle bundle) {
            String string;
            String string2;
            if (Intrinsics.areEqual(event, "update_songinfo")) {
                MusicData musicData = new MusicData((bundle == null || (string2 = bundle.getString("name")) == null) ? "" : string2, (bundle == null || (string = bundle.getString("url")) == null) ? "" : string, 0L, 4, null);
                FitnessLogUtils.i(SportMusicManager.TAG, "this:" + this + " , iPlayerEventListener:" + this.this$0.iPlayerEventListener + " , data:" + musicData);
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new SportMusicManager$eventCallback$1$onEvent$1(this.this$0, musicData, null), 2, null);
                return;
            }
            if (Intrinsics.areEqual(event, "play_state")) {
                Boolean boolValueOf = bundle != null ? Boolean.valueOf(bundle.getBoolean("isPlaying")) : null;
                FitnessLogUtils.i(SportMusicManager.TAG, "this:" + this + " , iPlayerEventListener:" + this.this$0.iPlayerEventListener + " , isPlaying:" + boolValueOf);
                IPlayerEventListener iPlayerEventListener = this.this$0.iPlayerEventListener;
                if (iPlayerEventListener != null) {
                    iPlayerEventListener.onPlayState(boolValueOf);
                }
            }
        }
    };

    private final long getXiaomiPlayerVersion() {
        try {
            PackageInfo packageInfo = AppUtil.getApp().getPackageManager().getPackageInfo(MI_MUSIC_PACKAGENAME, 0);
            String str = packageInfo.versionName;
            if (Build.VERSION.SDK_INT >= 28) {
                return packageInfo.getLongVersionCode();
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return 0L;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer
    public void bindXiaomiPlayerService(@NotNull Context context, @NotNull IMusicServiceListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (Intrinsics.areEqual(isShowMusicPlyer(), Boolean.TRUE)) {
            this.serviceConnectListener = listener;
            Intent intent = new Intent("com.miui.player_preview.QQMusicThirdService");
            intent.setPackage(MI_MUSIC_PACKAGENAME);
            intent.putExtra("adTag", "xiaomihealth");
            FitnessLogUtils.i(TAG, "bindXiaomiPlayerService , bindService:" + context.bindService(intent, this.serviceConnection, 1));
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer
    public void executeAsync(@NotNull final String action, @Nullable Bundle bundle, boolean force, @Nullable final IMusicCallback callback) {
        IBinder iBinderAsBinder;
        IBinder iBinderAsBinder2;
        Intrinsics.checkNotNullParameter(action, "action");
        Boolean boolValueOf = null;
        Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt("mode")) : null;
        FitnessLogUtils.i(TAG, "executeAsync , action:" + action + " , mode:" + numValueOf + " , hasSportPlaylist:" + this.hasSportPlaylist + " , force:" + force);
        try {
            nwc nwcVar = this.playerBinder;
            if (nwcVar == null || (iBinderAsBinder = nwcVar.asBinder()) == null || !iBinderAsBinder.isBinderAlive()) {
                return;
            }
            if (force || this.hasSportPlaylist || (!Intrinsics.areEqual(action, "play_sports_playlist") && !Intrinsics.areEqual(action, "toggle"))) {
                nwc nwcVar2 = this.playerBinder;
                if (nwcVar2 != null && (iBinderAsBinder2 = nwcVar2.asBinder()) != null) {
                    boolValueOf = Boolean.valueOf(iBinderAsBinder2.isBinderAlive());
                }
                FitnessLogUtils.i(TAG, "playerBinder :" + nwcVar2 + " , binder:" + boolValueOf);
                nwc nwcVar3 = this.playerBinder;
                if (nwcVar3 != null) {
                    nwcVar3.d0(action, bundle, new lwc.a() { // from class: com.xiaomi.fitness.sport_manager.music.SportMusicManager.executeAsync.1
                        @Override // defpackage.lwc
                        public void onReturn(Bundle bundle2) {
                            String string;
                            String string2;
                            String string3;
                            int i = bundle2 != null ? bundle2.getInt("code") : -1;
                            String str = "";
                            if (bundle2 == null || (string = bundle2.getString("msg")) == null) {
                                string = "";
                            }
                            Result result = new Result(i, string);
                            if (Intrinsics.areEqual(action, "get_sports_playlist_info")) {
                                this.setHasSportPlaylist(result.getCode() == 0);
                            }
                            if (bundle2 == null || (string2 = bundle2.getString("name")) == null) {
                                string2 = "";
                            }
                            if (bundle2 != null && (string3 = bundle2.getString("url")) != null) {
                                str = string3;
                            }
                            MusicData musicData = new MusicData(string2, str, bundle2 != null ? bundle2.getLong("id") : -1L);
                            FitnessLogUtils.i(SportMusicManager.TAG, "result:" + result + " , data:" + musicData);
                            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new SportMusicManager$executeAsync$1$onReturn$1(callback, result, musicData, null), 2, null);
                        }
                    });
                    return;
                }
                return;
            }
            FitnessLogUtils.i(TAG, "not select playlist , hasSportPlaylist:" + this.hasSportPlaylist);
        } catch (Exception e) {
            Logger.e(TAG, "e:" + e);
        }
    }

    public final boolean getHasSportPlaylist() {
        return this.hasSportPlaylist;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer
    public void goQQPlayer(@NotNull Context context, int mode) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!isAppInstalledXiaomiMusic(AppUtil.getApp())) {
            FitnessLogUtils.i(TAG, "not install xiaomi_music");
            ToastUtil.showShortToast(g1j.o);
            return;
        }
        FitnessLogUtils.i(TAG, "goQQPlayer , mode:" + mode);
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("miui-music://qqmusiclite?action=to_sports&ADTAG=xiaomihealth&mode=" + mode)));
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer
    public boolean hasBindService() {
        return this.playerBinder != null;
    }

    public final boolean isAppInstalledXiaomiMusic(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        try {
            packageManager.getPackageInfo(MI_MUSIC_PACKAGENAME, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer
    public boolean isHasSportPlaylist() {
        return this.hasSportPlaylist;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer
    @Nullable
    public Boolean isShowMusicPlyer() {
        FitnessLogUtils.i(TAG, "xiaomi player version :" + getXiaomiPlayerVersion());
        return Boolean.valueOf((AppUtil.INSTANCE.isPlayChannel() ^ true) && RomUtils.isXiaomi() && getXiaomiPlayerVersion() >= 4300001);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer
    public void setBPM(int bpm) {
        this.bpm = bpm;
    }

    public final void setHasSportPlaylist(boolean z) {
        this.hasSportPlaylist = z;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer
    public void setOnPlayerListener(@Nullable IPlayerEventListener callback) {
        FitnessLogUtils.i(TAG, "setOnPlayerListener :" + callback);
        this.iPlayerEventListener = callback;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer
    public void unBindXiaomiPlayerService(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.iPlayerEventListener = null;
        if (Intrinsics.areEqual(isShowMusicPlyer(), Boolean.TRUE)) {
            FitnessLogUtils.i(TAG, "unBindXiaomiPlayerService");
            try {
                nwc nwcVar = this.playerBinder;
                if (nwcVar != null) {
                    nwcVar.e5(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"play_state", "play_event", "update_songinfo", "get_bpm"}), this.eventCallback);
                }
            } catch (Exception e) {
                Logger.e(TAG, "E:" + e);
            }
            try {
                context.unbindService(this.serviceConnection);
            } catch (Exception e2) {
                Logger.e(TAG, "unbindService e:" + e2);
            }
            this.playerBinder = null;
            this.serviceConnectListener = null;
        }
    }
}
