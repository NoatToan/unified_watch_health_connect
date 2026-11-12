package com.xiaomi.fitness.detail.inner;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.constant.FitnessDataChangedSource;
import com.xiaomi.fit.data.common.constant.FitnessDataChangedUtils;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.recycler.SportTrainingExperienceAdapter;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.bsi;
import defpackage.uha;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 Q2\u00020\u0001:\u0001QB\u0007¢\u0006\u0004\bP\u0010\u000eJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0019\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u000eR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R$\u00100\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010/\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010<\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R$\u0010@\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010G\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0011\u0010O\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006R"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportTrainingExperienceFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "", "initParamsFromBundle", "(Landroid/os/Bundle;)V", "", "text", "Landroid/graphics/drawable/Drawable;", "drawable", "updateTitleView", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V", "initTitleView", "()V", "initRecyclerView", "recordTriathlonSportReport", "getCardName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", LifecycleConstantKt.ON_RESUME, "Luha;", "_binding", "Luha;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/xiaomi/fitness/detail/recycler/SportTrainingExperienceAdapter;", "recyclerAdapter", "Lcom/xiaomi/fitness/detail/recycler/SportTrainingExperienceAdapter;", "getRecyclerAdapter", "()Lcom/xiaomi/fitness/detail/recycler/SportTrainingExperienceAdapter;", "setRecyclerAdapter", "(Lcom/xiaomi/fitness/detail/recycler/SportTrainingExperienceAdapter;)V", "Landroid/widget/TextView;", "textTitleView", "Landroid/widget/TextView;", "textDescView", "getTextDescView", "()Landroid/widget/TextView;", "setTextDescView", "(Landroid/widget/TextView;)V", "Landroid/widget/ImageView;", "imageTitleView", "Landroid/widget/ImageView;", "getImageTitleView", "()Landroid/widget/ImageView;", "setImageTitleView", "(Landroid/widget/ImageView;)V", "imageDescView", "getImageDescView", "setImageDescView", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "mBasicSportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getMBasicSportValues", "()Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "setMBasicSportValues", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "", "mSportType", "Ljava/lang/Integer;", "getMSportType", "()Ljava/lang/Integer;", "setMSportType", "(Ljava/lang/Integer;)V", "getBinding", "()Luha;", "binding", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportTrainingExperienceFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportTrainingExperienceFragment";

    @Nullable
    private uha _binding;

    @Nullable
    private ImageView imageDescView;

    @Nullable
    private ImageView imageTitleView;

    @Nullable
    private SportBasicReport mBasicSportValues;

    @Nullable
    private Integer mSportType;

    @Nullable
    private SportTrainingExperienceAdapter recyclerAdapter;

    @Nullable
    private RecyclerView recyclerView;

    @Nullable
    private TextView textDescView;

    @Nullable
    private TextView textTitleView;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportTrainingExperienceFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "mBasicReport", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void switchDetailFragment(@NotNull SportBasicReport sportValues, @Nullable SportBasicReport mBasicReport, int sportType, int triathlonNum, int sportDetailType, @Nullable FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(sportValues, "sportValues");
            Bundle bundle = new Bundle();
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportValues);
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_BASIC_REPORT, mBasicReport);
            bundle.putInt("sport_type", sportType);
            bundle.putInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, sportDetailType);
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag(SportTrainingExperienceFragment.TAG, triathlonNum, sportType);
            int i = bsi.g8;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportTrainingExperienceFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            this.mBasicSportValues = (SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_BASIC_REPORT);
            this.mSportType = Integer.valueOf(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE));
        }
    }

    private final void initRecyclerView() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), 5);
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        SportTrainingExperienceAdapter sportTrainingExperienceAdapter = new SportTrainingExperienceAdapter();
        this.recyclerAdapter = sportTrainingExperienceAdapter;
        sportTrainingExperienceAdapter.setDistributeItemClickListener(new SportTrainingExperienceAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.detail.inner.SportTrainingExperienceFragment.initRecyclerView.1
            @Override // com.xiaomi.fitness.detail.recycler.SportTrainingExperienceAdapter.OnItemClickListener
            public void onClick(int position, String textDesc, Drawable drawable) {
                Integer entityOffsetTime;
                Intrinsics.checkNotNullParameter(textDesc, "textDesc");
                SportBasicReport mBasicSportValues = SportTrainingExperienceFragment.this.getMBasicSportValues();
                if (mBasicSportValues != null) {
                    mBasicSportValues.setTrainingExperience(Integer.valueOf(position));
                }
                if (SportTrainingExperienceFragment.this.getMBasicSportValues() != null) {
                    SportBasicReport mBasicSportValues2 = SportTrainingExperienceFragment.this.getMBasicSportValues();
                    Intrinsics.checkNotNull(mBasicSportValues2);
                    if (mBasicSportValues2.getSid() != null) {
                        FitnessDataRecorder fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
                        SportBasicReport mBasicSportValues3 = SportTrainingExperienceFragment.this.getMBasicSportValues();
                        String sid = mBasicSportValues3 != null ? mBasicSportValues3.getSid() : null;
                        Intrinsics.checkNotNull(sid);
                        SportBasicReport mBasicSportValues4 = SportTrainingExperienceFragment.this.getMBasicSportValues();
                        int iIntValue = (mBasicSportValues4 == null || (entityOffsetTime = mBasicSportValues4.getEntityOffsetTime()) == null) ? 0 : entityOffsetTime.intValue();
                        SportBasicReport mBasicSportValues5 = SportTrainingExperienceFragment.this.getMBasicSportValues();
                        Intrinsics.checkNotNull(mBasicSportValues5);
                        FitnessDataChangedUtils.sendRecentDataChangedBroadcast$default(FitnessDataChangedUtils.INSTANCE, FitnessDataChangedSource.ManualRecord, fitnessDataExtKt.recordSportReport(sid, iIntValue, mBasicSportValues5), null, null, false, 28, null);
                    }
                }
                SportTrainingExperienceFragment.this.updateTitleView(textDesc, drawable);
            }
        });
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.recyclerAdapter);
        }
    }

    private final void initTitleView() {
        SportBasicReport sportBasicReport = this.mBasicSportValues;
        if ((sportBasicReport != null ? sportBasicReport.getTrainingExperience() : null) != null) {
            IntRange intRange = new IntRange(1, 5);
            SportBasicReport sportBasicReport2 = this.mBasicSportValues;
            Integer trainingExperience = sportBasicReport2 != null ? sportBasicReport2.getTrainingExperience() : null;
            if (trainingExperience != null && intRange.contains(trainingExperience.intValue())) {
                ImageView imageView = this.imageDescView;
                if (imageView != null) {
                    SportTrainingExperienceAdapter sportTrainingExperienceAdapter = new SportTrainingExperienceAdapter();
                    SportBasicReport sportBasicReport3 = this.mBasicSportValues;
                    Integer trainingExperience2 = sportBasicReport3 != null ? sportBasicReport3.getTrainingExperience() : null;
                    Intrinsics.checkNotNull(trainingExperience2);
                    imageView.setBackground(sportTrainingExperienceAdapter.getDrawableByPosition(trainingExperience2.intValue()));
                }
                TextView textView = this.textDescView;
                if (textView != null) {
                    SportTrainingExperienceAdapter sportTrainingExperienceAdapter2 = new SportTrainingExperienceAdapter();
                    SportBasicReport sportBasicReport4 = this.mBasicSportValues;
                    Integer trainingExperience3 = sportBasicReport4 != null ? sportBasicReport4.getTrainingExperience() : null;
                    Intrinsics.checkNotNull(trainingExperience3);
                    textView.setText(sportTrainingExperienceAdapter2.getStringByPosition(trainingExperience3.intValue()));
                }
                ImageView imageView2 = this.imageDescView;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                TextView textView2 = this.textDescView;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                RecyclerView recyclerView = this.recyclerView;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
                getBinding().D.setVisibility(8);
                return;
            }
        }
        ImageView imageView3 = this.imageDescView;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        TextView textView3 = this.textDescView;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        getBinding().D.setVisibility(0);
    }

    private final void recordTriathlonSportReport() {
        Integer entityOffsetTime;
        SportBasicReport sportBasicReport = this.mBasicSportValues;
        if (sportBasicReport != null) {
            Intrinsics.checkNotNull(sportBasicReport);
            if (sportBasicReport.getSid() != null) {
                FitnessDataRecorder fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
                SportBasicReport sportBasicReport2 = this.mBasicSportValues;
                String sid = sportBasicReport2 != null ? sportBasicReport2.getSid() : null;
                Intrinsics.checkNotNull(sid);
                SportBasicReport sportBasicReport3 = this.mBasicSportValues;
                int iIntValue = (sportBasicReport3 == null || (entityOffsetTime = sportBasicReport3.getEntityOffsetTime()) == null) ? 0 : entityOffsetTime.intValue();
                SportBasicReport sportBasicReport4 = this.mBasicSportValues;
                Intrinsics.checkNotNull(sportBasicReport4);
                fitnessDataExtKt.recordSportReport(sid, iIntValue, sportBasicReport4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTitleView(String text, Drawable drawable) {
        ImageView imageView = this.imageDescView;
        if (imageView != null) {
            imageView.setBackground(drawable);
        }
        TextView textView = this.textDescView;
        if (textView != null) {
            textView.setText(text);
        }
        ImageView imageView2 = this.imageDescView;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        TextView textView2 = this.textDescView;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        getBinding().D.setVisibility(8);
    }

    @NotNull
    public final uha getBinding() {
        uha uhaVar = this._binding;
        Intrinsics.checkNotNull(uhaVar);
        return uhaVar;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "training_feeling";
    }

    @Nullable
    public final ImageView getImageDescView() {
        return this.imageDescView;
    }

    @Nullable
    public final ImageView getImageTitleView() {
        return this.imageTitleView;
    }

    @Nullable
    public final SportBasicReport getMBasicSportValues() {
        return this.mBasicSportValues;
    }

    @Nullable
    public final Integer getMSportType() {
        return this.mSportType;
    }

    @Nullable
    public final SportTrainingExperienceAdapter getRecyclerAdapter() {
        return this.recyclerAdapter;
    }

    @Nullable
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    @Nullable
    public final TextView getTextDescView() {
        return this.textDescView;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = uha.A0(inflater, container, false);
        this.recyclerView = getBinding().C;
        this.textTitleView = getBinding().F;
        this.imageTitleView = getBinding().A;
        this.imageDescView = getBinding().B;
        this.textDescView = getBinding().E;
        initParamsFromBundle(getArguments());
        initRecyclerView();
        initTitleView();
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        initTitleView();
    }

    public final void setImageDescView(@Nullable ImageView imageView) {
        this.imageDescView = imageView;
    }

    public final void setImageTitleView(@Nullable ImageView imageView) {
        this.imageTitleView = imageView;
    }

    public final void setMBasicSportValues(@Nullable SportBasicReport sportBasicReport) {
        this.mBasicSportValues = sportBasicReport;
    }

    public final void setMSportType(@Nullable Integer num) {
        this.mSportType = num;
    }

    public final void setRecyclerAdapter(@Nullable SportTrainingExperienceAdapter sportTrainingExperienceAdapter) {
        this.recyclerAdapter = sportTrainingExperienceAdapter;
    }

    public final void setRecyclerView(@Nullable RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public final void setTextDescView(@Nullable TextView textView) {
        this.textDescView = textView;
    }
}
