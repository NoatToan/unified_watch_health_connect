package org.bouncycastle.jce.interfaces;

import defpackage.t38;
import java.math.BigInteger;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPublicKey;

/* JADX INFO: loaded from: classes3.dex */
public interface ElGamalPublicKey extends DHKey, DHPublicKey {
    /* synthetic */ t38 getParameters();

    BigInteger getY();
}
