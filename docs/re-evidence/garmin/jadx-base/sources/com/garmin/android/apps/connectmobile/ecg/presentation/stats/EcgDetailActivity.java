package com.garmin.android.apps.connectmobile.ecg.presentation.stats;

import am.j;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import b.g;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgDetailActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.github.mikephil.charting.charts.LineChart;
import fw.p;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kd0.m;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.x;
import p13.y;
import pf0.l;
import pf0.q;
import pf0.r;
import pf0.s;
import r22.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/EcgDetailActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EcgDetailActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f34869p = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f34871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gf0.a f34872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public gf0.d f34873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f34874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f34875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f34876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f34877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f34878i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f34879j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f34880k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ComposeView f34881l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public qf0.a f34882m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f34870a = new w1(s0.f105811a.b(r.class), new d(this), new c(this), new e(null, this));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f34883n = new b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f f34884o = new f();

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/garmin/android/apps/connectmobile/ecg/presentation/stats/EcgDetailActivity$b", "Le32/e;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends e32.e<g3<? extends Unit>> {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f34886a;

            static {
                int[] iArr = new int[p.values().length];
                try {
                    iArr[p.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p.LOADING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f34886a = iArr;
            }
        }

        public b() {
        }

        @Override // e32.e
        public final void a(g3<? extends Unit> g3Var) {
            int i14 = a.f34886a[g3Var.f35300a.ordinal()];
            EcgDetailActivity ecgDetailActivity = EcgDetailActivity.this;
            if (i14 != 1) {
                if (i14 == 2) {
                    ecgDetailActivity.showProgressOverlay();
                    return;
                } else {
                    if (i14 != 3) {
                        u0.r();
                        return;
                    }
                    ecgDetailActivity.hideProgressOverlay();
                    a aVar = EcgDetailActivity.f34869p;
                    ecgDetailActivity.displayFailedMessage();
                    return;
                }
            }
            ecgDetailActivity.hideProgressOverlay();
            a aVar2 = EcgDetailActivity.f34869p;
            Intent intent = new Intent();
            gf0.a aVar3 = ecgDetailActivity.f34872c;
            if (aVar3 == null) {
                p005kotlin.jvm.internal.s.m("ecgActivity");
                throw null;
            }
            Intent intentPutExtra = intent.putExtra("ACTIVITY_ID_EXTRA", aVar3.getDetailId());
            intentPutExtra.getClass();
            ecgDetailActivity.setResult(-1, intentPutExtra);
            bv.b.f21239a.getClass();
            ((m) bv.b.a()).p();
            ecgDetailActivity.finish();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f34887a;

        public c(g gVar) {
            this.f34887a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f34887a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f34888a;

        public d(g gVar) {
            this.f34888a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f34888a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f34889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f34890b;

        public e(e23.a aVar, g gVar) {
            this.f34889a = aVar;
            this.f34890b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f34889a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f34890b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/garmin/android/apps/connectmobile/ecg/presentation/stats/EcgDetailActivity$f", "Le32/e;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lgf0/b;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends e32.e<g3<? extends gf0.b>> {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f34892a;

            static {
                int[] iArr = new int[p.values().length];
                try {
                    iArr[p.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p.LOADING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f34892a = iArr;
            }
        }

        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e32.e
        public final void a(g3<? extends gf0.b> g3Var) {
            g3<? extends gf0.b> g3Var2 = g3Var;
            int i14 = a.f34892a[g3Var2.f35300a.ordinal()];
            EcgDetailActivity ecgDetailActivity = EcgDetailActivity.this;
            if (i14 == 1) {
                ecgDetailActivity.hideProgressOverlay();
                gf0.b bVar = (gf0.b) g3Var2.f35301b;
                if (bVar != null) {
                    ecgDetailActivity.f34872c = bVar.getSummary();
                    gf0.d reading = bVar.getReading();
                    ecgDetailActivity.f34873d = reading;
                    qf0.a aVar = ecgDetailActivity.f34882m;
                    if (aVar != null) {
                        aVar.a(reading);
                    }
                    gf0.a aVar2 = ecgDetailActivity.f34872c;
                    if (aVar2 == null) {
                        p005kotlin.jvm.internal.s.m("ecgActivity");
                        throw null;
                    }
                    ecgDetailActivity.ca(aVar2);
                    gf0.a aVar3 = ecgDetailActivity.f34872c;
                    if (aVar3 == null) {
                        p005kotlin.jvm.internal.s.m("ecgActivity");
                        throw null;
                    }
                    ecgDetailActivity.ea(aVar3);
                    gf0.a aVar4 = ecgDetailActivity.f34872c;
                    if (aVar4 == null) {
                        p005kotlin.jvm.internal.s.m("ecgActivity");
                        throw null;
                    }
                    s sVar = ecgDetailActivity.f34871b;
                    if (sVar == null) {
                        p005kotlin.jvm.internal.s.m("ecgFormatter");
                        throw null;
                    }
                    ecgDetailActivity.setTitle(sVar.b(aVar4));
                    gf0.a aVar5 = ecgDetailActivity.f34872c;
                    if (aVar5 == null) {
                        p005kotlin.jvm.internal.s.m("ecgActivity");
                        throw null;
                    }
                    ecgDetailActivity.da(aVar5);
                }
            } else if (i14 == 2) {
                ecgDetailActivity.showProgressOverlay();
            } else if (i14 != 3) {
                u0.r();
                return;
            } else {
                ecgDetailActivity.hideProgressOverlay();
                a aVar6 = EcgDetailActivity.f34869p;
                ecgDetailActivity.displayFailedMessage();
            }
            ecgDetailActivity.invalidateOptionsMenu();
        }
    }

    public final void ca(gf0.a aVar) {
        TextView textView = this.f34874e;
        if (textView != null) {
            DateTime dateTimeK = aVar.k();
            textView.setText(dateTimeK != null ? dateTimeK.toString("MMMM d, yyyy") : null);
        }
        TextView textView2 = this.f34875f;
        if (textView2 != null) {
            s sVar = this.f34871b;
            if (sVar == null) {
                p005kotlin.jvm.internal.s.m("ecgFormatter");
                throw null;
            }
            aVar.getClass();
            DateTime dateTimeK2 = aVar.k();
            textView2.setText(dateTimeK2 != null ? j0.r(sVar.f137529a, dateTimeK2) : sVar.f137530b.getString(R.string.no_value));
        }
    }

    public final void da(gf0.a aVar) {
        ComposeView composeView;
        gf0.c deviceInfo = aVar.getDeviceInfo();
        String ecgAppVersion = aVar.getEcgAppVersion();
        if ((deviceInfo == null && ecgAppVersion == null) || (composeView = this.f34881l) == null) {
            return;
        }
        composeView.setContent(new z3.e(1090053770, true, new pf0.m(deviceInfo, this, ecgAppVersion, 0)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:97:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e7  */
    public final void ea(gf0.a aVar) {
        TextView textView;
        String strJoin;
        TextView textView2 = this.f34876g;
        String strD = null;
        if (textView2 != null) {
            s sVar = this.f34871b;
            if (sVar == null) {
                p005kotlin.jvm.internal.s.m("ecgFormatter");
                throw null;
            }
            textView2.setText(sVar.c(aVar));
        }
        TextView textView3 = this.f34877h;
        if (textView3 != null) {
            s sVar2 = this.f34871b;
            if (sVar2 == null) {
                p005kotlin.jvm.internal.s.m("ecgFormatter");
                throw null;
            }
            s.a aVar2 = s.f137528d;
            l22.a aVar3 = sVar2.f137530b;
            String strA = aVar3.a(R.string.lbl_heart_rate_zone_bpm, aVar3.getString(R.string.no_value));
            Double heartRateAverage = aVar != null ? aVar.getHeartRateAverage() : null;
            if (heartRateAverage != null && heartRateAverage.doubleValue() > 0.0d) {
                l3.a aVar4 = l3.f23124b;
                double dDoubleValue = heartRateAverage.doubleValue();
                aVar4.getClass();
                strA = l3.a.k0(aVar3, dDoubleValue, true, strA);
            }
            textView3.setText(strA);
        }
        TextView textView4 = this.f34878i;
        if (textView4 != null) {
            s sVar3 = this.f34871b;
            if (sVar3 == null) {
                p005kotlin.jvm.internal.s.m("ecgFormatter");
                throw null;
            }
            l22.a aVar5 = sVar3.f137530b;
            aVar.getClass();
            List<String> listQ = aVar.q();
            if (listQ == null) {
                listQ = p13.j0.f134944a;
            }
            if (listQ.isEmpty()) {
                strJoin = aVar5.getString(R.string.no_value);
            } else {
                ArrayList arrayList = new ArrayList(y.r(listQ, 10));
                int i14 = 0;
                for (Object obj : listQ) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        x.q();
                        throw null;
                    }
                    s.f137528d.getClass();
                    String string = aVar5.getString(s.a.b((String) obj));
                    if (i14 > 0 && string.length() > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        String strValueOf = String.valueOf(string.charAt(0));
                        strValueOf.getClass();
                        String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        sb3.append((Object) lowerCase);
                        sb3.append(string.substring(1));
                        string = sb3.toString();
                    }
                    arrayList.add(string);
                    i14 = i15;
                }
                strJoin = TextUtils.join(", ", arrayList);
                strJoin.getClass();
            }
            textView4.setText(strJoin);
        }
        View view2 = this.f34879j;
        if (view2 != null) {
            List<String> listQ2 = aVar.q();
            v22.e.v(view2, listQ2 != null ? !listQ2.isEmpty() : false);
        }
        s sVar4 = this.f34871b;
        if (sVar4 == null) {
            p005kotlin.jvm.internal.s.m("ecgFormatter");
            throw null;
        }
        l22.a aVar6 = sVar4.f137530b;
        aVar.getClass();
        String rhythmClassification = aVar.getRhythmClassification();
        if (rhythmClassification != null && rhythmClassification.length() != 0) {
            String strM = j.m("<link>", aVar6.getString(R.string.lbl_read_more_about_this_result), "</link>");
            String string2 = aVar6.getString(R.string.msg_call_emergency_services);
            String string3 = aVar6.getString(R.string.msg_speak_with_your_doctor);
            String string4 = aVar6.getString(R.string.msg_inconclusive_result_short);
            switch (rhythmClassification) {
                case "INVALID":
                case "INCONCLUSIVE_OTHER":
                    strD = j20.x.d(string4, StringUtils.SPACE, strM, "\n\n", string2);
                    break;
                case "INCONCLUSIVE_HR_OVER_120_50":
                    strD = j.o("\n\n", string2, e5.l(aVar6.getString(R.string.msg_hr_too_high_result_short), StringUtils.SPACE, string3, StringUtils.SPACE, strM));
                    break;
                case "INCONCLUSIVE_SR_WITH_HR_100_TO_120":
                    strD = j20.x.d(string4, StringUtils.SPACE, strM, "\n\n", string2);
                    break;
                case "AFIB":
                    strD = j20.x.d(aVar6.getString(R.string.msg_afib_result_short), StringUtils.SPACE, strM, "\n\n", string2);
                    break;
                case "INCONCLUSIVE_POOR_SIGNAL":
                    strD = j20.x.d(aVar6.getString(R.string.msg_poor_signal_result_long), StringUtils.SPACE, strM, "\n\n", string2);
                    break;
                case "INCONCLUSIVE_HR_UNDER_50":
                    strD = j.o("\n\n", string2, e5.l(aVar6.getString(R.string.msg_hr_too_low_result_short), StringUtils.SPACE, string3, StringUtils.SPACE, strM));
                    break;
                case "SINUS_NORMAL":
                    strD = j20.x.d(aVar6.getString(R.string.msg_sinus_rhythm_result_short), StringUtils.SPACE, strM, "\n\n", string2);
                    break;
                default:
                    strD = j20.x.d(string4, StringUtils.SPACE, strM, "\n\n", string2);
                    break;
            }
        }
        if (strD != null && (textView = this.f34880k) != null) {
            v22.d.b(textView, strD, new l(aVar, this));
        }
        TextView textView5 = this.f34880k;
        if (textView5 != null) {
            v22.e.v(textView5, strD != null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        gf0.a aVar;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.activity_ecg_details);
        initActionBar(true);
        Bundle extras = getIntent().getExtras();
        p005kotlin.jvm.internal.j jVar = null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("ACTIVITY_EXTRA", gf0.a.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("ACTIVITY_EXTRA");
                if (!(parcelable2 instanceof gf0.a)) {
                    parcelable2 = null;
                }
                parcelable = (gf0.a) parcelable2;
            }
            aVar = (gf0.a) parcelable;
        } else {
            aVar = null;
        }
        Bundle extras2 = getIntent().getExtras();
        String string = extras2 != null ? extras2.getString("ACTIVITY_ID_EXTRA") : null;
        if (string == null) {
            a2 a2Var = a2.ACTIVITIES;
            i2.f36769a.getClass();
            i2.a.e(a2Var, "Missing required ecg activityId parameter");
            finish();
            return;
        }
        this.f34871b = new s(this);
        LineChart lineChart = (LineChart) findViewById(R.id.ecg_chart);
        View viewFindViewById = findViewById(R.id.tool_tip_container);
        if (lineChart != null) {
            hf0.b bVarC = ((jf0.a) KoinJavaComponent.get$default(jf0.a.class, null, null, 6, null)).c();
            final nw0.p pVar = new nw0.p(bVarC, 24, viewFindViewById, this);
            if (viewFindViewById != null) {
                v22.e.v(viewFindViewById, bVarC.f83623a.W2("key_ecg_chart_tool_tip_enabled", true));
            }
            if (viewFindViewById != null) {
                final int i14 = 0;
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: pf0.n
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i15 = i14;
                        nw0.p pVar2 = pVar;
                        switch (i15) {
                            case 0:
                                EcgDetailActivity.a aVar2 = EcgDetailActivity.f34869p;
                                pVar2.invoke();
                                break;
                            default:
                                EcgDetailActivity.a aVar3 = EcgDetailActivity.f34869p;
                                pVar2.invoke();
                                break;
                        }
                    }
                });
            }
            this.f34882m = new qf0.a(lineChart, false, 2, jVar);
            final int i15 = 1;
            lineChart.setOnClickListener(new View.OnClickListener() { // from class: pf0.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i16 = i15;
                    nw0.p pVar2 = pVar;
                    switch (i16) {
                        case 0:
                            EcgDetailActivity.a aVar2 = EcgDetailActivity.f34869p;
                            pVar2.invoke();
                            break;
                        default:
                            EcgDetailActivity.a aVar3 = EcgDetailActivity.f34869p;
                            pVar2.invoke();
                            break;
                    }
                }
            });
        }
        this.f34874e = (TextView) findViewById(R.id.health_snapshot_detail_date);
        this.f34875f = (TextView) findViewById(R.id.health_snapshot_detail_time);
        this.f34876g = (TextView) findViewById(R.id.ecg_detail_result);
        this.f34877h = (TextView) findViewById(R.id.ecg_detail_heart_rate);
        this.f34878i = (TextView) findViewById(R.id.ecg_detail_symptoms);
        this.f34879j = findViewById(R.id.ecg_detail_symptoms_group);
        this.f34880k = (TextView) findViewById(R.id.ecg_detail_explanation);
        this.f34881l = (ComposeView) findViewById(R.id.ecg_device_container);
        if (aVar != null) {
            this.f34872c = aVar;
            ca(aVar);
            gf0.a aVar2 = this.f34872c;
            if (aVar2 == null) {
                p005kotlin.jvm.internal.s.m("ecgActivity");
                throw null;
            }
            ea(aVar2);
            gf0.a aVar3 = this.f34872c;
            if (aVar3 == null) {
                p005kotlin.jvm.internal.s.m("ecgActivity");
                throw null;
            }
            s sVar = this.f34871b;
            if (sVar == null) {
                p005kotlin.jvm.internal.s.m("ecgFormatter");
                throw null;
            }
            setTitle(sVar.b(aVar3));
            gf0.a aVar4 = this.f34872c;
            if (aVar4 == null) {
                p005kotlin.jvm.internal.s.m("ecgActivity");
                throw null;
            }
            da(aVar4);
        }
        r rVar = (r) this.f34870a.getValue();
        y0 y0Var = new y0();
        ge1.b.T(v1.a(rVar), null, null, new q(y0Var, rVar, string, null), 3);
        y0Var.f(this, this.f34884o);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        if (((r) this.f34870a.getValue()).f137526b == null) {
            return true;
        }
        menu.add(0, 103, 0, R.string.lbl_download_pdf).setShowAsActionFlags(0);
        menu.add(0, 100, 0, R.string.lbl_help).setShowAsActionFlags(0);
        menu.add(0, 104, 0, R.string.lbl_instructions_for_use).setShowAsActionFlags(0);
        menu.add(0, 101, 0, R.string.lbl_delete_recording).setShowAsActionFlags(0);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        switch (menuItem.getItemId()) {
            case 100:
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                String str = ((r) this.f34870a.getValue()).f137527c;
                aVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("SINGLE_PAGE_EXTRA", false);
                bundle.putString("ECG_VIDEO_URI_EXTRA", str);
                HelpActivity.a aVar2 = HelpActivity.f36653a;
                ro0.l lVar = ro0.l.ECG;
                aVar2.getClass();
                return HelpActivity.a.d(this, lVar, null, bundle);
            case 101:
                gf0.a aVar3 = this.f34872c;
                if (aVar3 == null) {
                    p005kotlin.jvm.internal.s.m("ecgActivity");
                    throw null;
                }
                e0.a aVar4 = e0.f149637b;
                s sVar = this.f34871b;
                if (sVar == null) {
                    p005kotlin.jvm.internal.s.m("ecgFormatter");
                    throw null;
                }
                e0 e0VarA = e0.a.a(aVar4, sVar.b(aVar3), getString(R.string.msg_delete_entry), new l(this, aVar3), 8);
                v supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                e0VarA.show(supportFragmentManager, "DeleteActivityDialogFragment");
                return true;
            case 102:
            default:
                return super.onOptionsItemSelected(menuItem);
            case 103:
                jf0.a aVar5 = (jf0.a) KoinJavaComponent.get$default(jf0.a.class, null, null, 6, null);
                gf0.a aVar6 = this.f34872c;
                if (aVar6 != null) {
                    aVar5.f(this, aVar6);
                    return true;
                }
                p005kotlin.jvm.internal.s.m("ecgActivity");
                throw null;
            case 104:
                Uri uri = Uri.parse("https://www.garmin.com/ECGAppIFU");
                uri.getClass();
                g22.a.c(this, uri);
                return true;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/EcgDetailActivity$a;", "", "<init>", "()V", "", "MENU_ITEM_HELP", "I", "MENU_ITEM_DELETE", "MENU_ITEM_DOWNLOAD_REPORT", "MENU_ITEM_INSTRUCTIONS_FOR_USE", "", "ACTIVITY_EXTRA", "Ljava/lang/String;", "ACTIVITY_ID_EXTRA", "DATE_FORMAT", "TERMS_OF_USE_URL", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, String str) {
            Intent intentD = sn.a.d(context, context, EcgDetailActivity.class);
            if (str != null) {
                intentD.putExtra("ACTIVITY_ID_EXTRA", str);
            }
            return intentD;
        }

        private a() {
        }
    }
}
