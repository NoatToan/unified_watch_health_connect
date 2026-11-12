package com.xiaomi.hm.health.speech.utils;

import android.content.Context;
import com.huami.ai.speech.simplify.alexa.language.AlexaLanguageUtilsKt;
import com.huami.ai.speech.simplify.register.SpeechRegister;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.identity.auth.alexa.AlexaAuthKtxKt;
import com.huami.identity.auth.alexa.AuthApi;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.CompanionApplication;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/speech/utils/SpeechEventBusRegister;", "Lorg/koin/core/component/KoinComponent;", "", "a", "b", "registerEventBus", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "event", "onEventBackgroundThread", "Lcom/xiaomi/hm/health/device/event/HMDeviceBindEvent;", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Ljava/lang/String;", "tag", "<init>", "(Landroid/content/Context;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SpeechEventBusRegister implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String tag = "speech";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "非MILI类型的Bind事件不处理";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSource a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMDeviceSource hMDeviceSource) {
            super(0);
            this.a = hMDeviceSource;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "获取到MiLi类型设备的Source:" + this.a.name();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSource a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMDeviceSource hMDeviceSource) {
            super(0);
            this.a = hMDeviceSource;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "获取到Watch类型设备的Source：" + this.a.name();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Object> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return "speech event bus register";
        }
    }

    public SpeechEventBusRegister(@NotNull Context context) {
        this.context = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a() {
        AuthApi authApi = (AuthApi) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AuthApi.class), null, null);
        if (authApi.isLogin()) {
            AlexaAuthKtxKt.signOutSync(authApi);
        }
    }

    private final void b() {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        HMLog.info("speech", new b(boundDeviceSource));
        HMDeviceSource boundDeviceSource2 = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.WATCH);
        HMLog.info("speech", new c(boundDeviceSource2));
        HMDeviceSource hMDeviceSource = HMDeviceSource.VDEVICE;
        if (boundDeviceSource == hMDeviceSource) {
            if (boundDeviceSource2 == hMDeviceSource) {
                return;
            } else {
                boundDeviceSource = boundDeviceSource2;
            }
        }
        SpeechRegister.INSTANCE.initSpeech(CompanionApplication.get(), boundDeviceSource);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void onEventBackgroundThread(@NotNull HMDeviceConnectionEvent event) {
        if (event.isConnected()) {
            b();
        }
    }

    public final void registerEventBus() {
        LogcatKt.info(Logcat.INSTANCE, this.tag, d.a);
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    public final void onEventBackgroundThread(@NotNull HMDeviceBindEvent event) {
        if (event.getDeviceType() != HMDeviceType.MILI) {
            HMLog.info("speech", a.a);
        } else {
            if (event.isBound()) {
                b();
                SpeechRegister.INSTANCE.syncAlexaLanguage();
                a();
                return;
            }
            AlexaLanguageUtilsKt.clearSavedAlexaLanguage();
        }
    }
}
