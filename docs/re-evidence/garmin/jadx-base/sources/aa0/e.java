package aa0;

import o53.s0;
import p005kotlin.Metadata;
import y80.b0;
import y80.i0;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Laa0/e;", "Laa0/b;", "Lzb0/u0;", "deviceEnum", "", "applicationKey", "productDisplayName", "Lo90/a;", "deviceImageData", "Lk22/a;", "resourceProvider", "Ly80/b0;", "deviceStorageRepo", "<init>", "(Lzb0/u0;Ljava/lang/String;Ljava/lang/String;Lo90/a;Lk22/a;Ly80/b0;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f2200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o90.a f2203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k22.a f2204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f2205f;

    public e(u0 u0Var, String str, String str2, o90.a aVar, k22.a aVar2, b0 b0Var) {
        aVar2.getClass();
        b0Var.getClass();
        this.f2200a = u0Var;
        this.f2201b = str;
        this.f2202c = str2;
        this.f2203d = aVar;
        this.f2204e = aVar2;
        this.f2205f = b0Var;
    }

    @Override // aa0.b
    public final Object a(v13.c cVar) {
        u0 u0Var = this.f2200a;
        if (u0Var == null) {
            return null;
        }
        x53.c cVar2 = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new i0(u0Var, this.f2202c, this.f2205f, this.f2201b, this.f2203d, this.f2204e, null), cVar);
    }
}
