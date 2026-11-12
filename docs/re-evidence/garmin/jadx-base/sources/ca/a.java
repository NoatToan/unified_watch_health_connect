package ca;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.view.KeyEvent;
import androidx.core.view.d;
import java.util.List;
import java.util.Objects;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f26057a = 0;

    /* JADX INFO: renamed from: ca.a$a, reason: collision with other inner class name */
    public static final class C0398a {
        private C0398a() {
        }

        public static ForegroundServiceStartNotAllowedException a(IllegalStateException illegalStateException) {
            return d.e(illegalStateException);
        }

        public static boolean b(IllegalStateException illegalStateException) {
            return d.B(illegalStateException);
        }
    }

    public static class b extends MediaBrowserCompat.ConnectionCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f26058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Intent f26059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BroadcastReceiver.PendingResult f26060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public MediaBrowserCompat f26061d;

        public b(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f26058a = context;
            this.f26059b = intent;
            this.f26060c = pendingResult;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void onConnected() {
            new MediaControllerCompat(this.f26058a, this.f26061d.getSessionToken()).dispatchMediaButtonEvent((KeyEvent) this.f26059b.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            this.f26061d.disconnect();
            this.f26060c.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void onConnectionFailed() {
            this.f26061d.disconnect();
            this.f26060c.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void onConnectionSuspended() {
            this.f26061d.disconnect();
            this.f26060c.finish();
        }
    }

    public static ComponentName a(Context context, String str) {
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
        StringBuilder sbL = hb.a.l("Expected 1 service that handles ", str, ", found ");
        sbL.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbL.toString());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        ComponentName componentNameA = a(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameA != null) {
            intent.setComponent(componentNameA);
            try {
                a7.b.startForegroundService(context, intent);
                return;
            } catch (IllegalStateException e4) {
                if (Build.VERSION.SDK_INT < 31 || !C0398a.b(e4)) {
                    throw e4;
                }
                C0398a.a(e4).getMessage();
                return;
            }
        }
        ComponentName componentNameA2 = a(context, "android.media.browse.MediaBrowserService");
        if (componentNameA2 == null) {
            h.z("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            return;
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        b bVar = new b(applicationContext, intent, pendingResultGoAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameA2, bVar, null);
        bVar.f26061d = mediaBrowserCompat;
        mediaBrowserCompat.connect();
    }
}
