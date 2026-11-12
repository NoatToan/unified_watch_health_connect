package com.huami.snore.ui.viewmodel;

import android.content.Context;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.snore.core.ext.KoinExtKt;
import com.huami.snore.core.repo.IVoiceRecorderRepo;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0013\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/huami/snore/ui/viewmodel/SnoreMonitorViewModel;", "Landroidx/lifecycle/ViewModel;", "Lkotlin/Pair;", "", "a", "", "getRealTime", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/Date;", "startTime", "endTime", "deleteData", "Lcom/huami/snore/core/repo/IVoiceRecorderRepo;", "Lcom/huami/snore/core/repo/IVoiceRecorderRepo;", CommonLanguageSettingFragment.KEY_REPO, "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "getPageStateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "pageStateLiveData", "c", "getCurrentHour", "currentHour", GoogleApiAvailabilityLight.a, "getCurrentMin", "currentMin", "e", "Ljava/util/Date;", "currentTime", "<init>", "(Lcom/huami/snore/core/repo/IVoiceRecorderRepo;)V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class SnoreMonitorViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IVoiceRecorderRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> pageStateLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> currentHour = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> currentMin = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Date currentTime = new Date();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.snore.ui.viewmodel.SnoreMonitorViewModel$deleteData$1", f = "SnoreMonitorViewModel.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Date c;
        public final /* synthetic */ Date d;

        /* JADX INFO: renamed from: com.huami.snore.ui.viewmodel.SnoreMonitorViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.snore.ui.viewmodel.SnoreMonitorViewModel$deleteData$1$1", f = "SnoreMonitorViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0604a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SnoreMonitorViewModel b;
            public final /* synthetic */ Date c;
            public final /* synthetic */ Date d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0604a(SnoreMonitorViewModel snoreMonitorViewModel, Date date, Date date2, Continuation<? super C0604a> continuation) {
                super(2, continuation);
                this.b = snoreMonitorViewModel;
                this.c = date;
                this.d = date2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0604a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0604a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    IVoiceRecorderRepo iVoiceRecorderRepo = this.b.repo;
                    Context appContext = KoinExtKt.getAppContext();
                    Date date = this.c;
                    Date date2 = this.d;
                    this.a = 1;
                    if (iVoiceRecorderRepo.deleteLocalWithinTimeData(appContext, date, date2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Date date, Date date2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = date;
            this.d = date2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SnoreMonitorViewModel.this.new a(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C0604a c0604a = new C0604a(SnoreMonitorViewModel.this, this.c, this.d, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, c0604a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.snore.ui.viewmodel.SnoreMonitorViewModel", f = "SnoreMonitorViewModel.kt", i = {0}, l = {24}, m = "getRealTime", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return SnoreMonitorViewModel.this.getRealTime(this);
        }
    }

    public SnoreMonitorViewModel(@NotNull IVoiceRecorderRepo iVoiceRecorderRepo) {
        this.repo = iVoiceRecorderRepo;
    }

    private final Pair<String, String> a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(Constant.PAI_KEY_MEDIUM_ZONE_MINUTES);
        this.currentTime.setTime(System.currentTimeMillis());
        return new Pair<>(simpleDateFormat.format(this.currentTime), simpleDateFormat2.format(this.currentTime));
    }

    public final void deleteData(@NotNull Date startTime, @NotNull Date endTime) {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new a(startTime, endTime, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<String> getCurrentHour() {
        return this.currentHour;
    }

    @NotNull
    public final MutableLiveData<String> getCurrentMin() {
        return this.currentMin;
    }

    @NotNull
    public final MutableLiveData<String> getPageStateLiveData() {
        return this.pageStateLiveData;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0043 -> B:18:0x0046). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getRealTime(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.huami.snore.ui.viewmodel.SnoreMonitorViewModel.b
            if (r0 == 0) goto L13
            r0 = r7
            com.huami.snore.ui.viewmodel.SnoreMonitorViewModel$b r0 = (com.huami.snore.ui.viewmodel.SnoreMonitorViewModel.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.huami.snore.ui.viewmodel.SnoreMonitorViewModel$b r0 = new com.huami.snore.ui.viewmodel.SnoreMonitorViewModel$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.a
            com.huami.snore.ui.viewmodel.SnoreMonitorViewModel r2 = (com.huami.snore.ui.viewmodel.SnoreMonitorViewModel) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L46
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r7)
            r2 = r6
        L39:
            r4 = 500(0x1f4, double:2.47E-321)
            r0.a = r2
            r0.d = r3
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            androidx.lifecycle.MutableLiveData r7 = r2.getCurrentHour()
            kotlin.Pair r4 = r2.a()
            java.lang.Object r4 = r4.getFirst()
            r7.setValue(r4)
            androidx.lifecycle.MutableLiveData r7 = r2.getCurrentMin()
            kotlin.Pair r4 = r2.a()
            java.lang.Object r4 = r4.getSecond()
            r7.setValue(r4)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.snore.ui.viewmodel.SnoreMonitorViewModel.getRealTime(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
