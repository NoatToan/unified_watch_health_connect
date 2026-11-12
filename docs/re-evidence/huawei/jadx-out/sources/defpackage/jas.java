package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.manager.voice.constructor.IVoiceEngine;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.text.Normalizer;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.zip.GZIPInputStream;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes10.dex */
public class jas implements IVoiceEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AudioManager f38311a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f38313c;
    private MediaPlayer k;
    private boolean h = false;
    private HashMap<Integer, Integer> f = new HashMap<>(16);
    private HandlerThread g = null;
    private Handler j = null;
    private ExtendHandler d = null;
    private Handler i = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediaPlayer.OnCompletionListener f38312b = null;
    private boolean n = true;
    private AudioManager.OnAudioFocusChangeListener e = new AudioManager.OnAudioFocusChangeListener() { // from class: jas.5
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i == -3) {
                LogUtil.a("Track_MediaPlayerVoiceEngine", "AudioFocus: received AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK");
                return;
            }
            if (i == -2) {
                LogUtil.a("Track_MediaPlayerVoiceEngine", "AudioFocus: received AUDIOFOCUS_LOSS_TRANSIENT");
                return;
            }
            if (i == -1) {
                LogUtil.a("Track_MediaPlayerVoiceEngine", "AudioFocus: received AUDIOFOCUS_LOSS");
                jas.this.a();
            } else {
                if (i != 1) {
                    return;
                }
                LogUtil.a("Track_MediaPlayerVoiceEngine", "AudioFocus: received AUDIOFOCUS_GAIN");
            }
        }
    };

    public jas(Context context, Map<Integer, Integer> map) {
        LogUtil.a("Track_MediaPlayerVoiceEngine", "MediaPlayerVoiceEngine", " START");
        if (context == null) {
            throw new RuntimeException("MediaPlayerVoiceEngine invalid params in constructor");
        }
        this.f38313c = context;
        c(map);
        c();
    }

    public void e() {
        LogUtil.a("Track_MediaPlayerVoiceEngine", "stopVoice");
        if (this.k != null) {
            try {
                LogUtil.a("Track_MediaPlayerVoiceEngine", "stopVoice() stop and release mediaplayer");
                this.k.stop();
                this.k.release();
                this.k = null;
            } catch (IllegalStateException unused) {
                LogUtil.e("Track_MediaPlayerVoiceEngine", "IllegalStateException during onDestroy");
            }
        }
        j();
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.IVoiceEngine
    public void stopVoice() {
        if (this.d != null) {
            Message message = new Message();
            message.what = 102;
            this.d.sendMessage(message);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.IVoiceEngine
    public void playVoice(Object obj, boolean z) {
        boolean z2 = obj instanceof List;
        if (!z2 && !(obj instanceof String)) {
            LogUtil.e("Track_MediaPlayerVoiceEngine", "music", " playVoice() content is not List<Integer>!");
            return;
        }
        if (d() == 0) {
            LogUtil.e("Track_MediaPlayerVoiceEngine", "MyThread run() request is AudioManager.AUDIOFOCUS_REQUEST_FAILED");
            return;
        }
        j();
        if (!this.h) {
            LogUtil.a("Track_MediaPlayerVoiceEngine", "music", " onPlaySpeak() isFinishedLoad is false!");
            if (z2) {
                d(obj, 1000L);
                return;
            } else {
                e((String) obj);
                return;
            }
        }
        if (z) {
            if (z2) {
                d(obj, pqj.b().c() ? 200L : 0L);
                return;
            } else {
                e((String) obj);
                return;
            }
        }
        if (z2) {
            d(obj);
        } else {
            e((String) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final Object obj) {
        if (!this.h) {
            LogUtil.e("Track_MediaPlayerVoiceEngine", "playVoice() isFinishedLoad is false!");
        } else {
            d(new Runnable() { // from class: jas.2
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    LogUtil.d("Track_MediaPlayerVoiceEngine", "MyThread run() enter : ", Integer.valueOf(hashCode()));
                    if (jas.this.d() == 0) {
                        LogUtil.e("Track_MediaPlayerVoiceEngine", "MyThread run() request is AudioManager.AUDIOFOCUS_REQUEST_FAILED");
                        return;
                    }
                    LogUtil.a("Track_MediaPlayerVoiceEngine", "MyThread run() speakTexts : ", obj);
                    StringBuffer stringBuffer = new StringBuffer(16);
                    stringBuffer.append(jas.this.f38313c.getExternalFilesDir("Sound")).append(File.separator).append("sound.mp3");
                    String string = stringBuffer.toString();
                    try {
                        jas.this.e(obj);
                        if (new File(string).exists()) {
                            jas.this.e(string);
                            LogUtil.d("Track_MediaPlayerVoiceEngine", "MyThread run() end : ", Integer.valueOf(hashCode()));
                        }
                    } catch (IOException unused) {
                        LogUtil.e("Track_MediaPlayerVoiceEngine", "playVoice PorcessFused()");
                    }
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.IVoiceEngine
    public void destroy() {
        stopVoice();
        f();
        LogUtil.a("Track_MediaPlayerVoiceEngine", "destroy()");
    }

    private void c(final Map<Integer, Integer> map) {
        if (map == null || map.size() == 0) {
            LogUtil.e("Track_MediaPlayerVoiceEngine", "music", " initSoundPool() voiceResource is null!");
            return;
        }
        Object systemService = this.f38313c.getSystemService("audio");
        if (systemService instanceof AudioManager) {
            f38311a = (AudioManager) systemService;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: jas.4
            @Override // java.lang.Runnable
            public void run() {
                for (Map.Entry entry : map.entrySet()) {
                    jas.this.f.put((Integer) entry.getKey(), (Integer) entry.getValue());
                }
                jas.this.h = true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final Object obj, final long j) {
        this.i.postDelayed(new Runnable() { // from class: jas.1
            @Override // java.lang.Runnable
            public void run() {
                if (jas.this.h) {
                    jas.this.d(obj);
                } else {
                    jas.this.d(obj, j);
                }
            }
        }, j);
    }

    private void j() {
        ExtendHandler extendHandler = this.d;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        int i = e(this.f38313c) == 0 ? 3 : 2;
        AudioManager audioManager = f38311a;
        if (audioManager == null) {
            ReleaseLogUtil.a("Track_MediaPlayerVoiceEngine", "mAudioManager == null");
            return 0;
        }
        int iRequestAudioFocus = audioManager.requestAudioFocus(this.e, 3, i);
        ReleaseLogUtil.d("Track_MediaPlayerVoiceEngine", "musicFocus = ", Integer.valueOf(iRequestAudioFocus));
        return iRequestAudioFocus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b() {
        if (f38311a == null || jau.c().a() || !this.n) {
            return 0;
        }
        return f38311a.abandonAudioFocus(this.e);
    }

    private int e(Context context) {
        if (context == null) {
            LogUtil.e("Track_MediaPlayerVoiceEngine", "acquireSportMusicControlType context is null");
            return 0;
        }
        return CommonUtil.e(SharedPreferenceManager.e(context, Integer.toString(20002), "sport_music_control_type"), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.i.post(new Runnable(this) { // from class: jas.3
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    private void c() {
        LogUtil.a("Track_MediaPlayerVoiceEngine", "startHandlerThread() enter");
        if (this.d == null) {
            this.d = HandlerCenter.b(new Handler.Callback() { // from class: jav
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return this.e.e(message);
                }
            }, "SoundVoiceHandlerThread");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean e(Message message) {
        LogUtil.a("Track_MediaPlayerVoiceEngine", "SoundHandler()  handleMessage");
        int i = message.what;
        if (i != 101) {
            if (i != 102) {
                return false;
            }
            e();
            return true;
        }
        if (!(message.obj instanceof String)) {
            return true;
        }
        b((String) message.obj);
        return true;
    }

    private void f() {
        LogUtil.a("Track_MediaPlayerVoiceEngine", "stopHandlerThread() enter");
        ExtendHandler extendHandler = this.d;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
            this.d.quit(false);
            this.d = null;
        }
    }

    private void d(Runnable runnable) {
        ExtendHandler extendHandler = this.d;
        if (extendHandler != null) {
            extendHandler.postTask(runnable);
        } else {
            LogUtil.a("Track_MediaPlayerVoiceEngine", "postRunnableToHandlerThread() mHandler is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        if (this.d != null) {
            Message message = new Message();
            message.what = 101;
            message.obj = str;
            this.d.sendMessage(message);
        }
    }

    private void b(String str) {
        if (this.k == null) {
            this.k = new MediaPlayer();
        }
        this.k.reset();
        LogUtil.a("Track_MediaPlayerVoiceEngine", "playSound");
        try {
            String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFKC);
            if (this.f38313c == null || !strNormalize.contains("assert")) {
                this.k.setDataSource(strNormalize);
            } else {
                Object systemService = this.f38313c.getSystemService("audio");
                if (!(systemService instanceof AudioManager)) {
                    LogUtil.a("Track_MediaPlayerVoiceEngine", "playSound ", "object invalid type");
                    return;
                } else {
                    LogUtil.a("Track_MediaPlayerVoiceEngine", "playSound() voice volume", Integer.valueOf(((AudioManager) systemService).getStreamVolume(3)));
                    AssetFileDescriptor assetFileDescriptorOpenFd = this.f38313c.getAssets().openFd(strNormalize.replace("assert", ""));
                    this.k.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                }
            }
            this.k.prepare();
            this.k.start();
            this.k.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: jas.10
                @Override // android.media.MediaPlayer.OnCompletionListener
                public void onCompletion(MediaPlayer mediaPlayer) {
                    LogUtil.a("Track_MediaPlayerVoiceEngine", "playSound release");
                    jas.this.k.release();
                    jas.this.k = null;
                    if (jas.this.f38312b != null) {
                        jas.this.f38312b.onCompletion(mediaPlayer);
                    }
                    jas.this.b();
                }
            });
        } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException unused) {
            LogUtil.e("Track_MediaPlayerVoiceEngine", "playSound PorcessFused()");
            MediaPlayer mediaPlayer = this.k;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                this.k = null;
            }
            b();
            iyb.e(BaseApplication.getContext(), new Intent("ACTION_RESET_MEDIA_IDLE"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Object obj) throws Throwable {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(this.f38313c.getExternalFilesDir("Sound")).append(File.separator).append("sound.mp3");
        String string = stringBuffer.toString();
        File file = new File(string);
        if (file.exists() && !new File(string).delete()) {
            LogUtil.e("Track_MediaPlayerVoiceEngine", Integer.valueOf(R.string.IDS_motiontrack_show_tip_file_delete_failed));
        }
        Vector<InputStream> vector = new Vector<>();
        boolean z = false;
        try {
            if (!(obj instanceof List)) {
                LogUtil.e("Track_MediaPlayerVoiceEngine", "preFactories  not instanceof  List");
                return;
            }
            z = ((List) obj).get(0) instanceof Integer;
            if (z) {
                for (Integer num : (List) obj) {
                    if (this.f.get(num) == null) {
                        vector.add(this.f38313c.getResources().openRawResource(num.intValue()));
                    } else {
                        vector.add(this.f38313c.getResources().openRawResource(this.f.get(num).intValue()));
                    }
                }
            } else {
                vector = d((List<String>) obj);
            }
            b(file, vector, z);
        } catch (Resources.NotFoundException e) {
            e = e;
            LogUtil.e("Track_MediaPlayerVoiceEngine", e.getMessage());
        } catch (FileNotFoundException unused) {
            LogUtil.e("Track_MediaPlayerVoiceEngine", "file not found exception");
        } catch (IOException e2) {
            LogUtil.e("Track_MediaPlayerVoiceEngine", "mergeSoundFile() IOException: ", LogAnonymous.b(e2));
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
            LogUtil.e("Track_MediaPlayerVoiceEngine", e.getMessage());
        } catch (SecurityException e4) {
            e = e4;
            LogUtil.e("Track_MediaPlayerVoiceEngine", e.getMessage());
        }
    }

    private Vector d(List<String> list) throws IOException {
        Vector vector = new Vector();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("assert")) {
                    vector.add(this.f38313c.getAssets().open(str.replace("assert", "")));
                } else {
                    vector.add(new FileInputStream(str));
                }
            }
        }
        return vector;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00cb A[LOOP:4: B:47:0x00c5->B:49:0x00cb, LOOP_END] */
    private void b(File file, Vector<InputStream> vector, boolean z) throws Throwable {
        SequenceInputStream sequenceInputStream;
        FileOutputStream fileOutputStreamOpenOutputStream;
        Iterator<InputStream> it;
        Throwable th;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Enumeration<InputStream> enumerationElements = vector.elements();
        if (z) {
            Vector vector2 = new Vector(vector.size());
            while (enumerationElements.hasMoreElements()) {
                try {
                    vector2.add(new GZIPInputStream(enumerationElements.nextElement()));
                } catch (IOException e) {
                    ReleaseLogUtil.a("Track_MediaPlayerVoiceEngine", "extract gzip failed ", ExceptionUtils.c(e));
                }
            }
            enumerationElements = vector2.elements();
        }
        FileOutputStream fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        fileOutputStream = null;
        SequenceInputStream sequenceInputStream2 = null;
        try {
            sequenceInputStream = new SequenceInputStream(enumerationElements);
            try {
                fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = sequenceInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        } else {
                            fileOutputStreamOpenOutputStream.write(bArr, 0, i);
                        }
                    }
                    com.huawei.haf.common.os.FileUtils.a(fileOutputStreamOpenOutputStream);
                    com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
                    Iterator<InputStream> it2 = vector.iterator();
                    while (it2.hasNext()) {
                        com.huawei.haf.common.os.FileUtils.a(it2.next());
                    }
                } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException unused) {
                    fileOutputStream2 = fileOutputStreamOpenOutputStream;
                    fileOutputStreamOpenOutputStream = fileOutputStream2;
                    sequenceInputStream2 = sequenceInputStream;
                    try {
                        LogUtil.e("Track_MediaPlayerVoiceEngine", "writeToFile PorcessFused()");
                        com.huawei.haf.common.os.FileUtils.a(fileOutputStreamOpenOutputStream);
                        com.huawei.haf.common.os.FileUtils.a(sequenceInputStream2);
                        Iterator<InputStream> it3 = vector.iterator();
                        while (it3.hasNext()) {
                            com.huawei.haf.common.os.FileUtils.a(it3.next());
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sequenceInputStream = sequenceInputStream2;
                        fileOutputStream = fileOutputStreamOpenOutputStream;
                        th = th;
                        com.huawei.haf.common.os.FileUtils.a(fileOutputStream);
                        com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
                        it = vector.iterator();
                        while (it.hasNext()) {
                            com.huawei.haf.common.os.FileUtils.a(it.next());
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStreamOpenOutputStream;
                    th = th;
                    com.huawei.haf.common.os.FileUtils.a(fileOutputStream);
                    com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
                    it = vector.iterator();
                    while (it.hasNext()) {
                        com.huawei.haf.common.os.FileUtils.a(it.next());
                    }
                    throw th;
                }
            } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException unused2) {
            } catch (Throwable th4) {
                th = th4;
                th = th;
                com.huawei.haf.common.os.FileUtils.a(fileOutputStream);
                com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
                it = vector.iterator();
                while (it.hasNext()) {
                    com.huawei.haf.common.os.FileUtils.a(it.next());
                }
                throw th;
            }
        } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException unused3) {
            fileOutputStreamOpenOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            sequenceInputStream = null;
            com.huawei.haf.common.os.FileUtils.a(fileOutputStream);
            com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
            it = vector.iterator();
            while (it.hasNext()) {
                com.huawei.haf.common.os.FileUtils.a(it.next());
            }
            throw th;
        }
        LogUtil.a("Track_MediaPlayerVoiceEngine", "writeToFile end", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.IVoiceEngine
    public void registerVoicePlayCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f38312b = onCompletionListener;
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.IVoiceEngine
    public void unregisterVoicePlayCompletionListener() {
        this.f38312b = null;
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.IVoiceEngine
    public void setVoiceIntentBufferState(boolean z) {
        this.n = z;
    }
}
