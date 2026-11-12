package qa2;

import e23.l;
import e23.p;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import o13.r;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.exportablereports.model.ReportsDataStore$getReportID$1", f = "ReportsDataStore.kt", l = {73, 82, 107}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f143917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f143918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f143919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f143920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f143921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f143922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l<b, Unit> f143923g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(e eVar, l<? super b, Unit> lVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f143922f = eVar;
        this.f143923g = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f143922f, this.f143923g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a8 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:11:0x0039, B:34:0x00d4, B:37:0x00de, B:39:0x00e5, B:42:0x00ed, B:46:0x0105, B:16:0x0045, B:25:0x00a0, B:27:0x00a8, B:29:0x00b4, B:31:0x00ba, B:43:0x00f7, B:45:0x00fd, B:22:0x0079), top: B:66:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:11:0x0039, B:34:0x00d4, B:37:0x00de, B:39:0x00e5, B:42:0x00ed, B:46:0x0105, B:16:0x0045, B:25:0x00a0, B:27:0x00a8, B:29:0x00b4, B:31:0x00ba, B:43:0x00f7, B:45:0x00fd, B:22:0x0079), top: B:66:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:11:0x0039, B:34:0x00d4, B:37:0x00de, B:39:0x00e5, B:42:0x00ed, B:46:0x0105, B:16:0x0045, B:25:0x00a0, B:27:0x00a8, B:29:0x00b4, B:31:0x00ba, B:43:0x00f7, B:45:0x00fd, B:22:0x0079), top: B:66:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fd A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:11:0x0039, B:34:0x00d4, B:37:0x00de, B:39:0x00e5, B:42:0x00ed, B:46:0x0105, B:16:0x0045, B:25:0x00a0, B:27:0x00a8, B:29:0x00b4, B:31:0x00ba, B:43:0x00f7, B:45:0x00fd, B:22:0x0079), top: B:66:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:60:0x016f  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Date date;
        Object objC;
        e eVar;
        Object objB;
        c cVar;
        Integer checkInMilliSeconds;
        long jIntValue;
        String reportId;
        Integer checkInMilliSeconds2;
        int iIntValue;
        b bVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143921e;
        e eVar2 = this.f143922f;
        l<b, Unit> lVar = this.f143923g;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    objB = obj;
                    cVar = (c) objB;
                    if (cVar.g()) {
                        eVar2.f143903c = cVar.getReportId();
                        checkInMilliSeconds = cVar.getCheckInMilliSeconds();
                        if (checkInMilliSeconds != null && checkInMilliSeconds.intValue() > 0) {
                            jIntValue = ((long) checkInMilliSeconds.intValue()) + 2000;
                            this.f143917a = null;
                            this.f143918b = null;
                            this.f143919c = cVar;
                            this.f143920d = null;
                            this.f143921e = 2;
                            if (m0.b(jIntValue, this) == aVar) {
                                return aVar;
                            }
                        }
                    } else if (cVar.f()) {
                        e.f143900h.getClass();
                        lVar.invoke(null);
                    }
                    wa2.b bVar2 = e.f143900h;
                    cVar.toString();
                    bVar2.getClass();
                } else if (i14 == 2) {
                    cVar = this.f143919c;
                    r.b(obj);
                } else {
                    if (i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar2 = this.f143920d;
                    lVar = this.f143918b;
                    e eVar3 = this.f143917a;
                    r.b(obj);
                    eVar = eVar3;
                    objC = obj;
                    eVar2.f143905e = (b) objC;
                    bVar = eVar.f143905e;
                    if (bVar != null) {
                        eVar.f143903c = bVar.getReportID();
                    }
                    lVar.invoke(eVar.f143905e);
                }
                reportId = cVar.getReportId();
                if (reportId == null) {
                    reportId = "";
                }
                String str = reportId;
                checkInMilliSeconds2 = cVar.getCheckInMilliSeconds();
                if (checkInMilliSeconds2 != null) {
                    iIntValue = checkInMilliSeconds2.intValue();
                } else {
                    iIntValue = 0;
                }
                lVar.invoke(new b(str, iIntValue, null, 4, null));
                wa2.b bVar3 = e.f143900h;
                cVar.toString();
                bVar3.getClass();
            } else {
                r.b(obj);
                pa2.b.f136781a.getClass();
                pa2.a aVarA = pa2.b.a.a();
                if (s.g(aVarA.f136770b, "ecg")) {
                    ra2.h.f151495a.getClass();
                    Object objB2 = ra2.h.a().b(ra2.a.class);
                    objB2.getClass();
                    ra2.a aVar2 = (ra2.a) objB2;
                    Object obj2 = aVarA.f136779k;
                    if (obj2 != null) {
                        String str2 = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
                        String str3 = aVarA.f136775g;
                        str2.getClass();
                        this.f143917a = null;
                        this.f143918b = null;
                        this.f143921e = 1;
                        objB = aVar2.b(str3, str2, obj2, this);
                        if (objB != aVar) {
                            cVar = (c) objB;
                            if (cVar.g()) {
                                eVar2.f143903c = cVar.getReportId();
                                checkInMilliSeconds = cVar.getCheckInMilliSeconds();
                                if (checkInMilliSeconds != null) {
                                    jIntValue = ((long) checkInMilliSeconds.intValue()) + 2000;
                                    this.f143917a = null;
                                    this.f143918b = null;
                                    this.f143919c = cVar;
                                    this.f143920d = null;
                                    this.f143921e = 2;
                                    if (m0.b(jIntValue, this) == aVar) {
                                    }
                                }
                                reportId = cVar.getReportId();
                                if (reportId == null) {
                                    reportId = "";
                                }
                                String str4 = reportId;
                                checkInMilliSeconds2 = cVar.getCheckInMilliSeconds();
                                if (checkInMilliSeconds2 != null) {
                                    iIntValue = checkInMilliSeconds2.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                lVar.invoke(new b(str4, iIntValue, null, 4, null));
                            } else if (cVar.f()) {
                                e.f143900h.getClass();
                                lVar.invoke(null);
                            }
                            wa2.b bVar4 = e.f143900h;
                            cVar.toString();
                            bVar4.getClass();
                        }
                        return aVar;
                    }
                    e.f143900h.getClass();
                    lVar.invoke(null);
                } else {
                    Date date2 = eVar2.f143901a;
                    if (date2 != null && (date = eVar2.f143902b) != null) {
                        ra2.b bVar5 = eVar2.f143907g;
                        String str5 = pa2.b.a.a().f136770b;
                        wa2.a.f183799a.getClass();
                        String strC = wa2.a.C3407a.c(date2);
                        String strC2 = wa2.a.C3407a.c(date);
                        String str6 = pa2.b.a.a().f136775g;
                        Object obj3 = pa2.b.a.a().f136779k;
                        this.f143917a = eVar2;
                        this.f143918b = lVar;
                        this.f143919c = null;
                        this.f143920d = eVar2;
                        this.f143921e = 3;
                        objC = bVar5.c(str5, strC, strC2, str6, obj3, this);
                        if (objC != aVar) {
                            eVar = eVar2;
                            eVar2.f143905e = (b) objC;
                            bVar = eVar.f143905e;
                            if (bVar != null) {
                                eVar.f143903c = bVar.getReportID();
                            }
                            lVar.invoke(eVar.f143905e);
                        }
                        return aVar;
                    }
                    lVar.invoke(null);
                }
            }
        } catch (Exception e4) {
            wa2.b bVar6 = e.f143900h;
            e4.getMessage();
            bVar6.getClass();
            lVar.invoke(null);
        }
        return Unit.INSTANCE;
    }
}
