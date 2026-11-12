package org.conscrypt;

import java.net.Socket;

/* JADX INFO: loaded from: classes3.dex */
public class KitKatPlatformOpenSSLSocketAdapterFactory extends BaseOpenSSLSocketAdapterFactory {
    public KitKatPlatformOpenSSLSocketAdapterFactory(OpenSSLSocketFactoryImpl openSSLSocketFactoryImpl) {
        super(openSSLSocketFactoryImpl);
    }

    @Override // org.conscrypt.BaseOpenSSLSocketAdapterFactory
    public Socket wrap(OpenSSLSocketImpl openSSLSocketImpl) {
        return new KitKatPlatformOpenSSLSocketImplAdapter(openSSLSocketImpl);
    }
}
