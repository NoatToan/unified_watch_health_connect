package bi2;

import android.widget.NumberPicker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c0 implements NumberPicker.OnValueChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18119c;

    public /* synthetic */ c0(int i14, Object obj, Object obj2) {
        this.f18117a = i14;
        this.f18118b = obj;
        this.f18119c = obj2;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i14, int i15) {
        int i16 = this.f18117a;
        Object obj = this.f18119c;
        Object obj2 = this.f18118b;
        switch (i16) {
            case 0:
                ((StyledTextView) obj2).setText(((e0) obj).f18131a.getResources().getQuantityText(R.plurals.number_of_days_without_value, i15));
                break;
            case 1:
                xg1.d dVar = (xg1.d) obj2;
                String[] strArr = (String[]) obj;
                xg1.d.a.C3553a c3553a = dVar.f190883d.get(strArr[i15]);
                dVar.v6(c3553a != null ? Double.valueOf(c3553a.f190890a) : null, strArr[i15]);
                dVar.u6(c3553a != null ? Double.valueOf(c3553a.f190890a) : null, strArr[i15]);
                break;
            default:
                int i17 = xg1.d.f190879k;
                ((xg1.d) obj2).u6(Double.valueOf(i15), (String) obj);
                break;
        }
    }
}
