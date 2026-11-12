package com.xiaomi.ai.domain.mobileapp.local;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.t08;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes7.dex */
public class Intervenor {
    private static final String LOCAL_INTERV_PATH = "mobileApp.local.interv.gz";
    private static Intervenor instance = new Intervenor();
    private Map<String, Map<String, Type>> keyWord2Pattern2TypeIntervMap = new HashMap(16);
    private boolean inited = false;

    public enum Type {
        BLACK,
        WHITE,
        MISS
    }

    private Intervenor() {
    }

    public static Intervenor getInstance() {
        return instance;
    }

    public Type getIntervType(String str, String str2) {
        return (this.inited && this.keyWord2Pattern2TypeIntervMap.containsKey(str) && this.keyWord2Pattern2TypeIntervMap.get(str).containsKey(str2)) ? this.keyWord2Pattern2TypeIntervMap.get(str).get(str2) : Type.MISS;
    }

    public synchronized boolean init(Set<String> set) throws IOException {
        this.inited = false;
        HashMap map = new HashMap(128);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(t08.a(LOCAL_INTERV_PATH));
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        gZIPInputStream.close();
                        this.keyWord2Pattern2TypeIntervMap = map;
                        this.inited = true;
                    } else if (!line.isEmpty() && !line.startsWith(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX)) {
                        String[] strArrSplit = line.split("\t");
                        if (strArrSplit.length == 4) {
                            String str = strArrSplit[0];
                            String lowerCase = strArrSplit[1].toLowerCase();
                            String lowerCase2 = strArrSplit[2].toLowerCase();
                            Type typeValueOf = Type.valueOf(strArrSplit[3]);
                            if ("EXACT".equals(str)) {
                                if (set.contains(lowerCase2)) {
                                    if (!map.containsKey(lowerCase)) {
                                        map.put(lowerCase, new HashMap(16));
                                    }
                                    ((Map) map.get(lowerCase)).put(lowerCase2, typeValueOf);
                                }
                            } else if ("REGEX".equals(str)) {
                                Pattern patternCompile = Pattern.compile(lowerCase2);
                                for (String str2 : set) {
                                    if (patternCompile.matcher(str2).matches()) {
                                        if (!map.containsKey(lowerCase)) {
                                            map.put(lowerCase, new HashMap(16));
                                        }
                                        ((Map) map.get(lowerCase)).put(str2, typeValueOf);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                try {
                    gZIPInputStream.close();
                } catch (Throwable th6) {
                    th4.addSuppressed(th6);
                }
                throw th5;
            }
        }
        return true;
    }
}
