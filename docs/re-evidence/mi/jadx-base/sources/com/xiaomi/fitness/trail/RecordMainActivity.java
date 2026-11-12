package com.xiaomi.fitness.trail;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fit.data.common.data.annotation.SportCategory;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fit.data.common.data.sport.SportCategoryData;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.trail.RecordMainActivity;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.trail.viewmodel.RecordMainVM;
import com.xiaomi.fitness.trail.widget.TypeSelector;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import defpackage.a4i;
import defpackage.bsi;
import defpackage.dih;
import defpackage.ivi;
import defpackage.o7h;
import defpackage.qv1;
import defpackage.qwi;
import defpackage.rbd;
import defpackage.tip;
import defpackage.top;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001:B\u0007¢\u0006\u0004\b9\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0019\u0010!\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b!\u0010\u001fR\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u00106R\u001a\u00107\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b8\u00106¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/trail/RecordMainActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/trail/viewmodel/RecordMainVM;", "Ltop;", "Lcom/google/android/material/tabs/TabLayout$d;", "", "addSystemBarHeightPadding", "()V", "onBaseDataOk", "", "category", "", "isSportPlugins", "(Ljava/lang/String;)Z", "showPopupMenu", "gotoAddRecordFragment", "selectCategory", "", "pos", "getTag", "(I)Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRestoreInstanceState", "Lcom/google/android/material/tabs/TabLayout$g;", FaceSchema.FACE_PAGE_TAB, "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$g;)V", "onTabUnselected", "onTabReselected", "", "Lcom/xiaomi/fit/data/common/data/sport/SportCategoryData;", "categoryList", "Ljava/util/List;", "Lcom/xiaomi/fitness/trail/widget/TypeSelector;", "typeSelector", "Lcom/xiaomi/fitness/trail/widget/TypeSelector;", "getTypeSelector", "()Lcom/xiaomi/fitness/trail/widget/TypeSelector;", "setTypeSelector", "(Lcom/xiaomi/fitness/trail/widget/TypeSelector;)V", "tabPosition", "I", "isNeverRecreated", "Z", "Landroidx/fragment/app/Fragment;", "curFragment", "Landroidx/fragment/app/Fragment;", "viewModelId", "getViewModelId", "()I", "layoutId", "getLayoutId", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRecordMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordMainActivity.kt\ncom/xiaomi/fitness/trail/RecordMainActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,203:1\n1#2:204\n157#3,8:205\n*S KotlinDebug\n*F\n+ 1 RecordMainActivity.kt\ncom/xiaomi/fitness/trail/RecordMainActivity\n*L\n81#1:205,8\n*E\n"})
public final class RecordMainActivity extends Hilt_RecordMainActivity<RecordMainVM, top> implements TabLayout.d {

    @NotNull
    public static final String TAG = "RecordMainActivity";
    private List<SportCategoryData> categoryList;

    @Nullable
    private Fragment curFragment;

    @Nullable
    private TypeSelector typeSelector;
    private int tabPosition = 1;
    private boolean isNeverRecreated = true;
    private final int viewModelId = qv1.f31871a;
    private final int layoutId = ivi.K1;

    /* JADX WARN: Multi-variable type inference failed */
    private final void addSystemBarHeightPadding() {
        c.H0(((top) getMBinding()).getRoot(), new o7h() { // from class: f8k
            @Override // defpackage.o7h
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
                return RecordMainActivity.addSystemBarHeightPadding$lambda$3$lambda$2(this.f17533a, view, windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final WindowInsetsCompat addSystemBarHeightPadding$lambda$3$lambda$2(RecordMainActivity this$0, View v, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        rbd rbdVarF = insets.f(WindowInsetsCompat.m.h() | WindowInsetsCompat.m.b());
        Intrinsics.checkNotNullExpressionValue(rbdVarF, "getInsets(...)");
        Logger.d(TAG, "addStatusBarHeightPadding statusBars top=" + rbdVarF.f32379b + " bottom=" + rbdVarF.d);
        int i = rbdVarF.f32379b;
        View root = ((top) this$0.getMBinding()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setPadding(root.getPaddingLeft(), i, root.getPaddingRight(), root.getPaddingBottom());
        return WindowInsetsCompat.f2098b;
    }

    private final String getTag(int pos) {
        if (pos == 1) {
            return SportDataTypeKt.DIMEN_MONTHLY;
        }
        if (pos != 2) {
            return pos != 3 ? SportDataTypeKt.DIMEN_WEEKLY : SportDataTypeKt.DIMEN_TOTAL;
        }
        return SportDataTypeKt.DIMEN_YEARLY;
    }

    private final void gotoAddRecordFragment() {
        FragmentParams fragmentParamsB = new FragmentParams.b().e(ChooseSportTypeFragment.class).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().f(this, fragmentParamsB, true);
    }

    private final boolean isSportPlugins(String category) {
        return Intrinsics.areEqual(category, "rope_skipping") || Intrinsics.areEqual(category, "dumbbell_training") || Intrinsics.areEqual(category, "abdwheel_training");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onBaseDataOk() {
        String stringExtra = getIntent().getStringExtra(SportRecordApiKt.KEY_SPORT_CATEGORY);
        String str = stringExtra == null ? "sport_stats_all" : stringExtra;
        List<SportCategoryData> list = this.categoryList;
        Object obj = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryList");
            list = null;
        }
        for (Object obj2 : list) {
            if (Intrinsics.areEqual(((SportCategoryData) obj2).getKey(), str)) {
                obj = obj2;
                break;
            }
        }
        SportCategoryData sportCategory = (SportCategoryData) obj;
        if (sportCategory == null) {
            sportCategory = SportCategory.INSTANCE.getSportCategory("sport_stats_all");
        }
        if (sportCategory != null) {
            ((top) getMBinding()).I.setText(sportCategory.getNameRes());
            ((RecordMainVM) getMViewModel()).setCategory(sportCategory.getKey());
        }
        ((top) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: c8k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecordMainActivity.onBaseDataOk$lambda$6(this.f5051a, view);
            }
        });
        ((top) getMBinding()).I.setOnClickListener(new View.OnClickListener() { // from class: d8k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecordMainActivity.onBaseDataOk$lambda$7(this.f15218a, view);
            }
        });
        TabLayout tabLayout = ((top) getMBinding()).J;
        tabLayout.addOnTabSelectedListener((TabLayout.d) this);
        if (this.isNeverRecreated && isSportPlugins(str)) {
            this.tabPosition = getIntent().getIntExtra(RecordMainActivityKt.KEY_TAB_POSITION, 0);
        } else if (this.isNeverRecreated && stringExtra != null && stringExtra.length() != 0) {
            this.tabPosition = 3;
        }
        TabLayout.g gVarX = tabLayout.x(this.tabPosition);
        tabLayout.F(gVarX);
        if (this.tabPosition != 0 || gVarX == null) {
            return;
        }
        onTabSelected(gVarX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBaseDataOk$lambda$6(RecordMainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lambda$onCreate$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBaseDataOk$lambda$7(RecordMainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectCategory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(RecordMainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showPopupMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(RecordMainActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.categoryList = list;
        this$0.onBaseDataOk();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void selectCategory() {
        TypeSelector typeSelector = new TypeSelector();
        this.typeSelector = typeSelector;
        String category = ((RecordMainVM) getMViewModel()).getCategory();
        List<SportCategoryData> list = this.categoryList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryList");
            list = null;
        }
        typeSelector.setData(category, list, new Function1() { // from class: b8k
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordMainActivity.selectCategory$lambda$11(this.f3924a, (SportCategoryData) obj);
            }
        });
        TypeSelector typeSelector2 = this.typeSelector;
        if (typeSelector2 != null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            typeSelector2.show(supportFragmentManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit selectCategory$lambda$11(RecordMainActivity this$0, SportCategoryData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ((top) this$0.getMBinding()).I.setText(it.getNameRes());
        ((RecordMainVM) this$0.getMViewModel()).setCategory(it.getKey());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showPopupMenu() {
        a4i a4iVar = new a4i(this, ((top) getMBinding()).G);
        a4iVar.f(qwi.f31912b);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: e8k
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return RecordMainActivity.showPopupMenu$lambda$10(this.f16387a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPopupMenu$lambda$10(RecordMainActivity this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (menuItem.getItemId() != bsi.a3) {
            return true;
        }
        this$0.gotoAddRecordFragment();
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return this.layoutId;
    }

    @Nullable
    public final TypeSelector getTypeSelector() {
        return this.typeSelector;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return this.viewModelId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.trail.Hilt_RecordMainActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        TabLayout tabLayout = (TabLayout) findViewById(bsi.l7);
        int tabCount = tabLayout.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.g gVarX = tabLayout.x(i);
            Intrinsics.checkNotNull(gVarX);
            tip.a(gVarX.i, null);
        }
        ((top) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: z7k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecordMainActivity.onCreate$lambda$0(this.f40988a, view);
            }
        });
        ((RecordMainVM) getMViewModel()).getCategoriesEmitter().observe(this, new RecordMainActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: a8k
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordMainActivity.onCreate$lambda$1(this.f770a, (List) obj);
            }
        }));
        ((RecordMainVM) getMViewModel()).initData();
        addSystemBarHeightPadding();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, android.app.Activity
    public void onRestoreInstanceState(@NotNull Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        this.tabPosition = savedInstanceState.getInt(RecordMainActivityKt.KEY_TAB_POSITION, 1);
        this.isNeverRecreated = savedInstanceState.getBoolean(RecordMainActivityKt.KEY_NEVER_RECREATED);
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        TypeSelector typeSelector = this.typeSelector;
        if (typeSelector != null) {
            typeSelector.dismissAllowingStateLoss();
        }
        this.typeSelector = null;
        outState.putInt(RecordMainActivityKt.KEY_TAB_POSITION, this.tabPosition);
        outState.putBoolean(RecordMainActivityKt.KEY_NEVER_RECREATED, false);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void onTabReselected(@Nullable TabLayout.g tab) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.tabs.TabLayout.c
    public void onTabSelected(@NotNull TabLayout.g tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        k kVarO = getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
        Fragment fragment = this.curFragment;
        if (fragment != null) {
            kVarO.t(fragment);
        }
        String tag = getTag(tab.g());
        this.tabPosition = tab.g();
        Fragment fragmentL0 = getSupportFragmentManager().l0(tag);
        if (fragmentL0 != null) {
            kVarO.F(fragmentL0);
        } else {
            fragmentL0 = Intrinsics.areEqual(tag, SportDataTypeKt.DIMEN_TOTAL) ? new DimenTotalFragment() : new DimenPeriodFragment();
            Bundle bundle = new Bundle(2);
            bundle.putString(RecordMainActivityKt.KEY_SPORT_TYPE, ((RecordMainVM) getMViewModel()).getCategory());
            bundle.putString(RecordMainActivityKt.KEY_DIMEN, tag);
            fragmentL0.setArguments(bundle);
            kVarO.c(bsi.N, fragmentL0, tag);
        }
        this.curFragment = fragmentL0;
        kVarO.m();
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void onTabUnselected(@Nullable TabLayout.g tab) {
    }

    public final void setTypeSelector(@Nullable TypeSelector typeSelector) {
        this.typeSelector = typeSelector;
    }
}
