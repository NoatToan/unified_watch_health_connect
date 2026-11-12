package au0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.liveactivity.LiveActivityRepositoryWrapper$registerCardDataHandler$1", f = "LiveActivityRepositoryWrapper.kt", l = {169}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf2.b f12850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f12851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jg2.a f12852d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z f12853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ jg2.a f12854b;

        public a(z zVar, jg2.a aVar) {
            this.f12853a = zVar;
            this.f12854b = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004e  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            Object value;
            boolean z14;
            sf2.a aVar = (sf2.a) obj;
            z zVar = this.f12853a;
            if (aVar != null) {
                i2.f36769a.getClass();
                i2.a.b(a2.SUBSCRIPTIONS, "LiveActivityRepositoryWrapper", "collect " + aVar);
                zVar.f13010i.k(null, aVar);
            }
            p2 p2Var = zVar.f13011j;
            p2 p2Var2 = zVar.f13012k;
            do {
                value = p2Var.getValue();
                ((Boolean) value).getClass();
                jg2.a aVar2 = this.f12854b;
                z14 = false;
                if (aVar2 instanceof jg2.a.C1897a) {
                    if (((jg2.a.C1897a) aVar2).f98730a == jg2.c.FULL && !(aVar instanceof sf2.a.C3001a)) {
                        if ((aVar instanceof sf2.a.b) || (aVar instanceof sf2.a.c)) {
                            z14 = true;
                        } else if (!(aVar instanceof sf2.a.d)) {
                            if (aVar instanceof sf2.a.e) {
                                if (((Boolean) p2Var2.getValue()).booleanValue() && ((sf2.a.e) aVar).f158888f) {
                                    z14 = true;
                                }
                            } else if (!(aVar instanceof sf2.a.f) && aVar != null) {
                                u0.r();
                                return null;
                            }
                        }
                    }
                } else if (!(aVar instanceof sf2.a.C3001a)) {
                    if ((aVar instanceof sf2.a.b) || (aVar instanceof sf2.a.c) || (aVar instanceof sf2.a.d)) {
                        z14 = true;
                    } else if (aVar instanceof sf2.a.e) {
                        if (((Boolean) p2Var2.getValue()).booleanValue() && ((sf2.a.e) aVar).f158888f) {
                            z14 = true;
                        }
                    } else if (!(aVar instanceof sf2.a.f) && aVar != null) {
                        u0.r();
                        return null;
                    }
                }
            } while (!p2Var.b(value, Boolean.valueOf(z14)));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(tf2.b bVar, z zVar, jg2.a aVar, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f12850b = bVar;
        this.f12851c = zVar;
        this.f12852d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f12850b, this.f12851c, this.f12852d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12849a;
        if (i14 == 0) {
            o13.r.b(obj);
            e2 e2Var = this.f12850b.f164468a;
            a aVar2 = new a(this.f12851c, this.f12852d);
            this.f12849a = 1;
            e2Var.getClass();
            if (e2.m(e2Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }
}
