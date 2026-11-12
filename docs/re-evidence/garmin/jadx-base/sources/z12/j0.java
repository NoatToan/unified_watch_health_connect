package z12;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz12/j0;", "Ldz/b;", "Landroid/view/ViewGroup;", "rootView", "<init>", "(Landroid/view/ViewGroup;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 extends dz.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f201422h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ViewGroup viewGroup) {
        super(viewGroup);
        viewGroup.getClass();
        this.f61656d.setText(viewGroup.getContext().getString(R.string.lbl_strength));
    }

    @Override // dz.b, dz.a
    public final void f(View view2) {
        view2.getClass();
        super.f(view2);
        View viewFindViewById = view2.findViewById(R.id.card_rows_container);
        viewFindViewById.getClass();
        this.f201422h = (LinearLayout) viewFindViewById;
    }

    @Override // dz.b
    public final int g() {
        return R.layout.card_personal_record_strength;
    }
}
