package com.huami.widget.share;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.widget.share.ShareCardFragment;
import com.huami.widget.share.utils.ShareUtils;
import com.huami.widget.toast.IconToast;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 D2\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\bB\u0010CJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bJ\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0016\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0011J\u0010\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019J\"\u0010!\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006E"}, d2 = {"Lcom/huami/widget/share/ShareCardFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/huami/widget/share/PreShareListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setShareListener", "Lcom/huami/widget/share/HMShareManager$ShareResultListener;", "setShareResultListener", "Landroid/view/View$OnClickListener;", "setOnClickListener", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/widget/share/ShareTarget;", "target", "itemView", "onShareItemClickedListener", "Lcom/huami/widget/share/ShareContent;", "item", "onSharePrepared", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lcom/huami/widget/share/HMShareManager;", "a", "Lcom/huami/widget/share/HMShareManager;", "mShareManager", "", "b", "Ljava/util/List;", "mItems", "c", "Lcom/huami/widget/share/ShareTarget;", "mShareTarget", "Landroidx/recyclerview/widget/RecyclerView;", GoogleApiAvailabilityLight.a, "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Landroid/widget/LinearLayout;", "e", "Landroid/widget/LinearLayout;", "itemLayout", "f", "Lcom/huami/widget/share/PreShareListener;", "mShareListener", "g", "Lcom/huami/widget/share/HMShareManager$ShareResultListener;", "mShareResultListener", "h", "Landroid/view/View$OnClickListener;", "mListener", "", "i", "J", "mLastTime", "<init>", "()V", "Companion", "share_release"}, k = 1, mv = {1, 5, 1})
public final class ShareCardFragment extends Fragment {
    private static final long j = 1000;
    private static final int k = 102;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private HMShareManager mShareManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private List<? extends ShareTarget> mItems;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ShareTarget mShareTarget;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private RecyclerView mRecyclerView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private LinearLayout itemLayout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private PreShareListener mShareListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private HMShareManager.ShareResultListener mShareResultListener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener mListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private long mLastTime;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ShareCardFragment shareCardFragment, ShareTarget shareTarget, View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - shareCardFragment.mLastTime) >= 1000) {
            shareCardFragment.mLastTime = jCurrentTimeMillis;
            shareCardFragment.onShareItemClickedListener(shareTarget, view);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        HMShareManager hMShareManager = this.mShareManager;
        Objects.requireNonNull(hMShareManager);
        hMShareManager.onActivityResult(requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HMShareManager hMShareManager = new HMShareManager(getActivity());
        this.mShareManager = hMShareManager;
        Objects.requireNonNull(hMShareManager);
        this.mItems = hMShareManager.B(4);
        HMShareManager hMShareManager2 = this.mShareManager;
        Objects.requireNonNull(hMShareManager2);
        hMShareManager2.n0(this.mShareResultListener);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.share_card_view, container, false);
        this.mRecyclerView = (RecyclerView) viewInflate.findViewById(R.id.recycler);
        this.itemLayout = (LinearLayout) viewInflate.findViewById(R.id.share_item_layout);
        return viewInflate;
    }

    public final void onShareItemClickedListener(@NotNull ShareTarget target, @NotNull View itemView) {
        if (target.type == 8 && !ShareUtils.isNetworkConnected(requireContext())) {
            IconToast.showError(getContext(), R.string.no_network_connection);
            return;
        }
        View.OnClickListener onClickListener = this.mListener;
        if (onClickListener != null) {
            onClickListener.onClick(itemView);
        }
        this.mShareTarget = target;
        HMShareManager hMShareManager = this.mShareManager;
        Objects.requireNonNull(hMShareManager);
        hMShareManager.shareFlavorAnalytics(target.type, 19);
        int i = target.icon;
        if (i != R.drawable.ic_download_44 && i != R.drawable.share_mifit_circle) {
            if (target.enable) {
                HMShareManager hMShareManager2 = this.mShareManager;
                Objects.requireNonNull(hMShareManager2);
                hMShareManager2.showToast(R.string.share_prepare_tips);
            } else {
                IconToast.showError(itemView.getContext(), ShareUtils.getUninstallStr(itemView.getContext(), target));
            }
        }
        PreShareListener preShareListener = this.mShareListener;
        if (preShareListener == null) {
            return;
        }
        preShareListener.onPreShare(target.type);
    }

    public final void onSharePrepared(@Nullable ShareContent item) {
        ShareTarget shareTarget;
        if (item == null || (shareTarget = this.mShareTarget) == null) {
            return;
        }
        boolean z = false;
        if (shareTarget != null && shareTarget.icon == R.drawable.ic_download_44) {
            z = true;
        }
        if (z) {
            HMShareManager hMShareManager = this.mShareManager;
            Objects.requireNonNull(hMShareManager);
            hMShareManager.q0(item.bitmapUrl, getContext());
        } else {
            HMShareManager hMShareManager2 = this.mShareManager;
            Objects.requireNonNull(hMShareManager2);
            hMShareManager2.p0(shareTarget, item, true);
        }
        this.mShareTarget = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        List<? extends ShareTarget> list = this.mItems;
        Objects.requireNonNull(list);
        for (final ShareTarget shareTarget : list) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.weight = 1.0f;
            View viewInflate = View.inflate(getContext(), R.layout.share_card_item, null);
            AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate.findViewById(R.id.share_icon);
            TextView textView = (TextView) viewInflate.findViewById(R.id.share_label);
            appCompatImageView.setImageResource(shareTarget.icon);
            textView.setText(shareTarget.label);
            if (!shareTarget.enable) {
                appCompatImageView.setImageAlpha(102);
            }
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: es6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ShareCardFragment.b(this.a, shareTarget, view2);
                }
            });
            viewInflate.setLayoutParams(layoutParams);
            LinearLayout linearLayout = this.itemLayout;
            if (linearLayout != null) {
                linearLayout.addView(viewInflate);
            }
        }
    }

    public final void setOnClickListener(@NotNull View.OnClickListener listener) {
        this.mListener = listener;
    }

    public final void setShareListener(@NotNull PreShareListener listener) {
        this.mShareListener = listener;
    }

    public final void setShareResultListener(@NotNull HMShareManager.ShareResultListener listener) {
        this.mShareResultListener = listener;
    }
}
