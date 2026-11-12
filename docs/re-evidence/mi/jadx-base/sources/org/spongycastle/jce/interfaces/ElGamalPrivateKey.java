package org.spongycastle.jce.interfaces;

import defpackage.s38;
import java.math.BigInteger;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public interface ElGamalPrivateKey extends DHKey, DHPrivateKey {
    /* synthetic */ s38 getParameters();

    BigInteger getX();
}
