package com.xiaomi.fitness.devicesettings.common.offlinemap;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.devicesettings.common.offlinemap.DistrictDownloadingAdapter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.eui;
import defpackage.wzi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0014H\u0017J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictDownloadingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/Holder;", "baseActivity", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "data", "", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictData;", "<init>", "(Lcom/xiaomi/fitness/baseui/view/BaseActivity;Ljava/util/List;)V", "getBaseActivity", "()Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "cancelTask", "Landroid/view/View$OnClickListener;", "id", "", "item", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DistrictDownloadingAdapter extends RecyclerView.Adapter<Holder> {

    @NotNull
    private final BaseActivity baseActivity;

    @NotNull
    private List<DistrictData> data;

    public DistrictDownloadingAdapter(@NotNull BaseActivity baseActivity, @NotNull List<DistrictData> data) {
        Intrinsics.checkNotNullParameter(baseActivity, "baseActivity");
        Intrinsics.checkNotNullParameter(data, "data");
        this.baseActivity = baseActivity;
        this.data = data;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancelTask$lambda$2(final long j, DistrictData item, DistrictDownloadingAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (j == -1) {
            return;
        }
        OfflineMapExKt.showCancelDownloadDialog(item.getName(), this$0.baseActivity, new Function0() { // from class: h07
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DistrictDownloadingAdapter.cancelTask$lambda$2$lambda$1(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelTask$lambda$2$lambda$1(long j) {
        OfflineMapDownloadManager.INSTANCE.cancelDownloading(j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$0(DistrictDownloadingAdapter this$0, DistrictData item, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.cancelTask(OfflineMapDownloadManager.INSTANCE.findDownloadingId(item.getAdcode()), item, i).onClick(view);
        return Unit.INSTANCE;
    }

    @NotNull
    public final View.OnClickListener cancelTask(final long id, @NotNull final DistrictData item, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new View.OnClickListener() { // from class: f07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DistrictDownloadingAdapter.cancelTask$lambda$2(id, item, this, view);
            }
        };
    }

    @NotNull
    public final BaseActivity getBaseActivity() {
        return this.baseActivity;
    }

    @NotNull
    public final List<DistrictData> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.data.size();
    }

    public final void setData(@NotNull List<DistrictData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"SetTextI18n"})
    public void onBindViewHolder(@NotNull Holder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final DistrictData districtData = this.data.get(position);
        holder.getDistrictName().setText(districtData.getName());
        TextView districtSize = holder.getDistrictSize();
        String size = districtData.getSize();
        if (size == null) {
            size = "";
        }
        districtSize.setText(size);
        ImageView download = holder.getDownload();
        Intrinsics.checkNotNullExpressionValue(download, "<get-download>(...)");
        ViewExtKt.setVisible(download, false);
        TextView downloadProgressText = holder.getDownloadProgressText();
        Intrinsics.checkNotNullExpressionValue(downloadProgressText, "<get-downloadProgressText>(...)");
        ViewExtKt.setVisible(downloadProgressText, true);
        if (districtData.getDownloadStatus() == DownloadStatus.STATUS_INSTALLING) {
            View downloadProgressLayout = holder.getDownloadProgressLayout();
            Intrinsics.checkNotNullExpressionValue(downloadProgressLayout, "<get-downloadProgressLayout>(...)");
            ViewExtKt.setVisible(downloadProgressLayout, false);
            TextView installingLabel = holder.getInstallingLabel();
            Intrinsics.checkNotNullExpressionValue(installingLabel, "<get-installingLabel>(...)");
            ViewExtKt.setVisible(installingLabel, true);
            holder.getInstallingLabel().setText(wzi.k5);
        } else {
            View downloadProgressLayout2 = holder.getDownloadProgressLayout();
            Intrinsics.checkNotNullExpressionValue(downloadProgressLayout2, "<get-downloadProgressLayout>(...)");
            ViewExtKt.setVisible(downloadProgressLayout2, true);
            TextView installingLabel2 = holder.getInstallingLabel();
            Intrinsics.checkNotNullExpressionValue(installingLabel2, "<get-installingLabel>(...)");
            ViewExtKt.setVisible(installingLabel2, false);
            holder.getDownloadProgress().setProgress(districtData.getDownloadProgress());
        }
        ViewExtKt.clickWithTrigger$default(holder.getDownloadProgressLayout(), 0L, new Function1() { // from class: g07
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DistrictDownloadingAdapter.onBindViewHolder$lambda$0(this.f18413a, districtData, position, (View) obj);
            }
        }, 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(eui.W2, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new Holder(viewInflate);
    }
}
