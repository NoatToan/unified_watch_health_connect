package com.huawei.health.suggestion.ui.polymericpage.adapter;

import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.model.Navigation;
import com.huawei.health.suggestion.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.Classify;
import com.huawei.pluginfitnessadvice.ClassifyInfo;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.lrd;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class PolymericCategoryAdapter extends BaseRecyclerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9814b;
    private RecyclerHolder d;
    private int e;

    public PolymericCategoryAdapter(List list) {
        super(list, R.layout.sug_item_sport_all_course_category);
        this.f9814b = BaseApplication.getContext().getResources().getColor(R.color.colorAccent);
        this.f9813a = BaseApplication.getContext().getResources().getColor(R.color.textColorSecondary);
        this.e = 0;
    }

    public void d(int i) {
        if (this.e == i || i < 0 || i >= getItemCount()) {
            LogUtil.j("SportAllCourseCategoryAdapter", "setSelectIndex, selectIndex not change or selectIndex is out bound.");
        } else {
            this.e = i;
            notifyDataSetChanged();
        }
    }

    public int d() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    public void convert(RecyclerHolder recyclerHolder, int i, Object obj) {
        String classifyName;
        if (obj instanceof Navigation) {
            e(recyclerHolder, i, obj);
            return;
        }
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
        recyclerHolder.d(R.id.sug_item_course_category_text, this.e == i ? this.f9814b : this.f9813a);
        if (this.e == i) {
            lrd.c(recyclerHolder.d(R.id.sug_item_course_category_layout), (CharSequence) classifyName, true);
            this.d = recyclerHolder;
        }
    }

    private void e(RecyclerHolder recyclerHolder, int i, Object obj) {
        Navigation navigation = (Navigation) obj;
        c(recyclerHolder);
        if (navigation.getDisplayNavigationIcon() == 1 && !TextUtils.isEmpty(navigation.getNavigationIconUrl())) {
            recyclerHolder.e(R.id.sug_item_course_category_icon, 0);
            recyclerHolder.e(R.id.sug_item_course_category_text, 8);
            if (this.e == i) {
                recyclerHolder.d(R.id.sug_item_course_category_icon, navigation.getNavigationSelectedIconUrl(), 0);
                return;
            } else {
                recyclerHolder.d(R.id.sug_item_course_category_icon, navigation.getNavigationIconUrl(), 0);
                return;
            }
        }
        recyclerHolder.e(R.id.sug_item_course_category_icon, 8);
        recyclerHolder.e(R.id.sug_item_course_category_text, 0);
        recyclerHolder.a(R.id.sug_item_course_category_text, navigation.getName());
        recyclerHolder.d(R.id.sug_item_course_category_text, this.e == i ? this.f9814b : this.f9813a);
        if (this.e == i) {
            lrd.c(recyclerHolder.d(R.id.sug_item_course_category_layout), (CharSequence) navigation.getName(), true);
            this.d = recyclerHolder;
        }
    }

    private void c(RecyclerHolder recyclerHolder) {
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.sug_item_course_category_text);
        Context context = BaseApplication.getContext();
        if (context == null) {
            LogUtil.j("SportAllCourseCategoryAdapter", "updateNavigationNameSize context == null");
        } else if (healthTextView != null) {
            if (LanguageUtil.f(context)) {
                healthTextView.setTextSize(2, 14.0f);
            } else {
                healthTextView.setTextSize(2, 12.0f);
            }
        }
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
