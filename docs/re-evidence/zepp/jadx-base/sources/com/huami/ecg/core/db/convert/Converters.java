package com.huami.ecg.core.db.convert;

import androidx.room.TypeConverter;
import com.google.gson.Gson;
import com.huami.ecg.core.model.BioIdFeedback;
import com.huami.ecg.core.model.Diagnosis;
import com.huami.ecg.core.model.EcgExData;
import com.huami.ecg.core.model.EcgResultData;
import com.huami.ecg.core.model.MeasureState;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010H\u0007J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013H\u0007J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\u0018"}, d2 = {"Lcom/huami/ecg/core/db/convert/Converters;", "", "", "value", "Lcom/huami/ecg/core/model/BioIdFeedback;", "stringToBioId", "bioIdToString", "Lcom/huami/ecg/core/model/Diagnosis;", "stringToDiagnosis", "diagnosisToString", "Lcom/huami/ecg/core/model/MeasureState;", "stringToMeasureState", "measureStateToString", "Lcom/huami/ecg/core/model/EcgResultData;", "stringToEcgResult", "ecgResultToString", "", "stringToList", "listToString", "Lcom/huami/ecg/core/model/EcgExData;", "ecgExDataToString", "stringToEcgExData", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class Converters {
    @TypeConverter
    @Nullable
    public final String bioIdToString(@Nullable BioIdFeedback value) {
        if (value != null) {
            return new Gson().toJson(value);
        }
        return null;
    }

    @TypeConverter
    @Nullable
    public final String diagnosisToString(@Nullable Diagnosis value) {
        if (value != null) {
            return new Gson().toJson(value);
        }
        return null;
    }

    @TypeConverter
    @Nullable
    public final String ecgExDataToString(@Nullable EcgExData value) {
        if (value != null) {
            return new Gson().toJson(value);
        }
        return null;
    }

    @TypeConverter
    @Nullable
    public final String ecgResultToString(@Nullable EcgResultData value) {
        if (value != null) {
            return new Gson().toJson(value);
        }
        return null;
    }

    @TypeConverter
    @Nullable
    public final String listToString(@Nullable List<String> value) {
        if (value != null) {
            return new Gson().toJson(value);
        }
        return null;
    }

    @TypeConverter
    @Nullable
    public final String measureStateToString(@Nullable MeasureState value) {
        if (value != null) {
            return new Gson().toJson(value);
        }
        return null;
    }

    @TypeConverter
    @Nullable
    public final BioIdFeedback stringToBioId(@Nullable String value) {
        Object objFromJson;
        if (value != null) {
            try {
                objFromJson = new Gson().fromJson(value, (Class<Object>) BioIdFeedback.class);
            } catch (Exception e) {
                e.printStackTrace();
                objFromJson = null;
            }
        } else {
            objFromJson = null;
        }
        return (BioIdFeedback) objFromJson;
    }

    @TypeConverter
    @Nullable
    public final Diagnosis stringToDiagnosis(@Nullable String value) {
        Object objFromJson;
        if (value != null) {
            try {
                objFromJson = new Gson().fromJson(value, (Class<Object>) Diagnosis.class);
            } catch (Exception e) {
                e.printStackTrace();
                objFromJson = null;
            }
        } else {
            objFromJson = null;
        }
        return (Diagnosis) objFromJson;
    }

    @TypeConverter
    @Nullable
    public final EcgExData stringToEcgExData(@Nullable String value) {
        Object objFromJson;
        if (value != null) {
            try {
                objFromJson = new Gson().fromJson(value, (Class<Object>) EcgExData.class);
            } catch (Exception e) {
                e.printStackTrace();
                objFromJson = null;
            }
        } else {
            objFromJson = null;
        }
        return (EcgExData) objFromJson;
    }

    @TypeConverter
    @Nullable
    public final EcgResultData stringToEcgResult(@Nullable String value) {
        Object objFromJson;
        if (value != null) {
            try {
                objFromJson = new Gson().fromJson(value, (Class<Object>) EcgResultData.class);
            } catch (Exception e) {
                e.printStackTrace();
                objFromJson = null;
            }
        } else {
            objFromJson = null;
        }
        return (EcgResultData) objFromJson;
    }

    @TypeConverter
    @Nullable
    public final List<String> stringToList(@Nullable String value) {
        Object objFromJson;
        if (value != null) {
            try {
                objFromJson = new Gson().fromJson(value, (Class<Object>) List.class);
            } catch (Exception e) {
                e.printStackTrace();
                objFromJson = null;
            }
        } else {
            objFromJson = null;
        }
        return (List) objFromJson;
    }

    @TypeConverter
    @Nullable
    public final MeasureState stringToMeasureState(@Nullable String value) {
        Object objFromJson;
        if (value != null) {
            try {
                objFromJson = new Gson().fromJson(value, (Class<Object>) MeasureState.class);
            } catch (Exception e) {
                e.printStackTrace();
                objFromJson = null;
            }
        } else {
            objFromJson = null;
        }
        return (MeasureState) objFromJson;
    }
}
