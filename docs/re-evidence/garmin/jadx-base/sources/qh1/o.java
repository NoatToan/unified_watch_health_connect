package qh1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import c22.l3;
import c22.n3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.Arrays;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u001a\u0010\f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqh1/o;", "", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Lorg/joda/time/LocalDate;", "", "onDateClicked", "", "onBodyFatClicked", "Lkotlin/Function2;", "", "onSkeletalMuscleMassClicked", "Lkotlin/Function0;", "onSaveClicked", "onResetClicked", "Lqh1/l;", "formatter", "<init>", "(Landroid/view/View;Le23/l;Le23/l;Le23/p;Le23/a;Le23/a;Lqh1/l;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f144751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<LocalDate, Unit> f144752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<Double, Unit> f144753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.p<Double, String, Unit> f144754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.a<Unit> f144755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.a<Unit> f144756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f144757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f144758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GCMComplexTwoLineButton f144759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final GCMComplexTwoLineButton f144760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final GCMComplexTwoLineButton f144761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AppCompatButton f144762l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AppCompatButton f144763m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f144764n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f144765o;

    /* JADX WARN: Multi-variable type inference failed */
    public o(View view2, e23.l<? super LocalDate, Unit> lVar, e23.l<? super Double, Unit> lVar2, e23.p<? super Double, ? super String, Unit> pVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, l lVar3) {
        view2.getClass();
        lVar.getClass();
        lVar2.getClass();
        pVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar3.getClass();
        this.f144751a = view2;
        this.f144752b = lVar;
        this.f144753c = lVar2;
        this.f144754d = pVar;
        this.f144755e = aVar;
        this.f144756f = aVar2;
        this.f144757g = lVar3;
        View viewFindViewById = view2.findViewById(R.id.body_composition_latest_update_date);
        viewFindViewById.getClass();
        this.f144758h = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.body_composition_date_button);
        viewFindViewById2.getClass();
        this.f144759i = (GCMComplexTwoLineButton) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.body_composition_fat_button);
        viewFindViewById3.getClass();
        this.f144760j = (GCMComplexTwoLineButton) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.body_composition_skeletal_muscle_mass_button);
        viewFindViewById4.getClass();
        this.f144761k = (GCMComplexTwoLineButton) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.body_composition_save_button);
        viewFindViewById5.getClass();
        this.f144762l = (AppCompatButton) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.body_composition_reset_button);
        viewFindViewById6.getClass();
        this.f144763m = (AppCompatButton) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.measurement_with_metrics_missing_warning);
        viewFindViewById7.getClass();
        this.f144764n = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.body_composition_fifteen_days_warning);
        viewFindViewById8.getClass();
        this.f144765o = (TextView) viewFindViewById8;
    }

    public final void a(Double d14) {
        String str;
        pm0.h hVar = new pm0.h(4, this, d14);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f144760j;
        gCMComplexTwoLineButton.setOnClickListener(hVar);
        l lVar = this.f144757g;
        if (d14 == null) {
            str = lVar.f144743b;
        } else {
            lVar.getClass();
            l3.f23124b.getClass();
            String str2 = l3.f23130h.format(d14.doubleValue());
            x0 x0Var = x0.f105818a;
            str = String.format(lVar.f144745d, Arrays.copyOf(new Object[]{str2, lVar.f144742a.getString(R.string.percent_sign)}, 2));
        }
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(str);
    }

    public final void b(LocalDate localDate) {
        TextView textView = this.f144758h;
        if (localDate == null) {
            textView.setVisibility(8);
            return;
        }
        l lVar = this.f144757g;
        textView.setText(lVar.f144742a.a(R.string.lbl_updated_date, lVar.a(localDate)));
        textView.setVisibility(0);
    }

    public final void c(Double d14, n3 n3Var) {
        String str;
        l lVar = this.f144757g;
        bv2.j jVar = new bv2.j(this, 26, d14, lVar.b(n3Var));
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f144761k;
        gCMComplexTwoLineButton.setOnClickListener(jVar);
        if (d14 == null) {
            str = lVar.f144743b;
        } else {
            l3.f23124b.getClass();
            String str2 = l3.f23130h.format(d14.doubleValue());
            x0 x0Var = x0.f105818a;
            str = String.format(lVar.f144745d, Arrays.copyOf(new Object[]{str2, lVar.b(n3Var)}, 2));
        }
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(str);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    public final void d(rh1.a aVar) {
        Double dValueOf;
        Double dValueOf2;
        Drawable drawable;
        boolean z14;
        Integer muscleMass;
        double dP1;
        aVar.getClass();
        boolean z15 = aVar.f152749e;
        n3 n3Var = aVar.f152747c;
        rh1.b bVar = aVar.f152745a;
        b(bVar != null ? bVar.f() : null);
        LocalDate measurementDate = bVar != null ? bVar.getMeasurementDate() : null;
        if (measurementDate == null) {
            measurementDate = LocalDate.now();
        }
        pm0.h hVar = new pm0.h(5, this, measurementDate);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f144759i;
        gCMComplexTwoLineButton.setOnClickListener(hVar);
        l lVar = this.f144757g;
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(lVar.a(measurementDate));
        a(bVar != null ? bVar.getBodyFatPercent() : null);
        final int i14 = 1;
        if (bVar == null || (muscleMass = bVar.getMuscleMass()) == null) {
            dValueOf = null;
        } else {
            int iIntValue = muscleMass.intValue();
            if ((n3Var == null ? -1 : rh1.a.b.f152750a[n3Var.ordinal()]) == 1) {
                l3.f23124b.getClass();
                dP1 = ((double) iIntValue) / 453.592d;
            } else {
                l3.f23124b.getClass();
                dP1 = l3.a.P1(iIntValue);
            }
            dValueOf = Double.valueOf(dP1);
        }
        if (dValueOf != null) {
            double dDoubleValue = dValueOf.doubleValue();
            l3.f23124b.getClass();
            dValueOf2 = Double.valueOf(l3.a.T1(dDoubleValue, 1));
        } else {
            dValueOf2 = null;
        }
        c(dValueOf2, n3Var);
        Resources resources = this.f144751a.getContext().getResources();
        resources.getClass();
        lVar.getClass();
        if (z15) {
            drawable = null;
        } else {
            ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
            drawable = resources.getDrawable(2131231971, null);
        }
        gCMComplexTwoLineButton.setRightIcon(drawable);
        v22.e.v(this.f144765o, !z15);
        final int i15 = 0;
        if (aVar.b()) {
            if ((bVar != null ? bVar.getMeasurementDate() : null) == null || bVar.getBodyFatPercent() == null || !z15) {
                z14 = false;
            } else {
                z14 = true;
            }
        } else {
            z14 = false;
        }
        AppCompatButton appCompatButton = this.f144762l;
        if (z14) {
            appCompatButton.setEnabled(true);
            appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: qh1.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f144750b;

                {
                    this.f144750b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            this.f144750b.f144756f.invoke();
                            break;
                        default:
                            this.f144750b.f144755e.invoke();
                            break;
                    }
                }
            });
        } else {
            appCompatButton.setEnabled(false);
            appCompatButton.setOnClickListener(null);
        }
        boolean z16 = ((bVar != null ? bVar.getMeasurementDate() : null) == null || bVar.getBodyFatPercent() == null) ? false : true;
        AppCompatButton appCompatButton2 = this.f144763m;
        if (z16) {
            appCompatButton2.setEnabled(true);
            appCompatButton2.setOnClickListener(new View.OnClickListener(this) { // from class: qh1.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f144750b;

                {
                    this.f144750b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i15) {
                        case 0:
                            this.f144750b.f144756f.invoke();
                            break;
                        default:
                            this.f144750b.f144755e.invoke();
                            break;
                    }
                }
            });
        } else {
            appCompatButton2.setEnabled(false);
            appCompatButton2.setOnClickListener(null);
        }
    }

    public /* synthetic */ o(View view2, e23.l lVar, e23.l lVar2, e23.p pVar, e23.a aVar, e23.a aVar2, l lVar3, int i14, p005kotlin.jvm.internal.j jVar) {
        l lVar4;
        if ((i14 & 64) != 0) {
            Context context = view2.getContext();
            context.getClass();
            lVar4 = new l(new l22.a(context));
        } else {
            lVar4 = lVar3;
        }
        this(view2, lVar, lVar2, pVar, aVar, aVar2, lVar4);
    }
}
