package com.xiaomi.hm.health.play.card.intelligence.watchface;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.amap.api.mapcore.util.hl;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.databinding.PlayCardWatchfaceBinding;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.play.bean.WatchFaceData;
import com.xiaomi.hm.health.play.card.AbstractCardRender;
import com.xiaomi.hm.health.play.card.CardUiData;
import com.xiaomi.hm.health.play.card.intelligence.watchface.WatchFaceCardRender;
import com.xiaomi.hm.health.play.di.PlayKoinModuleKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00011B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b/\u00100J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u0019\u0010\u001a\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001e\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR\u001f\u0010#\u001a\u0004\u0018\u00010\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\"R(\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u0010.\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b \u0010-¨\u00062"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/watchface/WatchFaceCardRender;", "Lcom/xiaomi/hm/health/play/card/AbstractCardRender;", "Lcom/xiaomi/hm/health/databinding/PlayCardWatchfaceBinding;", "Lorg/koin/core/component/KoinComponent;", "", "l", z.j, "", "deviceSource", "h", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "setUiData", "onCardClick", "Landroidx/lifecycle/LifecycleOwner;", "g", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/xiaomi/hm/health/play/card/intelligence/watchface/WatchFaceCardAdapter;", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/play/card/intelligence/watchface/WatchFaceCardAdapter;", "watchFaceCardAdapter", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "i", "f", "()Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingDialog", "", "", "Lcom/xiaomi/hm/health/play/bean/WatchFaceData;", "Ljava/util/Map;", "watchFaceCache", "Landroid/view/View;", hl.k, "Landroid/view/View;", "errorLayout", "()Landroid/view/View;", "_errorLayout", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"InflateParams"})
public final class WatchFaceCardRender extends AbstractCardRender<PlayCardWatchfaceBinding> implements KoinComponent {

    @NotNull
    private static final String m = "WatchFaceCardRender";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private View errorLayout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy watchFaceCardAdapter = LazyKt__LazyJVMKt.lazy(e.a);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingDialog = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, List<WatchFaceData>> watchFaceCache = new LinkedHashMap();

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy _errorLayout = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<View> {
        public a() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(WatchFaceCardRender watchFaceCardRender, View view) {
            HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceManager.getInstance().getMajorDeviceType());
            LoadingDialogHelper loadingDialogHelperF = watchFaceCardRender.f();
            if (loadingDialogHelperF != null) {
                loadingDialogHelperF.showLoading();
            }
            watchFaceCardRender.h(boundDeviceSource.getValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final View getA() {
            View viewInflate = LayoutInflater.from(WatchFaceCardRender.this.getMContext()).inflate(R.layout.play_dial_layout_error, (ViewGroup) null);
            final WatchFaceCardRender watchFaceCardRender = WatchFaceCardRender.this;
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_retry);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(ExtensionsKt.getDp(6.0f));
            gradientDrawable.setStroke(ExtensionsKt.getDp(1), Color.parseColor("#FF5353"));
            Unit unit = Unit.INSTANCE;
            textView.setBackground(gradientDrawable);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.play.card.intelligence.watchface.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WatchFaceCardRender.a.b(watchFaceCardRender, view);
                }
            });
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
            layoutParams.startToStart = 0;
            layoutParams.topToBottom = watchFaceCardRender.getBinding().tvTitle.getId();
            layoutParams.endToEnd = 0;
            viewInflate.setLayoutParams(layoutParams);
            viewInflate.setVisibility(8);
            return viewInflate;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.play.card.intelligence.watchface.WatchFaceCardRender$getWatchFaceList$1", f = "WatchFaceCardRender.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<WatchFaceData> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<WatchFaceData> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "res: " + this.a;
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.play.card.intelligence.watchface.WatchFaceCardRender$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0987b extends Lambda implements Function0<String> {
            public static final C0987b a = new C0987b();

            public C0987b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "获取表盘列表数据异常";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/xiaomi/hm/health/play/bean/WatchFaceData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.play.card.intelligence.watchface.WatchFaceCardRender$getWatchFaceList$1$res$1", f = "WatchFaceCardRender.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends WatchFaceData>>, Object> {
            public int a;
            public final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(int i, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends WatchFaceData>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super List<WatchFaceData>>) continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<WatchFaceData>> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return WatchFaceApi.INSTANCE.getWatchFaceList(this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchFaceCardRender.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    c cVar = new c(this.c, null);
                    this.a = 1;
                    obj = BuildersKt.withContext(io2, cVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                List list = (List) obj;
                HMLog.info(WatchFaceCardRender.m, new a(list));
                LoadingDialogHelper loadingDialogHelperF = WatchFaceCardRender.this.f();
                if (loadingDialogHelperF != null) {
                    loadingDialogHelperF.hideLoading();
                }
                WatchFaceCardRender.this.watchFaceCache.put(Boxing.boxInt(this.c), list);
                WatchFaceCardRender.this.updateUi();
            } catch (Exception e) {
                LoadingDialogHelper loadingDialogHelperF2 = WatchFaceCardRender.this.f();
                if (loadingDialogHelperF2 != null) {
                    loadingDialogHelperF2.hideLoading();
                }
                HMLog.error$default(WatchFaceCardRender.m, null, e, C0987b.a, 2, null);
                WatchFaceCardRender.this.l();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<LoadingDialogHelper> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialogHelper getA() {
            return new LoadingDialogHelper((Activity) WatchFaceCardRender.this.getLifecycleOwner());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSource a;
        public final /* synthetic */ WatchFaceCardRender b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMDeviceSource hMDeviceSource, WatchFaceCardRender watchFaceCardRender) {
            super(0);
            this.a = hMDeviceSource;
            this.b = watchFaceCardRender;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            HMDeviceSource hMDeviceSource = this.a;
            List list = (List) this.b.watchFaceCache.get(Integer.valueOf(this.a.getValue()));
            return "deviceSource: " + hMDeviceSource + " watchFaceCache size: " + (list == null ? null : Integer.valueOf(list.size()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/watchface/WatchFaceCardAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<WatchFaceCardAdapter> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WatchFaceCardAdapter getA() {
            return new WatchFaceCardAdapter();
        }
    }

    public WatchFaceCardRender(@NotNull LifecycleOwner lifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadingDialogHelper f() {
        return (LoadingDialogHelper) this.loadingDialog.getValue();
    }

    private final WatchFaceCardAdapter g() {
        return (WatchFaceCardAdapter) this.watchFaceCardAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(int deviceSource) {
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this.lifecycleOwner), null, null, new b(deviceSource, null), 3, null);
    }

    private final View i() {
        return (View) this._errorLayout.getValue();
    }

    private final void j() {
        View view = this.errorLayout;
        if (view != null) {
            Objects.requireNonNull(view);
            view.setVisibility(8);
            getBinding().getRoot().setBackgroundResource(R.drawable.play_watch_face_bg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(CardUiData cardUiData, Context context, HMDeviceSource hMDeviceSource, View view) {
        cardUiData.getPlayTool().getTool().open(context, hMDeviceSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        if (this.errorLayout == null) {
            this.errorLayout = i();
            ConstraintLayout root = getBinding().getRoot();
            View view = this.errorLayout;
            Objects.requireNonNull(view);
            root.addView(view);
        }
        View view2 = this.errorLayout;
        Objects.requireNonNull(view2);
        view2.setVisibility(0);
        getBinding().getRoot().setBackgroundColor(-1);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void onCardClick(@NotNull Context context, @NotNull CardUiData uiParams) {
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void setUiData(@NotNull final Context context, @NotNull final CardUiData uiParams) {
        Unit unit;
        final HMDeviceSource majorDeviceSource = PlayKoinModuleKt.getMajorDeviceSource();
        HMLog.info(m, new d(majorDeviceSource, this));
        List<WatchFaceData> list = this.watchFaceCache.get(Integer.valueOf(majorDeviceSource.getValue()));
        if (list == null) {
            unit = null;
        } else {
            j();
            getBinding().rlWatchFace.setAdapter(g());
            g().setData(list);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            h(majorDeviceSource.getValue());
        }
        getBinding().tvMore.setOnClickListener(new View.OnClickListener() { // from class: pe8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WatchFaceCardRender.k(uiParams, context, majorDeviceSource, view);
            }
        });
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public PlayCardWatchfaceBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return PlayCardWatchfaceBinding.inflate(inflater, rootView, true);
    }
}
