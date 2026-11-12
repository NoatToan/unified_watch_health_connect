package com.huawei.featureuserprofile.award.ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.featureuserprofile.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.datatype.AwardRecordsBean;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.cvk;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AwardExpiredAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<AwardRecordsBean> f5514a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f5515c;

    AwardExpiredAdapter(Context context) {
        if (context != null) {
            if (context instanceof Activity) {
                this.f5515c = ((Activity) context).getLayoutInflater();
                return;
            } else {
                this.f5515c = LayoutInflater.from(context);
                return;
            }
        }
        LogUtil.e("AwardExpiredAdapter", "constructor context is null");
    }

    void d(List<AwardRecordsBean> list) {
        List<AwardRecordsBean> list2 = this.f5514a;
        if (list2 == null) {
            this.f5514a = new ArrayList();
        } else {
            list2.clear();
        }
        this.f5514a.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this.f5515c.inflate(R.layout.item_my_award_expired, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        if (njy.e(this.f5514a, i)) {
            LogUtil.j("AwardExpiredAdapter", "mAwardRecordsBeanList isOutOfBounds");
            return;
        }
        AwardRecordsBean awardRecordsBean = this.f5514a.get(i);
        f(aVar, awardRecordsBean);
        if ("1".equals(awardRecordsBean.getAwardType())) {
            o(aVar, awardRecordsBean);
            g(aVar, awardRecordsBean);
        } else if ("4".equals(awardRecordsBean.getAwardType())) {
            o(aVar, awardRecordsBean);
            aVar.f5520b.setVisibility(8);
        } else {
            h(aVar, awardRecordsBean);
            b(aVar, awardRecordsBean);
        }
    }

    private void b(a aVar, AwardRecordsBean awardRecordsBean) {
        if ("1".equals(awardRecordsBean.getTicketType())) {
            g(aVar, awardRecordsBean);
        } else {
            aVar.f5520b.setVisibility(8);
        }
    }

    private void f(a aVar, AwardRecordsBean awardRecordsBean) {
        j(aVar, awardRecordsBean);
        a(aVar, awardRecordsBean);
        d(aVar, awardRecordsBean);
        e(aVar, awardRecordsBean);
        c(aVar, awardRecordsBean);
        i(aVar, awardRecordsBean);
        n(aVar, awardRecordsBean);
    }

    private void j(a aVar, AwardRecordsBean awardRecordsBean) {
        if (awardRecordsBean.getPictures() == null || TextUtils.isEmpty(awardRecordsBean.getPictures().getDefaultImg())) {
            return;
        }
        qqf.e(awardRecordsBean.getPictures().getMiddle(), RequestOptions.bitmapTransform(new RoundedCorners(8)).centerInside(), aVar.h);
    }

    private void a(a aVar, AwardRecordsBean awardRecordsBean) {
        if (!TextUtils.isEmpty(awardRecordsBean.getAwardName())) {
            aVar.g.setText(awardRecordsBean.getAwardName());
            aVar.g.setVisibility(0);
        } else {
            LogUtil.e("AwardExpiredAdapter", "expired award name is empty");
            aVar.g.setVisibility(8);
        }
    }

    private void e(a aVar, AwardRecordsBean awardRecordsBean) {
        if (!TextUtils.isEmpty(awardRecordsBean.getActivityName())) {
            if (awardRecordsBean.getSource() == 1) {
                aVar.f5521c.setText(BaseApplication.getContext().getString(R.string.IDS_my_award_activity_name, awardRecordsBean.getActivityName()));
                aVar.f5521c.setVisibility(0);
                return;
            } else {
                aVar.f5521c.setVisibility(8);
                return;
            }
        }
        if (awardRecordsBean.getSource() == 2) {
            aVar.f5521c.setVisibility(0);
            if (awardRecordsBean.getSourceDetail() == 20001) {
                aVar.f5521c.setText(BaseApplication.getContext().getString(R.string.IDS_my_award_activity_name, BaseApplication.getContext().getString(R.string.IDS_activity_social_kaka_lottery)));
                return;
            } else {
                aVar.f5521c.setText(BaseApplication.getContext().getString(R.string.IDS_my_award_activity_name, BaseApplication.getContext().getString(R.string.IDS_achieve_kaka_to_gifts)));
                return;
            }
        }
        aVar.f5521c.setVisibility(8);
    }

    private void d(a aVar, AwardRecordsBean awardRecordsBean) {
        if (awardRecordsBean.getIsMember() == 1) {
            cvk.d(aVar.j);
        } else {
            aVar.j.setVisibility(8);
        }
    }

    private void o(a aVar, AwardRecordsBean awardRecordsBean) {
        if (awardRecordsBean.getWonTime() > 0 && awardRecordsBean.getExpireTime() > 0) {
            aVar.f.setText(BaseApplication.getContext().getString(R.string.IDS_my_award_valid_period, DateFormatUtil.d(awardRecordsBean.getWonTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD), DateFormatUtil.d(awardRecordsBean.getExpireTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD)));
            aVar.f.setVisibility(0);
        } else {
            aVar.f.setVisibility(8);
        }
    }

    private void h(a aVar, AwardRecordsBean awardRecordsBean) {
        if (awardRecordsBean.getEffectiveStartTime() > 0 && awardRecordsBean.getEffectiveEndTime() > 0) {
            aVar.f.setText(BaseApplication.getContext().getString(R.string.IDS_my_award_valid_period, DateFormatUtil.d(awardRecordsBean.getEffectiveStartTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD), DateFormatUtil.d(awardRecordsBean.getEffectiveEndTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD)));
            aVar.f.setVisibility(0);
        } else {
            aVar.f.setVisibility(8);
        }
    }

    private void c(final a aVar, final AwardRecordsBean awardRecordsBean) {
        aVar.f5519a.setVisibility(0);
        aVar.f5519a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.award.ui.AwardExpiredAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (awardRecordsBean.isExpand()) {
                    aVar.e.setVisibility(8);
                    aVar.f5519a.setImageResource(R.drawable.ic_arrow_down);
                    awardRecordsBean.setExpand(false);
                } else {
                    aVar.e.setVisibility(0);
                    aVar.f5519a.setImageResource(R.drawable.ic_arrow_up);
                    awardRecordsBean.setExpand(true);
                }
            }
        });
    }

    private void g(a aVar, AwardRecordsBean awardRecordsBean) {
        if (!TextUtils.isEmpty(awardRecordsBean.getExchangeCode())) {
            aVar.f5520b.setText(BaseApplication.getContext().getString(R.string.IDS_my_award_coupon_code, awardRecordsBean.getExchangeCode()));
            aVar.f5520b.setVisibility(0);
        } else {
            aVar.f5520b.setVisibility(8);
        }
    }

    private void i(a aVar, AwardRecordsBean awardRecordsBean) {
        if (!TextUtils.isEmpty(awardRecordsBean.getDescription())) {
            aVar.d.setText(awardRecordsBean.getDescription());
            aVar.d.setVisibility(0);
        } else {
            aVar.d.setVisibility(8);
        }
    }

    private void n(a aVar, AwardRecordsBean awardRecordsBean) {
        if (awardRecordsBean.getWonTime() > 0) {
            aVar.i.setText(BaseApplication.getContext().getString(R.string.IDS_my_award_time_to_win, qrk.d(awardRecordsBean.getWonTime())));
            aVar.i.setVisibility(0);
        } else {
            aVar.i.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<AwardRecordsBean> list = this.f5514a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f5519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f5520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f5521c;
        HealthTextView d;
        LinearLayout e;
        HealthTextView f;
        HealthTextView g;
        ImageView h;
        HealthTextView i;
        HealthTextView j;

        a(View view) {
            super(view);
            this.h = (ImageView) view.findViewById(R.id.my_award_icon);
            this.g = (HealthTextView) view.findViewById(R.id.my_award_title);
            this.j = (HealthTextView) view.findViewById(R.id.vip_corner_mark);
            this.f5521c = (HealthTextView) view.findViewById(R.id.my_award_activity_name);
            this.f = (HealthTextView) view.findViewById(R.id.my_award_valid_date);
            this.f5519a = (ImageView) view.findViewById(R.id.my_award_arrow);
            this.e = (LinearLayout) view.findViewById(R.id.expand_container);
            this.f5520b = (HealthTextView) view.findViewById(R.id.my_award_code);
            this.d = (HealthTextView) view.findViewById(R.id.my_award_description);
            this.i = (HealthTextView) view.findViewById(R.id.my_award_won_time);
        }
    }
}
