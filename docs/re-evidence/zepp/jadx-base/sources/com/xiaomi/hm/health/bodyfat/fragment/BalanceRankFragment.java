package com.xiaomi.hm.health.bodyfat.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.view.weightfigure.WeightFigureView;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.fragment.BalanceRankFragment;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.viewmodel.BalanceDetailViewModel;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/BalanceRankFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class BalanceRankFragment extends Fragment {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Float, String> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @NotNull
        public final String a(float f) {
            return String.valueOf((int) f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Float f) {
            return a(f.floatValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "value", "", "index", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Float, Integer, Unit> {
        public final /* synthetic */ String[] b;
        public final /* synthetic */ TextView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String[] strArr, TextView textView) {
            super(2);
            this.b = strArr;
            this.c = textView;
        }

        public final void a(float f, int i) {
            this.c.setText(BalanceRankFragment.this.getString(R.string.one_foot_score_level, this.b[i]));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Float f, Integer num) {
            a(f.floatValue(), num.intValue());
            return Unit.INSTANCE;
        }
    }

    public BalanceRankFragment() {
        super(R.layout.fragment_balance_rank);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(WeightFigureView weightFigureView, TextView textView, WeightInfos weightInfos) {
        if (weightInfos == null) {
            textView.setVisibility(8);
            weightFigureView.setVisibility(8);
        } else {
            weightFigureView.setInitValue(weightInfos.getOfmt().floatValue());
            textView.setVisibility(0);
            weightFigureView.setVisibility(0);
        }
    }

    private final void initView(View view) {
        final TextView textView = (TextView) view.findViewById(R.id.tx_score_level);
        final WeightFigureView weightFigureView = (WeightFigureView) view.findViewById(R.id.balance_figure_view);
        weightFigureView.setLanguageNormal(Language.isChinese());
        weightFigureView.setThumbDarkStyle(weightFigureView.getContext());
        weightFigureView.setCenterLabel(true);
        weightFigureView.setLabelTextSize(12.0f);
        weightFigureView.setScaleTextSize(11.0f);
        weightFigureView.setScaleTextColor(ContextCompat.getColor(requireContext(), R.color.s2));
        Typeface typeface = TypefaceManager.get().getTypeface(requireContext(), Font.KM);
        if (typeface != null) {
            weightFigureView.setTypeface(typeface);
        }
        weightFigureView.setListener(a.a);
        List<Float> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.0f), Float.valueOf(20.0f), Float.valueOf(40.0f), Float.valueOf(60.0f), Float.valueOf(80.0f), Float.valueOf(100.0f)});
        String[] stringArray = weightFigureView.getResources().getStringArray(R.array.bodyfat_measure_balance_level);
        int[] iArrGeOneFootScoreColors = HMWeightUtils.geOneFootScoreColors(requireContext());
        weightFigureView.setValues(listListOf, iArrGeOneFootScoreColors, stringArray, iArrGeOneFootScoreColors);
        weightFigureView.setValueIndexListener(new b(stringArray, textView));
        ((BalanceDetailViewModel) ViewModelProviders.of(requireActivity()).get(BalanceDetailViewModel.class)).getSelectData().observe(getViewLifecycleOwner(), new Observer() { // from class: xm
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BalanceRankFragment.b(weightFigureView, textView, (WeightInfos) obj);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }
}
