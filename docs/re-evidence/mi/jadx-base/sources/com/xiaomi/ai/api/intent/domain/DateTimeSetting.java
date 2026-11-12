package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.common.MRnCrossModuleConst;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class DateTimeSetting<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<DateTimeSubPage>> page = Optional.a();

    public enum DateTimeSubPage {
        TimeZone(1, MRnCrossModuleConst.TimezoneActivity.KEY_TIMEZONE),
        ClockStyle(2, "ClockStyle"),
        DualClock(3, "DualClock"),
        SecondClock(4, "SecondClock");

        private int id;
        private String name;

        DateTimeSubPage(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static DateTimeSubPage find(String str) {
            for (DateTimeSubPage dateTimeSubPage : values()) {
                if (dateTimeSubPage.name.equals(str)) {
                    return dateTimeSubPage;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static DateTimeSubPage read(String str) {
            return find(str);
        }

        public static String write(DateTimeSubPage dateTimeSubPage) {
            return dateTimeSubPage.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static DateTimeSetting read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        DateTimeSetting dateTimeSetting = new DateTimeSetting();
        if (zsdVar.z("page")) {
            dateTimeSetting.setPage(IntentUtils.readSlot(zsdVar.w("page"), DateTimeSubPage.class));
        }
        return dateTimeSetting;
    }

    public static zsd write(DateTimeSetting dateTimeSetting) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (dateTimeSetting.page.c()) {
            c4hVarCreateObjectNode.f0("page", IntentUtils.writeSlot(dateTimeSetting.page.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<DateTimeSubPage>> getPage() {
        return this.page;
    }

    public DateTimeSetting setPage(Slot<DateTimeSubPage> slot) {
        this.page = Optional.e(slot);
        return this;
    }
}
