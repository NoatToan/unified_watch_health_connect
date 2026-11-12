package com.huami.widget.share;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.widget.share.utils.ShareUtils;
import com.huami.widget.toast.IconToast;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class SharePanel extends Fragment {
    public static final String ARG_BG_COLOR = "share_bg_color";
    public static final String ARG_ITEM_HEIGHT = "share_item_height";
    public static final String ARG_TYPE = "share_type";
    public static final int DEFAULT_BG_COLOR = 0;
    private static final String k = "HMShareManager-SharePanel";
    private HMShareManager a;
    private List<ShareTarget> b;
    private ShareTarget c;
    private boolean d = false;
    private int e;
    private int f;
    private RecyclerView g;
    private PreShareListener h;
    private HMShareManager.ShareResultListener i;
    private View.OnClickListener j;

    public static class a extends RecyclerView.ViewHolder {
        private AppCompatImageView a;
        private View b;

        public a(View view) {
            super(view);
            this.b = view;
            this.a = (AppCompatImageView) view.findViewById(R.id.share_panel_icon);
        }

        public void b(FunctionItem functionItem) {
            this.a.setBackgroundResource(functionItem.icon);
        }

        public void bind(ShareTarget shareTarget) {
            this.a.setImageResource(shareTarget.icon);
            if (shareTarget.enable) {
                return;
            }
            this.a.setImageAlpha(102);
        }
    }

    public class b extends RecyclerView.Adapter<a> {
        private Context a;
        private List<ShareTarget> b;
        private final long c = 1000;
        private long d = 0;

        public b(Context context, List<ShareTarget> list) {
            this.a = context;
            this.b = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(ShareTarget shareTarget, a aVar, int i, View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(jCurrentTimeMillis - this.d) >= 1000) {
                this.d = jCurrentTimeMillis;
                SharePanel.this.onShareItemClickedListener(shareTarget, aVar, i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull final a aVar, final int i) {
            final ShareTarget shareTarget = this.b.get(i);
            aVar.bind(shareTarget);
            aVar.b.setOnClickListener(new View.OnClickListener() { // from class: com.huami.widget.share.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.b(shareTarget, aVar, i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new a(LayoutInflater.from(this.a).inflate(R.layout.share_panel_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return this.b.size();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.a.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.d = arguments.getBoolean("share_type", false);
            this.e = arguments.getInt(ARG_ITEM_HEIGHT, 0);
            this.f = arguments.getInt(ARG_BG_COLOR, 0);
        }
        HMShareManager hMShareManager = new HMShareManager(getActivity());
        this.a = hMShareManager;
        this.b = hMShareManager.B(1);
        this.a.n0(this.i);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.share_panel_layout, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.recycler);
        this.g = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.g.setAdapter(new b(getContext(), this.b));
        int i = this.f;
        if (i != 0) {
            viewInflate.setBackgroundColor(i);
        }
        return viewInflate;
    }

    public void onShareItemClickedListener(ShareTarget shareTarget, a aVar, int i) {
        if (shareTarget.type == 8 && !ShareUtils.isNetworkConnected(getContext())) {
            IconToast.showError(getContext(), R.string.no_network_connection);
            return;
        }
        View.OnClickListener onClickListener = this.j;
        if (onClickListener != null) {
            onClickListener.onClick(aVar.b);
        }
        this.c = shareTarget;
        this.a.shareFlavorAnalytics(shareTarget.type, 19);
        int i2 = shareTarget.icon;
        if (i2 != R.drawable.ic_download_44 && i2 != R.drawable.share_mifit_circle) {
            if (shareTarget.enable) {
                this.a.showToast(R.string.share_prepare_tips);
            } else {
                IconToast.showError(aVar.b.getContext(), ShareUtils.getUninstallStr(aVar.b.getContext(), this.c));
            }
        }
        PreShareListener preShareListener = this.h;
        if (preShareListener != null) {
            preShareListener.onPreShare(shareTarget.type);
        }
    }

    public void onSharePrepared(ShareContent shareContent) {
        ShareTarget shareTarget;
        if (shareContent == null || (shareTarget = this.c) == null) {
            return;
        }
        if (shareTarget.icon == R.drawable.ic_download_44) {
            this.a.q0(shareContent.bitmapUrl, getContext());
        } else {
            this.a.p0(shareTarget, shareContent, this.d);
        }
        this.c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        if (this.e <= 0 || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = this.e;
        view.setLayoutParams(layoutParams);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.j = onClickListener;
    }

    public void setShareListener(PreShareListener preShareListener) {
        this.h = preShareListener;
    }

    public void setShareResultListener(HMShareManager.ShareResultListener shareResultListener) {
        this.i = shareResultListener;
    }
}
