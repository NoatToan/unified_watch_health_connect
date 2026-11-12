package com.huawei.ui.device.activity.notification.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.device.R;
import defpackage.lzj;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class NotificationAppAdapter extends ListAdapter<lzj, AppViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnItemClickListener f24537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24538b;
    private final Context e;

    /* JADX INFO: loaded from: classes3.dex */
    public interface OnItemClickListener {
        void onSwitchChanged(lzj lzjVar, boolean z, int i);
    }

    public static class DiffUtilCallBack extends DiffUtil.ItemCallback<lzj> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<NotificationAppAdapter> f24543c = new WeakReference<>(null);

        public void a(NotificationAppAdapter notificationAppAdapter) {
            this.f24543c = new WeakReference<>(notificationAppAdapter);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(lzj lzjVar, lzj lzjVar2) {
            return Objects.equals(lzjVar.f(), lzjVar2.f());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(lzj lzjVar, lzj lzjVar2) {
            NotificationAppAdapter notificationAppAdapter = this.f24543c.get();
            List<lzj> currentList = Collections.EMPTY_LIST;
            if (notificationAppAdapter != null) {
                currentList = notificationAppAdapter.getCurrentList();
            }
            return Objects.equals(lzjVar.d(), lzjVar2.d()) && lzjVar.e() == lzjVar2.e() && Objects.equals(lzjVar.c(), lzjVar2.c()) && lzjVar.a() == lzjVar2.a() && !CollectionUtils.a(currentList) && !currentList.get(currentList.size() - 1).f().equals(lzjVar.f()) && !CollectionUtils.a(currentList) && !currentList.get(currentList.size() - 1).f().equals(lzjVar2.f());
        }
    }

    public NotificationAppAdapter(Context context, DiffUtilCallBack diffUtilCallBack) {
        super(diffUtilCallBack);
        this.f24538b = true;
        diffUtilCallBack.a(this);
        this.e = context;
        LogUtil.a("NotificationAppAdapter", "NotificationAppAdapter初始化完成");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AppViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new AppViewHolder(LayoutInflater.from(this.e).inflate(R.layout.notification_list_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AppViewHolder appViewHolder, int i) {
        appViewHolder.a(getItem(i), this.f24538b, i, this.f24537a);
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) appViewHolder.itemView.getLayoutParams();
        if (i == getItemCount() - 1) {
            appViewHolder.itemView.setBackground(ContextCompat.getDrawable(this.e, R.drawable.wear_device_arkui_card_bg_bottom));
            appViewHolder.f24541c.setVisibility(8);
            layoutParams.setMargins((int) this.e.getResources().getDimension(R.dimen.health_common_16dp), 0, (int) this.e.getResources().getDimension(R.dimen.health_common_16dp), (int) this.e.getResources().getDimension(R.dimen.health_common_16dp));
        } else {
            appViewHolder.itemView.setBackgroundColor(this.e.getColor(R.color.colorWearHomeBg));
            appViewHolder.f24541c.setVisibility(0);
            layoutParams.setMargins((int) this.e.getResources().getDimension(R.dimen.health_common_16dp), 0, (int) this.e.getResources().getDimension(R.dimen.health_common_16dp), 0);
        }
    }

    public void e(List<lzj> list) {
        submitList(list != null ? new ArrayList(list) : null);
    }

    public void c(OnItemClickListener onItemClickListener) {
        this.f24537a = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.ListAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public lzj getItem(int i) {
        return (lzj) super.getItem(i);
    }

    public void b(boolean z) {
        this.f24538b = z;
        notifyItemRangeChanged(0, getItemCount());
        LogUtil.a("NotificationAppAdapter", "设置所有条目可选状态: " + z);
    }

    public static class AppViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ImageView f24539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthSwitchButton f24540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f24541c;
        private final HealthTextView d;

        public AppViewHolder(View view) {
            super(view);
            this.f24539a = (ImageView) view.findViewById(R.id.app_icon);
            this.d = (HealthTextView) view.findViewById(R.id.app_name);
            this.f24540b = (HealthSwitchButton) view.findViewById(R.id.app_switch);
            this.f24541c = view.findViewById(R.id.notification_divider);
        }

        public void a(final lzj lzjVar, boolean z, final int i, final OnItemClickListener onItemClickListener) {
            LogUtil.a("NotificationAppAdapter", "bindData: " + z);
            if (z) {
                this.itemView.setVisibility(0);
                this.f24540b.setOnCheckedChangeListener(null);
                this.f24539a.setImageDrawable(lzjVar.b());
                this.d.setText(lzjVar.d());
                LogUtil.a("NotificationAppAdapter", lzjVar.d() + ":" + lzjVar.e());
                this.f24540b.setChecked(lzjVar.e() == 1);
                ImageView imageView = this.f24539a;
                imageView.setColorFilter(ContextCompat.getColor(imageView.getContext(), R.color.common_white_0alpha));
                HealthTextView healthTextView = this.d;
                healthTextView.setTextColor(ContextCompat.getColor(healthTextView.getContext(), R.color.textColorPrimary));
                this.f24540b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.notification.adapter.NotificationAppAdapter$AppViewHolder$$ExternalSyntheticLambda0
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                        NotificationAppAdapter.AppViewHolder.c(lzjVar, onItemClickListener, i, compoundButton, z2);
                    }
                });
                return;
            }
            this.itemView.setVisibility(8);
        }

        static /* synthetic */ void c(lzj lzjVar, OnItemClickListener onItemClickListener, int i, CompoundButton compoundButton, boolean z) {
            LogUtil.a("NotificationAppAdapter", "开关变化: " + lzjVar.d() + " -> " + z);
            if (onItemClickListener == null) {
                return;
            }
            onItemClickListener.onSwitchChanged(lzjVar, z, i);
        }
    }
}
