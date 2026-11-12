package com.huawei.ui.main.stories.history.adapter;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.main.R;
import defpackage.vqq;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class LeftListSportAdapter extends BaseRecyclerAdapter<vqq> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28283c;

    public LeftListSportAdapter(List<vqq> list) {
        super(list, R.layout.item_sport_left_type_recycle);
        this.f28283c = BaseApplication.getContext().getResources().getColor(R.color.textColorPrimaryActivated);
        this.f28281a = BaseApplication.getContext().getResources().getColor(R.color.textColorSecondary);
        LogUtil.a("Track_LeftListAdapter", "LeftListAdapter init");
    }

    public void b(int i) {
        vqq vqqVar = get(this.f28282b);
        if (vqqVar != null) {
            vqqVar.c(false);
            notifyItemChanged(this.f28282b);
        }
        vqq vqqVar2 = get(i);
        if (vqqVar2 != null) {
            vqqVar2.c(true);
            notifyItemChanged(i);
            this.f28282b = i;
        }
    }

    public int a() {
        return this.f28282b;
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, vqq vqqVar) {
        if (vqqVar != null) {
            recyclerHolder.b(R.id.left_name_text, vqqVar.d());
            recyclerHolder.d(R.id.left_name_text, vqqVar.e() ? this.f28283c : this.f28281a);
            recyclerHolder.e(R.id.left_view, vqqVar.e() ? 0 : 8);
        }
    }
}
