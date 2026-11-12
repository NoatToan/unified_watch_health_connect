package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportSummaryDataParser;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.hm.health.bt.proto.SportSummary2;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/SportSummary800Parser;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/ISportSummaryDataParser;", "", HTTP.CONTENT_RANGE_BYTES, "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", "parser", "", "a", LogUtil.I, "version", "<init>", "(I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SportSummary800Parser implements ISportSummaryDataParser {
    private static final int b = 2;

    @NotNull
    private static final String c = "SportSummary800Parser";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int version;

    public SportSummary800Parser(int i) {
        this.version = i;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportSummaryDataParser
    @Nullable
    public SportSummary parser(@NotNull byte[] bytes) throws SportSummaryParseException {
        Object objM3845constructorimpl;
        if (bytes.length <= 2) {
            Debug.fi(c, "");
            throw new SportSummaryParseException("ERROR:运动summary数据格式错误：长度不够");
        }
        try {
            Result.Companion companion = Result.Companion;
            SportSummary2.SportSummaryMessage from = SportSummary2.SportSummaryMessage.parseFrom(bytes);
            Debug.fi(c, from.toString());
            objM3845constructorimpl = Result.m3845constructorimpl(SportUtilsKt.toSportSummary(from, this.version));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi(c, Intrinsics.stringPlus("解析Summary失败,可能是数据损坏:", thM3848exceptionOrNullimpl));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (SportSummary) objM3845constructorimpl;
    }
}
