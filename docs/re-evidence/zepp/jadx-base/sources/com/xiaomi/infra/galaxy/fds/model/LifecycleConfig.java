package com.xiaomi.infra.galaxy.fds.model;

import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.huami.passport.Configs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class LifecycleConfig {
    public static final long MAX_EXPIRATION_DAYS = 90000;
    public static final long MAX_EXPIRATION_MILLIS = 7776000000000L;
    public static final long MAX_MULTIPART_EXPIRATION_DAYS = 30;
    public static final long MAX_MULTIPART_EXPIRATION_MILLIS = 2592000000L;
    public static final long MAX_NONCURRENT_EXPIRATION_DAYS = 30;
    public static final long MAX_NONCURRENT_EXPIRATION_MILLIS = 2592000000L;
    public static final long MAX_STORAGECLASS_EXPIRATION_DAYS = 90000;
    public static final long MAX_STORAGECLASS_EXPIRATION_MILLIS = 7776000000000L;
    private static final Log e = LogFactory.getLog(LifecycleConfig.class);
    private static final String f = "rules";
    private final Map<String, Rule> a = new TreeMap();
    private List<Rule> b = new ArrayList();
    private Map<String, List<ActionBase>> c = new HashMap();
    private List<String> d = null;

    public static class AbortIncompleteMultipartUpload extends ActionBase {
        private static final String a = "abortIncompleteMultipartUpload";

        @Expose
        public double days;

        public AbortIncompleteMultipartUpload() {
            super(a);
        }

        public static AbortIncompleteMultipartUpload fromJson(String str) throws JSONException {
            return fromJson(str, false);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AbortIncompleteMultipartUpload abortIncompleteMultipartUpload = (AbortIncompleteMultipartUpload) obj;
            String str = this.name;
            if (str == null ? abortIncompleteMultipartUpload.name == null : str.equals(abortIncompleteMultipartUpload.name)) {
                return getMilliseconds() == abortIncompleteMultipartUpload.getMilliseconds();
            }
            return false;
        }

        public long getMilliseconds() {
            return (long) (this.days * 24.0d * 60.0d * 60.0d * 1000.0d);
        }

        @Override // com.xiaomi.infra.galaxy.fds.model.LifecycleConfig.ActionBase
        public String toJson() {
            return ActionBase.GSON.toJson(this);
        }

        public static AbortIncompleteMultipartUpload fromJson(String str, boolean z) throws JSONException {
            AbortIncompleteMultipartUpload abortIncompleteMultipartUpload = (AbortIncompleteMultipartUpload) ActionBase.GSON.fromJson(str, AbortIncompleteMultipartUpload.class);
            if (z) {
                double dMax = Math.max(0.0d, abortIncompleteMultipartUpload.days);
                abortIncompleteMultipartUpload.days = dMax;
                abortIncompleteMultipartUpload.days = Math.min(30.0d, dMax);
            }
            double d = abortIncompleteMultipartUpload.days;
            if (d < 0.0d || d > 30.0d) {
                throw new JSONException("non-current object expiration days must be in range [0,30]");
            }
            return abortIncompleteMultipartUpload;
        }
    }

    public static abstract class ActionBase {
        public static final Gson GSON = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        public String name;

        public ActionBase(String str) {
            this.name = str;
        }

        public String name() {
            return this.name;
        }

        public abstract String toJson();
    }

    public static class Expiration extends ActionBase {
        private static final String a = "expiration";

        @Expose
        public double days;

        public Expiration() {
            super("expiration");
        }

        public static Expiration fromJson(String str) throws JSONException {
            return fromJson(str, false);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Expiration expiration = (Expiration) obj;
            String str = this.name;
            if (str == null ? expiration.name == null : str.equals(expiration.name)) {
                return getMilliseconds() == expiration.getMilliseconds();
            }
            return false;
        }

        public long getMilliseconds() {
            return (long) (this.days * 24.0d * 60.0d * 60.0d * 1000.0d);
        }

        @Override // com.xiaomi.infra.galaxy.fds.model.LifecycleConfig.ActionBase
        public String toJson() {
            return ActionBase.GSON.toJson(this);
        }

        public static Expiration fromJson(String str, boolean z) throws JSONException {
            Expiration expiration = (Expiration) ActionBase.GSON.fromJson(str, Expiration.class);
            if (z) {
                double dMax = Math.max(0.0d, expiration.days);
                expiration.days = dMax;
                expiration.days = Math.min(90000.0d, dMax);
            }
            double d = expiration.days;
            if (d < 0.0d || d > 90000.0d) {
                throw new JSONException("object expiration days must be in range [0,90000]");
            }
            return expiration;
        }
    }

    public static class LifecycleStorageClass extends ActionBase {
        public static final String NAME = "lifeCycleStorageClass";

        @Expose
        public double days;

        @Expose
        public String storageClass;

        @Expose
        public String targetBucket;

        public LifecycleStorageClass() {
            super(NAME);
        }

        public static LifecycleStorageClass fromJson(String str) throws JSONException {
            return fromJson(str, false);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            LifecycleStorageClass lifecycleStorageClass = (LifecycleStorageClass) obj;
            String str = this.name;
            if (str == null ? lifecycleStorageClass.name != null : !str.equals(lifecycleStorageClass.name)) {
                return false;
            }
            if (this.storageClass == null) {
                return getMilliseconds() == lifecycleStorageClass.getMilliseconds() && lifecycleStorageClass.getStorageClass() == null;
            }
            return getMilliseconds() == lifecycleStorageClass.getMilliseconds() && this.storageClass.equals(lifecycleStorageClass.getStorageClass());
        }

        public long getMilliseconds() {
            return (long) (this.days * 24.0d * 60.0d * 60.0d * 1000.0d);
        }

        public StorageClass getStorage() {
            if (Strings.isNullOrEmpty(this.storageClass)) {
                return null;
            }
            return StorageClass.fromValue(this.storageClass);
        }

        public String getStorageClass() {
            return this.storageClass;
        }

        @Override // com.xiaomi.infra.galaxy.fds.model.LifecycleConfig.ActionBase
        public String toJson() {
            return ActionBase.GSON.toJson(this);
        }

        public static LifecycleStorageClass fromJson(String str, boolean z) throws JSONException {
            LifecycleStorageClass lifecycleStorageClass = (LifecycleStorageClass) ActionBase.GSON.fromJson(str, LifecycleStorageClass.class);
            if (z) {
                double dMax = Math.max(0.0d, lifecycleStorageClass.days);
                lifecycleStorageClass.days = dMax;
                lifecycleStorageClass.days = Math.min(90000.0d, dMax);
            }
            double d = lifecycleStorageClass.days;
            if (d < 0.0d || d > 90000.0d) {
                throw new JSONException("StorageClass expiration days must be in range [0,90000]");
            }
            return lifecycleStorageClass;
        }
    }

    public static class NonCurrentVersionExpiration extends ActionBase {
        private static final String a = "nonCurrentVersionExpiration";

        @Expose
        public double days;

        public NonCurrentVersionExpiration() {
            super(a);
        }

        public static NonCurrentVersionExpiration fromJson(String str) throws JSONException {
            return fromJson(str, false);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            NonCurrentVersionExpiration nonCurrentVersionExpiration = (NonCurrentVersionExpiration) obj;
            String str = this.name;
            if (str == null ? nonCurrentVersionExpiration.name == null : str.equals(nonCurrentVersionExpiration.name)) {
                return getMilliseconds() == nonCurrentVersionExpiration.getMilliseconds();
            }
            return false;
        }

        public long getMilliseconds() {
            return (long) (this.days * 24.0d * 60.0d * 60.0d * 1000.0d);
        }

        @Override // com.xiaomi.infra.galaxy.fds.model.LifecycleConfig.ActionBase
        public String toJson() {
            return ActionBase.GSON.toJson(this);
        }

        public static NonCurrentVersionExpiration fromJson(String str, boolean z) throws JSONException {
            NonCurrentVersionExpiration nonCurrentVersionExpiration = (NonCurrentVersionExpiration) ActionBase.GSON.fromJson(str, NonCurrentVersionExpiration.class);
            if (z) {
                double dMax = Math.max(0.0d, nonCurrentVersionExpiration.days);
                nonCurrentVersionExpiration.days = dMax;
                nonCurrentVersionExpiration.days = Math.min(30.0d, dMax);
            }
            double d = nonCurrentVersionExpiration.days;
            if (d < 0.0d || d > 30.0d) {
                throw new JSONException("non-current object expiration days must be in range [0,30]");
            }
            return nonCurrentVersionExpiration;
        }
    }

    public static class Rule {
        private static final String e = "id";
        private static final String f = "prefix";
        private static final String g = "enabled";
        private static final String h = "actions";
        private String a;
        private String b;
        private boolean c;
        private List<ActionBase> d;

        public static Rule copy(Rule rule) {
            try {
                return fromJson(rule.toJson());
            } catch (JSONException unused) {
                return null;
            }
        }

        public static Rule fromJson(String str) throws JSONException {
            return fromJson(str, false);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Rule rule = (Rule) obj;
            String str = this.a;
            if (str != null && !str.equals(rule.a)) {
                return false;
            }
            if ((this.a == null && rule.a != null) || this.c != rule.c) {
                return false;
            }
            String str2 = this.b;
            if (str2 == null ? rule.b == null : str2.equals(rule.b)) {
                return LifecycleConfig.isCollectionEqual(this.d, rule.d);
            }
            return false;
        }

        public List<ActionBase> getActions() {
            return this.d;
        }

        public String getId() {
            return this.a;
        }

        public String getPrefix() {
            return this.b;
        }

        public boolean isEnabled() {
            return this.c;
        }

        public void setActions(List<ActionBase> list) {
            this.d = list;
        }

        public void setEnabled(boolean z) {
            this.c = z;
        }

        public void setId(String str) {
            this.a = str;
        }

        public void setPrefix(String str) {
            this.b = str;
        }

        public String toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            String str = this.a;
            if (str != null) {
                jSONObject.put("id", str);
            }
            String str2 = this.b;
            if (str2 != null) {
                jSONObject.put(f, str2);
            }
            jSONObject.put("enabled", this.c);
            if (this.d != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (ActionBase actionBase : this.d) {
                    jSONObject2.put(actionBase.name(), new JSONObject(actionBase.toJson()));
                }
                jSONObject.put("actions", jSONObject2);
            }
            return jSONObject.toString();
        }

        public static Rule fromJson(String str, boolean z) throws JSONException {
            JSONObject jSONObject = new JSONObject(str);
            Rule rule = new Rule();
            if (jSONObject.has("id")) {
                rule.setId(jSONObject.getString("id"));
            } else {
                rule.setId("");
            }
            rule.setPrefix(jSONObject.getString(f));
            rule.setEnabled(jSONObject.getBoolean("enabled"));
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject2 = jSONObject.getJSONObject("actions");
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject2.getString(next);
                if (next.equalsIgnoreCase(Configs.Params.EXPIRATION)) {
                    arrayList.add(Expiration.fromJson(string, z));
                } else if (next.equalsIgnoreCase("nonCurrentVersionExpiration")) {
                    arrayList.add(NonCurrentVersionExpiration.fromJson(string, z));
                } else if (next.equalsIgnoreCase("abortIncompleteMultipartUpload")) {
                    arrayList.add(AbortIncompleteMultipartUpload.fromJson(string, z));
                } else {
                    if (!next.equalsIgnoreCase(LifecycleStorageClass.NAME)) {
                        throw new JSONException("Unrecognized action: " + next);
                    }
                    arrayList.add(LifecycleStorageClass.fromJson(string, z));
                }
            }
            rule.setActions(arrayList);
            return rule;
        }
    }

    public class a implements Comparator<String> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str2.length() - str.length();
        }
    }

    private String a() {
        int i = 1;
        while (this.a.containsKey(String.valueOf(i))) {
            i++;
        }
        return String.valueOf(i);
    }

    public static LifecycleConfig fromJson(String str) throws JSONException {
        return fromJson(str, false);
    }

    public static <T> boolean isCollectionEqual(Collection<T> collection, Collection<T> collection2) {
        if (collection == null || collection2 == null) {
            return collection == collection2;
        }
        return collection.containsAll(collection2) && collection2.containsAll(collection);
    }

    public void addOrUpdateRule(Rule rule) {
        Rule ruleCopy = Rule.copy(rule);
        if (ruleCopy == null) {
            return;
        }
        if (Strings.isNullOrEmpty(ruleCopy.getId())) {
            ruleCopy.setId(a());
        }
        this.a.put(ruleCopy.getId(), ruleCopy);
        this.b = new ArrayList(this.a.values());
        this.d = null;
        this.c.clear();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return isCollectionEqual(this.b, ((LifecycleConfig) obj).b);
    }

    public List<ActionBase> getActionList(String str) {
        List<ActionBase> arrayList = this.c.get(str);
        if (arrayList != null) {
            return arrayList;
        }
        for (Rule rule : this.b) {
            if (rule.getPrefix().equals(str)) {
                arrayList = new ArrayList<>();
                Iterator<ActionBase> it2 = rule.getActions().iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
                this.c.put(str, arrayList);
            }
        }
        return arrayList;
    }

    public long getExpiration(String str) {
        Expiration expiration;
        if (Strings.isNullOrEmpty(str) || (expiration = (Expiration) getMatchedAction(str, Expiration.class)) == null) {
            return 7776000000000L;
        }
        return expiration.getMilliseconds();
    }

    public Long getIncompleteMultipartUploadExpiration(String str) {
        AbortIncompleteMultipartUpload abortIncompleteMultipartUpload;
        if (Strings.isNullOrEmpty(str) || (abortIncompleteMultipartUpload = (AbortIncompleteMultipartUpload) getMatchedAction(str, AbortIncompleteMultipartUpload.class)) == null) {
            return null;
        }
        return Long.valueOf(Math.min(abortIncompleteMultipartUpload.getMilliseconds(), 2592000000L));
    }

    public <T extends ActionBase> T getMatchedAction(String str, Class<T> cls) {
        T t = null;
        if (Strings.isNullOrEmpty(str)) {
            return null;
        }
        int length = -1;
        for (Rule rule : this.b) {
            if (rule.isEnabled() && str.startsWith(rule.getPrefix()) && rule.getPrefix().length() >= length) {
                for (ActionBase actionBase : rule.getActions()) {
                    if (cls.isInstance(actionBase)) {
                        length = rule.getPrefix().length();
                        t = (T) actionBase;
                        break;
                    }
                }
            }
        }
        return t;
    }

    public Long getNonCurrentVersionExpiration(String str) {
        NonCurrentVersionExpiration nonCurrentVersionExpiration;
        if (Strings.isNullOrEmpty(str) || (nonCurrentVersionExpiration = (NonCurrentVersionExpiration) getMatchedAction(str, NonCurrentVersionExpiration.class)) == null) {
            return null;
        }
        return Long.valueOf(Math.min(nonCurrentVersionExpiration.getMilliseconds(), 2592000000L));
    }

    public List<String> getPrefixList() {
        List<String> list = this.d;
        if (list != null) {
            return list;
        }
        this.d = new ArrayList();
        Iterator<Rule> it2 = this.b.iterator();
        while (it2.hasNext()) {
            this.d.add(it2.next().getPrefix());
        }
        Collections.sort(this.d, new a());
        return this.d;
    }

    public Rule getRuleById(String str) {
        return this.a.get(str);
    }

    public List<Rule> getRuleList() {
        return this.b;
    }

    public int hashCode() {
        List<Rule> list = this.b;
        int iHashCode = ((list != null ? list.hashCode() : 0) + 0) * 31;
        Map<String, List<ActionBase>> map = this.c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        List<String> list2 = this.d;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public void removeDisabledRules() {
        ArrayList arrayList = new ArrayList();
        for (Rule rule : this.b) {
            if (rule.isEnabled()) {
                arrayList.add(rule);
            }
        }
        this.b = arrayList;
    }

    public void setRuleList(List<Rule> list) {
        this.a.clear();
        for (Rule rule : list) {
            if (Strings.isNullOrEmpty(rule.getId())) {
                rule.setId(a());
            }
            this.a.put(rule.getId(), rule);
        }
        this.b = new ArrayList(this.a.values());
        this.d = null;
        this.c.clear();
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List<Rule> list = this.b;
        if (list != null) {
            Iterator<Rule> it2 = list.iterator();
            while (it2.hasNext()) {
                jSONArray.put(new JSONObject(it2.next().toJson()));
            }
        }
        jSONObject.put(f, jSONArray);
        return jSONObject.toString();
    }

    public static LifecycleConfig fromJson(String str, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        LifecycleConfig lifecycleConfig = new LifecycleConfig();
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(f);
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(Rule.fromJson(jSONArray.getString(i), z));
        }
        lifecycleConfig.setRuleList(arrayList);
        return lifecycleConfig;
    }
}
