package com.huami.watch.dataflow.exchange;

import com.huami.watch.dataflow.exchange.Action;

/* JADX INFO: loaded from: classes16.dex */
public interface ISync<T extends Action> {
    void onAdd(T t, ActionResult actionResult);

    void onDelete(T t, ActionResult actionResult);

    void onQuery(T t, ActionResult actionResult);

    void onUpdate(T t, ActionResult actionResult);
}
