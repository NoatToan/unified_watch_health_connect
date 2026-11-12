package androidx.browser.trusted;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import java.io.IOException;
import java.util.Locale;
import z6.a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends Service {

    @SuppressLint({"ActionValue", "ServiceName"})
    public static final String ACTION_TRUSTED_WEB_ACTIVITY_SERVICE = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE";
    public static final String KEY_SMALL_ICON_BITMAP = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";
    public static final String KEY_SUCCESS = "androidx.browser.trusted.SUCCESS";
    public static final String META_DATA_NAME_SMALL_ICON = "android.support.customtabs.trusted.SMALL_ICON";
    public static final int SMALL_ICON_NOT_SET = -1;
    private NotificationManager mNotificationManager;
    int mVerifiedUid = -1;
    private final ITrustedWebActivityService.Stub mBinder = new a();

    public class a extends ITrustedWebActivityService.Stub {
        public a() {
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle areNotificationsEnabled(Bundle bundle) {
            k0();
            k.a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            k.e eVar = new k.e(j.this.onAreNotificationsEnabled(new k.c(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME")).f5339a));
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", eVar.f5344a);
            return bundle2;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final void cancelNotification(Bundle bundle) {
            k0();
            k.a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            k.a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            k.b bVar = new k.b(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
            j.this.onCancelNotification(bVar.f5337a, bVar.f5338b);
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
            k0();
            return j.this.onExtraCommand(str, bundle, f.a(iBinder));
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle getActiveNotifications() {
            k0();
            k.a aVar = new k.a(j.this.onGetActiveNotifications());
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", aVar.f5336a);
            return bundle;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle getSmallIconBitmap() {
            k0();
            return j.this.onGetSmallIconBitmap();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final int getSmallIconId() {
            k0();
            return j.this.onGetSmallIconId();
        }

        public final void k0() {
            boolean zB;
            j jVar = j.this;
            if (jVar.mVerifiedUid == -1) {
                String[] packagesForUid = jVar.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                if (packagesForUid == null) {
                    packagesForUid = new String[0];
                }
                b bVarLoad = jVar.getTokenStore().load();
                PackageManager packageManager = jVar.getPackageManager();
                if (bVarLoad != null) {
                    for (String str : packagesForUid) {
                        try {
                            zB = new androidx.browser.trusted.a().b(str, packageManager, bVarLoad.f5316a);
                        } catch (PackageManager.NameNotFoundException | IOException unused) {
                            zB = false;
                        }
                        if (zB) {
                            jVar.mVerifiedUid = Binder.getCallingUid();
                            break;
                        }
                    }
                }
            }
            if (jVar.mVerifiedUid == Binder.getCallingUid()) {
                return;
            }
            com.garmin.proto.generated.a.h("Caller is not verified as Trusted Web Activity provider.");
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle notifyNotificationWithChannel(Bundle bundle) {
            k0();
            k.a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            k.a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            k.a(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            k.a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            k.d dVar = new k.d(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
            k.e eVar = new k.e(j.this.onNotifyNotificationWithChannel(dVar.f5340a, dVar.f5341b, dVar.f5342c, dVar.f5343d));
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", eVar.f5344a);
            return bundle2;
        }
    }

    private static String channelNameToId(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    private void ensureOnCreateCalled() {
        if (this.mNotificationManager != null) {
            return;
        }
        vb.h.z("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
    }

    public abstract e getTokenStore();

    public boolean onAreNotificationsEnabled(String str) {
        ensureOnCreateCalled();
        if (!a0.a(this).f202582b.areNotificationsEnabled()) {
            return false;
        }
        NotificationChannel notificationChannel = this.mNotificationManager.getNotificationChannel(channelNameToId(str));
        return notificationChannel == null || notificationChannel.getImportance() != 0;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.mBinder;
    }

    public void onCancelNotification(String str, int i14) {
        ensureOnCreateCalled();
        this.mNotificationManager.cancel(str, i14);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mNotificationManager = (NotificationManager) getSystemService("notification");
    }

    public Bundle onExtraCommand(String str, Bundle bundle, f fVar) {
        return null;
    }

    public Parcelable[] onGetActiveNotifications() {
        ensureOnCreateCalled();
        return this.mNotificationManager.getActiveNotifications();
    }

    public Bundle onGetSmallIconBitmap() {
        int iOnGetSmallIconId = onGetSmallIconId();
        Bundle bundle = new Bundle();
        if (iOnGetSmallIconId == -1) {
            return bundle;
        }
        bundle.putParcelable(KEY_SMALL_ICON_BITMAP, BitmapFactory.decodeResource(getResources(), iOnGetSmallIconId));
        return bundle;
    }

    public int onGetSmallIconId() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt(META_DATA_NAME_SMALL_ICON, -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public boolean onNotifyNotificationWithChannel(String str, int i14, Notification notification, String str2) {
        Notification notificationBuild;
        ensureOnCreateCalled();
        if (!a0.a(this).f202582b.areNotificationsEnabled()) {
            return false;
        }
        String strChannelNameToId = channelNameToId(str2);
        NotificationManager notificationManager = this.mNotificationManager;
        notificationManager.createNotificationChannel(new NotificationChannel(strChannelNameToId, str2, 3));
        if (notificationManager.getNotificationChannel(strChannelNameToId).getImportance() == 0) {
            notificationBuild = null;
        } else {
            Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(this, notification);
            builderRecoverBuilder.setChannelId(strChannelNameToId);
            notificationBuild = builderRecoverBuilder.build();
        }
        NotificationChannel notificationChannel = this.mNotificationManager.getNotificationChannel(strChannelNameToId);
        if (notificationChannel != null && notificationChannel.getImportance() == 0) {
            return false;
        }
        this.mNotificationManager.notify(str, i14, notificationBuild);
        return true;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.mVerifiedUid = -1;
        return super.onUnbind(intent);
    }
}
