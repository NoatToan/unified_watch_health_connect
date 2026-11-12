package com.huami.sky.ui.navigation;

import android.content.Context;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J]\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/huami/sky/ui/navigation/HMAdNavigation;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "mode", "", "url", "event", "", "extras", "", DeviceSettingApiImpl.PARAMS_SOURCE, "", "doJumpAction", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public interface HMAdNavigation {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void doJumpAction$default(HMAdNavigation hMAdNavigation, Context context, Integer num, String str, String str2, Map map, List list, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doJumpAction");
            }
            if ((i & 32) != 0) {
                list = null;
            }
            hMAdNavigation.doJumpAction(context, num, str, str2, map, list);
        }
    }

    void doJumpAction(@NotNull Context context, @Nullable Integer mode, @Nullable String url, @Nullable String event, @Nullable Map<String, String> extras, @Nullable List<Integer> deviceSources);
}
