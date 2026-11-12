package com.huami.watch.companion.mediac;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class CommandHandler implements Transporter.DataListener, Transporter.ChannelListener {
    public static final String MODULE_MUSIC_CONSOLE = "transport_module_music_console";
    private static CommandHandler d;
    private Context a;
    private boolean b = false;
    private boolean c;

    private CommandHandler(Context context) {
        this.c = true;
        this.a = context;
        Transporter transporter = Transporter.get(context.getApplicationContext(), MODULE_MUSIC_CONSOLE);
        transporter.connectTransportService();
        transporter.addDataListener(this);
        transporter.addChannelListener(this);
        this.c = true;
    }

    private void a(String str) {
        Log.i(WebConstant.QueryParam.TYPE_MUSIC, "handle action from watch : " + str, new Object[0]);
        if (TextUtils.equals(str, "next")) {
            g();
            return;
        }
        if (TextUtils.equals(str, Command.PRE)) {
            h();
            return;
        }
        if (TextUtils.equals(str, "pause")) {
            d();
            return;
        }
        if (TextUtils.equals(str, Command.REQ_INFO)) {
            e();
            return;
        }
        if (TextUtils.equals(str, Command.STOP)) {
            i();
            return;
        }
        if (TextUtils.equals(str, Command.RESUME)) {
            f();
            return;
        }
        if (TextUtils.equals(str, Command.VOLUME_UP)) {
            j(true);
            return;
        }
        if (TextUtils.equals(str, Command.VOLUME_DOWN)) {
            j(false);
            return;
        }
        if (TextUtils.equals(str, "en")) {
            c();
            return;
        }
        if (TextUtils.equals(str, Command.DISABLE)) {
            b();
        } else if (TextUtils.equals(str, "sf")) {
            k(false);
        } else if (TextUtils.equals(str, Command.SCREEN_ON)) {
            k(true);
        }
    }

    private void b() {
        this.b = false;
    }

    private void c() {
        this.b = true;
    }

    private void e() {
    }

    public static CommandHandler getInstance(Context context) {
        if (d == null) {
            synchronized (CommandHandler.class) {
                if (d == null) {
                    d = new CommandHandler(context);
                }
            }
        }
        return d;
    }

    private void i() {
        MusicClientInterface.getInstance(this.a).sendMusicKeyEvent(86);
    }

    private void k(boolean z) {
        this.c = z;
        if (z) {
            MusicClientInterface.getInstance(this.a).drawTheBow();
        }
    }

    private void l(MusicAction musicAction, DataBundle dataBundle, Transporter.DataSendResultCallback dataSendResultCallback) {
        if (!this.b) {
            Log.i(WebConstant.QueryParam.TYPE_MUSIC, "sendAction send action disabled for required.", new Object[0]);
            return;
        }
        if (!this.c && !TextUtils.equals(musicAction.actionDesc, Command.PLAYER_IN) && !TextUtils.equals(musicAction.actionDesc, Command.PLAYER_GONE)) {
            Log.i(WebConstant.QueryParam.TYPE_MUSIC, "send action disabled for watchScreen Off.", new Object[0]);
            return;
        }
        Transporter transporter = Transporter.get(this.a, MODULE_MUSIC_CONSOLE);
        if (transporter != null) {
            transporter.send(musicAction.toString(), dataBundle, dataSendResultCallback);
        }
    }

    private void m(MusicAction musicAction, Transporter.DataSendResultCallback dataSendResultCallback) {
        l(musicAction, null, dataSendResultCallback);
    }

    public void d() {
        MusicClientInterface.getInstance(this.a).sendMusicKeyEvent(127);
    }

    public void doClearUp() {
        Transporter transporter = Transporter.get(this.a, MODULE_MUSIC_CONSOLE);
        if (transporter != null) {
            transporter.removeDataListener(this);
            transporter.disconnectTransportService();
        }
    }

    public void doInit() {
    }

    public void f() {
        MusicClientInterface.getInstance(this.a).sendMusicKeyEvent(126);
    }

    public void g() {
        MusicClientInterface.getInstance(this.a).sendMusicKeyEvent(87);
    }

    public void h() {
        MusicClientInterface.getInstance(this.a).sendMusicKeyEvent(88);
    }

    public void j(boolean z) {
        AudioManager audioManager = (AudioManager) this.a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int iMax = (int) Math.max(streamMaxVolume * 0.1f, 1.0f);
        audioManager.setStreamVolume(3, Math.min(streamMaxVolume, Math.max(0, z ? streamVolume + iMax : streamVolume - iMax)), 0);
        MusicClientInterface.getInstance(this.a).drawTheBow();
    }

    @Override // com.huami.watch.transport.Transporter.ChannelListener
    public void onChannelChanged(boolean z) {
        Transporter transporter;
        if (z) {
            AudioManager audioManager = (AudioManager) this.a.getSystemService("audio");
            Log.i(WebConstant.QueryParam.TYPE_MUSIC, "onChannelChanged and audio state =" + audioManager.isMusicActive(), new Object[0]);
            if (audioManager.isMusicActive() || (transporter = Transporter.get(this.a, MODULE_MUSIC_CONSOLE)) == null) {
                return;
            }
            transporter.send(new MusicAction(Command.PLAYER_GONE).toString(), null, null);
        }
    }

    @Override // com.huami.watch.transport.Transporter.DataListener
    public void onDataReceived(TransportDataItem transportDataItem) {
        a(transportDataItem.getAction());
    }

    public void sendAction(MusicAction musicAction) {
        if (TextUtils.isEmpty(musicAction.playerName)) {
            m(musicAction, null);
            return;
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("name", musicAction.playerName);
        l(musicAction, dataBundle, null);
    }

    public void syncStateToWatch(MediaInfo mediaInfo) {
        if (!this.b || !this.c) {
            Log.i(WebConstant.QueryParam.TYPE_MUSIC, "syncStateToWatch send action disabled for required.", new Object[0]);
            return;
        }
        Transporter transporter = Transporter.get(this.a, MODULE_MUSIC_CONSOLE);
        if (transporter == null) {
            return;
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putParcelable("data", mediaInfo);
        transporter.send(Command.NOW_INFO, dataBundle);
    }
}
