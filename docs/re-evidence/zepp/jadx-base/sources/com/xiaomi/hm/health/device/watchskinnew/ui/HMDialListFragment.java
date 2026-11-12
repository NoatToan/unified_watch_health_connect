package com.xiaomi.hm.health.device.watchskinnew.ui;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.lib.view.ViewUtils;
import com.huami.util.net.NetUtil;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadmoreListener;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.watchskinnew.DialLoader;
import com.xiaomi.hm.health.device.watchskinnew.WatchSkinAdapter;
import com.xiaomi.hm.health.device.watchskinnew.bean.WatchSkinBean;
import com.xiaomi.hm.health.device.watchskinnew.ui.HMDialListFragment;
import com.xiaomi.hm.health.ui.smartplay.eventremind.RxUtil;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b:\u0010;J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010'R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0016\u00101\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u00105\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00100R\u0016\u00106\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00100R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00108¨\u0006="}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/ui/HMDialListFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "initView", "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "l", "", hl.k, "g", "e", "loadData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "Lcom/scwang/smartrefresh/layout/SmartRefreshLayout;", "a", "Lcom/scwang/smartrefresh/layout/SmartRefreshLayout;", "loadMoreLayout", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Landroidx/recyclerview/widget/RecyclerView;", "dialList", "Landroid/widget/FrameLayout;", "c", "Landroid/widget/FrameLayout;", "errorContainer", "Landroid/widget/TextView;", GoogleApiAvailabilityLight.a, "Landroid/widget/TextView;", "errorTipsTv", "Lcom/xiaomi/hm/health/device/watchskinnew/WatchSkinAdapter;", "Lcom/xiaomi/hm/health/device/watchskinnew/WatchSkinAdapter;", "adapter", "f", LogUtil.I, "type", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "h", "F", "centerGapCinco", "i", "edgeGapCinco", z.j, "centerGapVenice", "edgeGapVenice", "", "Z", "isRTL", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMDialListFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final float TEXT_SIZE_LOADING = 11.0f;
    public static final int TYPE_DIY = 1;
    public static final int TYPE_SELECTED = 0;

    @NotNull
    private static final String m = "type";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private SmartRefreshLayout loadMoreLayout;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private RecyclerView dialList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private FrameLayout errorContainer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private TextView errorTipsTv;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private WatchSkinAdapter adapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int type;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float centerGapCinco;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float edgeGapCinco;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float centerGapVenice;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private float edgeGapVenice;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource deviceSource = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI);

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean isRTL = ViewUtils.isRTL();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/ui/HMDialListFragment$Companion;", "", "", "type", "Lcom/xiaomi/hm/health/device/watchskinnew/ui/HMDialListFragment;", "newInstance", "", "KEY_TYPE", "Ljava/lang/String;", "", "TEXT_SIZE_LOADING", "F", "TYPE_DIY", LogUtil.I, "TYPE_SELECTED", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HMDialListFragment newInstance(int type) {
            HMDialListFragment hMDialListFragment = new HMDialListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("type", type);
            hMDialListFragment.setArguments(bundle);
            return hMDialListFragment;
        }
    }

    private final void e() {
        FrameLayout frameLayout = this.errorContainer;
        Objects.requireNonNull(frameLayout);
        frameLayout.setVisibility(0);
        SmartRefreshLayout smartRefreshLayout = this.loadMoreLayout;
        Objects.requireNonNull(smartRefreshLayout);
        smartRefreshLayout.setVisibility(8);
        TextView textView = this.errorTipsTv;
        Objects.requireNonNull(textView);
        textView.setText(R.string.discovery_status_error);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.icon_light_house);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            TextView textView2 = this.errorTipsTv;
            Objects.requireNonNull(textView2);
            textView2.setCompoundDrawables(null, drawable, null, null);
        }
        FrameLayout frameLayout2 = this.errorContainer;
        Objects.requireNonNull(frameLayout2);
        frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: fu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMDialListFragment.f(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(HMDialListFragment hMDialListFragment, View view) {
        FrameLayout frameLayout = hMDialListFragment.errorContainer;
        Objects.requireNonNull(frameLayout);
        frameLayout.setVisibility(8);
        SmartRefreshLayout smartRefreshLayout = hMDialListFragment.loadMoreLayout;
        Objects.requireNonNull(smartRefreshLayout);
        smartRefreshLayout.setVisibility(0);
        hMDialListFragment.loadData();
    }

    private final void g() {
        FrameLayout frameLayout = this.errorContainer;
        Objects.requireNonNull(frameLayout);
        frameLayout.setVisibility(0);
        SmartRefreshLayout smartRefreshLayout = this.loadMoreLayout;
        Objects.requireNonNull(smartRefreshLayout);
        smartRefreshLayout.setVisibility(8);
        TextView textView = this.errorTipsTv;
        Objects.requireNonNull(textView);
        textView.setText(R.string.discovery_status_retry);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.img_net);
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        TextView textView2 = this.errorTipsTv;
        Objects.requireNonNull(textView2);
        textView2.setCompoundDrawables(null, drawable, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WatchSkinBean[] h(HMDialListFragment hMDialListFragment) {
        return DialLoader.INSTANCE.getInstance().loadData(hMDialListFragment.deviceSource, hMDialListFragment.type == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(HMDialListFragment hMDialListFragment, WatchSkinBean[] watchSkinBeanArr) {
        if (watchSkinBeanArr == null) {
            SmartRefreshLayout smartRefreshLayout = hMDialListFragment.loadMoreLayout;
            Objects.requireNonNull(smartRefreshLayout);
            smartRefreshLayout.finishLoadmore(0);
            if (DialLoader.INSTANCE.getInstance().getDials(hMDialListFragment.type).isEmpty()) {
                hMDialListFragment.e();
                return;
            } else {
                IconToast.showError(hMDialListFragment.getContext(), R.string.load_fail);
                return;
            }
        }
        if (watchSkinBeanArr.length == 0) {
            SmartRefreshLayout smartRefreshLayout2 = hMDialListFragment.loadMoreLayout;
            Objects.requireNonNull(smartRefreshLayout2);
            smartRefreshLayout2.finishLoadmore(0);
            SmartRefreshLayout smartRefreshLayout3 = hMDialListFragment.loadMoreLayout;
            Objects.requireNonNull(smartRefreshLayout3);
            smartRefreshLayout3.setLoadmoreFinished(true);
            return;
        }
        WatchSkinAdapter watchSkinAdapter = hMDialListFragment.adapter;
        Objects.requireNonNull(watchSkinAdapter);
        watchSkinAdapter.addData(ArraysKt___ArraysJvmKt.asList(watchSkinBeanArr));
        SmartRefreshLayout smartRefreshLayout4 = hMDialListFragment.loadMoreLayout;
        Objects.requireNonNull(smartRefreshLayout4);
        smartRefreshLayout4.finishLoadmore(0);
    }

    private final void initView(View view) {
        int i;
        final float fK;
        if (HMDialListFragmentKt.isCincoUI()) {
            i = 60;
        } else {
            i = HMDialListFragmentKt.isVeniceUI() ? 58 : 98;
        }
        l(i);
        final int i2 = 3;
        if (HMDialListFragmentKt.isCincoUI()) {
            fK = this.centerGapCinco;
        } else {
            fK = HMDialListFragmentKt.isVeniceUI() ? this.centerGapVenice : k(i);
        }
        this.dialList = (RecyclerView) view.findViewById(R.id.selected_dial_list);
        FragmentActivity activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        RecyclerView recyclerView = this.dialList;
        Objects.requireNonNull(recyclerView);
        WatchSkinAdapter watchSkinAdapter = new WatchSkinAdapter((AppCompatActivity) activity, recyclerView, this.type);
        this.adapter = watchSkinAdapter;
        RecyclerView recyclerView2 = this.dialList;
        Objects.requireNonNull(recyclerView2);
        Objects.requireNonNull(watchSkinAdapter);
        recyclerView2.setAdapter(watchSkinAdapter);
        RecyclerView recyclerView3 = this.dialList;
        Objects.requireNonNull(recyclerView3);
        recyclerView3.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        RecyclerView recyclerView4 = this.dialList;
        Objects.requireNonNull(recyclerView4);
        recyclerView4.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.xiaomi.hm.health.device.watchskinnew.ui.HMDialListFragment.initView.1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(@NotNull Rect outRect, @NotNull View view2, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
                float fDp2px;
                int childAdapterPosition = parent.getChildAdapterPosition(view2);
                int i3 = childAdapterPosition % i2;
                if (this.isRTL) {
                    float f = fK;
                    int i4 = i2;
                    outRect.right = (int) ((i3 * f) / i4);
                    outRect.left = (int) (f - (((i3 + 1) * f) / i4));
                } else {
                    float f2 = fK;
                    int i5 = i2;
                    outRect.left = (int) ((i3 * f2) / i5);
                    outRect.right = (int) (f2 - (((i3 + 1) * f2) / i5));
                }
                if (childAdapterPosition >= i2) {
                    if (HMDialListFragmentKt.isCincoUI()) {
                        fDp2px = ViewUtils.dp2px(this.getContext(), 30.0f);
                    } else if (HMDialListFragmentKt.isKestrelUI()) {
                        fDp2px = ViewUtils.dp2px(this.getContext(), 27.0f);
                    } else {
                        fDp2px = HMDialListFragmentKt.isVeniceUI() ? ViewUtils.dp2px(this.getContext(), 38.0f) : fK;
                    }
                    outRect.top = (int) fDp2px;
                }
            }
        });
        if (HMDialListFragmentKt.isCincoUI()) {
            RecyclerView recyclerView5 = this.dialList;
            Objects.requireNonNull(recyclerView5);
            recyclerView5.setPadding((int) this.edgeGapCinco, (int) ViewUtils.dp2px(getContext(), 20.0f), (int) this.edgeGapCinco, 0);
        } else if (HMDialListFragmentKt.isVeniceUI()) {
            RecyclerView recyclerView6 = this.dialList;
            Objects.requireNonNull(recyclerView6);
            recyclerView6.setPadding((int) this.edgeGapVenice, (int) ViewUtils.dp2px(getContext(), 38.0f), (int) this.edgeGapVenice, 0);
        } else {
            float fDp2px = ViewUtils.dp2px(getActivity(), 4.0f);
            if (this.isRTL) {
                RecyclerView recyclerView7 = this.dialList;
                Objects.requireNonNull(recyclerView7);
                recyclerView7.setPadding((int) (fK - fDp2px), (int) ViewUtils.dp2px(getContext(), 18.0f), (int) (fK + fDp2px), 0);
            } else {
                RecyclerView recyclerView8 = this.dialList;
                Objects.requireNonNull(recyclerView8);
                recyclerView8.setPadding((int) (fK + fDp2px), (int) ViewUtils.dp2px(getContext(), 18.0f), (int) (fK - fDp2px), 0);
            }
        }
        this.loadMoreLayout = (SmartRefreshLayout) view.findViewById(R.id.load_more_layout);
        ClassicsFooter.REFRESH_FOOTER_PULLUP = getString(R.string.label_pull_to_load);
        ClassicsFooter.REFRESH_FOOTER_RELEASE = getString(R.string.label_release_to_load);
        ClassicsFooter.REFRESH_FOOTER_LOADING = getString(R.string.setting_dev_loading);
        ClassicsFooter.REFRESH_FOOTER_REFRESHING = getString(R.string.label_refreshing);
        ClassicsFooter.REFRESH_FOOTER_FINISH = getString(R.string.load_success);
        ClassicsFooter.REFRESH_FOOTER_FAILED = getString(R.string.load_fail);
        ClassicsFooter.REFRESH_FOOTER_ALLLOADED = "";
        SmartRefreshLayout smartRefreshLayout = this.loadMoreLayout;
        Objects.requireNonNull(smartRefreshLayout);
        ClassicsFooter finishDuration = new ClassicsFooter(getContext()).setSpinnerStyle(SpinnerStyle.Translate).setFinishDuration(0);
        finishDuration.getTitleText().setTextSize(11.0f);
        finishDuration.getTitleText().setTextColor(ContextCompat.getColor(requireContext(), R.color.s2));
        finishDuration.setProgressDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.icon_loading));
        Unit unit = Unit.INSTANCE;
        smartRefreshLayout.setRefreshFooter((RefreshFooter) finishDuration);
        SmartRefreshLayout smartRefreshLayout2 = this.loadMoreLayout;
        Objects.requireNonNull(smartRefreshLayout2);
        smartRefreshLayout2.setEnableRefresh(false);
        SmartRefreshLayout smartRefreshLayout3 = this.loadMoreLayout;
        Objects.requireNonNull(smartRefreshLayout3);
        smartRefreshLayout3.setEnableLoadmore(true);
        SmartRefreshLayout smartRefreshLayout4 = this.loadMoreLayout;
        Objects.requireNonNull(smartRefreshLayout4);
        smartRefreshLayout4.setEnableLoadmoreWhenContentNotFull(true);
        SmartRefreshLayout smartRefreshLayout5 = this.loadMoreLayout;
        Objects.requireNonNull(smartRefreshLayout5);
        smartRefreshLayout5.setEnableAutoLoadmore(true);
        SmartRefreshLayout smartRefreshLayout6 = this.loadMoreLayout;
        Objects.requireNonNull(smartRefreshLayout6);
        smartRefreshLayout6.setOnRefreshLoadmoreListener(new OnRefreshLoadmoreListener() { // from class: com.xiaomi.hm.health.device.watchskinnew.ui.HMDialListFragment.initView.3
            @Override // com.scwang.smartrefresh.layout.listener.OnLoadmoreListener
            public void onLoadmore(@Nullable RefreshLayout refreshlayout) {
                HMDialListFragment.this.loadData();
            }

            @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
            public void onRefresh(@Nullable RefreshLayout refreshlayout) {
            }
        });
        this.errorContainer = (FrameLayout) view.findViewById(R.id.error_container);
        this.errorTipsTv = (TextView) view.findViewById(R.id.error_tips_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Throwable th) {
    }

    private final float k(int width) {
        return (ViewUtils.getScreenWidth(getActivity()) - (ViewUtils.dp2px(getActivity(), width) * 3)) / 4.0f;
    }

    private final void l(int width) {
        float fDp2px = ViewUtils.dp2px(getActivity(), width) * 3;
        int screenWidth = ViewUtils.getScreenWidth(getActivity());
        if (HMDialListFragmentKt.isCincoUI()) {
            float f = (screenWidth - fDp2px) / 2.0f;
            this.centerGapCinco = 0.5777778f * f;
            this.edgeGapCinco = f * 0.4222222f;
        } else if (HMDialListFragmentKt.isVeniceUI()) {
            float f2 = (screenWidth - fDp2px) / 2.0f;
            this.centerGapVenice = 0.5913978f * f2;
            this.edgeGapVenice = f2 * 0.40860218f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData() {
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            Observable.fromCallable(new Callable() { // from class: gu2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return HMDialListFragment.h(this.a);
                }
            }).compose(RxUtil.ioToMain()).subscribe(new Action1() { // from class: hu2
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    HMDialListFragment.i(this.a, (WatchSkinBean[]) obj);
                }
            }, new Action1() { // from class: iu2
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    HMDialListFragment.j((Throwable) obj);
                }
            });
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.loadMoreLayout;
        Objects.requireNonNull(smartRefreshLayout);
        smartRefreshLayout.finishLoadmore(0);
        if (DialLoader.INSTANCE.getInstance().getDials(this.type).isEmpty()) {
            g();
        } else {
            IconToast.showError(getContext(), R.string.no_network_connection);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_selected_dial, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        this.type = arguments == null ? 0 : arguments.getInt("type");
        initView(view);
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            loadData();
        } else {
            g();
        }
    }
}
