package m22;

import b63.u;
import g22.l;
import k63.d;
import k63.k;
import l63.e;
import l63.f;
import m63.q1;
import org.joda.time.format.ISODateTimeFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm22/c;", "Li63/c;", "Lb63/u;", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements i63.c<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f116205a = k.a("LocalDateTimeSerializer", d.i.f103232a);

    @Override // i63.b
    public final Object deserialize(e eVar) {
        eVar.getClass();
        String strS = eVar.s();
        u.b.f16217a.getClass();
        return u.b.f16218b.a(strS);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return this.f116205a;
    }

    @Override // i63.i
    public final void serialize(f fVar, Object obj) {
        u uVar = (u) obj;
        uVar.getClass();
        String strPrint = ISODateTimeFormat.dateHourMinuteSecondMillis().withZoneUTC().print(l.i(uVar));
        strPrint.getClass();
        fVar.p(strPrint);
    }
}
