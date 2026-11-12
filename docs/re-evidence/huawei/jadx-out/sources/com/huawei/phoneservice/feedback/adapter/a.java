package com.huawei.phoneservice.feedback.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.phoneservice.faq.base.util.m;
import com.huawei.phoneservice.faq.base.util.o;
import com.huawei.phoneservice.faq.base.widget.ListItemRelativeLayout;
import com.huawei.phoneservice.faq.base.widget.SimpleBaseAdapter;
import com.huawei.phoneservice.feedback.R;
import com.huawei.phoneservice.feedback.widget.ItemView;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackResponse;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class a extends SimpleBaseAdapter<FeedBackResponse.ProblemEnity> {
    @Override // com.huawei.phoneservice.faq.base.widget.SimpleBaseAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        d dVar;
        if (view == null) {
            dVar = new d();
            viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.feedback_sdk_item_feedlist, viewGroup, false);
            dVar.d = (TextView) viewInflate.findViewById(R.id.feed_title);
            dVar.f21623c = (TextView) viewInflate.findViewById(R.id.feed_time);
            dVar.e = (TextView) viewInflate.findViewById(R.id.feed_content);
            dVar.f21621a = (ImageView) viewInflate.findViewById(R.id.iv_question_state);
            dVar.f21622b = viewInflate.findViewById(R.id.feedback_split_line);
            dVar.h = (ListItemRelativeLayout) viewInflate.findViewById(R.id.feed_item_rl);
            dVar.j = (ItemView) viewInflate.findViewById(R.id.item_view);
            dVar.i = (ImageView) viewInflate.findViewById(R.id.feed_list_select);
            viewInflate.setTag(dVar);
        } else {
            viewInflate = view;
            dVar = (d) view.getTag();
        }
        FeedBackResponse.ProblemEnity item = getItem(i);
        if (item != null) {
            dVar.d.setText(item.getProblemDesc());
            if (com.huawei.phoneservice.feedback.photolibrary.internal.utils.c.c(item.getCreateTime(), viewInflate.getContext())) {
                dVar.f21623c.setText(com.huawei.phoneservice.feedback.photolibrary.internal.utils.c.d(item.getCreateTime(), "HH:mm", viewInflate.getContext()));
            } else {
                dVar.f21623c.setText(m.b(com.huawei.phoneservice.feedback.photolibrary.internal.utils.c.d(item.getCreateTime(), "yyyy-MM-dd HH:mm", viewInflate.getContext()), viewInflate.getContext()).replace(Constants.LINK, "/"));
            }
            if (TextUtils.isEmpty(item.getAnswer())) {
                dVar.e.setSingleLine(false);
                dVar.e.setText(viewGroup.getContext().getResources().getString(R.string.feedback_sdk_question_state_no));
            } else {
                dVar.e.setText(viewGroup.getContext().getString(R.string.feedback_sdk_question_state_yes, item.getAnswer()));
                dVar.e.setSingleLine(true);
            }
            dVar.f21621a.setVisibility(item.getIsRead() ? 4 : 0);
            dVar.i.setVisibility(item.isSelectMode() ? 0 : 8);
            dVar.i.setImageResource(item.isChecked() ? R.drawable.feedback_sdk_ic_radio_checked : R.drawable.feedback_sdk_ic_radio_unchecked);
        }
        a(viewGroup, dVar);
        dVar.f21622b.setVisibility(i == getCount() - 1 ? 4 : 0);
        return viewInflate;
    }

    public void a(int i) {
        List<T> list = this.d;
        if (list == 0 || i < 0 || i >= list.size()) {
            return;
        }
        this.d.remove(i);
    }

    public List<FeedBackResponse.ProblemEnity> e() {
        return this.d;
    }

    @Override // com.huawei.phoneservice.faq.base.widget.SimpleBaseAdapter, android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FeedBackResponse.ProblemEnity getItem(int i) {
        List<T> list = this.d;
        if (list == 0 || i < 0 || i >= list.size()) {
            return null;
        }
        return (FeedBackResponse.ProblemEnity) this.d.get(i);
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f21621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        View f21622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        TextView f21623c;
        TextView d;
        TextView e;
        ListItemRelativeLayout h;
        ImageView i;
        ItemView j;

        d() {
        }
    }

    private void a(ViewGroup viewGroup, d dVar) {
        Context context = viewGroup.getContext();
        if (context != null) {
            o.e(dVar.h, 0, context.getResources().getDimensionPixelOffset(com.huawei.uikit.hwresources.R.dimen.emui_dimens_max_end));
            o.e(dVar.f21622b, context.getResources().getDimensionPixelOffset(com.huawei.uikit.hwresources.R.dimen.emui_dimens_max_start), 0);
            o.e(dVar.j, context.getResources().getDimensionPixelOffset(com.huawei.uikit.hwresources.R.dimen.emui_dimens_max_start));
        }
    }
}
