package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.miui.tsmclient.net.TSMAuthContants;
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
public class AliPay<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class antFarm implements EntityType {
        private Optional<Slot<Boolean>> feed_chicken = Optional.a();

        public static antFarm read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            antFarm antfarm = new antFarm();
            if (zsdVar.z("feed_chicken")) {
                antfarm.setFeedChicken(IntentUtils.readSlot(zsdVar.w("feed_chicken"), Boolean.class));
            }
            return antfarm;
        }

        public static c4h write(antFarm antfarm) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (antfarm.feed_chicken.c()) {
                c4hVarCreateObjectNode.f0("feed_chicken", IntentUtils.writeSlot(antfarm.feed_chicken.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Boolean>> getFeedChicken() {
            return this.feed_chicken;
        }

        public antFarm setFeedChicken(Slot<Boolean> slot) {
            this.feed_chicken = Optional.e(slot);
            return this;
        }
    }

    public static class antForest implements EntityType {
        private Optional<Slot<Boolean>> collect_energy = Optional.a();

        public static antForest read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            antForest antforest = new antForest();
            if (zsdVar.z("collect_energy")) {
                antforest.setCollectEnergy(IntentUtils.readSlot(zsdVar.w("collect_energy"), Boolean.class));
            }
            return antforest;
        }

        public static c4h write(antForest antforest) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (antforest.collect_energy.c()) {
                c4hVarCreateObjectNode.f0("collect_energy", IntentUtils.writeSlot(antforest.collect_energy.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Boolean>> getCollectEnergy() {
            return this.collect_energy;
        }

        public antForest setCollectEnergy(Slot<Boolean> slot) {
            this.collect_energy = Optional.e(slot);
            return this;
        }
    }

    public static class page implements EntityType {
        private Optional<Slot<String>> name = Optional.a();

        public static page read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            page pageVar = new page();
            if (zsdVar.z("name")) {
                pageVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            return pageVar;
        }

        public static c4h write(page pageVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (pageVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(pageVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public page setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class search implements EntityType {
        private Optional<Slot<String>> keyword = Optional.a();

        public static search read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            search searchVar = new search();
            if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
                searchVar.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
            }
            return searchVar;
        }

        public static c4h write(search searchVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (searchVar.keyword.c()) {
                c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(searchVar.keyword.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getKeyword() {
            return this.keyword;
        }

        public search setKeyword(Slot<String> slot) {
            this.keyword = Optional.e(slot);
            return this;
        }
    }

    public static class transfer implements EntityType {
        private Optional<Slot<Double>> amount = Optional.a();

        public static transfer read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            transfer transferVar = new transfer();
            if (zsdVar.z("amount")) {
                transferVar.setAmount(IntentUtils.readSlot(zsdVar.w("amount"), Double.class));
            }
            return transferVar;
        }

        public static c4h write(transfer transferVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (transferVar.amount.c()) {
                c4hVarCreateObjectNode.f0("amount", IntentUtils.writeSlot(transferVar.amount.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Double>> getAmount() {
            return this.amount;
        }

        public transfer setAmount(Slot<Double> slot) {
            this.amount = Optional.e(slot);
            return this;
        }
    }

    public AliPay() {
    }

    public static AliPay read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new AliPay(IntentUtils.readEntityType(zsdVar, AIApiConstants.AliPay.NAME, optional));
    }

    public static zsd write(AliPay aliPay) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(aliPay.entity_type);
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public AliPay setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public AliPay(T t) {
        this.entity_type = t;
    }
}
