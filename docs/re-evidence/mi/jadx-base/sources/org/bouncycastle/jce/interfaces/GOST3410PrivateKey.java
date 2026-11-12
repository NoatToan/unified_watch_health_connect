package org.bouncycastle.jce.interfaces;

import defpackage.owa;
import java.math.BigInteger;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public interface GOST3410PrivateKey extends PrivateKey {
    /* synthetic */ owa getParameters();

    BigInteger getX();
}
