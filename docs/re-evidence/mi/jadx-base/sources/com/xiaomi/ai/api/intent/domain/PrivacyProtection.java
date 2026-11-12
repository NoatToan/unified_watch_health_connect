package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
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
public class PrivacyProtection<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<PrivacyProtectionSubPage>> page = Optional.a();

    public enum PrivacyProtectionSubPage {
        UsageReminder(1, "UsageReminder"),
        HighRisk(2, "HighRisk");

        private int id;
        private String name;

        PrivacyProtectionSubPage(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static PrivacyProtectionSubPage find(String str) {
            for (PrivacyProtectionSubPage privacyProtectionSubPage : values()) {
                if (privacyProtectionSubPage.name.equals(str)) {
                    return privacyProtectionSubPage;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static PrivacyProtectionSubPage read(String str) {
            return find(str);
        }

        public static String write(PrivacyProtectionSubPage privacyProtectionSubPage) {
            return privacyProtectionSubPage.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static PrivacyProtection read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PrivacyProtection privacyProtection = new PrivacyProtection();
        if (zsdVar.z("page")) {
            privacyProtection.setPage(IntentUtils.readSlot(zsdVar.w("page"), PrivacyProtectionSubPage.class));
        }
        return privacyProtection;
    }

    public static zsd write(PrivacyProtection privacyProtection) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (privacyProtection.page.c()) {
            c4hVarCreateObjectNode.f0("page", IntentUtils.writeSlot(privacyProtection.page.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<PrivacyProtectionSubPage>> getPage() {
        return this.page;
    }

    public PrivacyProtection setPage(Slot<PrivacyProtectionSubPage> slot) {
        this.page = Optional.e(slot);
        return this;
    }
}
