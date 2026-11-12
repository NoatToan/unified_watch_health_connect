package el0;

import android.location.Location;
import c83.a0;
import d53.w;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lfl0/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.data.GolfCoursesRepositoryImpl$searchGolfCourses$2", f = "GolfCoursesRepositoryImpl.kt", l = {41, 53, 65}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<fl0.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Location f64527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f64528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f64529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f64530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f64531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f64532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f64533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f64534i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Location location, String str, e eVar, int i14, int i15, int i16, int i17, String str2, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f64527b = location;
        this.f64528c = str;
        this.f64529d = eVar;
        this.f64530e = i14;
        this.f64531f = i15;
        this.f64532g = i16;
        this.f64533h = i17;
        this.f64534i = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f64527b, this.f64528c, this.f64529d, this.f64530e, this.f64531f, this.f64532g, this.f64533h, this.f64534i, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<fl0.c>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r0 == r9) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c9, code lost:
    
        if (r0 == r9) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e9, code lost:
    
        if (r0 == r9) goto L39;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Object objF;
        Object objE;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64526a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                objE = obj;
                return (a0) objE;
            }
            if (i14 == 2) {
                r.b(obj);
                objF = obj;
                return (a0) objF;
            }
            if (i14 != 3) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objD = obj;
            return (a0) objD;
        }
        r.b(obj);
        int i15 = this.f64533h;
        int i16 = this.f64532g;
        int i17 = this.f64531f;
        e eVar = this.f64529d;
        String str = this.f64528c;
        Location location = this.f64527b;
        if (location != null && (str == null || w.J(str))) {
            b bVar = eVar.f64535a;
            String strValueOf = String.valueOf((int) (location.getLongitude() * 1.1930464711111112E7d));
            strValueOf.getClass();
            String strValueOf2 = String.valueOf((int) (location.getLatitude() * 1.1930464711111112E7d));
            strValueOf2.getClass();
            String strValueOf3 = String.valueOf(this.f64530e);
            String strValueOf4 = String.valueOf(i17);
            String strValueOf5 = String.valueOf(i16);
            String strValueOf6 = String.valueOf(i15);
            this.f64526a = 1;
            objE = bVar.e(strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, this.f64534i, this);
        } else if (location == null || str == null || w.J(str)) {
            b bVar2 = eVar.f64535a;
            if (str == null) {
                h.s("Course name cannot be null if location is also null");
                return null;
            }
            String strValueOf7 = String.valueOf(i17);
            String strValueOf8 = String.valueOf(i16);
            String strValueOf9 = String.valueOf(i15);
            this.f64526a = 3;
            objD = bVar2.d(str, strValueOf7, strValueOf8, strValueOf9, this.f64534i, this);
        } else {
            b bVar3 = eVar.f64535a;
            String strValueOf10 = String.valueOf((int) (location.getLongitude() * 1.1930464711111112E7d));
            strValueOf10.getClass();
            String strValueOf11 = String.valueOf((int) (location.getLatitude() * 1.1930464711111112E7d));
            strValueOf11.getClass();
            String strValueOf12 = String.valueOf(i17);
            String strValueOf13 = String.valueOf(i16);
            String strValueOf14 = String.valueOf(i15);
            this.f64526a = 2;
            objF = bVar3.f(strValueOf10, strValueOf11, strValueOf12, this.f64528c, strValueOf13, strValueOf14, this.f64534i, this);
        }
        return aVar;
    }
}
