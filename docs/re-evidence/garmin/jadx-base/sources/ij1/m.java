package ij1;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.PrimaryDeviceViewModel$handleRegisteredDevices$3", f = "PrimaryDeviceViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_AIT}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f93876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f93877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f93878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0<gj1.b> f93879d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g gVar, Long l14, r0<gj1.b> r0Var, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f93877b = gVar;
        this.f93878c = l14;
        this.f93879d = r0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f93877b, this.f93878c, this.f93879d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        m mVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f93876a;
        if (i14 == 0) {
            o13.r.b(obj);
            long jLongValue = this.f93878c.longValue();
            gj1.b bVar = this.f93879d.f105810a;
            this.f93876a = 1;
            mVar = this;
            obj = g.x4(this.f93877b, jLongValue, false, bVar, mVar);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            mVar = this;
        }
        gj1.h hVar = (gj1.h) obj;
        if (hVar == null) {
            return null;
        }
        mVar.f93877b.getClass();
        return g.B4(hVar);
    }
}
