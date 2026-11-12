package com.xiaomi.ai.domain.phonecall.util;

import com.xiaomi.ai.domain.phonecall.common.NameType;
import com.xiaomi.ai.domain.phonecall.contact.PhoneType;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class NameTypeUtils {
    private static final Pattern DIGIT_NUMBER_PAT = Pattern.compile("^[零一二三四五六七八九0-9]{3,}$");
    private static final String FAMOUS_NAMES_FILE = "/famous-names.dat";
    private static final String RELATIVE_NAMES_FILE = "/relative-names.dat";
    private static final String YELLOW_PAGES_FILE = "/yellow-pages.dat";
    private static Set<String> famousNamesSet;
    private static Set<String> relativeNamesSet;
    private static Set<String> yellowPageSet;

    static {
        try {
            HashSet hashSet = new HashSet();
            famousNamesSet = hashSet;
            readNamesFile(FAMOUS_NAMES_FILE, hashSet);
            HashSet hashSet2 = new HashSet();
            relativeNamesSet = hashSet2;
            readNamesFile(RELATIVE_NAMES_FILE, hashSet2);
            HashSet hashSet3 = new HashSet();
            yellowPageSet = hashSet3;
            readYellowPageFile(YELLOW_PAGES_FILE, hashSet3);
        } catch (Exception e) {
            throw new RuntimeException("failed to init static NameTypeUtils", e);
        }
    }

    public static Set<String> getFamousNamesSet() {
        return famousNamesSet;
    }

    public static NameType getNameType(String str) {
        if (famousNamesSet.contains(str)) {
            return NameType.FAMOUS;
        }
        if (relativeNamesSet.contains(str)) {
            return NameType.RELATIVE;
        }
        if (yellowPageSet.contains(str)) {
            return NameType.YELLOW_PAGE;
        }
        return DIGIT_NUMBER_PAT.matcher(DigitQc.getQc(str)).matches() ? NameType.DIGIT : NameType.NORMAL;
    }

    public static Set<String> getRelativeNamesSet() {
        return relativeNamesSet;
    }

    public static Set<String> getYellowPageSet() {
        return yellowPageSet;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static void readNamesFile(String str, Set<String> set) throws IOException {
        try {
            InputStream resourceAsStream = PhoneType.class.getResourceAsStream(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else if (!line.startsWith(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX) && !line.isEmpty()) {
                            set.add(line);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    if (resourceAsStream != null) {
                        try {
                            resourceAsStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th;
                }
                bufferedReader.close();
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
            } catch (Throwable th4) {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                throw th4;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static void readYellowPageFile(String str, Set<String> set) throws IOException {
        try {
            InputStream resourceAsStream = PhoneType.class.getResourceAsStream(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!line.startsWith(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX) && !line.isEmpty()) {
                            for (String str2 : line.split("\\:")[0].split("\\|")) {
                                set.add(str2);
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    if (resourceAsStream != null) {
                        try {
                            resourceAsStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th;
                }
                bufferedReader.close();
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
            } catch (Throwable th4) {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                throw th4;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
