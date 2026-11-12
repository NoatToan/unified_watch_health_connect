package com.huami.module.homepage.cards.business.aid;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.business.aid.SleepMusicBindingLogic;
import com.huami.module.homepage.cards.manager.BindingLogic;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.sleepassistant.servicelib.service.SleepAidService;
import com.huami.tools.analytics.DbUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0007*\u0001\u001a\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u001d\u0010\u0019\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\r\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/module/homepage/cards/business/aid/SleepMusicBindingLogic;", "Lcom/huami/module/homepage/cards/manager/BindingLogic;", "", GoogleApiAvailabilityLight.a, "e", "bind", "Lcom/huami/module/homepage/cards/business/aid/SleepMusicCardView;", "getView", "close", "Lkotlin/Function0;", "func", "runOnUiThread", "Landroid/content/Context;", "c", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/huami/sleepassistant/servicelib/service/SleepAidService;", "Lcom/huami/sleepassistant/servicelib/service/SleepAidService;", "service", "f", "Lkotlin/Lazy;", "()Lcom/huami/module/homepage/cards/business/aid/SleepMusicCardView;", "sleepMusicView", "com/huami/module/homepage/cards/business/aid/SleepMusicBindingLogic$musicPlayStatusChange$1", "g", "Lcom/huami/module/homepage/cards/business/aid/SleepMusicBindingLogic$musicPlayStatusChange$1;", "musicPlayStatusChange", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class SleepMusicBindingLogic extends BindingLogic {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SleepAidService service;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepMusicView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final SleepMusicBindingLogic$musicPlayStatusChange$1 musicPlayStatusChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.aid.SleepMusicBindingLogic$runOnUiThread$1", f = "SleepMusicBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, continuation);
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
            this.b.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/module/homepage/cards/business/aid/SleepMusicCardView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SleepMusicCardView> {
        public b() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(SleepMusicBindingLogic sleepMusicBindingLogic, View view) {
            sleepMusicBindingLogic.d();
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SleepMusicCardView invoke() {
            SleepMusicCardView sleepMusicCardView = new SleepMusicCardView(SleepMusicBindingLogic.this.context);
            final SleepMusicBindingLogic sleepMusicBindingLogic = SleepMusicBindingLogic.this;
            sleepMusicCardView.setOnClickListener(new View.OnClickListener() { // from class: com.huami.module.homepage.cards.business.aid.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepMusicBindingLogic.b.c(sleepMusicBindingLogic, view);
                }
            });
            return sleepMusicCardView;
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.huami.module.homepage.cards.business.aid.SleepMusicBindingLogic$musicPlayStatusChange$1] */
    public SleepMusicBindingLogic(@NotNull Context context, @NotNull CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.context = context;
        this.scope = coroutineScope;
        this.service = ServiceManager.INSTANCE.getSleepAidService();
        this.sleepMusicView = LazyKt__LazyJVMKt.lazy(new b());
        this.musicPlayStatusChange = new Function0<Unit>() { // from class: com.huami.module.homepage.cards.business.aid.SleepMusicBindingLogic$musicPlayStatusChange$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Unit> {
                public final /* synthetic */ SleepMusicBindingLogic a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(SleepMusicBindingLogic sleepMusicBindingLogic) {
                    super(0);
                    this.a = sleepMusicBindingLogic;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.a.e();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2() {
                SleepMusicBindingLogic sleepMusicBindingLogic = this.a;
                sleepMusicBindingLogic.runOnUiThread(new a(sleepMusicBindingLogic));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SleepMusicBindingLogic sleepMusicBindingLogic, View view) {
        if (PolicyTipUtil.interceptWithShowTip()) {
            return;
        }
        if (TextUtils.isEmpty(sleepMusicBindingLogic.service.getMusicTitle())) {
            sleepMusicBindingLogic.d();
        } else {
            sleepMusicBindingLogic.service.playOrPauseMusic();
        }
    }

    private final SleepMusicCardView c() {
        return (SleepMusicCardView) this.sleepMusicView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_AID_C, new Pair[0]);
        if (HomeUtils.isMifitApp()) {
            this.service.startMiMusicPlayer(this.context);
        } else {
            this.service.startMusicPlayer(this.context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        String musicTitle = this.service.getMusicTitle();
        if (TextUtils.isEmpty(musicTitle)) {
            c().setInitUI();
        } else if (this.service.isMusicPlaying()) {
            c().setPlayingUI(musicTitle);
        } else {
            c().setStopPlayingUI(musicTitle);
        }
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void bind() {
        this.service.addPlayStatusChange(this.musicPlayStatusChange);
        e();
        c().resetToolsBtnStatus(new View.OnClickListener() { // from class: t07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepMusicBindingLogic.b(this.a, view);
            }
        });
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void close() {
        this.service.removePlayStatusChange(this.musicPlayStatusChange);
    }

    public final void runOnUiThread(@NotNull Function0<Unit> func) {
        e.f(this.scope, Dispatchers.getMain(), null, new a(func, null), 2, null);
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    @NotNull
    /* JADX INFO: renamed from: getView */
    public SleepMusicCardView getStepCardView() {
        return c();
    }
}
