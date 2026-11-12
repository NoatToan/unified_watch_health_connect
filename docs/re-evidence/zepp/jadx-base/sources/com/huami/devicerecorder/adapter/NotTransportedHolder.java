package com.huami.devicerecorder.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicerecorder.R;
import com.huami.devicerecorder.adapter.NotTransportedHolder;
import com.huami.devicerecorder.model.PageMode;
import com.huami.devicerecorder.model.PlayItemData;
import com.huami.devicerecorder.model.RecordUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\"\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0018\u0010%\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006."}, d2 = {"Lcom/huami/devicerecorder/adapter/NotTransportedHolder;", "Lcom/huami/devicerecorder/adapter/ViewHolder;", "", "selected", "", "setSelected", "Lcom/huami/devicerecorder/model/PlayItemData;", "item", "Lcom/huami/devicerecorder/model/PageMode;", "mode", "onBind", "b", "Lcom/huami/devicerecorder/model/PageMode;", "getMode", "()Lcom/huami/devicerecorder/model/PageMode;", "setMode", "(Lcom/huami/devicerecorder/model/PageMode;)V", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "timeTv", GoogleApiAvailabilityLight.a, "playTimeTv", "Landroid/view/View;", "e", "Landroid/view/View;", "checkLayout", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "checkImg", "g", "uncheckImg", "h", "separatorView", "i", "Lcom/huami/devicerecorder/model/PlayItemData;", "itemData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/huami/devicerecorder/adapter/IItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/huami/devicerecorder/adapter/IItemClickListener;)V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final class NotTransportedHolder extends ViewHolder {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private PageMode mode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TextView timeTv;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final TextView playTimeTv;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final View checkLayout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ImageView checkImg;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ImageView uncheckImg;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final View separatorView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private PlayItemData itemData;

    public NotTransportedHolder(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup, @Nullable final IItemClickListener iItemClickListener) {
        super(layoutInflater.inflate(R.layout.item_device_recorder_not_trans, viewGroup, false), iItemClickListener);
        this.mode = PageMode.Normal;
        this.timeTv = (TextView) findViewById(R.id.tv_time);
        this.playTimeTv = (TextView) findViewById(R.id.tv_position);
        this.checkLayout = findViewById(R.id.layout_check);
        this.checkImg = (ImageView) findViewById(R.id.check_img);
        this.uncheckImg = (ImageView) findViewById(R.id.uncheck_img);
        this.separatorView = findViewById(R.id.view_separator);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: qf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotTransportedHolder.b(this.a, iItemClickListener, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(NotTransportedHolder notTransportedHolder, IItemClickListener iItemClickListener, View view) {
        if (notTransportedHolder.getMode() != PageMode.Transport) {
            return;
        }
        if (notTransportedHolder.uncheckImg.isShown()) {
            PlayItemData playItemData = notTransportedHolder.itemData;
            if (playItemData != null) {
                playItemData.setSelected(true);
            }
            notTransportedHolder.setSelected(true);
            if (iItemClickListener == null) {
                return;
            }
            iItemClickListener.onSelected(notTransportedHolder.getAdapterPosition(), notTransportedHolder.itemData, true);
            return;
        }
        if (notTransportedHolder.checkImg.isShown()) {
            PlayItemData playItemData2 = notTransportedHolder.itemData;
            if (playItemData2 != null) {
                playItemData2.setSelected(false);
            }
            notTransportedHolder.setSelected(false);
            if (iItemClickListener == null) {
                return;
            }
            iItemClickListener.onSelected(notTransportedHolder.getAdapterPosition(), notTransportedHolder.itemData, false);
        }
    }

    private final void setSelected(boolean selected) {
        if (selected) {
            this.uncheckImg.setVisibility(8);
            this.checkImg.setVisibility(0);
        } else {
            this.uncheckImg.setVisibility(0);
            this.checkImg.setVisibility(8);
        }
    }

    @NotNull
    public final PageMode getMode() {
        return this.mode;
    }

    @Override // com.huami.devicerecorder.adapter.ViewHolder
    public void onBind(@NotNull PlayItemData item, @NotNull PageMode mode) {
        this.mode = mode;
        this.itemData = item;
        TextView textView = this.timeTv;
        RecordUtils recordUtils = RecordUtils.INSTANCE;
        textView.setText(recordUtils.formatDate(item.getRecordFile().getRecordTime()));
        this.playTimeTv.setText(recordUtils.formatDuration(item.getRecordFile().getDuration()));
        if (mode != PageMode.Transport) {
            this.checkLayout.setVisibility(8);
            this.separatorView.setVisibility(8);
        } else {
            this.checkLayout.setVisibility(0);
            this.separatorView.setVisibility(0);
            setSelected(item.getSelected());
        }
    }

    public final void setMode(@NotNull PageMode pageMode) {
        this.mode = pageMode;
    }
}
