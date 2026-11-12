package com.xiaomi.hm.health.smalltool;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.tools.analytics.DbUtils;
import com.huami.training.ui.fit.MiDongFitFragment;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.baseui.BaseTitleBarExtKt;
import com.xiaomi.hm.health.baseui.NewViewPager;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.running.SportTabFragment;
import com.xiaomi.hm.health.smalltool.model.Tool;
import com.xiaomi.hm.health.smalltool.util.ToolUtil;
import com.xiaomi.hm.health.view.pager.CacheFragmentStatePagerAdapter;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/ToolNavigateActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "", "type", "", GoogleApiAvailabilityLight.b, "Lcom/xiaomi/hm/health/smalltool/model/Tool;", "l", "Landroidx/fragment/app/Fragment;", "m", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onRightFuncClicked", "x", LogUtil.I, "Lcom/xiaomi/hm/health/baseui/NewViewPager;", "y", "Lkotlin/Lazy;", "o", "()Lcom/xiaomi/hm/health/baseui/NewViewPager;", "viewPager", "<init>", "()V", "Companion", "PagerAdapter", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ToolNavigateActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int TYPE_FIT = 4;
    public static final int TYPE_SPORT_BIKE = 3;
    public static final int TYPE_SPORT_OUTDOOR = 1;
    public static final int TYPE_SPORT_STRIDES = 2;
    public static final int TYPE_SPORT_TREADMILL = 5;

    @NotNull
    private static final String z = "pageType";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int type = 1;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewPager = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/ToolNavigateActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "type", "", "to", "", "ARG_PAGE_TYPE", "Ljava/lang/String;", "TYPE_FIT", LogUtil.I, "TYPE_SPORT_BIKE", "TYPE_SPORT_OUTDOOR", "TYPE_SPORT_STRIDES", "TYPE_SPORT_TREADMILL", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void to(@NotNull Context context, int type) {
            Intent intent = new Intent(context, (Class<?>) ToolNavigateActivity.class);
            intent.putExtra(ToolNavigateActivity.z, type);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0002H\u0016J \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/ToolNavigateActivity$PagerAdapter;", "Lcom/xiaomi/hm/health/view/pager/CacheFragmentStatePagerAdapter;", "", "position", "Landroidx/fragment/app/Fragment;", "createItem", "getCount", "Landroid/view/ViewGroup;", "container", "", "any", "", "setPrimaryItem", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Lcom/xiaomi/hm/health/smalltool/ToolNavigateActivity;Landroidx/fragment/app/FragmentManager;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public final class PagerAdapter extends CacheFragmentStatePagerAdapter {
        public PagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // com.xiaomi.hm.health.view.pager.CacheFragmentStatePagerAdapter
        @NotNull
        public Fragment createItem(int position) {
            ToolNavigateActivity toolNavigateActivity = ToolNavigateActivity.this;
            return toolNavigateActivity.m(toolNavigateActivity.type);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getA() {
            return 1;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void setPrimaryItem(@NotNull ViewGroup container, int position, @NotNull Object any) {
            super.setPrimaryItem(container, position, any);
            Fragment fragment = (Fragment) any;
            if (fragment.getView() != null) {
                if (!(fragment instanceof SportTabFragment) || ((SportTabFragment) fragment).getSportType() == 25) {
                    NewViewPager newViewPagerO = ToolNavigateActivity.this.o();
                    if (newViewPagerO == null) {
                        return;
                    }
                    newViewPagerO.setCurrentView(fragment.getView());
                    return;
                }
                NewViewPager newViewPagerO2 = ToolNavigateActivity.this.o();
                if (newViewPagerO2 == null) {
                    return;
                }
                newViewPagerO2.disableMeasureByChild();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/baseui/NewViewPager;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<NewViewPager> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NewViewPager getA() {
            return (NewViewPager) ToolNavigateActivity.this.findViewById(R.id.view_pager);
        }
    }

    private final void initView() {
        int intExtra = getIntent().getIntExtra(z, 1);
        this.type = intExtra;
        BaseTitleBarExtKt.setTitleBar(this, n(intExtra), null, R.color.s36, BaseTitleActivity.STYLE.BACK_AND_TITLE);
        NewViewPager newViewPagerO = o();
        if (newViewPagerO == null) {
            return;
        }
        newViewPagerO.setAdapter(new PagerAdapter(getSupportFragmentManager()));
    }

    private final Tool l() {
        int i = this.type;
        if (i == 2) {
            return Tool.SPORT_WALK;
        }
        if (i != 3) {
            return i != 4 ? Tool.SPORT_RUN : Tool.TRAINING_FITNESS;
        }
        return Tool.SPORT_BIKE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Fragment m(int type) {
        boolean z2 = (Language.isSimplifiedChinese() && HMLoginManager.isInChina()) ? false : true;
        if (type == 2) {
            return SportTabFragment.INSTANCE.newInstance(z2, 6);
        }
        if (type == 3) {
            return SportTabFragment.INSTANCE.newInstance(z2, 9);
        }
        if (type != 4) {
            return type != 5 ? SportTabFragment.INSTANCE.newInstance(z2, 1) : SportTabFragment.INSTANCE.newInstance(z2, 25);
        }
        return new MiDongFitFragment();
    }

    private final String n(int type) {
        if (type != 1) {
            if (type == 2) {
                return getString(R.string.small_tool_item_sport_walk);
            }
            if (type == 3) {
                return getString(R.string.small_tool_item_sport_bike);
            }
            if (type == 4) {
                return getString(R.string.small_tool_item_training_fitness);
            }
            if (type != 5) {
                return "";
            }
        }
        return getString(R.string.small_tool_item_sport_run);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NewViewPager o() {
        return (NewViewPager) this.viewPager.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_sport);
        initView();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onRightFuncClicked() {
        ToolUtil.addToMyTools(l());
        CustomToast.showShort(getApplicationContext(), R.string.tool_add_success);
        showRightFunc(false);
    }
}
