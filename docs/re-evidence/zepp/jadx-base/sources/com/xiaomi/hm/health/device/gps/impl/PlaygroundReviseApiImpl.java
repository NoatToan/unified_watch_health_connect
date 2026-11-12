package com.xiaomi.hm.health.device.gps.impl;

import com.huami.algo.sportapp.CurrentPlaygroundSportParam;
import com.huami.algo.sportapp.GPSDeltaCoordinatePoint;
import com.huami.algo.sportapp.PlaygroundTemplateParam;
import com.huami.algo.sportapp.SportsAlgoForAppJni;
import com.xiaomi.hm.health.device.gps.PlaygroundReviseApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/gps/impl/PlaygroundReviseApiImpl;", "Lcom/xiaomi/hm/health/device/gps/PlaygroundReviseApi;", "", "Lcom/huami/algo/sportapp/GPSDeltaCoordinatePoint;", "inputPoints", "Lcom/huami/algo/sportapp/CurrentPlaygroundSportParam;", "reviseParam", "Lcom/huami/algo/sportapp/PlaygroundTemplateParam;", "templateParam", "revise", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class PlaygroundReviseApiImpl implements PlaygroundReviseApi {
    public PlaygroundReviseApiImpl() {
        System.loadLibrary("sportsAlgoForApp");
    }

    @Override // com.xiaomi.hm.health.device.gps.PlaygroundReviseApi
    @NotNull
    public List<GPSDeltaCoordinatePoint> revise(@NotNull List<GPSDeltaCoordinatePoint> inputPoints, @NotNull CurrentPlaygroundSportParam reviseParam, @NotNull PlaygroundTemplateParam templateParam) {
        SportsAlgoForAppJni sportsAlgoForAppJni = new SportsAlgoForAppJni();
        ArrayList arrayList = new ArrayList();
        sportsAlgoForAppJni.reviseGPSPointInPlayground(inputPoints, reviseParam, templateParam, arrayList);
        return arrayList;
    }
}
