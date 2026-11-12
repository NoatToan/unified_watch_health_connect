package com.huami.nfc.door.di;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.huami.account.ui.bind.PhoneBindActivity;
import com.huami.nfc.base.ExtensionsKt;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.door.NfcTag;
import com.huami.nfc.door.api.IXiaomiDoorApi;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.tools.analytics.DbUtils;
import com.unionpay.tsmservice.data.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010.\u001a\u00020\u0001¢\u0006\u0004\b/\u00100J(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H\u0002J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0016J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004H\u0016J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0016J-\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00042\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\u0006\u0010!\u001a\u00020\u0007H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010%\u001a\u00020$H\u0016J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010'\u001a\u00020\u0007H\u0016R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0016\u0010.\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/huami/nfc/door/di/XiaomiDoorNetworkWrapper;", "Lcom/huami/nfc/door/api/IXiaomiDoorApi;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "Lcom/huami/nfc/base/PayResponse;", "action", "a", "", "realName", "cardNo", Constant.KEY_CARD_TYPE, "", PhoneBindActivity.EXTRA_BIND_TYPE, "", "bind", "query", "type", "frontImage", "backImage", "verify", "Lcom/huami/nfc/door/NfcTag;", "getNfcTag", "tag", "install", "bizType", "", "Lcom/huami/nfc/door/DoorCardInfo;", "getCardList", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/huami/nfc/base/PayResponse;", "sessionId", "getCardInfo", "info", "updateCardInfo", "actionType", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "", "id", "agreeProtocol", "aid", "deleteApp", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "Lcom/huami/nfc/door/api/IXiaomiDoorApi;", "api", "<init>", "(Landroid/content/Context;Lcom/huami/nfc/door/api/IXiaomiDoorApi;)V", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public final class XiaomiDoorNetworkWrapper implements IXiaomiDoorApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IXiaomiDoorApi api;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<PayResponse<? extends String>> {
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(0);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<String> invoke() {
            return XiaomiDoorNetworkWrapper.this.api.agreeProtocol(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, int i) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> invoke() {
            return XiaomiDoorNetworkWrapper.this.bind(this.b, this.c, this.d, this.e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<PayResponse<? extends String>> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<String> invoke() {
            return XiaomiDoorNetworkWrapper.this.api.deleteApp(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/door/DoorCardInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<PayResponse<? extends DoorCardInfo>> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<DoorCardInfo> invoke() {
            return XiaomiDoorNetworkWrapper.this.api.getCardInfo(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/door/DoorCardInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<PayResponse<? extends List<DoorCardInfo>>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ Integer c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Integer num) {
            super(0);
            this.b = str;
            this.c = num;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<List<DoorCardInfo>> invoke() {
            return XiaomiDoorNetworkWrapper.this.api.getCardList(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<PayResponse<? extends ProtocolEntity>> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<ProtocolEntity> invoke() {
            return XiaomiDoorNetworkWrapper.this.api.getProtocol(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<PayResponse<? extends String>> {
        public final /* synthetic */ NfcTag b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(NfcTag nfcTag) {
            super(0);
            this.b = nfcTag;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<String> invoke() {
            return XiaomiDoorNetworkWrapper.this.api.install(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<PayResponse<? extends Integer>> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Integer> invoke() {
            return XiaomiDoorNetworkWrapper.this.api.query();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ DoorCardInfo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(DoorCardInfo doorCardInfo) {
            super(0);
            this.b = doorCardInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> invoke() {
            return XiaomiDoorNetworkWrapper.this.api.updateCardInfo(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, String str3) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> invoke() {
            return XiaomiDoorNetworkWrapper.this.api.verify(this.b, this.c, this.d);
        }
    }

    public XiaomiDoorNetworkWrapper(@NotNull Context context, @NotNull IXiaomiDoorApi iXiaomiDoorApi) {
        this.context = context;
        this.api = iXiaomiDoorApi;
    }

    private final <T> PayResponse<T> a(Function0<? extends PayResponse<? extends T>> action) {
        return ExtensionsKt.isNetworkConnected(this.context) ? action.invoke() : new PayResponse<>(PayResponse.CODE_NETWORK_ERROR, "网络未连接, 请检查网络后重试", null);
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<String> agreeProtocol(long id) {
        return a(new a(id));
    }

    @Override // com.huami.nfc.door.api.IIdentityApi
    @NotNull
    public PayResponse<Unit> bind(@NotNull String realName, @NotNull String cardNo, @NotNull String cardType, int bindType) {
        return a(new b(realName, cardNo, cardType, bindType));
    }

    @Override // com.huami.nfc.door.api.XiaoMiDoorAppletApi
    @NotNull
    public PayResponse<String> deleteApp(@NotNull String aid) {
        return a(new c(aid));
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<DoorCardInfo> getCardInfo(@NotNull String sessionId) {
        return a(new d(sessionId));
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<List<DoorCardInfo>> getCardList(@NotNull String type, @Nullable Integer bizType) {
        return a(new e(type, bizType));
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<NfcTag> getNfcTag() {
        return this.api.getNfcTag();
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<ProtocolEntity> getProtocol(@NotNull String actionType) {
        return a(new f(actionType));
    }

    @Override // com.huami.nfc.door.api.XiaoMiDoorAppletApi
    @NotNull
    public PayResponse<String> install(@Nullable NfcTag tag) {
        return a(new g(tag));
    }

    @Override // com.huami.nfc.door.api.IIdentityApi
    @NotNull
    public PayResponse<Integer> query() {
        return a(new h());
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<Unit> updateCardInfo(@NotNull DoorCardInfo info) {
        return a(new i(info));
    }

    @Override // com.huami.nfc.door.api.IIdentityApi
    @NotNull
    public PayResponse<Unit> verify(@NotNull String type, @NotNull String frontImage, @NotNull String backImage) {
        return a(new j(type, frontImage, backImage));
    }
}
