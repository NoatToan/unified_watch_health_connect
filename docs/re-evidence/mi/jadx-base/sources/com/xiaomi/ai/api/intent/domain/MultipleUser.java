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
public class MultipleUser<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<SettingOpt>> opt = Optional.a();

    public enum SettingOpt {
        Setting(1, "setting"),
        MiAccount(2, "miAccount"),
        PersonalCenter(3, "personalCenter"),
        MultiUser(4, "multiUser");

        private int id;
        private String name;

        SettingOpt(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SettingOpt find(String str) {
            for (SettingOpt settingOpt : values()) {
                if (settingOpt.name.equals(str)) {
                    return settingOpt;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SettingOpt read(String str) {
            return find(str);
        }

        public static String write(SettingOpt settingOpt) {
            return settingOpt.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static MultipleUser read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        MultipleUser multipleUser = new MultipleUser();
        if (zsdVar.z("opt")) {
            multipleUser.setOpt(IntentUtils.readSlot(zsdVar.w("opt"), SettingOpt.class));
        }
        return multipleUser;
    }

    public static zsd write(MultipleUser multipleUser) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (multipleUser.opt.c()) {
            c4hVarCreateObjectNode.f0("opt", IntentUtils.writeSlot(multipleUser.opt.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<SettingOpt>> getOpt() {
        return this.opt;
    }

    public MultipleUser setOpt(Slot<SettingOpt> slot) {
        this.opt = Optional.e(slot);
        return this;
    }
}
