package z12;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.card.view.CardSummaryRowView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz12/n;", "Ldz/b;", "Landroid/view/ViewGroup;", "rootView", "<init>", "(Landroid/view/ViewGroup;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends dz.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f201444p = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CardView f201445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CardSummaryRowView f201446i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CardSummaryRowView f201447j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CardSummaryRowView f201448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CardSummaryRowView f201449l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CardSummaryRowView f201450m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CardSummaryRowView f201451n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f201452o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ViewGroup viewGroup) {
        super(viewGroup);
        viewGroup.getClass();
        this.f61656d.setText(viewGroup.getContext().getString(R.string.social_biometric_profile_abbreviated));
        String string = viewGroup.getContext().getString(R.string.no_value);
        string.getClass();
        this.f201452o = string;
    }

    @Override // dz.b, dz.a
    public final void f(View view2) {
        view2.getClass();
        super.f(view2);
        View viewFindViewById = view2.findViewById(R.id.card_root_layout);
        viewFindViewById.getClass();
        this.f201445h = (CardView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.card_row_age);
        viewFindViewById2.getClass();
        this.f201446i = (CardSummaryRowView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.card_row_gender);
        viewFindViewById3.getClass();
        this.f201447j = (CardSummaryRowView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.card_row_height);
        viewFindViewById4.getClass();
        this.f201448k = (CardSummaryRowView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.card_row_weight);
        viewFindViewById5.getClass();
        this.f201449l = (CardSummaryRowView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.card_row_vo2_max_running);
        viewFindViewById6.getClass();
        this.f201450m = (CardSummaryRowView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.card_row_vo2_max_cycling);
        viewFindViewById7.getClass();
        this.f201451n = (CardSummaryRowView) viewFindViewById7;
    }

    @Override // dz.b
    public final int g() {
        return R.layout.card_biometric_profile;
    }

    public final void h(l lVar, CardSummaryRowView cardSummaryRowView) {
        if (lVar == null || cardSummaryRowView == null) {
            return;
        }
        if (!lVar.f201434a.c()) {
            cardSummaryRowView.setVisibility(8);
        } else {
            cardSummaryRowView.setValueText(this.f201452o);
            cardSummaryRowView.setPrivacyVisibility(false);
        }
    }
}
