package com.xiaomi.hm.health.training.ui.fragment;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.model.TraInitOption;
import com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter;
import com.xiaomi.hm.health.training.ui.adapter.CommonViewHolder;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import com.xiaomi.hm.health.traininglib.util.TrainerUtil;
import com.xiaomi.hm.health.traininglib.util.TrainingConstant;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class FitnessGoalFragment extends Fragment {
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 2;
    private static final String f = "LOSE_FAT";
    private static final String g = "SHAPING";
    private static final String h = "INCREASE_MUSCLE";
    private RecyclerView a;
    private int b;

    public class a extends CommonRecycleAdapter<TraInitOption> {
        public final /* synthetic */ List d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, List list, List list2) {
            super(i, i2, list);
            this.d = list2;
        }

        private void c(int i) {
            int i2 = 0;
            while (i2 < this.d.size()) {
                ((TraInitOption) this.d.get(i2)).setChecked(i2 == i);
                i2++;
            }
            notifyDataSetChanged();
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bindViewHolder(CommonViewHolder commonViewHolder, TraInitOption traInitOption) {
            int i = R.id.tx_option_title;
            CommonViewHolder text = commonViewHolder.setText(i, traInitOption.getOptionTitle());
            int i2 = R.id.tx_option_content;
            CommonViewHolder text2 = text.setText(i2, traInitOption.getOptionContent());
            int i3 = R.id.imv_background_item;
            text2.setImageResource(i3, traInitOption.getImageResId());
            if (traInitOption.isChecked()) {
                commonViewHolder.setBackgroundResource(R.id.ll_checked_bg, R.color.orange80);
                commonViewHolder.setImageResource(i3, traInitOption.getImageResId());
                commonViewHolder.getView(i3).setAlpha(1.0f);
                commonViewHolder.setTextColorRes(i, R.color.white100);
                commonViewHolder.setTextColorRes(i2, R.color.white80);
                return;
            }
            if (RainbowUtils.isDarkMode(FitnessGoalFragment.this.requireContext())) {
                commonViewHolder.setBackgroundResource(R.id.ll_checked_bg, R.color.black60);
            } else {
                commonViewHolder.setBackgroundResource(R.id.ll_checked_bg, R.color.trans);
                commonViewHolder.getView(i3).setAlpha(0.2f);
            }
            commonViewHolder.setImageDrawable(i3, TintUtils.drawableGray(ContextCompat.getDrawable(FitnessGoalFragment.this.getContext(), traInitOption.getImageResId()), 0.0f));
            int i4 = R.color.s1;
            commonViewHolder.setTextColorRes(i, i4);
            commonViewHolder.setTextColorRes(i2, i4);
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onItemClick(TraInitOption traInitOption, int i) {
            FitnessGoalFragment.this.b = i;
            c(i);
        }
    }

    private int b(TrainerInfo trainerInfo, boolean z) {
        String trainerBodyState = TrainerUtil.getTrainerBodyState(trainerInfo);
        if (TrainingConstant.BodyFigure.BODY_THIN.equals(trainerBodyState) && z) {
            return 2;
        }
        return (TrainingConstant.BodyFigure.BODY_FAT.equals(trainerBodyState) || TrainingConstant.BodyFigure.BODY_TOO_FAT.equals(trainerBodyState)) ? 0 : 1;
    }

    private List<TraInitOption> c(int i) {
        ArrayList arrayList = new ArrayList();
        String[] stringArray = getResources().getStringArray(R.array.fitness_goal_title);
        String[] stringArray2 = getResources().getStringArray(R.array.fitness_goal_content);
        TypedArray typedArrayObtainTypedArray = getResources().obtainTypedArray(R.array.fitness_goal_image);
        int i2 = 0;
        while (i2 < stringArray.length) {
            TraInitOption traInitOption = new TraInitOption();
            traInitOption.setOptionTitle(stringArray[i2]);
            traInitOption.setOptionContent(stringArray2[i2]);
            traInitOption.setImageResId(typedArrayObtainTypedArray.getResourceId(i2, 0));
            traInitOption.setChecked(i2 == i);
            arrayList.add(traInitOption);
            i2++;
        }
        typedArrayObtainTypedArray.recycle();
        return arrayList;
    }

    private void d(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rcv_options);
        this.a = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        this.a.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.a.setHasFixedSize(true);
        TrainerInfo trainerInfo = TrainerInfo.get();
        int iB = b(trainerInfo, trainerInfo.age >= 18);
        this.b = iB;
        List<TraInitOption> listC = c(iB);
        this.a.setAdapter(new a(R.layout.item_train_options, R.id.fl_item, listC, listC));
    }

    public String getFitnessGoal() {
        int i = this.b;
        if (i != 0) {
            return (i == 1 || i != 2) ? g : h;
        }
        return f;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_init_choose, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        d(view);
        super.onViewCreated(view, bundle);
    }
}
