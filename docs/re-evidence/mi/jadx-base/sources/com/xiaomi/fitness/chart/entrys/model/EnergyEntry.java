package com.xiaomi.fitness.chart.entrys.model;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import defpackage.aji;
import defpackage.x44;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class EnergyEntry extends RecyclerBarEntry {
    public static final int ENERGY_TYPE_NONE = 0;
    public static final int ENERGY_TYPE_PRESS = 2;
    public static final int ENERGY_TYPE_RECOVERY = 3;
    public static final int ENERGY_TYPE_SPORT = 1;
    public static final int MAX_ENERGY_VALUE = 100;
    public static final int MIN_ENERGY_VALUE = -100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11770a;

    public EnergyEntry() {
    }

    public static int a(Context context, int i) {
        if (i == 1) {
            return x44.a(aji.G);
        }
        if (i != 2) {
            return i != 3 ? x44.a(aji.F) : x44.a(aji.F);
        }
        return x44.a(aji.E);
    }

    @Override // com.github.mikephil.charting.data.Entry
    public String toString() {
        return "EnergyEntry{energyType=" + this.f11770a + ", timestamp=" + this.timestamp + ", type=" + this.type + ", value=" + getY() + AbstractJsonLexerKt.END_OBJ;
    }

    public EnergyEntry(int i, float f, long j, int i2) {
        super(i, f, j, i2);
    }
}
