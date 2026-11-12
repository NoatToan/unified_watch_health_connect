package com.xiaomi.hm.health.device.prelaunch;

import android.content.Context;
import android.widget.ImageView;
import com.huami.prelaunch.IPreLaunch;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.webapi.PreLaunchApi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J \u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/prelaunch/PreLaunchImpl;", "Lcom/huami/prelaunch/IPreLaunch;", "", "tag", "msg", "", "debug", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/widget/ImageView;", "imageView", "url", "loadImage", "key", "mode", "getAppSetting", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class PreLaunchImpl implements IPreLaunch {

    @NotNull
    public static final PreLaunchImpl INSTANCE = new PreLaunchImpl();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a;
        }
    }

    private PreLaunchImpl() {
    }

    @Override // com.huami.prelaunch.IPreLaunch
    public void debug(@NotNull String tag, @NotNull String msg) {
        HMLog.info(tag, new a(msg));
    }

    @Override // com.huami.prelaunch.IPreLaunch
    @NotNull
    public String getAppSetting(@NotNull String key, @NotNull String mode) {
        return PreLaunchApi.INSTANCE.getAppSetting(key, mode);
    }

    @Override // com.huami.prelaunch.IPreLaunch
    public void loadImage(@NotNull Context context, @NotNull ImageView imageView, @NotNull String url) {
        HMImageLoader.with(context).load(url).into(imageView);
    }
}
