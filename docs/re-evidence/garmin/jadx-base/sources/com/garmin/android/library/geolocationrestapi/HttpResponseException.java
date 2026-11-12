package com.garmin.android.library.geolocationrestapi;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d53.c;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/library/geolocationrestapi/HttpResponseException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "responseCode", "", TtmlNode.TAG_BODY, "", "<init>", "(I[B)V", "geolocation-rest-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HttpResponseException extends RuntimeException {
    public HttpResponseException(int i14, byte[] bArr) {
        super(sn.a.e(i14, "response code [", "]: ", bArr != null ? new String(bArr, c.f57666b) : null));
    }
}
