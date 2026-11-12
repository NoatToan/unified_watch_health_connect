package org.eclipse.californium.core.network;

import defpackage.zvd;
import defpackage.zve;
import defpackage.zvf;
import defpackage.zvg;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.eclipse.californium.core.network.interceptors.MessageInterceptor;
import org.eclipse.californium.core.observe.NotificationListener;
import org.eclipse.californium.core.server.MessageDeliverer;
import org.eclipse.californium.elements.config.Configuration;

/* JADX INFO: loaded from: classes20.dex */
public interface Endpoint {
    void addInterceptor(MessageInterceptor messageInterceptor);

    void addNotificationListener(NotificationListener notificationListener);

    void addObserver(EndpointObserver endpointObserver);

    void addPostProcessInterceptor(MessageInterceptor messageInterceptor);

    void cancelObservation(zve zveVar);

    void clear();

    void destroy();

    InetSocketAddress getAddress();

    Configuration getConfig();

    List<MessageInterceptor> getInterceptors();

    List<MessageInterceptor> getPostProcessInterceptors();

    URI getUri();

    boolean isStarted();

    void removeInterceptor(MessageInterceptor messageInterceptor);

    void removeNotificationListener(NotificationListener notificationListener);

    void removeObserver(EndpointObserver endpointObserver);

    void removePostProcessInterceptor(MessageInterceptor messageInterceptor);

    void sendEmptyMessage(Exchange exchange, zvd zvdVar);

    void sendRequest(zvg zvgVar);

    void sendResponse(Exchange exchange, zvf zvfVar);

    void setExecutors(ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2);

    void setMessageDeliverer(MessageDeliverer messageDeliverer);

    void start() throws IOException;

    void stop();
}
