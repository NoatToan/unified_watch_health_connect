package com.huami.devicerecorder.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicerecorder.R;
import com.huami.devicerecorder.adapter.SyncingViewHolder;
import com.huami.devicerecorder.model.RecordFile;
import com.huami.devicerecorder.model.RecordUtils;
import com.huami.devicerecorder.model.SyncItemData;
import com.huami.devicerecorder.viewmodel.IRecorderSyncer;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0002*\u000eB\u0017\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004R\u001e\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\u0010\u001a\n \t*\u0004\u0018\u00010\r0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0014\u001a\n \t*\u0004\u0018\u00010\u00110\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00060 R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006+"}, d2 = {"Lcom/huami/devicerecorder/adapter/SyncingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/devicerecorder/model/SyncItemData;", "itemData", "", "onBind", "onViewDetachedFromWindow", "onViewAttachedFromWindow", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "a", "Landroid/widget/TextView;", "timeTv", "Landroid/widget/ProgressBar;", "b", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "deleteIv", "Lcom/huami/devicerecorder/viewmodel/IRecorderSyncer;", GoogleApiAvailabilityLight.a, "Lcom/huami/devicerecorder/viewmodel/IRecorderSyncer;", "getSyncer", "()Lcom/huami/devicerecorder/viewmodel/IRecorderSyncer;", "setSyncer", "(Lcom/huami/devicerecorder/viewmodel/IRecorderSyncer;)V", "syncer", "e", "Lcom/huami/devicerecorder/model/SyncItemData;", "item", "Lcom/huami/devicerecorder/adapter/SyncingViewHolder$b;", "f", "Lcom/huami/devicerecorder/adapter/SyncingViewHolder$b;", "callback", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V", "Companion", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final class SyncingViewHolder extends RecyclerView.ViewHolder {

    @NotNull
    private static final String g = "SyncingViewHolder";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextView timeTv;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ProgressBar progressBar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ImageView deleteIv;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private IRecorderSyncer syncer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private SyncItemData item;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final b callback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete failed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"com/huami/devicerecorder/adapter/SyncingViewHolder$b", "Lcom/huami/devicerecorder/viewmodel/IRecorderSyncer$ISyncerCallback;", "", "progress", "", "onProgressChanged", "Lcom/huami/devicerecorder/model/RecordFile;", "recordFile", "", "needNotifyAbout", "<init>", "(Lcom/huami/devicerecorder/adapter/SyncingViewHolder;)V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
    public final class b implements IRecorderSyncer.ISyncerCallback {
        public b() {
        }

        @Override // com.huami.devicerecorder.viewmodel.IRecorderSyncer.ISyncerCallback
        public boolean needNotifyAbout(@NotNull RecordFile recordFile) {
            SyncItemData syncItemData = SyncingViewHolder.this.item;
            return Intrinsics.areEqual(syncItemData == null ? null : syncItemData.getRecordFile(), recordFile);
        }

        @Override // com.huami.devicerecorder.viewmodel.IRecorderSyncer.ISyncerCallback
        public void onProgressChanged(int progress) {
            SyncingViewHolder.this.progressBar.setProgress(progress);
        }
    }

    public SyncingViewHolder(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup) {
        super(layoutInflater.inflate(R.layout.item_recorder_sync, viewGroup, false));
        this.timeTv = (TextView) this.itemView.findViewById(R.id.tv_time);
        this.progressBar = (ProgressBar) this.itemView.findViewById(R.id.pb_recorder);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.iv_delete);
        this.deleteIv = imageView;
        this.callback = new b();
        imageView.setOnClickListener(new View.OnClickListener() { // from class: gk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SyncingViewHolder.b(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SyncingViewHolder syncingViewHolder, View view) {
        SyncItemData syncItemData = syncingViewHolder.item;
        if (syncItemData == null) {
            HMLog.info(g, a.a);
            return;
        }
        IRecorderSyncer syncer = syncingViewHolder.getSyncer();
        if (syncer == null) {
            return;
        }
        syncer.cancel(syncItemData);
    }

    @Nullable
    public final IRecorderSyncer getSyncer() {
        return this.syncer;
    }

    public final void onBind(@NotNull SyncItemData itemData) {
        this.item = itemData;
        this.timeTv.setText(RecordUtils.INSTANCE.formatDate(itemData.getRecordFile().getRecordTime()));
        this.progressBar.setProgress(itemData.getProgress());
    }

    public final void onViewAttachedFromWindow() {
        IRecorderSyncer iRecorderSyncer = this.syncer;
        if (iRecorderSyncer == null) {
            return;
        }
        iRecorderSyncer.registerCallback(this.callback);
    }

    public final void onViewDetachedFromWindow() {
        IRecorderSyncer iRecorderSyncer = this.syncer;
        if (iRecorderSyncer == null) {
            return;
        }
        iRecorderSyncer.unRegisterCallback(this.callback);
    }

    public final void setSyncer(@Nullable IRecorderSyncer iRecorderSyncer) {
        this.syncer = iRecorderSyncer;
    }
}
