package com.xiaomi.hm.health.play.card;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.CustomToast;
import com.loc.z;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.play.PlayTool;
import com.xiaomi.hm.health.play.card.AbstractDeviceCardRender;
import com.xiaomi.hm.health.play.di.PlayKoinModuleKt;
import com.xiaomi.hm.health.smalltool.model.Tool;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b%\u0010&J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u000f\u001a\u00020\bH&J\b\u0010\u0010\u001a\u00020\bH&J\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\u0012\u001a\u00020\bH\u0017R\u0019\u0010\u0018\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR%\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R%\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b\u0014\u0010 ¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/play/card/AbstractDeviceCardRender;", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/play/card/AbstractCardRender;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "", "onCardClick", "showDeviceNotConnectTip", "", "isConnected", "setCommonData", "setDeviceData", "onDeviceNotConnected", "onDeviceNotActive", "setUiData", "onClear", "Landroidx/lifecycle/LifecycleOwner;", "g", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Ljava/util/concurrent/atomic/AtomicBoolean;", "h", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "i", "Lkotlin/Lazy;", "()Landroidx/lifecycle/LiveData;", "deviceConnectLiveData", "Lcom/xiaomi/hm/health/device/event/HMDeviceBindEvent;", z.j, "deviceBoundLiveData", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class AbstractDeviceCardRender<T extends ViewBinding> extends AbstractCardRender<T> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private AtomicBoolean isConnected = new AtomicBoolean(true);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceConnectLiveData = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceBoundLiveData = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ AbstractDeviceCardRender<T> a;
        public final /* synthetic */ HMDeviceConnectionEvent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractDeviceCardRender<T> abstractDeviceCardRender, HMDeviceConnectionEvent hMDeviceConnectionEvent) {
            super(0);
            this.a = abstractDeviceCardRender;
            this.b = hMDeviceConnectionEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            PlayTool playTool;
            Tool tool;
            CardUiData mUiParam = this.a.getMUiParam();
            String strName = null;
            if (mUiParam != null && (playTool = mUiParam.getPlayTool()) != null && (tool = playTool.getTool()) != null) {
                strName = tool.name();
            }
            return strName + " deviceConnectLiveData " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/device/event/HMDeviceBindEvent;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<LiveData<HMDeviceBindEvent>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LiveData<HMDeviceBindEvent> invoke() {
            return InvalidateLiveData.INSTANCE.listen(DataNotifiers.INSTANCE.getDeviceBoundNotifier());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<LiveData<HMDeviceConnectionEvent>> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LiveData<HMDeviceConnectionEvent> invoke() {
            return InvalidateLiveData.INSTANCE.listen(DataNotifiers.INSTANCE.getDeviceConnectNotifier());
        }
    }

    public AbstractDeviceCardRender(@NotNull LifecycleOwner lifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner;
        h().observe(lifecycleOwner, new Observer() { // from class: z
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AbstractDeviceCardRender.f(this.a, (HMDeviceConnectionEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(AbstractDeviceCardRender abstractDeviceCardRender, HMDeviceConnectionEvent hMDeviceConnectionEvent) {
        PlayTool playTool;
        if (hMDeviceConnectionEvent != null && hMDeviceConnectionEvent.getDeviceType() == PlayKoinModuleKt.getMajorDeviceType()) {
            CardUiData mUiParam = abstractDeviceCardRender.getMUiParam();
            boolean z = false;
            if (mUiParam != null && (playTool = mUiParam.getPlayTool()) != null && playTool.isDeviceActive()) {
                z = true;
            }
            if (z) {
                HMLog.info("AbstractDeviceCardRender", new a(abstractDeviceCardRender, hMDeviceConnectionEvent));
                if (abstractDeviceCardRender.isConnected.compareAndSet(true, hMDeviceConnectionEvent.isConnected())) {
                    abstractDeviceCardRender.onDeviceNotConnected();
                }
                abstractDeviceCardRender.isConnected.set(hMDeviceConnectionEvent.isConnected());
            }
        }
    }

    private final LiveData<HMDeviceBindEvent> g() {
        return (LiveData) this.deviceBoundLiveData.getValue();
    }

    private final LiveData<HMDeviceConnectionEvent> h() {
        return (LiveData) this.deviceConnectLiveData.getValue();
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public boolean isConnected() {
        return this.isConnected.get();
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void onCardClick(@NotNull Context context, @NotNull CardUiData uiParams) {
        if (uiParams.getPlayTool().isDeviceActive() && this.isConnected.get()) {
            super.onCardClick(context, uiParams);
        } else {
            if (!uiParams.getPlayTool().isDeviceActive() || this.isConnected.get()) {
                return;
            }
            removeNewTipView(uiParams);
            showDeviceNotConnectTip(context);
        }
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender, com.xiaomi.hm.health.play.card.ICardRender
    @CallSuper
    public void onClear() {
        super.onClear();
        h().removeObservers(this.lifecycleOwner);
        g().removeObservers(this.lifecycleOwner);
    }

    public abstract void onDeviceNotActive();

    public abstract void onDeviceNotConnected();

    public abstract void setCommonData(@NotNull Context context, @NotNull CardUiData uiParams);

    public abstract void setDeviceData(@NotNull Context context, @NotNull CardUiData uiParams);

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public final void setUiData(@NotNull Context context, @NotNull CardUiData uiParams) {
        ViewGroup viewGroup;
        setCommonData(context, uiParams);
        if (!uiParams.getPlayTool().isDeviceActive()) {
            View root = getBinding().getRoot();
            viewGroup = root instanceof ViewGroup ? (ViewGroup) root : null;
            if (viewGroup != null) {
                AbstractDeviceCardRenderKt.setChildAlpha(viewGroup, 0.4f);
            }
            onDeviceNotActive();
            return;
        }
        this.isConnected.set(HMDeviceManager.getInstance().isConnected(PlayKoinModuleKt.getMajorDeviceType()));
        View root2 = getBinding().getRoot();
        viewGroup = root2 instanceof ViewGroup ? (ViewGroup) root2 : null;
        if (viewGroup != null) {
            AbstractDeviceCardRenderKt.setChildAlpha(viewGroup, 1.0f);
        }
        if (this.isConnected.get()) {
            setDeviceData(context, uiParams);
        } else {
            onDeviceNotConnected();
        }
    }

    public void showDeviceNotConnectTip(@NotNull Context context) {
        CustomToast.showShort(context, R.string.fh_device_connect_require);
    }
}
