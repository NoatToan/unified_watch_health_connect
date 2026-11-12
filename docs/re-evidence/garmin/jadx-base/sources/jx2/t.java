package jx2;

import android.os.SystemClock;
import com.garmin.proto.generated.GDIGarminHealth;
import com.garmin.samd.repository.UnexpectedResponseCodeException;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lox2/c;", "<anonymous>", "(Lo53/b0;)Lox2/c;"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.manager.SaMDFileTransferManager$performInitialUpload$2", f = "SaMDFileTransferManager.kt", l = {244, 259}, m = "invokeSuspend")
public final class t extends v13.i implements e23.p<b0, t13.d<? super ox2.c>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f101638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f101639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f101640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GDIGarminHealth.FileTransferRequest f101641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f101642e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar, GDIGarminHealth.FileTransferRequest fileTransferRequest, byte[] bArr, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f101640c = sVar;
        this.f101641d = fileTransferRequest;
        this.f101642e = bArr;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t(this.f101640c, this.f101641d, this.f101642e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super ox2.c> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x012c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0143  */
    /* JADX WARN: Code duplicated, block: B:48:0x014e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0170  */
    /* JADX WARN: Code duplicated, block: B:50:0x0197  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [long] */
    /* JADX WARN: Type inference failed for: r1v23 */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        UnexpectedResponseCodeException unexpectedResponseCodeException;
        Object objE0;
        String str;
        long jElapsedRealtime;
        byte[] bArr;
        Object objA;
        GDIGarminHealth.FileTransferRequest fileTransferRequest = this.f101641d;
        s sVar = this.f101640c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        long j8 = this.f101639b;
        try {
            try {
                if (j8 != 0) {
                    if (j8 == 1) {
                        long j14 = this.f101638a;
                        o13.r.b(obj);
                        objE0 = obj;
                    } else {
                        if (j8 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        long j15 = this.f101638a;
                        o13.r.b(obj);
                        objA = obj;
                        j8 = j15;
                    }
                    ox2.a aVar2 = (ox2.a) objA;
                    s.i(sVar, j8, SystemClock.elapsedRealtime());
                    ox2.c.f134340c.getClass();
                    return ox2.c.a.a(aVar2);
                }
                o13.r.b(obj);
                try {
                    long j16 = sVar.f101618c;
                    if (j16 > 0) {
                        sVar.f101619d.set(new kx2.f(new Long(SystemClock.elapsedRealtime() - sVar.f101618c), null, null, 6, null));
                        sVar.f101618c = 0L;
                    } else {
                        sVar.e("preformInitialUpload: fileTransferDeviceBeginTimestamp is [" + j16 + "]", null);
                    }
                    s.q(fileTransferRequest);
                    this.f101638a = 0L;
                    this.f101639b = 1;
                    gx2.b.f80060a.getClass();
                    objE0 = ge1.b.e0(gx2.b.d.a(), new v(sVar, false, null), this);
                    if (objE0 != aVar) {
                    }
                    return aVar;
                } catch (Throwable th3) {
                    th = th3;
                    j8 = 0;
                    if (j8 > 0) {
                        s.i(sVar, j8, SystemClock.elapsedRealtime());
                    }
                    s.b bVar = s.b.IDLE;
                    sVar.getClass();
                    bVar.getClass();
                    sVar.f101621f = bVar;
                    if (th instanceof UnexpectedResponseCodeException) {
                        unexpectedResponseCodeException = th;
                        if (unexpectedResponseCodeException.getResponseCode() == 409) {
                            sVar.f(th, "performInitialUpload");
                            s sVar2 = this.f101640c;
                            GDIGarminHealth.FileTransferRequest.FileType fileType = fileTransferRequest.getFileType();
                            fileType.getClass();
                            GDIGarminHealth.FileTransferRequest.ContentType contentType = fileTransferRequest.getContentType();
                            contentType.getClass();
                            s.m(sVar2, false, null, fileType, contentType, null, th, 102);
                        } else {
                            sVar.e("performInitialUpload", th);
                            GDIGarminHealth.FileTransferRequest.FileType fileType2 = fileTransferRequest.getFileType();
                            GDIGarminHealth.FileTransferRequest.ContentType contentType2 = fileTransferRequest.getContentType();
                            int responseCode = unexpectedResponseCodeException.getResponseCode();
                            s sVar3 = this.f101640c;
                            Integer num = new Integer(responseCode);
                            fileType2.getClass();
                            contentType2.getClass();
                            s.m(sVar3, true, num, fileType2, contentType2, null, th, 98);
                        }
                    } else {
                        sVar.e("performInitialUpload", th);
                        s sVar4 = this.f101640c;
                        GDIGarminHealth.FileTransferRequest.FileType fileType3 = fileTransferRequest.getFileType();
                        fileType3.getClass();
                        GDIGarminHealth.FileTransferRequest.ContentType contentType3 = fileTransferRequest.getContentType();
                        contentType3.getClass();
                        s.m(sVar4, true, null, fileType3, contentType3, null, th, 102);
                    }
                    throw sVar.g(th);
                }
                String fileName = fileTransferRequest.getFileName();
                fileName.getClass();
                GDIGarminHealth.FileTransferRequest.FileType fileType4 = fileTransferRequest.getFileType();
                fileType4.getClass();
                GDIGarminHealth.FileTransferRequest.ContentType contentType4 = fileTransferRequest.getContentType();
                contentType4.getClass();
                gx2.a aVarC = a.c();
                aVarC.getClass();
                this.f101638a = jElapsedRealtime;
                this.f101639b = 2;
                objA = vx2.b.a(fileName, fileType4, contentType4, bArr, aVarC, str, this);
                if (objA != aVar) {
                    j8 = jElapsedRealtime;
                    ox2.a aVar3 = (ox2.a) objA;
                    s.i(sVar, j8, SystemClock.elapsedRealtime());
                    ox2.c.f134340c.getClass();
                    return ox2.c.a.a(aVar3);
                }
                return aVar;
            } catch (Throwable th4) {
                th = th4;
                j8 = jElapsedRealtime;
                if (j8 > 0) {
                    s.i(sVar, j8, SystemClock.elapsedRealtime());
                }
                s.b bVar2 = s.b.IDLE;
                sVar.getClass();
                bVar2.getClass();
                sVar.f101621f = bVar2;
                if (th instanceof UnexpectedResponseCodeException) {
                    unexpectedResponseCodeException = th;
                    if (unexpectedResponseCodeException.getResponseCode() == 409) {
                        sVar.f(th, "performInitialUpload");
                        s sVar5 = this.f101640c;
                        GDIGarminHealth.FileTransferRequest.FileType fileType5 = fileTransferRequest.getFileType();
                        fileType5.getClass();
                        GDIGarminHealth.FileTransferRequest.ContentType contentType5 = fileTransferRequest.getContentType();
                        contentType5.getClass();
                        s.m(sVar5, false, null, fileType5, contentType5, null, th, 102);
                    } else {
                        sVar.e("performInitialUpload", th);
                        GDIGarminHealth.FileTransferRequest.FileType fileType6 = fileTransferRequest.getFileType();
                        GDIGarminHealth.FileTransferRequest.ContentType contentType6 = fileTransferRequest.getContentType();
                        int responseCode2 = unexpectedResponseCodeException.getResponseCode();
                        s sVar6 = this.f101640c;
                        Integer num2 = new Integer(responseCode2);
                        fileType6.getClass();
                        contentType6.getClass();
                        s.m(sVar6, true, num2, fileType6, contentType6, null, th, 98);
                    }
                } else {
                    sVar.e("performInitialUpload", th);
                    s sVar7 = this.f101640c;
                    GDIGarminHealth.FileTransferRequest.FileType fileType7 = fileTransferRequest.getFileType();
                    fileType7.getClass();
                    GDIGarminHealth.FileTransferRequest.ContentType contentType7 = fileTransferRequest.getContentType();
                    contentType7.getClass();
                    s.m(sVar7, true, null, fileType7, contentType7, null, th, 102);
                }
                throw sVar.g(th);
            }
            str = (String) objE0;
            byte[] bArrN = this.f101642e;
            if (bArrN == null) {
                bArrN = sVar.n(fileTransferRequest);
            }
            sVar.f101620e = bArrN.length;
            s.b bVar3 = s.b.UPLOAD;
            bVar3.getClass();
            sVar.f101621f = bVar3;
            s sVar8 = this.f101640c;
            GDIGarminHealth.FileTransferRequest.FileType fileType8 = fileTransferRequest.getFileType();
            fileType8.getClass();
            GDIGarminHealth.FileTransferRequest.ContentType contentType8 = fileTransferRequest.getContentType();
            contentType8.getClass();
            s.m(sVar8, false, null, fileType8, contentType8, kx2.g.f107156n, null, 199);
            sVar.d().debug(fileTransferRequest.getFileType().name() + " file uploading");
            jElapsedRealtime = SystemClock.elapsedRealtime();
            bArr = bArrN;
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
