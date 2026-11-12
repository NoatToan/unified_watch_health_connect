package com.huawei.pluginachievement.ui.kakatask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.GiftInfo;
import com.huawei.pluginachievement.ui.views.KakaToGiftView;
import defpackage.njy;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveKakaGiftAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22221b;
    private OnItemClickListener d;
    private List<GiftInfo> e;

    public interface OnItemClickListener {
        void onItemClick(View view, String str, int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new GiftHolder(LayoutInflater.from(this.f22221b).inflate(R.layout.achieve_kk_gift_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        if (list.isEmpty()) {
            LogUtil.a("PLGACHIEVE_AchieveKakaGiftAdapter", "onBindViewHolder payloads isEmpty!");
            onBindViewHolder(viewHolder, i);
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaGiftAdapter", "onBindViewHolder item position ", Integer.valueOf(i));
        if ("refreshTime".equals(list.get(0)) && (viewHolder instanceof GiftHolder)) {
            ((GiftHolder) viewHolder).f22223a.e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        LogUtil.a("PLGACHIEVE_AchieveKakaGiftAdapter", "onBindViewHolder position ", Integer.valueOf(i));
        if (njy.c(this.e, i) && (viewHolder instanceof GiftHolder)) {
            viewHolder.setIsRecyclable(false);
            GiftHolder giftHolder = (GiftHolder) viewHolder;
            giftHolder.f22223a.setGiftInfo(this.e.get(i));
            giftHolder.f22223a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.kakatask.AchieveKakaGiftAdapter.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AchieveKakaGiftAdapter.this.d.onItemClick(view, JsbMapKeyNames.H5_TEXT_DETAIL, i);
                }
            });
            giftHolder.f22223a.setExchangeBtnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.kakatask.AchieveKakaGiftAdapter.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AchieveKakaGiftAdapter.this.d.onItemClick(view, "redeem", i);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.e)) {
            return 0;
        }
        return this.e.size();
    }

    public static class GiftHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        KakaToGiftView f22223a;

        public GiftHolder(View view) {
            super(view);
            this.f22223a = (KakaToGiftView) view.findViewById(R.id.exchange_gift);
        }
    }
}
