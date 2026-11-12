package yr1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Map;
import lc.u0;
import ok2.a0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lyr1/q;", "Lal2/e;", "Ljl2/a;", "", "syncTag", "Lyr1/r;", "syncEventsListener", "", "deviceUnitId", "Ll80/a;", "deviceDelegate", "<init>", "(Ljava/lang/String;Lyr1/r;Ljava/lang/Long;Ll80/a;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q implements al2.e, jl2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f199123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f199124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l80.a f199125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f199126f;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f199127a;

        static {
            int[] iArr = new int[al2.b.values().length];
            try {
                iArr[al2.b.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[al2.b.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[al2.b.NO_ITEMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[al2.b.FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[al2.b.INTERRUPTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[al2.b.REJECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f199127a = iArr;
        }
    }

    public q(String str, r rVar, Long l14, l80.a aVar) {
        str.getClass();
        rVar.getClass();
        aVar.getClass();
        this.f199122b = str;
        this.f199123c = rVar;
        this.f199124d = l14;
        this.f199125e = aVar;
        this.f199126f = o13.m.b(new p(this, 0));
    }

    @Override // al2.m
    public final void B(al2.n nVar) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, this.f199122b, "SYNC onFileTransferProgress() " + nVar);
    }

    @Override // jl2.a
    public final void a(String str, al2.k kVar, long j8, gy2.g gVar) {
        kVar.getClass();
        gVar.getClass();
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "SYNC onDownloadEvent() connectionId=", str, " messageId=");
        sbJ.append(" messageType=");
        sbJ.append(gVar);
        sbJ.append(" event=");
        sbJ.append(kVar);
        String string = sbJ.toString();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, this.f199122b, string);
    }

    public final void b() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, this.f199122b, "SYNC register()");
        jl2.c cVar = il2.g.f94050g.a().f94057e;
        if (cVar != null) {
            cVar.f99553i.add(this);
        }
        a0.f132585h.a().b(this);
    }

    @Override // jl2.a
    public final void c(String str, wb2.i iVar) {
        iVar.getClass();
        String str2 = "SYNC onCIQError() connectionId=" + str + " failure=" + iVar;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, this.f199122b, str2);
    }

    @Override // jl2.a
    public final void d(String str, al2.k kVar, byte b14, byte b15) {
        kVar.getClass();
        StringBuilder sbK = androidx.core.view.j.k(b14, "SYNC onUploadEvent() connectionId=", str, " fileDataType=", " fileDataSubType=");
        sbK.append((int) b15);
        sbK.append(" event=");
        sbK.append(kVar);
        String string = sbK.toString();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, this.f199122b, string);
    }

    public final void e() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, this.f199122b, "SYNC unregister()");
        jl2.c cVar = il2.g.f94050g.a().f94057e;
        if (cVar != null) {
            cVar.f99553i.remove(this);
        }
        a0.f132585h.a().j(this);
    }

    @Override // al2.e
    public final void s(al2.a aVar) {
        rs2.c cVar = aVar.f3759a;
        String str = this.f199122b;
        Long l14 = this.f199124d;
        if (l14 != null) {
            if (l14.longValue() != cVar.getF92746j()) {
                String str2 = "SYNC filtered for " + l14 + " onProgress() ignored for " + cVar.getF92746j();
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.p(a2Var, str, str2);
                return;
            }
        }
        i2.a aVar3 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var2, str, "SYNC onProgress() " + aVar);
        this.f199123c.F1(aVar, ((Map) this.f199126f.getValue()).get(cVar.getF92741e()) == al2.k.STARTED);
    }

    @Override // al2.m
    public final void u(al2.l lVar) {
        lVar.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, this.f199122b, "SYNC onFileTransferStatusChange() " + lVar);
    }

    @Override // al2.e
    public final void y(al2.c cVar) {
        rs2.c cVar2 = cVar.f3775a;
        String str = this.f199122b;
        Long l14 = this.f199124d;
        if (l14 != null) {
            if (l14.longValue() != cVar2.getF92746j()) {
                String str2 = "SYNC filtered for " + l14 + " onStatusChange() ignored for " + cVar2.getF92746j();
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.p(a2Var, str, str2);
            }
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, str, "SYNC onStatusChange() " + cVar);
        int i14 = a.f199127a[cVar.f3777c.ordinal()];
        r rVar = this.f199123c;
        switch (i14) {
            case 1:
                rVar.B1(cVar);
                break;
            case 2:
            case 3:
                rVar.g5(cVar, true);
                break;
            case 4:
            case 5:
            case 6:
                rVar.g5(cVar, false);
                break;
            default:
                u0.r();
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(String str, r rVar, Long l14) {
        this(str, rVar, l14, null, 8, null);
        str.getClass();
        rVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(String str, r rVar) {
        this(str, rVar, null, null, 12, null);
        str.getClass();
        rVar.getClass();
    }

    public /* synthetic */ q(String str, r rVar, Long l14, l80.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, rVar, (i14 & 4) != 0 ? null : l14, (i14 & 8) != 0 ? (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null) : aVar);
    }
}
