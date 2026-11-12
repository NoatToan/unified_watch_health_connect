package org.spongycastle.jce.interfaces;

import defpackage.e97;
import java.math.BigInteger;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public interface ECPrivateKey extends PrivateKey {
    BigInteger getD();

    /* synthetic */ e97 getParameters();
}
