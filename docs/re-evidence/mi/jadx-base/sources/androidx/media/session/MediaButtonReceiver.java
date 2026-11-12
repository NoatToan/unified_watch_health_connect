package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.view.KeyEvent;
import androidx.annotation.RestrictTo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    public static class a extends MediaBrowserCompat.ConnectionCallback {
        public final Context c;
        public final Intent d;
        public final BroadcastReceiver.PendingResult e;
        public MediaBrowserCompat f;

        public a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.c = context;
            this.d = intent;
            this.e = pendingResult;
        }

        public final void b() {
            this.f.disconnect();
            this.e.finish();
        }

        public void c(MediaBrowserCompat mediaBrowserCompat) {
            this.f = mediaBrowserCompat;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnected() {
            new MediaControllerCompat(this.c, this.f.getSessionToken()).dispatchMediaButtonEvent((KeyEvent) this.d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            b();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionFailed() {
            b();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionSuspended() {
            b();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static ComponentName a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        listQueryBroadcastReceivers.size();
        return null;
    }

    public static ComponentName b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + listQueryIntentServices.size());
    }

    public static void c(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignore unsupported intent: ");
            sb.append(intent);
            return;
        }
        ComponentName componentNameB = b(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameB != null) {
            intent.setComponent(componentNameB);
            c(context, intent);
            return;
        }
        ComponentName componentNameB2 = b(context, "android.media.browse.MediaBrowserService");
        if (componentNameB2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        a aVar = new a(applicationContext, intent, pendingResultGoAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameB2, aVar, null);
        aVar.c(mediaBrowserCompat);
        mediaBrowserCompat.connect();
    }
}
