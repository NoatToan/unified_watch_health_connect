package com.huami.module.homepage.cards.business.sky;

import android.content.Context;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.manager.BindingLogic;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.koin.ScopesAndQualifersKt;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.sky.entry.PopInfo;
import com.huami.sky.entry.SkyCardEntry;
import com.huami.sky.service.PlayState;
import com.huami.sky.service.SkyNavigation;
import com.huami.sky.service.SkyPlayFromEvent;
import com.huami.sky.service.SkyPromotionService;
import com.huami.sky.service.SkyService;
import com.huami.sky.service.SkyUpdateShowInfo;
import com.huami.sky.ui.play.notification.SkyPlayNotification;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e¢\u0006\u0004\b8\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0002JI\u0010\u0015\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00130\u00122\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010(R\u0018\u0010.\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010(R\u0018\u00100\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010(R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/huami/module/homepage/cards/business/sky/StarSkyBindingLogic;", "Lcom/huami/module/homepage/cards/manager/BindingLogic;", "", "likeState", "", "c", "a", "e", GoogleApiAvailabilityLight.a, "b", "g", SkyPlayNotification.SKY_NOTIFICATION_LIKE, "f", "", "sid", "id", "", "status", "", "Lkotlin/Pair;", "", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)[Lkotlin/Pair;", "bind", "Lcom/huami/module/homepage/cards/business/sky/StarSkyCardView;", "getView", "close", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/huami/sky/service/SkyService;", "Lcom/huami/sky/service/SkyService;", "skyService", "Lcom/huami/sky/service/SkyPromotionService;", "Lcom/huami/sky/service/SkyPromotionService;", "skyPromotionService", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "playJob", "likeJob", "i", "skyCardJob", z.j, "skyPromotionJob", hl.k, "skySurveyJob", "Lcom/huami/sky/entry/SkyCardEntry;", "l", "Lcom/huami/sky/entry/SkyCardEntry;", "skyCardEntry", "m", "Lcom/huami/module/homepage/cards/business/sky/StarSkyCardView;", "skyView", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class StarSkyBindingLogic extends BindingLogic {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SkyService skyService;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final SkyPromotionService skyPromotionService;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Job playJob;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Job likeJob;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Job skyCardJob;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Job skyPromotionJob;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private Job skySurveyJob;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private SkyCardEntry skyCardEntry;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final StarSkyCardView skyView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sky.StarSkyBindingLogic$1", f = "StarSkyBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return StarSkyBindingLogic.this.new a(continuation);
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
            StarSkyBindingLogic.this.skyView.initView(StarSkyBindingLogic.this.skyService.getPlayState(), StarSkyBindingLogic.this.skyService.getLikeState());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/sky/entry/SkyCardEntry;", "skyCardEntry", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sky.StarSkyBindingLogic$bind$1", f = "StarSkyBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<SkyCardEntry, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable SkyCardEntry skyCardEntry, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(skyCardEntry, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = StarSkyBindingLogic.this.new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SkyCardEntry skyCardEntry = (SkyCardEntry) this.b;
            StarSkyBindingLogic.this.skyCardEntry = skyCardEntry;
            StarSkyBindingLogic.this.skyView.setTagsText(skyCardEntry == null ? null : skyCardEntry.getTags());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/sky/service/PlayState;", "state", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sky.StarSkyBindingLogic$bind$2", f = "StarSkyBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<PlayState, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ PlayState a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayState playState) {
                super(0);
                this.a = playState;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "play state: " + this.a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull PlayState playState, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(playState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = StarSkyBindingLogic.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PlayState playState = (PlayState) this.b;
            HMLog.info("StarSkyBindingLogic", new a(playState));
            StarSkyCardView.setPlayState$default(StarSkyBindingLogic.this.skyView, playState, false, 2, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/sky/service/PlayState;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sky.StarSkyBindingLogic$bind$3", f = "StarSkyBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function3<FlowCollector<? super PlayState>, Throwable, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "星空播放状态监听发生异常：" + kotlin.a.stackTraceToString(this.a);
            }
        }

        public d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super PlayState> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            d dVar = new d(continuation);
            dVar.b = th;
            return dVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.error$default("StarSkyBindingLogic", null, null, new a((Throwable) this.b), 6, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "state", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sky.StarSkyBindingLogic$bind$4", f = "StarSkyBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ boolean b;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Nullable
        public final Object a(boolean z, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = StarSkyBindingLogic.this.new e(continuation);
            eVar.b = ((Boolean) obj).booleanValue();
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StarSkyBindingLogic.this.skyView.setMusicLikeState(this.b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sky.StarSkyBindingLogic$bind$5", f = "StarSkyBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "星空播喜欢状态监听发生异常：" + kotlin.a.stackTraceToString(this.a);
            }
        }

        public f(Continuation<? super f> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            f fVar = new f(continuation);
            fVar.b = th;
            return fVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.error$default("StarSkyBindingLogic", null, null, new a((Throwable) this.b), 6, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/sky/service/SkyUpdateShowInfo;", "info", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sky.StarSkyBindingLogic$bind$6$1", f = "StarSkyBindingLogic.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<SkyUpdateShowInfo, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ SkyUpdateShowInfo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SkyUpdateShowInfo skyUpdateShowInfo) {
                super(0);
                this.a = skyUpdateShowInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                SkyUpdateShowInfo skyUpdateShowInfo = this.a;
                String label = skyUpdateShowInfo == null ? null : skyUpdateShowInfo.getLabel();
                SkyUpdateShowInfo skyUpdateShowInfo2 = this.a;
                return "星空标签 `" + label + "` 弹框已读，对应创建时间：" + (skyUpdateShowInfo2 != null ? Long.valueOf(skyUpdateShowInfo2.getCreateTime()) : null);
            }
        }

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable SkyUpdateShowInfo skyUpdateShowInfo, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(skyUpdateShowInfo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            g gVar = new g(continuation);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMLog.info("StarSkyBindingLogic", new a((SkyUpdateShowInfo) this.b));
                StarSkyHelper starSkyHelper = StarSkyHelper.INSTANCE;
                this.a = 1;
                if (starSkyHelper.requestSkyCardEntry(this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/sky/service/SkyUpdateShowInfo;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sky.StarSkyBindingLogic$bind$6$2", f = "StarSkyBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function3<FlowCollector<? super SkyUpdateShowInfo>, Throwable, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "星空标签弹框状态监听发生异常：" + kotlin.a.stackTraceToString(this.a);
            }
        }

        public h(Continuation<? super h> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super SkyUpdateShowInfo> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            h hVar = new h(continuation);
            hVar.b = th;
            return hVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.error$default("StarSkyBindingLogic", null, null, new a((Throwable) this.b), 6, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "service state: " + StarSkyBindingLogic.this.skyService.getServiceState();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Unit> {
        public j() {
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
            StarSkyBindingLogic.this.c(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Unit> {
        public k() {
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
            StarSkyBindingLogic.this.c(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<Unit> {
        public final /* synthetic */ StarSkyCardView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(StarSkyCardView starSkyCardView) {
            super(0);
            this.b = starSkyCardView;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (StarSkyBindingLogic.this.a()) {
                return;
            }
            if (StarSkyBindingLogic.this.skyService.isFirstEnterSky()) {
                StarSkyBindingLogic.this.d();
                return;
            }
            StarSkyBindingLogic.this.g();
            this.b.setLoadingState(StarSkyBindingLogic.this.skyService.getPlayState());
            StarSkyBindingLogic.this.skyService.playOrPause();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<Unit> {
        public m() {
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
            if (StarSkyBindingLogic.this.a()) {
                return;
            }
            StarSkyBindingLogic.this.e();
        }
    }

    public StarSkyBindingLogic(@NotNull Context context, @NotNull CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.context = context;
        this.scope = coroutineScope;
        ServiceManager serviceManager = ServiceManager.INSTANCE;
        this.skyService = serviceManager.getStarSkyService();
        this.skyPromotionService = serviceManager.getSkyPromotionService();
        StarSkyCardView starSkyCardView = new StarSkyCardView(context, null, 0, 6, null);
        starSkyCardView.setOnLikeClickListener(new j());
        starSkyCardView.setOnUnlikeClickListener(new k());
        starSkyCardView.setOnPlayClickListener(new l(starSkyCardView));
        ExteranelKt.setOnClickWithPolicyListener(starSkyCardView, new m());
        Unit unit = Unit.INSTANCE;
        this.skyView = starSkyCardView;
        kotlinx.coroutines.e.f(coroutineScope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a() {
        PopInfo pop;
        SkyCardEntry skyCardEntry = this.skyCardEntry;
        if (skyCardEntry == null) {
            return true;
        }
        boolean hasPop = skyCardEntry.getHasPop();
        if (hasPop && (pop = skyCardEntry.getPop()) != null) {
            this.skyView.showPayDialogView(pop.getContent());
        }
        return hasPop;
    }

    private final void b() {
        HomeAnalytics homeAnalytics = HomeAnalytics.INDEX_CARDS_STAR_SKY_C;
        Pair[] pairArrI = i(this, null, null, null, 7, null);
        StatusAnalyticsKt.recordEvent(homeAnalytics, (Pair[]) Arrays.copyOf(pairArrI, pairArrI.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(boolean likeState) {
        if (a()) {
            return;
        }
        HMLog.info("StarSkyBindingLogic", new i());
        if (!this.skyService.getServiceState()) {
            e();
        } else {
            f(likeState);
            this.skyService.changeLikeState(likeState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        b();
        SkyNavigation skyNavigation = (SkyNavigation) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(SkyNavigation.class), null, null);
        if (skyNavigation == null) {
            return;
        }
        skyNavigation.launchIntroPage(this.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        b();
        SkyNavigation skyNavigation = (SkyNavigation) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(SkyNavigation.class), null, null);
        if (skyNavigation == null) {
            return;
        }
        skyNavigation.launchSkyMainPage(this.context, SkyPlayFromEvent.FROM_HOME_PAGE);
    }

    private final void f(boolean like) {
        HomeAnalytics homeAnalytics = like ? HomeAnalytics.AIMUSIC_PLAYER_LIKE_C : HomeAnalytics.AIMUSIC_PLAYER_DISLIKE_C;
        Pair<String, Object>[] pairArrH = h(this.skyService.getPlaySessionId(), this.skyService.getMusicId(), like ? Integer.valueOf(this.skyService.getLikeState() ? 1 : 0) : null);
        StatusAnalyticsKt.recordEvent(homeAnalytics, (Pair[]) Arrays.copyOf(pairArrH, pairArrH.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        boolean z = this.skyService.getPlayState() == PlayState.PLAYING;
        HomeAnalytics homeAnalytics = z ? HomeAnalytics.AIMUSIC_PLAYER_PAUSE_C : HomeAnalytics.AIMUSIC_PLAYER_PLAY_C;
        Pair[] pairArrI = i(this, z ? this.skyService.getPlaySessionId() : null, null, null, 6, null);
        StatusAnalyticsKt.recordEvent(homeAnalytics, (Pair[]) Arrays.copyOf(pairArrI, pairArrI.length));
    }

    private final Pair<String, Object>[] h(String sid, String id, Integer status) {
        return new Pair[]{TuplesKt.to("from", 0), TuplesKt.to("sid", sid), TuplesKt.to("id", id), TuplesKt.to("status", status)};
    }

    public static /* synthetic */ Pair[] i(StarSkyBindingLogic starSkyBindingLogic, String str, String str2, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        return starSkyBindingLogic.h(str, str2, num);
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void bind() {
        this.skyCardJob = FlowKt.launchIn(ExteranelKt.onMainEach(StarSkyHelper.INSTANCE.getSkyCardEntry(), new b(null)), this.scope);
        this.playJob = FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(ExteranelKt.onMainEach(this.skyService.listenPlayState(), new c(null)), new d(null)), Dispatchers.getIO()), this.scope);
        this.likeJob = FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(ExteranelKt.onMainEach(this.skyService.listenLikeState(), new e(null)), new f(null)), Dispatchers.getIO()), this.scope);
        SkyPromotionService skyPromotionService = this.skyPromotionService;
        this.skyPromotionJob = skyPromotionService != null ? FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(FlowKt.onEach(skyPromotionService.listenSkyUpdateShow(), new g(null)), new h(null)), Dispatchers.getIO()), this.scope) : null;
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void close() {
        Job job = this.playJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.playJob = null;
        Job job2 = this.likeJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.likeJob = null;
        Job job3 = this.skyCardJob;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
        }
        this.skyCardJob = null;
        Job job4 = this.skyPromotionJob;
        if (job4 != null) {
            Job.DefaultImpls.cancel$default(job4, (CancellationException) null, 1, (Object) null);
        }
        this.skyPromotionJob = null;
        Job job5 = this.skySurveyJob;
        if (job5 != null) {
            Job.DefaultImpls.cancel$default(job5, (CancellationException) null, 1, (Object) null);
        }
        this.skySurveyJob = null;
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    @NotNull
    /* JADX INFO: renamed from: getView, reason: from getter */
    public StarSkyCardView getStepCardView() {
        return this.skyView;
    }
}
