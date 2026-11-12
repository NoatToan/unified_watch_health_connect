package com.xiaomi.hm.health.device.watchskinnew.ui;

import android.content.ComponentCallbacks;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.lib.view.ViewUtils;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.watchskinnew.DialLoader;
import com.xiaomi.hm.health.device.watchskinnew.ui.HMDialListActivity;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0002H\u0014R\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/ui/HMDialListActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "", "Landroidx/fragment/app/Fragment;", "x", "[Landroidx/fragment/app/Fragment;", "fragments", "Landroidx/viewpager/widget/ViewPager;", "y", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "Landroid/widget/TextView;", "z", "Landroid/widget/TextView;", "selectedTitle", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "diyTitle", "", "B", LogUtil.I, "selectedColor", "C", "normalColor", "Lcom/huami/devicex/manager/DeviceManagerApi;", LogUtil.D, "Lkotlin/Lazy;", "o", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "E", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "<init>", "()V", "a", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMDialListActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private TextView diyTitle;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private int selectedColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private int normalColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource deviceSource;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Fragment[] fragments = new Fragment[2];

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private ViewPager viewPager;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private TextView selectedTitle;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"com/xiaomi/hm/health/device/watchskinnew/ui/HMDialListActivity$a", "Landroidx/fragment/app/FragmentPagerAdapter;", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "getCount", "", "a", "Z", "supportDiy", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Lcom/xiaomi/hm/health/device/watchskinnew/ui/HMDialListActivity;Landroidx/fragment/app/FragmentManager;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class a extends FragmentPagerAdapter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean supportDiy;

        public a(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.supportDiy = HMDialListActivityKt.supportDiy(HMDialListActivity.this.deviceSource);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getA() {
            return this.supportDiy ? 2 : 1;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NotNull
        public Fragment getItem(int position) {
            if (position == 0) {
                HMDialListFragment hMDialListFragmentNewInstance = HMDialListFragment.INSTANCE.newInstance(0);
                HMDialListActivity.this.fragments[0] = hMDialListFragmentNewInstance;
                return hMDialListFragmentNewInstance;
            }
            HMDialListFragment hMDialListFragmentNewInstance2 = HMDialListFragment.INSTANCE.newInstance(1);
            HMDialListActivity.this.fragments[1] = hMDialListFragmentNewInstance2;
            return hMDialListFragmentNewInstance2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HMDialListActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.watchskinnew.ui.HMDialListActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        this.deviceSource = o().getBoundDeviceSource(HMDeviceType.MILI);
    }

    private final void initView() {
        int i = R.color.s1;
        this.selectedColor = ContextCompat.getColor(this, i);
        this.normalColor = ContextCompat.getColor(this, R.color.s2);
        this.viewPager = (ViewPager) findViewById(R.id.view_pager);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.title_container);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, ViewUtils.getStatusBarHeight(this), 0, 0);
        viewGroup.setLayoutParams(layoutParams2);
        TextView textView = (TextView) findViewById(R.id.online_watch_face_title);
        if (ConfigHelperKt.hasFeature(this.deviceSource, Feature.WATCH_SOURCE_S)) {
            textView.setText(R.string.online_watch_skin_title);
        } else {
            textView.setText(R.string.online_watch_skin_title_band);
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: du2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMDialListActivity.p(this.a, view);
            }
        });
        Unit unit = Unit.INSTANCE;
        this.selectedTitle = textView;
        TextView textView2 = (TextView) findViewById(R.id.local_watch_face_title);
        textView2.setText(R.string.watch_skin_diy_band);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: cu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMDialListActivity.q(this.a, view);
            }
        });
        this.diyTitle = textView2;
        Objects.requireNonNull(textView2);
        ViewExKt.setVisible(textView2, HMDialListActivityKt.supportDiy(this.deviceSource));
        ViewPager viewPager = this.viewPager;
        Objects.requireNonNull(viewPager);
        viewPager.setAdapter(new a(getSupportFragmentManager()));
        ViewPager viewPager2 = this.viewPager;
        Objects.requireNonNull(viewPager2);
        viewPager2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.xiaomi.hm.health.device.watchskinnew.ui.HMDialListActivity.initView.4
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                if (position == 0) {
                    TextView textView3 = HMDialListActivity.this.selectedTitle;
                    Objects.requireNonNull(textView3);
                    textView3.setTextColor(HMDialListActivity.this.selectedColor);
                    TextView textView4 = HMDialListActivity.this.diyTitle;
                    Objects.requireNonNull(textView4);
                    textView4.setTextColor(HMDialListActivity.this.normalColor);
                    return;
                }
                TextView textView5 = HMDialListActivity.this.selectedTitle;
                Objects.requireNonNull(textView5);
                textView5.setTextColor(HMDialListActivity.this.normalColor);
                TextView textView6 = HMDialListActivity.this.diyTitle;
                Objects.requireNonNull(textView6);
                textView6.setTextColor(HMDialListActivity.this.selectedColor);
            }
        });
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.ic_arrow_back_20_2x);
        DrawableCompat.setTint(drawable, ContextCompat.getColor(this, i));
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.back_img);
        appCompatImageView.setImageDrawable(drawable);
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: eu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMDialListActivity.r(this.a, view);
            }
        });
    }

    private final DeviceManagerApi o() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(HMDialListActivity hMDialListActivity, View view) {
        ViewPager viewPager = hMDialListActivity.viewPager;
        Objects.requireNonNull(viewPager);
        viewPager.setCurrentItem(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(HMDialListActivity hMDialListActivity, View view) {
        ViewPager viewPager = hMDialListActivity.viewPager;
        Objects.requireNonNull(viewPager);
        viewPager.setCurrentItem(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(HMDialListActivity hMDialListActivity, View view) {
        hMDialListActivity.finish();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_skin_list);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.s4), !RainbowUtils.isDarkMode(this));
        initView();
        DialLoader.Companion companion = DialLoader.INSTANCE;
        companion.getInstance().setCurrentPage(1);
        companion.getInstance().reset();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        DialLoader companion = DialLoader.INSTANCE.getInstance();
        if (companion.getCurrentPage() == 1) {
            companion.clear();
        }
    }
}
