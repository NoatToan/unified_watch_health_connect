package com.xiaomi.hm.health.nps.ui;

import com.xiaomi.hm.health.nps.api.NpsWebAPI;
import com.xiaomi.hm.health.nps.model.NpsTargetVo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/nps/ui/NpsHelper;", "", "", "surveyId", "source", "Lcom/xiaomi/hm/health/nps/ui/NpsHelper$OnNpsUserResultSuccessListener;", "successListener", "Lcom/xiaomi/hm/health/nps/ui/NpsHelper$OnNpsUserResultErrorListener;", "errorListener", "", "retrieveNpsUserResultAsync", "TAG", "Ljava/lang/String;", "<init>", "()V", "OnNpsTargetSuccessListener", "OnNpsUserResultErrorListener", "OnNpsUserResultSuccessListener", "nps_release"}, k = 1, mv = {1, 5, 1})
public final class NpsHelper {

    @NotNull
    public static final NpsHelper INSTANCE = new NpsHelper();

    @NotNull
    public static final String TAG = "NpsHelper";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/nps/ui/NpsHelper$OnNpsTargetSuccessListener;", "", "Lcom/xiaomi/hm/health/nps/model/NpsTargetVo;", "target", "", "onSuccess", "nps_release"}, k = 1, mv = {1, 5, 1})
    public interface OnNpsTargetSuccessListener {
        void onSuccess(@NotNull NpsTargetVo target);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/nps/ui/NpsHelper$OnNpsUserResultErrorListener;", "", "", "onError", "nps_release"}, k = 1, mv = {1, 5, 1})
    public interface OnNpsUserResultErrorListener {
        void onError();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/nps/ui/NpsHelper$OnNpsUserResultSuccessListener;", "", "", "answered", "", "onSuccess", "nps_release"}, k = 1, mv = {1, 5, 1})
    public interface OnNpsUserResultSuccessListener {
        void onSuccess(boolean answered);
    }

    private NpsHelper() {
    }

    public static /* synthetic */ void retrieveNpsUserResultAsync$default(NpsHelper npsHelper, String str, String str2, OnNpsUserResultSuccessListener onNpsUserResultSuccessListener, OnNpsUserResultErrorListener onNpsUserResultErrorListener, int i, Object obj) {
        if ((i & 8) != 0) {
            onNpsUserResultErrorListener = null;
        }
        npsHelper.retrieveNpsUserResultAsync(str, str2, onNpsUserResultSuccessListener, onNpsUserResultErrorListener);
    }

    public final void retrieveNpsUserResultAsync(@NotNull String surveyId, @Nullable String source, @NotNull OnNpsUserResultSuccessListener successListener, @Nullable OnNpsUserResultErrorListener errorListener) {
        NpsWebAPI.INSTANCE.getUserResult(surveyId, source, successListener, errorListener);
    }
}
