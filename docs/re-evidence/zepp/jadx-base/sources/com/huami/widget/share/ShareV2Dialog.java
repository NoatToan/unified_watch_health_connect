package com.huami.widget.share;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.DialogParams;
import com.huami.tools.log.HMLog;
import com.huami.widget.share.ShareV2Dialog;
import com.huami.widget.share.utils.ShareUtils;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 R2\u00020\u0001:\u0005RSTUVB\u0007¢\u0006\u0004\bP\u0010QJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J/\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001b\u001a\u00020\u001aH\u0014J\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001aJ\u000e\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eJ\u0018\u0010\"\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001f\u001a\u00020!J\u000e\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#J\"\u0010)\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010'H\u0016R\u0016\u0010,\u001a\u00020\u00148\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u00100\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b*\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010:\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020=8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?R\u0018\u0010E\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006W"}, d2 = {"Lcom/huami/widget/share/ShareV2Dialog;", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "", "l", "Lcom/huami/widget/share/ShareConfig;", "config", "Landroid/view/View;", "g", "Lcom/huami/widget/share/ShareTarget;", "target", "i", "Lcom/huami/widget/share/ShareContent;", "content", "m", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "hasPadding", "isShareAsImage", "setShareAsImage", "Lcom/huami/widget/share/ShareV2Dialog$OnShareItemClickedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnShareItemClickedListener", "Lcom/huami/widget/share/ShareV2Dialog$ShareResultListener;", "shareTo", "Lcom/huami/widget/share/ShareListener;", "shareListener", "setShareListener", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "h", "Ljava/lang/String;", "TAG", "Lcom/huami/widget/share/SharePermissionManager;", "Lkotlin/Lazy;", "()Lcom/huami/widget/share/SharePermissionManager;", "permissionManager", "Landroidx/recyclerview/widget/RecyclerView;", z.j, "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Lcom/huami/widget/share/HMShareManager;", hl.k, "Lcom/huami/widget/share/HMShareManager;", "mShareManager", "Lcom/huami/widget/share/ShareListener;", "mShareListener", "Lcom/huami/widget/share/ShareV2Dialog$OnShareItemClickedListener;", "mItemListener", "Landroid/os/Handler;", GoogleApiAvailabilityLight.b, "Landroid/os/Handler;", "mHandler", "o", "mMainHandler", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/huami/widget/share/ShareConfig;", "mShareConfig", "Landroid/content/Context;", DTransferConstants.SEARCH_KEY, "Landroid/content/Context;", "mAppContext", "r", "Lcom/huami/widget/share/ShareTarget;", "mTmpTarget", SOAP.XMLNS, "Lcom/huami/widget/share/ShareV2Dialog$ShareResultListener;", "mResultListener", "<init>", "()V", "Companion", "OnShareItemClickedListener", "a", "ShareHolder", "ShareResultListener", "share_release"}, k = 1, mv = {1, 5, 1})
public final class ShareV2Dialog extends AlertDialogFragment {

    @NotNull
    public static final String ARG_BLOCK_STATUES = "BLOCK_STATUS";

    @NotNull
    public static final String ARG_SHARE_CONFIG = "SHARE_CONFIG";

    @NotNull
    public static final String ARG_SHARE_QZONE_TYPE = "share_qzone_type";

    @NotNull
    public static final String ARG_TITLE = "share_title";

    @NotNull
    public static final String ARG_TYPE = "share_type";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private RecyclerView mRecyclerView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private HMShareManager mShareManager;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private ShareListener mShareListener;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private OnShareItemClickedListener mItemListener;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private Handler mHandler;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private ShareConfig mShareConfig;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private Context mAppContext;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    private ShareTarget mTmpTarget;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    private ShareResultListener mResultListener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final String TAG = "ShareV2Dialog";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy permissionManager = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/widget/share/ShareV2Dialog$OnShareItemClickedListener;", "", "", "shareType", "", "isEnable", "", "onShareItemClicked", "share_release"}, k = 1, mv = {1, 5, 1})
    public interface OnShareItemClickedListener {
        void onShareItemClicked(int shareType, boolean isEnable);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/huami/widget/share/ShareV2Dialog$ShareHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/widget/share/ShareTarget;", "data", "", "bind", "Landroidx/appcompat/widget/AppCompatImageView;", "a", "Landroidx/appcompat/widget/AppCompatImageView;", "icon", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "text", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "share_release"}, k = 1, mv = {1, 5, 1})
    public static final class ShareHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final AppCompatImageView icon;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final TextView text;

        public ShareHolder(@NotNull View view) {
            super(view);
            this.icon = (AppCompatImageView) view.findViewById(R.id.share_icon);
            this.text = (TextView) view.findViewById(R.id.share_label);
        }

        public final void bind(@NotNull ShareTarget data) {
            this.icon.setImageResource(data.icon);
            if (!data.enable) {
                this.icon.setImageAlpha(102);
            }
            this.text.setText(data.label);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/huami/widget/share/ShareV2Dialog$ShareResultListener;", "", "", "shareType", "", "onSuccess", "", "message", "onFailed", "share_release"}, k = 1, mv = {1, 5, 1})
    public interface ShareResultListener {
        void onFailed(int shareType, @NotNull String message);

        void onSuccess(int shareType);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0017"}, d2 = {"com/huami/widget/share/ShareV2Dialog$a", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/widget/share/ShareV2Dialog$ShareHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", GoogleApiAvailabilityLight.a, "holder", "position", "", "b", "getItemCount", "Landroid/content/Context;", "a", "Landroid/content/Context;", "mContext", "", "Lcom/huami/widget/share/ShareTarget;", "Ljava/util/List;", "mLists", "<init>", "(Lcom/huami/widget/share/ShareV2Dialog;Landroid/content/Context;Ljava/util/List;)V", "share_release"}, k = 1, mv = {1, 5, 1})
    public final class a extends RecyclerView.Adapter<ShareHolder> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Context mContext;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final List<ShareTarget> mLists;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Context context, List<? extends ShareTarget> list) {
            this.mContext = context;
            this.mLists = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(ShareV2Dialog shareV2Dialog, a aVar, int i, View view) {
            shareV2Dialog.i(aVar.mLists.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull ShareHolder holder, final int position) {
            holder.bind(this.mLists.get(position));
            View view = holder.itemView;
            final ShareV2Dialog shareV2Dialog = ShareV2Dialog.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.huami.widget.share.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ShareV2Dialog.a.c(shareV2Dialog, this, position, view2);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ShareHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            return new ShareHolder(View.inflate(this.mContext, R.layout.share_v2_dialog_content_grid_item, null));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return this.mLists.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/widget/share/SharePermissionManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SharePermissionManager> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharePermissionManager invoke() {
            return new SharePermissionManager(ShareV2Dialog.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ ShareContent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ShareContent shareContent) {
            super(0);
            this.b = shareContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMShareManager hMShareManager = ShareV2Dialog.this.mShareManager;
            Objects.requireNonNull(hMShareManager);
            hMShareManager.q0(this.b.bitmapUrl, ShareV2Dialog.this.mAppContext);
            ShareV2Dialog.this.dismissAllowingStateLoss();
        }
    }

    private final View g(ShareConfig config) {
        View viewInflate = View.inflate(getContext(), R.layout.share_v2_dialog_content_grid, null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.recycler);
        this.mRecyclerView = recyclerView;
        Objects.requireNonNull(recyclerView);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 5);
        RecyclerView recyclerView2 = this.mRecyclerView;
        Objects.requireNonNull(recyclerView2);
        recyclerView2.setLayoutManager(gridLayoutManager);
        HMShareManager hMShareManager = this.mShareManager;
        Objects.requireNonNull(hMShareManager);
        List<ShareTarget> listC = hMShareManager.C(config.shareItemType, config.shareItems);
        if (this.mShareConfig.qqZoneShareType == 0) {
            if (!this.mShareConfig.isOnlyImage) {
                HMShareManager hMShareManager2 = this.mShareManager;
                Objects.requireNonNull(hMShareManager2);
                listC = hMShareManager2.i0(listC);
            }
        } else if (this.mShareConfig.qqZoneShareType == 18) {
            HMShareManager hMShareManager3 = this.mShareManager;
            Objects.requireNonNull(hMShareManager3);
            listC = hMShareManager3.i0(listC);
        }
        if (config.shareItemType == 5) {
            HMShareManager hMShareManager4 = this.mShareManager;
            Objects.requireNonNull(hMShareManager4);
            hMShareManager4.h0(listC, Boolean.valueOf(this.mShareConfig.isBlocked));
        }
        RecyclerView recyclerView3 = this.mRecyclerView;
        Objects.requireNonNull(recyclerView3);
        recyclerView3.setAdapter(new a(requireContext(), listC));
        return viewInflate;
    }

    private final SharePermissionManager h() {
        return (SharePermissionManager) this.permissionManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(final ShareTarget target) {
        if (target.type == 8 && !ShareUtils.isNetworkConnected(requireContext())) {
            IconToast.showError(getContext(), R.string.no_network_connection);
            return;
        }
        ShareListener shareListener = this.mShareListener;
        if (shareListener != null) {
            shareListener.onStart(target.type);
            int i = target.type;
            if (i != 13 && i != 14) {
                if (!target.enable) {
                    IconToast.showError(requireContext(), ShareUtils.getUninstallStr(requireContext(), target));
                } else if (i != 16 && i != 17 && i != 18 && i != 19) {
                    HMShareManager hMShareManager = this.mShareManager;
                    Objects.requireNonNull(hMShareManager);
                    hMShareManager.showToast(R.string.share_prepare_tips);
                }
            }
            this.mHandler.post(new Runnable() { // from class: vs6
                @Override // java.lang.Runnable
                public final void run() {
                    ShareV2Dialog.j(this.a, target);
                }
            });
            return;
        }
        if (this.mItemListener != null) {
            int i2 = target.type;
            if (i2 != 13 && i2 != 14) {
                if (!target.enable) {
                    IconToast.showError(requireContext(), ShareUtils.getUninstallStr(requireContext(), target));
                } else if (i2 != 16 && i2 != 17 && i2 != 18 && i2 != 19) {
                    HMShareManager hMShareManager2 = this.mShareManager;
                    Objects.requireNonNull(hMShareManager2);
                    hMShareManager2.showToast(R.string.share_prepare_tips);
                }
            }
            this.mTmpTarget = target;
            this.mItemListener.onShareItemClicked(target.type, target.enable);
            dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final ShareV2Dialog shareV2Dialog, final ShareTarget shareTarget) {
        final ShareContent shareContentOnShareContentCreated = shareV2Dialog.mShareListener.onShareContentCreated(shareTarget.type);
        boolean zCheckNeedHideDialog = shareV2Dialog.h().checkNeedHideDialog(shareTarget.type, shareContentOnShareContentCreated);
        if (shareContentOnShareContentCreated != null) {
            shareV2Dialog.mShareConfig.isOnlyImage = TextUtils.isEmpty(shareContentOnShareContentCreated.url);
            shareV2Dialog.mMainHandler.post(new Runnable() { // from class: ws6
                @Override // java.lang.Runnable
                public final void run() {
                    ShareV2Dialog.k(this.a, shareTarget, shareContentOnShareContentCreated);
                }
            });
        } else {
            shareV2Dialog.mShareListener.onFailed(shareTarget.type, "ShareContent is null, nothing to share");
            shareV2Dialog.dismissAllowingStateLoss();
        }
        if (zCheckNeedHideDialog) {
            shareV2Dialog.dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(ShareV2Dialog shareV2Dialog, ShareTarget shareTarget, ShareContent shareContent) {
        shareV2Dialog.m(shareTarget, shareContent);
    }

    private final void l() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mShareConfig = (ShareConfig) arguments.getParcelable("SHARE_CONFIG");
        }
        HMShareManager hMShareManager = new HMShareManager(getActivity());
        this.mShareManager = hMShareManager;
        Objects.requireNonNull(hMShareManager);
        hMShareManager.n0(new HMShareManager.ShareResultListener() { // from class: com.huami.widget.share.ShareV2Dialog$setup$1
            @Override // com.huami.widget.share.HMShareManager.ShareResultListener
            public void onCancel(int shareType) {
                HMLog.w(this.a.TAG, "onCancel:" + shareType, new Object[0]);
                ShareListener shareListener = this.a.mShareListener;
                if (shareListener != null) {
                    shareListener.onFailed(shareType, com.twitter.sdk.android.tweetcomposer.g.g);
                }
                ShareV2Dialog.ShareResultListener shareResultListener = this.a.mResultListener;
                if (shareResultListener == null) {
                    return;
                }
                shareResultListener.onFailed(shareType, com.twitter.sdk.android.tweetcomposer.g.g);
            }

            @Override // com.huami.widget.share.HMShareManager.ShareResultListener
            public void onClicked(int shareType) {
            }

            @Override // com.huami.widget.share.HMShareManager.ShareResultListener
            public void onComplete(int shareType) {
                ShareListener shareListener = this.a.mShareListener;
                if (shareListener != null) {
                    shareListener.onSuccess(shareType);
                }
                ShareV2Dialog.ShareResultListener shareResultListener = this.a.mResultListener;
                if (shareResultListener == null) {
                    return;
                }
                shareResultListener.onSuccess(shareType);
            }

            @Override // com.huami.widget.share.HMShareManager.ShareResultListener
            public void onError(int shareType, int errorCode, @NotNull String errorMsg) {
                HMLog.e(this.a.TAG, "onError:" + shareType + ", error code:" + errorCode + ", message:" + errorMsg, new Object[0]);
                ShareListener shareListener = this.a.mShareListener;
                if (shareListener != null) {
                    shareListener.onFailed(shareType, errorMsg);
                }
                ShareV2Dialog.ShareResultListener shareResultListener = this.a.mResultListener;
                if (shareResultListener == null) {
                    return;
                }
                shareResultListener.onFailed(shareType, errorMsg);
            }
        });
        DialogParams dialogParams = new DialogParams();
        dialogParams.title = this.mShareConfig.title;
        dialogParams.contentView = g(this.mShareConfig);
        dialogParams.neutralButtonText = getString(R.string.share_cancel);
        setParams(dialogParams);
    }

    private final void m(ShareTarget target, ShareContent content) {
        if (target.type != 13) {
            HMShareManager hMShareManager = this.mShareManager;
            Objects.requireNonNull(hMShareManager);
            hMShareManager.p0(target, content, this.mShareConfig.isOnlyImage);
            return;
        }
        try {
            if (TextUtils.isEmpty(content.bitmapUrl)) {
                HMLog.i(this.TAG, " 分享的是链接, url = " + content.url, new Object[0]);
            } else {
                h().requestWritePermission(new c(content));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.android.design.dialog.AlertDialogFragment, com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        HMShareManager hMShareManager = this.mShareManager;
        Objects.requireNonNull(hMShareManager);
        hMShareManager.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.huami.android.design.dialog.AlertDialogFragment, com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        l();
        HandlerThread handlerThread = new HandlerThread("ShareV2Dialog");
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper());
        this.mAppContext = requireContext().getApplicationContext();
    }

    @Override // androidx.fragment.app.Fragment, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        h().onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    public final void setOnShareItemClickedListener(@NotNull OnShareItemClickedListener listener) {
        this.mItemListener = listener;
    }

    public final void setShareAsImage(boolean isShareAsImage) {
        this.mShareConfig.isOnlyImage = isShareAsImage;
    }

    public final void setShareListener(@NotNull ShareListener shareListener) {
        this.mShareListener = shareListener;
    }

    public final void shareTo(@Nullable ShareContent content, @NotNull ShareResultListener listener) {
        Unit unit;
        ShareResultListener shareResultListener;
        if (content == null || this.mShareListener != null) {
            return;
        }
        this.mResultListener = listener;
        ShareTarget shareTarget = this.mTmpTarget;
        if (shareTarget == null) {
            unit = null;
        } else {
            m(shareTarget, content);
            unit = Unit.INSTANCE;
        }
        if (unit != null || (shareResultListener = this.mResultListener) == null) {
            return;
        }
        shareResultListener.onFailed(-1, "share target is null");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/huami/widget/share/ShareV2Dialog$Companion;", "", "", "isOnlyImage", "", "qzoneType", "", "title", "Lcom/huami/widget/share/ShareV2Dialog;", "newInstance", "Lcom/huami/widget/share/ShareConfig;", "config", "ARG_BLOCK_STATUES", "Ljava/lang/String;", "ARG_SHARE_CONFIG", "ARG_SHARE_QZONE_TYPE", "ARG_TITLE", "ARG_TYPE", "<init>", "()V", "share_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ShareV2Dialog newInstance(boolean isOnlyImage, int qzoneType, @NotNull String title) {
            ShareV2Dialog shareV2Dialog = new ShareV2Dialog();
            Bundle bundle = new Bundle();
            bundle.putBoolean("share_type", isOnlyImage);
            bundle.putString("share_title", title);
            bundle.putInt("share_qzone_type", qzoneType);
            shareV2Dialog.setArguments(bundle);
            return shareV2Dialog;
        }

        @NotNull
        public final ShareV2Dialog newInstance(@NotNull ShareConfig config) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("SHARE_CONFIG", config);
            ShareV2Dialog shareV2Dialog = new ShareV2Dialog();
            shareV2Dialog.setArguments(bundle);
            return shareV2Dialog;
        }
    }
}
