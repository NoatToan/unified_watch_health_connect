package com.braintreepayments.api;

import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes21.dex */
public interface HttpResponseParser {
    String parse(int i, HttpURLConnection httpURLConnection) throws Exception;
}
