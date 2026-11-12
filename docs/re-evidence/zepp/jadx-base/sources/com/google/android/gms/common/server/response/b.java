package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class b implements FastParser.a<Integer> {
    @Override // com.google.android.gms.common.server.response.FastParser.a
    @Nullable
    public final /* synthetic */ Integer a(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        return Integer.valueOf(fastParser.r(bufferedReader));
    }
}
