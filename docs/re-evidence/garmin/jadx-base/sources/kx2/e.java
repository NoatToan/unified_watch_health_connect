package kx2;

import com.garmin.proto.generated.GDIGarminHealth;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkx2/e;", "", "Lkx2/g;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/garmin/proto/generated/GDIGarminHealth$FileTransferRequest$FileType;", "fileType", "", "fileSize", "Lcom/garmin/proto/generated/GDIGarminHealth$FileTransferRequest$ContentType;", "contentType", "Lrs2/c;", "deviceInfo", "", "uploadId", "nbrStatusChecks", "httpCode", "Lkx2/f;", "transferDuration", "<init>", "(Lkx2/g;Lcom/garmin/proto/generated/GDIGarminHealth$FileTransferRequest$FileType;ILcom/garmin/proto/generated/GDIGarminHealth$FileTransferRequest$ContentType;Lrs2/c;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkx2/f;)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f107132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GDIGarminHealth.FileTransferRequest.FileType f107133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GDIGarminHealth.FileTransferRequest.ContentType f107135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rs2.c f107136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f107137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f107138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f107139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f107140i;

    public /* synthetic */ e(g gVar, GDIGarminHealth.FileTransferRequest.FileType fileType, int i14, GDIGarminHealth.FileTransferRequest.ContentType contentType, rs2.c cVar, String str, Integer num, Integer num2, f fVar, int i15, j jVar) {
        this(gVar, fileType, i14, contentType, cVar, (i15 & 32) != 0 ? null : str, (i15 & 64) != 0 ? null : num, (i15 & 128) != 0 ? null : num2, (i15 & 256) != 0 ? null : fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f107132a == eVar.f107132a && this.f107133b == eVar.f107133b && this.f107134c == eVar.f107134c && this.f107135d == eVar.f107135d && s.g(this.f107136e, eVar.f107136e) && s.g(this.f107137f, eVar.f107137f) && s.g(this.f107138g, eVar.f107138g) && s.g(this.f107139h, eVar.f107139h) && s.g(this.f107140i, eVar.f107140i);
    }

    public final int hashCode() {
        int iHashCode = (this.f107136e.hashCode() + ((this.f107135d.hashCode() + q2.d(this.f107134c, (this.f107133b.hashCode() + (this.f107132a.hashCode() * 31)) * 31, 31)) * 31)) * 31;
        String str = this.f107137f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f107138g;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f107139h;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        f fVar = this.f107140i;
        return iHashCode4 + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        String strName = this.f107132a.name();
        String strName2 = this.f107133b.name();
        String strName3 = this.f107135d.name();
        String f172496d = this.f107136e.getF92742f();
        Integer num = this.f107138g;
        Integer num2 = this.f107139h;
        f fVar = this.f107140i;
        StringBuilder sbI = p6.b.i("SaMDFileTransfer(state=", strName, ", fileType=", strName2, ", fileSize=");
        wr.g.t(this.f107134c, ", contentType=", strName3, ", deviceInfo=", sbI);
        sn.a.t(sbI, f172496d, ", uploadId=", this.f107137f, ", nbrStatusChecks=");
        x.m(sbI, num, ", httpCode=", num2, ", ");
        sbI.append(fVar);
        sbI.append(")");
        return sbI.toString();
    }

    public e(g gVar, GDIGarminHealth.FileTransferRequest.FileType fileType, int i14, GDIGarminHealth.FileTransferRequest.ContentType contentType, rs2.c cVar, String str, Integer num, Integer num2, f fVar) {
        gVar.getClass();
        fileType.getClass();
        contentType.getClass();
        cVar.getClass();
        this.f107132a = gVar;
        this.f107133b = fileType;
        this.f107134c = i14;
        this.f107135d = contentType;
        this.f107136e = cVar;
        this.f107137f = str;
        this.f107138g = num;
        this.f107139h = num2;
        this.f107140i = fVar;
    }
}
