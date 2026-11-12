package com.huami.bluetooth.profile.channel.module.hearing;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.HearingAidProtocolVersion;
import defpackage.d4;
import defpackage.qct;
import defpackage.qf;
import defpackage.r3;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lqct;", "hearingAidApi$delegate", "Lkotlin/Lazy;", "getHearingAidApi", "()Lqct;", "hearingAidApi", "Lr3;", "api", "<init>", "(Lr3;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 33)
public final class HearingAidModule extends com.huami.bluetooth.profile.channel.module.a {

    /* JADX INFO: renamed from: hearingAidApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hearingAidApi;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqf;", PluginDeviceInfo.FMODEL, "()Lqf;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<qf> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final qf invoke() {
            return new qf(HearingAidModule.this, new HearingAidProtocolVersion(1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HearingAidModule(@NotNull r3 api) {
        super(api);
        Intrinsics.checkNotNullParameter(api, "api");
        this.hearingAidApi = LazyKt__LazyJVMKt.lazy(new a());
    }

    @Nullable
    public final qct getHearingAidApi() {
        return (qct) this.hearingAidApi.getValue();
    }
}
