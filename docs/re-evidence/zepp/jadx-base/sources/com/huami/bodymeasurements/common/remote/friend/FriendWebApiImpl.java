package com.huami.bodymeasurements.common.remote.friend;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bodymeasurements.common.remote.friend.bean.FriendDataItem;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.tools.log.HMLog;
import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002Js\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015\"\b\b\u0000\u0010\b*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00038\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/bodymeasurements/common/remote/friend/FriendWebApiImpl;", "Lcom/huami/bodymeasurements/common/remote/friend/FriendWebApi;", "Lcom/huami/http/HttpKit;", "", "userId", "dataType", "a", "", ExifInterface.GPS_DIRECTION_TRUE, "eventType", "subType", "", "from", "to", "", "limit", "", "reverse", "appName", "Ljava/lang/reflect/Type;", "type", "Lcom/huami/bodymeasurements/common/remote/friend/bean/FriendDataItem;", "getFriendCommonData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/reflect/Type;)Lcom/huami/bodymeasurements/common/remote/friend/bean/FriendDataItem;", "Ljava/lang/String;", "tag", "<init>", "()V", "common_release"}, k = 1, mv = {1, 5, 1})
public final class FriendWebApiImpl implements FriendWebApi, HttpKit {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "FriendWebApiImpl";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getFriendCommonData throwable::", this.a);
        }
    }

    private final String a(String userId, String dataType) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(FriendConstants.Path.FRIEND_COMMON_DATA, Arrays.copyOf(new Object[]{userId, dataType}, 2));
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.bodymeasurements.common.remote.friend.FriendWebApi
    @Nullable
    public <T> FriendDataItem<T> getFriendCommonData(@NotNull String userId, @NotNull String dataType, @NotNull String eventType, @NotNull String subType, long from, long to, int limit, @Nullable Boolean reverse, @NotNull String appName, @NotNull Type type) {
        Object objM3845constructorimpl;
        Object objM3845constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, a(userId, dataType), r.hashMapOf(TuplesKt.to("eventType", eventType), TuplesKt.to("subType", subType), TuplesKt.to(FriendConstants.Param.FROM_DATE, String.valueOf(from)), TuplesKt.to("toDate", String.valueOf(to)), TuplesKt.to("limit", String.valueOf(limit)), TuplesKt.to("reverse", String.valueOf(reverse)), TuplesKt.to("sub", "DAY"), TuplesKt.to("appName", appName)), null, 4, null);
            try {
                ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
                if (responseHttpGet$default.isSuccessful()) {
                    objM3845constructorimpl2 = HttpKitContext.INSTANCE.getConverter().convert(responseHttpGet$default.body(), type);
                } else {
                    objM3845constructorimpl2 = Result.m3845constructorimpl(null);
                    if (Result.m3850isFailureimpl(objM3845constructorimpl2)) {
                        objM3845constructorimpl2 = null;
                    }
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            objM3845constructorimpl = Result.m3845constructorimpl((FriendDataItem) objM3845constructorimpl2);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(this.tag, null, null, new a(thM3848exceptionOrNullimpl), 6, null);
        }
        return (FriendDataItem) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }
}
