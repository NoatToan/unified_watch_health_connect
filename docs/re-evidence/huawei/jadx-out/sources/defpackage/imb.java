package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huawei.health.tradeservice.R;
import com.huawei.health.tradeservice.view.TradeInformationLayout;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.datatype.ProductSummary;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes32.dex */
public class imb extends Dialog implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f37811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f37812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ProductSummary f37813c;
    private final ProductSummary d;
    private final Context e;
    private final TradeInformationLayout f;

    public imb(Context context, TradeInformationLayout tradeInformationLayout, IBaseResponseCallback iBaseResponseCallback, ProductSummary productSummary, ProductSummary productSummary2) {
        super(context, R.style.retain_dialog_dim_style);
        this.e = context;
        this.f = tradeInformationLayout;
        this.f37813c = productSummary;
        this.d = productSummary2;
        this.f37811a = iBaseResponseCallback;
        d();
        setCanceledOnTouchOutside(false);
    }

    private void d() {
        String strC;
        View viewInflate = ((LayoutInflater) this.e.getSystemService("layout_inflater")).inflate(R.layout.trade_retain_vip, (ViewGroup) null);
        this.f37812b = viewInflate;
        setContentView(viewInflate);
        HealthTextView healthTextView = (HealthTextView) this.f37812b.findViewById(R.id.origin_price);
        String currency = this.d.getCurrency();
        double microPrice = this.d.getMicroPrice() / 1000000.0f;
        healthTextView.setText(ily.c(currency, microPrice));
        healthTextView.setPaintFlags(16);
        double microPrice2 = this.f37813c.getMicroPrice() / 1000000.0f;
        String strC2 = ily.c(currency, microPrice2);
        SpannableString spannableString = new SpannableString(strC2);
        String strE = ily.e(currency);
        int iIndexOf = strC2.indexOf(strE);
        if (iIndexOf != -1) {
            spannableString.setSpan(new AbsoluteSizeSpan(this.e.getResources().getDimensionPixelSize(R.dimen.textSizeOverLine)), iIndexOf, strE.length() + iIndexOf, 33);
        }
        ((HealthTextView) this.f37812b.findViewById(R.id.current_price)).setText(spannableString);
        String strA = ily.a(ily.e(microPrice, 2) - ily.e(microPrice2, 2));
        if (LanguageUtil.l(this.e)) {
            strC = strA + " 元";
        } else {
            strC = ily.c(currency, microPrice - microPrice2);
        }
        SpannableString spannableString2 = new SpannableString(this.e.getResources().getString(R.string.IDS_buy_and_save_money, strC));
        int iIndexOf2 = spannableString2.toString().indexOf(strA);
        if (iIndexOf2 != -1) {
            spannableString2.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.e, R.color.weight_tips_color_5)), iIndexOf2, strA.length() + iIndexOf2, 33);
            spannableString2.setSpan(new AbsoluteSizeSpan(this.e.getResources().getDimensionPixelSize(R.dimen.textSizeHeadline7)), iIndexOf2, strA.length() + iIndexOf2, 33);
        } else {
            LogUtil.j("RetainDialog", "price not found");
        }
        ((HealthTextView) this.f37812b.findViewById(R.id.save_money_message)).setText(spannableString2);
        ((HealthButton) this.f37812b.findViewById(R.id.buy_now)).setOnClickListener(this);
        ((HealthButton) this.f37812b.findViewById(R.id.cancel_buy_vip)).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.buy_now) {
            LogUtil.a("RetainDialog", "buy now");
            dismiss();
            this.f.a();
            IBaseResponseCallback iBaseResponseCallback = this.f37811a;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(1, null);
            }
            ily.d(2, this.e);
            return;
        }
        if (view.getId() == R.id.cancel_buy_vip) {
            LogUtil.a("RetainDialog", "cancel buying");
            dismiss();
            IBaseResponseCallback iBaseResponseCallback2 = this.f37811a;
            if (iBaseResponseCallback2 != null) {
                iBaseResponseCallback2.a(0, null);
            }
            ily.d(3, this.e);
            return;
        }
        LogUtil.j("RetainDialog", "nothing to do");
    }
}
