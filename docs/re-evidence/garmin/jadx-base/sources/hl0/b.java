package hl0;

import android.app.DownloadManager;
import android.database.Cursor;
import android.database.SQLException;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.domain.CheckGolfCourseDownloadStatusUseCase$checkDownloadStatus$2", f = "CheckGolfCourseDownloadStatusUseCase.kt", l = {57, 64}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Cursor f84259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f84261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f84262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f84263e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j8, a aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f84262d = j8;
        this.f84263e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f84262d, this.f84263e, dVar);
        bVar.f84261c = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0077  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0140, code lost:
    
        if (r0 == r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0143, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0168, code lost:
    
        if (r0 == r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016a, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Cursor cursorQuery;
        sd2.h hVarD;
        Cursor cursorQuery2;
        Cursor cursor;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f84260b;
        ?? r14 = 0;
        if (i14 == 0) {
            o13.r.b(obj);
            a2 a2Var = a2.GOLF;
            long j8 = this.f84262d;
            String strF = a0.f(j8, "checkDownloadStatus downloadId[", "]");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "GolfCourseDownloadViewModel", strF);
            rd2.l lVarE = rd2.l.e();
            Long l14 = new Long(j8);
            lVarE.getClass();
            try {
                try {
                    cursorQuery = qd2.a.b().f144484a.query("golf_downloaded_course", null, "android_download_id=? and android_download_id is not null", new String[]{String.valueOf(l14)}, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                hVarD = rd2.l.d(cursorQuery);
                            } else {
                                hVarD = null;
                            }
                        } catch (SQLException e4) {
                            e = e4;
                            rd2.l.f152081a.error("retrieveByDownloadID", (Throwable) e);
                            rd2.a.a(cursorQuery);
                            hVarD = null;
                        }
                    } else {
                        hVarD = null;
                    }
                    rd2.a.a(cursorQuery);
                } catch (Throwable th3) {
                    th = th3;
                    r14 = l14;
                    rd2.a.a(r14);
                    throw th;
                }
            } catch (SQLException e14) {
                e = e14;
                cursorQuery = null;
            } catch (Throwable th4) {
                th = th4;
                rd2.a.a(r14);
                throw th;
            }
            if (hVarD == null) {
                a2 a2Var2 = a2.GOLF;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "GolfCourseDownloadViewModel", "checkDownloadStatus courseDatabaseRecord null");
                return Unit.INSTANCE;
            }
            a2 a2Var3 = a2.GOLF;
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "GolfCourseDownloadViewModel", "checkDownloadStatus " + hVarD);
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterById(j8);
            a aVar = this.f84263e;
            DownloadManager downloadManager = aVar.f84258a;
            DownloadManager downloadManager2 = aVar.f84258a;
            cursorQuery2 = downloadManager.query(query);
            if (cursorQuery2 != null) {
                if (cursorQuery2.moveToFirst()) {
                    int i15 = cursorQuery2.getInt(cursorQuery2.getColumnIndex("status"));
                    if (i15 == 8) {
                        i2.a.b(a2Var3, "GolfCourseDownloadViewModel", "checkDownloadStatus STATUS_SUCCESSFUL");
                        this.f84261c = null;
                        this.f84259a = cursorQuery2;
                        this.f84260b = 1;
                        x53.c cVar = s0.f129406a;
                        Object objE0 = ge1.b.e0(x53.b.f189152a, new d(hVarD, aVar, downloadManager2, null), this);
                        if (objE0 != u13.a.COROUTINE_SUSPENDED) {
                            objE0 = Unit.INSTANCE;
                        }
                    } else if (i15 != 16) {
                        i2.a.b(a2Var3, "GolfCourseDownloadViewModel", "checkDownloadStatus Not handling download manager's status constant [" + i15 + "].");
                    } else {
                        int i16 = cursorQuery2.getInt(cursorQuery2.getColumnIndex("reason"));
                        i2.a.b(a2Var3, "GolfCourseDownloadViewModel", "checkDownloadStatus STATUS_FAILED reason[" + i16 + "]");
                        hVarD.f158681z = new Integer(i16);
                        this.f84261c = null;
                        this.f84259a = cursorQuery2;
                        this.f84260b = 2;
                        x53.c cVar2 = s0.f129406a;
                        Object objE1 = ge1.b.e0(x53.b.f189152a, new e(hVarD, aVar, downloadManager2, null), this);
                        if (objE1 != u13.a.COROUTINE_SUSPENDED) {
                            objE1 = Unit.INSTANCE;
                        }
                    }
                }
                cursorQuery2.close();
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1 && i14 != 2) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cursor = this.f84259a;
        o13.r.b(obj);
        cursorQuery2 = cursor;
        cursorQuery2.close();
        return Unit.INSTANCE;
    }
}
