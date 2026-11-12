package com.huawei.health.plan.model.util;

import health.compact.a.utils.StringUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class SqlUtil {

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f8593a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f8594c;
        private LinkedHashMap<String, SqliteColumnType> e = new LinkedHashMap<>();

        public d e(String str) {
            this.f8593a = str;
            return this;
        }

        public d c() {
            this.f8594c = true;
            return this;
        }

        public d c(String str, SqliteColumnType sqliteColumnType) {
            if (StringUtils.j(str) && sqliteColumnType != null) {
                this.e.put(str, sqliteColumnType);
            }
            return this;
        }

        public String a() {
            StringBuilder sb = new StringBuilder();
            String str = this.f8593a;
            if (str != null) {
                if (this.f8594c) {
                    sb.append(str);
                    sb.append(" INTEGER PRIMARY KEY AUTOINCREMENT");
                } else {
                    sb.append(str);
                    sb.append(" INTEGER AUTOINCREMENT");
                }
            }
            if (!this.e.isEmpty()) {
                for (Map.Entry<String, SqliteColumnType> entry : this.e.entrySet()) {
                    if (sb.length() != 0) {
                        sb.append(",");
                    }
                    sb.append(entry.getKey());
                    sb.append(" ");
                    sb.append(entry.getValue().getValue());
                }
            }
            return sb.toString();
        }
    }

    public enum SqliteColumnType {
        INTEGER("INTEGER"),
        TEXT("TEXT"),
        BLOB("BLOB"),
        REAL("REAL");

        private String mValue;

        SqliteColumnType(String str) {
            this.mValue = str;
        }

        public String getValue() {
            return this.mValue;
        }
    }

    public enum SqliteOrderType {
        ASC("ASC"),
        DESC("DESC");

        private String mValue;

        SqliteOrderType(String str) {
            this.mValue = str;
        }

        public String getValue() {
            return this.mValue;
        }

        public String by(String... strArr) {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                if (!StringUtils.g(str)) {
                    if (sb.length() != 0) {
                        sb.append(",");
                    } else {
                        sb.append(" order by");
                        sb.append(" ");
                    }
                    sb.append(str);
                    sb.append(" ");
                    sb.append(name());
                }
            }
            return sb.toString();
        }
    }

    public enum SqliteOperateType {
        SELECT("select");

        private String mValue;

        SqliteOperateType(String str) {
            this.mValue = str;
        }

        public String getValue() {
            return this.mValue;
        }
    }

    public enum ConditionLinkerType {
        AND(" and "),
        OR(" or ");

        private String mValue;

        ConditionLinkerType(String str) {
            this.mValue = str;
        }

        public String getValue() {
            return this.mValue;
        }
    }
}
