package zd0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "", "Lo53/i0;", "", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.PromosManager$createPromoMapFromPromos$7", f = "PromosProvider.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x0 extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends o53.i0<? extends Unit>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f204196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.e<String> f204197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f204198c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.domain.PromosManager$createPromoMapFromPromos$7$1$1", f = "PromosProvider.kt", l = {577}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f204199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u0 f204200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f204201c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u0 u0Var, String str, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f204200b = u0Var;
            this.f204201c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f204200b, this.f204201c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f204199a;
            if (i14 == 0) {
                o13.r.b(obj);
                z70.x xVar = this.f204200b.f204143b;
                this.f204199a = 1;
                if (xVar.d(this.f204201c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(i53.e<String> eVar, u0 u0Var, t13.d<? super x0> dVar) {
        super(2, dVar);
        this.f204197b = eVar;
        this.f204198c = u0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        x0 x0Var = new x0(this.f204197b, this.f204198c, dVar);
        x0Var.f204196a = obj;
        return x0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends o53.i0<? extends Unit>>> dVar) {
        return ((x0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f204196a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        i53.e<String> eVar = this.f204197b;
        ArrayList arrayList = new ArrayList(p13.y.r(eVar, 10));
        Iterator<String> it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(ge1.b.j(b0Var, null, null, new a(this.f204198c, it.next(), null), 3));
        }
        return arrayList;
    }
}
