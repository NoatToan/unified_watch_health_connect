package com.xiaomi.ai.domain.mobileapp.common;

import com.google.gson.JsonObject;
import defpackage.j82;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class MobileAppIntention extends j82 {
    public static final String DOMAIN_NAME = "mobileApp";
    private String age;
    private String appName;
    private List<ShowApp> apps;
    private BLACKTYPE blackType;
    private String category;
    private double confidence;
    private Device device;
    private boolean downloadNow;
    private String func;
    private String hintName;
    private boolean isOnlyAppName;
    private String keyword;
    private List<String> keywords;
    private String name;
    private Map<String, String> nameTypeMap;
    private PATTERN pattern;
    private List<String> recent_used_apps;
    private boolean skip_arbitrator;
    private String tag;
    private String topname;
    private boolean useLocalApp;
    private String dialog_status = "FINISH";
    private String recentMapPkg = "";
    private boolean experiment = false;
    private String debug_houyi = "";

    public enum BLACKTYPE {
        BLACK_QUERY("query干预"),
        BLACK_WORD("词表干预"),
        BLACK_SUBSTRING("子串干预");

        private String blackTypeName;

        BLACKTYPE(String str) {
            this.blackTypeName = str;
        }

        public static BLACKTYPE fromTypeName(String str) {
            for (BLACKTYPE blacktype : values()) {
                if (blacktype.getTypeName().equals(str)) {
                    return blacktype;
                }
            }
            return null;
        }

        public String getTypeName() {
            return this.blackTypeName;
        }
    }

    public enum PATTERN {
        NO_PATTERN,
        WEAK_PATTERN,
        TAG_PATTERN,
        SEARCH_PATTERN,
        HOUYI_PATTERN,
        WEAK_TAG_PATTERN
    }

    public static class ShowApp implements Comparable<ShowApp> {
        private JsonObject debugInfo;
        private String displayName;
        private String iconUrl;
        private boolean isNative;
        private boolean isOnline;
        private boolean isTop;
        private String packageName;
        private double score;

        public ShowApp() {
            this.displayName = "";
            this.packageName = "";
            this.iconUrl = "";
            this.isNative = false;
            this.isOnline = true;
            this.isTop = false;
        }

        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            return ((ShowApp) obj).getPackageName().equals(this.packageName);
        }

        public JsonObject getDebugInfo() {
            return this.debugInfo;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public String getIconUrl() {
            return this.iconUrl;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public double getScore() {
            return this.score;
        }

        public int hashCode() {
            return this.packageName.hashCode();
        }

        public boolean isNative() {
            return this.isNative;
        }

        public boolean isOnline() {
            return this.isOnline;
        }

        public boolean isTop() {
            return this.isTop;
        }

        public void setDebugInfo(JsonObject jsonObject) {
            this.debugInfo = jsonObject;
        }

        public void setDebugInfoKV(String str, String str2) {
            if (this.debugInfo == null) {
                this.debugInfo = new JsonObject();
            }
            this.debugInfo.addProperty(str, str2);
        }

        public void setDisplayName(String str) {
            this.displayName = str;
        }

        public void setIconUrl(String str) {
            this.iconUrl = str;
        }

        public void setNative(boolean z) {
            this.isNative = z;
        }

        public void setOnline(boolean z) {
            this.isOnline = z;
        }

        public void setPackageName(String str) {
            this.packageName = str;
        }

        public void setScore(double d) {
            this.score = d;
        }

        public void setTop(boolean z) {
            this.isTop = z;
        }

        @Override // java.lang.Comparable
        public int compareTo(ShowApp showApp) {
            return Double.valueOf(this.score).compareTo(Double.valueOf(showApp.score));
        }

        public ShowApp(String str, String str2, String str3, boolean z, boolean z2, boolean z3, double d) {
            this.displayName = str;
            this.packageName = str2;
            this.iconUrl = str3;
            this.isNative = z;
            this.isOnline = z2;
            this.isTop = z3;
            this.score = d;
        }
    }

    public MobileAppIntention() {
        super.setDomain(DOMAIN_NAME);
        super.setAction(ActionType.QUERY.toString());
        super.setComplete(true);
        super.setScore(0.0d);
        this.name = "";
        this.hintName = "";
        this.topname = "";
        this.tag = "";
        this.pattern = PATTERN.NO_PATTERN;
        this.keywords = new ArrayList();
        this.apps = new ArrayList();
        this.recent_used_apps = new ArrayList();
        this.nameTypeMap = new HashMap();
        this.keyword = "";
        this.appName = "";
        this.confidence = 0.0d;
        this.func = "";
        this.useLocalApp = true;
        this.downloadNow = false;
        this.skip_arbitrator = false;
        this.device = Device.PHONE;
        this.isOnlyAppName = false;
    }

    public void addApp(String str, String str2, String str3, boolean z, boolean z2, boolean z3, double d) {
        this.apps.add(new ShowApp(str, str2, str3, z, z2, z3, d));
    }

    public void addKeyword(String str) {
        this.keywords.add(str);
    }

    public String getAge() {
        return this.age;
    }

    public String getAppName() {
        return this.appName;
    }

    public List<ShowApp> getApps() {
        return this.apps;
    }

    public BLACKTYPE getBlackType() {
        return this.blackType;
    }

    public String getCategory() {
        return this.category;
    }

    public double getConfidence() {
        return this.confidence;
    }

    public String getDebug_houyi() {
        return this.debug_houyi;
    }

    public Device getDevice() {
        return this.device;
    }

    public String getDialog_status() {
        return this.dialog_status;
    }

    public String getFunc() {
        return this.func;
    }

    public String getHintName() {
        return this.hintName;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public List<String> getKeywords() {
        return this.keywords;
    }

    public String getName() {
        return this.name;
    }

    public Map<String, String> getNameTypeMap() {
        return this.nameTypeMap;
    }

    public boolean getOnlyAppName() {
        return this.isOnlyAppName;
    }

    public PATTERN getPattern() {
        return this.pattern;
    }

    public String getRecentMapPkg() {
        return this.recentMapPkg;
    }

    public List<String> getRecent_used_apps() {
        return this.recent_used_apps;
    }

    public String getTag() {
        return this.tag;
    }

    public String getTopname() {
        return this.topname;
    }

    public boolean isDownloadNow() {
        return this.downloadNow;
    }

    public boolean isExperiment() {
        return this.experiment;
    }

    public boolean isSkip_arbitrator() {
        return this.skip_arbitrator;
    }

    public boolean isUseLocalApp() {
        return this.useLocalApp;
    }

    public void setAction(ActionType actionType) {
        super.setAction(actionType.getAction());
    }

    public void setAge(String str) {
        this.age = str;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setApps(List<ShowApp> list) {
        this.apps = list;
    }

    public void setBlackType(BLACKTYPE blacktype) {
        this.blackType = blacktype;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setConfidence(double d) {
        this.confidence = d;
    }

    public void setDebug_houyi(String str) {
        this.debug_houyi = str;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void setDialog_status(String str) {
        this.dialog_status = str;
    }

    public void setDownloadNow(boolean z) {
        this.downloadNow = z;
    }

    public void setExperiment(boolean z) {
        this.experiment = z;
    }

    public void setFunc(String str) {
        this.func = str;
    }

    public void setHintName(String str) {
        this.hintName = str;
    }

    public void setKeyword(String str) {
        this.keyword = str;
    }

    public void setKeywords(List<String> list) {
        this.keywords = list;
    }

    public void setName(String str) {
        this.name = str;
        setKeyword(str);
        setAppName(str);
    }

    public void setNameTypeMap(Map<String, String> map) {
        this.nameTypeMap = map;
    }

    public void setOnlyAppName(boolean z) {
        this.isOnlyAppName = z;
    }

    public void setPattern(PATTERN pattern) {
        this.pattern = pattern;
    }

    public void setRecentMapPkg(String str) {
        this.recentMapPkg = str;
    }

    public void setRecent_used_apps(List<String> list) {
        this.recent_used_apps = list;
    }

    public void setSkip_arbitrator(boolean z) {
        this.skip_arbitrator = z;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setTopname(String str) {
        this.topname = str;
    }

    public void setUseLocalApp(boolean z) {
        this.useLocalApp = z;
    }
}
