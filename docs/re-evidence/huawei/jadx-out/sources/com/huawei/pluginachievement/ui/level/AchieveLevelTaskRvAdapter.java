package com.huawei.pluginachievement.ui.level;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.ui.kakatask.AchieveKaKaTaskClickListener;
import defpackage.njy;
import defpackage.ozs;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveLevelTaskRvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AchieveKaKaTaskClickListener f22231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22233c;
    private ArrayList<ozs> e;

    public AchieveLevelTaskRvAdapter(Context context, ArrayList<ozs> arrayList, int i) {
        new ArrayList(0);
        this.f22233c = context;
        this.e = arrayList;
        this.f22232b = i;
    }

    public void c(ArrayList<ozs> arrayList, int i) {
        if (njy.e(arrayList)) {
            return;
        }
        this.e = arrayList;
        this.f22232b = i;
        notifyDataSetChanged();
    }

    public void b(AchieveKaKaTaskClickListener achieveKaKaTaskClickListener) {
        this.f22231a = achieveKaKaTaskClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        if (i == 0) {
            View viewInflate = LayoutInflater.from(this.f22233c).inflate(R.layout.achieve_task_level_title, viewGroup, false);
            viewInflate.setLayoutParams(layoutParams);
            return new AchieveLevelTaskTitleHolder(viewInflate);
        }
        if (i == 1) {
            View viewInflate2 = LayoutInflater.from(this.f22233c).inflate(R.layout.achieve_task_level_content, viewGroup, false);
            viewInflate2.setLayoutParams(layoutParams);
            return new AchieveLevelTaskContentHolder(viewInflate2, this.f22231a, this.f22232b);
        }
        LogUtil.j("AchieveLevelTaskRvAdapter", "viewType unknow:", Integer.valueOf(i));
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (njy.e(this.e, i)) {
            return;
        }
        viewHolder.setIsRecyclable(false);
        ozs ozsVar = this.e.get(i);
        if (ozsVar == null) {
            return;
        }
        if (viewHolder instanceof AchieveLevelTaskTitleHolder) {
            ((AchieveLevelTaskTitleHolder) viewHolder).b(ozsVar);
        } else if (viewHolder instanceof AchieveLevelTaskContentHolder) {
            ((AchieveLevelTaskContentHolder) viewHolder).a(ozsVar, i);
        } else {
            LogUtil.d("AchieveLevelTaskRvAdapter", "onBindViewHolder holder is not matching");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.e)) {
            return 0;
        }
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (njy.e(this.e, i)) {
            LogUtil.e("AchieveLevelTaskRvAdapter", "getItemViewType isOutOfBounds");
            return -1;
        }
        return this.e.get(i).a();
    }
}
