package com.huami.snore.core.processor;

import android.content.Context;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.snore.core.domain.RecorderConfig;
import com.huami.snore.core.manager.CacheWrap;
import com.huami.snore.core.manager.SnoreDataManager;
import com.huami.snore.core.manager.SnoreFileManager;
import com.huami.snore.core.util.RecorderUtil;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.liulishuo.engzo.lingorecorder.utils.WrapBuffer;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001&B\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b$\u0010%J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010 \u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\"¨\u0006'"}, d2 = {"Lcom/huami/snore/core/processor/SnoreResultProcessImpl;", "Lcom/huami/snore/core/processor/ResultProcessApi;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "e", "", "action", "a", "g", "f", "b", "", HTTP.CONTENT_RANGE_BYTES, "", SessionDescription.p, "process", "result", "setVoiceAnalysisResult", "end", "release", "Lcom/huami/snore/core/domain/RecorderConfig;", "Lcom/huami/snore/core/domain/RecorderConfig;", "recordConfig", "Lcom/huami/snore/core/manager/CacheWrap;", "Lkotlin/Lazy;", "c", "()Lcom/huami/snore/core/manager/CacheWrap;", "mCache", "Lcom/huami/snore/core/processor/VoiceRecorderWrap;", GoogleApiAvailabilityLight.a, "()Lcom/huami/snore/core/processor/VoiceRecorderWrap;", "mVoiceRecorder", "Lcom/huami/snore/core/processor/VolumeResult;", "Lcom/huami/snore/core/processor/VolumeResult;", "lastSaveState", "<init>", "(Lcom/huami/snore/core/domain/RecorderConfig;)V", "Companion", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class SnoreResultProcessImpl implements ResultProcessApi {

    @NotNull
    public static final String DELETE_SOUND = "DeleteSound";

    @NotNull
    public static final String ERROR_END = "ErrorEnd";

    @NotNull
    public static final String FILE_END = "fileEnd";

    @NotNull
    public static final String FILE_HEADER = "FileStart";

    @NotNull
    public static final String WRITE_CONTENT = "WriteContent";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final RecorderConfig recordConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mCache = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mVoiceRecorder = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private VolumeResult lastSaveState = VolumeResult.NOSOUND;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/snore/core/manager/CacheWrap;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<CacheWrap> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CacheWrap invoke() {
            return new CacheWrap(0, RecorderUtil.INSTANCE.getWindowByteSize(SnoreResultProcessImpl.this.recordConfig), new LinkedBlockingQueue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/snore/core/processor/VoiceRecorderWrap;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<VoiceRecorderWrap> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VoiceRecorderWrap invoke() {
            return new VoiceRecorderWrap(null, null, null, 0L, false, 0L, null, 127, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "语音开始";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "中间语音";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "结束语音保存";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "错误";
        }
    }

    public SnoreResultProcessImpl(@Nullable RecorderConfig recorderConfig) {
        this.recordConfig = recorderConfig;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void a(Context context, String action) {
        switch (action.hashCode()) {
            case -855025217:
                if (action.equals(FILE_END)) {
                    g();
                    break;
                }
                break;
            case -467730502:
                if (action.equals(WRITE_CONTENT)) {
                    f();
                    this.lastSaveState = VolumeResult.SOUND;
                    break;
                }
                break;
            case 534826500:
                if (action.equals(DELETE_SOUND)) {
                    release();
                    SnoreFileManager.INSTANCE.deleteFile(d().getFilePath());
                    break;
                }
                break;
            case 676596774:
                if (action.equals(FILE_HEADER)) {
                    e(context);
                    SnoreFileManager.INSTANCE.writeWavHeader(d().getWriter(), this.recordConfig);
                    f();
                    this.lastSaveState = VolumeResult.SOUND;
                    break;
                }
                break;
            case 1460733395:
                if (action.equals(ERROR_END) && !d().isEnd()) {
                    g();
                }
                break;
        }
    }

    private final void b() {
        try {
            RandomAccessFile writer = d().getWriter();
            if (writer != null) {
                writer.close();
            }
            d().setWriter(null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final CacheWrap c() {
        return (CacheWrap) this.mCache.getValue();
    }

    private final VoiceRecorderWrap d() {
        return (VoiceRecorderWrap) this.mVoiceRecorder.getValue();
    }

    private final void e(Context context) {
        VoiceRecorderWrap voiceRecorderWrapD = d();
        voiceRecorderWrapD.init();
        voiceRecorderWrapD.setFilePath(SnoreFileManager.INSTANCE.getVoiceFilePath(context, voiceRecorderWrapD.getType()));
        voiceRecorderWrapD.newWrite();
    }

    private final void f() {
        Object obj = null;
        while (true) {
            Object objPoll = c().poll();
            if (objPoll == null) {
                objPoll = null;
            } else {
                obj = objPoll;
            }
            if (objPoll == null || !(obj instanceof WrapBuffer)) {
                return;
            }
            VoiceRecorderWrap voiceRecorderWrapD = d();
            voiceRecorderWrapD.setPayloadSize(voiceRecorderWrapD.getPayloadSize() + ((long) ((WrapBuffer) obj).getBytes().length));
            try {
                RandomAccessFile writer = d().getWriter();
                if (writer != null) {
                    writer.write(((WrapBuffer) obj).getBytes());
                }
            } catch (IOException unused) {
            }
        }
    }

    private final void g() {
        VoiceRecorderWrap voiceRecorderWrapD = d();
        voiceRecorderWrapD.setEnd(true);
        voiceRecorderWrapD.setDuration(voiceRecorderWrapD.getDurationInMills());
        if (d().checkValid()) {
            SnoreDataManager.instance.saveVoiceInfoToDb(d());
            SnoreFileManager.INSTANCE.writeWavEnd(d().getWriter(), (int) d().getPayloadSize());
        } else {
            new File(d().getFilePath()).delete();
        }
        this.lastSaveState = VolumeResult.NOSOUND;
    }

    @Override // com.huami.snore.core.processor.ResultProcessApi
    public void end(@Nullable Context context) {
        if (d().isEnd()) {
            return;
        }
        HMLog.i(SnoreMonitorProcessor.TAG, "关闭录音但是文件还没有写完", new Object[0]);
        a(context, FILE_END);
    }

    @Override // com.huami.snore.core.processor.ResultProcessApi
    public void process(@Nullable byte[] bytes, int length) throws InterruptedException {
        WrapBuffer wrapBuffer = new WrapBuffer();
        wrapBuffer.setBytes(Arrays.copyOf(bytes, (bytes == null ? null : Integer.valueOf(bytes.length)).intValue()));
        wrapBuffer.setSize(length);
        c().push(wrapBuffer, length);
    }

    @Override // com.huami.snore.core.processor.ResultProcessApi
    public void release() {
        b();
        c().clear();
    }

    @Override // com.huami.snore.core.processor.ResultProcessApi
    public void setVoiceAnalysisResult(@Nullable Context context, int result) {
        VolumeResult volumeResult = VolumeResult.SOUND;
        if (result == volumeResult.getResult() && this.lastSaveState == VolumeResult.NOSOUND) {
            a(context, FILE_HEADER);
            HMLog.verbose(SnoreMonitorProcessor.TAG, c.a);
            return;
        }
        if (this.lastSaveState == volumeResult && result == volumeResult.getResult()) {
            HMLog.verbose(SnoreMonitorProcessor.TAG, d.a);
            a(context, WRITE_CONTENT);
            return;
        }
        if (this.lastSaveState == volumeResult && result == VolumeResult.NOSOUND.getResult()) {
            HMLog.verbose(SnoreMonitorProcessor.TAG, e.a);
            a(context, FILE_END);
        } else if (result == VolumeResult.ERROR.getResult()) {
            HMLog.verbose(SnoreMonitorProcessor.TAG, f.a);
            a(context, ERROR_END);
        } else if (result == VolumeResult.DROP_SOUND.getResult()) {
            a(context, DELETE_SOUND);
        }
    }
}
