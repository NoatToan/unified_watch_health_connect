package com.huawei.ui.homehealth.adapter;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.FunctionMenuCardData;
import com.huawei.ui.homehealth.homeinterface.ItemTouchHelperInterface;
import com.huawei.ui.homehealth.refreshcard.CardViewHolder;
import defpackage.tcw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class HomeCardAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements ItemTouchHelperInterface {
    private LayoutInflater d;
    private List<AbstractBaseCardData> e;

    public void a() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public HomeCardAdapter(Context context, List<AbstractBaseCardData> list) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        arrayList.clear();
        this.e.addAll(list);
        this.d = LayoutInflater.from(context);
    }

    @Override // com.huawei.ui.homehealth.homeinterface.ItemTouchHelperInterface
    public boolean onItemMove(int i, int i2) {
        LogUtil.d("R_HomeCardAdapter", "onItemMove mDataList=", this.e);
        Collections.swap(this.e, i, i2);
        notifyItemMoved(i, i2);
        return true;
    }

    @Override // com.huawei.ui.homehealth.homeinterface.ItemTouchHelperInterface
    public void onItemSwiped(int i) {
        LogUtil.d("R_HomeCardAdapter", "onItemSwiped position=", Integer.valueOf(i));
        this.e.remove(i);
        notifyItemRemoved(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (i >= this.e.size()) {
            LogUtil.e("R_HomeCardAdapter", "wrong position!!!");
            return null;
        }
        AbstractBaseCardData abstractBaseCardData = this.e.get(i);
        RecyclerView.ViewHolder cardViewHolder = abstractBaseCardData.getCardViewHolder(viewGroup, this.d);
        LogUtil.a("R_HomeCardAdapter", "onCreateViewHolder finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + ", index:", i + ", name: " + abstractBaseCardData.getCardName());
        return cardViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (i >= this.e.size()) {
            return;
        }
        AbstractBaseCardData abstractBaseCardData = this.e.get(i);
        if (abstractBaseCardData instanceof FunctionMenuCardData) {
            ((FunctionMenuCardData) abstractBaseCardData).e(viewHolder, i);
        }
        if (abstractBaseCardData instanceof tcw) {
            ((tcw) abstractBaseCardData).c(viewHolder, i);
        }
        if (viewHolder instanceof CardViewHolder) {
            ((CardViewHolder) viewHolder).bindViewHolder(abstractBaseCardData);
        }
        LogUtil.a("R_HomeCardAdapter", "onBindViewHolder finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + ", index:", i + ", name: " + abstractBaseCardData.getCardName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.e.size();
    }

    public void c(ArrayList<AbstractBaseCardData> arrayList) {
        this.e.clear();
        this.e.addAll(arrayList);
    }
}
