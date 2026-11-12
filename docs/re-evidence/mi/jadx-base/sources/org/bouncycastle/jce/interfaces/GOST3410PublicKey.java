package org.bouncycastle.jce.interfaces;

import defpackage.owa;
import java.math.BigInteger;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public interface GOST3410PublicKey extends PublicKey {
    /* synthetic */ owa getParameters();

    BigInteger getY();
}
