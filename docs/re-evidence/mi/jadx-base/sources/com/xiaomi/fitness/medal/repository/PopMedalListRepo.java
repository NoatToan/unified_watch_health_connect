package com.xiaomi.fitness.medal.repository;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.medal.export.IPopMedalListRepo;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.medal.export.data.PopMedalData;
import com.xiaomi.fitness.medal.export.data.PopMedalDataList;
import com.xiaomi.fitness.medal.preference.PopMedalDataPreference;
import com.xiaomi.fitness.medal.repository.PopMedalListRepo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0010\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\u001e\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0016\u0010\u001d\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u001aH\u0016J\u0016\u0010\u001e\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u001aH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/medal/repository/PopMedalListRepo;", "Lcom/xiaomi/fitness/medal/export/IPopMedalListRepo;", "<init>", "()V", "mGson", "Lcom/google/gson/Gson;", "getMGson", "()Lcom/google/gson/Gson;", "setMGson", "(Lcom/google/gson/Gson;)V", "setShouldPullPopMedalData", "", "shouldPull", "", "savePopMedalList", "list", "", "Lcom/xiaomi/fitness/medal/export/data/PopMedalData;", "getPopMedalList", "cameFromMedalDetailPage", "removePoppedMedalFromSp", "getFirstMedal", "isMedalListEmpty", "getShouldPullPopMedalData", "startObservingPopupMedalData", "medalToPopLiveData", "Landroidx/lifecycle/MutableLiveData;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "showPopupDialogIfNeed", "handlePopMedalData", "Companion", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PopMedalListRepo implements IPopMedalListRepo {

    @NotNull
    public static final String TAG = "PopMedalListRepo";
    public Gson mGson;

    private final void handlePopMedalData(MutableLiveData<PopMedalData> medalToPopLiveData) {
        boolean zCameFromMedalDetailPage = cameFromMedalDetailPage();
        Logger.d(TAG, "showPopMedalDialogIfNeed removePoppedMedalData=" + zCameFromMedalDetailPage);
        if (isMedalListEmpty()) {
            return;
        }
        if (zCameFromMedalDetailPage) {
            removePoppedMedalFromSp();
        }
        if (isMedalListEmpty()) {
            setShouldPullPopMedalData(true);
        } else {
            medalToPopLiveData.setValue(getFirstMedal());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPopupDialogIfNeed$lambda$2(PopMedalListRepo this$0, MutableLiveData medalToPopLiveData, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(medalToPopLiveData, "$medalToPopLiveData");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d(TAG, "showPopMedalDialogIfNeed popMedalDataList=" + it);
        if (it.isEmpty()) {
            this$0.setShouldPullPopMedalData(true);
        } else {
            this$0.savePopMedalList(it);
            this$0.setShouldPullPopMedalData(false);
        }
        this$0.handlePopMedalData(medalToPopLiveData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startObservingPopupMedalData$lambda$1(FragmentActivity fragmentActivity, final PopMedalListRepo this$0, final MutableLiveData medalToPopLiveData, PopMedalData popMedalData) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(medalToPopLiveData, "$medalToPopLiveData");
        Logger.d(TAG, "medalToPopLiveData value=" + popMedalData);
        if (popMedalData != null) {
            MedalManagerExtKt.getInstance(MedalManager.INSTANCE).showLatestMedalPopDialog(fragmentActivity, popMedalData, new Function0() { // from class: w3i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PopMedalListRepo.startObservingPopupMedalData$lambda$1$lambda$0(this.f37514a, medalToPopLiveData);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startObservingPopupMedalData$lambda$1$lambda$0(PopMedalListRepo this$0, MutableLiveData medalToPopLiveData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(medalToPopLiveData, "$medalToPopLiveData");
        this$0.removePoppedMedalFromSp();
        if (this$0.isMedalListEmpty()) {
            this$0.setShouldPullPopMedalData(true);
        } else {
            medalToPopLiveData.setValue(this$0.getFirstMedal());
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.medal.export.IPopMedalListRepo
    public boolean cameFromMedalDetailPage() {
        boolean come_from_medal_detail_page = PopMedalDataPreference.INSTANCE.getCOME_FROM_MEDAL_DETAIL_PAGE();
        Logger.d(TAG, "comeFromMedalDetailActivity=" + come_from_medal_detail_page);
        return come_from_medal_detail_page;
    }

    @Override // com.xiaomi.fitness.medal.export.IPopMedalListRepo
    @Nullable
    public PopMedalData getFirstMedal() {
        List<PopMedalData> popMedalList = getPopMedalList();
        PopMedalData popMedalData = popMedalList != null ? popMedalList.get(0) : null;
        Logger.d(TAG, "getFirstMedalFromPopMedalDataSP firstMedal=" + popMedalData);
        return popMedalData;
    }

    @NotNull
    public final Gson getMGson() {
        Gson gson = this.mGson;
        if (gson != null) {
            return gson;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mGson");
        return null;
    }

    @Override // com.xiaomi.fitness.medal.export.IPopMedalListRepo
    @Nullable
    public List<PopMedalData> getPopMedalList() {
        String pop_medal_list_json = PopMedalDataPreference.INSTANCE.getPOP_MEDAL_LIST_JSON();
        if (Intrinsics.areEqual(pop_medal_list_json, "")) {
            return null;
        }
        return ((PopMedalDataList) getMGson().fromJson(pop_medal_list_json, PopMedalDataList.class)).getPopMedalDataList();
    }

    @Override // com.xiaomi.fitness.medal.export.IPopMedalListRepo
    public boolean getShouldPullPopMedalData() {
        return PopMedalDataPreference.INSTANCE.getSHOULD_PULL_POP_MEDAL_DATA_FROM_NETWORK();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fitness.medal.export.IPopMedalListRepo
    public boolean isMedalListEmpty() {
        boolean z;
        if (getPopMedalList() != null) {
            List<PopMedalData> popMedalList = getPopMedalList();
            Intrinsics.checkNotNull(popMedalList);
            if (popMedalList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        Logger.d("PopMedalTest", "getPopMedalListFromSp is Empty=" + z);
        if (z) {
            setShouldPullPopMedalData(true);
        }
        return z;
    }

    @Override // com.xiaomi.fitness.medal.export.IPopMedalListRepo
    public void removePoppedMedalFromSp() {
        List<PopMedalData> popMedalList = getPopMedalList();
        if (isMedalListEmpty()) {
            return;
        }
        Intrinsics.checkNotNull(popMedalList);
        ListExtKt.remove(popMedalList, 0);
        if (popMedalList.isEmpty()) {
            setShouldPullPopMedalData(true);
        }
        PopMedalDataPreference.INSTANCE.setPOP_MEDAL_LIST_JSON(getMGson().toJson(new PopMedalDataList(popMedalList)));
        Logger.d("removeMedalAlreadyPoppedFromSp", "running");
    }

    @Override // com.xiaomi.fitness.medal.export.IPopMedalListRepo
    public void savePopMedalList(@NotNull List<PopMedalData> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        PopMedalDataPreference.INSTANCE.setPOP_MEDAL_LIST_JSON(getMGson().toJson(new PopMedalDataList(list)));
    }

    public final void setMGson(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "<set-?>");
        this.mGson = gson;
    }

    @Override // com.xiaomi.fitness.medal.export.IPopMedalListRepo
    public void setShouldPullPopMedalData(boolean shouldPull) {
        PopMedalDataPreference.INSTANCE.setSHOULD_PULL_POP_MEDAL_DATA_FROM_NETWORK(shouldPull);
    }

    @Override // com.xiaomi.fitness.medal.export.IPopMedalListRepo
    public void showPopupDialogIfNeed(@NotNull final MutableLiveData<PopMedalData> medalToPopLiveData) {
        Intrinsics.checkNotNullParameter(medalToPopLiveData, "medalToPopLiveData");
        Logger.d(TAG, "showPopMedalDialogIfNeed shouldPullData = " + getShouldPullPopMedalData());
        if (RegionPreference.INSTANCE.getSyncWeb()) {
            if (getShouldPullPopMedalData()) {
                MedalManagerExtKt.getInstance(MedalManager.INSTANCE).requestAllTypeMedalPopupList(new Function1() { // from class: v3i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PopMedalListRepo.showPopupDialogIfNeed$lambda$2(this.f36439a, medalToPopLiveData, (List) obj);
                    }
                });
            } else {
                handlePopMedalData(medalToPopLiveData);
            }
        }
    }

    @Override // com.xiaomi.fitness.medal.export.IPopMedalListRepo
    public void startObservingPopupMedalData(@NotNull final MutableLiveData<PopMedalData> medalToPopLiveData, @NotNull final FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(medalToPopLiveData, "medalToPopLiveData");
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        medalToPopLiveData.observe(fragmentActivity, new PopMedalListRepo$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: x3i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PopMedalListRepo.startObservingPopupMedalData$lambda$1(fragmentActivity, this, medalToPopLiveData, (PopMedalData) obj);
            }
        }));
    }
}
