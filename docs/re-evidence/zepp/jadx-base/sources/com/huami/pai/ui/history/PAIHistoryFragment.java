package com.huami.pai.ui.history;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.airbnb.lottie.LottieAnimationView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.pai.dto.HttpUserInfo;
import com.huami.pai.dto.HttpUserInfoKt;
import com.huami.pai.dto.IHttpUserInfoManager;
import com.huami.pai.ext.DateExKt;
import com.huami.pai.ext.LottieExKt;
import com.huami.pai.ext.PaiTimeExKt;
import com.huami.pai.ext.ViewExKt;
import com.huami.pai.koin.ScopesAndQualifersKt;
import com.huami.pai.lib.R;
import com.huami.pai.lib.databinding.FragmentPaiHistoryBinding;
import com.huami.pai.p004const.StatEvent;
import com.huami.pai.sp.ISharedPref;
import com.huami.pai.ui.history.PAIHistoryFragment;
import com.huami.pai.view.PAIHorizontalRecyclerView;
import com.huami.pai.view.PAINumberRunningTextView;
import com.huami.pai.view.PaiGuidePopupFragment;
import com.huami.pai.view.PaiPopupFragment;
import com.huami.pai.vo.PAIDataVo;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.loc.z;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bB\u0010CJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000eH\u0003J\u001a\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R\u0016\u0010\u0017\u001a\u00020\u000e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u000e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR#\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001bR\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001bR\u001d\u00102\u001a\u00020/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u001f\u001a\u0004\b\u001a\u00101R\u001d\u00107\u001a\u0002038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b\u0018\u00106R\u001d\u0010:\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u001f\u001a\u0004\b0\u00109R\u001d\u0010;\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b4\u00109R\u001d\u0010<\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b#\u00109R\u001d\u0010=\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b(\u00109R\u001d\u0010>\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b+\u00109R\u001d\u0010@\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u001f\u001a\u0004\b-\u00109R\u001d\u0010A\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b8\u00109¨\u0006D"}, d2 = {"Lcom/huami/pai/ui/history/PAIHistoryFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/huami/pai/vo/PAIDataVo;", "pai", "", "r", "", "tp", "", "o", GoogleApiAvailabilityLight.b, "isGeneratePaiData", "m", DTransferConstants.SEARCH_KEY, "", SOAP.XMLNS, "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "a", "F", "PAI_VALUE_MIDDLE_MIN", "b", "PAI_VALUE_HIGH_MIN", "c", LogUtil.I, "ANIM_DURATION", "Lcom/huami/pai/ui/history/PAIHistroyRepo;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/huami/pai/ui/history/PAIHistroyRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/pai/dto/IHttpUserInfoManager;", "e", "l", "()Lcom/huami/pai/dto/IHttpUserInfoManager;", "userRepos", "", "f", "J", "createdTime", "g", "mGender", "h", "mAge", "Lcom/huami/pai/sp/ISharedPref;", "i", "()Lcom/huami/pai/sp/ISharedPref;", "mSharedPref", "Lcom/huami/pai/lib/databinding/FragmentPaiHistoryBinding;", z.j, "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "()Lcom/huami/pai/lib/databinding/FragmentPaiHistoryBinding;", "binding", hl.k, "()I", "s33Color", "s34Color", "s15Color", "s16Color", "s20Color", com.google.android.exoplayer2.text.ttml.b.r, "s21Color", "s4Color", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PAIHistoryFragment extends Fragment {
    public static final /* synthetic */ KProperty<Object>[] r;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float PAI_VALUE_MIDDLE_MIN;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float PAI_VALUE_HIGH_MIN;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int ANIM_DURATION;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy repo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy userRepos;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long createdTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int mGender;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int mAge;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSharedPref;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy s33Color;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy s34Color;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy s15Color;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy s16Color;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy s20Color;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Lazy s21Color;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Lazy s4Color;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Integer> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ViewExKt.color(PAIHistoryFragment.this.requireContext(), R.color.s15);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ViewExKt.color(PAIHistoryFragment.this.requireContext(), R.color.s16);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Integer> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ViewExKt.color(PAIHistoryFragment.this.requireContext(), R.color.s20);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Integer> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ViewExKt.color(PAIHistoryFragment.this.requireContext(), R.color.s21);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Integer> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ViewExKt.color(PAIHistoryFragment.this.requireContext(), R.color.s33);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Integer> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ViewExKt.color(PAIHistoryFragment.this.requireContext(), R.color.s34);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Integer> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ViewExKt.color(PAIHistoryFragment.this.requireContext(), R.color.s4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.ui.history.PAIHistoryFragment$updateProgress$1", f = "PAIHistoryFragment.kt", i = {}, l = {305}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<String[], Integer> c;

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
                return this.a.toString();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(HashMap<String[], Integer> map, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PAIHistoryFragment.this.new h(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    PAIHistoryFragment pAIHistoryFragment = PAIHistoryFragment.this;
                    HashMap<String[], Integer> map = this.c;
                    Result.Companion companion = Result.Companion;
                    LottieAnimationView lottieAnimationView = pAIHistoryFragment.b().lvLottieBgAnimation;
                    this.a = 1;
                    if (LottieExKt.awaitCompositionLoaded$default(lottieAnimationView, map, null, this, 2, null) == coroutine_suspended) {
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
                HMLog.info("HMPaiJob - LottieEx", new a(thM3848exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.ui.history.PAIHistoryFragment$updateProgress$3$1", f = "PAIHistoryFragment.kt", i = {}, l = {341}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ LottieAnimationView b;
        public final /* synthetic */ PAIHistoryFragment c;
        public final /* synthetic */ int d;

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
                return this.a.toString();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(LottieAnimationView lottieAnimationView, PAIHistoryFragment pAIHistoryFragment, int i, Continuation<? super i> continuation) {
            super(2, continuation);
            this.b = lottieAnimationView;
            this.c = pAIHistoryFragment;
            this.d = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new i(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    LottieAnimationView lottieAnimationView = this.b;
                    PAIHistoryFragment pAIHistoryFragment = this.c;
                    int i2 = this.d;
                    Result.Companion companion = Result.Companion;
                    HashMap map = new HashMap();
                    map.put(new String[]{"外圈 动", "多边星形 1", "描边 1"}, Boxing.boxInt(pAIHistoryFragment.k()));
                    map.put(new String[]{"外圈", "多边星形 1", "描边 1"}, Boxing.boxInt(i2));
                    HashMap map2 = new HashMap();
                    map2.put(new String[]{"中心", "多边星形 1", "填充 1"}, Boxing.boxInt(i2));
                    this.a = 1;
                    if (LottieExKt.awaitCompositionLoaded(lottieAnimationView, map, map2, this) == coroutine_suspended) {
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
                HMLog.info("HMPaiJob - LottieExProgress", new a(thM3848exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[11];
        kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PAIHistoryFragment.class), "binding", "getBinding()Lcom/huami/pai/lib/databinding/FragmentPaiHistoryBinding;"));
        r = kPropertyArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PAIHistoryFragment() {
        super(R.layout.fragment_pai_history);
        this.PAI_VALUE_MIDDLE_MIN = 50.0f;
        this.PAI_VALUE_HIGH_MIN = 100.0f;
        this.ANIM_DURATION = 2000;
        final Qualifier qualifier = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.repo = LazyKt__LazyJVMKt.lazy(new Function0<PAIHistroyRepo<PAIDataVo>>() { // from class: com.huami.pai.ui.history.PAIHistoryFragment$special$$inlined$injectInPai$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.pai.ui.history.PAIHistroyRepo<com.huami.pai.vo.PAIDataVo>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final PAIHistroyRepo<PAIDataVo> getA() {
                return ScopesAndQualifersKt.paiScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(PAIHistroyRepo.class), qualifier, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.userRepos = LazyKt__LazyJVMKt.lazy(new Function0<IHttpUserInfoManager>() { // from class: com.huami.pai.ui.history.PAIHistoryFragment$special$$inlined$injectInPai$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.pai.dto.IHttpUserInfoManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final IHttpUserInfoManager getA() {
                return ScopesAndQualifersKt.paiScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(IHttpUserInfoManager.class), objArr4, objArr5);
            }
        });
        HttpUserInfo userInfo = l().getUserInfo();
        this.createdTime = userInfo == null ? HttpUserInfoKt.DEFAULT_CREATED_TIME : userInfo.getCreatedTime();
        HttpUserInfo userInfo2 = l().getUserInfo();
        this.mGender = userInfo2 == null ? 0 : userInfo2.getGender();
        HttpUserInfo userInfo3 = l().getUserInfo();
        this.mAge = userInfo3 == null ? 30 : userInfo3.getAge();
        final Object[] objArr6 = objArr2 == true ? 1 : 0;
        final Object[] objArr7 = objArr == true ? 1 : 0;
        this.mSharedPref = LazyKt__LazyJVMKt.lazy(new Function0<ISharedPref>() { // from class: com.huami.pai.ui.history.PAIHistoryFragment$special$$inlined$injectInPai$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.pai.sp.ISharedPref, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ISharedPref getA() {
                return ScopesAndQualifersKt.paiScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(ISharedPref.class), objArr6, objArr7);
            }
        });
        this.binding = FragmentViewBindingKt.viewBinding(new PAIHistoryFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentPaiHistoryBinding.class)));
        this.s33Color = LazyKt__LazyJVMKt.lazy(new e());
        this.s34Color = LazyKt__LazyJVMKt.lazy(new f());
        this.s15Color = LazyKt__LazyJVMKt.lazy(new a());
        this.s16Color = LazyKt__LazyJVMKt.lazy(new b());
        this.s20Color = LazyKt__LazyJVMKt.lazy(new c());
        this.s21Color = LazyKt__LazyJVMKt.lazy(new d());
        this.s4Color = LazyKt__LazyJVMKt.lazy(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentPaiHistoryBinding b() {
        return (FragmentPaiHistoryBinding) this.binding.getValue(this, r[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISharedPref c() {
        return (ISharedPref) this.mSharedPref.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PAIHistroyRepo<PAIDataVo> d() {
        return (PAIHistroyRepo) this.repo.getValue();
    }

    private final int e() {
        return ((Number) this.s15Color.getValue()).intValue();
    }

    private final int f() {
        return ((Number) this.s16Color.getValue()).intValue();
    }

    private final int g() {
        return ((Number) this.s20Color.getValue()).intValue();
    }

    private final int h() {
        return ((Number) this.s21Color.getValue()).intValue();
    }

    private final int i() {
        return ((Number) this.s33Color.getValue()).intValue();
    }

    private final int j() {
        return ((Number) this.s34Color.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int k() {
        return ((Number) this.s4Color.getValue()).intValue();
    }

    private final IHttpUserInfoManager l() {
        return (IHttpUserInfoManager) this.userRepos.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(boolean isGeneratePaiData) {
        boolean z = c().getBoolean("key_pai_guide_rollout");
        if (isGeneratePaiData && z) {
            q();
        }
    }

    private final boolean n(int tp) {
        int i2 = c().getInt("pai_total_value", 0);
        if (tp < 50) {
            if (i2 < 30 || i2 >= 50) {
                return false;
            }
        } else if (tp < 100) {
            if (i2 < 50 || i2 >= 100) {
                return false;
            }
        } else if (i2 < 100) {
            return false;
        }
        return true;
    }

    private final boolean o(int tp) {
        if (tp < 30) {
            return false;
        }
        return (Intrinsics.areEqual(SportDay.getToday().getKey(), c().getString("pai_total_date", "")) && n(tp)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(PAIHistoryFragment pAIHistoryFragment, View view) {
        pAIHistoryFragment.q();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.INSTANCE.getSPORT_PAI_C()).addExtra("tp", "why"));
    }

    private final void q() {
        getChildFragmentManager().beginTransaction().add(new PaiGuidePopupFragment(), "paiGuide").commitAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(PAIDataVo pai) {
        if (o((int) pai.getTp()) && !"pai_total_never_show".equals(c().getString("pai_total_date", ""))) {
            PaiPopupFragment paiPopupFragment = new PaiPopupFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(PaiPopupFragment.ARG_PAI_TOTAL, (int) pai.getTp());
            paiPopupFragment.setArguments(bundle);
            paiPopupFragment.setCheckedListener(new PaiPopupFragment.OnCheckedListener() { // from class: com.huami.pai.ui.history.PAIHistoryFragment$showPaiPopup$1
                @Override // com.huami.pai.view.PaiPopupFragment.OnCheckedListener
                public void onChecked(boolean isChecked) {
                    if (isChecked) {
                        this.a.c().saveString("pai_total_date", "pai_total_never_show");
                    }
                }
            });
            getChildFragmentManager().beginTransaction().add(paiPopupFragment, "paiPop").commitAllowingStateLoss();
            c().saveString("pai_total_date", SportDay.getToday().getKey());
            c().saveInt("pai_total_value", (int) pai.getTp());
            return;
        }
        if (Intrinsics.areEqual(SportDay.getToday().getKey(), c().getString("pai_daily_date", "")) || pai.getDp() < 75.0f) {
            return;
        }
        PaiPopupFragment paiPopupFragment2 = new PaiPopupFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putInt(PaiPopupFragment.ARG_PAI_DAILY, (int) pai.getDp());
        paiPopupFragment2.setArguments(bundle2);
        getChildFragmentManager().beginTransaction().add(paiPopupFragment2, "paiPop").commitAllowingStateLoss();
        c().saveString("pai_daily_date", SportDay.getToday().getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    @ExperimentalCoroutinesApi
    public final void s(float tp) {
        int iAddAlpha;
        int iAddAlpha2;
        int iG;
        if (tp < this.PAI_VALUE_MIDDLE_MIN) {
            iAddAlpha = ViewExKt.addAlpha(j(), 0.5d);
            iAddAlpha2 = ViewExKt.addAlpha(j(), 0.25d);
            iG = i();
        } else if (tp < this.PAI_VALUE_HIGH_MIN) {
            iAddAlpha = ViewExKt.addAlpha(f(), 0.5d);
            iAddAlpha2 = ViewExKt.addAlpha(f(), 0.25d);
            iG = e();
        } else {
            iAddAlpha = ViewExKt.addAlpha(h(), 0.5d);
            iAddAlpha2 = ViewExKt.addAlpha(h(), 0.25d);
            iG = g();
        }
        b().lvLottieBgAnimation.setAnimation("pai_value_ripple_orange.json");
        b().lvLottieBgAnimation.playAnimation();
        HashMap map = new HashMap();
        map.put(new String[]{"形状图层 6", "形状 1", "描边 1"}, Integer.valueOf(iAddAlpha));
        map.put(new String[]{"形状图层 7", "形状 1", "描边 1"}, Integer.valueOf(iAddAlpha2));
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new h(map, null), 3, null);
        float f2 = tp / this.PAI_VALUE_HIGH_MIN;
        LottieAnimationView lottieAnimationView = b().lvLottieProgressAnimation;
        lottieAnimationView.setAnimation("pai_progress_orange.json");
        lottieAnimationView.pauseAnimation();
        if (f2 <= 0.01d) {
            b().lvLottieProgressAnimation.setProgress(0.0f);
            b().paiFrameValue.setText("0");
            return;
        }
        LottieAnimationView lottieAnimationView2 = b().lvLottieProgressAnimation;
        lottieAnimationView2.setMinAndMaxProgress(0.0f, f2);
        lottieAnimationView2.playAnimation();
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new i(lottieAnimationView2, this, iG, null), 3, null);
        int i2 = this.ANIM_DURATION;
        float fMin = Math.min(i2, f2 * i2);
        PAINumberRunningTextView pAINumberRunningTextView = b().paiFrameValue;
        pAINumberRunningTextView.setDuration((int) fMin);
        pAINumberRunningTextView.playNumAnim(String.valueOf((int) tp));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final PAIHorizontalRecyclerView pAIHorizontalRecyclerView = (PAIHorizontalRecyclerView) view.findViewById(R.id.pai_value_list);
        final PAIHistoryViewModel pAIHistoryViewModel = (PAIHistoryViewModel) new ViewModelProvider(requireActivity()).get(PAIHistoryViewModel.class);
        AppCompatImageView appCompatImageView = b().paiDate;
        appCompatImageView.setVisibility(0);
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: tn5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PAIHistoryFragment.p(this.a, view2);
            }
        });
        d().getPaiLiveDatas().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.pai.ui.history.PAIHistoryFragment$onViewCreated$$inlined$observe$1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                PAIDataVo data;
                List list = (List) t;
                this.a.d().setList(list);
                this.a.m(!(list == null || list.isEmpty()));
                if (!(list == null || list.isEmpty()) && (data = this.a.d().getData(new Date())) != null) {
                    this.a.r(data);
                }
                PAIHorizontalRecyclerView pAIHorizontalRecyclerView2 = pAIHorizontalRecyclerView;
                if (pAIHorizontalRecyclerView2 == null) {
                    return;
                }
                if (pAIHorizontalRecyclerView2.getScrollState() == 0 || !pAIHorizontalRecyclerView2.isComputingLayout()) {
                    pAIHorizontalRecyclerView2.setReverseLayout(true);
                    pAIHorizontalRecyclerView2.setMaxValue(110.0f);
                    final PAIHistoryFragment pAIHistoryFragment = this.a;
                    final PAIHistoryViewModel pAIHistoryViewModel2 = pAIHistoryViewModel;
                    pAIHorizontalRecyclerView2.setCallback(new PAIHorizontalRecyclerView.Callback() { // from class: com.huami.pai.ui.history.PAIHistoryFragment$onViewCreated$2$2$1
                        @Override // com.huami.pai.view.PAIHorizontalRecyclerView.Callback
                        public void onSelect(@NotNull Date startDate, int position) {
                            Date dateNextDay = DateExKt.nextDay(startDate, -position);
                            PAIHistoryFragment pAIHistoryFragment2 = pAIHistoryFragment;
                            pAIHistoryFragment2.s(pAIHistoryFragment2.d().getRealOrPredictData(dateNextDay));
                            Analytics.recordEvent(new CountEventBuilder(StatEvent.INSTANCE.getSPORT_PAI_C()).addExtra("tp", "eachday"));
                            PAIHistoryViewModel pAIHistoryViewModel3 = pAIHistoryViewModel2;
                            String timeYMD = PaiTimeExKt.formatTimeYMD(dateNextDay);
                            PAIDataVo data2 = pAIHistoryFragment.d().getData(dateNextDay);
                            PAIHistoryFragment pAIHistoryFragment3 = pAIHistoryFragment;
                            if (data2 != null) {
                                data2.setAge(pAIHistoryFragment3.mAge);
                            }
                            if (data2 != null) {
                                data2.setGd(pAIHistoryFragment3.mGender);
                            }
                            Unit unit = Unit.INSTANCE;
                            if (data2 == null) {
                                data2 = new PAIDataVo(PaiTimeExKt.formatTimeYMD(dateNextDay), null, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, pAIHistoryFragment.d().getRealOrPredictData(dateNextDay), pAIHistoryFragment.mAge, pAIHistoryFragment.mGender, 0, 0, 0, 80, HttpUserInfoKt.getDefaultMaxHr(pAIHistoryFragment.mAge), 0L, 0L, 0L, 0, 0, 0L, 0, null, null, null, null, null, false, 2147279870, null);
                            }
                            pAIHistoryViewModel3.setSelectData(timeYMD, data2);
                        }
                    });
                    pAIHorizontalRecyclerView2.load(this.a.createdTime, this.a.d());
                }
            }
        });
    }
}
