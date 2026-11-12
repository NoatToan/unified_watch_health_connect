package zs0;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import e32.l;
import e32.p;
import h4.r;
import l72.x0;
import oi0.h;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.x1;
import u1.y0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lzs0/d;", "Le32/p;", "Lvs0/a;", "Landroid/view/View;", "view", "Le32/l;", "Lit0/b;", "navigator", "Lxs0/a;", "lactateThresholdSportType", "<init>", "(Landroid/view/View;Le32/l;Lxs0/a;)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements p<vs0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<it0.b> f206830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xs0.a f206831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f206832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f206833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ComposeView f206834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f206835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f206836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ComposeView f206837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Button f206838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f206839j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f206840k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f206841l;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f206842a;

        static {
            int[] iArr = new int[xs0.a.values().length];
            try {
                iArr[xs0.a.ROWING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f206842a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zs0/d$b", "Ll72/x0$b;", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements x0.b {
        @Override // l72.x0.b
        public final void a(m mVar, int i14) {
            mVar.C(-87000552);
            x1 x1Var = n.f135158a;
            t4.d dVarA = n5.c.a(R.drawable.chart_icon_sport_specific_lt_power, mVar, 0);
            g6.f.a aVar = g6.f.f75994b;
            y0.a(dVarA, "", x2.q(r.S, 10), null, null, 0.0f, null, mVar, 432, 120);
            mVar.f();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zs0/d$c", "Ll72/x0$b;", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements x0.b {
        @Override // l72.x0.b
        public final void a(m mVar, int i14) {
            mVar.C(-495836593);
            x1 x1Var = n.f135158a;
            t4.d dVarA = n5.c.a(R.drawable.chart_icon_sport_specific_lt_power_per_weight, mVar, 0);
            g6.f.a aVar = g6.f.f75994b;
            y0.a(dVarA, "", x2.q(r.S, 10), null, null, 0.0f, null, mVar, 432, 120);
            mVar.f();
        }
    }

    public d(View view2, l<it0.b> lVar, xs0.a aVar) {
        view2.getClass();
        lVar.getClass();
        aVar.getClass();
        this.f206830a = lVar;
        this.f206831b = aVar;
        Context context = view2.getContext();
        this.f206832c = context;
        this.f206833d = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        this.f206834e = (ComposeView) view2.findViewById(R.id.section_image);
        this.f206835f = (TextView) view2.findViewById(R.id.section_header_title);
        this.f206836g = (TextView) view2.findViewById(R.id.section_text);
        this.f206837h = (ComposeView) view2.findViewById(R.id.stats_view);
        this.f206838i = (Button) view2.findViewById(R.id.button_learn_more);
        String string = context.getString(R.string.no_value);
        string.getClass();
        this.f206839j = string;
        String string2 = context.getString(R.string.txt_empty_page_no_data);
        string2.getClass();
        this.f206840k = string2;
        String string3 = context.getString(R.string.no_duration_value);
        string3.getClass();
        this.f206841l = string3;
    }

    @Override // e32.p
    public final void a() {
        this.f206833d = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        this.f206838i.setOnClickListener(new xp0.d(this, 29));
        this.f206834e.setContent(new z3.e(-332079131, true, new zs0.b(this, 0)));
        e();
        d(null, null, null, this.f206840k);
    }

    @Override // e32.p
    public final /* bridge */ /* synthetic */ boolean b(vs0.a aVar) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00cf  */
    @Override // e32.p
    public final void c(vs0.a aVar) {
        vs0.a aVar2 = aVar;
        o13.p<String, String> pVar = null;
        this.f206833d = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        TextView textView = this.f206836g;
        if (aVar2 != null) {
            double d14 = aVar2.f179717b;
            Double d15 = aVar2.f179719d;
            Double d16 = aVar2.f179720e;
            if (Double.isNaN(d14) && Double.isNaN(aVar2.f179718c) && d15 == null && d16 == null) {
                e();
            } else {
                l3.a aVar3 = l3.f23124b;
                Context context = this.f206832c;
                context.getClass();
                String strL0 = l3.a.l0(aVar3, new l22.a(context), d14, false);
                if (strL0.length() == 0) {
                    strL0 = null;
                }
                ft0.a aVar4 = ft0.a.f73439a;
                xs0.a aVar5 = aVar2.f179716a;
                double d17 = aVar2.f179718c;
                boolean z14 = this.f206833d;
                aVar4.getClass();
                String strA = ft0.a.a(context, aVar5, d17, z14, false, "");
                if (strA.length() == 0) {
                    strA = null;
                }
                String strB = ft0.a.b(context, new h(context), aVar2.f179716a, aVar2.f179718c, this.f206833d, false, this.f206840k);
                if (d15 != null || d16 != null) {
                    String str = this.f206839j;
                    pVar = new o13.p<>(d15 != null ? l3.a.D0(context, d15.doubleValue(), false, str) : null, d16 != null ? l3.a.G0(context, d16.doubleValue(), false, str) : null);
                }
                this.f206835f.setText(context.getString(R.string.lbl_your_current_threshold));
                textView.setText(aVar2.f179716a == xs0.a.ROWING ? context.getString(R.string.msg_reach_rowing_lactate_threshold_at_these_levels) : context.getString(R.string.msg_reach_running_lactate_threshold_at_these_levels));
                Button button = this.f206838i;
                button.getClass();
                button.setVisibility(8);
                d(strL0, strA, pVar, strB);
            }
        } else {
            e();
        }
        textView.getClass();
        textView.setVisibility(0);
    }

    public final void d(String str, String str2, o13.p<String, String> pVar, String str3) {
        String str4 = str == null ? this.f206839j : str;
        String str5 = str2 == null ? this.f206841l : str2;
        ft0.a aVar = ft0.a.f73439a;
        Context context = this.f206832c;
        context.getClass();
        boolean z14 = this.f206833d;
        aVar.getClass();
        xs0.a aVar2 = this.f206831b;
        String strC = ft0.a.c(context, aVar2, z14, true);
        String strD = ft0.a.d(context, aVar2, this.f206833d, false);
        ComposeView composeView = this.f206837h;
        if (composeView != null) {
            composeView.setContent(new z3.e(-1686653901, true, new zs0.c(pVar, str, this, str4, str2, str3, strD, str5, strC, 0)));
        }
    }

    public final void e() {
        Context context = this.f206832c;
        this.f206835f.setText(context.getString(R.string.msg_no_data_available));
        int i14 = a.f206842a[this.f206831b.ordinal()];
        Button button = this.f206838i;
        TextView textView = this.f206836g;
        if (i14 == 1) {
            textView.setText(context.getString(R.string.rowing_lactate_threshold_card_no_data_state_message));
            button.getClass();
            button.setVisibility(8);
        } else {
            textView.setText(context.getString(R.string.msg_for_lactate_threshold_data_perform_guided_test));
            button.getClass();
            button.setVisibility(0);
        }
    }
}
