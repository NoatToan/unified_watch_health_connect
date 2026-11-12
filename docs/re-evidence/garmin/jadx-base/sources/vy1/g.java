package vy1;

import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import e23.p;
import o13.r;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.addevent.TIFindEventFragment$searchAddressQuery$1", f = "TIFindEventFragment.kt", l = {294, 295}, m = "invokeSuspend", v = 2)
public final class g extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f180835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f180836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f180837c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, String str, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f180836b = eVar;
        this.f180837c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f180836b, this.f180837c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r6.j5(r5.f180837c) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f180835a;
        if (i14 == 0) {
            r.b(obj);
            this.f180835a = 1;
            if (m0.b(500L, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        e.a aVar2 = e.T;
        AddTIEventViewModel addTIEventViewModelC6 = this.f180836b.C6();
        this.f180835a = 2;
    }
}
