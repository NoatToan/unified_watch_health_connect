package com.xiaomi.hm.health.discovery.jsbridge.function.jsdevicenavigate;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J$\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007R&\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/discovery/jsbridge/function/jsdevicenavigate/JsDeviceNavigator;", "", "", "position", "", "isDeviceNavigator", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "data", "", "navigateTo", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/discovery/jsbridge/function/jsdevicenavigate/IJsDeviceNavigate;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "jsDeviceNavigateList", "b", "Ljava/lang/String;", "TAG", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class JsDeviceNavigator {

    @NotNull
    public static final JsDeviceNavigator INSTANCE = new JsDeviceNavigator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final ArrayList<IJsDeviceNavigate> jsDeviceNavigateList = CollectionsKt__CollectionsKt.arrayListOf(new AddDevice(), new ActiveDevice(), new BpCalibration(), new BloodPressureAppInstall());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "JsDeviceNavigator";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "context null!";
        }
    }

    private JsDeviceNavigator() {
    }

    @JvmStatic
    public static final boolean isDeviceNavigator(@NotNull String position) {
        Iterator<T> it2 = jsDeviceNavigateList.iterator();
        while (it2.hasNext()) {
            if (((IJsDeviceNavigate) it2.next()).match(position)) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    public static final void navigateTo(@Nullable Context context, @NotNull String position, @Nullable String data) {
        if (context == null) {
            HMLog.error$default(TAG, null, null, a.a, 6, null);
            return;
        }
        for (IJsDeviceNavigate iJsDeviceNavigate : jsDeviceNavigateList) {
            if (iJsDeviceNavigate.match(position)) {
                iJsDeviceNavigate.jump(context, position, data);
                return;
            }
        }
    }
}
