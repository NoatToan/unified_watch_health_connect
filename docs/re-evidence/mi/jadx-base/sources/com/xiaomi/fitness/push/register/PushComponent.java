package com.xiaomi.fitness.push.register;

import android.content.SharedPreferences;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.cache.sp.SpExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ComponentState;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.push.export.PushManager;
import com.xiaomi.fitness.push.export.PushManagerExtKt;
import com.xiaomi.fitness.push.register.PushComponent;
import com.xiaomi.fitness.push.sp.PushPreference;
import com.xiaomi.fitness.push.utils.PushUtils;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import defpackage.dqe;
import defpackage.xei;
import defpackage.xpe;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/push/register/PushComponent;", "", "<init>", "()V", "registerAppCreate", "", "initComponentState", "registerPushSDK", "push_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "push")
public final class PushComponent {
    private final void initComponentState() {
        RegionPreference regionPreference = RegionPreference.INSTANCE;
        regionPreference.registerOnSharedPreferenceChangeListener(new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: tei
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                PushComponent.initComponentState$lambda$2(sharedPreferences, str);
            }
        });
        ComponentState.INSTANCE.enableComponent(regionPreference.getPRIVACY_AGREE(), NetworkStatusReceiver.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initComponentState$lambda$2(SharedPreferences sharedPreferences, String str) {
        final RegionPreference regionPreference = RegionPreference.INSTANCE;
        if (Intrinsics.areEqual(str, SpExtKt.getKey(new MutablePropertyReference0Impl(regionPreference) { // from class: com.xiaomi.fitness.push.register.PushComponent$initComponentState$1$1
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Boolean.valueOf(((RegionPreference) this.receiver).getPRIVACY_AGREE());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((RegionPreference) this.receiver).setPRIVACY_AGREE(((Boolean) obj).booleanValue());
            }
        }))) {
            xei.d("initComponentState() called with:  key = " + str);
            ComponentState.INSTANCE.enableComponent(regionPreference.getPRIVACY_AGREE(), NetworkStatusReceiver.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerAppCreate$lambda$0(boolean z) {
        xei.b("isLogin:" + z);
        if (!z) {
            PushManagerExtKt.getInstance(PushManager.INSTANCE).unRegister(AppUtil.getApp());
        } else if (z && PushPreference.INSTANCE.isOpenPush() && RegionExtKt.isRegionSelected(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            PushUtils.INSTANCE.register();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerAppCreate$lambda$1(PushComponent this$0, String old, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(str, "new");
        xei.d(old + "   " + str);
        this$0.registerPushSDK();
        return Unit.INSTANCE;
    }

    private final void registerPushSDK() {
        AccountManager.Companion companion = AccountManager.INSTANCE;
        boolean zIsLogin = AccountManagerExtKt.getInstance(companion).isLogin();
        PushPreference pushPreference = PushPreference.INSTANCE;
        xei.d("PushComponent  registerPushSDK " + zIsLogin + " " + pushPreference.isOpenPush());
        if (AccountManagerExtKt.getInstance(companion).isLogin() && pushPreference.isOpenPush()) {
            PushUtils.INSTANCE.register();
        }
    }

    @ComponentTask(notEarlierThan = 4, onMainThread = true)
    public final void registerAppCreate() {
        xei.d("PushComponent  registerAppCreate");
        RegionManager.Companion companion = RegionManager.INSTANCE;
        if (RegionExtKt.isRegionSelected(RegionExtKt.getInstance(companion))) {
            registerPushSDK();
        }
        Function1<? super Boolean, Unit> function1 = new Function1() { // from class: rei
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PushComponent.registerAppCreate$lambda$0(((Boolean) obj).booleanValue());
            }
        };
        RegionExtKt.getInstance(companion).addRegionChangeListener(new Function2() { // from class: sei
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PushComponent.registerAppCreate$lambda$1(this.f33565a, (String) obj, (String) obj2);
            }
        });
        AccountManagerExtKt.getInstance(AccountManager.INSTANCE).addAccountListener(function1);
        xpe.b(AppUtil.getApp(), new dqe() { // from class: com.xiaomi.fitness.push.register.PushComponent.registerAppCreate.2
            @Override // defpackage.dqe
            public void log(String msg) {
                xei.d("miPush log msg:" + msg);
            }

            public void setTag(String msg) {
                xei.d("miPush setTag msg:" + msg);
            }

            @Override // defpackage.dqe
            public void log(String msg, Throwable throwable) {
                xei.c("miPush log msg:" + msg, throwable);
            }
        });
        initComponentState();
    }
}
