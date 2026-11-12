package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
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
public class Stock<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> code;

    @Required
    private Slot<Miai.Datetime> datetime;

    @Required
    private T entity_type;

    @Required
    private Slot<IndexType> index;

    @Required
    private Slot<MarketCode> market_code;

    @Required
    private Slot<String> name;

    @Required
    private Slot<SecurityType> type;

    public enum IndexType {
        f34(0, "当前股价"),
        f33(1, "开盘价"),
        f37(2, "收盘价"),
        f39(3, "最高价"),
        f38(4, "最低价"),
        f35(5, "成交量"),
        f36(6, "成交额"),
        f31(7, "市值"),
        f32(8, "市盈率"),
        f41(9, "涨跌额"),
        f40(10, "涨跌幅");

        private int id;
        private String name;

        IndexType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static IndexType find(String str) {
            for (IndexType indexType : values()) {
                if (indexType.name.equals(str)) {
                    return indexType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static IndexType read(String str) {
            return find(str);
        }

        public static String write(IndexType indexType) {
            return indexType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum MarketCode {
        Unknown(0, "Unknown"),
        SHExchange(1, "SHExchange"),
        SZExchange(2, "SZExchange"),
        AmericanMarket(3, "AmericanMarket"),
        HKMarket(4, "HKMarket"),
        SHIndex(5, "SHIndex"),
        SZIndex(6, "SZIndex"),
        AmericanIndex(7, "AmericanIndex"),
        HKIndex(8, "HKIndex"),
        ChinaMarket(9, "ChinaMarket");

        private int id;
        private String name;

        MarketCode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static MarketCode find(String str) {
            for (MarketCode marketCode : values()) {
                if (marketCode.name.equals(str)) {
                    return marketCode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static MarketCode read(String str) {
            return find(str);
        }

        public static String write(MarketCode marketCode) {
            return marketCode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum SecurityType {
        Stock(1, "stock"),
        Future(2, "future");

        private int id;
        private String name;

        SecurityType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SecurityType find(String str) {
            for (SecurityType securityType : values()) {
                if (securityType.name.equals(str)) {
                    return securityType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SecurityType read(String str) {
            return find(str);
        }

        public static String write(SecurityType securityType) {
            return securityType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
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

    public static class subscribed implements EntityType {
        public static subscribed read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new subscribed();
        }

        public static c4h write(subscribed subscribedVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Stock() {
    }

    public static Stock read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Stock stock = new Stock(IntentUtils.readEntityType(zsdVar, AIApiConstants.Stock.NAME, optional));
        stock.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        stock.setCode(IntentUtils.readSlot(zsdVar.w("code"), String.class));
        stock.setType(IntentUtils.readSlot(zsdVar.w("type"), SecurityType.class));
        stock.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
        stock.setMarketCode(IntentUtils.readSlot(zsdVar.w("market_code"), MarketCode.class));
        stock.setIndex(IntentUtils.readSlot(zsdVar.w("index"), IndexType.class));
        return stock;
    }

    public static zsd write(Stock stock) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(stock.entity_type);
        c4hVar.f0("name", IntentUtils.writeSlot(stock.name));
        c4hVar.f0("code", IntentUtils.writeSlot(stock.code));
        c4hVar.f0("type", IntentUtils.writeSlot(stock.type));
        c4hVar.f0("datetime", IntentUtils.writeSlot(stock.datetime));
        c4hVar.f0("market_code", IntentUtils.writeSlot(stock.market_code));
        c4hVar.f0("index", IntentUtils.writeSlot(stock.index));
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public Slot<String> getCode() {
        return this.code;
    }

    @Required
    public Slot<Miai.Datetime> getDatetime() {
        return this.datetime;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public Slot<IndexType> getIndex() {
        return this.index;
    }

    @Required
    public Slot<MarketCode> getMarketCode() {
        return this.market_code;
    }

    @Required
    public Slot<String> getName() {
        return this.name;
    }

    @Required
    public Slot<SecurityType> getType() {
        return this.type;
    }

    @Required
    public Stock setCode(Slot<String> slot) {
        this.code = slot;
        return this;
    }

    @Required
    public Stock setDatetime(Slot<Miai.Datetime> slot) {
        this.datetime = slot;
        return this;
    }

    @Required
    public Stock setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public Stock setIndex(Slot<IndexType> slot) {
        this.index = slot;
        return this;
    }

    @Required
    public Stock setMarketCode(Slot<MarketCode> slot) {
        this.market_code = slot;
        return this;
    }

    @Required
    public Stock setName(Slot<String> slot) {
        this.name = slot;
        return this;
    }

    @Required
    public Stock setType(Slot<SecurityType> slot) {
        this.type = slot;
        return this;
    }

    public Stock(T t) {
        this.entity_type = t;
    }

    public Stock(T t, Slot<String> slot, Slot<String> slot2, Slot<SecurityType> slot3, Slot<Miai.Datetime> slot4, Slot<MarketCode> slot5, Slot<IndexType> slot6) {
        this.entity_type = t;
        this.name = slot;
        this.code = slot2;
        this.type = slot3;
        this.datetime = slot4;
        this.market_code = slot5;
        this.index = slot6;
    }
}
