package com.garmin.feature.garminpay.ui.devicesettings;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import aq2.k;
import as2.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import com.garmin.feature.garminpay.ui.devicesettings.LostWatchActivity;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.l;
import fo2.i0;
import fo2.l0;
import java.util.Arrays;
import java.util.List;
import kk1.h;
import l30.y0;
import lc.u0;
import lr2.o;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p13.h0;
import w3.x;
import w5.r;
import wr2.f;
import wr2.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/LostWatchActivity;", "Lhn2/c;", "Lcr2/a;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LostWatchActivity extends hn2.c implements cr2.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f52015j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f52016k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s03.a f52017g = new s03.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public mr2.d f52018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.garmin.feature.garminpay.ui.devicesettings.a f52019i;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f52021b;

        static {
            int[] iArr = new int[q.b.values().length];
            try {
                iArr[q.b.REMOVED_COMPLETELY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.b.REMOVED_PARTIALLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f52020a = iArr;
            int[] iArr2 = new int[is2.b.values().length];
            try {
                iArr2[is2.b.FELICA.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[is2.b.UNION_PAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[is2.b.PRELOAD_EASYCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[is2.b.PRELOAD_IPASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[is2.b.RABBIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[is2.b.FITPAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[is2.b.NXP.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            f52021b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/ui/devicesettings/LostWatchActivity$c", "Landroidx/lifecycle/x1$c;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements x1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f52022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f52023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f52024c;

        public c(long j8, String str, String str2) {
            this.f52022a = j8;
            this.f52023b = str;
            this.f52024c = str2;
        }

        @Override // androidx.lifecycle.x1.c
        public final <T extends u1> T create(Class<T> cls) {
            cls.getClass();
            return new mr2.c(this.f52022a, this.f52023b, this.f52024c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends p005kotlin.jvm.internal.q implements l<com.garmin.feature.garminpay.ui.devicesettings.a.d, Unit> {
        public d(Object obj) {
            super(1, obj, LostWatchActivity.class, "onAdapterItemClick", "onAdapterItemClick(Lcom/garmin/feature/garminpay/ui/devicesettings/DeviceDetailsAdapter$ItemClick;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(com.garmin.feature.garminpay.ui.devicesettings.a.d dVar) {
            fo2.d dVarG;
            String faqUrl;
            String productName;
            com.garmin.feature.garminpay.ui.devicesettings.a.d dVar2 = dVar;
            dVar2.getClass();
            LostWatchActivity lostWatchActivity = (LostWatchActivity) this.receiver;
            a aVar = LostWatchActivity.f52015j;
            lostWatchActivity.getClass();
            if (dVar2 instanceof com.garmin.feature.garminpay.ui.devicesettings.a.d.b) {
                com.garmin.feature.garminpay.ui.devicesettings.a.d.b bVar = (com.garmin.feature.garminpay.ui.devicesettings.a.d.b) dVar2;
                boolean z14 = bVar.f52097b;
                vr2.q qVar = bVar.f52096a;
                if (!z14) {
                    is2.b bVar2 = qVar.f179660g;
                    fs2.a aVar2 = qVar.f179658e;
                    switch (bVar2 == null ? -1 : b.f52021b[bVar2.ordinal()]) {
                        case -1:
                            LostWatchActivity.f52016k.debug("promptUserForInfo providerType is null");
                            break;
                        case 0:
                        default:
                            u0.r();
                            return null;
                        case 1:
                            String string = lostWatchActivity.getString(R.string.operator_suica);
                            string.getClass();
                            String string2 = lostWatchActivity.getString(R.string.wallet_suica_message_lost_device);
                            string2.getClass();
                            String string3 = lostWatchActivity.getString(R.string.wallet_call);
                            string3.getClass();
                            androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, lostWatchActivity, string, string2, new p(string3, new h(lostWatchActivity, 26)), new p(lostWatchActivity.getString(R.string.lbl_cancel), new o(5)), null, false, 224);
                            if (eVarQ != null) {
                                eVarQ.show();
                            }
                            break;
                        case 2:
                            String string4 = lostWatchActivity.getString(R.string.wallet_cup_card);
                            string4.getClass();
                            String string5 = lostWatchActivity.getString(R.string.wallet_contact_card_provider_message);
                            string5.getClass();
                            String string6 = lostWatchActivity.getString(R.string.lbl_ok);
                            string6.getClass();
                            androidx.appcompat.app.e eVarQ2 = br2.c.q(br2.c.f19585a, lostWatchActivity, string4, string5, new p(string6, new o(0)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                            if (eVarQ2 != null) {
                                eVarQ2.show();
                            }
                            break;
                        case 3:
                            lostWatchActivity.ca(R.string.operator_easycard, "https://support.garmin.com/zh-TW/?faq=u0gdsCWS221uTFkmvuW2h8");
                            break;
                        case 4:
                            lostWatchActivity.ca(R.string.operator_ipass, "https://support.garmin.com/zh-TW/?faq=u0gdsCWS221uTFkmvuW2h8");
                            break;
                        case 5:
                            oq2.b.f133301a.getClass();
                            String string7 = oq2.b.f133304d.toString();
                            string7.getClass();
                            lostWatchActivity.ca(R.string.operator_rabbit, string7);
                            break;
                        case 6:
                            if (!x.r(aVar2)) {
                                String str = aVar2.f73428c + " Card";
                                String string8 = lostWatchActivity.getString(R.string.wallet_contact_card_provider_message);
                                string8.getClass();
                                String string9 = lostWatchActivity.getString(R.string.lbl_ok);
                                string9.getClass();
                                androidx.appcompat.app.e eVarQ3 = br2.c.q(br2.c.f19585a, lostWatchActivity, str, string8, new p(string9, new o(2)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                                if (eVarQ3 != null) {
                                    eVarQ3.show();
                                }
                            } else {
                                g<l0, CurrencyValue> gVarA = k.a(aVar2);
                                i0<String, fo2.d> i0VarH = gVarA.e().h();
                                String str2 = "";
                                String str3 = (i0VarH == null || (productName = i0VarH.getProductName()) == null) ? "" : productName;
                                i0<String, fo2.d> i0VarH2 = gVarA.e().h();
                                if (i0VarH2 != null && (dVarG = i0VarH2.g()) != null && (faqUrl = dVarG.getFaqUrl()) != null) {
                                    str2 = faqUrl;
                                }
                                androidx.appcompat.app.e eVarQ4 = br2.c.q(br2.c.f19585a, lostWatchActivity, str3, r.v(R.string.wallet_refer_to_provider_faq, str3), new p(lostWatchActivity.getString(R.string.wallet_visit_faq), new lr2.p(lostWatchActivity, str2, 0)), new p(lostWatchActivity.getString(R.string.lbl_cancel), new o(1)), null, false, 224);
                                if (eVarQ4 != null) {
                                    eVarQ4.show();
                                }
                            }
                            break;
                        case 7:
                            break;
                    }
                } else {
                    String string10 = lostWatchActivity.getString(R.string.lbl_remove);
                    string10.getClass();
                    String string11 = lostWatchActivity.getString(R.string.lbl_cancel);
                    string11.getClass();
                    String string12 = lostWatchActivity.getString(R.string.wallet_remove_card);
                    string12.getClass();
                    x0 x0Var = x0.f105818a;
                    String string13 = lostWatchActivity.getString(R.string.wallet_remove_card_from_watch_confirmation);
                    string13.getClass();
                    String str4 = qVar.f179654a;
                    mr2.d dVar3 = lostWatchActivity.f52018h;
                    if (dVar3 == null) {
                        s.m("lostWatchViewModel");
                        throw null;
                    }
                    androidx.appcompat.app.e eVarQ5 = br2.c.q(br2.c.f19585a, lostWatchActivity, string12, String.format(string13, Arrays.copyOf(new Object[]{str4, dVar3.getDeviceName()}, 2)), new p(string10, new y0(11, lostWatchActivity, qVar)), new p(string11, new o(4)), null, false, 224);
                    if (eVarQ5 != null) {
                        eVarQ5.show();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f52025a;

        public e(l lVar) {
            lVar.getClass();
            this.f52025a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f52025a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52025a.invoke(obj);
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f52016k = gt2.b.f79005a.h("PAY#LostWatchActivity");
    }

    @Override // cr2.a
    public final void Q5(q.b bVar, String str, List<Long> list, List<String> list2) {
        bVar.getClass();
        int i14 = b.f52020a[bVar.ordinal()];
        if (i14 != 1 && i14 != 2) {
            br2.c.f19585a.b(this);
        } else if (str == null || list.isEmpty()) {
            f52016k.warn("Card removed with NO card name or no device unit id");
        } else {
            wr2.e.f186838m.m(new f.b(str, ((Number) h0.b0(list)).longValue(), bVar, list2));
        }
    }

    public final void ca(int i14, String str) {
        String string = getString(i14);
        string.getClass();
        String strV = r.v(R.string.wallet_refer_to_provider_faq, string);
        String string2 = getString(R.string.lbl_cancel);
        string2.getClass();
        String string3 = getString(R.string.wallet_visit_faq);
        string3.getClass();
        androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, this, string, strV, new p(string3, new lr2.p(this, str, 1)), new p(string2, new o(3)), null, false, 224);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.layout_swipe_refreshable_recycler_view, hn2.c.a.BACK, getString(R.string.lost_your_watch_title));
        long longExtra = getIntent().getLongExtra("device.unit.id", 0L);
        String stringExtra = getIntent().getStringExtra("device.image.url");
        String stringExtra2 = getIntent().getStringExtra("device.name");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        String str = stringExtra2;
        this.f52018h = (mr2.d) new ry2.d(this, new x1(this, new c(longExtra, stringExtra, str))).f155186a.a(mr2.d.class, mr2.c.class);
        this.f52019i = new com.garmin.feature.garminpay.ui.devicesettings.a(this, longExtra, str, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.generic_recycler_view);
        com.garmin.feature.garminpay.ui.devicesettings.a aVar = this.f52019i;
        if (aVar == null) {
            s.m("lostWatchAdapter");
            throw null;
        }
        recyclerView.setAdapter(aVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.generic_swipe_refresh_layout);
        mr2.d dVar = this.f52018h;
        if (dVar == null) {
            s.m("lostWatchViewModel");
            throw null;
        }
        dVar.isLoading().f(this, new e(new kp2.a(swipeRefreshLayout, 13)));
        mr2.d dVar2 = this.f52018h;
        if (dVar2 == null) {
            s.m("lostWatchViewModel");
            throw null;
        }
        final int i14 = 0;
        dVar2.n().f(this, new e(new l(this) { // from class: lr2.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LostWatchActivity f114430b;

            {
                this.f114430b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                LostWatchActivity lostWatchActivity = this.f114430b;
                switch (i15) {
                    case 0:
                        wr2.f fVar = (wr2.f) obj;
                        LostWatchActivity.a aVar2 = LostWatchActivity.f52015j;
                        wr2.g gVar = wr2.g.f186857a;
                        View viewFindViewById = lostWatchActivity.findViewById(R.id.content_frame);
                        viewFindViewById.getClass();
                        fVar.getClass();
                        gVar.getClass();
                        wr2.g.b(viewFindViewById, fVar);
                        return Unit.INSTANCE;
                    default:
                        mr2.b bVar = (mr2.b) obj;
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar3 = lostWatchActivity.f52019i;
                        if (aVar3 == null) {
                            p005kotlin.jvm.internal.s.m("lostWatchAdapter");
                            throw null;
                        }
                        mr2.d dVar3 = lostWatchActivity.f52018h;
                        if (dVar3 == null) {
                            p005kotlin.jvm.internal.s.m("lostWatchViewModel");
                            throw null;
                        }
                        br2.f fVarH4 = dVar3.h4();
                        int i16 = com.garmin.feature.garminpay.ui.devicesettings.a.f52062h;
                        com.garmin.feature.garminpay.ui.devicesettings.a.b bVarU = aVar3.u(bVar, fVarH4, null, null, false, null);
                        aVar3.f52068g = bVarU;
                        aVar3.t(bVarU.f52071c);
                        return Unit.INSTANCE;
                }
            }
        }));
        mr2.d dVar3 = this.f52018h;
        if (dVar3 == null) {
            s.m("lostWatchViewModel");
            throw null;
        }
        final int i15 = 1;
        dVar3.r4().f(this, new e(new l(this) { // from class: lr2.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LostWatchActivity f114430b;

            {
                this.f114430b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                LostWatchActivity lostWatchActivity = this.f114430b;
                switch (i16) {
                    case 0:
                        wr2.f fVar = (wr2.f) obj;
                        LostWatchActivity.a aVar2 = LostWatchActivity.f52015j;
                        wr2.g gVar = wr2.g.f186857a;
                        View viewFindViewById = lostWatchActivity.findViewById(R.id.content_frame);
                        viewFindViewById.getClass();
                        fVar.getClass();
                        gVar.getClass();
                        wr2.g.b(viewFindViewById, fVar);
                        return Unit.INSTANCE;
                    default:
                        mr2.b bVar = (mr2.b) obj;
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar3 = lostWatchActivity.f52019i;
                        if (aVar3 == null) {
                            p005kotlin.jvm.internal.s.m("lostWatchAdapter");
                            throw null;
                        }
                        mr2.d dVar4 = lostWatchActivity.f52018h;
                        if (dVar4 == null) {
                            p005kotlin.jvm.internal.s.m("lostWatchViewModel");
                            throw null;
                        }
                        br2.f fVarH4 = dVar4.h4();
                        int i17 = com.garmin.feature.garminpay.ui.devicesettings.a.f52062h;
                        com.garmin.feature.garminpay.ui.devicesettings.a.b bVarU = aVar3.u(bVar, fVarH4, null, null, false, null);
                        aVar3.f52068g = bVarU;
                        aVar3.t(bVarU.f52071c);
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f52017g.e();
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        mr2.d dVar = this.f52018h;
        if (dVar == null) {
            s.m("lostWatchViewModel");
            throw null;
        }
        dVar.V3(this);
        com.garmin.feature.garminpay.ui.devicesettings.a aVar = this.f52019i;
        if (aVar == null) {
            s.m("lostWatchAdapter");
            throw null;
        }
        this.f52017g.a(aVar.f52067f.d(new lp2.h(new d(this), 15), new lp2.h(new lq1.a(12), 16)));
    }

    @Override // hn2.c, i.c
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/LostWatchActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
