package com.huami.respiratoryrate.core.transform;

import androidx.exifinterface.media.ExifInterface;
import com.huami.respiratoryrate.core.data.local.entity.RespRateEntity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lcom/huami/respiratoryrate/core/transform/IWebTransform;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "Lcom/huami/respiratoryrate/core/data/local/entity/RespRateEntity;", "localData", "toWebEntity", "webData", "", "userId", "fromWebEntity", "core_release"}, k = 1, mv = {1, 5, 1})
public interface IWebTransform<T> {
    @NotNull
    List<RespRateEntity> fromWebEntity(@NotNull List<? extends T> webData, @NotNull String userId);

    @NotNull
    List<T> toWebEntity(@NotNull List<RespRateEntity> localData);
}
