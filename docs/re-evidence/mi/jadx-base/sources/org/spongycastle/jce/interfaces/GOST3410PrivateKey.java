package org.spongycastle.jce.interfaces;

import defpackage.nwa;
import java.math.BigInteger;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public interface GOST3410PrivateKey extends PrivateKey {
    /* synthetic */ nwa getParameters();

    BigInteger getX();
}
