package com.xiaomi.ai.android.track;

import android.text.TextUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.log.Logger;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class g {
    private final ArrayNode a = APIUtils.getObjectMapper().createArrayNode();
    private final int b;

    public g(int i) {
        this.b = i * 2;
    }

    private String b(String str) {
        Date date;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split("]")[0].split("\\[");
        if (strArrSplit.length <= 1 || (date = new SimpleDateFormat("yyy-MM-dd HH:mm:ss.SSS", new Locale("CHINA")).parse(strArrSplit[1], new ParsePosition(0))) == null) {
            return "";
        }
        long time = date.getTime();
        return time > 0 ? String.valueOf(time) : "";
    }

    public synchronized int a() {
        return this.a.size();
    }

    public void a(ArrayNode arrayNode) {
        if (arrayNode == null || arrayNode.size() <= 0) {
            return;
        }
        synchronized (this) {
            arrayNode.addAll(this.a);
            this.a.removeAll();
            this.a.addAll(arrayNode);
        }
    }

    public synchronized void a(String str) {
        if (this.a.size() > this.b) {
            Logger.c("LogUpdateCache", "can not add more ", false);
        } else {
            this.a.add(str);
        }
    }

    public synchronized ArrayNode b() {
        ArrayNode arrayNodeDeepCopy;
        arrayNodeDeepCopy = this.a.deepCopy();
        this.a.removeAll();
        return arrayNodeDeepCopy;
    }

    public ObjectNode c() {
        Logger.a("LogUpdateCache", "getLog " + a());
        StringBuilder sb = new StringBuilder();
        synchronized (this) {
            ArrayNode arrayNode = this.a;
            if (arrayNode != null && arrayNode.size() != 0) {
                String strB = b(this.a.get(0).textValue());
                ArrayNode arrayNode2 = this.a;
                String strB2 = b(arrayNode2.get(arrayNode2.size() - 1).textValue());
                Iterator<JsonNode> it2 = this.a.iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next().textValue());
                    sb.append("\n");
                }
                this.a.removeAll();
                String string = sb.toString();
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                ObjectNode objectNodeCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
                objectNodeCreateObjectNode.put("startTime", strB);
                objectNodeCreateObjectNode.put("endTime", strB2);
                objectNodeCreateObjectNode.put("clientTime", String.valueOf(System.currentTimeMillis()));
                objectNodeCreateObjectNode.put("log", com.xiaomi.ai.android.utils.a.a(string, "utf-8"));
                return objectNodeCreateObjectNode;
            }
            return null;
        }
    }
}
