package com.huawei.health.marketing.views;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.datatype.Coupon;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.njy;
import defpackage.qhu;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes29.dex */
public class CouponInfoAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f8289c;
    private List<Coupon> e;

    public CouponInfoAdapter(Context context, List<Coupon> list) {
        new ArrayList();
        this.f8289c = context;
        this.e = list;
    }

    public void d(List<Coupon> list) {
        this.e = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.f8289c).inflate(R.layout.item_coupon_info, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (njy.e(this.e, i)) {
            LogUtil.j("TradeOrderAdapter", "mCurrentPlansList is null");
        } else {
            b(viewHolder, this.e.get(i));
        }
    }

    private void b(ViewHolder viewHolder, Coupon coupon) {
        String strE;
        String str;
        LogUtil.a("TradeOrderAdapter", "enter showView", Integer.valueOf(coupon.getFeeMode()));
        if (coupon.getFeeMode() == 2) {
            try {
                if (LanguageUtil.an(this.f8289c)) {
                    strE = a(Double.valueOf(coupon.getDiscount()).doubleValue() * 10.0d);
                    str = String.format(Locale.ROOT, this.f8289c.getString(R.string.IDS_discount), strE);
                } else {
                    strE = UnitUtil.e((1.0d - Double.valueOf(coupon.getDiscount()).doubleValue()) * 100.0d, 2, 0);
                    str = String.format(Locale.ROOT, this.f8289c.getString(R.string.IDS_discount), strE);
                }
                c(str, strE, viewHolder.f8292c);
            } catch (NumberFormatException unused) {
                LogUtil.e("TradeOrderAdapter", "DISCOUNT_COUPON NumberFormatException");
            }
        } else if (coupon.getFeeMode() == 1) {
            String strD = qhu.d(coupon.getCurrency());
            try {
                String strA = a(Long.parseLong(coupon.getSubFee()) / 100.0f);
                if (LanguageUtil.ap(this.f8289c)) {
                    strA = qhu.a(strA);
                }
                c(String.format(Locale.ROOT, this.f8289c.getString(R.string.IDS_currency_money), strD, strA), strA, viewHolder.f8292c);
            } catch (NumberFormatException unused2) {
                LogUtil.e("TradeOrderAdapter", "FULL_DISCOUNT_COUPON NumberFormatException");
            }
        } else {
            String strD2 = qhu.d(coupon.getCurrency());
            try {
                String strA2 = a(Long.parseLong(coupon.getFaceValue()) / 100.0f);
                if (LanguageUtil.ap(this.f8289c)) {
                    strA2 = qhu.a(strA2);
                }
                c(String.format(Locale.ROOT, this.f8289c.getString(R.string.IDS_currency_money), strD2, strA2), strA2, viewHolder.f8292c);
            } catch (NumberFormatException unused3) {
                LogUtil.e("TradeOrderAdapter", "NumberFormatException");
            }
        }
        viewHolder.e.setText(coupon.getCouponName());
        if (TextUtils.isEmpty(coupon.getCouponSubTitle())) {
            viewHolder.f8291b.setVisibility(8);
        } else {
            viewHolder.f8291b.setText(coupon.getCouponSubTitle());
            viewHolder.f8291b.setVisibility(0);
        }
        b(coupon, viewHolder);
    }

    private void b(Coupon coupon, ViewHolder viewHolder) {
        if (coupon.isOutOfStockFlag()) {
            LogUtil.j("TradeOrderAdapter", "limit:", coupon.getCouponId());
            viewHolder.f8290a.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_limit_status));
        } else {
            viewHolder.f8290a.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_received));
        }
    }

    private String a(double d) {
        if (Math.round(d) - d == 0.0d) {
            return UnitUtil.e(d, 1, 0);
        }
        return UnitUtil.e(d, 1, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.e.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f8290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f8291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f8292c;
        private HealthTextView e;

        ViewHolder(View view) {
            super(view);
            this.f8292c = (HealthTextView) view.findViewById(R.id.tv_money);
            this.e = (HealthTextView) view.findViewById(R.id.tv_title);
            this.f8291b = (HealthTextView) view.findViewById(R.id.tv_detail);
            this.f8290a = (HealthTextView) view.findViewById(R.id.tv_status);
        }
    }

    private void c(String str, String str2, HealthTextView healthTextView) {
        if (TextUtils.isEmpty(str) || healthTextView == null) {
            return;
        }
        Context contextB = com.huawei.haf.application.BaseApplication.b();
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf = spannableString.toString().indexOf(str2);
        if (iIndexOf != -1) {
            spannableString.setSpan(new AbsoluteSizeSpan(contextB.getResources().getDimensionPixelSize(R.dimen.emui_text_size_headline7)), iIndexOf, str2.length() + iIndexOf, 33);
        }
        healthTextView.setText(spannableString);
    }
}
