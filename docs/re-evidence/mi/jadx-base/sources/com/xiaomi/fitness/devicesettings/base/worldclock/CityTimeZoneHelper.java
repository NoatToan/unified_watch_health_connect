package com.xiaomi.fitness.devicesettings.base.worldclock;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.actions.SearchIntents;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import defpackage.lhi;
import defpackage.wzi;
import defpackage.zwh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u0006J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020\u0006J(\u0010 \u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r2\u0006\u0010!\u001a\u00020\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010#J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0006H\u0002J\u0018\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0006H\u0002J\u0018\u0010(\u001a\u00020\u00122\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010#H\u0002J\u0018\u0010*\u001a\u00020\u00122\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010#H\u0002R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR.\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/worldclock/CityTimeZoneHelper;", "", "<init>", "()V", "mChinese2PinyinCityName", "Ljava/util/HashMap;", "", "mChinese2PinyinCountryName", "timeZoneMap", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/TimeZoneItem;", "getTimeZoneMap", "()Ljava/util/HashMap;", "value", "Ljava/util/ArrayList;", "allCityList", "getAllCityList", "()Ljava/util/ArrayList;", "init", "", "context", "Landroid/content/Context;", "getCityTimezoneItemById", "cityId", "loadCitiesFromXml", "mContext", "getCityListByCityIdList", "", "ids", "", "([Ljava/lang/String;)Ljava/util/List;", "getFirstCityByTZId", "timeZoneId", "queryCityTimezoneItems", SearchIntents.EXTRA_QUERY, "list", "", "chinese2PinyinCityNameContainQuery", "", "item", "chinese2PinyinCountryNameContainQuery", "buildChinese2CityPinYin", "cityTimezoneItems", "buildChinese2CountryPinYin", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CityTimeZoneHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "WCCityTimeZoneHelper";

    @Nullable
    private static Locale preLocal;

    @Nullable
    private static CityTimeZoneHelper sInstance;

    @Nullable
    private ArrayList<TimeZoneItem> allCityList;

    @Nullable
    private HashMap<String, String> mChinese2PinyinCityName;

    @Nullable
    private HashMap<String, String> mChinese2PinyinCountryName;

    @NotNull
    private final HashMap<String, TimeZoneItem> timeZoneMap = new HashMap<>();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/worldclock/CityTimeZoneHelper$Companion;", "", "<init>", "()V", "TAG", "", "sInstance", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/CityTimeZoneHelper;", "preLocal", "Ljava/util/Locale;", "instance", "getInstance", "()Lcom/xiaomi/fitness/devicesettings/base/worldclock/CityTimeZoneHelper;", "transformCityId", "cityId", "isChineseLocale", "", "()Z", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String transformCityId(String cityId) {
            return cityId;
        }

        @Nullable
        public final synchronized CityTimeZoneHelper getInstance() {
            try {
                if (CityTimeZoneHelper.sInstance == null) {
                    CityTimeZoneHelper.sInstance = new CityTimeZoneHelper();
                }
            } catch (Throwable th) {
                throw th;
            }
            return CityTimeZoneHelper.sInstance;
        }

        public final boolean isChineseLocale() {
            return Intrinsics.areEqual(Locale.getDefault(), Locale.CHINESE) || Intrinsics.areEqual(Locale.getDefault(), Locale.SIMPLIFIED_CHINESE) || Intrinsics.areEqual(Locale.getDefault(), Locale.TRADITIONAL_CHINESE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.worldclock.CityTimeZoneHelper$buildChinese2CityPinYin$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.worldclock.CityTimeZoneHelper$buildChinese2CityPinYin$1", f = "CityTimeZoneHelper.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<TimeZoneItem> $cityTimezoneItems;
        int label;
        final /* synthetic */ CityTimeZoneHelper this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.worldclock.CityTimeZoneHelper$buildChinese2CityPinYin$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.worldclock.CityTimeZoneHelper$buildChinese2CityPinYin$1$1", f = "CityTimeZoneHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<TimeZoneItem> $cityTimezoneItems;
            int label;
            final /* synthetic */ CityTimeZoneHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04481(List<? extends TimeZoneItem> list, CityTimeZoneHelper cityTimeZoneHelper, Continuation<? super C04481> continuation) {
                super(2, continuation);
                this.$cityTimezoneItems = list;
                this.this$0 = cityTimeZoneHelper;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04481(this.$cityTimezoneItems, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.$cityTimezoneItems != null && this.this$0.mChinese2PinyinCityName != null) {
                    this.this$0.mChinese2PinyinCityName = new HashMap();
                    Iterator<TimeZoneItem> it = this.$cityTimezoneItems.iterator();
                    while (it.hasNext()) {
                        String strC = it.next().c();
                        String strC2 = zwh.c(strC);
                        Intrinsics.checkNotNullExpressionValue(strC2, "getPingYin(...)");
                        String lowerCase = strC2.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        HashMap map = this.this$0.mChinese2PinyinCityName;
                        Intrinsics.checkNotNull(map);
                        map.put(strC, lowerCase);
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<? extends TimeZoneItem> list, CityTimeZoneHelper cityTimeZoneHelper, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$cityTimezoneItems = list;
            this.this$0 = cityTimeZoneHelper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$cityTimezoneItems, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04481 c04481 = new C04481(this.$cityTimezoneItems, this.this$0, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04481, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.worldclock.CityTimeZoneHelper$buildChinese2CountryPinYin$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.worldclock.CityTimeZoneHelper$buildChinese2CountryPinYin$1", f = "CityTimeZoneHelper.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<TimeZoneItem> $cityTimezoneItems;
        int label;
        final /* synthetic */ CityTimeZoneHelper this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.worldclock.CityTimeZoneHelper$buildChinese2CountryPinYin$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.worldclock.CityTimeZoneHelper$buildChinese2CountryPinYin$1$1", f = "CityTimeZoneHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<TimeZoneItem> $cityTimezoneItems;
            int label;
            final /* synthetic */ CityTimeZoneHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04491(List<? extends TimeZoneItem> list, CityTimeZoneHelper cityTimeZoneHelper, Continuation<? super C04491> continuation) {
                super(2, continuation);
                this.$cityTimezoneItems = list;
                this.this$0 = cityTimeZoneHelper;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04491(this.$cityTimezoneItems, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.$cityTimezoneItems != null && this.this$0.mChinese2PinyinCountryName != null) {
                    this.this$0.mChinese2PinyinCountryName = new HashMap();
                    Iterator<TimeZoneItem> it = this.$cityTimezoneItems.iterator();
                    while (it.hasNext()) {
                        String strE = it.next().e();
                        String strC = zwh.c(strE);
                        Intrinsics.checkNotNullExpressionValue(strC, "getPingYin(...)");
                        String lowerCase = strC.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        HashMap map = this.this$0.mChinese2PinyinCountryName;
                        Intrinsics.checkNotNull(map);
                        map.put(strE, lowerCase);
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20201(List<? extends TimeZoneItem> list, CityTimeZoneHelper cityTimeZoneHelper, Continuation<? super C20201> continuation) {
            super(2, continuation);
            this.$cityTimezoneItems = list;
            this.this$0 = cityTimeZoneHelper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20201(this.$cityTimezoneItems, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04491 c04491 = new C04491(this.$cityTimezoneItems, this.this$0, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04491, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void buildChinese2CityPinYin(List<? extends TimeZoneItem> cityTimezoneItems) {
        ScopeExtKt.scope$default(null, new AnonymousClass1(cityTimezoneItems, this, null), 1, null);
    }

    private final void buildChinese2CountryPinYin(List<? extends TimeZoneItem> cityTimezoneItems) {
        ScopeExtKt.scope$default(null, new C20201(cityTimezoneItems, this, null), 1, null);
    }

    private final boolean chinese2PinyinCityNameContainQuery(TimeZoneItem item, String query) {
        HashMap<String, String> map = this.mChinese2PinyinCityName;
        if (map == null) {
            buildChinese2CityPinYin(this.allCityList);
            return false;
        }
        Intrinsics.checkNotNull(map);
        String str = map.get(item.c());
        if (str != null) {
            return StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) query, false, 2, (Object) null);
        }
        return false;
    }

    private final boolean chinese2PinyinCountryNameContainQuery(TimeZoneItem item, String query) {
        HashMap<String, String> map = this.mChinese2PinyinCountryName;
        if (map == null) {
            buildChinese2CountryPinYin(this.allCityList);
            return false;
        }
        Intrinsics.checkNotNull(map);
        String str = map.get(item.e());
        if (str != null) {
            return StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) query, false, 2, (Object) null);
        }
        return false;
    }

    private final ArrayList<TimeZoneItem> loadCitiesFromXml(Context mContext) {
        Resources resources = mContext.getResources();
        String[] stringArray = resources.getStringArray(lhi.e);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        String[] stringArray2 = resources.getStringArray(lhi.d);
        Intrinsics.checkNotNullExpressionValue(stringArray2, "getStringArray(...)");
        String[] stringArray3 = resources.getStringArray(lhi.c);
        Intrinsics.checkNotNullExpressionValue(stringArray3, "getStringArray(...)");
        String[] stringArray4 = resources.getStringArray(lhi.g);
        Intrinsics.checkNotNullExpressionValue(stringArray4, "getStringArray(...)");
        ArrayList<TimeZoneItem> arrayList = new ArrayList<>();
        this.timeZoneMap.clear();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int length = stringArray.length;
        int i = 0;
        while (i < length) {
            TimeZoneItem timeZoneItem = new TimeZoneItem(stringArray4[i], Intrinsics.areEqual(stringArray3[i], "C316") ? ResourceExtKt.getString(wzi.ua) : stringArray[i], stringArray2[i], stringArray3[i], jCurrentTimeMillis);
            arrayList.add(timeZoneItem);
            this.timeZoneMap.put(timeZoneItem.d(), timeZoneItem);
            i++;
            stringArray4 = stringArray4;
        }
        return arrayList;
    }

    @Nullable
    public final ArrayList<TimeZoneItem> getAllCityList() {
        return this.allCityList;
    }

    @NotNull
    public final List<TimeZoneItem> getCityListByCityIdList(@NotNull String[] ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        ArrayList arrayList = new ArrayList();
        for (String str : ids) {
            TimeZoneItem cityTimezoneItemById = getCityTimezoneItemById(str);
            if (cityTimezoneItemById != null) {
                arrayList.add(cityTimezoneItemById);
            }
        }
        return arrayList;
    }

    @Nullable
    public final TimeZoneItem getCityTimezoneItemById(@NotNull String cityId) {
        Intrinsics.checkNotNullParameter(cityId, "cityId");
        return this.timeZoneMap.get(cityId);
    }

    @Nullable
    public final TimeZoneItem getFirstCityByTZId(@NotNull String timeZoneId) {
        Intrinsics.checkNotNullParameter(timeZoneId, "timeZoneId");
        ArrayList<TimeZoneItem> arrayList = this.allCityList;
        Intrinsics.checkNotNull(arrayList);
        Iterator<TimeZoneItem> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            TimeZoneItem next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            TimeZoneItem timeZoneItem = next;
            if (Intrinsics.areEqual(timeZoneItem.i(), timeZoneId)) {
                return timeZoneItem;
            }
        }
        return null;
    }

    @NotNull
    public final HashMap<String, TimeZoneItem> getTimeZoneMap() {
        return this.timeZoneMap;
    }

    public final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Locale locale = preLocal;
        if (locale == null || !Intrinsics.areEqual(locale, Locale.getDefault())) {
            this.allCityList = loadCitiesFromXml(context);
            if (INSTANCE.isChineseLocale()) {
                buildChinese2CityPinYin(this.allCityList);
                buildChinese2CountryPinYin(this.allCityList);
            }
            preLocal = Locale.getDefault();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0064  */
    @Nullable
    public final ArrayList<TimeZoneItem> queryCityTimezoneItems(@NotNull String query, @Nullable List<? extends TimeZoneItem> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(query, "query");
        if (TextUtils.isEmpty(query)) {
            return this.allCityList;
        }
        if (list == null) {
            list = this.allCityList;
        }
        ArrayList<TimeZoneItem> arrayList = new ArrayList<>();
        String lowerCase = query.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Intrinsics.checkNotNull(list);
        for (TimeZoneItem timeZoneItem : list) {
            if (timeZoneItem != null) {
                String strC = timeZoneItem.c();
                Intrinsics.checkNotNullExpressionValue(strC, "getCity(...)");
                String lowerCase2 = strC.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (!StringsKt__StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) lowerCase, false, 2, (Object) null)) {
                    String strK = timeZoneItem.k();
                    Intrinsics.checkNotNullExpressionValue(strK, "getTimeZoneShortName(...)");
                    String lowerCase3 = strK.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                    z = StringsKt__StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) lowerCase, false, 2, (Object) null);
                }
                if (z || !INSTANCE.isChineseLocale()) {
                    if (z) {
                        arrayList.add(timeZoneItem);
                    }
                } else if (chinese2PinyinCityNameContainQuery(timeZoneItem, lowerCase) || chinese2PinyinCountryNameContainQuery(timeZoneItem, lowerCase)) {
                    arrayList.add(timeZoneItem);
                }
            }
        }
        return arrayList;
    }
}
