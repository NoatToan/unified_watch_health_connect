package yb1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.promotions.CampaignInfoFullScreenActivity;
import com.garmin.android.apps.connectmobile.promotions.PromoCodeView;
import d53.u;
import e23.l;
import ff2.n;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CampaignInfoFullScreenActivity f195696b;

    public /* synthetic */ f(CampaignInfoFullScreenActivity campaignInfoFullScreenActivity, int i14) {
        this.f195695a = i14;
        this.f195696b = campaignInfoFullScreenActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f195695a;
        final CampaignInfoFullScreenActivity campaignInfoFullScreenActivity = this.f195696b;
        switch (i14) {
            case 0:
                ff2.a aVar = (ff2.a) obj;
                if (aVar != null) {
                    campaignInfoFullScreenActivity.f41036c = aVar;
                    final int i15 = 1;
                    campaignInfoFullScreenActivity.runOnUiThread(new Runnable() { // from class: yb1.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i16 = i15;
                            CampaignInfoFullScreenActivity campaignInfoFullScreenActivity2 = campaignInfoFullScreenActivity;
                            switch (i16) {
                                case 0:
                                    CampaignInfoFullScreenActivity.a aVar2 = CampaignInfoFullScreenActivity.f41033o;
                                    Toast.makeText(campaignInfoFullScreenActivity2, campaignInfoFullScreenActivity2.getResources().getString(R.string.txt_something_went_wrong_try_again), 0).show();
                                    return;
                                default:
                                    CampaignInfoFullScreenActivity.a aVar3 = CampaignInfoFullScreenActivity.f41033o;
                                    View viewFindViewById = campaignInfoFullScreenActivity2.findViewById(R.id.campaign_image_iv);
                                    viewFindViewById.getClass();
                                    campaignInfoFullScreenActivity2.f41037d = (ImageView) viewFindViewById;
                                    View viewFindViewById2 = campaignInfoFullScreenActivity2.findViewById(R.id.dismiss_button_iv);
                                    viewFindViewById2.getClass();
                                    campaignInfoFullScreenActivity2.f41038e = (ImageView) viewFindViewById2;
                                    View viewFindViewById3 = campaignInfoFullScreenActivity2.findViewById(R.id.offer_header_tv);
                                    viewFindViewById3.getClass();
                                    campaignInfoFullScreenActivity2.f41039f = (TextView) viewFindViewById3;
                                    View viewFindViewById4 = campaignInfoFullScreenActivity2.findViewById(R.id.offer_description_tv);
                                    viewFindViewById4.getClass();
                                    campaignInfoFullScreenActivity2.f41040g = (TextView) viewFindViewById4;
                                    View viewFindViewById5 = campaignInfoFullScreenActivity2.findViewById(R.id.offer_description_footer_tv);
                                    viewFindViewById5.getClass();
                                    campaignInfoFullScreenActivity2.f41041h = (TextView) viewFindViewById5;
                                    View viewFindViewById6 = campaignInfoFullScreenActivity2.findViewById(R.id.promo_code_view);
                                    viewFindViewById6.getClass();
                                    campaignInfoFullScreenActivity2.f41042i = (PromoCodeView) viewFindViewById6;
                                    View viewFindViewById7 = campaignInfoFullScreenActivity2.findViewById(R.id.shop_now_tv);
                                    viewFindViewById7.getClass();
                                    campaignInfoFullScreenActivity2.f41043j = (TextView) viewFindViewById7;
                                    View viewFindViewById8 = campaignInfoFullScreenActivity2.findViewById(R.id.email_offer_tv);
                                    viewFindViewById8.getClass();
                                    campaignInfoFullScreenActivity2.f41044k = (TextView) viewFindViewById8;
                                    ff2.a aVar4 = campaignInfoFullScreenActivity2.f41036c;
                                    if (aVar4 == null) {
                                        s.m("campaign");
                                        throw null;
                                    }
                                    n detailPayload = aVar4.getDetailPayload();
                                    TextView textView = campaignInfoFullScreenActivity2.f41039f;
                                    if (textView == null) {
                                        s.m("campaignHeaderTextView");
                                        throw null;
                                    }
                                    textView.setText(detailPayload.getDetailTitleText());
                                    TextView textView2 = campaignInfoFullScreenActivity2.f41040g;
                                    if (textView2 == null) {
                                        s.m("campaignDescriptionTextView");
                                        throw null;
                                    }
                                    textView2.setText(detailPayload.getDetailBodyText());
                                    TextView textView3 = campaignInfoFullScreenActivity2.f41041h;
                                    if (textView3 == null) {
                                        s.m("campaignDescriptionFooterTextView");
                                        throw null;
                                    }
                                    String detailBodyDetailText = detailPayload.getDetailBodyDetailText();
                                    if (detailBodyDetailText == null) {
                                        detailBodyDetailText = "";
                                    }
                                    textView3.setText(detailBodyDetailText);
                                    String detailPromoCode = detailPayload.getDetailPromoCode();
                                    if (detailPromoCode == null || detailPromoCode.length() == 0) {
                                        PromoCodeView promoCodeView = campaignInfoFullScreenActivity2.f41042i;
                                        if (promoCodeView == null) {
                                            s.m("promoCodeView");
                                            throw null;
                                        }
                                        promoCodeView.setVisibility(8);
                                        TextView textView4 = campaignInfoFullScreenActivity2.f41044k;
                                        if (textView4 == null) {
                                            s.m("emailActionTextView");
                                            throw null;
                                        }
                                        textView4.setVisibility(8);
                                        TextView textView5 = campaignInfoFullScreenActivity2.f41043j;
                                        if (textView5 == null) {
                                            s.m("shopActionTextView");
                                            throw null;
                                        }
                                        ViewGroup.LayoutParams layoutParams = textView5.getLayoutParams();
                                        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
                                        if (layoutParams2 != null) {
                                            layoutParams2.bottomMargin = campaignInfoFullScreenActivity2.getResources().getDimensionPixelSize(R.dimen.spacing_large);
                                            TextView textView6 = campaignInfoFullScreenActivity2.f41043j;
                                            if (textView6 == null) {
                                                s.m("shopActionTextView");
                                                throw null;
                                            }
                                            textView6.setLayoutParams(layoutParams2);
                                        }
                                    } else {
                                        PromoCodeView promoCodeView2 = campaignInfoFullScreenActivity2.f41042i;
                                        if (promoCodeView2 == null) {
                                            s.m("promoCodeView");
                                            throw null;
                                        }
                                        promoCodeView2.setPromotionCode(detailPayload.getDetailPromoCode());
                                        PromoCodeView promoCodeView3 = campaignInfoFullScreenActivity2.f41042i;
                                        if (promoCodeView3 == null) {
                                            s.m("promoCodeView");
                                            throw null;
                                        }
                                        String detailPromoCodeDetailText = detailPayload.getDetailPromoCodeDetailText();
                                        promoCodeView3.f41051b.setText(detailPromoCodeDetailText != null ? u.v(detailPromoCodeDetailText, "[expiration_date]", j0.m(new DateTime(detailPayload.getDetailPromoCodeExpirationDate())), false) : null);
                                        TextView textView7 = campaignInfoFullScreenActivity2.f41044k;
                                        if (textView7 == null) {
                                            s.m("emailActionTextView");
                                            throw null;
                                        }
                                        textView7.setText(detailPayload.getDetailEmailOfferButtonText());
                                    }
                                    TextView textView8 = campaignInfoFullScreenActivity2.f41043j;
                                    if (textView8 == null) {
                                        s.m("shopActionTextView");
                                        throw null;
                                    }
                                    ff2.a aVar5 = campaignInfoFullScreenActivity2.f41036c;
                                    if (aVar5 == null) {
                                        s.m("campaign");
                                        throw null;
                                    }
                                    textView8.setText(aVar5.getOfferPayload().getOfferShopNowButtonText());
                                    PromoCodeView promoCodeView4 = campaignInfoFullScreenActivity2.f41042i;
                                    if (promoCodeView4 == null) {
                                        s.m("promoCodeView");
                                        throw null;
                                    }
                                    promoCodeView4.setCopyClickListener(campaignInfoFullScreenActivity2);
                                    TextView textView9 = campaignInfoFullScreenActivity2.f41043j;
                                    if (textView9 == null) {
                                        s.m("shopActionTextView");
                                        throw null;
                                    }
                                    textView9.setOnClickListener(campaignInfoFullScreenActivity2.f41046m);
                                    TextView textView10 = campaignInfoFullScreenActivity2.f41044k;
                                    if (textView10 == null) {
                                        s.m("emailActionTextView");
                                        throw null;
                                    }
                                    textView10.setOnClickListener(campaignInfoFullScreenActivity2.f41045l);
                                    ImageView imageView = campaignInfoFullScreenActivity2.f41038e;
                                    if (imageView == null) {
                                        s.m("dismissActionImageView");
                                        throw null;
                                    }
                                    imageView.setOnClickListener(campaignInfoFullScreenActivity2.f41047n);
                                    Logger loggerCa = campaignInfoFullScreenActivity2.ca();
                                    ff2.a aVar6 = campaignInfoFullScreenActivity2.f41036c;
                                    if (aVar6 == null) {
                                        s.m("campaign");
                                        throw null;
                                    }
                                    wr.g.v("Loading bitmap for campaign ", aVar6.getCampaignId(), " into image view: ", loggerCa);
                                    ImageView imageView2 = campaignInfoFullScreenActivity2.f41037d;
                                    if (imageView2 == null) {
                                        s.m("campaignImageView");
                                        throw null;
                                    }
                                    ff2.c cVar = campaignInfoFullScreenActivity2.f41035b;
                                    if (cVar == null) {
                                        s.m("interactor");
                                        throw null;
                                    }
                                    ff2.a aVar7 = campaignInfoFullScreenActivity2.f41036c;
                                    if (aVar7 != null) {
                                        imageView2.setImageBitmap(cVar.b(aVar7.getCampaignId(), kf2.c.DETAIL_TYPE));
                                        return;
                                    } else {
                                        s.m("campaign");
                                        throw null;
                                    }
                            }
                        }
                    });
                } else {
                    CampaignInfoFullScreenActivity.a aVar2 = CampaignInfoFullScreenActivity.f41033o;
                    campaignInfoFullScreenActivity.ca().error("Got a null campaign, finishing:");
                    if (!campaignInfoFullScreenActivity.isFinishing()) {
                        final int i16 = 0;
                        campaignInfoFullScreenActivity.runOnUiThread(new Runnable() { // from class: yb1.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i17 = i16;
                                CampaignInfoFullScreenActivity campaignInfoFullScreenActivity2 = campaignInfoFullScreenActivity;
                                switch (i17) {
                                    case 0:
                                        CampaignInfoFullScreenActivity.a aVar3 = CampaignInfoFullScreenActivity.f41033o;
                                        Toast.makeText(campaignInfoFullScreenActivity2, campaignInfoFullScreenActivity2.getResources().getString(R.string.txt_something_went_wrong_try_again), 0).show();
                                        return;
                                    default:
                                        CampaignInfoFullScreenActivity.a aVar4 = CampaignInfoFullScreenActivity.f41033o;
                                        View viewFindViewById = campaignInfoFullScreenActivity2.findViewById(R.id.campaign_image_iv);
                                        viewFindViewById.getClass();
                                        campaignInfoFullScreenActivity2.f41037d = (ImageView) viewFindViewById;
                                        View viewFindViewById2 = campaignInfoFullScreenActivity2.findViewById(R.id.dismiss_button_iv);
                                        viewFindViewById2.getClass();
                                        campaignInfoFullScreenActivity2.f41038e = (ImageView) viewFindViewById2;
                                        View viewFindViewById3 = campaignInfoFullScreenActivity2.findViewById(R.id.offer_header_tv);
                                        viewFindViewById3.getClass();
                                        campaignInfoFullScreenActivity2.f41039f = (TextView) viewFindViewById3;
                                        View viewFindViewById4 = campaignInfoFullScreenActivity2.findViewById(R.id.offer_description_tv);
                                        viewFindViewById4.getClass();
                                        campaignInfoFullScreenActivity2.f41040g = (TextView) viewFindViewById4;
                                        View viewFindViewById5 = campaignInfoFullScreenActivity2.findViewById(R.id.offer_description_footer_tv);
                                        viewFindViewById5.getClass();
                                        campaignInfoFullScreenActivity2.f41041h = (TextView) viewFindViewById5;
                                        View viewFindViewById6 = campaignInfoFullScreenActivity2.findViewById(R.id.promo_code_view);
                                        viewFindViewById6.getClass();
                                        campaignInfoFullScreenActivity2.f41042i = (PromoCodeView) viewFindViewById6;
                                        View viewFindViewById7 = campaignInfoFullScreenActivity2.findViewById(R.id.shop_now_tv);
                                        viewFindViewById7.getClass();
                                        campaignInfoFullScreenActivity2.f41043j = (TextView) viewFindViewById7;
                                        View viewFindViewById8 = campaignInfoFullScreenActivity2.findViewById(R.id.email_offer_tv);
                                        viewFindViewById8.getClass();
                                        campaignInfoFullScreenActivity2.f41044k = (TextView) viewFindViewById8;
                                        ff2.a aVar5 = campaignInfoFullScreenActivity2.f41036c;
                                        if (aVar5 == null) {
                                            s.m("campaign");
                                            throw null;
                                        }
                                        n detailPayload = aVar5.getDetailPayload();
                                        TextView textView = campaignInfoFullScreenActivity2.f41039f;
                                        if (textView == null) {
                                            s.m("campaignHeaderTextView");
                                            throw null;
                                        }
                                        textView.setText(detailPayload.getDetailTitleText());
                                        TextView textView2 = campaignInfoFullScreenActivity2.f41040g;
                                        if (textView2 == null) {
                                            s.m("campaignDescriptionTextView");
                                            throw null;
                                        }
                                        textView2.setText(detailPayload.getDetailBodyText());
                                        TextView textView3 = campaignInfoFullScreenActivity2.f41041h;
                                        if (textView3 == null) {
                                            s.m("campaignDescriptionFooterTextView");
                                            throw null;
                                        }
                                        String detailBodyDetailText = detailPayload.getDetailBodyDetailText();
                                        if (detailBodyDetailText == null) {
                                            detailBodyDetailText = "";
                                        }
                                        textView3.setText(detailBodyDetailText);
                                        String detailPromoCode = detailPayload.getDetailPromoCode();
                                        if (detailPromoCode == null || detailPromoCode.length() == 0) {
                                            PromoCodeView promoCodeView = campaignInfoFullScreenActivity2.f41042i;
                                            if (promoCodeView == null) {
                                                s.m("promoCodeView");
                                                throw null;
                                            }
                                            promoCodeView.setVisibility(8);
                                            TextView textView4 = campaignInfoFullScreenActivity2.f41044k;
                                            if (textView4 == null) {
                                                s.m("emailActionTextView");
                                                throw null;
                                            }
                                            textView4.setVisibility(8);
                                            TextView textView5 = campaignInfoFullScreenActivity2.f41043j;
                                            if (textView5 == null) {
                                                s.m("shopActionTextView");
                                                throw null;
                                            }
                                            ViewGroup.LayoutParams layoutParams = textView5.getLayoutParams();
                                            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
                                            if (layoutParams2 != null) {
                                                layoutParams2.bottomMargin = campaignInfoFullScreenActivity2.getResources().getDimensionPixelSize(R.dimen.spacing_large);
                                                TextView textView6 = campaignInfoFullScreenActivity2.f41043j;
                                                if (textView6 == null) {
                                                    s.m("shopActionTextView");
                                                    throw null;
                                                }
                                                textView6.setLayoutParams(layoutParams2);
                                            }
                                        } else {
                                            PromoCodeView promoCodeView2 = campaignInfoFullScreenActivity2.f41042i;
                                            if (promoCodeView2 == null) {
                                                s.m("promoCodeView");
                                                throw null;
                                            }
                                            promoCodeView2.setPromotionCode(detailPayload.getDetailPromoCode());
                                            PromoCodeView promoCodeView3 = campaignInfoFullScreenActivity2.f41042i;
                                            if (promoCodeView3 == null) {
                                                s.m("promoCodeView");
                                                throw null;
                                            }
                                            String detailPromoCodeDetailText = detailPayload.getDetailPromoCodeDetailText();
                                            promoCodeView3.f41051b.setText(detailPromoCodeDetailText != null ? u.v(detailPromoCodeDetailText, "[expiration_date]", j0.m(new DateTime(detailPayload.getDetailPromoCodeExpirationDate())), false) : null);
                                            TextView textView7 = campaignInfoFullScreenActivity2.f41044k;
                                            if (textView7 == null) {
                                                s.m("emailActionTextView");
                                                throw null;
                                            }
                                            textView7.setText(detailPayload.getDetailEmailOfferButtonText());
                                        }
                                        TextView textView8 = campaignInfoFullScreenActivity2.f41043j;
                                        if (textView8 == null) {
                                            s.m("shopActionTextView");
                                            throw null;
                                        }
                                        ff2.a aVar6 = campaignInfoFullScreenActivity2.f41036c;
                                        if (aVar6 == null) {
                                            s.m("campaign");
                                            throw null;
                                        }
                                        textView8.setText(aVar6.getOfferPayload().getOfferShopNowButtonText());
                                        PromoCodeView promoCodeView4 = campaignInfoFullScreenActivity2.f41042i;
                                        if (promoCodeView4 == null) {
                                            s.m("promoCodeView");
                                            throw null;
                                        }
                                        promoCodeView4.setCopyClickListener(campaignInfoFullScreenActivity2);
                                        TextView textView9 = campaignInfoFullScreenActivity2.f41043j;
                                        if (textView9 == null) {
                                            s.m("shopActionTextView");
                                            throw null;
                                        }
                                        textView9.setOnClickListener(campaignInfoFullScreenActivity2.f41046m);
                                        TextView textView10 = campaignInfoFullScreenActivity2.f41044k;
                                        if (textView10 == null) {
                                            s.m("emailActionTextView");
                                            throw null;
                                        }
                                        textView10.setOnClickListener(campaignInfoFullScreenActivity2.f41045l);
                                        ImageView imageView = campaignInfoFullScreenActivity2.f41038e;
                                        if (imageView == null) {
                                            s.m("dismissActionImageView");
                                            throw null;
                                        }
                                        imageView.setOnClickListener(campaignInfoFullScreenActivity2.f41047n);
                                        Logger loggerCa = campaignInfoFullScreenActivity2.ca();
                                        ff2.a aVar7 = campaignInfoFullScreenActivity2.f41036c;
                                        if (aVar7 == null) {
                                            s.m("campaign");
                                            throw null;
                                        }
                                        wr.g.v("Loading bitmap for campaign ", aVar7.getCampaignId(), " into image view: ", loggerCa);
                                        ImageView imageView2 = campaignInfoFullScreenActivity2.f41037d;
                                        if (imageView2 == null) {
                                            s.m("campaignImageView");
                                            throw null;
                                        }
                                        ff2.c cVar = campaignInfoFullScreenActivity2.f41035b;
                                        if (cVar == null) {
                                            s.m("interactor");
                                            throw null;
                                        }
                                        ff2.a aVar8 = campaignInfoFullScreenActivity2.f41036c;
                                        if (aVar8 != null) {
                                            imageView2.setImageBitmap(cVar.b(aVar8.getCampaignId(), kf2.c.DETAIL_TYPE));
                                            return;
                                        } else {
                                            s.m("campaign");
                                            throw null;
                                        }
                                }
                            }
                        });
                    }
                    campaignInfoFullScreenActivity.finish();
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                CampaignInfoFullScreenActivity.a aVar3 = CampaignInfoFullScreenActivity.f41033o;
                if (!campaignInfoFullScreenActivity.isFinishing()) {
                    campaignInfoFullScreenActivity.runOnUiThread(new a0.a(campaignInfoFullScreenActivity, zBooleanValue, 15));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
