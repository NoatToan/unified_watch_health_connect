package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaPlayer;
import com.huawei.health.suggestion.ui.fitness.helper.MediaPlayCallBack;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.zip.GZIPInputStream;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes9.dex */
public class hkw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static MediaPlayCallBack f36858a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static MediaPlayer f36859c;
    private static ArrayList<Integer> d;

    public static void e(Context context, ArrayList<Integer> arrayList) throws Throwable {
        c();
        if (context == null) {
            LogUtil.j("Suggestion_VoicePlayHelper", "startMedia context is null");
            return;
        }
        String str = context.getExternalFilesDir("Sound") + File.separator + "sug_sound.mp3";
        try {
            b(context, arrayList, str);
            try {
                MediaPlayer mediaPlayer = new MediaPlayer();
                f36859c = mediaPlayer;
                mediaPlayer.setDataSource(str);
                f36859c.prepare();
                f36859c.start();
                f36859c.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: hkw.2
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public void onCompletion(MediaPlayer mediaPlayer2) {
                        if (mediaPlayer2 != null) {
                            mediaPlayer2.stop();
                            mediaPlayer2.release();
                        }
                        MediaPlayer unused = hkw.f36859c = null;
                    }
                });
            } catch (IOException e) {
                LogUtil.e("Suggestion_VoicePlayHelper", "startMedia ProcessFused()", LogAnonymous.b(e));
                MediaPlayer mediaPlayer2 = f36859c;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.release();
                    f36859c = null;
                }
            }
        } catch (IOException e2) {
            LogUtil.e("Suggestion_VoicePlayHelper", "startMedia ProcessFused()", LogAnonymous.b(e2));
        }
    }

    private static void b(Context context, ArrayList<Integer> arrayList, String str) throws Throwable {
        SequenceInputStream sequenceInputStream;
        if (context == null || njy.e(arrayList)) {
            LogUtil.j("Suggestion_VoicePlayHelper", "mergeSoundFile context or soundIdList is null ");
            return;
        }
        File file = new File(CommonUtil.e(str));
        try {
            try {
                sequenceInputStream = new SequenceInputStream(a(context, arrayList, str, file).elements());
                try {
                    String canonicalPath = file.getCanonicalPath();
                    if (canonicalPath != null && canonicalPath.equals(CommonUtil.e(canonicalPath))) {
                        FileOutputStream fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file);
                        byte[] bArr = new byte[1024];
                        while (sequenceInputStream.read(bArr) != -1) {
                            fileOutputStreamOpenOutputStream.write(bArr);
                        }
                        com.huawei.haf.common.os.FileUtils.a(fileOutputStreamOpenOutputStream);
                        com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
                        return;
                    }
                    LogUtil.j("Suggestion_VoicePlayHelper", "mergeSoundFile, file path not valid");
                    com.huawei.haf.common.os.FileUtils.a((Closeable) null);
                    com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
                } catch (IOException e) {
                    e = e;
                    LogUtil.e("Suggestion_VoicePlayHelper", "ProcessFused()", LogAnonymous.b(e));
                    com.huawei.haf.common.os.FileUtils.a((Closeable) null);
                    com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    LogUtil.e("Suggestion_VoicePlayHelper", "ProcessFused()", LogAnonymous.b(e));
                    com.huawei.haf.common.os.FileUtils.a((Closeable) null);
                    com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
                } catch (IllegalStateException e3) {
                    e = e3;
                    LogUtil.e("Suggestion_VoicePlayHelper", "ProcessFused()", LogAnonymous.b(e));
                    com.huawei.haf.common.os.FileUtils.a((Closeable) null);
                    com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
                } catch (SecurityException e4) {
                    e = e4;
                    LogUtil.e("Suggestion_VoicePlayHelper", "ProcessFused()", LogAnonymous.b(e));
                    com.huawei.haf.common.os.FileUtils.a((Closeable) null);
                    com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
                }
            } catch (Throwable th) {
                th = th;
                com.huawei.haf.common.os.FileUtils.a((Closeable) null);
                com.huawei.haf.common.os.FileUtils.a((Closeable) null);
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            sequenceInputStream = null;
            LogUtil.e("Suggestion_VoicePlayHelper", "ProcessFused()", LogAnonymous.b(e));
            com.huawei.haf.common.os.FileUtils.a((Closeable) null);
            com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
        } catch (IllegalArgumentException e6) {
            e = e6;
            sequenceInputStream = null;
            LogUtil.e("Suggestion_VoicePlayHelper", "ProcessFused()", LogAnonymous.b(e));
            com.huawei.haf.common.os.FileUtils.a((Closeable) null);
            com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
        } catch (IllegalStateException e7) {
            e = e7;
            sequenceInputStream = null;
            LogUtil.e("Suggestion_VoicePlayHelper", "ProcessFused()", LogAnonymous.b(e));
            com.huawei.haf.common.os.FileUtils.a((Closeable) null);
            com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
        } catch (SecurityException e8) {
            e = e8;
            sequenceInputStream = null;
            LogUtil.e("Suggestion_VoicePlayHelper", "ProcessFused()", LogAnonymous.b(e));
            com.huawei.haf.common.os.FileUtils.a((Closeable) null);
            com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
        } catch (Throwable th2) {
            th = th2;
            com.huawei.haf.common.os.FileUtils.a((Closeable) null);
            com.huawei.haf.common.os.FileUtils.a((Closeable) null);
            throw th;
        }
    }

    private static Vector<InputStream> a(Context context, ArrayList<Integer> arrayList, String str, File file) {
        if (file.exists() && !new File(str).delete()) {
            LogUtil.e("Suggestion_VoicePlayHelper", "file can't delete");
        }
        Vector<InputStream> vector = new Vector<>();
        try {
            Iterator<Integer> it = arrayList.iterator();
            while (it.hasNext()) {
                vector.add(new GZIPInputStream(context.getResources().openRawResource(it.next().intValue())));
            }
        } catch (Resources.NotFoundException | IOException e) {
            LogUtil.e("Suggestion_VoicePlayHelper", "mergeSoundFile() exception = ", e.getMessage());
        }
        return vector;
    }

    private static void c() {
        MediaPlayer mediaPlayer = f36859c;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        f36859c.stop();
        f36859c = null;
        if (d != null) {
            MediaPlayCallBack mediaPlayCallBack = f36858a;
            if (mediaPlayCallBack != null) {
                mediaPlayCallBack.mediaPlayCallBack(1, 2, -1);
                f36858a = null;
            }
            d = null;
        }
        MediaPlayCallBack mediaPlayCallBack2 = f36858a;
        if (mediaPlayCallBack2 != null) {
            mediaPlayCallBack2.mediaPlayCallBack(0, 2, -1);
        }
    }
}
