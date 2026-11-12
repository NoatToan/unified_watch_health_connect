package com.huami.watch.companion.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.watch.companion.R;
import com.huami.watch.companion.notification.bean.LvMiNoticeBean;

/* JADX INFO: loaded from: classes16.dex */
public class LvMiSupportNoticeAdapter extends BaseQuickAdapter<LvMiNoticeBean, BaseViewHolder> {
    public LvMiSupportNoticeAdapter() {
        super(R.layout.item_lvmi_support_notice);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, LvMiNoticeBean lvMiNoticeBean) {
        baseViewHolder.setText(R.id.tv_name, lvMiNoticeBean.getName());
        if (lvMiNoticeBean.getType() == 1) {
            baseViewHolder.setVisible(R.id.tv_xing, true);
        } else {
            baseViewHolder.setVisible(R.id.tv_xing, false);
        }
        baseViewHolder.setImageResource(R.id.iv_icon, lvMiNoticeBean.getIcon());
        baseViewHolder.setText(R.id.tv_detail, lvMiNoticeBean.getDetail());
    }
}
