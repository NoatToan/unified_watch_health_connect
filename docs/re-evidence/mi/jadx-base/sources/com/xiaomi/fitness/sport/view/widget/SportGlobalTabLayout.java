package com.xiaomi.fitness.sport.view.widget;

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
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.utils.SportUtilsExtKt;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import defpackage.aki;
import defpackage.dvi;
import defpackage.xri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001*B\u001b\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/sport/view/widget/SportGlobalTabLayout;", "Landroid/widget/LinearLayout;", "", "initTabLayout", "()V", "", "", "titleList", "addTabsToTabLayout", "(Ljava/util/List;)V", "title", "Lcom/google/android/material/tabs/TabLayout$g;", "createTabItemWithTitleStr", "(Ljava/lang/String;)Lcom/google/android/material/tabs/TabLayout$g;", FaceSchema.FACE_PAGE_TAB, "", "isSelected", "onTabSelectedStatusChange", "(Lcom/google/android/material/tabs/TabLayout$g;Z)V", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "getTabLayout", "()Lcom/google/android/material/tabs/TabLayout;", "setTabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "Lcom/google/android/material/tabs/TabLayout$d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/google/android/material/tabs/TabLayout$d;", "getListener", "()Lcom/google/android/material/tabs/TabLayout$d;", "setListener", "(Lcom/google/android/material/tabs/TabLayout$d;)V", "", "sportTypeIdList", "Ljava/util/List;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportGlobalTabLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportGlobalTabLayout.kt\ncom/xiaomi/fitness/sport/view/widget/SportGlobalTabLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n1557#2:100\n1628#2,3:101\n1872#2,3:104\n*S KotlinDebug\n*F\n+ 1 SportGlobalTabLayout.kt\ncom/xiaomi/fitness/sport/view/widget/SportGlobalTabLayout\n*L\n42#1:100\n42#1:101,3\n53#1:104,3\n*E\n"})
public final class SportGlobalTabLayout extends LinearLayout {

    @NotNull
    public static final String TAG = "SportGlobalTabLayout";
    public TabLayout.d listener;

    @NotNull
    private final List<Integer> sportTypeIdList;

    @NotNull
    private TabLayout tabLayout;

    public SportGlobalTabLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.sportTypeIdList = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 3, 2, 6, 14});
        LayoutInflater.from(context).inflate(dvi.I0, this);
        this.tabLayout = (TabLayout) findViewById(xri.x6);
        initTabLayout();
    }

    private final void addTabsToTabLayout(List<String> titleList) {
        this.tabLayout.D();
        this.tabLayout.setTabMode(2);
        int i = 0;
        for (Object obj : titleList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            boolean zAreEqual = Intrinsics.areEqual(str, ResourceExtKt.getString(SportUtilsExtKt.getSportTypeStr(1)));
            TabLayout.g gVarCreateTabItemWithTitleStr = createTabItemWithTitleStr(str);
            gVarCreateTabItemWithTitleStr.r(this.sportTypeIdList.get(i).intValue());
            onTabSelectedStatusChange(gVarCreateTabItemWithTitleStr, zAreEqual);
            this.tabLayout.f(gVarCreateTabItemWithTitleStr, zAreEqual);
            Logger.d(TAG, "addTabsToTabLayout initializedSelected " + zAreEqual);
            i = i2;
        }
    }

    private final TabLayout.g createTabItemWithTitleStr(String title) {
        TabLayout.g gVarA = this.tabLayout.A();
        Intrinsics.checkNotNullExpressionValue(gVarA, "newTab(...)");
        View viewFindViewById = LayoutInflater.from(getContext()).inflate(dvi.n0, (ViewGroup) null).findViewById(xri.d1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        textView.setText(title);
        gVarA.p(textView);
        return gVarA;
    }

    private final void initTabLayout() {
        List<Integer> list = this.sportTypeIdList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ResourceExtKt.getString(SportUtilsExtKt.getSportTypeStr(((Number) it.next()).intValue())));
        }
        Logger.d(TAG, "initTabLayout");
        addTabsToTabLayout(arrayList);
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
            textView.setTextColor(ViewExtKt.getColor(this, aki.A));
            textView.setWidth(textView.getText().length() * ExtUtilsKt.getDp(fValueOf));
            f = 14.0f;
        } else {
            textView.getPaint().setFakeBoldText(false);
            textView.setTextColor(ViewExtKt.getColor(this, aki.D));
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
