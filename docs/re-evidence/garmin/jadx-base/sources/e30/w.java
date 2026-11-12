package e30;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.firebase.messaging.Constants;
import d60.n0;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.details.RepositionCourseUseCase$invoke$1", f = "RepositionCourseUseCase.kt", l = {22, 34, 33, 42}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<r53.j<? super v2<? extends String>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f62727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f62729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f62730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f62731e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62732a;

        static {
            int[] iArr = new int[com.garmin.android.library.mapsdkadapter.i.b.values().length];
            try {
                iArr[com.garmin.android.library.mapsdkadapter.i.b.GCJ02.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.library.mapsdkadapter.i.b.WGS84.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f62732a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.garmin.android.apps.connectmobile.courses.model.e eVar, x xVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f62730d = eVar;
        this.f62731e = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w wVar = new w(this.f62730d, this.f62731e, dVar);
        wVar.f62729c = obj;
        return wVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends String>> jVar, t13.d<? super Unit> dVar) {
        return ((w) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r1.emit(r9, r19) == r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00df, code lost:
    
        if (r1.emit(r3, r19) == r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fa, code lost:
    
        if (r1.emit(r9, r19) == r2) goto L44;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.library.mapsdkadapter.i.b bVar;
        Long lValueOf;
        Object objJ;
        r53.j jVar = (r53.j) this.f62729c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f62728b;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    jVar = this.f62727a;
                    o13.r.b(obj);
                    objJ = obj;
                    this.f62729c = null;
                    this.f62727a = null;
                    this.f62728b = 3;
                } else if (i14 != 3 && i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            o13.r.b(obj);
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.courses.model.e eVar = this.f62730d;
        if (eVar != null) {
            int i15 = a.f62732a[eVar.h().ordinal()];
            if (i15 == 1) {
                bVar = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
            } else {
                if (i15 != 2) {
                    u0.r();
                    return null;
                }
                bVar = com.garmin.android.library.mapsdkadapter.i.b.GCJ02;
            }
            com.garmin.android.library.mapsdkadapter.i.b bVarH = eVar.h();
            int i16 = x.f62733b;
            x xVar = this.f62731e;
            xVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putString(Constants.MessagePayloadKeys.FROM, bVarH.name());
            bundle.putString("to", bVar.name());
            ht.a.f85464a.getClass();
            ht.a.a(bundle, "RepositionTapForCNCourse");
            String str = eVar.courseId;
            if (str == null || str.length() == 0) {
                lValueOf = null;
            } else {
                try {
                    long j8 = Long.parseLong(str);
                    if (j8 > 0) {
                        lValueOf = Long.valueOf(j8);
                    } else {
                        lValueOf = null;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            if (lValueOf != null) {
                d60.b bVar2 = xVar.f62734a;
                long jLongValue = lValueOf.longValue();
                String strName = bVar.name();
                this.f62729c = null;
                this.f62727a = jVar;
                this.f62728b = 2;
                objJ = f0.J(bVar2, new n0(bVar2, jLongValue, strName, true, true, null), this);
                if (objJ != aVar) {
                    this.f62729c = null;
                    this.f62727a = null;
                    this.f62728b = 3;
                }
            } else {
                v2.a aVar2 = new v2.a(new Exception("Invalid course id."), null, null, 6, null);
                this.f62729c = null;
                this.f62728b = 4;
            }
            return aVar;
        }
        v2.a aVar3 = new v2.a(new Exception("Invalid course."), null, null, 6, null);
        this.f62729c = null;
        this.f62728b = 1;
    }
}
