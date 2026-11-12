package com.huawei.ui.device.adapter;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.device.R;
import defpackage.lrd;
import defpackage.raz;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class LeftKindAdapter extends BaseRecyclerAdapter<raz> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24878a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24879c;
    private int d;

    public LeftKindAdapter(List<raz> list) {
        super(list, R.layout.item_all_device_left_kind_recycle);
        this.f24879c = BaseApplication.getContext().getResources().getColor(R.color.colorAccent);
        this.d = BaseApplication.getContext().getResources().getColor(R.color.textColorSecondary);
        LogUtil.a("LeftKindAdapter", "LeftKindAdapter init");
    }

    public void d(int i) {
        raz razVar = get(this.f24878a);
        if (razVar != null) {
            razVar.a(false);
            notifyItemChanged(this.f24878a);
        }
        raz razVar2 = get(i);
        if (razVar2 != null) {
            razVar2.a(true);
            notifyItemChanged(i);
            this.f24878a = i;
        }
    }

    public int c() {
        return this.f24878a;
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, raz razVar) {
        if (razVar != null) {
            recyclerHolder.a(R.id.left_device_kind_text, razVar.b());
            recyclerHolder.d(R.id.left_device_kind_text, razVar.c() ? this.f24879c : this.d);
            if (lrd.d()) {
                String strB = razVar.b();
                if (TextUtils.isEmpty(strB)) {
                    return;
                }
                lrd.c(recyclerHolder.d(R.id.left_device_kind_text), strB, razVar.c());
            }
        }
    }
}
