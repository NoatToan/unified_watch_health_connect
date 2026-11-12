package uv;

import android.content.Context;
import androidx.lifecycle.y0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.gcsprotos.generated.Auth;
import com.garmin.gcsprotos.generated.FitnessDeviceProto;
import d53.u;
import fw.m;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wb2.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Luv/d;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f172879d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f172880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f172881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f172882c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"uv/d$b", "Lgk0/c;", "Lcom/garmin/gcsprotos/generated/FitnessDeviceProto$FitnessDeviceServiceResponse;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements gk0.c<FitnessDeviceProto.FitnessDeviceServiceResponse> {
        public b() {
        }

        @Override // gk0.c
        public final void a(Exception exc) {
            y0 y0Var = d.this.f172881b;
            y0Var.getClass();
            y0Var.j(m.a.b(m.f73767e, new fw.g(), new e(null, null, null, null, 14, null), 1));
        }

        @Override // gk0.c
        public final void b(FitnessDeviceProto.FitnessDeviceServiceResponse fitnessDeviceServiceResponse) {
            List<FitnessDeviceProto.DeviceMessage> deviceMessagesList;
            String string;
            String string2;
            FitnessDeviceProto.FitnessDeviceServiceResponse fitnessDeviceServiceResponse2 = fitnessDeviceServiceResponse;
            d dVar = d.this;
            if (fitnessDeviceServiceResponse2 != null && fitnessDeviceServiceResponse2.hasMessageListResponse() && (deviceMessagesList = fitnessDeviceServiceResponse2.getMessageListResponse().getDeviceMessagesList()) != null) {
                for (FitnessDeviceProto.DeviceMessage deviceMessage : deviceMessagesList) {
                    if (deviceMessage.getMessageType() == FitnessDeviceProto.MessageType.SOFTWARE_UPDATE) {
                        int i14 = d.f172879d;
                        dVar.getClass();
                        String string3 = null;
                        if (deviceMessage.hasServerPath()) {
                            String serverPath = deviceMessage.getServerPath();
                            serverPath.getClass();
                            int length = serverPath.length() - 1;
                            int i15 = 0;
                            boolean z14 = false;
                            while (i15 <= length) {
                                boolean z15 = s.h(serverPath.charAt(!z14 ? i15 : length), 32) <= 0;
                                if (z14) {
                                    if (!z15) {
                                        break;
                                    } else {
                                        length--;
                                    }
                                } else if (z15) {
                                    i15++;
                                } else {
                                    z14 = true;
                                }
                            }
                            string = serverPath.subSequence(i15, length + 1).toString();
                        } else {
                            string = null;
                        }
                        if (deviceMessage.hasFileName()) {
                            String fileName = deviceMessage.getFileName();
                            fileName.getClass();
                            int length2 = fileName.length() - 1;
                            int i16 = 0;
                            boolean z16 = false;
                            while (i16 <= length2) {
                                boolean z17 = s.h(fileName.charAt(!z16 ? i16 : length2), 32) <= 0;
                                if (z16) {
                                    if (!z17) {
                                        break;
                                    } else {
                                        length2--;
                                    }
                                } else if (z17) {
                                    i16++;
                                } else {
                                    z16 = true;
                                }
                            }
                            string2 = fileName.subSequence(i16, length2 + 1).toString();
                        } else {
                            string2 = null;
                        }
                        if (string != null && string2 != null) {
                            StringBuilder sb3 = new StringBuilder(string);
                            if (!u.p(string, "/", false) && !u.y(string2, "/", false)) {
                                sb3.append("/");
                            }
                            sb3.append(string2);
                            string3 = sb3.toString();
                        }
                        StringBuilder sb4 = new StringBuilder();
                        int deviceMessageChangeLogCount = deviceMessage.getDeviceMessageChangeLogCount();
                        for (int i17 = 0; i17 < deviceMessageChangeLogCount; i17++) {
                            if (deviceMessage.getDeviceMessageChangeLog(i17).hasChangeDetails()) {
                                sb4.append(deviceMessage.getDeviceMessageChangeLog(i17).getChangeDetails());
                            }
                        }
                        e eVar = new e(deviceMessage.getVersion(), sb4.toString(), string3, Long.valueOf(deviceMessage.getMessageId()));
                        y0 y0Var = dVar.f172881b;
                        y0Var.getClass();
                        y0Var.j(m.a.g(m.f73767e, eVar, 1));
                        return;
                    }
                }
            }
            y0 y0Var2 = dVar.f172881b;
            y0Var2.getClass();
            y0Var2.j(m.a.g(m.f73767e, new e(null, null, null, null, 15, null), 1));
        }
    }

    static {
        new a(null);
    }

    public d(Context context) {
        context.getClass();
        this.f172880a = context;
        this.f172881b = new y0();
        this.f172882c = new b();
    }

    public final void a(long j8) {
        y0 y0Var = this.f172881b;
        y0Var.getClass();
        y0Var.m(m.a.f(m.f73767e, null, null, 3));
        f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
        Context context = this.f172880a;
        tv.m mVar = new tv.m(context, bVar);
        mVar.f166529d = new tv.m.a(mVar.f166528c, j8);
        gk0.h.b(mVar, new gk0.b(context.getApplicationContext(), mVar, "FIRMWARE_QUERY_ID", j8, o0.a(), Auth.Category.FITNESS_LOOKUP), context, this.f172882c);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luv/d$a;", "", "<init>", "()V", "", "FIRMWARE_QUERY_ID", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
