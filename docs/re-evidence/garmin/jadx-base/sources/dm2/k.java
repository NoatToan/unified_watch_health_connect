package dm2;

/* JADX INFO: loaded from: classes11.dex */
public class k extends com.garmin.android.library.backgroundtaskmanagement.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f60480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f60481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f60482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f60483l;

    public k(com.garmin.android.library.backgroundtaskmanagement.b bVar, String str, boolean z14, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(bVar, z14);
        this.f60480i = str;
        this.f60481j = bArr;
        this.f60482k = bArr2;
        this.f60483l = bArr3;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        try {
            ((fm2.c) lm2.h.c()).s(this.f60480i, this.f60481j, this.f60482k, this.f60483l);
            c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
        } catch (Exception unused) {
            if (this.f50128h) {
                c(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
            } else {
                c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            }
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
    }
}
