package com.huawei.ui.main.stories.history.adapter;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.R;
import defpackage.njy;
import defpackage.qrs;
import defpackage.vqr;
import defpackage.vre;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class RightListSportAdapter extends BaseRecyclerAdapter<vqr> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f28285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MotionTypeAdapter f28286c;
    private SportOnSelectPositionListener e;

    public interface SportOnSelectPositionListener {
        void selectedPosition(int i, int i2);
    }

    public RightListSportAdapter(List<vqr> list, Context context) {
        super(list, R.layout.item_sport_type_right);
        this.e = null;
        this.f28285b = context;
        LogUtil.a("Track_RightListAdapter", "RightListAdapter init");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return super.getItemId(i);
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, vqr vqrVar) {
        LogUtil.a("Track_RightListAdapter", "start convert position: ", Integer.valueOf(i));
        if (vqrVar != null) {
            recyclerHolder.b(R.id.right_name, vqrVar.d());
            HealthRecycleView healthRecycleView = (HealthRecycleView) recyclerHolder.d(R.id.sport_item_type);
            if (njy.e(vqrVar.b())) {
                LogUtil.j("Track_RightListAdapter", "MotionTypeAdapter convert  itemData.getTypeItemlist() is null");
                healthRecycleView.setVisibility(8);
            } else {
                a(healthRecycleView, i, vqrVar.b());
                recyclerHolder.setIsRecyclable(false);
            }
        }
    }

    private void a(HealthRecycleView healthRecycleView, final int i, final List<vre> list) {
        LogUtil.a("Track_RightListAdapter", "enter initItemRecyclerView");
        healthRecycleView.setLayoutManager(new GridLayoutManager(this.f28285b, 3, 1, false) { // from class: com.huawei.ui.main.stories.history.adapter.RightListSportAdapter.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        RecyclerView.ItemAnimator itemAnimator = healthRecycleView.getItemAnimator();
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        LogUtil.a("Track_RightListAdapter", "ItemList.size ", Integer.valueOf(list.size()));
        MotionTypeAdapter motionTypeAdapter = new MotionTypeAdapter(list);
        this.f28286c = motionTypeAdapter;
        healthRecycleView.setAdapter(motionTypeAdapter);
        this.f28286c.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() { // from class: com.huawei.ui.main.stories.history.adapter.RightListSportAdapter.3
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
            public void onItemClicked(RecyclerHolder recyclerHolder, int i2, Object obj) {
                if (!qrs.r()) {
                    RightListSportAdapter.this.a(i2, list);
                    RightListSportAdapter.this.e.selectedPosition(i, i2);
                } else {
                    LogUtil.j("Track_RightListAdapter", "onClick isFastDoubleClick");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, List<vre> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 == i) {
                list.get(i2).c(true);
            } else {
                list.get(i2).c(false);
            }
        }
        this.f28286c.notifyDataSetChanged();
        notifyDataSetChanged();
    }

    public void b(SportOnSelectPositionListener sportOnSelectPositionListener) {
        this.e = sportOnSelectPositionListener;
    }
}
