package h32;

import android.view.View;
import com.garmin.android.apps.connectmobile.view.view_3_0.ComplexEditText;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComplexEditText f81295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f81296c;

    public /* synthetic */ a(ComplexEditText complexEditText, e23.l lVar, int i14) {
        this.f81294a = i14;
        this.f81295b = complexEditText;
        this.f81296c = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f81294a;
        e23.l lVar = this.f81296c;
        ComplexEditText complexEditText = this.f81295b;
        switch (i14) {
            case 0:
                int i15 = ComplexEditText.f47732h;
                complexEditText.j();
                view2.getClass();
                lVar.invoke(view2);
                break;
            default:
                int i16 = ComplexEditText.f47732h;
                complexEditText.j();
                view2.getClass();
                lVar.invoke(view2);
                break;
        }
    }
}
