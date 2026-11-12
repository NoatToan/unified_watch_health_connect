package com.huami.musiccontrol;

import android.content.Context;
import android.media.RemoteController;
import android.service.notification.NotificationListenerService;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.musiccontrol.musicview.HMMusicViewDecorator;
import com.huami.musiccontrol.musicview.IDeviceMusicView;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 22\u00020\u0001:\u0003234B\t\b\u0002¢\u0006\u0004\b1\u0010\u0018J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0011*\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010$\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0000¢\u0006\u0004\b\"\u0010#R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00065"}, d2 = {"Lcom/huami/musiccontrol/MusicControllerModule;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/musiccontrol/MusicControllerModule$IMusicModuleDelegate;", "delegate", "", PointCategory.INIT, "deInit", "", "needInit", "Lcom/huami/musiccontrol/musicview/IDeviceMusicView;", ViewHierarchyConstants.VIEW_KEY, "setDeviceMusicView", "Lcom/huami/musiccontrol/MusicControllerModule$IMusicListenerService;", "service", "bindToService", ExifInterface.GPS_DIRECTION_TRUE, "getDeviceMusicView", "()Lcom/huami/musiccontrol/musicview/IDeviceMusicView;", "hasPermission$music_control_release", "()Z", "hasPermission", "tryToStartService$music_control_release", "()V", "tryToStartService", "getContext$music_control_release", "()Landroid/content/Context;", "getContext", "getNotificationService$music_control_release", "()Lcom/huami/musiccontrol/MusicControllerModule$IMusicListenerService;", "getNotificationService", "Ljava/lang/Class;", "Landroid/service/notification/NotificationListenerService;", "getNotificationServiceClass$music_control_release", "()Ljava/lang/Class;", "getNotificationServiceClass", "a", "Lcom/huami/musiccontrol/MusicControllerModule$IMusicModuleDelegate;", "Lcom/huami/musiccontrol/musicview/HMMusicViewDecorator;", "b", "Lcom/huami/musiccontrol/musicview/HMMusicViewDecorator;", "deviceMusicView", "c", "Lcom/huami/musiccontrol/MusicControllerModule$IMusicListenerService;", "musicListenerService", GoogleApiAvailabilityLight.a, "Landroid/content/Context;", "appContext", "<init>", "Companion", "IMusicListenerService", "IMusicModuleDelegate", "music_control_release"}, k = 1, mv = {1, 4, 1})
public final class MusicControllerModule {

    @NotNull
    public static final String TAG_PRE = "MusicCtrl_";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private IMusicModuleDelegate delegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private HMMusicViewDecorator deviceMusicView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private IMusicListenerService musicListenerService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Context appContext;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final MusicControllerModule e = new MusicControllerModule();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/huami/musiccontrol/MusicControllerModule$Companion;", "", "Lcom/huami/musiccontrol/MusicControllerModule;", DefaultSettingsSpiCall.n, "Lcom/huami/musiccontrol/MusicControllerModule;", "getInstance", "()Lcom/huami/musiccontrol/MusicControllerModule;", "", "TAG_PRE", "Ljava/lang/String;", "<init>", "()V", "music_control_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final MusicControllerModule getInstance() {
            return MusicControllerModule.e;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/musiccontrol/MusicControllerModule$IMusicListenerService;", "", "Landroid/service/notification/NotificationListenerService;", "getService", "Landroid/media/RemoteController$OnClientUpdateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setClientUpdateListener", "music_control_release"}, k = 1, mv = {1, 4, 1})
    public interface IMusicListenerService {
        @Nullable
        NotificationListenerService getService();

        void setClientUpdateListener(@NotNull RemoteController.OnClientUpdateListener listener);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0005*\u00020\u0004H&J\b\u0010\t\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/huami/musiccontrol/MusicControllerModule$IMusicModuleDelegate;", "", "", "hasPermission", "Landroid/service/notification/NotificationListenerService;", ExifInterface.LATITUDE_SOUTH, "Ljava/lang/Class;", "getServiceClass", "", "tryToStartService", "music_control_release"}, k = 1, mv = {1, 4, 1})
    public interface IMusicModuleDelegate {
        @NotNull
        <S extends NotificationListenerService> Class<S> getServiceClass();

        boolean hasPermission();

        void tryToStartService();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "try to start service";
        }
    }

    private MusicControllerModule() {
    }

    public final void bindToService(@NotNull IMusicListenerService service) {
        if (!(service.getService() instanceof RemoteController.OnClientUpdateListener)) {
            throw new IllegalArgumentException("NotificationListenerService must implements RemoteController.OnClientUpdateListener!!");
        }
        this.musicListenerService = service;
    }

    public final void deInit() {
        this.delegate = null;
        this.deviceMusicView = null;
    }

    @Nullable
    /* JADX INFO: renamed from: getContext$music_control_release, reason: from getter */
    public final Context getAppContext() {
        return this.appContext;
    }

    @Nullable
    public final <T extends IDeviceMusicView> T getDeviceMusicView() {
        try {
            HMMusicViewDecorator hMMusicViewDecorator = this.deviceMusicView;
            IDeviceMusicView musicView$music_control_release = hMMusicViewDecorator != null ? hMMusicViewDecorator.getMusicView() : null;
            if (musicView$music_control_release != null) {
                return (T) musicView$music_control_release;
            }
            throw new NullPointerException("null cannot be cast to non-null type T");
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getNotificationService$music_control_release, reason: from getter */
    public final IMusicListenerService getMusicListenerService() {
        return this.musicListenerService;
    }

    @Nullable
    public final Class<NotificationListenerService> getNotificationServiceClass$music_control_release() {
        IMusicModuleDelegate iMusicModuleDelegate = this.delegate;
        if (iMusicModuleDelegate != null) {
            return iMusicModuleDelegate.getServiceClass();
        }
        return null;
    }

    public final boolean hasPermission$music_control_release() {
        IMusicModuleDelegate iMusicModuleDelegate = this.delegate;
        if (iMusicModuleDelegate != null) {
            return iMusicModuleDelegate.hasPermission();
        }
        return false;
    }

    public final void init(@NotNull Context context, @NotNull IMusicModuleDelegate delegate) {
        this.delegate = delegate;
        this.appContext = context.getApplicationContext();
    }

    public final boolean needInit() {
        return this.delegate == null || this.deviceMusicView == null;
    }

    public final void setDeviceMusicView(@NotNull IDeviceMusicView view) {
        this.deviceMusicView = new HMMusicViewDecorator(view);
    }

    public final void tryToStartService$music_control_release() {
        HMLog.info(TAG_PRE, a.a);
        IMusicModuleDelegate iMusicModuleDelegate = this.delegate;
        if (iMusicModuleDelegate != null) {
            iMusicModuleDelegate.tryToStartService();
        }
    }
}
