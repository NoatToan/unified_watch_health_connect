package com.google.maps.android;

import com.google.firebase.perf.FirebasePerformance;
import e23.p;
import fb1.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import jg.b;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/google/maps/android/Status;", "<anonymous>", "(Lo53/b0;)Lcom/google/maps/android/Status;"}, k = 3, mv = {2, 1, 0})
@e(c = "com.google.maps.android.StreetViewUtils$Companion$fetchStreetViewData$2", f = "StreetViewUtil.kt", l = {}, m = "invokeSuspend")
public final class StreetViewUtils$Companion$fetchStreetViewData$2 extends i implements p<b0, d<? super Status>, Object> {
    final /* synthetic */ String $urlString;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreetViewUtils$Companion$fetchStreetViewData$2(String str, d<? super StreetViewUtils$Companion$fetchStreetViewData$2> dVar) {
        super(2, dVar);
        this.$urlString = str;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new StreetViewUtils$Companion$fetchStreetViewData$2(this.$urlString, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Status> dVar) {
        return ((StreetViewUtils$Companion$fetchStreetViewData$2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws IOException {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        try {
            URLConnection uRLConnectionOpenConnection = new URL(this.$urlString).openConnection();
            uRLConnectionOpenConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.GET);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                throw new IOException("HTTP Error: " + responseCode);
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                String strE = lg.d.E(bufferedReader);
                bufferedReader.close();
                bufferedReader.close();
                inputStream.close();
                return StreetViewUtils.INSTANCE.deserializeResponse(strE).getStatus();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    b.l(bufferedReader, th3);
                    throw th4;
                }
            }
        } catch (IOException e4) {
            e4.printStackTrace();
            h.C(c.n("Network error: ", e4.getMessage()));
            return null;
        }
    }
}
