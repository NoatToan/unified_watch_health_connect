package com.xiaomi.hm.health.device.recorder;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.record.RecordModule;
import com.huami.devicerecorder.IContentProvider;
import com.huami.devicerecorder.IRecorderDecoder;
import com.huami.devicerecorder.IRecorderDevice;
import com.huami.devicerecorder.model.IRecorderDB;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.musicupload.viewmodel.IWifiFtpDevice;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0002;\u0011B\u0019\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b9\u0010:J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0019\u0010\u0015\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0011\u0010\u001fR\u001d\u0010$\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u0017\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010,\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b\u001d\u0010+R\u001a\u00100\u001a\u00060-R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R%\u00104\u001a\n 1*\u0004\u0018\u00010\u00060\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u001e\u001a\u0004\b\"\u00103R\u0016\u00108\u001a\u0002058V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/xiaomi/hm/health/device/recorder/RecorderContentProvider;", "Lcom/huami/devicerecorder/IContentProvider;", "Lkotlinx/coroutines/CoroutineScope;", "", PointCategory.INIT, "deInit", "", "getLocalRecorderSaveFolder", "Lcom/huami/devicerecorder/model/IRecorderDB;", "getRecorderDB", "Lcom/huami/devicerecorder/IRecorderDecoder;", "getRecorderDecoder", "Lcom/huami/devicerecorder/IRecorderDevice;", "getRecorderDevice", "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice;", "getWifiFtpDevice", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "b", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getDevice", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lkotlinx/coroutines/CompletableJob;", "c", "Lkotlin/Lazy;", "()Lkotlinx/coroutines/CompletableJob;", "job", "Lcom/xiaomi/hm/health/device/recorder/RecorderDB;", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/device/recorder/RecorderDB;", "localDb", "Lcom/xiaomi/hm/health/device/recorder/WifiFtpDevice;", "e", "Lcom/xiaomi/hm/health/device/recorder/WifiFtpDevice;", "wifiFtpDevice", "Lcom/xiaomi/hm/health/device/recorder/RecordDevice;", "f", "()Lcom/xiaomi/hm/health/device/recorder/RecordDevice;", "recordDevice", "Lcom/xiaomi/hm/health/device/recorder/RecorderContentProvider$a;", "g", "Lcom/xiaomi/hm/health/device/recorder/RecorderContentProvider$a;", "parser", "kotlin.jvm.PlatformType", "h", "()Ljava/lang/String;", "recordDir", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroid/content/Context;Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class RecorderContentProvider implements IContentProvider, CoroutineScope {

    @NotNull
    private static final String i = "Recorder";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final HMBaseDevice device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy job = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy localDb = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final WifiFtpDevice wifiFtpDevice = new WifiFtpDevice();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy recordDevice = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final a parser = new a();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy recordDir = LazyKt__LazyJVMKt.lazy(new e());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"com/xiaomi/hm/health/device/recorder/RecorderContentProvider$a", "Lcom/huami/devicerecorder/IRecorderDecoder;", "", "deInit", "", "opusFilePath", "", "deleteOriginFile", "deleteMidFile", "decodeRecord", PointCategory.INIT, "Lcom/xiaomi/hm/health/device/recorder/RecorderParser;", "a", "Lcom/xiaomi/hm/health/device/recorder/RecorderParser;", "parser", "<init>", "(Lcom/xiaomi/hm/health/device/recorder/RecorderContentProvider;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public final class a implements IRecorderDecoder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final RecorderParser parser = new RecorderParser();

        public a() {
        }

        @Override // com.huami.devicerecorder.IRecorderDecoder
        public void deInit() {
            this.parser.deInit();
        }

        @Override // com.huami.devicerecorder.IRecorderDecoder
        @NotNull
        public String decodeRecord(@NotNull String opusFilePath, boolean deleteOriginFile, boolean deleteMidFile) {
            return this.parser.parse(opusFilePath, deleteOriginFile, deleteMidFile);
        }

        @Override // com.huami.devicerecorder.IRecorderDecoder
        public void init() {
            this.parser.init();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<CompletableJob> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob getA() {
            return JobKt__JobKt.d(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/recorder/RecorderDB;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<RecorderDB> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecorderDB getA() {
            return new RecorderDB();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/recorder/RecordDevice;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<RecordDevice> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecordDevice getA() {
            HMBaseDevice device = RecorderContentProvider.this.getDevice();
            return new RecordDevice(device == null ? null : (RecordModule) device.getChannelModule(RecordModule.class), RecorderContentProvider.this.d());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            String absolutePath = FileUtils.getAppFileDir(RecorderContentProvider.this.getContext(), RecorderContentProvider.i).getAbsolutePath();
            String str = File.separator;
            if (m.endsWith$default(absolutePath, str, false, 2, null)) {
                return absolutePath;
            }
            return absolutePath + str;
        }
    }

    public RecorderContentProvider(@NotNull Context context, @Nullable HMBaseDevice hMBaseDevice) {
        this.context = context;
        this.device = hMBaseDevice;
    }

    private final CompletableJob a() {
        return (CompletableJob) this.job.getValue();
    }

    private final RecorderDB b() {
        return (RecorderDB) this.localDb.getValue();
    }

    private final RecordDevice c() {
        return (RecordDevice) this.recordDevice.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d() {
        return (String) this.recordDir.getValue();
    }

    @Override // com.huami.devicerecorder.IContentProvider
    public void deInit() {
        this.wifiFtpDevice.deInit();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return a().plus(Dispatchers.getIO());
    }

    @Nullable
    public final HMBaseDevice getDevice() {
        return this.device;
    }

    @Override // com.huami.devicerecorder.IContentProvider
    @NotNull
    public String getLocalRecorderSaveFolder() {
        return d();
    }

    @Override // com.huami.devicerecorder.IContentProvider
    @NotNull
    public IRecorderDB getRecorderDB() {
        return b();
    }

    @Override // com.huami.devicerecorder.IContentProvider
    @NotNull
    public IRecorderDecoder getRecorderDecoder() {
        return this.parser;
    }

    @Override // com.huami.devicerecorder.IContentProvider
    @NotNull
    public IRecorderDevice getRecorderDevice() {
        return c();
    }

    @Override // com.huami.devicerecorder.IContentProvider
    @NotNull
    public IWifiFtpDevice getWifiFtpDevice() {
        return this.wifiFtpDevice;
    }

    @Override // com.huami.devicerecorder.IContentProvider
    public void init() {
        this.wifiFtpDevice.init(this.device);
    }
}
