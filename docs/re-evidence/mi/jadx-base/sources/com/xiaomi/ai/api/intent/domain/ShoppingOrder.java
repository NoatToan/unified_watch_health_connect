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
public class ShoppingOrder<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<OrderSource>> source = Optional.a();

    public enum OrderSource {
        JingDong(1, "JingDong"),
        Taobao(2, AIApiConstants.Taobao.NAME),
        Xiaomi(3, "Xiaomi"),
        Cainiao(4, "Cainiao");

        private int id;
        private String name;

        OrderSource(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static OrderSource find(String str) {
            for (OrderSource orderSource : values()) {
                if (orderSource.name.equals(str)) {
                    return orderSource;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static OrderSource read(String str) {
            return find(str);
        }

        public static String write(OrderSource orderSource) {
            return orderSource.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class expressTrace implements EntityType {
        public static expressTrace read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new expressTrace();
        }

        public static c4h write(expressTrace expresstrace) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public ShoppingOrder() {
    }

    public static ShoppingOrder read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        ShoppingOrder shoppingOrder = new ShoppingOrder(IntentUtils.readEntityType(zsdVar, AIApiConstants.ShoppingOrder.NAME, optional));
        if (zsdVar.z("source")) {
            shoppingOrder.setSource(IntentUtils.readSlot(zsdVar.w("source"), OrderSource.class));
        }
        return shoppingOrder;
    }

    public static zsd write(ShoppingOrder shoppingOrder) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(shoppingOrder.entity_type);
        if (shoppingOrder.source.c()) {
            c4hVar.f0("source", IntentUtils.writeSlot(shoppingOrder.source.b()));
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

    public Optional<Slot<OrderSource>> getSource() {
        return this.source;
    }

    @Required
    public ShoppingOrder setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public ShoppingOrder setSource(Slot<OrderSource> slot) {
        this.source = Optional.e(slot);
        return this;
    }

    public ShoppingOrder(T t) {
        this.entity_type = t;
    }
}
