package defpackage;

import com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Ln9;", "Luj;", "", PluginDeviceInfo.FDESC, "()V", PluginDeviceInfo.FMODEL, "Lcom/huami/bluetooth/profile/channel/module/eventreminder/EventReminderModule;", PluginDeviceInfo.FICONON, "()Lcom/huami/bluetooth/profile/channel/module/eventreminder/EventReminderModule;", "channelModule", "Ln1t;", "device", "<init>", "(Ln1t;)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class n9 implements uj {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final n1t f27669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b f27670b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ln9$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"n9$b", "Ljh;", "", "cmd", "", "result", "", PluginDeviceInfo.FMODEL, "", "data", PluginDeviceInfo.FDESC, "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class b implements jh {
        public b() {
        }

        @Override // defpackage.jh
        public void a(byte cmd, boolean result) {
        }

        @Override // defpackage.jh
        public void b(byte cmd, @NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (cmd == 11) {
                t5t.d("EventReminderAdapter", "eventReminder change post event");
                n9 n9Var = n9.this;
                uj.a.a(n9Var, n9Var.f27669a, ik.REMINDER_CHANGED, null, 4, null);
            }
        }

        @Override // defpackage.jh
        public void a(byte cmd, @NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
        }
    }

    public n9(@NotNull n1t device) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.f27669a = device;
        this.f27670b = new b();
    }

    @Override // defpackage.uj
    public void b() {
        if (!this.f27669a.F(EventReminderModule.class)) {
            t5t.d("EventReminderAdapter", "not support channel module");
            return;
        }
        t5t.d("EventReminderAdapter", "register eventReminder callback");
        EventReminderModule eventReminderModuleC = c();
        if (eventReminderModuleC != null) {
            eventReminderModuleC.registerInterceptor(this.f27670b);
        }
    }

    public final EventReminderModule c() {
        return (EventReminderModule) this.f27669a.y(EventReminderModule.class);
    }

    @Override // defpackage.uj
    public void a(@NotNull kd kdVar, @NotNull ik ikVar, @Nullable byte[] bArr) {
        uj.a.a(this, kdVar, ikVar, bArr);
    }

    @Override // defpackage.uj
    public void a() {
        t5t.d("EventReminderAdapter", "release eventReminder callback");
        EventReminderModule eventReminderModuleC = c();
        if (eventReminderModuleC != null) {
            eventReminderModuleC.unregisterInterceptor(this.f27670b);
        }
    }
}
