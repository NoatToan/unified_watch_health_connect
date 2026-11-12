package z12;

import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.card.view.CardSummaryRowView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz12/x;", "Ldz/b;", "Landroid/view/ViewGroup;", "rootView", "<init>", "(Landroid/view/ViewGroup;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x extends dz.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CardSummaryRowView f201497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CardSummaryRowView f201498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CardSummaryRowView f201499j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ViewGroup viewGroup) {
        super(viewGroup);
        viewGroup.getClass();
        this.f61656d.setText(viewGroup.getContext().getString(R.string.lbl_pushes));
    }

    @Override // dz.b, dz.a
    public final void f(View view2) {
        view2.getClass();
        super.f(view2);
        View viewFindViewById = view2.findViewById(R.id.card_row_total_steps);
        viewFindViewById.getClass();
        this.f201497h = (CardSummaryRowView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.card_row_total_distance);
        viewFindViewById2.getClass();
        this.f201498i = (CardSummaryRowView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.card_row_daily_average_steps);
        viewFindViewById3.getClass();
        this.f201499j = (CardSummaryRowView) viewFindViewById3;
    }

    @Override // dz.b
    public final int g() {
        return R.layout.card_lifetime_totals_wellness;
    }
}
