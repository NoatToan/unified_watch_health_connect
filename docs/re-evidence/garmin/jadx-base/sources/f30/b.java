package f30;

import com.garmin.android.apps.connectmobile.courses.model.d;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.library.mapsdkadapter.f;
import e23.p;
import fg0.k;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.j;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\"\u0012\u001e\u0012\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lo13/p;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "Lfg0/k;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.courses.domain.list.GetCoursesWithEventsUseCase$invoke$1", f = "GetCoursesWithEventsUseCase.kt", l = {21, 29, 33, 37, 43}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<j<? super o13.p<? extends List<? extends d>, ? extends List<? extends k>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f68641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f68642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f68643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f68644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i50.b f68645e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, i50.b bVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f68644d = aVar;
        this.f68645e = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f68644d, this.f68645e, dVar);
        bVar.f68643c = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(j<? super o13.p<? extends List<? extends d>, ? extends List<? extends k>>> jVar, t13.d<? super Unit> dVar) {
        return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    /* JADX WARN: Code duplicated, block: B:60:0x0118  */
    /* JADX WARN: Code duplicated, block: B:61:0x011d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0126  */
    /* JADX WARN: Code duplicated, block: B:72:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b8, code lost:
    
        if (r8.emit(null, r17) == r9) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d6, code lost:
    
        if (r8.emit(r2, r17) == r9) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0138, code lost:
    
        if (r8.emit(r1, r17) == r9) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [p13.j0] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objF;
        List list;
        Object objB;
        v2 v2Var;
        Object arrayList;
        Long courseId;
        long jLongValue;
        j jVar = (j) this.f68643c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f68642b;
        a aVar2 = this.f68644d;
        if (i14 == 0) {
            r.b(obj);
            d60.b bVar = aVar2.f68639a;
            String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
            int userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
            i50.b bVar2 = this.f68645e;
            f fVar = bVar2.f91705l;
            Double d14 = fVar != null ? new Double(fVar.f50283a.latitude) : null;
            f fVar2 = bVar2.f91705l;
            Double d15 = fVar2 != null ? new Double(fVar2.f50283a.longitude) : null;
            Boolean boolValueOf = Boolean.valueOf(bVar2.f91695b || bVar2.f91697d || bVar2.f91698e);
            this.f68643c = jVar;
            this.f68642b = 1;
            objF = d60.b.f(bVar, userDisplayName, userProfilePk, d14, d15, boolValueOf, this, 16);
            if (objF != aVar) {
            }
            return aVar;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 == 3) {
                r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 == 4) {
                list = this.f68641a;
                r.b(obj);
                objB = obj;
                v2Var = (v2) objB;
                if (v2Var instanceof v2.b) {
                    Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
                    arrayList = new ArrayList();
                    for (Object obj2 : iterable) {
                        courseId = ((k) obj2).getCourseId();
                        if (courseId != null) {
                            jLongValue = courseId.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        if (jLongValue > 0) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = j0.f134944a;
                }
                o13.p pVar = new o13.p(list, arrayList);
                this.f68643c = null;
                this.f68641a = null;
                this.f68642b = 5;
            } else {
                if (i14 != 5) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        objF = obj;
        list = (List) objF;
        if (list == null) {
            this.f68643c = null;
            this.f68641a = null;
            this.f68642b = 2;
        } else if (list.isEmpty()) {
            o13.p pVar2 = new o13.p(list, j0.f134944a);
            this.f68643c = null;
            this.f68641a = null;
            this.f68642b = 3;
        } else {
            zf0.d dVar = aVar2.f68640b;
            this.f68643c = jVar;
            this.f68641a = list;
            this.f68642b = 4;
            objB = dVar.b(100, null, this);
            if (objB != aVar) {
                v2Var = (v2) objB;
                if (v2Var instanceof v2.b) {
                    Iterable iterable2 = (Iterable) ((v2.b) v2Var).f47386a;
                    arrayList = new ArrayList();
                    while (r1.hasNext()) {
                        courseId = ((k) obj2).getCourseId();
                        if (courseId != null) {
                            jLongValue = courseId.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        if (jLongValue > 0) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = j0.f134944a;
                }
                o13.p pVar3 = new o13.p(list, arrayList);
                this.f68643c = null;
                this.f68641a = null;
                this.f68642b = 5;
            }
        }
        return aVar;
    }
}
