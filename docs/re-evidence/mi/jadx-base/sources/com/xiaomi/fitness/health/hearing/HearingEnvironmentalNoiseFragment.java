package com.xiaomi.fitness.health.hearing;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHearingReport;
import com.xiaomi.fit.fitness.export.data.item.NoiseItem;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.c0j;
import defpackage.eri;
import defpackage.iji;
import defpackage.jui;
import defpackage.nwb;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00015B\u0007¢\u0006\u0004\b4\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J!\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/health/hearing/HearingEnvironmentalNoiseFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/hearing/HearingEnvironmentalNoiseViewModel;", "Lnwb;", "", "initView", "()V", "loadBundle", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/recyclerview/widget/RecyclerView;", "noiseListRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getNoiseListRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setNoiseListRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroid/widget/RelativeLayout;", "noiseListCardView", "Landroid/widget/RelativeLayout;", "getNoiseListCardView", "()Landroid/widget/RelativeLayout;", "setNoiseListCardView", "(Landroid/widget/RelativeLayout;)V", "", "startTimeOfTheDay", "J", "getStartTimeOfTheDay", "()J", "setStartTimeOfTheDay", "(J)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHearingReport;", "mHearingReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHearingReport;", "getMHearingReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHearingReport;", "setMHearingReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHearingReport;)V", "Landroid/widget/TextView;", "dateTv", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/health/hearing/ClickableRecordItemAdapter;", "mClickableRecordItemAdapter", "Lcom/xiaomi/fitness/health/hearing/ClickableRecordItemAdapter;", "", "Lcom/xiaomi/fit/fitness/export/data/item/NoiseItem;", "noiseList", "Ljava/util/List;", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HearingEnvironmentalNoiseFragment extends Hilt_HearingEnvironmentalNoiseFragment<HearingEnvironmentalNoiseViewModel, nwb> {

    @NotNull
    public static final String KEY_NOISE_DECIBEL = "key_noise_decibel";

    @NotNull
    public static final String KEY_NOISE_TIME = "key_noise_time";
    private TextView dateTv;

    @Nullable
    private ClickableRecordItemAdapter mClickableRecordItemAdapter;

    @Nullable
    private DailyHearingReport mHearingReport;

    @Nullable
    private List<NoiseItem> noiseList;
    public RelativeLayout noiseListCardView;
    public RecyclerView noiseListRecyclerView;
    private long startTimeOfTheDay;

    public HearingEnvironmentalNoiseFragment() {
        super(jui.Z3);
    }

    private final void initView() {
        List<NoiseItem> list = this.noiseList;
        if (list == null || list.isEmpty()) {
            ViewExtKt.setVisible(getNoiseListCardView(), false);
            return;
        }
        ClickableRecordItemAdapter.OnNoiseItemListener onNoiseItemListener = new ClickableRecordItemAdapter.OnNoiseItemListener() { // from class: com.xiaomi.fitness.health.hearing.HearingEnvironmentalNoiseFragment$initView$listener$1
            @Override // com.xiaomi.fitness.health.hearing.ClickableRecordItemAdapter.OnNoiseItemListener
            public void onNoiseItemClick(int position) {
                Bundle bundle = new Bundle();
                List list2 = this.this$0.noiseList;
                Intrinsics.checkNotNull(list2);
                NoiseItem noiseItem = (NoiseItem) list2.get(position);
                bundle.putLong(HearingEnvironmentalNoiseFragment.KEY_NOISE_TIME, noiseItem.getTime());
                bundle.putInt(HearingEnvironmentalNoiseFragment.KEY_NOISE_DECIBEL, noiseItem.getDecibel());
                HealthUtil.INSTANCE.gotoPage(this.this$0.getContext(), NoiseItemDetailFragment.class, bundle, null);
            }
        };
        List<NoiseItem> list2 = this.noiseList;
        Intrinsics.checkNotNull(list2);
        this.mClickableRecordItemAdapter = new ClickableRecordItemAdapter(list2, onNoiseItemListener);
        getNoiseListRecyclerView().setLayoutManager(new LinearLayoutManager(requireContext()));
        getNoiseListRecyclerView().setAdapter(this.mClickableRecordItemAdapter);
    }

    private final void loadBundle() {
        this.startTimeOfTheDay = requireArguments().getLong(HearingDayWeekMonthItemFragment.KEY_START_TIME_OF_THE_DAY);
        String string = requireArguments().getString(HearingDayWeekMonthItemFragment.KEY_HEARING_REPORT);
        Intrinsics.checkNotNull(string);
        DailyHearingReport dailyHearingReport = (DailyHearingReport) new Gson().fromJson(string, DailyHearingReport.class);
        this.mHearingReport = dailyHearingReport;
        this.noiseList = dailyHearingReport != null ? dailyHearingReport.getNoiseList() : null;
    }

    @Nullable
    public final DailyHearingReport getMHearingReport() {
        return this.mHearingReport;
    }

    @NotNull
    public final RelativeLayout getNoiseListCardView() {
        RelativeLayout relativeLayout = this.noiseListCardView;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("noiseListCardView");
        return null;
    }

    @NotNull
    public final RecyclerView getNoiseListRecyclerView() {
        RecyclerView recyclerView = this.noiseListRecyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("noiseListRecyclerView");
        return null;
    }

    public final long getStartTimeOfTheDay() {
        return this.startTimeOfTheDay;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(c0j.g8);
        setTitleBackground(iji.a1);
        UIUtils uIUtils = UIUtils.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        uIUtils.setNavigationBarColor(fragmentActivityRequireActivity, iji.a1);
        setNoiseListRecyclerView((RecyclerView) view.findViewById(eri.kc));
        setNoiseListCardView((RelativeLayout) view.findViewById(eri.R4));
        this.dateTv = (TextView) view.findViewById(eri.S2);
        loadBundle();
        String dateMMddFormat = TimeDateUtil.getDateMMddFormat(this.startTimeOfTheDay);
        Logger.d("HearingEnvironmentalNoise " + this.startTimeOfTheDay + "  " + dateMMddFormat, new Object[0]);
        TextView textView = this.dateTv;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dateTv");
            textView = null;
        }
        textView.setText(dateMMddFormat);
        initView();
    }

    public final void setMHearingReport(@Nullable DailyHearingReport dailyHearingReport) {
        this.mHearingReport = dailyHearingReport;
    }

    public final void setNoiseListCardView(@NotNull RelativeLayout relativeLayout) {
        Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
        this.noiseListCardView = relativeLayout;
    }

    public final void setNoiseListRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.noiseListRecyclerView = recyclerView;
    }

    public final void setStartTimeOfTheDay(long j) {
        this.startTimeOfTheDay = j;
    }
}
