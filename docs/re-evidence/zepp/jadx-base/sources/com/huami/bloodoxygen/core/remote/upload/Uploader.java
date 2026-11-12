package com.huami.bloodoxygen.core.remote.upload;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.GsonBuilder;
import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import com.huami.bloodoxygen.core.local.config.BloodOxygenCoroutineScope;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.local.database.entity.Odi;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaEvent;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaProcess;
import com.huami.bloodoxygen.core.local.database.entity.OsaEvent;
import com.huami.bloodoxygen.core.remote.api.event.EventItem;
import com.huami.bloodoxygen.core.remote.api.fileaccess.Extra;
import com.huami.bloodoxygen.core.remote.api.fileaccess.FileAccessApi;
import com.huami.bloodoxygen.core.remote.api.fileaccess.FileInfoEntity;
import com.huami.bloodoxygen.core.remote.api.fileaccess.FileUrlEntity;
import com.huami.bloodoxygen.core.remote.api.fileaccess.OsaData;
import com.huami.bloodoxygen.core.repository.IBloodOxygenRepo;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import com.huami.bloodoxygen.core.utils.FileUtils;
import com.huami.bloodoxygen.core.utils.SharedInstanceKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0003BE\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u00100\u001a\u00020\u001d\u0012\u0006\u00101\u001a\u00020\u001d\u0012\u0006\u00104\u001a\u000202\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c¢\u0006\u0004\bF\u0010GJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002JF\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\f2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\u00020\fH\u0002J\u0016\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0002J\u0016\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bH\u0002J\u0016\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0002J\u0016\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bH\u0002J\u0016\u0010\u001b\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0002J\u0018\u0010\u001f\u001a\u00020\u00022\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH\u0002J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\u0002H\u0016J\u0016\u0010#\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\"0\u000bH\u0016J\u0016\u0010%\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020$0\u000bH\u0016J\u0016\u0010'\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020&0\u000bH\u0016J\b\u0010(\u001a\u00020\u000fH\u0016J\u0012\u0010*\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010+\u001a\u00020\u0002H\u0016R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0016\u00100\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0016\u00101\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R)\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u000b0@8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010A\u001a\u0004\b6\u0010BR)\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b0@8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\b=\u0010BR)\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0@8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\b:\u0010B¨\u0006H"}, d2 = {"Lcom/huami/bloodoxygen/core/remote/upload/Uploader;", "Lcom/huami/bloodoxygen/core/remote/upload/IUploader;", "", "a", "c", "b", "", "it", "Lcom/huami/bloodoxygen/core/remote/api/event/EventItem;", GoogleApiAvailabilityLight.a, ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function1;", "convertToEventItem", "updateDbWhenSuccess", "", com.loc.z.j, "events", "i", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaProcess;", "list", GoogleApiAvailabilityLight.b, "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaEvent;", "l", "originOsaProcesses", "m", "originOsaEvents", hl.k, "Lkotlin/Function0;", "", "messageCollector", "h", "register", MiPushClient.COMMAND_UNREGISTER, "Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", "uploadOdis", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "uploadClickSpo2s", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaEvent;", "uploadOsaEvents", "uploadAll", "date", "uploadAlgoResultData", "uploadAlgoResultDataInScope", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/lang/String;", "appName", "userId", "Lcom/huami/bloodoxygen/core/remote/api/fileaccess/FileAccessApi;", "Lcom/huami/bloodoxygen/core/remote/api/fileaccess/FileAccessApi;", "fileAccessApi", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", "e", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/bloodoxygen/core/local/config/BloodOxygenCoroutineScope;", "f", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygenCoroutineScope;", "scope", "g", "Lkotlin/jvm/functions/Function0;", "isSyncDataEnable", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Lazy;", "()Lkotlinx/coroutines/flow/Flow;", "clickSpo2Flow", "originOsaProcessFlow", "originOsaEventFlow", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huami/bloodoxygen/core/remote/api/fileaccess/FileAccessApi;Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;Lcom/huami/bloodoxygen/core/local/config/BloodOxygenCoroutineScope;Lkotlin/jvm/functions/Function0;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class Uploader implements IUploader {

    @NotNull
    private static final a k = new a(null);

    @Deprecated
    @NotNull
    private static final String l = "Uploader";

    @Deprecated
    private static final int m = 300;

    @Deprecated
    private static final int n = 64;

    @Deprecated
    private static final int o;

    @Deprecated
    @NotNull
    private static final ExecutorCoroutineDispatcher p;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String appName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final FileAccessApi fileAccessApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final IBloodOxygenRepo repo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final BloodOxygenCoroutineScope scope;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> isSyncDataEnable;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy clickSpo2Flow = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy originOsaProcessFlow = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy originOsaEventFlow = LazyKt__LazyJVMKt.lazy(new c());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"com/huami/bloodoxygen/core/remote/upload/Uploader$a", "", "", "AVAILABLE_PROCESSORS", LogUtil.I, "CHUNKED_SIZE", "", "TAG", "Ljava/lang/String;", "THREAD_NUM", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "UPLOAD", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaEvent;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a0 extends Lambda implements Function1<List<? extends OsaEvent>, Unit> {
        public final /* synthetic */ List<OsaEvent> b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<OsaEvent> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<OsaEvent> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "uploadOsaEvents isSuccess " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(List<OsaEvent> list) {
            super(1);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends OsaEvent> list) {
            invoke2((List<OsaEvent>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<OsaEvent> list) {
            Uploader.this.h(new a(list));
            Uploader.this.repo.addLocalOsaEvents(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Flow<? extends List<? extends ClickMeasuredSpo2>>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Flow<List<ClickMeasuredSpo2>> invoke() {
            return Uploader.this.repo.getLocalClickSpo2ShouldUploadFlow();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaEvent;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Flow<? extends List<? extends OriginOsaEvent>>> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Flow<List<OriginOsaEvent>> invoke() {
            return Uploader.this.repo.getLocalOriginOsaEventShouldUploadFlow();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaProcess;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Flow<? extends List<? extends OriginOsaProcess>>> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Flow<List<OriginOsaProcess>> invoke() {
            return Uploader.this.repo.getLocalOriginOsaProcessShouldUploadFlow();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ List<EventItem> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<EventItem> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "tryUpload " + SharedInstanceKt.getGson().toJson(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ List<EventItem> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<EventItem> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "tryUpload events too large " + this.a.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "tryUpload error " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadAlgoResultData isSyncDataEnable false";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadAlgoResultData error " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadAlgoResultDataInScope";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.remote.upload.Uploader$uploadAlgoResultDataInScope$2", f = "Uploader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return Uploader.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IUploader.DefaultImpls.uploadAlgoResultData$default(Uploader.this, null, 1, null);
            return Unit.INSTANCE;
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
        public final String invoke() {
            return "uploadAll isSyncDataEnable false";
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
        public final String invoke() {
            return "uploadClickSpo2s isSyncDataEnable false";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "it", "Lcom/huami/bloodoxygen/core/remote/api/event/EventItem;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function1<ClickMeasuredSpo2, EventItem> {
        public n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EventItem invoke(@NotNull ClickMeasuredSpo2 clickMeasuredSpo2) {
            clickMeasuredSpo2.setAppName(Uploader.this.appName);
            clickMeasuredSpo2.setUploaded(true);
            EventItem eventItemD = Uploader.this.d(clickMeasuredSpo2);
            eventItemD.setSubType(BloodOxygen.SubType.CLICK.getString());
            eventItemD.setUtcTimestamp(clickMeasuredSpo2.getUtcTimestamp());
            eventItemD.setTimeZoneId(clickMeasuredSpo2.getTimeZoneId());
            return eventItemD;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<List<? extends ClickMeasuredSpo2>, Unit> {

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
            public final String invoke() {
                return "uploadClickSpo2s isSuccess " + this.a;
            }
        }

        public o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ClickMeasuredSpo2> list) {
            invoke2((List<ClickMeasuredSpo2>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<ClickMeasuredSpo2> list) {
            Uploader.this.h(new a(list));
            Uploader.this.repo.addLocalClickSpo2s(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadOdis isSyncDataEnable false";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", "it", "Lcom/huami/bloodoxygen/core/remote/api/event/EventItem;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function1<Odi, EventItem> {
        public q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EventItem invoke(@NotNull Odi odi) {
            odi.setUploaded(true);
            return new EventItem("blood_oxygen", BloodOxygen.SubType.ODI.getString(), odi.getUserId(), odi.getUtcTimestamp(), null, odi.getTimeZoneId(), false, null, odi.getOdTimes(), odi.getCost(), odi.getOdi(), odi.getDeviceSource(), odi.getValid(), odi.getDeviceId(), odi.getSn(), Uploader.this.appName, odi.getVersion(), odi.getScore(), odi.getDispCode(), 208, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function1<List<? extends Odi>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<Odi> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<Odi> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "uploadOdis isSuccess " + this.a;
            }
        }

        public r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Odi> list) {
            invoke2((List<Odi>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<Odi> list) {
            Uploader.this.h(new a(list));
            Uploader.this.repo.addLocalOdis(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadOriginOsaEvents error " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadOriginOsaEventsAndUpdateDb isSuccess(" + this.a + "))";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadOriginOsaEventsAndUpdateDb error " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadOriginOsaProcesses error " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadOriginOsaProcessesAndUpdateDb isSuccess(" + this.a + "))";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadOriginOsaProcessesAndUpdateDb error " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function0<String> {
        public static final y a = new y();

        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadOsaEvents isSyncDataEnable false";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/entity/OsaEvent;", "it", "Lcom/huami/bloodoxygen/core/remote/api/event/EventItem;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z extends Lambda implements Function1<OsaEvent, EventItem> {
        public z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EventItem invoke(@NotNull OsaEvent osaEvent) {
            osaEvent.setAppName(Uploader.this.appName);
            osaEvent.setUploaded(true);
            EventItem eventItemD = Uploader.this.d(osaEvent);
            eventItemD.setSubType(BloodOxygen.SubType.OSA_EVENT.getString());
            eventItemD.setUtcTimestamp(osaEvent.getUtcTimestamp());
            eventItemD.setTimeZoneId(osaEvent.getTimeZoneId());
            return eventItemD;
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        o = iAvailableProcessors;
        p = ExecutorsKt.from(Executors.newFixedThreadPool(kotlin.ranges.e.coerceAtLeast(64, iAvailableProcessors)));
    }

    public Uploader(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull FileAccessApi fileAccessApi, @NotNull IBloodOxygenRepo iBloodOxygenRepo, @NotNull BloodOxygenCoroutineScope bloodOxygenCoroutineScope, @NotNull Function0<Boolean> function0) {
        this.context = context;
        this.appName = str;
        this.userId = str2;
        this.fileAccessApi = fileAccessApi;
        this.repo = iBloodOxygenRepo;
        this.scope = bloodOxygenCoroutineScope;
        this.isSyncDataEnable = function0;
    }

    private final void a() {
        kotlinx.coroutines.e.f(this.scope, p, null, new Uploader$collectClickSpo2$1(this, null), 2, null);
    }

    private final void b() {
        kotlinx.coroutines.e.f(this.scope, p, null, new Uploader$collectOriginOsaEvent$1(this, null), 2, null);
    }

    private final void c() {
        kotlinx.coroutines.e.f(this.scope, p, null, new Uploader$collectOriginOsaProcess$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EventItem d(Object it2) {
        EventItem eventItem = new EventItem(null, null, null, 0L, null, null, false, null, 0, 0L, 0.0f, 0, 0, null, null, null, null, 0, 0, 524287, null);
        eventItem.setEventType("blood_oxygen");
        eventItem.setUserId(this.userId);
        eventItem.setExtra(new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create().toJson(it2));
        return eventItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<ClickMeasuredSpo2>> e() {
        return (Flow) this.clickSpo2Flow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<OriginOsaEvent>> f() {
        return (Flow) this.originOsaEventFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<OriginOsaProcess>> g() {
        return (Flow) this.originOsaProcessFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Function0<String> messageCollector) {
        HMLog.info(l, messageCollector);
    }

    private final boolean i(List<EventItem> events) {
        Object objM3845constructorimpl;
        if (events == null || events.isEmpty()) {
            return true;
        }
        try {
            h(new e(events));
        } catch (OutOfMemoryError unused) {
            h(new f(events));
        }
        try {
            Result.Companion companion = Result.Companion;
            if (this.repo.uploadEvents(events)) {
                return true;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            h(new g(thM3848exceptionOrNullimpl));
        }
        return false;
    }

    private final <T> boolean j(List<? extends T> list, Function1<? super T, EventItem> function1, Function1<? super List<? extends T>, Unit> function2) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        for (List list2 : CollectionsKt___CollectionsKt.chunked(list, 300)) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(function1.invoke(it2.next()));
            }
            if (!i(arrayList)) {
                return false;
            }
            function2.invoke(list2);
        }
        return true;
    }

    private final boolean k(List<OriginOsaEvent> originOsaEvents) throws Throwable {
        if (originOsaEvents.isEmpty()) {
            return true;
        }
        long j2 = 1000;
        long utcTimestamp = ((OriginOsaEvent) CollectionsKt.first((List) originOsaEvents)).getUtcTimestamp() / j2;
        long utcTimestamp2 = ((OriginOsaEvent) CollectionsKt.last((List) originOsaEvents)).getUtcTimestamp() / j2;
        String str = utcTimestamp + "_" + utcTimestamp2 + "_od.csv";
        FileUtils fileUtils = FileUtils.INSTANCE;
        String strWriteToCsvOriginOsaEvent = fileUtils.writeToCsvOriginOsaEvent(originOsaEvents, this.context, str);
        if (strWriteToCsvOriginOsaEvent == null) {
            return false;
        }
        try {
            try {
                FileUrlEntity fileInfo = this.fileAccessApi.getFileInfo(new FileInfoEntity(str, FileAccessApi.FILE_TYPE_OSA_EVENT, new OsaData(utcTimestamp, utcTimestamp2, new Extra(((OriginOsaEvent) CollectionsKt.first((List) originOsaEvents)).getAppName(), ((OriginOsaEvent) CollectionsKt.first((List) originOsaEvents)).getDeviceSource(), ((OriginOsaEvent) CollectionsKt.first((List) originOsaEvents)).getSn(), ((OriginOsaEvent) CollectionsKt.first((List) originOsaEvents)).getDeviceId()))));
                String putURI = fileInfo == null ? null : fileInfo.getPutURI();
                if (putURI == null) {
                    fileUtils.deleteFile(strWriteToCsvOriginOsaEvent);
                    return false;
                }
                try {
                    try {
                        boolean zUpload = this.fileAccessApi.upload(putURI, strWriteToCsvOriginOsaEvent);
                        fileUtils.deleteFile(strWriteToCsvOriginOsaEvent);
                        return zUpload;
                    } catch (Exception e2) {
                        e = e2;
                        HMLog.info(l, new s(e));
                        FileUtils.INSTANCE.deleteFile(strWriteToCsvOriginOsaEvent);
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    FileUtils.INSTANCE.deleteFile(strWriteToCsvOriginOsaEvent);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                HMLog.info(l, new s(e));
                FileUtils.INSTANCE.deleteFile(strWriteToCsvOriginOsaEvent);
                return false;
            } catch (Throwable th2) {
                th = th2;
                FileUtils.INSTANCE.deleteFile(strWriteToCsvOriginOsaEvent);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l(List<OriginOsaEvent> list) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            for (OriginOsaEvent originOsaEvent : list) {
                originOsaEvent.setAppName(this.appName);
                originOsaEvent.setUploaded(true);
            }
            boolean zK = k(list);
            h(new t(zK));
            if (zK) {
                this.repo.addLocalOriginOsaEvents(list);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(zK));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            h(new u(thM3848exceptionOrNullimpl));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    private final boolean m(List<OriginOsaProcess> originOsaProcesses) throws Throwable {
        if (originOsaProcesses.isEmpty()) {
            return true;
        }
        long j2 = 1000;
        long utcTimestamp = ((OriginOsaProcess) CollectionsKt.first((List) originOsaProcesses)).getUtcTimestamp() / j2;
        long utcTimestamp2 = ((OriginOsaProcess) CollectionsKt.last((List) originOsaProcesses)).getUtcTimestamp() / j2;
        String str = utcTimestamp + "_" + utcTimestamp2 + "_osa.csv";
        FileUtils fileUtils = FileUtils.INSTANCE;
        String strWriteToCsvOriginOsaProcess = fileUtils.writeToCsvOriginOsaProcess(originOsaProcesses, this.context, str);
        if (strWriteToCsvOriginOsaProcess == null) {
            return false;
        }
        try {
            try {
                FileUrlEntity fileInfo = this.fileAccessApi.getFileInfo(new FileInfoEntity(str, FileAccessApi.FILE_TYPE_OSA_PROCESS, new OsaData(utcTimestamp, utcTimestamp2, new Extra(((OriginOsaProcess) CollectionsKt.first((List) originOsaProcesses)).getAppName(), ((OriginOsaProcess) CollectionsKt.first((List) originOsaProcesses)).getDeviceSource(), ((OriginOsaProcess) CollectionsKt.first((List) originOsaProcesses)).getSn(), ((OriginOsaProcess) CollectionsKt.first((List) originOsaProcesses)).getDeviceId()))));
                String putURI = fileInfo == null ? null : fileInfo.getPutURI();
                if (putURI == null) {
                    fileUtils.deleteFile(strWriteToCsvOriginOsaProcess);
                    return false;
                }
                try {
                    try {
                        boolean zUpload = this.fileAccessApi.upload(putURI, strWriteToCsvOriginOsaProcess);
                        fileUtils.deleteFile(strWriteToCsvOriginOsaProcess);
                        return zUpload;
                    } catch (Exception e2) {
                        e = e2;
                        HMLog.info(l, new v(e));
                        FileUtils.INSTANCE.deleteFile(strWriteToCsvOriginOsaProcess);
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    FileUtils.INSTANCE.deleteFile(strWriteToCsvOriginOsaProcess);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                HMLog.info(l, new v(e));
                FileUtils.INSTANCE.deleteFile(strWriteToCsvOriginOsaProcess);
                return false;
            } catch (Throwable th2) {
                th = th2;
                FileUtils.INSTANCE.deleteFile(strWriteToCsvOriginOsaProcess);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(List<OriginOsaProcess> list) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            for (OriginOsaProcess originOsaProcess : list) {
                originOsaProcess.setAppName(this.appName);
                originOsaProcess.setUploaded(true);
            }
            boolean zM = m(list);
            h(new w(zM));
            if (zM) {
                this.repo.addLocalOriginOsaProcesses(list);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(zM));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            h(new x(thM3848exceptionOrNullimpl));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    @Override // com.huami.bloodoxygen.core.remote.upload.IUploader
    public void register() {
        a();
        b();
        c();
        uploadAlgoResultDataInScope();
    }

    @Override // com.huami.bloodoxygen.core.remote.upload.IUploader
    public void unregister() {
        JobKt__JobKt.j(p, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    @Override // com.huami.bloodoxygen.core.remote.upload.IUploader
    public synchronized boolean uploadAlgoResultData(@Nullable String date) {
        Object objM3845constructorimpl;
        try {
            boolean z2 = true;
            if (!this.isSyncDataEnable.invoke().booleanValue()) {
                h(h.a);
                return true;
            }
            try {
                Result.Companion companion = Result.Companion;
                if (date != null) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (OsaEvent osaEvent : this.repo.getLocalOsaEventBySleepDate(date)) {
                        if (osaEvent.getToDelete()) {
                            arrayList2.add(osaEvent);
                        } else if (!osaEvent.getUploaded()) {
                            arrayList.add(osaEvent);
                        }
                    }
                    long jYMDToTimestamp = ExtensionKt.yMDToTimestamp(date);
                    List<Odi> localOdis = this.repo.getLocalOdis(jYMDToTimestamp, jYMDToTimestamp);
                    if (!this.repo.deleteOsaEvents(arrayList2) || !uploadOsaEvents(arrayList) || !uploadOdis(localOdis)) {
                        z2 = false;
                    }
                } else if (!IDataCacheDelegate.DefaultImpls.deleteOsaEvents$default(this.repo, null, 1, null) || !uploadOsaEvents(this.repo.getLocalOsaEventShouldUpload()) || !uploadOdis(this.repo.getLocalOdiShouldUpload())) {
                    z2 = false;
                }
                objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(z2));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                h(new i(thM3848exceptionOrNullimpl));
                objM3845constructorimpl = Boolean.FALSE;
            }
            return ((Boolean) objM3845constructorimpl).booleanValue();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.huami.bloodoxygen.core.remote.upload.IUploader
    public void uploadAlgoResultDataInScope() {
        HMLog.info(l, j.a);
        kotlinx.coroutines.e.f(this.scope, p, null, new k(null), 2, null);
    }

    @Override // com.huami.bloodoxygen.core.remote.upload.IUploader
    public boolean uploadAll() {
        if (this.isSyncDataEnable.invoke().booleanValue()) {
            return IUploader.DefaultImpls.uploadAlgoResultData$default(this, null, 1, null) && uploadClickSpo2s(this.repo.getLocalClickSpo2ShouldUpload()) && n(this.repo.getLocalOriginOsaProcessShouldUpload()) && l(this.repo.getLocalOriginOsaEventShouldUpload());
        }
        h(l.a);
        return true;
    }

    @Override // com.huami.bloodoxygen.core.remote.upload.IUploader
    public boolean uploadClickSpo2s(@NotNull List<ClickMeasuredSpo2> list) {
        if (this.isSyncDataEnable.invoke().booleanValue()) {
            return j(list, new n(), new o());
        }
        h(m.a);
        return false;
    }

    @Override // com.huami.bloodoxygen.core.remote.upload.IUploader
    public boolean uploadOdis(@NotNull List<Odi> list) {
        if (this.isSyncDataEnable.invoke().booleanValue()) {
            return j(list, new q(), new r());
        }
        h(p.a);
        return false;
    }

    @Override // com.huami.bloodoxygen.core.remote.upload.IUploader
    public boolean uploadOsaEvents(@NotNull List<OsaEvent> list) {
        if (this.isSyncDataEnable.invoke().booleanValue()) {
            return j(list, new z(), new a0(list));
        }
        h(y.a);
        return false;
    }
}
