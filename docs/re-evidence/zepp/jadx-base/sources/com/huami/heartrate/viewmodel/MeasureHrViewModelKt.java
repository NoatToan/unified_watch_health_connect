package com.huami.heartrate.viewmodel;

import android.text.TextUtils;
import android.util.Base64;
import com.huami.heartrate.chart.HandleDataKt;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.huami.heartrate.repository.entity.RemoteHeartRateItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u001a\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004¨\u0006\u000b"}, d2 = {"", "Lcom/huami/heartrate/repository/entity/RemoteHeartRateItem;", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "convertHeartRate", "", "hrString", "", "type", "a", "rawData", "toHeartRate", "heartrate_release"}, k = 2, mv = {1, 5, 1})
public final class MeasureHrViewModelKt {
    private static final int a(String str, int i) {
        Object objM3845constructorimpl;
        int heartRate = i == 1 ? toHeartRate(str) : 0;
        if (HandleDataKt.isValidHeartRate().invoke(Integer.valueOf(heartRate)).booleanValue()) {
            return heartRate;
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(Base64.decode(str, 2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        byte[] bArr = (byte[]) objM3845constructorimpl;
        if (bArr == null) {
            return 0;
        }
        if (bArr.length == 0) {
            return 0;
        }
        return bArr[0] & 255;
    }

    @Nullable
    public static final List<HeartRateEntity> convertHeartRate(@Nullable List<RemoteHeartRateItem> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (RemoteHeartRateItem remoteHeartRateItem : list) {
            arrayList.add(new HeartRateEntity(Integer.valueOf(remoteHeartRateItem.getType() == 1 ? 2 : remoteHeartRateItem.getType()), -1, Integer.valueOf(remoteHeartRateItem.getDeviceSource()), remoteHeartRateItem.getGeneratedTime(), Integer.valueOf(a(remoteHeartRateItem.getHeartRateData(), remoteHeartRateItem.getType())), 1, 0, remoteHeartRateItem.getDeviceId(), null, 256, null));
        }
        return arrayList;
    }

    public static final int toHeartRate(@Nullable String str) {
        int iCharAt;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            String str2 = new String(Base64.decode(str, 0), Charsets.UTF_8);
            try {
                iCharAt = Integer.valueOf(str2).intValue();
            } catch (Exception e) {
                e.printStackTrace();
                iCharAt = str2.charAt(0);
            }
            return iCharAt;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }
}
