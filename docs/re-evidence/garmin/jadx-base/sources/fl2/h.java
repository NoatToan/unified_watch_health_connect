package fl2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.gc.download.SoftwareUpdateChecker", f = "SoftwareUpdateChecker.kt", l = {93}, m = "checkForSoftwareUpdates$file_transfer_gc_release")
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f72074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f72075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f72076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f72077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f72078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f72079f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f72078e = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f72077d = obj;
        this.f72079f |= Integer.MIN_VALUE;
        return this.f72078e.a(null, null, this);
    }
}
