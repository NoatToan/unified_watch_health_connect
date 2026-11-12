package ch.qos.logback.core.net.server;

import ch.qos.logback.core.net.server.Client;

/* JADX INFO: loaded from: classes7.dex */
public interface ClientVisitor<T extends Client> {
    void visit(T t7);
}
