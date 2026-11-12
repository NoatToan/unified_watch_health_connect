package org.bouncycastle.jce.interfaces;

import defpackage.t38;
import java.math.BigInteger;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public interface ElGamalPrivateKey extends DHKey, DHPrivateKey {
    /* synthetic */ t38 getParameters();

    BigInteger getX();
}
