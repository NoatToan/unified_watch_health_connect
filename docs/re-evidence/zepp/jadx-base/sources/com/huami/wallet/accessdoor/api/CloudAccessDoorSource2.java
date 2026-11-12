package com.huami.wallet.accessdoor.api;

import androidx.exifinterface.media.ExifInterface;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.applet.CardScheduleTime;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.huami.nfc.ble.AppletType;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.door.NfcTag;
import com.huami.nfc.door.entity.CommunityNameEntity;
import com.huami.nfc.door.entity.IdCardEntity;
import com.huami.nfc.door.entity.VerifyEntity;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.wallet.accessdoor.api.cache.DoorWebApiCache;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2;
import com.huami.wallet.accessdoor.entity.DoorInfoAndDefaultCard;
import com.huami.wallet.accessdoor.helper.DoorCardExtensionKt;
import com.huami.wallet.accessdoor.helper.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010G\u001a\u00020E\u0012\u0006\u0010J\u001a\u00020H¢\u0006\u0004\bK\u0010LJ\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002J4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000e\u001a\u00020\bH\u0002J%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0004H\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0004H\u0016J4\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00110\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u001e\u001a\u00020\u0012H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00042\u0006\u0010#\u001a\u00020\bH\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0016J&\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0016J\u0014\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00110\u0004H\u0016J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020+0\u00042\u0006\u0010.\u001a\u00020-H\u0016J\u001f\u00102\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\b\u00105\u001a\u000204H\u0016J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u00106\u001a\u00020\bH\u0016J\b\u00108\u001a\u000204H\u0016J$\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:0\u00042\u0006\u0010'\u001a\u00020\b2\u0006\u00109\u001a\u00020\bH\u0016J\b\u0010=\u001a\u00020\u0018H\u0016J&\u0010A\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020@\u0018\u00010\u00110\u00042\u0006\u0010?\u001a\u00020>2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010B\u001a\u00020@H\u0016J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010B\u001a\u00020@H\u0016R\u0016\u0010G\u001a\u00020E8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010FR\u0016\u0010J\u001a\u00020H8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010I¨\u0006M"}, d2 = {"Lcom/huami/wallet/accessdoor/api/CloudAccessDoorSource2;", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource2;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/wallet/accessdoor/helper/Resource;", "c", "Lcom/huami/nfc/door/NfcTag;", "nfcTag", "", "phoneNum", "districtName", "", "nfcTagType", "b", "aid", "a", "bizType", "", "Lcom/huami/nfc/door/DoorCardInfo;", "getCardList", "(Ljava/lang/Integer;)Lcom/huami/wallet/accessdoor/helper/Resource;", "getCardListByCplc", "startDetection", "startSimulation", "", "isNeedRequest", "Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;", "getCardListAndIsDefaultCard", "sessionId", "getCardInfo", "doorCardInfo", "namedOrUpdateCardName", "deleteAccessDoorCard", "isDefaultCard", "setDefaultCard", "actionType", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "query", "type", "frontImage", "backImage", "verify", "Lcom/huami/nfc/door/entity/VerifyEntity;", "snowQuery", "Lcom/huami/nfc/door/entity/IdCardEntity;", "info", "snowVerify", "", "id", "agreeProtocol", "(Ljava/lang/Long;)Lcom/huami/wallet/accessdoor/helper/Resource;", "", "closeWatchNfcTagReader", "key", "getDoorImageUrl", "bindDeviceDeleteCard", "name", "", "Lcom/huami/nfc/door/entity/CommunityNameEntity;", "getSupportCommunity", "isSupportCardScheduleTime", "Lcom/huami/nfc/ble/AppletType;", "appletType", "Lcom/huami/nfc/applet/CardScheduleTime;", "queryCardScheduleTime", "cardScheduleTime", "setCardScheduleTime", "deleteCardScheduleTime", "Lcom/huami/wallet/accessdoor/api/IHuamiPayWrapperApi;", "Lcom/huami/wallet/accessdoor/api/IHuamiPayWrapperApi;", "api", "Lcom/huami/wallet/accessdoor/api/cache/DoorWebApiCache;", "Lcom/huami/wallet/accessdoor/api/cache/DoorWebApiCache;", "webApi", "<init>", "(Lcom/huami/wallet/accessdoor/api/IHuamiPayWrapperApi;Lcom/huami/wallet/accessdoor/api/cache/DoorWebApiCache;)V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class CloudAccessDoorSource2 implements AccessDoorDataSource2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IHuamiPayWrapperApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DoorWebApiCache webApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public final /* synthetic */ PayResponse<List<DoorCardInfo>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(PayResponse<? extends List<DoorCardInfo>> payResponse) {
            super(0);
            this.a = payResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "bindDeviceDeleteCard()开始模拟前请求卡, code:" + this.a.getCode() + ", msg:" + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Object> {
        public final /* synthetic */ PayResponse<List<DoorCardInfo>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(PayResponse<? extends List<DoorCardInfo>> payResponse) {
            super(0);
            this.a = payResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "bindDeviceDeleteCard()开始模拟前请求卡cplc, code:" + this.a.getCode() + " ,msg: " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Object> {
        public final /* synthetic */ PayResponse<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PayResponse<String> payResponse) {
            super(0);
            this.a = payResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "bindDeviceDeleteCard()开始模拟前请求卡cplc, code:" + this.a.getCode() + " ,msg: " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<PayResponse<? extends String>, Boolean> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull PayResponse<String> payResponse) {
            if (payResponse.isSuccessful()) {
                CloudAccessDoorSource2.this.webApi.updateDeleteDoorCard(this.b);
            }
            return Boolean.valueOf(payResponse.isSuccessful());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Object> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "notify to device(issueApplet): " + CloudAccessDoorSource2.this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/door/DoorCardInfo;", "Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<PayResponse<? extends List<DoorCardInfo>>, List<DoorInfoAndDefaultCard>> {
        public final /* synthetic */ List<DoorInfoAndDefaultCard> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<DoorInfoAndDefaultCard> list) {
            super(1);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<DoorInfoAndDefaultCard> invoke(@NotNull PayResponse<? extends List<DoorCardInfo>> payResponse) {
            if (payResponse.isSuccessful() && payResponse.getData() != null) {
                IHuamiPayWrapperApi iHuamiPayWrapperApi = CloudAccessDoorSource2.this.api;
                List<DoorCardInfo> data = payResponse.getData();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
                Iterator<T> it2 = data.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((DoorCardInfo) it2.next()).getAid());
                }
                String data2 = iHuamiPayWrapperApi.readDefaultCard(arrayList).getData();
                if (data2 == null) {
                    data2 = "";
                }
                int size = payResponse.getData().size();
                if (size > 0) {
                    int i = 0;
                    boolean z = false;
                    while (true) {
                        int i2 = i + 1;
                        DoorCardInfo doorCardInfo = payResponse.getData().get(i);
                        this.b.add(new DoorInfoAndDefaultCard(doorCardInfo, false));
                        if (!z && Intrinsics.areEqual(data2, doorCardInfo.getAid())) {
                            this.b.set(i, new DoorInfoAndDefaultCard(doorCardInfo, true));
                            z = true;
                        }
                        if (i2 >= size) {
                            break;
                        }
                        i = i2;
                    }
                }
                kotlin.collections.j.reverse(this.b);
                CloudAccessDoorSource2.this.webApi.setDoorCardList(this.b);
            }
            return this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<PayResponse<? extends Unit>, Boolean> {
        public final /* synthetic */ DoorCardInfo b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Object> {
            public final /* synthetic */ PayResponse<Unit> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PayResponse<Unit> payResponse) {
                super(0);
                this.a = payResponse;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                return "notify to device(updateAppletInfo): " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(DoorCardInfo doorCardInfo) {
            super(1);
            this.b = doorCardInfo;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull PayResponse<Unit> payResponse) {
            if (payResponse.isSuccessful()) {
                CloudAccessDoorSource2.this.api.notifyAppletInfo(this.b.getName(), this.b.getAid());
                LogcatKt.info$default(Logcat.INSTANCE, null, new a(payResponse), 1, null);
                CloudAccessDoorSource2.this.webApi.updateDoorCardName(this.b);
            }
            return Boolean.valueOf(payResponse.isSuccessful());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<PayResponse<? extends Unit>, Boolean> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(1);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull PayResponse<Unit> payResponse) {
            if (payResponse.isSuccessful()) {
                CloudAccessDoorSource2.this.webApi.updateDoorCardIsDefault(this.b);
            }
            return Boolean.valueOf(payResponse.isSuccessful());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Object> {
        public final /* synthetic */ PayResponse<List<DoorCardInfo>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(PayResponse<? extends List<DoorCardInfo>> payResponse) {
            super(0);
            this.a = payResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "startSimulation()开始模拟前请求卡, code:" + this.a.getCode() + ", msg:" + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Object> {
        public final /* synthetic */ PayResponse<List<DoorCardInfo>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(PayResponse<? extends List<DoorCardInfo>> payResponse) {
            super(0);
            this.a = payResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "startSimulation()开始模拟前请求卡cplc, code:" + this.a.getCode() + " ,msg: " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Object> {
        public final /* synthetic */ PayResponse<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(PayResponse<? extends T> payResponse) {
            super(0);
            this.a = payResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "PayResponse is error: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<PayResponse<? extends Unit>, Boolean> {
        public static final l a = new l();

        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull PayResponse<Unit> payResponse) {
            return Boolean.valueOf(payResponse.isSuccessful());
        }
    }

    public CloudAccessDoorSource2(@NotNull IHuamiPayWrapperApi iHuamiPayWrapperApi, @NotNull DoorWebApiCache doorWebApiCache) {
        this.api = iHuamiPayWrapperApi;
        this.webApi = doorWebApiCache;
    }

    private final PayResponse<String> a(String aid) {
        PayResponse<String> payResponseDeleteApp = this.api.deleteApp(aid);
        if (payResponseDeleteApp.isSuccessful()) {
            this.api.notifyDeleteApplet(aid, AppletType.DOOR);
        }
        return payResponseDeleteApp;
    }

    private final Resource<String> b(NfcTag nfcTag, String phoneNum, String districtName, int nfcTagType) {
        return c(this.api.install(nfcTag, phoneNum, districtName, nfcTagType));
    }

    private final <T> Resource<T> c(PayResponse<? extends T> payResponse) {
        if (payResponse.isSuccessful()) {
            return Resource.success(payResponse.getData());
        }
        LogcatKt.error$default(Logcat.INSTANCE, null, new k(payResponse), 1, null);
        return Resource.error(payResponse.getCode(), payResponse.getMessage(), payResponse.getRawMessage(), payResponse.getData());
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<String> agreeProtocol(@Nullable Long id) {
        return id == null ? Resource.error("参数错误，id不可为null", null) : c(this.api.agreeProtocol(id.longValue()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    public void bindDeviceDeleteCard() {
        ArrayList arrayList = new ArrayList();
        PayResponse cardList$default = IHuamiPayWrapperApi.DefaultImpls.getCardList$default(this.api, "", null, 2, null);
        List list = (List) cardList$default.getData();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add((DoorCardInfo) it2.next());
            }
        }
        if (!cardList$default.isSuccessful()) {
            LogcatKt.warn$default(Logcat.INSTANCE, null, new a(cardList$default), 1, null);
            return;
        }
        Collection collection = (Collection) cardList$default.getData();
        if (collection == null || collection.isEmpty()) {
            PayResponse cardList$default2 = IHuamiPayWrapperApi.DefaultImpls.getCardList$default(this.api, "cplc", null, 2, null);
            if (!cardList$default2.isSuccessful()) {
                LogcatKt.warn$default(Logcat.INSTANCE, null, new b(cardList$default2), 1, null);
            }
            List<DoorCardInfo> list2 = (List) cardList$default2.getData();
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            for (DoorCardInfo doorCardInfo : list2) {
                if (DoorCardExtensionKt.isMiDoorCard(doorCardInfo)) {
                    arrayList.add(doorCardInfo);
                } else {
                    PayResponse<String> payResponseA = a(doorCardInfo.getAid());
                    if (!payResponseA.isSuccessful()) {
                        LogcatKt.warn$default(Logcat.INSTANCE, null, new c(payResponseA), 1, null);
                    }
                }
            }
        }
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    public void closeWatchNfcTagReader() {
        if (this.api.isClassicDevice()) {
            this.api.closeNfcTagReader();
        }
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<Boolean> deleteAccessDoorCard(@NotNull String aid) {
        return c(PayResponseKt.map(a(aid), new d(aid)));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<Boolean> deleteCardScheduleTime(@NotNull CardScheduleTime cardScheduleTime) {
        return c(this.api.deleteCardScheduleTime(cardScheduleTime));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<DoorCardInfo> getCardInfo(@NotNull String sessionId) {
        PayResponse<DoorCardInfo> cardInfo = this.api.getCardInfo(sessionId);
        if (cardInfo.isSuccessful() && cardInfo.getData() != null) {
            this.api.notifyIssueApplet(cardInfo.getData().getAid(), AppletType.DOOR, cardInfo.getData().getCardArt());
            LogcatKt.info$default(Logcat.INSTANCE, null, new e(), 1, null);
        }
        Unit unit = Unit.INSTANCE;
        return c(cardInfo);
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<List<DoorCardInfo>> getCardList(@Nullable Integer bizType) {
        return c(this.api.getCardList("", bizType));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<List<DoorInfoAndDefaultCard>> getCardListAndIsDefaultCard(boolean isNeedRequest) {
        if (this.webApi.getDoorCardList() != null && (!this.webApi.getDoorCardList().isEmpty()) && !isNeedRequest) {
            return Resource.success(this.webApi.getDoorCardList());
        }
        return c(PayResponseKt.map(IHuamiPayWrapperApi.DefaultImpls.getCardList$default(this.api, "", null, 2, null), new f(new ArrayList())));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<List<DoorCardInfo>> getCardListByCplc() {
        return c(IHuamiPayWrapperApi.DefaultImpls.getCardList$default(this.api, "cplc", null, 2, null));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<String> getDoorImageUrl(@NotNull String key) {
        return c(this.api.getDoorImageUrl(key));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<ProtocolEntity> getProtocol(@NotNull String actionType) {
        return c(this.api.getProtocol(actionType));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<List<CommunityNameEntity>> getSupportCommunity(@NotNull String type, @NotNull String name) {
        return c(this.api.getSupportCommunity(type, name));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<Boolean> isDefaultCard(@NotNull String aid) {
        return c(this.api.isDefaultCard(aid));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    public boolean isSupportCardScheduleTime() {
        return this.api.isSupportCardScheduleTime();
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<Boolean> namedOrUpdateCardName(@NotNull DoorCardInfo doorCardInfo) {
        return c(PayResponseKt.map(this.api.updateCardInfo(doorCardInfo), new g(doorCardInfo)));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<Integer> query() {
        return c(this.api.query());
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<List<CardScheduleTime>> queryCardScheduleTime(@NotNull AppletType appletType, @NotNull String aid) {
        return c(this.api.queryCardScheduleTime(appletType, aid));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<Boolean> setCardScheduleTime(@NotNull CardScheduleTime cardScheduleTime) {
        return c(this.api.setCardScheduleTime(cardScheduleTime));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<Boolean> setDefaultCard(@NotNull String aid) {
        return c(PayResponseKt.map(this.api.setDefaultCard(aid), new h(aid)));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<List<VerifyEntity>> snowQuery() {
        return c(this.api.snowQuery());
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<VerifyEntity> snowVerify(@NotNull IdCardEntity info) {
        return c(this.api.snowVerify(info));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<PayResponse<NfcTag>> startDetection() {
        PayResponse<NfcTag> nfcTag = this.api.getNfcTag();
        return nfcTag.isSuccessful() ? Resource.success(nfcTag) : Resource.error(nfcTag.getCode(), nfcTag.getMessage(), nfcTag);
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<String> startSimulation(@Nullable NfcTag nfcTag, @Nullable String phoneNum, @Nullable String districtName, int nfcTagType) {
        PayResponse cardList$default = IHuamiPayWrapperApi.DefaultImpls.getCardList$default(this.api, "", null, 2, null);
        boolean z = true;
        if (!cardList$default.isSuccessful()) {
            LogcatKt.warn$default(Logcat.INSTANCE, null, new i(cardList$default), 1, null);
            return Resource.error(cardList$default.getCode(), cardList$default.getMessage(), "");
        }
        List list = (List) cardList$default.getData();
        if (list == null || list.isEmpty()) {
            PayResponse cardList$default2 = IHuamiPayWrapperApi.DefaultImpls.getCardList$default(this.api, "cplc", null, 2, null);
            if (!cardList$default2.isSuccessful()) {
                LogcatKt.warn$default(Logcat.INSTANCE, null, new j(cardList$default2), 1, null);
                return Resource.error(cardList$default2.getCode(), cardList$default2.getMessage(), "");
            }
            List<DoorCardInfo> list2 = (List) cardList$default2.getData();
            if (list2 != null && !list2.isEmpty()) {
                z = false;
            }
            if (!z) {
                for (DoorCardInfo doorCardInfo : list2) {
                    if (!DoorCardExtensionKt.isMiDoorCard(doorCardInfo)) {
                        PayResponse<String> payResponseA = a(doorCardInfo.getAid());
                        if (!payResponseA.isSuccessful()) {
                            return Resource.error(payResponseA.getCode(), payResponseA.getMessage(), payResponseA.getData());
                        }
                    }
                }
            }
        }
        return b(nfcTag, phoneNum, districtName, nfcTagType);
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2
    @NotNull
    public Resource<Boolean> verify(@NotNull String type, @NotNull String frontImage, @NotNull String backImage) {
        return c(PayResponseKt.map(this.api.verify(type, frontImage, backImage), l.a));
    }
}
