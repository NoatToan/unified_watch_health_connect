package com.xiaomi.ai.api.intent;

import com.xiaomi.common.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Slot<V> {
    private List<V> values;
    private Optional<List<Resolution>> resolution = Optional.a();
    private Optional<ValueRelation> relation = Optional.a();
    private Optional<String> expression = Optional.a();
    private Optional<List<Double>> scores = Optional.a();
    private Optional<Integer> hits = Optional.a();

    public Slot() {
    }

    public static <V> Slot<V> newInstance(V v) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(v);
        Slot<V> slot = new Slot<>(arrayList);
        slot.setExpression(Optional.e(v.toString()));
        return slot;
    }

    public Optional<String> getExpression() {
        return this.expression;
    }

    public Optional<Integer> getHits() {
        return this.hits;
    }

    public Optional<ValueRelation> getRelation() {
        return this.relation;
    }

    public Optional<List<Resolution>> getResolution() {
        return this.resolution;
    }

    public Optional<List<Double>> getScores() {
        return this.scores;
    }

    public List<V> getValues() {
        return this.values;
    }

    public Slot<V> resolution(Resolution[] resolutionArr) {
        this.resolution = Optional.d(Arrays.asList(resolutionArr));
        return this;
    }

    public Optional<Double> score() {
        return Optional.e(this.scores.c() ? null : this.scores.b().get(0));
    }

    public void setExpression(Optional<String> optional) {
        this.expression = optional;
    }

    public void setHits(Optional<Integer> optional) {
        this.hits = optional;
    }

    public void setRelation(Optional<ValueRelation> optional) {
        this.relation = optional;
    }

    public void setResolution(Optional<List<Resolution>> optional) {
        this.resolution = optional;
    }

    public void setScores(Optional<List<Double>> optional) {
        this.scores = optional;
    }

    public V value() {
        return this.values.get(0);
    }

    public static <V> Slot<V> newInstance(V v, Resolution resolution) {
        Slot<V> slotNewInstance = newInstance(v);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(resolution);
        slotNewInstance.setResolution(Optional.d(arrayList));
        slotNewInstance.setExpression(Optional.e(v.toString()));
        return slotNewInstance;
    }

    public Slot(List<V> list) {
        this.values = list;
    }

    public static <V> Slot<V> newInstance(V v, List<Resolution> list) {
        Slot<V> slotNewInstance = newInstance(v);
        slotNewInstance.setResolution(Optional.d(list));
        slotNewInstance.setExpression(Optional.e(v.toString()));
        return slotNewInstance;
    }
}
