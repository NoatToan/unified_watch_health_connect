package com.xiaomi.ai.domain.phonecall.util;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import com.xiaomi.ai.domain.phonecall.common.MatchRet;
import com.xiaomi.ai.domain.phonecall.contact.ContactData;
import com.xiaomi.ai.domain.phonecall.parser.PhoneCallParserImpl;
import com.xiaomi.ai.domain.phonecall.provider.ContactSimMatcher;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ContactMatcherEval {
    public static void main(String[] strArr) throws Exception {
        PhoneCallParserImpl phoneCallParserImpl = new PhoneCallParserImpl();
        ContactSimMatcher contactSimMatcher = new ContactSimMatcher();
        new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            String[] strArrSplit = line.split("\t");
            String str = strArrSplit[0];
            String str2 = strArrSplit.length >= 2 ? strArrSplit[1] : "";
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (String str3 : str2.split("\\|")) {
                if (i != 0) {
                    sb.append("@@@");
                }
                sb.append(str3 + ":手机_" + i);
                i++;
            }
            ContactData contactData = new ContactData();
            contactData.initContactsFromLabelPtStr(sb.toString());
            MatchRet matchRetMatch = contactSimMatcher.match(phoneCallParserImpl.parse(str, Boolean.FALSE, (JSONObject) null, (JSONObject) null), contactData, null);
            if (matchRetMatch != null) {
                System.out.print(str + "\t" + matchRetMatch.getMatchType() + "\t");
                for (int i2 = 0; i2 < matchRetMatch.getEventInfo().getOtherInfos().size(); i2++) {
                    if (i2 != 0) {
                        System.out.print("|");
                    }
                    System.out.print(matchRetMatch.getEventInfo().getOtherInfos().get(i2));
                }
                System.out.print("\n");
            }
        }
    }
}
