package o62;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import nr.w0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p3.p1;
import p3.y1;
import ps.a1;
import ps.q1;
import ty1.g2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f129671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f129672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f129673d;

    public /* synthetic */ g0(double d14, p1 p1Var, p1 p1Var2) {
        this.f129670a = 2;
        this.f129671b = d14;
        this.f129672c = p1Var;
        this.f129673d = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, o13.l] */
    @Override // e23.a
    public final Object invoke() {
        com.garmin.android.apps.connectmobile.activities.newmodel.q deviceMetadataDTO;
        String deviceId;
        Long lJ;
        fw.m mVar;
        jp0.b bVar;
        int i14 = this.f129670a;
        double d14 = this.f129671b;
        Object obj = this.f129673d;
        Object obj2 = this.f129672c;
        switch (i14) {
            case 0:
                NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
                numberInstance.getClass();
                DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
                decimalFormat.applyPattern("##.##");
                String str = decimalFormat.format(d14);
                str.getClass();
                Double dValueOf = Double.valueOf(Double.parseDouble(str));
                boolean zS = v52.f.s();
                m32.c.b((Context) obj2, dValueOf, zS, R.string.lbl_weight, zS ? 453.5d : 999.5d, new na0.l((e23.l) obj, 15)).show();
                return Unit.INSTANCE;
            case 1:
                ps.r rVar = (ps.r) obj2;
                qr.t tVar = (qr.t) obj;
                int i15 = qr.t.A2;
                a1 metadataDTO = rVar.getMetadataDTO();
                if (metadataDTO != null && (deviceMetadataDTO = metadataDTO.getDeviceMetadataDTO()) != null && (deviceId = deviceMetadataDTO.getDeviceId()) != null && (lJ = d53.t.j(deviceId)) != null) {
                    long jLongValue = lJ.longValue();
                    q1 summaryDTO = rVar.getSummaryDTO();
                    DateTime dateTimeW4 = summaryDTO != null ? summaryDTO.W4() : null;
                    if (dateTimeW4 != null) {
                        long millis = dateTimeW4.getMillis();
                        Double elapsedDuration = summaryDTO.getElapsedDuration();
                        tVar.E4(new w0.b1(jLongValue, millis, millis + ((long) (MathKt.b(elapsedDuration != null ? elapsedDuration.doubleValue() : 0.0d) * 1000)), MathKt.d(d14)));
                    }
                }
                return Unit.INSTANCE;
            case 2:
                return new y1(u42.b.b(((Boolean) ((p1) obj2).getF182175a()).booleanValue(), ((Boolean) ((p1) obj).getF182175a()).booleanValue(), true, d14));
            default:
                vp0.e eVar = (vp0.e) obj2;
                e23.a aVar = (e23.a) obj;
                DateTime dateTime = eVar.f179339i;
                if (dateTime != null) {
                    vp0.a aVar2 = (vp0.a) eVar.f179340j.getValue();
                    aVar2.getClass();
                    aVar2.f179323c = true;
                    boolean zK = g22.k.k(dateTime);
                    if (zK) {
                        aVar2.f179324d = true;
                    }
                    DateTime dateTimeNow = zK ? DateTime.now() : dateTime;
                    dateTimeNow.getClass();
                    double d15 = this.f129671b;
                    androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new vp0.c(aVar2, dateTimeNow, d15, null), 3);
                    androidx.lifecycle.s0 s0Var = (androidx.lifecycle.s0) aVar2.f179322b.get(dateTime);
                    if (s0Var != null && (mVar = (fw.m) s0Var.d()) != null && (bVar = (jp0.b) mVar.f73770c) != null) {
                        Double valueInML = bVar.getValueInML();
                        bVar.r(valueInML != null ? Double.valueOf(valueInML.doubleValue() + d15) : Double.valueOf(d15));
                        bVar.o(dateTimeNow.toString("yyyy-MM-dd'T'HH:mm:ss.SSS"));
                    }
                    jVarA.f(eVar, new vp0.e.d(new g2(21, eVar, dateTime)));
                }
                aVar.invoke();
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g0(Object obj, double d14, o13.h hVar, int i14) {
        this.f129670a = i14;
        this.f129672c = obj;
        this.f129671b = d14;
        this.f129673d = hVar;
    }

    public /* synthetic */ g0(ps.r rVar, qr.t tVar, double d14) {
        this.f129670a = 1;
        this.f129672c = rVar;
        this.f129673d = tVar;
        this.f129671b = d14;
    }
}
