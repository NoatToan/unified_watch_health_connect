package com.google.android.gms.common.server.response;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
final class zag implements FastParser.zaa<BigInteger> {
    @Override // com.google.android.gms.common.server.response.FastParser.zaa
    public final /* synthetic */ BigInteger zah(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        return fastParser.zaf(bufferedReader);
    }
}
