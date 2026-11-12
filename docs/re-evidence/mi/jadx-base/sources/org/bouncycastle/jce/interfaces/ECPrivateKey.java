package org.bouncycastle.jce.interfaces;

import defpackage.f97;
import java.math.BigInteger;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public interface ECPrivateKey extends PrivateKey {
    BigInteger getD();

    /* synthetic */ f97 getParameters();
}
