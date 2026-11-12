package com.huami.bluetooth.profile.channel.module.battery.impl;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ModuleResultKt;
import com.huami.bluetooth.profile.channel.module.base.ResponsePredict;
import com.huami.bluetooth.profile.channel.module.battery.BatteryApi;
import com.huami.bluetooth.profile.channel.module.battery.BatteryCommand;
import com.huami.bluetooth.profile.channel.module.battery.BatteryModule;
import com.huami.bluetooth.profile.channel.module.battery.codec.BatteryCodec;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.IHMBatteryInfoCallback;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationHelperKt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/battery/impl/BatteryApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/battery/BatteryApi;", "", "byteArray", "", "a", "Lcom/xiaomi/hm/health/bt/profile/base/IHMBatteryInfoCallback;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerBatteryInfoCallback", "unregisterBatteryListener", "Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "getBatteryInfo", "Lcom/huami/bluetooth/profile/channel/module/battery/BatteryModule;", "Lcom/huami/bluetooth/profile/channel/module/battery/BatteryModule;", "module", "", "b", "Ljava/util/Set;", "batteryCallbacks", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/battery/BatteryModule;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BatteryApiImpl implements BatteryApi {

    @NotNull
    private static final String c = "BatteryApiImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BatteryModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Set<IHMBatteryInfoCallback> batteryCallbacks;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(BatteryApiImpl batteryApiImpl) {
            super(1, batteryApiImpl, BatteryApiImpl.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] bArr) {
            ((BatteryApiImpl) this.receiver).a(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ ModuleResult<BatteryInfo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ModuleResult<BatteryInfo> moduleResult) {
            super(0);
            this.a = moduleResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Query battery info result(" + this.a + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/base/IHMBatteryInfoCallback;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<IHMBatteryInfoCallback, CharSequence> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull IHMBatteryInfoCallback iHMBatteryInfoCallback) {
            return String.valueOf(iHMBatteryInfoCallback.hashCode());
        }
    }

    public BatteryApiImpl(@NotNull BatteryModule batteryModule) {
        this.module = batteryModule;
        batteryModule.registerNotify(new a(this));
        this.batteryCallbacks = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(byte[] byteArray) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(new BatteryCodec().decode(byteArray));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        BatteryInfo batteryInfo = (BatteryInfo) objM3845constructorimpl;
        if (batteryInfo == null) {
            return;
        }
        if (this.batteryCallbacks.size() > 1) {
            Debug.fi(MenstruationHelperKt.TAG, Intrinsics.stringPlus("WARN: more than one battery callback:", CollectionsKt___CollectionsKt.joinToString$default(this.batteryCallbacks, null, null, null, 0, null, c.a, 31, null)));
        }
        Iterator<T> it2 = this.batteryCallbacks.iterator();
        while (it2.hasNext()) {
            ((IHMBatteryInfoCallback) it2.next()).onBatteryChanged(batteryInfo);
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.battery.BatteryApi
    @Nullable
    public BatteryInfo getBatteryInfo() {
        ModuleResult<BatteryInfo> moduleResultDecode = new BatteryCodec().decode(this.module.sendRequest(new ModuleRequest(BatteryCommand.QueryBatteryCommand.INSTANCE, new ResponsePredict() { // from class: com.huami.bluetooth.profile.channel.module.battery.impl.BatteryApiImpl$getBatteryInfo$batteryResponse$1
            @Override // com.huami.bluetooth.profile.channel.module.base.ResponsePredict
            public boolean predict(@NotNull ModuleRequest request, @NotNull byte[] response) {
                return ArraysKt___ArraysKt.first(BatteryCommand.BatteryResponseCommand.INSTANCE.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String()) == ArraysKt___ArraysKt.first(response);
            }
        }, 0L, null, false, 28, null)));
        HMLog.info(c, new b(moduleResultDecode));
        return (BatteryInfo) ModuleResultKt.peel(moduleResultDecode);
    }

    @Override // com.huami.bluetooth.profile.channel.module.battery.BatteryApi
    public boolean registerBatteryInfoCallback(@NotNull IHMBatteryInfoCallback listener) {
        Debug.fi(c, "add " + listener.hashCode() + " add result:" + this.batteryCallbacks.add(listener) + ", size:" + this.batteryCallbacks.size());
        return true;
    }

    @Override // com.huami.bluetooth.profile.channel.module.battery.BatteryApi
    public void unregisterBatteryListener(@NotNull IHMBatteryInfoCallback listener) {
        Debug.fi(c, "remove " + listener.hashCode() + " remove result:" + this.batteryCallbacks.remove(listener) + ", size:" + this.batteryCallbacks.size());
    }
}
