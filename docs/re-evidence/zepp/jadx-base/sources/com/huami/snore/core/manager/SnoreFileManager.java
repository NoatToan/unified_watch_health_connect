package com.huami.snore.core.manager;

import android.content.Context;
import android.os.Environment;
import com.huami.snore.core.db.VoiceRecorderDB;
import com.huami.snore.core.domain.RecorderConfig;
import com.huami.snore.core.dto.VoiceType;
import com.huami.tools.analytics.DbUtils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/snore/core/manager/SnoreFileManager;", "", "<init>", "()V", "Companion", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class SnoreFileManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SimpleDateFormat a = new SimpleDateFormat("yyyyMMddHHmmss");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bJ\"\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004J\u001a\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0018\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u0017R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/snore/core/manager/SnoreFileManager$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "a", "getStoragePath", "getStorageCachePath", "Lcom/huami/snore/core/dto/VoiceType;", "type", "getVoiceFilePath", "Ljava/util/Date;", "date", "getFileNameByTime", "", "deleteAllAudioFile", "filePath", "deleteFile", "Ljava/io/RandomAccessFile;", "writer", "Lcom/huami/snore/core/domain/RecorderConfig;", "recordProperty", "writeWavHeader", "", "payloadSize", "writeWavEnd", "Ljava/text/SimpleDateFormat;", "dfm", "Ljava/text/SimpleDateFormat;", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.snore.core.manager.SnoreFileManager$Companion$deleteAllAudioFile$1", f = "SnoreFileManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Context b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                VoiceRecorderDB.INSTANCE.init(this.b.getApplicationContext()).clean();
                Companion companion = SnoreFileManager.INSTANCE;
                if (new File(companion.a(this.b)).exists()) {
                    e.deleteRecursively(new File(companion.a(this.b)));
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.snore.core.manager.SnoreFileManager$Companion$deleteFile$1", f = "SnoreFileManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                new File(this.b).delete();
                return Unit.INSTANCE;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String a(Context context) {
            return getStoragePath(context) + "/snore_audio";
        }

        public final void deleteAllAudioFile(@NotNull Context context) {
            kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(context, null), 2, null);
        }

        public final void deleteFile(@NotNull String filePath) {
            if (new File(filePath).exists()) {
                kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new b(filePath, null), 2, null);
            }
        }

        @NotNull
        public final String getFileNameByTime(@Nullable Context context, @NotNull VoiceType type, @Nullable Date date) {
            Calendar calendar = Calendar.getInstance(Locale.getDefault());
            calendar.setTime(date);
            return a(context) + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + type.getType() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + calendar.get(1) + (calendar.get(2) + 1) + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + SnoreFileManager.a.format(date) + ".wav";
        }

        @NotNull
        public final String getStorageCachePath(@Nullable Context context) {
            File cacheDir;
            String absolutePath;
            File externalCacheDir;
            if (Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted")) {
                if (context == null || (externalCacheDir = context.getExternalCacheDir()) == null || (absolutePath = externalCacheDir.getAbsolutePath()) == null) {
                    return "";
                }
            } else if (context == null || (cacheDir = context.getCacheDir()) == null || (absolutePath = cacheDir.getAbsolutePath()) == null) {
                return "";
            }
            return absolutePath;
        }

        @NotNull
        public final String getStoragePath(@Nullable Context context) {
            File filesDir;
            String absolutePath;
            File externalFilesDir;
            if (Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted")) {
                if (context == null || (externalFilesDir = context.getExternalFilesDir("")) == null || (absolutePath = externalFilesDir.getAbsolutePath()) == null) {
                    return "";
                }
            } else if (context == null || (filesDir = context.getFilesDir()) == null || (absolutePath = filesDir.getAbsolutePath()) == null) {
                return "";
            }
            return absolutePath;
        }

        @NotNull
        public final String getVoiceFilePath(@Nullable Context context, @NotNull VoiceType type) {
            return a(context) + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + type.getType() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + Calendar.getInstance().get(1) + (Calendar.getInstance().get(2) + 1) + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + SnoreFileManager.a.format(new Date()) + ".wav";
        }

        public final void writeWavEnd(@Nullable RandomAccessFile writer, int payloadSize) {
            if (writer == null) {
                return;
            }
            writer.seek(4L);
            writer.writeInt(Integer.reverseBytes(payloadSize + 36));
            writer.seek(40L);
            writer.writeInt(Integer.reverseBytes(payloadSize));
        }

        public final void writeWavHeader(@Nullable RandomAccessFile writer, @Nullable RecorderConfig recordProperty) {
            if (recordProperty == null || writer == null) {
                return;
            }
            writer.setLength(0L);
            writer.writeBytes("RIFF");
            writer.writeInt(0);
            writer.writeBytes("WAVE");
            writer.writeBytes("fmt ");
            writer.writeInt(Integer.reverseBytes(16));
            writer.writeShort(Short.reverseBytes((short) 1));
            writer.writeShort(Short.reverseBytes((short) recordProperty.getChannels()));
            writer.writeInt(Integer.reverseBytes(recordProperty.getSampleRate()));
            writer.writeInt(Integer.reverseBytes(((recordProperty.getSampleRate() * recordProperty.getChannels()) * recordProperty.getBitsPerSample()) / 8));
            writer.writeShort(Short.reverseBytes((short) ((recordProperty.getChannels() * recordProperty.getBitsPerSample()) / 8)));
            writer.writeShort(Short.reverseBytes((short) recordProperty.getBitsPerSample()));
            writer.writeBytes("data");
            writer.writeInt(0);
        }
    }
}
