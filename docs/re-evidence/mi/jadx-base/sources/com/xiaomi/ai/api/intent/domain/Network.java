package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Network<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<NetworkType>> type = Optional.a();
    private Optional<Slot<Miai.Duration>> delay = Optional.a();

    public enum NetworkType {
        Wifi(1, "Wifi"),
        PersonalHotspot(2, "PersonalHotspot"),
        Cellular(3, "Cellular"),
        Network5G(4, "Network5G");

        private int id;
        private String name;

        NetworkType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static NetworkType find(String str) {
            for (NetworkType networkType : values()) {
                if (networkType.name.equals(str)) {
                    return networkType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static NetworkType read(String str) {
            return find(str);
        }

        public static String write(NetworkType networkType) {
            return networkType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class additionalSetting implements EntityType {
        public static additionalSetting read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new additionalSetting();
        }

        public static c4h write(additionalSetting additionalsetting) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class dual4G implements EntityType {
        public static dual4G read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new dual4G();
        }

        public static c4h write(dual4G dual4g) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class dualWifiSpeedUp implements EntityType {
        public static dualWifiSpeedUp read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new dualWifiSpeedUp();
        }

        public static c4h write(dualWifiSpeedUp dualwifispeedup) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class internetSpeed implements EntityType {
        public static internetSpeed read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new internetSpeed();
        }

        public static c4h write(internetSpeed internetspeed) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class settings implements EntityType {
        public static settings read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new settings();
        }

        public static c4h write(settings settingsVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class status implements EntityType {
        public static status read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new status();
        }

        public static c4h write(status statusVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Network() {
    }

    public static Network read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Network network = new Network(IntentUtils.readEntityType(zsdVar, "Network", optional));
        if (zsdVar.z("type")) {
            network.setType(IntentUtils.readSlot(zsdVar.w("type"), NetworkType.class));
        }
        if (zsdVar.z("delay")) {
            network.setDelay(IntentUtils.readSlot(zsdVar.w("delay"), Miai.Duration.class));
        }
        return network;
    }

    public static zsd write(Network network) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(network.entity_type);
        if (network.type.c()) {
            c4hVar.f0("type", IntentUtils.writeSlot(network.type.b()));
        }
        if (network.delay.c()) {
            c4hVar.f0("delay", IntentUtils.writeSlot(network.delay.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.Duration>> getDelay() {
        return this.delay;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<NetworkType>> getType() {
        return this.type;
    }

    public Network setDelay(Slot<Miai.Duration> slot) {
        this.delay = Optional.e(slot);
        return this;
    }

    @Required
    public Network setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Network setType(Slot<NetworkType> slot) {
        this.type = Optional.e(slot);
        return this;
    }

    public Network(T t) {
        this.entity_type = t;
    }
}
