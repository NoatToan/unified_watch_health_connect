package rb1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.R;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import f12.l;
import java.util.Date;
import lc.u0;
import o13.m;
import o13.p;
import o13.t;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import r70.n;
import xz2.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lrb1/f;", "Lrb1/e;", "Lo13/p;", "", "", "calendarInfoPair", "<init>", "(Lo13/p;)V", "a", "b", "c", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends rb1.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f151604h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<Integer, String> f151605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f151606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f151607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MaterialCalendarView f151608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LottieAnimationView f151609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f151610g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrb1/f$b;", "Lxz2/j;", "Lxz2/b;", "minimumDate", "maximumDate", "<init>", "(Lxz2/b;Lxz2/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements xz2.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xz2.b f151611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xz2.b f151612b;

        public b(xz2.b bVar, xz2.b bVar2) {
            bVar.getClass();
            bVar2.getClass();
            this.f151611a = bVar;
            this.f151612b = bVar2;
        }

        @Override // xz2.j
        public final boolean a(xz2.b bVar) {
            bVar.getClass();
            return bVar.i(this.f151611a) || bVar.h(this.f151612b);
        }

        @Override // xz2.j
        public final void b(k kVar) {
            kVar.a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrb1/f$c;", "Lxz2/j;", "<init>", "(Lrb1/f;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c implements xz2.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable f151613a;

        public c() {
            Context context = f.this.getContext();
            if (context != null) {
                this.f151613a = a7.b.getDrawable(context, R.drawable.gcm4_calendar_selected_day_bck);
            }
        }

        @Override // xz2.j
        public final boolean a(xz2.b bVar) {
            bVar.getClass();
            MaterialCalendarView materialCalendarView = f.this.f151608e;
            if (materialCalendarView != null) {
                return s.g(materialCalendarView.getSelectedDate(), bVar);
            }
            s.m("mCalendar");
            throw null;
        }

        @Override // xz2.j
        public final void b(k kVar) {
            Drawable drawable = this.f151613a;
            if (drawable != null) {
                kVar.b(drawable);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f151615a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f151615a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f151615a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f151616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f151617b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f151616a = aVar;
            this.f151617b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f151616a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f151617b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: renamed from: rb1.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C2854f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f151618a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2854f(Fragment fragment) {
            super(0);
            this.f151618a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f151618a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    public f(p<Integer, String> pVar) {
        this.f151605b = pVar;
        this.f151606c = m.b(new n(16));
        this.f151607d = new w1(s0.f105811a.b(g.class), new d(this), new C2854f(this), new e(null, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_pregnancy_stop_tracking_calendar, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        LocalDate dueDate;
        LocalDate localDatePlusDays;
        db1.m mVar;
        db1.b numOfBabies;
        int i14;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.stop_tracking_image_view);
        viewFindViewById.getClass();
        this.f151609f = (LottieAnimationView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.stop_tracking_calendar_text_view);
        viewFindViewById2.getClass();
        this.f151610g = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.stop_tracking_calendar);
        viewFindViewById3.getClass();
        this.f151608e = (MaterialCalendarView) viewFindViewById3;
        LottieAnimationView lottieAnimationView = this.f151609f;
        if (lottieAnimationView == null) {
            s.m("mStopTrackingImageView");
            throw null;
        }
        lottieAnimationView.setAnimation(R.raw.art_mct_baby_delivery);
        t tVar = this.f151606c;
        Logger logger = (Logger) tVar.getValue();
        p<Integer, String> pVar = this.f151605b;
        logger.debug("setupView: calendarInfoPair first=[" + (pVar != null ? pVar.f128594a : null) + "]");
        if (pVar == null) {
            g gVarV6 = v6();
            Context context = getContext();
            String string = "";
            if (context != null) {
                eb1.d dVar = gVarV6.f151621b;
                i14 = dVar.f63667a ? 0 : 8;
                int i15 = eb1.d.a.f63668a[dVar.ordinal()];
                if (i15 == 1) {
                    string = context.getString(R.string.pregnancy_baby_born_day);
                    string.getClass();
                } else if (i15 == 2) {
                    string = context.getString(R.string.pregnancy_approximate_date_of_loss);
                    string.getClass();
                } else if (i15 != 3) {
                    u0.r();
                    return;
                }
            } else {
                i14 = 8;
            }
            pVar = new p<>(Integer.valueOf(i14), string);
        }
        LottieAnimationView lottieAnimationView2 = this.f151609f;
        if (lottieAnimationView2 == null) {
            s.m("mStopTrackingImageView");
            throw null;
        }
        lottieAnimationView2.setVisibility(pVar.f128594a.intValue());
        String string2 = pVar.f128595b;
        if (v6().f151621b == eb1.d.HAD_BABY && (mVar = v6().f151620a) != null && (numOfBabies = mVar.getNumOfBabies()) != null && numOfBabies != db1.b.SINGLE) {
            string2 = getString(R.string.pregnancy_babies_born_day);
            string2.getClass();
        }
        TextView textView = this.f151610g;
        if (textView == null) {
            s.m("mStopTrackingText");
            throw null;
        }
        textView.setText(string2);
        db1.m mVar2 = v6().f151620a;
        if (mVar2 == null || (dueDate = mVar2.getDueDate()) == null) {
            ((Logger) tVar.getValue()).error("Null due date in onViewCreated");
        } else {
            db1.m mVar3 = v6().f151620a;
            if (mVar3 == null || (localDatePlusDays = mVar3.getPregnancyCycleStart()) == null) {
                localDatePlusDays = dueDate.plusDays(-279);
            }
            LocalDate localDateNow = LocalDate.now();
            LocalDate localDatePlusDays2 = localDatePlusDays.plusDays(315);
            boolean zIsBefore = localDateNow.isBefore(localDatePlusDays2);
            LocalDate localDate = localDatePlusDays2;
            if (zIsBefore) {
                localDate = localDateNow;
            }
            if (localDate.isBefore(localDatePlusDays)) {
                localDatePlusDays = localDate.plusDays(-279);
            }
            boolean zIsBefore2 = localDateNow.isBefore(dueDate);
            LocalDate localDate2 = dueDate;
            if (zIsBefore2) {
                localDate2 = localDateNow;
            }
            if (v6().f151623d.equals(localDateNow)) {
                g gVarV7 = v6();
                Date date = localDate2.toDate();
                date.getClass();
                gVarV7.f151623d = date;
            }
            MaterialCalendarView materialCalendarView = this.f151608e;
            if (materialCalendarView == null) {
                s.m("mCalendar");
                throw null;
            }
            materialCalendarView.setSelectedDate(localDate2.toDate());
            MaterialCalendarView materialCalendarView2 = this.f151608e;
            if (materialCalendarView2 == null) {
                s.m("mCalendar");
                throw null;
            }
            xz2.b bVarD = xz2.b.d(localDatePlusDays.toDate());
            bVarD.getClass();
            xz2.b bVarD2 = xz2.b.d(localDate.toDate());
            bVarD2.getClass();
            materialCalendarView2.a(new b(bVarD, bVarD2), new c());
            MaterialCalendarView materialCalendarView3 = this.f151608e;
            if (materialCalendarView3 == null) {
                s.m("mCalendar");
                throw null;
            }
            MaterialCalendarView.h hVarA = materialCalendarView3.A.a();
            hVarA.f54800d = xz2.b.d(jg.b.P(localDatePlusDays).toDate());
            hVarA.f54801e = xz2.b.d(jg.b.t(localDate).toDate());
            hVarA.f54798b = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().a();
            hVarA.a();
        }
        MaterialCalendarView materialCalendarView4 = this.f151608e;
        if (materialCalendarView4 != null) {
            materialCalendarView4.setOnDateChangedListener(new r22.a(this, 8));
        } else {
            s.m("mCalendar");
            throw null;
        }
    }

    @Override // rb1.e
    public final db1.c u6() {
        return v6().f151621b == eb1.d.HAD_BABY ? new db1.c(R.string.pregnancy_delivery_date, 0, 8, 0, 0, 24, null) : new db1.c(R.string.pregnancy_delivery_date, 0, 0, 0, 0, 24, null);
    }

    public final g v6() {
        return (g) this.f151607d.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrb1/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ f(p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : pVar);
    }
}
