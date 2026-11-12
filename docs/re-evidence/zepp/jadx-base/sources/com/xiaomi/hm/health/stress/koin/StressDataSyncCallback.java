package com.xiaomi.hm.health.stress.koin;

import com.huami.stress.domain.data.device.bean.StressDeviceBean;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMPressureData;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.IHMPressureDataCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\f¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016R.\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0002j\b\u0012\u0004\u0012\u00020\u000f`\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/stress/koin/StressDataSyncCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/IHMPressureDataCallback;", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "Lkotlin/collections/ArrayList;", "list", "", "onPressureData", "onPressureStart", "", "result", "onPressureStop", "Lkotlin/coroutines/Continuation;", "Lkotlin/Pair;", "", "Lcom/huami/stress/domain/data/device/bean/StressDeviceBean;", "a", "Lkotlin/coroutines/Continuation;", "continuation", "b", "Ljava/util/ArrayList;", "data", "<init>", "(Lkotlin/coroutines/Continuation;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class StressDataSyncCallback implements IHMPressureDataCallback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Continuation<Pair<Boolean, ? extends List<StressDeviceBean>>> continuation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private ArrayList<StressDeviceBean> data = new ArrayList<>();

    /* JADX WARN: Multi-variable type inference failed */
    public StressDataSyncCallback(@NotNull Continuation<? super Pair<Boolean, ? extends List<StressDeviceBean>>> continuation) {
        this.continuation = continuation;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.pressure.IHMPressureDataCallback
    public void onPressureData(@NotNull ArrayList<HMPressureData> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            HMPressureData hMPressureData = (HMPressureData) obj;
            if ((hMPressureData.inVaild() || hMPressureData.repeat()) ? false : true) {
                arrayList.add(obj);
            }
        }
        ArrayList<StressDeviceBean> arrayList2 = this.data;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(StressExtKt.toStressDeviceBean((HMPressureData) it2.next()));
        }
        arrayList2.addAll(arrayList3);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.pressure.IHMPressureDataCallback
    public void onPressureStart() {
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.pressure.IHMPressureDataCallback
    public void onPressureStop(boolean result) {
        Continuation<Pair<Boolean, ? extends List<StressDeviceBean>>> continuation = this.continuation;
        Pair pair = new Pair(Boolean.valueOf(result), this.data);
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m3845constructorimpl(pair));
    }
}
