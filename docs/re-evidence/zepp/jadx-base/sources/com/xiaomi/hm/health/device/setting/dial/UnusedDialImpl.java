package com.xiaomi.hm.health.device.setting.dial;

import android.widget.ImageView;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.bean.MyWatchFaceBean;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.keeper.HMKeeperConstant;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0016JX\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062#\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016J2\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001d\u0010#\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/dial/UnusedDialImpl;", "Lcom/xiaomi/hm/health/device/setting/dial/ShowCurrentDialImpl;", "", "toString", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Landroid/widget/ImageView;", "skin", "dial", "ivTransparent", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "", "onFinish", "displayDial", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showCache", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "dialInfo", "showDial", "h", "Ljava/lang/String;", "getSn", "()Ljava/lang/String;", "setSn", "(Ljava/lang/String;)V", "sn", "Lcom/xiaomi/hm/health/device/setting/dial/IDialKeeper;", "i", "Lkotlin/Lazy;", "e", "()Lcom/xiaomi/hm/health/device/setting/dial/IDialKeeper;", HMKeeperConstant.KEEP_XML, "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class UnusedDialImpl extends ShowCurrentDialImpl {

    @NotNull
    private static final String j = "UnusedDialImpl";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private String sn;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy keeper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ MyWatchFaceBean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MyWatchFaceBean myWatchFaceBean) {
            super(0);
            this.a = myWatchFaceBean;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "deviceImage is " + this.a.getDeviceImage() + "； image is " + this.a.getImage() + "; transparentBackground " + this.a.getTransparentBackground();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnusedDialImpl() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.keeper = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<IDialKeeper>() { // from class: com.xiaomi.hm.health.device.setting.dial.UnusedDialImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.dial.IDialKeeper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IDialKeeper invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IDialKeeper.class), qualifier, objArr);
            }
        });
    }

    private final IDialKeeper e() {
        return (IDialKeeper) this.keeper.getValue();
    }

    @Override // com.xiaomi.hm.health.device.setting.dial.ShowCurrentDialImpl, com.xiaomi.hm.health.device.setting.dial.DialFetchApi
    @Nullable
    public Object displayDial(@NotNull HMDeviceSource hMDeviceSource, @NotNull ImageView imageView, @NotNull ImageView imageView2, @NotNull ImageView imageView3, @Nullable Function1<? super Boolean, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objDisplayDial = super.displayDial(hMDeviceSource, imageView, imageView2, imageView3, function1, continuation);
        return objDisplayDial == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objDisplayDial : Unit.INSTANCE;
    }

    @Nullable
    public final String getSn() {
        return this.sn;
    }

    public final void setSn(@Nullable String str) {
        this.sn = str;
    }

    @Override // com.xiaomi.hm.health.device.setting.dial.ShowCurrentDialImpl, com.xiaomi.hm.health.device.setting.dial.DialFetchApi
    public boolean showCache(@NotNull HMDeviceSource source, @NotNull ImageView skin, @NotNull ImageView dial, @NotNull ImageView ivTransparent) {
        MyWatchFaceBean myWatchFaceBean;
        if (this.sn == null || (myWatchFaceBean = e().getAllDialBean().get(this.sn)) == null) {
            return false;
        }
        return showDial(source, myWatchFaceBean, skin, dial, ivTransparent);
    }

    @Override // com.xiaomi.hm.health.device.setting.dial.ShowCurrentDialImpl
    public boolean showDial(@NotNull HMDeviceSource source, @Nullable MyWatchFaceBean dialInfo, @NotNull ImageView skin, @NotNull ImageView dial, @NotNull ImageView ivTransparent) {
        if (dialInfo == null) {
            return false;
        }
        DeviceConfigManager deviceConfigManager = getDeviceConfigManager(source);
        Pair<Integer, Integer> dialSize = deviceConfigManager.getDialSize();
        deviceConfigManager.setViewLayoutParams(dial, dialSize);
        deviceConfigManager.setViewLayoutParams(ivTransparent, dialSize);
        HMLog.info(j, new a(dialInfo));
        ExtensionsKt.loadUrl(skin, dialInfo.getDeviceImage());
        ExtensionsKt.loadWithRadius(dial, dialInfo.getImage(), deviceConfigManager.getDialRadiusForDevicePage());
        ExtensionsKt.loadUrlAndHintColor(ivTransparent, dialInfo.getTransparentBackground(), dialInfo.getColor());
        String transparentBackground = dialInfo.getTransparentBackground();
        ViewExKt.setVisible(ivTransparent, !(transparentBackground == null || transparentBackground.length() == 0));
        String deviceImage = dialInfo.getDeviceImage();
        if (deviceImage == null || deviceImage.length() == 0) {
            return false;
        }
        return dialInfo.getImage().length() > 0;
    }

    @Override // com.xiaomi.hm.health.device.setting.dial.ShowCurrentDialImpl
    @NotNull
    public String toString() {
        return j;
    }
}
