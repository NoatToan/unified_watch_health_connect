package com.huawei.health.suggestion.ui.fitness.helper;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.text.TextUtils;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.suggestion.h5pro.AudioConstant;
import com.huawei.health.suggestion.ui.fitness.helper.inter.BeatAudioInterface;
import com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import defpackage.pqj;
import defpackage.pqk;
import defpackage.xkf;
import health.compact.a.LogAnonymous;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes9.dex */
public class BeatHelper extends MediaHelper implements BeatAudioInterface, MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f9300c;
    private boolean f;
    private AtomicBoolean g;

    public BeatHelper(Context context) {
        super(context);
        this.f9300c = new CopyOnWriteArrayList();
        this.g = new AtomicBoolean(true);
        b(false);
        this.e.setAudioStreamType(3);
        this.e.setLooping(false);
        this.e.setOnCompletionListener(this);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.BeatAudioInterface
    public BeatAudioInterface resetBeatNum(int i) {
        boolean z = true;
        if (i < 1 || i > 10000) {
            LogUtil.j("Suggestion_BeatHelper", "resetBeatNum input params is invalid.");
            return this;
        }
        this.f9299b = i;
        String[] strArrA = a(i);
        for (String str : strArrA) {
            if (TextUtils.isEmpty(str)) {
                z = false;
                break;
            }
        }
        if (this.e == null || !z) {
            LogUtil.j("Suggestion_BeatHelper", "resetBeatNum() mPlayer or beatData is null");
        } else {
            setSdSources(strArrA);
        }
        b(-1);
        return this;
    }

    private String[] a(int i) {
        String[] strArr = new String[i];
        if (e()) {
            d(strArr);
            return strArr;
        }
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = i2 > 8 ? xkf.b("B0" + (i2 + 1), this.f9338a, this.d, AudioConstant.AUDIO) : xkf.b("B00" + (i2 + 1), this.f9338a, this.d, AudioConstant.AUDIO);
        }
        return strArr;
    }

    private void d(String[] strArr) {
        int i = 0;
        while (i < strArr.length) {
            pqk pqkVar = new pqk();
            int i2 = i + 1;
            pqkVar.e(Integer.valueOf(i2));
            List<String> scenarioAudioPaths = pqj.b().getScenarioAudioPaths(FitnessRunAudioScenarioId.NUMBER_X.getId(), pqkVar);
            if (njy.e(scenarioAudioPaths)) {
                LogUtil.j("Suggestion_BeatHelper", "constructNumPath() scenarioAudioPaths is null");
                return;
            }
            LogUtil.a("Suggestion_BeatHelper", "constructNumPath() scenarioAudioPaths:", scenarioAudioPaths.toString());
            if (scenarioAudioPaths.size() == 1) {
                strArr[i] = scenarioAudioPaths.get(0);
            } else {
                strArr[i] = e(i, scenarioAudioPaths);
            }
            i = i2;
        }
        LogUtil.a("Suggestion_BeatHelper", "constructNumPath() numPath.size():", Integer.valueOf(strArr.length), " numPath:", Arrays.toString(strArr));
    }

    private String e(int i, List<String> list) throws Throwable {
        StringBuilder sb = new StringBuilder(16);
        try {
            sb.append(BaseApplication.getContext().getFilesDir().getCanonicalPath());
            sb.append(File.separator);
            sb.append("MergeSound");
            sb.append(File.separator);
            sb.append(i);
            sb.append(File.separator);
            sb.append("sound.mp3");
            b(sb, list);
        } catch (IOException e) {
            LogUtil.e("Suggestion_BeatHelper", "getMergeSoundPath exception", LogAnonymous.b(e));
        }
        return sb.toString();
    }

    private void b(StringBuilder sb, List<String> list) throws Throwable {
        String string = sb.toString();
        File file = new File(string);
        if (file.exists() && !new File(string).delete()) {
            LogUtil.e("Suggestion_BeatHelper", "file delete failed");
        }
        Vector<InputStream> vector = new Vector<>();
        try {
            vector = d(list);
        } catch (Resources.NotFoundException e) {
            e = e;
            LogUtil.e("Suggestion_BeatHelper", LogAnonymous.b(e));
        } catch (FileNotFoundException unused) {
            LogUtil.e("Suggestion_BeatHelper", "file not found exception");
        } catch (IOException e2) {
            LogUtil.e("Suggestion_BeatHelper", "mergeSoundFile() IOException: ", LogAnonymous.b(e2));
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
            LogUtil.e("Suggestion_BeatHelper", LogAnonymous.b(e));
        } catch (SecurityException e4) {
            e = e4;
            LogUtil.e("Suggestion_BeatHelper", LogAnonymous.b(e));
        }
        c(file, vector);
    }

    private Vector<InputStream> d(List<String> list) throws IOException {
        Vector<InputStream> vector = new Vector<>();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                vector.add(new FileInputStream(str));
            }
        }
        return vector;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091 A[LOOP:3: B:33:0x008b->B:35:0x0091, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.Vector, java.util.Vector<java.io.InputStream>] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.Vector] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.io.Closeable, java.io.FileOutputStream] */
    private void c(File file, Vector<InputStream> vector) throws Throwable {
        SequenceInputStream sequenceInputStream;
        ?? r10;
        Iterator it;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ?? r5 = 0;
        r5 = 0;
        r5 = 0;
        ?? r6 = 0;
        try {
            try {
                sequenceInputStream = new SequenceInputStream(vector.elements());
                try {
                    ?? OpenOutputStream = FileUtils.openOutputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            r5 = sequenceInputStream.read(bArr);
                            if (r5 == -1) {
                                break;
                            } else {
                                OpenOutputStream.write(bArr, 0, r5);
                            }
                        }
                        com.huawei.haf.common.os.FileUtils.a((Closeable) OpenOutputStream);
                        com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
                        Iterator it2 = vector.iterator();
                        while (it2.hasNext()) {
                            com.huawei.haf.common.os.FileUtils.a((InputStream) it2.next());
                        }
                    } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException unused) {
                        r5 = OpenOutputStream;
                        LogUtil.e("Suggestion_BeatHelper", "writeToFile PorcessFused()");
                        com.huawei.haf.common.os.FileUtils.a((Closeable) r5);
                        com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
                        Iterator it3 = vector.iterator();
                        while (it3.hasNext()) {
                            com.huawei.haf.common.os.FileUtils.a((InputStream) it3.next());
                        }
                    } catch (Throwable th) {
                        th = th;
                        r5 = OpenOutputStream;
                        th = th;
                        r6 = r5;
                        r10 = vector;
                        com.huawei.haf.common.os.FileUtils.a((Closeable) r6);
                        com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
                        it = r10.iterator();
                        while (it.hasNext()) {
                            com.huawei.haf.common.os.FileUtils.a((InputStream) it.next());
                        }
                        throw th;
                    }
                } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException unused3) {
            sequenceInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            sequenceInputStream = null;
            r10 = vector;
            com.huawei.haf.common.os.FileUtils.a((Closeable) r6);
            com.huawei.haf.common.os.FileUtils.a(sequenceInputStream);
            it = r10.iterator();
            while (it.hasNext()) {
                com.huawei.haf.common.os.FileUtils.a((InputStream) it.next());
            }
            throw th;
        }
        vector = "writeToFile end";
        LogUtil.a("Suggestion_BeatHelper", "writeToFile end", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.BeatAudioInterface
    public void timer() {
        if (this.e != null) {
            setSdSources(xkf.b("D011", this.f9338a, this.d, AudioConstant.AUDIO));
            start();
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.BeatAudioInterface
    public void nextBeat() {
        this.f = false;
        if (this.e != null) {
            next();
        }
    }

    public BeatAudioInterface a() {
        if (this.e != null) {
            if (e()) {
                setSdSources(e(FitnessRunAudioScenarioId.HOLD_ON_FIVE_SECONDS));
            } else {
                setSdSources(xkf.b("E069", this.f9338a, this.d, AudioConstant.AUDIO));
            }
            start();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.MediaHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface release() {
        return super.release();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.BeatAudioInterface
    public BeatAudioInterface playBeatNum(int i) {
        this.f = false;
        if (this.e != null) {
            this.f = true;
            c(d(i));
            start();
        }
        return this;
    }

    private void x() {
        this.f9300c.clear();
        if (e()) {
            this.f9300c.add(e(FitnessRunAudioScenarioId.NUMBER_FIVE));
            this.f9300c.add(e(FitnessRunAudioScenarioId.NUMBER_FOUR));
            this.f9300c.add(e(FitnessRunAudioScenarioId.NUMBER_THREE));
            this.f9300c.add(e(FitnessRunAudioScenarioId.NUMBER_TWO));
            this.f9300c.add(e(FitnessRunAudioScenarioId.NUMBER_ONE));
            return;
        }
        this.f9300c.add(xkf.b("B005", this.f9338a, this.d, AudioConstant.AUDIO));
        this.f9300c.add(xkf.b("B004", this.f9338a, this.d, AudioConstant.AUDIO));
        this.f9300c.add(xkf.b("B003", this.f9338a, this.d, AudioConstant.AUDIO));
        this.f9300c.add(xkf.b("B002", this.f9338a, this.d, AudioConstant.AUDIO));
        this.f9300c.add(xkf.b("B001", this.f9338a, this.d, AudioConstant.AUDIO));
    }

    private String e(FitnessRunAudioScenarioId fitnessRunAudioScenarioId) {
        List<String> scenarioAudioPaths = pqj.b().getScenarioAudioPaths(fitnessRunAudioScenarioId.getId(), new pqk());
        if (njy.e(scenarioAudioPaths)) {
            return "";
        }
        return scenarioAudioPaths.get(0);
    }

    public void c() {
        this.f = false;
        c(this.f9300c);
        start();
    }

    public BeatAudioInterface b() {
        LogUtil.d("Suggestion_BeatHelper", "PAUSE");
        try {
            if (this.e != null && this.e.isPlaying()) {
                this.e.pause();
                this.g.set(true);
                return this;
            }
            LogUtil.j("Suggestion_BeatHelper", "pause fail, is still playing");
            this.g.set(false);
            return this;
        } catch (IllegalStateException e) {
            this.g.set(false);
            LogUtil.e("Suggestion_BeatHelper", "beatAudioPause fail -- ", LogAnonymous.b(e));
            return this;
        }
    }

    public BeatAudioInterface d() {
        LogUtil.d("Suggestion_BeatHelper", "Continue");
        try {
            if (this.e != null && this.g.get() && this.e.getCurrentPosition() < this.e.getDuration() * 0.65f) {
                this.e.start();
                return this;
            }
        } catch (IllegalStateException e) {
            LogUtil.e("Suggestion_BeatHelper", "beatAudioContinue fail -- ", LogAnonymous.b(e));
        }
        return this;
    }

    public void c(String str) {
        if (this.e != null) {
            if (e()) {
                t();
            } else {
                setSdSources(xkf.b(str, this.f9338a, this.d, AudioConstant.AUDIO));
                start();
            }
        }
    }

    private void t() {
        setSdSources(e(FitnessRunAudioScenarioId.ENCOURAGE));
        start();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f) {
            this.f = false;
            next();
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.MediaHelper
    public void b(String str) {
        super.b(str);
        x();
    }

    private boolean e() {
        boolean zB = pqj.b().b(BaseApplication.getContext(), SingleDailyMomentContent.COURSE_TYPE);
        LogUtil.a("Suggestion_BeatHelper", "isEnableCurLang() enableCurLang:", Boolean.valueOf(zB));
        return zB;
    }
}
