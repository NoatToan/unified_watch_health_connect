package z12;

import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.card.view.CardSummaryRowView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz12/v;", "Ldz/b;", "Landroid/view/ViewGroup;", "rootView", "<init>", "(Landroid/view/ViewGroup;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v extends dz.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CardSummaryRowView f201494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CardSummaryRowView f201495i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ViewGroup viewGroup) {
        super(viewGroup);
        viewGroup.getClass();
        this.f61656d.setText(viewGroup.getContext().getString(R.string.concept_activities));
    }

    @Override // dz.b, dz.a
    public final void f(View view2) {
        view2.getClass();
        super.f(view2);
        View viewFindViewById = view2.findViewById(R.id.card_row_total_activities);
        viewFindViewById.getClass();
        this.f201494h = (CardSummaryRowView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.card_row_total_distance);
        viewFindViewById2.getClass();
        this.f201495i = (CardSummaryRowView) viewFindViewById2;
    }

    @Override // dz.b
    public final int g() {
        return R.layout.card_lifetime_totals_activities;
    }
}
