package com.xiaomi.ai.domain.mobileapp.parser;

import com.xiaomi.ai.domain.mobileapp.common.MobileAppIntention;
import defpackage.i2h;
import defpackage.t08;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes7.dex */
public class BlackResource {
    private static final String INITIAL_BLACK_PATH = "mobileApp.blacklist.interv.gz";
    private Map<String, MobileAppIntention.BLACKTYPE> blackMap = new HashMap();
    private boolean inited = false;

    private boolean loadData(List<InputStream> list) throws IOException {
        HashMap map = new HashMap(128);
        Iterator<InputStream> it = list.iterator();
        while (it.hasNext()) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(it.next()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    String[] strArrSplit = line.split("\t");
                    if (strArrSplit.length != 2) {
                        throw new RuntimeException("blackMap loaded failed, info:" + line);
                    }
                    String strB = i2h.b(strArrSplit[0].replaceAll("\\p{P}|\\p{Space}", "").toLowerCase());
                    if (!map.containsKey(strB) && MobileAppIntention.BLACKTYPE.fromTypeName(strArrSplit[1]) != null) {
                        map.put(strB, MobileAppIntention.BLACKTYPE.fromTypeName(strArrSplit[1]));
                    }
                }
            }
            bufferedReader.close();
        }
        this.blackMap = map;
        return true;
    }

    public Map<String, MobileAppIntention.BLACKTYPE> getBlackMap() {
        return this.blackMap;
    }

    public boolean init() throws IOException {
        if (this.inited) {
            return true;
        }
        boolean zLoadData = loadData(Collections.singletonList(new GZIPInputStream(t08.a(INITIAL_BLACK_PATH))));
        if (zLoadData) {
            this.inited = true;
        }
        return zLoadData;
    }

    public boolean matchBlackQuery(String str) {
        return this.blackMap.containsKey(str) && this.blackMap.get(str).equals(MobileAppIntention.BLACKTYPE.BLACK_QUERY);
    }

    public boolean matchBlackSubstring(String str) {
        return this.blackMap.containsKey(str) && this.blackMap.get(str).equals(MobileAppIntention.BLACKTYPE.BLACK_QUERY);
    }

    public boolean matchBlackWord(String str) {
        return this.blackMap.containsKey(str) && this.blackMap.get(str).equals(MobileAppIntention.BLACKTYPE.BLACK_WORD);
    }

    public boolean init(List<InputStream> list) throws IOException {
        boolean zInit = init();
        if (zInit) {
            zInit = loadData(list);
        }
        if (zInit) {
            this.inited = true;
        }
        return zInit;
    }
}
