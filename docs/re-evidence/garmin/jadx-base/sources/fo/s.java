package fo;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListViewModel$onDeleteActivityConfirmed$2", f = "ActivitiesListViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f72437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f72438c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, a0 a0Var, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f72437b = rVar;
        this.f72438c = a0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f72437b, this.f72438c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        d0 d0Var;
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72436a;
        a0 a0Var = this.f72438c;
        r rVar = this.f72437b;
        a0 a0VarA = null;
        if (i14 == 0) {
            o13.r.b(obj);
            co.d dVar = rVar.f72417b;
            wo0.a aVar2 = a0Var.f72257a;
            this.f72436a = 1;
            Object objA = dVar.a(aVar2, this);
            if (objA == aVar) {
                return aVar;
            }
            obj2 = objA;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            obj2 = ((o13.q) obj).f128597a;
        }
        int i15 = o13.q.f128596b;
        if (obj2 instanceof o13.q.b) {
            d0Var = new d0(R.string.activity_delete_general_failure_message, null, 2, null);
        } else {
            a0VarA = a0.a(a0Var, false, 1);
            String str = a0Var.f72257a.f186416b;
            if (str == null) {
                str = "";
            }
            d0Var = new d0(R.string.activity_delete_activity_successfully, i53.a.a(str));
        }
        d0 d0Var2 = d0Var;
        a0 a0Var2 = a0VarA;
        p2 p2Var = rVar.f72420e;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, q.a((q) value, null, false, false, 0, false, null, null, d0Var2, a0Var2, null, null, 7423)));
        return Unit.INSTANCE;
    }
}
