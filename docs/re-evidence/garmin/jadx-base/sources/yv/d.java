package yv;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import bd0.s;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyv/d;", "Landroidx/lifecycle/u1;", "", "deviceUnitId", "", "hideUpToDate", "Luv/d;", "firmwareUpdateFetcher", "<init>", "(JZLuv/d;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f199819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f199820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uv.d f199821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f199822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f199823e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lyv/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.bikesensors.firmwareupdate.SensorSettingsViewModel$uiState$1", f = "SensorsFirmwareUpdateViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<r53.j<? super yv.a>, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super yv.a> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            d dVar = d.this;
            dVar.getClass();
            rd2.j jVar = rd2.f.a().f152045a;
            long j8 = dVar.f199819a;
            jVar.getClass();
            new s(j8, rd2.j.j(j8), new b(dVar)).a();
            return Unit.INSTANCE;
        }
    }

    public d(long j8, boolean z14, uv.d dVar) {
        dVar.getClass();
        this.f199819a = j8;
        this.f199820b = z14;
        this.f199821c = dVar;
        p2 p2VarA = q2.a(new yv.a(true, false, false, 0L, null, null, null, null, null, null, false, 2046, null));
        this.f199822d = p2VarA;
        v vVar = new v(new a(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f199823e = r53.s.K(vVar, aVarA, k2.a.f150705b, new yv.a(true, false, false, 0L, null, null, null, null, null, null, z14, 1022, null));
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        super.onCleared();
        this.f199821c.f172881b.k(new i(new yq.d(7)));
    }
}
