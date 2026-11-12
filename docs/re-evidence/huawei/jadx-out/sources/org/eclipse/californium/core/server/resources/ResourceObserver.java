package org.eclipse.californium.core.server.resources;

import org.eclipse.californium.core.observe.ObserveRelation;

/* JADX INFO: loaded from: classes46.dex */
public interface ResourceObserver {
    void addedChild(Resource resource);

    void addedObserveRelation(ObserveRelation observeRelation);

    void changedName(String str);

    void changedPath(String str);

    void removedChild(Resource resource);

    void removedObserveRelation(ObserveRelation observeRelation);
}
