package com.huami.bloodoxygen.core.repository;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.local.database.entity.Odi;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaEvent;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaProcess;
import com.huami.bloodoxygen.core.local.database.entity.OsaEvent;
import com.huami.bloodoxygen.core.local.database.entity.OsaProcess;
import com.huami.bloodoxygen.core.local.database.entity.SyncLog;
import com.huami.bloodoxygen.core.remote.api.event.EventItem;
import com.huami.bloodoxygen.core.utils.SharedInstanceKt;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u0000 q2\u00020\u0001:\u0001qB\u000f\u0012\u0006\u0010n\u001a\u000204¢\u0006\u0004\bo\u0010pJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J2\u0010\u0013\u001a\u00020\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f0\u0017H\u0016J \u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u0010\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0017H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0016J$\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f0\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u0016\u0010 \u001a\u00020\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017H\u0016J\b\u0010\"\u001a\u00020\u0014H\u0016J\b\u0010#\u001a\u00020\u0014H\u0016J\u0018\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00172\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00172\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0006H\u0016J\u0016\u0010*\u001a\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016J\u0012\u0010+\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J$\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\n\u0010.\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0017H\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017H\u0016J\b\u00101\u001a\u00020\u0014H\u0016J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u00105\u001a\u000204H\u0016J\u0016\u00107\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016J\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J$\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\n\u0010:\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0017H\u0016J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017H\u0016J\b\u0010=\u001a\u00020\u0014H\u0016J\u0016\u0010>\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u00105\u001a\u000204H\u0016J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016J\u0016\u0010B\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016J\u001e\u0010C\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J$\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017H\u0016J\u0016\u0010F\u001a\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016J\b\u0010G\u001a\u00020\u0014H\u0016J\u000e\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000e0\fH\u0016J\u0014\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\f0\u0017H\u0016J\u0016\u0010J\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\fH\u0016J\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u000e\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0016J\u0014\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u0017H\u0016J\u0016\u0010N\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0016J\u001e\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u0010\u0010R\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020PH\u0016J\b\u0010S\u001a\u00020\u0014H\u0016J\u001a\u0010W\u001a\u0004\u0018\u00010P2\u0006\u0010U\u001a\u00020T2\u0006\u0010V\u001a\u000204H\u0016J\u0010\u0010X\u001a\u00020\u00122\u0006\u0010U\u001a\u00020TH\u0016J\u0016\u0010[\u001a\u00020\u00122\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\fH\u0016J>\u0010`\u001a\b\u0012\u0004\u0012\u00020Y0\f2\u0006\u0010\u0019\u001a\u0002042\u0006\u0010\u001a\u001a\u0002042\u0006\u0010U\u001a\u00020T2\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010]\u001a\u00020\u00122\u0006\u0010_\u001a\u00020^H\u0016J\u001e\u0010c\u001a\u00020\u00122\u0006\u0010a\u001a\u00020T2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016J@\u0010f\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010_\u001a\u00020^2\u0006\u0010]\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010d\u001a\u00020\u00122\u0006\u0010e\u001a\u00020\u0012H\u0016JF\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010_\u001a\u00020^2\u0006\u0010]\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010d\u001a\u00020\u00122\u0006\u0010e\u001a\u00020\u0012H\u0016JF\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010_\u001a\u00020^2\u0006\u0010]\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010d\u001a\u00020\u00122\u0006\u0010e\u001a\u00020\u0012H\u0016JF\u0010i\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010_\u001a\u00020^2\u0006\u0010]\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010d\u001a\u00020\u00122\u0006\u0010e\u001a\u00020\u0012H\u0016JF\u0010j\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010_\u001a\u00020^2\u0006\u0010]\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010d\u001a\u00020\u00122\u0006\u0010e\u001a\u00020\u0012H\u0016J\u0018\u0010k\u001a\u00020\u00122\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\fH\u0016J\u0018\u0010l\u001a\u00020\u00122\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0016R\u0016\u0010n\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010m¨\u0006r"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/FakeBloodOxygenRepo;", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", "", "timestamp", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "a", "Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", "b", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaProcess;", GoogleApiAvailabilityLight.a, "Lcom/huami/bloodoxygen/core/local/database/entity/OsaEvent;", "c", "", "clickSpo2s", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaProcess;", "osaProcesses", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaEvent;", "osaEvents", "", TransportUri.ACTION_ADD, "", "clear", "getLocalClickSpo2ShouldUpload", "Lkotlinx/coroutines/flow/Flow;", "getLocalClickSpo2ShouldUploadFlow", "from", "to", "getLocalLatestClickSpo2Flow", "getLocalLatestClickSpo2", "getLocalClickSpo2sFlow", "getLocalClickSpo2s", "clickSpo2List", "addLocalClickSpo2s", "getIfLocalClickSpo2ExistsFlow", "clearLocalClickSpo2", "clearInvalidClickSpo2", "getLocalValidOdiFlow", "getLocalOdiFlow", "getLocalOdiShouldUpload", "odi", "addLocalOdi", "odis", "addLocalOdis", "getLocalOdi", "getLocalOdis", "getLocalOdisFlow", "getLocalLatestOdi", "getLocalLatestOdiFlow", "getIfLocalOdiExistsFlow", "clearLocalOdi", "getLocalOsaProcessShouldUpload", "getLocalOsaProcessShouldDelete", "", "sleepDate", "getLocalOsaProcessBySleepDate", "addLocalOsaProcesses", "getLocalOsaProcesses", "getLocalOsaProcessesFlow", "getLocalLatestOsaProcess", "getLocalLatestOsaProcessFlow", "getIfLocalOsaProcessExistsFlow", "clearLocalOsaProcess", "removeLocalOsaProcess", "getLocalOsaEventShouldUpload", "getLocalOsaEventBySleepDate", "getLocalOsaEventShouldDelete", "addLocalOsaEvents", "getLocalOsaEvents", "getLocalOsaEventsFlow", "getIfLocalOsaEventExistsFlow", "removeLocalOsaEvent", "clearLocalOsaEvent", "getLocalOriginOsaProcessShouldUpload", "getLocalOriginOsaProcessShouldUploadFlow", "addLocalOriginOsaProcesses", "getLocalOriginOsaProcesses", "getLocalOriginOsaEventShouldUpload", "getLocalOriginOsaEventShouldUploadFlow", "addLocalOriginOsaEvents", "getLocalOriginOsaEvents", "Lcom/huami/bloodoxygen/core/local/database/entity/SyncLog;", "syncLog", "addSyncLog", "clearSyncLog", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;", "type", "date", "getSyncLog", "ifSyncLogExists", "Lcom/huami/bloodoxygen/core/remote/api/event/EventItem;", "events", "uploadEvents", "syncNext", "reverse", "", "limit", "getDateEvents", "subType", "timestamps", "deleteEvents", "direct", "saveSyncLogEvenWhenDirect", "fetchAllTypeData", "fetchOdi", "fetchClickSpo2", "fetchOsaProcess", "fetchOsaEvent", "deleteOsaProcesses", "deleteOsaEvents", "Ljava/lang/String;", "userId", "<init>", "(Ljava/lang/String;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class FakeBloodOxygenRepo implements IBloodOxygenRepo {

    @NotNull
    private static final String b = "FakeBloodOxygenRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<ClickMeasuredSpo2> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<ClickMeasuredSpo2> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "add clickSpo2s " + SharedInstanceKt.getGson().toJson(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<OriginOsaProcess> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<OriginOsaProcess> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "add osaProcesses " + SharedInstanceKt.getGson().toJson(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<OriginOsaEvent> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<OriginOsaEvent> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "add osaEvents " + SharedInstanceKt.getGson().toJson(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ List<ClickMeasuredSpo2> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<ClickMeasuredSpo2> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "addLocalClickSpo2List " + SharedInstanceKt.getGson().toJson(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Odi a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Odi odi) {
            super(0);
            this.a = odi;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "addLocalOdi " + SharedInstanceKt.getGson().toJson(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Odi> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<Odi> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "addLocalOdis " + SharedInstanceKt.getGson().toJson(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ List<OriginOsaEvent> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<OriginOsaEvent> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "addLocalOriginOsaEvent " + SharedInstanceKt.getGson().toJson(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ List<OriginOsaProcess> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<OriginOsaProcess> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "addLocalOriginOsaProcess " + SharedInstanceKt.getGson().toJson(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ List<OsaEvent> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(List<OsaEvent> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "addLocalOsaEvent " + SharedInstanceKt.getGson().toJson(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ List<OsaProcess> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List<OsaProcess> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "addLocalOsaProcesses " + SharedInstanceKt.getGson().toJson(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "clear";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "clearClickSpo2";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "clearOdi";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "clearOsaEvent";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "clearOsaProcess";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.repository.FakeBloodOxygenRepo$getIfLocalClickSpo2ExistsFlow$1", f = "FakeBloodOxygenRepo.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            p pVar = new p(continuation);
            pVar.b = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super Boolean> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((p) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                this.a = 1;
                if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.repository.FakeBloodOxygenRepo$getIfLocalOdiExistsFlow$1", f = "FakeBloodOxygenRepo.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            q qVar = new q(continuation);
            qVar.b = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super Boolean> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((q) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                this.a = 1;
                if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.repository.FakeBloodOxygenRepo$getIfLocalOsaEventExistsFlow$1", f = "FakeBloodOxygenRepo.kt", i = {}, l = {FTPCodes.USER_LOGGED_IN}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public r(Continuation<? super r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            r rVar = new r(continuation);
            rVar.b = obj;
            return rVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super Boolean> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((r) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                this.a = 1;
                if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.repository.FakeBloodOxygenRepo$getIfLocalOsaProcessExistsFlow$1", f = "FakeBloodOxygenRepo.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public s(Continuation<? super s> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            s sVar = new s(continuation);
            sVar.b = obj;
            return sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super Boolean> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((s) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                this.a = 1;
                if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.repository.FakeBloodOxygenRepo$getLocalLatestClickSpo2Flow$1", f = "FakeBloodOxygenRepo.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Function2<FlowCollector<? super ClickMeasuredSpo2>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(long j, Continuation<? super t> continuation) {
            super(2, continuation);
            this.d = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            t tVar = FakeBloodOxygenRepo.this.new t(this.d, continuation);
            tVar.b = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super ClickMeasuredSpo2> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((t) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                ClickMeasuredSpo2 clickMeasuredSpo2A = FakeBloodOxygenRepo.this.a(this.d);
                this.a = 1;
                if (flowCollector.emit(clickMeasuredSpo2A, this) == coroutine_suspended) {
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.repository.FakeBloodOxygenRepo$getLocalLatestClickSpo2Flow$2", f = "FakeBloodOxygenRepo.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class u extends SuspendLambda implements Function2<FlowCollector<? super ClickMeasuredSpo2>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public u(Continuation<? super u> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            u uVar = FakeBloodOxygenRepo.this.new u(continuation);
            uVar.b = obj;
            return uVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super ClickMeasuredSpo2> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((u) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                ClickMeasuredSpo2 clickMeasuredSpo2A = FakeBloodOxygenRepo.this.a(System.currentTimeMillis());
                this.a = 1;
                if (flowCollector.emit(clickMeasuredSpo2A, this) == coroutine_suspended) {
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.repository.FakeBloodOxygenRepo$getLocalValidOdiFlow$1", f = "FakeBloodOxygenRepo.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    public static final class v extends SuspendLambda implements Function2<FlowCollector<? super Odi>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(long j, Continuation<? super v> continuation) {
            super(2, continuation);
            this.d = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            v vVar = FakeBloodOxygenRepo.this.new v(this.d, continuation);
            vVar.b = obj;
            return vVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super Odi> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((v) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                Odi odiB = FakeBloodOxygenRepo.this.b(this.d);
                this.a = 1;
                if (flowCollector.emit(odiB, this) == coroutine_suspended) {
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
    }

    public FakeBloodOxygenRepo(@NotNull String str) {
        this.userId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClickMeasuredSpo2 a(long timestamp) {
        return new ClickMeasuredSpo2(this.userId, timestamp, kotlin.ranges.e.random(new IntRange(80, 100), Random.Default), 0, null, null, null, null, null, false, 1016, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Odi b(long timestamp) {
        String str = this.userId;
        IntRange intRange = new IntRange(1, 20);
        Random.Default r8 = Random.Default;
        return new Odi(str, timestamp, kotlin.ranges.e.random(intRange, r8), ((long) kotlin.ranges.e.random(new IntRange(2, 4), r8)) * TimeUtils.TIME_1_HOURS, kotlin.ranges.e.random(new IntRange(1, 5), r8), 0, null, 2, null, null, null, 0, 0, null, false, 32608, null);
    }

    private final OsaEvent c(long timestamp) {
        String str = this.userId;
        List list = CollectionsKt___CollectionsKt.toList(new IntRange(0, kotlin.ranges.e.random(new IntRange(0, 60), Random.Default)));
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((Number) it2.next()).intValue();
            arrayList.add(Integer.valueOf(kotlin.ranges.e.random(new IntRange(80, 100), Random.Default)));
        }
        List list2 = CollectionsKt___CollectionsKt.toList(new IntRange(0, kotlin.ranges.e.random(new IntRange(0, 60), Random.Default)));
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            ((Number) it3.next()).intValue();
            arrayList2.add(Integer.valueOf(kotlin.ranges.e.random(new IntRange(60, 120), Random.Default)));
        }
        return new OsaEvent(str, timestamp, arrayList, arrayList2, 0, null, 0, null, null, null, null, false, null, false, 16368, null);
    }

    private final OsaProcess d(long timestamp) {
        String str = this.userId;
        IntRange intRange = new IntRange(80, 100);
        Random.Default r5 = Random.Default;
        return new OsaProcess(str, timestamp, kotlin.ranges.e.random(intRange, r5), kotlin.ranges.e.random(new IntRange(0, 60), r5), null, 0, null, null, null, null, null, null, null, null, false, null, false, 131056, null);
    }

    @Override // com.huami.bloodoxygen.core.repository.IBloodOxygenRepo
    public boolean add(@NotNull List<ClickMeasuredSpo2> clickSpo2s, @NotNull List<OriginOsaProcess> osaProcesses, @NotNull List<OriginOsaEvent> osaEvents) {
        HMLog.info(b, new a(clickSpo2s));
        HMLog.info(b, new b(osaProcesses));
        HMLog.info(b, new c(osaEvents));
        return true;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    public boolean addLocalClickSpo2s(@NotNull List<ClickMeasuredSpo2> clickSpo2List) {
        HMLog.info(b, new d(clickSpo2List));
        return true;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    public boolean addLocalOdi(@NotNull Odi odi) {
        HMLog.info(b, new e(odi));
        return true;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    public boolean addLocalOdis(@NotNull List<Odi> odis) {
        HMLog.info(b, new f(odis));
        return true;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaEventDelegate
    public boolean addLocalOriginOsaEvents(@NotNull List<OriginOsaEvent> osaEvents) {
        HMLog.info(b, new g(osaEvents));
        return true;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaProcessDelegate
    public boolean addLocalOriginOsaProcesses(@NotNull List<OriginOsaProcess> osaProcesses) {
        HMLog.info(b, new h(osaProcesses));
        return true;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    public boolean addLocalOsaEvents(@NotNull List<OsaEvent> osaEvents) {
        HMLog.info(b, new i(osaEvents));
        return true;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    public boolean addLocalOsaProcesses(@NotNull List<OsaProcess> osaProcesses) {
        HMLog.info(b, new j(osaProcesses));
        return true;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.ISyncLogDelegate
    public boolean addSyncLog(@NotNull SyncLog syncLog) {
        return true;
    }

    @Override // com.huami.bloodoxygen.core.repository.IBloodOxygenRepo
    public void clear() {
        HMLog.info(b, k.a);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    public void clearInvalidClickSpo2() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    public void clearLocalClickSpo2() {
        HMLog.info(b, l.a);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    public void clearLocalOdi() {
        HMLog.info(b, m.a);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    public void clearLocalOsaEvent() {
        HMLog.info(b, n.a);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    public void clearLocalOsaProcess() {
        HMLog.info(b, o.a);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.ISyncLogDelegate
    public void clearSyncLog() {
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IHttpDelegate
    public boolean deleteEvents(@NotNull BloodOxygen.SubType subType, @NotNull List<Long> timestamps) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    public boolean deleteOsaEvents(@Nullable List<OsaEvent> osaEvents) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    public boolean deleteOsaProcesses(@Nullable List<OsaProcess> osaProcesses) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    public void fetchAllTypeData(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    @NotNull
    public List<ClickMeasuredSpo2> fetchClickSpo2(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect) {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new ClickMeasuredSpo2[]{a(from), a(to)});
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    @NotNull
    public List<Odi> fetchOdi(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect) {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Odi[]{b(from), b(to)});
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    @NotNull
    public List<OsaEvent> fetchOsaEvent(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect) {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new OsaEvent[]{c(from), c(to)});
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    @NotNull
    public List<OsaProcess> fetchOsaProcess(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect) {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new OsaProcess[]{d(from), d(to)});
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IHttpDelegate
    @NotNull
    public List<EventItem> getDateEvents(@NotNull String from, @NotNull String to, @NotNull BloodOxygen.SubType type, boolean syncNext, boolean reverse, int limit) {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public Flow<Boolean> getIfLocalClickSpo2ExistsFlow() {
        return FlowKt.flow(new p(null));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public Flow<Boolean> getIfLocalOdiExistsFlow() {
        return FlowKt.flow(new q(null));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    @NotNull
    public Flow<Boolean> getIfLocalOsaEventExistsFlow() {
        return FlowKt.flow(new r(null));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public Flow<Boolean> getIfLocalOsaProcessExistsFlow() {
        return FlowKt.flow(new s(null));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public List<ClickMeasuredSpo2> getLocalClickSpo2ShouldUpload() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public Flow<List<ClickMeasuredSpo2>> getLocalClickSpo2ShouldUploadFlow() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public List<ClickMeasuredSpo2> getLocalClickSpo2s(long from, long to) {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new ClickMeasuredSpo2[]{a(from), a(to)});
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public Flow<List<ClickMeasuredSpo2>> getLocalClickSpo2sFlow(long from, long to) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @Nullable
    public ClickMeasuredSpo2 getLocalLatestClickSpo2() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public Flow<ClickMeasuredSpo2> getLocalLatestClickSpo2Flow(long from, long to) {
        return FlowKt.flow(new t(to, null));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @Nullable
    public Odi getLocalLatestOdi() {
        return b(System.currentTimeMillis());
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public Flow<Odi> getLocalLatestOdiFlow() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @Nullable
    public OsaProcess getLocalLatestOsaProcess() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public Flow<OsaProcess> getLocalLatestOsaProcessFlow() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @Nullable
    public Odi getLocalOdi(long timestamp) {
        return b(timestamp);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public Flow<Odi> getLocalOdiFlow(long timestamp) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public List<Odi> getLocalOdiShouldUpload() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public List<Odi> getLocalOdis(long from, long to) {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Odi[]{b(from), b(to)});
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public Flow<List<Odi>> getLocalOdisFlow(long from, long to) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaEventDelegate
    @NotNull
    public List<OriginOsaEvent> getLocalOriginOsaEventShouldUpload() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaEventDelegate
    @NotNull
    public Flow<List<OriginOsaEvent>> getLocalOriginOsaEventShouldUploadFlow() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaEventDelegate
    @NotNull
    public List<OriginOsaEvent> getLocalOriginOsaEvents(long from, long to) {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaProcessDelegate
    @NotNull
    public List<OriginOsaProcess> getLocalOriginOsaProcessShouldUpload() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaProcessDelegate
    @NotNull
    public Flow<List<OriginOsaProcess>> getLocalOriginOsaProcessShouldUploadFlow() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaProcessDelegate
    @NotNull
    public List<OriginOsaProcess> getLocalOriginOsaProcesses(long from, long to) {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    @NotNull
    public List<OsaEvent> getLocalOsaEventBySleepDate(@NotNull String sleepDate) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    @NotNull
    public List<OsaEvent> getLocalOsaEventShouldDelete() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    @NotNull
    public List<OsaEvent> getLocalOsaEventShouldUpload() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    @NotNull
    public List<OsaEvent> getLocalOsaEvents(long from, long to) {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new OsaEvent[]{c(from), c(to)});
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    @NotNull
    public Flow<List<OsaEvent>> getLocalOsaEventsFlow(long from, long to) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public List<OsaProcess> getLocalOsaProcessBySleepDate(@NotNull String sleepDate) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public List<OsaProcess> getLocalOsaProcessShouldDelete() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public List<OsaProcess> getLocalOsaProcessShouldUpload() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public List<OsaProcess> getLocalOsaProcesses(long from, long to) {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new OsaProcess[]{d(from), d(to)});
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public Flow<List<OsaProcess>> getLocalOsaProcessesFlow(long from, long to) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public Flow<Odi> getLocalValidOdiFlow(long timestamp) {
        return FlowKt.flow(new v(timestamp, null));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.ISyncLogDelegate
    @Nullable
    public SyncLog getSyncLog(@NotNull BloodOxygen.SubType type, @NotNull String date) {
        return null;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.ISyncLogDelegate
    public boolean ifSyncLogExists(@NotNull BloodOxygen.SubType type) {
        return true;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    public void removeLocalOsaEvent(@NotNull List<OsaEvent> osaEvents) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    public void removeLocalOsaProcess(@NotNull List<OsaProcess> osaProcesses) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IHttpDelegate
    public boolean uploadEvents(@NotNull List<EventItem> events) {
        return true;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public Flow<ClickMeasuredSpo2> getLocalLatestClickSpo2Flow() {
        return FlowKt.flow(new u(null));
    }
}
