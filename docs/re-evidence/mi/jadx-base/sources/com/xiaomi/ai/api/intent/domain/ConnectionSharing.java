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
public class ConnectionSharing<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public enum ConnectionSharingPage {
        Hotspot(1, "hotspot"),
        PersonalDNS(2, "personalDNS"),
        MiMutualTrans(3, "miMutualTrans");

        private int id;
        private String name;

        ConnectionSharingPage(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static ConnectionSharingPage find(String str) {
            for (ConnectionSharingPage connectionSharingPage : values()) {
                if (connectionSharingPage.name.equals(str)) {
                    return connectionSharingPage;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static ConnectionSharingPage read(String str) {
            return find(str);
        }

        public static String write(ConnectionSharingPage connectionSharingPage) {
            return connectionSharingPage.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class apn implements EntityType {
        public static apn read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new apn();
        }

        public static c4h write(apn apnVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class setting implements EntityType {
        private Optional<Slot<ConnectionSharingPage>> page = Optional.a();

        public static setting read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            setting settingVar = new setting();
            if (zsdVar.z("page")) {
                settingVar.setPage(IntentUtils.readSlot(zsdVar.w("page"), ConnectionSharingPage.class));
            }
            return settingVar;
        }

        public static c4h write(setting settingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (settingVar.page.c()) {
                c4hVarCreateObjectNode.f0("page", IntentUtils.writeSlot(settingVar.page.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<ConnectionSharingPage>> getPage() {
            return this.page;
        }

        public setting setPage(Slot<ConnectionSharingPage> slot) {
            this.page = Optional.e(slot);
            return this;
        }
    }

    public static class vpn implements EntityType {
        public static vpn read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new vpn();
        }

        public static c4h write(vpn vpnVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public ConnectionSharing() {
    }

    public static ConnectionSharing read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new ConnectionSharing(IntentUtils.readEntityType(zsdVar, AIApiConstants.ConnectionSharing.NAME, optional));
    }

    public static zsd write(ConnectionSharing connectionSharing) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(connectionSharing.entity_type);
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
    public ConnectionSharing setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public ConnectionSharing(T t) {
        this.entity_type = t;
    }
}
