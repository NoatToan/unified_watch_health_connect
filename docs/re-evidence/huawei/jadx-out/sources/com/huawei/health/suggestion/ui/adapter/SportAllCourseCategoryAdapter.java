package com.huawei.health.suggestion.ui.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.Classify;
import com.huawei.pluginfitnessadvice.ClassifyInfo;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;

/* JADX INFO: loaded from: classes31.dex */
public class SportAllCourseCategoryAdapter extends BaseRecyclerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9034b;
    private int e;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    public void convert(RecyclerHolder recyclerHolder, int i, Object obj) {
        String classifyName;
        if (obj instanceof ClassifyInfo) {
            ClassifyInfo classifyInfo = (ClassifyInfo) obj;
            if (classifyInfo.getPrimaryClassify() != null) {
                classifyName = classifyInfo.getPrimaryClassify().getClassifyName();
            } else {
                classifyName = "";
            }
        } else {
            classifyName = "";
        }
        if (obj instanceof Classify) {
            classifyName = ((Classify) obj).getClassifyName();
        }
        recyclerHolder.a(R.id.sug_item_course_category_text, classifyName);
        recyclerHolder.d(R.id.sug_item_course_category_text, this.f9034b == i ? this.f9033a : this.e);
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof RecyclerHolder) {
            super.onBindViewHolder((RecyclerHolder) viewHolder, i);
        } else {
            LogUtil.j("SportAllCourseCategoryAdapter", "onBindViewHolder, holder not RecyclerHolder.");
        }
    }
}
