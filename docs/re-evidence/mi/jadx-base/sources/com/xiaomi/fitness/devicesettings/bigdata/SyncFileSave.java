package com.xiaomi.fitness.devicesettings.bigdata;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.common.utils.CRCUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.devicesettings.bigdata.SyncFileSave;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.util.RecorderSyncHelper;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import defpackage.hj2;
import defpackage.s7r;
import defpackage.vkf;
import defpackage.wkf;
import defpackage.xc6;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002QRB\t\b\u0002¢\u0006\u0004\bP\u0010\"J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0017\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010\"J\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010\"J\u0015\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\f¢\u0006\u0004\b*\u0010\"J\u001d\u0010.\u001a\u00020\f2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+¢\u0006\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00106R\u0016\u00108\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0016\u00109\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00106R\u0016\u0010:\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00106R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\"\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002040>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006S"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bigdata/SyncFileSave;", "", "", "dir", "", "checkRecordExist", "(Ljava/lang/String;)Z", "time", "newId", "Ljava/io/File;", "file", "id", "", "syncExistFileToRecorder", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V", "merge", "(Ljava/lang/String;)V", "", "data", "saveFile", "(Ljava/lang/String;[BLjava/lang/String;)V", "", "recordTime", "syncToRecorder", "(Ljava/lang/String;Ljava/lang/String;[BJLjava/lang/String;)V", "Lwkf$a;", "fileId", "askDeviceReceiveFileSuccess", "(Lwkf$a;)V", "Ljava/nio/ByteBuffer;", "byteBuffer", "receiverData", "([BLjava/nio/ByteBuffer;Ljava/lang/String;)V", "postDelayHandler", "()V", "removeDelayHandler", "getMediaFiles", "input", "formatDateTime", "(Ljava/lang/String;)Ljava/lang/String;", "getRecordTime", "(Ljava/lang/String;)J", "reset", "", "Lwkf;", "files", "setMediaFiles", "(Ljava/util/List;)V", "sTag", "Ljava/lang/String;", "sDelayTimeout", "J", "", "sHeadLength", "I", "sDataStartIndex", "mCurrentCount", "mTotalCount", "mTotalBytes", "Lcom/xiaomi/fitness/devicesettings/bigdata/Segment;", "mSegments", "Ljava/util/List;", "", "fileList", "Ljava/util/Map;", "Landroid/os/Handler;", "mHandler$delegate", "Lkotlin/Lazy;", "getMHandler", "()Landroid/os/Handler;", "mHandler", "Ljava/lang/Runnable;", "timeoutRunnable", "Ljava/lang/Runnable;", "Lcom/xiaomi/fitness/devicesettings/bigdata/SyncFileSave$MediaFileTimer;", "mediaFileTimer", "Lcom/xiaomi/fitness/devicesettings/bigdata/SyncFileSave$MediaFileTimer;", "Lcom/xiaomi/fitness/devicesettings/bigdata/SyncFileSave$ExistMediaFileTimer;", "existMediaFileTimer", "Lcom/xiaomi/fitness/devicesettings/bigdata/SyncFileSave$ExistMediaFileTimer;", "<init>", "MediaFileTimer", "ExistMediaFileTimer", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSyncFileSave.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncFileSave.kt\ncom/xiaomi/fitness/devicesettings/bigdata/SyncFileSave\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,511:1\n1#2:512\n1863#3,2:513\n17#4:515\n*S KotlinDebug\n*F\n+ 1 SyncFileSave.kt\ncom/xiaomi/fitness/devicesettings/bigdata/SyncFileSave\n*L\n490#1:513,2\n51#1:515\n*E\n"})
public final class SyncFileSave {
    private static int mCurrentCount = 0;
    private static int mTotalBytes = 0;
    private static int mTotalCount = 0;
    private static final int sDataStartIndex = 6;
    public static final long sDelayTimeout = 15000;
    private static final int sHeadLength = 5;

    @NotNull
    public static final String sTag = "SyncFileSave";

    @NotNull
    public static final SyncFileSave INSTANCE = new SyncFileSave();

    @NotNull
    private static final List<Segment> mSegments = new ArrayList();

    @NotNull
    private static Map<String, Integer> fileList = new LinkedHashMap();

    /* JADX INFO: renamed from: mHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ito
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SyncFileSave.mHandler_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Runnable timeoutRunnable = new Runnable() { // from class: com.xiaomi.fitness.devicesettings.bigdata.SyncFileSave$special$$inlined$Runnable$1
        @Override // java.lang.Runnable
        public final void run() {
            xc6.d("SyncFileSave receiverData timeoutRunnable");
            SyncFileSave.INSTANCE.reset();
        }
    };

    @NotNull
    private static final MediaFileTimer mediaFileTimer = new MediaFileTimer();

    @NotNull
    private static final ExistMediaFileTimer existMediaFileTimer = new ExistMediaFileTimer();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0002j\u0002`\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J.\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bigdata/SyncFileSave$ExistMediaFileTimer;", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Runnable;", "<init>", "()V", "newId", "", "dir", "id", "time", "file", "Ljava/io/File;", "num", "", "run", "", "setData", "reset", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ExistMediaFileTimer implements Runnable {

        @Nullable
        private File file;
        private int num;

        @NotNull
        private String newId = "";

        @NotNull
        private String dir = "";

        @NotNull
        private String id = "";

        @NotNull
        private String time = "";

        public final void reset() {
            this.num = 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.i(SyncFileSave.sTag, "ExistMediaFileTimer run " + this.num);
            int i = this.num;
            if (i >= 4) {
                this.num = 0;
                return;
            }
            this.num = i + 1;
            File file = this.file;
            if (file == null) {
                return;
            }
            SyncFileSave syncFileSave = SyncFileSave.INSTANCE;
            String str = this.time;
            String str2 = this.newId;
            Intrinsics.checkNotNull(file);
            syncFileSave.syncExistFileToRecorder(str, str2, file, this.dir, this.id);
        }

        public final void setData(@NotNull String time, @NotNull String newId, @NotNull File file, @NotNull String dir, @NotNull String id) {
            Intrinsics.checkNotNullParameter(time, "time");
            Intrinsics.checkNotNullParameter(newId, "newId");
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(dir, "dir");
            Intrinsics.checkNotNullParameter(id, "id");
            this.time = time;
            this.newId = newId;
            this.file = file;
            this.dir = dir;
            this.id = id;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0002j\u0002`\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bigdata/SyncFileSave$MediaFileTimer;", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Runnable;", "<init>", "()V", "newId", "", "dir", "bytes", "", "recordTime", "", "id", "num", "", "run", "", "setData", "setData$device_settings_chinaProductRelease", "reset", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaFileTimer implements Runnable {
        private int num;
        private long recordTime;

        @NotNull
        private String newId = "";

        @NotNull
        private String dir = "";

        @NotNull
        private byte[] bytes = new byte[0];

        @NotNull
        private String id = "";

        public final void reset() {
            this.num = 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.i(SyncFileSave.sTag, "MediaFileTimer run " + this.num);
            int i = this.num;
            if (i >= 4) {
                this.num = 0;
            } else {
                this.num = i + 1;
                SyncFileSave.INSTANCE.syncToRecorder(this.newId, this.dir, this.bytes, this.recordTime, this.id);
            }
        }

        public final void setData$device_settings_chinaProductRelease(@NotNull String newId, @NotNull String dir, @NotNull byte[] bytes, long recordTime, @NotNull String id) {
            Intrinsics.checkNotNullParameter(newId, "newId");
            Intrinsics.checkNotNullParameter(dir, "dir");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            Intrinsics.checkNotNullParameter(id, "id");
            this.newId = newId;
            this.dir = dir;
            this.bytes = bytes;
            this.recordTime = recordTime;
            this.id = id;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bigdata.SyncFileSave$syncToRecorder$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bigdata.SyncFileSave$syncToRecorder$1", f = "SyncFileSave.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $data;
        final /* synthetic */ String $dir;
        final /* synthetic */ int $duration;
        final /* synthetic */ String $id;
        final /* synthetic */ String $newId;
        final /* synthetic */ long $recordTime;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bigdata.SyncFileSave$syncToRecorder$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bigdata.SyncFileSave$syncToRecorder$1$1", f = "SyncFileSave.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $id;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04531(String str, Continuation<? super C04531> continuation) {
                super(2, continuation);
                this.$id = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04531(this.$id, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                wkf.a aVar = new wkf.a();
                aVar.c = this.$id;
                SyncFileSave.INSTANCE.askDeviceReceiveFileSuccess(aVar);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, byte[] bArr, long j, int i, String str3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$dir = str;
            this.$newId = str2;
            this.$data = bArr;
            this.$recordTime = j;
            this.$duration = i;
            this.$id = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$dir, this.$newId, this.$data, this.$recordTime, this.$duration, this.$id, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:47:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            FileOutputStream fileOutputStream;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir(this.$dir);
            if (externalFilesDir != null && !externalFilesDir.exists()) {
                externalFilesDir.mkdirs();
            }
            File file = new File(externalFilesDir, this.$newId);
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                    try {
                        fileOutputStream3.write(this.$data);
                        xc6.d("saveFile success fileSize:" + file.length() + " " + this.$data.length);
                        fileOutputStream3.close();
                    } catch (Exception e) {
                        fileOutputStream = fileOutputStream3;
                        e = e;
                        try {
                            Logger.i(SyncFileSave.sTag, "saveFile FileNotFoundException " + file.getPath());
                            e.printStackTrace();
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            RecorderSyncHelper.INSTANCE.insertRecorderDb(file.getPath(), this.$dir, this.$recordTime, this.$duration);
                            AnyExtKt.main$default(null, new C04531(this.$id, null), 1, null);
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream2 = fileOutputStream;
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2 = fileOutputStream3;
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } catch (Exception e4) {
                e = e4;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
            RecorderSyncHelper.INSTANCE.insertRecorderDb(file.getPath(), this.$dir, this.$recordTime, this.$duration);
            AnyExtKt.main$default(null, new C04531(this.$id, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private SyncFileSave() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void askDeviceReceiveFileSuccess(wkf.a fileId) {
        xc6.b("AudioRecordViewModel askDeviceReceiveFileSuccess " + fileId);
        s7r s7rVar = new s7r();
        s7rVar.e = 18;
        s7rVar.f = 19;
        vkf vkfVar = new vkf();
        vkfVar.y(fileId);
        s7rVar.Y(vkfVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 12, null);
    }

    private final boolean checkRecordExist(String dir) {
        String strSubstring;
        List<Segment> list = CollectionsKt___CollectionsKt.toList(mSegments);
        Iterator it = list.iterator();
        int dataLength = 0;
        while (it.hasNext()) {
            dataLength += ((Segment) it.next()).getDataLength();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(dataLength);
        for (Segment segment : list) {
            Intrinsics.checkNotNull(byteBufferAllocate);
            segment.fillBuffer(byteBufferAllocate);
        }
        byteBufferAllocate.clear();
        int i = byteBufferAllocate.get();
        byte[] bArr = new byte[i];
        byteBufferAllocate.get(bArr);
        Logger.i(sTag, "checkDataId idLength=" + i + ",id byte[]**" + hj2.a(bArr));
        try {
            Charset charsetDefaultCharset = Charset.defaultCharset();
            Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset(...)");
            String str = new String(bArr, charsetDefaultCharset);
            Logger.i(sTag, "checkDataId id=" + str);
            if (str.length() > 0) {
                if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "/", false, 2, (Object) null)) {
                    strSubstring = str.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) str, "/", 0, false, 6, (Object) null) + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                } else {
                    strSubstring = str;
                }
                int iIndexOf$default = StringsKt__StringsKt.contains$default((CharSequence) strSubstring, (CharSequence) "_(", false, 2, (Object) null) ? StringsKt__StringsKt.indexOf$default((CharSequence) strSubstring, "_(", 0, false, 6, (Object) null) : StringsKt__StringsKt.contains$default((CharSequence) strSubstring, (CharSequence) ".", false, 2, (Object) null) ? StringsKt__StringsKt.lastIndexOf$default((CharSequence) strSubstring, ".", 0, false, 6, (Object) null) : strSubstring.length();
                String strSubstring2 = strSubstring.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                try {
                    String dateTime = formatDateTime(strSubstring2);
                    String strSubstring3 = strSubstring.substring(iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                    String strReplace$default = StringsKt__StringsJVMKt.replace$default(dateTime + strSubstring3, RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR, "", false, 4, (Object) null);
                    File file = new File(ApplicationExtKt.getApplication().getExternalFilesDir(dir), strReplace$default);
                    Logger.i(sTag, "check file exist " + file.getPath());
                    if (file.exists()) {
                        syncExistFileToRecorder(strSubstring2, strReplace$default, file, dir, str);
                        return true;
                    }
                } catch (UnsupportedEncodingException e) {
                    e = e;
                    Logger.i(sTag, "UnsupportedEncodingException");
                    e.printStackTrace();
                }
            }
        } catch (UnsupportedEncodingException e2) {
            e = e2;
        }
        return false;
    }

    private final Handler getMHandler() {
        return (Handler) mHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler mHandler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    @RequiresApi(31)
    private final void merge(String dir) {
        String str;
        Logger.i(sTag, "merge");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(mTotalBytes);
        for (Segment segment : mSegments) {
            Intrinsics.checkNotNull(byteBufferAllocate);
            segment.fillBuffer(byteBufferAllocate);
        }
        int i = mTotalBytes;
        byte[] bArr = new byte[i - 4];
        byteBufferAllocate.clear();
        byteBufferAllocate.get(bArr);
        byte[] bArr2 = new byte[4];
        byteBufferAllocate.get(bArr2);
        String str2 = null;
        if (!ByteUtil.equals$default(bArr2, CRCUtil.CRC32(bArr), 0, 4, null)) {
            Logger.i(sTag, "check crc32 failed!!! ");
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str3 = String.format("received %d bytes", Arrays.copyOf(new Object[]{Integer.valueOf(mTotalBytes)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        Logger.i(sTag, str3);
        byteBufferAllocate.clear();
        int i2 = byteBufferAllocate.get();
        byte[] bArr3 = new byte[i2];
        byteBufferAllocate.get(bArr3);
        Logger.i(sTag, "idLength=" + i2 + ",id byte[]**" + hj2.a(bArr3));
        try {
            Charset charsetDefaultCharset = Charset.defaultCharset();
            Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset(...)");
            str = new String(bArr3, charsetDefaultCharset);
            try {
                Logger.i(sTag, "id=" + str);
            } catch (UnsupportedEncodingException e) {
                e = e;
                str2 = str;
                Logger.i(sTag, "UnsupportedEncodingException");
                e.printStackTrace();
                str = str2;
            }
        } catch (UnsupportedEncodingException e2) {
            e = e2;
        }
        byte[] bArr4 = new byte[(i - 10) - i2];
        byteBufferAllocate.get(new byte[5]);
        byteBufferAllocate.get(bArr4);
        saveFile(str, bArr4, dir);
    }

    @RequiresApi(31)
    private final void saveFile(String id, byte[] data, String dir) {
        String strSubstring;
        int iLastIndexOf$default;
        Logger.i(sTag, "saveFile id==" + id + "**dir=" + dir);
        if (id == null) {
            return;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) id, (CharSequence) "/", false, 2, (Object) null)) {
            strSubstring = id.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) id, "/", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = id;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) strSubstring, (CharSequence) "_(", false, 2, (Object) null)) {
            iLastIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strSubstring, "_(", 0, false, 6, (Object) null);
        } else {
            iLastIndexOf$default = StringsKt__StringsKt.contains$default((CharSequence) strSubstring, (CharSequence) ".", false, 2, (Object) null) ? StringsKt__StringsKt.lastIndexOf$default((CharSequence) strSubstring, ".", 0, false, 6, (Object) null) : strSubstring.length();
        }
        String strSubstring2 = strSubstring.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        String dateTime = formatDateTime(strSubstring2);
        String strSubstring3 = strSubstring.substring(iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(dateTime + strSubstring3, RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR, "", false, 4, (Object) null);
        long recordTime = getRecordTime(strSubstring2);
        xc6.d("saveFile index " + iLastIndexOf$default + " newId:" + strReplace$default);
        syncToRecorder(strReplace$default, dir, data, recordTime, id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncExistFileToRecorder(String time, String newId, File file, String dir, String id) {
        Logger.i(sTag, "duration info " + fileList);
        if (!fileList.containsKey(newId)) {
            ExistMediaFileTimer existMediaFileTimer2 = existMediaFileTimer;
            existMediaFileTimer2.setData(time, newId, file, dir, id);
            getMHandler().postDelayed(existMediaFileTimer2, 500L);
            return;
        }
        ExistMediaFileTimer existMediaFileTimer3 = existMediaFileTimer;
        existMediaFileTimer3.reset();
        getMHandler().removeCallbacks(existMediaFileTimer3);
        long recordTime = getRecordTime(time);
        Integer num = fileList.get(newId);
        RecorderSyncHelper.INSTANCE.insertRecorderDb(file.getPath(), dir, recordTime, num != null ? num.intValue() : 0);
        wkf.a aVar = new wkf.a();
        aVar.c = id;
        askDeviceReceiveFileSuccess(aVar);
        Logger.i(sTag, id + " record file exist");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncToRecorder(String newId, String dir, byte[] data, long recordTime, String id) {
        Logger.i(sTag, "duration info " + fileList);
        if (!fileList.containsKey(newId)) {
            MediaFileTimer mediaFileTimer2 = mediaFileTimer;
            mediaFileTimer2.setData$device_settings_chinaProductRelease(newId, dir, data, recordTime, id);
            Logger.i(sTag, "postdelay  mediaFileTimer");
            getMHandler().postDelayed(mediaFileTimer2, 500L);
            return;
        }
        MediaFileTimer mediaFileTimer3 = mediaFileTimer;
        mediaFileTimer3.reset();
        getMHandler().removeCallbacks(mediaFileTimer3);
        Integer num = fileList.get(newId);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass1(dir, newId, data, recordTime, num != null ? num.intValue() : 0, id, null), 3, null);
    }

    @NotNull
    public final String formatDateTime(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            try {
                try {
                    String str = new SimpleDateFormat("yyyy年M月d日HH时mm分", Locale.getDefault()).format(new SimpleDateFormat("yyyy年M月d日_HH:mm", Locale.getDefault()).parse(input));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    return str;
                } catch (Exception unused) {
                    return "";
                }
            } catch (Exception unused2) {
                String str2 = new SimpleDateFormat("yyyy年M月d日HH时mm分", Locale.getDefault()).format(new SimpleDateFormat("M-d-yyyy_HH-mm", Locale.getDefault()).parse(input));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                return str2;
            }
        } catch (Exception unused3) {
            String str3 = new SimpleDateFormat("yyyy年M月d日HH时mm分", Locale.getDefault()).format(new SimpleDateFormat("M-d-yyyy HH-mm", Locale.getDefault()).parse(input));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            return str3;
        }
    }

    public final void getMediaFiles() {
        s7r s7rVar = new s7r();
        s7rVar.e = 18;
        s7rVar.f = 15;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 12, null);
    }

    public final long getRecordTime(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            Date date = new SimpleDateFormat("yyyy年M月d日_HH:mm", Locale.getDefault()).parse(input);
            if (date != null) {
                return date.getTime();
            }
        } catch (Exception e) {
            Logger.e(sTag, e.getMessage());
        }
        try {
            Date date2 = new SimpleDateFormat("M-d-yyyy HH-mm", Locale.getDefault()).parse(input);
            if (date2 != null) {
                return date2.getTime();
            }
        } catch (Exception e2) {
            Logger.e(sTag, e2.getMessage());
        }
        try {
            Date date3 = new SimpleDateFormat("M-d-yyyy_HH-mm", Locale.getDefault()).parse(input);
            if (date3 != null) {
                return date3.getTime();
            }
        } catch (Exception e3) {
            Logger.e(sTag, e3.getMessage());
        }
        return System.currentTimeMillis();
    }

    public final void postDelayHandler() {
        Handler mHandler2 = getMHandler();
        Runnable runnable = timeoutRunnable;
        mHandler2.removeCallbacks(runnable);
        getMHandler().postDelayed(runnable, 15000L);
    }

    @SuppressLint({"NewApi"})
    public final void receiverData(@NotNull byte[] data, @NotNull ByteBuffer byteBuffer, @NotNull String dir) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Intrinsics.checkNotNullParameter(dir, "dir");
        postDelayHandler();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        if (s2 > s) {
            Logger.e(sTag, "receiverLogData exception data!!! sequence = " + ((int) s2) + ", total = " + ((int) s) + "dir is" + dir);
            return;
        }
        int i = mTotalCount;
        if (i == 0) {
            mTotalCount = s;
        } else if (i != s) {
            Logger.e(sTag, "total not match!!!");
            reset();
            return;
        }
        int i2 = mCurrentCount;
        if (s2 != i2 + 1) {
            Logger.e(sTag, "sequence not match!!! " + ((int) s2) + ", current count: " + i2);
            reset();
            return;
        }
        if (i2 == 0) {
            getMediaFiles();
        }
        mCurrentCount = s2;
        Segment segment = new Segment(s2, data, 6);
        mTotalBytes += segment.getDataLength();
        xc6.d("SyncFileSave receiverData acceptLength:" + segment.getDataLength());
        mSegments.add(segment);
        if (checkRecordExist(dir)) {
            reset();
        } else if (s == s2) {
            merge(dir);
            reset();
        }
    }

    public final void removeDelayHandler() {
        getMHandler().removeCallbacks(timeoutRunnable);
    }

    public final void reset() {
        mCurrentCount = 0;
        mTotalCount = 0;
        mTotalBytes = 0;
        mSegments.clear();
        removeDelayHandler();
    }

    public final void setMediaFiles(@Nullable List<wkf> files) {
        int length;
        List<wkf> list = files;
        if (list == null || list.isEmpty()) {
            return;
        }
        fileList.clear();
        for (wkf wkfVar : files) {
            String strSubstring = wkfVar.c.c;
            Intrinsics.checkNotNull(strSubstring);
            if (StringsKt__StringsKt.contains$default((CharSequence) strSubstring, (CharSequence) "/", false, 2, (Object) null)) {
                strSubstring = strSubstring.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) strSubstring, "/", 0, false, 6, (Object) null) + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            }
            Intrinsics.checkNotNull(strSubstring);
            if (StringsKt__StringsKt.contains$default((CharSequence) strSubstring, (CharSequence) "_(", false, 2, (Object) null)) {
                Intrinsics.checkNotNull(strSubstring);
                length = StringsKt__StringsKt.indexOf$default((CharSequence) strSubstring, "_(", 0, false, 6, (Object) null);
            } else {
                Intrinsics.checkNotNull(strSubstring);
                if (StringsKt__StringsKt.contains$default((CharSequence) strSubstring, (CharSequence) ".", false, 2, (Object) null)) {
                    Intrinsics.checkNotNull(strSubstring);
                    length = StringsKt__StringsKt.lastIndexOf$default((CharSequence) strSubstring, ".", 0, false, 6, (Object) null);
                } else {
                    length = strSubstring.length();
                }
            }
            Intrinsics.checkNotNull(strSubstring);
            String strSubstring2 = strSubstring.substring(0, length);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            String dateTime = INSTANCE.formatDateTime(strSubstring2);
            Intrinsics.checkNotNull(strSubstring);
            String strSubstring3 = strSubstring.substring(length);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            fileList.put(StringsKt__StringsJVMKt.replace$default(dateTime + strSubstring3, RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR, "", false, 4, (Object) null), Integer.valueOf(wkfVar.g));
        }
    }
}
