package fq1;

import am.v1;
import android.content.Context;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq1/c;", "Lfq1/s;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements s {
    @Override // fq1.s
    public final Object b(Context context, t13.d<? super Unit> dVar) throws IOException {
        GarminConnectMobileApp.f28685g.getClass();
        Context contextA = GarminConnectMobileApp.a.a();
        v1 v1Var = v1.f4245a;
        InputStream inputStreamOpenRawResource = contextA.getResources().openRawResource(R.raw.difficulties_indoor_climb);
        inputStreamOpenRawResource.getClass();
        Charset charset = d53.c.f57666b;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, charset), 8192);
        try {
            String strE = lg.d.E(bufferedReader);
            bufferedReader.close();
            JsonObject asJsonObject = JsonParser.parseString(strE).getAsJsonObject();
            v1 v1Var2 = v1.f4245a;
            asJsonObject.getClass();
            LinkedHashMap linkedHashMap = v1.f4246b;
            v1Var2.getClass();
            v1.a(asJsonObject, linkedHashMap);
            InputStream inputStreamOpenRawResource2 = contextA.getResources().openRawResource(R.raw.difficulties_bouldering);
            inputStreamOpenRawResource2.getClass();
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource2, charset), 8192);
            try {
                String strE2 = lg.d.E(bufferedReader2);
                bufferedReader2.close();
                JsonObject asJsonObject2 = JsonParser.parseString(strE2).getAsJsonObject();
                asJsonObject2.getClass();
                v1.a(asJsonObject2, v1.f4247c);
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(bufferedReader2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                jg.b.l(bufferedReader, th5);
                throw th6;
            }
        }
    }
}
