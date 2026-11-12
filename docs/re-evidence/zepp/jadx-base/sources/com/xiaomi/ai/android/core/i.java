package com.xiaomi.ai.android.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.log.Logger;

/* JADX INFO: loaded from: classes18.dex */
public class i {
    private ObjectNode a;
    private ObjectNode b;
    private ObjectNode c;
    private ObjectMapper d = APIUtils.getObjectMapper();

    public synchronized void a() {
        this.a = this.d.createObjectNode();
        this.b = this.d.createObjectNode();
        this.c = this.d.createObjectNode();
    }

    public synchronized void a(String str) {
        a(str, System.currentTimeMillis());
    }

    public synchronized void a(String str, long j) {
        ObjectNode objectNode = this.b;
        if (objectNode != null) {
            objectNode.put(str, j);
        } else {
            Logger.b("TraceManager", "traceTimeStamps: not startTrace");
        }
    }

    public synchronized void a(String str, String str2) {
        ObjectNode objectNode = this.c;
        if (objectNode != null) {
            objectNode.put(str, str2);
        } else {
            Logger.b("TraceManager", "traceResult2: not startTrace");
        }
    }

    public synchronized ObjectNode b() {
        ObjectNode objectNode;
        ObjectNode objectNode2 = this.a;
        if (objectNode2 == null || this.b == null || (objectNode = this.c) == null) {
            return null;
        }
        objectNode2.set("result", objectNode);
        this.a.set("timestamps", this.b);
        ObjectNode objectNodeDeepCopy = this.a.deepCopy();
        this.b.removeAll();
        this.c.removeAll();
        this.a.removeAll();
        this.c = null;
        this.b = null;
        this.a = null;
        return objectNodeDeepCopy;
    }

    public synchronized void b(String str) {
        ObjectNode objectNode = this.a;
        if (objectNode != null) {
            objectNode.put(DbUtils.Const.Columns.Event.EVENT_ID, str);
        } else {
            Logger.b("TraceManager", "traceRequestId: not startTrace");
        }
    }

    public synchronized void b(String str, long j) {
        ObjectNode objectNode = this.c;
        if (objectNode != null) {
            objectNode.put(str, j);
        } else {
            Logger.b("TraceManager", "traceResult: not startTrace");
        }
    }
}
