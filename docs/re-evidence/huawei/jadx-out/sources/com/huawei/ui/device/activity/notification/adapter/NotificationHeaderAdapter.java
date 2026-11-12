package com.huawei.ui.device.activity.notification.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.device.R;
import defpackage.qsp;

/* JADX INFO: loaded from: classes16.dex */
public class NotificationHeaderAdapter extends RecyclerView.Adapter<HeaderViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f24544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24545b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 1;
    }

    public NotificationHeaderAdapter(View view) {
        this.f24544a = view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public HeaderViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new HeaderViewHolder(this.f24544a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(HeaderViewHolder headerViewHolder, int i) {
        headerViewHolder.a(this.f24545b);
    }

    public void a(boolean z) {
        this.f24545b = z;
    }

    public static class HeaderViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f24546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private View f24547c;
        private View e;

        public HeaderViewHolder(View view) {
            super(view);
            this.f24546b = qsp.a(view, R.id.ll_notification_sub_area);
            this.f24547c = qsp.a(view, R.id.notification_error_layout);
            this.e = qsp.a(view, R.id.notification_push_open_description);
        }

        public void a(boolean z) {
            this.f24546b.setVisibility(z ? 0 : 8);
            this.e.setVisibility(z ? 8 : 0);
            this.f24547c.setVisibility(z ? 0 : 8);
        }
    }
}
