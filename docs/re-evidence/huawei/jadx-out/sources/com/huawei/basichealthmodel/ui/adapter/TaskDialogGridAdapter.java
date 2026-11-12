package com.huawei.basichealthmodel.ui.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.huawei.basichealthmodel.ui.adapter.TaskDialogGridAdapter;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.cbg;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qre;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes23.dex */
public class TaskDialogGridAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f5353c;
    private final ArrayList<Drawable> d;
    private final int e;
    private final boolean h;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public TaskDialogGridAdapter(ArrayList<Drawable> arrayList, int i, boolean z) {
        Context contextB = BaseApplication.b();
        this.f5353c = contextB;
        Resources resources = contextB.getResources();
        this.d = arrayList;
        this.h = z;
        double dimensionPixelSize = (i - resources.getDimensionPixelSize(R.dimen.dialogMarginStart)) - resources.getDimensionPixelSize(R.dimen.dialogMarginEnd);
        if (z) {
            int iD = (int) cbg.d(((dimensionPixelSize - ((double) resources.getDimensionPixelSize(R.dimen.health_common_12dp))) - ((double) (resources.getDimensionPixelSize(R.dimen.health_common_6dp) * 7))) / 8.0d, -1);
            this.f5351a = iD;
            this.e = iD;
            return;
        }
        int iD2 = (int) cbg.d(((dimensionPixelSize - ((double) resources.getDimensionPixelSize(R.dimen.health_common_24dp))) - ((double) (resources.getDimensionPixelSize(R.dimen.health_common_10dp) * 5))) / 6.0d, -1);
        this.f5351a = iD2;
        this.e = iD2 - resources.getDimensionPixelSize(R.dimen.health_common_10dp);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (njy.e(this.d)) {
            return 0;
        }
        return this.d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (njy.e(this.d, i)) {
            return null;
        }
        return this.d.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (njy.e(this.d, i)) {
            LogUtil.j("R_HL_TaskDialogGridAdapter", "getView mDrawableList is out of bounds mDrawableList ", this.d, " position ", Integer.valueOf(i));
            return view;
        }
        a aVar = null;
        Object[] objArr = 0;
        if (view == null) {
            a aVar2 = new a();
            View viewInflate = LayoutInflater.from(this.f5353c).inflate(com.huawei.basichealthmodel.R.layout.item_task_dialog_grid, viewGroup, false);
            aVar2.f5355c = (FrameLayout) viewInflate.findViewById(com.huawei.basichealthmodel.R.id.item_task_dialog_grid_background);
            aVar2.f5354b = (ImageView) viewInflate.findViewById(com.huawei.basichealthmodel.R.id.item_task_dialog_grid_foreground);
            aVar2.e = (HealthTextView) viewInflate.findViewById(com.huawei.basichealthmodel.R.id.item_task_dialog_grid_plan);
            viewInflate.setTag(aVar2);
            aVar = aVar2;
            view = viewInflate;
        } else {
            Object tag = view.getTag();
            if (tag instanceof a) {
                aVar = (a) tag;
            }
        }
        if (aVar == null) {
            LogUtil.j("R_HL_TaskDialogGridAdapter", "getView viewHolder is null");
            return view;
        }
        ViewGroup.LayoutParams layoutParams = aVar.f5355c.getLayoutParams();
        layoutParams.width = this.f5351a;
        layoutParams.height = this.f5351a;
        aVar.f5355c.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = aVar.f5354b.getLayoutParams();
        layoutParams2.width = this.e;
        layoutParams2.height = this.e;
        aVar.f5354b.setLayoutParams(layoutParams2);
        aVar.f5354b.setPivotX(this.e / 2.0f);
        if (this.h) {
            aVar.f5354b.setPivotY(this.e);
            lrd.c(view, 4);
        } else {
            aVar.f5354b.setPivotY(this.e / 2.0f);
        }
        aVar.f5354b.setImageDrawable(this.d.get(i));
        final HealthTextView healthTextView = aVar.e;
        b(healthTextView, i);
        healthTextView.c(new HealthTextView.TextLineListener() { // from class: cak
            @Override // com.huawei.ui.commonui.healthtextview.HealthTextView.TextLineListener
            public final void onCallback() {
                TaskDialogGridAdapter.c(healthTextView);
            }
        });
        return view;
    }

    public static /* synthetic */ void c(HealthTextView healthTextView) {
        int textLine = healthTextView.getTextLine();
        if (textLine <= 1) {
            return;
        }
        ReleaseLogUtil.c("R_HL_TaskDialogGridAdapter", "getView onCallback textLine ", Integer.valueOf(textLine));
        healthTextView.setTextSize(0, qre.b(R.dimen.health_common_9dp));
        healthTextView.c((HealthTextView.TextLineListener) null);
    }

    private void b(HealthTextView healthTextView, int i) {
        if (this.f5352b) {
            healthTextView.setVisibility(0);
            if (i == 0) {
                healthTextView.setText(this.f5353c.getString(R.string.IDS_blood_pressure_get_up));
            } else if (i == getCount() - 1) {
                healthTextView.setText(this.f5353c.getString(R.string.IDS_blood_pressure_before_sleep));
            } else {
                healthTextView.setText(this.f5353c.getString(R.string.IDS_blood_pressure_customize_title, Integer.valueOf(i)));
            }
        }
    }

    public void c(boolean z) {
        this.f5352b = z;
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f5354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private FrameLayout f5355c;
        private HealthTextView e;

        private a() {
        }
    }
}
