package com.huami.eid.ui.viewmodel;

import android.content.Context;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.eid.ui.api.EidRepo;
import com.huami.nfc.eid.entities.EidStatus;
import com.huami.tools.analytics.DbUtils;
import com.sensetime.senseid.sdk.liveness.silent.OnLivenessListener;
import com.sensetime.senseid.sdk.liveness.silent.SilentLivenessApi;
import com.sensetime.senseid.sdk.liveness.silent.common.util.FileUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 62\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b4\u00105J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u001e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR%\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00170\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001cR%\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00170\u00168\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001cR%\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00168\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001cR\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100¨\u00067"}, d2 = {"Lcom/huami/eid/ui/viewmodel/EidOpenViewModel;", "Lcom/huami/eid/ui/viewmodel/EidBaseViewModel;", "", "checkPwdState", "verifyWatchPwd", "getReqidFromWatchAndCheck", "", "bizSerialNumber", "requestId", "", "imageData", "faceCompare", "openEidCard", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/sensetime/senseid/sdk/liveness/silent/OnLivenessListener;", "livenessListener", "initFaceRecognition", "Lcom/huami/eid/ui/api/EidRepo;", "a", "Lcom/huami/eid/ui/api/EidRepo;", "eidRepo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/core/State;", "", "b", "Landroidx/lifecycle/MutableLiveData;", "getPwdStateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "pwdStateLiveData", "c", "getWatchUnlockLiveData", "watchUnlockLiveData", "Lcom/huami/nfc/eid/entities/EidStatus;", GoogleApiAvailabilityLight.a, "getEidStatusLiveData", "eidStatusLiveData", "e", "getFaceCompareLiveData", "faceCompareLiveData", "f", "getOpenResultLiveData", "openResultLiveData", "g", "Ljava/lang/String;", "getRequestId", "()Ljava/lang/String;", "setRequestId", "(Ljava/lang/String;)V", "h", "getBizSerialNumber", "setBizSerialNumber", "<init>", "(Lcom/huami/eid/ui/api/EidRepo;)V", "Companion", "eid_release"}, k = 1, mv = {1, 5, 1})
public final class EidOpenViewModel extends EidBaseViewModel {

    @NotNull
    private static final String j = "SenseID_Liveness_Silent.lic";

    @NotNull
    private static final String k = "SenseID_Silent_Liveness.model";
    private static final float m = 0.15f;
    private static final float n = 0.8f;
    private static final long o = 30000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final EidRepo eidRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<Boolean>> pwdStateLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<Boolean>> watchUnlockLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<EidStatus>> eidStatusLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<Unit>> faceCompareLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<Boolean>> openResultLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private String requestId = "";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private String bizSerialNumber = "";

    @NotNull
    private static final String i = "/sensetime/";

    @NotNull
    private static final String l = "/sensetime/silent_liveness/silent_liveness_image.jpg";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.eid.ui.viewmodel.EidOpenViewModel$checkPwdState$1", f = "EidOpenViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super State<? extends Boolean>>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return EidOpenViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Boolean>> continuation) {
            return invoke2((Continuation<? super State<Boolean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Boolean>> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new Success(Boxing.boxBoolean(EidOpenViewModel.this.eidRepo.checkPwdState()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.eid.ui.viewmodel.EidOpenViewModel$faceCompare$1", f = "EidOpenViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function1<Continuation<? super State<? extends Unit>>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ byte[] e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, byte[] bArr, Continuation<? super b> continuation) {
            super(1, continuation);
            this.c = str;
            this.d = str2;
            this.e = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return EidOpenViewModel.this.new b(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Unit>> continuation) {
            return invoke2((Continuation<? super State<Unit>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Unit>> continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EidOpenViewModel.this.eidRepo.faceCompare(this.c, this.d, this.e);
            return new Success(Unit.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/huami/nfc/eid/entities/EidStatus;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.eid.ui.viewmodel.EidOpenViewModel$getReqidFromWatchAndCheck$1", f = "EidOpenViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function1<Continuation<? super State<? extends EidStatus>>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return EidOpenViewModel.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends EidStatus>> continuation) {
            return invoke2((Continuation<? super State<EidStatus>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<EidStatus>> continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String orderNum;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EidOpenViewModel eidOpenViewModel = EidOpenViewModel.this;
            eidOpenViewModel.setRequestId(eidOpenViewModel.eidRepo.getRequestId());
            Success success = new Success(EidOpenViewModel.this.eidRepo.getEidStatus("1", EidOpenViewModel.this.getRequestId()));
            EidOpenViewModel eidOpenViewModel2 = EidOpenViewModel.this;
            EidStatus eidStatus = (EidStatus) success.getValue();
            String str = "";
            if (eidStatus != null && (orderNum = eidStatus.getOrderNum()) != null) {
                str = orderNum;
            }
            eidOpenViewModel2.setBizSerialNumber(str);
            return success;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.eid.ui.viewmodel.EidOpenViewModel$initFaceRecognition$1", f = "EidOpenViewModel.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ OnLivenessListener d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.eid.ui.viewmodel.EidOpenViewModel$initFaceRecognition$1$1$1", f = "EidOpenViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Context b;
            public final /* synthetic */ OnLivenessListener c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, OnLivenessListener onLivenessListener, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = context;
                this.c = onLivenessListener;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                File file = new File(this.b.getExternalFilesDir(null), EidOpenViewModel.i);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(this.b.getExternalFilesDir(null), EidOpenViewModel.l);
                if (file2.exists()) {
                    file2.delete();
                }
                String str = file.getPath() + "/SenseID_Liveness_Silent.lic";
                String str2 = file.getPath() + "/SenseID_Silent_Liveness.model";
                FileUtil.copyAssetsToFile(this.b, EidOpenViewModel.j, str);
                FileUtil.copyAssetsToFile(this.b, EidOpenViewModel.k, str2);
                SilentLivenessApi.init(this.b, str, str2, this.c);
                SilentLivenessApi.setFaceDistanceRate(0.15f, 0.8f);
                SilentLivenessApi.setDetectTimeout(30000L);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Object> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                return "onFailure:" + this.a.getMessage();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, OnLivenessListener onLivenessListener, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = context;
            this.d = onLivenessListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = new d(this.c, this.d, continuation);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Context context = this.c;
                    OnLivenessListener onLivenessListener = this.d;
                    Result.Companion companion = Result.Companion;
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    a aVar = new a(context, onLivenessListener, null);
                    this.a = 1;
                    if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                LogcatKt.info$default(Logcat.INSTANCE, null, new b(thM3848exceptionOrNullimpl), 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.eid.ui.viewmodel.EidOpenViewModel$openEidCard$1", f = "EidOpenViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function1<Continuation<? super State<? extends Boolean>>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, Continuation<? super e> continuation) {
            super(1, continuation);
            this.c = str;
            this.d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return EidOpenViewModel.this.new e(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Boolean>> continuation) {
            return invoke2((Continuation<? super State<Boolean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Boolean>> continuation) {
            return ((e) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new Success(Boxing.boxBoolean(EidOpenViewModel.this.eidRepo.openEidCard(this.c, this.d)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.eid.ui.viewmodel.EidOpenViewModel$verifyWatchPwd$1", f = "EidOpenViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function1<Continuation<? super State<? extends Boolean>>, Object> {
        public int a;

        public f(Continuation<? super f> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return EidOpenViewModel.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Boolean>> continuation) {
            return invoke2((Continuation<? super State<Boolean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Boolean>> continuation) {
            return ((f) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new Success(Boxing.boxBoolean(EidOpenViewModel.this.eidRepo.verifyWatchPwd()));
        }
    }

    public EidOpenViewModel(@NotNull EidRepo eidRepo) {
        this.eidRepo = eidRepo;
    }

    public final void checkPwdState() {
        startWithLoading(this.pwdStateLiveData, new a(null));
    }

    public final void faceCompare(@NotNull String bizSerialNumber, @NotNull String requestId, @NotNull byte[] imageData) {
        startWithLoading(this.faceCompareLiveData, new b(bizSerialNumber, requestId, imageData, null));
    }

    @NotNull
    public final String getBizSerialNumber() {
        return this.bizSerialNumber;
    }

    @NotNull
    public final MutableLiveData<State<EidStatus>> getEidStatusLiveData() {
        return this.eidStatusLiveData;
    }

    @NotNull
    public final MutableLiveData<State<Unit>> getFaceCompareLiveData() {
        return this.faceCompareLiveData;
    }

    @NotNull
    public final MutableLiveData<State<Boolean>> getOpenResultLiveData() {
        return this.openResultLiveData;
    }

    @NotNull
    public final MutableLiveData<State<Boolean>> getPwdStateLiveData() {
        return this.pwdStateLiveData;
    }

    public final void getReqidFromWatchAndCheck() {
        startWithLoading(this.eidStatusLiveData, new c(null));
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    public final MutableLiveData<State<Boolean>> getWatchUnlockLiveData() {
        return this.watchUnlockLiveData;
    }

    public final void initFaceRecognition(@NotNull Context context, @NotNull OnLivenessListener livenessListener) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new d(context, livenessListener, null), 3, null);
    }

    public final void openEidCard(@NotNull String bizSerialNumber, @NotNull String requestId) {
        startWithLoading(this.openResultLiveData, new e(bizSerialNumber, requestId, null));
    }

    public final void setBizSerialNumber(@NotNull String str) {
        this.bizSerialNumber = str;
    }

    public final void setRequestId(@NotNull String str) {
        this.requestId = str;
    }

    public final void verifyWatchPwd() {
        startWithLoading(this.watchUnlockLiveData, new f(null));
    }
}
