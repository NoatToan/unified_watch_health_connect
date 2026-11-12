package com.huami.bluetooth.profile.channel.module.sport;

import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.phn.core.source.impl.RemoteDataSourceImpl;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH&J\u0016\u0010\r\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0012\u001a\u00020\fH&¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PHNApi;", "", "", "algorithmVersion", RemoteDataSourceImpl.USER_PHN_EVENT_KEY, "", "", "restDay", "", "startTime", "", "startPHN", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNErrorCode;", "updateRestDay", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "pullPHN", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNSummaryResult;", "getSummaryResult", "stopPHN", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface PHNApi {
    @NotNull
    String algorithmVersion();

    @NotNull
    PHNSummaryResult getSummaryResult();

    @NotNull
    ModuleResult<String> pullPHN();

    boolean startPHN(@NotNull String phn, @NotNull List<Integer> restDay, long startTime);

    @NotNull
    PHNErrorCode stopPHN();

    @NotNull
    PHNErrorCode updateRestDay(@NotNull List<Integer> restDay);
}
