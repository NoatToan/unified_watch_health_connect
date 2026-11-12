package com.huami.assistant.ui.v2.repo;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.Time;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huami.assistant.ui.v2.db.ScheduleDataBase;
import com.huami.assistant.ui.v2.db.dao.VocationDayDao;
import com.huami.assistant.ui.v2.model.ScheduleRepeatMode;
import com.huami.assistant.ui.v2.model.VocationDayModel;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002*+B\u0015\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b(\u0010)J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0016\u0010\u0010\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e*\u00060\u0011R\u00020\u0000H\u0002J\b\u0010\u0013\u001a\u00020\bH\u0007J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nR\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#R\u001f\u0010'\u001a\u0004\u0018\u00010%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b!\u0010&¨\u0006,"}, d2 = {"Lcom/huami/assistant/ui/v2/repo/WorkDayRepo;", "Lcom/huami/http/HttpKit;", "", "amount", "", "f", "", "year", "", "b", "Ljava/util/Calendar;", "cal", "e", "", "Lcom/huami/assistant/ui/v2/model/VocationDayModel;", "list", "a", "Lcom/huami/assistant/ui/v2/repo/WorkDayRepo$VocationModel;", "h", PointCategory.INIT, "containRestDay", "containUnRestDay", "isWorkDay", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "Ljava/lang/ref/WeakReference;", "contextReference", "", "Ljava/util/Set;", "mRestDays", "c", "mNotRestDays", "Ljava/text/SimpleDateFormat;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Ljava/text/SimpleDateFormat;", "mDateFormat", "Lcom/huami/assistant/ui/v2/db/dao/VocationDayDao;", "()Lcom/huami/assistant/ui/v2/db/dao/VocationDayDao;", "vocationDayDao", "<init>", "(Ljava/lang/ref/WeakReference;)V", "Companion", "VocationModel", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class WorkDayRepo implements HttpKit {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String f = "WorkDayRepo";

    @Nullable
    private static WorkDayRepo g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WeakReference<Context> contextReference;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Set<VocationDayModel> mRestDays = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Set<VocationDayModel> mNotRestDays = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDateFormat = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy vocationDayDao = LazyKt__LazyJVMKt.lazy(new d());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/assistant/ui/v2/repo/WorkDayRepo$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/assistant/ui/v2/repo/WorkDayRepo;", "getInstance", "", "TAG", "Ljava/lang/String;", DefaultSettingsSpiCall.n, "Lcom/huami/assistant/ui/v2/repo/WorkDayRepo;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WorkDayRepo getInstance(@NotNull Context context) {
            if (WorkDayRepo.g == null) {
                synchronized (Reflection.getOrCreateKotlinClass(WorkDayRepo.class)) {
                    if (WorkDayRepo.g == null) {
                        Companion companion = WorkDayRepo.INSTANCE;
                        WorkDayRepo.g = new WorkDayRepo(new WeakReference(context));
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return WorkDayRepo.g;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\t\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0015\u001a\u00020\u00128\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/huami/assistant/ui/v2/repo/WorkDayRepo$VocationModel;", "", "", "toString", "", "a", "J", "getRequestTimestampInMs", "()J", "requestTimestampInMs", "b", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "c", "getYear", "year", "", GoogleApiAvailabilityLight.a, "Z", "isVocation", "()Z", "e", "getDate", "date", "<init>", "(Lcom/huami/assistant/ui/v2/repo/WorkDayRepo;JLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public final class VocationModel {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("requestTimestampInMs")
        private final long requestTimestampInMs;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("country_region_code")
        @NotNull
        private final String code;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("year")
        @NotNull
        private final String year;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @SerializedName("is_vocation")
        private final boolean isVocation;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @SerializedName("date")
        @NotNull
        private final String date;

        public VocationModel(@NotNull long j, @NotNull String str, String str2, @NotNull boolean z, String str3) {
            this.requestTimestampInMs = j;
            this.code = str;
            this.year = str2;
            this.isVocation = z;
            this.date = str3;
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }

        @NotNull
        public final String getDate() {
            return this.date;
        }

        public final long getRequestTimestampInMs() {
            return this.requestTimestampInMs;
        }

        @NotNull
        public final String getYear() {
            return this.year;
        }

        /* JADX INFO: renamed from: isVocation, reason: from getter */
        public final boolean getIsVocation() {
            return this.isVocation;
        }

        @NotNull
        public String toString() {
            return this.year + this.date;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<VocationModel> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<VocationModel> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "all rest day:" + TextUtils.join(",", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "load vocation from web fail:" + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/text/SimpleDateFormat;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<SimpleDateFormat> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyyMMdd", Locale.CHINA);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/db/dao/VocationDayDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<VocationDayDao> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VocationDayDao invoke() {
            Context context = (Context) WorkDayRepo.this.contextReference.get();
            if (context == null) {
                return null;
            }
            return ScheduleDataBase.INSTANCE.getInstance(context).vocationDayDao();
        }
    }

    public WorkDayRepo(@NotNull WeakReference<Context> weakReference) {
        this.contextReference = weakReference;
    }

    private final void a(List<VocationDayModel> list) {
        VocationDayDao vocationDayDaoD;
        int i = Calendar.getInstance().get(1);
        for (VocationDayModel vocationDayModel : list) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(vocationDayModel.getDate());
            if (calendar.get(1) < i && (vocationDayDaoD = d()) != null) {
                vocationDayDaoD.deleteById(vocationDayModel.getId());
            }
        }
    }

    private final void b(String year) {
        try {
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, "/calendar/vocation?countryRegionCode=CN&year=" + year, null, null, 6, null);
            if (responseHttpGet$default.isSuccessful()) {
                ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
                if (!responseHttpGet$default.isSuccessful()) {
                    throw new HttpError(responseHttpGet$default);
                }
                ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                ResponseBody responseBodyBody = responseHttpGet$default.body();
                if (responseBodyBody == null) {
                    Intrinsics.throwNpe();
                }
                List list = (List) converter.convert(responseBodyBody, new TypeToken<List<? extends VocationModel>>() { // from class: com.huami.assistant.ui.v2.repo.WorkDayRepo$fetchYearVocation$$inlined$deserializeOrThrow$1
                }.getType());
                VocationDayDao vocationDayDaoD = d();
                if (vocationDayDaoD != null) {
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(h((VocationModel) it2.next()));
                    }
                    vocationDayDaoD.insertOrUpdate(arrayList);
                }
                HMLog.info(f, new a(list));
            }
        } catch (Exception e) {
            HMLog.info(f, new b(e));
        }
    }

    private final SimpleDateFormat c() {
        return (SimpleDateFormat) this.mDateFormat.getValue();
    }

    private final VocationDayDao d() {
        return (VocationDayDao) this.vocationDayDao.getValue();
    }

    private final String e(Calendar cal) {
        return new SimpleDateFormat("yyyy", Locale.CHINA).format(cal.getTime());
    }

    private final boolean f(int amount) {
        boolean zIsSupportWorkDay = ScheduleRepeatMode.INSTANCE.isSupportWorkDay();
        if (!zIsSupportWorkDay) {
            if (zIsSupportWorkDay) {
                throw new NoWhenBranchMatchedException();
            }
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, amount);
        Unit unit = Unit.INSTANCE;
        String strE = e(calendar);
        VocationDayDao vocationDayDaoD = d();
        List<VocationDayModel> yearData = vocationDayDaoD == null ? null : vocationDayDaoD.getYearData(strE);
        if (yearData == null) {
            return true;
        }
        return yearData.isEmpty();
    }

    public static /* synthetic */ boolean g(WorkDayRepo workDayRepo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return workDayRepo.f(i);
    }

    private final VocationDayModel h(VocationModel vocationModel) {
        long requestTimestampInMs = vocationModel.getRequestTimestampInMs();
        String code = vocationModel.getCode();
        String year = vocationModel.getYear();
        boolean isVocation = vocationModel.getIsVocation();
        Date date = c().parse(vocationModel.getDate());
        if (date == null) {
            date = new Date();
        }
        return new VocationDayModel(0L, requestTimestampInMs, code, year, isVocation, date, 1, null);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    public final boolean containRestDay(@NotNull Calendar cal) {
        for (Object obj : this.mRestDays) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(((VocationDayModel) obj).getDate());
            if (calendar.get(1) == cal.get(1) && calendar.get(2) == cal.get(2) && calendar.get(5) == cal.get(5)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    public final boolean containUnRestDay(@NotNull Calendar cal) {
        for (Object obj : this.mNotRestDays) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(((VocationDayModel) obj).getDate());
            if (calendar.get(1) == cal.get(1) && calendar.get(2) == cal.get(2) && calendar.get(5) == cal.get(5)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    @WorkerThread
    public final void init() {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (f(i)) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(1, i);
                Unit unit = Unit.INSTANCE;
                b(e(calendar));
            }
            if (i2 > 4) {
                break;
            } else {
                i = i2;
            }
        }
        VocationDayDao vocationDayDaoD = d();
        List<VocationDayModel> all = vocationDayDaoD == null ? null : vocationDayDaoD.getAll();
        if (all == null) {
            return;
        }
        a(all);
        this.mRestDays.clear();
        this.mNotRestDays.clear();
        for (VocationDayModel vocationDayModel : all) {
            if (vocationDayModel.isVocation()) {
                this.mRestDays.add(vocationDayModel);
            } else {
                this.mNotRestDays.add(vocationDayModel);
            }
        }
    }

    public final boolean isWorkDay(@NotNull Calendar cal) {
        Time time = new Time();
        time.set(cal.getTimeInMillis());
        int i = time.weekDay;
        return ((1 <= i && i <= 5) && !containRestDay(cal)) || ((i == 0 || i == 6) && containUnRestDay(cal));
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }
}
