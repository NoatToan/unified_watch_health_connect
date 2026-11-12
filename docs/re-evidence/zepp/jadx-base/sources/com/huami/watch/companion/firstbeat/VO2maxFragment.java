package com.huami.watch.companion.firstbeat;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.huami.watch.companion.R;
import com.huami.watch.companion.dataflow.FirstbeatData;
import com.huami.watch.companion.ui.view.PagerSlidingTabStrip;
import com.huami.watch.companion.util.NumberFormatter;
import com.huami.watch.dataflow.model.firstbeat.bean.VO2maxDataItem;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.DensityUtil;
import com.huami.watch.util.Rx;
import com.huami.watch.util.TimeUtil;

/* JADX INFO: loaded from: classes16.dex */
public class VO2maxFragment extends BaseFirstbeatFragment {
    private SparseArray<View> a = new SparseArray<>();

    public class a extends FragmentPagerAdapter {
        public final /* synthetic */ String[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FragmentManager fragmentManager, String[] strArr) {
            super(fragmentManager);
            this.a = strArr;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            return this.a.length;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            VO2maxChartFragment vO2maxChartFragment = new VO2maxChartFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("sport_type", 1);
            int i2 = i + 1;
            if (i2 == 1) {
                bundle.putInt("mode", 0);
            } else if (i2 == 2) {
                bundle.putInt("mode", 1);
            } else if (i2 == 3) {
                bundle.putInt("mode", 2);
            }
            vO2maxChartFragment.setArguments(bundle);
            return vO2maxChartFragment;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i) {
            return this.a[i];
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ VO2maxView b;

        public class a implements Runnable {
            public final /* synthetic */ int a;
            public final /* synthetic */ int[] b;

            public a(int i, int[] iArr) {
                this.a = i;
                this.b = iArr;
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0033  */
            @Override // java.lang.Runnable
            public void run() {
                String[] stringArray = VO2maxFragment.this.getResources().getStringArray(R.array.vo2_max_level_status);
                int i = this.a;
                if (i < 1 || i > 7) {
                    b.this.b.getVo2MaxLevelTv().setVisibility(4);
                    b bVar = b.this;
                    bVar.b.setVo2MaxLevel(VO2maxFragment.this.getString(R.string.empty_value));
                } else {
                    b bVar2 = b.this;
                    if (bVar2.a >= 0) {
                        bVar2.b.getVo2MaxLevelTv().setVisibility(0);
                        b.this.b.setVo2MaxLevel(stringArray[this.a - 1]);
                    } else {
                        b.this.b.getVo2MaxLevelTv().setVisibility(4);
                        b bVar3 = b.this;
                        bVar3.b.setVo2MaxLevel(VO2maxFragment.this.getString(R.string.empty_value));
                    }
                }
                int[] iArr = this.b;
                if (iArr == null || iArr[1] - iArr[0] == 0) {
                    return;
                }
                b bVar4 = b.this;
                bVar4.b.setPercent((bVar4.a - iArr[0]) / (iArr[1] - iArr[0]));
            }
        }

        public b(int i, VO2maxView vO2maxView) {
            this.a = i;
            this.b = vO2maxView;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rx.mainThread(new a(FirstBeatUtil.getFitnessLevelByVO2max(this.a), FirstBeatUtil.getFitnessBoundary()));
        }
    }

    private void c(VO2maxView vO2maxView, int i, String str) {
        vO2maxView.setVo2MaxValue(i);
        vO2maxView.setUpdateTime(TimeUtil.formatDateTime(DateDay.from(str).timeInMillis(), "MM-dd"));
        Rx.io(new b(i, vO2maxView)).safeSubscribe();
    }

    private void d(VO2maxDataItem vO2maxDataItem) {
        if (vO2maxDataItem == null || vO2maxDataItem.getVo2maxRun() == -1.0f) {
            return;
        }
        c((VO2maxView) this.a.get(1), (int) NumberFormatter.format(vO2maxDataItem.getVo2maxRun(), 0, 1), vO2maxDataItem.getDate());
    }

    @Override // com.huami.watch.companion.firstbeat.BaseFirstbeatFragment
    public int getLayout() {
        return R.layout.layout_vo2max;
    }

    @Override // com.huami.watch.companion.firstbeat.BaseFirstbeatFragment
    public void initView(View view) {
        VO2maxView vO2maxView = (VO2maxView) view.findViewById(R.id.view_run_vo2max);
        NoScrollViewPager noScrollViewPager = (NoScrollViewPager) view.findViewById(R.id.view_pager);
        PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) view.findViewById(R.id.indicator);
        noScrollViewPager.setAdapter(new a(getChildFragmentManager(), new String[]{getString(R.string.mode_day), getString(R.string.mode_week), getString(R.string.mode_month)}));
        pagerSlidingTabStrip.setViewPager(noScrollViewPager);
        noScrollViewPager.setPagingEnabled(false);
        noScrollViewPager.setOffscreenPageLimit(3);
        new LinearLayout.LayoutParams(-1, -2).setMargins(0, 0, 0, (int) DensityUtil.dpToPx(getContext(), 10.0f));
        this.a.put(1, vO2maxView);
        updateTips();
        TextView textView = (TextView) view.findViewById(R.id.jp_hint_text);
        Util util = Util.INSTANCE;
        if (!util.isJapanese()) {
            textView.setVisibility(8);
        } else {
            textView.setText(util.onlySupportSomeDevices());
            textView.setVisibility(0);
        }
    }

    @Override // com.huami.watch.companion.firstbeat.BaseFirstbeatFragment
    public boolean isExistData() {
        return FirstbeatData.existVO2MaxData(1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        d(VO2maxHelper.INSTANCE.getLatest());
    }

    @Override // com.huami.watch.companion.firstbeat.BaseFirstbeatFragment
    public void updateTips() {
    }
}
