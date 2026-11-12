package com.huami.pai.ui.history;

import androidx.exifinterface.media.ExifInterface;
import com.huami.pai.vo.PAIDataVo;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0019\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004H&¨\u0006\u000f"}, d2 = {"Lcom/huami/pai/ui/history/PAIBaseHistoryRepo;", "Lcom/huami/pai/vo/PAIDataVo;", ExifInterface.GPS_DIRECTION_TRUE, "", "Ljava/util/Date;", "dateKey", "", "hasReal", "date", "getData", "(Ljava/util/Date;)Lcom/huami/pai/vo/PAIDataVo;", "", "getPredictData", "(Ljava/util/Date;)Ljava/lang/Float;", "getRealOrPredictData", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface PAIBaseHistoryRepo<T extends PAIDataVo> {
    @Nullable
    T getData(@NotNull Date date);

    @Nullable
    Float getPredictData(@NotNull Date date);

    float getRealOrPredictData(@NotNull Date date);

    boolean hasReal(@NotNull Date dateKey);
}
