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
public class Security<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<SecurityPage>> page = Optional.a();

    public enum SecurityPage {
        FaceUnlock(1, "faceUnlock"),
        FingerUnlock(2, "fingerUnlock"),
        PasswordUnlock(3, "passwordUnlock"),
        BluetoothUnlock(4, "bluetoothUnlock"),
        PrivacyPassword(5, "privacyPassword"),
        PasswordManage(6, "passwordManage"),
        Sos(7, "sos"),
        SystemSecurity(8, "systemSecurity");

        private int id;
        private String name;

        SecurityPage(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SecurityPage find(String str) {
            for (SecurityPage securityPage : values()) {
                if (securityPage.name.equals(str)) {
                    return securityPage;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SecurityPage read(String str) {
            return find(str);
        }

        public static String write(SecurityPage securityPage) {
            return securityPage.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class account implements EntityType {
        public static account read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new account();
        }

        public static c4h write(account accountVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class setting implements EntityType {
        public static setting read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new setting();
        }

        public static c4h write(setting settingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Security() {
    }

    public static Security read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Security security = new Security(IntentUtils.readEntityType(zsdVar, AIApiConstants.Security.NAME, optional));
        if (zsdVar.z("page")) {
            security.setPage(IntentUtils.readSlot(zsdVar.w("page"), SecurityPage.class));
        }
        return security;
    }

    public static zsd write(Security security) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(security.entity_type);
        if (security.page.c()) {
            c4hVar.f0("page", IntentUtils.writeSlot(security.page.b()));
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

    public Optional<Slot<SecurityPage>> getPage() {
        return this.page;
    }

    @Required
    public Security setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Security setPage(Slot<SecurityPage> slot) {
        this.page = Optional.e(slot);
        return this;
    }

    public Security(T t) {
        this.entity_type = t;
    }
}
