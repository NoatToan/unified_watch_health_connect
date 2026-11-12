package com.huami.nfc.door;

import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.nfc.base.INfcChannel;
import com.huami.nfc.base.NfcChannelExtensionsKt;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.huami.nfc.door.api.AccessDoorAppletApi;
import com.huami.nfc.door.api.ISnowballAccessDoorApi;
import com.huami.nfc.door.api.LoockAppletApi;
import com.huami.nfc.door.entity.CommunityEntity;
import com.huami.nfc.door.entity.CommunityNameEntity;
import com.huami.nfc.door.entity.IdCardEntity;
import com.huami.nfc.door.entity.RealNameTpye;
import com.huami.nfc.door.entity.VerifyEntity;
import com.huami.nfc.door.service.AccessDoorServer;
import com.huami.nfc.web.ProtocolType;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.nfc.web.server.ProtocolServer;
import com.unionpay.tsmservice.data.Constant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import retrofit2.Response;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0017\u001a\u000200\u0012\u0006\u00104\u001a\u000202\u0012\u0006\u00107\u001a\u000205\u0012\u0006\u0010;\u001a\u000208\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@¢\u0006\u0004\bD\u0010EJ\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\f\u0010\f\u001a\u00020\u000b*\u00020\u0002H\u0002J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004H\u0016J4\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0002H\u0016J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0016J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\u0006\u0010\u000f\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0002H\u0016J5\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b&\u0010'J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\u0006\u0010(\u001a\u00020\u0002H\u0016J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010,\u001a\u00020+H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0002H\u0016R\u0016\u0010\u0017\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lcom/huami/nfc/door/SnowballAccessDoorApi;", "Lcom/huami/nfc/door/api/ISnowballAccessDoorApi;", "", "value", "Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/door/entity/VerifyEntity;", "b", "Lorg/json/JSONObject;", "json", "a", "Lokhttp3/RequestBody;", "c", "query", "Lcom/huami/nfc/door/entity/IdCardEntity;", "info", "verifyByIdCard", "type", "name", "Lcom/huami/nfc/door/entity/CommunityNameEntity;", "getSupportCommunity", "Lcom/huami/nfc/door/NfcTag;", "getNfcTag", "tag", "phoneNum", "districtName", "", "dataType", "install", "aid", "deleteApp", "sessionId", Constant.KEY_CARD_TYPE, "Lcom/huami/nfc/door/DoorCardInfo;", "getCardInfo", "", "updateCardInfo", "bizType", "getCardList", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huami/nfc/base/PayResponse;", "actionType", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "", "id", "agreeProtocol", "installLoock", "deleteLoock", "Lcom/huami/nfc/door/INfcTag;", "Lcom/huami/nfc/door/INfcTag;", "Lcom/huami/nfc/base/INfcChannel;", "Lcom/huami/nfc/base/INfcChannel;", com.tekartik.sqflite.Constant.h, "Lcom/huami/nfc/door/service/AccessDoorServer;", "Lcom/huami/nfc/door/service/AccessDoorServer;", "server", "Lcom/huami/nfc/web/server/ProtocolServer;", GoogleApiAvailabilityLight.a, "Lcom/huami/nfc/web/server/ProtocolServer;", "protocolService", "Lcom/huami/nfc/door/api/AccessDoorAppletApi;", "e", "Lcom/huami/nfc/door/api/AccessDoorAppletApi;", "appletApi", "Lcom/huami/nfc/door/api/LoockAppletApi;", "f", "Lcom/huami/nfc/door/api/LoockAppletApi;", "loockAppletApi", "<init>", "(Lcom/huami/nfc/door/INfcTag;Lcom/huami/nfc/base/INfcChannel;Lcom/huami/nfc/door/service/AccessDoorServer;Lcom/huami/nfc/web/server/ProtocolServer;Lcom/huami/nfc/door/api/AccessDoorAppletApi;Lcom/huami/nfc/door/api/LoockAppletApi;)V", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public final class SnowballAccessDoorApi implements ISnowballAccessDoorApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final INfcTag tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final INfcChannel cmd;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final AccessDoorServer server;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ProtocolServer protocolService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final AccessDoorAppletApi appletApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LoockAppletApi loockAppletApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<PayResponse<? extends String>> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<String> invoke() {
            return SnowballAccessDoorApi.this.appletApi.deleteApp(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<PayResponse<? extends String>> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<String> invoke() {
            return SnowballAccessDoorApi.this.loockAppletApi.deleteLoock(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "", "it", "Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/door/entity/CommunityNameEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Response<ResponseBody>, String, PayResponse<? extends List<CommunityNameEntity>>> {
        public static final c a = new c();

        public c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<List<CommunityNameEntity>> invoke(@NotNull Response<ResponseBody> response, @Nullable String str) {
            if (response.isSuccessful()) {
                int i = 0;
                if (!(str == null || str.length() == 0)) {
                    JSONObject jSONObject = new JSONObject(str);
                    String strOptString = jSONObject.optString("resp_code");
                    String strOptString2 = jSONObject.optString("resp_msg");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resp_data");
                    if (jSONArrayOptJSONArray == null) {
                        return new PayResponse<>(strOptString, strOptString2, null);
                    }
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    if (length > 0) {
                        while (true) {
                            int i2 = i + 1;
                            arrayList.add(new CommunityNameEntity(jSONArrayOptJSONArray.optString(i)));
                            if (i2 >= length) {
                                break;
                            }
                            i = i2;
                        }
                    }
                    return new PayResponse<>(strOptString, strOptString2, arrayList);
                }
            }
            return new PayResponse<>(Intrinsics.stringPlus("http", Integer.valueOf(response.code())), PayResponseKt.getMessage(response, str), null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<PayResponse<? extends String>> {
        public final /* synthetic */ NfcTag b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(NfcTag nfcTag, String str, String str2, int i) {
            super(0);
            this.b = nfcTag;
            this.c = str;
            this.d = str2;
            this.e = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<String> invoke() {
            return SnowballAccessDoorApi.this.appletApi.install(this.b, this.c, this.d, this.e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<PayResponse<? extends String>> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<String> invoke() {
            return SnowballAccessDoorApi.this.loockAppletApi.installLoock();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "", "it", "Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/door/entity/VerifyEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function2<Response<ResponseBody>, String, PayResponse<? extends List<VerifyEntity>>> {
        public f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<List<VerifyEntity>> invoke(@NotNull Response<ResponseBody> response, @Nullable String str) {
            if (response.isSuccessful()) {
                if (!(str == null || str.length() == 0)) {
                    return SnowballAccessDoorApi.this.b(str);
                }
            }
            return new PayResponse<>(Intrinsics.stringPlus("http", Integer.valueOf(response.code())), PayResponseKt.getMessage(response, str), new ArrayList());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<JSONObject, Unit> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        public final void a(@NotNull JSONObject jSONObject) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "", "it", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/door/entity/VerifyEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function2<Response<ResponseBody>, String, PayResponse<? extends VerifyEntity>> {
        public h() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<VerifyEntity> invoke(@NotNull Response<ResponseBody> response, @Nullable String str) {
            if (response.isSuccessful()) {
                if (!(str == null || str.length() == 0)) {
                    JSONObject jSONObject = new JSONObject(str);
                    String strOptString = jSONObject.optString("resp_code");
                    String strOptString2 = jSONObject.optString("resp_msg");
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("resp_data");
                    return jSONObjectOptJSONObject == null ? new PayResponse<>(strOptString, strOptString2, null) : new PayResponse<>(strOptString, strOptString2, SnowballAccessDoorApi.this.a(jSONObjectOptJSONObject));
                }
            }
            return new PayResponse<>(Intrinsics.stringPlus("http", Integer.valueOf(response.code())), PayResponseKt.getMessage(response, str), null);
        }
    }

    public SnowballAccessDoorApi(@NotNull INfcTag iNfcTag, @NotNull INfcChannel iNfcChannel, @NotNull AccessDoorServer accessDoorServer, @NotNull ProtocolServer protocolServer, @NotNull AccessDoorAppletApi accessDoorAppletApi, @NotNull LoockAppletApi loockAppletApi) {
        this.tag = iNfcTag;
        this.cmd = iNfcChannel;
        this.server = accessDoorServer;
        this.protocolService = protocolServer;
        this.appletApi = accessDoorAppletApi;
        this.loockAppletApi = loockAppletApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VerifyEntity a(JSONObject json) {
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("verifyMap");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new VerifyEntity(json.optString("verifyType"), jSONObjectOptJSONObject.optString("cardNo"), jSONObjectOptJSONObject.optString("realName"), Long.valueOf(jSONObjectOptJSONObject.optLong("verifyTime")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PayResponse<List<VerifyEntity>> b(String value) {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject(value);
        String strOptString = jSONObject.optString("resp_code");
        String strOptString2 = jSONObject.optString("resp_msg");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("resp_data");
        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("verifyInfos")) != null) {
            int i = 0;
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i2 = i + 1;
                    VerifyEntity verifyEntityA = a(jSONArrayOptJSONArray.optJSONObject(i));
                    if (verifyEntityA != null) {
                        arrayList.add(verifyEntityA);
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return new PayResponse<>(strOptString, strOptString2, arrayList);
        }
        return new PayResponse<>(strOptString, strOptString2, arrayList);
    }

    private final RequestBody c(String str) {
        return RequestBody.create(MediaType.parse("application/json"), str);
    }

    @Override // com.huami.nfc.door.api.ISnowballAccessDoorApi
    @NotNull
    public PayResponse<String> agreeProtocol(long id) {
        return PayResponseKt.toPayResponse(this.protocolService.agreeProtocol(r.mapOf(TuplesKt.to("protocol_type", ProtocolType.SnowballAccessDoor.getType()), TuplesKt.to("id", String.valueOf(id)))).execute());
    }

    @Override // com.huami.nfc.door.api.AccessDoorAppletApi
    @NotNull
    public PayResponse<String> deleteApp(@NotNull String aid) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new a(aid));
    }

    @Override // com.huami.nfc.door.api.LoockAppletApi
    @NotNull
    public PayResponse<String> deleteLoock(@NotNull String aid) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new b(aid));
    }

    @Override // com.huami.nfc.door.api.ISnowballAccessDoorApi
    @NotNull
    public PayResponse<DoorCardInfo> getCardInfo(@NotNull String sessionId, @NotNull String cardType) {
        PayResponse payResponse = PayResponseKt.toPayResponse(this.server.getCardInfo(sessionId, cardType).execute());
        if (!payResponse.isSuccessful()) {
            return new PayResponse<>(payResponse.getCode(), payResponse.getMessage(), null);
        }
        PayResponse.Companion companion = PayResponse.INSTANCE;
        String message = payResponse.getMessage();
        List list = (List) payResponse.getData();
        return companion.success(message, list != null ? (DoorCardInfo) list.get(0) : null);
    }

    @Override // com.huami.nfc.door.api.ISnowballAccessDoorApi
    @NotNull
    public PayResponse<List<DoorCardInfo>> getCardList(@NotNull String type, @NotNull String cardType, @Nullable Integer bizType) {
        Map<String, Object> mapMutableMapOf = r.mutableMapOf(TuplesKt.to("queryType", type), TuplesKt.to("userNFCCardType", cardType));
        if (bizType != null) {
            mapMutableMapOf.put("bizType", Integer.valueOf(bizType.intValue()));
        }
        return PayResponseKt.toPayResponse(this.server.getCardList(mapMutableMapOf).execute());
    }

    @Override // com.huami.nfc.door.api.ISnowballAccessDoorApi
    @NotNull
    public PayResponse<NfcTag> getNfcTag() {
        return INfcTagKt.getNfcTagWithResponse(this.tag);
    }

    @Override // com.huami.nfc.door.api.ISnowballAccessDoorApi
    @NotNull
    public PayResponse<ProtocolEntity> getProtocol(@NotNull String actionType) {
        return PayResponseKt.toPayResponse(this.protocolService.getProtocol(r.mapOf(TuplesKt.to("protocol_type", ProtocolType.SnowballAccessDoor.getType()), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, actionType))).execute());
    }

    @Override // com.huami.nfc.door.api.ISnowballAccessDoorApi
    @NotNull
    public PayResponse<List<CommunityNameEntity>> getSupportCommunity(@NotNull String type, @NotNull String name) {
        return PayResponseKt.responseRaw(this.server.getSupportCommunity(c(new Gson().toJson(new CommunityEntity(type, name)))).execute(), c.a);
    }

    @Override // com.huami.nfc.door.api.AccessDoorAppletApi
    @NotNull
    public PayResponse<String> install(@Nullable NfcTag tag, @Nullable String phoneNum, @Nullable String districtName, int dataType) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new d(tag, phoneNum, districtName, dataType));
    }

    @Override // com.huami.nfc.door.api.LoockAppletApi
    @NotNull
    public PayResponse<String> installLoock() {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new e());
    }

    @Override // com.huami.nfc.door.api.ISnowballAccessDoorApi
    @NotNull
    public PayResponse<List<VerifyEntity>> query() {
        return PayResponseKt.responseRaw(this.server.query(q.mapOf(TuplesKt.to("realNameMode", RealNameTpye.Huami.getType()))).execute(), new f());
    }

    @Override // com.huami.nfc.door.api.ISnowballAccessDoorApi
    @NotNull
    public PayResponse<Unit> updateCardInfo(@NotNull DoorCardInfo info, @NotNull String cardType) {
        return PayResponseKt.toPayResponse(this.server.updateCardInfo(com.huami.nfc.web.Constant.requestBody(new JSONObject(new Gson().toJson(info)), g.a), cardType).execute());
    }

    @Override // com.huami.nfc.door.api.ISnowballAccessDoorApi
    @NotNull
    public PayResponse<VerifyEntity> verifyByIdCard(@NotNull IdCardEntity info) {
        return PayResponseKt.responseRaw(this.server.verifyByIdCard(r.mapOf(TuplesKt.to("realNameMode", RealNameTpye.Huami.getType()), TuplesKt.to("verifyType", "ID_CARD")), c(new Gson().toJson(info))).execute(), new h());
    }
}
