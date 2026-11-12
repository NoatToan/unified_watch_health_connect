package l62;

import com.garmin.android.apps.connectmobile.workouts.data.model.c0;
import e23.p;
import java.util.ArrayList;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.reschedule.RescheduleSTPViewModel$fetchTrainingPlan$1", f = "RescheduleSTPViewModel.kt", l = {30, 31, 32, 54, 56, 58}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f110533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f110534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f110535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f110536e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, long j8, DateTime dateTime, long j14, t13.d<? super b> dVar2) {
        super(2, dVar2);
        this.f110533b = dVar;
        this.f110534c = j8;
        this.f110535d = dateTime;
        this.f110536e = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f110533b, this.f110534c, this.f110535d, this.f110536e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[PHI: r2
      0x005d: PHI (r2v7 java.lang.Object) = (r2v6 java.lang.Object), (r2v22 java.lang.Object) binds: [B:18:0x0059, B:8:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d5 A[LOOP:0: B:24:0x00d5->B:26:0x00dc, LOOP_START, PHI: r11
      0x00d5: PHI (r11v3 long) = (r11v1 long), (r11v4 long) binds: [B:23:0x00d3, B:26:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00dc A[LOOP:0: B:24:0x00d5->B:26:0x00dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:33:0x010a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0116, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r1) goto L35;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objL;
        c0 c0Var;
        ArrayList arrayList;
        long millis;
        long jO;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110532a;
        d dVar = this.f110533b;
        switch (i14) {
            case 0:
                r.b(obj);
                p2 p2Var = dVar.f110547d;
                Boolean bool = Boolean.TRUE;
                this.f110532a = 1;
                p2Var.k(null, bool);
                if (Unit.INSTANCE != aVar) {
                    p2 p2Var2 = dVar.f110549f;
                    Boolean bool2 = Boolean.FALSE;
                    this.f110532a = 2;
                    p2Var2.k(null, bool2);
                    if (Unit.INSTANCE != aVar) {
                        o52.e eVar = dVar.f110544a;
                        this.f110532a = 3;
                        objL = eVar.l(this.f110534c, this);
                        if (objL != aVar) {
                            c0Var = (c0) objL;
                            if (c0Var == null) {
                                p2 p2Var3 = dVar.f110549f;
                                Boolean bool3 = Boolean.TRUE;
                                this.f110532a = 5;
                                p2Var3.k(null, bool3);
                                if (Unit.INSTANCE != aVar) {
                                    p2 p2Var4 = dVar.f110547d;
                                    Boolean bool4 = Boolean.FALSE;
                                    this.f110532a = 6;
                                    p2Var4.k(null, bool4);
                                }
                            } else {
                                String string = c0Var.f48134b.toString("yyyy-MM-dd");
                                DateTimeZone dateTimeZone = DateTimeZone.UTC;
                                DateTime dateTime = new DateTime(string, dateTimeZone);
                                DateTime dateTime2 = new DateTime(c0Var.f48135c.toString("yyyy-MM-dd"), dateTimeZone);
                                DateTime dateTimeWithTimeAtStartOfDay = DateTime.now(dateTimeZone).withTimeAtStartOfDay();
                                DateTime dateTimeWithTimeAtStartOfDay2 = new DateTime(this.f110535d.toString("yyyy-MM-dd"), dateTimeZone).withTimeAtStartOfDay();
                                dateTimeWithTimeAtStartOfDay2.getClass();
                                dateTimeWithTimeAtStartOfDay.getClass();
                                DateTime dateTime3 = (DateTime) r13.b.d(dateTimeWithTimeAtStartOfDay2, dateTimeWithTimeAtStartOfDay);
                                DateTime dateTimeMinusDays = dateTime3.minusDays(3);
                                DateTime dateTimePlusDays = dateTime3.plusDays(3);
                                dateTimeMinusDays.getClass();
                                DateTime dateTime4 = (DateTime) r13.b.d(dateTime, r13.b.d(dateTimeMinusDays, dateTimeWithTimeAtStartOfDay));
                                dateTimePlusDays.getClass();
                                DateTime dateTime5 = (DateTime) r13.b.e(dateTime2, dateTimePlusDays);
                                arrayList = new ArrayList();
                                millis = dateTime4.getMillis();
                                jO = w5.r.o(millis, dateTime5.getMillis(), 86400000L);
                                if (millis <= jO) {
                                    while (true) {
                                        q6.f.s(millis, arrayList);
                                        if (millis != jO) {
                                            millis += 86400000;
                                        }
                                    }
                                }
                                g gVar = new g(dateTime3, i53.a.e(arrayList), this.f110534c, this.f110536e);
                                p2 p2Var5 = dVar.f110545b;
                                this.f110532a = 4;
                                p2Var5.k(null, gVar);
                                if (Unit.INSTANCE != aVar) {
                                    p2 p2Var6 = dVar.f110547d;
                                    Boolean bool5 = Boolean.FALSE;
                                    this.f110532a = 6;
                                    p2Var6.k(null, bool5);
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                r.b(obj);
                p2 p2Var7 = dVar.f110549f;
                Boolean bool6 = Boolean.FALSE;
                this.f110532a = 2;
                p2Var7.k(null, bool6);
                if (Unit.INSTANCE != aVar) {
                    o52.e eVar2 = dVar.f110544a;
                    this.f110532a = 3;
                    objL = eVar2.l(this.f110534c, this);
                    if (objL != aVar) {
                        c0Var = (c0) objL;
                        if (c0Var == null) {
                            p2 p2Var8 = dVar.f110549f;
                            Boolean bool7 = Boolean.TRUE;
                            this.f110532a = 5;
                            p2Var8.k(null, bool7);
                            if (Unit.INSTANCE != aVar) {
                                p2 p2Var9 = dVar.f110547d;
                                Boolean bool8 = Boolean.FALSE;
                                this.f110532a = 6;
                                p2Var9.k(null, bool8);
                            }
                        } else {
                            String string2 = c0Var.f48134b.toString("yyyy-MM-dd");
                            DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                            DateTime dateTime6 = new DateTime(string2, dateTimeZone2);
                            DateTime dateTime7 = new DateTime(c0Var.f48135c.toString("yyyy-MM-dd"), dateTimeZone2);
                            DateTime dateTimeWithTimeAtStartOfDay3 = DateTime.now(dateTimeZone2).withTimeAtStartOfDay();
                            DateTime dateTimeWithTimeAtStartOfDay4 = new DateTime(this.f110535d.toString("yyyy-MM-dd"), dateTimeZone2).withTimeAtStartOfDay();
                            dateTimeWithTimeAtStartOfDay4.getClass();
                            dateTimeWithTimeAtStartOfDay3.getClass();
                            DateTime dateTime8 = (DateTime) r13.b.d(dateTimeWithTimeAtStartOfDay4, dateTimeWithTimeAtStartOfDay3);
                            DateTime dateTimeMinusDays2 = dateTime8.minusDays(3);
                            DateTime dateTimePlusDays2 = dateTime8.plusDays(3);
                            dateTimeMinusDays2.getClass();
                            DateTime dateTime9 = (DateTime) r13.b.d(dateTime6, r13.b.d(dateTimeMinusDays2, dateTimeWithTimeAtStartOfDay3));
                            dateTimePlusDays2.getClass();
                            DateTime dateTime10 = (DateTime) r13.b.e(dateTime7, dateTimePlusDays2);
                            arrayList = new ArrayList();
                            millis = dateTime9.getMillis();
                            jO = w5.r.o(millis, dateTime10.getMillis(), 86400000L);
                            if (millis <= jO) {
                                while (true) {
                                    q6.f.s(millis, arrayList);
                                    if (millis != jO) {
                                        millis += 86400000;
                                    }
                                }
                            }
                            g gVar2 = new g(dateTime8, i53.a.e(arrayList), this.f110534c, this.f110536e);
                            p2 p2Var10 = dVar.f110545b;
                            this.f110532a = 4;
                            p2Var10.k(null, gVar2);
                            if (Unit.INSTANCE != aVar) {
                                p2 p2Var11 = dVar.f110547d;
                                Boolean bool9 = Boolean.FALSE;
                                this.f110532a = 6;
                                p2Var11.k(null, bool9);
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                r.b(obj);
                o52.e eVar3 = dVar.f110544a;
                this.f110532a = 3;
                objL = eVar3.l(this.f110534c, this);
                if (objL != aVar) {
                    c0Var = (c0) objL;
                    if (c0Var == null) {
                        p2 p2Var12 = dVar.f110549f;
                        Boolean bool10 = Boolean.TRUE;
                        this.f110532a = 5;
                        p2Var12.k(null, bool10);
                        if (Unit.INSTANCE != aVar) {
                            p2 p2Var13 = dVar.f110547d;
                            Boolean bool11 = Boolean.FALSE;
                            this.f110532a = 6;
                            p2Var13.k(null, bool11);
                        }
                    } else {
                        String string3 = c0Var.f48134b.toString("yyyy-MM-dd");
                        DateTimeZone dateTimeZone3 = DateTimeZone.UTC;
                        DateTime dateTime11 = new DateTime(string3, dateTimeZone3);
                        DateTime dateTime12 = new DateTime(c0Var.f48135c.toString("yyyy-MM-dd"), dateTimeZone3);
                        DateTime dateTimeWithTimeAtStartOfDay5 = DateTime.now(dateTimeZone3).withTimeAtStartOfDay();
                        DateTime dateTimeWithTimeAtStartOfDay6 = new DateTime(this.f110535d.toString("yyyy-MM-dd"), dateTimeZone3).withTimeAtStartOfDay();
                        dateTimeWithTimeAtStartOfDay6.getClass();
                        dateTimeWithTimeAtStartOfDay5.getClass();
                        DateTime dateTime13 = (DateTime) r13.b.d(dateTimeWithTimeAtStartOfDay6, dateTimeWithTimeAtStartOfDay5);
                        DateTime dateTimeMinusDays3 = dateTime13.minusDays(3);
                        DateTime dateTimePlusDays3 = dateTime13.plusDays(3);
                        dateTimeMinusDays3.getClass();
                        DateTime dateTime14 = (DateTime) r13.b.d(dateTime11, r13.b.d(dateTimeMinusDays3, dateTimeWithTimeAtStartOfDay5));
                        dateTimePlusDays3.getClass();
                        DateTime dateTime15 = (DateTime) r13.b.e(dateTime12, dateTimePlusDays3);
                        arrayList = new ArrayList();
                        millis = dateTime14.getMillis();
                        jO = w5.r.o(millis, dateTime15.getMillis(), 86400000L);
                        if (millis <= jO) {
                            while (true) {
                                q6.f.s(millis, arrayList);
                                if (millis != jO) {
                                    millis += 86400000;
                                }
                            }
                        }
                        g gVar3 = new g(dateTime13, i53.a.e(arrayList), this.f110534c, this.f110536e);
                        p2 p2Var14 = dVar.f110545b;
                        this.f110532a = 4;
                        p2Var14.k(null, gVar3);
                        if (Unit.INSTANCE != aVar) {
                            p2 p2Var15 = dVar.f110547d;
                            Boolean bool12 = Boolean.FALSE;
                            this.f110532a = 6;
                            p2Var15.k(null, bool12);
                        }
                    }
                    break;
                }
                return aVar;
            case 3:
                r.b(obj);
                objL = obj;
                c0Var = (c0) objL;
                if (c0Var == null) {
                    String string4 = c0Var.f48134b.toString("yyyy-MM-dd");
                    DateTimeZone dateTimeZone4 = DateTimeZone.UTC;
                    DateTime dateTime16 = new DateTime(string4, dateTimeZone4);
                    DateTime dateTime17 = new DateTime(c0Var.f48135c.toString("yyyy-MM-dd"), dateTimeZone4);
                    DateTime dateTimeWithTimeAtStartOfDay7 = DateTime.now(dateTimeZone4).withTimeAtStartOfDay();
                    DateTime dateTimeWithTimeAtStartOfDay8 = new DateTime(this.f110535d.toString("yyyy-MM-dd"), dateTimeZone4).withTimeAtStartOfDay();
                    dateTimeWithTimeAtStartOfDay8.getClass();
                    dateTimeWithTimeAtStartOfDay7.getClass();
                    DateTime dateTime18 = (DateTime) r13.b.d(dateTimeWithTimeAtStartOfDay8, dateTimeWithTimeAtStartOfDay7);
                    DateTime dateTimeMinusDays4 = dateTime18.minusDays(3);
                    DateTime dateTimePlusDays4 = dateTime18.plusDays(3);
                    dateTimeMinusDays4.getClass();
                    DateTime dateTime19 = (DateTime) r13.b.d(dateTime16, r13.b.d(dateTimeMinusDays4, dateTimeWithTimeAtStartOfDay7));
                    dateTimePlusDays4.getClass();
                    DateTime dateTime110 = (DateTime) r13.b.e(dateTime17, dateTimePlusDays4);
                    arrayList = new ArrayList();
                    millis = dateTime19.getMillis();
                    jO = w5.r.o(millis, dateTime110.getMillis(), 86400000L);
                    if (millis <= jO) {
                        while (true) {
                            q6.f.s(millis, arrayList);
                            if (millis != jO) {
                                millis += 86400000;
                            }
                        }
                    }
                    g gVar4 = new g(dateTime18, i53.a.e(arrayList), this.f110534c, this.f110536e);
                    p2 p2Var16 = dVar.f110545b;
                    this.f110532a = 4;
                    p2Var16.k(null, gVar4);
                    if (Unit.INSTANCE != aVar) {
                        p2 p2Var17 = dVar.f110547d;
                        Boolean bool13 = Boolean.FALSE;
                        this.f110532a = 6;
                        p2Var17.k(null, bool13);
                    }
                    break;
                } else {
                    p2 p2Var18 = dVar.f110549f;
                    Boolean bool14 = Boolean.TRUE;
                    this.f110532a = 5;
                    p2Var18.k(null, bool14);
                    if (Unit.INSTANCE != aVar) {
                        p2 p2Var19 = dVar.f110547d;
                        Boolean bool15 = Boolean.FALSE;
                        this.f110532a = 6;
                        p2Var19.k(null, bool15);
                    }
                    break;
                }
                return aVar;
            case 4:
            case 5:
                r.b(obj);
                p2 p2Var110 = dVar.f110547d;
                Boolean bool16 = Boolean.FALSE;
                this.f110532a = 6;
                p2Var110.k(null, bool16);
                break;
            case 6:
                r.b(obj);
                return Unit.INSTANCE;
            default:
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
