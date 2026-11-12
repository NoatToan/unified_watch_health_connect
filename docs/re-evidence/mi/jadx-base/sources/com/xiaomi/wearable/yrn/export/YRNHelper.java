package com.xiaomi.wearable.yrn.export;

import android.app.Activity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.onetrack.c.i;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&J:\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bH&J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u0003H&J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bH&¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/wearable/yrn/export/YRNHelper;", "", "appName", "", "pageUrl", "pageName", "openPage", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "params", "", "url", "sendJSEvent", "", i.d, "param", "Companion", "yrn-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface YRNHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/wearable/yrn/export/YRNHelper$Companion;", "", "<init>", "()V", "yrn-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @NotNull
    String appName();

    void openPage(@Nullable Activity activity, @NotNull String url);

    void openPage(@Nullable Activity activity, @NotNull String appName, @NotNull String pageName, @Nullable Map<String, ? extends Object> params);

    @NotNull
    String pageUrl(@NotNull String appName, @NotNull String pageName);

    boolean sendJSEvent(@NotNull String eventName, @Nullable Map<String, ? extends Object> param);
}
