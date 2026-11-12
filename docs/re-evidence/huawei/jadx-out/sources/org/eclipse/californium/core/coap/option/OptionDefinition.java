package org.eclipse.californium.core.coap.option;

import defpackage.zvc;
import org.eclipse.californium.core.coap.OptionNumberRegistry;

/* JADX INFO: loaded from: classes20.dex */
public interface OptionDefinition {
    void assertValue(byte[] bArr);

    zvc create(long j);

    zvc create(String str);

    zvc create(byte[] bArr);

    OptionNumberRegistry.OptionFormat getFormat();

    String getName();

    int getNumber();

    @Deprecated
    int[] getValueLengths();

    boolean isSingleValue();

    String toString();
}
