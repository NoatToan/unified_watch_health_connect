package qt1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$duplicateTrailCourse$1", f = "TrailDetailsViewModel.kt", l = {1326, 1328, 1334, 1338}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f147808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f147809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f147810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f147811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f147812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f147813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f147814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.l<com.garmin.android.apps.connectmobile.courses.model.e, Unit> f147815h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(k kVar, Context context, long j8, long j14, String str, e23.l<? super com.garmin.android.apps.connectmobile.courses.model.e, Unit> lVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f147810c = kVar;
        this.f147811d = context;
        this.f147812e = j8;
        this.f147813f = j14;
        this.f147814g = str;
        this.f147815h = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f147810c, this.f147811d, this.f147812e, this.f147813f, this.f147814g, this.f147815h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00eb A[DONT_INVERT, PHI: r0
      0x00eb: PHI (r0v9 com.garmin.android.apps.connectmobile.courses.model.e) = 
      (r0v8 com.garmin.android.apps.connectmobile.courses.model.e)
      (r0v14 com.garmin.android.apps.connectmobile.courses.model.e)
     binds: [B:21:0x00e8, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f3  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0111, code lost:
    
        if (r0.a(r12, r40) == r7) goto L27;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objF;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147809b;
        k kVar = this.f147810c;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = kVar.f147673h;
            pt1.o oVarA = pt1.o.a((pt1.o) p2Var.getValue(), true, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
            this.f147809b = 1;
            p2Var.k(null, oVarA);
            if (Unit.INSTANCE != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                o13.r.b(obj);
                objF = obj;
                eVar = (com.garmin.android.apps.connectmobile.courses.model.e) objF;
                p2 p2Var2 = kVar.f147673h;
                pt1.o oVarA2 = pt1.o.a((pt1.o) p2Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                this.f147808a = eVar;
                this.f147809b = 3;
                p2Var2.k(null, oVarA2);
                if (Unit.INSTANCE != aVar) {
                    if (eVar != null) {
                        this.f147815h.invoke(eVar);
                    } else {
                        vs1.h hVar = kVar.f147668c;
                        pt1.k kVar2 = new pt1.k(this.f147811d.getString(R.string.txt_error_occurred), null, null, 6, null);
                        this.f147808a = null;
                        this.f147809b = 4;
                    }
                }
                return aVar;
            }
            if (i14 == 3) {
                eVar = this.f147808a;
                o13.r.b(obj);
                if (eVar != null) {
                    this.f147815h.invoke(eVar);
                } else {
                    vs1.h hVar2 = kVar.f147668c;
                    pt1.k kVar3 = new pt1.k(this.f147811d.getString(R.string.txt_error_occurred), null, null, 6, null);
                    this.f147808a = null;
                    this.f147809b = 4;
                }
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        }
        return Unit.INSTANCE;
        ts1.a aVar2 = (ts1.a) KoinJavaComponent.get$default(ts1.a.class, null, null, 6, null);
        this.f147809b = 2;
        objF = aVar2.f(this.f147811d, this.f147812e, this.f147813f, this);
        if (objF != aVar) {
            eVar = (com.garmin.android.apps.connectmobile.courses.model.e) objF;
            p2 p2Var3 = kVar.f147673h;
            pt1.o oVarA3 = pt1.o.a((pt1.o) p2Var3.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
            this.f147808a = eVar;
            this.f147809b = 3;
            p2Var3.k(null, oVarA3);
            if (Unit.INSTANCE != aVar) {
                if (eVar != null) {
                    this.f147815h.invoke(eVar);
                } else {
                    vs1.h hVar3 = kVar.f147668c;
                    pt1.k kVar4 = new pt1.k(this.f147811d.getString(R.string.txt_error_occurred), null, null, 6, null);
                    this.f147808a = null;
                    this.f147809b = 4;
                }
                return Unit.INSTANCE;
            }
        }
        return aVar;
    }
}
