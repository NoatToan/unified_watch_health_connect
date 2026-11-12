package z12;

import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.card.view.CardSummaryRowView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz12/b0;", "Ldz/b;", "Landroid/view/ViewGroup;", "rootView", "<init>", "(Landroid/view/ViewGroup;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 extends dz.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CardSummaryRowView f201365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CardSummaryRowView f201366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CardSummaryRowView f201367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CardSummaryRowView f201368k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ViewGroup viewGroup) {
        super(viewGroup);
        viewGroup.getClass();
        this.f61656d.setText(viewGroup.getContext().getString(R.string.lbl_cycling));
    }

    @Override // dz.b, dz.a
    public final void f(View view2) {
        view2.getClass();
        super.f(view2);
        View viewFindViewById = view2.findViewById(R.id.card_row_farthest_cycle);
        viewFindViewById.getClass();
        this.f201365h = (CardSummaryRowView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.card_row_40k_cycle);
        viewFindViewById2.getClass();
        this.f201366i = (CardSummaryRowView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.card_row_max_elev);
        viewFindViewById3.getClass();
        this.f201367j = (CardSummaryRowView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.card_row_max_power);
        viewFindViewById4.getClass();
        this.f201368k = (CardSummaryRowView) viewFindViewById4;
    }

    @Override // dz.b
    public final int g() {
        return R.layout.card_personal_record_cycling;
    }
}
