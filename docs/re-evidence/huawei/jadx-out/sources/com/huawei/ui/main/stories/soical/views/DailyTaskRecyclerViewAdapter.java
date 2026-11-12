package com.huawei.ui.main.stories.soical.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.operationbundle.R;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.main.stories.soical.NewSocialFragment;
import defpackage.njy;
import defpackage.osg;
import defpackage.qji;
import defpackage.tsr;
import defpackage.woy;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class DailyTaskRecyclerViewAdapter extends RecyclerView.Adapter<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<MessageObject> f28952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup f28953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference<NewSocialFragment> f28954c;
    private final List<ImageView> d;
    private final Context e;
    private final woy f;
    private LayoutInflater i;

    public DailyTaskRecyclerViewAdapter(NewSocialFragment newSocialFragment, List<ImageView> list, List<MessageObject> list2, woy woyVar) {
        this.f28954c = new WeakReference<>(newSocialFragment);
        this.d = list;
        this.f = woyVar;
        this.f28952a = list2;
        this.e = newSocialFragment.getActivity();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public d onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.i == null) {
            this.i = LayoutInflater.from(viewGroup.getContext());
        }
        if (this.f28953b == null) {
            this.f28953b = viewGroup;
        }
        d dVar = new d(this.i.inflate(R.layout.layout_new_social_cardview, (ViewGroup) null));
        dVar.c();
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(d dVar, int i) {
        NewSocialFragment newSocialFragment = this.f28954c.get();
        if (newSocialFragment == null || !newSocialFragment.isVisible() || newSocialFragment.isRemoving() || newSocialFragment.isDetached()) {
            return;
        }
        a(dVar, i, this.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.b(this.d)) {
            return this.d.size();
        }
        return 0;
    }

    static class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f28955a;

        d(View view) {
            super(view);
        }

        void c() {
            this.f28955a = this.itemView;
        }
    }

    private void a(d dVar, int i, List<ImageView> list) {
        if (njy.e(list, i)) {
            notifyItemRemoved(i);
            notifyItemRangeChanged(i, getItemCount());
            return;
        }
        View viewB = this.f.b(list.get(i).getDrawable(), this.f28953b, i, dVar.f28955a);
        viewB.setTag(R.layout.layout_new_social_cardview, Long.valueOf(System.currentTimeMillis()));
        if (njy.e(this.f28952a, i)) {
            this.f.c(viewB);
            return;
        }
        MessageObject messageObject = this.f28952a.get(i);
        if (messageObject == null || TextUtils.isEmpty(messageObject.getMsgId())) {
            return;
        }
        if (messageObject instanceof tsr) {
            tsr tsrVar = (tsr) messageObject;
            TextView textView = (TextView) viewB.findViewById(R.id.card_txt_btn);
            if (tsrVar.a()) {
                osg osgVarB = tsrVar.b();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(this.e.getResources().getDimensionPixelSize(R.dimen.health_common_14dp));
                gradientDrawable.setColor(Color.parseColor(osgVarB.y()));
                textView.setBackgroundDrawable(gradientDrawable);
                this.f.b(osgVarB, textView);
            }
            textView.setVisibility(tsrVar.a() ? 0 : 8);
        }
        this.f.a(messageObject, 0L, 1);
        Context context = this.e;
        if (context instanceof BaseActivity) {
            viewB.setOnClickListener(qji.b(new woy.e(this.f, messageObject), (BaseActivity) context, this.f.b().isNotSupportBrowseUrl(messageObject.getDetailUri()), AnalyticsValue.SOCIAL_1070004.value()));
        } else {
            viewB.setOnClickListener(new woy.e(this.f, messageObject));
        }
    }
}
