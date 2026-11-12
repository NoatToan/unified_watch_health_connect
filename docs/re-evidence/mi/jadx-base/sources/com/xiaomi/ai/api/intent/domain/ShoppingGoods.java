package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class ShoppingGoods<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> brand;

    @Required
    private T entity_type;
    private Optional<Slot<String>> name = Optional.a();

    public static class config implements EntityType {
        public static config read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new config();
        }

        public static c4h write(config configVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class evaluation implements EntityType {
        public static evaluation read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new evaluation();
        }

        public static c4h write(evaluation evaluationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class howBuy implements EntityType {
        public static howBuy read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new howBuy();
        }

        public static c4h write(howBuy howbuy) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class newProd implements EntityType {
        public static newProd read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new newProd();
        }

        public static c4h write(newProd newprod) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class panicBuying implements EntityType {
        public static panicBuying read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new panicBuying();
        }

        public static c4h write(panicBuying panicbuying) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class parameter implements EntityType {

        @Required
        private Slot<String> name;

        public parameter() {
        }

        public parameter(Slot<String> slot) {
            this.name = slot;
        }

        public static parameter read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            parameter parameterVar = new parameter();
            parameterVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return parameterVar;
        }

        public static c4h write(parameter parameterVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(parameterVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public parameter setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class price implements EntityType {
        public static price read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new price();
        }

        public static c4h write(price priceVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class review implements EntityType {

        @Required
        private Slot<String> object_name;

        @Required
        private Slot<String> source_name;

        public review() {
        }

        public review(Slot<String> slot, Slot<String> slot2) {
            this.source_name = slot;
            this.object_name = slot2;
        }

        public static review read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            review reviewVar = new review();
            reviewVar.setSourceName(IntentUtils.readSlot(zsdVar.w("source_name"), String.class));
            reviewVar.setObjectName(IntentUtils.readSlot(zsdVar.w("object_name"), String.class));
            return reviewVar;
        }

        public static c4h write(review reviewVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("source_name", IntentUtils.writeSlot(reviewVar.source_name));
            c4hVarCreateObjectNode.f0("object_name", IntentUtils.writeSlot(reviewVar.object_name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getObjectName() {
            return this.object_name;
        }

        @Required
        public Slot<String> getSourceName() {
            return this.source_name;
        }

        @Required
        public review setObjectName(Slot<String> slot) {
            this.object_name = slot;
            return this;
        }

        @Required
        public review setSourceName(Slot<String> slot) {
            this.source_name = slot;
            return this;
        }
    }

    public static class stock implements EntityType {
        public static stock read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new stock();
        }

        public static c4h write(stock stockVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public ShoppingGoods() {
    }

    public static ShoppingGoods read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        ShoppingGoods shoppingGoods = new ShoppingGoods(IntentUtils.readEntityType(zsdVar, AIApiConstants.ShoppingGoods.NAME, optional));
        shoppingGoods.setBrand(IntentUtils.readSlot(zsdVar.w(CommonConstants.KEY_BRAND), String.class));
        if (zsdVar.z("name")) {
            shoppingGoods.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        return shoppingGoods;
    }

    public static zsd write(ShoppingGoods shoppingGoods) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(shoppingGoods.entity_type);
        c4hVar.f0(CommonConstants.KEY_BRAND, IntentUtils.writeSlot(shoppingGoods.brand));
        if (shoppingGoods.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(shoppingGoods.name.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public Slot<String> getBrand() {
        return this.brand;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    @Required
    public ShoppingGoods setBrand(Slot<String> slot) {
        this.brand = slot;
        return this;
    }

    @Required
    public ShoppingGoods setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public ShoppingGoods setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public ShoppingGoods(T t) {
        this.entity_type = t;
    }

    public ShoppingGoods(T t, Slot<String> slot) {
        this.entity_type = t;
        this.brand = slot;
    }
}
