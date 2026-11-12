package com.huami.assistant.ui.v2.repo;

import android.content.Context;
import com.amap.api.mapcore.util.hl;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huami.assistant.ui.v2.db.ScheduleDataBase;
import com.huami.assistant.ui.v2.db.dao.ScheduleDao;
import com.huami.assistant.ui.v2.model.ScheduleModel;
import com.huami.assistant.ui.v2.model.ScheduleSource;
import com.huami.assistant.ui.v2.usecase.LunarDataUseCase;
import com.huami.assistant.ui.v2.util.ScheduleIdUtil;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 .2\u00020\u0001:\u0003./0B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\f\u0010\u0019\u001a\u00020\u0006*\u00020\u0014H\u0002J\u0006\u0010\u001a\u001a\u00020\tJ\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\tR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010(\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010)R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010)¨\u00061"}, d2 = {"Lcom/huami/assistant/ui/v2/repo/LunarRepo;", "Lcom/huami/http/HttpKit;", "Ljava/util/Date;", "date", "", "f", "", "h", "i", "", "a", "year", hl.k, "url", "", "Lcom/huami/assistant/ui/v2/model/ScheduleModel;", z.j, "Lokhttp3/Response;", AbstractJSONTokenResponse.RESPONSE, "l", "Ljava/util/Calendar;", "cal", "", "c", "b", "g", "initYearLunar", "isUpdateDeviceLunarData", "updateDbAlertTime", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/text/SimpleDateFormat;", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Ljava/text/SimpleDateFormat;", "dateFormat", "Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "e", "()Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "scheduleDao", "Ljava/lang/String;", "lunarUrl", "jiqiUrl", "<init>", "(Landroid/content/Context;)V", "Companion", "Jieqi", "LunarDate", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class LunarRepo implements HttpKit {

    @NotNull
    private static final String f = "LunarRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy dateFormat = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy scheduleDao = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String lunarUrl = "/calendar/festivals?countryRegionCode=CN&year=%s&calendarType=lunar";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String jiqiUrl = "/calendar/terms?countryRegionCode=CN&year=%s";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/huami/assistant/ui/v2/repo/LunarRepo$Jieqi;", "", "", "toString", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "b", "getDate", "date", "<init>", "(Lcom/huami/assistant/ui/v2/repo/LunarRepo;Ljava/lang/String;Ljava/lang/String;)V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public final class Jieqi {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName(FirebaseAnalytics.Param.TERM)
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("date")
        @NotNull
        private final String date;

        public Jieqi(@NotNull String str, String str2) {
            this.name = str;
            this.date = str2;
        }

        @NotNull
        public final String getDate() {
            return this.date;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public String toString() {
            return "Jieqi<date:" + this.date + ", name:" + this.name + SearchCriteria.GT;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\b\u0080\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\t\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0014\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001c\u0010\u0017\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u001c\u0010\u001a\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/huami/assistant/ui/v2/repo/LunarRepo$LunarDate;", "", "", "toString", "", "a", "J", "getRequestTimestampInMs", "()J", "requestTimestampInMs", "b", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "type", "c", "getName", "name", GoogleApiAvailabilityLight.a, "getDate", "date", "e", "getPriority", "priority", "f", "getSolarDate", "solarDate", "<init>", "(Lcom/huami/assistant/ui/v2/repo/LunarRepo;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public final class LunarDate {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("requestTimestampInMs")
        private final long requestTimestampInMs;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @SerializedName("date")
        @NotNull
        private final String date;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @SerializedName("priority")
        @NotNull
        private final String priority;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @SerializedName("solarDate")
        @NotNull
        private final String solarDate;

        public LunarDate(@NotNull long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5) {
            this.requestTimestampInMs = j;
            this.type = str;
            this.name = str2;
            this.date = str3;
            this.priority = str4;
            this.solarDate = str5;
        }

        @NotNull
        public final String getDate() {
            return this.date;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getPriority() {
            return this.priority;
        }

        public final long getRequestTimestampInMs() {
            return this.requestTimestampInMs;
        }

        @NotNull
        public final String getSolarDate() {
            return this.solarDate;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        @NotNull
        public String toString() {
            return "LunarDate<date:" + this.date + ", name:" + this.name + SearchCriteria.GT;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/text/SimpleDateFormat;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SimpleDateFormat> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
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
            return "load lunar from web fail:" + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<? extends Object> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "result ==> " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<ScheduleDao> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduleDao invoke() {
            return ScheduleDataBase.INSTANCE.getInstance(LunarRepo.this.context).scheduleDao();
        }
    }

    public LunarRepo(@NotNull Context context) {
        this.context = context;
    }

    private final void a() {
        List<ScheduleModel> listQueryLunar = e().queryLunar();
        int i = Calendar.getInstance().get(1);
        for (ScheduleModel scheduleModel : listQueryLunar) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(scheduleModel.getStartTime() * ((long) 1000));
            if (calendar.get(1) < i) {
                e().delete(scheduleModel);
            }
        }
    }

    private final long b(Calendar cal) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, cal.get(1));
        calendar.set(2, cal.get(2));
        calendar.set(5, cal.get(5));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis() / ((long) 1000);
    }

    private final long c(Calendar cal) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, cal.get(1));
        calendar.set(2, cal.get(2));
        calendar.set(5, cal.get(5));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() / ((long) 1000);
    }

    private final SimpleDateFormat d() {
        return (SimpleDateFormat) this.dateFormat.getValue();
    }

    private final ScheduleDao e() {
        return (ScheduleDao) this.scheduleDao.getValue();
    }

    private final String f(Date date) {
        return new SimpleDateFormat("yyyy", Locale.CHINA).format(date);
    }

    private final boolean g(Calendar calendar) {
        return calendar.get(1) < Calendar.getInstance().get(1);
    }

    private final boolean h() {
        if (!LunarDataUseCase.INSTANCE.isSupportLunar()) {
            return false;
        }
        ScheduleModel scheduleModel = (ScheduleModel) CollectionsKt.lastOrNull((List) e().queryLunar());
        if (scheduleModel == null) {
            return true;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(scheduleModel.getStartTime() * ((long) 1000));
        return g(calendar);
    }

    private final boolean i() {
        if (!LunarDataUseCase.INSTANCE.isSupportLunar()) {
            return false;
        }
        ScheduleModel scheduleModel = (ScheduleModel) CollectionsKt.lastOrNull((List) e().queryLunar());
        if (scheduleModel != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(scheduleModel.getStartTime() * ((long) 1000));
            int i = calendar.get(1);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(6, 30);
            if (i >= calendar2.get(1)) {
                return false;
            }
        }
        return true;
    }

    private final List<ScheduleModel> j(String url) {
        try {
            if ((url.length() > 0 ? url : null) == null) {
                return null;
            }
            return l(url, HttpKitKtxKt.httpGet$default(this, url, null, null, 6, null));
        } catch (Exception e) {
            HMLog.info(f, new b(e));
            return null;
        }
    }

    private final void k(String year) {
        ArrayList arrayList = new ArrayList();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        List<ScheduleModel> listJ = j(String.format(this.lunarUrl, Arrays.copyOf(new Object[]{year}, 1)));
        if (listJ != null) {
            arrayList.addAll(listJ);
        }
        List<ScheduleModel> listJ2 = j(String.format(this.jiqiUrl, Arrays.copyOf(new Object[]{year}, 1)));
        if (listJ2 != null) {
            arrayList.addAll(listJ2);
        }
        e().insertOrUpdate(arrayList);
    }

    private final List<ScheduleModel> l(String url, Response response) throws HttpError {
        List list;
        String solarDate;
        String name;
        Calendar calendar;
        if (!response.isSuccessful()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) "terms", false, 2, (Object) null)) {
            ConverterKt.checkToken(response, ConverterKt.responseToJsonStr(response));
            if (!response.isSuccessful()) {
                throw new HttpError(response);
            }
            ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            list = (List) converter.convert(responseBodyBody, new TypeToken<List<? extends Jieqi>>() { // from class: com.huami.assistant.ui.v2.repo.LunarRepo$parseSuccessResponse$$inlined$deserializeOrThrow$1
            }.getType());
        } else {
            if (!StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) "festivals", false, 2, (Object) null)) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            ConverterKt.checkToken(response, ConverterKt.responseToJsonStr(response));
            if (!response.isSuccessful()) {
                throw new HttpError(response);
            }
            ResponseBodyConverter converter2 = HttpKitContext.INSTANCE.getConverter();
            ResponseBody responseBodyBody2 = response.body();
            if (responseBodyBody2 == null) {
                Intrinsics.throwNpe();
            }
            list = (List) converter2.convert(responseBodyBody2, new TypeToken<List<? extends LunarDate>>() { // from class: com.huami.assistant.ui.v2.repo.LunarRepo$parseSuccessResponse$$inlined$deserializeOrThrow$2
            }.getType());
        }
        int iLoadChineseCalRemindTime = SettingRepo.INSTANCE.loadChineseCalRemindTime();
        HMLog.info(f, new c(list));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            boolean z = obj instanceof Jieqi;
            if (z) {
                solarDate = ((Jieqi) obj).getDate();
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                solarDate = ((LunarDate) obj).getSolarDate();
            }
            if (z) {
                name = ((Jieqi) obj).getName();
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                name = ((LunarDate) obj).getName();
            }
            String str = name;
            Date date = d().parse(solarDate);
            Long lValueOf = date == null ? null : Long.valueOf(date.getTime());
            if (lValueOf == null) {
                calendar = null;
            } else {
                lValueOf.longValue();
                calendar = Calendar.getInstance();
                calendar.setTimeInMillis(lValueOf.longValue());
            }
            ScheduleModel scheduleModel = calendar == null ? null : new ScheduleModel(ScheduleIdUtil.INSTANCE.generateId(), str, null, c(calendar), b(calendar), iLoadChineseCalRemindTime, null, 0L, true, null, ScheduleSource.LUNAR.INSTANCE, 0L, null, 6852, null);
            if (scheduleModel != null) {
                arrayList.add(scheduleModel);
            }
        }
        return arrayList;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    public final void initYearLunar() {
        if (h()) {
            k(f(new Date()));
        }
        if (i()) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(1, 1);
            k(f(calendar.getTime()));
        }
        a();
    }

    public final boolean isUpdateDeviceLunarData() {
        return h() || i();
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    public final void updateDbAlertTime() {
        List<ScheduleModel> listQueryLunar = e().queryLunar();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listQueryLunar, 10));
        for (ScheduleModel scheduleModel : listQueryLunar) {
            scheduleModel.setAlertTime(SettingRepo.INSTANCE.loadChineseCalRemindTime());
            arrayList.add(scheduleModel);
        }
        e().insertOrUpdate(arrayList);
    }
}
