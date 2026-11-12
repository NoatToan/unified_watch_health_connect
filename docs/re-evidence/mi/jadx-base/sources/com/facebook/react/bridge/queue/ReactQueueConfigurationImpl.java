package com.facebook.react.bridge.queue;

import android.os.Looper;
import defpackage.e4f;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ReactQueueConfigurationImpl implements ReactQueueConfiguration {
    private final MessageQueueThreadImpl mJSQueueThread;
    private final MessageQueueThreadImpl mNativeModulesQueueThread;
    private final MessageQueueThreadImpl mUIQueueThread;

    private ReactQueueConfigurationImpl(MessageQueueThreadImpl messageQueueThreadImpl, MessageQueueThreadImpl messageQueueThreadImpl2, MessageQueueThreadImpl messageQueueThreadImpl3) {
        this.mUIQueueThread = messageQueueThreadImpl;
        this.mNativeModulesQueueThread = messageQueueThreadImpl2;
        this.mJSQueueThread = messageQueueThreadImpl3;
    }

    public static ReactQueueConfigurationImpl create(ReactQueueConfigurationSpec reactQueueConfigurationSpec, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        HashMap mapB = e4f.b();
        MessageQueueThreadSpec messageQueueThreadSpecMainThreadSpec = MessageQueueThreadSpec.mainThreadSpec();
        MessageQueueThreadImpl messageQueueThreadImplCreate = MessageQueueThreadImpl.create(messageQueueThreadSpecMainThreadSpec, queueThreadExceptionHandler);
        mapB.put(messageQueueThreadSpecMainThreadSpec, messageQueueThreadImplCreate);
        MessageQueueThreadImpl messageQueueThreadImplCreate2 = (MessageQueueThreadImpl) mapB.get(reactQueueConfigurationSpec.getJSQueueThreadSpec());
        if (messageQueueThreadImplCreate2 == null) {
            messageQueueThreadImplCreate2 = MessageQueueThreadImpl.create(reactQueueConfigurationSpec.getJSQueueThreadSpec(), queueThreadExceptionHandler);
        }
        MessageQueueThreadImpl messageQueueThreadImplCreate3 = (MessageQueueThreadImpl) mapB.get(reactQueueConfigurationSpec.getNativeModulesQueueThreadSpec());
        if (messageQueueThreadImplCreate3 == null) {
            messageQueueThreadImplCreate3 = MessageQueueThreadImpl.create(reactQueueConfigurationSpec.getNativeModulesQueueThreadSpec(), queueThreadExceptionHandler);
        }
        return new ReactQueueConfigurationImpl(messageQueueThreadImplCreate, messageQueueThreadImplCreate3, messageQueueThreadImplCreate2);
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    public void destroy() {
        if (this.mNativeModulesQueueThread.getLooper() != Looper.getMainLooper()) {
            this.mNativeModulesQueueThread.quitSynchronous();
        }
        if (this.mJSQueueThread.getLooper() != Looper.getMainLooper()) {
            this.mJSQueueThread.quitSynchronous();
        }
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    public MessageQueueThread getJSQueueThread() {
        return this.mJSQueueThread;
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    public MessageQueueThread getNativeModulesQueueThread() {
        return this.mNativeModulesQueueThread;
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    public MessageQueueThread getUIQueueThread() {
        return this.mUIQueueThread;
    }
}
