package z12;

import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.card.view.CardSummaryRowView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz12/d0;", "Ldz/b;", "Landroid/view/ViewGroup;", "rootView", "<init>", "(Landroid/view/ViewGroup;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 extends dz.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CardSummaryRowView f201378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CardSummaryRowView f201379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CardSummaryRowView f201380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CardSummaryRowView f201381k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CardSummaryRowView f201382l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CardSummaryRowView f201383m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CardSummaryRowView f201384n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ViewGroup viewGroup) {
        super(viewGroup);
        viewGroup.getClass();
        this.f61656d.setText(viewGroup.getContext().getString(R.string.lbl_activity_pushing_run_speed));
    }

    @Override // dz.b, dz.a
    public final void f(View view2) {
        view2.getClass();
        super.f(view2);
        View viewFindViewById = view2.findViewById(R.id.card_row_1k);
        viewFindViewById.getClass();
        this.f201378h = (CardSummaryRowView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.card_row_1mile);
        viewFindViewById2.getClass();
        this.f201379i = (CardSummaryRowView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.card_row_5k);
        viewFindViewById3.getClass();
        this.f201380j = (CardSummaryRowView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.card_row_10k);
        viewFindViewById4.getClass();
        this.f201381k = (CardSummaryRowView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.card_row_half_marathon);
        viewFindViewById5.getClass();
        this.f201382l = (CardSummaryRowView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.card_row_full_marathon);
        viewFindViewById6.getClass();
        this.f201383m = (CardSummaryRowView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.card_row_farthest_run);
        viewFindViewById7.getClass();
        this.f201384n = (CardSummaryRowView) viewFindViewById7;
    }

    @Override // dz.b
    public final int g() {
        return R.layout.card_personal_record_running;
    }
}
