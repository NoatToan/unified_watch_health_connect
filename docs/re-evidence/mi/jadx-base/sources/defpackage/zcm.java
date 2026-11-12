package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.impl.SimpleLogger;

/* JADX INFO: loaded from: classes3.dex */
public class zcm implements stc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentMap<String, qpe> f41127a = new ConcurrentHashMap();

    @Override // defpackage.stc
    public qpe a(String str) {
        qpe qpeVar = this.f41127a.get(str);
        if (qpeVar != null) {
            return qpeVar;
        }
        SimpleLogger simpleLogger = new SimpleLogger(str);
        qpe qpeVarPutIfAbsent = this.f41127a.putIfAbsent(str, simpleLogger);
        return qpeVarPutIfAbsent == null ? simpleLogger : qpeVarPutIfAbsent;
    }
}
