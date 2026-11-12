package com.huami.applet.jslog;

import android.content.Intent;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.huami.applet.AppletConfig;
import com.huami.applet.R;
import com.huami.applet.databinding.AppletActivityJsLogConsoleBinding;
import com.huami.applet.jslog.JsLogConsoleActivity;
import com.huami.bluetooth.profile.channel.module.lumberjack.LaumberjackModule;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\n\u001a\u00020\u0002H\u0014J\b\u0010\f\u001a\u0004\u0018\u00010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R&\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u000b0%j\b\u0012\u0004\u0012\u00020\u000b`&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00065"}, d2 = {"Lcom/huami/applet/jslog/JsLogConsoleActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initData", "Landroid/content/Intent;", "intent", "onNewIntent", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "", "getAppId", "Lcom/huami/applet/databinding/AppletActivityJsLogConsoleBinding;", "x", "Lcom/huami/applet/databinding/AppletActivityJsLogConsoleBinding;", "binding", "Lcom/google/android/material/tabs/TabLayout;", "y", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Landroidx/viewpager2/widget/ViewPager2;", "z", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Lcom/huami/applet/jslog/FmPagerAdapter;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/huami/applet/jslog/FmPagerAdapter;", "fmPagerAdapter", "Lcom/google/android/material/tabs/TabLayoutMediator;", "B", "Lcom/google/android/material/tabs/TabLayoutMediator;", "mediator", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "C", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "callback", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", LogUtil.D, "Ljava/util/ArrayList;", "tabsList", "", "Landroidx/fragment/app/Fragment;", "E", "Ljava/util/List;", "fragmentList", "F", "Ljava/lang/String;", "appId", "<init>", "()V", "Companion", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class JsLogConsoleActivity extends BaseTitleActivity {

    @NotNull
    public static final String APP_ID_KEY = "appId";

    @NotNull
    private static final String G = "JS App Log";

    @NotNull
    public static final String TITLE_KEY = "title";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private FmPagerAdapter fmPagerAdapter;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private TabLayoutMediator mediator;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private ViewPager2.OnPageChangeCallback callback;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private ArrayList<String> tabsList;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private List<? extends Fragment> fragmentList;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    private String appId;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private AppletActivityJsLogConsoleBinding binding;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private TabLayout tabLayout;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private ViewPager2 viewPager;

    private final void initData() {
        this.appId = getIntent().getStringExtra("appId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(JsLogConsoleActivity jsLogConsoleActivity, TabLayout.Tab tab, int i) {
        ArrayList<String> arrayList = jsLogConsoleActivity.tabsList;
        Objects.requireNonNull(arrayList);
        tab.setText(arrayList.get(i));
    }

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App);
        super.onCreate(savedInstanceState);
        AppletActivityJsLogConsoleBinding appletActivityJsLogConsoleBindingInflate = AppletActivityJsLogConsoleBinding.inflate(getLayoutInflater());
        this.binding = appletActivityJsLogConsoleBindingInflate;
        Objects.requireNonNull(appletActivityJsLogConsoleBindingInflate);
        setContentView(appletActivityJsLogConsoleBindingInflate.getRoot());
        initData();
        String stringExtra = getIntent().getStringExtra("title");
        if (stringExtra == null) {
            stringExtra = G;
        }
        JsLogConsoleActivityKt.setUnifyTitleStyle$default(this, stringExtra, null, 2, null);
        HMBaseDevice hmBaseDevice = AppletConfig.INSTANCE.getHmBaseDevice();
        if (hmBaseDevice == null ? false : hmBaseDevice.supportModule(LaumberjackModule.class)) {
            this.tabsList = CollectionsKt__CollectionsKt.arrayListOf(getResources().getString(R.string.applet_app_log), getResources().getString(R.string.applet_device_log));
            this.fragmentList = CollectionsKt__CollectionsKt.arrayListOf(new AppLogFragment(), new DeviceLogFragment());
        } else {
            this.tabsList = CollectionsKt__CollectionsKt.arrayListOf(getResources().getString(R.string.applet_app_log));
            this.fragmentList = CollectionsKt__CollectionsKt.arrayListOf(new AppLogFragment());
        }
        AppletActivityJsLogConsoleBinding appletActivityJsLogConsoleBinding = this.binding;
        Objects.requireNonNull(appletActivityJsLogConsoleBinding);
        this.tabLayout = appletActivityJsLogConsoleBinding.appletLogTabLayout;
        AppletActivityJsLogConsoleBinding appletActivityJsLogConsoleBinding2 = this.binding;
        Objects.requireNonNull(appletActivityJsLogConsoleBinding2);
        this.viewPager = appletActivityJsLogConsoleBinding2.appletLogViewpager;
        List<? extends Fragment> list = this.fragmentList;
        Objects.requireNonNull(list);
        this.fmPagerAdapter = new FmPagerAdapter(list, getSupportFragmentManager(), getLifecycle());
        TabLayout tabLayout = this.tabLayout;
        Objects.requireNonNull(tabLayout);
        ViewPager2 viewPager2 = this.viewPager;
        Objects.requireNonNull(viewPager2);
        this.mediator = new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() { // from class: bk4
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                JsLogConsoleActivity.m(this.a, tab, i);
            }
        });
        this.callback = new ViewPager2.OnPageChangeCallback() { // from class: com.huami.applet.jslog.JsLogConsoleActivity.onCreate.2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
            }
        };
        ViewPager2 viewPager3 = this.viewPager;
        Objects.requireNonNull(viewPager3);
        FmPagerAdapter fmPagerAdapter = this.fmPagerAdapter;
        Objects.requireNonNull(fmPagerAdapter);
        viewPager3.setAdapter(fmPagerAdapter);
        ViewPager2 viewPager4 = this.viewPager;
        Objects.requireNonNull(viewPager4);
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.callback;
        Objects.requireNonNull(onPageChangeCallback);
        viewPager4.registerOnPageChangeCallback(onPageChangeCallback);
        TabLayoutMediator tabLayoutMediator = this.mediator;
        Objects.requireNonNull(tabLayoutMediator);
        tabLayoutMediator.attach();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        TabLayoutMediator tabLayoutMediator = this.mediator;
        Objects.requireNonNull(tabLayoutMediator);
        tabLayoutMediator.detach();
        ViewPager2 viewPager2 = this.viewPager;
        Objects.requireNonNull(viewPager2);
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.callback;
        Objects.requireNonNull(onPageChangeCallback);
        viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }
}
