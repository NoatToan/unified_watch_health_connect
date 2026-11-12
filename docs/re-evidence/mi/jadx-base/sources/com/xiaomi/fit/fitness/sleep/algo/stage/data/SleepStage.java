package com.xiaomi.fit.fitness.sleep.algo.stage.data;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class SleepStage {
    public long endTime;
    public long startTime;
    public int state;

    public String toString() {
        return "SleepStage{state = " + this.state + ", startTime = " + this.startTime + ", endTime = " + this.endTime + AbstractJsonLexerKt.END_OBJ;
    }
}
