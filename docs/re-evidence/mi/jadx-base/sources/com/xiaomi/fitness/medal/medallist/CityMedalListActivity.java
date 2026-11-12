package com.xiaomi.fitness.medal.medallist;

import android.app.Application;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Window;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.medal.medaldetail.MedalDetailActivityKt;
import defpackage.ecf;
import defpackage.fv1;
import defpackage.nji;
import defpackage.pui;
import defpackage.pz9;
import defpackage.ubf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010!\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001c¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/medal/medallist/CityMedalListActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/medal/medallist/MedalViewModel;", "Lubf;", "", "adaptToDarkBackground", "()V", "loadBundle", "", "isFoldableDeviceAndExpandedState", "()Z", "setLayoutManager", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lecf$a;", "cityMedalCategory", "Lecf$a;", "", "cityMedalTitle", "Ljava/lang/String;", "", "getColCountPerRow", "()I", "colCountPerRow", "getViewModelId", "viewModelId", "getLayoutId", "layoutId", "<init>", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCityMedalListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CityMedalListActivity.kt\ncom/xiaomi/fitness/medal/medallist/CityMedalListActivity\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,82:1\n29#2:83\n*S KotlinDebug\n*F\n+ 1 CityMedalListActivity.kt\ncom/xiaomi/fitness/medal/medallist/CityMedalListActivity\n*L\n52#1:83\n*E\n"})
public final class CityMedalListActivity extends Hilt_CityMedalListActivity<MedalViewModel, ubf> {
    private ecf.a cityMedalCategory;
    private String cityMedalTitle;

    private final void adaptToDarkBackground() {
        setTitleBackground(nji.f27981a);
        UIUtils uIUtils = UIUtils.INSTANCE;
        uIUtils.setNavigationBarColor(this, nji.d);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        uIUtils.setLightStatusBar(window, false);
    }

    private final int getColCountPerRow() {
        Application application;
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            return 4;
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        return (uIUtils.isTablet() && (application = getApplication()) != null && uIUtils.isLandscape(application)) ? 5 : 3;
    }

    private final boolean isFoldableDeviceAndExpandedState() {
        return SystemProperties.INSTANCE.isFoldDisplay() && !pz9.b(this);
    }

    private final void loadBundle() {
        String string;
        Bundle extras = getIntent().getExtras();
        if (extras == null || (string = extras.getString(MedalDetailActivityKt.KEY_PARAM_CITY_MEDAL_CATEGORY)) == null) {
            return;
        }
        ecf.a aVar = (ecf.a) new Gson().fromJson(string, new TypeToken<ecf.a>() { // from class: com.xiaomi.fitness.medal.medallist.CityMedalListActivity$loadBundle$$inlined$fromJson$1
        }.getType());
        this.cityMedalCategory = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cityMedalCategory");
            aVar = null;
        }
        this.cityMedalTitle = aVar.f16488b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLayoutManager() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, getColCountPerRow());
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.medal.medallist.CityMedalListActivity.setLayoutManager.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return 1;
            }
        });
        ((ubf) getMBinding()).A.setLayoutManager(gridLayoutManager);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return pui.f30800a;
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
    @Override // com.xiaomi.fitness.medal.medallist.Hilt_CityMedalListActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adaptToDarkBackground();
        loadBundle();
        String str = this.cityMedalTitle;
        ecf.a aVar = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cityMedalTitle");
            str = null;
        }
        setTitle(str);
        isFoldableDeviceAndExpandedState();
        ecf.a aVar2 = this.cityMedalCategory;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cityMedalCategory");
        } else {
            aVar = aVar2;
        }
        List<ecf.a.C0923a> data = aVar.f16487a;
        Intrinsics.checkNotNullExpressionValue(data, "data");
        CityMedalListAdapter cityMedalListAdapter = new CityMedalListAdapter(data);
        setLayoutManager();
        ((ubf) getMBinding()).A.setAdapter(cityMedalListAdapter);
    }
}
