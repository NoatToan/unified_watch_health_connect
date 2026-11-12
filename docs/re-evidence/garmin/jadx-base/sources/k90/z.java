package k90;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Ll90/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.GetCompatibleDevicesUseCase$getCompatibleDevices$2", f = "GetCompatibleDevicesUseCase.kt", l = {21, 23}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends l90.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f103618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f103619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f103620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f103621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f103622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f103623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f103624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a0 f103625h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f103625h = a0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(this.f103625h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends l90.b>> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:32:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7 A[LOOP:1: B:37:0x00c1->B:39:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r13 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r13 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007a -> B:24:0x007d). Please report as a decompilation issue!!! */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objB;
        int i14;
        Iterator it;
        Collection collection;
        int i15;
        a0 a0Var;
        ArrayList arrayList;
        Iterator it3;
        List list;
        Iterator it4;
        l90.b bVarA;
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f103624g;
        a0 a0Var2 = this.f103625h;
        ArrayList arrayList2 = null;
        if (i16 != 0) {
            if (i16 == 1) {
                o13.r.b(obj);
                objB = ((o13.q) obj).f128597a;
            } else {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i15 = this.f103623f;
                i14 = this.f103622e;
                next = this.f103621d;
                it = this.f103620c;
                collection = this.f103619b;
                a0Var = this.f103618a;
                o13.r.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                collection.add(next);
            }
            if (it.hasNext()) {
                next = it.next();
                w wVar = a0Var.f103430b;
                this.f103618a = a0Var;
                this.f103619b = collection;
                this.f103620c = it;
                this.f103621d = next;
                this.f103622e = i14;
                this.f103623f = i15;
                this.f103624g = 2;
                obj = wVar.a((z80.e) next);
            } else {
                list = (List) collection;
                if (list != null) {
                    arrayList2 = new ArrayList();
                    it4 = list.iterator();
                    while (it4.hasNext()) {
                        bVarA = a0Var2.f103432d.a((z80.e) it4.next());
                        if (bVarA != null) {
                            arrayList2.add(bVarA);
                        }
                    }
                }
            }
            if (arrayList2 != null) {
                pc0.i iVar = a0Var2.f103431c;
                arrayList = new ArrayList(p13.y.r(arrayList2, 10));
                it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((l90.b) it3.next()).f111522g);
                }
                iVar.b(p13.h0.g1(arrayList));
            }
            return arrayList2;
        }
        o13.r.b(obj);
        y80.n nVar = a0Var2.f103429a;
        this.f103624g = 1;
        objB = nVar.b(this);
        int i17 = o13.q.f128596b;
        if (objB instanceof o13.q.b) {
            objB = null;
        }
        List list2 = (List) objB;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList();
            i14 = 0;
            it = list2.iterator();
            collection = arrayList3;
            i15 = 0;
            a0Var = a0Var2;
            if (it.hasNext()) {
                next = it.next();
                w wVar2 = a0Var.f103430b;
                this.f103618a = a0Var;
                this.f103619b = collection;
                this.f103620c = it;
                this.f103621d = next;
                this.f103622e = i14;
                this.f103623f = i15;
                this.f103624g = 2;
                obj = wVar2.a((z80.e) next);
            } else {
                list = (List) collection;
                if (list != null) {
                    arrayList2 = new ArrayList();
                    it4 = list.iterator();
                    while (it4.hasNext()) {
                        bVarA = a0Var2.f103432d.a((z80.e) it4.next());
                        if (bVarA != null) {
                            arrayList2.add(bVarA);
                        }
                    }
                }
            }
        }
        if (arrayList2 != null) {
            pc0.i iVar2 = a0Var2.f103431c;
            arrayList = new ArrayList(p13.y.r(arrayList2, 10));
            it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList.add(((l90.b) it3.next()).f111522g);
            }
            iVar2.b(p13.h0.g1(arrayList));
        }
        return arrayList2;
    }
}
