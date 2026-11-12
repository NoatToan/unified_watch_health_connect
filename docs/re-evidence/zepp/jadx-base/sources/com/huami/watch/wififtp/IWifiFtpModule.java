package com.huami.watch.wififtp;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\bH&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H&J+\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\b\u0010\u0018\u001a\u00020\rH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/huami/watch/wififtp/IWifiFtpModule;", "", "", "isBleDevice", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "hasBoundDevice", "isDeviceConnected", "", PointCategory.INIT, "release", "", "getDeviceAddress", "", "getDeviceSource", "ssid", "pwd", "keyMgmt", "sendEnableWifiAP", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendDisableWifiAP", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEnableFtp", "sendDisableFtp", "getMusicInfoMaxLength", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public interface IWifiFtpModule {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 1})
    public static final class DefaultImpls {
        public static int getMusicInfoMaxLength(@NotNull IWifiFtpModule iWifiFtpModule) {
            return 31;
        }
    }

    @Nullable
    String getDeviceAddress(@NotNull Context context);

    int getDeviceSource(@NotNull Context context);

    int getMusicInfoMaxLength();

    boolean hasBoundDevice(@NotNull Context context);

    void init(@NotNull Context context);

    boolean isBleDevice();

    boolean isDeviceConnected(@NotNull Context context);

    void release();

    @Nullable
    Object sendDisableFtp(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object sendDisableWifiAP(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object sendEnableFtp(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object sendEnableWifiAP(@NotNull String str, @NotNull String str2, int i, @NotNull Continuation<? super Boolean> continuation);
}
