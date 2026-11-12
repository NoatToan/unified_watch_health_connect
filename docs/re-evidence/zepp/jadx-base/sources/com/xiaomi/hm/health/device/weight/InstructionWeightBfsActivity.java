package com.xiaomi.hm.health.device.weight;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huami.devicex.R;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.view.indicator.PageIndicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes20.dex */
public class InstructionWeightBfsActivity extends BaseTitleActivity {
    private static final String A = "extra_source";
    private ArrayList<Fragment> x;
    private ArrayList<View> y = new ArrayList<>();
    private HMDeviceSource z = null;

    public static class InstructionWeightBasePage extends Fragment {
        public void initWeightInfo(View view, WeightInfo weightInfo) {
            ((TextView) view.findViewById(R.id.instruction_weight_title)).setText(weightInfo.a);
            ((TextView) view.findViewById(R.id.instruction_weight_tips1)).setText(weightInfo.b);
            ((TextView) view.findViewById(R.id.instruction_weight_tips2)).setText(weightInfo.c);
        }
    }

    public static class InstructionWeightPage2 extends InstructionWeightBasePage {
        public void initView(View view) {
            initWeightInfo(view, new WeightInfo(getActivity(), R.string.play_weight_bfs_page2_title, R.string.instruction_weight_tips1_6, R.string.instruction_weight_tips2_6));
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View viewInflate = layoutInflater.inflate(R.layout.layout_scale_text_desc, viewGroup, false);
            initView(viewInflate);
            return viewInflate;
        }
    }

    public static class InstructionWeightPage3 extends InstructionWeightBasePage {
        public void initView(View view) {
            initWeightInfo(view, new WeightInfo(getActivity(), R.string.instruction_weight_title_3, R.string.play_weight_bfs_page3_tips, 0));
        }

        @Override // androidx.fragment.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View viewInflate = layoutInflater.inflate(R.layout.layout_scale_text_desc, viewGroup, false);
            initView(viewInflate);
            return viewInflate;
        }
    }

    public static class InstructionWeightPage4 extends InstructionWeightBasePage {
        public void initView(View view) {
            initWeightInfo(view, new WeightInfo(getActivity(), R.string.instruction_weight_title_4, R.string.play_weight_bfs_page4_tips1, R.string.play_weight_bfs_page4_tips2));
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View viewInflate = layoutInflater.inflate(R.layout.layout_scale_text_desc, viewGroup, false);
            initView(viewInflate);
            return viewInflate;
        }
    }

    public static class InstructionWeightPage5 extends InstructionWeightBasePage {
        public void initView(View view) {
            initWeightInfo(view, new WeightInfo(getActivity(), R.string.instruction_weight_title_5, R.string.instruction_weight_tips1_5, R.string.instruction_weight_tips2_5));
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View viewInflate = layoutInflater.inflate(R.layout.layout_scale_text_desc, viewGroup, false);
            initView(viewInflate);
            return viewInflate;
        }
    }

    public static class InstructionWeightPageOneFoot extends InstructionWeightBasePage {
        public void initView(View view) {
            initWeightInfo(view, new WeightInfo(getActivity(), R.string.one_foot_standing, R.string.one_foot_instrcut_1, R.string.one_foot_attention));
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View viewInflate = layoutInflater.inflate(R.layout.layout_scale_text_desc, viewGroup, false);
            initView(viewInflate);
            return viewInflate;
        }
    }

    public static class InstructionWeightPageSmallThing extends InstructionWeightBasePage {
        public void initView(View view) {
            initWeightInfo(view, new WeightInfo(getActivity(), R.string.small_thing_weight, R.string.small_thing_weight_instruct, R.string.small_thing_weight_instruct_1));
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View viewInflate = layoutInflater.inflate(R.layout.layout_scale_text_desc, viewGroup, false);
            initView(viewInflate);
            return viewInflate;
        }
    }

    public static class WeightInfo {
        public String a;
        public String b;
        public String c;

        public WeightInfo(Context context, int i, int i2, int i3) {
            this.a = context.getString(i);
            this.b = i2 == 0 ? "" : context.getString(i2);
            this.c = i3 != 0 ? context.getString(i3) : "";
        }
    }

    public class a implements ViewPager.OnPageChangeListener {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            InstructionWeightBfsActivity.this.n(i);
        }
    }

    public class b extends FragmentPagerAdapter {
        public b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            return InstructionWeightBfsActivity.this.x.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            return (Fragment) InstructionWeightBfsActivity.this.x.get(i);
        }
    }

    private void initViews() {
        this.y.add(findViewById(R.id.page_2_layout));
        this.y.add(findViewById(HMWeightUtils.isHideUnitJin() ? R.id.page_3_layout_no_jin : R.id.page_3_layout));
        HMDeviceSource hMDeviceSource = this.z;
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.WEIGHT_BFS;
        if (hMDeviceSource == hMDeviceSource2) {
            this.y.add(findViewById(R.id.one_foot_page));
            this.y.add(findViewById(R.id.small_w_page));
        }
        this.y.add(findViewById(R.id.page_low_battery));
        this.y.add(findViewById(R.id.page_over_max));
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        PageIndicator pageIndicator = (PageIndicator) findViewById(R.id.indicator);
        ArrayList<Fragment> arrayList = new ArrayList<>(4);
        this.x = arrayList;
        arrayList.add(Fragment.instantiate(this, InstructionWeightPage2.class.getName()));
        this.x.add(Fragment.instantiate(this, InstructionWeightPage3.class.getName()));
        if (this.z == hMDeviceSource2) {
            this.x.add(Fragment.instantiate(this, InstructionWeightPageOneFoot.class.getName()));
            this.x.add(Fragment.instantiate(this, InstructionWeightPageSmallThing.class.getName()));
        }
        this.x.add(Fragment.instantiate(this, InstructionWeightPage4.class.getName()));
        this.x.add(Fragment.instantiate(this, InstructionWeightPage5.class.getName()));
        viewPager.setAdapter(new b(getSupportFragmentManager()));
        viewPager.setOffscreenPageLimit(5);
        pageIndicator.setViewPager(viewPager);
        pageIndicator.setOnPageChangeListener(new a());
        n(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(int i) {
        for (int i2 = 0; i2 < this.y.size(); i2++) {
            if (i2 != i) {
                this.y.get(i2).setVisibility(4);
            } else {
                this.y.get(i2).setVisibility(0);
            }
        }
    }

    public static void startMe(Context context, HMDeviceSource hMDeviceSource) {
        Intent intent = new Intent(context, (Class<?>) InstructionWeightBfsActivity.class);
        intent.putExtra(A, hMDeviceSource);
        context.startActivity(intent);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_instruction_weight_bfs);
        BaseTitleActivity.STYLE style = BaseTitleActivity.STYLE.BACK_AND_TITLE;
        int i = R.color.weight_mon_bg;
        int color = ContextCompat.getColor(this, i);
        int i2 = R.string.how_to_play_body_fat_scale;
        setStyle(style, color, getString(i2));
        if (getIntent().hasExtra(A)) {
            this.z = (HMDeviceSource) getIntent().getSerializableExtra(A);
        } else {
            this.z = BFCallback.getHMDeviceManager().getBoundDeviceSource(HMDeviceType.WEIGHT);
        }
        if (this.z == HMDeviceSource.WEIGHT_BFS) {
            setStyle(style, ContextCompat.getColor(this, i));
        } else {
            setStyle(style, ContextCompat.getColor(this, i), getString(i2));
        }
        initViews();
    }
}
