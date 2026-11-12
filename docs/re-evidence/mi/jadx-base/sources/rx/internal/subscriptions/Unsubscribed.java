package rx.internal.subscriptions;

import defpackage.koo;

/* JADX INFO: loaded from: classes3.dex */
public enum Unsubscribed implements koo {
    INSTANCE;

    @Override // defpackage.koo
    public boolean isUnsubscribed() {
        return true;
    }

    @Override // defpackage.koo
    public void unsubscribe() {
    }
}
