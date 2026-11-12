package com.huami.devicex.injection;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.passport.Configs;
import com.huami.widget.share.ShareAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0004H&J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000bH&¨\u0006\u0010"}, d2 = {"Lcom/huami/devicex/injection/SyncedStatusApi;", "", "", "dataState", "", "setDataState", "", "isSynced", "isSyncedData", Configs.Params.RESET, ShareAnalytics.ParamValue.SAVE, "", "getOriginDataStartDate", "startDay", "setOriginDataStartDate", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface SyncedStatusApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int DATA_HAVE = 2;
    public static final int DATA_NONE = 1;
    public static final int DATA_UNKNOWN = 0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/devicex/injection/SyncedStatusApi$Companion;", "", "", "DATA_UNKNOWN", LogUtil.I, "DATA_NONE", "DATA_HAVE", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int DATA_HAVE = 2;
        public static final int DATA_NONE = 1;
        public static final int DATA_UNKNOWN = 0;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    @Nullable
    String getOriginDataStartDate();

    boolean isSynced();

    boolean isSyncedData();

    void reset();

    void save();

    void setDataState(int dataState);

    void setOriginDataStartDate(@NotNull String startDay);
}
