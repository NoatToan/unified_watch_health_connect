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
public class RedPacketHelper<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public enum RPHelperFunction {
        FromWhoGetMost(1, "FromWhoGetMost"),
        WhichGroupSendMost(2, "WhichGroupSendMost");

        private int id;
        private String name;

        RPHelperFunction(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static RPHelperFunction find(String str) {
            for (RPHelperFunction rPHelperFunction : values()) {
                if (rPHelperFunction.name.equals(str)) {
                    return rPHelperFunction;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static RPHelperFunction read(String str) {
            return find(str);
        }

        public static String write(RPHelperFunction rPHelperFunction) {
            return rPHelperFunction.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class function implements EntityType {

        @Required
        private Slot<RPHelperFunction> type;

        public function() {
        }

        public function(Slot<RPHelperFunction> slot) {
            this.type = slot;
        }

        public static function read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            function functionVar = new function();
            functionVar.setType(IntentUtils.readSlot(zsdVar.w("type"), RPHelperFunction.class));
            return functionVar;
        }

        public static c4h write(function functionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(functionVar.type));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<RPHelperFunction> getType() {
            return this.type;
        }

        @Required
        public function setType(Slot<RPHelperFunction> slot) {
            this.type = slot;
            return this;
        }
    }

    public static class info implements EntityType {
        public static info read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new info();
        }

        public static c4h write(info infoVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class moreSetting implements EntityType {
        public static moreSetting read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new moreSetting();
        }

        public static c4h write(moreSetting moresetting) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class notification implements EntityType {
        public static notification read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new notification();
        }

        public static c4h write(notification notificationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class quickPattern implements EntityType {
        public static quickPattern read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new quickPattern();
        }

        public static c4h write(quickPattern quickpattern) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class suspensionWindow implements EntityType {
        public static suspensionWindow read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new suspensionWindow();
        }

        public static c4h write(suspensionWindow suspensionwindow) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public RedPacketHelper() {
    }

    public static RedPacketHelper read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new RedPacketHelper(IntentUtils.readEntityType(zsdVar, AIApiConstants.RedPacketHelper.NAME, optional));
    }

    public static zsd write(RedPacketHelper redPacketHelper) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(redPacketHelper.entity_type);
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
    public RedPacketHelper setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public RedPacketHelper(T t) {
        this.entity_type = t;
    }
}
