package com.xiaomi.fitness.devicesettings.common.language;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mi.fitness.checkupdate.export.CheckUpdateManager;
import com.xiaomi.fitness.devicesettings.common.language.LanguageSettingFragment;
import defpackage.eui;
import defpackage.qh6;
import defpackage.wzi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0007¢\u0006\u0004\b\"\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/language/LanguageSettingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/common/language/LanguageSettingViewModel;", "Lqh6;", "Lcom/xiaomi/fitness/devicesettings/common/language/LanguagesModel;", "languagesModel", "", "selectLanguage", "(Lcom/xiaomi/fitness/devicesettings/common/language/LanguagesModel;)V", "syncWorldClock", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "dataList", "Ljava/util/List;", "Lcom/xiaomi/fitness/devicesettings/common/language/LanguagesAdapter;", "languagesAdapter", "Lcom/xiaomi/fitness/devicesettings/common/language/LanguagesAdapter;", "Lcom/mi/fitness/checkupdate/export/CheckUpdateManager;", "checkUpdateManager", "Lcom/mi/fitness/checkupdate/export/CheckUpdateManager;", "getCheckUpdateManager", "()Lcom/mi/fitness/checkupdate/export/CheckUpdateManager;", "setCheckUpdateManager", "(Lcom/mi/fitness/checkupdate/export/CheckUpdateManager;)V", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLanguageSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageSettingFragment.kt\ncom/xiaomi/fitness/devicesettings/common/language/LanguageSettingFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1863#2,2:86\n1863#2,2:88\n*S KotlinDebug\n*F\n+ 1 LanguageSettingFragment.kt\ncom/xiaomi/fitness/devicesettings/common/language/LanguageSettingFragment\n*L\n57#1:86,2\n69#1:88,2\n*E\n"})
public final class LanguageSettingFragment extends Hilt_LanguageSettingFragment<LanguageSettingViewModel, qh6> {

    @NotNull
    public static final String sName = "sName";

    @NotNull
    public static final String sType = "sType";
    public static final int sTypeHuami = 0;
    public CheckUpdateManager checkUpdateManager;

    @NotNull
    private List<LanguagesModel> dataList = new ArrayList();

    @Nullable
    private LanguagesAdapter languagesAdapter;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(LanguageSettingFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        LanguagesAdapter languagesAdapter = this$0.languagesAdapter;
        if (languagesAdapter != null) {
            Intrinsics.checkNotNull(list);
            languagesAdapter.updateDataList(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void selectLanguage(final LanguagesModel languagesModel) {
        languagesModel.setSelected(true);
        for (LanguagesModel languagesModel2 : this.dataList) {
            languagesModel2.setSelected(Intrinsics.areEqual(languagesModel, languagesModel2));
        }
        LanguagesAdapter languagesAdapter = this.languagesAdapter;
        if (languagesAdapter != null) {
            languagesAdapter.notifyDataSetChanged();
        }
        ((LanguageSettingViewModel) getMViewModel()).setLanguages(languagesModel, new Function1() { // from class: q2e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LanguageSettingFragment.selectLanguage$lambda$3(languagesModel, this, ((Boolean) obj).booleanValue());
            }
        });
        getCheckUpdateManager().checkUpdate(new Function1() { // from class: r2e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LanguageSettingFragment.selectLanguage$lambda$4(this.f32110a, (Serializable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectLanguage$lambda$3(LanguagesModel languagesModel, LanguageSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(languagesModel, "$languagesModel");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            Intent intent = new Intent();
            intent.putExtra(sName, languagesModel.getName());
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                mActivity.setResult(-1, intent);
            }
            this$0.syncWorldClock();
        } else {
            languagesModel.setSelected(false);
            for (LanguagesModel languagesModel2 : this$0.dataList) {
                languagesModel2.setSelected(Intrinsics.areEqual(languagesModel, languagesModel2));
            }
            LanguagesAdapter languagesAdapter = this$0.languagesAdapter;
            if (languagesAdapter != null) {
                languagesAdapter.notifyDataSetChanged();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectLanguage$lambda$4(LanguageSettingFragment this$0, Serializable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.getCheckUpdateManager().handleCheckUpdateResult(this$0.getActivity(), it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void syncWorldClock() {
        ((LanguageSettingViewModel) getMViewModel()).syncWorldClock();
    }

    @NotNull
    public final CheckUpdateManager getCheckUpdateManager() {
        CheckUpdateManager checkUpdateManager = this.checkUpdateManager;
        if (checkUpdateManager != null) {
            return checkUpdateManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("checkUpdateManager");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.n5);
        ((qh6) getMBinding()).A.setLayoutManager(new LinearLayoutManager(getMActivity()));
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        this.languagesAdapter = new LanguagesAdapter(mActivity, this.dataList, new LanguagesAdapter.OnCityItemClickListener() { // from class: com.xiaomi.fitness.devicesettings.common.language.LanguageSettingFragment.onViewCreated.1
            @Override // com.xiaomi.fitness.devicesettings.common.language.LanguagesAdapter.OnCityItemClickListener
            public void onItemSelect(LanguagesModel languagesModel) {
                Intrinsics.checkNotNullParameter(languagesModel, "languagesModel");
                LanguageSettingFragment.this.selectLanguage(languagesModel);
            }
        });
        ((qh6) getMBinding()).A.setAdapter(this.languagesAdapter);
        String string = getString(wzi.Qa);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        showLoading(string, 0, true);
        ((LanguageSettingViewModel) getMViewModel()).readLanguagesSettingAndLoadData();
        ((LanguageSettingViewModel) getMViewModel()).getLanguageList().observe(getViewLifecycleOwner(), new Observer() { // from class: s2e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                LanguageSettingFragment.onViewCreated$lambda$0(this.f33206a, (List) obj);
            }
        });
    }

    public final void setCheckUpdateManager(@NotNull CheckUpdateManager checkUpdateManager) {
        Intrinsics.checkNotNullParameter(checkUpdateManager, "<set-?>");
        this.checkUpdateManager = checkUpdateManager;
    }
}
