package com.xiaomi.fitness.sport_eco.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport_eco.utils.SportUtilsExtKt;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import defpackage.cki;
import defpackage.fvi;
import defpackage.zri;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/widget/SportGlobalTabLayout;", "Landroid/widget/LinearLayout;", "", "initTabLayout", "()V", "", "", "titleList", "addTabsToTabLayout", "(Ljava/util/List;)V", "title", "Lcom/google/android/material/tabs/TabLayout$g;", "createTabItemWithTitleStr", "(Ljava/lang/String;)Lcom/google/android/material/tabs/TabLayout$g;", FaceSchema.FACE_PAGE_TAB, "", "isSelected", "onTabSelectedStatusChange", "(Lcom/google/android/material/tabs/TabLayout$g;Z)V", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "getTabLayout", "()Lcom/google/android/material/tabs/TabLayout;", "setTabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "Lcom/google/android/material/tabs/TabLayout$d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/google/android/material/tabs/TabLayout$d;", "getListener", "()Lcom/google/android/material/tabs/TabLayout$d;", "setListener", "(Lcom/google/android/material/tabs/TabLayout$d;)V", "TAG", "Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportGlobalTabLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportGlobalTabLayout.kt\ncom/xiaomi/fitness/sport_eco/view/widget/SportGlobalTabLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1863#2,2:96\n*S KotlinDebug\n*F\n+ 1 SportGlobalTabLayout.kt\ncom/xiaomi/fitness/sport_eco/view/widget/SportGlobalTabLayout\n*L\n49#1:96,2\n*E\n"})
public final class SportGlobalTabLayout extends LinearLayout {

    @NotNull
    private final String TAG;
    public TabLayout.d listener;

    @NotNull
    private TabLayout tabLayout;

    public SportGlobalTabLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = com.xiaomi.fitness.sport.view.widget.SportGlobalTabLayout.TAG;
        LayoutInflater.from(context).inflate(fvi.I, this);
        this.tabLayout = (TabLayout) findViewById(zri.s2);
        initTabLayout();
    }

    private final void addTabsToTabLayout(List<String> titleList) {
        this.tabLayout.D();
        this.tabLayout.setTabMode(2);
        for (String str : titleList) {
            boolean zAreEqual = Intrinsics.areEqual(str, ResourceExtKt.getString(SportUtilsExtKt.getSportTypeStr(1)));
            TabLayout.g gVarCreateTabItemWithTitleStr = createTabItemWithTitleStr(str);
            onTabSelectedStatusChange(gVarCreateTabItemWithTitleStr, zAreEqual);
            this.tabLayout.f(gVarCreateTabItemWithTitleStr, zAreEqual);
            FitnessLogUtils.d(this.TAG, "addTabsToTabLayout initializedSelected " + zAreEqual);
        }
    }

    private final TabLayout.g createTabItemWithTitleStr(String title) {
        TabLayout.g gVarA = this.tabLayout.A();
        Intrinsics.checkNotNullExpressionValue(gVarA, "newTab(...)");
        View viewFindViewById = LayoutInflater.from(getContext()).inflate(fvi.y, (ViewGroup) null).findViewById(zri.J);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        textView.setText(title);
        gVarA.p(textView);
        return gVarA;
    }

    private final void initTabLayout() {
        List<String> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{ResourceExtKt.getString(SportUtilsExtKt.getSportTypeStr(1)), ResourceExtKt.getString(SportUtilsExtKt.getSportTypeStr(3)), ResourceExtKt.getString(SportUtilsExtKt.getSportTypeStr(2)), ResourceExtKt.getString(SportUtilsExtKt.getSportTypeStr(6))});
        FitnessLogUtils.d(this.TAG, "initTabLayout");
        addTabsToTabLayout(listListOf);
    }

    @NotNull
    public final TabLayout.d getListener() {
        TabLayout.d dVar = this.listener;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        return null;
    }

    @NotNull
    public final TabLayout getTabLayout() {
        return this.tabLayout;
    }

    public final void onTabSelectedStatusChange(@NotNull TabLayout.g tab, boolean isSelected) {
        float f;
        Intrinsics.checkNotNullParameter(tab, "tab");
        View viewE = tab.e();
        Intrinsics.checkNotNull(viewE, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewE;
        Float fValueOf = Float.valueOf(15.0f);
        if (isSelected) {
            textView.getPaint().setFakeBoldText(true);
            textView.setTextColor(ViewExtKt.getColor(this, cki.p));
            textView.setWidth(textView.getText().length() * ExtUtilsKt.getDp(fValueOf));
            f = 14.0f;
        } else {
            textView.getPaint().setFakeBoldText(false);
            textView.setTextColor(ViewExtKt.getColor(this, cki.q));
            textView.setWidth(textView.getText().length() * ExtUtilsKt.getDp(fValueOf));
            f = 13.0f;
        }
        textView.setTextSize(2, TypedValue.applyDimension(0, f, getResources().getDisplayMetrics()));
    }

    public final void setListener(@NotNull TabLayout.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.listener = dVar;
    }

    public final void setTabLayout(@NotNull TabLayout tabLayout) {
        Intrinsics.checkNotNullParameter(tabLayout, "<set-?>");
        this.tabLayout = tabLayout;
    }
}
