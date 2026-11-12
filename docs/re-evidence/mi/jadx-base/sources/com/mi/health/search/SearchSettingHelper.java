package com.mi.health.search;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.mi.health.search.SearchSettingHelper;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.main.export.MainTab;
import defpackage.ezi;
import java.util.LinkedList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J \u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J \u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/mi/health/search/SearchSettingHelper;", "", "<init>", "()V", "mDestinationClass", "", "getMDestinationClass", "()Ljava/lang/String;", "mDestinationClass$delegate", "Lkotlin/Lazy;", "constructHealthSearchSetting", "", "Lcom/mi/health/search/SearchSettingHelper$SearchSetting;", "context", "Landroid/content/Context;", "constructHealth", "appName", "packageName", "constructSport", "constructDevice", "getAppName", "Companion", "SearchSetting", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SearchSettingHelper {

    @NotNull
    private static final String SETTING_ACTION = "";

    /* JADX INFO: renamed from: mDestinationClass$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDestinationClass = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: iil
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchSettingHelper.mDestinationClass_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/mi/health/search/SearchSettingHelper$SearchSetting;", "", "title", "", SearchContract.COLUMN_INTENT_ACTION, SearchContract.COLUMN_INTENT_TARGET_PACKAGE, SearchContract.COLUMN_INTENT_TARGET_CLASS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getIntentAction", "getIntentTargetPackage", "getIntentTargetClass", SearchContract.COLUMN_SUMMARY_ON, "getSummaryOn", "setSummaryOn", "(Ljava/lang/String;)V", SearchContract.COLUMN_SUMMARY_OFF, "getSummaryOff", "setSummaryOff", "searchKeyWords", "getSearchKeyWords", "setSearchKeyWords", "extras", "getExtras", "setExtras", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SearchSetting {

        @Nullable
        private String extras;

        @NotNull
        private final String intentAction;

        @NotNull
        private final String intentTargetClass;

        @NotNull
        private final String intentTargetPackage;

        @Nullable
        private String searchKeyWords;

        @Nullable
        private String summaryOff;

        @Nullable
        private String summaryOn;

        @NotNull
        private final String title;

        public SearchSetting(@NotNull String title, @NotNull String intentAction, @NotNull String intentTargetPackage, @NotNull String intentTargetClass) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(intentAction, "intentAction");
            Intrinsics.checkNotNullParameter(intentTargetPackage, "intentTargetPackage");
            Intrinsics.checkNotNullParameter(intentTargetClass, "intentTargetClass");
            this.title = title;
            this.intentAction = intentAction;
            this.intentTargetPackage = intentTargetPackage;
            this.intentTargetClass = intentTargetClass;
        }

        @Nullable
        public final String getExtras() {
            return this.extras;
        }

        @NotNull
        public final String getIntentAction() {
            return this.intentAction;
        }

        @NotNull
        public final String getIntentTargetClass() {
            return this.intentTargetClass;
        }

        @NotNull
        public final String getIntentTargetPackage() {
            return this.intentTargetPackage;
        }

        @Nullable
        public final String getSearchKeyWords() {
            return this.searchKeyWords;
        }

        @Nullable
        public final String getSummaryOff() {
            return this.summaryOff;
        }

        @Nullable
        public final String getSummaryOn() {
            return this.summaryOn;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final void setExtras(@Nullable String str) {
            this.extras = str;
        }

        public final void setSearchKeyWords(@Nullable String str) {
            this.searchKeyWords = str;
        }

        public final void setSummaryOff(@Nullable String str) {
            this.summaryOff = str;
        }

        public final void setSummaryOn(@Nullable String str) {
            this.summaryOn = str;
        }
    }

    private final SearchSetting constructDevice(Context context, String appName, String packageName) {
        SearchSetting searchSetting = new SearchSetting(appName, "", packageName, getMDestinationClass());
        String string = context.getString(ezi.w);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        searchSetting.setSummaryOn(string);
        searchSetting.setSummaryOff(string);
        searchSetting.setSearchKeyWords(context.getString(ezi.t));
        searchSetting.setExtras("key_tab:" + MainTab.INSTANCE.getINDEX_DEVICE());
        return searchSetting;
    }

    private final SearchSetting constructHealth(Context context, String appName, String packageName) {
        SearchSetting searchSetting = new SearchSetting(appName, "", packageName, getMDestinationClass());
        String string = context.getString(ezi.x);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        searchSetting.setSummaryOn(string);
        searchSetting.setSummaryOff(string);
        searchSetting.setSearchKeyWords(context.getString(ezi.u));
        searchSetting.setExtras("key_tab:" + MainTab.INSTANCE.getINDEX_HEALTH());
        return searchSetting;
    }

    private final SearchSetting constructSport(Context context, String appName, String packageName) {
        SearchSetting searchSetting = new SearchSetting(appName, "", packageName, getMDestinationClass());
        String string = context.getString(ezi.y);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        searchSetting.setSummaryOn(string);
        searchSetting.setSummaryOff(string);
        searchSetting.setSearchKeyWords(context.getString(ezi.v));
        searchSetting.setExtras("key_tab:" + MainTab.INSTANCE.getINDEX_SPORT());
        return searchSetting;
    }

    private final String getAppName(Context context) {
        ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo;
        if (applicationInfo == null) {
            return "";
        }
        String string = context.getString(applicationInfo.labelRes);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final String getMDestinationClass() {
        return (String) this.mDestinationClass.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mDestinationClass_delegate$lambda$0() {
        return AppManager.INSTANCE.getInstance().getLauncherActivity();
    }

    @NotNull
    public final List<SearchSetting> constructHealthSearchSetting(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LinkedList linkedList = new LinkedList();
        String appName = getAppName(context);
        String packageName = context.getPackageName();
        Intrinsics.checkNotNull(packageName);
        linkedList.add(constructHealth(context, appName, packageName));
        linkedList.add(constructSport(context, appName, packageName));
        linkedList.add(constructDevice(context, appName, packageName));
        return linkedList;
    }
}
