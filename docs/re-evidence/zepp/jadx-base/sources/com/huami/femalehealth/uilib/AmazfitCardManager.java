package com.huami.femalehealth.uilib;

import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.calendarview.Calendar;
import com.huami.femalehealth.logiclib.api.FemaleHealthWebApi;
import com.huami.femalehealth.logiclib.api.pojo.FirstUseInfoBean;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.calculation.BasicInputValue;
import com.huami.femalehealth.logiclib.calculation.FHCalculation;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.logiclib.manager.DataCacheManager;
import com.huami.femalehealth.logiclib.repo.MenstruationRepo;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.femalehealth.uilib.helper.ExtKt;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.widget.calendar.CalculationManager;
import com.huami.femalehealth.uilib.widget.calendar.StyleCatch;
import com.huami.femalehealth.uilib.widget.calendar.content.BaseCardContentStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.StatusKt;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.log.HMLog;
import com.huami.widget.wheelview.Constant;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 (2\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b&\u0010'J\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002J)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0011J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0011J\u0013\u0010\u0018\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0004J\u0006\u0010\u0019\u001a\u00020\u0002R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u0016\u0010%\u001a\u00020\u00058B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/huami/femalehealth/uilib/AmazfitCardManager;", "", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "dateTriple", "", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "descStatus", "", "count", "Lcom/huami/femalehealth/uilib/AmazfitCalendarStatus;", "c", "b", "(Lcom/huami/femalehealth/logiclib/helper/DateTriple;Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRealCurrentStatus", "(Lcom/huami/femalehealth/logiclib/helper/DateTriple;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentStatus", "", "getCurrentStatusContent", "getCurrentStatusDetailContent", "getCalendarStatus", "", "hasData", "clearCache", "Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", "Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "webApi", "Lcom/huami/femalehealth/uilib/widget/calendar/StyleCatch;", "Lcom/huami/femalehealth/uilib/widget/calendar/StyleCatch;", "styleCatch", "e", "()Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "now", "<init>", "(Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class AmazfitCardManager {

    @NotNull
    private static final String d = "AmazfitCardManager";
    private static final int e = 5;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MenstruationRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final FemaleHealthWebApi webApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final StyleCatch styleCatch = StyleCatch.INSTANCE.getOverNowStyleCatch();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.AmazfitCardManager", f = "AmazfitCardManager.kt", i = {}, l = {64, 98}, m = "addToCatchIfEmpty", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public Object a;
        public int b;
        public int c;
        public /* synthetic */ Object d;
        public int f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return AmazfitCardManager.this.a(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("addToCatchIfEmpty:", Boolean.valueOf(AmazfitCardManager.this.styleCatch.isEmpty()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<List<? extends DateTriple>, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends DateTriple> list) {
            invoke2((List<DateTriple>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<DateTriple> list) {
            AmazfitCardManager amazfitCardManager = AmazfitCardManager.this;
            for (DateTriple dateTriple : list) {
                amazfitCardManager.styleCatch.initMonthOfDayIfNull(dateTriple.getYear(), dateTriple.getMonth());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Ljava/util/Date;", "it", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.AmazfitCardManager$addToCatchIfEmpty$6", f = "AmazfitCardManager.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<List<? extends Date>, Continuation<? super List<? extends MenstruationVo>>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull List<? extends Date> list, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
            return ((d) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = AmazfitCardManager.this.new d(continuation);
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
                List<? extends Date> list = (List) this.b;
                MenstruationRepo menstruationRepo = AmazfitCardManager.this.repo;
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
    public static final class e extends Lambda implements Function1<MenstruationVo, Unit> {
        public e() {
            super(1);
        }

        public final void a(@NotNull MenstruationVo menstruationVo) {
            AmazfitCardManager.this.styleCatch.put(ExtKt.toCalendar(menstruationVo.getDate()), TuplesKt.to(menstruationVo.getInPeriod() ? StatusKt.getPeriodStyle() : StatusKt.getNormalStyle(), menstruationVo), false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MenstruationVo menstruationVo) {
            a(menstruationVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljava/util/Date;", "it", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.AmazfitCardManager$addToCatchIfEmpty$8", f = "AmazfitCardManager.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<Date, Continuation<? super List<? extends MenstruationVo>>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Date date, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
            return ((f) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            f fVar = AmazfitCardManager.this.new f(continuation);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Date date = (Date) this.b;
                MenstruationRepo menstruationRepo = AmazfitCardManager.this.repo;
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
    public static final class g extends Lambda implements Function0<Unit> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.AmazfitCardManager", f = "AmazfitCardManager.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {194, Constant.WEIGHT_DEFAULT_IMPERIAL, Constant.WEIGHT_DEFAULT_IMPERIAL, 199}, m = "getCalendarStatus", n = {"this", "dateTriple", "this", "dateTriple", "this", "dateTriple", "this", "dateTriple"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class h extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return AmazfitCardManager.this.getCalendarStatus(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ List<DateTriple> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(List<DateTriple> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("statusList:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("todayIndex:", Integer.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ List<AmazfitCalendarStatus> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(List<AmazfitCalendarStatus> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("getCalendarStatus:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.AmazfitCardManager", f = "AmazfitCardManager.kt", i = {0, 0}, l = {125}, m = "getCurrentStatus", n = {"this", "dateTriple"}, s = {"L$0", "L$1"})
    public static final class l extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return AmazfitCardManager.this.getCurrentStatus(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ CalendarPeriodStyle a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(CalendarPeriodStyle calendarPeriodStyle) {
            super(0);
            this.a = calendarPeriodStyle;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("getCurrentStatus:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.AmazfitCardManager", f = "AmazfitCardManager.kt", i = {0, 0}, l = {135}, m = "getCurrentStatusContent", n = {"this", "dateTriple"}, s = {"L$0", "L$1"})
    public static final class n extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public n(Continuation<? super n> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return AmazfitCardManager.this.getCurrentStatusContent(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("getCurrentStatusContent:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.AmazfitCardManager", f = "AmazfitCardManager.kt", i = {0, 0}, l = {DataTypeSource.SPORT_TYPE_SHOOT, 180}, m = "getCurrentStatusDetailContent", n = {"this", "dateTriple"}, s = {"L$0", "L$1"})
    public static final class p extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return AmazfitCardManager.this.getCurrentStatusDetailContent(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("getCurrentStatusDetailContent:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljava/util/Date;", "it", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.AmazfitCardManager$getCurrentStatusDetailContent$content$1", f = "AmazfitCardManager.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_BOULDERING}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<Date, Continuation<? super List<? extends MenstruationVo>>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public r(Continuation<? super r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Date date, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
            return ((r) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            r rVar = AmazfitCardManager.this.new r(continuation);
            rVar.b = obj;
            return rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Date date = (Date) this.b;
                MenstruationRepo menstruationRepo = AmazfitCardManager.this.repo;
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.AmazfitCardManager", f = "AmazfitCardManager.kt", i = {0}, l = {279}, m = "getNearSameStatus", n = {"list"}, s = {"L$3"})
    public static final class s extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public s(Continuation<? super s> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return AmazfitCardManager.this.b(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<String> {
        public final /* synthetic */ Pair<CalendarPeriodStyle, MenstruationVo> a;
        public final /* synthetic */ DateTriple b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public t(Pair<? extends CalendarPeriodStyle, MenstruationVo> pair, DateTriple dateTriple) {
            super(0);
            this.a = pair;
            this.b = dateTriple;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "status:" + this.a + StringUtil.SPACE + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<String> {
        public final /* synthetic */ Pair<CalendarPeriodStyle, MenstruationVo> a;
        public final /* synthetic */ Ref.ObjectRef<DateTriple> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public u(Pair<? extends CalendarPeriodStyle, MenstruationVo> pair, Ref.ObjectRef<DateTriple> objectRef) {
            super(0);
            this.a = pair;
            this.b = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            MenstruationVo second;
            StringBuilder sb = new StringBuilder();
            sb.append("nextStatus:");
            sb.append(this.a);
            sb.append(StringUtil.SPACE);
            sb.append(this.b.element);
            sb.append("  ");
            Pair<CalendarPeriodStyle, MenstruationVo> pair = this.a;
            Date date = null;
            if (pair != null && (second = pair.getSecond()) != null) {
                date = second.getDate();
            }
            sb.append(date);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<String> {
        public final /* synthetic */ Triple<CalendarPeriodStyle, MenstruationVo, DateTriple> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public v(Triple<? extends CalendarPeriodStyle, MenstruationVo, DateTriple> triple) {
            super(0);
            this.a = triple;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("it:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.AmazfitCardManager", f = "AmazfitCardManager.kt", i = {0, 0}, l = {114, 115}, m = "getRealCurrentStatus", n = {"this", "dateTriple"}, s = {"L$0", "L$1"})
    public static final class w extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public w(Continuation<? super w> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return AmazfitCardManager.this.getRealCurrentStatus(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function0<String> {
        public final /* synthetic */ CalendarPeriodStyle a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(CalendarPeriodStyle calendarPeriodStyle) {
            super(0);
            this.a = calendarPeriodStyle;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("getRealCurrentStatus:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("hasData:", Boolean.valueOf(this.a));
        }
    }

    public AmazfitCardManager(@NotNull MenstruationRepo menstruationRepo, @NotNull FemaleHealthWebApi femaleHealthWebApi) {
        this.repo = menstruationRepo;
        this.webApi = femaleHealthWebApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0018 A[Catch: all -> 0x0186, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:10:0x001d, B:14:0x002f, B:57:0x017e, B:15:0x0034, B:16:0x003b, B:17:0x003c, B:51:0x0137, B:53:0x0143, B:60:0x0182, B:18:0x0049, B:20:0x005e, B:22:0x0069, B:26:0x0082, B:30:0x0090, B:34:0x009e, B:42:0x00b7, B:37:0x00aa, B:33:0x009a, B:29:0x008c, B:25:0x007e, B:43:0x00c0, B:45:0x00e2, B:46:0x00f7, B:9:0x0018), top: B:66:0x0005 }] */
    public final synchronized Object a(Continuation<? super Unit> continuation) {
        a aVar;
        int i2;
        AmazfitCardManager amazfitCardManager;
        int i3;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i4 = aVar.f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.f = i4 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object obj = aVar2.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i5 = aVar2.f;
        if (i5 != 0) {
            if (i5 == 1) {
                i3 = aVar2.c;
                i2 = aVar2.b;
                amazfitCardManager = (AmazfitCardManager) aVar2.a;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        HMLog.warn$default("xys_AmazfitCardManager", null, new b(), 2, null);
        if (this.styleCatch.isEmpty()) {
            ApiResponse<FirstUseInfoBean> firstUseInfo = DataCacheManager.INSTANCE.getFirstUseInfo();
            if (firstUseInfo instanceof ApiSuccessResponse) {
                FirstUseInfoBean firstUseInfoBean = (FirstUseInfoBean) ((ApiSuccessResponse) firstUseInfo).getBody();
                CalculationManager calculationManager = CalculationManager.INSTANCE;
                Long lastMenstrualTime = firstUseInfoBean.getLastMenstrualTime();
                long jLongValue = lastMenstrualTime == null ? 0L : lastMenstrualTime.longValue();
                Long estimatedMenstrualDays = firstUseInfoBean.getEstimatedMenstrualDays();
                int iLongValue = (int) (estimatedMenstrualDays == null ? 5L : estimatedMenstrualDays.longValue());
                Long menstrualCycle = firstUseInfoBean.getMenstrualCycle();
                int iLongValue2 = (int) (menstrualCycle == null ? 28L : menstrualCycle.longValue());
                Long intelligentPrediction = firstUseInfoBean.getIntelligentPrediction();
                calculationManager.initBasicInputValue(new BasicInputValue(jLongValue, iLongValue, iLongValue2, (intelligentPrediction == null ? 1L : intelligentPrediction.longValue()) == 1));
            }
            int year = e().getYear();
            int month = e().getMonth();
            CalculationManager calculationManager2 = CalculationManager.INSTANCE;
            int iCeil = (int) Math.ceil(5.0f);
            ArrayList arrayList = new ArrayList(iCeil);
            for (int i6 = 0; i6 < iCeil; i6++) {
                arrayList.add(DateHelper.INSTANCE.preMonth(year, month, Boxing.boxInt(i6).intValue() + 1));
            }
            arrayList.add(new DateTriple(year, month, 1));
            arrayList.add(DateHelper.nextMonth$default(DateHelper.INSTANCE, year, month, 0, 4, null));
            Unit unit = Unit.INSTANCE;
            c cVar = new c();
            d dVar = new d(null);
            e eVar = new e();
            aVar2.a = this;
            aVar2.b = year;
            aVar2.c = month;
            aVar2.f = 1;
            if (calculationManager2.putMonthStyle(arrayList, cVar, dVar, eVar, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i2 = year;
            amazfitCardManager = this;
            i3 = month;
        }
        return Unit.INSTANCE;
        if (FHCalculation.INSTANCE.getBasicInputValue().getEnablePredict()) {
            DateHelper dateHelper = DateHelper.INSTANCE;
            DateTriple dateTripleOffsetDay = dateHelper.offsetDay(101, AidKt.toMilli(new DateTriple(i2, i3, dateHelper.getMonthOfDay(i2, i3))).getValue());
            CalculationManager calculationManager3 = CalculationManager.INSTANCE;
            Calendar calendar = ExtKt.toCalendar(amazfitCardManager.e());
            StyleCatch styleCatch = amazfitCardManager.styleCatch;
            f fVar = amazfitCardManager.new f(null);
            g gVar = g.a;
            aVar2.a = null;
            aVar2.f = 2;
            if (calculationManager3.predictionMenstruation(calendar, dateTripleOffsetDay, styleCatch, fVar, null, gVar, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(DateTriple dateTriple, CalendarPeriodStyle calendarPeriodStyle, Continuation<? super List<DateTriple>> continuation) {
        s sVar;
        DateTriple dateTriple2;
        List list;
        AmazfitCardManager amazfitCardManager;
        if (continuation instanceof s) {
            sVar = (s) continuation;
            int i2 = sVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.g = i2 - Integer.MIN_VALUE;
            } else {
                sVar = new s(continuation);
            }
        } else {
            sVar = new s(continuation);
        }
        Object obj = sVar.e;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = sVar.g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            sVar.a = this;
            sVar.b = dateTriple;
            sVar.c = calendarPeriodStyle;
            sVar.d = arrayList;
            sVar.g = 1;
            Object currentStatus = getCurrentStatus(dateTriple, sVar);
            if (currentStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
            dateTriple2 = dateTriple;
            list = arrayList;
            obj = currentStatus;
            amazfitCardManager = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) sVar.d;
            calendarPeriodStyle = (CalendarPeriodStyle) sVar.c;
            dateTriple2 = (DateTriple) sVar.b;
            amazfitCardManager = (AmazfitCardManager) sVar.a;
            ResultKt.throwOnFailure(obj);
        }
        if (Intrinsics.areEqual(obj, calendarPeriodStyle)) {
            list.add(dateTriple2);
        }
        int i4 = 0;
        while (true) {
            i4++;
            Pair<CalendarPeriodStyle, MenstruationVo> dayStyle = amazfitCardManager.styleCatch.getDayStyle(ExtKt.toCalendar(dateTriple2.offsetDay(i4)));
            if (!Intrinsics.areEqual(calendarPeriodStyle, dayStyle == null ? null : dayStyle.getFirst())) {
                break;
            }
            list.add(dateTriple2.offsetDay(i4));
        }
        int i5 = 0;
        while (true) {
            i5--;
            Pair<CalendarPeriodStyle, MenstruationVo> dayStyle2 = amazfitCardManager.styleCatch.getDayStyle(ExtKt.toCalendar(dateTriple2.offsetDay(i5)));
            if (!Intrinsics.areEqual(calendarPeriodStyle, dayStyle2 == null ? null : dayStyle2.getFirst())) {
                return list;
            }
            list.add(0, dateTriple2.offsetDay(i5));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, com.huami.femalehealth.logiclib.helper.DateTriple] */
    /* JADX WARN: Type inference failed for: r9v7, types: [T, com.huami.femalehealth.logiclib.helper.DateTriple] */
    private final List<AmazfitCalendarStatus> c(DateTriple dateTriple, List<? extends CalendarPeriodStyle> descStatus, int count) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = dateTriple;
        ArrayList arrayList = new ArrayList();
        Pair<CalendarPeriodStyle, MenstruationVo> dayStyle = this.styleCatch.getDayStyle(ExtKt.toCalendar((DateTriple) objectRef.element));
        HMLog.info("xys_AmazfitCardManager", new t(dayStyle, dateTriple));
        if (dayStyle != null) {
            arrayList.add(new Triple(dayStyle.getFirst(), dayStyle.getSecond(), objectRef.element));
        }
        while (arrayList.size() < count) {
            ?? OffsetDay = ((DateTriple) objectRef.element).offsetDay(1);
            objectRef.element = OffsetDay;
            Pair<CalendarPeriodStyle, MenstruationVo> dayStyle2 = this.styleCatch.getDayStyle(ExtKt.toCalendar((DateTriple) OffsetDay));
            HMLog.info("xys_AmazfitCardManager", new u(dayStyle2, objectRef));
            if (!CollectionsKt___CollectionsKt.contains(descStatus, dayStyle2 == null ? null : dayStyle2.getFirst())) {
                break;
            }
            if (dayStyle2 != null) {
                arrayList.add(new Triple(dayStyle2.getFirst(), dayStyle2.getSecond(), objectRef.element));
            }
        }
        objectRef.element = dateTriple;
        while (arrayList.size() < count) {
            ?? OffsetDay2 = ((DateTriple) objectRef.element).offsetDay(-1);
            objectRef.element = OffsetDay2;
            Pair<CalendarPeriodStyle, MenstruationVo> dayStyle3 = this.styleCatch.getDayStyle(ExtKt.toCalendar((DateTriple) OffsetDay2));
            if (!CollectionsKt___CollectionsKt.contains(descStatus, dayStyle3 == null ? null : dayStyle3.getFirst())) {
                break;
            }
            if (dayStyle3 != null) {
                arrayList.add(0, new Triple(dayStyle3.getFirst(), dayStyle3.getSecond(), objectRef.element));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            HMLog.info("xys_AmazfitCardManager", new v((Triple) it2.next()));
        }
        List<Triple> listFilterNotNull = CollectionsKt___CollectionsKt.filterNotNull(arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFilterNotNull, 10));
        for (Triple triple : listFilterNotNull) {
            arrayList2.add(new AmazfitCalendarStatus((DateTriple) triple.getThird(), (CalendarPeriodStyle) triple.getFirst(), (MenstruationVo) triple.getSecond()));
        }
        return arrayList2;
    }

    public static /* synthetic */ List d(AmazfitCardManager amazfitCardManager, DateTriple dateTriple, List list, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 5;
        }
        return amazfitCardManager.c(dateTriple, list, i2);
    }

    private final DateTriple e() {
        return DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null);
    }

    public static /* synthetic */ Object getCalendarStatus$default(AmazfitCardManager amazfitCardManager, DateTriple dateTriple, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dateTriple = amazfitCardManager.e();
        }
        return amazfitCardManager.getCalendarStatus(dateTriple, continuation);
    }

    public static /* synthetic */ Object getCurrentStatus$default(AmazfitCardManager amazfitCardManager, DateTriple dateTriple, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dateTriple = amazfitCardManager.e();
        }
        return amazfitCardManager.getCurrentStatus(dateTriple, continuation);
    }

    public static /* synthetic */ Object getCurrentStatusContent$default(AmazfitCardManager amazfitCardManager, DateTriple dateTriple, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dateTriple = amazfitCardManager.e();
        }
        return amazfitCardManager.getCurrentStatusContent(dateTriple, continuation);
    }

    public static /* synthetic */ Object getCurrentStatusDetailContent$default(AmazfitCardManager amazfitCardManager, DateTriple dateTriple, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dateTriple = amazfitCardManager.e();
        }
        return amazfitCardManager.getCurrentStatusDetailContent(dateTriple, continuation);
    }

    public static /* synthetic */ Object getRealCurrentStatus$default(AmazfitCardManager amazfitCardManager, DateTriple dateTriple, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dateTriple = amazfitCardManager.e();
        }
        return amazfitCardManager.getRealCurrentStatus(dateTriple, continuation);
    }

    public final void clearCache() {
        this.styleCatch.clearAll(true);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:45:0x0101  */
    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Code duplicated, block: B:49:0x0122  */
    /* JADX WARN: Code duplicated, block: B:50:0x0124  */
    /* JADX WARN: Code duplicated, block: B:52:0x012c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0132  */
    /* JADX WARN: Code duplicated, block: B:55:0x0134  */
    /* JADX WARN: Code duplicated, block: B:57:0x0143  */
    /* JADX WARN: Code duplicated, block: B:59:0x014d  */
    /* JADX WARN: Code duplicated, block: B:60:0x014f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0159  */
    /* JADX WARN: Code duplicated, block: B:63:0x0174  */
    /* JADX WARN: Code duplicated, block: B:65:0x017b A[LOOP:2: B:64:0x0179->B:65:0x017b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.ArrayList] */
    @Nullable
    public final Object getCalendarStatus(@NotNull DateTriple dateTriple, @NotNull Continuation<? super List<AmazfitCalendarStatus>> continuation) {
        h hVar;
        DateTriple dateTriple2;
        AmazfitCardManager amazfitCardManager;
        DateTriple dateTriple3;
        AmazfitCardManager amazfitCardManager2;
        DateTriple dateTriple4;
        DateTriple dateTriple5;
        DateTriple dateTriple6;
        AmazfitCardManager amazfitCardManager3;
        CalendarPeriodStyle calendarPeriodStyle;
        boolean zAreEqual;
        boolean zAreEqual2;
        int i2;
        boolean zAreEqual3;
        ?? arrayList;
        List mutableList;
        AmazfitCalendarStatus amazfitCalendarStatus;
        DateTriple dateTripleOffsetDay;
        Pair<CalendarPeriodStyle, MenstruationVo> dayStyle;
        CalendarPeriodStyle first;
        MenstruationVo second;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i3 = hVar.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.g = i3 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object objB = hVar.e;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = hVar.g;
        if (i4 != 0) {
            if (i4 == 1) {
                DateTriple dateTriple7 = (DateTriple) hVar.b;
                amazfitCardManager = (AmazfitCardManager) hVar.a;
                ResultKt.throwOnFailure(objB);
                dateTriple2 = dateTriple7;
            } else if (i4 == 2) {
                dateTriple4 = (DateTriple) hVar.d;
                amazfitCardManager = (AmazfitCardManager) hVar.c;
                dateTriple3 = (DateTriple) hVar.b;
                amazfitCardManager2 = (AmazfitCardManager) hVar.a;
                ResultKt.throwOnFailure(objB);
                hVar.a = amazfitCardManager2;
                hVar.b = dateTriple3;
                hVar.c = null;
                hVar.d = null;
                hVar.g = 3;
                objB = amazfitCardManager.b(dateTriple4, (CalendarPeriodStyle) objB, hVar);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dateTriple5 = dateTriple3;
                List list = (List) objB;
                HMLog.info("xys_AmazfitCardManager", new i(list));
                HMLog.info("xys_AmazfitCardManager", new j(list.indexOf(dateTriple5)));
                hVar.a = amazfitCardManager2;
                hVar.b = dateTriple5;
                hVar.g = 4;
                objB = amazfitCardManager2.getCurrentStatus(dateTriple5, hVar);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dateTriple6 = dateTriple5;
                amazfitCardManager3 = amazfitCardManager2;
            } else if (i4 == 3) {
                dateTriple5 = (DateTriple) hVar.b;
                AmazfitCardManager amazfitCardManager4 = (AmazfitCardManager) hVar.a;
                ResultKt.throwOnFailure(objB);
                amazfitCardManager2 = amazfitCardManager4;
                List list2 = (List) objB;
                HMLog.info("xys_AmazfitCardManager", new i(list2));
                HMLog.info("xys_AmazfitCardManager", new j(list2.indexOf(dateTriple5)));
                hVar.a = amazfitCardManager2;
                hVar.b = dateTriple5;
                hVar.g = 4;
                objB = amazfitCardManager2.getCurrentStatus(dateTriple5, hVar);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dateTriple6 = dateTriple5;
                amazfitCardManager3 = amazfitCardManager2;
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                DateTriple dateTriple8 = (DateTriple) hVar.b;
                AmazfitCardManager amazfitCardManager5 = (AmazfitCardManager) hVar.a;
                ResultKt.throwOnFailure(objB);
                amazfitCardManager3 = amazfitCardManager5;
                dateTriple6 = dateTriple8;
            }
            calendarPeriodStyle = (CalendarPeriodStyle) objB;
            if (Intrinsics.areEqual(calendarPeriodStyle, StatusKt.getNormalStyle())) {
                zAreEqual = true;
            } else {
                zAreEqual = Intrinsics.areEqual(calendarPeriodStyle, StatusKt.getOvulationStyle());
            }
            if (zAreEqual) {
                zAreEqual2 = true;
            } else {
                zAreEqual2 = Intrinsics.areEqual(calendarPeriodStyle, StatusKt.getPregnantStyle());
            }
            i2 = 0;
            if (zAreEqual2) {
                arrayList = new ArrayList(5);
                while (i2 < 5) {
                    DateTriple dateTripleOffsetDay2 = dateTriple6.offsetDay(Boxing.boxInt(i2).intValue());
                    dayStyle = amazfitCardManager3.styleCatch.getDayStyle(ExtKt.toCalendar(dateTripleOffsetDay2));
                    if (dayStyle == null) {
                        first = null;
                    } else {
                        first = dayStyle.getFirst();
                    }
                    if (first == null) {
                        first = StatusKt.getNormalStyle();
                    }
                    if (dayStyle == null) {
                        second = null;
                    } else {
                        second = dayStyle.getSecond();
                    }
                    arrayList.add(new AmazfitCalendarStatus(dateTripleOffsetDay2, first, second));
                    i2++;
                }
            } else {
                if (Intrinsics.areEqual(calendarPeriodStyle, StatusKt.getPeriodStyle())) {
                    zAreEqual3 = true;
                } else {
                    zAreEqual3 = Intrinsics.areEqual(calendarPeriodStyle, StatusKt.getForecastStyle());
                }
                if (zAreEqual3) {
                    arrayList = d(amazfitCardManager3, dateTriple6, CollectionsKt__CollectionsKt.listOf((Object[]) new CalendarPeriodStyle[]{StatusKt.getPeriodStyle(), StatusKt.getForecastStyle()}), 0, 4, null);
                } else {
                    arrayList = new ArrayList(5);
                    while (i2 < 5) {
                        arrayList.add(new AmazfitCalendarStatus(DateHelper.offsetDay$default(DateHelper.INSTANCE, Boxing.boxInt(i2).intValue(), 0L, 2, null), StatusKt.getNormalStyle(), null));
                        i2++;
                    }
                }
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
            while (mutableList.size() < 5) {
                amazfitCalendarStatus = (AmazfitCalendarStatus) CollectionsKt.lastOrNull(mutableList);
                if (amazfitCalendarStatus != null && (dateTripleOffsetDay = amazfitCalendarStatus.getDate().offsetDay(1)) != null) {
                    mutableList.add(new AmazfitCalendarStatus(dateTripleOffsetDay, StatusKt.getNormalStyle(), null));
                }
            }
            HMLog.info("xys_AmazfitCardManager", new k(mutableList));
            return mutableList;
        }
        ResultKt.throwOnFailure(objB);
        hVar.a = this;
        dateTriple2 = dateTriple;
        hVar.b = dateTriple2;
        hVar.g = 1;
        if (a(hVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        amazfitCardManager = this;
        hVar.a = amazfitCardManager;
        hVar.b = dateTriple2;
        hVar.c = amazfitCardManager;
        hVar.d = dateTriple2;
        hVar.g = 2;
        Object currentStatus = amazfitCardManager.getCurrentStatus(dateTriple2, hVar);
        if (currentStatus == coroutine_suspended) {
            return coroutine_suspended;
        }
        dateTriple3 = dateTriple2;
        amazfitCardManager2 = amazfitCardManager;
        objB = currentStatus;
        dateTriple4 = dateTriple3;
        hVar.a = amazfitCardManager2;
        hVar.b = dateTriple3;
        hVar.c = null;
        hVar.d = null;
        hVar.g = 3;
        objB = amazfitCardManager.b(dateTriple4, (CalendarPeriodStyle) objB, hVar);
        if (objB == coroutine_suspended) {
            return coroutine_suspended;
        }
        dateTriple5 = dateTriple3;
        List list3 = (List) objB;
        HMLog.info("xys_AmazfitCardManager", new i(list3));
        HMLog.info("xys_AmazfitCardManager", new j(list3.indexOf(dateTriple5)));
        hVar.a = amazfitCardManager2;
        hVar.b = dateTriple5;
        hVar.g = 4;
        objB = amazfitCardManager2.getCurrentStatus(dateTriple5, hVar);
        if (objB == coroutine_suspended) {
            return coroutine_suspended;
        }
        dateTriple6 = dateTriple5;
        amazfitCardManager3 = amazfitCardManager2;
        calendarPeriodStyle = (CalendarPeriodStyle) objB;
        if (Intrinsics.areEqual(calendarPeriodStyle, StatusKt.getNormalStyle())) {
            zAreEqual = true;
        } else {
            zAreEqual = Intrinsics.areEqual(calendarPeriodStyle, StatusKt.getOvulationStyle());
        }
        if (zAreEqual) {
            zAreEqual2 = true;
        } else {
            zAreEqual2 = Intrinsics.areEqual(calendarPeriodStyle, StatusKt.getPregnantStyle());
        }
        i2 = 0;
        if (zAreEqual2) {
            arrayList = new ArrayList(5);
            while (i2 < 5) {
                DateTriple dateTripleOffsetDay3 = dateTriple6.offsetDay(Boxing.boxInt(i2).intValue());
                dayStyle = amazfitCardManager3.styleCatch.getDayStyle(ExtKt.toCalendar(dateTripleOffsetDay3));
                if (dayStyle == null) {
                    first = null;
                } else {
                    first = dayStyle.getFirst();
                }
                if (first == null) {
                    first = StatusKt.getNormalStyle();
                }
                if (dayStyle == null) {
                    second = null;
                } else {
                    second = dayStyle.getSecond();
                }
                arrayList.add(new AmazfitCalendarStatus(dateTripleOffsetDay3, first, second));
                i2++;
            }
        } else {
            if (Intrinsics.areEqual(calendarPeriodStyle, StatusKt.getPeriodStyle())) {
                zAreEqual3 = true;
            } else {
                zAreEqual3 = Intrinsics.areEqual(calendarPeriodStyle, StatusKt.getForecastStyle());
            }
            if (zAreEqual3) {
                arrayList = d(amazfitCardManager3, dateTriple6, CollectionsKt__CollectionsKt.listOf((Object[]) new CalendarPeriodStyle[]{StatusKt.getPeriodStyle(), StatusKt.getForecastStyle()}), 0, 4, null);
            } else {
                arrayList = new ArrayList(5);
                while (i2 < 5) {
                    arrayList.add(new AmazfitCalendarStatus(DateHelper.offsetDay$default(DateHelper.INSTANCE, Boxing.boxInt(i2).intValue(), 0L, 2, null), StatusKt.getNormalStyle(), null));
                    i2++;
                }
            }
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        while (mutableList.size() < 5) {
            amazfitCalendarStatus = (AmazfitCalendarStatus) CollectionsKt.lastOrNull(mutableList);
            if (amazfitCalendarStatus != null) {
                mutableList.add(new AmazfitCalendarStatus(dateTripleOffsetDay, StatusKt.getNormalStyle(), null));
            }
        }
        HMLog.info("xys_AmazfitCardManager", new k(mutableList));
        return mutableList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCurrentStatus(@NotNull DateTriple dateTriple, @NotNull Continuation<? super CalendarPeriodStyle> continuation) {
        l lVar;
        AmazfitCardManager amazfitCardManager;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i2 = lVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.e = i2 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object obj = lVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = lVar.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            lVar.a = this;
            lVar.b = dateTriple;
            lVar.e = 1;
            if (a(lVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            amazfitCardManager = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dateTriple = (DateTriple) lVar.b;
            amazfitCardManager = (AmazfitCardManager) lVar.a;
            ResultKt.throwOnFailure(obj);
        }
        Pair<CalendarPeriodStyle, MenstruationVo> dayStyle = amazfitCardManager.styleCatch.getDayStyle(ExtKt.toCalendar(dateTriple));
        CalendarPeriodStyle first = dayStyle == null ? null : dayStyle.getFirst();
        if (first == null) {
            first = StatusKt.getNormalStyle();
        }
        HMLog.info("xys_AmazfitCardManager", new m(first));
        return first;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCurrentStatusContent(@NotNull DateTriple dateTriple, @NotNull Continuation<? super String> continuation) {
        n nVar;
        AmazfitCardManager amazfitCardManager;
        Long intelligentPrediction;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.e = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        } else {
            nVar = new n(continuation);
        }
        Object obj = nVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = nVar.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            nVar.a = this;
            nVar.b = dateTriple;
            nVar.e = 1;
            if (a(nVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            amazfitCardManager = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dateTriple = (DateTriple) nVar.b;
            amazfitCardManager = (AmazfitCardManager) nVar.a;
            ResultKt.throwOnFailure(obj);
        }
        Pair<CalendarPeriodStyle, MenstruationVo> dayStyle = amazfitCardManager.styleCatch.getDayStyle(ExtKt.toCalendar(dateTriple));
        CalendarPeriodStyle first = dayStyle == null ? null : dayStyle.getFirst();
        if (first == null) {
            first = StatusKt.getNormalStyle();
        }
        String string = "";
        if (Intrinsics.areEqual(first, StatusKt.getNormalStyle())) {
            ApiResponse<FirstUseInfoBean> firstUseInfo = DataCacheManager.INSTANCE.getFirstUseInfo();
            if ((firstUseInfo instanceof ApiSuccessResponse) && (intelligentPrediction = ((FirstUseInfoBean) ((ApiSuccessResponse) firstUseInfo).getBody()).getIntelligentPrediction()) != null && intelligentPrediction.longValue() == 1) {
                string = ResourceHelper.INSTANCE.getString(R.string.fh_safe_day);
            }
        } else if (Intrinsics.areEqual(first, StatusKt.getPeriodStyle())) {
            string = ResourceHelper.INSTANCE.getString(R.string.fh_period_day);
        } else if (Intrinsics.areEqual(first, StatusKt.getPregnantStyle())) {
            string = ResourceHelper.INSTANCE.getString(R.string.fh_pregnant);
        } else if (Intrinsics.areEqual(first, StatusKt.getOvulationStyle())) {
            string = ResourceHelper.INSTANCE.getString(R.string.fh_ovulation);
        } else if (Intrinsics.areEqual(first, StatusKt.getForecastStyle())) {
            Pair<CalendarPeriodStyle, MenstruationVo> dayStyle2 = amazfitCardManager.styleCatch.getDayStyle(ExtKt.toCalendar(dateTriple.offsetDay(-1)));
            if (Intrinsics.areEqual(dayStyle2 == null ? null : dayStyle2.getFirst(), StatusKt.getForecastStyle())) {
                Pair<CalendarPeriodStyle, MenstruationVo> dayStyle3 = amazfitCardManager.styleCatch.getDayStyle(ExtKt.toCalendar(dateTriple.offsetDay(1)));
                string = !Intrinsics.areEqual(dayStyle3 != null ? dayStyle3.getFirst() : null, StatusKt.getForecastStyle()) ? ResourceHelper.INSTANCE.getString(R.string.fh_predict_today) : ResourceHelper.INSTANCE.getString(R.string.fh_predict_today);
            } else {
                string = ResourceHelper.INSTANCE.getString(R.string.fh_predict_today);
            }
        }
        HMLog.info("xys_AmazfitCardManager", new o(string));
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCurrentStatusDetailContent(@NotNull DateTriple dateTriple, @NotNull Continuation<? super String> continuation) {
        p pVar;
        AmazfitCardManager amazfitCardManager;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i2 = pVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.e = i2 - Integer.MIN_VALUE;
            } else {
                pVar = new p(continuation);
            }
        } else {
            pVar = new p(continuation);
        }
        p pVar2 = pVar;
        Object detailsContent = pVar2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = pVar2.e;
        if (i3 != 0) {
            if (i3 == 1) {
                dateTriple = (DateTriple) pVar2.b;
                amazfitCardManager = (AmazfitCardManager) pVar2.a;
                ResultKt.throwOnFailure(detailsContent);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(detailsContent);
            }
            String str = (String) ((Triple) detailsContent).getSecond();
            HMLog.info("xys_AmazfitCardManager", new q(str));
            return str;
        }
        ResultKt.throwOnFailure(detailsContent);
        pVar2.a = this;
        pVar2.b = dateTriple;
        pVar2.e = 1;
        if (a(pVar2) == coroutine_suspended) {
            return coroutine_suspended;
        }
        amazfitCardManager = this;
        CalculationManager calculationManager = CalculationManager.INSTANCE;
        StyleCatch styleCatch = amazfitCardManager.styleCatch;
        BaseCardContentStyle baseCardContentStyleLongStyle$uilib_release = BaseCardContentStyle.INSTANCE.longStyle$uilib_release();
        r rVar = amazfitCardManager.new r(null);
        pVar2.a = null;
        pVar2.b = null;
        pVar2.e = 2;
        detailsContent = calculationManager.getDetailsContent(dateTriple, styleCatch, baseCardContentStyleLongStyle$uilib_release, rVar, pVar2);
        if (detailsContent == coroutine_suspended) {
            return coroutine_suspended;
        }
        String str2 = (String) ((Triple) detailsContent).getSecond();
        HMLog.info("xys_AmazfitCardManager", new q(str2));
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRealCurrentStatus(@NotNull DateTriple dateTriple, @NotNull Continuation<? super CalendarPeriodStyle> continuation) {
        w wVar;
        AmazfitCardManager amazfitCardManager;
        if (continuation instanceof w) {
            wVar = (w) continuation;
            int i2 = wVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wVar.e = i2 - Integer.MIN_VALUE;
            } else {
                wVar = new w(continuation);
            }
        } else {
            wVar = new w(continuation);
        }
        Object currentState = wVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = wVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                dateTriple = (DateTriple) wVar.b;
                amazfitCardManager = (AmazfitCardManager) wVar.a;
                ResultKt.throwOnFailure(currentState);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(currentState);
            }
            CalendarPeriodStyle calendarPeriodStyle = (CalendarPeriodStyle) currentState;
            HMLog.info("xys_AmazfitCardManager", new x(calendarPeriodStyle));
            return calendarPeriodStyle;
        }
        ResultKt.throwOnFailure(currentState);
        wVar.a = this;
        wVar.b = dateTriple;
        wVar.e = 1;
        if (a(wVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        amazfitCardManager = this;
        CalculationManager calculationManager = CalculationManager.INSTANCE;
        StyleCatch styleCatch = amazfitCardManager.styleCatch;
        wVar.a = null;
        wVar.b = null;
        wVar.e = 2;
        currentState = calculationManager.getCurrentState(dateTriple, styleCatch, wVar);
        if (currentState == coroutine_suspended) {
            return coroutine_suspended;
        }
        CalendarPeriodStyle calendarPeriodStyle2 = (CalendarPeriodStyle) currentState;
        HMLog.info("xys_AmazfitCardManager", new x(calendarPeriodStyle2));
        return calendarPeriodStyle2;
    }

    @Nullable
    public final Object hasData(@NotNull Continuation<? super Boolean> continuation) {
        Long firstTime;
        ApiResponse<FirstUseInfoBean> firstUseInfo = DataCacheManager.INSTANCE.getFirstUseInfo();
        boolean z = false;
        if ((firstUseInfo instanceof ApiSuccessResponse) && (firstTime = ((FirstUseInfoBean) ((ApiSuccessResponse) firstUseInfo).getBody()).getFirstTime()) != null && firstTime.longValue() == 1) {
            z = true;
        }
        HMLog.info("xys_AmazfitCardManager", new y(z));
        return Boxing.boxBoolean(z);
    }
}
