package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.ai.api.intent.DomainType;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes7.dex */
public class PoiTagCategory implements DomainType {
    private Optional<String> category1 = Optional.a();
    private Optional<String> category2 = Optional.a();
    private Optional<String> category3 = Optional.a();
    private Optional<String> code = Optional.a();

    public Optional<String> getCategory1() {
        return this.category1;
    }

    public Optional<String> getCategory2() {
        return this.category2;
    }

    public Optional<String> getCategory3() {
        return this.category3;
    }

    public Optional<String> getCode() {
        return this.code;
    }

    public PoiTagCategory setCategory1(String str) {
        this.category1 = Optional.e(str);
        return this;
    }

    public PoiTagCategory setCategory2(String str) {
        this.category2 = Optional.e(str);
        return this;
    }

    public PoiTagCategory setCategory3(String str) {
        this.category3 = Optional.e(str);
        return this;
    }

    public PoiTagCategory setCode(String str) {
        this.code = Optional.e(str);
        return this;
    }
}
