package com.xiaomi.fitness.data.model;

import defpackage.n9f;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class VO2MaxModel implements Serializable {
    public int age;
    public boolean isFemale;
    public n9f maxMinModel;
    public int value;

    public VO2MaxModel() {
    }

    public VO2MaxModel(int i) {
        this.value = i;
    }

    public float getValueRange() {
        n9f n9fVar = this.maxMinModel;
        return n9fVar.f27681a - n9fVar.f27682b;
    }
}
