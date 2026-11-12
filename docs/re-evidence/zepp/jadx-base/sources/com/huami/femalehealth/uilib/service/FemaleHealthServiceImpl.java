package com.huami.femalehealth.uilib.service;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.OnLifecycleEvent;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.uilib.AmazfitCalendarStatus;
import com.huami.femalehealth.uilib.AmazfitCardManager;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarNormalStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.ForecastStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.OvulationStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.PeriodStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.PregnantStyle;
import com.huami.fhservice.FemaleHealthService;
import com.huami.fhservice.ZeppCalendarStatus;
import com.huami.mifit.sportlib.common.DataTypeSource;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ;2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010,\u001a\u00020(¢\u0006\u0004\b9\u0010:J\u001a\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J+\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bJ+\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000bJ\u0013\u0010\u000f\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001b\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001aH\u0097@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0010J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u001dJ\u0019\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aH\u0097@ø\u0001\u0000¢\u0006\u0004\b \u0010\u0010J\u0019\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0010J\u001f\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u001aH\u0097@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0010J\u0019\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0097@ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0010J\u0013\u0010'\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0010R\u0019\u0010,\u001a\u00020(8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u001e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00100R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f0/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\u001f0/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R\"\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020%0/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0016\u00108\u001a\u0002068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lcom/huami/femalehealth/uilib/service/FemaleHealthServiceImpl;", "Lcom/huami/fhservice/FemaleHealthService;", "Lkotlin/Triple;", "", "b", "", "g", "year", "month", "day", "e", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", GoogleApiAvailabilityLight.a, "a", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "h", "(Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;)Ljava/lang/Integer;", "trigger", "setTriggerLifecycle", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "addObserver", "removeObserver", "Lkotlinx/coroutines/flow/Flow;", "getCurrentStatus", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "asFlow", "", "getCurrentStatusContent", "getCurrentStatusDetailContent", "", "Lcom/huami/fhservice/ZeppCalendarStatus;", "getCalendarStatus", "", "hasData", "clearCache", "Lcom/huami/femalehealth/uilib/AmazfitCardManager;", "Lcom/huami/femalehealth/uilib/AmazfitCardManager;", "getManager", "()Lcom/huami/femalehealth/uilib/AmazfitCardManager;", "manager", LogUtil.I, "triggerLifecycle", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "currentStatusLiveData", "currentStatusContentLiveData", "currentStatusDetailContentLiveData", "calendarStatusLiveData", "hasDataLiveData", "Landroidx/lifecycle/LifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "lifecycleObserver", "<init>", "(Lcom/huami/femalehealth/uilib/AmazfitCardManager;)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class FemaleHealthServiceImpl implements FemaleHealthService {

    @NotNull
    private static final String i = "FemaleHealthServiceImpl";
    private static final int j = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AmazfitCardManager manager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int triggerLifecycle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> currentStatusLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> currentStatusContentLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> currentStatusDetailContentLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<ZeppCalendarStatus>> calendarStatusLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> hasDataLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LifecycleObserver lifecycleObserver = new LifecycleObserver() { // from class: com.huami.femalehealth.uilib.service.FemaleHealthServiceImpl$lifecycleObserver$1
        @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
        public final void onCreate(@NotNull LifecycleOwner owner) {
            if ((this.a.triggerLifecycle & 1) > 0) {
                this.a.g();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy(@NotNull LifecycleOwner owner) {
            if ((this.a.triggerLifecycle & 32) > 0) {
                this.a.g();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPause(@NotNull LifecycleOwner owner) {
            if ((this.a.triggerLifecycle & 8) > 0) {
                this.a.g();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume(@NotNull LifecycleOwner owner) {
            if ((this.a.triggerLifecycle & 4) > 0) {
                this.a.g();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public final void onStart(@NotNull LifecycleOwner owner) {
            if ((this.a.triggerLifecycle & 2) > 0) {
                this.a.g();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public final void onStop(@NotNull LifecycleOwner owner) {
            if ((this.a.triggerLifecycle & 16) > 0) {
                this.a.g();
            }
        }
    };

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.service.FemaleHealthServiceImpl$asFlow$1", f = "FemaleHealthServiceImpl.kt", i = {0, 0, 0, 1, 1, 2, 2}, l = {128, 132, 133}, m = "invokeSuspend", n = {"$this$flow", "channel", "observer", "$this$flow", "observer", "$this$flow", "observer"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1"})
    public static final class a<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        private /* synthetic */ Object d;
        public final /* synthetic */ LiveData<T> e;

        /* JADX INFO: renamed from: com.huami.femalehealth.uilib.service.FemaleHealthServiceImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.service.FemaleHealthServiceImpl$asFlow$1$1", f = "FemaleHealthServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0409a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ LiveData<T> b;
            public final /* synthetic */ Observer<T> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0409a(LiveData<T> liveData, Observer<T> observer, Continuation<? super C0409a> continuation) {
                super(2, continuation);
                this.b = liveData;
                this.c = observer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0409a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0409a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.observeForever((Observer<? super T>) this.c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.service.FemaleHealthServiceImpl$asFlow$1$2", f = "FemaleHealthServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ LiveData<T> b;
            public final /* synthetic */ Observer<T> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(LiveData<T> liveData, Observer<T> observer, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = liveData;
                this.c = observer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.removeObserver((Observer<? super T>) this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LiveData<T> liveData, Continuation<? super a> continuation) {
            super(2, continuation);
            this.e = liveData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Channel channel, Object obj) {
            channel.offer(obj);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.e, continuation);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super T> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0099 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x009a  */
        /* JADX WARN: Code duplicated, block: B:31:0x00a7 A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #0 {all -> 0x00d8, blocks: (B:29:0x009f, B:31:0x00a7), top: B:45:0x009f }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00b9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v0 */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v22 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4, types: [androidx.lifecycle.Observer] */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v20 */
        /* JADX WARN: Type inference failed for: r6v3, types: [androidx.lifecycle.Observer, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ba -> B:47:0x008b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.femalehealth.uilib.service.FemaleHealthServiceImpl.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.service.FemaleHealthServiceImpl", f = "FemaleHealthServiceImpl.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_CHECKERS}, m = "getCalendarStatus", n = {}, s = {})
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
            return FemaleHealthServiceImpl.this.getCalendarStatus(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.service.FemaleHealthServiceImpl", f = "FemaleHealthServiceImpl.kt", i = {0}, l = {DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING}, m = "getCalendarStatusValue", n = {"this"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return FemaleHealthServiceImpl.this.a(0, 0, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.service.FemaleHealthServiceImpl", f = "FemaleHealthServiceImpl.kt", i = {}, l = {121}, m = "getCurrentStatus", n = {}, s = {})
    public static final class d extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return FemaleHealthServiceImpl.this.getCurrentStatus(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.service.FemaleHealthServiceImpl", f = "FemaleHealthServiceImpl.kt", i = {}, l = {150}, m = "getCurrentStatusContent", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return FemaleHealthServiceImpl.this.getCurrentStatusContent(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.service.FemaleHealthServiceImpl", f = "FemaleHealthServiceImpl.kt", i = {0}, l = {154}, m = "getCurrentStatusContentValue", n = {"this"}, s = {"L$0"})
    public static final class f extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return FemaleHealthServiceImpl.this.c(0, 0, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.service.FemaleHealthServiceImpl", f = "FemaleHealthServiceImpl.kt", i = {}, l = {161}, m = "getCurrentStatusDetailContent", n = {}, s = {})
    public static final class g extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return FemaleHealthServiceImpl.this.getCurrentStatusDetailContent(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.service.FemaleHealthServiceImpl", f = "FemaleHealthServiceImpl.kt", i = {0}, l = {165}, m = "getCurrentStatusDetailContentValue", n = {"this"}, s = {"L$0"})
    public static final class h extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return FemaleHealthServiceImpl.this.d(0, 0, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.service.FemaleHealthServiceImpl", f = "FemaleHealthServiceImpl.kt", i = {0}, l = {142}, m = "getCurrentStatusValue", n = {"this"}, s = {"L$0"})
    public static final class i extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return FemaleHealthServiceImpl.this.e(0, 0, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.service.FemaleHealthServiceImpl", f = "FemaleHealthServiceImpl.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_DISCO}, m = "hasData", n = {}, s = {})
    public static final class j extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return FemaleHealthServiceImpl.this.hasData(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.service.FemaleHealthServiceImpl", f = "FemaleHealthServiceImpl.kt", i = {}, l = {189}, m = "hasDataValue", n = {}, s = {})
    public static final class k extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return FemaleHealthServiceImpl.this.f(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.service.FemaleHealthServiceImpl$lifecycleEvent$1", f = "FemaleHealthServiceImpl.kt", i = {1, 2, 3}, l = {95, 97, 98, 99, 100, 101}, m = "invokeSuspend", n = {"descDate", "descDate", "descDate"}, s = {"L$0", "L$0", "L$0"})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FemaleHealthServiceImpl.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0079 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x00a5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x00d1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x00fe A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x010a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Triple tripleB;
            FemaleHealthServiceImpl femaleHealthServiceImpl;
            int iIntValue;
            int iIntValue2;
            int iIntValue3;
            FemaleHealthServiceImpl femaleHealthServiceImpl2;
            int iIntValue4;
            int iIntValue5;
            int iIntValue6;
            FemaleHealthServiceImpl femaleHealthServiceImpl3;
            int iIntValue7;
            int iIntValue8;
            int iIntValue9;
            FemaleHealthServiceImpl femaleHealthServiceImpl4;
            int iIntValue10;
            int iIntValue11;
            int iIntValue12;
            FemaleHealthServiceImpl femaleHealthServiceImpl5;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            switch (this.b) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    FemaleHealthServiceImpl femaleHealthServiceImpl6 = FemaleHealthServiceImpl.this;
                    this.b = 1;
                    if (femaleHealthServiceImpl6.clearCache(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tripleB = FemaleHealthServiceImpl.this.b();
                    femaleHealthServiceImpl = FemaleHealthServiceImpl.this;
                    iIntValue = ((Number) tripleB.getFirst()).intValue();
                    iIntValue2 = ((Number) tripleB.getSecond()).intValue();
                    iIntValue3 = ((Number) tripleB.getThird()).intValue();
                    this.a = tripleB;
                    this.b = 2;
                    if (femaleHealthServiceImpl.e(iIntValue, iIntValue2, iIntValue3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    femaleHealthServiceImpl2 = FemaleHealthServiceImpl.this;
                    iIntValue4 = ((Number) tripleB.getFirst()).intValue();
                    iIntValue5 = ((Number) tripleB.getSecond()).intValue();
                    iIntValue6 = ((Number) tripleB.getThird()).intValue();
                    this.a = tripleB;
                    this.b = 3;
                    if (femaleHealthServiceImpl2.c(iIntValue4, iIntValue5, iIntValue6, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    femaleHealthServiceImpl3 = FemaleHealthServiceImpl.this;
                    iIntValue7 = ((Number) tripleB.getFirst()).intValue();
                    iIntValue8 = ((Number) tripleB.getSecond()).intValue();
                    iIntValue9 = ((Number) tripleB.getThird()).intValue();
                    this.a = tripleB;
                    this.b = 4;
                    if (femaleHealthServiceImpl3.d(iIntValue7, iIntValue8, iIntValue9, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    femaleHealthServiceImpl4 = FemaleHealthServiceImpl.this;
                    iIntValue10 = ((Number) tripleB.getFirst()).intValue();
                    iIntValue11 = ((Number) tripleB.getSecond()).intValue();
                    iIntValue12 = ((Number) tripleB.getThird()).intValue();
                    this.a = null;
                    this.b = 5;
                    if (femaleHealthServiceImpl4.a(iIntValue10, iIntValue11, iIntValue12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    femaleHealthServiceImpl5 = FemaleHealthServiceImpl.this;
                    this.b = 6;
                    if (femaleHealthServiceImpl5.f(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    tripleB = FemaleHealthServiceImpl.this.b();
                    femaleHealthServiceImpl = FemaleHealthServiceImpl.this;
                    iIntValue = ((Number) tripleB.getFirst()).intValue();
                    iIntValue2 = ((Number) tripleB.getSecond()).intValue();
                    iIntValue3 = ((Number) tripleB.getThird()).intValue();
                    this.a = tripleB;
                    this.b = 2;
                    if (femaleHealthServiceImpl.e(iIntValue, iIntValue2, iIntValue3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    femaleHealthServiceImpl2 = FemaleHealthServiceImpl.this;
                    iIntValue4 = ((Number) tripleB.getFirst()).intValue();
                    iIntValue5 = ((Number) tripleB.getSecond()).intValue();
                    iIntValue6 = ((Number) tripleB.getThird()).intValue();
                    this.a = tripleB;
                    this.b = 3;
                    if (femaleHealthServiceImpl2.c(iIntValue4, iIntValue5, iIntValue6, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    femaleHealthServiceImpl3 = FemaleHealthServiceImpl.this;
                    iIntValue7 = ((Number) tripleB.getFirst()).intValue();
                    iIntValue8 = ((Number) tripleB.getSecond()).intValue();
                    iIntValue9 = ((Number) tripleB.getThird()).intValue();
                    this.a = tripleB;
                    this.b = 4;
                    if (femaleHealthServiceImpl3.d(iIntValue7, iIntValue8, iIntValue9, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    femaleHealthServiceImpl4 = FemaleHealthServiceImpl.this;
                    iIntValue10 = ((Number) tripleB.getFirst()).intValue();
                    iIntValue11 = ((Number) tripleB.getSecond()).intValue();
                    iIntValue12 = ((Number) tripleB.getThird()).intValue();
                    this.a = null;
                    this.b = 5;
                    if (femaleHealthServiceImpl4.a(iIntValue10, iIntValue11, iIntValue12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    femaleHealthServiceImpl5 = FemaleHealthServiceImpl.this;
                    this.b = 6;
                    if (femaleHealthServiceImpl5.f(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 2:
                    tripleB = (Triple) this.a;
                    ResultKt.throwOnFailure(obj);
                    femaleHealthServiceImpl2 = FemaleHealthServiceImpl.this;
                    iIntValue4 = ((Number) tripleB.getFirst()).intValue();
                    iIntValue5 = ((Number) tripleB.getSecond()).intValue();
                    iIntValue6 = ((Number) tripleB.getThird()).intValue();
                    this.a = tripleB;
                    this.b = 3;
                    if (femaleHealthServiceImpl2.c(iIntValue4, iIntValue5, iIntValue6, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    femaleHealthServiceImpl3 = FemaleHealthServiceImpl.this;
                    iIntValue7 = ((Number) tripleB.getFirst()).intValue();
                    iIntValue8 = ((Number) tripleB.getSecond()).intValue();
                    iIntValue9 = ((Number) tripleB.getThird()).intValue();
                    this.a = tripleB;
                    this.b = 4;
                    if (femaleHealthServiceImpl3.d(iIntValue7, iIntValue8, iIntValue9, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    femaleHealthServiceImpl4 = FemaleHealthServiceImpl.this;
                    iIntValue10 = ((Number) tripleB.getFirst()).intValue();
                    iIntValue11 = ((Number) tripleB.getSecond()).intValue();
                    iIntValue12 = ((Number) tripleB.getThird()).intValue();
                    this.a = null;
                    this.b = 5;
                    if (femaleHealthServiceImpl4.a(iIntValue10, iIntValue11, iIntValue12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    femaleHealthServiceImpl5 = FemaleHealthServiceImpl.this;
                    this.b = 6;
                    if (femaleHealthServiceImpl5.f(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 3:
                    tripleB = (Triple) this.a;
                    ResultKt.throwOnFailure(obj);
                    femaleHealthServiceImpl3 = FemaleHealthServiceImpl.this;
                    iIntValue7 = ((Number) tripleB.getFirst()).intValue();
                    iIntValue8 = ((Number) tripleB.getSecond()).intValue();
                    iIntValue9 = ((Number) tripleB.getThird()).intValue();
                    this.a = tripleB;
                    this.b = 4;
                    if (femaleHealthServiceImpl3.d(iIntValue7, iIntValue8, iIntValue9, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    femaleHealthServiceImpl4 = FemaleHealthServiceImpl.this;
                    iIntValue10 = ((Number) tripleB.getFirst()).intValue();
                    iIntValue11 = ((Number) tripleB.getSecond()).intValue();
                    iIntValue12 = ((Number) tripleB.getThird()).intValue();
                    this.a = null;
                    this.b = 5;
                    if (femaleHealthServiceImpl4.a(iIntValue10, iIntValue11, iIntValue12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    femaleHealthServiceImpl5 = FemaleHealthServiceImpl.this;
                    this.b = 6;
                    if (femaleHealthServiceImpl5.f(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 4:
                    tripleB = (Triple) this.a;
                    ResultKt.throwOnFailure(obj);
                    femaleHealthServiceImpl4 = FemaleHealthServiceImpl.this;
                    iIntValue10 = ((Number) tripleB.getFirst()).intValue();
                    iIntValue11 = ((Number) tripleB.getSecond()).intValue();
                    iIntValue12 = ((Number) tripleB.getThird()).intValue();
                    this.a = null;
                    this.b = 5;
                    if (femaleHealthServiceImpl4.a(iIntValue10, iIntValue11, iIntValue12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    femaleHealthServiceImpl5 = FemaleHealthServiceImpl.this;
                    this.b = 6;
                    if (femaleHealthServiceImpl5.f(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 5:
                    ResultKt.throwOnFailure(obj);
                    femaleHealthServiceImpl5 = FemaleHealthServiceImpl.this;
                    this.b = 6;
                    if (femaleHealthServiceImpl5.f(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public FemaleHealthServiceImpl(@NotNull AmazfitCardManager amazfitCardManager) {
        this.manager = amazfitCardManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i2, int i3, int i4, Continuation<? super Unit> continuation) {
        c cVar;
        FemaleHealthServiceImpl femaleHealthServiceImpl;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i5 = cVar.d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cVar.d = i5 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object calendarStatus = cVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i6 = cVar.d;
        if (i6 == 0) {
            ResultKt.throwOnFailure(calendarStatus);
            AmazfitCardManager manager = getManager();
            DateTriple dateTriple = new DateTriple(i2, i3, i4);
            cVar.a = this;
            cVar.d = 1;
            calendarStatus = manager.getCalendarStatus(dateTriple, cVar);
            if (calendarStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
            femaleHealthServiceImpl = this;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            femaleHealthServiceImpl = (FemaleHealthServiceImpl) cVar.a;
            ResultKt.throwOnFailure(calendarStatus);
        }
        Iterable<AmazfitCalendarStatus> iterable = (Iterable) calendarStatus;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (AmazfitCalendarStatus amazfitCalendarStatus : iterable) {
            arrayList.add(new ZeppCalendarStatus(amazfitCalendarStatus.getDate().getYear(), amazfitCalendarStatus.getDate().getMonth(), amazfitCalendarStatus.getDate().getDay(), femaleHealthServiceImpl.h(amazfitCalendarStatus.getStatus())));
        }
        femaleHealthServiceImpl.calendarStatusLiveData.postValue(arrayList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Triple<Integer, Integer, Integer> b() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return new Triple<>(Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(int i2, int i3, int i4, Continuation<? super Unit> continuation) {
        f fVar;
        FemaleHealthServiceImpl femaleHealthServiceImpl;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i5 = fVar.d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fVar.d = i5 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object currentStatusContent = fVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i6 = fVar.d;
        if (i6 == 0) {
            ResultKt.throwOnFailure(currentStatusContent);
            AmazfitCardManager manager = getManager();
            DateTriple dateTriple = new DateTriple(i2, i3, i4);
            fVar.a = this;
            fVar.d = 1;
            currentStatusContent = manager.getCurrentStatusContent(dateTriple, fVar);
            if (currentStatusContent == coroutine_suspended) {
                return coroutine_suspended;
            }
            femaleHealthServiceImpl = this;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            femaleHealthServiceImpl = (FemaleHealthServiceImpl) fVar.a;
            ResultKt.throwOnFailure(currentStatusContent);
        }
        femaleHealthServiceImpl.currentStatusContentLiveData.postValue((String) currentStatusContent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(int i2, int i3, int i4, Continuation<? super Unit> continuation) {
        h hVar;
        FemaleHealthServiceImpl femaleHealthServiceImpl;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i5 = hVar.d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                hVar.d = i5 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object currentStatusDetailContent = hVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i6 = hVar.d;
        if (i6 == 0) {
            ResultKt.throwOnFailure(currentStatusDetailContent);
            AmazfitCardManager manager = getManager();
            DateTriple dateTriple = new DateTriple(i2, i3, i4);
            hVar.a = this;
            hVar.d = 1;
            currentStatusDetailContent = manager.getCurrentStatusDetailContent(dateTriple, hVar);
            if (currentStatusDetailContent == coroutine_suspended) {
                return coroutine_suspended;
            }
            femaleHealthServiceImpl = this;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            femaleHealthServiceImpl = (FemaleHealthServiceImpl) hVar.a;
            ResultKt.throwOnFailure(currentStatusDetailContent);
        }
        femaleHealthServiceImpl.currentStatusDetailContentLiveData.postValue((String) currentStatusDetailContent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(int i2, int i3, int i4, Continuation<? super Unit> continuation) {
        i iVar;
        FemaleHealthServiceImpl femaleHealthServiceImpl;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i5 = iVar.d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                iVar.d = i5 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object realCurrentStatus = iVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i6 = iVar.d;
        if (i6 == 0) {
            ResultKt.throwOnFailure(realCurrentStatus);
            AmazfitCardManager manager = getManager();
            DateTriple dateTriple = new DateTriple(i2, i3, i4);
            iVar.a = this;
            iVar.d = 1;
            realCurrentStatus = manager.getRealCurrentStatus(dateTriple, iVar);
            if (realCurrentStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
            femaleHealthServiceImpl = this;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            femaleHealthServiceImpl = (FemaleHealthServiceImpl) iVar.a;
            ResultKt.throwOnFailure(realCurrentStatus);
        }
        CalendarPeriodStyle calendarPeriodStyle = (CalendarPeriodStyle) realCurrentStatus;
        femaleHealthServiceImpl.currentStatusLiveData.postValue(calendarPeriodStyle == null ? null : femaleHealthServiceImpl.h(calendarPeriodStyle));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(Continuation<? super Unit> continuation) {
        k kVar;
        MutableLiveData mutableLiveData;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.d = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object obj = kVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = kVar.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableLiveData<Boolean> mutableLiveData2 = this.hasDataLiveData;
            AmazfitCardManager manager = getManager();
            kVar.a = mutableLiveData2;
            kVar.d = 1;
            Object objHasData = manager.hasData(kVar);
            if (objHasData == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableLiveData = mutableLiveData2;
            obj = objHasData;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) kVar.a;
            ResultKt.throwOnFailure(obj);
        }
        mutableLiveData.postValue(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new l(null), 2, null);
    }

    private final Integer h(CalendarPeriodStyle calendarPeriodStyle) {
        if (calendarPeriodStyle instanceof CalendarNormalStyle) {
            return 1;
        }
        if (calendarPeriodStyle instanceof ForecastStyle) {
            return 2;
        }
        if (calendarPeriodStyle instanceof OvulationStyle) {
            return 3;
        }
        if (calendarPeriodStyle instanceof PeriodStyle) {
            return 4;
        }
        return calendarPeriodStyle instanceof PregnantStyle ? 5 : null;
    }

    @Override // com.huami.fhservice.FemaleHealthService
    public void addObserver(@NotNull LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().addObserver(this.lifecycleObserver);
    }

    @NotNull
    public final <T> Flow<T> asFlow(@NotNull LiveData<T> liveData) {
        return FlowKt.flow(new a(liveData, null));
    }

    @Override // com.huami.fhservice.FemaleHealthService
    @Nullable
    public Object clearCache(@NotNull Continuation<? super Unit> continuation) {
        getManager().clearCache();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.fhservice.FemaleHealthService
    @ExperimentalCoroutinesApi
    @Nullable
    public Object getCalendarStatus(@NotNull Continuation<? super Flow<? extends List<ZeppCalendarStatus>>> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.d;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Flow flow = (Flow) bVar.a;
            ResultKt.throwOnFailure(obj);
            return flow;
        }
        ResultKt.throwOnFailure(obj);
        Flow flowAsFlow = asFlow(this.calendarStatusLiveData);
        Triple<Integer, Integer, Integer> tripleB = b();
        int iIntValue = tripleB.getFirst().intValue();
        int iIntValue2 = tripleB.getSecond().intValue();
        int iIntValue3 = tripleB.getThird().intValue();
        bVar.a = flowAsFlow;
        bVar.d = 1;
        return a(iIntValue, iIntValue2, iIntValue3, bVar) == coroutine_suspended ? coroutine_suspended : flowAsFlow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.fhservice.FemaleHealthService
    @ExperimentalCoroutinesApi
    @Nullable
    public Object getCurrentStatus(@NotNull Continuation<? super Flow<Integer>> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.d = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = dVar.d;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Flow flow = (Flow) dVar.a;
            ResultKt.throwOnFailure(obj);
            return flow;
        }
        ResultKt.throwOnFailure(obj);
        Flow flowAsFlow = asFlow(this.currentStatusLiveData);
        Triple<Integer, Integer, Integer> tripleB = b();
        int iIntValue = tripleB.getFirst().intValue();
        int iIntValue2 = tripleB.getSecond().intValue();
        int iIntValue3 = tripleB.getThird().intValue();
        dVar.a = flowAsFlow;
        dVar.d = 1;
        return e(iIntValue, iIntValue2, iIntValue3, dVar) == coroutine_suspended ? coroutine_suspended : flowAsFlow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.fhservice.FemaleHealthService
    @ExperimentalCoroutinesApi
    @Nullable
    public Object getCurrentStatusContent(@NotNull Continuation<? super Flow<String>> continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.d = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = eVar.d;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Flow flow = (Flow) eVar.a;
            ResultKt.throwOnFailure(obj);
            return flow;
        }
        ResultKt.throwOnFailure(obj);
        Flow flowAsFlow = asFlow(this.currentStatusContentLiveData);
        Triple<Integer, Integer, Integer> tripleB = b();
        int iIntValue = tripleB.getFirst().intValue();
        int iIntValue2 = tripleB.getSecond().intValue();
        int iIntValue3 = tripleB.getThird().intValue();
        eVar.a = flowAsFlow;
        eVar.d = 1;
        return c(iIntValue, iIntValue2, iIntValue3, eVar) == coroutine_suspended ? coroutine_suspended : flowAsFlow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.fhservice.FemaleHealthService
    @Nullable
    public Object getCurrentStatusDetailContent(@NotNull Continuation<? super Flow<String>> continuation) {
        g gVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.d = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object obj = gVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = gVar.d;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Flow flow = (Flow) gVar.a;
            ResultKt.throwOnFailure(obj);
            return flow;
        }
        ResultKt.throwOnFailure(obj);
        Flow flowAsFlow = asFlow(this.currentStatusDetailContentLiveData);
        Triple<Integer, Integer, Integer> tripleB = b();
        int iIntValue = tripleB.getFirst().intValue();
        int iIntValue2 = tripleB.getSecond().intValue();
        int iIntValue3 = tripleB.getThird().intValue();
        gVar.a = flowAsFlow;
        gVar.d = 1;
        return d(iIntValue, iIntValue2, iIntValue3, gVar) == coroutine_suspended ? coroutine_suspended : flowAsFlow;
    }

    @NotNull
    public final AmazfitCardManager getManager() {
        return this.manager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.fhservice.FemaleHealthService
    @ExperimentalCoroutinesApi
    @Nullable
    public Object hasData(@NotNull Continuation<? super Flow<Boolean>> continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.d = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object obj = jVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = jVar.d;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Flow flow = (Flow) jVar.a;
            ResultKt.throwOnFailure(obj);
            return flow;
        }
        ResultKt.throwOnFailure(obj);
        Flow flowAsFlow = asFlow(this.hasDataLiveData);
        jVar.a = flowAsFlow;
        jVar.d = 1;
        return f(jVar) == coroutine_suspended ? coroutine_suspended : flowAsFlow;
    }

    @Override // com.huami.fhservice.FemaleHealthService
    public void removeObserver(@NotNull LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().removeObserver(this.lifecycleObserver);
    }

    @Override // com.huami.fhservice.FemaleHealthService
    public void setTriggerLifecycle(int trigger) {
        this.triggerLifecycle = trigger;
    }
}
