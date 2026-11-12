package com.garmin.feature.garminpay.ui.devicesettings;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.j;
import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import androidx.recyclerview.widget.RecyclerView;
import br2.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.devicesettings.RapidPassSettingActivity;
import com.garmin.garminpay.wallet.exception.ExpressCardSettingException;
import e23.l;
import e23.p;
import er2.w;
import er2.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import k62.k;
import lr2.m;
import lr2.u;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.m0;
import p13.o0;
import v13.e;
import v13.i;
import vb.h;
import vr2.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/RapidPassSettingActivity;", "Lhn2/c;", "Lo53/b0;", "<init>", "()V", "c", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RapidPassSettingActivity extends hn2.c implements b0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f52026j = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f52027k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u53.d f52028g = c0.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f52029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m f52030i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/RapidPassSettingActivity$c;", "Landroidx/lifecycle/x1$c;", "<init>", "(Lcom/garmin/feature/garminpay/ui/devicesettings/RapidPassSettingActivity;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c implements x1.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f52038b = 0;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements Comparator {
            public a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                g gVar = ((q) t7).f179659f;
                gVar.getClass();
                int i14 = c.f52038b;
                c.this.getClass();
                g gVar2 = g.PAY_ENABLED;
                Integer numValueOf = Integer.valueOf(gVar == gVar2 ? 1 : 2);
                g gVar3 = ((q) t14).f179659f;
                gVar3.getClass();
                return r13.a.b(numValueOf, Integer.valueOf(gVar3 == gVar2 ? 1 : 2));
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.x1.c
        public final <T extends u1> T create(Class<T> cls) {
            Parcelable parcelable;
            cls.getClass();
            if (!cls.equals(u.class)) {
                h.s(j.h(cls, "Unknown model class "));
                return null;
            }
            RapidPassSettingActivity rapidPassSettingActivity = RapidPassSettingActivity.this;
            long longExtra = rapidPassSettingActivity.getIntent().getLongExtra("com.garmin.android.apps.EXTRA_UNIT_ID", -1L);
            String stringExtra = rapidPassSettingActivity.getIntent().getStringExtra("extra.device.name");
            if (stringExtra == null) {
                stringExtra = "";
            }
            String str = stringExtra;
            Intent intent = rapidPassSettingActivity.getIntent();
            int i14 = Build.VERSION.SDK_INT;
            Iterable parcelableArrayListExtra = null;
            if (i14 >= 33) {
                parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("extra.device.express.card", hs2.c.class) : null;
            } else {
                Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("extra.device.express.card") : null;
                if (!(parcelableExtra instanceof hs2.c)) {
                    parcelableExtra = null;
                }
                parcelable = (hs2.c) parcelableExtra;
            }
            hs2.c cVar = (hs2.c) parcelable;
            Intent intent2 = rapidPassSettingActivity.getIntent();
            if (i14 >= 33) {
                if (intent2 != null) {
                    parcelableArrayListExtra = intent2.getParcelableArrayListExtra("extra.device.cards", q.class);
                }
            } else if (intent2 != null) {
                parcelableArrayListExtra = intent2.getParcelableArrayListExtra("extra.device.cards");
            }
            if (parcelableArrayListExtra == null) {
                parcelableArrayListExtra = j0.f134944a;
            }
            return new u(longExtra, str, h0.N0(parcelableArrayListExtra, new a()), cVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.feature.garminpay.ui.devicesettings.RapidPassSettingActivity$onBackPressed$1", f = "RapidPassSettingActivity.kt", l = {219}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f52041a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.feature.garminpay.ui.devicesettings.RapidPassSettingActivity$onBackPressed$1$1", f = "RapidPassSettingActivity.kt", l = {222}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f52043a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RapidPassSettingActivity f52044b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(RapidPassSettingActivity rapidPassSettingActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f52044b = rapidPassSettingActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f52044b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f52043a;
                if (i14 == 0) {
                    r.b(obj);
                    RapidPassSettingActivity rapidPassSettingActivity = this.f52044b;
                    a aVar2 = rapidPassSettingActivity.f52029h;
                    if (aVar2 == null) {
                        s.m("adapter");
                        throw null;
                    }
                    q qVar = aVar2.f52036e;
                    byte[] bArrD = qVar != null ? qVar.d() : null;
                    m mVar = rapidPassSettingActivity.f52030i;
                    if (mVar == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    hs2.c cVarO3 = mVar.getCurrentRapidPass();
                    if (!Arrays.equals(bArrD, cVarO3 != null ? cVarO3.f85441a : null)) {
                        m mVar2 = rapidPassSettingActivity.f52030i;
                        if (mVar2 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        a aVar3 = rapidPassSettingActivity.f52029h;
                        if (aVar3 == null) {
                            s.m("adapter");
                            throw null;
                        }
                        q qVar2 = aVar3.f52036e;
                        this.f52043a = 1;
                        if (mVar2.p0(qVar2, this) == aVar) {
                            return aVar;
                        }
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

        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f52045a;

            static {
                int[] iArr = new int[ExpressCardSettingException.a.values().length];
                try {
                    iArr[ExpressCardSettingException.a.DEVICE_NOT_CONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ExpressCardSettingException.a.DEVICE_IS_BUSY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f52045a = iArr;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return RapidPassSettingActivity.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f52041a;
            final int i15 = 1;
            final RapidPassSettingActivity rapidPassSettingActivity = RapidPassSettingActivity.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    hn2.c.ba(rapidPassSettingActivity, Boolean.TRUE, null, null, 14);
                    x53.c cVar = s0.f129406a;
                    x53.b bVar = x53.b.f189152a;
                    a aVar2 = new a(rapidPassSettingActivity, null);
                    this.f52041a = 1;
                    if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                RapidPassSettingActivity.super.onBackPressed();
            } catch (Throwable th3) {
                try {
                    Logger logger = RapidPassSettingActivity.f52027k;
                    logger.error("onBackPressed(), error=", (Throwable) th3);
                    if (th3 instanceof ExpressCardSettingException) {
                        int i16 = b.f52045a[th3.getType().ordinal()];
                        if (i16 != 1) {
                            final int i17 = 2;
                            if (i16 != 2) {
                                br2.c.f19585a.g(new e23.a() { // from class: lr2.t
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i17) {
                                            case 0:
                                                super/*hn2.c*/.onBackPressed();
                                                break;
                                            case 1:
                                                super/*hn2.c*/.onBackPressed();
                                                break;
                                            case 2:
                                                super/*hn2.c*/.onBackPressed();
                                                break;
                                            default:
                                                super/*hn2.c*/.onBackPressed();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, rapidPassSettingActivity);
                            } else {
                                br2.c cVar2 = br2.c.f19585a;
                                m mVar = rapidPassSettingActivity.f52030i;
                                if (mVar == null) {
                                    s.m("viewModel");
                                    throw null;
                                }
                                cVar2.e(rapidPassSettingActivity, mVar.getDeviceName(), new e23.a() { // from class: lr2.t
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i15) {
                                            case 0:
                                                super/*hn2.c*/.onBackPressed();
                                                break;
                                            case 1:
                                                super/*hn2.c*/.onBackPressed();
                                                break;
                                            case 2:
                                                super/*hn2.c*/.onBackPressed();
                                                break;
                                            default:
                                                super/*hn2.c*/.onBackPressed();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                        } else {
                            br2.c cVar3 = br2.c.f19585a;
                            m mVar2 = rapidPassSettingActivity.f52030i;
                            if (mVar2 == null) {
                                s.m("viewModel");
                                throw null;
                            }
                            final int i18 = 0;
                            cVar3.d(rapidPassSettingActivity, mVar2.getDeviceName(), new e23.a() { // from class: lr2.t
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            super/*hn2.c*/.onBackPressed();
                                            break;
                                        case 1:
                                            super/*hn2.c*/.onBackPressed();
                                            break;
                                        case 2:
                                            super/*hn2.c*/.onBackPressed();
                                            break;
                                        default:
                                            super/*hn2.c*/.onBackPressed();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                    } else if (th3 instanceof IllegalStateException) {
                        logger.error("onBackPressed(), Something goes wrong.", (Throwable) th3);
                        final int i19 = 3;
                        br2.c.f19585a.g(new e23.a() { // from class: lr2.t
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        super/*hn2.c*/.onBackPressed();
                                        break;
                                    case 1:
                                        super/*hn2.c*/.onBackPressed();
                                        break;
                                    case 2:
                                        super/*hn2.c*/.onBackPressed();
                                        break;
                                    default:
                                        super/*hn2.c*/.onBackPressed();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, rapidPassSettingActivity);
                    } else {
                        RapidPassSettingActivity.super.onBackPressed();
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th4) {
                    hn2.c.ba(rapidPassSettingActivity, Boolean.FALSE, null, null, 14);
                    throw th4;
                }
            }
            hn2.c.ba(rapidPassSettingActivity, Boolean.FALSE, null, null, 14);
            return Unit.INSTANCE;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f52027k = gt2.b.f79005a.h("PAY#ExTransSettingActivity");
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        return this.f52028g.f168725a;
    }

    @Override // hn2.c, b.g, android.app.Activity
    public final void onBackPressed() {
        ge1.b.T(this, null, null, new d(null), 3);
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.layout_felica_recycler_view, hn2.c.a.BACK, getString(R.string.wallet_rapid_pass_card));
        this.f52030i = (m) new ry2.d(this, new x1(this, new c())).f155186a.a(m.class, u.class);
        m mVar = this.f52030i;
        if (mVar == null) {
            s.m("viewModel");
            throw null;
        }
        List<q> listR2 = mVar.r2();
        m mVar2 = this.f52030i;
        if (mVar2 == null) {
            s.m("viewModel");
            throw null;
        }
        a aVar = new a(this, listR2, mVar2.getCurrentRapidPass());
        ((RecyclerView) findViewById(R.id.recycler_view)).setAdapter(aVar);
        this.f52029h = aVar;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\rB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/RapidPassSettingActivity$a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lvq2/b;", "Lhn2/c;", "activity", "", "Lvr2/q;", "cardList", "Lhs2/c;", "expressCard", "<init>", "(Lhn2/c;Ljava/util/List;Lhs2/c;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.h<RecyclerView.f0> implements vq2.b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f52031f = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hn2.c f52032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<q> f52033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final hs2.c f52034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f52035d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public q f52036e;

        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f52037a;

            static {
                int[] iArr = new int[g.values().length];
                try {
                    iArr[g.PAY_ENABLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f52037a = iArr;
            }
        }

        static {
            new C1090a(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(hn2.c cVar, List<q> list, hs2.c cVar2) {
            Object next;
            cVar.getClass();
            list.getClass();
            this.f52032a = cVar;
            this.f52033b = list;
            this.f52034c = cVar2;
            if (cVar2 == null) {
                this.f52035d = list.size();
                this.f52036e = null;
                return;
            }
            Iterator it = h0.j1(list).iterator();
            while (true) {
                o0 o0Var = (o0) it;
                if (!o0Var.f134956a.hasNext()) {
                    next = null;
                    break;
                }
                next = o0Var.next();
                m0 m0Var = (m0) next;
                if (Arrays.equals(((q) m0Var.f134952b).d(), this.f52034c.f85441a) && ((q) m0Var.f134952b).f179659f == g.PAY_ENABLED) {
                    break;
                }
            }
            m0 m0Var2 = (m0) next;
            if (m0Var2 == null) {
                RapidPassSettingActivity.f52027k.error("The current express card {" + this.f52034c + "} is not in the card list [" + this.f52033b + "]!");
            }
            this.f52035d = m0Var2 != null ? m0Var2.f134951a : this.f52033b.size();
            this.f52036e = m0Var2 != null ? (q) m0Var2.f134952b : null;
        }

        @Override // vq2.d, vq2.c
        /* JADX INFO: renamed from: M, reason: from getter */
        public final hn2.c getF52032a() {
            return this.f52032a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return this.f52033b.size() + 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemViewType(int i14) {
            List<q> list = this.f52033b;
            if (i14 == list.size()) {
                return 0;
            }
            return i14 == list.size() + 1 ? 2 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            f0Var.getClass();
            int itemViewType = getItemViewType(i14);
            List<q> list = this.f52033b;
            if (itemViewType != 1) {
                if (itemViewType == 2) {
                    x xVar = f0Var instanceof x ? (x) f0Var : null;
                    if (xVar != null) {
                        xVar.f65135b.setText(this.f52032a.getString(R.string.wallet_rapid_pass_card_hint));
                        return;
                    }
                    return;
                }
                er2.p pVar = f0Var instanceof er2.p ? (er2.p) f0Var : null;
                if (pVar != null) {
                    pVar.f65107b.setText(w5.r.u(R.string.lbl_none));
                    boolean z14 = this.f52035d == list.size();
                    ImageView imageView = pVar.f65108c;
                    if (z14) {
                        imageView.setVisibility(0);
                    } else {
                        imageView.setVisibility(4);
                    }
                    final int i15 = 1;
                    pVar.f65106a.setOnClickListener(new cw2.b(11, new l(this) { // from class: lr2.r

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ RapidPassSettingActivity.a f114432b;

                        {
                            this.f114432b = this;
                        }

                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            int i16 = i15;
                            int iIntValue = ((Integer) obj).intValue();
                            switch (i16) {
                                case 0:
                                    RapidPassSettingActivity.a aVar = this.f114432b;
                                    if (aVar.f52035d != iIntValue) {
                                        aVar.f52035d = iIntValue;
                                        aVar.f52036e = aVar.f52033b.get(iIntValue);
                                        aVar.notifyDataSetChanged();
                                    }
                                    break;
                                default:
                                    RapidPassSettingActivity.a aVar2 = this.f114432b;
                                    if (aVar2.f52035d != iIntValue) {
                                        aVar2.f52035d = iIntValue;
                                        aVar2.f52036e = null;
                                        aVar2.notifyDataSetChanged();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, pVar));
                    return;
                }
                return;
            }
            w wVar = f0Var instanceof w ? (w) f0Var : null;
            if (wVar != null) {
                ImageView imageView2 = wVar.f65133d;
                View view2 = wVar.f65130a;
                q qVar = list.get(i14);
                is2.b bVar = qVar.f179660g;
                yq2.b bVarA = bVar != null ? yr2.m.a(bVar) : null;
                if (bVarA != null) {
                    bVarA.e(wVar.f65131b, qVar, 10);
                }
                wVar.f65132c.setText(qVar.f179654a);
                g gVar = qVar.f179659f;
                if ((gVar == null ? -1 : b.f52037a[gVar.ordinal()]) != 1) {
                    imageView2.setVisibility(4);
                    imageView2.setVisibility(0);
                    imageView2.setImageResource(R.drawable.about);
                    view2.setEnabled(false);
                    view2.setOnClickListener(new cw2.b(12, new k(bVarA, 28, qVar, this), wVar));
                    return;
                }
                imageView2.setVisibility(4);
                view2.setEnabled(true);
                if (this.f52035d == i14) {
                    imageView2.setVisibility(0);
                    imageView2.setImageResource(R.drawable.check);
                } else {
                    imageView2.setVisibility(4);
                }
                final int i16 = 0;
                view2.setOnClickListener(new cw2.b(12, new l(this) { // from class: lr2.r

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ RapidPassSettingActivity.a f114432b;

                    {
                        this.f114432b = this;
                    }

                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i17 = i16;
                        int iIntValue = ((Integer) obj).intValue();
                        switch (i17) {
                            case 0:
                                RapidPassSettingActivity.a aVar = this.f114432b;
                                if (aVar.f52035d != iIntValue) {
                                    aVar.f52035d = iIntValue;
                                    aVar.f52036e = aVar.f52033b.get(iIntValue);
                                    aVar.notifyDataSetChanged();
                                }
                                break;
                            default:
                                RapidPassSettingActivity.a aVar2 = this.f114432b;
                                if (aVar2.f52035d != iIntValue) {
                                    aVar2.f52035d = iIntValue;
                                    aVar2.f52036e = null;
                                    aVar2.notifyDataSetChanged();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, wVar));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            hn2.c cVar = this.f52032a;
            if (i14 == 1) {
                View viewInflate = LayoutInflater.from(cVar).inflate(R.layout.item_selectable_card_with_status, viewGroup, false);
                viewInflate.getClass();
                return new w(viewInflate);
            }
            if (i14 != 2) {
                View viewInflate2 = LayoutInflater.from(cVar).inflate(R.layout.item_selectable_info_text, viewGroup, false);
                viewInflate2.getClass();
                return new er2.p(viewInflate2);
            }
            View viewInflate3 = LayoutInflater.from(cVar).inflate(R.layout.item_subtext, viewGroup, false);
            viewInflate3.getClass();
            return new x(viewInflate3);
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.devicesettings.RapidPassSettingActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/RapidPassSettingActivity$a$a;", "", "<init>", "()V", "", "TYPE_NONE", "I", "TYPE_CARD_ITEM", "TYPE_SUBTEXT", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1090a {
            public /* synthetic */ C1090a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C1090a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/RapidPassSettingActivity$b;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "EXTRA_DEVICE_CARDS", "Ljava/lang/String;", "EXTRA_DEVICE_EXPRESS_CARD", "EXTRA_DEVICE_NAME", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, long j8, ArrayList arrayList, hs2.c cVar, String str) {
            context.getClass();
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) RapidPassSettingActivity.class);
            intent.putExtra("com.garmin.android.apps.EXTRA_UNIT_ID", j8);
            intent.putParcelableArrayListExtra("extra.device.cards", arrayList);
            intent.putExtra("extra.device.express.card", cVar);
            intent.putExtra("extra.device.name", str);
            return intent;
        }

        private b() {
        }
    }
}
