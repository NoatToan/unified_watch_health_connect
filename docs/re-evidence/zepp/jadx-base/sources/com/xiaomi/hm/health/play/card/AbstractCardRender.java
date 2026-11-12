package com.xiaomi.hm.health.play.card;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import com.autonavi.base.ae.gmap.GLMapRender;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.play.PlayTool;
import com.xiaomi.hm.health.play.analytic.HealthStateEventKt;
import com.xiaomi.hm.health.play.card.AbstractCardRender;
import com.xiaomi.hm.health.play.p006new.PlayNewToolKeeper;
import com.xiaomi.hm.health.play.p006new.PlayNewToolManager;
import com.xiaomi.hm.health.smalltool.model.Tool;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b:\u0010;J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004J\u001f\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0006\u0010\u0016\u001a\u00020\fJ\u0006\u0010\u0017\u001a\u00020\fJ\b\u0010\u0018\u001a\u00020\fH\u0017R$\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010'\u001a\u00028\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001d\u00100\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b \u0010/R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00102¨\u0006<"}, d2 = {"Lcom/xiaomi/hm/health/play/card/AbstractCardRender;", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/play/card/ICardRender;", "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "", "c", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/view/ViewGroup;", "rootView", "", GLMapRender.TAG, "Landroid/view/LayoutInflater;", "inflater", "getLayoutViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;", "setUiData", "onCardClick", "removeNewTipView", "initData", "updateUi", "recordClickEvent", "onClear", "a", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mContext", "b", "Lcom/xiaomi/hm/health/play/card/CardUiData;", "getMUiParam", "()Lcom/xiaomi/hm/health/play/card/CardUiData;", "setMUiParam", "(Lcom/xiaomi/hm/health/play/card/CardUiData;)V", "mUiParam", "binding", "Landroidx/viewbinding/ViewBinding;", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Lcom/xiaomi/hm/health/play/card/NewToolTipUiProcess;", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/play/card/NewToolTipUiProcess;", "newToolTipUiProcess", GoogleApiAvailabilityLight.a, "Z", "isNewTipsAdded", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLayoutInit", "f", "isCleared", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class AbstractCardRender<T extends ViewBinding> implements ICardRender {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Context mContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private CardUiData mUiParam;
    public T binding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isNewTipsAdded;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isCleared;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy newToolTipUiProcess = LazyKt__LazyJVMKt.lazy(new a(this));

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private AtomicBoolean isLayoutInit = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/play/card/NewToolTipUiProcess;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<NewToolTipUiProcess> {
        public final /* synthetic */ AbstractCardRender<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractCardRender<T> abstractCardRender) {
            super(0);
            this.a = abstractCardRender;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NewToolTipUiProcess invoke() {
            return new NewToolTipUiProcess(this.a.getMContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ CardUiData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CardUiData cardUiData) {
            super(0);
            this.a = cardUiData;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PlayNewToolKeeper.INSTANCE.getInstance().saveToolClicked(this.a.getPlayTool().getTool().getKey());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ CardUiData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CardUiData cardUiData) {
            super(0);
            this.a = cardUiData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start render: " + this.a.getPlayTool().getTool().name();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ AbstractCardRender<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractCardRender<T> abstractCardRender) {
            super(0);
            this.a = abstractCardRender;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            PlayTool playTool;
            Tool tool;
            CardUiData mUiParam = this.a.getMUiParam();
            String key = null;
            if (mUiParam != null && (playTool = mUiParam.getPlayTool()) != null && (tool = playTool.getTool()) != null) {
                key = tool.getKey();
            }
            return key + " 重新刷新数据";
        }
    }

    private final NewToolTipUiProcess b() {
        return (NewToolTipUiProcess) this.newToolTipUiProcess.getValue();
    }

    private final boolean c(CardUiData uiParams) {
        return uiParams.getPlayTool().isDeviceActive() && PlayNewToolManager.INSTANCE.hasNewPlayTool(uiParams.getPlayTool().getTool()) && !PlayNewToolKeeper.INSTANCE.getInstance().getToolClicked(uiParams.getPlayTool().getTool().getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AbstractCardRender abstractCardRender, Context context, CardUiData cardUiData, View view) {
        abstractCardRender.onCardClick(context, cardUiData);
    }

    @NotNull
    public final T getBinding() {
        T t = this.binding;
        Objects.requireNonNull(t);
        return t;
    }

    @NotNull
    public abstract T getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView);

    @Nullable
    public final Context getMContext() {
        return this.mContext;
    }

    @Nullable
    public final CardUiData getMUiParam() {
        return this.mUiParam;
    }

    public void initData(@NotNull Context context, @NotNull CardUiData uiParams) {
    }

    public void onCardClick(@NotNull Context context, @NotNull CardUiData uiParams) {
        removeNewTipView(uiParams);
        uiParams.getPlayTool().getTool().open(context, HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceManager.getInstance().getMajorDeviceType()));
        recordClickEvent();
    }

    @Override // com.xiaomi.hm.health.play.card.ICardRender
    @CallSuper
    public void onClear() {
        this.isCleared = true;
    }

    public final void recordClickEvent() {
        PlayTool playTool;
        Tool tool;
        String key;
        String eventId;
        CardUiData cardUiData = this.mUiParam;
        if (cardUiData == null || (playTool = cardUiData.getPlayTool()) == null || (tool = playTool.getTool()) == null || (key = tool.getKey()) == null || (eventId = HealthStateEventKt.getEventId(key)) == null) {
            return;
        }
        HealthStateEventKt.recordEvent(HealthStateEventKt.HEALTH_C, eventId);
    }

    public final void removeNewTipView(@NotNull CardUiData uiParams) {
        if (c(uiParams)) {
            NewToolTipUiProcess newToolTipUiProcessB = b();
            ViewParent parent = getBinding().getRoot().getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            newToolTipUiProcessB.removeNewTipView((ViewGroup) parent, new b(uiParams));
        }
    }

    @Override // com.xiaomi.hm.health.play.card.ICardRender
    public final void render(@NotNull final Context context, @NotNull ViewGroup rootView, @NotNull final CardUiData uiParams) {
        if (this.isCleared) {
            return;
        }
        HMLog.debug("huqitest", new c(uiParams));
        this.mContext = context;
        this.mUiParam = uiParams;
        if (this.binding != null) {
            if (getBinding().getRoot().getParent() != null) {
                ViewParent parent = getBinding().getRoot().getParent();
                Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(getBinding().getRoot());
            }
            rootView.addView(getBinding().getRoot());
        } else {
            setBinding(getLayoutViewBinding(LayoutInflater.from(context), rootView));
        }
        if (c(uiParams)) {
            NewToolTipUiProcess.addNewTipView$default(b(), rootView, null, 2, null);
        }
        getBinding().getRoot().setOnClickListener(new View.OnClickListener() { // from class: y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractCardRender.d(this.a, context, uiParams, view);
            }
        });
        if (this.isLayoutInit.compareAndSet(false, true)) {
            initData(context, uiParams);
        }
        setUiData(context, uiParams);
    }

    public final void setBinding(@NotNull T t) {
        this.binding = t;
    }

    public final void setMContext(@Nullable Context context) {
        this.mContext = context;
    }

    public final void setMUiParam(@Nullable CardUiData cardUiData) {
        this.mUiParam = cardUiData;
    }

    public abstract void setUiData(@NotNull Context context, @NotNull CardUiData uiParams);

    public final void updateUi() {
        if (this.mContext == null || this.mUiParam == null) {
            return;
        }
        HMLog.debug("huqitest", new d(this));
        setUiData(this.mContext, this.mUiParam);
    }
}
