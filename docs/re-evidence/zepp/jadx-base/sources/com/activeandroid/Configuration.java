package com.activeandroid;

import android.content.Context;
import com.activeandroid.serializer.TypeSerializer;
import com.activeandroid.util.Log;
import com.activeandroid.util.ReflectionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Configuration {
    public static final String SQL_PARSER_DELIMITED = "delimited";
    public static final String SQL_PARSER_LEGACY = "legacy";
    private int mCacheSize;
    private Context mContext;
    private String mDatabaseName;
    private int mDatabaseVersion;
    private List<Class<? extends Model>> mModelClasses;
    private String mSqlParser;
    private List<Class<? extends TypeSerializer>> mTypeSerializers;

    public static class Builder {
        private static final String AA_DB_NAME = "AA_DB_NAME";
        private static final String AA_DB_VERSION = "AA_DB_VERSION";
        private static final String AA_MODELS = "AA_MODELS";
        private static final String AA_SERIALIZERS = "AA_SERIALIZERS";
        private static final String AA_SQL_PARSER = "AA_SQL_PARSER";
        private static final int DEFAULT_CACHE_SIZE = 1024;
        private static final String DEFAULT_DB_NAME = "Application.db";
        private static final String DEFAULT_SQL_PARSER = "legacy";
        private Integer mCacheSize = 1024;
        private Context mContext;
        private String mDatabaseName;
        private Integer mDatabaseVersion;
        private List<Class<? extends Model>> mModelClasses;
        private String mSqlParser;
        private List<Class<? extends TypeSerializer>> mTypeSerializers;

        public Builder(Context context) {
            this.mContext = context.getApplicationContext();
        }

        private String getMetaDataDatabaseNameOrDefault() {
            String str = (String) ReflectionUtils.getMetaData(this.mContext, AA_DB_NAME);
            return str == null ? DEFAULT_DB_NAME : str;
        }

        private int getMetaDataDatabaseVersionOrDefault() {
            Integer num = (Integer) ReflectionUtils.getMetaData(this.mContext, AA_DB_VERSION);
            if (num == null || num.intValue() == 0) {
                num = 1;
            }
            return num.intValue();
        }

        private String getMetaDataSqlParserOrDefault() {
            String str = (String) ReflectionUtils.getMetaData(this.mContext, AA_SQL_PARSER);
            return str == null ? "legacy" : str;
        }

        private List<Class<? extends Model>> loadModelList(String[] strArr) {
            ArrayList arrayList = new ArrayList();
            ClassLoader classLoader = this.mContext.getClass().getClassLoader();
            for (String str : strArr) {
                try {
                    Class<?> cls = Class.forName(str.trim(), false, classLoader);
                    if (ReflectionUtils.isModel(cls)) {
                        arrayList.add(cls);
                    }
                } catch (ClassNotFoundException e) {
                    Log.e("Couldn't create class.", e);
                }
            }
            return arrayList;
        }

        private List<Class<? extends TypeSerializer>> loadSerializerList(String[] strArr) {
            ArrayList arrayList = new ArrayList();
            ClassLoader classLoader = this.mContext.getClass().getClassLoader();
            for (String str : strArr) {
                try {
                    Class<?> cls = Class.forName(str.trim(), false, classLoader);
                    if (ReflectionUtils.isTypeSerializer(cls)) {
                        arrayList.add(cls);
                    }
                } catch (ClassNotFoundException e) {
                    Log.e("Couldn't create class.", e);
                }
            }
            return arrayList;
        }

        public Builder addModelClass(Class<? extends Model> cls) {
            if (this.mModelClasses == null) {
                this.mModelClasses = new ArrayList();
            }
            this.mModelClasses.add(cls);
            return this;
        }

        public Builder addModelClasses(Class<? extends Model>... clsArr) {
            if (this.mModelClasses == null) {
                this.mModelClasses = new ArrayList();
            }
            this.mModelClasses.addAll(Arrays.asList(clsArr));
            return this;
        }

        public Builder addTypeSerializer(Class<? extends TypeSerializer> cls) {
            if (this.mTypeSerializers == null) {
                this.mTypeSerializers = new ArrayList();
            }
            this.mTypeSerializers.add(cls);
            return this;
        }

        public Builder addTypeSerializers(Class<? extends TypeSerializer>... clsArr) {
            if (this.mTypeSerializers == null) {
                this.mTypeSerializers = new ArrayList();
            }
            this.mTypeSerializers.addAll(Arrays.asList(clsArr));
            return this;
        }

        public Configuration create() {
            Configuration configuration = new Configuration(this.mContext);
            configuration.mCacheSize = this.mCacheSize.intValue();
            String str = this.mDatabaseName;
            if (str != null) {
                configuration.mDatabaseName = str;
            } else {
                configuration.mDatabaseName = getMetaDataDatabaseNameOrDefault();
            }
            Integer num = this.mDatabaseVersion;
            if (num != null) {
                configuration.mDatabaseVersion = num.intValue();
            } else {
                configuration.mDatabaseVersion = getMetaDataDatabaseVersionOrDefault();
            }
            String str2 = this.mSqlParser;
            if (str2 != null) {
                configuration.mSqlParser = str2;
            } else {
                configuration.mSqlParser = getMetaDataSqlParserOrDefault();
            }
            List<Class<? extends Model>> list = this.mModelClasses;
            if (list != null) {
                configuration.mModelClasses = list;
            } else {
                String str3 = (String) ReflectionUtils.getMetaData(this.mContext, AA_MODELS);
                if (str3 != null) {
                    configuration.mModelClasses = loadModelList(str3.split(","));
                }
            }
            List<Class<? extends TypeSerializer>> list2 = this.mTypeSerializers;
            if (list2 != null) {
                configuration.mTypeSerializers = list2;
            } else {
                String str4 = (String) ReflectionUtils.getMetaData(this.mContext, AA_SERIALIZERS);
                if (str4 != null) {
                    configuration.mTypeSerializers = loadSerializerList(str4.split(","));
                }
            }
            return configuration;
        }

        public Builder setCacheSize(int i) {
            this.mCacheSize = Integer.valueOf(i);
            return this;
        }

        public Builder setDatabaseName(String str) {
            this.mDatabaseName = str;
            return this;
        }

        public Builder setDatabaseVersion(int i) {
            this.mDatabaseVersion = Integer.valueOf(i);
            return this;
        }

        public Builder setModelClasses(Class<? extends Model>... clsArr) {
            this.mModelClasses = Arrays.asList(clsArr);
            return this;
        }

        public Builder setSqlParser(String str) {
            this.mSqlParser = str;
            return this;
        }

        public Builder setTypeSerializers(Class<? extends TypeSerializer>... clsArr) {
            this.mTypeSerializers = Arrays.asList(clsArr);
            return this;
        }
    }

    public int getCacheSize() {
        return this.mCacheSize;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDatabaseName() {
        return this.mDatabaseName;
    }

    public int getDatabaseVersion() {
        return this.mDatabaseVersion;
    }

    public List<Class<? extends Model>> getModelClasses() {
        return this.mModelClasses;
    }

    public String getSqlParser() {
        return this.mSqlParser;
    }

    public List<Class<? extends TypeSerializer>> getTypeSerializers() {
        return this.mTypeSerializers;
    }

    public boolean isValid() {
        List<Class<? extends Model>> list = this.mModelClasses;
        return list != null && list.size() > 0;
    }

    private Configuration(Context context) {
        this.mContext = context;
    }
}
