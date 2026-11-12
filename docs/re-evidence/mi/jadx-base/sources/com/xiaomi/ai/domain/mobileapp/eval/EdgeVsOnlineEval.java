package com.xiaomi.ai.domain.mobileapp.eval;

import com.xiaomi.ai.domain.mobileapp.adapter.EdgeAdapter;
import com.xiaomi.ai.domain.mobileapp.common.MobileAppIntention;
import com.xiaomi.ai.domain.mobileapp.parser.MobileAppParserImpl;
import com.xiaomi.ai.domain.mobileapp.parser.ResourceSuite;
import com.xiaomi.passport.ui.onetrack.TrackConstants;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.t08;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes7.dex */
public class EdgeVsOnlineEval {
    public static void main(String[] strArr) throws Exception {
        int i;
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        if (hashSet.contains(TrackConstants.HELP) || hashSet.contains("-h") || hashSet.contains("--h")) {
            PrintStream printStream = System.err;
            printStream.println("usage: cat query | edge-adapter-eval");
            printStream.println("\t-i infile, specify read from infile, default stdin");
            printStream.println("\t-o outfile, specify write to outfile, default stdout");
            printStream.println("\t-e entities file, specify read from entities file, default mobileApp.entities.v2.gz");
            System.exit(-1);
        }
        String str = "";
        String str2 = "";
        String str3 = str2;
        int i2 = 0;
        while (i2 < strArr.length) {
            String str4 = strArr[i2];
            str4.hashCode();
            switch (str4) {
                case "-e":
                    i = i2 + 1;
                    str = strArr[i];
                    break;
                case "-i":
                    i = i2 + 1;
                    str2 = strArr[i];
                    break;
                case "-o":
                    i = i2 + 1;
                    str3 = strArr[i];
                    break;
                default:
                    throw new IllegalArgumentException("invalid arguments index:" + i2);
            }
            i2 = i + 1;
        }
        ResourceSuite.getInstance().updateBaseResource(Collections.singletonList(str.isEmpty() ? new GZIPInputStream(t08.a(ResourceSuite.BASE_RESOUECE_PATH)) : new FileInputStream(str)));
        MobileAppParserImpl mobileAppParserImpl = new MobileAppParserImpl();
        mobileAppParserImpl.init();
        BufferedReader bufferedReader = str2.isEmpty() ? new BufferedReader(new InputStreamReader(System.in)) : new BufferedReader(new FileReader(str2));
        BufferedWriter bufferedWriter = str3.isEmpty() ? new BufferedWriter(new OutputStreamWriter(System.out)) : new BufferedWriter(new FileWriter(str3));
        bufferedWriter.write("query\tonline_score\tonline_confidence\tedge_score\tedge_confidence\n");
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                System.exit(0);
                return;
            }
            if (!line.isEmpty() && !line.startsWith(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX)) {
                int iIndexOf = line.indexOf("\t");
                if (iIndexOf != -1) {
                    line = line.substring(0, iIndexOf);
                }
                Boolean bool = Boolean.FALSE;
                MobileAppIntention mobileAppIntention = mobileAppParserImpl.parse(line, bool);
                MobileAppIntention mobileAppIntention2 = mobileAppParserImpl.parse(line, bool);
                EdgeAdapter.adapt(mobileAppIntention2);
                bufferedWriter.write(String.format("%s\t%.2f\t%.2f\t%.2f\t%.2f\n", line, Double.valueOf(mobileAppIntention.getScore()), Double.valueOf(mobileAppIntention.getConfidence()), Double.valueOf(mobileAppIntention2.getScore()), Double.valueOf(mobileAppIntention2.getConfidence())));
                bufferedWriter.flush();
            }
        }
    }
}
