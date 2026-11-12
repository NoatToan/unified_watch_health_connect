package com.huami.widget.share;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.ImageViewState;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.DialogParams;
import com.huami.tools.log.HMLog;
import com.huami.widget.share.utils.ShareUtils;
import com.huami.widget.toast.IconToast;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.UIUtil;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.SimplePagerTitleView;

/* JADX INFO: loaded from: classes17.dex */
public class ShareLongDialog extends AlertDialogFragment {
    public static final String ARG_SHARE_CONFIG = "SHARE_CONFIG";
    public static final String ARG_SHARE_CONTENT = "SHARE_CONTENT";
    public static final String ARG_SHARE_QZONE_TYPE = "share_qzone_type";
    public static final String ARG_SHARE_SELECT_COLOR = "SHARE_SELECT_COLOR";
    public static final String ARG_TITLE = "share_title";
    public static final String ARG_TYPE = "share_type";
    private static final String v = "ShareDialog";
    private Context h;
    private ShareConfig i;
    private ShareContent j;
    private boolean k;
    private int l = -1;
    private int m = -1;
    private ViewPager n;
    private MagicIndicator o;
    private RelativeLayout p;
    private HMShareManager q;
    private ShareListener r;
    private SubsamplingScaleImageView s;
    private ShareAnalyticsListener t;
    private int u;

    public interface ShareResultListener {
        void onFailed(int i, String str);

        void onSuccess(int i);
    }

    public class a implements HMShareManager.ShareResultListener {
        public a() {
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onCancel(int i) {
            HMLog.w(ShareLongDialog.v, "onCancel:" + i, new Object[0]);
            if (ShareLongDialog.this.r != null) {
                ShareLongDialog.this.r.onFailed(i, com.twitter.sdk.android.tweetcomposer.g.g);
            }
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onClicked(int i) {
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onComplete(int i) {
            if (ShareLongDialog.this.r != null) {
                ShareLongDialog.this.r.onSuccess(i);
            }
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onError(int i, int i2, String str) {
            HMLog.e(ShareLongDialog.v, "onError:" + i + ", error code:" + i2 + ", message:" + str, new Object[0]);
            if (ShareLongDialog.this.r != null) {
                ShareLongDialog.this.r.onFailed(i, str);
            }
        }
    }

    public class b implements ViewPager.OnPageChangeListener {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (i == 0) {
                if (ShareLongDialog.this.t != null) {
                    ShareLongDialog.this.t.onShareShortPic();
                }
                ShareLongDialog.this.k = false;
                ShareLongDialog.this.p.setVisibility(8);
                return;
            }
            if (i == 1 && ShareLongDialog.this.l - ShareLongDialog.this.m == 0) {
                if (ShareLongDialog.this.t != null) {
                    ShareLongDialog.this.t.onShareLongPic();
                }
                ShareLongDialog.this.k = true;
                ShareLongDialog.this.p.setVisibility(0);
            }
        }
    }

    public class c implements SubsamplingScaleImageView.OnImageEventListener {
        public final /* synthetic */ SubsamplingScaleImageView a;

        public c(SubsamplingScaleImageView subsamplingScaleImageView) {
            this.a = subsamplingScaleImageView;
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onImageLoadError(Exception exc) {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onImageLoaded() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onPreviewLoadError(Exception exc) {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onPreviewReleased() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onReady() {
            ShareLongDialog.this.s.setImage(ImageSource.uri(ShareLongDialog.this.j.longBitmapUrl), new ImageViewState(this.a.getScale(), new PointF(0.0f, 0.0f), 0));
            ShareLongDialog.this.s.setZoomEnabled(false);
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onTileLoadError(Exception exc) {
        }
    }

    public class d implements SubsamplingScaleImageView.OnStateChangedListener {
        public d() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnStateChangedListener
        public void onCenterChanged(PointF pointF, int i) {
            ShareLongDialog.this.l = (int) pointF.y;
            if (ShareLongDialog.this.l - ShareLongDialog.this.m > 0) {
                ShareLongDialog.this.p.setVisibility(8);
            } else {
                ShareLongDialog.this.p.setVisibility(0);
            }
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnStateChangedListener
        public void onScaleChanged(float f, int i) {
        }
    }

    public class e implements SubsamplingScaleImageView.OnImageEventListener {
        public e() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onImageLoadError(Exception exc) {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onImageLoaded() {
            if (ShareLongDialog.this.s == null || ShareLongDialog.this.m != -1) {
                return;
            }
            ShareLongDialog shareLongDialog = ShareLongDialog.this;
            ImageViewState state = shareLongDialog.s.getState();
            Objects.requireNonNull(state);
            shareLongDialog.m = (int) state.getCenter().y;
            ShareLongDialog shareLongDialog2 = ShareLongDialog.this;
            shareLongDialog2.l = shareLongDialog2.m;
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onPreviewLoadError(Exception exc) {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onPreviewReleased() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onReady() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onTileLoadError(Exception exc) {
        }
    }

    public class f extends CommonNavigatorAdapter {
        public final /* synthetic */ List b;

        public f(List list) {
            this.b = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i, View view) {
            ShareLongDialog.this.n.setCurrentItem(i);
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
        public int getCount() {
            return this.b.size();
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
        public IPagerIndicator getIndicator(Context context) {
            LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
            linePagerIndicator.setLineWidth(UIUtil.dip2px(context, 28.0d));
            linePagerIndicator.setColors(Integer.valueOf(ContextCompat.getColor(ShareLongDialog.this.requireContext(), ShareLongDialog.this.u)));
            linePagerIndicator.setMode(2);
            return linePagerIndicator;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
        public IPagerTitleView getTitleView(Context context, final int i) {
            SimplePagerTitleView simplePagerTitleView = new SimplePagerTitleView(context);
            simplePagerTitleView.setNormalColor(ContextCompat.getColor(ShareLongDialog.this.requireContext(), R.color.s1));
            simplePagerTitleView.setSelectedColor(ContextCompat.getColor(ShareLongDialog.this.getContext(), ShareLongDialog.this.u));
            simplePagerTitleView.setText((CharSequence) this.b.get(i));
            simplePagerTitleView.setTextSize(16.0f);
            simplePagerTitleView.setOnClickListener(new View.OnClickListener() { // from class: com.huami.widget.share.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.b(i, view);
                }
            });
            return simplePagerTitleView;
        }
    }

    public class g extends RecyclerView.Adapter<h> {
        private List<ShareTarget> a;

        public g(List<ShareTarget> list) {
            this.a = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i, View view) {
            ShareLongDialog.this.B(this.a.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull h hVar, final int i) {
            hVar.bind(this.a.get(i));
            hVar.b.setOnClickListener(new View.OnClickListener() { // from class: com.huami.widget.share.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.b(i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public h onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.share_dialog_content_grid_item_long, viewGroup, false);
            viewInflate.getLayoutParams().width = ShareLongDialog.this.v() / this.a.size();
            return new h(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return this.a.size();
        }
    }

    public static class h extends RecyclerView.ViewHolder {
        private AppCompatImageView a;
        private View b;

        public h(View view) {
            super(view);
            this.b = view;
            this.a = (AppCompatImageView) view.findViewById(R.id.share_icon);
        }

        public void bind(ShareTarget shareTarget) {
            this.a.setImageResource(shareTarget.icon);
            if (shareTarget.enable) {
                return;
            }
            this.a.setImageAlpha(102);
        }
    }

    public class i extends PagerAdapter {
        private List<View> a;

        public i(List<View> list) {
            this.a = list;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            viewGroup.removeView(this.a.get(i));
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            return this.a.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
            View view = this.a.get(i);
            viewGroup.addView(view);
            return view;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(View view) {
        this.p.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(ShareTarget shareTarget) {
        if (shareTarget.type == 8 && !ShareUtils.isNetworkConnected(requireContext())) {
            IconToast.showError(requireContext(), R.string.no_network_connection);
            return;
        }
        int i2 = shareTarget.icon;
        if (i2 != R.drawable.ic_download_44 && i2 != R.drawable.share_mifit_circle) {
            if (!shareTarget.enable) {
                IconToast.showError(requireContext(), ShareUtils.getUninstallStr(requireContext(), shareTarget));
                return;
            }
            this.q.showToast(R.string.share_prepare_tips);
        }
        this.q.shareFlavorAnalytics(shareTarget.type, 19);
        C(shareTarget, this.j);
    }

    private void C(ShareTarget shareTarget, ShareContent shareContent) {
        if (this.k) {
            shareContent.bitmapUrl = shareContent.longBitmapUrl;
        } else {
            shareContent.bitmapUrl = shareContent.shortBitmapUrl;
        }
        if (shareTarget.icon == R.drawable.ic_download_44) {
            this.q.q0(shareContent.bitmapUrl, this.h);
        } else {
            this.q.p0(shareTarget, shareContent, this.i.isOnlyImage);
        }
    }

    public static ShareLongDialog newInstance(boolean z, int i2, String str) {
        ShareLongDialog shareLongDialog = new ShareLongDialog();
        Bundle bundle = new Bundle();
        bundle.putBoolean("share_type", z);
        bundle.putString("share_title", str);
        bundle.putInt("share_qzone_type", i2);
        shareLongDialog.setArguments(bundle);
        return shareLongDialog;
    }

    private View u(ShareConfig shareConfig) {
        int i2 = shareConfig.shareItemType;
        View viewInflate = View.inflate(getContext(), R.layout.share_dialog_content_grid_long, null);
        this.o = (MagicIndicator) viewInflate.findViewById(R.id.magicindicator);
        this.p = (RelativeLayout) viewInflate.findViewById(R.id.share_long_scroll_tips);
        this.n = (ViewPager) viewInflate.findViewById(R.id.share_long_viewpage);
        viewInflate.findViewById(R.id.close_long_dg).setOnClickListener(new View.OnClickListener() { // from class: ps6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.z(view);
            }
        });
        this.p.setOnClickListener(new View.OnClickListener() { // from class: qs6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.A(view);
            }
        });
        this.n.addOnPageChangeListener(new b());
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        List<ShareTarget> listC = this.q.C(i2, shareConfig.shareItems);
        ShareConfig shareConfig2 = this.i;
        int i3 = shareConfig2.qqZoneShareType;
        if (i3 == 0) {
            if (!shareConfig2.isOnlyImage) {
                listC = this.q.i0(listC);
            }
        } else if (i3 == 18) {
            listC = this.q.i0(listC);
        }
        recyclerView.setAdapter(new g(listC));
        w();
        y();
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int v() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    private void w() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getResources().getString(R.string.share_short));
        arrayList.add(getResources().getString(R.string.share_long));
        CommonNavigator commonNavigator = new CommonNavigator(getContext());
        commonNavigator.setScrollPivotX(0.5f);
        commonNavigator.setAdjustMode(true);
        commonNavigator.setAdapter(new f(arrayList));
        this.o.setNavigator(commonNavigator);
    }

    private void x() {
        HMShareManager hMShareManager = new HMShareManager(getActivity());
        this.q = hMShareManager;
        hMShareManager.n0(new a());
    }

    private void y() {
        ArrayList arrayList = new ArrayList();
        SubsamplingScaleImageView subsamplingScaleImageView = new SubsamplingScaleImageView(requireContext());
        this.s = new SubsamplingScaleImageView(requireContext());
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.j.shortBitmapUrl, options);
        BitmapFactory.decodeFile(this.j.longBitmapUrl, options2);
        subsamplingScaleImageView.setImage(ImageSource.uri(this.j.shortBitmapUrl));
        subsamplingScaleImageView.setZoomEnabled(false);
        subsamplingScaleImageView.setOnImageEventListener(new c(subsamplingScaleImageView));
        this.s.setOnStateChangedListener(new d());
        this.s.setOnImageEventListener(new e());
        arrayList.add(subsamplingScaleImageView);
        arrayList.add(this.s);
        this.n.setAdapter(new i(arrayList));
        ViewPagerHelper.bind(this.o, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(View view) {
        ShareAnalyticsListener shareAnalyticsListener = this.t;
        if (shareAnalyticsListener != null) {
            shareAnalyticsListener.onShareClose();
        }
        dismiss();
    }

    @Override // com.huami.android.design.dialog.AlertDialogFragment, com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean isFullScreen() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        this.q.onActivityResult(i2, i3, intent);
    }

    @Override // com.huami.android.design.dialog.AlertDialogFragment, com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.h = requireContext().getApplicationContext();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.i = (ShareConfig) arguments.getParcelable("SHARE_CONFIG");
            this.j = (ShareContent) arguments.getSerializable(ARG_SHARE_CONTENT);
        }
        this.u = getArguments().getInt(ARG_SHARE_SELECT_COLOR, R.color.s30);
        x();
        DialogParams dialogParams = new DialogParams();
        ShareConfig shareConfig = this.i;
        dialogParams.title = shareConfig.title;
        dialogParams.contentView = u(shareConfig);
        dialogParams.neutralButtonText = getString(R.string.share_cancel);
        setParams(dialogParams);
    }

    public void setShareAnalyticsListener(ShareAnalyticsListener shareAnalyticsListener) {
        this.t = shareAnalyticsListener;
    }

    public void setShareListener(ShareListener shareListener) {
        this.r = shareListener;
    }

    public static ShareLongDialog newInstance(ShareConfig shareConfig, ShareContent shareContent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SHARE_CONFIG", shareConfig);
        bundle.putSerializable(ARG_SHARE_CONTENT, shareContent);
        ShareLongDialog shareLongDialog = new ShareLongDialog();
        shareLongDialog.setArguments(bundle);
        return shareLongDialog;
    }

    public static ShareLongDialog newInstance(ShareConfig shareConfig, ShareContent shareContent, int i2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SHARE_CONFIG", shareConfig);
        bundle.putSerializable(ARG_SHARE_CONTENT, shareContent);
        bundle.putInt(ARG_SHARE_SELECT_COLOR, i2);
        ShareLongDialog shareLongDialog = new ShareLongDialog();
        shareLongDialog.setArguments(bundle);
        return shareLongDialog;
    }
}
