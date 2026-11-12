package org.spongycastle.jce.interfaces;

import defpackage.nwa;
import java.math.BigInteger;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public interface GOST3410PublicKey extends PublicKey {
    /* synthetic */ nwa getParameters();

    BigInteger getY();
}
