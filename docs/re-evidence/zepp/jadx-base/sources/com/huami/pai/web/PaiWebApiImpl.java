package com.huami.pai.web;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.ext.SerializationKtxKt;
import com.huami.pai.web.bean.FitnessAgeBean;
import com.huami.pai.web.bean.Items;
import com.huami.tools.log.HMLog;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002J$\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0011\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/pai/web/PaiWebApiImpl;", "Lcom/huami/pai/web/IPaiWebApi;", "", "path", "b", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/pai/web/Response;", "Lkotlinx/serialization/KSerializer;", "kSerializer", "Lcom/huami/pai/web/ApiResponse;", "c", "Ljava/util/Date;", "startDate", "endDate", "Lcom/huami/pai/web/bean/Items;", "Lcom/huami/pai/web/bean/FitnessAgeBean;", "loadFitnessAges", "a", "Ljava/lang/String;", "userId", "host", "Lcom/huami/pai/web/HttpInteraction;", "Lcom/huami/pai/web/HttpInteraction;", "httpInteraction", "Lkotlinx/serialization/json/Json;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lkotlinx/serialization/json/Json;", "json", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/pai/web/HttpInteraction;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiWebApiImpl implements IPaiWebApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String host;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HttpInteraction httpInteraction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy json = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/serialization/json/Json;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Json> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Json invoke() {
            return SerializationKtxKt.getNonStrictInstance(Json.INSTANCE);
        }
    }

    public PaiWebApiImpl(@NotNull String str, @NotNull String str2, @NotNull HttpInteraction httpInteraction) {
        this.userId = str;
        this.host = str2;
        this.httpInteraction = httpInteraction;
    }

    private final Json a() {
        return (Json) this.json.getValue();
    }

    private final String b(String path) {
        String strReplace$default = m.replace$default(path, "{userId}", this.userId, false, 4, (Object) null);
        return this.host + strReplace$default;
    }

    private final <T> ApiResponse<T> c(Response response, KSerializer<T> kSerializer) {
        int code = response.getCode();
        boolean z = true;
        if (!(200 <= code && code < 300)) {
            return new ApiErrorResponse(Integer.valueOf(response.getCode()), response.getBody(), response.getError());
        }
        String body = response.getBody();
        if (body != null && !m.isBlank(body)) {
            z = false;
        }
        if (z) {
            return new ApiEmptyResponse();
        }
        try {
            return new ApiSuccessResponse(a().decodeFromString(kSerializer, response.getBody()));
        } catch (Throwable th) {
            HMLog.w("PaiWebApiImpl", th, "PAI模块网络接口json解析发生错误", new Object[0]);
            return new ApiErrorResponse(Integer.valueOf(response.getCode()), response.getBody(), new JsonParseException(th));
        }
    }

    @Override // com.huami.pai.web.IPaiWebApi
    @NotNull
    public ApiResponse<Items<FitnessAgeBean>> loadFitnessAges(@NotNull Date startDate, @NotNull Date endDate) {
        String strB = b(Path.PAI_FITNESS_AGE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        linkedHashMap.put("startDate", simpleDateFormat.format(startDate));
        linkedHashMap.put("endDate", simpleDateFormat.format(endDate));
        linkedHashMap.put("fill", "false");
        return c(this.httpInteraction.get(strB, linkedHashMap), Items.INSTANCE.serializer(FitnessAgeBean.INSTANCE.serializer()));
    }
}
