package com.garmin.feature.garminpay.ui.addcard;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import ar2.g;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import lc.u0;
import ms2.f;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import r53.e2;
import r53.j;
import v13.i;
import yw2.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/ui/addcard/SelectProductActivity;", "Lhn2/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SelectProductActivity extends hn2.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f51824i = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f51825g = m.a(n.NONE, new e(this, null, null, null));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.garmin.feature.garminpay.ui.addcard.b f51826h = new com.garmin.feature.garminpay.ui.addcard.b(this, new h(this, 20), null, null, 12, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.addcard.SelectProductActivity$onCreate$1$1$1", f = "SelectProductActivity.kt", l = {81}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51827a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SelectProductActivity f51829a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectProductActivity f51830b;

            public a(SelectProductActivity selectProductActivity, SelectProductActivity selectProductActivity2) {
                this.f51829a = selectProductActivity;
                this.f51830b = selectProductActivity2;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                yq2.c cVar = (yq2.c) obj;
                if (cVar instanceof yq2.c.a) {
                    com.garmin.feature.garminpay.ui.addcard.c.b(this.f51829a, (ar2.a.b) ((yq2.c.a) cVar).f198844a);
                } else {
                    if (!(cVar instanceof yq2.c.b)) {
                        u0.r();
                        return null;
                    }
                    g.b bVar = (g.b) ((yq2.c.b) cVar).f198845a;
                    if (!(bVar instanceof g.b.a)) {
                        u0.r();
                        return null;
                    }
                    g.b.a aVar = (g.b.a) bVar;
                    this.f51830b.f51826h.a(aVar.f12608a, aVar.f12609b);
                }
                return Unit.INSTANCE;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SelectProductActivity.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51827a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = SelectProductActivity.f51824i;
                SelectProductActivity selectProductActivity = SelectProductActivity.this;
                e2 e2Var = ((g) selectProductActivity.f51825g.getValue()).f12561b;
                a aVar3 = new a(selectProductActivity, selectProductActivity);
                this.f51827a = 1;
                e2Var.getClass();
                if (e2.m(e2Var, aVar3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements e23.a<Unit> {
        public c(Object obj) {
            super(0, obj, SelectProductActivity.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((SelectProductActivity) this.receiver).onBackPressed();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements l<f, Unit> {
        public d(Object obj) {
            super(1, obj, g.class, "onProductClicked", "onProductClicked(Lcom/garmin/garminpay/serviceproviders/IProduct;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(f fVar) {
            f fVar2 = fVar;
            fVar2.getClass();
            g gVar = (g) this.receiver;
            gVar.getClass();
            w9.a aVarA = v1.a(gVar);
            x53.c cVar = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new ar2.h(gVar, fVar2, null), 2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f51831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f51832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f51833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f51834d;

        public e(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f51831a = gVar;
            this.f51832b = qualifier;
            this.f51833c = aVar;
            this.f51834d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, ar2.g] */
        @Override // e23.a
        public final g invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f51831a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f51833c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(g.class), f189591b, null, defaultViewModelCreationExtras, this.f51832b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f51834d, 4, null);
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.composable_container, hn2.c.a.NONE, null);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(-1900031421, true, new zq2.l(this, 0)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/addcard/SelectProductActivity$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
