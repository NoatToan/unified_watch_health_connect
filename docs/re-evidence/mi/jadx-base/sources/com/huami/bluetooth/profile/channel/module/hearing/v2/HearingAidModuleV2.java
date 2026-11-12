package com.huami.bluetooth.profile.channel.module.hearing.v2;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.bg;
import defpackage.d4;
import defpackage.mht;
import defpackage.r3;
import defpackage.rf;
import defpackage.sf;
import defpackage.xf;
import defpackage.yf;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/v2/HearingAidModuleV2;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lsf;", "loadApi", "()Lsf;", "Lmht;", "loadBatteryApi", "()Lmht;", "Lxf;", "loadRoleApi", "()Lxf;", "", "init", "()V", "Lrf;", "hearingAIdApi$delegate", "Lkotlin/Lazy;", "getHearingAIdApi", "()Lrf;", "hearingAIdApi", "Lyf;", "roleApi$delegate", "getRoleApi", "()Lyf;", "roleApi", "Lbg;", "batteryApi$delegate", "getBatteryApi", "()Lbg;", "batteryApi", "Lr3;", "api", "<init>", "(Lr3;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 64)
public final class HearingAidModuleV2 extends com.huami.bluetooth.profile.channel.module.a {

    /* JADX INFO: renamed from: batteryApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy batteryApi;

    /* JADX INFO: renamed from: hearingAIdApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hearingAIdApi;

    /* JADX INFO: renamed from: roleApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy roleApi;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbg;", PluginDeviceInfo.FMODEL, "()Lbg;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<bg> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final bg invoke() {
            return new bg(HearingAidModuleV2.this.getHearingAIdApi(), HearingAidModuleV2.this.getRoleApi());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lrf;", PluginDeviceInfo.FMODEL, "()Lrf;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<rf> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rf invoke() {
            return new rf(HearingAidModuleV2.this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lyf;", PluginDeviceInfo.FMODEL, "()Lyf;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<yf> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final yf invoke() {
            return new yf(HearingAidModuleV2.this.getHearingAIdApi());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HearingAidModuleV2(@NotNull r3 api) {
        super(api);
        Intrinsics.checkNotNullParameter(api, "api");
        this.hearingAIdApi = LazyKt__LazyJVMKt.lazy(new b());
        this.roleApi = LazyKt__LazyJVMKt.lazy(new c());
        this.batteryApi = LazyKt__LazyJVMKt.lazy(new a());
        init();
    }

    private final bg getBatteryApi() {
        return (bg) this.batteryApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rf getHearingAIdApi() {
        return (rf) this.hearingAIdApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yf getRoleApi() {
        return (yf) this.roleApi.getValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        getHearingAIdApi().initCallback$bluetooth_release();
    }

    @NotNull
    public final sf loadApi() {
        return getHearingAIdApi();
    }

    @NotNull
    public final mht loadBatteryApi() {
        return getBatteryApi();
    }

    @NotNull
    public final xf loadRoleApi() {
        return getRoleApi();
    }
}
