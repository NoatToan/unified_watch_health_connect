package vc0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import fi2.y;
import fi2.z;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lvc0/s;", "Lfi2/z;", "Landroid/content/Context;", "fragmentActivity", "Lsd2/f;", "deviceDatabaseRecord", "<init>", "(Landroid/content/Context;Lsd2/f;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f177006e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f177007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sd2.f f177008d;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f177006e = gt2.b.f79005a.h("DSL-PulseOxSleepTransform");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, sd2.f fVar) {
        super(context);
        context.getClass();
        fVar.getClass();
        this.f177007c = context;
        this.f177008d = fVar;
    }

    public static void v(s sVar, e23.l lVar, int i14) {
        new bd0.u(sVar.f177008d.getUnitID(), new t(sVar, (i14 & 2) == 0, lVar, (i14 & 4) == 0)).a();
    }

    @Override // fi2.z
    public final void r(boolean z14, fi2.x xVar) {
        Logger logger = f177006e;
        logger.debug("PulseOx All Day clicked.");
        sd2.f fVar = this.f177008d;
        long unitID = fVar.getUnitID();
        f12.l.f68084a.getClass();
        if (unitID == f12.l.a.a().s4()) {
            if (z14) {
                w(xVar);
                return;
            } else {
                xVar.invoke(Boolean.TRUE);
                return;
            }
        }
        logger.debug("Set preferred activity tracker before making changes.");
        String displayName = fVar.getDisplayName();
        if (displayName == null) {
            displayName = fVar.getProductDisplayName();
            displayName.getClass();
        }
        String string = this.f64388a.getString(R.string.device_settings_set_as_preferred_activity_tracker_title_question, displayName);
        Context context = this.f177007c;
        String strD = p6.b.d(context, R.string.lbl_yes, string);
        String string2 = context.getString(R.string.lbl_no);
        string2.getClass();
        kh2.g.a.a(kh2.g.f104792a, this.f177007c, null, string, new o13.p(strD, new u91.i(18, this, xVar)), new o13.p(string2, new tr2.o(xVar, 19)), 482).show();
    }

    @Override // fi2.z
    public final void s(boolean z14, y yVar) {
        Logger logger = f177006e;
        logger.debug("PulseOx Sleep clicked.");
        sd2.f fVar = this.f177008d;
        long unitID = fVar.getUnitID();
        f12.l.f68084a.getClass();
        if (unitID == f12.l.a.a().s4()) {
            if (z14) {
                x(yVar);
                return;
            } else {
                yVar.invoke(Boolean.TRUE);
                return;
            }
        }
        logger.debug("Set preferred activity tracker before making changes.");
        String displayName = fVar.getDisplayName();
        if (displayName == null) {
            displayName = fVar.getProductDisplayName();
            displayName.getClass();
        }
        String string = this.f64388a.getString(R.string.device_settings_set_as_preferred_activity_tracker_title_question, displayName);
        Context context = this.f177007c;
        String strD = p6.b.d(context, R.string.lbl_yes, string);
        String string2 = context.getString(R.string.lbl_no);
        string2.getClass();
        kh2.g.a.a(kh2.g.f104792a, this.f177007c, null, string, new o13.p(strD, new u91.i(19, this, yVar)), new o13.p(string2, new tr2.o(yVar, 20)), 482).show();
    }

    public final void w(e23.l<? super Boolean, Unit> lVar) {
        kh2.g.a aVar = kh2.g.f104792a;
        Context context = this.f64388a;
        kh2.g.a.a(aVar, this.f177007c, null, context.getString(R.string.msg_all_day_pulse_ox_info), new o13.p(context.getString(R.string.lbl_ok), new b71.n(lVar, 23, (byte) 0)), null, 498).show();
    }

    public final void x(e23.l<? super Boolean, Unit> lVar) {
        kh2.g.a aVar = kh2.g.f104792a;
        Context context = this.f64388a;
        kh2.g.a.a(aVar, this.f177007c, null, context.getString(R.string.device_settings_pulse_ox_tracking_alert_message), new o13.p(context.getString(R.string.lbl_ok), new b71.n(lVar, 24, (byte) 0)), null, 498).show();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvc0/s$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
