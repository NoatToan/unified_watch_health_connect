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
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class DifficultyFragment extends Fragment {
    public static final String HIGH_LEVEL = "HIGH_LEVEL";
    public static final String JUNIOR_LEVEL = "JUNIOR_LEVEL";
    public static final String MIDDLE_LEVEL = "MIDDLE_LEVEL";
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
            if (RainbowUtils.isDarkMode(DifficultyFragment.this.requireContext())) {
                commonViewHolder.setBackgroundResource(R.id.ll_checked_bg, R.color.black60);
            } else {
                commonViewHolder.setBackgroundResource(R.id.ll_checked_bg, R.color.trans);
                commonViewHolder.getView(i3).setAlpha(0.2f);
            }
            commonViewHolder.setImageDrawable(i3, TintUtils.drawableGray(ContextCompat.getDrawable(DifficultyFragment.this.getContext(), traInitOption.getImageResId()), 0.0f));
            int i4 = R.color.s1;
            commonViewHolder.setTextColorRes(i, i4);
            commonViewHolder.setTextColorRes(i2, i4);
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onItemClick(TraInitOption traInitOption, int i) {
            DifficultyFragment.this.b = i;
            c(i);
        }
    }

    private List<TraInitOption> b(int i) {
        ArrayList arrayList = new ArrayList();
        String[] stringArray = getResources().getStringArray(R.array.difficulty_title);
        String[] stringArray2 = getResources().getStringArray(R.array.difficulty_content);
        TypedArray typedArrayObtainTypedArray = getResources().obtainTypedArray(R.array.difficulty_image);
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

    private void c(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rcv_options);
        this.a = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        this.a.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.a.setHasFixedSize(true);
        List<TraInitOption> listB = b(0);
        this.a.setAdapter(new a(R.layout.item_train_options, R.id.fl_item, listB, listB));
    }

    public String getDifficulity() {
        int i = this.b;
        if (i == 0) {
            return "JUNIOR_LEVEL";
        }
        if (i != 1) {
            return i != 2 ? "JUNIOR_LEVEL" : "HIGH_LEVEL";
        }
        return "MIDDLE_LEVEL";
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_init_choose, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        c(view);
        super.onViewCreated(view, bundle);
    }
}
