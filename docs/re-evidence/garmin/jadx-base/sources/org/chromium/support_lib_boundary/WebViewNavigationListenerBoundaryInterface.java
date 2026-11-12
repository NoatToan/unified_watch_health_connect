package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* JADX INFO: loaded from: classes3.dex */
public interface WebViewNavigationListenerBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    void onFirstContentfulPaint(InvocationHandler invocationHandler, long j8);

    void onNavigationCompleted(InvocationHandler invocationHandler);

    void onNavigationRedirected(InvocationHandler invocationHandler);

    void onNavigationStarted(InvocationHandler invocationHandler);

    void onPageDOMContentLoadedEventFired(InvocationHandler invocationHandler);

    void onPageDeleted(InvocationHandler invocationHandler);

    void onPageLoadEventFired(InvocationHandler invocationHandler);
}
