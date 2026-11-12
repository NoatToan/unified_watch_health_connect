package com.xiaomi.ai.domain.phonecall.util;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallIntention;
import com.xiaomi.ai.domain.phonecall.parser.PhoneCallParserImpl;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ParserEval {
    public static void main(String[] strArr) throws Exception {
        JSONObject jSONObject;
        PhoneCallParserImpl phoneCallParserImpl = new PhoneCallParserImpl();
        Gson gsonCreate = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            String[] strArrSplit = line.split("\t");
            String str = strArrSplit[0];
            if (strArrSplit.length >= 2) {
                try {
                    jSONObject = new JSONObject(strArrSplit[1]);
                } catch (JSONException unused) {
                    jSONObject = null;
                }
            } else {
                jSONObject = null;
            }
            PhoneCallIntention phoneCallIntention = phoneCallParserImpl.parse(str, Boolean.FALSE, jSONObject, (JSONObject) null);
            if (phoneCallIntention != null) {
                System.out.printf("%s\t%.1f\t%s\n", str, Double.valueOf(phoneCallIntention.getScore()), phoneCallIntention.getName());
                PrintStream printStream = System.err;
                printStream.print(str + "\t");
                printStream.print(jSONObject);
                printStream.print("\t" + gsonCreate.toJson(phoneCallIntention) + "\n");
            }
        }
    }
}
