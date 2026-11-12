package r70;

import androidx.lifecycle.h1;
import androidx.lifecycle.n0;
import com.garmin.android.apps.connectmobile.R;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardDeviceFragment$setDevice$1", f = "DashboardDeviceFragment.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f151089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f151090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.a f151091d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardDeviceFragment$setDevice$1$1", f = "DashboardDeviceFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f151092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Long f151093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.a f151094c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, Long l14, com.garmin.android.apps.connectmobile.devices.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f151092a = pVar;
            this.f151093b = l14;
            this.f151094c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f151092a, this.f151093b, this.f151094c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p pVar = this.f151092a;
            androidx.fragment.app.v childFragmentManager = pVar.getChildFragmentManager();
            childFragmentManager.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(childFragmentManager);
            aVar2.l(R.id.fragment_container_view, ((n70.g) pVar.f151095a.getValue()).f(this.f151093b, this.f151094c), null);
            aVar2.e();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Long l14, com.garmin.android.apps.connectmobile.devices.a aVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f151089b = pVar;
        this.f151090c = l14;
        this.f151091d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f151089b, this.f151090c, this.f151091d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151088a;
        if (i14 == 0) {
            o13.r.b(obj);
            p pVar = this.f151089b;
            n0 viewLifecycleOwner = pVar.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
            a aVar2 = new a(pVar, this.f151090c, this.f151091d, null);
            this.f151088a = 1;
            if (h1.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
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
