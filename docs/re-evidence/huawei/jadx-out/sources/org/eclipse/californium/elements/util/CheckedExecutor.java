package org.eclipse.californium.elements.util;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes20.dex */
public interface CheckedExecutor extends Executor {
    void assertOwner();

    boolean checkOwner();
}
