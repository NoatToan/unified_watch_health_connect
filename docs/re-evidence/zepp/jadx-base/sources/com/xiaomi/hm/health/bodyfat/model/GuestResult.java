package com.xiaomi.hm.health.bodyfat.model;

import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class GuestResult {
    public List<List<ScoreParamsObject>> a;
    public int b;
    public int c;
    public float d;

    public int getBodyShapeType() {
        return this.b;
    }

    public List<List<ScoreParamsObject>> getList() {
        return this.a;
    }

    public int getScore() {
        return this.c;
    }

    public float getWeightKg() {
        return this.d;
    }

    public void setBodyShapeType(int i) {
        this.b = i;
    }

    public void setList(List<List<ScoreParamsObject>> list) {
        this.a = list;
    }

    public void setScore(int i) {
        this.c = i;
    }

    public void setWeightKg(float f) {
        this.d = f;
    }
}
