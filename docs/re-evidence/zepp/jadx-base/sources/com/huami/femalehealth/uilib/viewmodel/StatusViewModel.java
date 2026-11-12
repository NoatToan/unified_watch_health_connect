package com.huami.femalehealth.uilib.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.calendarview.Calendar;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.device.MenstruationDataManager;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.logiclib.repo.MenstruationRepo;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.ExtKt;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.widget.calendar.StyleCatch;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.StatusKt;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u0000 >2\u00020\u0001:\u0001>B\u0017\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tJ\u0010\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\n\u001a\u00020\tJ\u0010\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\tJ\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u0012\u001a\u00020\u0007J\u0006\u0010\u0013\u001a\u00020\u0007J\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0019\u001a\u00020\tJ\u0013\u0010\u001a\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\tJ\u0013\u0010\u001d\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001bR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R!\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0-8\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R3\u00108\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u000105040-8\u0006@\u0006¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u00102R\u001f\u0010;\u001a\b\u0012\u0004\u0012\u00020\f0-8\u0006@\u0006¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, d2 = {"Lcom/huami/femalehealth/uilib/viewmodel/StatusViewModel;", "Lcom/huami/femalehealth/uilib/viewmodel/FHBaseViewModel;", "Lkotlinx/coroutines/Job;", "b", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "catch", "", "a", "", "is24HourFormat", "syncTime", "", "getFmtSyncTime", "", "getSyncTime", "time", "formatSyncTime", "reCalculation", "calculation", "Lcom/huami/calendarview/Calendar;", "calendar", "Lkotlin/Pair;", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "calRenderStyle", "hasData", "suspendHasData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAndCheckHasData", "suspendUpdateAndCheckHasData", "Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", GoogleApiAvailabilityLight.a, "Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", "e", "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", "manager", "Lcom/huami/femalehealth/uilib/widget/calendar/StyleCatch;", "f", "Lcom/huami/femalehealth/uilib/widget/calendar/StyleCatch;", "styleCatch", "g", "Lcom/huami/calendarview/Calendar;", "now", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "h", "Landroidx/lifecycle/MutableLiveData;", "getRefreshLiveData", "()Landroidx/lifecycle/MutableLiveData;", "refreshLiveData", "Lkotlin/Triple;", "", "i", "getCurrentStyleLiveData", "currentStyleLiveData", z.j, "getSyncTimeLiveData", "syncTimeLiveData", "<init>", "(Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class StatusViewModel extends FHBaseViewModel {

    @NotNull
    private static final String k = "StatusViewModel";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MenstruationRepo repo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MenstruationDataManager manager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final StyleCatch styleCatch = StyleCatch.INSTANCE.getOverNowStyleCatch();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Calendar now = ExtKt.toCalendar(new Date());

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<DateTriple> refreshLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Triple<CalendarPeriodStyle, String, Object>> currentStyleLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> syncTimeLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<List<? extends DateTriple>, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends DateTriple> list) {
            invoke2((List<DateTriple>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<DateTriple> list) {
            StatusViewModel statusViewModel = StatusViewModel.this;
            for (DateTriple dateTriple : list) {
                statusViewModel.styleCatch.initMonthOfDayIfNull(dateTriple.getYear(), dateTriple.getMonth());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Ljava/util/Date;", "it", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.StatusViewModel$calculation$1$2", f = "StatusViewModel.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<List<? extends Date>, Continuation<? super List<? extends MenstruationVo>>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull List<? extends Date> list, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
            return ((b) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = StatusViewModel.this.new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<? extends Date> list = (List) this.b;
                MenstruationRepo menstruationRepo = StatusViewModel.this.repo;
                this.a = 1;
                obj = menstruationRepo.getMenstruationOfDay(list, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<MenstruationVo, Unit> {
        public c() {
            super(1);
        }

        public final void a(@NotNull MenstruationVo menstruationVo) {
            StatusViewModel.this.styleCatch.put(ExtKt.toCalendar(menstruationVo.getDate()), TuplesKt.to(menstruationVo.getInPeriod() ? StatusKt.getPeriodStyle() : StatusKt.getNormalStyle(), menstruationVo), false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MenstruationVo menstruationVo) {
            a(menstruationVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljava/util/Date;", "it", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.StatusViewModel$calculation$1$4", f = "StatusViewModel.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<Date, Continuation<? super List<? extends MenstruationVo>>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Date date, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
            return ((d) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = StatusViewModel.this.new d(continuation);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Date date = (Date) this.b;
                MenstruationRepo menstruationRepo = StatusViewModel.this.repo;
                this.a = 1;
                obj = menstruationRepo.getLastMenstruation(date, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StatusViewModel.this.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j, boolean z) {
            super(0);
            this.a = j;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getFmtSyncTime:" + this.a + " is24HourFormat:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j, boolean z) {
            super(0);
            this.a = j;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getSyncTime:" + this.a + " is24HourFormat:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.StatusViewModel$hasData$1", f = "StatusViewModel.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return StatusViewModel.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MenstruationRepo menstruationRepo = StatusViewModel.this.repo;
                Date date = AidKt.toDate(DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null));
                this.a = 1;
                obj = menstruationRepo.getLastMenstruation(date, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Boxing.boxBoolean(!((Collection) obj).isEmpty());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljava/util/Date;", "it", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.StatusViewModel$refresh$1$1", f = "StatusViewModel.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<Date, Continuation<? super List<? extends MenstruationVo>>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Date date, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
            return ((i) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            i iVar = StatusViewModel.this.new i(continuation);
            iVar.b = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Date date = (Date) this.b;
                MenstruationRepo menstruationRepo = StatusViewModel.this.repo;
                this.a = 1;
                obj = menstruationRepo.getLastMenstruation(date, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.StatusViewModel$suspendHasData$2", f = "StatusViewModel.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return StatusViewModel.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MenstruationRepo menstruationRepo = StatusViewModel.this.repo;
                Date date = AidKt.toDate(DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null));
                this.a = 1;
                obj = menstruationRepo.getLastMenstruation(date, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Boxing.boxBoolean(!((Collection) obj).isEmpty());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.StatusViewModel", f = "StatusViewModel.kt", i = {}, l = {219}, m = "suspendUpdateAndCheckHasData", n = {}, s = {})
    public static final class k extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return StatusViewModel.this.suspendUpdateAndCheckHasData(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.StatusViewModel$suspendUpdateAndCheckHasData$2$1", f = "StatusViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return StatusViewModel.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StatusViewModel.this.manager.updateFromCloud(10);
            return Boxing.boxBoolean(!StatusViewModel.this.repo.queryAll().isEmpty());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(long j, boolean z) {
            super(0);
            this.a = j;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "syncTime:" + this.a + " is24HourFormat:" + this.b;
        }
    }

    public StatusViewModel(@NotNull MenstruationRepo menstruationRepo, @NotNull MenstruationDataManager menstruationDataManager) {
        this.repo = menstruationRepo;
        this.manager = menstruationDataManager;
        syncTime$default(this, false, 1, null);
    }

    private final void a(List<MenstruationVo> list) {
        for (MenstruationVo menstruationVo : list) {
            this.styleCatch.put(ExtKt.toCalendar(menstruationVo.getDate()), TuplesKt.to(menstruationVo.getInPeriod() ? StatusKt.getPeriodStyle() : StatusKt.getNormalStyle(), menstruationVo), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job b() {
        CoroutineContext io2 = Dispatchers.getIO();
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        if (!Intrinsics.areEqual(io2, FHBaseViewModel.c)) {
            io2 = io2.plus(FHBaseViewModel.c);
        }
        return BuildersKt.launch(ViewModelKt.getViewModelScope(this), io2, coroutineStart, new StatusViewModel$refresh$$inlined$safeLaunch$uilib_release$default$1(null, this));
    }

    public static /* synthetic */ String getFmtSyncTime$default(StatusViewModel statusViewModel, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return statusViewModel.getFmtSyncTime(z);
    }

    public static /* synthetic */ long getSyncTime$default(StatusViewModel statusViewModel, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return statusViewModel.getSyncTime(z);
    }

    public static /* synthetic */ void syncTime$default(StatusViewModel statusViewModel, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        statusViewModel.syncTime(z);
    }

    @NotNull
    public final Pair<CalendarPeriodStyle, MenstruationVo> calRenderStyle(@NotNull Calendar calendar) {
        Pair<CalendarPeriodStyle, MenstruationVo> dayStyle = this.styleCatch.getDayStyle(calendar);
        return dayStyle == null ? TuplesKt.to(StatusKt.getNormalStyle(), MenstruationVo.INSTANCE.getEMPTY()) : dayStyle;
    }

    public final void calculation() {
        CoroutineContext io2 = Dispatchers.getIO();
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        if (!Intrinsics.areEqual(io2, FHBaseViewModel.c)) {
            io2 = io2.plus(FHBaseViewModel.c);
        }
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), io2, coroutineStart, new StatusViewModel$calculation$$inlined$safeLaunch$uilib_release$default$1(null, this));
    }

    @NotNull
    public final String formatSyncTime(long time, boolean is24HourFormat) {
        return new SimpleDateFormat(ResourceHelper.INSTANCE.getString(is24HourFormat ? R.string.fh_time_format_without_year_and_hour_desc_with_second : R.string.fh_time_format_without_year_and_second_with_hour_desc), Locale.getDefault()).format(Long.valueOf(time));
    }

    @NotNull
    public final MutableLiveData<Triple<CalendarPeriodStyle, String, Object>> getCurrentStyleLiveData() {
        return this.currentStyleLiveData;
    }

    @NotNull
    public final String getFmtSyncTime(boolean is24HourFormat) {
        long timeInMillis = this.manager.getFemaleDataSyncTime().getTimeInMillis();
        HMLog.info("xys_StatusViewModel", new f(timeInMillis, is24HourFormat));
        return timeInMillis == 0 ? "" : formatSyncTime(timeInMillis, is24HourFormat);
    }

    @NotNull
    public final MutableLiveData<DateTriple> getRefreshLiveData() {
        return this.refreshLiveData;
    }

    public final long getSyncTime(boolean is24HourFormat) {
        long timeInMillis = this.manager.getFemaleDataSyncTime().getTimeInMillis();
        HMLog.info("xys_StatusViewModel", new g(timeInMillis, is24HourFormat));
        return timeInMillis;
    }

    @NotNull
    public final MutableLiveData<String> getSyncTimeLiveData() {
        return this.syncTimeLiveData;
    }

    public final boolean hasData() {
        return ((Boolean) BuildersKt.runBlocking(Dispatchers.getIO(), new h(null))).booleanValue();
    }

    public final void reCalculation() {
        StyleCatch.clearAll$default(this.styleCatch, false, 1, null);
        calculation();
    }

    @Nullable
    public final Object suspendHasData(@NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new j(null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object suspendUpdateAndCheckHasData(@NotNull Continuation<? super Boolean> continuation) {
        k kVar;
        Object objM3845constructorimpl;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.c = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object objWithContext = kVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = kVar.c;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objWithContext);
                Result.Companion companion = Result.Companion;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                l lVar = new l(null);
                kVar.c = 1;
                objWithContext = BuildersKt.withContext(io2, lVar, kVar);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithContext);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(((Boolean) objWithContext).booleanValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = (Boolean) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        return Boxing.boxBoolean(bool == null ? false : bool.booleanValue());
    }

    public final void syncTime(boolean is24HourFormat) {
        long timeInMillis = this.manager.getFemaleDataSyncTime().getTimeInMillis();
        HMLog.info("xys_StatusViewModel", new m(timeInMillis, is24HourFormat));
        getSyncTimeLiveData().postValue(timeInMillis == 0 ? "" : formatSyncTime(timeInMillis, is24HourFormat));
    }

    public final boolean updateAndCheckHasData() {
        this.manager.updateFromCloud(10);
        return !this.repo.queryAll().isEmpty();
    }
}
