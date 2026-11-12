package defpackage;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lr;", "Luj;", "", PluginDeviceInfo.FDESC, "()V", PluginDeviceInfo.FMODEL, "Lcom/huami/bluetooth/profile/channel/module/alarm/AlarmModule;", PluginDeviceInfo.FICONON, "()Lcom/huami/bluetooth/profile/channel/module/alarm/AlarmModule;", "channelModule", "Ln1t;", "device", "<init>", "(Ln1t;)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class r implements uj {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final n1t f32040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b f32041b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lr$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"r$b", "Ldh;", "", PluginDeviceInfo.FMODEL, "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class b implements dh {
        public b() {
        }

        @Override // defpackage.dh
        public void a() {
            t5t.d("AlarmEventAdapter", "alarm change post event");
            r rVar = r.this;
            uj.a.a(rVar, rVar.f32040a, ik.ALARM_CHANGED, null, 4, null);
        }
    }

    public r(@NotNull n1t device) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.f32040a = device;
        this.f32041b = new b();
    }

    @Override // defpackage.uj
    public void b() {
        if (!this.f32040a.F(AlarmModule.class)) {
            t5t.d("AlarmEventAdapter", "not support channel module");
            return;
        }
        t5t.d("AlarmEventAdapter", "register alarm callback");
        AlarmModule alarmModuleC = c();
        if (alarmModuleC == null) {
            return;
        }
        alarmModuleC.setAlarmChangeListener(this.f32041b);
    }

    public final AlarmModule c() {
        return (AlarmModule) this.f32040a.y(AlarmModule.class);
    }

    @Override // defpackage.uj
    public void a(@NotNull kd kdVar, @NotNull ik ikVar, @Nullable byte[] bArr) {
        uj.a.a(this, kdVar, ikVar, bArr);
    }

    @Override // defpackage.uj
    public void a() {
        t5t.d("AlarmEventAdapter", "release alarm callback");
        AlarmModule alarmModuleC = c();
        if (alarmModuleC == null) {
            return;
        }
        alarmModuleC.setAlarmChangeListener(null);
    }
}
