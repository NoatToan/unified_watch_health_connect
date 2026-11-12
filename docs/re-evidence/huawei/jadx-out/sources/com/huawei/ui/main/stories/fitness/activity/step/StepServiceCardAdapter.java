package com.huawei.ui.main.stories.fitness.activity.step;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.openservice.OpenServiceUtil;
import com.huawei.ui.openservice.db.model.ChildService;
import defpackage.njy;
import defpackage.qqp;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class StepServiceCardAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnItemClickListener f27052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<ChildService> f27053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f27054c;

    public interface OnItemClickListener {
        void onItemClick(View view, int i);
    }

    public StepServiceCardAdapter(Context context, List<ChildService> list) {
        this.f27054c = context;
        this.f27053b = list;
    }

    public void d(OnItemClickListener onItemClickListener) {
        this.f27052a = onItemClickListener;
    }

    private boolean e() {
        List<ChildService> list = this.f27053b;
        if (list != null && !list.isEmpty()) {
            Bitmap icon = OpenServiceUtil.getIcon(this.f27054c, this.f27053b.get(0).getImageUrl());
            if (icon != null) {
                if (icon.getWidth() == icon.getHeight()) {
                    icon.recycle();
                    return true;
                }
                icon.recycle();
                return false;
            }
            LogUtil.j("ServiceCardAdapter", "icon is null");
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final b bVar, int i) {
        if (njy.e(this.f27053b, i)) {
            LogUtil.j("ServiceCardAdapter", "mServices isOutOfBounds!");
            return;
        }
        ChildService childService = this.f27053b.get(i);
        bVar.d.setText(childService.getServiceName());
        Bitmap icon = OpenServiceUtil.getIcon(this.f27054c, childService.getImageUrl());
        if (icon != null) {
            bVar.f27057b.setImageBitmap(icon);
            bVar.f27056a.setImageBitmap(icon);
        }
        if (e()) {
            bVar.d.setVisibility(0);
            bVar.f27056a.setVisibility(0);
            bVar.f27057b.setVisibility(8);
        } else {
            bVar.d.setVisibility(8);
            bVar.f27056a.setVisibility(8);
            bVar.f27057b.setVisibility(0);
        }
        if (bVar.f27057b.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) bVar.f27057b.getLayoutParams();
            layoutParams.width = (int) new HealthColumnSystem(this.f27054c, 1).a(2);
            layoutParams.setMarginEnd(qqp.b(this.f27054c));
            bVar.f27057b.setLayoutParams(layoutParams);
        }
        if (this.f27052a != null) {
            bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.step.StepServiceCardAdapter.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    StepServiceCardAdapter.this.f27052a.onItemClick(bVar.itemView, bVar.getLayoutPosition());
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.step_service_recyclerview_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<ChildService> list = this.f27053b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f27056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f27057b;
        HealthTextView d;

        b(View view) {
            super(view);
            this.f27057b = (ImageView) view.findViewById(R.id.service_icon);
            this.f27056a = (ImageView) view.findViewById(R.id.service_icon_square);
            this.d = (HealthTextView) view.findViewById(R.id.service_name);
        }
    }
}
