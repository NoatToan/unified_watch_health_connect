package defpackage;

import com.huami.bluetooth.profile.channel.module.sport.SportSupplementPanelModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lnt;", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class nt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f28342a = new a(null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lnt$a;", "", "Ljet;", "gattPeripheral", "Lkd;", "device", "Laj;", PluginDeviceInfo.FMODEL, "(Ljet;Lkd;)Laj;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: nt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/SportSupplementPanelModule;", PluginDeviceInfo.FMODEL, "()Lcom/huami/bluetooth/profile/channel/module/sport/SportSupplementPanelModule;"}, k = 3, mv = {1, 7, 1})
        public static final class C1053a extends Lambda implements Function0<SportSupplementPanelModule> {
            public final /* synthetic */ kd t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1053a(kd kdVar) {
                super(0);
                this.t = kdVar;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SportSupplementPanelModule invoke() {
                return (SportSupplementPanelModule) this.t.y(SportSupplementPanelModule.class);
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final aj a(@NotNull jet gattPeripheral, @NotNull kd device) throws Exception {
            Object objM886constructorimpl;
            SportSupplementPanelModule sportSupplementPanelModule;
            Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
            Intrinsics.checkNotNullParameter(device, "device");
            UUID UUID_SERVICE_MILI_SERVICE = a6t.UUID_SERVICE_MILI_SERVICE;
            Intrinsics.checkNotNullExpressionValue(UUID_SERVICE_MILI_SERVICE, "UUID_SERVICE_MILI_SERVICE");
            UUID UUID_CHARACTERISTIC_SPORT = pbs.f;
            Intrinsics.checkNotNullExpressionValue(UUID_CHARACTERISTIC_SPORT, "UUID_CHARACTERISTIC_SPORT");
            if (ot.a(gattPeripheral, UUID_SERVICE_MILI_SERVICE, UUID_CHARACTERISTIC_SPORT)) {
                return new b5s(gattPeripheral);
            }
            if (!device.F(SportSupplementPanelModule.class)) {
                return null;
            }
            try {
                Result.Companion companion = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl((SportSupplementPanelModule) device.y(SportSupplementPanelModule.class));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m892isFailureimpl(objM886constructorimpl)) {
                objM886constructorimpl = null;
            }
            if (((SportSupplementPanelModule) objM886constructorimpl) == null || (sportSupplementPanelModule = (SportSupplementPanelModule) device.y(SportSupplementPanelModule.class)) == null) {
                return null;
            }
            int iQueryVersion = sportSupplementPanelModule.queryVersion();
            if (iQueryVersion == 1) {
                return new pt(new C1053a(device));
            }
            throw new Exception("Compatible version " + iQueryVersion);
        }
    }
}
