package com.xiaomi.fitness.relative.home;

import android.app.ActivityOptions;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.homepage.viewholder.RelativeItemContentViewHolder;
import defpackage.iji;
import defpackage.jui;
import defpackage.km5;
import defpackage.zr3;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class a extends RecyclerView.Adapter<RecyclerView.d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f12757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<km5> f12758b;
    public LayoutInflater c;
    public int d = 0;
    public int e = 0;
    public b f;

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.home.a$a, reason: collision with other inner class name */
    public class C0718a extends zr3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f12759b;
        public final /* synthetic */ RelativeItemContentViewHolder c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0718a(Context context, View view, View view2, int i, RelativeItemContentViewHolder relativeItemContentViewHolder) {
            super(context, view, view2);
            this.f12759b = i;
            this.c = relativeItemContentViewHolder;
        }

        @Override // defpackage.zr3
        public void onCardZoomTriggered(ActivityOptions activityOptions) {
            int i = this.f12759b;
            if (i == -1 || a.this.isHeaderView(i) || a.this.f == null) {
                return;
            }
            a.this.f.onGoPage(this.f12759b, activityOptions, Boolean.valueOf(this.c.isExceptionTvVisible()));
            this.c.setExceptionTvVisibility(8);
        }
    }

    public interface b {
        void onGoPage(int i, ActivityOptions activityOptions, Boolean bool);
    }

    public a(Context context, List<km5> list) {
        this.f12757a = context;
        this.f12758b = list;
        this.c = LayoutInflater.from(context);
    }

    public int getContentItemCount() {
        return this.f12758b.size();
    }

    public km5 getItemAsPosition(int i) {
        if (isBottomView(i) || isHeaderView(i)) {
            return null;
        }
        return this.f12758b.get(i - this.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.d + getContentItemCount() + this.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return super.getItemId(i);
    }

    public int getItemType(int i) {
        return getItemAsPosition(i).f23979b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int contentItemCount = getContentItemCount();
        int i2 = this.d;
        if (i2 != 0 && i < i2) {
            return 90000;
        }
        if (this.e != 0 && i >= contentItemCount + i2) {
            return 90001;
        }
        km5 km5Var = this.f12758b.get(i - i2);
        if (km5Var != null) {
            return km5Var.f23979b;
        }
        return 21;
    }

    public boolean isBottomView(int i) {
        return this.e != 0 && i >= this.d + getContentItemCount();
    }

    public boolean isHeaderView(int i) {
        int i2 = this.d;
        return i2 != 0 && i < i2;
    }

    public final void j(RelativeItemContentViewHolder relativeItemContentViewHolder, int i) {
        C0718a c0718a = new C0718a(this.f12757a, relativeItemContentViewHolder.getItemView(), null, i, relativeItemContentViewHolder);
        c0718a.setRadius(ExtUtilsKt.getDp(16));
        c0718a.setTransitionBgColorRes(iji.I2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        km5 itemAsPosition = getItemAsPosition(i);
        if (itemAsPosition == null) {
            return;
        }
        d0Var.itemView.setTag(itemAsPosition);
        if (d0Var instanceof RelativeItemContentViewHolder) {
            RelativeItemContentViewHolder relativeItemContentViewHolder = (RelativeItemContentViewHolder) d0Var;
            relativeItemContentViewHolder.bindData(this.f12757a, itemAsPosition);
            j(relativeItemContentViewHolder, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        return new RelativeItemContentViewHolder(this.c.inflate(jui.O6, viewGroup, false));
    }

    public void setOnGoPageClickListener(b bVar) {
        this.f = bVar;
    }
}
