package bi2;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import androidx.fragment.app.Fragment;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class p implements DatePickerDialog.OnDateSetListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18241b;

    public /* synthetic */ p(Object obj, int i14) {
        this.f18240a = i14;
        this.f18241b = obj;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i14, int i15, int i16) {
        int i17 = this.f18240a;
        Object obj = this.f18241b;
        switch (i17) {
            case 0:
                r rVar = (r) obj;
                rVar.f18250b.n(rVar.f18251c, rVar.f18252d, new Integer[]{Integer.valueOf(i14), Integer.valueOf(i15 + 1), Integer.valueOf(i16)});
                break;
            case 1:
                fv2.h hVar = (fv2.h) obj;
                cx2.h hVar2 = fv2.h.f73755f;
                cx2.i.a aVar = cx2.i.f56681a;
                Fragment fragment = hVar.f73756a;
                aVar.getClass();
                if (cx2.i.a.a(fragment)) {
                    hVar.f73757b.h(hVar.f73758c, hVar.f73759d, new Integer[]{Integer.valueOf(i15 + 1), Integer.valueOf(i16), Integer.valueOf(i14)});
                }
                break;
            default:
                xn2.e eVar = (xn2.e) obj;
                xn2.e.a aVar2 = xn2.e.f191693i;
                datePicker.getClass();
                eVar.A6(new DateTime().withDate(i14, i15 + 1, i16));
                eVar.z6();
                break;
        }
    }
}
