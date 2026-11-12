package xc0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lxc0/b;", "Lzw2/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxw2/b;", "rtsDeviceRecord", "<init>", "(Landroid/content/Context;Lxw2/b;)V", "a", "Lgc0/d;", "deviceFormatter", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends zw2.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f189904e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xw2.b f189905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f189906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f189907d;

    /* JADX INFO: renamed from: xc0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class C3535b extends p005kotlin.jvm.internal.q implements e23.p<Context, gw2.e, String> {
        public C3535b(Object obj) {
            super(2, obj, b.class, "formatDeviceConnectStatus", "formatDeviceConnectStatus(Landroid/content/Context;Lcom/garmin/realtimesettings/app/constants/DeviceConnectionStatus;)Ljava/lang/String;", 0);
        }

        @Override // e23.p
        public final String invoke(Context context, gw2.e eVar) {
            Context context2 = context;
            gw2.e eVar2 = eVar;
            context2.getClass();
            eVar2.getClass();
            b bVar = (b) this.receiver;
            Logger logger = b.f189904e;
            bVar.getClass();
            t tVarB = o13.m.b(new tz1.h(context2, 19));
            sd2.f fVar = (sd2.f) bVar.f189906c.getValue();
            if (fVar != null && u0.n(fVar.getProductNumber(), u0.Y5) && eVar2 == gw2.e.NOT_CONNECTED) {
                return ((gc0.d) tVarB.getValue()).a(fVar.S2());
            }
            String string = context2.getString(eVar2.f79886a);
            string.getClass();
            return string;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f189904e = gt2.b.f79005a.h("RTS-DeviceStatusTransform");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, xw2.b bVar) {
        super(context);
        context.getClass();
        bVar.getClass();
        this.f189905b = bVar;
        this.f189906c = o13.m.b(new wd.c(this, 24));
        hk0.p pVar = hk0.p.f84079d;
    }

    @Override // zw2.f
    public final void i(vw2.b bVar) {
        this.f189907d = new c(this, bVar);
        la2.e eVar = da2.d.b().f58886a;
        c cVar = this.f189907d;
        if (cVar != null) {
            eVar.b(cVar);
        } else {
            p005kotlin.jvm.internal.s.m("connectionCallback");
            throw null;
        }
    }

    @Override // zw2.f
    public final void j() {
        if (this.f189907d != null) {
            f189904e.debug("Unregister for device connection status.");
            la2.e eVar = da2.d.b().f58886a;
            c cVar = this.f189907d;
            if (cVar != null) {
                eVar.i(cVar);
            } else {
                p005kotlin.jvm.internal.s.m("connectionCallback");
                throw null;
            }
        }
    }

    @Override // zw2.d
    public final zw2.g k() {
        xw2.b bVar = this.f189905b;
        String str = bVar.f192451c;
        String str2 = bVar.f192452d;
        if (str2 == null) {
            str2 = "";
        }
        return new zw2.g.b(str, str2, hk0.p.k(bVar.f192449a) ? gw2.e.CONNECTED : gw2.e.NOT_CONNECTED, bVar.f192450b, this.f207282a.getResources().getString(R.string.common_garmin_connect), new C3535b(this));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxc0/b$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "", "DEVICE", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
