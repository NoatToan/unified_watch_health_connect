package com.huami.snore.ui.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.sleep.sleephome.vo.ShowActionItemInfo;
import com.huami.snore.core.R;
import com.huami.snore.core.vo.VoiceShowInfo;
import com.huami.snore.ui.adapter.VoiceAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00011B\u0007¢\u0006\u0004\b/\u00100J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0018\u0010.\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00062"}, d2 = {"Lcom/huami/snore/ui/adapter/VoiceAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/huami/snore/core/vo/VoiceShowInfo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "position", GoogleApiAvailabilityLight.a, "", ShowActionItemInfo.EDIT, "", "setEditable", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "", "getItemId", "holder", "onBindViewHolder", "Lcom/huami/snore/ui/adapter/WrapVoiceInfo;", "item", "setClickPlayItem", "getItemCount", "getItemViewType", "Lcom/huami/snore/ui/adapter/VoiceClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "observer", "registerAdapterDataObserver", "", "a", "Ljava/lang/String;", "mTAG", "b", "Lcom/huami/snore/ui/adapter/VoiceClickListener;", "mListener", "c", "Z", "editable", LogUtil.I, "mFooterCount", "e", "mHeaderCount", "f", "Lcom/huami/snore/ui/adapter/WrapVoiceInfo;", "mClickItem", "<init>", "()V", "Companion", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class VoiceAdapter extends PagedListAdapter<VoiceShowInfo, RecyclerView.ViewHolder> {
    private static final int g = 0;
    private static final int h = 1;
    private static final int i = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String mTAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private VoiceClickListener mListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean editable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mFooterCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mHeaderCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private WrapVoiceInfo mClickItem;

    public VoiceAdapter() {
        super(new VoiceItemDiffCallback());
        this.mTAG = "PagedListAdapter";
        this.mFooterCount = 1;
        this.mHeaderCount = 1;
    }

    private final VoiceShowInfo d(int position) {
        return getItem(position - this.mHeaderCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(VoiceAdapter voiceAdapter, VoiceShowInfo voiceShowInfo, int i2, View view) {
        VoiceClickListener voiceClickListener = voiceAdapter.mListener;
        if (voiceClickListener == null) {
            return;
        }
        voiceClickListener.onPlay(new WrapVoiceInfo(voiceShowInfo, i2 - voiceAdapter.mHeaderCount));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(VoiceAdapter voiceAdapter, VoiceShowInfo voiceShowInfo, View view) {
        VoiceClickListener voiceClickListener = voiceAdapter.mListener;
        if (voiceClickListener == null) {
            return;
        }
        voiceClickListener.onDelete(voiceShowInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(VoiceAdapter voiceAdapter, VoiceShowInfo voiceShowInfo, View view) {
        VoiceClickListener voiceClickListener = voiceAdapter.mListener;
        if (voiceClickListener == null) {
            return;
        }
        voiceClickListener.onUpload(voiceShowInfo);
    }

    @Override // androidx.paging.PagedListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return super.getFragmentsCount() + this.mFooterCount + this.mHeaderCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (this.mFooterCount == 0 || position < getFragmentsCount() - this.mFooterCount) {
            return (this.mHeaderCount == 0 || position != 0) ? 0 : 2;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, final int position) {
        final VoiceShowInfo voiceShowInfoD;
        if ((holder instanceof VoiceViewHolder) && (voiceShowInfoD = d(position)) != null) {
            VoiceViewHolder voiceViewHolder = (VoiceViewHolder) holder;
            voiceViewHolder.bindTo(voiceShowInfoD, position - this.mHeaderCount, this.editable);
            ((ImageView) voiceViewHolder.itemView.findViewById(R.id.start)).setOnClickListener(new View.OnClickListener() { // from class: bc8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VoiceAdapter.e(this.a, voiceShowInfoD, position, view);
                }
            });
            ((ImageView) voiceViewHolder.itemView.findViewById(R.id.delete)).setOnClickListener(new View.OnClickListener() { // from class: ac8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VoiceAdapter.f(this.a, voiceShowInfoD, view);
                }
            });
            ((ImageView) voiceViewHolder.itemView.findViewById(R.id.upload)).setOnClickListener(new View.OnClickListener() { // from class: zb8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VoiceAdapter.g(this.a, voiceShowInfoD, view);
                }
            });
        }
        if (holder instanceof FooterViewHolder) {
            ((FooterViewHolder) holder).bindTo(getFragmentsCount() > this.mHeaderCount + this.mFooterCount);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        if (viewType == 0) {
            return new VoiceViewHolder(parent);
        }
        if (viewType != 1) {
            return viewType != 2 ? new VoiceViewHolder(parent) : new HeaderViewHolder(parent);
        }
        return new FooterViewHolder(parent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(@NotNull RecyclerView.AdapterDataObserver observer) {
        super.registerAdapterDataObserver(new AdapterDataObserverProxy(observer, this.mHeaderCount));
    }

    public final void setClickPlayItem(@Nullable WrapVoiceInfo item) {
        WrapVoiceInfo wrapVoiceInfo = item == null ? null : new WrapVoiceInfo(getItem(item.getPosition()), item.getPosition());
        if (wrapVoiceInfo != null) {
            VoiceShowInfo voiceInfo = wrapVoiceInfo.getVoiceInfo();
            if (voiceInfo != null) {
                voiceInfo.setPlaying(!voiceInfo.isPlaying());
            }
            notifyItemChanged(wrapVoiceInfo.getPosition());
        }
        WrapVoiceInfo wrapVoiceInfo2 = this.mClickItem;
        if (Intrinsics.areEqual(wrapVoiceInfo2 == null ? null : Integer.valueOf(wrapVoiceInfo2.getPosition()), wrapVoiceInfo == null ? null : Integer.valueOf(wrapVoiceInfo.getPosition()))) {
            this.mClickItem = null;
            return;
        }
        WrapVoiceInfo wrapVoiceInfo3 = this.mClickItem;
        if (wrapVoiceInfo3 != null) {
            VoiceShowInfo voiceInfo2 = wrapVoiceInfo3.getVoiceInfo();
            if (voiceInfo2 != null) {
                voiceInfo2.setPlaying(false);
            }
            notifyItemChanged(wrapVoiceInfo3.getPosition());
        }
        this.mClickItem = wrapVoiceInfo;
    }

    public final void setEditable(boolean edit) {
        this.editable = edit;
        notifyDataSetChanged();
    }

    public final void setOnItemClickListener(@NotNull VoiceClickListener listener) {
        this.mListener = listener;
    }
}
