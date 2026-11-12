package dm2;

import com.garmin.android.gfdi.configuration.Configuration;
import com.garmin.android.library.connectdatabase.ConnectDatabase;

/* JADX INFO: loaded from: classes11.dex */
public class j extends com.garmin.android.library.backgroundtaskmanagement.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f60469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f60470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f60471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f60472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f60473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f60474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f60475o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f60476p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f60477q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bm2.d f60478r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f60479t;

    public j(com.garmin.android.library.backgroundtaskmanagement.b bVar, bm2.d dVar, String str, long j8, int i14, byte[] bArr, boolean z14, String str2, byte[] bArr2, byte[] bArr3, byte[] bArr4, String str3) {
        super(bVar);
        this.f60478r = dVar;
        this.f60475o = j8;
        this.f60470j = i14;
        this.f60471k = bArr;
        this.f60469i = z14;
        this.f60476p = str2;
        this.f60472l = bArr2;
        this.f60473m = bArr3;
        this.f60474n = bArr4;
        this.f60477q = str;
        this.f60479t = str3;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        rd2.i iVar = rd2.f.a().f152047c;
        bm2.d dVar = this.f60478r;
        if (!iVar.g(dVar.getF172494b(), dVar.getF172495c(), this.f60477q, dVar.f(), dVar.getF172496d(), String.valueOf(dVar.getF172497e()), this.f60475o, this.f60470j, dVar.getConnectionType(), this.f60471k, this.f60469i, this.f60476p, this.f60472l, this.f60473m, this.f60474n, dVar.isMultiLinkSupported(), this.f60479t)) {
            c(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
            return;
        }
        Configuration configurationB = dVar.b();
        sd2.e eVar = new sd2.e();
        eVar.f158646a = dVar.getF172494b();
        eVar.f158647b = dVar.f();
        eVar.f158648c = configurationB.getCapabilityFlags();
        ConnectDatabase.g().f().c(eVar);
        km2.a.j();
        Object obj = this.f50126f.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE);
        if (obj != null && (obj instanceof g)) {
        }
        c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
    }
}
