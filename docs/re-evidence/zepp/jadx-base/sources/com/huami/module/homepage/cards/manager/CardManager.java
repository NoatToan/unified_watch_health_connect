package com.huami.module.homepage.cards.manager;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.cards.business.aid.SleepMusicBindingLogic;
import com.huami.module.homepage.cards.business.balance.BalanceBindingLogic;
import com.huami.module.homepage.cards.business.calorie.CalorieBindingLogic;
import com.huami.module.homepage.cards.business.ecg.EcgBindingLogic;
import com.huami.module.homepage.cards.business.femalehealth.FemaleHealthBindingLogic;
import com.huami.module.homepage.cards.business.healthlabel.HealthLabelBindingLogic;
import com.huami.module.homepage.cards.business.healthstate.HealthStateBindingLogic;
import com.huami.module.homepage.cards.business.heartrate.HeartRateBindingLogic;
import com.huami.module.homepage.cards.business.pai.PaiBindingLogic;
import com.huami.module.homepage.cards.business.phn.PHNBindingLogic;
import com.huami.module.homepage.cards.business.sky.StarSkyBindingLogic;
import com.huami.module.homepage.cards.business.sky.StarSkyHelper;
import com.huami.module.homepage.cards.business.sleep.SleepBindingLogic;
import com.huami.module.homepage.cards.business.sleepbreath.SleepBreathBindingLogic;
import com.huami.module.homepage.cards.business.spo2.SpO2BindingLogic;
import com.huami.module.homepage.cards.business.sportrecord.SportRecordBindingLogic;
import com.huami.module.homepage.cards.business.sportstate.SportStateBindingLogic;
import com.huami.module.homepage.cards.business.step.StepBindingLogic;
import com.huami.module.homepage.cards.business.stress.StressBindingLogic;
import com.huami.module.homepage.cards.business.stressAndspo2.PressureAndSpo2BindingLogic;
import com.huami.module.homepage.cards.business.temperature.TemperatureBindingLogic;
import com.huami.module.homepage.cards.business.weight.WeightAnalysisBindingLogic;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.cards.sort.db.CardExpand;
import com.huami.module.homepage.cards.sort.use.CardSortUseCase;
import com.huami.module.homepage.cards.sort.web.CardEntry;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.NumberExtKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b+\u0010,J \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u00030\u0002H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\f\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002J\f\u0010\u0012\u001a\u00020\f*\u00020\u0011H\u0002R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0019\u0010#\u001a\u00020\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\"R\"\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020(0$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/huami/module/homepage/cards/manager/CardManager;", "", "", "Lkotlin/Function1;", "", "Lcom/huami/module/homepage/cards/sort/web/CardEntry;", "", "a", "b", "", GoogleApiAvailabilityLight.a, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/module/homepage/cards/manager/BindingLogic;", "P", "Ljava/lang/Class;", "clazz", "c", "Lcom/huami/module/homepage/cards/manager/CardType;", "e", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/module/homepage/cards/manager/ExpandAdapter;", "Lcom/huami/module/homepage/cards/manager/ExpandAdapter;", "expandAdapter", "Lcom/huami/module/homepage/cards/sort/use/CardSortUseCase;", "Lcom/huami/module/homepage/cards/sort/use/CardSortUseCase;", "cardSortUseCase", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "f", "Ljava/util/Map;", "bindingLogicList", "Lcom/huami/module/homepage/cards/manager/AdapterItem;", "g", "adapterItemList", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;)V", "h", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class CardManager {

    @Deprecated
    public static final long PERIOD_MILLIS = 50;

    @NotNull
    private static final a h = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ExpandAdapter expandAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CardSortUseCase cardSortUseCase;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final RecyclerView recyclerView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Map<CardType, BindingLogic> bindingLogicList;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Map<CardType, AdapterItem> adapterItemList;

    /* JADX INFO: renamed from: com.huami.module.homepage.cards.manager.CardManager$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.manager.CardManager$1", f = "CardManager.kt", i = {}, l = {95, 249}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CardManager.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            StarSkyHelper starSkyHelper = StarSkyHelper.INSTANCE;
            this.a = 1;
            if (starSkyHelper.initSkyHelper(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            Flow<Unit> flowLoginOrDeviceBindListener = ServiceManager.INSTANCE.getAssistService().loginOrDeviceBindListener();
            CardManager$1$invokeSuspend$$inlined$collect$1 cardManager$1$invokeSuspend$$inlined$collect$1 = new CardManager$1$invokeSuspend$$inlined$collect$1(CardManager.this);
            this.a = 2;
            if (flowLoginOrDeviceBindListener.collect(cardManager$1$invokeSuspend$$inlined$collect$1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardType.values().length];
            iArr[CardType.SLEEP.ordinal()] = 1;
            iArr[CardType.STEP.ordinal()] = 2;
            iArr[CardType.CALORIES.ordinal()] = 3;
            iArr[CardType.PRESS_SPO2.ordinal()] = 4;
            iArr[CardType.SLEEP_BREATH.ordinal()] = 5;
            iArr[CardType.ECG.ordinal()] = 6;
            iArr[CardType.HEART_RATE.ordinal()] = 7;
            iArr[CardType.PAI.ordinal()] = 8;
            iArr[CardType.SLEEP_AID.ordinal()] = 9;
            iArr[CardType.BODY_TEMPERATURE.ordinal()] = 10;
            iArr[CardType.WEIGHT.ordinal()] = 11;
            iArr[CardType.SIGNS_STATE.ordinal()] = 12;
            iArr[CardType.SPORT_STATE.ordinal()] = 13;
            iArr[CardType.SPORT_RECORD.ordinal()] = 14;
            iArr[CardType.HEALTH_LABEL.ordinal()] = 15;
            iArr[CardType.FEMALE_HEALTH.ordinal()] = 16;
            iArr[CardType.EDIT_CARD.ordinal()] = 17;
            iArr[CardType.STAR_SKY.ordinal()] = 18;
            iArr[CardType.STRESS.ordinal()] = 19;
            iArr[CardType.SPO2.ordinal()] = 20;
            iArr[CardType.BALANCE.ordinal()] = 21;
            iArr[CardType.PHN.ordinal()] = 22;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/module/homepage/cards/manager/CardManager$a", "", "", "PERIOD_MILLIS", "J", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/module/homepage/cards/sort/web/CardEntry;", "list", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<List<CardEntry>, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<CardEntry> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<CardEntry> list) {
            list.add(new CardEntry(CardType.EDIT_CARD, true));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/module/homepage/cards/manager/BindingLogic;", "P", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Class<P> a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Class<P> cls, Exception exc) {
            super(0);
            this.a = cls;
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getSimpleName() + " 卡片构建异常:" + kotlin.a.stackTraceToString(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.manager.CardManager", f = "CardManager.kt", i = {}, l = {189}, m = "loadExpand", n = {}, s = {})
    public static final class d extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return CardManager.this.d(this);
        }
    }

    public CardManager(@NotNull CoroutineScope coroutineScope, @NotNull Context context) {
        this.coroutineScope = coroutineScope;
        this.context = context;
        ExpandAdapter expandAdapter = new ExpandAdapter();
        this.expandAdapter = expandAdapter;
        this.cardSortUseCase = new CardSortUseCase();
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setOverScrollMode(2);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.huami.module.homepage.cards.manager.CardManager$recyclerView$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.set(0, 0, 0, NumberExtKt.getDp(12));
            }
        });
        recyclerView.setAdapter(expandAdapter);
        recyclerView.setItemAnimator(null);
        recyclerView.setDescendantFocusability(393216);
        Unit unit = Unit.INSTANCE;
        this.recyclerView = recyclerView;
        e.f(coroutineScope, Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
        b();
        this.bindingLogicList = new LinkedHashMap();
        this.adapterItemList = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Function1<List<CardEntry>, Unit>> a() {
        return kotlin.collections.e.listOf(b.a);
    }

    private final void b() {
        e.f(this.coroutineScope, Dispatchers.getDefault(), null, new CardManager$initLoadCards$1(this, null), 2, null);
    }

    private final <P extends BindingLogic> BindingLogic c(Class<P> clazz) {
        try {
            return clazz.getConstructor(Context.class, CoroutineScope.class).newInstance(this.context, this.coroutineScope);
        } catch (Exception e) {
            HMLog.error$default("CardManager", null, null, new c(clazz, e), 6, null);
            HomeUtils.recordException(e);
            return new DefaultBindingLogic(this.context, this.coroutineScope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Continuation<? super List<String>> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.c = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objLoadCardExpand = dVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = dVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoadCardExpand);
            CardSortUseCase cardSortUseCase = this.cardSortUseCase;
            dVar.c = 1;
            objLoadCardExpand = cardSortUseCase.loadCardExpand(dVar);
            if (objLoadCardExpand == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLoadCardExpand);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objLoadCardExpand) {
            if (((CardExpand) obj).getShowExpand()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((CardExpand) it2.next()).getCardName());
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BindingLogic e(CardType cardType) {
        GenericDeclaration genericDeclaration;
        switch (WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()]) {
            case 1:
                genericDeclaration = SleepBindingLogic.class;
                break;
            case 2:
                genericDeclaration = StepBindingLogic.class;
                break;
            case 3:
                genericDeclaration = CalorieBindingLogic.class;
                break;
            case 4:
                genericDeclaration = PressureAndSpo2BindingLogic.class;
                break;
            case 5:
                genericDeclaration = SleepBreathBindingLogic.class;
                break;
            case 6:
                genericDeclaration = EcgBindingLogic.class;
                break;
            case 7:
                genericDeclaration = HeartRateBindingLogic.class;
                break;
            case 8:
                genericDeclaration = PaiBindingLogic.class;
                break;
            case 9:
                genericDeclaration = SleepMusicBindingLogic.class;
                break;
            case 10:
                genericDeclaration = TemperatureBindingLogic.class;
                break;
            case 11:
                genericDeclaration = WeightAnalysisBindingLogic.class;
                break;
            case 12:
                genericDeclaration = HealthStateBindingLogic.class;
                break;
            case 13:
                genericDeclaration = SportStateBindingLogic.class;
                break;
            case 14:
                genericDeclaration = SportRecordBindingLogic.class;
                break;
            case 15:
                genericDeclaration = HealthLabelBindingLogic.class;
                break;
            case 16:
                genericDeclaration = FemaleHealthBindingLogic.class;
                break;
            case 17:
                genericDeclaration = EditCardBindingLogic.class;
                break;
            case 18:
                genericDeclaration = StarSkyBindingLogic.class;
                break;
            case 19:
                genericDeclaration = StressBindingLogic.class;
                break;
            case 20:
                genericDeclaration = SpO2BindingLogic.class;
                break;
            case 21:
                genericDeclaration = BalanceBindingLogic.class;
                break;
            case 22:
                genericDeclaration = PHNBindingLogic.class;
                break;
            default:
                genericDeclaration = DefaultBindingLogic.class;
                break;
        }
        return c(genericDeclaration);
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }
}
