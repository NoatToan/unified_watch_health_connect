package p51;

import android.os.Bundle;
import androidx.lifecycle.u1;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import j23.t;
import n02.g;
import o51.j;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;
import t41.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp51/e;", "Landroidx/lifecycle/u1;", "Landroid/os/Bundle;", "intentExtra", "<init>", "(Landroid/os/Bundle;)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f136172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f136173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f136175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f136176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f136177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f136178g;

    public e(Bundle bundle) {
        Object value;
        j jVar;
        Double dValueOf;
        double dDoubleValue;
        double d14;
        p2 p2VarA = q2.a(new j(null, null, null, 0, 0, 31, null));
        this.f136172a = p2VarA;
        Double dValueOf2 = (bundle == null || !bundle.containsKey("distance_in_meters_key")) ? null : Double.valueOf(bundle.getDouble("distance_in_meters_key"));
        this.f136173b = dValueOf2;
        this.f136174c = bundle != null ? bundle.getString("course_id_key") : null;
        this.f136175d = bundle != null ? bundle.getString("event_name_key") : null;
        this.f136176e = bundle != null ? bundle.getBoolean("event_distance_match_course_key", true) : true;
        this.f136177f = bundle != null ? bundle.getBoolean("should_return_to_pace_pro_list_key", true) : true;
        this.f136178g = s.d(p2VarA);
        if (dValueOf2 != null) {
            f.a aVar = f.f162282c;
            double dDoubleValue2 = dValueOf2.doubleValue();
            aVar.getClass();
            f fVarB = f.a.b(dDoubleValue2);
            int iA = f.a.a(dValueOf2.doubleValue(), false);
            do {
                value = p2VarA.getValue();
                jVar = (j) value;
                if (fVarB == f.OTHER) {
                    g gVar = jVar.f129274c;
                    g gVar2 = g.KILOMETERS;
                    Double d15 = this.f136173b;
                    if (gVar == gVar2) {
                        dDoubleValue = d15.doubleValue();
                        d14 = 1000.0d;
                    } else {
                        dDoubleValue = d15.doubleValue();
                        d14 = 1609.344d;
                    }
                    dValueOf = Double.valueOf(dDoubleValue / d14);
                } else {
                    dValueOf = null;
                }
            } while (!p2VarA.b(value, j.a(jVar, fVarB, dValueOf, null, iA, 0, 20)));
            x4();
        }
    }

    public final void x4() {
        p2 p2Var;
        Object value;
        j jVarA;
        do {
            p2Var = this.f136172a;
            value = p2Var.getValue();
            jVarA = (j) value;
            double dB = jVarA.b();
            g gVar = jVarA.f129274c;
            if (dB != 0.0d) {
                g gVar2 = g.KILOMETERS;
                int i14 = jVarA.f129275d;
                int iB = MathKt.b(gVar == gVar2 ? Math.floor((((double) i14) * 1000.0d) / jVarA.b()) : Math.rint((((double) i14) * 1609.344d) / jVarA.b()));
                gVar.getClass();
                jVarA = j.a(jVarA, null, null, null, 0, t.e(iB, gVar == gVar2 ? 149 : PsExtractor.VIDEO_STREAM_MASK, gVar == gVar2 ? 2237 : DateTimeConstants.SECONDS_PER_HOUR), 15);
            }
        } while (!p2Var.b(value, jVarA));
    }

    public final void y4() {
        p2 p2Var;
        Object value;
        j jVar;
        double dB;
        boolean z14;
        do {
            p2Var = this.f136172a;
            value = p2Var.getValue();
            jVar = (j) value;
            f.a aVar = f.f162282c;
            dB = jVar.b();
            z14 = jVar.f129272a == f.OTHER;
            aVar.getClass();
        } while (!p2Var.b(value, j.a(jVar, null, null, null, t.e(f.a.a(dB, z14), jVar.d(), jVar.c()), 0, 23)));
        x4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ e(Bundle bundle, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bundle);
    }
}
