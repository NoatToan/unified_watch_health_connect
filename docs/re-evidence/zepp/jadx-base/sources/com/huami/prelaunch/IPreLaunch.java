package com.huami.prelaunch;

import android.content.Context;
import android.widget.ImageView;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H&J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H&¨\u0006\u0010"}, d2 = {"Lcom/huami/prelaunch/IPreLaunch;", "", "", "key", "mode", "getAppSetting", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/widget/ImageView;", "imageView", "url", "", "loadImage", "tag", "msg", "debug", "prelaunch_release"}, k = 1, mv = {1, 4, 0})
public interface IPreLaunch {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    public static final class DefaultImpls {
        public static /* synthetic */ String getAppSetting$default(IPreLaunch iPreLaunch, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAppSetting");
            }
            if ((i & 2) != 0) {
                str2 = "SINGLE";
            }
            return iPreLaunch.getAppSetting(str, str2);
        }
    }

    void debug(@NotNull String tag, @NotNull String msg);

    @NotNull
    String getAppSetting(@NotNull String key, @NotNull String mode);

    void loadImage(@NotNull Context context, @NotNull ImageView imageView, @NotNull String url);
}
