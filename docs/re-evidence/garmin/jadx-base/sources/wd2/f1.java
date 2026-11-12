package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService$updateStravaBeaconStatus$1", f = "LivetrackService.kt", l = {354, 355}, m = "invokeSuspend", v = 2)
public final class f1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f184459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f184461c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(LivetrackService livetrackService, boolean z14, t13.d<? super f1> dVar) {
        super(2, dVar);
        this.f184460b = livetrackService;
        this.f184461c = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f1(this.f184460b, this.f184461c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        if (r9 == r0) goto L30;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184459a;
        LivetrackService livetrackService = this.f184460b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f184459a = 1;
            int i15 = LivetrackService.f50160k;
            if (livetrackService.d(this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        de2.a aVar2 = livetrackService.f50165e;
        if (aVar2 == null) {
            p005kotlin.jvm.internal.s.m("deviceManager");
            throw null;
        }
        this.f184459a = 2;
        ArrayList arrayListE = da2.d.c(aVar2.f59231d).f58886a.f111646e.e();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : arrayListE) {
            if (aVar2.f59228a.e(((DeviceProfile) obj2).getF92746j())) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((DeviceProfile) it.next()).getF92746j()));
        }
        Object objU = aVar2.u(arrayList2, this.f184461c, this);
        if (objU != u13.a.COROUTINE_SUSPENDED) {
            objU = Unit.INSTANCE;
        }
    }
}
