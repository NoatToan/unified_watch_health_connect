package fo1;

import com.garmin.android.apps.connectmobile.social.conversation.exception.InvalidResourceIdException;
import com.garmin.android.apps.connectmobile.social.conversation.exception.InvalidResourceTypeException;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lmo1/d;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$requestCreateConversation$2", f = "ConversationViewModel.kt", l = {1138}, m = "invokeSuspend", v = 2)
public final class p1 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends mo1.d>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ am.c2 f72712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f72713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f72714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(am.c2 c2Var, String str, o0 o0Var, t13.d<? super p1> dVar) {
        super(2, dVar);
        this.f72712b = c2Var;
        this.f72713c = str;
        this.f72714d = o0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p1(this.f72712b, this.f72713c, this.f72714d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends mo1.d>> dVar) {
        return ((p1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72711a;
        if (i14 == 0) {
            o13.r.b(obj);
            am.c2 c2Var = this.f72712b;
            if (c2Var == null) {
                return new v2.a(new InvalidResourceTypeException(c2Var), null, null, 6, null);
            }
            String str = this.f72713c;
            if (str == null) {
                return new v2.a(new InvalidResourceIdException(str), null, null, 6, null);
            }
            mo1.d dVar = new mo1.d(null, 0L, null, null, false, 0, 0, null, null, null, str, c2Var, null, 5119, null);
            f fVar = this.f72714d.f72674v;
            String strName = c2Var.name();
            this.f72711a = 1;
            fVar.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(fVar, new h(fVar, strName, this.f72713c, dVar, null), this);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objJ = obj;
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            return new v2.b(bVar.f47386a, bVar.f47387b, null, null, 12, null);
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        v2.a aVar2 = (v2.a) v2Var;
        return new v2.a(aVar2.f47383a, aVar2.f47384b, aVar2.f47385c);
    }
}
