package com.xiaomi.fitness.training_plan.config;

import android.content.Context;
import android.net.Uri;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.schema.export.IntentSchemeHandle;
import com.xiaomi.fitness.schema.export.PushConstants;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0016J\u0017\u0010\u000e\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/training_plan/config/TrainingPlanSchemaHandler;", "Lcom/xiaomi/fitness/schema/export/IntentSchemeHandle;", "<init>", "()V", "trainingPageTypeList", "Ljava/util/ArrayList;", "", "parameterList", "canHandle", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "pathList", "", "getBackStackBaseTab", "", "(Landroid/net/Uri;)Ljava/lang/Integer;", "doProcess", "", "context", "Landroid/content/Context;", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrainingPlanSchemaHandler extends IntentSchemeHandle {

    @NotNull
    private static final String PAGE_PLAN_SPORT = "trainingPlan";

    @NotNull
    private static final String PARAM_PLAN_ID = "trainingPlanId";

    @NotNull
    private static final String PARAM_PLAN_TYPE = "trainingPlanType";

    @NotNull
    private static final String PARAM_TARGET = "target";

    @NotNull
    private static final String TAG = "TrainingPlanSchemaHandler";

    @NotNull
    private static final String TARGET_FORCE_STOP = "planForceStop";

    @NotNull
    private static final String TARGET_IMPROVE = "planImprove";

    @NotNull
    private static final String TARGET_REPORT = "planReport";

    @NotNull
    private static final String TARGET_SPORT = "planSport";

    @NotNull
    private final ArrayList<String> trainingPageTypeList = CollectionsKt__CollectionsKt.arrayListOf(PAGE_PLAN_SPORT);

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle, defpackage.y0c, defpackage.wfl
    public boolean canHandle(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("pageType");
        if (!Intrinsics.areEqual(PushConstants.getSSchemeMihealth(), uri.getScheme()) || !CollectionsKt___CollectionsKt.contains(this.trainingPageTypeList, queryParameter) || !Intrinsics.areEqual(getAUTHORITY(), uri.getAuthority())) {
            if (!Intrinsics.areEqual(getAUTHORITY() + ".xiaomi.com", uri.getAuthority())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.y0c
    public void doProcess(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            String queryParameter = uri.getQueryParameter("pageType");
            if (!Intrinsics.areEqual(queryParameter, PAGE_PLAN_SPORT)) {
                Logger.i(TAG, "can not handle page type " + queryParameter);
                return;
            }
            String queryParameter2 = uri.getQueryParameter("target");
            if (queryParameter2 != null) {
                switch (queryParameter2.hashCode()) {
                    case -855593884:
                        if (queryParameter2.equals(TARGET_FORCE_STOP)) {
                            return;
                        }
                        break;
                    case -641716209:
                        if (queryParameter2.equals(TARGET_IMPROVE)) {
                            return;
                        }
                        break;
                    case 368118205:
                        if (queryParameter2.equals(TARGET_REPORT)) {
                            String queryParameter3 = uri.getQueryParameter("trainingPlanId");
                            long j = queryParameter3 != null ? Long.parseLong(queryParameter3) : 0L;
                            String queryParameter4 = uri.getQueryParameter(PARAM_PLAN_TYPE);
                            int i = queryParameter4 != null ? Integer.parseInt(queryParameter4) : 0;
                            if (j > 0) {
                                TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).launchPlanReport(context, i, j);
                                return;
                            }
                            Logger.e(TAG, "can not go to plan report with planId:" + j);
                            return;
                        }
                        break;
                    case 2091335115:
                        if (queryParameter2.equals(TARGET_SPORT)) {
                            return;
                        }
                        break;
                }
            }
            Logger.i(TAG, "can not handle target " + queryParameter2);
        } catch (Exception e) {
            Logger.e(TAG, "doProcess Exception", e);
        }
    }

    @Override // defpackage.y0c
    @NotNull
    public Integer getBackStackBaseTab(@Nullable Uri uri) {
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("pageType");
            uri.getQueryParameter("target");
            if (Intrinsics.areEqual(PAGE_PLAN_SPORT, queryParameter)) {
                return Integer.valueOf(MainTab.INSTANCE.getINDEX_SPORT());
            }
        }
        Integer backStackBaseTab = super.getBackStackBaseTab(uri);
        Intrinsics.checkNotNullExpressionValue(backStackBaseTab, "getBackStackBaseTab(...)");
        return backStackBaseTab;
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> pathList() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public ArrayList<String> parameterList() {
        ArrayList<String> arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf("trainingPlanId", PARAM_PLAN_TYPE, TARGET_SPORT, TARGET_FORCE_STOP, TARGET_REPORT, TARGET_IMPROVE);
        arrayListArrayListOf.addAll(this.trainingPageTypeList);
        return arrayListArrayListOf;
    }
}
