package com.huami.prelaunch;

import android.annotation.SuppressLint;
import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/prelaunch/PreLaunchApi;", "", "<init>", "()V", "Companion", "prelaunch_release"}, k = 1, mv = {1, 4, 0})
public final class PreLaunchApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String a = "PreLaunchApiNew";

    @NotNull
    public static IPreLaunch iPreLaunch;

    @SuppressLint({"StaticFieldLeak"})
    @NotNull
    public static Context sContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000e\u001a\u00020\u0002R\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/prelaunch/PreLaunchApi$Companion;", "", "", "wrapper", "key", "", "Lcom/huami/prelaunch/PreLaunchItem;", "a", "Lcom/huami/prelaunch/IPreLaunch;", "iPreLaunch", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", PointCategory.INIT, "preLaunch", "getPreLaunch", "sContext", "Landroid/content/Context;", "getSContext", "()Landroid/content/Context;", "setSContext", "(Landroid/content/Context;)V", "Lcom/huami/prelaunch/IPreLaunch;", "getIPreLaunch", "()Lcom/huami/prelaunch/IPreLaunch;", "setIPreLaunch", "(Lcom/huami/prelaunch/IPreLaunch;)V", "TAG", "Ljava/lang/String;", "<init>", "()V", "prelaunch_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        private final Map<String, PreLaunchItem> a(String wrapper, String key) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                JSONObject jSONObject = new JSONObject(new JSONObject(wrapper).getString(key));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    linkedHashMap.put(next, new PreLaunchItem(jSONObject.getJSONObject(next).getString("type"), jSONObject.getJSONObject(next).getString("description"), jSONObject.getJSONObject(next).getString("value")));
                }
                return linkedHashMap;
            } catch (Exception e) {
                getIPreLaunch().debug(PreLaunchApi.a, "解析预上线配置错误:" + e);
                return r.emptyMap();
            }
        }

        @NotNull
        public final IPreLaunch getIPreLaunch() {
            return PreLaunchApi.iPreLaunch;
        }

        @NotNull
        public final Map<String, PreLaunchItem> getPreLaunch(@NotNull String preLaunch) {
            String str = "huami.preLaunch." + preLaunch;
            String appSetting = getIPreLaunch().getAppSetting(str, "RANGE");
            getIPreLaunch().debug(PreLaunchApi.a, "preLaunch: " + preLaunch + ", res: " + appSetting);
            return a(appSetting, str);
        }

        @NotNull
        public final Context getSContext() {
            return PreLaunchApi.sContext;
        }

        public final void init(@NotNull IPreLaunch iPreLaunch, @NotNull Context context) {
            setIPreLaunch(iPreLaunch);
            setSContext(context);
        }

        public final void setIPreLaunch(@NotNull IPreLaunch iPreLaunch) {
            PreLaunchApi.iPreLaunch = iPreLaunch;
        }

        public final void setSContext(@NotNull Context context) {
            PreLaunchApi.sContext = context;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
