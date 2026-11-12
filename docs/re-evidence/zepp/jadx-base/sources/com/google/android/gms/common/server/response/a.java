package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class a implements FastParser.a<Long> {
    @Override // com.google.android.gms.common.server.response.FastParser.a
    @Nullable
    public final /* synthetic */ Long a(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        return Long.valueOf(fastParser.s(bufferedReader));
    }
}
