package com.xiaomi.fitness.sync.export.model;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.component.Constants;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import defpackage.ob2;
import java.util.List;
import java.util.Random;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class StockModel {

    public static class StockHost {

        @SerializedName("hqlist")
        public String hqlist;

        @SerializedName("oauth")
        public String oauth;

        public String getHost() {
            String[] strArrSplit = this.hqlist.split(";");
            return strArrSplit.length > 1 ? strArrSplit[new Random().nextInt(strArrSplit.length)] : strArrSplit[0];
        }

        public String getOauthHost() {
            return this.oauth;
        }

        public String toString() {
            return "StockHost{hqlist='" + this.hqlist + "', oauth='" + this.oauth + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class StockInfo extends ob2 {

        @SerializedName("error")
        public String error;

        @SerializedName("items")
        public List<Item> items;

        @SerializedName(Constants.KEY_PAY_RESULT_RET)
        public int ret;

        @SerializedName("serverTime")
        public Long serverTime;

        public static class Item {

            @SerializedName("delay")
            public Integer delay;

            @SerializedName("halted")
            public Float halted;

            @SerializedName("latestPrice")
            public Float latestPrice;

            @SerializedName("market")
            public String market;

            @SerializedName("nameCN")
            public String nameCN;

            @SerializedName("preClose")
            public Float preClose;

            @SerializedName("secType")
            public String secType;

            @SerializedName("symbol")
            public String symbol;

            @SerializedName("timestamp")
            public Long timestamp;

            public String toString() {
                return "Item{symbol='" + this.symbol + "', market='" + this.market + "', secType='" + this.secType + "', nameCN='" + this.nameCN + "', latestPrice=" + this.latestPrice + ", timestamp=" + this.timestamp + ", preClose=" + this.preClose + ", halted=" + this.halted + ", delay=" + this.delay + AbstractJsonLexerKt.END_OBJ;
            }
        }

        @Override // defpackage.ob2
        public int getCode() {
            return this.ret;
        }

        @Override // defpackage.ob2
        public String getMsg() {
            return this.error;
        }

        @Override // defpackage.ob2
        public boolean oK() {
            return this.ret == 0;
        }

        public String toString() {
            return "StockInfo{error='" + this.error + "', ret=" + this.ret + ", serverTime=" + this.serverTime + ", items=" + this.items + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class StockSuggestResult extends ob2 {

        @SerializedName("error")
        public String error;

        @SerializedName("items")
        public List<Item> items;

        @SerializedName(Constants.KEY_PAY_RESULT_RET)
        public int ret;

        @SerializedName("serverTime")
        public Long serverTime;

        public static class Item {

            @SerializedName("halted")
            public Integer halted;

            @SerializedName("market")
            public String market;

            @SerializedName("nameCN")
            public String nameCN;

            @SerializedName("symbol")
            public String symbol;

            @SerializedName("type")
            public Integer type;
        }

        @Override // defpackage.ob2
        public int getCode() {
            return this.ret;
        }

        @Override // defpackage.ob2
        public String getMsg() {
            return this.error;
        }

        @Override // defpackage.ob2
        public boolean oK() {
            return this.ret == 0;
        }
    }

    public static class StockToken {

        @SerializedName(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2)
        public String access_token;

        @SerializedName(XiaomiOAuthConstants.EXTRA_EXPIRES_IN_2)
        public Long expires_in;

        @SerializedName("refresh_token")
        public String refresh_token;

        @SerializedName("scopes")
        public String scopes;

        @SerializedName(XiaomiOAuthConstants.EXTRA_TOKEN_TYPE_2)
        public String token_type;

        @SerializedName("uuid")
        public Long uuid;

        public String toString() {
            return "StockToken{scopes='" + this.scopes + "', uuid=" + this.uuid + ", access_token='" + this.access_token + "', expires_in=" + this.expires_in + ", token_type='" + this.token_type + "', refresh_token='" + this.refresh_token + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }
}
