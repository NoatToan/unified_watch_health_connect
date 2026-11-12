package com.huami.algo.sportapp;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ5\u0010\u000b\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086 ¨\u0006\u000e"}, d2 = {"Lcom/huami/algo/sportapp/SportsAlgoForAppJni;", "", "", "Lcom/huami/algo/sportapp/GPSDeltaCoordinatePoint;", "inputPoints", "Lcom/huami/algo/sportapp/CurrentPlaygroundSportParam;", "reviseParam", "Lcom/huami/algo/sportapp/PlaygroundTemplateParam;", "templateParam", "outputPoints", "", "reviseGPSPointInPlayground", "<init>", "()V", "sportapp_release"}, k = 1, mv = {1, 5, 1})
public final class SportsAlgoForAppJni {
    public final native void reviseGPSPointInPlayground(@NotNull List<GPSDeltaCoordinatePoint> inputPoints, @NotNull CurrentPlaygroundSportParam reviseParam, @NotNull PlaygroundTemplateParam templateParam, @NotNull List<GPSDeltaCoordinatePoint> outputPoints);
}
