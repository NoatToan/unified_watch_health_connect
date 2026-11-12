package com.beaglebuddy.ape;

import com.beaglebuddy.exception.ParseException;

/* JADX INFO: loaded from: classes2.dex */
public class APEHeader extends APEFooter {
    public APEHeader(byte[] bArr) throws ParseException {
        super(bArr, "header");
    }

    @Override // com.beaglebuddy.ape.APEFooter
    public String toString() {
        return toString("header");
    }
}
