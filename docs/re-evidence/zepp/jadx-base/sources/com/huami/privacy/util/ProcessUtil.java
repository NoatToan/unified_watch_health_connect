package com.huami.privacy.util;

import android.content.Context;
import androidx.annotation.MainThread;
import com.huami.privacy.PrivacyProvider;
import com.huami.privacy.plugin.CreatedActivityClassNames;
import com.huami.privacy.plugin.CurrentProcessName;
import com.huami.privacy.plugin.IsAppForeground;
import com.huami.privacy.plugin.IsMainProcess;
import com.huami.privacy.plugin.PrivacyPlugin;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0007¨\u0006\u000e"}, d2 = {"Lcom/huami/privacy/util/ProcessUtil;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "isMainProcess", "", "getCurrentProcessName", "getTopActivityClassName", "isRunningForeground", "", "getStartedActivityClassNames", "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class ProcessUtil {

    @NotNull
    public static final ProcessUtil INSTANCE = new ProcessUtil();

    private ProcessUtil() {
    }

    @Deprecated(message = "此api已废弃，请勿使用", replaceWith = @ReplaceWith(expression = "PrivacyProvider.get<CurrentProcessName>().value", imports = {"com.huami.privacy.PrivacyProvider", "com.huami.privacy.plugin.CurrentProcessName"}))
    @JvmStatic
    @Nullable
    public static final String getCurrentProcessName(@NotNull Context context) throws Exception {
        PrivacyProvider privacyProvider = PrivacyProvider.INSTANCE;
        if ("from deprecated getCurrentProcessName".length() == 0) {
            throw new Exception("请填写此隐私信息的使用目的");
        }
        for (Object obj : privacyProvider.getPlugins()) {
            if (Intrinsics.areEqual(((PrivacyPlugin) obj).getClass(), CurrentProcessName.class)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.huami.privacy.plugin.CurrentProcessName");
                return ((CurrentProcessName) obj).getValue();
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @JvmStatic
    @NotNull
    @Deprecated(message = "此api已废弃，请勿使用", replaceWith = @ReplaceWith(expression = "PrivacyProvider.get<StartedActivityClassNames>().value", imports = {"com.huami.privacy.PrivacyProvider", "com.huami.privacy.plugin.StartedActivityClassNames"}))
    @MainThread
    public static final List<String> getStartedActivityClassNames() throws Exception {
        PrivacyProvider privacyProvider = PrivacyProvider.INSTANCE;
        if ("from deprecated getStartedActivityClassNames".length() == 0) {
            throw new Exception("请填写此隐私信息的使用目的");
        }
        for (Object obj : privacyProvider.getPlugins()) {
            if (Intrinsics.areEqual(((PrivacyPlugin) obj).getClass(), CreatedActivityClassNames.class)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.huami.privacy.plugin.CreatedActivityClassNames");
                return ((CreatedActivityClassNames) obj).getValue();
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @JvmStatic
    @Nullable
    @Deprecated(message = "此api已废弃，请勿使用", replaceWith = @ReplaceWith(expression = "PrivacyProvider.get<CreatedActivityClassNames>().value", imports = {"com.huami.privacy.PrivacyProvider", "com.huami.privacy.plugin.CreatedActivityClassNames"}))
    @MainThread
    public static final String getTopActivityClassName() throws Exception {
        PrivacyProvider privacyProvider = PrivacyProvider.INSTANCE;
        if ("from deprecated getTopActivityClassName".length() == 0) {
            throw new Exception("请填写此隐私信息的使用目的");
        }
        for (Object obj : privacyProvider.getPlugins()) {
            if (Intrinsics.areEqual(((PrivacyPlugin) obj).getClass(), CreatedActivityClassNames.class)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.huami.privacy.plugin.CreatedActivityClassNames");
                return (String) CollectionsKt.firstOrNull((List) ((CreatedActivityClassNames) obj).getValue());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Deprecated(message = "此api已废弃，请勿使用", replaceWith = @ReplaceWith(expression = "PrivacyProvider.get<IsMainProcess>().value", imports = {"com.huami.privacy.PrivacyProvider", "com.huami.privacy.plugin.IsMainProcess"}))
    @JvmStatic
    public static final boolean isMainProcess(@NotNull Context context) throws Exception {
        PrivacyProvider privacyProvider = PrivacyProvider.INSTANCE;
        if ("from deprecated isMainProcess".length() == 0) {
            throw new Exception("请填写此隐私信息的使用目的");
        }
        for (Object obj : privacyProvider.getPlugins()) {
            if (Intrinsics.areEqual(((PrivacyPlugin) obj).getClass(), IsMainProcess.class)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.huami.privacy.plugin.IsMainProcess");
                return ((IsMainProcess) obj).getValue().booleanValue();
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Deprecated(message = "此api已废弃，请勿使用", replaceWith = @ReplaceWith(expression = "PrivacyProvider.get<IsAppRunningForegroud>().value", imports = {"com.huami.privacy.PrivacyProvider", "com.huami.privacy.plugin.IsAppRunningForeground"}))
    @JvmStatic
    @MainThread
    public static final boolean isRunningForeground() throws Exception {
        PrivacyProvider privacyProvider = PrivacyProvider.INSTANCE;
        if ("from deprecated isRunningForeground".length() == 0) {
            throw new Exception("请填写此隐私信息的使用目的");
        }
        for (Object obj : privacyProvider.getPlugins()) {
            if (Intrinsics.areEqual(((PrivacyPlugin) obj).getClass(), IsAppForeground.class)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.huami.privacy.plugin.IsAppForeground");
                return ((IsAppForeground) obj).getValue().booleanValue();
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
