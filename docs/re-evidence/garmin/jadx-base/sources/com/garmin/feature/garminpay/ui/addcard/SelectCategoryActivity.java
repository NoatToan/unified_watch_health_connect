package com.garmin.feature.garminpay.ui.addcard;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.l;
import e23.p;
import lc.u0;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s0;
import r53.e2;
import v13.i;
import vb.h;
import zq2.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/ui/addcard/SelectCategoryActivity;", "Lhn2/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SelectCategoryActivity extends hn2.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f51799i = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f51800g = m.a(n.NONE, new e(this, null, null, null));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.garmin.feature.garminpay.ui.addcard.b f51801h = new com.garmin.feature.garminpay.ui.addcard.b(this, new j(this, 0), null, null, 12, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.addcard.SelectCategoryActivity$onCreate$1$1$1", f = "SelectCategoryActivity.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51803a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements p<DialogInterface, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SelectCategoryActivity f51805a;

            public a(SelectCategoryActivity selectCategoryActivity) {
                this.f51805a = selectCategoryActivity;
            }

            @Override // e23.p
            public final Unit invoke(DialogInterface dialogInterface, Integer num) {
                num.intValue();
                dialogInterface.getClass();
                this.f51805a.finish();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.addcard.SelectCategoryActivity$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1078b<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SelectCategoryActivity f51806a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectCategoryActivity f51807b;

            public C1078b(SelectCategoryActivity selectCategoryActivity, SelectCategoryActivity selectCategoryActivity2) {
                this.f51806a = selectCategoryActivity;
                this.f51807b = selectCategoryActivity2;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                yq2.c cVar = (yq2.c) obj;
                if (cVar instanceof yq2.c.a) {
                    com.garmin.feature.garminpay.ui.addcard.c.b(this.f51806a, (ar2.a.b) ((yq2.c.a) cVar).f198844a);
                } else {
                    if (!(cVar instanceof yq2.c.b)) {
                        u0.r();
                        return null;
                    }
                    ar2.b.InterfaceC0177b interfaceC0177b = (ar2.b.InterfaceC0177b) ((yq2.c.b) cVar).f198845a;
                    boolean z14 = interfaceC0177b instanceof ar2.b.InterfaceC0177b.a;
                    SelectCategoryActivity selectCategoryActivity = this.f51807b;
                    if (z14) {
                        ar2.b.InterfaceC0177b.a aVar = (ar2.b.InterfaceC0177b.a) interfaceC0177b;
                        selectCategoryActivity.f51801h.b(aVar.f12581a, aVar.f12582b, aVar.f12583c, aVar.f12584d);
                    } else {
                        if (!(interfaceC0177b instanceof ar2.b.InterfaceC0177b.C0178b)) {
                            u0.r();
                            return null;
                        }
                        br2.c cVar2 = br2.c.f19585a;
                        String string = selectCategoryActivity.getString(R.string.wallet_card_data_not_available);
                        string.getClass();
                        String string2 = selectCategoryActivity.getString(R.string.wallet_card_data_not_available_hint);
                        string2.getClass();
                        String string3 = selectCategoryActivity.getString(R.string.lbl_ok);
                        string3.getClass();
                        androidx.appcompat.app.e eVarQ = br2.c.q(cVar2, selectCategoryActivity, string, string2, new o13.p(string3, new a(selectCategoryActivity)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                        if (eVarQ != null) {
                            eVarQ.show();
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SelectCategoryActivity.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51803a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = SelectCategoryActivity.f51799i;
                SelectCategoryActivity selectCategoryActivity = SelectCategoryActivity.this;
                e2 e2Var = ((ar2.b) selectCategoryActivity.f51800g.getValue()).f12561b;
                C1078b c1078b = new C1078b(selectCategoryActivity, selectCategoryActivity);
                this.f51803a = 1;
                e2Var.getClass();
                if (e2.m(e2Var, c1078b, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
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
            super(0, obj, SelectCategoryActivity.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((SelectCategoryActivity) this.receiver).onBackPressed();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements l<qs2.e, Unit> {
        public d(Object obj) {
            super(1, obj, ar2.b.class, "onCategoryClicked", "onCategoryClicked(Lcom/garmin/garminpay/wallet/item/WalletItemCategory;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(qs2.e eVar) {
            qs2.e eVar2 = eVar;
            eVar2.getClass();
            ar2.b bVar = (ar2.b) this.receiver;
            bVar.getClass();
            ge1.b.T(v1.a(bVar), null, null, new ar2.c(bVar, eVar2, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<ar2.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f51808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f51809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f51810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f51811d;

        public e(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f51808a = gVar;
            this.f51809b = qualifier;
            this.f51810c = aVar;
            this.f51811d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, ar2.b] */
        @Override // e23.a
        public final ar2.b invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f51808a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f51810c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(ar2.b.class), viewModelStore, null, defaultViewModelCreationExtras, this.f51809b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f51811d, 4, null);
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.composable_container, hn2.c.a.NONE, null);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(-1567706463, true, new zq2.i(this, 0)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/addcard/SelectCategoryActivity$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.addcard.SelectCategoryActivity$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1077a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f51802a;

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
                f51802a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
