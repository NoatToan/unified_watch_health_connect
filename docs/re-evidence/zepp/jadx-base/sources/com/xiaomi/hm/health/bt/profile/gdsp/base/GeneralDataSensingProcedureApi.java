package com.xiaomi.hm.health.bt.profile.gdsp.base;

import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J(\u0010\u0011\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&J\b\u0010\u0012\u001a\u00020\u0002H&J\b\u0010\u0013\u001a\u00020\fH&J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0004H&J\b\u0010\u0017\u001a\u00020\u0002H&¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GeneralDataSensingProcedureApi;", "", "", PointCategory.INIT, "", "type", "Ljava/util/Calendar;", "time", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "getDateSize", "Lkotlin/Function1;", "", "", "progress", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/IDataInterceptor;", "dataInterceptor", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/DataResultResult;", "getData", "startTransferData", g.g, "code", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/StopTransferResult;", "stopTransfer", "deInit", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface GeneralDataSensingProcedureApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ DataResultResult getData$default(GeneralDataSensingProcedureApi generalDataSensingProcedureApi, Function1 function1, IDataInterceptor iDataInterceptor, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getData");
            }
            if ((i & 2) != 0) {
                iDataInterceptor = null;
            }
            return generalDataSensingProcedureApi.getData(function1, iDataInterceptor);
        }
    }

    void cancel();

    boolean deInit();

    @NotNull
    DataResultResult getData(@NotNull Function1<? super Long, Unit> progress, @Nullable IDataInterceptor dataInterceptor);

    @Nullable
    DataHeader getDateSize(int type, @NotNull Calendar time);

    boolean init();

    boolean startTransferData();

    @NotNull
    StopTransferResult stopTransfer(int code);
}
