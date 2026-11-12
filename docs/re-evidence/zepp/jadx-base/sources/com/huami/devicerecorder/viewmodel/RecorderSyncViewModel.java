package com.huami.devicerecorder.viewmodel;

import android.app.Application;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.huami.devicerecorder.IRecorderDecoder;
import com.huami.devicerecorder.model.LiveDataExKt;
import com.huami.devicerecorder.model.RecordFile;
import com.huami.devicerecorder.model.SyncItemData;
import com.huami.tools.log.HMLog;
import com.huami.watch.musicupload.adapter.FileInfo;
import com.huami.watch.musicupload.adapter.FileType;
import com.huami.watch.musicupload.viewmodel.MusicTransmitter;
import com.huami.watch.musicupload.viewmodel.TransformTask;
import com.loc.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0003OP\nB\u000f\u0012\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\u0012\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0005J\u0014\u0010\u0015\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013J\u0006\u0010\u0016\u001a\u00020\tJ\u0006\u0010\u0017\u001a\u00020\tJ\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0016\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eJ\u000e\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!J\u000e\u0010$\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010%\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\b\u0010'\u001a\u00020\tH\u0014R%\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130(8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u001f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0-8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100R\u001f\u00103\u001a\b\u0012\u0004\u0012\u00020!0(8\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b2\u0010+R\u001f\u00106\u001a\b\u0012\u0004\u0012\u00020!0(8\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010+R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010\u0011\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010@\u001a\u00060=R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010.R$\u0010J\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006Q"}, d2 = {"Lcom/huami/devicerecorder/viewmodel/RecorderSyncViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/huami/devicerecorder/viewmodel/IRecorderSyncer;", "Lcom/huami/watch/musicupload/adapter/FileInfo;", "fileInfo", "", "c", "Lcom/huami/devicerecorder/model/RecordFile;", "recordFile", "", "a", "Lcom/huami/devicerecorder/model/SyncItemData;", "b", "Lcom/huami/devicerecorder/IRecorderDecoder;", "decoder", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter;", "transmitter", "saveFolder", "setTransmitter", "", "records", "showDownloadItems", "cancelAll", "startTransfer", "Lcom/huami/devicerecorder/viewmodel/IRecorderSyncer$ISyncerCallback;", "callback", "registerCallback", "unRegisterCallback", "data", com.twitter.sdk.android.tweetcomposer.g.g, "", "progress", "progressChanged", "", WifiSetActivity.KEY_CONNECT, "onDeviceConnect", "downloadFinish", "onDecodeFinish", "onDecodeFile", "onCleared", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getSyncItemsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "syncItemsLiveData", "", "Ljava/util/List;", "getSyncItems", "()Ljava/util/List;", "syncItems", "getDeviceConnectLivedata", "deviceConnectLivedata", GoogleApiAvailabilityLight.a, "getDecodeLiveData", "decodeLiveData", "e", "Lcom/huami/devicerecorder/IRecorderDecoder;", "f", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter;", "g", "Ljava/lang/String;", "Lcom/huami/devicerecorder/viewmodel/RecorderSyncViewModel$a;", "h", "Lcom/huami/devicerecorder/viewmodel/RecorderSyncViewModel$a;", "transformCallback", "i", "callbacks", "Lcom/huami/devicerecorder/viewmodel/RecorderSyncViewModel$IDownloadFinish;", z.j, "Lcom/huami/devicerecorder/viewmodel/RecorderSyncViewModel$IDownloadFinish;", "getFileDownloadListener", "()Lcom/huami/devicerecorder/viewmodel/RecorderSyncViewModel$IDownloadFinish;", "setFileDownloadListener", "(Lcom/huami/devicerecorder/viewmodel/RecorderSyncViewModel$IDownloadFinish;)V", "fileDownloadListener", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "Companion", "IDownloadFinish", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final class RecorderSyncViewModel extends AndroidViewModel implements IRecorderSyncer {

    @NotNull
    private static final String k = "RecorderSyncViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<SyncItemData>> syncItemsLiveData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<SyncItemData> syncItems;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> deviceConnectLivedata;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> decodeLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private IRecorderDecoder decoder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private MusicTransmitter transmitter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private String saveFolder;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final a transformCallback;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final List<IRecorderSyncer.ISyncerCallback> callbacks;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private IDownloadFinish fileDownloadListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/devicerecorder/viewmodel/RecorderSyncViewModel$IDownloadFinish;", "", "Lcom/huami/devicerecorder/model/RecordFile;", "recordFile", "", "onFinish", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
    public interface IDownloadFinish {
        void onFinish(@NotNull RecordFile recordFile);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"com/huami/devicerecorder/viewmodel/RecorderSyncViewModel$a", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$ITransformCallback;", "Lcom/huami/watch/musicupload/adapter/FileInfo;", "fileInfo", "", "progress", "", "onProgressChanged", "onTransferError", "onTransferFinish", "<init>", "(Lcom/huami/devicerecorder/viewmodel/RecorderSyncViewModel;)V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
    public final class a implements MusicTransmitter.ITransformCallback {

        /* JADX INFO: renamed from: com.huami.devicerecorder.viewmodel.RecorderSyncViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.devicerecorder.viewmodel.RecorderSyncViewModel$TransformCallback$onProgressChanged$1", f = "RecorderSyncViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0372a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ RecorderSyncViewModel b;
            public final /* synthetic */ SyncItemData c;
            public final /* synthetic */ int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0372a(RecorderSyncViewModel recorderSyncViewModel, SyncItemData syncItemData, int i, Continuation<? super C0372a> continuation) {
                super(2, continuation);
                this.b = recorderSyncViewModel;
                this.c = syncItemData;
                this.d = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0372a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0372a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.progressChanged(this.c.getRecordFile(), this.d);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ FileInfo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(FileInfo fileInfo) {
                super(0);
                this.a = fileInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "transfer error: " + this.a.getName();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ SyncItemData a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SyncItemData syncItemData) {
                super(0);
                this.a = syncItemData;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "download finish: " + this.a.getRecordFile().getServerPath();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "decode finish: " + this.a;
            }
        }

        public a() {
        }

        @Override // com.huami.watch.musicupload.viewmodel.MusicTransmitter.ITransformCallback
        public void onProgressChanged(@NotNull FileInfo fileInfo, int progress) throws InterruptedException {
            SyncItemData syncItemDataB = RecorderSyncViewModel.this.b(fileInfo);
            if (syncItemDataB == null) {
                return;
            }
            BuildersKt.runBlocking(Dispatchers.getMain(), new C0372a(RecorderSyncViewModel.this, syncItemDataB, progress, null));
        }

        @Override // com.huami.watch.musicupload.viewmodel.MusicTransmitter.ITransformCallback
        public void onTransferError(@NotNull FileInfo fileInfo) {
            HMLog.info(RecorderSyncViewModel.k, new b(fileInfo));
        }

        @Override // com.huami.watch.musicupload.viewmodel.MusicTransmitter.ITransformCallback
        public void onTransferFinish(@NotNull FileInfo fileInfo) {
            SyncItemData syncItemDataB = RecorderSyncViewModel.this.b(fileInfo);
            if (syncItemDataB == null) {
                return;
            }
            String strC = RecorderSyncViewModel.this.c(fileInfo);
            HMLog.info(RecorderSyncViewModel.k, new c(syncItemDataB));
            RecorderSyncViewModel.this.onDecodeFile(syncItemDataB.getRecordFile());
            IRecorderDecoder iRecorderDecoder = RecorderSyncViewModel.this.decoder;
            String strDecodeRecord = iRecorderDecoder == null ? null : iRecorderDecoder.decodeRecord(strC, false, true);
            HMLog.info(RecorderSyncViewModel.k, new d(strDecodeRecord));
            if (strDecodeRecord != null) {
                syncItemDataB.getRecordFile().setLocalPath(strDecodeRecord);
            }
            RecorderSyncViewModel.this.onDecodeFinish(syncItemDataB.getRecordFile());
            RecorderSyncViewModel.this.downloadFinish(syncItemDataB.getRecordFile());
            IDownloadFinish fileDownloadListener = RecorderSyncViewModel.this.getFileDownloadListener();
            if (fileDownloadListener == null) {
                return;
            }
            fileDownloadListener.onFinish(syncItemDataB.getRecordFile());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ SyncItemData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SyncItemData syncItemData) {
            super(0);
            this.a = syncItemData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "cancel " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.devicerecorder.viewmodel.RecorderSyncViewModel$cancel$2", f = "RecorderSyncViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ SyncItemData b;
        public final /* synthetic */ RecorderSyncViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SyncItemData syncItemData, RecorderSyncViewModel recorderSyncViewModel, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = syncItemData;
            this.c = recorderSyncViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RecordFile recordFile = this.b.getRecordFile();
            FileInfo fileInfo = new FileInfo(recordFile.getServerPath(), recordFile.getServerPath(), recordFile.getFileSize(), FileType.File);
            MusicTransmitter musicTransmitter = this.c.transmitter;
            if (musicTransmitter == null) {
                musicTransmitter = null;
            }
            musicTransmitter.removeTask(fileInfo);
            if (this.c.getSyncItems().remove(this.b)) {
                LiveDataExKt.put(this.c.getSyncItemsLiveData(), this.c.getSyncItems());
            }
            return Unit.INSTANCE;
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
            return "remove all download records";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.devicerecorder.viewmodel.RecorderSyncViewModel$cancelAll$2", f = "RecorderSyncViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RecorderSyncViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Unit unit;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IRecorderDecoder iRecorderDecoder = RecorderSyncViewModel.this.decoder;
            if (iRecorderDecoder != null) {
                iRecorderDecoder.deInit();
            }
            List<SyncItemData> syncItems = RecorderSyncViewModel.this.getSyncItems();
            RecorderSyncViewModel recorderSyncViewModel = RecorderSyncViewModel.this;
            synchronized (syncItems) {
                MusicTransmitter musicTransmitter = recorderSyncViewModel.transmitter;
                if (musicTransmitter == null) {
                    musicTransmitter = null;
                }
                musicTransmitter.removeAll();
                recorderSyncViewModel.getSyncItems().clear();
                LiveDataExKt.put(recorderSyncViewModel.getSyncItemsLiveData(), recorderSyncViewModel.getSyncItems());
                unit = Unit.INSTANCE;
            }
            return unit;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ RecordFile a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(RecordFile recordFile, int i) {
            super(0);
            this.a = recordFile;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onPregress changed callback failed, " + this.a + "; " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.devicerecorder.viewmodel.RecorderSyncViewModel$showDownloadItems$1", f = "RecorderSyncViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RecorderSyncViewModel.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IRecorderDecoder iRecorderDecoder = RecorderSyncViewModel.this.decoder;
            if (iRecorderDecoder != null) {
                iRecorderDecoder.init();
            }
            return Unit.INSTANCE;
        }
    }

    public RecorderSyncViewModel(@NotNull Application application) {
        super(application);
        this.syncItemsLiveData = new MutableLiveData<>();
        this.syncItems = new ArrayList();
        this.deviceConnectLivedata = new MutableLiveData<>();
        this.decodeLiveData = new MutableLiveData<>();
        this.saveFolder = "";
        this.transformCallback = new a();
        this.callbacks = new ArrayList();
    }

    private final void a(RecordFile recordFile) {
        Iterator<SyncItemData> it2 = this.syncItems.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.areEqual(it2.next().getRecordFile(), recordFile)) {
                it2.remove();
            }
        }
        LiveDataExKt.put(this.syncItemsLiveData, this.syncItems);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SyncItemData b(FileInfo fileInfo) {
        Object next;
        Iterator<T> it2 = this.syncItems.iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (Intrinsics.areEqual(((SyncItemData) next).getRecordFile().getServerPath(), fileInfo.getName())) {
                return (SyncItemData) next;
            }
        }
        next = null;
        return (SyncItemData) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c(FileInfo fileInfo) {
        return this.saveFolder + fileInfo.getName();
    }

    @Override // com.huami.devicerecorder.viewmodel.IRecorderSyncer
    public void cancel(@NotNull SyncItemData data) {
        HMLog.info(k, new b(data));
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(data, this, null), 2, null);
    }

    public final void cancelAll() {
        HMLog.info(k, d.a);
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(null), 2, null);
    }

    public final void downloadFinish(@NotNull RecordFile recordFile) {
        a(recordFile);
    }

    @NotNull
    public final MutableLiveData<Boolean> getDecodeLiveData() {
        return this.decodeLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getDeviceConnectLivedata() {
        return this.deviceConnectLivedata;
    }

    @Nullable
    public final IDownloadFinish getFileDownloadListener() {
        return this.fileDownloadListener;
    }

    @NotNull
    public final List<SyncItemData> getSyncItems() {
        return this.syncItems;
    }

    @NotNull
    public final MutableLiveData<List<SyncItemData>> getSyncItemsLiveData() {
        return this.syncItemsLiveData;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        if (!this.syncItems.isEmpty()) {
            cancelAll();
        }
        MusicTransmitter musicTransmitter = this.transmitter;
        if (musicTransmitter == null) {
            musicTransmitter = null;
        }
        musicTransmitter.unRegisterCallback(this.transformCallback);
        this.fileDownloadListener = null;
    }

    public final void onDecodeFile(@NotNull RecordFile recordFile) {
        LiveDataExKt.put(this.decodeLiveData, Boolean.TRUE);
    }

    public final void onDecodeFinish(@NotNull RecordFile recordFile) {
        LiveDataExKt.put(this.decodeLiveData, Boolean.FALSE);
    }

    public final void onDeviceConnect(boolean connect) {
        LiveDataExKt.put(this.deviceConnectLivedata, Boolean.valueOf(connect));
    }

    public final void progressChanged(@NotNull RecordFile recordFile, int progress) {
        Object next;
        synchronized (this.callbacks) {
            Iterator<T> it2 = this.callbacks.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!((IRecorderSyncer.ISyncerCallback) next).needNotifyAbout(recordFile));
            IRecorderSyncer.ISyncerCallback iSyncerCallback = (IRecorderSyncer.ISyncerCallback) next;
            if (iSyncerCallback == null) {
                HMLog.info(k, new f(recordFile, progress));
            } else {
                iSyncerCallback.onProgressChanged(progress);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.huami.devicerecorder.viewmodel.IRecorderSyncer
    public void registerCallback(@NotNull IRecorderSyncer.ISyncerCallback callback) {
        synchronized (this.callbacks) {
            if (!this.callbacks.contains(callback)) {
                this.callbacks.add(callback);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setFileDownloadListener(@Nullable IDownloadFinish iDownloadFinish) {
        this.fileDownloadListener = iDownloadFinish;
    }

    public final void setTransmitter(@Nullable IRecorderDecoder decoder, @NotNull MusicTransmitter transmitter, @NotNull String saveFolder) {
        this.decoder = decoder;
        this.transmitter = transmitter;
        this.saveFolder = saveFolder;
        transmitter.registerCallback(this.transformCallback);
    }

    public final void showDownloadItems(@NotNull List<RecordFile> records) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new g(null), 2, null);
        this.syncItems.clear();
        for (RecordFile recordFile : records) {
            getSyncItems().add(new SyncItemData(recordFile, SyncItemData.SyncStatus.Pending, 0));
            FileInfo fileInfo = new FileInfo(recordFile.getServerPath(), recordFile.getServerPath(), recordFile.getFileSize(), FileType.File);
            MusicTransmitter musicTransmitter = this.transmitter;
            if (musicTransmitter == null) {
                musicTransmitter = null;
            }
            musicTransmitter.addTask(new TransformTask(fileInfo, c(fileInfo), false, null, 0L, 24, null));
        }
        LiveDataExKt.put(this.syncItemsLiveData, this.syncItems);
    }

    public final void startTransfer() {
        MusicTransmitter musicTransmitter = this.transmitter;
        if (musicTransmitter == null) {
            musicTransmitter = null;
        }
        musicTransmitter.startTransform(false);
    }

    @Override // com.huami.devicerecorder.viewmodel.IRecorderSyncer
    public void unRegisterCallback(@NotNull IRecorderSyncer.ISyncerCallback callback) {
        synchronized (this.callbacks) {
            if (this.callbacks.contains(callback)) {
                this.callbacks.remove(callback);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
