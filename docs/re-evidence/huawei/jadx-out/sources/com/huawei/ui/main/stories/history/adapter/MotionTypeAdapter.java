package com.huawei.ui.main.stories.history.adapter;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.qqs;
import defpackage.vqx;
import defpackage.vre;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class MotionTypeAdapter extends BaseRecyclerAdapter<vre> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28284b;

    public MotionTypeAdapter(List<vre> list) {
        super(list, R.layout.item_right_motion_type_info);
        this.f28284b = BaseApplication.getContext().getResources().getColor(R.color.white);
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, vre vreVar) {
        if (vreVar != null) {
            a(recyclerHolder, vreVar);
        }
    }

    private void a(RecyclerHolder recyclerHolder, vre vreVar) {
        int i;
        LogUtil.a("Track_MotionTypeAdapter", "ItemNameId :", Integer.valueOf(vreVar.b()));
        if (vreVar.b() == 0) {
            recyclerHolder.a(R.id.sport_item_name, "");
        } else {
            recyclerHolder.b(R.id.sport_item_name, vreVar.b());
        }
        View viewD = recyclerHolder.d(R.id.sport_item_name);
        if (viewD instanceof HealthTextView) {
            ((HealthTextView) viewD).setAutoTextInfo(9, 1, 2);
        }
        if (vreVar.g()) {
            i = R.drawable.motion_type_item_presse;
        } else {
            i = qqs.e(BaseApplication.getContext()) ? R.drawable.motion_type_item_dark : R.drawable.motion_type_item_normal;
        }
        View viewD2 = recyclerHolder.d(R.id.sport_motion_item_layout);
        if (viewD2 instanceof LinearLayout) {
            ((LinearLayout) viewD2).setBackgroundResource(i);
        }
        e(recyclerHolder, vreVar);
    }

    private void e(RecyclerHolder recyclerHolder, vre vreVar) {
        Resources resources = recyclerHolder.itemView.getResources();
        View viewD = recyclerHolder.d(R.id.sport_item_iv);
        if (viewD == null || resources == null) {
            LogUtil.j("Track_MotionTypeAdapter", "view or resource is null");
            return;
        }
        if (!(viewD instanceof ImageView)) {
            LogUtil.j("Track_MotionTypeAdapter", "view is not instanceof ImageView");
            return;
        }
        ((ImageView) viewD).setPadding(4, 4, 4, 4);
        if (vreVar.g()) {
            recyclerHolder.a(R.id.sport_item_iv, vqx.e(vreVar.e(), this.f28284b));
        } else {
            recyclerHolder.a(R.id.sport_item_iv, vqx.e(vreVar.e(), vqx.d()));
        }
    }
}
