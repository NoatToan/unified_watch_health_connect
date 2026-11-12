package e30;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.details.EditCoursePointUseCase$invoke$1", f = "EditCoursePointUseCase.kt", l = {38, 45, 46, 47, 50}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f62670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f62672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f62673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f62674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.g f62675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.g f62676g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.garmin.android.apps.connectmobile.courses.model.e eVar, f fVar, com.garmin.android.apps.connectmobile.courses.model.g gVar, com.garmin.android.apps.connectmobile.courses.model.g gVar2, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f62673d = eVar;
        this.f62674e = fVar;
        this.f62675f = gVar;
        this.f62676g = gVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f62673d, this.f62674e, this.f62675f, this.f62676g, dVar);
        eVar.f62672c = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e> jVar, t13.d<? super Unit> dVar) {
        return ((e) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        if (r0.emit(r2, r14) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
    
        if (r0.emit(null, r14) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c8, code lost:
    
        if (r0.emit(null, r14) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d8, code lost:
    
        if (r0.emit(null, r14) == r1) goto L54;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        v2 v2Var;
        r53.j jVar = (r53.j) this.f62672c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f62671b;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 == 2) {
                eVar = this.f62670a;
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    this.f62672c = null;
                    this.f62670a = null;
                    this.f62671b = 3;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    this.f62672c = null;
                    this.f62670a = null;
                    this.f62671b = 4;
                }
            } else {
                if (i14 != 3 && i14 != 4 && i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        eVar = new com.garmin.android.apps.connectmobile.courses.model.e(this.f62673d);
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ = eVar.j();
        if (listJ == null) {
            listJ = j0.f134944a;
        }
        ArrayList arrayListD1 = h0.d1(listJ);
        Iterator it = arrayListD1.iterator();
        int i15 = 0;
        while (true) {
            if (!it.hasNext()) {
                i15 = -1;
                break;
            }
            if (p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.courses.model.g) it.next()).getCoursePointId(), this.f62676g.getCoursePointId())) {
                break;
            }
            i15++;
        }
        if (i15 != -1) {
            arrayListD1.set(i15, this.f62675f);
            eVar.i0(arrayListD1);
            String str = eVar.courseId;
            if (str == null || str.length() == 0) {
                this.f62672c = null;
                this.f62670a = null;
                this.f62671b = 5;
            } else {
                d60.b bVar = this.f62674e.f62677a;
                this.f62672c = jVar;
                this.f62670a = eVar;
                this.f62671b = 2;
                obj = bVar.i(str, eVar, this);
                if (obj != aVar) {
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        this.f62672c = null;
                        this.f62670a = null;
                        this.f62671b = 3;
                    } else {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        this.f62672c = null;
                        this.f62670a = null;
                        this.f62671b = 4;
                    }
                }
            }
        } else {
            this.f62672c = null;
            this.f62670a = null;
            this.f62671b = 1;
        }
        return aVar;
    }
}
