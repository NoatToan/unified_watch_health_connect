package com.xiaomi.fitness.medal.medallist;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fitness.about.utils.MedalUrlsKt;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.medal.medallist.MedalListActivity;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.webview.healthwebview.HealthWebViewActivity;
import defpackage.ecf;
import defpackage.fv1;
import defpackage.iri;
import defpackage.j0j;
import defpackage.nji;
import defpackage.o7h;
import defpackage.pui;
import defpackage.rbd;
import defpackage.zbf;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00014B\u0007¢\u0006\u0004\b3\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0006J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0019\u0010\u0006R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010.\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0014\u00102\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010-¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/medal/medallist/MedalListActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/medal/medallist/MedalViewModel;", "Lzbf;", "", "addSystemBarHeightPadding", "()V", "setLayoutManager", "requestDataFromNetwork", "checkNetwork", "adaptToDarkBackground", "pullMedalListDataWithoutNew", "Landroid/os/Bundle;", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "savedInstanceState", "onRestoreInstanceState", "onCreate", LifecycleConstantKt.ON_RESUME, "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", LifecycleConstantKt.ON_START, LifecycleConstantKt.ON_STOP, "Lcom/airbnb/lottie/LottieAnimationView;", "caidaiLottie", "Lcom/airbnb/lottie/LottieAnimationView;", "getCaidaiLottie", "()Lcom/airbnb/lottie/LottieAnimationView;", "setCaidaiLottie", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "", "lastPosition", "I", "lastOffset", "Lcom/xiaomi/fitness/medal/medallist/MedalListAdapter;", "adapter", "Lcom/xiaomi/fitness/medal/medallist/MedalListAdapter;", "", "startTime", "J", "endTime", "getColCountPerRow", "()I", "colCountPerRow", "getViewModelId", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMedalListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedalListActivity.kt\ncom/xiaomi/fitness/medal/medallist/MedalListActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,250:1\n157#2,8:251\n*S KotlinDebug\n*F\n+ 1 MedalListActivity.kt\ncom/xiaomi/fitness/medal/medallist/MedalListActivity\n*L\n150#1:251,8\n*E\n"})
public final class MedalListActivity extends Hilt_MedalListActivity<MedalViewModel, zbf> {

    @NotNull
    public static final String KEY_ADAPTER_ACTIVE_PK_MEDAL_EXPAND = "key_active_pk_medal_expand";

    @NotNull
    public static final String TAG = "MedalListActivity";

    @Nullable
    private MedalListAdapter adapter;
    public LottieAnimationView caidaiLottie;
    private long endTime;
    private int lastOffset;
    private int lastPosition;
    private long startTime;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ zbf access$getMBinding(MedalListActivity medalListActivity) {
        return (zbf) medalListActivity.getMBinding();
    }

    private final void adaptToDarkBackground() {
        setActionBarDisplayable(false);
        setTitleBackground(nji.f27981a);
        UIUtils uIUtils = UIUtils.INSTANCE;
        uIUtils.setNavigationBarColor(this, nji.d);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        uIUtils.setLightStatusBar(window, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addSystemBarHeightPadding() {
        c.H0(((zbf) getMBinding()).getRoot(), new o7h() { // from class: yef
            @Override // defpackage.o7h
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
                return MedalListActivity.addSystemBarHeightPadding$lambda$4$lambda$3(this.f40099a, view, windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final WindowInsetsCompat addSystemBarHeightPadding$lambda$4$lambda$3(MedalListActivity this$0, View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        rbd rbdVarF = insets.f(WindowInsetsCompat.m.h() | WindowInsetsCompat.m.b());
        Intrinsics.checkNotNullExpressionValue(rbdVarF, "getInsets(...)");
        int i = rbdVarF.f32379b;
        View root = ((zbf) this$0.getMBinding()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setPadding(root.getPaddingLeft(), i, root.getPaddingRight(), root.getPaddingBottom());
        return WindowInsetsCompat.f2098b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkNetwork() {
        if (NetworkUtils.isNetworkConnected(this)) {
            RecyclerView recyclerView = ((zbf) getMBinding()).F;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            ViewExtKt.visible(recyclerView);
            RelativeLayout noNetwork = ((zbf) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(noNetwork, "noNetwork");
            ViewExtKt.gone(noNetwork);
            requestDataFromNetwork();
            return;
        }
        Logger.d(TAG, "checkNetwork no network");
        RecyclerView recyclerView2 = ((zbf) getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
        ViewExtKt.gone(recyclerView2);
        RelativeLayout noNetwork2 = ((zbf) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(noNetwork2, "noNetwork");
        ViewExtKt.visible(noNetwork2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getColCountPerRow() {
        Application application;
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            return 4;
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        return (uIUtils.isTablet() && (application = getApplication()) != null && uIUtils.isLandscape(application)) ? 5 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(MedalListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lambda$onCreate$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(MedalListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "startWebView url is " + MedalUrlsKt.getMedalWallHtmlUrl());
        Intent intent = new Intent();
        String medalWallHtmlUrl = MedalUrlsKt.getMedalWallHtmlUrl();
        Logger.d(TAG, "pushUrl is " + medalWallHtmlUrl);
        intent.setClass(this$0, HealthWebViewActivity.class);
        intent.putExtra("data4", this$0.getString(j0j.A));
        intent.putExtra(WebViewActivity.IS_LIGHT_STATUS_BAR, false);
        intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, true);
        intent.putExtra(WebViewActivity.SHOW_SINGLE_TITLE_BAR, true);
        intent.putExtra(WebViewActivity.SHOW_TITLE_COLOR, nji.f27981a);
        intent.putExtra("URL", medalWallHtmlUrl);
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void pullMedalListDataWithoutNew() {
        ((MedalViewModel) getMViewModel()).getMedalListWithoutNew();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestDataFromNetwork() {
        pullMedalListDataWithoutNew();
        ((MedalViewModel) getMViewModel()).getGetData().observe(this, new MedalListActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: cff
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalListActivity.requestDataFromNetwork$lambda$6(this.f5279a, (ecf) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestDataFromNetwork$lambda$6(final MedalListActivity this$0, ecf ecfVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "medalCategoryList == " + ecfVar);
        Intrinsics.checkNotNull(ecfVar);
        for (ecf.a aVar : ecfVar.f16485a) {
            Logger.d(TAG, "getData categoryId=" + aVar.c + " category=" + aVar.f16488b + " medalCountInThisCategory=" + aVar.f16487a.size());
            Iterator<ecf.a.C0923a> it = aVar.f16487a.iterator();
            while (it.hasNext()) {
                Logger.d(TAG, "getData medalData=" + it.next());
            }
        }
        MedalListAdapter medalListAdapter = this$0.adapter;
        if (medalListAdapter != null) {
            medalListAdapter.updateFreshData(ecfVar);
        }
        RecyclerView.o layoutManager = ((zbf) this$0.getMBinding()).F.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        ((GridLayoutManager) layoutManager).scrollToPositionWithOffset(this$0.lastPosition, this$0.lastOffset);
        this$0.getCaidaiLottie().setVisibility(0);
        this$0.getCaidaiLottie().postDelayed(new Runnable() { // from class: dff
            @Override // java.lang.Runnable
            public final void run() {
                MedalListActivity.requestDataFromNetwork$lambda$6$lambda$5(this.f15480a);
            }
        }, 200L);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestDataFromNetwork$lambda$6$lambda$5(MedalListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getCaidaiLottie().w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLayoutManager() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, getColCountPerRow());
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.medal.medallist.MedalListActivity.setLayoutManager.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                MedalListAdapter medalListAdapter;
                MedalListAdapter medalListAdapter2;
                MedalListAdapter medalListAdapter3 = MedalListActivity.this.adapter;
                if ((medalListAdapter3 == null || medalListAdapter3.getItemViewType(position) != 1) && (((medalListAdapter = MedalListActivity.this.adapter) == null || medalListAdapter.getItemViewType(position) != 3) && ((medalListAdapter2 = MedalListActivity.this.adapter) == null || medalListAdapter2.getItemViewType(position) != 4))) {
                    return 1;
                }
                return MedalListActivity.this.getColCountPerRow();
            }
        });
        ((zbf) getMBinding()).F.setLayoutManager(gridLayoutManager);
    }

    @NotNull
    public final LottieAnimationView getCaidaiLottie() {
        LottieAnimationView lottieAnimationView = this.caidaiLottie;
        if (lottieAnimationView != null) {
            return lottieAnimationView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("caidaiLottie");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return pui.c;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return fv1.f18275a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        setLayoutManager();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.medal.medallist.Hilt_MedalListActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getResources().getString(j0j.z));
        adaptToDarkBackground();
        ((zbf) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: zef
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalListActivity.onCreate$lambda$0(this.f41192a, view);
            }
        });
        ((zbf) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: aff
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalListActivity.onCreate$lambda$1(this.f949a, view);
            }
        });
        int i = j0j.A;
        IActionBar.DefaultImpls.setEndTextView$default(this, 0, i, getString(i), ExtUtilsKt.getSp(Float.valueOf(6.0f)), new View.OnClickListener() { // from class: bff
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalListActivity.onCreate$lambda$2(view);
            }
        }, 1, null);
        setCaidaiLottie((LottieAnimationView) getLayoutInflater().inflate(pui.q, (ViewGroup) null, true).findViewById(iri.h));
        getCaidaiLottie().i(new AnimatorListenerAdapter() { // from class: com.xiaomi.fitness.medal.medallist.MedalListActivity.onCreate.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                MedalListActivity.this.getCaidaiLottie().setVisibility(8);
            }
        });
        int colCountPerRow = getColCountPerRow();
        MedalListAdapter medalListAdapter = this.adapter;
        this.adapter = new MedalListAdapter(null, colCountPerRow, medalListAdapter != null ? medalListAdapter.getActivePkMedalInitExpandStatus() : false);
        setLayoutManager();
        ((zbf) getMBinding()).F.setAdapter(this.adapter);
        ((zbf) getMBinding()).F.addOnScrollListener(new RecyclerView.s() { // from class: com.xiaomi.fitness.medal.medallist.MedalListActivity.onCreate.5
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, newState);
                RecyclerView.o layoutManager = MedalListActivity.access$getMBinding(MedalListActivity.this).F.getLayoutManager();
                View childAt = layoutManager != null ? layoutManager.getChildAt(0) : null;
                if (childAt != null) {
                    MedalListActivity.this.lastOffset = childAt.getTop();
                    MedalListActivity medalListActivity = MedalListActivity.this;
                    RecyclerView.o layoutManager2 = MedalListActivity.access$getMBinding(medalListActivity).F.getLayoutManager();
                    medalListActivity.lastPosition = layoutManager2 != null ? layoutManager2.getPosition(childAt) : 0;
                }
            }
        });
        addSystemBarHeightPadding();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, android.app.Activity
    public void onRestoreInstanceState(@NotNull Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        MedalListAdapter medalListAdapter = this.adapter;
        Logger.d(TAG, "onRestoreInstanceState KEY_ADAPTER_ACTIVE_PK_MEDAL_EXPAND=" + (medalListAdapter != null ? Boolean.valueOf(medalListAdapter.getActivePkMedalInitExpandStatus()) : null));
        MedalListAdapter medalListAdapter2 = this.adapter;
        if (medalListAdapter2 != null) {
            medalListAdapter2.setActivePkMedalInitExpandStatus(savedInstanceState.getBoolean(KEY_ADAPTER_ACTIVE_PK_MEDAL_EXPAND, false));
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        checkNetwork();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        MedalListAdapter medalListAdapter = this.adapter;
        Logger.d(TAG, "onSaveInstanceState KEY_ADAPTER_ACTIVE_PK_MEDAL_EXPAND=" + (medalListAdapter != null ? medalListAdapter.getActivePkMedalInitExpandStatus() : false));
        MedalListAdapter medalListAdapter2 = this.adapter;
        outState.putBoolean(KEY_ADAPTER_ACTIVE_PK_MEDAL_EXPAND, medalListAdapter2 != null ? medalListAdapter2.getActivePkMedalInitExpandStatus() : false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.startTime = System.currentTimeMillis();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.endTime = jCurrentTimeMillis;
        Map<String, ? extends Object> mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("name", "medal_home_page"), TuplesKt.to("duration_sec", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - this.startTime))), TuplesKt.to("tip", "56.16.1.1.22914"));
        Logger.d(TAG, "MedalListActivity browsingStats oneTrackMap=" + mapMapOf);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", mapMapOf);
    }

    public final void setCaidaiLottie(@NotNull LottieAnimationView lottieAnimationView) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "<set-?>");
        this.caidaiLottie = lottieAnimationView;
    }
}
