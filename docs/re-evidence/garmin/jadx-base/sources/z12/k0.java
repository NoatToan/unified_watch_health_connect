package z12;

import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.card.view.CardSummaryRowView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz12/k0;", "Ldz/b;", "Landroid/view/ViewGroup;", "rootView", "<init>", "(Landroid/view/ViewGroup;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k0 extends dz.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CardSummaryRowView f201424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CardSummaryRowView f201425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CardSummaryRowView f201426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CardSummaryRowView f201427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CardSummaryRowView f201428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CardSummaryRowView f201429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CardSummaryRowView f201430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CardSummaryRowView f201431o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CardSummaryRowView f201432p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CardSummaryRowView f201433q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(ViewGroup viewGroup) {
        super(viewGroup);
        viewGroup.getClass();
        this.f61656d.setText(viewGroup.getContext().getString(R.string.lbl_swimming));
    }

    @Override // dz.b, dz.a
    public final void f(View view2) {
        view2.getClass();
        super.f(view2);
        View viewFindViewById = view2.findViewById(R.id.card_row_longest_poolswim);
        viewFindViewById.getClass();
        this.f201424h = (CardSummaryRowView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.card_row_100m_poolswim);
        viewFindViewById2.getClass();
        this.f201425i = (CardSummaryRowView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.card_row_100yd_poolswim);
        viewFindViewById3.getClass();
        this.f201426j = (CardSummaryRowView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.card_row_400m_poolswim);
        viewFindViewById4.getClass();
        this.f201427k = (CardSummaryRowView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.card_row_500yd_poolswim);
        viewFindViewById5.getClass();
        this.f201428l = (CardSummaryRowView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.card_row_750m_poolswim);
        viewFindViewById6.getClass();
        this.f201429m = (CardSummaryRowView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.card_row_1000m_poolswim);
        viewFindViewById7.getClass();
        this.f201430n = (CardSummaryRowView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.card_row_1000yd_poolswim);
        viewFindViewById8.getClass();
        this.f201431o = (CardSummaryRowView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.card_row_1500m_poolswim);
        viewFindViewById9.getClass();
        this.f201432p = (CardSummaryRowView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.card_row_1650yd_poolswim);
        viewFindViewById10.getClass();
        this.f201433q = (CardSummaryRowView) viewFindViewById10;
    }

    @Override // dz.b
    public final int g() {
        return R.layout.card_personal_record_swimming;
    }
}
