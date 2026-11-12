package fo1;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lmo1/d;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationRepoViewModelDelegateImp$getConversation$1", f = "ConversationRepoViewModelDelegateImp.kt", l = {82, 93}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.p<androidx.lifecycle.t0<v2<? extends mo1.d>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f72525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f72526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f72527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f72528e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lmo1/d;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationRepoViewModelDelegateImp$getConversation$1$conversationResult$1", f = "ConversationRepoViewModelDelegateImp.kt", l = {83}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends mo1.d>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f72529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l0 f72530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f72531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f72532d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0 l0Var, String str, String str2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f72530b = l0Var;
            this.f72531c = str;
            this.f72532d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f72530b, this.f72531c, this.f72532d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends mo1.d>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f72529a;
            if (i14 == 0) {
                o13.r.b(obj);
                f fVar = this.f72530b.f72618a;
                this.f72529a = 1;
                obj = fVar.a(this.f72531c, this.f72532d, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                v2.b bVar = (v2.b) v2Var;
                mo1.d dVar = (mo1.d) bVar.f47386a;
                if (dVar.getUuid() == null) {
                    dVar = null;
                }
                return new v2.b(dVar, bVar.f47387b, null, null, 12, null);
            }
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            v2.a aVar2 = (v2.a) v2Var;
            return new v2.a(aVar2.f47383a, aVar2.f47384b, aVar2.f47385c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(l0 l0Var, String str, String str2, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f72526c = l0Var;
        this.f72527d = str;
        this.f72528e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f0 f0Var = new f0(this.f72526c, this.f72527d, this.f72528e, dVar);
        f0Var.f72525b = obj;
        return f0Var;
    }

    @Override // e23.p
    public final Object invoke(androidx.lifecycle.t0<v2<? extends mo1.d>> t0Var, t13.d<? super Unit> dVar) {
        return ((f0) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r0.emit((com.garmin.android.apps.connectmobile.v2) r10, r9) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) this.f72525b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72524a;
        if (i14 != 0) {
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
        }
        o13.r.b(obj);
        x53.c cVar = o53.s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        a aVar2 = new a(this.f72526c, this.f72527d, this.f72528e, null);
        this.f72525b = t0Var;
        this.f72524a = 1;
        obj = ge1.b.e0(bVar, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f72525b = null;
        this.f72524a = 2;
    }
}
