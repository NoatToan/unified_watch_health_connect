package mz1;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$getEventDetailFromDetailsEndpointUrl$1$1", f = "AddTIEventViewModel.kt", l = {3588, 3606}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg0.g f121810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fg0.o f121811e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121812a;

        static {
            int[] iArr = new int[fg0.h.values().length];
            try {
                iArr[fg0.h.GC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fg0.h.UNI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f121812a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AddTIEventViewModel addTIEventViewModel, fg0.g gVar, fg0.o oVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f121809c = addTIEventViewModel;
        this.f121810d = gVar;
        this.f121811e = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f121809c, this.f121810d, this.f121811e, dVar);
        kVar.f121808b = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (r12 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d4, code lost:
    
        if (r12 == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f121808b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121807a;
        AddTIEventViewModel addTIEventViewModel = this.f121809c;
        if (i14 == 0) {
            o13.r.b(obj);
            String[] strArr = AddTIEventViewModel.V2;
            addTIEventViewModel.v5().j(g3.a.c(g3.f35298f));
            fg0.g gVar = this.f121810d;
            int i15 = a.f121812a[gVar.getView().ordinal()];
            if (i15 == 1) {
                ig0.b bVarH4 = addTIEventViewModel.H4();
                String url = gVar.getUrl();
                this.f121808b = b0Var;
                this.f121807a = 1;
                bVarH4.getClass();
                obj = com.garmin.android.apps.connectmobile.f0.J(bVarH4, new ig0.d(bVarH4, url, null), this);
            } else {
                if (i15 != 2) {
                    lc.u0.r();
                    return null;
                }
                ig0.b bVarH5 = addTIEventViewModel.H4();
                String url2 = gVar.getUrl();
                this.f121808b = b0Var;
                this.f121807a = 2;
                bVarH5.getClass();
                obj = com.garmin.android.apps.connectmobile.f0.J(bVarH5, new ig0.e(bVarH5, url2, null), this);
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                String[] strArr2 = AddTIEventViewModel.V2;
                androidx.lifecycle.y0<g3<my1.b>> y0VarV5 = addTIEventViewModel.v5();
                g3.a aVar2 = g3.f35298f;
                my1.b.a aVar3 = new my1.b.a((fg0.k) ((v2.b) v2Var).f47386a, this.f121811e);
                aVar2.getClass();
                y0VarV5.j(g3.a.d(aVar3));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                String[] strArr3 = AddTIEventViewModel.V2;
                addTIEventViewModel.v5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Event Details Could not be retrieved. Exception: ");
                p92.y.f136664a.getClass();
                p92.y.a.c("AddTIEventViewModel", strD);
            }
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            v2 v2Var2 = (v2) obj;
            if (v2Var2 instanceof v2.b) {
                String[] strArr4 = AddTIEventViewModel.V2;
                androidx.lifecycle.y0<g3<my1.b>> y0VarV6 = addTIEventViewModel.v5();
                g3.a aVar4 = g3.f35298f;
                my1.b.C2302b c2302b = new my1.b.C2302b((fg0.o) ((v2.b) v2Var2).f47386a);
                aVar4.getClass();
                y0VarV6.j(g3.a.d(c2302b));
            } else {
                if (!(v2Var2 instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                String[] strArr5 = AddTIEventViewModel.V2;
                addTIEventViewModel.v5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Event Details Could not be retrieved. Exception: ");
                p92.y.f136664a.getClass();
                p92.y.a.c("AddTIEventViewModel", strD2);
            }
        }
        return Unit.INSTANCE;
    }
}
