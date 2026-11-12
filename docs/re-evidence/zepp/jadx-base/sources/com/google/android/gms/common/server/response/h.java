package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
final class h implements FastParser.a<BigInteger> {
    @Override // com.google.android.gms.common.server.response.FastParser.a
    @Nullable
    public final /* synthetic */ BigInteger a(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        return fastParser.v(bufferedReader);
    }
}
