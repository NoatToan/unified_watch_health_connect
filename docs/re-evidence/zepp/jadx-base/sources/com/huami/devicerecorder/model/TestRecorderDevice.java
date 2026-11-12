package com.huami.devicerecorder.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.os.Environment;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicerecorder.IRecorderDevice;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u001b\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0012\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/huami/devicerecorder/model/TestRecorderDevice;", "Lcom/huami/devicerecorder/IRecorderDevice;", "Lcom/huami/devicerecorder/model/RecordFile;", "recordFile", "", "c", "a", "", "getRecorderFiles", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/devicerecorder/IRecorderDevice$IDeviceStatusListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerStatusListener", "unregisterStatusListener", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "Ljava/util/List;", "files", "", "J", "id", "Landroid/media/MediaPlayer;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Landroid/media/MediaPlayer;", "player", "<init>", "(Landroid/content/Context;)V", "Companion", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final class TestRecorderDevice implements IRecorderDevice {

    @NotNull
    private static final String e = "TestRecorderDevice";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<RecordFile> files = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy player = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "get duration failed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/media/MediaPlayer;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MediaPlayer> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediaPlayer invoke() {
            return new MediaPlayer();
        }
    }

    public TestRecorderDevice(@Nullable Context context) {
        this.context = context;
        int i = 1;
        do {
            i++;
            RecordFile recordFileA = a();
            c(recordFileA);
            this.files.add(recordFileA);
        } while (i <= 10);
    }

    private final RecordFile a() {
        String absolutePath;
        AssetManager assets;
        String str = "";
        AssetFileDescriptor assetFileDescriptorOpenFd = null;
        try {
            long j = this.id;
            long j2 = 3;
            if (j % j2 == 0) {
                Context context = this.context;
                if (context != null && (assets = context.getAssets()) != null) {
                    assetFileDescriptorOpenFd = assets.openFd("qinghuaci1.mp3");
                }
            } else if (j % j2 == 1) {
                str = "file/not/exist";
            } else {
                Context context2 = this.context;
                File externalFilesDir = context2 == null ? null : context2.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
                if (externalFilesDir == null || (absolutePath = externalFilesDir.getAbsolutePath()) == null) {
                    absolutePath = "";
                }
                if (absolutePath.length() > 0) {
                    if (StringsKt___StringsKt.last(absolutePath) == File.separatorChar) {
                        str = absolutePath + "qinghuaci.mp3";
                    } else {
                        str = absolutePath + File.separator + "qinghuaci.mp3";
                    }
                }
            }
        } catch (Exception unused) {
        }
        long j3 = this.id;
        this.id = 1 + j3;
        return new RecordFile(j3, System.currentTimeMillis(), 1000000, str, "", true, false, 1000L, assetFileDescriptorOpenFd);
    }

    private final MediaPlayer b() {
        return (MediaPlayer) this.player.getValue();
    }

    private final void c(RecordFile recordFile) {
        try {
            boolean z = true;
            if (!(recordFile.getLocalPath().length() == 0) || recordFile.getFileDescriptor() == null) {
                if (recordFile.getLocalPath().length() <= 0) {
                    z = false;
                }
                if (!z) {
                    recordFile.setDuration(10000);
                    return;
                }
                b().setDataSource(recordFile.getLocalPath());
            } else {
                AssetFileDescriptor fileDescriptor = recordFile.getFileDescriptor();
                if (fileDescriptor == null) {
                    return;
                } else {
                    b().setDataSource(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength());
                }
            }
            b().prepare();
            recordFile.setDuration(b().getDuration());
        } catch (Exception unused) {
            HMLog.info(e, a.a);
        }
        b().stop();
        b().reset();
    }

    @Override // com.huami.devicerecorder.IRecorderDevice
    @Nullable
    public Object getRecorderFiles(@NotNull Continuation<? super List<RecordFile>> continuation) {
        return this.files;
    }

    @Override // com.huami.devicerecorder.IRecorderDevice
    public void registerStatusListener(@NotNull IRecorderDevice.IDeviceStatusListener listener) {
    }

    @Override // com.huami.devicerecorder.IRecorderDevice
    public void unregisterStatusListener(@NotNull IRecorderDevice.IDeviceStatusListener listener) {
    }
}
