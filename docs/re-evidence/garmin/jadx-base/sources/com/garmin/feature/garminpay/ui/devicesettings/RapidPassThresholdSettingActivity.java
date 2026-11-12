package com.garmin.feature.garminpay.ui.devicesettings;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.j;
import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.garminpay.wallet.exception.ExpressCardSettingException;
import er2.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import lr2.n;
import o53.b0;
import o53.f0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.w;
import p13.x;
import v13.e;
import v13.i;
import vb.h;
import vr2.q;
import w5.r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/RapidPassThresholdSettingActivity;", "Lhn2/c;", "<init>", "()V", "c", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RapidPassThresholdSettingActivity extends hn2.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f52046j = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f52047k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qs2.a f52048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f52049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n f52050i;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/RapidPassThresholdSettingActivity$a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "", "selectableThresholdList", "Lhs2/c;", "expressCard", "Las2/a;", "balanceFormatter", "<init>", "(Landroid/content/Context;Ljava/util/List;Lhs2/c;Las2/a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.h<RecyclerView.f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f52051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hs2.c f52052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final as2.a f52053c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f52054d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f52055e;

        public a(Context context, List<Float> list, hs2.c cVar, as2.a aVar) {
            int iIntValue;
            context.getClass();
            list.getClass();
            cVar.getClass();
            aVar.getClass();
            this.f52051a = context;
            this.f52052b = cVar;
            this.f52053c = aVar;
            ArrayList arrayListC0 = h0.C0(w.c(Float.valueOf(Float.POSITIVE_INFINITY)), list);
            Float fValueOf = Float.valueOf(Float.NEGATIVE_INFINITY);
            ArrayList arrayListC1 = h0.C0(arrayListC0, w.c(fValueOf));
            this.f52054d = arrayListC1;
            if (Float.isNaN(cVar.f85443c)) {
                iIntValue = arrayListC1.indexOf(fValueOf);
            } else {
                Iterator it = arrayListC1.iterator();
                int i14 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i14 = -1;
                        break;
                    } else if (((Number) it.next()).floatValue() == this.f52052b.f85443c) {
                        break;
                    } else {
                        i14++;
                    }
                }
                Integer numValueOf = i14 == -1 ? null : Integer.valueOf(i14);
                iIntValue = numValueOf != null ? numValueOf.intValue() : this.f52054d.indexOf(fValueOf);
            }
            this.f52055e = iIntValue;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return this.f52054d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            f0Var.getClass();
            p pVar = f0Var instanceof p ? (p) f0Var : null;
            if (pVar != null) {
                TextView textView = pVar.f65107b;
                if (i14 == 0) {
                    textView.setText(R.string.wallet_balance_notification_always);
                } else {
                    ArrayList arrayList = this.f52054d;
                    if (i14 == arrayList.size() - 1) {
                        textView.setText(R.string.lbl_off);
                    } else {
                        textView.setText(r.v(R.string.wallet_balance_notification_under_price, this.f52053c.a((Number) arrayList.get(i14))));
                    }
                }
                boolean z14 = this.f52055e == i14;
                ImageView imageView = pVar.f65108c;
                if (z14) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(4);
                }
                pVar.f65106a.setOnClickListener(new cw2.b(11, new kp2.a(this, 14), pVar));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            View viewInflate = LayoutInflater.from(this.f52051a).inflate(R.layout.item_selectable_info_text, viewGroup, false);
            viewInflate.getClass();
            return new p(viewInflate);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/RapidPassThresholdSettingActivity$c;", "Landroidx/lifecycle/x1$c;", "<init>", "(Lcom/garmin/feature/garminpay/ui/devicesettings/RapidPassThresholdSettingActivity;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c implements x1.c {
        public c() {
        }

        @Override // androidx.lifecycle.x1.c
        public final <T extends u1> T create(Class<T> cls) {
            Parcelable parcelable;
            cls.getClass();
            if (!cls.equals(lr2.w.class)) {
                h.s(j.h(cls, "Unknown model class "));
                return null;
            }
            RapidPassThresholdSettingActivity rapidPassThresholdSettingActivity = RapidPassThresholdSettingActivity.this;
            long longExtra = rapidPassThresholdSettingActivity.getIntent().getLongExtra("com.garmin.android.apps.EXTRA_UNIT_ID", -1L);
            String stringExtra = rapidPassThresholdSettingActivity.getIntent().getStringExtra("extra.device.name");
            if (stringExtra == null) {
                stringExtra = "";
            }
            String str = stringExtra;
            Intent intent = rapidPassThresholdSettingActivity.getIntent();
            int i14 = Build.VERSION.SDK_INT;
            Parcelable parcelable2 = null;
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
            if (cVar == null) {
                h.s("Null expressCard");
                return null;
            }
            Intent intent2 = rapidPassThresholdSettingActivity.getIntent();
            if (i14 < 33) {
                Parcelable parcelableExtra2 = intent2 != null ? intent2.getParcelableExtra("extra.current.card.item") : null;
                parcelable2 = (q) (parcelableExtra2 instanceof q ? parcelableExtra2 : null);
            } else if (intent2 != null) {
                parcelable2 = (Parcelable) intent2.getParcelableExtra("extra.current.card.item", q.class);
            }
            return new lr2.w(longExtra, str, cVar, (q) parcelable2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.feature.garminpay.ui.devicesettings.RapidPassThresholdSettingActivity$onBackPressed$1", f = "RapidPassThresholdSettingActivity.kt", l = {150}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f52057a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.feature.garminpay.ui.devicesettings.RapidPassThresholdSettingActivity$onBackPressed$1$1", f = "RapidPassThresholdSettingActivity.kt", l = {SyslogConstants.LOG_LOCAL3}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f52059a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RapidPassThresholdSettingActivity f52060b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(RapidPassThresholdSettingActivity rapidPassThresholdSettingActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f52060b = rapidPassThresholdSettingActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f52060b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f52059a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    RapidPassThresholdSettingActivity rapidPassThresholdSettingActivity = this.f52060b;
                    a aVar2 = rapidPassThresholdSettingActivity.f52049h;
                    if (aVar2 == null) {
                        s.m("adapter");
                        throw null;
                    }
                    float fFloatValue = ((Number) aVar2.f52054d.get(aVar2.f52055e)).floatValue();
                    n nVar = rapidPassThresholdSettingActivity.f52050i;
                    if (nVar == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    if (fFloatValue != nVar.getExpressCard().f85443c) {
                        n nVar2 = rapidPassThresholdSettingActivity.f52050i;
                        if (nVar2 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        a aVar3 = rapidPassThresholdSettingActivity.f52049h;
                        if (aVar3 == null) {
                            s.m("adapter");
                            throw null;
                        }
                        float fFloatValue2 = ((Number) aVar3.f52054d.get(aVar3.f52055e)).floatValue();
                        this.f52059a = 1;
                        if (nVar2.L1(fFloatValue2, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f52061a;

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
                f52061a = iArr;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return RapidPassThresholdSettingActivity.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f52057a;
            final int i15 = 1;
            final RapidPassThresholdSettingActivity rapidPassThresholdSettingActivity = RapidPassThresholdSettingActivity.this;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    x53.c cVar = s0.f129406a;
                    x53.b bVar = x53.b.f189152a;
                    a aVar2 = new a(rapidPassThresholdSettingActivity, null);
                    this.f52057a = 1;
                    if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                rapidPassThresholdSettingActivity.finish();
            } catch (Throwable th3) {
                try {
                    RapidPassThresholdSettingActivity.f52047k.error("onBackPressed(), error=", (Throwable) th3);
                    if (th3 instanceof ExpressCardSettingException) {
                        int i16 = b.f52061a[th3.getType().ordinal()];
                        if (i16 != 1) {
                            final int i17 = 2;
                            if (i16 != 2) {
                                br2.c.f19585a.g(new e23.a() { // from class: lr2.v
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i17) {
                                            case 0:
                                                rapidPassThresholdSettingActivity.finish();
                                                break;
                                            case 1:
                                                rapidPassThresholdSettingActivity.finish();
                                                break;
                                            case 2:
                                                rapidPassThresholdSettingActivity.finish();
                                                break;
                                            default:
                                                rapidPassThresholdSettingActivity.finish();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, rapidPassThresholdSettingActivity);
                            } else {
                                br2.c cVar2 = br2.c.f19585a;
                                n nVar = rapidPassThresholdSettingActivity.f52050i;
                                if (nVar == null) {
                                    s.m("viewModel");
                                    throw null;
                                }
                                cVar2.e(rapidPassThresholdSettingActivity, nVar.getDeviceName(), new e23.a() { // from class: lr2.v
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i15) {
                                            case 0:
                                                rapidPassThresholdSettingActivity.finish();
                                                break;
                                            case 1:
                                                rapidPassThresholdSettingActivity.finish();
                                                break;
                                            case 2:
                                                rapidPassThresholdSettingActivity.finish();
                                                break;
                                            default:
                                                rapidPassThresholdSettingActivity.finish();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                        } else {
                            br2.c cVar3 = br2.c.f19585a;
                            n nVar2 = rapidPassThresholdSettingActivity.f52050i;
                            if (nVar2 == null) {
                                s.m("viewModel");
                                throw null;
                            }
                            final int i18 = 0;
                            cVar3.d(rapidPassThresholdSettingActivity, nVar2.getDeviceName(), new e23.a() { // from class: lr2.v
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            rapidPassThresholdSettingActivity.finish();
                                            break;
                                        case 1:
                                            rapidPassThresholdSettingActivity.finish();
                                            break;
                                        case 2:
                                            rapidPassThresholdSettingActivity.finish();
                                            break;
                                        default:
                                            rapidPassThresholdSettingActivity.finish();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                    } else if (th3 instanceof IllegalStateException) {
                        final int i19 = 3;
                        br2.c.f19585a.g(new e23.a() { // from class: lr2.v
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        rapidPassThresholdSettingActivity.finish();
                                        break;
                                    case 1:
                                        rapidPassThresholdSettingActivity.finish();
                                        break;
                                    case 2:
                                        rapidPassThresholdSettingActivity.finish();
                                        break;
                                    default:
                                        rapidPassThresholdSettingActivity.finish();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, rapidPassThresholdSettingActivity);
                    } else {
                        rapidPassThresholdSettingActivity.finish();
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th4) {
                    hn2.c.ba(rapidPassThresholdSettingActivity, Boolean.FALSE, null, null, 14);
                    throw th4;
                }
            }
            hn2.c.ba(rapidPassThresholdSettingActivity, Boolean.FALSE, null, null, 14);
            return Unit.INSTANCE;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f52047k = gt2.b.f79005a.h("PAY#ExTransThresSettingActivity");
    }

    @Override // hn2.c, b.g, android.app.Activity
    public final void onBackPressed() {
        gl.b.I(f0.w(this), null, new d(null), 3);
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        qs2.a aVar;
        List listK;
        super.onCreate(bundle);
        R9(R.layout.layout_felica_recycler_view, hn2.c.a.BACK, getString(R.string.wallet_balance_notification));
        n nVar = (n) new ry2.d(this, new x1(this, new c())).f155186a.a(n.class, lr2.w.class);
        this.f52050i = nVar;
        if (nVar == null) {
            s.m("viewModel");
            throw null;
        }
        q currentUserWalletCardItem = nVar.getCurrentUserWalletCardItem();
        if (currentUserWalletCardItem == null || (aVar = currentUserWalletCardItem.f179658e.f73428c) == null) {
            f52047k.error("Should find the businessOperator from deviceWalletItem, intent data error, finish the activity");
            finish();
            return;
        }
        this.f52048g = aVar;
        Float fValueOf = Float.valueOf(500.0f);
        switch (yr2.e.a.f199139a[aVar.ordinal()]) {
            case 1:
                listK = x.k(fValueOf, Float.valueOf(1000.0f), Float.valueOf(2000.0f));
                break;
            case 2:
            case 3:
            case 4:
                listK = x.k(Float.valueOf(100.0f), Float.valueOf(200.0f), fValueOf);
                break;
            case 5:
                listK = x.k(Float.valueOf(5.0f), Float.valueOf(10.0f), Float.valueOf(20.0f), Float.valueOf(50.0f));
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                o2.c.m("Not supported");
                return;
            case 17:
                o2.c.m("Not yet implemented");
                return;
            default:
                u0.r();
                return;
        }
        n nVar2 = this.f52050i;
        if (nVar2 == null) {
            s.m("viewModel");
            throw null;
        }
        hs2.c expressCard = nVar2.getExpressCard();
        qs2.a aVar2 = this.f52048g;
        if (aVar2 == null) {
            s.m("currentBusinessOperator");
            throw null;
        }
        a aVar3 = new a(this, listK, expressCard, yr2.e.a(aVar2));
        ((RecyclerView) findViewById(R.id.recycler_view)).setAdapter(aVar3);
        this.f52049h = aVar3;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/RapidPassThresholdSettingActivity$b;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "EXTRA_CURRENT_EXPRESS_CARD_ITEM", "Ljava/lang/String;", "EXTRA_DEVICE_EXPRESS_CARD", "EXTRA_DEVICE_NAME", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
