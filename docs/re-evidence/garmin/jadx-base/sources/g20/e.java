package g20;

import android.view.View;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f75331b;

    public /* synthetic */ e(View view2, ik2.b bVar) {
        this.f75330a = 1;
        this.f75331b = view2;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f75330a;
        View view2 = this.f75331b;
        switch (i14) {
            case 0:
                int i15 = com.garmin.android.apps.connectmobile.contacts.details.a.b.f32448e;
                return Integer.valueOf((int) view2.getContext().getResources().getDimension(R.dimen.spacing_small));
            case 1:
                s0.l(13, view2);
                return Unit.INSTANCE;
            case 2:
                int i16 = k20.a.e.f102414f;
                return Integer.valueOf((int) view2.getContext().getResources().getDimension(R.dimen.spacing_small));
            default:
                view2.setEnabled(true);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(View view2, int i14) {
        this.f75330a = i14;
        this.f75331b = view2;
    }
}
