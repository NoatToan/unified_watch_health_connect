package com.xiaomi.fitness.cache.sp;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.SharedPreferences;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.tencent.mmkv.MMKV;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.bindings.Clearable;
import com.xiaomi.fitness.cache.sp.bindings.PreferenceFieldBinder;
import com.xiaomi.fitness.cache.sp.bindings.PreferenceFieldBinderCaching;
import com.xiaomi.fitness.cache.sp.bindings.PreferenceFieldBinderNullable;
import com.xiaomi.fitness.cache.sp.bindings.PreferenceFieldBinderNullableCaching;
import com.xiaomi.fitness.cache.sp.bindings.PreferenceFieldMigrator;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.KCallablesJvm;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\t\b&\u0018\u0000 T2\u00020\u0001:\u0001TB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002J\u0014\u0010!\u001a\u00020\r2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002J\u0014\u0010\"\u001a\u00020\r2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005H\u0004JD\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H%0$\"\n\b\u0000\u0010%\u0018\u0001*\u00020\u00012\u0006\u0010&\u001a\u0002H%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010(\u001a\u00020\u001cH\u0084\b¢\u0006\u0002\u0010)J9\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u0001H%0$\"\n\b\u0000\u0010%\u0018\u0001*\u00020\u00012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010(\u001a\u00020\u001cH\u0084\bJU\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H%0$\"\b\b\u0000\u0010%*\u00020\u00012\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H%0,2\u0006\u0010-\u001a\u00020.2\u0006\u0010&\u001a\u0002H%2\b\u0010'\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010(\u001a\u00020\u001cH\u0004¢\u0006\u0002\u0010/Je\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H%0$\"\b\b\u0000\u0010%*\u00020\u00012\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H%0,2\u0006\u0010-\u001a\u00020.2\u0006\u0010&\u001a\u0002H%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0005H\u0004¢\u0006\u0002\u00103JR\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H%0$\"\n\b\u0000\u0010%\u0018\u0001*\u00020\u00012\u0006\u0010&\u001a\u0002H%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0005H\u0084\b¢\u0006\u0002\u00104JJ\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u0001H%0$\"\b\b\u0000\u0010%*\u00020\u00012\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H%0,2\u0006\u0010-\u001a\u00020.2\b\u0010'\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010(\u001a\u00020\u001cH\u0004J\u0010\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u001cJ\u0006\u00108\u001a\u000206J&\u00109\u001a\u0002062\u001c\u0010:\u001a\u0018\u0012\u0004\u0012\u00020<\u0012\b\u0012\u0006\u0012\u0002\b\u00030=\u0012\u0004\u0012\u0002060;H\u0002J\u0012\u00105\u001a\u0002062\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u001e\u0010>\u001a\u0002062\u0006\u0010 \u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u0001J\u0016\u0010>\u001a\u0002062\u0006\u0010'\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u0001J-\u0010@\u001a\u0002H%\"\b\b\u0000\u0010%*\u00020\u00012\u0006\u0010 \u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0006\u0010&\u001a\u0002H%¢\u0006\u0002\u0010AJ%\u0010@\u001a\u0002H%\"\b\b\u0000\u0010%*\u00020\u00012\u0006\u0010'\u001a\u00020\u00052\u0006\u0010&\u001a\u0002H%¢\u0006\u0002\u0010BJU\u0010C\u001a\u0002H%\"\b\b\u0000\u0010%*\u00020\u00012\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H%0,2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010&\u001a\u0002H%2\b\b\u0002\u0010D\u001a\u00020\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010EJL\u0010C\u001a\u0002H%\"\n\b\u0000\u0010%\u0018\u0001*\u00020\u00012\u0006\u0010F\u001a\u00020\u00052\b\b\u0002\u0010D\u001a\u00020\u00052\u0006\u0010&\u001a\u0002H%2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0005H\u0086\b¢\u0006\u0002\u0010GJ5\u0010H\u001a\u0004\u0018\u0001H%\"\b\b\u0000\u0010%*\u00020\u00012\u0006\u0010 \u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H%0,¢\u0006\u0002\u0010IJ-\u0010H\u001a\u0004\u0018\u0001H%\"\b\b\u0000\u0010%*\u00020\u00012\u0006\u0010'\u001a\u00020\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H%0,¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010L¢\u0006\u0002\u0010MJ\u0016\u0010N\u001a\u0002062\u0006\u0010 \u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005J\u000e\u0010N\u001a\u0002062\u0006\u0010'\u001a\u00020\u0005J\u000e\u0010O\u001a\u0002062\u0006\u0010P\u001a\u00020\u0014J\u000e\u0010Q\u001a\u0002062\u0006\u0010P\u001a\u00020\u0014J\u001f\u0010R\u001a\u0002062\b\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010'\u001a\u00020\u0005H\u0000¢\u0006\u0002\bSR\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001d¨\u0006U"}, d2 = {"Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "mode", "", "getMode", "()I", "preferences", "Landroid/content/SharedPreferences;", "getPreferences", "()Landroid/content/SharedPreferences;", "preferences$delegate", "Lkotlin/Lazy;", "mChangeListeners", "", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "receiver", "Landroid/content/BroadcastReceiver;", "getReceiver$cache_release", "()Landroid/content/BroadcastReceiver;", "setReceiver$cache_release", "(Landroid/content/BroadcastReceiver;)V", "isMultipleProcessListener", "", "()Z", "getEditor", "Landroid/content/SharedPreferences$Editor;", "name", "getSharedPreferences", "newPreferences", "bindToPreferenceField", "Lkotlin/properties/ReadWriteProperty;", "T", "default", "key", "caching", "(Ljava/lang/Object;Ljava/lang/String;Z)Lkotlin/properties/ReadWriteProperty;", "bindToPreferenceFieldNullable", "clazz", "Lkotlin/reflect/KClass;", "type", "Ljava/lang/reflect/Type;", "(Lkotlin/reflect/KClass;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/String;Z)Lkotlin/properties/ReadWriteProperty;", "bindAndMigratePrefer", "srcId", "srcKey", "(Lkotlin/reflect/KClass;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlin/properties/ReadWriteProperty;", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlin/properties/ReadWriteProperty;", CervicalMucusRecord.Appearance.CLEAR, "", "safety", "clearCache", "forEachDelegate", PluginDeviceInfo.FBLUETOOTHPAIR, "Lkotlin/Function2;", "Lcom/xiaomi/fitness/cache/sp/bindings/Clearable;", "Lkotlin/reflect/KProperty;", "putValue", "value", "getValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getAndMigrateValue", "dstId", "(Lkotlin/reflect/KClass;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "dstKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "getTypeValue", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "getAllKeys", "", "()[Ljava/lang/String;", "remove", "registerOnSharedPreferenceChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "unregisterOnSharedPreferenceChangeListener", "notifyChange", "notifyChange$cache_release", "Companion", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPreferenceSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,447:1\n808#2,11:448\n1872#2,3:465\n1863#2,2:468\n37#3:459\n36#3,3:460\n575#4:463\n1#5:464\n*S KotlinDebug\n*F\n+ 1 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n261#1:448,11\n389#1:465,3\n443#1:468,2\n386#1:459\n386#1:460,3\n389#1:463\n389#1:464\n*E\n"})
public abstract class PreferenceSupport {

    @NotNull
    private static final String IMPORTED_SHAREPREFENCE = "imported_shareprefence";

    @NotNull
    private static final String SP_NAME_DEFAULT = "app_pref";
    private final boolean isMultipleProcessListener;

    @Nullable
    private List<SharedPreferences.OnSharedPreferenceChangeListener> mChangeListeners;
    private final int mode = 2;

    /* JADX INFO: renamed from: preferences$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy preferences = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: b7i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PreferenceSupport.preferences_delegate$lambda$0(this.f3887a);
        }
    });

    @Nullable
    private BroadcastReceiver receiver;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.xiaomi.fitness.cache.sp.PreferenceSupport$bindAndMigratePrefer$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"com/xiaomi/fitness/cache/sp/PreferenceSupport$bindAndMigratePrefer$1", "Lcom/xiaomi/fitness/cache/sp/TypeToken;", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 176)
    public static final class AnonymousClass1<T> extends TypeToken<T> {
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.xiaomi.fitness.cache.sp.PreferenceSupport$bindToPreferenceField$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"com/xiaomi/fitness/cache/sp/PreferenceSupport$bindToPreferenceField$1", "Lcom/xiaomi/fitness/cache/sp/TypeToken;", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 176)
    public static final class C18301<T> extends TypeToken<T> {
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.xiaomi.fitness.cache.sp.PreferenceSupport$bindToPreferenceFieldNullable$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"com/xiaomi/fitness/cache/sp/PreferenceSupport$bindToPreferenceFieldNullable$1", "Lcom/xiaomi/fitness/cache/sp/TypeToken;", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 176)
    public static final class C18311<T> extends TypeToken<T> {
    }

    public static /* synthetic */ ReadWriteProperty bindAndMigratePrefer$default(PreferenceSupport preferenceSupport, KClass kClass, Type type, Object obj, String str, String str2, String str3, int i, Object obj2) {
        if (obj2 == null) {
            return preferenceSupport.bindAndMigratePrefer(kClass, type, obj, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindAndMigratePrefer");
    }

    public static /* synthetic */ ReadWriteProperty bindToPreferenceField$default(PreferenceSupport preferenceSupport, Object obj, String str, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindToPreferenceField");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z = true;
        }
        Intrinsics.checkNotNullParameter(obj, "default");
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.needClassReification();
        return preferenceSupport.bindToPreferenceField(orCreateKotlinClass, new C18301().getType(), obj, str2, z);
    }

    public static /* synthetic */ ReadWriteProperty bindToPreferenceFieldNullable$default(PreferenceSupport preferenceSupport, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindToPreferenceFieldNullable");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.needClassReification();
        return preferenceSupport.bindToPreferenceFieldNullable(orCreateKotlinClass, new C18311().getType(), str, z);
    }

    public static /* synthetic */ void clear$default(PreferenceSupport preferenceSupport, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clear");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        preferenceSupport.clear(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clear$lambda$1(boolean z, PreferenceSupport this$0, Clearable delegate, KProperty property) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(property, "property");
        if (z && StringsKt__StringsJVMKt.startsWith$default(property.getName(), RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR, false, 2, null)) {
            return Unit.INSTANCE;
        }
        delegate.clear(this$0, property);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearCache$lambda$2(Clearable delegate, KProperty kProperty) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
        delegate.clearCache();
        return Unit.INSTANCE;
    }

    private final void forEachDelegate(Function2<? super Clearable, ? super KProperty<?>, Unit> f) {
        Collection declaredMemberProperties = KClasses.getDeclaredMemberProperties(Reflection.getOrCreateKotlinClass(getClass()));
        ArrayList<KProperty1> arrayList = new ArrayList();
        for (Object obj : declaredMemberProperties) {
            if (obj instanceof KProperty1) {
                arrayList.add(obj);
            }
        }
        for (KProperty1 kProperty1 : arrayList) {
            boolean zIsAccessible = KCallablesJvm.isAccessible(kProperty1);
            if (!zIsAccessible) {
                KCallablesJvm.setAccessible(kProperty1, true);
            }
            Object delegate = kProperty1.getDelegate(getPreferences());
            if (delegate instanceof Clearable) {
                f.invoke(delegate, kProperty1);
            }
            KCallablesJvm.setAccessible(kProperty1, zIsAccessible);
        }
    }

    public static /* synthetic */ Object getAndMigrateValue$default(PreferenceSupport preferenceSupport, KClass kClass, String str, Object obj, String str2, String str3, String str4, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMigrateValue");
        }
        if ((i & 8) != 0) {
            str2 = preferenceSupport.getSpName();
        }
        return preferenceSupport.getAndMigrateValue(kClass, str, obj, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }

    private final SharedPreferences.Editor getEditor(String name) {
        if (name == null || name.length() == 0 || Intrinsics.areEqual(name, getSpName())) {
            SharedPreferences.Editor editorEdit = getPreferences().edit();
            Intrinsics.checkNotNull(editorEdit);
            return editorEdit;
        }
        SharedPreferences.Editor editorEdit2 = newPreferences(name).edit();
        Intrinsics.checkNotNull(editorEdit2);
        return editorEdit2;
    }

    public static /* synthetic */ SharedPreferences.Editor getEditor$default(PreferenceSupport preferenceSupport, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEditor");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return preferenceSupport.getEditor(str);
    }

    private final SharedPreferences getSharedPreferences(String name) {
        return (name == null || name.length() == 0 || Intrinsics.areEqual(name, getSpName())) ? getPreferences() : newPreferences(name);
    }

    public static /* synthetic */ SharedPreferences getSharedPreferences$default(PreferenceSupport preferenceSupport, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSharedPreferences");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return preferenceSupport.getSharedPreferences(str);
    }

    public static /* synthetic */ SharedPreferences newPreferences$default(PreferenceSupport preferenceSupport, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newPreferences");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return preferenceSupport.newPreferences(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences preferences_delegate$lambda$0(PreferenceSupport this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return newPreferences$default(this$0, null, 1, null);
    }

    @NotNull
    public final <T> ReadWriteProperty<PreferenceSupport, T> bindAndMigratePrefer(@NotNull KClass<T> clazz, @NotNull Type type, @NotNull T t, @Nullable String key, @Nullable String srcId, @Nullable String srcKey) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(t, "default");
        return new PreferenceFieldMigrator(clazz, type, t, key, srcId, srcKey);
    }

    public final /* synthetic */ <T> ReadWriteProperty<PreferenceSupport, T> bindToPreferenceField(T t, String key, boolean caching) {
        Intrinsics.checkNotNullParameter(t, "default");
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.needClassReification();
        return bindToPreferenceField(orCreateKotlinClass, new C18301().getType(), t, key, caching);
    }

    public final /* synthetic */ <T> ReadWriteProperty<PreferenceSupport, T> bindToPreferenceFieldNullable(String key, boolean caching) {
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.needClassReification();
        return bindToPreferenceFieldNullable(orCreateKotlinClass, new C18311().getType(), key, caching);
    }

    public final void clear(final boolean safety) {
        forEachDelegate(new Function2() { // from class: a7i
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PreferenceSupport.clear$lambda$1(safety, this, (Clearable) obj, (KProperty) obj2);
            }
        });
    }

    public final void clearCache() {
        forEachDelegate(new Function2() { // from class: c7i
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PreferenceSupport.clearCache$lambda$2((Clearable) obj, (KProperty) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final String[] getAllKeys() {
        if (getPreferences() instanceof MMKV) {
            SharedPreferences preferences = getPreferences();
            Intrinsics.checkNotNull(preferences, "null cannot be cast to non-null type com.tencent.mmkv.MMKV");
            return ((MMKV) preferences).allKeys();
        }
        int i = 0;
        getPreferences().getAll().keySet().toArray(new String[0]);
        Map<String, ?> all = getPreferences().getAll();
        int size = all.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = "";
        }
        for (Object obj : all.entrySet()) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Object key = ((Map.Entry) obj).getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            strArr[i] = key;
            i = i3;
        }
        return strArr;
    }

    @NotNull
    public final <T> T getAndMigrateValue(@NotNull KClass<T> clazz, @NotNull String key, @NotNull T t, @NotNull String dstId, @Nullable String srcId, @Nullable String srcKey) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(t, "default");
        Intrinsics.checkNotNullParameter(dstId, "dstId");
        return (T) SpExtKt.getAndMigrateValue(getSharedPreferences(dstId), key, clazz, new TypeToken<T>() { // from class: com.xiaomi.fitness.cache.sp.PreferenceSupport.getAndMigrateValue.1
        }.getType(), t, dstId, srcId, srcKey);
    }

    public int getMode() {
        return this.mode;
    }

    @NotNull
    public SharedPreferences getPreferences() {
        return (SharedPreferences) this.preferences.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: getReceiver$cache_release, reason: from getter */
    public final BroadcastReceiver getReceiver() {
        return this.receiver;
    }

    @NotNull
    public abstract String getSpName();

    @Nullable
    public final <T> T getTypeValue(@NotNull String name, @NotNull String key, @NotNull KClass<T> clazz) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) SpExtKt.getFromPreference(getSharedPreferences(name), clazz, new TypeToken<T>() { // from class: com.xiaomi.fitness.cache.sp.PreferenceSupport.getTypeValue.1
        }.getType(), key);
    }

    @NotNull
    public final <T> T getValue(@NotNull String name, @NotNull String key, @NotNull T t) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(t, "default");
        T t2 = (T) SpExtKt.getFromPreference(getSharedPreferences(name), Reflection.getOrCreateKotlinClass(t.getClass()), new TypeToken<T>() { // from class: com.xiaomi.fitness.cache.sp.PreferenceSupport.getValue.1
        }.getType(), t, key);
        Intrinsics.checkNotNull(t2);
        return t2;
    }

    /* JADX INFO: renamed from: isMultipleProcessListener, reason: from getter */
    public boolean getIsMultipleProcessListener() {
        return this.isMultipleProcessListener;
    }

    @NotNull
    public final SharedPreferences newPreferences(@Nullable String name) {
        if (name == null || name.length() == 0) {
            name = getSpName();
        }
        MMKV mmkvG = MMKV.G(name, getMode());
        if (!mmkvG.d(IMPORTED_SHAREPREFENCE, false)) {
            SharedPreferences sharedPreferences = ApplicationExtKt.getApplication().getSharedPreferences(name, 0);
            mmkvG.y(sharedPreferences);
            mmkvG.w(IMPORTED_SHAREPREFENCE, true);
            sharedPreferences.edit().clear().apply();
        }
        return mmkvG;
    }

    public final void notifyChange$cache_release(@Nullable String name, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        List<SharedPreferences.OnSharedPreferenceChangeListener> list = this.mChangeListeners;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((SharedPreferences.OnSharedPreferenceChangeListener) it.next()).onSharedPreferenceChanged(getSharedPreferences(name), key);
            }
        }
    }

    public final void putValue(@NotNull String name, @NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        SpExtKt.putValue(getEditor(name), Reflection.getOrCreateKotlinClass(value.getClass()), value, key).apply();
        PreferenceReceiver.INSTANCE.sendBroadcast(this, key, name);
    }

    public final synchronized void registerOnSharedPreferenceChangeListener(@NotNull SharedPreferences.OnSharedPreferenceChangeListener listener) {
        try {
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (this.mChangeListeners == null) {
                this.mChangeListeners = new ArrayList();
                PreferenceReceiver.INSTANCE.register(this);
            }
            List<SharedPreferences.OnSharedPreferenceChangeListener> list = this.mChangeListeners;
            Intrinsics.checkNotNull(list);
            list.add(listener);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void remove(@NotNull String name, @NotNull String key) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(key, "key");
        getEditor(name).remove(key).apply();
        PreferenceReceiver.INSTANCE.sendBroadcast(this, key, name);
    }

    public final void setReceiver$cache_release(@Nullable BroadcastReceiver broadcastReceiver) {
        this.receiver = broadcastReceiver;
    }

    public final synchronized void unregisterOnSharedPreferenceChangeListener(@NotNull SharedPreferences.OnSharedPreferenceChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<SharedPreferences.OnSharedPreferenceChangeListener> list = this.mChangeListeners;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            list.remove(listener);
            List<SharedPreferences.OnSharedPreferenceChangeListener> list2 = this.mChangeListeners;
            Intrinsics.checkNotNull(list2);
            if (list2.isEmpty()) {
                this.mChangeListeners = null;
                PreferenceReceiver.INSTANCE.unregister(this);
            }
        }
    }

    public static /* synthetic */ ReadWriteProperty bindAndMigratePrefer$default(PreferenceSupport preferenceSupport, Object obj, String str, String str2, String str3, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindAndMigratePrefer");
        }
        String str4 = (i & 2) != 0 ? null : str;
        String str5 = (i & 4) != 0 ? null : str2;
        String str6 = (i & 8) != 0 ? null : str3;
        Intrinsics.checkNotNullParameter(obj, "default");
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.needClassReification();
        return preferenceSupport.bindAndMigratePrefer(orCreateKotlinClass, new AnonymousClass1().getType(), obj, str4, str5, str6);
    }

    public static /* synthetic */ void clear$default(PreferenceSupport preferenceSupport, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clear");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        preferenceSupport.clear(str);
    }

    public final /* synthetic */ <T> ReadWriteProperty<PreferenceSupport, T> bindAndMigratePrefer(T t, String key, String srcId, String srcKey) {
        Intrinsics.checkNotNullParameter(t, "default");
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.needClassReification();
        return bindAndMigratePrefer(orCreateKotlinClass, new AnonymousClass1().getType(), t, key, srcId, srcKey);
    }

    @NotNull
    public final <T> ReadWriteProperty<PreferenceSupport, T> bindToPreferenceField(@NotNull KClass<T> clazz, @NotNull Type type, @NotNull T t, @Nullable String key, boolean caching) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(t, "default");
        return caching ? new PreferenceFieldBinderCaching(clazz, type, t, key) : new PreferenceFieldBinder(clazz, type, t, key);
    }

    @NotNull
    public final <T> ReadWriteProperty<PreferenceSupport, T> bindToPreferenceFieldNullable(@NotNull KClass<T> clazz, @NotNull Type type, @Nullable String key, boolean caching) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(type, "type");
        return caching ? new PreferenceFieldBinderNullableCaching(clazz, type, key) : new PreferenceFieldBinderNullable(clazz, type, key);
    }

    public final void clear(@Nullable String spName) {
        Application application = ApplicationExtKt.getApplication();
        if (spName == null || spName.length() == 0) {
            spName = getSpName();
        }
        application.deleteSharedPreferences(spName);
    }

    public static /* synthetic */ ReadWriteProperty bindToPreferenceFieldNullable$default(PreferenceSupport preferenceSupport, KClass kClass, Type type, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindToPreferenceFieldNullable");
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return preferenceSupport.bindToPreferenceFieldNullable(kClass, type, str, z);
    }

    public static /* synthetic */ Object getAndMigrateValue$default(PreferenceSupport preferenceSupport, String dstKey, String str, Object obj, String str2, String str3, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                str = preferenceSupport.getSpName();
            }
            String dstId = str;
            String str4 = (i & 8) != 0 ? null : str2;
            String str5 = (i & 16) != 0 ? null : str3;
            Intrinsics.checkNotNullParameter(dstKey, "dstKey");
            Intrinsics.checkNotNullParameter(dstId, "dstId");
            Intrinsics.checkNotNullParameter(obj, "default");
            Intrinsics.reifiedOperationMarker(4, "T");
            return preferenceSupport.getAndMigrateValue(Reflection.getOrCreateKotlinClass(Object.class), dstKey, obj, dstId, str5, str4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMigrateValue");
    }

    public final void putValue(@NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        putValue(getSpName(), key, value);
    }

    public final void remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        remove(getSpName(), key);
    }

    public static /* synthetic */ ReadWriteProperty bindToPreferenceField$default(PreferenceSupport preferenceSupport, KClass kClass, Type type, Object obj, String str, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindToPreferenceField");
        }
        if ((i & 16) != 0) {
            z = true;
        }
        return preferenceSupport.bindToPreferenceField(kClass, type, obj, str, z);
    }

    public final /* synthetic */ <T> T getAndMigrateValue(String dstKey, String dstId, T t, String srcKey, String srcId) {
        Intrinsics.checkNotNullParameter(dstKey, "dstKey");
        Intrinsics.checkNotNullParameter(dstId, "dstId");
        Intrinsics.checkNotNullParameter(t, "default");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Object.class), dstKey, t, dstId, srcId, srcKey);
    }

    @Nullable
    public final <T> T getTypeValue(@NotNull String key, @NotNull KClass<T> clazz) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) SpExtKt.getFromPreference(getPreferences(), clazz, new TypeToken<T>() { // from class: com.xiaomi.fitness.cache.sp.PreferenceSupport.getTypeValue.2
        }.getType(), key);
    }

    @NotNull
    public final <T> T getValue(@NotNull String key, @NotNull T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(t, "default");
        return (T) getValue(getSpName(), key, t);
    }
}
