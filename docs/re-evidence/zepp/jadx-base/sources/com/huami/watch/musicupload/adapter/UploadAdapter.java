package com.huami.watch.musicupload.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.watch.musicupload.viewmodel.IMusicUploadObservable;
import com.huami.watch.wififtp.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 12\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0006\u001823456B\u0007¢\u0006\u0004\b/\u00100J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0014\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u001c\u0010\u0012\u001a\u00020\u00052\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0014\u0010\u0015\u001a\u00020\u00052\n\u0010\u0010\u001a\u00060\u0002R\u00020\u0000H\u0016J\u0014\u0010\u0016\u001a\u00020\u00052\n\u0010\u0010\u001a\u00060\u0002R\u00020\u0000H\u0016R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00067"}, d2 = {"Lcom/huami/watch/musicupload/adapter/UploadAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/watch/musicupload/adapter/UploadAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "", "Lcom/huami/watch/musicupload/adapter/UploadItemInfo;", "data", "setItems", "holder", "position", "onBindViewHolder", "getItemCount", "getItemViewType", "onViewDetachedFromWindow", "onViewAttachedToWindow", "", "a", "Ljava/util/List;", "items", "Landroid/view/LayoutInflater;", "b", "Landroid/view/LayoutInflater;", "inflater", "Lcom/huami/watch/musicupload/adapter/UploadAdapter$IItemClickListener;", "c", "Lcom/huami/watch/musicupload/adapter/UploadAdapter$IItemClickListener;", "getItemListener", "()Lcom/huami/watch/musicupload/adapter/UploadAdapter$IItemClickListener;", "setItemListener", "(Lcom/huami/watch/musicupload/adapter/UploadAdapter$IItemClickListener;)V", "itemListener", "Lcom/huami/watch/musicupload/viewmodel/IMusicUploadObservable;", GoogleApiAvailabilityLight.a, "Lcom/huami/watch/musicupload/viewmodel/IMusicUploadObservable;", "getUploadObservable", "()Lcom/huami/watch/musicupload/viewmodel/IMusicUploadObservable;", "setUploadObservable", "(Lcom/huami/watch/musicupload/viewmodel/IMusicUploadObservable;)V", "uploadObservable", "<init>", "()V", "f", "Holder", "IItemClickListener", "TitleHolder", "UploadFailedHolder", "UploadHolder", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class UploadAdapter extends RecyclerView.Adapter<Holder> {
    private static final String e = "UploadAdapter";

    @NotNull
    private static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<UploadItemInfo> items = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LayoutInflater inflater;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private IItemClickListener itemListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private IMusicUploadObservable uploadObservable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0096\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001f\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006$"}, d2 = {"Lcom/huami/watch/musicupload/adapter/UploadAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/watch/musicupload/adapter/UploadItemInfo;", "itemInfo", "", "onBind", "Landroid/view/View;", ExifInterface.GPS_DIRECTION_TRUE, "", "id", "findViewById", "(I)Landroid/view/View;", "onViewDetachedFromWindow", "onViewAttachedFromWindow", "a", "Lcom/huami/watch/musicupload/adapter/UploadItemInfo;", "getItem", "()Lcom/huami/watch/musicupload/adapter/UploadItemInfo;", "setItem", "(Lcom/huami/watch/musicupload/adapter/UploadItemInfo;)V", "item", "Lcom/huami/watch/musicupload/viewmodel/IMusicUploadObservable;", "b", "Lcom/huami/watch/musicupload/viewmodel/IMusicUploadObservable;", "getUploadObservable", "()Lcom/huami/watch/musicupload/viewmodel/IMusicUploadObservable;", "setUploadObservable", "(Lcom/huami/watch/musicupload/viewmodel/IMusicUploadObservable;)V", "uploadObservable", "Landroid/view/LayoutInflater;", "inflater", "layoutResId", "Landroid/view/ViewGroup;", "parent", "<init>", "(Lcom/huami/watch/musicupload/adapter/UploadAdapter;Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public class Holder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private UploadItemInfo item;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private IMusicUploadObservable uploadObservable;

        public Holder(LayoutInflater layoutInflater, @NotNull int i, ViewGroup viewGroup) {
            super(layoutInflater.inflate(i, viewGroup, false));
        }

        @NotNull
        public final <T extends View> T findViewById(int id) {
            return (T) this.itemView.findViewById(id);
        }

        @Nullable
        public final UploadItemInfo getItem() {
            return this.item;
        }

        @Nullable
        public final IMusicUploadObservable getUploadObservable() {
            return this.uploadObservable;
        }

        public void onBind(@NotNull UploadItemInfo itemInfo) {
            this.item = itemInfo;
        }

        public void onViewAttachedFromWindow() {
        }

        public void onViewDetachedFromWindow() {
        }

        public final void setItem(@Nullable UploadItemInfo uploadItemInfo) {
            this.item = uploadItemInfo;
        }

        public final void setUploadObservable(@Nullable IMusicUploadObservable iMusicUploadObservable) {
            this.uploadObservable = iMusicUploadObservable;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/huami/watch/musicupload/adapter/UploadAdapter$IItemClickListener;", "", "", "position", "Lcom/huami/watch/musicupload/adapter/UploadItemInfo;", "itemInfo", "", "onDelete", "onRetry", "onRetryAll", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public interface IItemClickListener {
        void onDelete(int position, @NotNull UploadItemInfo itemInfo);

        void onRetry(int position, @NotNull UploadItemInfo itemInfo);

        void onRetryAll();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/huami/watch/musicupload/adapter/UploadAdapter$TitleHolder;", "Lcom/huami/watch/musicupload/adapter/UploadAdapter$Holder;", "Lcom/huami/watch/musicupload/adapter/UploadAdapter;", "Lcom/huami/watch/musicupload/adapter/UploadItemInfo;", "itemInfo", "", "onBind", "Landroid/widget/TextView;", GoogleApiAvailabilityLight.a, "Landroid/widget/TextView;", "titleTv", "e", "retryAllTv", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "<init>", "(Lcom/huami/watch/musicupload/adapter/UploadAdapter;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class TitleHolder extends Holder {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextView titleTv;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextView retryAllTv;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IItemClickListener itemListener = UploadAdapter.this.getItemListener();
                if (itemListener != null) {
                    itemListener.onRetryAll();
                }
            }
        }

        public TitleHolder(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater, R.layout.item_upload_title, viewGroup);
            this.titleTv = (TextView) findViewById(R.id.tv_title);
            TextView textView = (TextView) findViewById(R.id.tv_retry_all);
            this.retryAllTv = textView;
            textView.setOnClickListener(new a());
        }

        @Override // com.huami.watch.musicupload.adapter.UploadAdapter.Holder
        public void onBind(@NotNull UploadItemInfo itemInfo) {
            super.onBind(itemInfo);
            UploadItemInfo item = getItem();
            if (item == null || item.getType() != 3) {
                this.retryAllTv.setVisibility(8);
                this.titleTv.setText(R.string.file_manager_transferring);
            } else {
                this.retryAllTv.setVisibility(0);
                this.titleTv.setText(R.string.file_manager_transfer_failed);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/huami/watch/musicupload/adapter/UploadAdapter$UploadFailedHolder;", "Lcom/huami/watch/musicupload/adapter/UploadAdapter$Holder;", "Lcom/huami/watch/musicupload/adapter/UploadAdapter;", "Lcom/huami/watch/musicupload/adapter/UploadItemInfo;", "itemInfo", "", "onBind", "Landroid/widget/TextView;", GoogleApiAvailabilityLight.a, "Landroid/widget/TextView;", "taskNameTv", "Landroid/widget/ProgressBar;", "e", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/view/View;", "f", "Landroid/view/View;", "deleteBtn", "g", "retryBtn", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "<init>", "(Lcom/huami/watch/musicupload/adapter/UploadAdapter;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class UploadFailedHolder extends Holder {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextView taskNameTv;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final ProgressBar progressBar;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final View deleteBtn;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final View retryBtn;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IItemClickListener itemListener;
                UploadItemInfo item = UploadFailedHolder.this.getItem();
                if (item == null || (itemListener = UploadAdapter.this.getItemListener()) == null) {
                    return;
                }
                itemListener.onDelete(UploadFailedHolder.this.getAdapterPosition(), item);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b implements View.OnClickListener {
            public b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IItemClickListener itemListener;
                UploadItemInfo item = UploadFailedHolder.this.getItem();
                if (item == null || (itemListener = UploadAdapter.this.getItemListener()) == null) {
                    return;
                }
                itemListener.onRetry(UploadFailedHolder.this.getAdapterPosition(), item);
            }
        }

        public UploadFailedHolder(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater, R.layout.item_upload_failed, viewGroup);
            this.taskNameTv = (TextView) findViewById(R.id.tv_task_name);
            this.progressBar = (ProgressBar) findViewById(R.id.pb_task_progress);
            View viewFindViewById = findViewById(R.id.view_delete);
            this.deleteBtn = viewFindViewById;
            View viewFindViewById2 = findViewById(R.id.view_retry);
            this.retryBtn = viewFindViewById2;
            viewFindViewById.setOnClickListener(new a());
            viewFindViewById2.setOnClickListener(new b());
        }

        @Override // com.huami.watch.musicupload.adapter.UploadAdapter.Holder
        public void onBind(@NotNull UploadItemInfo itemInfo) {
            super.onBind(itemInfo);
            FileInfo fileInfo = itemInfo.getFileInfo();
            if (fileInfo != null) {
                this.taskNameTv.setText(fileInfo.getName());
                this.progressBar.setProgress(itemInfo.getProgress());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0015\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/huami/watch/musicupload/adapter/UploadAdapter$UploadHolder;", "Lcom/huami/watch/musicupload/adapter/UploadAdapter$Holder;", "Lcom/huami/watch/musicupload/adapter/UploadAdapter;", "Lcom/huami/watch/musicupload/adapter/UploadItemInfo;", "itemInfo", "", "onBind", "onViewAttachedFromWindow", "onViewDetachedFromWindow", "Landroid/widget/TextView;", GoogleApiAvailabilityLight.a, "Landroid/widget/TextView;", "taskNameTv", "Landroid/widget/ProgressBar;", "e", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/view/View;", "f", "Landroid/view/View;", "deleteBtn", "com/huami/watch/musicupload/adapter/UploadAdapter$UploadHolder$uploadCallback$1", "g", "Lcom/huami/watch/musicupload/adapter/UploadAdapter$UploadHolder$uploadCallback$1;", "uploadCallback", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "<init>", "(Lcom/huami/watch/musicupload/adapter/UploadAdapter;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class UploadHolder extends Holder {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextView taskNameTv;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final ProgressBar progressBar;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final View deleteBtn;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final UploadAdapter$UploadHolder$uploadCallback$1 uploadCallback;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IItemClickListener itemListener;
                UploadItemInfo item = UploadHolder.this.getItem();
                if (item == null || (itemListener = UploadAdapter.this.getItemListener()) == null) {
                    return;
                }
                itemListener.onDelete(UploadHolder.this.getAdapterPosition(), item);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b extends Lambda implements Function0<String> {
            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                FileInfo fileInfo;
                StringBuilder sb = new StringBuilder();
                sb.append("onViewAttachedFromWindow for ");
                UploadItemInfo item = UploadHolder.this.getItem();
                sb.append((item == null || (fileInfo = item.getFileInfo()) == null) ? null : fileInfo.getName());
                return sb.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class c extends Lambda implements Function0<String> {
            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                FileInfo fileInfo;
                StringBuilder sb = new StringBuilder();
                sb.append("onViewDetachedFromWindow for ");
                UploadItemInfo item = UploadHolder.this.getItem();
                sb.append((item == null || (fileInfo = item.getFileInfo()) == null) ? null : fileInfo.getName());
                return sb.toString();
            }
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [com.huami.watch.musicupload.adapter.UploadAdapter$UploadHolder$uploadCallback$1] */
        public UploadHolder(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater, R.layout.item_upload, viewGroup);
            this.taskNameTv = (TextView) findViewById(R.id.tv_task_name);
            this.progressBar = (ProgressBar) findViewById(R.id.pb_task_progress);
            View viewFindViewById = findViewById(R.id.view_delete);
            this.deleteBtn = viewFindViewById;
            this.uploadCallback = new IMusicUploadObservable.IUploadObserver() { // from class: com.huami.watch.musicupload.adapter.UploadAdapter$UploadHolder$uploadCallback$1
                @Override // com.huami.watch.musicupload.viewmodel.IMusicUploadObservable.IUploadObserver
                public boolean needNotifyAbout(@NotNull FileInfo fileInfo) {
                    UploadItemInfo item = this.a.getItem();
                    return Intrinsics.areEqual(fileInfo, item != null ? item.getFileInfo() : null);
                }

                @Override // com.huami.watch.musicupload.viewmodel.IMusicUploadObservable.IUploadObserver
                public void onProgressChanged(int progress) {
                    this.a.progressBar.setProgress(progress);
                }
            };
            viewFindViewById.setOnClickListener(new a());
        }

        @Override // com.huami.watch.musicupload.adapter.UploadAdapter.Holder
        public void onBind(@NotNull UploadItemInfo itemInfo) {
            super.onBind(itemInfo);
            FileInfo fileInfo = itemInfo.getFileInfo();
            if (fileInfo != null) {
                this.taskNameTv.setText(fileInfo.getName());
                this.progressBar.setProgress(itemInfo.getProgress());
            }
        }

        @Override // com.huami.watch.musicupload.adapter.UploadAdapter.Holder
        public void onViewAttachedFromWindow() {
            a unused = UploadAdapter.f;
            HMLog.info(UploadAdapter.e, new b());
            IMusicUploadObservable uploadObservable = getUploadObservable();
            if (uploadObservable != null) {
                uploadObservable.registerObserver(this.uploadCallback);
            }
        }

        @Override // com.huami.watch.musicupload.adapter.UploadAdapter.Holder
        public void onViewDetachedFromWindow() {
            a unused = UploadAdapter.f;
            HMLog.info(UploadAdapter.e, new c());
            IMusicUploadObservable uploadObservable = getUploadObservable();
            if (uploadObservable != null) {
                uploadObservable.unRegisterObserver(this.uploadCallback);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/watch/musicupload/adapter/UploadAdapter$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.items.size();
    }

    @Nullable
    public final IItemClickListener getItemListener() {
        return this.itemListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.items.get(position).getType();
    }

    @Nullable
    public final IMusicUploadObservable getUploadObservable() {
        return this.uploadObservable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.inflater = LayoutInflater.from(recyclerView.getContext());
    }

    public final void setItemListener(@Nullable IItemClickListener iItemClickListener) {
        this.itemListener = iItemClickListener;
    }

    public final void setItems(@NotNull List<UploadItemInfo> data) {
        this.items.clear();
        this.items.addAll(data);
    }

    public final void setUploadObservable(@Nullable IMusicUploadObservable iMusicUploadObservable) {
        this.uploadObservable = iMusicUploadObservable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        holder.onBind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Holder uploadHolder;
        if (viewType != 0) {
            uploadHolder = viewType != 1 ? new TitleHolder(this.inflater, parent) : new UploadFailedHolder(this.inflater, parent);
        } else {
            uploadHolder = new UploadHolder(this.inflater, parent);
        }
        uploadHolder.setUploadObservable(this.uploadObservable);
        return uploadHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull Holder holder) {
        super.onViewAttachedToWindow(holder);
        holder.onViewAttachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NotNull Holder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.onViewDetachedFromWindow();
    }
}
