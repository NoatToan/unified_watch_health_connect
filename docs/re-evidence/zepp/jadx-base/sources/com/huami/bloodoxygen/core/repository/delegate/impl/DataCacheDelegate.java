package com.huami.bloodoxygen.core.repository.delegate.impl;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.local.database.entity.Odi;
import com.huami.bloodoxygen.core.local.database.entity.OsaEvent;
import com.huami.bloodoxygen.core.local.database.entity.OsaProcess;
import com.huami.bloodoxygen.core.local.database.entity.SyncLog;
import com.huami.bloodoxygen.core.remote.api.event.EventItem;
import com.huami.bloodoxygen.core.repository.delegate.impl.database.ClickSpo2Delegate;
import com.huami.bloodoxygen.core.repository.delegate.impl.database.OdiDelegate;
import com.huami.bloodoxygen.core.repository.delegate.impl.database.OsaEventDelegate;
import com.huami.bloodoxygen.core.repository.delegate.impl.database.OsaProcessDelegate;
import com.huami.bloodoxygen.core.repository.delegate.impl.database.SyncLogDelegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.IHttpDelegate;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import com.huami.bloodoxygen.core.utils.SharedInstanceKt;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 J2\u00020\u0001:\u0001JB?\u0012\u0006\u00104\u001a\u00020\u0013\u0012\u0006\u00107\u001a\u000205\u0012\u0006\u0010;\u001a\u000208\u0012\u0006\u0010>\u001a\u00020<\u0012\u0006\u0010A\u001a\u00020?\u0012\u0006\u0010D\u001a\u00020B\u0012\u0006\u0010G\u001a\u00020E¢\u0006\u0004\bH\u0010IJX\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tH\u0002J2\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0016\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J&\u0010\u0018\u001a\u00020\u0017*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J=\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0006\b\u0000\u0010\u0019\u0018\u0001*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\f\u001a\u00020\t2\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u001aH\u0082\bJ\u001e\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0019\u0018\u0001*\u00020\u000fH\u0082\b¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\"\u001a\u00020\u0017\"\u0006\b\u0000\u0010\u0019\u0018\u0001*\u00020\u00132\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010!\u001a\u00020 H\u0082\b¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020$\"\u0006\b\u0000\u0010\u0019\u0018\u0001*\u00020\u0013H\u0082\bJ@\u0010&\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016JF\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016JF\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016JF\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016JF\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u00100\u001a\u00020\t2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u000eH\u0016J\u0018\u00102\u001a\u00020\t2\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u000eH\u0016R\u0016\u00104\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010=R\u0016\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010@R\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010CR\u0016\u0010G\u001a\u00020E8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010F¨\u0006K"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/delegate/impl/DataCacheDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/IDataCacheDelegate;", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;", "type", "", "from", "to", "", "limit", "", "reverse", "syncNext", "direct", "saveSyncLogEvenWhenDirect", "", "Lcom/huami/bloodoxygen/core/remote/api/event/EventItem;", "b", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "", "f", "events", "h", "", "g", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "e", "i", "(Lcom/huami/bloodoxygen/core/remote/api/event/EventItem;)Ljava/lang/Object;", "t", "", "filedValue", "a", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "Ljava/lang/reflect/Field;", GoogleApiAvailabilityLight.a, "fetchAllTypeData", "Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", "fetchOdi", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "fetchClickSpo2", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaProcess;", "fetchOsaProcess", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaEvent;", "fetchOsaEvent", "osaProcesses", "deleteOsaProcesses", "osaEvents", "deleteOsaEvents", "Ljava/lang/String;", "userId", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/SyncLogDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/SyncLogDelegate;", "syncLogDelegate", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OdiDelegate;", "c", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OdiDelegate;", "odiDelegate", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/ClickSpo2Delegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/ClickSpo2Delegate;", "clickSpo2Delegate", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OsaProcessDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OsaProcessDelegate;", "osaProcessDelegate", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OsaEventDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OsaEventDelegate;", "osaEventDelegate", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/HttpDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/HttpDelegate;", "httpDelegate", "<init>", "(Ljava/lang/String;Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/SyncLogDelegate;Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OdiDelegate;Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/ClickSpo2Delegate;Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OsaProcessDelegate;Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OsaEventDelegate;Lcom/huami/bloodoxygen/core/repository/delegate/impl/HttpDelegate;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class DataCacheDelegate implements IDataCacheDelegate {

    @NotNull
    private static final String h = "DataDelegate";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SyncLogDelegate syncLogDelegate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final OdiDelegate odiDelegate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ClickSpo2Delegate clickSpo2Delegate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final OsaProcessDelegate osaProcessDelegate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final OsaEventDelegate osaEventDelegate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final HttpDelegate httpDelegate;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BloodOxygen.SubType.values().length];
            iArr[BloodOxygen.SubType.ODI.ordinal()] = 1;
            iArr[BloodOxygen.SubType.CLICK.ordinal()] = 2;
            iArr[BloodOxygen.SubType.OSA_PROCESS.ordinal()] = 3;
            iArr[BloodOxygen.SubType.OSA_EVENT.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<BloodOxygen.SubType, Boolean> {
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(1);
            this.b = j;
        }

        public final boolean a(@NotNull BloodOxygen.SubType subType) {
            return DataCacheDelegate.this.syncLogDelegate.getSyncLog(subType, ExtensionKt.toYMD(this.b)) != null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(BloodOxygen.SubType subType) {
            return Boolean.valueOf(a(subType));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;", "type", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<BloodOxygen.SubType, Boolean> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.b = str;
        }

        public final boolean a(@NotNull BloodOxygen.SubType subType) {
            return DataCacheDelegate.this.syncLogDelegate.addSyncLog(new SyncLog(DataCacheDelegate.this.userId, subType, this.b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(BloodOxygen.SubType subType) {
            return Boolean.valueOf(a(subType));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ EventItem a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EventItem eventItem) {
            super(0);
            this.a = eventItem;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "DataDelegate saveToDb date no valid or extra is null " + SharedInstanceKt.getGson().toJson(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ EventItem a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(EventItem eventItem) {
            super(0);
            this.a = eventItem;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "saveToDb subType error " + this.a.getSubType();
        }
    }

    public DataCacheDelegate(@NotNull String str, @NotNull SyncLogDelegate syncLogDelegate, @NotNull OdiDelegate odiDelegate, @NotNull ClickSpo2Delegate clickSpo2Delegate, @NotNull OsaProcessDelegate osaProcessDelegate, @NotNull OsaEventDelegate osaEventDelegate, @NotNull HttpDelegate httpDelegate) {
        this.userId = str;
        this.syncLogDelegate = syncLogDelegate;
        this.odiDelegate = odiDelegate;
        this.clickSpo2Delegate = clickSpo2Delegate;
        this.osaProcessDelegate = osaProcessDelegate;
        this.osaEventDelegate = osaEventDelegate;
        this.httpDelegate = httpDelegate;
    }

    private final /* synthetic */ <T> void a(String str, T t, Object obj) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            Field declaredField = Object.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(t, obj);
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<EventItem> b(BloodOxygen.SubType type, long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect) {
        int i;
        int i2;
        BloodOxygen.SubType subType = type;
        long j = from;
        if (!(j >= 0 && to >= 0 && j <= to)) {
            throw new IllegalStateException(("DataDelegate fetchData time invalid " + j + " " + to).toString());
        }
        ArrayList<Pair<String, String>> arrayListArrayListOf = direct ? CollectionsKt__CollectionsKt.arrayListOf(new Pair(ExtensionKt.toYMDHMS$default(j, null, 1, null), ExtensionKt.toYMDHMS$default(to, null, 1, null))) : f(ExtensionKt.toZeroTimestamp(from), ExtensionKt.toLastTimestamp(to), type);
        ArrayList arrayList = new ArrayList();
        for (Iterator it2 = arrayListArrayListOf.iterator(); it2.hasNext(); it2 = it2) {
            Pair pair = (Pair) it2.next();
            arrayList.addAll(IHttpDelegate.DefaultImpls.getDateEvents$default(this.httpDelegate, (String) pair.getFirst(), (String) pair.getSecond(), type, syncNext, reverse, 0, 32, null));
            j = j;
            subType = subType;
        }
        BloodOxygen.SubType subType2 = subType;
        if (!h(arrayList)) {
            throw new IllegalStateException("DataDelegate saveToDb failed".toString());
        }
        if (direct) {
            if (saveSyncLogEvenWhenDirect) {
                i = 0;
                g(f(from, to, type), subType2);
            } else {
                i = 0;
            }
            i2 = 1;
        } else {
            g(arrayListArrayListOf, subType2);
            arrayList = arrayList;
            i2 = 1;
            i = 0;
        }
        return (limit != i2 || arrayList.size() <= 0) ? arrayList : arrayList.subList(i, i2);
    }

    private final /* synthetic */ <T> Field d(String str) throws NoSuchFieldException {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        Field declaredField = Object.class.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cc A[LOOP:0: B:8:0x0025->B:67:0x01cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private final /* synthetic */ <T> List<T> e(List<EventItem> list, boolean z, Function0<? extends List<? extends T>> function0) {
        Object objM3845constructorimpl;
        Throwable thM3848exceptionOrNullimpl;
        Object objFromJson;
        Object objM3845constructorimpl2;
        Object objM3845constructorimpl3;
        Object objM3845constructorimpl4;
        Object objM3845constructorimpl5;
        if (!z) {
            return function0.getA();
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        if (Intrinsics.areEqual(Object.class, EventItem.class)) {
            return list;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (EventItem eventItem : list) {
            try {
                Result.Companion companion = Result.Companion;
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                if (Intrinsics.areEqual(Object.class, Odi.class)) {
                    objFromJson = SharedInstanceKt.getGson().fromJson(SharedInstanceKt.getGson().toJson(eventItem), (Class<Object>) Odi.class);
                    ((Odi) objFromJson).setUploaded(true);
                    Unit unit = Unit.INSTANCE;
                    Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
                    String ymdhms = ExtensionKt.toYMDHMS(eventItem.getUtcTimestamp(), TimeZone.getTimeZone(eventItem.getTimeZoneId()));
                    try {
                        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                        Field declaredField = Object.class.getDeclaredField("date");
                        declaredField.setAccessible(true);
                        declaredField.set(objFromJson, ymdhms);
                        objM3845constructorimpl5 = Result.m3845constructorimpl(unit);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        objM3845constructorimpl5 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable thM3848exceptionOrNullimpl2 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl5);
                    if (thM3848exceptionOrNullimpl2 != null) {
                        HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl2));
                        Unit unit2 = Unit.INSTANCE;
                    }
                    Unit unit3 = Unit.INSTANCE;
                } else {
                    JSONObject jSONObject = new JSONObject(eventItem.getExtra());
                    Object obj = jSONObject.get("timestamp");
                    if (obj instanceof Double) {
                        jSONObject.remove("timestamp");
                        jSONObject.put("timestamp", (long) ((Number) obj).doubleValue());
                    }
                    Gson gson = SharedInstanceKt.getGson();
                    String string = jSONObject.toString();
                    Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                    objFromJson = gson.fromJson(string, (Class<Object>) Object.class);
                    String userId = eventItem.getUserId();
                    try {
                        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                        Field declaredField2 = Object.class.getDeclaredField("userId");
                        declaredField2.setAccessible(true);
                        Unit unit4 = Unit.INSTANCE;
                        declaredField2.set(objFromJson, userId);
                        objM3845constructorimpl2 = Result.m3845constructorimpl(unit4);
                    } catch (Throwable th2) {
                        Result.Companion companion3 = Result.Companion;
                        objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
                    }
                    Throwable thM3848exceptionOrNullimpl3 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
                    if (thM3848exceptionOrNullimpl3 != null) {
                        HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl3));
                        Unit unit5 = Unit.INSTANCE;
                    }
                    Boolean bool = Boolean.TRUE;
                    try {
                        Result.Companion companion4 = Result.Companion;
                        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                        Field declaredField3 = Object.class.getDeclaredField("uploaded");
                        declaredField3.setAccessible(true);
                        Unit unit6 = Unit.INSTANCE;
                        declaredField3.set(objFromJson, bool);
                        objM3845constructorimpl3 = Result.m3845constructorimpl(unit6);
                    } catch (Throwable th3) {
                        Result.Companion companion5 = Result.Companion;
                        objM3845constructorimpl3 = Result.m3845constructorimpl(ResultKt.createFailure(th3));
                    }
                    Throwable thM3848exceptionOrNullimpl4 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl3);
                    if (thM3848exceptionOrNullimpl4 != null) {
                        HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl4));
                        Unit unit7 = Unit.INSTANCE;
                    }
                    Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                    Field declaredField4 = Object.class.getDeclaredField("utcTimestamp");
                    declaredField4.setAccessible(true);
                    Unit unit8 = Unit.INSTANCE;
                    long j = declaredField4.getLong(objFromJson);
                    Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                    Field declaredField5 = Object.class.getDeclaredField("timeZoneId");
                    declaredField5.setAccessible(true);
                    Object obj2 = declaredField5.get(objFromJson);
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    String ymdhms2 = ExtensionKt.toYMDHMS(j, TimeZone.getTimeZone((String) obj2));
                    try {
                        Result.Companion companion6 = Result.Companion;
                        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                        Field declaredField6 = Object.class.getDeclaredField("date");
                        declaredField6.setAccessible(true);
                        declaredField6.set(objFromJson, ymdhms2);
                        objM3845constructorimpl4 = Result.m3845constructorimpl(unit8);
                    } catch (Throwable th4) {
                        Result.Companion companion7 = Result.Companion;
                        objM3845constructorimpl4 = Result.m3845constructorimpl(ResultKt.createFailure(th4));
                    }
                    Throwable thM3848exceptionOrNullimpl5 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl4);
                    if (thM3848exceptionOrNullimpl5 != null) {
                        HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl5));
                        Unit unit9 = Unit.INSTANCE;
                    }
                    Unit unit10 = Unit.INSTANCE;
                    Result.Companion companion8 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        HMLog.info$default(null, new DataCacheDelegate$switch$2$1(thM3848exceptionOrNullimpl), 1, null);
                        Unit unit11 = Unit.INSTANCE;
                    }
                    if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                        objM3845constructorimpl = null;
                    }
                    if (objM3845constructorimpl == null) {
                        return CollectionsKt__CollectionsKt.emptyList();
                    }
                    arrayList.add(objM3845constructorimpl);
                }
                objM3845constructorimpl = Result.m3845constructorimpl(objFromJson);
            } catch (Throwable th5) {
                Result.Companion companion9 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th5));
            }
            thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.info$default(null, new DataCacheDelegate$switch$2$1(thM3848exceptionOrNullimpl), 1, null);
                Unit unit12 = Unit.INSTANCE;
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = null;
            }
            if (objM3845constructorimpl == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            arrayList.add(objM3845constructorimpl);
        }
        return arrayList;
    }

    private final ArrayList<Pair<String, String>> f(long from, long to, BloodOxygen.SubType type) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(from);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(to);
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        while (calendar.compareTo(calendar2) <= 0) {
            long timeInMillis = calendar.getTimeInMillis();
            calendar.add(6, 1);
            if (!ExtensionKt.handle(type, new a(timeInMillis))) {
                arrayList.add(new Pair<>(ExtensionKt.toYMDHMS$default(ExtensionKt.toZeroTimestamp(timeInMillis), null, 1, null), ExtensionKt.toYMDHMS$default(ExtensionKt.toLastTimestamp(timeInMillis), null, 1, null)));
            }
        }
        return arrayList;
    }

    private final void g(ArrayList<Pair<String, String>> arrayList, BloodOxygen.SubType subType) {
        String ymd = ExtensionKt.toYMD(System.currentTimeMillis());
        ArrayList<String> arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(ExtensionKt.toYMD(ExtensionKt.yMDHMSToTimestamp((String) ((Pair) it2.next()).getFirst())));
        }
        for (String str : arrayList2) {
            if (!Intrinsics.areEqual(str, ymd) && !ExtensionKt.handle(subType, new b(str))) {
                throw new IllegalStateException("DataDelegate save to sync_log failed".toString());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:153:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:223:0x0596  */
    /* JADX WARN: Code duplicated, block: B:226:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:227:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:230:0x05af  */
    /* JADX WARN: Code duplicated, block: B:231:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:233:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:236:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:239:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:311:0x077e  */
    /* JADX WARN: Code duplicated, block: B:312:0x078b  */
    /* JADX WARN: Code duplicated, block: B:315:0x0792  */
    /* JADX WARN: Code duplicated, block: B:316:0x0794  */
    /* JADX WARN: Code duplicated, block: B:319:0x0799  */
    /* JADX WARN: Code duplicated, block: B:321:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:323:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:410:0x03e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x03f9 A[SYNTHETIC] */
    private final boolean h(List<EventItem> events) {
        Class<OsaProcess> cls;
        Class<ClickMeasuredSpo2> cls2;
        ArrayList arrayList;
        Object objM3845constructorimpl;
        Throwable thM3848exceptionOrNullimpl;
        Object obj;
        Object obj2;
        Odi odi;
        Odi localOdi;
        ArrayList arrayList2;
        Object objFromJson;
        Object objM3845constructorimpl2;
        Object objM3845constructorimpl3;
        Object objM3845constructorimpl4;
        Object objM3845constructorimpl5;
        Object objM3845constructorimpl6;
        Throwable thM3848exceptionOrNullimpl2;
        Object obj3;
        ClickMeasuredSpo2 clickMeasuredSpo2;
        int spo2;
        boolean z;
        Object objFromJson2;
        Object objM3845constructorimpl7;
        Object objM3845constructorimpl8;
        Object objM3845constructorimpl9;
        Object objM3845constructorimpl10;
        ArrayList arrayList3;
        Class<OsaProcess> cls3;
        Object objM3845constructorimpl11;
        Throwable thM3848exceptionOrNullimpl3;
        OsaProcess osaProcess;
        Object objFromJson3;
        Object objM3845constructorimpl12;
        Object objM3845constructorimpl13;
        Object objM3845constructorimpl14;
        Object objM3845constructorimpl15;
        Object objM3845constructorimpl16;
        Object objFromJson4;
        Object objM3845constructorimpl17;
        Object objM3845constructorimpl18;
        Object objM3845constructorimpl19;
        Object objM3845constructorimpl20;
        this = this;
        String str = "date";
        String str2 = "date";
        String str3 = "date";
        String str4 = "date";
        Class<OsaProcess> cls4 = OsaProcess.class;
        Class<ClickMeasuredSpo2> cls5 = ClickMeasuredSpo2.class;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it2 = events.iterator();
        while (it2.hasNext()) {
            EventItem eventItem = (EventItem) it2.next();
            if (ExtensionKt.isOdi(eventItem.getSubType()) || !TextUtils.isEmpty(eventItem.getExtra())) {
                it2 = it2;
                int i = WhenMappings.$EnumSwitchMapping$0[ExtensionKt.toSubType(eventItem.getSubType()).ordinal()];
                ArrayList arrayList8 = arrayList5;
                String str5 = str2;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            Class<OsaProcess> cls6 = cls4;
                            cls5 = cls5;
                            arrayList3 = arrayList4;
                            try {
                                Result.Companion companion = Result.Companion;
                                cls3 = cls6;
                                try {
                                    try {
                                        if (Intrinsics.areEqual(cls3, Odi.class)) {
                                            Object objFromJson5 = SharedInstanceKt.getGson().fromJson(SharedInstanceKt.getGson().toJson(eventItem), (Class<Object>) Odi.class);
                                            ((Odi) objFromJson5).setUploaded(true);
                                            Unit unit = Unit.INSTANCE;
                                            objFromJson3 = (OsaProcess) objFromJson5;
                                            String ymdhms = ExtensionKt.toYMDHMS(eventItem.getUtcTimestamp(), TimeZone.getTimeZone(eventItem.getTimeZoneId()));
                                            try {
                                                Field declaredField = cls3.getDeclaredField(str4);
                                                declaredField.setAccessible(true);
                                                declaredField.set(objFromJson3, ymdhms);
                                                objM3845constructorimpl15 = Result.m3845constructorimpl(unit);
                                            } catch (Throwable th) {
                                                Result.Companion companion2 = Result.Companion;
                                                objM3845constructorimpl15 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                                            }
                                            Throwable thM3848exceptionOrNullimpl4 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl15);
                                            if (thM3848exceptionOrNullimpl4 != null) {
                                                HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl4));
                                                Unit unit2 = Unit.INSTANCE;
                                            }
                                            Unit unit3 = Unit.INSTANCE;
                                            arrayList7 = arrayList7;
                                        } else {
                                            JSONObject jSONObject = new JSONObject(eventItem.getExtra());
                                            Object obj4 = jSONObject.get("timestamp");
                                            if (obj4 instanceof Double) {
                                                jSONObject.remove("timestamp");
                                                jSONObject.put("timestamp", (long) ((Number) obj4).doubleValue());
                                            }
                                            objFromJson3 = SharedInstanceKt.getGson().fromJson(jSONObject.toString(), (Class<Object>) cls3);
                                            String userId = eventItem.getUserId();
                                            try {
                                                Field declaredField2 = cls3.getDeclaredField("userId");
                                                declaredField2.setAccessible(true);
                                                Unit unit4 = Unit.INSTANCE;
                                                declaredField2.set(objFromJson3, userId);
                                                objM3845constructorimpl12 = Result.m3845constructorimpl(unit4);
                                            } catch (Throwable th2) {
                                                Result.Companion companion3 = Result.Companion;
                                                objM3845constructorimpl12 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
                                            }
                                            Throwable thM3848exceptionOrNullimpl5 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl12);
                                            if (thM3848exceptionOrNullimpl5 != null) {
                                                HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl5));
                                                Unit unit5 = Unit.INSTANCE;
                                            }
                                            Boolean bool = Boolean.TRUE;
                                            try {
                                                Result.Companion companion4 = Result.Companion;
                                                Field declaredField3 = cls3.getDeclaredField("uploaded");
                                                declaredField3.setAccessible(true);
                                                Unit unit6 = Unit.INSTANCE;
                                                declaredField3.set(objFromJson3, bool);
                                                objM3845constructorimpl13 = Result.m3845constructorimpl(unit6);
                                            } catch (Throwable th3) {
                                                Result.Companion companion5 = Result.Companion;
                                                objM3845constructorimpl13 = Result.m3845constructorimpl(ResultKt.createFailure(th3));
                                            }
                                            Throwable thM3848exceptionOrNullimpl6 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl13);
                                            if (thM3848exceptionOrNullimpl6 != null) {
                                                HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl6));
                                                Unit unit7 = Unit.INSTANCE;
                                            }
                                            Field declaredField4 = cls3.getDeclaredField("utcTimestamp");
                                            declaredField4.setAccessible(true);
                                            Unit unit8 = Unit.INSTANCE;
                                            long j = declaredField4.getLong(objFromJson3);
                                            Field declaredField5 = cls3.getDeclaredField("timeZoneId");
                                            declaredField5.setAccessible(true);
                                            Object obj5 = declaredField5.get(objFromJson3);
                                            if (obj5 == null) {
                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                            }
                                            String ymdhms2 = ExtensionKt.toYMDHMS(j, TimeZone.getTimeZone((String) obj5));
                                            try {
                                                Result.Companion companion6 = Result.Companion;
                                                Field declaredField6 = cls3.getDeclaredField(str4);
                                                declaredField6.setAccessible(true);
                                                declaredField6.set(objFromJson3, ymdhms2);
                                                objM3845constructorimpl14 = Result.m3845constructorimpl(unit8);
                                            } catch (Throwable th4) {
                                                Result.Companion companion7 = Result.Companion;
                                                objM3845constructorimpl14 = Result.m3845constructorimpl(ResultKt.createFailure(th4));
                                            }
                                            Throwable thM3848exceptionOrNullimpl7 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl14);
                                            if (thM3848exceptionOrNullimpl7 != null) {
                                                HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl7));
                                                Unit unit9 = Unit.INSTANCE;
                                            }
                                            Unit unit10 = Unit.INSTANCE;
                                            th = th;
                                            Result.Companion companion8 = Result.Companion;
                                            objM3845constructorimpl11 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                                            thM3848exceptionOrNullimpl3 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl11);
                                            if (thM3848exceptionOrNullimpl3 != null) {
                                                HMLog.info$default(null, new DataCacheDelegate$switch$2$1(thM3848exceptionOrNullimpl3), 1, null);
                                                Unit unit11 = Unit.INSTANCE;
                                            }
                                            if (Result.m3850isFailureimpl(objM3845constructorimpl11)) {
                                                objM3845constructorimpl11 = null;
                                            }
                                            osaProcess = (OsaProcess) objM3845constructorimpl11;
                                            if (osaProcess == null) {
                                                cls4 = cls3;
                                                arrayList7 = arrayList7;
                                                it2 = it2;
                                                arrayList5 = arrayList8;
                                                str2 = str5;
                                                arrayList4 = arrayList3;
                                                cls5 = cls5;
                                            } else {
                                                arrayList6.add(osaProcess);
                                                Unit unit12 = Unit.INSTANCE;
                                                arrayList = arrayList3;
                                                cls2 = cls5;
                                                cls = cls3;
                                                arrayList2 = arrayList8;
                                            }
                                        }
                                        objM3845constructorimpl11 = Result.m3845constructorimpl(objFromJson3);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        Result.Companion companion9 = Result.Companion;
                                        objM3845constructorimpl11 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    arrayList7 = arrayList7;
                                    Result.Companion companion10 = Result.Companion;
                                    objM3845constructorimpl11 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                arrayList7 = arrayList7;
                                cls3 = cls6;
                            }
                            thM3848exceptionOrNullimpl3 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl11);
                            if (thM3848exceptionOrNullimpl3 != null) {
                                HMLog.info$default(null, new DataCacheDelegate$switch$2$1(thM3848exceptionOrNullimpl3), 1, null);
                                Unit unit13 = Unit.INSTANCE;
                            }
                            if (Result.m3850isFailureimpl(objM3845constructorimpl11)) {
                                objM3845constructorimpl11 = null;
                            }
                            osaProcess = (OsaProcess) objM3845constructorimpl11;
                            if (osaProcess == null) {
                                cls4 = cls3;
                                arrayList7 = arrayList7;
                                it2 = it2;
                                arrayList5 = arrayList8;
                                str2 = str5;
                                arrayList4 = arrayList3;
                                cls5 = cls5;
                            } else {
                                arrayList6.add(osaProcess);
                                Unit unit14 = Unit.INSTANCE;
                                arrayList = arrayList3;
                                cls2 = cls5;
                                cls = cls3;
                                arrayList2 = arrayList8;
                            }
                        } else if (i != 4) {
                            HMLog.info(h, new d(eventItem));
                            Unit unit15 = Unit.INSTANCE;
                            cls = cls4;
                            cls2 = cls5;
                            arrayList = arrayList4;
                            arrayList7 = arrayList7;
                        } else {
                            try {
                                Result.Companion companion11 = Result.Companion;
                                if (Intrinsics.areEqual(OsaEvent.class, Odi.class)) {
                                    Object objFromJson6 = SharedInstanceKt.getGson().fromJson(SharedInstanceKt.getGson().toJson(eventItem), (Class<Object>) Odi.class);
                                    ((Odi) objFromJson6).setUploaded(true);
                                    Unit unit16 = Unit.INSTANCE;
                                    objFromJson4 = (OsaEvent) objFromJson6;
                                    ArrayList arrayList9 = arrayList4;
                                    try {
                                        String ymdhms3 = ExtensionKt.toYMDHMS(eventItem.getUtcTimestamp(), TimeZone.getTimeZone(eventItem.getTimeZoneId()));
                                        try {
                                            Field declaredField7 = OsaEvent.class.getDeclaredField(str3);
                                            declaredField7.setAccessible(true);
                                            declaredField7.set(objFromJson4, ymdhms3);
                                            objM3845constructorimpl20 = Result.m3845constructorimpl(unit16);
                                        } catch (Throwable th8) {
                                            Result.Companion companion12 = Result.Companion;
                                            objM3845constructorimpl20 = Result.m3845constructorimpl(ResultKt.createFailure(th8));
                                        }
                                        Throwable thM3848exceptionOrNullimpl8 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl20);
                                        if (thM3848exceptionOrNullimpl8 != null) {
                                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl8));
                                            Unit unit17 = Unit.INSTANCE;
                                        }
                                        Unit unit18 = Unit.INSTANCE;
                                        cls5 = cls5;
                                        arrayList3 = arrayList9;
                                        cls4 = cls4;
                                        try {
                                            objM3845constructorimpl16 = Result.m3845constructorimpl(objFromJson4);
                                        } catch (Throwable th9) {
                                            th = th9;
                                            Result.Companion companion13 = Result.Companion;
                                            objM3845constructorimpl16 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        cls5 = cls5;
                                        arrayList3 = arrayList9;
                                        cls4 = cls4;
                                        Result.Companion companion14 = Result.Companion;
                                        objM3845constructorimpl16 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                                    }
                                } else {
                                    ArrayList arrayList10 = arrayList4;
                                    JSONObject jSONObject2 = new JSONObject(eventItem.getExtra());
                                    Object obj6 = jSONObject2.get("timestamp");
                                    arrayList3 = arrayList10;
                                    try {
                                        if (obj6 instanceof Double) {
                                            jSONObject2.remove("timestamp");
                                            jSONObject2.put("timestamp", (long) ((Number) obj6).doubleValue());
                                        }
                                        objFromJson4 = SharedInstanceKt.getGson().fromJson(jSONObject2.toString(), (Class<Object>) OsaEvent.class);
                                        String userId2 = eventItem.getUserId();
                                        try {
                                            Field declaredField8 = OsaEvent.class.getDeclaredField("userId");
                                            declaredField8.setAccessible(true);
                                            Unit unit19 = Unit.INSTANCE;
                                            declaredField8.set(objFromJson4, userId2);
                                            objM3845constructorimpl17 = Result.m3845constructorimpl(unit19);
                                        } catch (Throwable th11) {
                                            Result.Companion companion15 = Result.Companion;
                                            objM3845constructorimpl17 = Result.m3845constructorimpl(ResultKt.createFailure(th11));
                                        }
                                        Throwable thM3848exceptionOrNullimpl9 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl17);
                                        if (thM3848exceptionOrNullimpl9 != null) {
                                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl9));
                                            Unit unit20 = Unit.INSTANCE;
                                        }
                                        Boolean bool2 = Boolean.TRUE;
                                        try {
                                            Result.Companion companion16 = Result.Companion;
                                            Field declaredField9 = OsaEvent.class.getDeclaredField("uploaded");
                                            declaredField9.setAccessible(true);
                                            Unit unit21 = Unit.INSTANCE;
                                            declaredField9.set(objFromJson4, bool2);
                                            objM3845constructorimpl18 = Result.m3845constructorimpl(unit21);
                                        } catch (Throwable th12) {
                                            Result.Companion companion17 = Result.Companion;
                                            objM3845constructorimpl18 = Result.m3845constructorimpl(ResultKt.createFailure(th12));
                                        }
                                        Throwable thM3848exceptionOrNullimpl10 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl18);
                                        if (thM3848exceptionOrNullimpl10 != null) {
                                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl10));
                                            Unit unit22 = Unit.INSTANCE;
                                        }
                                        Field declaredField10 = OsaEvent.class.getDeclaredField("utcTimestamp");
                                        declaredField10.setAccessible(true);
                                        Unit unit23 = Unit.INSTANCE;
                                        long j2 = declaredField10.getLong(objFromJson4);
                                        Field declaredField11 = OsaEvent.class.getDeclaredField("timeZoneId");
                                        declaredField11.setAccessible(true);
                                        Object obj7 = declaredField11.get(objFromJson4);
                                        if (obj7 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                        }
                                        String ymdhms4 = ExtensionKt.toYMDHMS(j2, TimeZone.getTimeZone((String) obj7));
                                        try {
                                            Result.Companion companion18 = Result.Companion;
                                            Field declaredField12 = OsaEvent.class.getDeclaredField(str3);
                                            declaredField12.setAccessible(true);
                                            declaredField12.set(objFromJson4, ymdhms4);
                                            objM3845constructorimpl19 = Result.m3845constructorimpl(unit23);
                                        } catch (Throwable th13) {
                                            Result.Companion companion19 = Result.Companion;
                                            objM3845constructorimpl19 = Result.m3845constructorimpl(ResultKt.createFailure(th13));
                                        }
                                        Throwable thM3848exceptionOrNullimpl11 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl19);
                                        if (thM3848exceptionOrNullimpl11 != null) {
                                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl11));
                                            Unit unit24 = Unit.INSTANCE;
                                        }
                                        Unit unit25 = Unit.INSTANCE;
                                        objM3845constructorimpl16 = Result.m3845constructorimpl(objFromJson4);
                                    } catch (Throwable th14) {
                                        th = th14;
                                        cls4 = cls4;
                                        cls5 = cls5;
                                        Result.Companion companion110 = Result.Companion;
                                        objM3845constructorimpl16 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                                    }
                                    th = th9;
                                    Result.Companion companion111 = Result.Companion;
                                    objM3845constructorimpl16 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                                }
                            } catch (Throwable th15) {
                                th = th15;
                                cls4 = cls4;
                                cls5 = cls5;
                                arrayList3 = arrayList4;
                            }
                            Throwable thM3848exceptionOrNullimpl12 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl16);
                            if (thM3848exceptionOrNullimpl12 != null) {
                                HMLog.info$default(null, new DataCacheDelegate$switch$2$1(thM3848exceptionOrNullimpl12), 1, null);
                                Unit unit26 = Unit.INSTANCE;
                            }
                            OsaEvent osaEvent = (OsaEvent) (Result.m3850isFailureimpl(objM3845constructorimpl16) ? null : objM3845constructorimpl16);
                            if (osaEvent == null) {
                                cls4 = cls4;
                                it2 = it2;
                                arrayList5 = arrayList8;
                                str2 = str5;
                                arrayList4 = arrayList3;
                                cls5 = cls5;
                            } else {
                                arrayList7.add(osaEvent);
                                Unit unit27 = Unit.INSTANCE;
                                arrayList7 = arrayList7;
                                arrayList = arrayList3;
                                cls2 = cls5;
                                cls = cls4;
                                arrayList2 = arrayList8;
                            }
                        }
                        str = str;
                        str4 = str4;
                        arrayList7 = arrayList7;
                        arrayList4 = arrayList;
                        cls5 = cls2;
                        cls4 = cls;
                    } else {
                        Class<OsaProcess> cls7 = cls4;
                        Class<ClickMeasuredSpo2> cls8 = cls5;
                        ArrayList arrayList11 = arrayList4;
                        arrayList7 = arrayList7;
                        try {
                            Result.Companion companion20 = Result.Companion;
                            cls2 = cls8;
                            try {
                                try {
                                    if (Intrinsics.areEqual(cls2, Odi.class)) {
                                        Object objFromJson7 = SharedInstanceKt.getGson().fromJson(SharedInstanceKt.getGson().toJson(eventItem), (Class<Object>) Odi.class);
                                        ((Odi) objFromJson7).setUploaded(true);
                                        Unit unit28 = Unit.INSTANCE;
                                        if (objFromJson7 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2");
                                        }
                                        objFromJson2 = (ClickMeasuredSpo2) objFromJson7;
                                        String ymdhms5 = ExtensionKt.toYMDHMS(eventItem.getUtcTimestamp(), TimeZone.getTimeZone(eventItem.getTimeZoneId()));
                                        try {
                                            Field declaredField13 = cls2.getDeclaredField(str);
                                            declaredField13.setAccessible(true);
                                            declaredField13.set(objFromJson2, ymdhms5);
                                            objM3845constructorimpl10 = Result.m3845constructorimpl(unit28);
                                        } catch (Throwable th16) {
                                            Result.Companion companion21 = Result.Companion;
                                            objM3845constructorimpl10 = Result.m3845constructorimpl(ResultKt.createFailure(th16));
                                        }
                                        Throwable thM3848exceptionOrNullimpl13 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl10);
                                        if (thM3848exceptionOrNullimpl13 != null) {
                                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl13));
                                            Unit unit29 = Unit.INSTANCE;
                                        }
                                        Unit unit30 = Unit.INSTANCE;
                                        cls = cls7;
                                        th = th;
                                        cls = cls7;
                                        Result.Companion companion22 = Result.Companion;
                                        objM3845constructorimpl6 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                                        thM3848exceptionOrNullimpl2 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl6);
                                        if (thM3848exceptionOrNullimpl2 != null) {
                                            HMLog.info$default(null, new DataCacheDelegate$switch$2$1(thM3848exceptionOrNullimpl2), 1, null);
                                            Unit unit31 = Unit.INSTANCE;
                                        }
                                        if (Result.m3850isFailureimpl(objM3845constructorimpl6)) {
                                            obj3 = null;
                                        } else {
                                            obj3 = objM3845constructorimpl6;
                                        }
                                        clickMeasuredSpo2 = (ClickMeasuredSpo2) obj3;
                                        if (clickMeasuredSpo2 == null) {
                                            this = this;
                                            cls5 = cls2;
                                            arrayList7 = arrayList7;
                                            it2 = it2;
                                            arrayList5 = arrayList8;
                                            str2 = str5;
                                            arrayList4 = arrayList11;
                                        } else {
                                            spo2 = clickMeasuredSpo2.getSpo2();
                                            if (80 <= spo2 || spo2 > 100) {
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                            arrayList = arrayList11;
                                            if (z) {
                                                arrayList.add(clickMeasuredSpo2);
                                            }
                                            Unit unit32 = Unit.INSTANCE;
                                        }
                                        cls4 = cls;
                                    } else {
                                        JSONObject jSONObject3 = new JSONObject(eventItem.getExtra());
                                        Object obj8 = jSONObject3.get("timestamp");
                                        if (obj8 instanceof Double) {
                                            jSONObject3.remove("timestamp");
                                            jSONObject3.put("timestamp", (long) ((Number) obj8).doubleValue());
                                        }
                                        objFromJson2 = SharedInstanceKt.getGson().fromJson(jSONObject3.toString(), (Class<Object>) cls2);
                                        String userId3 = eventItem.getUserId();
                                        try {
                                            Field declaredField14 = cls2.getDeclaredField("userId");
                                            declaredField14.setAccessible(true);
                                            Unit unit33 = Unit.INSTANCE;
                                            declaredField14.set(objFromJson2, userId3);
                                            objM3845constructorimpl7 = Result.m3845constructorimpl(unit33);
                                        } catch (Throwable th17) {
                                            Result.Companion companion23 = Result.Companion;
                                            objM3845constructorimpl7 = Result.m3845constructorimpl(ResultKt.createFailure(th17));
                                        }
                                        Throwable thM3848exceptionOrNullimpl14 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl7);
                                        if (thM3848exceptionOrNullimpl14 != null) {
                                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl14));
                                            Unit unit34 = Unit.INSTANCE;
                                        }
                                        Boolean bool3 = Boolean.TRUE;
                                        try {
                                            Result.Companion companion24 = Result.Companion;
                                            Field declaredField15 = cls2.getDeclaredField("uploaded");
                                            declaredField15.setAccessible(true);
                                            Unit unit35 = Unit.INSTANCE;
                                            declaredField15.set(objFromJson2, bool3);
                                            objM3845constructorimpl8 = Result.m3845constructorimpl(unit35);
                                        } catch (Throwable th18) {
                                            Result.Companion companion25 = Result.Companion;
                                            objM3845constructorimpl8 = Result.m3845constructorimpl(ResultKt.createFailure(th18));
                                        }
                                        Throwable thM3848exceptionOrNullimpl15 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl8);
                                        if (thM3848exceptionOrNullimpl15 != null) {
                                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl15));
                                            Unit unit36 = Unit.INSTANCE;
                                        }
                                        Field declaredField16 = cls2.getDeclaredField("utcTimestamp");
                                        declaredField16.setAccessible(true);
                                        Unit unit37 = Unit.INSTANCE;
                                        long j3 = declaredField16.getLong(objFromJson2);
                                        Field declaredField17 = cls2.getDeclaredField("timeZoneId");
                                        cls = cls7;
                                        declaredField17.setAccessible(true);
                                        Object obj9 = declaredField17.get(objFromJson2);
                                        if (obj9 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                        }
                                        String ymdhms6 = ExtensionKt.toYMDHMS(j3, TimeZone.getTimeZone((String) obj9));
                                        try {
                                            Result.Companion companion26 = Result.Companion;
                                            Field declaredField18 = cls2.getDeclaredField(str);
                                            declaredField18.setAccessible(true);
                                            declaredField18.set(objFromJson2, ymdhms6);
                                            objM3845constructorimpl9 = Result.m3845constructorimpl(unit37);
                                        } catch (Throwable th19) {
                                            Result.Companion companion27 = Result.Companion;
                                            objM3845constructorimpl9 = Result.m3845constructorimpl(ResultKt.createFailure(th19));
                                        }
                                        Throwable thM3848exceptionOrNullimpl16 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl9);
                                        if (thM3848exceptionOrNullimpl16 != null) {
                                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl16));
                                            Unit unit38 = Unit.INSTANCE;
                                        }
                                        Unit unit39 = Unit.INSTANCE;
                                        th = th;
                                        Result.Companion companion28 = Result.Companion;
                                        objM3845constructorimpl6 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                                        thM3848exceptionOrNullimpl2 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl6);
                                        if (thM3848exceptionOrNullimpl2 != null) {
                                            HMLog.info$default(null, new DataCacheDelegate$switch$2$1(thM3848exceptionOrNullimpl2), 1, null);
                                            Unit unit310 = Unit.INSTANCE;
                                        }
                                        if (Result.m3850isFailureimpl(objM3845constructorimpl6)) {
                                            obj3 = null;
                                        } else {
                                            obj3 = objM3845constructorimpl6;
                                        }
                                        clickMeasuredSpo2 = (ClickMeasuredSpo2) obj3;
                                        if (clickMeasuredSpo2 == null) {
                                            this = this;
                                            cls5 = cls2;
                                            arrayList7 = arrayList7;
                                            it2 = it2;
                                            arrayList5 = arrayList8;
                                            str2 = str5;
                                            arrayList4 = arrayList11;
                                        } else {
                                            spo2 = clickMeasuredSpo2.getSpo2();
                                            if (80 <= spo2) {
                                                z = false;
                                            } else {
                                                z = false;
                                            }
                                            arrayList = arrayList11;
                                            if (z) {
                                                arrayList.add(clickMeasuredSpo2);
                                            }
                                            Unit unit311 = Unit.INSTANCE;
                                        }
                                        cls4 = cls;
                                    }
                                    objM3845constructorimpl6 = Result.m3845constructorimpl(objFromJson2);
                                } catch (Throwable th20) {
                                    th = th20;
                                    Result.Companion companion29 = Result.Companion;
                                    objM3845constructorimpl6 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                                }
                            } catch (Throwable th21) {
                                th = th21;
                                cls = cls7;
                                Result.Companion companion210 = Result.Companion;
                                objM3845constructorimpl6 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                            }
                        } catch (Throwable th22) {
                            th = th22;
                            cls2 = cls8;
                        }
                        thM3848exceptionOrNullimpl2 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl6);
                        if (thM3848exceptionOrNullimpl2 != null) {
                            HMLog.info$default(null, new DataCacheDelegate$switch$2$1(thM3848exceptionOrNullimpl2), 1, null);
                            Unit unit312 = Unit.INSTANCE;
                        }
                        if (Result.m3850isFailureimpl(objM3845constructorimpl6)) {
                            obj3 = null;
                        } else {
                            obj3 = objM3845constructorimpl6;
                        }
                        clickMeasuredSpo2 = (ClickMeasuredSpo2) obj3;
                        if (clickMeasuredSpo2 == null) {
                            this = this;
                            cls5 = cls2;
                            arrayList7 = arrayList7;
                            it2 = it2;
                            arrayList5 = arrayList8;
                            str2 = str5;
                            arrayList4 = arrayList11;
                        } else {
                            spo2 = clickMeasuredSpo2.getSpo2();
                            if (80 <= spo2) {
                                z = false;
                            } else {
                                z = false;
                            }
                            arrayList = arrayList11;
                            if (z) {
                                arrayList.add(clickMeasuredSpo2);
                            }
                            Unit unit313 = Unit.INSTANCE;
                        }
                        cls4 = cls;
                    }
                    arrayList2 = arrayList8;
                    str5 = str5;
                    str = str;
                    str3 = str3;
                } else {
                    cls = cls4;
                    cls2 = cls5;
                    arrayList = arrayList4;
                    arrayList7 = arrayList7;
                    try {
                        Result.Companion companion30 = Result.Companion;
                        if (Intrinsics.areEqual(Odi.class, Odi.class)) {
                            try {
                                Object objFromJson8 = SharedInstanceKt.getGson().fromJson(SharedInstanceKt.getGson().toJson(eventItem), (Class<Object>) Odi.class);
                                ((Odi) objFromJson8).setUploaded(true);
                                Unit unit40 = Unit.INSTANCE;
                                if (objFromJson8 == null) {
                                    str5 = str5;
                                    throw new NullPointerException("null cannot be cast to non-null type com.huami.bloodoxygen.core.local.database.entity.Odi");
                                }
                                objFromJson = (Odi) objFromJson8;
                                String ymdhms7 = ExtensionKt.toYMDHMS(eventItem.getUtcTimestamp(), TimeZone.getTimeZone(eventItem.getTimeZoneId()));
                                str5 = str5;
                                try {
                                    Field declaredField19 = Odi.class.getDeclaredField(str5);
                                    declaredField19.setAccessible(true);
                                    declaredField19.set(objFromJson, ymdhms7);
                                    objM3845constructorimpl2 = Result.m3845constructorimpl(unit40);
                                } catch (Throwable th23) {
                                    Result.Companion companion31 = Result.Companion;
                                    objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th23));
                                }
                                try {
                                    Throwable thM3848exceptionOrNullimpl17 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
                                    if (thM3848exceptionOrNullimpl17 != null) {
                                        HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl17));
                                        Unit unit41 = Unit.INSTANCE;
                                    }
                                    Unit unit42 = Unit.INSTANCE;
                                    str = str;
                                    str3 = str3;
                                    str4 = str4;
                                    try {
                                        objM3845constructorimpl = Result.m3845constructorimpl(objFromJson);
                                    } catch (Throwable th24) {
                                        th = th24;
                                        Result.Companion companion32 = Result.Companion;
                                        objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                                    }
                                } catch (Throwable th25) {
                                    th = th25;
                                    str = str;
                                    str3 = str3;
                                    str4 = str4;
                                    Result.Companion companion33 = Result.Companion;
                                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                                }
                                thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                                if (thM3848exceptionOrNullimpl != null) {
                                    DataCacheDelegate$switch$2$1 dataCacheDelegate$switch$2$1 = new DataCacheDelegate$switch$2$1(thM3848exceptionOrNullimpl);
                                    obj = null;
                                    HMLog.info$default(null, dataCacheDelegate$switch$2$1, 1, null);
                                    Unit unit43 = Unit.INSTANCE;
                                } else {
                                    obj = null;
                                }
                                if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                                    obj2 = obj;
                                } else {
                                    obj2 = objM3845constructorimpl;
                                }
                                odi = (Odi) obj2;
                                if (odi == null) {
                                    this = this;
                                } else {
                                    this = this;
                                    localOdi = this.odiDelegate.getLocalOdi(odi.getTimestamp());
                                    if (localOdi != null || localOdi.getUploaded()) {
                                        arrayList2 = arrayList8;
                                        arrayList2.add(odi);
                                        Unit unit44 = Unit.INSTANCE;
                                    }
                                    str = str;
                                    str4 = str4;
                                    arrayList7 = arrayList7;
                                    arrayList4 = arrayList;
                                    cls5 = cls2;
                                    cls4 = cls;
                                }
                                str3 = str3;
                                str2 = str5;
                                arrayList5 = arrayList8;
                                str = str;
                                str4 = str4;
                                arrayList7 = arrayList7;
                                arrayList4 = arrayList;
                                cls5 = cls2;
                                cls4 = cls;
                                th = th25;
                            } catch (Throwable th26) {
                                th = th26;
                                str5 = str5;
                            }
                            str = str;
                            str3 = str3;
                            str4 = str4;
                            Result.Companion companion34 = Result.Companion;
                            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                            thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                            if (thM3848exceptionOrNullimpl != null) {
                                DataCacheDelegate$switch$2$1 dataCacheDelegate$switch$2$2 = new DataCacheDelegate$switch$2$1(thM3848exceptionOrNullimpl);
                                obj = null;
                                HMLog.info$default(null, dataCacheDelegate$switch$2$2, 1, null);
                                Unit unit45 = Unit.INSTANCE;
                            } else {
                                obj = null;
                            }
                            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                                obj2 = obj;
                            } else {
                                obj2 = objM3845constructorimpl;
                            }
                            odi = (Odi) obj2;
                            if (odi == null) {
                                this = this;
                            } else {
                                this = this;
                                localOdi = this.odiDelegate.getLocalOdi(odi.getTimestamp());
                                if (localOdi != null) {
                                }
                                arrayList2 = arrayList8;
                                arrayList2.add(odi);
                                Unit unit46 = Unit.INSTANCE;
                            }
                            str3 = str3;
                            str2 = str5;
                            arrayList5 = arrayList8;
                            str = str;
                            str4 = str4;
                            arrayList7 = arrayList7;
                            arrayList4 = arrayList;
                            cls5 = cls2;
                            cls4 = cls;
                        } else {
                            str5 = str5;
                            JSONObject jSONObject4 = new JSONObject(eventItem.getExtra());
                            Object obj10 = jSONObject4.get("timestamp");
                            str = str;
                            try {
                                if (obj10 instanceof Double) {
                                    jSONObject4.remove("timestamp");
                                    jSONObject4.put("timestamp", (long) ((Number) obj10).doubleValue());
                                }
                                objFromJson = SharedInstanceKt.getGson().fromJson(jSONObject4.toString(), (Class<Object>) Odi.class);
                                String userId4 = eventItem.getUserId();
                                try {
                                    Field declaredField20 = Odi.class.getDeclaredField("userId");
                                    declaredField20.setAccessible(true);
                                    Unit unit47 = Unit.INSTANCE;
                                    declaredField20.set(objFromJson, userId4);
                                    objM3845constructorimpl3 = Result.m3845constructorimpl(unit47);
                                } catch (Throwable th27) {
                                    Result.Companion companion35 = Result.Companion;
                                    objM3845constructorimpl3 = Result.m3845constructorimpl(ResultKt.createFailure(th27));
                                }
                                Throwable thM3848exceptionOrNullimpl18 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl3);
                                if (thM3848exceptionOrNullimpl18 != null) {
                                    HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl18));
                                    Unit unit48 = Unit.INSTANCE;
                                }
                                Boolean bool4 = Boolean.TRUE;
                                try {
                                    Result.Companion companion36 = Result.Companion;
                                    Field declaredField21 = Odi.class.getDeclaredField("uploaded");
                                    declaredField21.setAccessible(true);
                                    Unit unit49 = Unit.INSTANCE;
                                    declaredField21.set(objFromJson, bool4);
                                    objM3845constructorimpl4 = Result.m3845constructorimpl(unit49);
                                } catch (Throwable th28) {
                                    Result.Companion companion37 = Result.Companion;
                                    objM3845constructorimpl4 = Result.m3845constructorimpl(ResultKt.createFailure(th28));
                                }
                                Throwable thM3848exceptionOrNullimpl19 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl4);
                                if (thM3848exceptionOrNullimpl19 != null) {
                                    HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl19));
                                    Unit unit50 = Unit.INSTANCE;
                                }
                                Field declaredField22 = Odi.class.getDeclaredField("utcTimestamp");
                                declaredField22.setAccessible(true);
                                Unit unit51 = Unit.INSTANCE;
                                long j4 = declaredField22.getLong(objFromJson);
                                Field declaredField23 = Odi.class.getDeclaredField("timeZoneId");
                                declaredField23.setAccessible(true);
                                Object obj11 = declaredField23.get(objFromJson);
                                if (obj11 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                String ymdhms8 = ExtensionKt.toYMDHMS(j4, TimeZone.getTimeZone((String) obj11));
                                try {
                                    Result.Companion companion38 = Result.Companion;
                                    Field declaredField24 = Odi.class.getDeclaredField(str5);
                                    declaredField24.setAccessible(true);
                                    declaredField24.set(objFromJson, ymdhms8);
                                    objM3845constructorimpl5 = Result.m3845constructorimpl(unit51);
                                } catch (Throwable th29) {
                                    Result.Companion companion39 = Result.Companion;
                                    objM3845constructorimpl5 = Result.m3845constructorimpl(ResultKt.createFailure(th29));
                                }
                                Throwable thM3848exceptionOrNullimpl20 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl5);
                                if (thM3848exceptionOrNullimpl20 != null) {
                                    HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl20));
                                    Unit unit52 = Unit.INSTANCE;
                                }
                                Unit unit53 = Unit.INSTANCE;
                                objM3845constructorimpl = Result.m3845constructorimpl(objFromJson);
                                thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                                if (thM3848exceptionOrNullimpl != null) {
                                    DataCacheDelegate$switch$2$1 dataCacheDelegate$switch$2$3 = new DataCacheDelegate$switch$2$1(thM3848exceptionOrNullimpl);
                                    obj = null;
                                    HMLog.info$default(null, dataCacheDelegate$switch$2$3, 1, null);
                                    Unit unit410 = Unit.INSTANCE;
                                } else {
                                    obj = null;
                                }
                                if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                                    obj2 = obj;
                                } else {
                                    obj2 = objM3845constructorimpl;
                                }
                                odi = (Odi) obj2;
                                if (odi == null) {
                                    this = this;
                                } else {
                                    this = this;
                                    localOdi = this.odiDelegate.getLocalOdi(odi.getTimestamp());
                                    if (localOdi != null) {
                                    }
                                    arrayList2 = arrayList8;
                                    arrayList2.add(odi);
                                    Unit unit411 = Unit.INSTANCE;
                                }
                                str3 = str3;
                                str2 = str5;
                                arrayList5 = arrayList8;
                                str = str;
                                str4 = str4;
                                arrayList7 = arrayList7;
                                arrayList4 = arrayList;
                                cls5 = cls2;
                                cls4 = cls;
                            } catch (Throwable th30) {
                                th = th30;
                                str3 = str3;
                                str4 = str4;
                                Result.Companion companion310 = Result.Companion;
                                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                            }
                            th = th24;
                            Result.Companion companion311 = Result.Companion;
                            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                            thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                            if (thM3848exceptionOrNullimpl != null) {
                                DataCacheDelegate$switch$2$1 dataCacheDelegate$switch$2$4 = new DataCacheDelegate$switch$2$1(thM3848exceptionOrNullimpl);
                                obj = null;
                                HMLog.info$default(null, dataCacheDelegate$switch$2$4, 1, null);
                                Unit unit412 = Unit.INSTANCE;
                            } else {
                                obj = null;
                            }
                            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                                obj2 = obj;
                            } else {
                                obj2 = objM3845constructorimpl;
                            }
                            odi = (Odi) obj2;
                            if (odi == null) {
                                this = this;
                            } else {
                                this = this;
                                localOdi = this.odiDelegate.getLocalOdi(odi.getTimestamp());
                                if (localOdi != null) {
                                }
                                arrayList2 = arrayList8;
                                arrayList2.add(odi);
                                Unit unit413 = Unit.INSTANCE;
                            }
                            str3 = str3;
                            str2 = str5;
                            arrayList5 = arrayList8;
                            str = str;
                            str4 = str4;
                            arrayList7 = arrayList7;
                            arrayList4 = arrayList;
                            cls5 = cls2;
                            cls4 = cls;
                        }
                    } catch (Throwable th31) {
                        th = th31;
                        str4 = str4;
                        str5 = str5;
                        str = str;
                        str3 = str3;
                    }
                }
                str3 = str3;
                arrayList5 = arrayList2;
                str2 = str5;
                str = str;
                str4 = str4;
                arrayList7 = arrayList7;
                arrayList4 = arrayList;
                cls5 = cls2;
                cls4 = cls;
            } else {
                HMLog.info(h, new c(eventItem));
                it2 = it2;
            }
        }
        return this.odiDelegate.addLocalOdis(arrayList5) && this.clickSpo2Delegate.addLocalClickSpo2s(arrayList4) && this.osaProcessDelegate.addLocalOsaProcesses(arrayList6) && this.osaEventDelegate.addLocalOsaEvents(arrayList7);
    }

    private final /* synthetic */ <T> T i(EventItem eventItem) {
        T t;
        Object objFromJson;
        Object objM3845constructorimpl;
        Object objM3845constructorimpl2;
        Object objM3845constructorimpl3;
        Object objM3845constructorimpl4;
        try {
            Result.Companion companion = Result.Companion;
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            if (Intrinsics.areEqual(Object.class, Odi.class)) {
                objFromJson = SharedInstanceKt.getGson().fromJson(SharedInstanceKt.getGson().toJson(eventItem), (Class<Object>) Odi.class);
                ((Odi) objFromJson).setUploaded(true);
                Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
                String ymdhms = ExtensionKt.toYMDHMS(eventItem.getUtcTimestamp(), TimeZone.getTimeZone(eventItem.getTimeZoneId()));
                try {
                    Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                    Field declaredField = Object.class.getDeclaredField("date");
                    declaredField.setAccessible(true);
                    declaredField.set(objFromJson, ymdhms);
                    objM3845constructorimpl4 = Result.m3845constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl4 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl4);
                if (thM3848exceptionOrNullimpl != null) {
                    HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl));
                }
            } else {
                JSONObject jSONObject = new JSONObject(eventItem.getExtra());
                Object obj = jSONObject.get("timestamp");
                if (obj instanceof Double) {
                    jSONObject.remove("timestamp");
                    jSONObject.put("timestamp", (long) ((Number) obj).doubleValue());
                }
                Gson gson = SharedInstanceKt.getGson();
                String string = jSONObject.toString();
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                objFromJson = gson.fromJson(string, (Class<Object>) Object.class);
                String userId = eventItem.getUserId();
                try {
                    Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                    Field declaredField2 = Object.class.getDeclaredField("userId");
                    declaredField2.setAccessible(true);
                    declaredField2.set(objFromJson, userId);
                    objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable thM3848exceptionOrNullimpl2 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl2 != null) {
                    HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl2));
                }
                Boolean bool = Boolean.TRUE;
                try {
                    Result.Companion companion4 = Result.Companion;
                    Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                    Field declaredField3 = Object.class.getDeclaredField("uploaded");
                    declaredField3.setAccessible(true);
                    declaredField3.set(objFromJson, bool);
                    objM3845constructorimpl2 = Result.m3845constructorimpl(Unit.INSTANCE);
                } catch (Throwable th3) {
                    Result.Companion companion5 = Result.Companion;
                    objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th3));
                }
                Throwable thM3848exceptionOrNullimpl3 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
                if (thM3848exceptionOrNullimpl3 != null) {
                    HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl3));
                }
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                Field declaredField4 = Object.class.getDeclaredField("utcTimestamp");
                declaredField4.setAccessible(true);
                long j = declaredField4.getLong(objFromJson);
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                Field declaredField5 = Object.class.getDeclaredField("timeZoneId");
                declaredField5.setAccessible(true);
                Object obj2 = declaredField5.get(objFromJson);
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                String ymdhms2 = ExtensionKt.toYMDHMS(j, TimeZone.getTimeZone((String) obj2));
                try {
                    Result.Companion companion6 = Result.Companion;
                    Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                    Field declaredField6 = Object.class.getDeclaredField("date");
                    declaredField6.setAccessible(true);
                    declaredField6.set(objFromJson, ymdhms2);
                    objM3845constructorimpl3 = Result.m3845constructorimpl(Unit.INSTANCE);
                } catch (Throwable th4) {
                    Result.Companion companion7 = Result.Companion;
                    objM3845constructorimpl3 = Result.m3845constructorimpl(ResultKt.createFailure(th4));
                }
                Throwable thM3848exceptionOrNullimpl4 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl3);
                if (thM3848exceptionOrNullimpl4 != null) {
                    HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl4));
                }
            }
            t = (T) Result.m3845constructorimpl(objFromJson);
        } catch (Throwable th5) {
            Result.Companion companion8 = Result.Companion;
            t = (T) Result.m3845constructorimpl(ResultKt.createFailure(th5));
        }
        Throwable thM3848exceptionOrNullimpl5 = Result.m3848exceptionOrNullimpl(t);
        if (thM3848exceptionOrNullimpl5 != null) {
            HMLog.info$default(null, new DataCacheDelegate$switch$2$1(thM3848exceptionOrNullimpl5), 1, null);
        }
        if (Result.m3850isFailureimpl(t)) {
            return null;
        }
        return t;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    public boolean deleteOsaEvents(@Nullable List<OsaEvent> osaEvents) {
        if (osaEvents == null) {
            osaEvents = this.osaEventDelegate.getLocalOsaEventShouldDelete();
        }
        HttpDelegate httpDelegate = this.httpDelegate;
        BloodOxygen.SubType subType = BloodOxygen.SubType.OSA_EVENT;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(osaEvents, 10));
        Iterator<T> it2 = osaEvents.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((OsaEvent) it2.next()).getUtcTimestamp()));
        }
        boolean zDeleteEvents = httpDelegate.deleteEvents(subType, arrayList);
        if (zDeleteEvents) {
            this.osaEventDelegate.removeLocalOsaEvent(osaEvents);
        }
        return zDeleteEvents;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    public boolean deleteOsaProcesses(@Nullable List<OsaProcess> osaProcesses) {
        if (osaProcesses == null) {
            osaProcesses = this.osaProcessDelegate.getLocalOsaProcessShouldDelete();
        }
        HttpDelegate httpDelegate = this.httpDelegate;
        BloodOxygen.SubType subType = BloodOxygen.SubType.OSA_PROCESS;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(osaProcesses, 10));
        Iterator<T> it2 = osaProcesses.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((OsaProcess) it2.next()).getUtcTimestamp()));
        }
        boolean zDeleteEvents = httpDelegate.deleteEvents(subType, arrayList);
        if (zDeleteEvents) {
            this.osaProcessDelegate.removeLocalOsaProcess(osaProcesses);
        }
        return zDeleteEvents;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    public void fetchAllTypeData(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect) {
        b(BloodOxygen.SubType.ALL, from, to, limit, reverse, syncNext, direct, saveSyncLogEvenWhenDirect);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    @NotNull
    public List<ClickMeasuredSpo2> fetchClickSpo2(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect) {
        Object objM3845constructorimpl;
        Object objFromJson;
        Object objM3845constructorimpl2;
        Object objM3845constructorimpl3;
        Object objM3845constructorimpl4;
        Object objM3845constructorimpl5;
        Collection collectionB = b(BloodOxygen.SubType.CLICK, from, to, limit, reverse, syncNext, direct, saveSyncLogEvenWhenDirect);
        if (direct) {
            if (Intrinsics.areEqual(ClickMeasuredSpo2.class, EventItem.class)) {
                break;
            }
            Collection arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collectionB, 10));
            Iterator it2 = collectionB.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    collectionB = arrayList;
                    break;
                }
                EventItem eventItem = (EventItem) it2.next();
                try {
                    Result.Companion companion = Result.Companion;
                    if (Intrinsics.areEqual(ClickMeasuredSpo2.class, Odi.class)) {
                        Object objFromJson2 = SharedInstanceKt.getGson().fromJson(SharedInstanceKt.getGson().toJson(eventItem), (Class<Object>) Odi.class);
                        ((Odi) objFromJson2).setUploaded(true);
                        Unit unit = Unit.INSTANCE;
                        if (objFromJson2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2");
                        }
                        objFromJson = (ClickMeasuredSpo2) objFromJson2;
                        String ymdhms = ExtensionKt.toYMDHMS(eventItem.getUtcTimestamp(), TimeZone.getTimeZone(eventItem.getTimeZoneId()));
                        try {
                            Field declaredField = ClickMeasuredSpo2.class.getDeclaredField("date");
                            declaredField.setAccessible(true);
                            declaredField.set(objFromJson, ymdhms);
                            objM3845constructorimpl5 = Result.m3845constructorimpl(unit);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            objM3845constructorimpl5 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                        }
                        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl5);
                        if (thM3848exceptionOrNullimpl != null) {
                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl));
                            Unit unit2 = Unit.INSTANCE;
                        }
                        Unit unit3 = Unit.INSTANCE;
                    } else {
                        JSONObject jSONObject = new JSONObject(eventItem.getExtra());
                        Object obj = jSONObject.get("timestamp");
                        if (obj instanceof Double) {
                            jSONObject.remove("timestamp");
                            jSONObject.put("timestamp", (long) ((Number) obj).doubleValue());
                        }
                        objFromJson = SharedInstanceKt.getGson().fromJson(jSONObject.toString(), (Class<Object>) ClickMeasuredSpo2.class);
                        String userId = eventItem.getUserId();
                        try {
                            Field declaredField2 = ClickMeasuredSpo2.class.getDeclaredField("userId");
                            declaredField2.setAccessible(true);
                            Unit unit4 = Unit.INSTANCE;
                            declaredField2.set(objFromJson, userId);
                            objM3845constructorimpl2 = Result.m3845constructorimpl(unit4);
                        } catch (Throwable th2) {
                            Result.Companion companion3 = Result.Companion;
                            objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
                        }
                        Throwable thM3848exceptionOrNullimpl2 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
                        if (thM3848exceptionOrNullimpl2 != null) {
                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl2));
                            Unit unit5 = Unit.INSTANCE;
                        }
                        Boolean bool = Boolean.TRUE;
                        try {
                            Result.Companion companion4 = Result.Companion;
                            Field declaredField3 = ClickMeasuredSpo2.class.getDeclaredField("uploaded");
                            declaredField3.setAccessible(true);
                            Unit unit6 = Unit.INSTANCE;
                            declaredField3.set(objFromJson, bool);
                            objM3845constructorimpl3 = Result.m3845constructorimpl(unit6);
                        } catch (Throwable th3) {
                            Result.Companion companion5 = Result.Companion;
                            objM3845constructorimpl3 = Result.m3845constructorimpl(ResultKt.createFailure(th3));
                        }
                        Throwable thM3848exceptionOrNullimpl3 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl3);
                        if (thM3848exceptionOrNullimpl3 != null) {
                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl3));
                            Unit unit7 = Unit.INSTANCE;
                        }
                        Field declaredField4 = ClickMeasuredSpo2.class.getDeclaredField("utcTimestamp");
                        declaredField4.setAccessible(true);
                        Unit unit8 = Unit.INSTANCE;
                        long j = declaredField4.getLong(objFromJson);
                        Field declaredField5 = ClickMeasuredSpo2.class.getDeclaredField("timeZoneId");
                        declaredField5.setAccessible(true);
                        Object obj2 = declaredField5.get(objFromJson);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        String ymdhms2 = ExtensionKt.toYMDHMS(j, TimeZone.getTimeZone((String) obj2));
                        try {
                            Result.Companion companion6 = Result.Companion;
                            Field declaredField6 = ClickMeasuredSpo2.class.getDeclaredField("date");
                            declaredField6.setAccessible(true);
                            declaredField6.set(objFromJson, ymdhms2);
                            objM3845constructorimpl4 = Result.m3845constructorimpl(unit8);
                        } catch (Throwable th4) {
                            Result.Companion companion7 = Result.Companion;
                            objM3845constructorimpl4 = Result.m3845constructorimpl(ResultKt.createFailure(th4));
                        }
                        Throwable thM3848exceptionOrNullimpl4 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl4);
                        if (thM3848exceptionOrNullimpl4 != null) {
                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl4));
                            Unit unit9 = Unit.INSTANCE;
                        }
                        Unit unit10 = Unit.INSTANCE;
                    }
                    objM3845constructorimpl = Result.m3845constructorimpl(objFromJson);
                } catch (Throwable th5) {
                    Result.Companion companion8 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th5));
                }
                Throwable thM3848exceptionOrNullimpl5 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl5 != null) {
                    HMLog.info$default(null, new DataCacheDelegate$switch$2$1(thM3848exceptionOrNullimpl5), 1, null);
                    Unit unit11 = Unit.INSTANCE;
                }
                if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                    objM3845constructorimpl = null;
                }
                if (objM3845constructorimpl == null) {
                    collectionB = CollectionsKt__CollectionsKt.emptyList();
                    break;
                    break;
                }
                arrayList.add(objM3845constructorimpl);
            }
        } else {
            collectionB = this.clickSpo2Delegate.getLocalClickSpo2s(from, to);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionB) {
            int spo2 = ((ClickMeasuredSpo2) obj3).getSpo2();
            boolean z = false;
            if (80 <= spo2 && spo2 <= 100) {
                z = true;
            }
            if (z) {
                arrayList2.add(obj3);
            }
        }
        return arrayList2;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    @NotNull
    public List<Odi> fetchOdi(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect) {
        List listEmptyList;
        Object objM3845constructorimpl;
        Object objFromJson;
        Object objM3845constructorimpl2;
        Object objM3845constructorimpl3;
        Object objM3845constructorimpl4;
        Object objM3845constructorimpl5;
        List<EventItem> listB = b(BloodOxygen.SubType.ODI, from, to, limit, reverse, syncNext, direct, saveSyncLogEvenWhenDirect);
        if (!direct) {
            return this.odiDelegate.getLocalOdis(from, to);
        }
        if (!Intrinsics.areEqual(Odi.class, EventItem.class)) {
            listEmptyList = listB;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listB, 10));
            for (EventItem eventItem : listB) {
                try {
                    Result.Companion companion = Result.Companion;
                    if (Intrinsics.areEqual(Odi.class, Odi.class)) {
                        Object objFromJson2 = SharedInstanceKt.getGson().fromJson(SharedInstanceKt.getGson().toJson(eventItem), (Class<Object>) Odi.class);
                        ((Odi) objFromJson2).setUploaded(true);
                        Unit unit = Unit.INSTANCE;
                        if (objFromJson2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.huami.bloodoxygen.core.local.database.entity.Odi");
                        }
                        objFromJson = (Odi) objFromJson2;
                        String ymdhms = ExtensionKt.toYMDHMS(eventItem.getUtcTimestamp(), TimeZone.getTimeZone(eventItem.getTimeZoneId()));
                        try {
                            Field declaredField = Odi.class.getDeclaredField("date");
                            declaredField.setAccessible(true);
                            declaredField.set(objFromJson, ymdhms);
                            objM3845constructorimpl5 = Result.m3845constructorimpl(unit);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            objM3845constructorimpl5 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                        }
                        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl5);
                        if (thM3848exceptionOrNullimpl != null) {
                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl));
                            Unit unit2 = Unit.INSTANCE;
                        }
                        Unit unit3 = Unit.INSTANCE;
                    } else {
                        JSONObject jSONObject = new JSONObject(eventItem.getExtra());
                        Object obj = jSONObject.get("timestamp");
                        if (obj instanceof Double) {
                            jSONObject.remove("timestamp");
                            jSONObject.put("timestamp", (long) ((Number) obj).doubleValue());
                        }
                        objFromJson = SharedInstanceKt.getGson().fromJson(jSONObject.toString(), (Class<Object>) Odi.class);
                        String userId = eventItem.getUserId();
                        try {
                            Field declaredField2 = Odi.class.getDeclaredField("userId");
                            declaredField2.setAccessible(true);
                            Unit unit4 = Unit.INSTANCE;
                            declaredField2.set(objFromJson, userId);
                            objM3845constructorimpl2 = Result.m3845constructorimpl(unit4);
                        } catch (Throwable th2) {
                            Result.Companion companion3 = Result.Companion;
                            objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
                        }
                        Throwable thM3848exceptionOrNullimpl2 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
                        if (thM3848exceptionOrNullimpl2 != null) {
                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl2));
                            Unit unit5 = Unit.INSTANCE;
                        }
                        Boolean bool = Boolean.TRUE;
                        try {
                            Result.Companion companion4 = Result.Companion;
                            Field declaredField3 = Odi.class.getDeclaredField("uploaded");
                            declaredField3.setAccessible(true);
                            Unit unit6 = Unit.INSTANCE;
                            declaredField3.set(objFromJson, bool);
                            objM3845constructorimpl3 = Result.m3845constructorimpl(unit6);
                        } catch (Throwable th3) {
                            Result.Companion companion5 = Result.Companion;
                            objM3845constructorimpl3 = Result.m3845constructorimpl(ResultKt.createFailure(th3));
                        }
                        Throwable thM3848exceptionOrNullimpl3 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl3);
                        if (thM3848exceptionOrNullimpl3 != null) {
                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl3));
                            Unit unit7 = Unit.INSTANCE;
                        }
                        Field declaredField4 = Odi.class.getDeclaredField("utcTimestamp");
                        declaredField4.setAccessible(true);
                        Unit unit8 = Unit.INSTANCE;
                        long j = declaredField4.getLong(objFromJson);
                        Field declaredField5 = Odi.class.getDeclaredField("timeZoneId");
                        declaredField5.setAccessible(true);
                        Object obj2 = declaredField5.get(objFromJson);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        String ymdhms2 = ExtensionKt.toYMDHMS(j, TimeZone.getTimeZone((String) obj2));
                        try {
                            Result.Companion companion6 = Result.Companion;
                            Field declaredField6 = Odi.class.getDeclaredField("date");
                            declaredField6.setAccessible(true);
                            declaredField6.set(objFromJson, ymdhms2);
                            objM3845constructorimpl4 = Result.m3845constructorimpl(unit8);
                        } catch (Throwable th4) {
                            Result.Companion companion7 = Result.Companion;
                            objM3845constructorimpl4 = Result.m3845constructorimpl(ResultKt.createFailure(th4));
                        }
                        Throwable thM3848exceptionOrNullimpl4 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl4);
                        if (thM3848exceptionOrNullimpl4 != null) {
                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl4));
                            Unit unit9 = Unit.INSTANCE;
                        }
                        Unit unit10 = Unit.INSTANCE;
                    }
                    objM3845constructorimpl = Result.m3845constructorimpl(objFromJson);
                } catch (Throwable th5) {
                    Result.Companion companion8 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th5));
                }
                Throwable thM3848exceptionOrNullimpl5 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl5 != null) {
                    HMLog.info$default(null, new DataCacheDelegate$switch$2$1(thM3848exceptionOrNullimpl5), 1, null);
                    Unit unit11 = Unit.INSTANCE;
                }
                if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                    objM3845constructorimpl = null;
                }
                if (objM3845constructorimpl == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    arrayList.add(objM3845constructorimpl);
                }
            }
            return arrayList;
        }
        listEmptyList = listB;
        return listEmptyList;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    @NotNull
    public List<OsaEvent> fetchOsaEvent(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect) {
        List listEmptyList;
        Object objM3845constructorimpl;
        Object objFromJson;
        Object objM3845constructorimpl2;
        Object objM3845constructorimpl3;
        Object objM3845constructorimpl4;
        Object objM3845constructorimpl5;
        List<EventItem> listB = b(BloodOxygen.SubType.OSA_EVENT, from, to, limit, reverse, syncNext, direct, saveSyncLogEvenWhenDirect);
        if (!direct) {
            return this.osaEventDelegate.getLocalOsaEvents(from, to);
        }
        if (!Intrinsics.areEqual(OsaEvent.class, EventItem.class)) {
            listEmptyList = listB;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listB, 10));
            for (EventItem eventItem : listB) {
                try {
                    Result.Companion companion = Result.Companion;
                    if (Intrinsics.areEqual(OsaEvent.class, Odi.class)) {
                        Object objFromJson2 = SharedInstanceKt.getGson().fromJson(SharedInstanceKt.getGson().toJson(eventItem), (Class<Object>) Odi.class);
                        ((Odi) objFromJson2).setUploaded(true);
                        Unit unit = Unit.INSTANCE;
                        if (objFromJson2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.huami.bloodoxygen.core.local.database.entity.OsaEvent");
                        }
                        objFromJson = (OsaEvent) objFromJson2;
                        String ymdhms = ExtensionKt.toYMDHMS(eventItem.getUtcTimestamp(), TimeZone.getTimeZone(eventItem.getTimeZoneId()));
                        try {
                            Field declaredField = OsaEvent.class.getDeclaredField("date");
                            declaredField.setAccessible(true);
                            declaredField.set(objFromJson, ymdhms);
                            objM3845constructorimpl5 = Result.m3845constructorimpl(unit);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            objM3845constructorimpl5 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                        }
                        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl5);
                        if (thM3848exceptionOrNullimpl != null) {
                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl));
                            Unit unit2 = Unit.INSTANCE;
                        }
                        Unit unit3 = Unit.INSTANCE;
                    } else {
                        JSONObject jSONObject = new JSONObject(eventItem.getExtra());
                        Object obj = jSONObject.get("timestamp");
                        if (obj instanceof Double) {
                            jSONObject.remove("timestamp");
                            jSONObject.put("timestamp", (long) ((Number) obj).doubleValue());
                        }
                        objFromJson = SharedInstanceKt.getGson().fromJson(jSONObject.toString(), (Class<Object>) OsaEvent.class);
                        String userId = eventItem.getUserId();
                        try {
                            Field declaredField2 = OsaEvent.class.getDeclaredField("userId");
                            declaredField2.setAccessible(true);
                            Unit unit4 = Unit.INSTANCE;
                            declaredField2.set(objFromJson, userId);
                            objM3845constructorimpl2 = Result.m3845constructorimpl(unit4);
                        } catch (Throwable th2) {
                            Result.Companion companion3 = Result.Companion;
                            objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
                        }
                        Throwable thM3848exceptionOrNullimpl2 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
                        if (thM3848exceptionOrNullimpl2 != null) {
                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl2));
                            Unit unit5 = Unit.INSTANCE;
                        }
                        Boolean bool = Boolean.TRUE;
                        try {
                            Result.Companion companion4 = Result.Companion;
                            Field declaredField3 = OsaEvent.class.getDeclaredField("uploaded");
                            declaredField3.setAccessible(true);
                            Unit unit6 = Unit.INSTANCE;
                            declaredField3.set(objFromJson, bool);
                            objM3845constructorimpl3 = Result.m3845constructorimpl(unit6);
                        } catch (Throwable th3) {
                            Result.Companion companion5 = Result.Companion;
                            objM3845constructorimpl3 = Result.m3845constructorimpl(ResultKt.createFailure(th3));
                        }
                        Throwable thM3848exceptionOrNullimpl3 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl3);
                        if (thM3848exceptionOrNullimpl3 != null) {
                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl3));
                            Unit unit7 = Unit.INSTANCE;
                        }
                        Field declaredField4 = OsaEvent.class.getDeclaredField("utcTimestamp");
                        declaredField4.setAccessible(true);
                        Unit unit8 = Unit.INSTANCE;
                        long j = declaredField4.getLong(objFromJson);
                        Field declaredField5 = OsaEvent.class.getDeclaredField("timeZoneId");
                        declaredField5.setAccessible(true);
                        Object obj2 = declaredField5.get(objFromJson);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        String ymdhms2 = ExtensionKt.toYMDHMS(j, TimeZone.getTimeZone((String) obj2));
                        try {
                            Result.Companion companion6 = Result.Companion;
                            Field declaredField6 = OsaEvent.class.getDeclaredField("date");
                            declaredField6.setAccessible(true);
                            declaredField6.set(objFromJson, ymdhms2);
                            objM3845constructorimpl4 = Result.m3845constructorimpl(unit8);
                        } catch (Throwable th4) {
                            Result.Companion companion7 = Result.Companion;
                            objM3845constructorimpl4 = Result.m3845constructorimpl(ResultKt.createFailure(th4));
                        }
                        Throwable thM3848exceptionOrNullimpl4 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl4);
                        if (thM3848exceptionOrNullimpl4 != null) {
                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl4));
                            Unit unit9 = Unit.INSTANCE;
                        }
                        Unit unit10 = Unit.INSTANCE;
                    }
                    objM3845constructorimpl = Result.m3845constructorimpl(objFromJson);
                } catch (Throwable th5) {
                    Result.Companion companion8 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th5));
                }
                Throwable thM3848exceptionOrNullimpl5 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl5 != null) {
                    HMLog.info$default(null, new DataCacheDelegate$switch$2$1(thM3848exceptionOrNullimpl5), 1, null);
                    Unit unit11 = Unit.INSTANCE;
                }
                if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                    objM3845constructorimpl = null;
                }
                if (objM3845constructorimpl == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    arrayList.add(objM3845constructorimpl);
                }
            }
            return arrayList;
        }
        listEmptyList = listB;
        return listEmptyList;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    @NotNull
    public List<OsaProcess> fetchOsaProcess(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect) {
        List listEmptyList;
        Object objM3845constructorimpl;
        Object objFromJson;
        Object objM3845constructorimpl2;
        Object objM3845constructorimpl3;
        Object objM3845constructorimpl4;
        Object objM3845constructorimpl5;
        List<EventItem> listB = b(BloodOxygen.SubType.OSA_PROCESS, from, to, limit, reverse, syncNext, direct, saveSyncLogEvenWhenDirect);
        if (!direct) {
            return this.osaProcessDelegate.getLocalOsaProcesses(from, to);
        }
        if (!Intrinsics.areEqual(OsaProcess.class, EventItem.class)) {
            listEmptyList = listB;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listB, 10));
            for (EventItem eventItem : listB) {
                try {
                    Result.Companion companion = Result.Companion;
                    if (Intrinsics.areEqual(OsaProcess.class, Odi.class)) {
                        Object objFromJson2 = SharedInstanceKt.getGson().fromJson(SharedInstanceKt.getGson().toJson(eventItem), (Class<Object>) Odi.class);
                        ((Odi) objFromJson2).setUploaded(true);
                        Unit unit = Unit.INSTANCE;
                        if (objFromJson2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.huami.bloodoxygen.core.local.database.entity.OsaProcess");
                        }
                        objFromJson = (OsaProcess) objFromJson2;
                        String ymdhms = ExtensionKt.toYMDHMS(eventItem.getUtcTimestamp(), TimeZone.getTimeZone(eventItem.getTimeZoneId()));
                        try {
                            Field declaredField = OsaProcess.class.getDeclaredField("date");
                            declaredField.setAccessible(true);
                            declaredField.set(objFromJson, ymdhms);
                            objM3845constructorimpl5 = Result.m3845constructorimpl(unit);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            objM3845constructorimpl5 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                        }
                        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl5);
                        if (thM3848exceptionOrNullimpl != null) {
                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl));
                            Unit unit2 = Unit.INSTANCE;
                        }
                        Unit unit3 = Unit.INSTANCE;
                    } else {
                        JSONObject jSONObject = new JSONObject(eventItem.getExtra());
                        Object obj = jSONObject.get("timestamp");
                        if (obj instanceof Double) {
                            jSONObject.remove("timestamp");
                            jSONObject.put("timestamp", (long) ((Number) obj).doubleValue());
                        }
                        objFromJson = SharedInstanceKt.getGson().fromJson(jSONObject.toString(), (Class<Object>) OsaProcess.class);
                        String userId = eventItem.getUserId();
                        try {
                            Field declaredField2 = OsaProcess.class.getDeclaredField("userId");
                            declaredField2.setAccessible(true);
                            Unit unit4 = Unit.INSTANCE;
                            declaredField2.set(objFromJson, userId);
                            objM3845constructorimpl2 = Result.m3845constructorimpl(unit4);
                        } catch (Throwable th2) {
                            Result.Companion companion3 = Result.Companion;
                            objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
                        }
                        Throwable thM3848exceptionOrNullimpl2 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
                        if (thM3848exceptionOrNullimpl2 != null) {
                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl2));
                            Unit unit5 = Unit.INSTANCE;
                        }
                        Boolean bool = Boolean.TRUE;
                        try {
                            Result.Companion companion4 = Result.Companion;
                            Field declaredField3 = OsaProcess.class.getDeclaredField("uploaded");
                            declaredField3.setAccessible(true);
                            Unit unit6 = Unit.INSTANCE;
                            declaredField3.set(objFromJson, bool);
                            objM3845constructorimpl3 = Result.m3845constructorimpl(unit6);
                        } catch (Throwable th3) {
                            Result.Companion companion5 = Result.Companion;
                            objM3845constructorimpl3 = Result.m3845constructorimpl(ResultKt.createFailure(th3));
                        }
                        Throwable thM3848exceptionOrNullimpl3 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl3);
                        if (thM3848exceptionOrNullimpl3 != null) {
                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl3));
                            Unit unit7 = Unit.INSTANCE;
                        }
                        Field declaredField4 = OsaProcess.class.getDeclaredField("utcTimestamp");
                        declaredField4.setAccessible(true);
                        Unit unit8 = Unit.INSTANCE;
                        long j = declaredField4.getLong(objFromJson);
                        Field declaredField5 = OsaProcess.class.getDeclaredField("timeZoneId");
                        declaredField5.setAccessible(true);
                        Object obj2 = declaredField5.get(objFromJson);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        String ymdhms2 = ExtensionKt.toYMDHMS(j, TimeZone.getTimeZone((String) obj2));
                        try {
                            Result.Companion companion6 = Result.Companion;
                            Field declaredField6 = OsaProcess.class.getDeclaredField("date");
                            declaredField6.setAccessible(true);
                            declaredField6.set(objFromJson, ymdhms2);
                            objM3845constructorimpl4 = Result.m3845constructorimpl(unit8);
                        } catch (Throwable th4) {
                            Result.Companion companion7 = Result.Companion;
                            objM3845constructorimpl4 = Result.m3845constructorimpl(ResultKt.createFailure(th4));
                        }
                        Throwable thM3848exceptionOrNullimpl4 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl4);
                        if (thM3848exceptionOrNullimpl4 != null) {
                            HMLog.info(h, new DataCacheDelegate$accessAndSetFiled$2$1(thM3848exceptionOrNullimpl4));
                            Unit unit9 = Unit.INSTANCE;
                        }
                        Unit unit10 = Unit.INSTANCE;
                    }
                    objM3845constructorimpl = Result.m3845constructorimpl(objFromJson);
                } catch (Throwable th5) {
                    Result.Companion companion8 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th5));
                }
                Throwable thM3848exceptionOrNullimpl5 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl5 != null) {
                    HMLog.info$default(null, new DataCacheDelegate$switch$2$1(thM3848exceptionOrNullimpl5), 1, null);
                    Unit unit11 = Unit.INSTANCE;
                }
                if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                    objM3845constructorimpl = null;
                }
                if (objM3845constructorimpl == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    arrayList.add(objM3845constructorimpl);
                }
            }
            return arrayList;
        }
        listEmptyList = listB;
        return listEmptyList;
    }
}
