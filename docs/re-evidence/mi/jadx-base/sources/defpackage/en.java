package defpackage;

import android.content.Context;
import com.huami.bluetooth.profile.channel.module.notification.NotificationModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\b\u0010\u000eJ\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\b\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0005¨\u0006\u001a"}, d2 = {"Len;", "Luj;", "Le7;", "", PluginDeviceInfo.FDESC, "()V", "", "uniqueId", PluginDeviceInfo.FMODEL, "(I)V", PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONON, "", MiuiCursorConstants.CONTENT, "(ILjava/lang/String;)V", "Lsk;", "request", "(Lsk;)V", "onAlarmCancel", "onAlarmDelay", "Landroid/content/Context;", "context", "Ln1t;", "device", "<init>", "(Landroid/content/Context;Ln1t;)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class en implements uj, e7 {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f16829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final n1t f16830b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Len$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public en(@NotNull Context context, @NotNull n1t device) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(device, "device");
        this.f16829a = context;
        this.f16830b = device;
    }

    @Override // defpackage.e7
    public void a(int uniqueId, @NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
    }

    @Override // defpackage.uj
    public void b() {
        if (this.f16830b.F(NotificationModule.class)) {
            n1t n1tVar = this.f16830b;
            if (n1tVar instanceof ne) {
                ((ne) n1tVar).G2(this);
            }
        }
    }

    @Override // defpackage.e7
    public void c() {
        uj.a.a(this, this.f16830b, ik.IGNORE_CALL, null, 4, null);
    }

    @Override // defpackage.e7
    public void d() {
        uj.a.a(this, this.f16830b, ik.END_CALL, null, 4, null);
    }

    @Override // defpackage.e7
    public void onAlarmCancel() {
        t5t.d("NotificationEventAdapter", "MIUI闹钟取消");
        uj.a.a(this, this.f16830b, ik.ALARM_CANCEL, null, 4, null);
    }

    @Override // defpackage.e7
    public void onAlarmDelay() {
        t5t.d("NotificationEventAdapter", "MIUI闹钟稍后提醒");
        uj.a.a(this, this.f16830b, ik.ALARM_DELAY, null, 4, null);
    }

    @Override // defpackage.uj
    public void a(@NotNull kd kdVar, @NotNull ik ikVar, @Nullable byte[] bArr) {
        uj.a.a(this, kdVar, ikVar, bArr);
    }

    @Override // defpackage.uj
    public void a() {
        uj.a.a(this);
    }

    @Override // defpackage.e7
    public void a(int uniqueId) {
        a(this.f16830b, ik.DELETE_MSG, c3.a(uniqueId, 0, 1, null));
    }

    @Override // defpackage.e7
    public void a(@NotNull LogoRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        cv cvVar = cv.f14758a;
        Context context = this.f16829a;
        n1t n1tVar = this.f16830b;
        Intrinsics.checkNotNull(n1tVar, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        cvVar.a(context, (ne) n1tVar, request);
    }
}
