package com.xiaomi.fitness.sport.bean;

import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/sport/bean/SportingData;", "", "<init>", "()V", "list", "", "Lcom/xiaomi/fitness/sport/bean/SportingItemData;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "map", "", "Lcom/xiaomi/fitness/sport/model/CommonSportModel$SportTitle;", "", "getMap", "()Ljava/util/Map;", "setMap", "(Ljava/util/Map;)V", "locationResult", "Lcom/xiaomi/fitness/sport_manager_export/data/SportLocationResult;", "getLocationResult", "setLocationResult", "phoneSportData", "Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "getPhoneSportData", "()Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "setPhoneSportData", "(Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;)V", "duration", "", "getDuration", "()I", "setDuration", "(I)V", "distance", "getDistance", "setDistance", "calorie", "", "getCalorie", "()F", "setCalorie", "(F)V", "avePace", "getAvePace", "setAvePace", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportingData {
    private int avePace;

    @Nullable
    private PhoneSportData phoneSportData;

    @NotNull
    private List<SportingItemData> list = new ArrayList();

    @NotNull
    private Map<CommonSportModel.SportTitle, String> map = new HashMap();

    @NotNull
    private List<SportLocationResult> locationResult = new ArrayList();
    private int duration = -1;
    private int distance = -1;
    private float calorie = -1.0f;

    public final int getAvePace() {
        return this.avePace;
    }

    public final float getCalorie() {
        return this.calorie;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final List<SportingItemData> getList() {
        return this.list;
    }

    @NotNull
    public final List<SportLocationResult> getLocationResult() {
        return this.locationResult;
    }

    @NotNull
    public final Map<CommonSportModel.SportTitle, String> getMap() {
        return this.map;
    }

    @Nullable
    public final PhoneSportData getPhoneSportData() {
        return this.phoneSportData;
    }

    public final void setAvePace(int i) {
        this.avePace = i;
    }

    public final void setCalorie(float f) {
        this.calorie = f;
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setList(@NotNull List<SportingItemData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.list = list;
    }

    public final void setLocationResult(@NotNull List<SportLocationResult> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.locationResult = list;
    }

    public final void setMap(@NotNull Map<CommonSportModel.SportTitle, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.map = map;
    }

    public final void setPhoneSportData(@Nullable PhoneSportData phoneSportData) {
        this.phoneSportData = phoneSportData;
    }
}
