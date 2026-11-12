package com.huami.watch.companion.esim;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/watch/companion/esim/ESimUrlHelper;", "", "<init>", "()V", "Companion", "esim_release"}, k = 1, mv = {1, 5, 1})
public final class ESimUrlHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "ESimUrlHelper";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/watch/companion/esim/ESimUrlHelper$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/watch/companion/esim/ESimUrl;", "getEsimUrl", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "esim_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Response a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Response response) {
                super(0);
                this.a = response;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("response：", this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("rawInfo：", this.a);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ESimUrl getEsimUrl(@NotNull Context context) throws Exception {
            String strString;
            Request requestNewGet = CloudClient.newGet(Intrinsics.stringPlus(Cloud.get().getHost(), "/apps/com.huami.midong/settings?settingName=huami.web.esim&mode=SINGLE"));
            ESimUrl eSimUrl = null;
            try {
                Result.Companion companion = Result.Companion;
                Response responseDoRequest = CloudClient.doRequest(context, requestNewGet);
                HMLog.info(ESimUrlHelper.TAG, new a(responseDoRequest));
                if (responseDoRequest.isSuccessful()) {
                    ResponseBody responseBodyBody = responseDoRequest.body();
                    String str = "";
                    if (responseBodyBody != null && (strString = responseBodyBody.string()) != null) {
                        str = strString;
                    }
                    HMLog.info(ESimUrlHelper.TAG, new b(str));
                    JSONObject jSONObject = new JSONObject(new JSONObject(str).optString("huami.web.esim"));
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("esimNew");
                    if (jSONObjectOptJSONObject == null) {
                        throw new Exception();
                    }
                    String string = jSONObjectOptJSONObject.getString("url");
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("esimCommon");
                    if (jSONObjectOptJSONObject2 == null) {
                        throw new Exception();
                    }
                    String string2 = jSONObjectOptJSONObject2.getString("url");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("esimFaq");
                    if (jSONObject2 == null) {
                        throw new Exception();
                    }
                    eSimUrl = new ESimUrl(string, string2, jSONObject2.getString("url"));
                }
                Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            if (eSimUrl != null) {
                return eSimUrl;
            }
            throw new Exception();
        }
    }
}
