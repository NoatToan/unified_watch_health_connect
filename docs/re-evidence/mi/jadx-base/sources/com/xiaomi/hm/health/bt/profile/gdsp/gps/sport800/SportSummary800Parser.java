package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportSummaryDataParser;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.hm.health.bt.proto.SportSummary2;
import defpackage.t5t;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/SportSummary800Parser;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/ISportSummaryDataParser;", "version", "", "(I)V", "parser", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", "bytes", "", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SportSummary800Parser implements ISportSummaryDataParser {
    private static final int MIN_RAW_DATA_LEN = 2;

    @NotNull
    private static final String TAG = "SportSummary800Parser";
    private final int version;

    public SportSummary800Parser(int i) {
        this.version = i;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportSummaryDataParser
    @Nullable
    public SportSummary parser(@NotNull byte[] bytes) throws SportSummaryParseException {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.length <= 2) {
            t5t.d(TAG, "");
            throw new SportSummaryParseException("ERROR:运动summary数据格式错误：长度不够");
        }
        try {
            Result.Companion companion = Result.Companion;
            SportSummary2.SportSummaryMessage sportSummaryMessage = SportSummary2.SportSummaryMessage.parseFrom(bytes);
            t5t.d(TAG, sportSummaryMessage.toString());
            Intrinsics.checkNotNullExpressionValue(sportSummaryMessage, "sportSummaryMessage");
            objM886constructorimpl = Result.m886constructorimpl(SportUtilsKt.toSportSummary(sportSummaryMessage, this.version));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d(TAG, "解析Summary失败,可能是数据损坏:" + thM889exceptionOrNullimpl);
        }
        if (Result.m892isFailureimpl(objM886constructorimpl)) {
            objM886constructorimpl = null;
        }
        return (SportSummary) objM886constructorimpl;
    }
}
