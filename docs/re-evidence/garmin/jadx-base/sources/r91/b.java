package r91;

import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.domain.usecase.AddManualPersonalRecordUseCase$saveManualPersonalRecord$1$1", f = "AddManualPersonalRecordUseCase.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f151366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q91.d f151367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l<n91.a, Unit> f151368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f151369e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar, q91.d dVar, l<? super n91.a, Unit> lVar, e23.a<Unit> aVar2, t13.d<? super b> dVar2) {
        super(2, dVar2);
        this.f151366b = aVar;
        this.f151367c = dVar;
        this.f151368d = lVar;
        this.f151369e = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f151366b, this.f151367c, this.f151368d, this.f151369e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        aa1.c value;
        Object objB;
        aa1.c value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151365a;
        a aVar2 = this.f151366b;
        if (i14 == 0) {
            r.b(obj);
            z1<aa1.c> z1Var = aVar2.f151362d;
            b2 b2Var = aVar2.f151363e;
            do {
                value = z1Var.getValue();
            } while (!z1Var.b(value, aa1.c.b(value, true, 0L, null, null, null, null, null, null, false, null, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE)));
            long millis = new DateTime(((aa1.c) b2Var.f150540a.getValue()).f2238f, DateTimeZone.getDefault()).plusMillis(DateTimeZone.getDefault().getOffset(((aa1.c) b2Var.f150540a.getValue()).f2238f)).getMillis();
            q91.d dVar = this.f151367c;
            long j8 = dVar.f143579a;
            Double d14 = ((aa1.c) b2Var.f150540a.getValue()).f2240h;
            n91.a aVar3 = new n91.a((Long) null, j8, (q91.c) null, (Long) null, (String) null, (String) null, (Long) null, (Long) null, a.a(d14 != null ? d14.doubleValue() : 0.0d, dVar.f143581c, ((aa1.c) b2Var.f150540a.getValue()).f2244l), new Long(((aa1.c) b2Var.f150540a.getValue()).f2238f), new Long(millis), (ps.z1) null, 2301, (p005kotlin.jvm.internal.j) null);
            o91.a aVar4 = aVar2.f151360b;
            this.f151365a = 1;
            objB = aVar4.b(aVar3, this);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objB = obj;
        }
        v2 v2Var = (v2) objB;
        z1<aa1.c> z1Var2 = aVar2.f151362d;
        do {
            value2 = z1Var2.getValue();
        } while (!z1Var2.b(value2, aa1.c.b(value2, false, 0L, null, null, null, null, null, null, false, null, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE)));
        if (v2Var instanceof v2.b) {
            this.f151368d.invoke(((v2.b) v2Var).f47386a);
        } else {
            this.f151369e.invoke();
        }
        return Unit.INSTANCE;
    }
}
