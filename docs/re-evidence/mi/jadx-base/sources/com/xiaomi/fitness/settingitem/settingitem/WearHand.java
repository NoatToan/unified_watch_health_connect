package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class WearHand {

    @SerializedName("way")
    @Expose
    private Way way = Way.fromValue("LEFT_HAND");

    public enum Way {
        LEFT_HAND("LEFT_HAND"),
        RIGHT_HAND("RIGHT_HAND");

        private static final Map<String, Way> CONSTANTS = new HashMap();
        private final String value;

        static {
            for (Way way : values()) {
                CONSTANTS.put(way.value, way);
            }
        }

        Way(String str) {
            this.value = str;
        }

        public static Way fromValue(String str) {
            Way way = CONSTANTS.get(str);
            if (way != null) {
                return way;
            }
            throw new IllegalArgumentException(str);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WearHand)) {
            return false;
        }
        Way way = this.way;
        Way way2 = ((WearHand) obj).way;
        if (way != way2) {
            return way != null && way.equals(way2);
        }
        return true;
    }

    public Way getWay() {
        return this.way;
    }

    public int hashCode() {
        Way way = this.way;
        return 31 + (way == null ? 0 : way.hashCode());
    }

    public void setWay(Way way) {
        this.way = way;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WearHand.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("way");
        sb.append('=');
        Object obj = this.way;
        if (obj == null) {
            obj = "<null>";
        }
        sb.append(obj);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
