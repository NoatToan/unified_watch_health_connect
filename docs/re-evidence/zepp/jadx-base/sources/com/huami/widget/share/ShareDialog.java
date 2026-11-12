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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.DialogParams;
import com.huami.tools.log.HMLog;
import com.huami.widget.share.ShareDialog;
import com.huami.widget.share.utils.ShareUtils;
import com.huami.widget.toast.IconToast;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class ShareDialog extends AlertDialogFragment {
    public static final String ARG_SHARE_CONFIG = "SHARE_CONFIG";
    public static final String ARG_SHARE_QZONE_TYPE = "share_qzone_type";
    public static final String ARG_TITLE = "share_title";
    public static final String ARG_TYPE = "share_type";
    private static final String r = "ShareDialog";
    private HMShareManager h;
    private ShareListener i;
    private OnShareItemClickedListener j;
    private Handler k;
    private final Handler l = new Handler(Looper.getMainLooper());
    private ShareConfig m;
    private Context n;
    private SharePermissionManager o;
    private ShareTarget p;
    private ShareResultListener q;

    public interface OnShareItemClickedListener {
        void onShareItemClicked(int i, boolean z);
    }

    public interface ShareResultListener {
        void onFailed(int i, String str);

        void onSuccess(int i);
    }

    public class a implements HMShareManager.ShareResultListener {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c(int i) {
            return "onCancel:" + i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d(int i, int i2, String str) {
            return String.format("onError: %s, error code: %s, message: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onCancel(final int i) {
            HMLog.warn(ShareDialog.r, new Function0() { // from class: com.huami.widget.share.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareDialog.a.c(i);
                }
            });
            if (ShareDialog.this.i != null) {
                ShareDialog.this.i.onFailed(i, com.twitter.sdk.android.tweetcomposer.g.g);
            }
            if (ShareDialog.this.q != null) {
                ShareDialog.this.q.onFailed(i, com.twitter.sdk.android.tweetcomposer.g.g);
            }
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onClicked(int i) {
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onComplete(int i) {
            if (ShareDialog.this.i != null) {
                ShareDialog.this.i.onSuccess(i);
            }
            if (ShareDialog.this.q != null) {
                ShareDialog.this.q.onSuccess(i);
            }
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onError(final int i, final int i2, final String str) {
            HMLog.error(ShareDialog.r, new Function0() { // from class: com.huami.widget.share.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareDialog.a.d(i, i2, str);
                }
            });
            if (ShareDialog.this.i != null) {
                ShareDialog.this.i.onFailed(i, str);
            }
            if (ShareDialog.this.q != null) {
                ShareDialog.this.q.onFailed(i, str);
            }
        }
    }

    public class b extends RecyclerView.Adapter<c> {
        private final Context a;
        private final List<ShareTarget> b;

        public b(Context context, List<ShareTarget> list) {
            this.a = context;
            this.b = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit c(ShareTarget shareTarget) {
            ShareDialog.this.p(shareTarget);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(int i, View view) {
            final ShareTarget shareTarget = this.b.get(i);
            if (shareTarget.type == 13) {
                ShareDialog.this.o.requestWritePermission(new Function0() { // from class: com.huami.widget.share.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.a.c(shareTarget);
                    }
                });
            } else {
                ShareDialog.this.p(shareTarget);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(c cVar, final int i) {
            cVar.bind(this.b.get(i));
            cVar.c.setOnClickListener(new View.OnClickListener() { // from class: com.huami.widget.share.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.d(i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new c(View.inflate(this.a, R.layout.share_dialog_content_grid_item, null));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return this.b.size();
        }
    }

    public static class c extends RecyclerView.ViewHolder {
        private final AppCompatImageView a;
        private final TextView b;
        private final View c;

        public c(View view) {
            super(view);
            this.c = view;
            this.a = (AppCompatImageView) view.findViewById(R.id.share_icon);
            this.b = (TextView) view.findViewById(R.id.share_text);
        }

        public void bind(ShareTarget shareTarget) {
            this.a.setImageResource(shareTarget.icon);
            if (!shareTarget.enable) {
                this.a.setImageAlpha(102);
            }
            this.b.setText(shareTarget.label);
        }
    }

    private ShareDialog() {
    }

    private View l(ShareConfig shareConfig) {
        View viewInflate = View.inflate(getContext(), R.layout.share_dialog_content_grid, null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        List<ShareTarget> listC = this.h.C(shareConfig.shareItemType, shareConfig.shareItems);
        ShareConfig shareConfig2 = this.m;
        int i = shareConfig2.qqZoneShareType;
        if (i == 0) {
            if (!shareConfig2.isOnlyImage) {
                listC = this.h.i0(listC);
            }
        } else if (i == 18) {
            listC = this.h.i0(listC);
        }
        recyclerView.setAdapter(new b(getContext(), listC));
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(final ShareTarget shareTarget) {
        final ShareContent shareContentOnShareContentCreated = this.i.onShareContentCreated(shareTarget.type);
        boolean zCheckNeedHideDialog = this.o.checkNeedHideDialog(shareTarget.type, shareContentOnShareContentCreated);
        if (shareContentOnShareContentCreated != null) {
            this.m.isOnlyImage = TextUtils.isEmpty(shareContentOnShareContentCreated.url);
            this.l.post(new Runnable() { // from class: hs6
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.m(shareTarget, shareContentOnShareContentCreated);
                }
            });
        } else {
            this.i.onFailed(shareTarget.type, "ShareContent is null, nothing to share");
            dismissAllowingStateLoss();
        }
        if (zCheckNeedHideDialog) {
            dismissAllowingStateLoss();
        }
    }

    public static ShareDialog newInstance(boolean z, int i, String str) {
        ShareDialog shareDialog = new ShareDialog();
        Bundle bundle = new Bundle();
        bundle.putBoolean("share_type", z);
        bundle.putString("share_title", str);
        bundle.putInt("share_qzone_type", i);
        shareDialog.setArguments(bundle);
        return shareDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o(ShareContent shareContent) {
        return " 分享的是链接, url = " + shareContent.url;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final ShareTarget shareTarget) {
        if (shareTarget.type == 8 && !ShareUtils.isNetworkConnected(requireContext())) {
            IconToast.showError(requireContext(), R.string.no_network_connection);
            return;
        }
        ShareListener shareListener = this.i;
        if (shareListener != null) {
            shareListener.onStart(shareTarget.type);
            int i = shareTarget.icon;
            if (i != R.drawable.ic_download_44 && i != R.drawable.share_mifit_circle) {
                if (shareTarget.enable) {
                    this.h.showToast(R.string.share_prepare_tips);
                } else {
                    IconToast.showError(requireContext(), ShareUtils.getUninstallStr(requireContext(), shareTarget));
                }
            }
            this.k.post(new Runnable() { // from class: gs6
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.n(shareTarget);
                }
            });
            return;
        }
        if (this.j != null) {
            int i2 = shareTarget.icon;
            if (i2 != R.drawable.ic_download_44 && i2 != R.drawable.share_mifit_circle) {
                if (shareTarget.enable) {
                    this.h.showToast(R.string.share_prepare_tips);
                } else {
                    IconToast.showError(requireContext(), ShareUtils.getUninstallStr(requireContext(), shareTarget));
                }
            }
            this.p = shareTarget;
            this.j.onShareItemClicked(shareTarget.type, shareTarget.enable);
            dismissAllowingStateLoss();
        }
    }

    private void q() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.m = (ShareConfig) arguments.getParcelable("SHARE_CONFIG");
        }
        HMShareManager hMShareManager = new HMShareManager(getActivity());
        this.h = hMShareManager;
        hMShareManager.n0(new a());
        ShareConfig shareConfig = this.m;
        if (shareConfig != null) {
            this.h.setFaceBookForbidden(shareConfig.isFaceBookForbidden);
        }
        DialogParams dialogParams = new DialogParams();
        ShareConfig shareConfig2 = this.m;
        if (shareConfig2 != null) {
            dialogParams.title = shareConfig2.title;
            dialogParams.contentView = l(shareConfig2);
        }
        dialogParams.neutralButtonText = getString(R.string.share_cancel);
        setParams(dialogParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void m(ShareTarget shareTarget, final ShareContent shareContent) {
        if (shareTarget.icon != R.drawable.ic_download_44) {
            this.h.p0(shareTarget, shareContent, this.m.isOnlyImage);
            return;
        }
        try {
            String str = shareContent.bitmapUrl;
            if (str == null || "".equals(str)) {
                HMLog.info(r, new Function0() { // from class: is6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShareDialog.o(shareContent);
                    }
                });
            } else {
                this.h.q0(shareContent.bitmapUrl, this.n);
                dismissAllowingStateLoss();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.h.onActivityResult(i, i2, intent);
    }

    @Override // com.huami.android.design.dialog.AlertDialogFragment, com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        q();
        HandlerThread handlerThread = new HandlerThread(r);
        handlerThread.start();
        this.k = new Handler(handlerThread.getLooper());
        this.n = requireContext().getApplicationContext();
        this.o = new SharePermissionManager(this);
    }

    @Override // androidx.fragment.app.Fragment, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.o.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void setOnShareItemClickedListener(OnShareItemClickedListener onShareItemClickedListener) {
        this.j = onShareItemClickedListener;
    }

    public void setShareAsImage(boolean z) {
        this.m.isOnlyImage = z;
    }

    public void setShareListener(ShareListener shareListener) {
        this.i = shareListener;
    }

    public void shareTo(ShareContent shareContent, ShareResultListener shareResultListener) {
        if (shareContent == null || this.i != null) {
            return;
        }
        this.q = shareResultListener;
        ShareTarget shareTarget = this.p;
        if (shareTarget != null) {
            m(shareTarget, shareContent);
        } else if (shareResultListener != null) {
            shareResultListener.onFailed(-1, "share target is null");
        }
    }

    public static ShareDialog newInstance(ShareConfig shareConfig) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SHARE_CONFIG", shareConfig);
        ShareDialog shareDialog = new ShareDialog();
        shareDialog.setArguments(bundle);
        return shareDialog;
    }
}
