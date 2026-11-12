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
import com.huawei.featureuserprofile.award.listener.OnClickAddressButtonListener;
import com.huawei.featureuserprofile.award.listener.OnClickCopyListener;
import com.huawei.featureuserprofile.award.model.AddressInfo;
import com.huawei.featureuserprofile.award.model.SaveInfoItem;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.datatype.AwardRecordsBean;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.cvk;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrk;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AwardValidAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnClickCopyListener f5524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<AwardRecordsBean> f5525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f5526c;
    private LayoutInflater d;
    private OnClickAddressButtonListener e;

    AwardValidAdapter(Context context) {
        if (context != null) {
            this.f5526c = context;
            if (context instanceof Activity) {
                this.d = ((Activity) context).getLayoutInflater();
                return;
            } else {
                this.d = LayoutInflater.from(context);
                return;
            }
        }
        LogUtil.e("AwardValidAdapter", "constructor context is null");
    }

    void a(OnClickAddressButtonListener onClickAddressButtonListener) {
        this.e = onClickAddressButtonListener;
    }

    void c(OnClickCopyListener onClickCopyListener) {
        this.f5524a = onClickCopyListener;
    }

    void e(List<AwardRecordsBean> list) {
        List<AwardRecordsBean> list2 = this.f5525b;
        if (list2 == null) {
            this.f5525b = new ArrayList();
        } else {
            list2.clear();
        }
        this.f5525b.addAll(list);
    }

    List<AwardRecordsBean> e() {
        return this.f5525b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<AwardRecordsBean> list = this.f5525b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this.d.inflate(R.layout.item_my_award, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        if (njy.e(this.f5525b, i)) {
            LogUtil.j("AwardValidAdapter", "mAwardRecordsBeanList isOutOfBounds");
            return;
        }
        AwardRecordsBean awardRecordsBean = this.f5525b.get(i);
        g(aVar, awardRecordsBean);
        if ("1".equals(awardRecordsBean.getAwardType())) {
            q(aVar, awardRecordsBean);
            r(aVar, awardRecordsBean);
            f(aVar, awardRecordsBean);
            k(aVar, awardRecordsBean);
            return;
        }
        if ("4".equals(awardRecordsBean.getAwardType())) {
            p(aVar, awardRecordsBean);
            return;
        }
        o(aVar, awardRecordsBean);
        if ("1".equals(awardRecordsBean.getTicketType())) {
            l(aVar, awardRecordsBean);
            f(aVar, awardRecordsBean);
            k(aVar, awardRecordsBean);
            return;
        }
        h(aVar, awardRecordsBean);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    private void p(a aVar, final AwardRecordsBean awardRecordsBean) {
        byte b2;
        q(aVar, awardRecordsBean);
        aVar.f5541b.setVisibility(8);
        aVar.f5542c.setVisibility(8);
        String exchangeStatus = awardRecordsBean.getExchangeStatus();
        LogUtil.a("AwardValidAdapter", "setVaMallGood exchangeStatus: ", exchangeStatus);
        if (TextUtils.isEmpty(exchangeStatus)) {
            aVar.e.setVisibility(4);
            aVar.e.setEnabled(false);
            return;
        }
        aVar.e.setVisibility(0);
        exchangeStatus.hashCode();
        switch (exchangeStatus) {
            case "expired":
                b2 = 0;
                break;
            case "not_exchange":
                b2 = 1;
                break;
            case "is_exchange":
                b2 = 2;
                break;
            case "is_send":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            aVar.e.setText(R.string.IDS_trade_exprid);
            aVar.e.setEnabled(false);
            return;
        }
        if (b2 == 1) {
            aVar.e.setText(R.string.IDS_to_redeem);
            aVar.e.setEnabled(true);
        } else if (b2 == 2) {
            aVar.e.setText(R.string.IDS_redeemed);
            aVar.e.setEnabled(true);
        } else if (b2 == 3) {
            aVar.e.setText(R.string.IDS_trade_signed);
            aVar.e.setEnabled(true);
        } else {
            aVar.e.setVisibility(4);
            aVar.e.setEnabled(false);
            return;
        }
        if (TextUtils.isEmpty(awardRecordsBean.getDetailUrl())) {
            LogUtil.j("AwardValidAdapter", "detailUrl isEmpty");
        } else {
            aVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.award.ui.AwardValidAdapter.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (AwardValidAdapter.this.e != null) {
                        AwardValidAdapter.this.e.onClickLinkButton(awardRecordsBean.getDetailUrl(), awardRecordsBean.getExchangeCode());
                    }
                }
            });
        }
    }

    private void h(a aVar, AwardRecordsBean awardRecordsBean) {
        if (awardRecordsBean.getSource() == 2) {
            l(aVar, awardRecordsBean);
        } else {
            aVar.e.setVisibility(4);
        }
        aVar.f5541b.setVisibility(8);
        aVar.f5542c.setVisibility(8);
    }

    private void g(a aVar, AwardRecordsBean awardRecordsBean) {
        n(aVar, awardRecordsBean);
        i(aVar, awardRecordsBean);
        e(aVar, awardRecordsBean);
        c(aVar, awardRecordsBean);
        j(aVar, awardRecordsBean);
        m(aVar, awardRecordsBean);
        t(aVar, awardRecordsBean);
    }

    private void n(a aVar, AwardRecordsBean awardRecordsBean) {
        if (awardRecordsBean.getPictures() == null || TextUtils.isEmpty(awardRecordsBean.getPictures().getDefaultImg())) {
            return;
        }
        qqf.e(awardRecordsBean.getPictures().getMiddle(), RequestOptions.bitmapTransform(new RoundedCorners(8)).centerInside(), aVar.g);
    }

    private void i(a aVar, AwardRecordsBean awardRecordsBean) {
        if (!TextUtils.isEmpty(awardRecordsBean.getAwardName())) {
            aVar.i.setText(awardRecordsBean.getAwardName());
            aVar.i.setVisibility(0);
        } else {
            aVar.i.setVisibility(8);
        }
    }

    private void r(a aVar, AwardRecordsBean awardRecordsBean) {
        if (TextUtils.isEmpty(awardRecordsBean.getExchangeStatus())) {
            aVar.e.setVisibility(4);
            return;
        }
        if ("is_exchange".equalsIgnoreCase(awardRecordsBean.getExchangeStatus())) {
            a(aVar, awardRecordsBean);
            return;
        }
        if ("is_send".equalsIgnoreCase(awardRecordsBean.getExchangeStatus())) {
            aVar.e.setEnabled(false);
            aVar.e.setText(R.string.IDS_my_award_awarded);
            aVar.e.setVisibility(0);
        } else if ("not_exchange".equalsIgnoreCase(awardRecordsBean.getExchangeStatus())) {
            b(aVar, awardRecordsBean);
        } else {
            aVar.e.setVisibility(4);
            LogUtil.e("AwardValidAdapter", "award exchange status error: ", awardRecordsBean.getExchangeStatus());
        }
    }

    private void a(final a aVar, final AwardRecordsBean awardRecordsBean) {
        if (awardRecordsBean.getExpireTime() > System.currentTimeMillis()) {
            aVar.e.setEnabled(true);
            aVar.e.setText(R.string.my_award_change_address);
            aVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.award.ui.AwardValidAdapter.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AwardValidAdapter.this.d(aVar, awardRecordsBean);
                }
            });
        } else {
            aVar.e.setEnabled(false);
            aVar.e.setText(R.string.my_award_received);
        }
        aVar.e.setVisibility(0);
    }

    private void b(final a aVar, final AwardRecordsBean awardRecordsBean) {
        aVar.e.setEnabled(true);
        if (awardRecordsBean.getMailling() != null && !TextUtils.isEmpty(awardRecordsBean.getMailling().getName())) {
            aVar.e.setText(R.string.my_award_change_address);
        } else {
            aVar.e.setText(R.string.my_award_receive);
        }
        aVar.e.setVisibility(0);
        aVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.award.ui.AwardValidAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AwardValidAdapter.this.d(aVar, awardRecordsBean);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(a aVar, AwardRecordsBean awardRecordsBean) {
        if (awardRecordsBean.getMailling() != null && !TextUtils.isEmpty(awardRecordsBean.getMailling().getName())) {
            if (this.e == null) {
                LogUtil.j("AwardValidAdapter", "mOnClickAddressButtonListener = null");
                return;
            }
            SaveInfoItem saveInfoItem = new SaveInfoItem();
            if (awardRecordsBean.getSource() == 1) {
                saveInfoItem.setActivityId(awardRecordsBean.getActivityId());
            } else {
                saveInfoItem.setActivityId(awardRecordsBean.getActivityCode());
            }
            saveInfoItem.setAwardRecordId(awardRecordsBean.getAwardId());
            saveInfoItem.setName(awardRecordsBean.getMailling().getName());
            saveInfoItem.setTelephone(awardRecordsBean.getMailling().getTelephone());
            saveInfoItem.setAddress(awardRecordsBean.getMailling().getAddress());
            saveInfoItem.setRemark(awardRecordsBean.getMailling().getRemark());
            this.e.onClickAddressButton(new AddressInfo(awardRecordsBean.getSource() == 1 ? awardRecordsBean.getSource() : awardRecordsBean.getSourceDetail(), saveInfoItem, aVar.getAdapterPosition()));
            return;
        }
        if (this.e == null) {
            LogUtil.j("AwardValidAdapter", "mOnClickAddressButtonListener = null");
            return;
        }
        SaveInfoItem saveInfoItem2 = new SaveInfoItem();
        if (awardRecordsBean.getSource() == 1) {
            saveInfoItem2.setActivityId(awardRecordsBean.getActivityId());
        } else {
            saveInfoItem2.setActivityId(awardRecordsBean.getActivityCode());
        }
        saveInfoItem2.setAwardRecordId(awardRecordsBean.getAwardId());
        saveInfoItem2.setName("");
        saveInfoItem2.setTelephone("");
        saveInfoItem2.setAddress("");
        saveInfoItem2.setRemark("");
        this.e.onClickAddressButton(new AddressInfo(awardRecordsBean.getSource() == 1 ? awardRecordsBean.getSource() : awardRecordsBean.getSourceDetail(), saveInfoItem2, aVar.getAdapterPosition()));
    }

    private void c(a aVar, AwardRecordsBean awardRecordsBean) {
        if (TextUtils.isEmpty(awardRecordsBean.getActivityName())) {
            if (awardRecordsBean.getSource() != 2) {
                aVar.d.setVisibility(8);
                return;
            }
            aVar.d.setVisibility(0);
            if (awardRecordsBean.getSourceDetail() == 20001) {
                aVar.d.setText(BaseApplication.getContext().getString(R.string.IDS_my_award_activity_name, BaseApplication.getContext().getString(R.string.IDS_activity_social_kaka_lottery)));
                return;
            } else {
                aVar.d.setText(BaseApplication.getContext().getString(R.string.IDS_my_award_activity_name, BaseApplication.getContext().getString(R.string.IDS_achieve_kaka_to_gifts)));
                return;
            }
        }
        if (awardRecordsBean.getSource() == 1) {
            aVar.d.setText(BaseApplication.getContext().getString(R.string.IDS_my_award_activity_name, awardRecordsBean.getActivityName()));
            aVar.d.setVisibility(0);
        } else {
            aVar.d.setVisibility(8);
        }
    }

    private void e(a aVar, AwardRecordsBean awardRecordsBean) {
        if (awardRecordsBean.getIsMember() == 1) {
            cvk.d(aVar.l);
        } else {
            aVar.l.setVisibility(8);
        }
    }

    private void q(a aVar, AwardRecordsBean awardRecordsBean) {
        if (awardRecordsBean.getWonTime() > 0 && awardRecordsBean.getExpireTime() > 0) {
            aVar.h.setText(BaseApplication.getContext().getString(R.string.IDS_my_award_valid_period, DateFormatUtil.d(awardRecordsBean.getWonTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD), DateFormatUtil.d(awardRecordsBean.getExpireTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD)));
            aVar.h.setVisibility(0);
        } else {
            aVar.h.setVisibility(8);
        }
    }

    private void o(a aVar, AwardRecordsBean awardRecordsBean) {
        if (awardRecordsBean.getEffectiveStartTime() > 0 && awardRecordsBean.getEffectiveEndTime() > 0) {
            aVar.h.setText(BaseApplication.getContext().getString(R.string.IDS_my_award_valid_period, DateFormatUtil.d(awardRecordsBean.getEffectiveStartTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD), DateFormatUtil.d(awardRecordsBean.getEffectiveEndTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD)));
            aVar.h.setVisibility(0);
        } else {
            aVar.h.setVisibility(8);
        }
    }

    private void j(final a aVar, final AwardRecordsBean awardRecordsBean) {
        aVar.f5540a.setVisibility(0);
        aVar.f5540a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.award.ui.AwardValidAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (awardRecordsBean.isExpand()) {
                    aVar.j.setVisibility(8);
                    aVar.f5540a.setImageResource(R.drawable.ic_arrow_down);
                    ((AwardRecordsBean) AwardValidAdapter.this.f5525b.get(aVar.getAdapterPosition())).setExpand(false);
                } else {
                    aVar.j.setVisibility(0);
                    aVar.f5540a.setImageResource(R.drawable.ic_arrow_up);
                    ((AwardRecordsBean) AwardValidAdapter.this.f5525b.get(aVar.getAdapterPosition())).setExpand(true);
                }
            }
        });
    }

    private void f(a aVar, AwardRecordsBean awardRecordsBean) {
        if (!TextUtils.isEmpty(awardRecordsBean.getExchangeCode())) {
            aVar.f5541b.setText(BaseApplication.getContext().getString(R.string.IDS_my_award_coupon_code, awardRecordsBean.getExchangeCode()));
            aVar.f5541b.setVisibility(0);
        } else {
            aVar.f5541b.setVisibility(8);
        }
    }

    private void k(a aVar, final AwardRecordsBean awardRecordsBean) {
        if (!TextUtils.isEmpty(awardRecordsBean.getExchangeCode())) {
            aVar.f5542c.setVisibility(0);
            aVar.f5542c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.award.ui.AwardValidAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (AwardValidAdapter.this.f5524a != null) {
                        AwardValidAdapter.this.f5524a.onClickCopy(awardRecordsBean.getExchangeCode());
                    }
                }
            });
        } else {
            aVar.f5542c.setVisibility(8);
        }
    }

    private void m(a aVar, AwardRecordsBean awardRecordsBean) {
        if (!TextUtils.isEmpty(awardRecordsBean.getDescription())) {
            aVar.f.setText(awardRecordsBean.getDescription());
            aVar.f.setVisibility(0);
        } else {
            aVar.f.setVisibility(8);
        }
    }

    private void t(a aVar, AwardRecordsBean awardRecordsBean) {
        if (awardRecordsBean.getWonTime() > 0) {
            aVar.o.setText(BaseApplication.getContext().getString(R.string.IDS_my_award_time_to_win, qrk.d(awardRecordsBean.getWonTime())));
            aVar.o.setVisibility(0);
        } else {
            aVar.o.setVisibility(8);
        }
    }

    private void l(a aVar, final AwardRecordsBean awardRecordsBean) {
        if (!TextUtils.isEmpty(awardRecordsBean.getDetailUrl())) {
            aVar.e.setVisibility(0);
            aVar.e.setEnabled(true);
            if (!TextUtils.isEmpty(awardRecordsBean.getExchangeCode()) && LanguageUtil.f(this.f5526c)) {
                aVar.e.setText(R.string.IDS_copy_and_use);
            } else {
                aVar.e.setText(R.string.my_award_to_use);
            }
            aVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.award.ui.AwardValidAdapter.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (AwardValidAdapter.this.e != null) {
                        AwardValidAdapter.this.e.onClickLinkButton(awardRecordsBean.getDetailUrl(), awardRecordsBean.getExchangeCode());
                    }
                }
            });
            return;
        }
        aVar.e.setVisibility(4);
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f5540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f5541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f5542c;
        HealthTextView d;
        HealthButton e;
        HealthTextView f;
        ImageView g;
        HealthTextView h;
        HealthTextView i;
        LinearLayout j;
        HealthTextView l;
        HealthTextView o;

        a(View view) {
            super(view);
            this.g = (ImageView) view.findViewById(R.id.my_award_icon);
            this.i = (HealthTextView) view.findViewById(R.id.my_award_title);
            this.l = (HealthTextView) view.findViewById(R.id.vip_corner_mark);
            this.d = (HealthTextView) view.findViewById(R.id.my_award_activity_name);
            this.e = (HealthButton) view.findViewById(R.id.my_award_button);
            this.h = (HealthTextView) view.findViewById(R.id.my_award_valid_date);
            this.f5540a = (ImageView) view.findViewById(R.id.my_award_arrow);
            this.j = (LinearLayout) view.findViewById(R.id.expand_container);
            this.f5541b = (HealthTextView) view.findViewById(R.id.my_award_code);
            this.f5542c = (HealthTextView) view.findViewById(R.id.my_award_copy);
            this.f = (HealthTextView) view.findViewById(R.id.my_award_description);
            this.o = (HealthTextView) view.findViewById(R.id.my_award_won_time);
        }
    }
}
