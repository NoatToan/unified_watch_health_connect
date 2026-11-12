package com.huami.health.afppg.service;

import android.content.Context;
import com.huami.health.afppg.data.local.file.PPGFileOperator;
import com.huami.health.afppg.model.AFPPGDataType;
import com.huami.tools.analytics.DbUtils;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¨\u0006\u0011"}, d2 = {"Lcom/huami/health/afppg/service/RRFileService;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "dataType", "", "uid", "", "second", "", "", "rrData", "Ljava/io/File;", "saveRawData", "<init>", "()V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class RRFileService {

    @NotNull
    public static final RRFileService INSTANCE = new RRFileService();

    private RRFileService() {
    }

    @Nullable
    public final File saveRawData(@NotNull Context context, int dataType, @NotNull String uid, long second, @NotNull List<Byte> rrData) throws IOException {
        if (dataType == AFPPGDataType.AF_PPG.getValue()) {
            PPGFileOperator pPGFileOperator = PPGFileOperator.INSTANCE;
            return pPGFileOperator.saveRawData(pPGFileOperator.getAfPpgFile(context, uid, second), second, rrData);
        }
        if (dataType == AFPPGDataType.RR.getValue()) {
            return PPGFileOperator.INSTANCE.saveRRRaw(context, uid, second, rrData);
        }
        if (dataType == AFPPGDataType.HR_PG.getValue()) {
            PPGFileOperator pPGFileOperator2 = PPGFileOperator.INSTANCE;
            return pPGFileOperator2.saveRawData(pPGFileOperator2.getHrPpgFile(context, uid, second), second, rrData);
        }
        if (dataType != AFPPGDataType.AF_ACC.getValue()) {
            return null;
        }
        PPGFileOperator pPGFileOperator3 = PPGFileOperator.INSTANCE;
        return pPGFileOperator3.saveRawData(pPGFileOperator3.getAfAccFile(context, uid, second), second, rrData);
    }
}
