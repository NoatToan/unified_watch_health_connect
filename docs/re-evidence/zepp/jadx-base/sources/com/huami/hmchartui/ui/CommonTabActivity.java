package com.huami.hmchartui.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.amap.api.mapcore.util.hl;
import com.huami.hmchartui.R;
import com.huami.hmchartui.ui.CommonTabActivity;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0002J\u0014\u0010\t\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0004J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004H&J\b\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H&J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u0016\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019R\"\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u001c8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/huami/hmchartui/ui/CommonTabActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "g", "", SleepAnalysisFragment.TIME_MODE, hl.k, "Landroidx/fragment/app/FragmentTransaction;", "f", "l", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "resId", "setMenuIcon", "type", "onActionClick", "", "getTitleText", "timeType", "Lcom/huami/hmchartui/ui/CommonTabFragment;", "createTabFragment", "Landroidx/fragment/app/Fragment;", "createNoSlideFragment", "onTabSelectChanged", "", "time", "setCurrentTabPosition", "Landroid/util/SparseArray;", "a", "Landroid/util/SparseArray;", "getFragments", "()Landroid/util/SparseArray;", "fragments", "<init>", "()V", "hmchartui_release"}, k = 1, mv = {1, 5, 1})
public abstract class CommonTabActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SparseArray<Fragment> fragments = new SparseArray<>();

    private final FragmentTransaction f(FragmentTransaction fragmentTransaction) {
        SparseArray<Fragment> sparseArray = this.fragments;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            fragmentTransaction.add(R.id.frame_container, sparseArray.valueAt(i));
        }
        return fragmentTransaction;
    }

    private final void g() {
        this.fragments.clear();
        this.fragments.put(16, createTabFragment(16));
        this.fragments.put(17, createTabFragment(17));
        this.fragments.put(18, createTabFragment(18));
        this.fragments.put(19, createTabFragment(19));
        l(f(getSupportFragmentManager().beginTransaction()), 16).commit();
        ((RadioGroup) findViewById(R.id.tab_group)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: jx0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                CommonTabActivity.h(this.a, radioGroup, i);
            }
        });
        Fragment fragmentCreateNoSlideFragment = createNoSlideFragment();
        if (fragmentCreateNoSlideFragment == null) {
            return;
        }
        getSupportFragmentManager().beginTransaction().add(R.id.frame_container_no_slide, fragmentCreateNoSlideFragment).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(CommonTabActivity commonTabActivity, RadioGroup radioGroup, int i) {
        if (i == R.id.tab_day) {
            commonTabActivity.k(16);
            commonTabActivity.onTabSelectChanged(16);
            return;
        }
        if (i == R.id.tab_week) {
            commonTabActivity.k(17);
            commonTabActivity.onTabSelectChanged(17);
        } else if (i == R.id.tab_month) {
            commonTabActivity.k(18);
            commonTabActivity.onTabSelectChanged(18);
        } else if (i == R.id.tab_year) {
            commonTabActivity.k(19);
            commonTabActivity.onTabSelectChanged(19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(CommonTabActivity commonTabActivity, View view) {
        commonTabActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(CommonTabActivity commonTabActivity, View view, int i) {
        commonTabActivity.onActionClick(i);
    }

    private final void k(int timeMode) {
        l(getSupportFragmentManager().beginTransaction(), timeMode).commit();
    }

    private final FragmentTransaction l(FragmentTransaction fragmentTransaction, int i) {
        SparseArray<Fragment> sparseArray = this.fragments;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            Fragment fragmentValueAt = sparseArray.valueAt(i2);
            if (iKeyAt != i) {
                fragmentTransaction.hide(fragmentValueAt);
            } else {
                fragmentTransaction.show(fragmentValueAt);
            }
        }
        return fragmentTransaction;
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public abstract Fragment createNoSlideFragment();

    @NotNull
    public abstract CommonTabFragment createTabFragment(int timeType);

    @NotNull
    public final SparseArray<Fragment> getFragments() {
        return this.fragments;
    }

    @NotNull
    public abstract CharSequence getTitleText();

    public abstract void onActionClick(int type);

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_tab);
        g();
        int i = R.id.rainbow_bar;
        ((RainbowTitleBar) findViewById(i)).setTitle(getTitleText());
        ((RainbowTitleBar) findViewById(i)).setNavigationOnClickListener(new View.OnClickListener() { // from class: ix0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonTabActivity.i(this.a, view);
            }
        });
        ((RainbowTitleBar) findViewById(i)).setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: kx0
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i2) {
                CommonTabActivity.j(this.a, view, i2);
            }
        });
    }

    public void onTabSelectChanged(int timeType) {
    }

    public final void setCurrentTabPosition(int timeType, long time) {
        try {
            switch (timeType) {
                case 16:
                    ((RadioButton) findViewById(R.id.tab_day)).performClick();
                    break;
                case 17:
                    ((RadioButton) findViewById(R.id.tab_week)).performClick();
                    break;
                case 18:
                    ((RadioButton) findViewById(R.id.tab_month)).performClick();
                    break;
                case 19:
                    ((RadioButton) findViewById(R.id.tab_year)).performClick();
                    break;
            }
            Fragment fragment = this.fragments.get(timeType);
            if (fragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.huami.hmchartui.ui.CommonTabFragment");
            }
            ((CommonTabFragment) fragment).setCurrentItem(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void setMenuIcon(@DrawableRes int resId) {
        if (resId == 0) {
            ((RainbowTitleBar) findViewById(R.id.rainbow_bar)).setMenuIcon((Drawable) null);
        } else {
            ((RainbowTitleBar) findViewById(R.id.rainbow_bar)).setMenuIcon(resId);
        }
    }
}
