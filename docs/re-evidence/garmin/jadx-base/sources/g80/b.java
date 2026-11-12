package g80;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lg80/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lg80/b$a;", "", "Lff2/a;", "campaignList", "<init>", "(Ljava/util/List;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ff2.a> f76243a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg80/b$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f76244a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.campaign_details_tv);
            viewFindViewById.getClass();
            this.f76244a = (TextView) viewFindViewById;
        }
    }

    public b(List<ff2.a> list) {
        this.f76243a = list;
    }

    public static String r(long j8) {
        j0 j0Var = j0.f23099a;
        Long lValueOf = Long.valueOf(j8);
        j0Var.getClass();
        String strB = j0.b(j0.B(lValueOf), "M/d/yy HH:mm", null);
        return strB == null ? "Invalid Date" : strB;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        List<ff2.a> list = this.f76243a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a aVar = (a) f0Var;
        aVar.getClass();
        List<ff2.a> list = this.f76243a;
        if (list != null) {
            TextView textView = aVar.f76244a;
            ff2.a aVar2 = list.get(i14);
            long campaignId = aVar2.getCampaignId();
            String offerType = aVar2.getOfferType();
            String strR = r(aVar2.getCampaignBeginTimestamp());
            String strR2 = r(aVar2.getCampaignEndTimestamp());
            String strR3 = r(aVar2.getUpdateTimestamp());
            String offerBodyText = aVar2.getOfferPayload().getOfferBodyText();
            String offerHeaderText = aVar2.getOfferPayload().getOfferHeaderText();
            String offerImageUrl = aVar2.getOfferPayload().getOfferImageUrl();
            String offerShopNowButtonText = aVar2.getOfferPayload().getOfferShopNowButtonText();
            String offerTitleText = aVar2.getOfferPayload().getOfferTitleText();
            String offerViewDetailsButtonText = aVar2.getOfferPayload().getOfferViewDetailsButtonText();
            String detailEmailOfferButtonText = aVar2.getDetailPayload().getDetailEmailOfferButtonText();
            String detailImageUrl = aVar2.getDetailPayload().getDetailImageUrl();
            String detailPromoCode = aVar2.getDetailPayload().getDetailPromoCode();
            String detailPromoCodeDetailText = aVar2.getDetailPayload().getDetailPromoCodeDetailText();
            Long detailPromoCodeExpirationDate = aVar2.getDetailPayload().getDetailPromoCodeExpirationDate();
            String detailShopNowUrl = aVar2.getDetailPayload().getDetailShopNowUrl();
            String detailTitleText = aVar2.getDetailPayload().getDetailTitleText();
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(campaignId, "CampaignId : ", "\nOfferType : ", offerType);
            sn.a.t(sbK, "\nCampaignBeginTime : ", strR, "\nCampaignEndTime : ", strR2);
            sn.a.t(sbK, "\nUpdateTime : ", strR3, "\nOfferBodyText : ", offerBodyText);
            sn.a.t(sbK, "\nOfferHeaderText : ", offerHeaderText, "\nOfferImageUrl : ", offerImageUrl);
            sn.a.t(sbK, "\nOfferShopNowButtonText : ", offerShopNowButtonText, "\nOfferTitleText : ", offerTitleText);
            sn.a.t(sbK, "\nOfferViewDetailsButtonText : ", offerViewDetailsButtonText, "\nDetailEmailOfferButtonText : ", detailEmailOfferButtonText);
            sn.a.t(sbK, "\nDetailImageUrl : ", detailImageUrl, "\nDetailPromoCode : ", detailPromoCode);
            sbK.append("\nDetailPromoCodeDetailText : ");
            sbK.append(detailPromoCodeDetailText);
            sbK.append("\nDetailPromoCodeExpirationDate : ");
            sbK.append(detailPromoCodeExpirationDate);
            sn.a.t(sbK, "\nDetailShopNowUrl : ", detailShopNowUrl, "\nDetailTitleText : ", detailTitleText);
            sbK.append("\n");
            textView.setText(sbK.toString());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.developer_option_campaign_details, viewGroup, false);
        viewE.getClass();
        return new a(viewE);
    }
}
