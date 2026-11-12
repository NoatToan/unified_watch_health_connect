package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
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
public class BatteryPerformance<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<BatteryIndicatorPage>> page = Optional.a();

    public enum BatteryIndicator {
        Percentage(1, "Percentage");

        private int id;
        private String name;

        BatteryIndicator(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static BatteryIndicator find(String str) {
            for (BatteryIndicator batteryIndicator : values()) {
                if (batteryIndicator.name.equals(str)) {
                    return batteryIndicator;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static BatteryIndicator read(String str) {
            return find(str);
        }

        public static String write(BatteryIndicator batteryIndicator) {
            return batteryIndicator.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum BatteryIndicatorPage {
        PowerPerformance(1, "powerPerformance"),
        PowerManagement(2, "powerManagement"),
        UsageStatistics(3, "usageStatistics");

        private int id;
        private String name;

        BatteryIndicatorPage(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static BatteryIndicatorPage find(String str) {
            for (BatteryIndicatorPage batteryIndicatorPage : values()) {
                if (batteryIndicatorPage.name.equals(str)) {
                    return batteryIndicatorPage;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static BatteryIndicatorPage read(String str) {
            return find(str);
        }

        public static String write(BatteryIndicatorPage batteryIndicatorPage) {
            return batteryIndicatorPage.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class endurance implements EntityType {
        public static endurance read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new endurance();
        }

        public static c4h write(endurance enduranceVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class indicator implements EntityType {
        private Optional<Slot<BatteryIndicator>> name = Optional.a();

        public static indicator read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            indicator indicatorVar = new indicator();
            if (zsdVar.z("name")) {
                indicatorVar.setName(IntentUtils.readSlot(zsdVar.w("name"), BatteryIndicator.class));
            }
            return indicatorVar;
        }

        public static c4h write(indicator indicatorVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (indicatorVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(indicatorVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<BatteryIndicator>> getName() {
            return this.name;
        }

        public indicator setName(Slot<BatteryIndicator> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class usageStats implements EntityType {
        public static usageStats read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new usageStats();
        }

        public static c4h write(usageStats usagestats) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public BatteryPerformance() {
    }

    public static BatteryPerformance read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        BatteryPerformance batteryPerformance = new BatteryPerformance(IntentUtils.readEntityType(zsdVar, AIApiConstants.BatteryPerformance.NAME, optional));
        if (zsdVar.z("page")) {
            batteryPerformance.setPage(IntentUtils.readSlot(zsdVar.w("page"), BatteryIndicatorPage.class));
        }
        return batteryPerformance;
    }

    public static zsd write(BatteryPerformance batteryPerformance) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(batteryPerformance.entity_type);
        if (batteryPerformance.page.c()) {
            c4hVar.f0("page", IntentUtils.writeSlot(batteryPerformance.page.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<BatteryIndicatorPage>> getPage() {
        return this.page;
    }

    @Required
    public BatteryPerformance setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public BatteryPerformance setPage(Slot<BatteryIndicatorPage> slot) {
        this.page = Optional.e(slot);
        return this;
    }

    public BatteryPerformance(T t) {
        this.entity_type = t;
    }
}
