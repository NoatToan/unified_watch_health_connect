package com.xiaomi.fitness.login.region;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.gms.actions.SearchIntents;
import com.xiaomi.fitness.account.api.bean.CountryInfo;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.region.RegionSelectListActivity;
import com.xiaomi.fitness.login.widget.QuickIndexView;
import defpackage.av6;
import defpackage.dv1;
import defpackage.g0j;
import defpackage.mui;
import defpackage.qz5;
import defpackage.uqe;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Route(path = RegionExtKt.REGION_SELECT_ACTIVITY_PATH)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001,B\u0007¢\u0006\u0004\b+\u0010\u0015J-\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/login/region/RegionSelectListActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/login/region/RegionSelectListViewModel;", "Luqe;", "Landroidx/databinding/f;", "Lcom/xiaomi/fitness/account/api/bean/CountryInfo;", "countryItems", "", SearchIntents.EXTRA_QUERY, "filter", "(Landroidx/databinding/f;Ljava/lang/String;)Landroidx/databinding/f;", "item", "", "showSwitchDialog", "(Lcom/xiaomi/fitness/account/api/bean/CountryInfo;)V", "onChangeOkClick", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "()V", "onBackPressed", "", "isGuide", "Z", "currentCountryItem", "Lcom/xiaomi/fitness/account/api/bean/CountryInfo;", "countryItemList", "Landroidx/databinding/f;", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "mAccountManager", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "getMAccountManager", "()Lcom/xiaomi/fitness/account/manager/AccountManager;", "setMAccountManager", "(Lcom/xiaomi/fitness/account/manager/AccountManager;)V", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RegionSelectListActivity extends Hilt_RegionSelectListActivity<RegionSelectListViewModel, uqe> {

    @NotNull
    public static final String COUNTRY_INFO = "country_info";

    @NotNull
    public static final String CURRENT_COUNTRY_ITEM = "current_country_item";

    @Nullable
    private f<CountryInfo> countryItemList;

    @Nullable
    private CountryInfo currentCountryItem;
    private boolean isGuide;
    public AccountManager mAccountManager;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ uqe access$getMBinding(RegionSelectListActivity regionSelectListActivity) {
        return (uqe) regionSelectListActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ RegionSelectListViewModel access$getMViewModel(RegionSelectListActivity regionSelectListActivity) {
        return (RegionSelectListViewModel) regionSelectListActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f<CountryInfo> filter(f<CountryInfo> countryItems, String query) {
        String upperCase = query.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        ObservableArrayList observableArrayList = new ObservableArrayList();
        for (CountryInfo countryInfo : countryItems) {
            String pinyin = countryInfo.getPinyin();
            String country = countryInfo.getCountry();
            int length = upperCase.length();
            int iIndexOf$default = 0;
            for (int i = 0; i < length; i++) {
                char cCharAt = upperCase.charAt(i);
                if (country != null) {
                    iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) country, cCharAt, 0, false, 6, (Object) null);
                }
                if (iIndexOf$default == -1 && pinyin != null) {
                    iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) pinyin, cCharAt, 0, false, 6, (Object) null);
                }
                if (iIndexOf$default == -1) {
                    break;
                }
            }
            if (iIndexOf$default > -1) {
                observableArrayList.add(countryInfo);
            }
        }
        return observableArrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onChangeOkClick(CountryInfo item) {
        ((RegionSelectListViewModel) getMViewModel()).switchRegion(item, new WeakReference<>(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSwitchDialog(final CountryInfo item) {
        final qz5 qz5VarC = qz5.c(new DialogInterface.OnClickListener() { // from class: ick
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RegionSelectListActivity.showSwitchDialog$lambda$0(this.f20999a, item, dialogInterface, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(qz5VarC, "wrap(...)");
        CommonDialog commonDialogCreate = new CommonDialog.c("repeat").setDialogTitle(g0j.N).setDialogDescription(g0j.R).setNegativeText(g0j.f18429a).setPositiveText(g0j.M).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.login.region.RegionSelectListActivity.showSwitchDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    dialog.dismiss();
                } else {
                    if (which != -1) {
                        return;
                    }
                    RegionSelectListActivity.this.onChangeOkClick(item);
                    Dialog dialog2 = (Dialog) dialog;
                    qz5VarC.b(dialog2);
                    dialog2.dismiss();
                }
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                super.onDialogMultiClick(dialogName, which, isChecked);
            }
        }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSwitchDialog$lambda$0(RegionSelectListActivity this$0, CountryInfo item, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.onChangeOkClick(item);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return mui.h;
    }

    @NotNull
    public final AccountManager getMAccountManager() {
        AccountManager accountManager = this.mAccountManager;
        if (accountManager != null) {
            return accountManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccountManager");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return dv1.d;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.login.region.Hilt_RegionSelectListActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.isGuide = getIntent().getBooleanExtra(RegionExtKt.GUID_SHOW, true);
        this.currentCountryItem = (CountryInfo) getIntent().getParcelableExtra(CURRENT_COUNTRY_ITEM);
        ((RegionSelectListViewModel) getMViewModel()).setCurrentCountryItem(this.currentCountryItem);
        if (this.isGuide) {
            setTitle(g0j.O);
            ((uqe) getMBinding()).A.setVisibility(8);
            CountryInfo countryInfo = this.currentCountryItem;
            if ((countryInfo != null ? countryInfo.getName() : null) != null) {
                ((uqe) getMBinding()).E.setVisibility(0);
                Object[] objArr = new Object[2];
                CountryInfo countryInfo2 = this.currentCountryItem;
                objArr[0] = countryInfo2 != null ? countryInfo2.getCountry() : null;
                objArr[1] = getString(g0j.P);
                String str = String.format("%s %s", objArr);
                ((uqe) getMBinding()).E.setText(str);
                ((uqe) getMBinding()).E.setFocusable(1);
                ((uqe) getMBinding()).E.setContentDescription(str);
            } else {
                ((uqe) getMBinding()).E.setVisibility(8);
            }
        } else {
            setTitle(g0j.h);
            ((uqe) getMBinding()).A.setVisibility(0);
            ((uqe) getMBinding()).E.setVisibility(8);
            ((uqe) getMBinding()).D.setVisibility(8);
        }
        if ("zh".equals(Locale.getDefault().getLanguage()) || "en".equals(Locale.getDefault().getLanguage())) {
            ((uqe) getMBinding()).B.setVisibility(0);
        } else {
            ((uqe) getMBinding()).B.setVisibility(8);
        }
        ((RegionSelectListViewModel) getMViewModel()).getAdapter().setOnItemClickListener(new Function3<CountryInfo, Integer, View, Unit>() { // from class: com.xiaomi.fitness.login.region.RegionSelectListActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(CountryInfo countryInfo3, Integer num, View view) {
                invoke(countryInfo3, num.intValue(), view);
                return Unit.INSTANCE;
            }

            public void invoke(CountryInfo p1, int position, View itemView) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                if (!RegionSelectListActivity.this.isGuide) {
                    RegionSelectListActivity.this.showSwitchDialog(p1);
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra(RegionSelectListActivity.COUNTRY_INFO, p1);
                RegionSelectListActivity.this.setResult(100, intent);
                RegionSelectListActivity.this.finish();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.countryItemList = ((RegionSelectListViewModel) getMViewModel()).getAllList();
        ((RegionSelectListViewModel) getMViewModel()).initLetterInDexs(this.countryItemList);
        ((uqe) getMBinding()).B.setOnLetterSelectListener(new QuickIndexView.a() { // from class: com.xiaomi.fitness.login.region.RegionSelectListActivity.onResume.1
            @Override // com.xiaomi.fitness.login.widget.QuickIndexView.a
            public void onSelect(String letter) {
                Integer numValueOf = letter != null ? Integer.valueOf(RegionSelectListActivity.access$getMViewModel(RegionSelectListActivity.this).getLetterPosition(letter)) : null;
                if (numValueOf != null) {
                    RegionSelectListActivity.access$getMBinding(RegionSelectListActivity.this).F.scrollToPosition(numValueOf.intValue());
                    RecyclerView.o layoutManager = RegionSelectListActivity.access$getMBinding(RegionSelectListActivity.this).F.getLayoutManager();
                    Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(numValueOf.intValue(), 0);
                }
            }

            @Override // com.xiaomi.fitness.login.widget.QuickIndexView.a
            public void onSelectOver() {
            }
        });
        ((uqe) getMBinding()).C.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.login.region.RegionSelectListActivity.onResume.2
            private String lastText = "";
            private String text;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                Boolean boolValueOf;
                String str;
                f<CountryInfo> fVarFilter;
                f<CountryInfo> fVarFilter2;
                Intrinsics.checkNotNullParameter(s, "s");
                this.text = s.toString();
                if (RegionSelectListActivity.this.countryItemList != null) {
                    f fVar = RegionSelectListActivity.this.countryItemList;
                    Intrinsics.checkNotNull(fVar);
                    if (fVar.size() > 0) {
                        String str2 = this.text;
                        if (str2 != null) {
                            boolValueOf = Boolean.valueOf(str2.length() == 0);
                        } else {
                            boolValueOf = null;
                        }
                        if (boolValueOf == Boolean.TRUE) {
                            RegionSelectListViewModel regionSelectListViewModelAccess$getMViewModel = RegionSelectListActivity.access$getMViewModel(RegionSelectListActivity.this);
                            f<CountryInfo> fVar2 = RegionSelectListActivity.this.countryItemList;
                            Intrinsics.checkNotNull(fVar2);
                            regionSelectListViewModelAccess$getMViewModel.closeFilter(fVar2);
                        } else {
                            String str3 = this.text;
                            if (str3 != null && str3.length() > 0 && (str = this.text) != null) {
                                RegionSelectListActivity regionSelectListActivity = RegionSelectListActivity.this;
                                if (str.length() > this.lastText.length()) {
                                    f<CountryInfo> currentList = RegionSelectListActivity.access$getMViewModel(regionSelectListActivity).getCurrentList();
                                    if (currentList != null && (fVarFilter2 = regionSelectListActivity.filter(currentList, str)) != null) {
                                        RegionSelectListActivity.access$getMViewModel(regionSelectListActivity).setFilter(fVarFilter2);
                                    }
                                } else {
                                    f fVar3 = regionSelectListActivity.countryItemList;
                                    if (fVar3 != null && (fVarFilter = regionSelectListActivity.filter(fVar3, str)) != null) {
                                        RegionSelectListActivity.access$getMViewModel(regionSelectListActivity).setFilter(fVarFilter);
                                    }
                                }
                            }
                        }
                    }
                }
                String str4 = this.text;
                if (str4 != null) {
                    this.lastText = str4;
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Intrinsics.checkNotNullParameter(s, "s");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Intrinsics.checkNotNullParameter(s, "s");
            }
        });
    }

    public final void setMAccountManager(@NotNull AccountManager accountManager) {
        Intrinsics.checkNotNullParameter(accountManager, "<set-?>");
        this.mAccountManager = accountManager;
    }
}
