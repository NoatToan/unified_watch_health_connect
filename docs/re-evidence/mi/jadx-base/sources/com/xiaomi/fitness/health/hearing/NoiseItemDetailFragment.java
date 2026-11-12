package com.xiaomi.fitness.health.hearing;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.util.NoiseLevelUtil;
import defpackage.c0j;
import defpackage.eri;
import defpackage.gfe;
import defpackage.iji;
import defpackage.jui;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020#H\u0002J\b\u0010)\u001a\u00020#H\u0002J\b\u0010*\u001a\u00020#H\u0002J\b\u0010+\u001a\u00020#H\u0002J\b\u0010,\u001a\u00020#H\u0002J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\b\u0010.\u001a\u00020#H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u0014X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u0014X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/health/hearing/NoiseItemDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "<init>", "()V", "layoutId", "", "getLayoutId", "()I", "levelItems", "", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "noiseLevel", "mLevelBarView", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "mLevelDescRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "noiseVolume", "noiseTime", "", "noiseTimeTv", "Landroid/widget/TextView;", "getNoiseTimeTv", "()Landroid/widget/TextView;", "setNoiseTimeTv", "(Landroid/widget/TextView;)V", "noiseVolumeTv", "getNoiseVolumeTv", "setNoiseVolumeTv", "noiseEvaluationTv", "getNoiseEvaluationTv", "setNoiseEvaluationTv", "noiseLevelDescription", "getNoiseLevelDescription", "setNoiseLevelDescription", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initNoiseTime", "initNoiseLevelDescription", "initNoiseVolumeUnitSection", "initLevelBar", "loadBundle", "initLevelList", "initLevelDescRecyclerview", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NoiseItemDetailFragment extends BaseFragment {

    @NotNull
    private final List<LevelBarView.LevelItem> levelItems;

    @Nullable
    private LevelBarView mLevelBarView;

    @Nullable
    private RecyclerView mLevelDescRecyclerView;
    public TextView noiseEvaluationTv;
    private int noiseLevel;
    public TextView noiseLevelDescription;
    private long noiseTime;
    public TextView noiseTimeTv;
    private int noiseVolume;
    public TextView noiseVolumeTv;

    public NoiseItemDetailFragment() {
        super(0, 1, null);
        this.levelItems = new ArrayList();
        this.noiseLevel = -1;
    }

    private final void initLevelBar() {
        LevelBarView levelBarView = this.mLevelBarView;
        if (levelBarView != null) {
            levelBarView.setLevels(this.levelItems);
        }
        LevelBarView levelBarView2 = this.mLevelBarView;
        if (levelBarView2 != null) {
            levelBarView2.setLevel(this.noiseLevel);
        }
    }

    private final void initLevelDescRecyclerview() {
        gfe gfeVar = new gfe(getContext(), this.levelItems, 3);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        RecyclerView recyclerView = this.mLevelDescRecyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView2 = this.mLevelDescRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setHasFixedSize(true);
        }
        RecyclerView recyclerView3 = this.mLevelDescRecyclerView;
        if (recyclerView3 != null) {
            recyclerView3.setNestedScrollingEnabled(false);
        }
        RecyclerView recyclerView4 = this.mLevelDescRecyclerView;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(gfeVar);
        }
        gfeVar.notifyDataSetChanged();
    }

    private final List<LevelBarView.LevelItem> initLevelList() {
        ListExtKt.add(this.levelItems, new LevelBarView.LevelItem(iji.I, c0j.T8));
        ListExtKt.add(this.levelItems, new LevelBarView.LevelItem(iji.L3, c0j.R8));
        ListExtKt.add(this.levelItems, new LevelBarView.LevelItem(iji.S2, c0j.P8));
        return this.levelItems;
    }

    private final void initNoiseLevelDescription() {
        int i = this.noiseLevel;
        if (i == 0) {
            getNoiseLevelDescription().setText(c0j.U8);
            return;
        }
        if (i == 1) {
            getNoiseLevelDescription().setText(c0j.S8);
        } else if (i != 2) {
            getNoiseLevelDescription().setText(c0j.T8);
        } else {
            getNoiseLevelDescription().setText(c0j.Q8);
        }
    }

    private final void initNoiseTime() {
        getNoiseTimeTv().setText(TimeDateUtil.getDateYYYYMMDDHHmmLocalFormat$default(this.noiseTime, false, 2, null));
    }

    private final void initNoiseVolumeUnitSection() {
        getNoiseVolumeTv().setText(String.valueOf(this.noiseVolume));
        getNoiseEvaluationTv().setText(NoiseLevelUtil.INSTANCE.getNoiseLevelStringResId(this.noiseLevel));
    }

    private final void loadBundle() {
        this.noiseVolume = requireArguments().getInt(HearingEnvironmentalNoiseFragment.KEY_NOISE_DECIBEL, -1);
        this.noiseTime = requireArguments().getLong(HearingEnvironmentalNoiseFragment.KEY_NOISE_TIME, 0L);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.Y4;
    }

    @NotNull
    public final TextView getNoiseEvaluationTv() {
        TextView textView = this.noiseEvaluationTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("noiseEvaluationTv");
        return null;
    }

    @NotNull
    public final TextView getNoiseLevelDescription() {
        TextView textView = this.noiseLevelDescription;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("noiseLevelDescription");
        return null;
    }

    @NotNull
    public final TextView getNoiseTimeTv() {
        TextView textView = this.noiseTimeTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("noiseTimeTv");
        return null;
    }

    @NotNull
    public final TextView getNoiseVolumeTv() {
        TextView textView = this.noiseVolumeTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("noiseVolumeTv");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(c0j.f8);
        setTitleBackground(iji.a1);
        UIUtils uIUtils = UIUtils.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        uIUtils.setNavigationBarColor(fragmentActivityRequireActivity, iji.a1);
        loadBundle();
        initLevelList();
        setNoiseTimeTv((TextView) view.findViewById(eri.lc));
        this.noiseLevel = NoiseLevelUtil.INSTANCE.getNoiseLevel(this.noiseVolume);
        setNoiseVolumeTv((TextView) view.findViewById(eri.mc));
        setNoiseEvaluationTv((TextView) view.findViewById(eri.jc));
        this.mLevelBarView = (LevelBarView) view.findViewById(eri.ma);
        this.mLevelDescRecyclerView = (RecyclerView) view.findViewById(eri.ra);
        setNoiseLevelDescription((TextView) view.findViewById(eri.s6));
        initNoiseTime();
        initLevelBar();
        initLevelDescRecyclerview();
        initNoiseVolumeUnitSection();
        initNoiseLevelDescription();
    }

    public final void setNoiseEvaluationTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.noiseEvaluationTv = textView;
    }

    public final void setNoiseLevelDescription(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.noiseLevelDescription = textView;
    }

    public final void setNoiseTimeTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.noiseTimeTv = textView;
    }

    public final void setNoiseVolumeTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.noiseVolumeTv = textView;
    }
}
