package com.huami.healthlabel.web;

import com.huami.healthlabel.entry.HealthTagRecord;
import com.huami.healthlabel.entry.HomeHealthLabel;
import com.huami.healthlabel.entry.LabelItems;
import com.huami.healthlabel.entry.LabelProperties;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&JE\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0016\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005H&J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH&J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001aH&¨\u0006\u001f"}, d2 = {"Lcom/huami/healthlabel/web/WebApi;", "", "Lcom/huami/healthlabel/web/ApiResponse;", "Lcom/huami/healthlabel/entry/LabelProperties;", "loadAllHomeTable", "", "Lcom/huami/healthlabel/entry/HomeHealthLabel;", "labels", "Lcom/huami/healthlabel/web/Response;", "updateHomeTable", "", "limit", "", "startTime", "endTime", "nextTime", "", "reverse", "Lcom/huami/healthlabel/entry/LabelItems;", "loadHealthLabelRecord", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Z)Lcom/huami/healthlabel/web/ApiResponse;", "Lcom/huami/healthlabel/entry/HealthTagRecord;", "labelHealthTag", "", "insertHealthLabelRecord", "labelHealthTags", "", "timestampStr", "deleteHealthLabelRecord", "body", "markDeleteHomeLabel", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public interface WebApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ ApiResponse loadHealthLabelRecord$default(WebApi webApi, int i, Long l, Long l2, Long l3, boolean z, int i2, Object obj) {
            if (obj == null) {
                return webApi.loadHealthLabelRecord(i, l, l2, l3, (i2 & 16) != 0 ? false : z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadHealthLabelRecord");
        }
    }

    boolean deleteHealthLabelRecord(@NotNull String timestampStr);

    void insertHealthLabelRecord(@NotNull HealthTagRecord labelHealthTag);

    void insertHealthLabelRecord(@NotNull List<HealthTagRecord> labelHealthTags);

    @NotNull
    ApiResponse<LabelProperties> loadAllHomeTable();

    @NotNull
    ApiResponse<LabelItems> loadHealthLabelRecord(int limit, @Nullable Long startTime, @Nullable Long endTime, @Nullable Long nextTime, boolean reverse);

    @NotNull
    Response markDeleteHomeLabel(@NotNull String body);

    @NotNull
    Response updateHomeTable(@NotNull List<HomeHealthLabel> labels);
}
