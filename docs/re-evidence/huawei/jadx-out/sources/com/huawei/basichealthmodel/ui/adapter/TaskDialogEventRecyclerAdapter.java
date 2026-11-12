package com.huawei.basichealthmodel.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basichealthmodel.R;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.RecyclerViewHolder;
import defpackage.bwc;
import defpackage.njy;
import defpackage.qqz;
import defpackage.qre;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class TaskDialogEventRecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<bwc> f5348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ResponseCallback<bwc> f5350c;
    private final Context d;
    private final boolean e;

    public TaskDialogEventRecyclerAdapter(List<bwc> list) {
        this.f5348a = list;
        Context contextB = BaseApplication.b();
        this.d = contextB;
        this.e = LanguageUtil.l(contextB);
        this.f5349b = LanguageUtil.ba(contextB);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new RecyclerViewHolder(LayoutInflater.from(this.d).inflate(R.layout.item_task_dialog_recycler_event, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(RecyclerViewHolder recyclerViewHolder, int i) {
        b(recyclerViewHolder, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(RecyclerViewHolder recyclerViewHolder, int i, List<Object> list) {
        b(recyclerViewHolder, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.f5348a)) {
            return 0;
        }
        return this.f5348a.size();
    }

    private void b(RecyclerViewHolder recyclerViewHolder, int i) {
        if (njy.e(this.f5348a, i)) {
            LogUtil.j("HL_TaskDialogEventRecyclerAdapter", "bindData mList is out of bounds position ", Integer.valueOf(i), " mList ", this.f5348a);
            return;
        }
        final bwc bwcVar = this.f5348a.get(i);
        if (bwcVar == null) {
            LogUtil.j("HL_TaskDialogEventRecyclerAdapter", "bindData bean is null");
            return;
        }
        ImageView imageView = (ImageView) recyclerViewHolder.a(R.id.item_task_dialog_recycler_event_icon);
        int iE = bwcVar.e();
        imageView.setImageDrawable(this.f5349b ? qqz.e(this.d, iE) : qre.c(iE));
        HealthTextView healthTextView = (HealthTextView) recyclerViewHolder.a(R.id.item_task_dialog_recycler_event_text);
        if (this.e) {
            healthTextView.setText(qre.i(bwcVar.c()));
            healthTextView.setVisibility(0);
        } else {
            healthTextView.setVisibility(8);
        }
        ((RelativeLayout) recyclerViewHolder.a(R.id.item_task_dialog_recycler_event_layout)).setOnClickListener(new View.OnClickListener() { // from class: cal
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(bwcVar, view);
            }
        });
    }

    public /* synthetic */ void d(bwc bwcVar, View view) {
        ResponseCallback<bwc> responseCallback = this.f5350c;
        if (responseCallback == null) {
            LogUtil.j("HL_TaskDialogEventRecyclerAdapter", "bindData mCallback is null");
        } else {
            responseCallback.onResponse(0, bwcVar);
        }
    }

    public void e(ResponseCallback<bwc> responseCallback) {
        this.f5350c = responseCallback;
    }
}
