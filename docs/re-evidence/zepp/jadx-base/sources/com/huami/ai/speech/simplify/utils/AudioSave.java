package com.huami.ai.speech.simplify.utils;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/ai/speech/simplify/utils/AudioSave;", "", "", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "fileFormat", "", "createFile", "", "audioBytes", "saveAudio", "Ljava/io/File;", "Ljava/io/File;", "file", "<init>", "()V", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
public final class AudioSave {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private File file;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "创建存储音频文件出错！";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "用于存储录音的文件不存在！";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("开始写入文件出错：", this.a);
        }
    }

    private final String a() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:SS", Locale.CANADA).format(Calendar.getInstance().getTime());
    }

    public static /* synthetic */ void createFile$default(AudioSave audioSave, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "pcm";
        }
        audioSave.createFile(context, str);
    }

    public final void createFile(@NotNull Context context, @NotNull String fileFormat) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            File file = new File(FileUtils.getAppCacheDir(context), "voice_" + a() + '.' + fileFormat);
            file.createNewFile();
            Unit unit = Unit.INSTANCE;
            this.file = file;
            objM3845constructorimpl = Result.m3845constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            HMLog.error$default("speech", null, null, a.a, 6, null);
        }
    }

    public final void saveAudio(@NotNull byte[] audioBytes) throws IOException {
        Object objM3845constructorimpl;
        FileOutputStream fileOutputStream;
        File file = this.file;
        if (file != null) {
            boolean z = false;
            if (file != null && file.exists()) {
                z = true;
            }
            if (z) {
                FileOutputStream fileOutputStream2 = null;
                try {
                    Result.Companion companion = Result.Companion;
                    fileOutputStream = new FileOutputStream(this.file, true);
                    try {
                        fileOutputStream.write(audioBytes);
                        fileOutputStream.close();
                        objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream2 = fileOutputStream;
                        Result.Companion companion2 = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                        fileOutputStream = fileOutputStream2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    HMLog.error$default("speech", null, null, new c(thM3848exceptionOrNullimpl), 6, null);
                    if (fileOutputStream == null) {
                        return;
                    }
                    fileOutputStream.close();
                    return;
                }
                return;
            }
        }
        HMLog.error$default("speech", null, null, b.a, 6, null);
    }
}
