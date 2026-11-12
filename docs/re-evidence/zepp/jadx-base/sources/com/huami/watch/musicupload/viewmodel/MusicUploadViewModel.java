package com.huami.watch.musicupload.viewmodel;

import android.app.Application;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.watch.musicupload.adapter.FileInfo;
import com.huami.watch.musicupload.adapter.FileType;
import com.huami.watch.musicupload.adapter.UploadItemInfo;
import com.huami.watch.musicupload.fragment.MusicConstant;
import com.huami.watch.musicupload.fragment.MusicConstantKt;
import com.huami.watch.wififtp.PhoneWifiFtpUtil;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0002\b\u0006B\u000f\u0012\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u0013\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0002J\u0010\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011H\u0002J\u0006\u0010\u0015\u001a\u00020\tJ\u0014\u0010\u0016\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0007J\u0006\u0010\u001b\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u001d\u001a\u00020\u0007J\u000e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010!\u001a\u00020\u0007J\u0006\u0010\"\u001a\u00020\rJ\u0006\u0010#\u001a\u00020\u0007J\b\u0010$\u001a\u00020\u0007H\u0014J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%H\u0016J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%H\u0016J\u000e\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\tR\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010,R%\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00110.8\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u00101R\u001f\u00104\u001a\b\u0012\u0004\u0012\u00020\t0.8\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u00101R\u0016\u00107\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010;\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u000f088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R:\u0010>\u001a&\u0012\f\u0012\n <*\u0004\u0018\u00010\u00030\u0003 <*\u0012\u0012\f\u0012\n <*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00110+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010,R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010,R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020%0+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0018\u0010C\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010G\u001a\u00060DR\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006Q"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/MusicUploadViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/huami/watch/musicupload/viewmodel/IMusicUploadObservable;", "Lcom/huami/watch/musicupload/adapter/FileInfo;", "fileInfo", "Lcom/huami/watch/musicupload/viewmodel/TransformTask;", "c", "", "b", "", "notifyUI", "e", "file", "", "type", "Lcom/huami/watch/musicupload/adapter/UploadItemInfo;", "a", "", "fileInfos", "h", "g", "haveTasks", "addUploadTasks", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter;", "uploader", "setUploader", "startUpload", "stopUpload", "retryTask", "retryAllTask", "downloadError", "allDownloadError", "deleteTask", "clearAll", "getFailedTaskCount", "saveTasks", "onCleared", "Lcom/huami/watch/musicupload/viewmodel/IMusicUploadObservable$IUploadObserver;", "observer", "registerObserver", "unRegisterObserver", Status.PRE_CONNECT_STATE_CONNECTED, "setDeviceConnected", "", "Ljava/util/List;", "taskItems", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getTaskItemsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "taskItemsLiveData", "getShowTransformAlertLiveData", "showTransformAlertLiveData", GoogleApiAvailabilityLight.a, "Z", "deviceConnected", "", "", "Ljava/util/Map;", "taskItemsMap", "kotlin.jvm.PlatformType", "f", "uploadingTasks", "failedTasks", "syncCallbacks", "i", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter;", "musicTransmitter", "Lcom/huami/watch/musicupload/viewmodel/MusicUploadViewModel$c;", z.j, "Lcom/huami/watch/musicupload/viewmodel/MusicUploadViewModel$c;", "musicTransformCallback", "Ljava/util/concurrent/atomic/AtomicBoolean;", hl.k, "Ljava/util/concurrent/atomic/AtomicBoolean;", "generateItem", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "m", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class MusicUploadViewModel extends AndroidViewModel implements IMusicUploadObservable {
    private static final String l = "MusicUploadViewModel";

    @NotNull
    private static final b m = new b(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<UploadItemInfo> taskItems;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<UploadItemInfo>> taskItemsLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> showTransformAlertLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean deviceConnected;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Map<String, UploadItemInfo> taskItemsMap;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<FileInfo> uploadingTasks;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<FileInfo> failedTasks;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<IMusicUploadObservable.IUploadObserver> syncCallbacks;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private MusicTransmitter musicTransmitter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final c musicTransformCallback;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final AtomicBoolean generateItem;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.MusicUploadViewModel$1", f = "MusicUploadViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MusicUploadViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
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
            List listG = MusicUploadViewModel.this.g();
            if (listG != null && (!listG.isEmpty())) {
                MusicUploadViewModel.this.failedTasks.addAll(listG);
                MusicUploadViewModel.f(MusicUploadViewModel.this, false, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/watch/musicupload/viewmodel/MusicUploadViewModel$b", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"com/huami/watch/musicupload/viewmodel/MusicUploadViewModel$c", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$ITransformCallback;", "Lcom/huami/watch/musicupload/adapter/FileInfo;", "fileInfo", "", "progress", "", "onProgressChanged", "onTransferFinish", "onTransferError", "<init>", "(Lcom/huami/watch/musicupload/viewmodel/MusicUploadViewModel;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class c implements MusicTransmitter.ITransformCallback {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.MusicUploadViewModel$TransformCallback$onProgressChanged$1", f = "MusicUploadViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ FileInfo c;
            public final /* synthetic */ int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FileInfo fileInfo, int i, Continuation continuation) {
                super(2, continuation);
                this.c = fileInfo;
                this.d = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return c.this.new a(this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object next;
                Unit unit;
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                synchronized (MusicUploadViewModel.this.syncCallbacks) {
                    Iterator it2 = MusicUploadViewModel.this.syncCallbacks.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!Boxing.boxBoolean(((IMusicUploadObservable.IUploadObserver) next).needNotifyAbout(this.c)).booleanValue());
                    IMusicUploadObservable.IUploadObserver iUploadObserver = (IMusicUploadObservable.IUploadObserver) next;
                    if (iUploadObserver != null) {
                        iUploadObserver.onProgressChanged(this.d);
                    }
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.MusicUploadViewModel$TransformCallback$onTransferError$1", f = "MusicUploadViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ FileInfo c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(FileInfo fileInfo, Continuation continuation) {
                super(2, continuation);
                this.c = fileInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return c.this.new b(this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
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
                MusicUploadViewModel.this.downloadError(this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.watch.musicupload.viewmodel.MusicUploadViewModel$c$c, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.MusicUploadViewModel$TransformCallback$onTransferFinish$1", f = "MusicUploadViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0670c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ FileInfo c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0670c(FileInfo fileInfo, Continuation continuation) {
                super(2, continuation);
                this.c = fileInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return c.this.new C0670c(this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0670c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MusicUploadViewModel.this.b(this.c);
                return Unit.INSTANCE;
            }
        }

        public c() {
        }

        @Override // com.huami.watch.musicupload.viewmodel.MusicTransmitter.ITransformCallback
        public void onProgressChanged(@NotNull FileInfo fileInfo, int progress) {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(MusicUploadViewModel.this), Dispatchers.getMain(), null, new a(fileInfo, progress, null), 2, null);
        }

        @Override // com.huami.watch.musicupload.viewmodel.MusicTransmitter.ITransformCallback
        public void onTransferError(@NotNull FileInfo fileInfo) {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(MusicUploadViewModel.this), Dispatchers.getMain(), null, new b(fileInfo, null), 2, null);
        }

        @Override // com.huami.watch.musicupload.viewmodel.MusicTransmitter.ITransformCallback
        public void onTransferFinish(@NotNull FileInfo fileInfo) {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(MusicUploadViewModel.this), Dispatchers.getMain(), null, new C0670c(fileInfo, null), 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.MusicUploadViewModel$addUploadTasks$2", f = "MusicUploadViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MusicUploadViewModel.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MusicUploadViewModel.f(MusicUploadViewModel.this, false, 1, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "exit uploading";
        }
    }

    public MusicUploadViewModel(@NotNull Application application) {
        super(application);
        this.taskItems = new ArrayList();
        this.taskItemsLiveData = new MutableLiveData<>();
        this.showTransformAlertLiveData = new MutableLiveData<>(Boolean.FALSE);
        this.deviceConnected = true;
        this.taskItemsMap = new LinkedHashMap();
        this.uploadingTasks = Collections.synchronizedList(new ArrayList());
        this.failedTasks = new ArrayList();
        this.syncCallbacks = new ArrayList();
        this.musicTransformCallback = new c();
        this.generateItem = new AtomicBoolean(false);
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    private final UploadItemInfo a(FileInfo file, int type) {
        return new UploadItemInfo(type, file, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(FileInfo fileInfo) {
        if (this.uploadingTasks.contains(fileInfo)) {
            this.uploadingTasks.remove(fileInfo);
        }
        if (this.failedTasks.contains(fileInfo)) {
            this.failedTasks.remove(fileInfo);
        }
        this.taskItemsMap.remove(fileInfo.getPath());
        e(true);
    }

    private final TransformTask c(FileInfo fileInfo) {
        return new TransformTask(fileInfo, FileInfo.REMOTE_DIR + fileInfo.getName(), false, null, 0L, 28, null);
    }

    private final void e(boolean notifyUI) {
        if (this.generateItem.compareAndSet(false, true)) {
            ArrayList arrayList = new ArrayList();
            if (!this.uploadingTasks.isEmpty()) {
                arrayList.add(a(null, 2));
            }
            for (FileInfo fileInfo : this.uploadingTasks) {
                UploadItemInfo uploadItemInfoA = this.taskItemsMap.get(fileInfo.getPath());
                if (uploadItemInfoA == null) {
                    uploadItemInfoA = a(fileInfo, 0);
                    this.taskItemsMap.put(fileInfo.getPath(), uploadItemInfoA);
                }
                if (uploadItemInfoA.getType() == 1) {
                    uploadItemInfoA.setType(0);
                    uploadItemInfoA.setProgress(0);
                }
                arrayList.add(uploadItemInfoA);
            }
            if (!this.failedTasks.isEmpty()) {
                arrayList.add(a(null, 3));
            }
            for (FileInfo fileInfo2 : this.failedTasks) {
                UploadItemInfo uploadItemInfoA2 = this.taskItemsMap.get(fileInfo2.getPath());
                if (uploadItemInfoA2 == null) {
                    uploadItemInfoA2 = a(fileInfo2, 1);
                    this.taskItemsMap.put(fileInfo2.getPath(), uploadItemInfoA2);
                }
                if (uploadItemInfoA2.getType() != 1) {
                    uploadItemInfoA2.setType(1);
                    uploadItemInfoA2.setProgress(0);
                }
                arrayList.add(uploadItemInfoA2);
            }
            this.taskItems.clear();
            this.taskItems.addAll(arrayList);
            if (notifyUI) {
                MusicConstantKt.put(this.taskItemsLiveData, this.taskItems);
            }
            this.showTransformAlertLiveData.postValue(Boolean.valueOf(!this.uploadingTasks.isEmpty()));
            this.generateItem.set(false);
        }
    }

    public static /* synthetic */ void f(MusicUploadViewModel musicUploadViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        musicUploadViewModel.e(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<FileInfo> g() {
        Set<String> stringSetValue = MusicConstant.INSTANCE.getStringSetValue(getApplication(), MusicConstant.KEY_TASK_LIST);
        if (stringSetValue == null || stringSetValue.isEmpty()) {
            return null;
        }
        ArrayList<PhoneWifiFtpUtil.TransferTask> arrayList = new ArrayList();
        Iterator<T> it2 = stringSetValue.iterator();
        while (it2.hasNext()) {
            PhoneWifiFtpUtil.TransferTask transferTaskDecode = PhoneWifiFtpUtil.TransferTask.decode((String) it2.next());
            if (transferTaskDecode != null) {
                arrayList.add(transferTaskDecode);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (PhoneWifiFtpUtil.TransferTask transferTask : arrayList) {
            arrayList2.add(new FileInfo(transferTask.getLocalPath(), transferTask.getLocalName(), transferTask.getFileLength(), FileType.File));
        }
        return arrayList2;
    }

    private final void h(List<FileInfo> fileInfos) {
        Iterator<FileInfo> it2 = this.failedTasks.iterator();
        while (it2.hasNext()) {
            FileInfo next = it2.next();
            boolean z = false;
            if (!(fileInfos instanceof Collection) || !fileInfos.isEmpty()) {
                Iterator<T> it3 = fileInfos.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.areEqual(((FileInfo) it3.next()).getPath(), next.getPath())) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                it2.remove();
            }
        }
    }

    public final void addUploadTasks(@NotNull List<FileInfo> fileInfos) {
        h(fileInfos);
        for (FileInfo fileInfo : fileInfos) {
            List<FileInfo> list = this.uploadingTasks;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.areEqual(((FileInfo) it2.next()).getPath(), fileInfo.getPath())) {
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                this.uploadingTasks.add(fileInfo);
                TransformTask transformTaskC = c(fileInfo);
                MusicTransmitter musicTransmitter = this.musicTransmitter;
                if (musicTransmitter != null) {
                    musicTransmitter.addTask(transformTaskC);
                }
            }
        }
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new d(null), 2, null);
    }

    public final void allDownloadError() {
        for (FileInfo fileInfo : this.uploadingTasks) {
            if (!this.failedTasks.contains(fileInfo)) {
                this.failedTasks.add(fileInfo);
            }
        }
        this.uploadingTasks.clear();
        MusicTransmitter musicTransmitter = this.musicTransmitter;
        if (musicTransmitter != null) {
            musicTransmitter.removeAll();
        }
        f(this, false, 1, null);
    }

    public final void clearAll() {
        MusicTransmitter musicTransmitter = this.musicTransmitter;
        if (musicTransmitter != null) {
            musicTransmitter.removeAll();
        }
        this.uploadingTasks.clear();
        this.failedTasks.clear();
        this.taskItemsMap.clear();
        this.taskItems.clear();
        MusicConstantKt.put(this.taskItemsLiveData, this.taskItems);
    }

    public final void deleteTask(@NotNull FileInfo fileInfo) {
        MusicTransmitter musicTransmitter = this.musicTransmitter;
        if (musicTransmitter != null) {
            musicTransmitter.removeTask(fileInfo);
        }
        b(fileInfo);
    }

    public final void downloadError(@NotNull FileInfo fileInfo) {
        if (this.uploadingTasks.contains(fileInfo)) {
            this.uploadingTasks.remove(fileInfo);
            if (!this.failedTasks.contains(fileInfo)) {
                this.failedTasks.add(fileInfo);
            }
            f(this, false, 1, null);
        }
    }

    public final int getFailedTaskCount() {
        return this.failedTasks.size();
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowTransformAlertLiveData() {
        return this.showTransformAlertLiveData;
    }

    @NotNull
    public final MutableLiveData<List<UploadItemInfo>> getTaskItemsLiveData() {
        return this.taskItemsLiveData;
    }

    public final boolean haveTasks() {
        return (this.uploadingTasks.isEmpty() ^ true) || (this.failedTasks.isEmpty() ^ true);
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        HMLog.info(l, e.a);
        MusicTransmitter musicTransmitter = this.musicTransmitter;
        if (musicTransmitter != null) {
            musicTransmitter.removeAll();
        }
        MusicTransmitter musicTransmitter2 = this.musicTransmitter;
        if (musicTransmitter2 != null) {
            musicTransmitter2.unRegisterCallback(this.musicTransformCallback);
        }
        MusicTransmitter musicTransmitter3 = this.musicTransmitter;
        if (musicTransmitter3 != null) {
            musicTransmitter3.setInterceptor(null);
        }
        MusicTransmitter musicTransmitter4 = this.musicTransmitter;
        if (musicTransmitter4 != null) {
            musicTransmitter4.setTransformCompleteListener(null);
        }
        this.syncCallbacks.clear();
        saveTasks();
    }

    @Override // com.huami.watch.musicupload.viewmodel.IMusicUploadObservable
    public void registerObserver(@NotNull IMusicUploadObservable.IUploadObserver observer) {
        synchronized (this.syncCallbacks) {
            if (!this.syncCallbacks.contains(observer)) {
                this.syncCallbacks.add(observer);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void retryAllTask() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.failedTasks);
        addUploadTasks(arrayList);
    }

    public final void retryTask(@NotNull FileInfo fileInfo) {
        addUploadTasks(kotlin.collections.e.listOf(fileInfo));
    }

    public final void saveTasks() {
        List listPlus = CollectionsKt___CollectionsKt.plus((Collection) this.uploadingTasks, (Iterable) this.failedTasks);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = listPlus.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(((FileInfo) it2.next()).encode());
        }
        MusicConstant.INSTANCE.saveStringSetValue(getApplication(), MusicConstant.KEY_TASK_LIST, linkedHashSet);
    }

    public final void setDeviceConnected(boolean connected) {
        this.deviceConnected = connected;
    }

    public final void setUploader(@NotNull MusicTransmitter uploader) {
        this.musicTransmitter = uploader;
        uploader.registerCallback(this.musicTransformCallback);
    }

    public final void startUpload() {
        MusicTransmitter musicTransmitter = this.musicTransmitter;
        if (musicTransmitter != null) {
            MusicTransmitter.startTransform$default(musicTransmitter, false, 1, null);
        }
    }

    public final void stopUpload() {
        MusicTransmitter musicTransmitter = this.musicTransmitter;
        if (musicTransmitter != null) {
            musicTransmitter.removeAll();
        }
        if (this.uploadingTasks.isEmpty()) {
            return;
        }
        for (FileInfo fileInfo : this.uploadingTasks) {
            if (!this.failedTasks.contains(fileInfo)) {
                this.failedTasks.add(fileInfo);
            }
        }
        this.uploadingTasks.clear();
        f(this, false, 1, null);
    }

    @Override // com.huami.watch.musicupload.viewmodel.IMusicUploadObservable
    public void unRegisterObserver(@NotNull IMusicUploadObservable.IUploadObserver observer) {
        synchronized (this.syncCallbacks) {
            if (this.syncCallbacks.contains(observer)) {
                this.syncCallbacks.remove(observer);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
