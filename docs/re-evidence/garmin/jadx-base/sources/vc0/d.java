package vc0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Map;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lvc0/d;", "Lei2/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsd2/f;", "deviceDatabaseRecord", "<init>", "(Landroid/content/Context;Lsd2/f;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends ei2.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f176977e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sd2.f f176978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f176979d;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f176977e = gt2.b.f79005a.h("DSL-DeviceStatusTransform");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, sd2.f fVar) {
        super(context);
        context.getClass();
        fVar.getClass();
        this.f176978c = fVar;
        hk0.p pVar = hk0.p.f84079d;
    }

    @Override // ei2.h
    public final void o(zh2.b bVar) {
        this.f176979d = new e(this, bVar);
        la2.e eVar = da2.d.b().f58886a;
        e eVar2 = this.f176979d;
        if (eVar2 != null) {
            eVar.b(eVar2);
        } else {
            p005kotlin.jvm.internal.s.m("connectionCallback");
            throw null;
        }
    }

    @Override // ei2.h
    public final void p() {
        if (this.f176979d != null) {
            f176977e.debug("Unregister for device connection status.");
            la2.e eVar = da2.d.b().f58886a;
            e eVar2 = this.f176979d;
            if (eVar2 != null) {
                eVar.i(eVar2);
            } else {
                p005kotlin.jvm.internal.s.m("connectionCallback");
                throw null;
            }
        }
    }

    @Override // ei2.d
    public final ei2.i r(ii2.b bVar, Map map) {
        bVar.getClass();
        map.getClass();
        sd2.f fVar = this.f176978c;
        String displayName = fVar.getDisplayName();
        if (displayName == null) {
            displayName = "";
        }
        String strD = zb0.t.d(fVar);
        if (strD == null) {
            strD = "";
        }
        mh2.e eVar = hk0.p.k(fVar.getUnitID()) ? mh2.e.CONNECTED : mh2.e.NOT_CONNECTED;
        String strD0 = fVar.d0();
        if (strD0 == null) {
            String strQ = fVar.Q();
            strD0 = strQ == null ? "" : strQ;
        }
        return new ei2.i.a(displayName, strD, eVar, strD0, this.f64388a.getResources().getString(R.string.common_garmin_connect));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvc0/d$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "", "DEVICE", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
