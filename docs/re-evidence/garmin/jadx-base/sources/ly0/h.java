package ly0;

import androidx.lifecycle.v1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements com.garmin.android.library.mapsdkadapter.i.j, com.garmin.android.library.mapsdkadapter.i.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f115313a;

    public /* synthetic */ h(o oVar) {
        this.f115313a = oVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.m
    public boolean O2(ie2.j jVar) {
        Object objMo329getTag = jVar.mo329getTag();
        Long l14 = objMo329getTag instanceof Long ? (Long) objMo329getTag : null;
        if (l14 == null) {
            return true;
        }
        long jLongValue = l14.longValue();
        o oVar = this.f115313a;
        oVar.getClass();
        ge1.b.T(v1.a(oVar), null, null, new j(oVar, jLongValue, null), 3);
        return true;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.j
    public void X(com.garmin.android.library.mapsdkadapter.f fVar) {
        o oVar = this.f115313a;
        ge1.b.T(v1.a(oVar), null, null, new m(oVar, fVar, null), 3);
    }
}
