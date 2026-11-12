package zd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lzd0/o;", "", "Lpc0/j;", "devicesRepository", "Lf12/l;", "userSettings", "Ll80/b;", "gdiDelegate", "Lzd0/b0;", "isStartActivityCapableDevice", "Lzd0/i;", "getDeviceConnectionStateUseCase", "<init>", "(Lpc0/j;Lf12/l;Ll80/b;Lzd0/b0;Lzd0/i;)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.l f204087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.b f204088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f204089c;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lzd0/o$a;", "", "", "unitID", "", "productName", "name", "imageUrl", "", "connected", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f204090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f204091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f204092c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f204093d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f204094e;

        public a(long j8, String str, String str2, String str3, boolean z14) {
            str.getClass();
            str2.getClass();
            this.f204090a = j8;
            this.f204091b = str;
            this.f204092c = str2;
            this.f204093d = str3;
            this.f204094e = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f204090a == aVar.f204090a && this.f204091b.equals(aVar.f204091b) && this.f204092c.equals(aVar.f204092c) && p005kotlin.jvm.internal.s.g(this.f204093d, aVar.f204093d) && this.f204094e == aVar.f204094e;
        }

        public final int hashCode() {
            int iJ = wr.g.j(wr.g.j(Long.hashCode(this.f204090a) * 31, 31, this.f204091b), 31, this.f204092c);
            String str = this.f204093d;
            return Boolean.hashCode(this.f204094e) + ((iJ + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f204090a, "DeviceItem(unitID=", ", productName=", this.f204091b);
            sn.a.t(sbK, ", name=", this.f204092c, ", imageUrl=", this.f204093d);
            return com.airbnb.lottie.animation.keyframe.a.i(sbK, ", connected=", this.f204094e, ")");
        }
    }

    public o(pc0.j jVar, f12.l lVar, l80.b bVar, b0 b0Var, i iVar) {
        jVar.getClass();
        lVar.getClass();
        bVar.getClass();
        b0Var.getClass();
        iVar.getClass();
        this.f204087a = lVar;
        this.f204088b = bVar;
        this.f204089c = b0Var;
    }

    public final r53.u1 a() {
        pc0.c0 c0VarJ = pc0.j.j();
        int i14 = i.f204028a;
        return new r53.u1(c0VarJ, r53.s.f(new j(null, null)), new p(this, null));
    }
}
