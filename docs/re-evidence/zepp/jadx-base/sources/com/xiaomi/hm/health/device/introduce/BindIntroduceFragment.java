package com.xiaomi.hm.health.device.introduce;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/BindIntroduceFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "b", LogUtil.I, "index", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "subtitleTv", "Lcom/airbnb/lottie/LottieAnimationView;", GoogleApiAvailabilityLight.a, "Lcom/airbnb/lottie/LottieAnimationView;", "introduceFragmentImg", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BindIntroduceFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String e = "source";

    @NotNull
    private static final String f = "index";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private HMDeviceSource source = HMDeviceSource.VDEVICE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private TextView subtitleTv;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private LottieAnimationView introduceFragmentImg;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/BindIntroduceFragment$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "index", "Lcom/xiaomi/hm/health/device/introduce/BindIntroduceFragment;", "newInstance", "", "KEY_INDEX", "Ljava/lang/String;", "KEY_SOURCE", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BindIntroduceFragment newInstance(@NotNull HMDeviceSource source, int index) {
            BindIntroduceFragment bindIntroduceFragment = new BindIntroduceFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("source", source);
            bundle.putInt("index", index);
            bindIntroduceFragment.setArguments(bundle);
            return bindIntroduceFragment;
        }
    }

    private final void initView(View view) {
        this.subtitleTv = (TextView) view.findViewById(R.id.introduce_fragment_subtitle_tv);
        this.introduceFragmentImg = (LottieAnimationView) view.findViewById(R.id.introduce_fragment_img);
        KeyEventDispatcher.Component activity = getActivity();
        IntroduceProvider introduceProvider = activity instanceof IntroduceProvider ? (IntroduceProvider) activity : null;
        IntroduceDisplayConfig displayConfig = introduceProvider != null ? introduceProvider.getDisplayConfig() : null;
        if (displayConfig == null) {
            displayConfig = IntroduceShuffleFactoryKt.createDisplayConfig(this.source);
        }
        IntroduceDisplayItem introduceDisplayItem = displayConfig.getItems().get(this.index);
        TextView textView = this.subtitleTv;
        Objects.requireNonNull(textView);
        textView.setText(introduceDisplayItem.getSubTitle());
        Function1<LottieAnimationView, Unit> imgInit = introduceDisplayItem.getImgInit();
        LottieAnimationView lottieAnimationView = this.introduceFragmentImg;
        Objects.requireNonNull(lottieAnimationView);
        imgInit.invoke(lottieAnimationView);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        Serializable serializable = arguments.getSerializable("source");
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMDeviceSource");
        this.source = (HMDeviceSource) serializable;
        this.index = arguments.getInt("index");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.fragment_bind_introduce, container, false);
        initView(viewInflate);
        return viewInflate;
    }
}
