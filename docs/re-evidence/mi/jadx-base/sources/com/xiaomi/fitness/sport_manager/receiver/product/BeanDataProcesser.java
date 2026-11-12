package com.xiaomi.fitness.sport_manager.receiver.product;

import com.xiaomi.fitness.sport_manager.sensor.SportSensorResult;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import defpackage.arc;
import defpackage.crc;
import defpackage.f2o;
import defpackage.gv9;
import defpackage.x7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/receiver/product/BeanDataProcesser;", "Larc;", "Lcom/xiaomi/fitness/sport_manager/sensor/SportSensorResult;", "sportSensorResult", "", "onReceivePhoneSensorData", "(Lcom/xiaomi/fitness/sport_manager/sensor/SportSensorResult;)V", "Lx7r;", "sportData", "onReceiveWearData", "(Lx7r;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/SportLocationResult;", "locationResult", "onReceivePhoneLocationData", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportLocationResult;)V", "Lcrc;", "iSportDataCenter", "Lcrc;", "getISportDataCenter", "()Lcrc;", "setISportDataCenter", "(Lcrc;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/SportLocationResult;", "<init>", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BeanDataProcesser implements arc {

    @NotNull
    private crc iSportDataCenter;

    @Nullable
    private SportLocationResult locationResult;

    public BeanDataProcesser(@NotNull crc iSportDataCenter) {
        Intrinsics.checkNotNullParameter(iSportDataCenter, "iSportDataCenter");
        this.iSportDataCenter = iSportDataCenter;
    }

    @NotNull
    public final crc getISportDataCenter() {
        return this.iSportDataCenter;
    }

    @Override // defpackage.arc
    public void onReceivePhoneLocationData(@NotNull SportLocationResult locationResult) {
        Intrinsics.checkNotNullParameter(locationResult, "locationResult");
        this.locationResult = locationResult;
    }

    @Override // defpackage.arc
    public void onReceivePhoneSensorData(@NotNull SportSensorResult sportSensorResult) {
        Intrinsics.checkNotNullParameter(sportSensorResult, "sportSensorResult");
    }

    @Override // defpackage.arc
    public void onReceiveWearData(@NotNull x7r sportData) {
        Intrinsics.checkNotNullParameter(sportData, "sportData");
        PhoneSportData phoneSportData = new PhoneSportData();
        phoneSportData.duration = (int) f2o.x().J();
        phoneSportData.sportType = f2o.x().T();
        SportLocationResult sportLocationResult = this.locationResult;
        phoneSportData.location = sportLocationResult != null ? sportLocationResult.getLocation() : null;
        phoneSportData.distance = sportData.f;
        SportLocationResult sportLocationResult2 = this.locationResult;
        phoneSportData.gpsAccuracyStatus = sportLocationResult2 != null ? sportLocationResult2.getGpsAccuracyStatus() : 0;
        phoneSportData.calorie = sportData.f38797a;
        phoneSportData.step = sportData.f38798b;
        phoneSportData.heart_rate = sportData.c;
        int i = sportData.n;
        phoneSportData.stride = i;
        int i2 = sportData.h;
        phoneSportData.stride_frequency = i2;
        phoneSportData.maxHr = sportData.d;
        phoneSportData.minHr = sportData.e;
        gv9.a aVar = sportData.g;
        if (aVar != null) {
            phoneSportData.lowBattery = aVar.d;
            phoneSportData.modeChanged = aVar.c;
        }
        phoneSportData.revolutionCount = sportData.m;
        phoneSportData.runStyle = sportData.i;
        phoneSportData.impact = sportData.j;
        phoneSportData.onGround = sportData.f38799k;
        phoneSportData.offGround = sportData.l;
        phoneSportData.sportLocationResult = this.locationResult;
        phoneSportData.stride = i;
        phoneSportData.onOffRatio = sportData.o;
        phoneSportData.pace = sportData.p;
        phoneSportData.speed = sportData.q;
        phoneSportData.stepRate = i2 / 60;
        this.iSportDataCenter.a(phoneSportData);
    }

    public final void setISportDataCenter(@NotNull crc crcVar) {
        Intrinsics.checkNotNullParameter(crcVar, "<set-?>");
        this.iSportDataCenter = crcVar;
    }
}
