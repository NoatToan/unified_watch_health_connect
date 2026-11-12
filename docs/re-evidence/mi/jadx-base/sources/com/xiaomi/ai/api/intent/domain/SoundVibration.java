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
public class SoundVibration<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<SubPage>> page = Optional.a();

    public enum SubPage {
        Assistant(1, "assistant"),
        DontDisturb(2, "dontDisturb"),
        CallShow(3, "callShow"),
        More(4, "more"),
        Quality(5, "quality"),
        Dubi(6, "dubi"),
        Earphone(7, "earphone");

        private int id;
        private String name;

        SubPage(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SubPage find(String str) {
            for (SubPage subPage : values()) {
                if (subPage.name.equals(str)) {
                    return subPage;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SubPage read(String str) {
            return find(str);
        }

        public static String write(SubPage subPage) {
            return subPage.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static SoundVibration read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        SoundVibration soundVibration = new SoundVibration();
        if (zsdVar.z("page")) {
            soundVibration.setPage(IntentUtils.readSlot(zsdVar.w("page"), SubPage.class));
        }
        return soundVibration;
    }

    public static zsd write(SoundVibration soundVibration) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (soundVibration.page.c()) {
            c4hVarCreateObjectNode.f0("page", IntentUtils.writeSlot(soundVibration.page.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<SubPage>> getPage() {
        return this.page;
    }

    public SoundVibration setPage(Slot<SubPage> slot) {
        this.page = Optional.e(slot);
        return this;
    }
}
