package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.ai.api.intent.DomainType;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Route implements DomainType {
    private Optional<Integer> index = Optional.a();
    private Optional<String> feature = Optional.a();
    private Optional<List<String>> prefer = Optional.a();

    public Optional<String> getFeature() {
        return this.feature;
    }

    public Optional<Integer> getIndex() {
        return this.index;
    }

    public Optional<List<String>> getPrefer() {
        return this.prefer;
    }

    public Route setFeature(String str) {
        this.feature = Optional.e(str);
        return this;
    }

    public Route setIndex(int i) {
        this.index = Optional.e(Integer.valueOf(i));
        return this;
    }

    public Route setPrefer(List<String> list) {
        this.prefer = Optional.e(list);
        return this;
    }
}
