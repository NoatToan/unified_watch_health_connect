package com.xiaomi.hm.health.bodyfat.activity;

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
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.databinding.ActivityInstructionScale2Binding;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.view.CirclePageIndicator;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002H\u0002J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0014J\u0006\u0010\u000e\u001a\u00020\u0004R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/InstructScale2Activity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "position", "", GoogleApiAvailabilityLight.b, "layout", "title", InstructionWeightBasePage.KEY_TIPS_1, InstructionWeightBasePage.KEY_TIPS_2, "Landroid/os/Bundle;", "l", "savedInstanceState", "onCreate", "initView", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityInstructionScale2Binding;", "x", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityInstructionScale2Binding;", "binding", "", "Landroid/view/View;", "y", "[Landroid/view/View;", "instructImageContent", "Landroidx/fragment/app/Fragment;", "z", "[Landroidx/fragment/app/Fragment;", "instructTextPages", "<init>", "()V", "a", "InstructionWeightBasePage", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class InstructScale2Activity extends BaseTitleActivity {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private ActivityInstructionScale2Binding binding;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private View[] instructImageContent;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private Fragment[] instructTextPages;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/InstructScale2Activity$InstructionWeightBasePage;", "Landroidx/fragment/app/Fragment;", "", "resId", "", "a", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "b", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class InstructionWeightBasePage extends Fragment {

        @NotNull
        public static final String KEY_LAYOUT = "layout";

        @NotNull
        public static final String KEY_TIPS_1 = "tips1";

        @NotNull
        public static final String KEY_TIPS_2 = "tips2";

        @NotNull
        public static final String KEY_TITLE = "title";

        private final String a(int resId) {
            String string = resId == 0 ? "" : getString(resId);
            System.out.println((Object) string);
            return string;
        }

        private final void b(View view) {
            TextView textView = (TextView) view.findViewById(R.id.instruction_weight_title);
            Bundle arguments = getArguments();
            textView.setText(a(arguments == null ? 0 : arguments.getInt("title")));
            TextView textView2 = (TextView) view.findViewById(R.id.instruction_weight_tips1);
            Bundle arguments2 = getArguments();
            textView2.setText(a(arguments2 == null ? 0 : arguments2.getInt(KEY_TIPS_1)));
            TextView textView3 = (TextView) view.findViewById(R.id.instruction_weight_tips2);
            Bundle arguments3 = getArguments();
            textView3.setText(a(arguments3 != null ? arguments3.getInt(KEY_TIPS_2) : 0));
        }

        public void _$_clearFindViewByIdCache() {
        }

        @Override // androidx.fragment.app.Fragment
        @Nullable
        public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            Bundle arguments = getArguments();
            View viewInflate = inflater.inflate(arguments == null ? 0 : arguments.getInt("layout"), container, false);
            if (viewInflate != null) {
                b(viewInflate);
            }
            return viewInflate;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/xiaomi/hm/health/bodyfat/activity/InstructScale2Activity$a", "Landroidx/fragment/app/FragmentPagerAdapter;", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "getCount", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Lcom/xiaomi/hm/health/bodyfat/activity/InstructScale2Activity;Landroidx/fragment/app/FragmentManager;)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public final class a extends FragmentPagerAdapter {
        public a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            Fragment[] fragmentArr = InstructScale2Activity.this.instructTextPages;
            Objects.requireNonNull(fragmentArr);
            return fragmentArr.length;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NotNull
        public Fragment getItem(int position) {
            Fragment[] fragmentArr = InstructScale2Activity.this.instructTextPages;
            Objects.requireNonNull(fragmentArr);
            return fragmentArr[position];
        }
    }

    private final Bundle l(int layout, int title, int tips1, int tips2) {
        Bundle bundle = new Bundle();
        bundle.putInt("layout", layout);
        bundle.putInt("title", title);
        bundle.putInt(InstructionWeightBasePage.KEY_TIPS_1, tips1);
        bundle.putInt(InstructionWeightBasePage.KEY_TIPS_2, tips2);
        return bundle;
    }

    public static /* synthetic */ Bundle m(InstructScale2Activity instructScale2Activity, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return instructScale2Activity.l(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(int position) {
        View[] viewArr = this.instructImageContent;
        Objects.requireNonNull(viewArr);
        int length = viewArr.length - 1;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            View[] viewArr2 = this.instructImageContent;
            Objects.requireNonNull(viewArr2);
            viewArr2[i].setVisibility(i == position ? 0 : 4);
            if (i2 > length) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void initView() {
        this.instructImageContent = new View[]{findViewById(R.id.weight_instrcut), findViewById(R.id.weight_unit_setting), findViewById(R.id.one_foot_page), findViewById(R.id.small_w_page), findViewById(R.id.page_low_battery), findViewById(R.id.page_over_max)};
        String name = InstructionWeightBasePage.class.getName();
        int i = R.layout.layout_scale_text_desc;
        this.instructTextPages = new Fragment[]{Fragment.instantiate(this, name, l(i, R.string.instruction_weight_title_6, R.string.instruction_weight1_tips1_6, R.string.instruction_weight1_tips2_6)), Fragment.instantiate(this, InstructionWeightBasePage.class.getName(), m(this, i, R.string.instruction_set_unit_title, R.string.instruction_set_unit, 0, 8, null)), Fragment.instantiate(this, InstructionWeightBasePage.class.getName(), m(this, i, R.string.one_foot_standing, R.string.one_foot_instrcut_1, 0, 8, null)), Fragment.instantiate(this, InstructionWeightBasePage.class.getName(), l(i, R.string.small_thing_weight, R.string.small_thing_weight_instruct, R.string.small_thing_weight_instruct_1)), Fragment.instantiate(this, InstructionWeightBasePage.class.getName(), l(i, R.string.instruction_low_battery_title, R.string.instruction_low_battery_tips1, R.string.instruction_low_battery_tips2)), Fragment.instantiate(this, InstructionWeightBasePage.class.getName(), l(i, R.string.instruction_overload_title, R.string.instruction_overload_tips1, R.string.instruction_overload_tips2))};
        a aVar = new a(getSupportFragmentManager());
        ActivityInstructionScale2Binding activityInstructionScale2Binding = this.binding;
        Objects.requireNonNull(activityInstructionScale2Binding);
        activityInstructionScale2Binding.viewPager.setAdapter(aVar);
        ActivityInstructionScale2Binding activityInstructionScale2Binding2 = this.binding;
        Objects.requireNonNull(activityInstructionScale2Binding2);
        activityInstructionScale2Binding2.viewPager.setOffscreenPageLimit(5);
        ActivityInstructionScale2Binding activityInstructionScale2Binding3 = this.binding;
        Objects.requireNonNull(activityInstructionScale2Binding3);
        CirclePageIndicator circlePageIndicator = activityInstructionScale2Binding3.indicator;
        Objects.requireNonNull(activityInstructionScale2Binding3);
        circlePageIndicator.setViewPager(activityInstructionScale2Binding3.viewPager);
        ActivityInstructionScale2Binding activityInstructionScale2Binding4 = this.binding;
        Objects.requireNonNull(activityInstructionScale2Binding4);
        activityInstructionScale2Binding4.indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.xiaomi.hm.health.bodyfat.activity.InstructScale2Activity.initView.1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                InstructScale2Activity.this.n(position);
            }
        });
        n(0);
        if (HMWeightUtils.isHideUnitJin()) {
            ActivityInstructionScale2Binding activityInstructionScale2Binding5 = this.binding;
            Objects.requireNonNull(activityInstructionScale2Binding5);
            activityInstructionScale2Binding5.weightUnitSetting.unitTvJin.setVisibility(8);
            ActivityInstructionScale2Binding activityInstructionScale2Binding6 = this.binding;
            Objects.requireNonNull(activityInstructionScale2Binding6);
            activityInstructionScale2Binding6.weightUnitSetting.dividerBelowYb.setVisibility(8);
            return;
        }
        ActivityInstructionScale2Binding activityInstructionScale2Binding7 = this.binding;
        Objects.requireNonNull(activityInstructionScale2Binding7);
        activityInstructionScale2Binding7.weightUnitSetting.unitTvJin.setVisibility(0);
        ActivityInstructionScale2Binding activityInstructionScale2Binding8 = this.binding;
        Objects.requireNonNull(activityInstructionScale2Binding8);
        activityInstructionScale2Binding8.weightUnitSetting.dividerBelowYb.setVisibility(0);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(savedInstanceState);
        ActivityInstructionScale2Binding activityInstructionScale2BindingInflate = ActivityInstructionScale2Binding.inflate(getLayoutInflater());
        this.binding = activityInstructionScale2BindingInflate;
        Objects.requireNonNull(activityInstructionScale2BindingInflate);
        setContentView(activityInstructionScale2BindingInflate.getRoot());
        BFTitleStyleKt.setTitleStyle$default(this, null, null, null, ContextCompat.getColor(this, R.color.weight_mon_bg), false, 23, null);
        initView();
    }
}
