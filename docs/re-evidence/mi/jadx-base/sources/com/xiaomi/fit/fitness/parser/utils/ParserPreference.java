package com.xiaomi.fit.fitness.parser.utils;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010+\u001a\u00020\u0005J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0005J\u0006\u0010/\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R+\u0010\u0017\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\u001aR+\u0010\u001c\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\u001aR+\u0010!\u001a\u00020 2\u0006\u0010\n\u001a\u00020 8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0012\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010'\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0012\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010\u0010¨\u00060"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/utils/ParserPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "default_md5", "getDefault_md5", "<set-?>", "", "IS_USE_NATIVE_PARSER", "getIS_USE_NATIVE_PARSER", "()Z", "setIS_USE_NATIVE_PARSER", "(Z)V", "IS_USE_NATIVE_PARSER$delegate", "Lkotlin/properties/ReadWriteProperty;", "IS_USE_LOCAL_SCHEMA", "getIS_USE_LOCAL_SCHEMA", "setIS_USE_LOCAL_SCHEMA", "IS_USE_LOCAL_SCHEMA$delegate", "SCHEMA_MD5", "getSCHEMA_MD5", "setSCHEMA_MD5", "(Ljava/lang/String;)V", "SCHEMA_MD5$delegate", "DEFAULT_SCHEMA_MD5", "getDEFAULT_SCHEMA_MD5", "setDEFAULT_SCHEMA_MD5", "DEFAULT_SCHEMA_MD5$delegate", "", "PRE_REQUEST_SCHEMA", "getPRE_REQUEST_SCHEMA", "()J", "setPRE_REQUEST_SCHEMA", "(J)V", "PRE_REQUEST_SCHEMA$delegate", "IS_SUPPORT_SCHEMA", "getIS_SUPPORT_SCHEMA", "setIS_SUPPORT_SCHEMA", "IS_SUPPORT_SCHEMA$delegate", "getSchemaMd5", "setSchemaMd5", "", "md5", "isMd5Updated", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nParserPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParserPreference.kt\ncom/xiaomi/fit/fitness/parser/utils/ParserPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,36:1\n135#2,6:37\n135#2,6:43\n135#2,6:49\n135#2,6:55\n135#2,6:61\n135#2,6:67\n*S KotlinDebug\n*F\n+ 1 ParserPreference.kt\ncom/xiaomi/fit/fitness/parser/utils/ParserPreference\n*L\n11#1:37,6\n13#1:43,6\n15#1:49,6\n17#1:55,6\n19#1:61,6\n21#1:67,6\n*E\n"})
public final class ParserPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ParserPreference.class, "IS_USE_NATIVE_PARSER", "getIS_USE_NATIVE_PARSER()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ParserPreference.class, "IS_USE_LOCAL_SCHEMA", "getIS_USE_LOCAL_SCHEMA()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ParserPreference.class, "SCHEMA_MD5", "getSCHEMA_MD5()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ParserPreference.class, "DEFAULT_SCHEMA_MD5", "getDEFAULT_SCHEMA_MD5()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ParserPreference.class, "PRE_REQUEST_SCHEMA", "getPRE_REQUEST_SCHEMA()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ParserPreference.class, "IS_SUPPORT_SCHEMA", "getIS_SUPPORT_SCHEMA()Z", 0))};

    /* JADX INFO: renamed from: DEFAULT_SCHEMA_MD5$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DEFAULT_SCHEMA_MD5;

    @NotNull
    public static final ParserPreference INSTANCE;

    /* JADX INFO: renamed from: IS_SUPPORT_SCHEMA$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty IS_SUPPORT_SCHEMA;

    /* JADX INFO: renamed from: IS_USE_LOCAL_SCHEMA$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty IS_USE_LOCAL_SCHEMA;

    /* JADX INFO: renamed from: IS_USE_NATIVE_PARSER$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty IS_USE_NATIVE_PARSER;

    /* JADX INFO: renamed from: PRE_REQUEST_SCHEMA$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PRE_REQUEST_SCHEMA;

    /* JADX INFO: renamed from: SCHEMA_MD5$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SCHEMA_MD5;

    @NotNull
    private static final String default_md5;

    static {
        ParserPreference parserPreference = new ParserPreference();
        INSTANCE = parserPreference;
        default_md5 = "";
        IS_USE_NATIVE_PARSER = parserPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fit.fitness.parser.utils.ParserPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), Boolean.TRUE, null, true);
        Boolean bool = Boolean.FALSE;
        IS_USE_LOCAL_SCHEMA = parserPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fit.fitness.parser.utils.ParserPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), bool, null, true);
        SCHEMA_MD5 = parserPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fit.fitness.parser.utils.ParserPreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), "", null, true);
        DEFAULT_SCHEMA_MD5 = parserPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fit.fitness.parser.utils.ParserPreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), "", null, true);
        PRE_REQUEST_SCHEMA = parserPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fit.fitness.parser.utils.ParserPreference$special$$inlined$bindToPreferenceField$default$5
        }.getType(), 0L, null, true);
        IS_SUPPORT_SCHEMA = parserPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fit.fitness.parser.utils.ParserPreference$special$$inlined$bindToPreferenceField$default$6
        }.getType(), bool, null, true);
    }

    private ParserPreference() {
    }

    @NotNull
    public final String getDEFAULT_SCHEMA_MD5() {
        return (String) DEFAULT_SCHEMA_MD5.getValue(this, $$delegatedProperties[3]);
    }

    @NotNull
    public final String getDefault_md5() {
        return default_md5;
    }

    public final boolean getIS_SUPPORT_SCHEMA() {
        return ((Boolean) IS_SUPPORT_SCHEMA.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    public final boolean getIS_USE_LOCAL_SCHEMA() {
        return ((Boolean) IS_USE_LOCAL_SCHEMA.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final boolean getIS_USE_NATIVE_PARSER() {
        return ((Boolean) IS_USE_NATIVE_PARSER.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final long getPRE_REQUEST_SCHEMA() {
        return ((Number) PRE_REQUEST_SCHEMA.getValue(this, $$delegatedProperties[4])).longValue();
    }

    @NotNull
    public final String getSCHEMA_MD5() {
        return (String) SCHEMA_MD5.getValue(this, $$delegatedProperties[2]);
    }

    @NotNull
    public final String getSchemaMd5() {
        return Intrinsics.areEqual(getSCHEMA_MD5(), getDEFAULT_SCHEMA_MD5()) ? getDEFAULT_SCHEMA_MD5() : getSCHEMA_MD5();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "ParserPreference";
    }

    public final boolean isMd5Updated() {
        return !Intrinsics.areEqual(getSCHEMA_MD5(), getDEFAULT_SCHEMA_MD5());
    }

    public final void setDEFAULT_SCHEMA_MD5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        DEFAULT_SCHEMA_MD5.setValue(this, $$delegatedProperties[3], str);
    }

    public final void setIS_SUPPORT_SCHEMA(boolean z) {
        IS_SUPPORT_SCHEMA.setValue(this, $$delegatedProperties[5], Boolean.valueOf(z));
    }

    public final void setIS_USE_LOCAL_SCHEMA(boolean z) {
        IS_USE_LOCAL_SCHEMA.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setIS_USE_NATIVE_PARSER(boolean z) {
        IS_USE_NATIVE_PARSER.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setPRE_REQUEST_SCHEMA(long j) {
        PRE_REQUEST_SCHEMA.setValue(this, $$delegatedProperties[4], Long.valueOf(j));
    }

    public final void setSCHEMA_MD5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        SCHEMA_MD5.setValue(this, $$delegatedProperties[2], str);
    }

    public final void setSchemaMd5(@NotNull String md5) {
        Intrinsics.checkNotNullParameter(md5, "md5");
        setSCHEMA_MD5(md5);
    }
}
