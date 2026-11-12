package gv0;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.livetrackui.data.exception.AddContactException;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.SelectContactMethodScreenKt$SelectContactMethodScreen$3$1", f = "SelectContactMethodScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f79275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f79276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f79277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3<g3<pu0.b>> f79278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f79279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f79280f;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79281a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f79281a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(d dVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, x3<g3<pu0.b>> x3Var, p1<Boolean> p1Var, p1<Boolean> p1Var2, t13.d<? super h0> dVar2) {
        super(2, dVar2);
        this.f79275a = dVar;
        this.f79276b = aVar;
        this.f79277c = aVar2;
        this.f79278d = x3Var;
        this.f79279e = p1Var;
        this.f79280f = p1Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f79275a, this.f79276b, this.f79277c, this.f79278d, this.f79279e, this.f79280f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        x3<g3<pu0.b>> x3Var = this.f79278d;
        int i14 = a.f79281a[x3Var.getF182175a().f35300a.ordinal()];
        e23.a<Unit> aVar2 = this.f79277c;
        d dVar = this.f79275a;
        if (i14 != 1) {
            if (i14 == 2) {
                Exception exc = x3Var.getF182175a().f35303d;
                if (exc instanceof AddContactException.LiveTrackEmailsLimitReached) {
                    dVar.B4();
                    this.f79279e.setValue(Boolean.TRUE);
                } else if (exc instanceof AddContactException.MaximumContactsReached) {
                    dVar.B4();
                    this.f79280f.setValue(Boolean.TRUE);
                } else {
                    dVar.B4();
                    aVar2.invoke();
                }
            }
        } else if (x3Var.getF182175a().f35301b != null) {
            dVar.B4();
            this.f79276b.invoke();
            aVar2.invoke();
        }
        return Unit.INSTANCE;
    }
}
