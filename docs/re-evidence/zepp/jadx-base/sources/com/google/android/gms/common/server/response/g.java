package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
final class g implements FastParser.a<BigDecimal> {
    @Override // com.google.android.gms.common.server.response.FastParser.a
    @Nullable
    public final /* synthetic */ BigDecimal a(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        return fastParser.z(bufferedReader);
    }
}
