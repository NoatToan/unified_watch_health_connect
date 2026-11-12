package com.huawei.pluginachievement.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.GiftInfo;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.pap;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qqs;
import defpackage.qqz;
import defpackage.qrk;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.Calendar;
import java.util.Map;

/* JADX INFO: loaded from: classes41.dex */
public class KakaToGiftView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f22293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22295c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private LinearLayout i;
    private HealthTextView j;
    private HealthTextView k;
    private ImageView l;
    private ImageView m;
    private GiftInfo n;
    private HealthTextView o;
    private LinearLayout q;

    public KakaToGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22294b = context;
        d();
    }

    private void d() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.kaka_exchange_item_layout, this);
        this.q = (LinearLayout) viewInflate.findViewById(R.id.left_days_layout);
        this.j = (HealthTextView) viewInflate.findViewById(R.id.exchange_end_text);
        this.e = (HealthTextView) viewInflate.findViewById(R.id.exchange_end_left_day);
        this.f22293a = (HealthTextView) viewInflate.findViewById(R.id.exchange_end_left_hour);
        this.g = (HealthTextView) viewInflate.findViewById(R.id.exchange_end_left_sec_point);
        this.f22295c = (HealthTextView) viewInflate.findViewById(R.id.exchange_end_left_min);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.exchange_end_left_sec);
        this.l = (ImageView) viewInflate.findViewById(R.id.exchange_goods_image);
        this.k = (HealthTextView) viewInflate.findViewById(R.id.exchange_goods_name);
        this.f = (HealthTextView) viewInflate.findViewById(R.id.exchange_goods_detail);
        final LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.exchange_goods_detail_layout);
        final ImageView imageView = (ImageView) viewInflate.findViewById(R.id.kaka_gift_detail);
        this.f.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.pluginachievement.ui.views.KakaToGiftView.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (KakaToGiftView.this.f.getMeasuredWidth() == linearLayout.getMeasuredWidth() && KakaToGiftView.this.f.getMeasuredWidth() != 0) {
                    LogUtil.a("KakaToGiftView", "detailLayout.getMeasuredWidth() = ", Integer.valueOf(linearLayout.getMeasuredWidth()));
                    LogUtil.a("KakaToGiftView", "kakaGiftDetail.getMeasuredWidth() = ", Integer.valueOf(imageView.getMeasuredWidth()));
                    KakaToGiftView.this.f.setMaxWidth(linearLayout.getMeasuredWidth() - imageView.getMeasuredWidth());
                }
                if (KakaToGiftView.this.f.getMeasuredWidth() != 0) {
                    KakaToGiftView.this.f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
        this.h = (HealthTextView) viewInflate.findViewById(R.id.exchange_goods_has_exchanged);
        this.i = (LinearLayout) viewInflate.findViewById(R.id.exchange_goods_btn);
        this.o = (HealthTextView) viewInflate.findViewById(R.id.exchange_goods_text);
        this.m = (ImageView) viewInflate.findViewById(R.id.exchange_goods_iv);
        if (LanguageUtil.ba(this.f22294b)) {
            imageView.setImageDrawable(qqz.e(this.f22294b, R.mipmap.achieve_kaka_more));
        }
    }

    public void setGiftInfo(GiftInfo giftInfo) {
        LogUtil.d("KakaToGiftView", "setGiftInfo giftInfo getAwardItemId= ", giftInfo.getAwardItemId());
        this.n = giftInfo;
        b();
    }

    public void setExchangeBtnClickListener(View.OnClickListener onClickListener) {
        this.i.setOnClickListener(onClickListener);
    }

    private void b() {
        if (this.n == null) {
            LogUtil.j("KakaToGiftView", "updateAllView mGiftInfo == null");
            return;
        }
        a();
        this.k.setText(this.n.getAwardName());
        if ("1".equals(this.n.getAwardType())) {
            this.f.setText(this.f22294b.getString(R.string.IDS_achieve_kaka_goods_details));
        } else if ("2".equals(this.n.getAwardType())) {
            this.f.setText(this.f22294b.getString(R.string.IDS_achieve_kaka_coupon_details));
        } else {
            LogUtil.j("KakaToGiftView", "updateTimeView error gift type");
        }
        this.h.setText(this.f22294b.getString(R.string.IDS_achieve_kaka_today_exchanged, UnitUtil.e(a(this.n), 2, 1)));
        this.o.setText(UnitUtil.e(this.n.getKakaPoint(), 1, 0));
        e();
    }

    private float a(GiftInfo giftInfo) {
        float f;
        float f2;
        if (giftInfo == null) {
            return 0.0f;
        }
        int dayNum = giftInfo.getDayNum();
        int dayConsumed = giftInfo.getDayConsumed();
        int num = giftInfo.getNum();
        int remainingNum = giftInfo.getRemainingNum();
        LogUtil.a("KakaToGiftView", "getQuotient DayNum ", Integer.valueOf(dayNum), " total ", Integer.valueOf(num), " DayConsumed ", Integer.valueOf(dayConsumed), "remainingNum ", Integer.valueOf(remainingNum));
        if (dayNum != 0 && remainingNum != 0) {
            f = dayConsumed * 100.0f;
            f2 = dayNum;
        } else {
            if (num == 0) {
                return 0.0f;
            }
            f = (num - remainingNum) * 100.0f;
            f2 = num;
        }
        return f / f2;
    }

    private void a() {
        String str;
        GiftInfo giftInfo = this.n;
        if (giftInfo == null) {
            return;
        }
        Map<String, String> pictures = giftInfo.getPictures();
        if (pictures != null && pictures.containsKey("MIDDLE")) {
            str = pictures.get("MIDDLE");
        } else {
            str = "";
        }
        RequestOptions requestOptions = new RequestOptions();
        qqf.b(requestOptions, R.mipmap.achieve_kaka_gift_img_default);
        qqf.e(str, requestOptions, this.l);
    }

    public void e() {
        GiftInfo giftInfo = this.n;
        if (giftInfo == null) {
            LogUtil.j("KakaToGiftView", "updateTimeView mGiftInfo == null");
            return;
        }
        long startTime = giftInfo.getStartTime();
        long endTime = this.n.getEndTime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (startTime > jCurrentTimeMillis) {
            c(startTime);
            return;
        }
        if (startTime <= jCurrentTimeMillis && jCurrentTimeMillis <= endTime) {
            e(endTime);
            return;
        }
        this.j.setText(this.f22294b.getString(R.string.IDS_achieve_kaka_exchange_end));
        this.e.setText("");
        this.i.setBackgroundResource(R.drawable.kaka_to_gift_not_enough_btn_bg);
        this.h.setText(this.f22294b.getString(R.string.IDS_activity_social_is_over));
        String strB = pap.b(0);
        this.f22293a.setText(strB);
        this.f22295c.setText(strB);
        this.d.setText(strB);
    }

    private void c(long j) {
        String strD;
        this.i.setBackgroundResource(R.drawable.kaka_to_gift_not_enough_btn_bg);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (LanguageUtil.c(this.f22294b) && j - jCurrentTimeMillis > 86400000) {
            this.j.setText(this.f22294b.getString(R.string.IDS_achieve_kaka_gift_start, UnitUtil.d("MM/dd", j)));
            this.q.setVisibility(8);
            return;
        }
        this.q.setVisibility(0);
        this.j.setText(this.f22294b.getString(R.string.IDS_achieve_kaka_exchange_start));
        if (LanguageUtil.o(this.f22294b)) {
            String strC = qrk.c(j);
            if (strC.length() <= 5) {
                strD = "";
            } else {
                strD = strC.substring(5);
            }
        } else {
            strD = UnitUtil.d("MM/dd", j);
        }
        this.e.setText(strD);
        if (LanguageUtil.c(this.f22294b) && !pap.e(jCurrentTimeMillis, j)) {
            this.e.setVisibility(8);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        this.f22293a.setText(pap.b(i));
        this.f22295c.setText(pap.b(i2));
        this.d.setVisibility(8);
        this.g.setVisibility(8);
    }

    private void e(long j) {
        int color;
        if (this.n.getRemainingNum() > 0) {
            this.i.setBackgroundResource(R.drawable.kaka_to_gift_btn_bg);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (LanguageUtil.c(this.f22294b)) {
                long j2 = j - jCurrentTimeMillis;
                if (j2 > 86400000) {
                    int i = (int) (j2 / 86400000);
                    this.j.setText(getResources().getQuantityString(R.plurals.IDS_achieve_kaka_gift_end, i, UnitUtil.e(i, 1, 0)));
                    this.q.setVisibility(8);
                    return;
                }
            }
            this.q.setVisibility(0);
            this.j.setText(this.f22294b.getString(R.string.IDS_achieve_kaka_exchange_end));
            int[] iArrB = pap.b(j - jCurrentTimeMillis);
            String strE = UnitUtil.e(iArrB[0], 1, 0);
            if (iArrB[0] == 0) {
                this.e.setVisibility(8);
            } else {
                this.e.setText(getResources().getQuantityString(R.plurals.IDS_plugin_achievement_days, iArrB[0], strE));
            }
            this.f22293a.setText(pap.b(iArrB[1]));
            this.f22295c.setText(pap.b(iArrB[2]));
            this.d.setText(pap.b(iArrB[3]));
            return;
        }
        boolean zE = qqs.e(this.f22294b);
        this.i.setBackgroundResource(R.drawable.kaka_to_gift_not_enough_bg);
        this.i.getBackground().setAlpha(zE ? 102 : 153);
        if (zE) {
            color = this.f22294b.getColor(R.color.common_white_40alpha);
        } else {
            color = this.f22294b.getColor(R.color.common_white_70alpha);
        }
        this.o.setTextColor(color);
        this.m.setAlpha(zE ? 0.4f : 0.7f);
        this.j.setText(this.f22294b.getString(R.string.IDS_achieve_gift_is_over));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, qqp.a(this.f22294b, 10.0f), 0, 0);
        this.j.setLayoutParams(layoutParams);
        this.q.setVisibility(8);
    }
}
