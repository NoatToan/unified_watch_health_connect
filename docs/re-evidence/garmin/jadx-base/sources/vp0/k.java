package vp0;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.n0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.hydration.presentation.detail.HydrationView;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import e23.l;
import g22.p;
import o13.u;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import vn2.b1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lvp0/k;", "", "Landroid/view/View;", "view", "Landroidx/lifecycle/n0;", "lifecycleOwner", "Lvp0/k$b;", "changeListener", "<init>", "(Landroid/view/View;Landroidx/lifecycle/n0;Lvp0/k$b;)V", "b", "a", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f179366q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f179367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Double f179368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Double f179369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q22.b f179370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u<op0.a, op0.a, op0.a> f179371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f179372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HydrationView f179373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f179374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f179375i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f179376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Button f179377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Button f179378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Button f179379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f179380n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f179381o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wp0.a f179382p;

    public interface b {
        void o0(double d14, e23.a<Unit> aVar);
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f179383a;

        public c(l lVar) {
            lVar.getClass();
            this.f179383a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f179383a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f179383a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(View view2, n0 n0Var, b bVar) {
        view2.getClass();
        n0Var.getClass();
        bVar.getClass();
        this.f179367a = bVar;
        this.f179370d = q22.b.MILLILITER;
        String str = null;
        op0.a aVar = new op0.a(1, null, str, null, 14, null);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        this.f179371e = new u<>(aVar, new op0.a(2, str, objArr, null, 14, null), new op0.a(3, objArr2, objArr3, null, 14, null));
        this.f179372f = (TextView) view2.findViewById(R.id.hydration_last_update_label);
        View viewFindViewById = view2.findViewById(R.id.hydration_view);
        viewFindViewById.getClass();
        HydrationView hydrationView = (HydrationView) viewFindViewById;
        this.f179373g = hydrationView;
        View viewFindViewById2 = view2.findViewById(R.id.hydration_goal);
        viewFindViewById2.getClass();
        this.f179374h = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.hydration_increase);
        viewFindViewById3.getClass();
        ImageView imageView = (ImageView) viewFindViewById3;
        this.f179375i = imageView;
        View viewFindViewById4 = view2.findViewById(R.id.hydration_decrease);
        viewFindViewById4.getClass();
        ImageView imageView2 = (ImageView) viewFindViewById4;
        this.f179376j = imageView2;
        View viewFindViewById5 = view2.findViewById(R.id.hydration_container_1);
        viewFindViewById5.getClass();
        Button button = (Button) viewFindViewById5;
        this.f179377k = button;
        View viewFindViewById6 = view2.findViewById(R.id.hydration_container_2);
        viewFindViewById6.getClass();
        Button button2 = (Button) viewFindViewById6;
        this.f179378l = button2;
        View viewFindViewById7 = view2.findViewById(R.id.hydration_container_3);
        viewFindViewById7.getClass();
        Button button3 = (Button) viewFindViewById7;
        this.f179379m = button3;
        Context context = view2.getContext();
        context.getClass();
        this.f179380n = context;
        this.f179381o = true;
        this.f179382p = new wp0.a(new l22.a(context));
        az0.b.f13675f.f(n0Var, new c(new g(this, 0)));
        p.b(hydrationView, this);
        final int i14 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: vp0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f179359b;

            {
                this.f179359b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                double d14 = 250.0d;
                int i15 = 2;
                switch (i14) {
                    case 0:
                        k kVar = this.f179359b;
                        if (kVar.f179381o) {
                            q22.b bVar2 = kVar.f179370d;
                            int i16 = jp0.c.f99873k;
                            bVar2.getClass();
                            int i17 = jp0.c.a.f99876c[bVar2.ordinal()];
                            if (i17 == 1) {
                                d14 = jp0.c.f99866d;
                            } else if (i17 == 2) {
                                d14 = jp0.c.f99865c;
                            }
                            kVar.f179367a.o0(d14, new rf.a(kVar, d14, i15));
                        }
                        break;
                    default:
                        k kVar2 = this.f179359b;
                        if (kVar2.f179381o) {
                            Double d15 = kVar2.f179369c;
                            double dDoubleValue = d15 != null ? d15.doubleValue() : 0.0d;
                            if (dDoubleValue > 0.0d) {
                                q22.b bVar3 = kVar2.f179370d;
                                int i18 = jp0.c.f99873k;
                                bVar3.getClass();
                                int i19 = jp0.c.a.f99876c[bVar3.ordinal()];
                                if (i19 == 1) {
                                    d14 = jp0.c.f99866d;
                                } else if (i19 == 2) {
                                    d14 = jp0.c.f99865c;
                                }
                                kVar2.f179367a.o0(((double) (-1)) * d14, new j(kVar2, dDoubleValue, d14, 1));
                            }
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: vp0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f179359b;

            {
                this.f179359b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                double d14 = 250.0d;
                int i16 = 2;
                switch (i15) {
                    case 0:
                        k kVar = this.f179359b;
                        if (kVar.f179381o) {
                            q22.b bVar2 = kVar.f179370d;
                            int i17 = jp0.c.f99873k;
                            bVar2.getClass();
                            int i18 = jp0.c.a.f99876c[bVar2.ordinal()];
                            if (i18 == 1) {
                                d14 = jp0.c.f99866d;
                            } else if (i18 == 2) {
                                d14 = jp0.c.f99865c;
                            }
                            kVar.f179367a.o0(d14, new rf.a(kVar, d14, i16));
                        }
                        break;
                    default:
                        k kVar2 = this.f179359b;
                        if (kVar2.f179381o) {
                            Double d15 = kVar2.f179369c;
                            double dDoubleValue = d15 != null ? d15.doubleValue() : 0.0d;
                            if (dDoubleValue > 0.0d) {
                                q22.b bVar3 = kVar2.f179370d;
                                int i19 = jp0.c.f99873k;
                                bVar3.getClass();
                                int i110 = jp0.c.a.f99876c[bVar3.ordinal()];
                                if (i110 == 1) {
                                    d14 = jp0.c.f99866d;
                                } else if (i110 == 2) {
                                    d14 = jp0.c.f99865c;
                                }
                                kVar2.f179367a.o0(((double) (-1)) * d14, new j(kVar2, dDoubleValue, d14, 1));
                            }
                        }
                        break;
                }
            }
        });
        final g gVar = new g(this, i15);
        b(button);
        b(button2);
        b(button3);
        final int i16 = 0;
        button.setOnClickListener(new View.OnClickListener() { // from class: vp0.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                g gVar2 = gVar;
                switch (i17) {
                    case 0:
                        int i18 = k.f179366q;
                        gVar2.invoke(view3);
                        break;
                    case 1:
                        int i19 = k.f179366q;
                        gVar2.invoke(view3);
                        break;
                    default:
                        int i24 = k.f179366q;
                        gVar2.invoke(view3);
                        break;
                }
            }
        });
        final int i17 = 1;
        button2.setOnClickListener(new View.OnClickListener() { // from class: vp0.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i18 = i17;
                g gVar2 = gVar;
                switch (i18) {
                    case 0:
                        int i19 = k.f179366q;
                        gVar2.invoke(view3);
                        break;
                    case 1:
                        int i110 = k.f179366q;
                        gVar2.invoke(view3);
                        break;
                    default:
                        int i24 = k.f179366q;
                        gVar2.invoke(view3);
                        break;
                }
            }
        });
        final int i18 = 2;
        button3.setOnClickListener(new View.OnClickListener() { // from class: vp0.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i19 = i18;
                g gVar2 = gVar;
                switch (i19) {
                    case 0:
                        int i110 = k.f179366q;
                        gVar2.invoke(view3);
                        break;
                    case 1:
                        int i111 = k.f179366q;
                        gVar2.invoke(view3);
                        break;
                    default:
                        int i24 = k.f179366q;
                        gVar2.invoke(view3);
                        break;
                }
            }
        });
        c();
    }

    public final void a(DateTime dateTime) {
        TextView textView = this.f179372f;
        if (dateTime == null) {
            textView.getClass();
            textView.setVisibility(8);
        } else {
            textView.setText(this.f179380n.getString(R.string.weather_information_last_updated, dateTime.toString("h:mm a")));
            textView.getClass();
            textView.setVisibility(0);
        }
    }

    public final void b(Button button) {
        String strE;
        boolean zG = s.g(button, this.f179377k);
        wp0.a aVar = this.f179382p;
        if (zG) {
            strE = aVar.e(this.f179371e.f128605a);
        } else if (s.g(button, this.f179378l)) {
            strE = aVar.e(this.f179371e.f128606b);
        } else {
            strE = s.g(button, this.f179379m) ? aVar.e(this.f179371e.f128607c) : "";
        }
        button.setText(strE);
        String string = button.getText().toString();
        Context context = button.getContext();
        context.getClass();
        button.setContentDescription(oi0.c.A(context, new b1(3), string));
    }

    public final void c() {
        String strA;
        q22.b bVar = this.f179370d;
        l22.b bVar2 = this.f179382p.f186529a;
        bVar.getClass();
        int i14 = wp0.a.b.f186532b[bVar.ordinal()];
        if (i14 == 1) {
            strA = bVar2.a(R.string.lbl_milliliters_value, "250");
        } else if (i14 != 2) {
            strA = i14 != 3 ? bVar2.a(R.string.lbl_milliliters_value, "250") : bVar2.a(R.string.lbl_ounces_value, "8");
        } else {
            strA = bVar2.a(R.string.lbl_cup_value, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        Context context = this.f179380n;
        this.f179375i.setContentDescription(context.getString(R.string.lbl_increase_with_value, strA));
        this.f179376j.setContentDescription(context.getString(R.string.lbl_decrease_with_value, strA));
    }

    public final void d() {
        Double d14 = this.f179368b;
        Double d15 = this.f179369c;
        TextView textView = this.f179374h;
        if (d14 == null || d15 == null || d15.doubleValue() < 0.0d) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(this.f179380n.getString(R.string.lbl_step_details_percent_of_goal, String.valueOf(jp0.c.a(d15.doubleValue(), d14.doubleValue(), this.f179370d, this.f179382p))));
        textView.setTextColor(a7.b.getColor(textView.getContext(), R.color.gcm_text_secondary));
        textView.setVisibility(0);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvp0/k$a;", "", "<init>", "()V", "", "DEFAULT_VOLUME", "D", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
