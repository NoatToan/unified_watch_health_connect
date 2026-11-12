package com.xiaomi.fitness.health.sleep.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.c0j;
import defpackage.eri;
import defpackage.iji;
import defpackage.jui;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/SleepBreathQualityDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "<init>", "()V", "layoutId", "", "getLayoutId", "()I", "breathQuality", "breathQualityTextView", "Landroid/widget/TextView;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "loadBundle", "initView", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepBreathQualityDetailFragment extends BaseFragment {

    @NotNull
    public static final String KEY_BREATH_QUALITY = "key_breath_quality";
    private int breathQuality;

    @Nullable
    private TextView breathQualityTextView;

    public SleepBreathQualityDetailFragment() {
        super(0, 1, null);
    }

    private final void initView() {
        if (this.breathQuality <= 0) {
            TextView textView = this.breathQualityTextView;
            Intrinsics.checkNotNull(textView);
            textView.setText("--");
        } else {
            TextView textView2 = this.breathQualityTextView;
            Intrinsics.checkNotNull(textView2);
            Resources resources = requireContext().getResources();
            int i = qxi.S0;
            int i2 = this.breathQuality;
            textView2.setText(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
        }
    }

    private final void loadBundle() {
        Bundle arguments = getArguments();
        this.breathQuality = arguments != null ? arguments.getInt(KEY_BREATH_QUALITY) : 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.f5;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        UIUtils uIUtils = UIUtils.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        uIUtils.setNavigationBarColor(fragmentActivityRequireActivity, iji.a1);
        this.breathQualityTextView = (TextView) view.findViewById(eri.xf);
        setTitleBackground(iji.a1);
        setTitle(c0j.be);
        setActionBarExpandState(0);
        loadBundle();
        initView();
    }
}
