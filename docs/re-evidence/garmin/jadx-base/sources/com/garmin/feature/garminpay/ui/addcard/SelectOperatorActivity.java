package com.garmin.feature.garminpay.ui.addcard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import java.util.Comparator;
import lc.u0;
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
import yr2.k;
import yw2.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/ui/addcard/SelectOperatorActivity;", "Lhn2/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SelectOperatorActivity extends hn2.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f51812i = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f51813g = m.a(n.NONE, new g(this, null, null, null));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.garmin.feature.garminpay.ui.addcard.b f51814h = new com.garmin.feature.garminpay.ui.addcard.b(this, new h(this, 19), null, null, 12, null);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51815a;

        static {
            int[] iArr = new int[qs2.e.values().length];
            try {
                iArr[qs2.e.PAYMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qs2.e.TRANSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f51815a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.addcard.SelectOperatorActivity$onCreate$1$1$1", f = "SelectOperatorActivity.kt", l = {98}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51816a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SelectOperatorActivity f51818a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectOperatorActivity f51819b;

            public a(SelectOperatorActivity selectOperatorActivity, SelectOperatorActivity selectOperatorActivity2) {
                this.f51818a = selectOperatorActivity;
                this.f51819b = selectOperatorActivity2;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                yq2.c cVar = (yq2.c) obj;
                if (cVar instanceof yq2.c.a) {
                    com.garmin.feature.garminpay.ui.addcard.c.b(this.f51818a, (ar2.a.b) ((yq2.c.a) cVar).f198844a);
                } else {
                    if (!(cVar instanceof yq2.c.b)) {
                        u0.r();
                        return null;
                    }
                    ar2.e.b bVar = (ar2.e.b) ((yq2.c.b) cVar).f198845a;
                    boolean z14 = bVar instanceof ar2.e.b.C0179b;
                    SelectOperatorActivity selectOperatorActivity = this.f51819b;
                    if (z14) {
                        com.garmin.feature.garminpay.ui.addcard.b bVar2 = selectOperatorActivity.f51814h;
                        ar2.e.b.C0179b c0179b = (ar2.e.b.C0179b) bVar;
                        ns2.a<ms2.f> aVar = c0179b.f12595a;
                        long j8 = c0179b.f12596b;
                        String str = c0179b.f12597c;
                        bVar2.getClass();
                        try {
                            f.c<Intent> cVar2 = bVar2.f51843e;
                            SelectProductActivity.a aVar2 = SelectProductActivity.f51824i;
                            hn2.c cVar3 = bVar2.f51839a;
                            aVar2.getClass();
                            cVar3.getClass();
                            Intent intent = new Intent(cVar3, (Class<?>) SelectProductActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("extra.products", aVar);
                            bundle.putLong("device.unit.id", j8);
                            bundle.putString("device.name", str);
                            k.a(intent, bundle);
                            cVar2.a(intent, null);
                        } catch (Throwable th3) {
                            com.garmin.feature.garminpay.ui.addcard.b.f51838f.f51844a.a().warn("Failed to start SelectProductActivity", th3);
                            bVar2.f51840b.invoke(new com.garmin.feature.garminpay.ui.addcard.b.c.C1080b());
                        }
                    } else if (bVar instanceof ar2.e.b.a) {
                        ar2.e.b.a aVar3 = (ar2.e.b.a) bVar;
                        selectOperatorActivity.f51814h.a(aVar3.f12593a, aVar3.f12594b);
                    } else {
                        if (!(bVar instanceof ar2.e.b.c)) {
                            u0.r();
                            return null;
                        }
                        Toast.makeText(selectOperatorActivity.getBaseContext(), ((ar2.e.b.c) bVar).f12598a.concat(" is either Restricted or Incompatible."), 1).show();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SelectOperatorActivity.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51816a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = SelectOperatorActivity.f51812i;
                SelectOperatorActivity selectOperatorActivity = SelectOperatorActivity.this;
                e2 e2Var = ((ar2.e) selectOperatorActivity.f51813g.getValue()).f12561b;
                a aVar3 = new a(selectOperatorActivity, selectOperatorActivity);
                this.f51816a = 1;
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
    public static final /* synthetic */ class d extends q implements e23.a<Unit> {
        public d(Object obj) {
            super(0, obj, SelectOperatorActivity.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((SelectOperatorActivity) this.receiver).onBackPressed();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends q implements l<ms2.e, Unit> {
        public e(Object obj) {
            super(1, obj, ar2.e.class, "onOperatorClicked", "onOperatorClicked(Lcom/garmin/garminpay/serviceproviders/IOperator;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(ms2.e eVar) {
            ms2.e eVar2 = eVar;
            eVar2.getClass();
            ar2.e eVar3 = (ar2.e) this.receiver;
            eVar3.getClass();
            w9.a aVarA = v1.a(eVar3);
            x53.c cVar = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new ar2.f(eVar3, eVar2, null), 2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((ms2.e) t7).getF206686g()), Integer.valueOf(((ms2.e) t14).getF206686g()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<ar2.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f51820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f51821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f51822c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f51823d;

        public g(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f51820a = gVar;
            this.f51821b = qualifier;
            this.f51822c = aVar;
            this.f51823d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, ar2.e] */
        @Override // e23.a
        public final ar2.e invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f51820a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f51822c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(ar2.e.class), f189591b, null, defaultViewModelCreationExtras, this.f51821b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f51823d, 4, null);
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.composable_container, hn2.c.a.NONE, null);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(1608092117, true, new zq2.k(this, 0)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/addcard/SelectOperatorActivity$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, qs2.e eVar, ns2.a aVar, long j8, String str) {
            context.getClass();
            eVar.getClass();
            Intent intent = new Intent(context, (Class<?>) SelectOperatorActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra.category", eVar);
            bundle.putParcelable("extra.operators", aVar);
            bundle.putLong("device.unit.id", j8);
            bundle.putString("device.name", str);
            k.a(intent, bundle);
            return intent;
        }

        private a() {
        }
    }
}
