package com.huami.watch.companion.findphone;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Vibrator;
import androidx.core.app.NotificationManagerCompat;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.event.AppEnterBackgroundEvent;
import com.huami.watch.companion.event.AppEnterForegroundEvent;
import com.huami.watch.companion.findphone.AskAndAnswer;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Log;
import com.huami.watch.util.NotificationBuilder;
import com.huami.watch.util.RxBus;
import io.reactivex.functions.Consumer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AskAndAnswer {
    public static final int MSG_PHONE_HANDLE_NOTIFY_AUDIO = 1;
    public static final int MSG_PHONE_HANDLE_NOTIFY_VIBRATE = 2;
    public static final int MSG_PHONE_RESPONSE = 0;
    private static final int b = 3;
    private static final int c = 4369;
    private static final long d = 60000;
    private static MediaPlayer e;
    private static Context f;
    private static boolean g;
    private static Handler h = new a(Looper.getMainLooper());
    private static Runnable i = new b();
    private Transporter.DataListener a = new Transporter.DataListener() { // from class: ui
        @Override // com.huami.watch.transport.Transporter.DataListener
        public final void onDataReceived(TransportDataItem transportDataItem) {
            AskAndAnswer.v(transportDataItem);
        }
    };

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                AskAndAnswer.n();
                return;
            }
            if (i == 1) {
                AskAndAnswer.m();
            } else if (i == 2) {
                AskAndAnswer.o();
            } else {
                if (i != 3) {
                    return;
                }
                AskAndAnswer.w();
            }
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (AskAndAnswer.e != null) {
                    AskAndAnswer.e.stop();
                    AskAndAnswer.e.release();
                    AskAndAnswer.e = null;
                }
                ((Vibrator) AskAndAnswer.f.getSystemService("vibrator")).cancel();
            } catch (IllegalStateException unused) {
            }
        }
    }

    public AskAndAnswer(Context context) {
        f = context;
        p();
        q();
    }

    public static void cleanUp() {
        h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m() {
        MediaPlayer mediaPlayer = e;
        if (mediaPlayer == null) {
            e = new MediaPlayer();
        } else {
            try {
                mediaPlayer.stop();
                e.reset();
            } catch (IllegalStateException unused) {
            }
        }
        try {
            final AudioManager audioManager = (AudioManager) f.getSystemService("audio");
            final int streamVolume = audioManager.getStreamVolume(3);
            audioManager.setStreamVolume(3, audioManager.getStreamMaxVolume(3), 0);
            e.setDataSource(f, RingtoneManager.getDefaultUri(1));
            e.setLooping(true);
            e.prepare();
            e.start();
            e.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: ti
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    AskAndAnswer.r(audioManager, streamVolume, mediaPlayer2);
                }
            });
        } catch (Exception e2) {
            Log.e("FindPhone", "Ring Error!!", e2, new Object[0]);
        } catch (OutOfMemoryError e3) {
            Analytics.exception(f, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n() {
        Transporter.get(f, SettingsTransporterModules.MODULE_WATCH_SETTINGS).send(SettingsTransporterModules.ACTION_PHONE_FOUND, new DataBundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o() {
        ((Vibrator) f.getSystemService("vibrator")).vibrate(new long[]{1000, 1000}, 0);
    }

    public static void onFindPhoneBLEReceived() {
        h.sendEmptyMessage(1);
        h.sendEmptyMessage(2);
        h.sendEmptyMessage(3);
        h.postDelayed(i, 60000L);
    }

    private void p() {
        RxBus.get().toObservable().subscribe(new Consumer() { // from class: wi
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                AskAndAnswer.s(obj);
            }
        }, new Consumer() { // from class: vi
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                AskAndAnswer.u((Throwable) obj);
            }
        });
    }

    private void q() {
        Transporter transporter = Transporter.get(f, SettingsTransporterModules.MODULE_WATCH_SETTINGS);
        if (transporter != null) {
            transporter.connectTransportService();
            transporter.addDataListener(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(AudioManager audioManager, int i2, MediaPlayer mediaPlayer) {
        try {
            audioManager.setStreamVolume(3, i2, 0);
            mediaPlayer.stop();
            mediaPlayer.release();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(Object obj) throws Exception {
        if (obj instanceof AppEnterForegroundEvent) {
            g = true;
        } else if (obj instanceof AppEnterBackgroundEvent) {
            g = false;
        }
    }

    public static void stopAudio() {
        NotificationManagerCompat.from(f).cancel(4369);
        boolean z = false;
        try {
            MediaPlayer mediaPlayer = e;
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                z = true;
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
        if (z) {
            h.removeCallbacks(i);
            h.post(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(Throwable th) throws Exception {
        HMLog.warn("AskAndAnswer", th, new Function0() { // from class: xi
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AskAndAnswer.t();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(TransportDataItem transportDataItem) {
        if (SettingsTransporterModules.ACTION_FIND_PHONE.equals(transportDataItem.getAction())) {
            h.sendEmptyMessage(1);
            h.sendEmptyMessage(2);
            h.sendEmptyMessage(0);
            h.sendEmptyMessage(3);
            h.postDelayed(i, 60000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void w() {
        Context context = f;
        String deviceName = DeviceSource.getDeviceName(context, DeviceManager.getManager(context).getCurrentDevice());
        if (g) {
            Intent intent = new Intent(SettingsTransporterModules.ACTION_FIND_PHONE_DIALOG);
            intent.addFlags(335577088);
            f.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(SettingsTransporterModules.ACTION_FIND_PHONE_NOTIFY);
        intent2.addFlags(335577088);
        PendingIntent activity = PendingIntent.getActivity(f, 0, intent2, Build.VERSION.SDK_INT >= 23 ? 201326592 : AMapEngineUtils.HALF_MAX_P20_WIDTH);
        Context context2 = f;
        Notification notificationBuild = NotificationBuilder.buildNotification(context2, context2.getString(R.string.app_name), f.getString(R.string.find_phone_notification_msg, deviceName), R.drawable.ic_notification).setContentIntent(activity).setAutoCancel(true).build();
        notificationBuild.flags |= NotificationBuilder.FLAG_NOT_TO_WATCH;
        NotificationBuilder.notify(f, 4369, notificationBuild);
    }
}
