package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0016\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\u0011"}, d2 = {"Lzo;", "Lxo;", "Lap;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", PluginDeviceInfo.FMODEL, "", "isMute", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "callback", PluginDeviceInfo.FDESC, "", "byteArray", "Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteModule;", RnReportConst.ApiReport.PARAM_MODULE, "<init>", "(Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteModule;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class zo implements xo {

    @NotNull
    public final PhoneMuteModule t;

    @NotNull
    public List<ap> u;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(Object obj) {
            super(1, obj, zo.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((zo) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"zo$b", "Lnq;", "", "byteArray", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements nq {
        @Override // defpackage.nq
        public boolean a(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            return r0.a(ArraysKt___ArraysKt.first(byteArray)) == 5 || r0.a(ArraysKt___ArraysKt.first(byteArray)) == 7;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41507a;

        static {
            int[] iArr = new int[bp.values().length];
            try {
                iArr[bp.PHONE_MUTE_STATE_MUTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bp.PHONE_MUTE_STATE_RING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f41507a = iArr;
        }
    }

    public zo(@NotNull PhoneMuteModule module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.t = module;
        module.registerDeviceRequestHandler(new g7(new a(this), new b()));
        this.u = new ArrayList();
    }

    @Override // defpackage.xo
    public void b(@NotNull HMCallback<Boolean> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.sendOnStartMessage();
        callback.sendFinishMessage(this.t.setPhoneMuteStatus(bp.PHONE_MUTE_STATE_PERMISSION));
    }

    @Override // defpackage.xo
    public void a(@NotNull ap listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.u.add(listener);
    }

    public final void a(byte[] byteArray) {
        int iA = r0.a(ArraysKt___ArraysKt.first(byteArray));
        for (ap apVar : this.u) {
            if (iA == 5) {
                this.t.returnQueryPhoneStateResult(apVar.a());
            } else if (iA == 7) {
                Integer numA = r0.a(byteArray);
                Boolean bool = null;
                bp bpVarA = numA != null ? bp.u.a(numA.intValue()) : null;
                int i = bpVarA == null ? -1 : c.f41507a[bpVarA.ordinal()];
                if (i == 1) {
                    bool = Boolean.TRUE;
                } else if (i == 2) {
                    bool = Boolean.FALSE;
                }
                if (bool != null) {
                    apVar.a(bool.booleanValue());
                    this.t.returnChangePhoneMuteStateResult();
                }
            }
        }
    }

    @Override // defpackage.xo
    public void a(boolean isMute, @NotNull HMCallback<Boolean> callback) {
        bp bpVar;
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.sendOnStartMessage();
        if (isMute) {
            bpVar = bp.PHONE_MUTE_STATE_MUTE;
        } else {
            bpVar = bp.PHONE_MUTE_STATE_RING;
        }
        callback.sendFinishMessage(this.t.setPhoneMuteStatus(bpVar));
    }
}
