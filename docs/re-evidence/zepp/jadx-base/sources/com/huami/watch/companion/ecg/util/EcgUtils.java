package com.huami.watch.companion.ecg.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.StringRes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.db.entity.EcgTag;
import com.huami.ecg.core.db.entity.EcgTagValue;
import com.huami.ecg.core.model.AdditionalInfo;
import com.huami.ecg.core.model.BioIdFeedback;
import com.huami.ecg.core.model.Diagnosis;
import com.huami.ecg.core.model.EcgAnalysisStatus;
import com.huami.ecg.core.model.EcgHealthRecord;
import com.huami.ecg.core.model.ProbeGroupItem;
import com.huami.ecg.core.model.constant.BioIdMatchedType;
import com.huami.ecg.core.model.constant.MeasureContentType;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.ecg.R;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import com.huami.watch.util.AndroidPermissions;
import com.huami.watch.util.DensityUtil;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0007\u001a\u00020\u0003*\u00020\u0002H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002J\n\u0010\u000b\u001a\u00020\t*\u00020\u0002J\n\u0010\r\u001a\u00020\f*\u00020\u0002J\n\u0010\u000f\u001a\u00020\u000e*\u00020\u0002J\n\u0010\u0010\u001a\u00020\u000e*\u00020\u0002J\n\u0010\u0011\u001a\u00020\f*\u00020\u0002J\n\u0010\u0012\u001a\u00020\f*\u00020\u0002J\u0010\u0010\u0014\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00020\u0013J\u0010\u0010\u0015\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00020\u0013J\n\u0010\u0016\u001a\u00020\u0003*\u00020\u0002J\n\u0010\u0017\u001a\u00020\u0003*\u00020\u0002J\n\u0010\u0018\u001a\u00020\u0003*\u00020\u0002J\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0002J\u0010\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001b*\u00020\u0002J\u0014\u0010 \u001a\u00020\u0019*\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u001eJ\f\u0010#\u001a\u00020\"*\u0004\u0018\u00010!J\u0012\u0010%\u001a\u00020\"*\u00020$2\u0006\u0010\b\u001a\u00020\u0002J\u001b\u0010(\u001a\u00020\"*\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b(\u0010)J\u001b\u0010+\u001a\u00020\"*\u00020&2\b\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b+\u0010)J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\u0013*\b\u0012\u0004\u0012\u00020\t0\u0013J\n\u0010-\u001a\u00020\f*\u00020\u0002J\u001a\u00100\u001a\u00020\"*\u00020$2\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\fJ\u001a\u00101\u001a\u00020\u0019*\u00020\u001e2\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\fJ\u0018\u00105\u001a\u00020\"*\u0002022\f\u00104\u001a\b\u0012\u0004\u0012\u00020\"03J\f\u00107\u001a\u00020\f*\u000206H\u0007¨\u0006:"}, d2 = {"Lcom/huami/watch/companion/ecg/util/EcgUtils;", "", "Lcom/huami/ecg/core/db/entity/EcgData;", "", "b", GoogleApiAvailabilityLight.a, "c", "a", EcgAnalyticsManagerKt.ECG, "", "getHrv", "hrv", "", "getAnsType", "", "getCardiacRisk", "getCardiacStrength", "getHrScore", "getDisplayHeartAgeRev", "", "getAvgAge", "getAvgCardiacStrength", "isProbeGroup", "isSelf", "isFullMeasure", "", "getHrText", "", "getLabelStartEndRange", "Lcom/huami/ecg/core/db/entity/EcgTag;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "toReadableString", "Lio/reactivex/disposables/Disposable;", "", "safeDispose", "Landroid/widget/TextView;", "formatEcgSelf", "Landroid/view/View;", "isGone", "gone", "(Landroid/view/View;Ljava/lang/Boolean;)V", "isInVisible", "inVisible", "removeEcgEnd", "getAFib", "aFib", "source", "formatAFibTag", "getEcgAfibText", "Landroid/app/Activity;", "Lkotlin/Function0;", "export", "withStorage", "Lcom/huami/ecg/core/model/EcgAnalysisStatus;", "getShowRes", "<init>", "()V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class EcgUtils {

    @NotNull
    public static final EcgUtils INSTANCE = new EcgUtils();

    private EcgUtils() {
    }

    private final boolean a(EcgData ecgData) {
        if (ecgData.getCom.huami.ecg.core.db.entity.EcgData.BIOID_FEEDBACK java.lang.String() != null) {
            BioIdFeedback bioIdFeedback = ecgData.getCom.huami.ecg.core.db.entity.EcgData.BIOID_FEEDBACK java.lang.String();
            if (bioIdFeedback != null && bioIdFeedback.getIsMyself() == 1) {
                return true;
            }
        }
        return false;
    }

    private final boolean b(EcgData ecgData) {
        AdditionalInfo additionalInfo = ecgData.getEcgResultData().getCom.huami.ecg.core.model.EcgResultData.j java.lang.String();
        if (additionalInfo == null) {
            return false;
        }
        ProbeGroupItem probeGroupItemValueByEcg = ProbeGroupItem.INSTANCE.valueByEcg(ecgData);
        if (probeGroupItemValueByEcg == null || !INSTANCE.isProbeGroup(ecgData)) {
            if (additionalInfo.getRPeaksNum() >= 15 || additionalInfo.getMNoisyPercent() <= 50) {
                return false;
            }
        } else if (probeGroupItemValueByEcg.getRPeaksNums() >= 15) {
            return false;
        }
        return true;
    }

    private final boolean c(EcgData ecgData) {
        return isProbeGroup(ecgData) || d(ecgData);
    }

    private final boolean d(EcgData ecgData) {
        return Intrinsics.areEqual(MeasureContentType.CHEST_HEART_SUBTYPE, ecgData.getMeasureContentType());
    }

    public final void formatAFibTag(@NotNull TextView textView, int i, int i2) {
        int color;
        textView.setText(getEcgAfibText(textView.getContext(), i, i2));
        if (i == 0) {
            color = Color.parseColor("#ff6000");
        } else if (i == 1) {
            color = Color.parseColor("#ff5353");
        } else if (i == 2) {
            color = Color.parseColor("#4a8dff");
        } else if (i == 3) {
            color = Color.parseColor("#ff6000");
        } else if (i == 4 || i == 6) {
            color = Color.parseColor("#4a8dff");
        } else {
            color = i != 7 ? Color.parseColor("#8d8d8d") : Color.parseColor("#8d8d8d");
        }
        textView.setTextColor(color);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke((int) DensityUtil.dpToPx(textView.getContext(), 1.0f), color);
        gradientDrawable.setCornerRadius(DensityUtil.dpToPx(textView.getContext(), 4.0f));
        textView.setBackground(gradientDrawable);
    }

    public final void formatEcgSelf(@NotNull TextView textView, @NotNull EcgData ecgData) {
        boolean zIsSelf = isSelf(ecgData);
        textView.setText(zIsSelf ? R.string.ecg_data_self : R.string.ecg_data_other);
        textView.setEnabled(zIsSelf);
    }

    public final int getAFib(@NotNull EcgData ecgData) {
        AdditionalInfo additionalInfo = ecgData.getEcgResultData().getCom.huami.ecg.core.model.EcgResultData.j java.lang.String();
        if (additionalInfo == null) {
            return 0;
        }
        return additionalInfo.getAFibResult();
    }

    public final int getAnsType(@NotNull EcgData ecgData) {
        ProbeGroupItem probeGroupItemValueByEcg = ProbeGroupItem.INSTANCE.valueByEcg(ecgData);
        return (probeGroupItemValueByEcg == null || !isProbeGroup(ecgData)) ? ecgData.getEcgResultData().getHealthRecord().getAnsType() : probeGroupItemValueByEcg.getAnsType();
    }

    public final int getAvgAge(@NotNull List<EcgData> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            EcgData ecgData = (EcgData) obj;
            EcgUtils ecgUtils = INSTANCE;
            if (ecgUtils.isSelf(ecgData) && !ecgUtils.b(ecgData)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(INSTANCE.getDisplayHeartAgeRev((EcgData) it2.next())));
        }
        return (int) CollectionsKt___CollectionsKt.averageOfInt(arrayList2);
    }

    public final int getAvgCardiacStrength(@NotNull List<EcgData> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            EcgData ecgData = (EcgData) obj;
            EcgUtils ecgUtils = INSTANCE;
            if (ecgUtils.isSelf(ecgData) && !ecgUtils.b(ecgData)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Double.valueOf(INSTANCE.getCardiacStrength((EcgData) it2.next())));
        }
        return (int) CollectionsKt___CollectionsKt.averageOfDouble(arrayList2);
    }

    public final double getCardiacRisk(@NotNull EcgData ecgData) {
        ProbeGroupItem probeGroupItemValueByEcg = ProbeGroupItem.INSTANCE.valueByEcg(ecgData);
        if (probeGroupItemValueByEcg != null && isProbeGroup(ecgData)) {
            return probeGroupItemValueByEcg.getCardiacRisk();
        }
        int cardiacRisk = ecgData.getEcgResultData().getHealthRecord().getCardiacRisk();
        if (cardiacRisk < 1) {
            return 0.0d;
        }
        return cardiacRisk;
    }

    public final double getCardiacStrength(@NotNull EcgData ecgData) {
        ProbeGroupItem probeGroupItemValueByEcg = ProbeGroupItem.INSTANCE.valueByEcg(ecgData);
        if (probeGroupItemValueByEcg != null && isProbeGroup(ecgData)) {
            return probeGroupItemValueByEcg.getCardiacStrength();
        }
        double cardiacStrength = ecgData.getEcgResultData().getHealthRecord().getCardiacStrength();
        if (cardiacStrength < 1.0d) {
            return 0.0d;
        }
        return cardiacStrength;
    }

    public final int getDisplayHeartAgeRev(@NotNull EcgData ecgData) {
        ProbeGroupItem probeGroupItemValueByEcg = ProbeGroupItem.INSTANCE.valueByEcg(ecgData);
        int heartAgeRev = (probeGroupItemValueByEcg == null || !isProbeGroup(ecgData)) ? ecgData.getEcgResultData().getHealthRecord().getHeartAgeRev() : probeGroupItemValueByEcg.getHeartAgeRev();
        if (heartAgeRev < 0) {
            return 0;
        }
        return heartAgeRev;
    }

    @NotNull
    public final String getEcgAfibText(@NotNull Context context, int i, int i2) {
        return i == 1 ? context.getString(EcgMedicalUtil.INSTANCE.getEcgMedicalService().atrialText(i2)) : context.getResources().getStringArray(R.array.ecg_afib)[i];
    }

    public final int getHrScore(@NotNull EcgData ecgData) {
        EcgHealthRecord healthRecord = ecgData.getEcgResultData().getHealthRecord();
        if (healthRecord.getHrScore() < 0) {
            return 0;
        }
        return healthRecord.getHrScore();
    }

    @NotNull
    public final String getHrText(@NotNull EcgData ecgData) {
        int hr = ecgData.getEcgResultData().getHealthRecord().getHr();
        return (hr <= 0 || hr >= 1000) ? "--" : String.valueOf(hr);
    }

    public final float getHrv(@NotNull EcgData ecg) {
        ProbeGroupItem probeGroupItemValueByEcg = ProbeGroupItem.INSTANCE.valueByEcg(ecg);
        float f = (probeGroupItemValueByEcg == null || !isProbeGroup(ecg)) ? ecg.getEcgResultData().getHealthRecord().getCom.huami.ecg.core.model.EcgHealthRecord.z java.lang.String() : probeGroupItemValueByEcg.getFatigue();
        if (f < 1.0f) {
            return 0.0f;
        }
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    @NotNull
    public final List<Float> getLabelStartEndRange(@NotNull EcgData ecgData) {
        List<Diagnosis.Labels> labels;
        Object next;
        boolean z;
        Diagnosis diagnosis = ecgData.getCom.huami.ecg.core.db.entity.EcgData.DIAGNOSIS java.lang.String();
        if (diagnosis != null && (labels = diagnosis.getLabels()) != null) {
            Iterator<T> it2 = labels.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                Diagnosis.Labels labels2 = (Diagnosis.Labels) next;
                if (m.equals(labels2.getType(), "normal", true)) {
                    if ((labels2.getStart().length() > 0) && TextUtils.isDigitsOnly(labels2.getStart())) {
                        if ((labels2.getEnd().length() > 0) && TextUtils.isDigitsOnly(labels2.getEnd())) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } while (!z);
            Diagnosis.Labels labels3 = (Diagnosis.Labels) next;
            if (labels3 != null) {
                return CollectionsKt__CollectionsKt.mutableListOf(Float.valueOf(Float.parseFloat(labels3.getStart())), Float.valueOf(Float.parseFloat(labels3.getEnd())));
            }
        }
        return new ArrayList();
    }

    @StringRes
    public final int getShowRes(@NotNull EcgAnalysisStatus ecgAnalysisStatus) {
        if (Intrinsics.areEqual(ecgAnalysisStatus, EcgAnalysisStatus.NotAnalysis.INSTANCE)) {
            return R.string.ecg_analysis_status_not;
        }
        if (Intrinsics.areEqual(ecgAnalysisStatus, EcgAnalysisStatus.Analysising.INSTANCE)) {
            return R.string.ecg_analysis_status_doing;
        }
        if (Intrinsics.areEqual(ecgAnalysisStatus, EcgAnalysisStatus.SUCCESS.INSTANCE)) {
            return R.string.ecg_analysis_status_done;
        }
        if (Intrinsics.areEqual(ecgAnalysisStatus, EcgAnalysisStatus.FAIL.INSTANCE)) {
            return R.string.ecg_analysis_status_fail;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void gone(@NotNull View view, @Nullable Boolean bool) {
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        view.setVisibility(bool.booleanValue() ? 8 : 0);
    }

    public final float hrv(@NotNull EcgData ecgData) {
        return getHrv(ecgData);
    }

    public final void inVisible(@NotNull View view, @Nullable Boolean bool) {
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        view.setVisibility(bool.booleanValue() ? 4 : 0);
    }

    public final boolean isFullMeasure(@NotNull EcgData ecgData) {
        return ecgData.getMeasureSecond() >= 234;
    }

    public final boolean isProbeGroup(@NotNull EcgData ecgData) {
        return Intrinsics.areEqual(MeasureContentType.CHEST_HEART, ecgData.getMeasureContentType());
    }

    public final boolean isSelf(@NotNull EcgData ecgData) {
        return (Intrinsics.areEqual(BioIdMatchedType.MATCHED, ecgData.getBioIdMatchedType()) && ecgData.getCom.huami.ecg.core.db.entity.EcgData.BIOID_FEEDBACK java.lang.String() == null) || a(ecgData);
    }

    @NotNull
    public final List<Float> removeEcgEnd(@NotNull List<Float> list) {
        return list.size() > 250 ? list.subList(0, list.size() - 250) : list;
    }

    public final void safeDispose(@Nullable Disposable disposable) {
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        disposable.dispose();
    }

    @NotNull
    public final String toReadableString(@Nullable EcgTag ecgTag, @NotNull Context context) {
        EcgTagValue value;
        StringBuilder sb = new StringBuilder();
        if (ecgTag != null && (value = ecgTag.getValue()) != null) {
            List<String> stringTags = value.getStringTags();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = stringTags.iterator();
            while (it2.hasNext()) {
                EcgTagEnum ecgTagEnumKeyOf = EcgTagEnum.INSTANCE.keyOf((String) it2.next());
                if (ecgTagEnumKeyOf != null) {
                    arrayList.add(ecgTagEnumKeyOf);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(context.getString(((EcgTagEnum) it3.next()).getNameRes()));
            }
            sb.append(TextUtils.join(" ", arrayList2));
            if (value.getCom.huami.ecg.core.db.entity.EcgTag.CUSTOM_TAG java.lang.String().length() > 0) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(value.getCom.huami.ecg.core.db.entity.EcgTag.CUSTOM_TAG java.lang.String());
            }
        }
        return sb.toString();
    }

    public final void withStorage(@NotNull Activity activity, @NotNull Function0<Unit> function0) {
        if (AndroidPermissions.checkGranted(activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            function0.invoke();
        } else {
            Toast.makeText(activity, R.string.need_storage_permission, 0).show();
        }
    }
}
