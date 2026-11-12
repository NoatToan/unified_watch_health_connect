package dm2;

import p1.z;

/* JADX INFO: loaded from: classes11.dex */
public class d extends com.garmin.android.library.backgroundtaskmanagement.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f60462i;

    public d(com.garmin.android.library.backgroundtaskmanagement.b bVar, long j8) {
        super(bVar);
        this.f60462i = j8;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        z<String> zVar = td2.a.f163901a;
        if (zVar != null) {
            zVar.g(this.f60462i);
        }
        c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
    }
}
