package com.huami.bloodpressure_ui.research;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_core.dc.research.BloodPressureResearchConfig;
import com.huami.bloodpressure_core.dc.research.BloodPressureResearchVo;
import com.huami.bloodpressure_core.dc.research.BloodPressureStatistics;
import com.huami.bloodpressure_core.dc.research.IResearchApi;
import com.huami.bloodpressure_core.di.KoinExKt;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.bloodpressure_core.url.IBPResearchConfig;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.analytics.BloodPressureAnalyticsExKt;
import com.huami.bloodpressure_ui.analytics.BloodPressureStatEvent;
import com.huami.bloodpressure_ui.databinding.FragmentBloodPressureResearchBinding;
import com.huami.bloodpressure_ui.ext.ViewExKt;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.analytics.helper.FragmentTrackHelper;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0007H\u0002J\u001a\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010!\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%¨\u0006*"}, d2 = {"Lcom/huami/bloodpressure_ui/research/BloodPressureResearchFragment;", "Landroidx/fragment/app/Fragment;", "", "joinTime", "", "g", "time", "", "c", "(Ljava/lang/Long;)Z", "b", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "onResume", "onPause", "Lcom/huami/bloodpressure_ui/databinding/FragmentBloodPressureResearchBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "f", "()Lcom/huami/bloodpressure_ui/databinding/FragmentBloodPressureResearchBinding;", "viewBinding", "Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "Lkotlin/Lazy;", "e", "()Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "iUrlApi", "Lcom/huami/bloodpressure_core/dc/research/IResearchApi;", GoogleApiAvailabilityLight.a, "()Lcom/huami/bloodpressure_core/dc/research/IResearchApi;", "bpResearchApi", "J", "ERROR_TIMESTAMP", "Lcom/huami/mifit/analytics/helper/FragmentTrackHelper;", "Lcom/huami/mifit/analytics/helper/FragmentTrackHelper;", "trackHelper", "<init>", "()V", "Companion", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureResearchFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] f;

    @NotNull
    private static final String g;

    @NotNull
    private static final String h;

    @NotNull
    private static final String i;

    @NotNull
    private static final String j;

    @NotNull
    private static final String k;

    @NotNull
    private static final String l;

    @NotNull
    private static final String m;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy iUrlApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy bpResearchApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long ERROR_TIMESTAMP;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final FragmentTrackHelper trackHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/huami/bloodpressure_ui/research/BloodPressureResearchFragment$Companion;", "", "Lcom/huami/bloodpressure_core/dc/research/BloodPressureResearchVo;", "entity", "Lcom/huami/bloodpressure_ui/research/BloodPressureResearchFragment;", "newInstance", "", "RESEARCH_AUTHOR", "Ljava/lang/String;", "RESEARCH_DATEBEGIN", "RESEARCH_DATEEND", "RESEARCH_DESC", "RESEARCH_JOINENDTIME", "RESEARCH_JOINTIME", "RESEARCH_TITLE", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BloodPressureResearchFragment newInstance(@NotNull BloodPressureResearchVo entity) {
            Long dataTime;
            List<String> initiator;
            String str;
            BloodPressureResearchFragment bloodPressureResearchFragment = new BloodPressureResearchFragment();
            Bundle bundle = new Bundle();
            String str2 = BloodPressureResearchFragment.g;
            String title = entity.getTitle();
            String str3 = "";
            if (title == null) {
                title = "";
            }
            bundle.putString(str2, title);
            String str4 = BloodPressureResearchFragment.h;
            String description = entity.getDescription();
            if (description == null) {
                description = "";
            }
            bundle.putString(str4, description);
            String str5 = BloodPressureResearchFragment.i;
            BloodPressureResearchConfig config = entity.getConfig();
            if (config != null && (initiator = config.getInitiator()) != null && (str = initiator.get(0)) != null) {
                str3 = str;
            }
            bundle.putString(str5, str3);
            Long joinTime = entity.getJoinTime();
            if (joinTime != null) {
                bundle.putLong(BloodPressureResearchFragment.j, joinTime.longValue());
            }
            BloodPressureStatistics statistics = entity.getStatistics();
            if (statistics != null && (dataTime = statistics.getDataTime()) != null) {
                bundle.putLong(BloodPressureResearchFragment.k, dataTime.longValue());
            }
            Long dateBegin = entity.getDateBegin();
            if (dateBegin != null) {
                bundle.putLong(BloodPressureResearchFragment.l, dateBegin.longValue());
            }
            Long dateEnd = entity.getDateEnd();
            if (dateEnd != null) {
                bundle.putLong(BloodPressureResearchFragment.m, dateEnd.longValue());
            }
            bloodPressureResearchFragment.setArguments(bundle);
            return bloodPressureResearchFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodpressure_core/dc/research/IResearchApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<IResearchApi> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IResearchApi getA() {
            return (IResearchApi) KoinExKt.bloodPressureScope(KoinExKt.bloodPressureScope().getKoin()).get(Reflection.getOrCreateKotlinClass(IResearchApi.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<IBPResearchConfig> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IBPResearchConfig getA() {
            return (IBPResearchConfig) KoinExKt.bloodPressureScope(KoinExKt.bloodPressureScope().getKoin()).get(Reflection.getOrCreateKotlinClass(IBPResearchConfig.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<View, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bloodpressure_ui.research.BloodPressureResearchFragment$onViewCreated$1$2$1", f = "BloodPressureResearchFragment.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_CHECKERS, DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ BloodPressureResearchFragment c;

            /* JADX INFO: renamed from: com.huami.bloodpressure_ui.research.BloodPressureResearchFragment$c$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0309a extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0309a(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "ResearchFragment Error " + this.a;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.bloodpressure_ui.research.BloodPressureResearchFragment$onViewCreated$1$2$1$2$2", f = "BloodPressureResearchFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ BloodPressureResearchFragment b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(BloodPressureResearchFragment bloodPressureResearchFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.b = bloodPressureResearchFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new b(this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
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
                    IconToast.showError(this.b.requireContext(), R.string.blood_pressure_net_error);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BloodPressureResearchFragment bloodPressureResearchFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = bloodPressureResearchFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objM3845constructorimpl;
                BloodPressureResearchFragment bloodPressureResearchFragment;
                Object objM3845constructorimpl2;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.b;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            bloodPressureResearchFragment = (BloodPressureResearchFragment) this.a;
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
                    bloodPressureResearchFragment = this.c;
                    Result.Companion companion = Result.Companion;
                    IResearchApi iResearchApiD = bloodPressureResearchFragment.d();
                    String appName = bloodPressureResearchFragment.e().getAppName();
                    this.a = bloodPressureResearchFragment;
                    this.b = 1;
                    obj = iResearchApiD.getResearchUrl(appName, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    String str = (String) obj;
                    if (str == null) {
                        objM3845constructorimpl2 = null;
                    } else {
                        bloodPressureResearchFragment.e().onResearchClick(str);
                        objM3845constructorimpl2 = Unit.INSTANCE;
                    }
                    if (objM3845constructorimpl2 == null) {
                        Result.Companion companion2 = Result.Companion;
                        objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(new NullPointerException(" cannot get h5 url")));
                    }
                    objM3845constructorimpl = Result.m3845constructorimpl(objM3845constructorimpl2);
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                BloodPressureResearchFragment bloodPressureResearchFragment2 = this.c;
                Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    HMLog.info(BloodPressureConst.INSTANCE.getTAG(), new C0309a(thM3848exceptionOrNullimpl));
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    b bVar = new b(bloodPressureResearchFragment2, null);
                    this.a = objM3845constructorimpl;
                    this.b = 2;
                    if (BuildersKt.withContext(main, bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            e.f(LifecycleOwnerKt.getLifecycleScope(BloodPressureResearchFragment.this), Dispatchers.getIO(), null, new a(BloodPressureResearchFragment.this, null), 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "duration", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Long, Unit> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            BloodPressureAnalyticsExKt.record(new CalculationEventBuilder(BloodPressureStatEvent.INSTANCE.getHEALTH_BLOODPRESSURE_RESEARCH_V(), j));
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BloodPressureResearchFragment.class), "viewBinding", "getViewBinding()Lcom/huami/bloodpressure_ui/databinding/FragmentBloodPressureResearchBinding;"));
        f = kPropertyArr;
        INSTANCE = new Companion(null);
        g = "RESEARCH_TITLE";
        h = "RESEARCH_DESC";
        i = "RESEARCH_AUTHOR";
        j = "RESEARCH_JOINTIME";
        k = "RESEARCH_JOINENDTIME";
        l = "RESEARCH_DATEBEGIN";
        m = "RESEARCH_DATEEND";
    }

    public BloodPressureResearchFragment() {
        super(R.layout.fragment_blood_pressure_research);
        this.viewBinding = FragmentViewBindingKt.viewBinding(new BloodPressureResearchFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentBloodPressureResearchBinding.class)));
        this.iUrlApi = LazyKt__LazyJVMKt.lazy(b.a);
        this.bpResearchApi = LazyKt__LazyJVMKt.lazy(a.a);
        this.ERROR_TIMESTAMP = -1L;
        this.trackHelper = new FragmentTrackHelper(this, d.a, null, 4, null);
    }

    private final boolean b() {
        Bundle arguments = getArguments();
        Long lValueOf = arguments == null ? null : Long.valueOf(arguments.getLong(l));
        Bundle arguments2 = getArguments();
        Long lValueOf2 = arguments2 != null ? Long.valueOf(arguments2.getLong(m)) : null;
        if (lValueOf == null || lValueOf2 == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis >= lValueOf.longValue() && jCurrentTimeMillis <= lValueOf2.longValue();
    }

    private final boolean c(Long time) {
        return time != null && time.longValue() > System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IResearchApi d() {
        return (IResearchApi) this.bpResearchApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IBPResearchConfig e() {
        return (IBPResearchConfig) this.iUrlApi.getValue();
    }

    private final FragmentBloodPressureResearchBinding f() {
        return (FragmentBloodPressureResearchBinding) this.viewBinding.getValue(this, f[0]);
    }

    private final int g(long joinTime) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(joinTime);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jCurrentTimeMillis);
        Unit unit = Unit.INSTANCE;
        return Math.abs(TimeUtils.getDeltaDayCount(calendar, calendar2) + 1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.trackHelper.trackOnPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.trackHelper.trackOnResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        f().tvResearchTitle.setText(arguments.getString(g));
        f().tvResearchDesc.setText(arguments.getString(h));
        f().tvResearchAuthor.setText(getString(R.string.blood_pressure_author, arguments.getString(i)));
        boolean zB = b();
        long j2 = arguments.getLong(j, this.ERROR_TIMESTAMP);
        long j3 = arguments.getLong(k, this.ERROR_TIMESTAMP);
        if (zB) {
            long j4 = this.ERROR_TIMESTAMP;
            if (j4 == j2) {
                BloodPressureStatEvent bloodPressureStatEvent = BloodPressureStatEvent.INSTANCE;
                BloodPressureAnalyticsExKt.record(new CountEventBuilder(bloodPressureStatEvent.getHEALTH_BLOODPRESSURE_RESEARCH_C()).addExtra(bloodPressureStatEvent.getHEALTH_BLOODPRESSURE_RESEARCH_STATE(), bloodPressureStatEvent.getHEALTH_BLOODPRESSURE_STATE_START()));
                f().tvResearchUseraction.setText(getString(R.string.blood_pressure_join));
                f().tvResearchResult.setText("");
            } else if (j4 == j3 || c(Long.valueOf(j3))) {
                BloodPressureStatEvent bloodPressureStatEvent2 = BloodPressureStatEvent.INSTANCE;
                BloodPressureAnalyticsExKt.record(new CountEventBuilder(bloodPressureStatEvent2.getHEALTH_BLOODPRESSURE_RESEARCH_C()).addExtra(bloodPressureStatEvent2.getHEALTH_BLOODPRESSURE_RESEARCH_STATE(), bloodPressureStatEvent2.getHEALTH_BLOODPRESSURE_STATE_CONTINUE()));
                int iG = g(j2);
                f().tvResearchUseraction.setText(getString(R.string.blood_pressure_resource_enter));
                AppCompatTextView appCompatTextView = f().tvResearchResult;
                String string = getString(R.string.blood_pressure_day_count, Integer.valueOf(iG));
                appCompatTextView.setText(string != null ? string : "");
            } else {
                BloodPressureStatEvent bloodPressureStatEvent3 = BloodPressureStatEvent.INSTANCE;
                BloodPressureAnalyticsExKt.record(new CountEventBuilder(bloodPressureStatEvent3.getHEALTH_BLOODPRESSURE_RESEARCH_C()).addExtra(bloodPressureStatEvent3.getHEALTH_BLOODPRESSURE_RESEARCH_STATE(), bloodPressureStatEvent3.getHEALTH_BLOODPRESSURE_STATE_DONE()));
                f().tvResearchUseraction.setText(getString(R.string.blood_pressure_resource_enter));
                f().tvResearchResult.setText(getString(R.string.blood_pressure_research_end));
            }
        } else if (j2 == this.ERROR_TIMESTAMP) {
            f().tvResearchUseraction.setText(getString(R.string.blood_pressure_research_timeout));
            f().tvResearchResult.setText("");
        } else {
            BloodPressureStatEvent bloodPressureStatEvent4 = BloodPressureStatEvent.INSTANCE;
            BloodPressureAnalyticsExKt.record(new CountEventBuilder(bloodPressureStatEvent4.getHEALTH_BLOODPRESSURE_RESEARCH_C()).addExtra(bloodPressureStatEvent4.getHEALTH_BLOODPRESSURE_RESEARCH_STATE(), bloodPressureStatEvent4.getHEALTH_BLOODPRESSURE_STATE_DONE()));
            f().tvResearchUseraction.setText(getString(R.string.blood_pressure_research_timeout));
            f().tvResearchResult.setText(getString(R.string.blood_pressure_research_end));
        }
        ViewExKt.setOnDebounceClickListener(f().rootResearchContainer, new c());
    }
}
