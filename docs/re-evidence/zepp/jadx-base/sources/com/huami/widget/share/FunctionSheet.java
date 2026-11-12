package com.huami.widget.share;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.tools.log.HMLog;
import com.huami.widget.share.FunctionSheet;
import com.huami.widget.share.utils.ShareUtils;
import com.huami.widget.toast.IconToast;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionSheet extends BaseDialogFragment {
    private static final String p = "FunctionSheet";
    private static final String q = "HAS_SHARE";
    private static final String r = "SHARE_ITEM";
    private RecyclerView e;
    private HMShareManager f;
    private List<ShareTarget> g;
    private List<FunctionItem> h;
    private FunctionActionListener i;
    private Handler j;
    private ShareConfig l;
    private Context m;
    private SharePermissionManager n;
    private ShareTarget o;
    private boolean k = false;
    public boolean isAsync = true;

    public class a implements HMShareManager.ShareResultListener {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d(int i) {
            return "onCancel:" + i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String e(int i) {
            return "onClicked:" + i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String f(int i) {
            return "onError:" + i;
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onCancel(final int i) {
            HMLog.warn(FunctionSheet.p, new Function0() { // from class: com.huami.widget.share.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FunctionSheet.a.d(i);
                }
            });
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onClicked(final int i) {
            HMLog.info(FunctionSheet.p, new Function0() { // from class: com.huami.widget.share.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FunctionSheet.a.e(i);
                }
            });
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onComplete(int i) {
            if (FunctionSheet.this.i != null) {
                FunctionSheet.this.i.onSuccess(i);
            }
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onError(final int i, int i2, String str) {
            HMLog.error(FunctionSheet.p, new Function0() { // from class: com.huami.widget.share.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FunctionSheet.a.f(i);
                }
            });
            if (FunctionSheet.this.i != null) {
                FunctionSheet.this.i.onFailed(i, str);
            }
        }
    }

    public class b extends RecyclerView.Adapter<c> {
        private final Context a;
        private final List<FunctionItem> b;

        public b(Context context, List<FunctionItem> list) {
            this.a = context;
            this.b = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(FunctionItem functionItem, View view) {
            FunctionSheet.this.r(functionItem);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull c cVar, int i) {
            final FunctionItem functionItem = this.b.get(i);
            cVar.b(functionItem);
            cVar.c.setOnClickListener(new View.OnClickListener() { // from class: com.huami.widget.share.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.b(functionItem, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new c(LayoutInflater.from(this.a).inflate(R.layout.function_sheet_grid_item, viewGroup, false));
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

        public void b(FunctionItem functionItem) {
            this.a.setBackgroundResource(functionItem.icon);
            this.b.setText(functionItem.title);
        }

        public void bind(ShareTarget shareTarget) {
            this.a.setImageResource(shareTarget.icon);
            if (!shareTarget.enable) {
                this.a.setImageAlpha(102);
            }
            this.b.setText(shareTarget.label);
        }
    }

    public class d extends RecyclerView.Adapter<c> {
        private final Context a;
        private final List<ShareTarget> b;

        public d(Context context, List<ShareTarget> list) {
            this.a = context;
            this.b = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(ShareTarget shareTarget, View view) {
            FunctionSheet.this.s(shareTarget);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull c cVar, int i) {
            final ShareTarget shareTarget = this.b.get(i);
            cVar.bind(shareTarget);
            cVar.c.setOnClickListener(new View.OnClickListener() { // from class: com.huami.widget.share.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.b(shareTarget, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new c(LayoutInflater.from(this.a).inflate(R.layout.function_sheet_grid_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return this.b.size();
        }
    }

    private List<FunctionItem> k() {
        ArrayList arrayList = new ArrayList();
        FunctionItem functionItem = new FunctionItem(getString(R.string.function_refresh), R.drawable.ic_refresh_44);
        functionItem.setType(FunctionType.refresh);
        arrayList.add(functionItem);
        return arrayList;
    }

    private void l() {
        HMShareManager hMShareManager = new HMShareManager(getActivity());
        this.f = hMShareManager;
        List<ShareTarget> listB = hMShareManager.B(2);
        this.g = listB;
        ShareConfig shareConfig = this.l;
        int i = shareConfig.qqZoneShareType;
        if (i == 0) {
            if (!shareConfig.isOnlyImage) {
                this.g = this.f.i0(listB);
            }
        } else if (i == 18) {
            this.g = this.f.i0(listB);
        }
        this.f.n0(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(View view) {
        dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(ShareTarget shareTarget, ShareContent shareContent) {
        boolean zCheckNeedHideDialog = this.n.checkNeedHideDialog(shareTarget.type, shareContent);
        t(shareTarget, shareContent);
        if (zCheckNeedHideDialog) {
            dismissAllowingStateLoss();
        }
    }

    public static FunctionSheet newInstance(boolean z) {
        Bundle bundle = new Bundle();
        ShareConfig shareConfig = new ShareConfig();
        shareConfig.hasShare = z;
        bundle.putParcelable(r, shareConfig);
        FunctionSheet functionSheet = new FunctionSheet();
        functionSheet.setArguments(bundle);
        return functionSheet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(final ShareTarget shareTarget) {
        final ShareContent shareContentOnShareContentCreated = this.i.onShareContentCreated(shareTarget.type);
        if (shareContentOnShareContentCreated == null) {
            this.i.onFailed(shareTarget.type, "ShareContent is null, nothing to share");
            dismissAllowingStateLoss();
        } else {
            this.l.isOnlyImage = TextUtils.isEmpty(shareContentOnShareContentCreated.url);
            this.e.post(new Runnable() { // from class: ic2
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.n(shareTarget, shareContentOnShareContentCreated);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit p(ShareContent shareContent) {
        this.f.q0(shareContent.bitmapUrl, this.m);
        dismissAllowingStateLoss();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q(ShareContent shareContent) {
        return " 分享的是链接, url = " + shareContent.url;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(FunctionItem functionItem) {
        dismissAllowingStateLoss();
        FunctionActionListener functionActionListener = this.i;
        if (functionActionListener != null) {
            functionActionListener.onFunctionItemClicked(functionItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(final ShareTarget shareTarget) {
        if (shareTarget.type == 8 && !ShareUtils.isNetworkConnected(requireContext())) {
            IconToast.showError(requireContext(), R.string.no_network_connection);
            return;
        }
        this.o = shareTarget;
        FunctionActionListener functionActionListener = this.i;
        if (functionActionListener != null) {
            functionActionListener.onStart(shareTarget.type);
            int i = shareTarget.icon;
            if (i != R.drawable.ic_download_44 && i != R.drawable.share_mifit_circle) {
                if (shareTarget.enable) {
                    this.f.showToast(R.string.share_prepare_tips);
                } else {
                    IconToast.showError(requireContext(), ShareUtils.getUninstallStr(requireContext(), shareTarget));
                }
            }
            if (this.isAsync) {
                this.j.post(new Runnable() { // from class: hc2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.o(shareTarget);
                    }
                });
            } else if (shareTarget.type != 13 || this.n.hasPermission()) {
                dismissAllowingStateLoss();
            }
        }
    }

    private void t(ShareTarget shareTarget, final ShareContent shareContent) {
        if (shareTarget.icon != R.drawable.ic_download_44) {
            this.f.p0(shareTarget, shareContent, this.l.isOnlyImage);
            return;
        }
        try {
            String str = shareContent.bitmapUrl;
            if (str == null || "".equals(str)) {
                HMLog.info(p, new Function0() { // from class: kc2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FunctionSheet.q(shareContent);
                    }
                });
            } else {
                this.n.requestWritePermission(new Function0() { // from class: jc2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.a.p(shareContent);
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public View initView() {
        View viewInflate = View.inflate(getContext(), R.layout.function_sheet, null);
        this.e = (RecyclerView) viewInflate.findViewById(R.id.share);
        View viewFindViewById = viewInflate.findViewById(R.id.function_line);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.function);
        if (this.k) {
            this.e.setHasFixedSize(true);
            this.e.setAdapter(new d(getContext(), this.g));
        } else {
            this.e.setVisibility(8);
            viewFindViewById.setVisibility(8);
        }
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new b(getContext(), this.h));
        viewInflate.findViewById(R.id.cancel_button).setOnClickListener(new View.OnClickListener() { // from class: gc2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.m(view);
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f.onActivityResult(i, i2, intent);
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.m = requireContext().getApplicationContext();
        Bundle arguments = getArguments();
        if (arguments != null) {
            ShareConfig shareConfig = (ShareConfig) arguments.getParcelable(r);
            this.l = shareConfig;
            if (shareConfig != null) {
                this.k = shareConfig.hasShare;
            } else {
                this.k = arguments.getBoolean(q);
            }
        }
        if (this.k) {
            l();
        }
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.addAll(k());
        HandlerThread handlerThread = new HandlerThread(p);
        handlerThread.start();
        this.j = new Handler(handlerThread.getLooper());
        this.n = new SharePermissionManager(this);
    }

    @Override // androidx.fragment.app.Fragment, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.n.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void setFunctionListener(FunctionActionListener functionActionListener) {
        this.i = functionActionListener;
    }

    public void shareTo(ShareContent shareContent) {
        if (shareContent != null) {
            t(this.o, shareContent);
        }
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.add(this, str);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public static FunctionSheet newInstance(ShareConfig shareConfig) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(r, shareConfig);
        FunctionSheet functionSheet = new FunctionSheet();
        functionSheet.setArguments(bundle);
        return functionSheet;
    }
}
