package com.huawei.health.marketing.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.marketing.datatype.templates.SingleFamousTeacherStandardContent;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class FamousTeacherAvatarAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<SingleFamousTeacherStandardContent> f8318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private onItemClickListener f8319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewHolder f8320c;
    private boolean d;
    private Context e;
    private int i;

    public interface onItemClickListener {
        void onItemClick(ViewHolder viewHolder, SingleFamousTeacherStandardContent singleFamousTeacherStandardContent, int i, int i2);
    }

    public FamousTeacherAvatarAdapter(Context context, List<SingleFamousTeacherStandardContent> list) {
        new ArrayList();
        this.e = context;
        this.f8318a = list;
        this.d = qqs.e(BaseApplication.b());
    }

    public ViewHolder a() {
        return this.f8320c;
    }

    public void c(List<SingleFamousTeacherStandardContent> list) {
        this.f8318a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.e).inflate(R.layout.item_famous_teacher_head, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final ViewHolder viewHolder, final int i) {
        if (njy.e(this.f8318a, i)) {
            LogUtil.j("FamousTeacherAvatarAdapter", "mSingleArticleContent isOutOfBounds");
            return;
        }
        final SingleFamousTeacherStandardContent singleFamousTeacherStandardContent = this.f8318a.get(i);
        qqf.c(singleFamousTeacherStandardContent.getHeadPicture(), viewHolder.d, (int) BaseApplication.b().getResources().getDimension(com.huawei.ui.commonui.R.dimen.health_common_20dp));
        if (i == this.i) {
            viewHolder.d.setImageAlpha(255);
            viewHolder.d.setBackgroundResource(R.mipmap.ic_me_head_shadow);
            lrd.c((View) viewHolder.d, (CharSequence) singleFamousTeacherStandardContent.getTabName(), true);
            this.f8320c = viewHolder;
        } else {
            viewHolder.d.setImageAlpha(102);
            viewHolder.d.setBackgroundResource(R.drawable.famous_teacher_head_unselect_shadow);
            lrd.c((View) viewHolder.d, (CharSequence) singleFamousTeacherStandardContent.getTabName(), false);
        }
        if (this.d) {
            viewHolder.d.getBackground().setAlpha(102);
        } else {
            viewHolder.d.getBackground().setAlpha(255);
        }
        viewHolder.d.setOnClickListener(new View.OnClickListener() { // from class: fzd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.e(i, viewHolder, singleFamousTeacherStandardContent, view);
            }
        });
    }

    public /* synthetic */ void e(int i, ViewHolder viewHolder, SingleFamousTeacherStandardContent singleFamousTeacherStandardContent, View view) {
        int i2 = this.i;
        this.i = i;
        onItemClickListener onitemclicklistener = this.f8319b;
        if (onitemclicklistener != null) {
            onitemclicklistener.onItemClick(viewHolder, singleFamousTeacherStandardContent, i2, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8318a.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private HealthImageView d;

        ViewHolder(View view) {
            super(view);
            this.d = (HealthImageView) view.findViewById(R.id.account_head_picture);
        }
    }

    public void e(onItemClickListener onitemclicklistener) {
        this.f8319b = onitemclicklistener;
    }
}
