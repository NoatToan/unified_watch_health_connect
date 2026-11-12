package com.huami.femalehealth.uilib.viewmodel;

import android.content.Context;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.calculation.BasicInputValue;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.logiclib.helper.ext.NumberExtKt;
import com.huami.femalehealth.logiclib.repo.MenstruationRepo;
import com.huami.femalehealth.logiclib.repo.SettingRepo;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.femalehealth.logiclib.vo.SettingVo;
import com.huami.femalehealth.uilib.ui.activity.FemaleHealthActivity;
import com.huami.femalehealth.uilib.ui.activity.FemaleStartActivity;
import com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel;
import com.huami.femalehealth.uilib.widget.calendar.CalculationManager;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 82\u00020\u0001:\u00018B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b6\u00107J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0002J\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u000bJ\u0013\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0016\u001a\u00020\u000bJ\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0010R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R3\u00102\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 .*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R?\u00105\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t .*\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b0\u00028\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, d2 = {"Lcom/huami/femalehealth/uilib/viewmodel/FemaleMifitViewModel;", "Lcom/huami/femalehealth/uilib/viewmodel/FHBaseViewModel;", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "Lcom/huami/femalehealth/logiclib/vo/SettingVo;", "g", "Ljava/util/Date;", "date", "Lkotlin/Pair;", "", "h", "", "refreshSetting", "refreshCardContent", "clearLocalSetting", "checkUnsyncData", "", "isFirstTimeFromNet", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFirstTime", "settingVo", "initCalcManager", "clearFemaleData", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "fromNet", "jumpToFemaleHealth", "Lcom/huami/femalehealth/logiclib/repo/SettingRepo;", GoogleApiAvailabilityLight.a, "Lcom/huami/femalehealth/logiclib/repo/SettingRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", "e", "Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", "menstruationRepo", "Landroidx/lifecycle/MutableLiveData;", "f", "Landroidx/lifecycle/MutableLiveData;", "getTrigger", "()Landroidx/lifecycle/MutableLiveData;", "setTrigger", "(Landroidx/lifecycle/MutableLiveData;)V", "trigger", "getCardTrigger", "setCardTrigger", "cardTrigger", "kotlin.jvm.PlatformType", "Landroidx/lifecycle/LiveData;", "getSetting", "()Landroidx/lifecycle/LiveData;", "setting", "i", "getCardContent", "cardContent", "<init>", "(Lcom/huami/femalehealth/logiclib/repo/SettingRepo;Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class FemaleMifitViewModel extends FHBaseViewModel {

    @NotNull
    public static final String TAG = "FemaleMifitViewModel";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final SettingRepo repo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MenstruationRepo menstruationRepo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Boolean> trigger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Boolean> cardTrigger;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<SettingVo>> setting;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Pair<String, String>> cardContent;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel$checkUnsyncData$1", f = "FemaleMifitViewModel.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FemaleMifitViewModel.this.new a(continuation);
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
                MenstruationRepo menstruationRepo = FemaleMifitViewModel.this.menstruationRepo;
                this.a = 1;
                if (menstruationRepo.checkUnsyncData(this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ MediatorLiveData<Pair<String, String>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MediatorLiveData<Pair<String, String>> mediatorLiveData) {
            super(0);
            this.a = mediatorLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "mediatorLiveData.value=" + this.a.getValue() + ", observe long";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ MediatorLiveData<Pair<String, String>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MediatorLiveData<Pair<String, String>> mediatorLiveData) {
            super(0);
            this.a = mediatorLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "mediatorLiveData.value=" + this.a.getValue() + ", observe short";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel$getCardContent$3", f = "FemaleMifitViewModel.kt", i = {}, l = {97, 105}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Date b;
        public final /* synthetic */ FemaleMifitViewModel c;
        public final /* synthetic */ MutableLiveData<String> d;
        public final /* synthetic */ MutableLiveData<String> e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljava/util/Date;", "it", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel$getCardContent$3$1", f = "FemaleMifitViewModel.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<Date, Continuation<? super List<? extends MenstruationVo>>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ FemaleMifitViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FemaleMifitViewModel femaleMifitViewModel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = femaleMifitViewModel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull Date date, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
                return ((a) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.c, continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Date date = (Date) this.b;
                    MenstruationRepo menstruationRepo = this.c.menstruationRepo;
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Ljava/util/Date;", "it", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel$getCardContent$3$2", f = "FemaleMifitViewModel.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<List<? extends Date>, Continuation<? super List<? extends MenstruationVo>>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ FemaleMifitViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(FemaleMifitViewModel femaleMifitViewModel, Continuation<? super b> continuation) {
                super(2, continuation);
                this.c = femaleMifitViewModel;
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
                b bVar = new b(this.c, continuation);
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
                    MenstruationRepo menstruationRepo = this.c.menstruationRepo;
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n"}, d2 = {"Lkotlin/Triple;", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<Triple<? extends CalendarPeriodStyle, ? extends String, ? extends Object>, Unit> {
            public final /* synthetic */ MutableLiveData<String> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(MutableLiveData<String> mutableLiveData) {
                super(1);
                this.a = mutableLiveData;
            }

            public final void a(@NotNull Triple<? extends CalendarPeriodStyle, String, ? extends Object> triple) {
                this.a.postValue(triple.getSecond());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends CalendarPeriodStyle, ? extends String, ? extends Object> triple) {
                a(triple);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel$d$d, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljava/util/Date;", "it", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel$getCardContent$3$4", f = "FemaleMifitViewModel.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0415d extends SuspendLambda implements Function2<Date, Continuation<? super List<? extends MenstruationVo>>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ FemaleMifitViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0415d(FemaleMifitViewModel femaleMifitViewModel, Continuation<? super C0415d> continuation) {
                super(2, continuation);
                this.c = femaleMifitViewModel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull Date date, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
                return ((C0415d) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0415d c0415d = new C0415d(this.c, continuation);
                c0415d.b = obj;
                return c0415d;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Date date = (Date) this.b;
                    MenstruationRepo menstruationRepo = this.c.menstruationRepo;
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Ljava/util/Date;", "it", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel$getCardContent$3$5", f = "FemaleMifitViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
        public static final class e extends SuspendLambda implements Function2<List<? extends Date>, Continuation<? super List<? extends MenstruationVo>>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ FemaleMifitViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(FemaleMifitViewModel femaleMifitViewModel, Continuation<? super e> continuation) {
                super(2, continuation);
                this.c = femaleMifitViewModel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull List<? extends Date> list, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
                return ((e) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                e eVar = new e(this.c, continuation);
                eVar.b = obj;
                return eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    List<? extends Date> list = (List) this.b;
                    MenstruationRepo menstruationRepo = this.c.menstruationRepo;
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n"}, d2 = {"Lkotlin/Triple;", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function1<Triple<? extends CalendarPeriodStyle, ? extends String, ? extends Object>, Unit> {
            public final /* synthetic */ MutableLiveData<String> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(MutableLiveData<String> mutableLiveData) {
                super(1);
                this.a = mutableLiveData;
            }

            public final void a(@NotNull Triple<? extends CalendarPeriodStyle, String, ? extends Object> triple) {
                this.a.postValue(triple.getSecond());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends CalendarPeriodStyle, ? extends String, ? extends Object> triple) {
                a(triple);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Date date, FemaleMifitViewModel femaleMifitViewModel, MutableLiveData<String> mutableLiveData, MutableLiveData<String> mutableLiveData2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = date;
            this.c = femaleMifitViewModel;
            this.d = mutableLiveData;
            this.e = mutableLiveData2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            CalculationManager calculationManager = CalculationManager.INSTANCE;
            DateTriple dateTriple = AidKt.toDateTriple(this.b);
            a aVar = new a(this.c, null);
            b bVar = new b(this.c, null);
            c cVar = new c(this.d);
            this.a = 1;
            if (calculationManager.getCardLongContent(dateTriple, aVar, bVar, cVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            CalculationManager calculationManager2 = CalculationManager.INSTANCE;
            DateTriple dateTriple2 = AidKt.toDateTriple(this.b);
            C0415d c0415d = new C0415d(this.c, null);
            e eVar = new e(this.c, null);
            f fVar = new f(this.e);
            this.a = 2;
            if (calculationManager2.getCardShortContent(dateTriple2, c0415d, eVar, fVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ SettingVo a;
        public final /* synthetic */ BasicInputValue b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SettingVo settingVo, BasicInputValue basicInputValue, long j) {
            super(0);
            this.a = settingVo;
            this.b = basicInputValue;
            this.c = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "initCalcManager, settingVo=" + this.a + ", basicInputVal=" + this.b + ", userLastCheckIncrementTime update:" + NumberExtKt.dateFormat(this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel$initCalcManager$1$2", f = "FemaleMifitViewModel.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ BasicInputValue b;
        public final /* synthetic */ FemaleMifitViewModel c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljava/util/Date;", "it", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel$initCalcManager$1$2$1", f = "FemaleMifitViewModel.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<Date, Continuation<? super List<? extends MenstruationVo>>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ FemaleMifitViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FemaleMifitViewModel femaleMifitViewModel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = femaleMifitViewModel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull Date date, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
                return ((a) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.c, continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Date date = (Date) this.b;
                    MenstruationRepo menstruationRepo = this.c.menstruationRepo;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(BasicInputValue basicInputValue, FemaleMifitViewModel femaleMifitViewModel, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = basicInputValue;
            this.c = femaleMifitViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CalculationManager calculationManager = CalculationManager.INSTANCE;
                BasicInputValue basicInputValue = this.b;
                a aVar = new a(this.c, null);
                this.a = 1;
                if (calculationManager.init(basicInputValue, aVar, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel$isFirstTime$2", f = "FemaleMifitViewModel.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "isFirstTime, false";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ SettingVo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SettingVo settingVo) {
                super(0);
                this.a = settingVo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("isFirstTime, true, get remote setting=", this.a);
            }
        }

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FemaleMifitViewModel.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zIsFirstTime;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (FemaleMifitViewModel.this.repo.isFirstTime()) {
                    SettingRepo settingRepo = FemaleMifitViewModel.this.repo;
                    this.a = 1;
                    obj = settingRepo.loadSettingsRemote(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    HMLog.info(FemaleMifitViewModel.TAG, a.a);
                    zIsFirstTime = false;
                }
                return Boxing.boxBoolean(zIsFirstTime);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.info(FemaleMifitViewModel.TAG, new b((SettingVo) obj));
            zIsFirstTime = FemaleMifitViewModel.this.repo.isFirstTime();
            return Boxing.boxBoolean(zIsFirstTime);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel$isFirstTimeFromNet$2", f = "FemaleMifitViewModel.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FemaleMifitViewModel.this.new h(continuation);
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
                SettingRepo settingRepo = FemaleMifitViewModel.this.repo;
                this.a = 1;
                obj = settingRepo.loadSettingsRemote(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Boxing.boxBoolean(((SettingVo) obj).getFirstTime());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel$jumpToFemaleHealth$1", f = "FemaleMifitViewModel.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Context context, Continuation<? super i> continuation) {
            super(2, continuation);
            this.c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FemaleMifitViewModel.this.new i(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FemaleMifitViewModel femaleMifitViewModel = FemaleMifitViewModel.this;
                this.a = 1;
                obj = femaleMifitViewModel.isFirstTime(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                FemaleStartActivity.INSTANCE.start(this.c);
            } else {
                FemaleHealthActivity.INSTANCE.start(this.c);
            }
            return Unit.INSTANCE;
        }
    }

    public FemaleMifitViewModel(@NotNull SettingRepo settingRepo, @NotNull MenstruationRepo menstruationRepo) {
        this.repo = settingRepo;
        this.menstruationRepo = menstruationRepo;
        Boolean bool = Boolean.TRUE;
        this.trigger = new MutableLiveData<>(bool);
        this.cardTrigger = new MutableLiveData<>(bool);
        this.setting = Transformations.switchMap(this.trigger, new Function() { // from class: u52
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return FemaleMifitViewModel.k(this.a, (Boolean) obj);
            }
        });
        this.cardContent = Transformations.switchMap(this.cardTrigger, new Function() { // from class: t52
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return FemaleMifitViewModel.f(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData f(FemaleMifitViewModel femaleMifitViewModel, Boolean bool) {
        if (bool == null) {
            return null;
        }
        bool.booleanValue();
        return femaleMifitViewModel.h(new Date());
    }

    private final LiveData<Resource<SettingVo>> g() {
        return this.repo.loadSettings();
    }

    private final LiveData<Pair<String, String>> h(Date date) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.setValue(new Pair("", ""));
        mediatorLiveData.addSource(mutableLiveData, new Observer() { // from class: w52
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FemaleMifitViewModel.i(mediatorLiveData, (String) obj);
            }
        });
        mediatorLiveData.addSource(mutableLiveData2, new Observer() { // from class: v52
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FemaleMifitViewModel.j(mediatorLiveData, (String) obj);
            }
        });
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new d(date, this, mutableLiveData, mutableLiveData2, null), 2, null);
        return mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(MediatorLiveData mediatorLiveData, String str) {
        Pair pair = (Pair) mediatorLiveData.getValue();
        mediatorLiveData.setValue(pair != null ? Pair.copy$default(pair, str, null, 2, null) : null);
        HMLog.info(TAG, new b(mediatorLiveData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(MediatorLiveData mediatorLiveData, String str) {
        Pair pair = (Pair) mediatorLiveData.getValue();
        mediatorLiveData.setValue(pair != null ? Pair.copy$default(pair, null, str, 1, null) : null);
        HMLog.info(TAG, new c(mediatorLiveData));
    }

    public static /* synthetic */ void jumpToFemaleHealth$default(FemaleMifitViewModel femaleMifitViewModel, Context context, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        femaleMifitViewModel.jumpToFemaleHealth(context, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData k(FemaleMifitViewModel femaleMifitViewModel, Boolean bool) {
        if (bool == null) {
            return null;
        }
        bool.booleanValue();
        return femaleMifitViewModel.g();
    }

    public final void checkUnsyncData() {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(null), 2, null);
    }

    public final void clearFemaleData() {
        CoroutineContext io2 = Dispatchers.getIO();
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        if (!Intrinsics.areEqual(io2, FHBaseViewModel.c)) {
            io2 = io2.plus(FHBaseViewModel.c);
        }
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), io2, coroutineStart, new FemaleMifitViewModel$clearFemaleData$$inlined$safeLaunch$uilib_release$default$1(null, this));
    }

    public final void clearLocalSetting() {
        this.repo.clearLocalSetting();
    }

    @NotNull
    public final LiveData<Pair<String, String>> getCardContent() {
        return this.cardContent;
    }

    @NotNull
    public final MutableLiveData<Boolean> getCardTrigger() {
        return this.cardTrigger;
    }

    @NotNull
    public final LiveData<Resource<SettingVo>> getSetting() {
        return this.setting;
    }

    @NotNull
    public final MutableLiveData<Boolean> getTrigger() {
        return this.trigger;
    }

    public final void initCalcManager(@Nullable SettingVo settingVo) {
        if (settingVo == null) {
            return;
        }
        BasicInputValue basicInputValue = new BasicInputValue(settingVo.getLastMenstrualTime(), settingVo.getEstimatedMenstrualDays(), settingVo.getMenstrualCycle(), settingVo.getIntelligentPrediction());
        CalculationManager.INSTANCE.initBasicInputValue(basicInputValue);
        long lastCheckIncTime = this.repo.getLastCheckIncTime();
        long timeInMillis = DateHelper.INSTANCE.today().getTimeInMillis();
        if (lastCheckIncTime == timeInMillis) {
            return;
        }
        this.repo.setLastCheckIncTime(timeInMillis);
        HMLog.info(TAG, new e(settingVo, basicInputValue, timeInMillis));
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, null, null, new f(basicInputValue, this, null), 3, null);
    }

    @Nullable
    public final Object isFirstTime(@NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new g(null), continuation);
    }

    @Nullable
    public final Object isFirstTimeFromNet(@NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new h(null), continuation);
    }

    public final void jumpToFemaleHealth(@NotNull Context context, boolean fromNet) {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new i(context, null), 2, null);
    }

    public final void refreshCardContent() {
        MutableLiveData<Boolean> mutableLiveData = this.cardTrigger;
        mutableLiveData.setValue(Boolean.valueOf(!mutableLiveData.getValue().booleanValue()));
    }

    public final void refreshSetting() {
        MutableLiveData<Boolean> mutableLiveData = this.trigger;
        mutableLiveData.setValue(Boolean.valueOf(!mutableLiveData.getValue().booleanValue()));
    }

    public final void setCardTrigger(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        this.cardTrigger = mutableLiveData;
    }

    public final void setTrigger(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        this.trigger = mutableLiveData;
    }
}
