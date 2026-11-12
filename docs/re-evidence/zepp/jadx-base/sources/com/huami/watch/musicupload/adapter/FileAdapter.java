package com.huami.watch.musicupload.adapter;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.musicupload.fragment.MusicConstant;
import com.huami.watch.wififtp.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 32\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0006345678B\u000f\u0012\u0006\u00101\u001a\u00020*¢\u0006\u0004\b2\u00100J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u000e\u001a\u00020\u00052\n\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0014\u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\tJ\u0014\u0010\u0018\u001a\u00020\u00052\n\u0010\f\u001a\u00060\u0002R\u00020\u0000H\u0016J\u0014\u0010\u0019\u001a\u00020\u00052\n\u0010\f\u001a\u00060\u0002R\u00020\u0000H\u0016R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00069"}, d2 = {"Lcom/huami/watch/musicupload/adapter/FileAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/watch/musicupload/adapter/FileAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "onBindViewHolder", "getItemCount", "", "Landroid/view/View;", "getSelectImageView", "Lcom/huami/watch/musicupload/adapter/FileItemInfo;", "data", "setItems", "getItemViewType", "getItem", "onViewDetachedFromWindow", "onViewAttachedToWindow", "", "a", "Ljava/util/List;", "items", "Landroid/view/LayoutInflater;", "b", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/res/Resources;", "c", "Landroid/content/res/Resources;", "resource", "Ljava/util/concurrent/ConcurrentLinkedQueue;", GoogleApiAvailabilityLight.a, "Ljava/util/concurrent/ConcurrentLinkedQueue;", "selectedViews", "Lcom/huami/watch/musicupload/adapter/FileAdapter$ItemClickListener;", "e", "Lcom/huami/watch/musicupload/adapter/FileAdapter$ItemClickListener;", "getItemClickListener", "()Lcom/huami/watch/musicupload/adapter/FileAdapter$ItemClickListener;", "setItemClickListener", "(Lcom/huami/watch/musicupload/adapter/FileAdapter$ItemClickListener;)V", "itemClickListener", "<init>", "Companion", "FileHolder", "FolderHolder", "Holder", "ItemClickListener", "SelectAllHolder", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class FileAdapter extends RecyclerView.Adapter<Holder> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LayoutInflater inflater;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Resources resource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private ItemClickListener itemClickListener;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<FileItemInfo> items = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ConcurrentLinkedQueue<View> selectedViews = new ConcurrentLinkedQueue<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\t"}, d2 = {"Lcom/huami/watch/musicupload/adapter/FileAdapter$Companion;", "", "Landroid/view/View;", "", "show", "", "a", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(View view, boolean z) {
            view.setVisibility(z ? 0 : 8);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/huami/watch/musicupload/adapter/FileAdapter$FileHolder;", "Lcom/huami/watch/musicupload/adapter/FileAdapter$Holder;", "Lcom/huami/watch/musicupload/adapter/FileAdapter;", "Lcom/huami/watch/musicupload/adapter/FileItemInfo;", "itemInfo", "", "onBind", "onViewAttachedFromWindow", "onViewDetachedFromWindow", "Landroid/view/View;", "c", "Landroid/view/View;", "selectStatusIv", GoogleApiAvailabilityLight.a, "unSelectStatusIv", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "fileNameTv", "f", "fileSizeTv", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "<init>", "(Lcom/huami/watch/musicupload/adapter/FileAdapter;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class FileHolder extends Holder {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final View selectStatusIv;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final View unSelectStatusIv;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextView fileNameTv;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextView fileSizeTv;

        public FileHolder(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater, R.layout.item_file, viewGroup);
            this.selectStatusIv = findViewById(R.id.iv_select);
            this.unSelectStatusIv = findViewById(R.id.iv_un_select);
            this.fileNameTv = (TextView) findViewById(R.id.tv_file_name);
            this.fileSizeTv = (TextView) findViewById(R.id.tv_file_size);
        }

        @Override // com.huami.watch.musicupload.adapter.FileAdapter.Holder
        public void onBind(@NotNull FileItemInfo itemInfo) {
            super.onBind(itemInfo);
            Companion companion = FileAdapter.INSTANCE;
            companion.a(this.selectStatusIv, itemInfo.getSelect());
            companion.a(this.unSelectStatusIv, !itemInfo.getSelect());
            FileInfo fileInfo = itemInfo.getFileInfo();
            this.fileNameTv.setText(fileInfo.getName());
            this.fileSizeTv.setText(MusicConstant.INSTANCE.formatFileSize(FileAdapter.this.resource, fileInfo.getSize(), true));
        }

        @Override // com.huami.watch.musicupload.adapter.FileAdapter.Holder
        public void onViewAttachedFromWindow() {
            super.onViewAttachedFromWindow();
            FileItemInfo item = getItem();
            if (item == null || !item.getSelect() || FileAdapter.this.selectedViews.contains(this.selectStatusIv)) {
                return;
            }
            FileAdapter.this.selectedViews.add(this.selectStatusIv);
        }

        @Override // com.huami.watch.musicupload.adapter.FileAdapter.Holder
        public void onViewDetachedFromWindow() {
            super.onViewDetachedFromWindow();
            FileAdapter.this.selectedViews.remove(this.selectStatusIv);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/huami/watch/musicupload/adapter/FileAdapter$FolderHolder;", "Lcom/huami/watch/musicupload/adapter/FileAdapter$Holder;", "Lcom/huami/watch/musicupload/adapter/FileAdapter;", "Lcom/huami/watch/musicupload/adapter/FileItemInfo;", "itemInfo", "", "onBind", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "folderNameTv", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "<init>", "(Lcom/huami/watch/musicupload/adapter/FileAdapter;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class FolderHolder extends Holder {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextView folderNameTv;

        public FolderHolder(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater, R.layout.item_folder, viewGroup);
            this.folderNameTv = (TextView) findViewById(R.id.tv_folder_name);
        }

        @Override // com.huami.watch.musicupload.adapter.FileAdapter.Holder
        public void onBind(@NotNull FileItemInfo itemInfo) {
            super.onBind(itemInfo);
            this.folderNameTv.setText(itemInfo.getFileInfo().getName());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0096\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u001f\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/huami/watch/musicupload/adapter/FileAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/watch/musicupload/adapter/FileItemInfo;", "itemInfo", "", "onBind", "onItemClick", "onViewDetachedFromWindow", "onViewAttachedFromWindow", "Landroid/view/View;", ExifInterface.GPS_DIRECTION_TRUE, "", "id", "findViewById", "(I)Landroid/view/View;", "a", "Lcom/huami/watch/musicupload/adapter/FileItemInfo;", "getItem", "()Lcom/huami/watch/musicupload/adapter/FileItemInfo;", "setItem", "(Lcom/huami/watch/musicupload/adapter/FileItemInfo;)V", "item", "Landroid/view/LayoutInflater;", "inflater", "layoutResId", "Landroid/view/ViewGroup;", "parent", "<init>", "(Lcom/huami/watch/musicupload/adapter/FileAdapter;Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public class Holder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private FileItemInfo item;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Holder.this.onItemClick();
            }
        }

        public Holder(LayoutInflater layoutInflater, @NotNull int i, ViewGroup viewGroup) {
            super(layoutInflater.inflate(i, viewGroup, false));
            this.itemView.setOnClickListener(new a());
        }

        @NotNull
        public final <T extends View> T findViewById(int id) {
            return (T) this.itemView.findViewById(id);
        }

        @Nullable
        public final FileItemInfo getItem() {
            return this.item;
        }

        public void onBind(@NotNull FileItemInfo itemInfo) {
            this.item = itemInfo;
        }

        public void onItemClick() {
            FileAdapter.this.getItemClickListener().onItemClick(getAdapterPosition());
        }

        public void onViewAttachedFromWindow() {
        }

        public void onViewDetachedFromWindow() {
        }

        public final void setItem(@Nullable FileItemInfo fileItemInfo) {
            this.item = fileItemInfo;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/watch/musicupload/adapter/FileAdapter$ItemClickListener;", "", "", "position", "", "onItemClick", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public interface ItemClickListener {
        void onItemClick(int position);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/huami/watch/musicupload/adapter/FileAdapter$SelectAllHolder;", "Lcom/huami/watch/musicupload/adapter/FileAdapter$Holder;", "Lcom/huami/watch/musicupload/adapter/FileAdapter;", "Lcom/huami/watch/musicupload/adapter/FileItemInfo;", "itemInfo", "", "onBind", "Landroid/view/View;", "c", "Landroid/view/View;", "selectStatusIv", GoogleApiAvailabilityLight.a, "unselectStatusIv", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "<init>", "(Lcom/huami/watch/musicupload/adapter/FileAdapter;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class SelectAllHolder extends Holder {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final View selectStatusIv;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final View unselectStatusIv;

        public SelectAllHolder(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater, R.layout.item_select_all, viewGroup);
            this.selectStatusIv = findViewById(R.id.iv_select);
            this.unselectStatusIv = findViewById(R.id.iv_un_select);
        }

        @Override // com.huami.watch.musicupload.adapter.FileAdapter.Holder
        public void onBind(@NotNull FileItemInfo itemInfo) {
            super.onBind(itemInfo);
            Companion companion = FileAdapter.INSTANCE;
            companion.a(this.selectStatusIv, itemInfo.getSelect());
            companion.a(this.unselectStatusIv, !itemInfo.getSelect());
        }
    }

    public FileAdapter(@NotNull ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Nullable
    public final FileItemInfo getItem(int position) {
        if (position < 0 || position >= this.items.size()) {
            return null;
        }
        return this.items.get(position);
    }

    @NotNull
    public final ItemClickListener getItemClickListener() {
        return this.itemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        FileItemInfo item = getItem(position);
        if (item != null) {
            return item.getType();
        }
        return 2;
    }

    @NotNull
    public final List<View> getSelectImageView() {
        return CollectionsKt___CollectionsKt.toList(this.selectedViews);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.inflater = LayoutInflater.from(recyclerView.getContext());
        this.resource = recyclerView.getContext().getResources();
    }

    public final void setItemClickListener(@NotNull ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public final void setItems(@NotNull List<FileItemInfo> data) {
        this.selectedViews.clear();
        this.items.clear();
        this.items.addAll(data);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        FileItemInfo item = getItem(position);
        if (item != null) {
            holder.onBind(item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        if (viewType == 0) {
            return new SelectAllHolder(this.inflater, parent);
        }
        return viewType == 2 ? new FolderHolder(this.inflater, parent) : new FileHolder(this.inflater, parent);
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
