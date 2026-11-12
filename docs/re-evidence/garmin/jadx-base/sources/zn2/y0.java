package zn2;

import com.garmin.feature.garminpay.NoDatabaseRecordException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class y0 implements q03.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f205940a;

    @Override // q03.u
    public final void c(e13.a.C1312a c1312a) {
        long j8 = this.f205940a;
        z0.a aVar = z0.f205974g;
        try {
            rd2.f.a().f152045a.getClass();
            sd2.f fVarI = rd2.j.i(j8, null);
            if (fVarI != null) {
                c1312a.c(fVarI);
                return;
            }
            c1312a.a(new NoDatabaseRecordException("no DB record for unitId " + j8));
        } catch (Exception unused) {
            c1312a.a(new NoDatabaseRecordException(org.apache.commons.lang3.e.e(j8, "failed to fetch DB record for unitId ")));
        }
    }
}
