package org.eclipse.californium.core.server.resources;

import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.observe.ObserveRelation;

/* JADX INFO: loaded from: classes20.dex */
public interface ObservableResource {
    void addObserveRelation(ObserveRelation observeRelation);

    int getNotificationSequenceNumber();

    CoAP.Type getObserveType();

    int getObserverCount();

    String getURI();

    boolean isObservable();

    void removeObserveRelation(ObserveRelation observeRelation);
}
