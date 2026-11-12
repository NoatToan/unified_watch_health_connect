package com.huami.wallet.accessdoor.api;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.applet.AppletState;
import com.huami.nfc.applet.CardScheduleTime;
import com.huami.nfc.applet.api.SeAppletApi;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.huami.nfc.ble.AppletEntity;
import com.huami.nfc.ble.AppletType;
import com.huami.nfc.ble.IDeviceApi;
import com.huami.nfc.ble.NfcBleApi;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.door.NfcTag;
import com.huami.nfc.door.api.ISnowballAccessDoorApi;
import com.huami.nfc.door.api.IXiaomiDoorApi;
import com.huami.nfc.door.entity.CommunityNameEntity;
import com.huami.nfc.door.entity.IdCardEntity;
import com.huami.nfc.door.entity.VerifyEntity;
import com.huami.nfc.web.NfcDevice;
import com.huami.nfc.web.NfcDeviceKt;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.wallet.common.api.ImageProviderApi;
import com.huami.wallet.common.config.WebConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 n2\u00020\u00012\u00020\u0002:\u0001nB\u000f\u0012\u0006\u0010L\u001a\u00020I¢\u0006\u0004\bl\u0010mJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007H\u0016J-\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00072\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00072\u0006\u0010\u001f\u001a\u00020\u0005H\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010#\u001a\u00020\"H\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007H\u0016J&\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0016J\u0014\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00170\u0007H\u0016J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\u00072\u0006\u0010\u001d\u001a\u00020+H\u0016J4\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\u0010-\u001a\u0004\u0018\u00010\u00132\b\u0010.\u001a\u0004\u0018\u00010\u00052\b\u0010/\u001a\u0004\u0018\u00010\u00052\u0006\u00100\u001a\u00020\u0015H\u0016J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u00105\u001a\u000204H\u0016J\b\u00106\u001a\u00020\u0003H\u0016J\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000507H\u0016J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J$\u0010;\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u0005072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001807H\u0016J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010>\u001a\u00020\u0005H\u0016J$\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u00170\u00072\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010B\u001a\u00020\u0003H\u0016J&\u0010E\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020D\u0018\u0001070\u00072\u0006\u0010C\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010F\u001a\u00020DH\u0016J\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010F\u001a\u00020DH\u0016R\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001d\u0010R\u001a\u00020M8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001d\u0010W\u001a\u00020S8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010O\u001a\u0004\bU\u0010VR\u001d\u0010[\u001a\u00020X8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010O\u001a\u0004\bN\u0010ZR\u001d\u0010^\u001a\u00020\\8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010O\u001a\u0004\bT\u0010]R\u001d\u0010a\u001a\u00020_8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010O\u001a\u0004\bJ\u0010`R\u001d\u0010e\u001a\u0002048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010O\u001a\u0004\bc\u0010dR\u001d\u0010h\u001a\u00020f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010O\u001a\u0004\bY\u0010gR\u001d\u0010k\u001a\u00020i8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010O\u001a\u0004\bb\u0010j¨\u0006o"}, d2 = {"Lcom/huami/wallet/accessdoor/api/HuamiPayApiRepo;", "Lcom/huami/wallet/accessdoor/api/IHuamiPayWrapperApi;", "Lorg/koin/core/component/KoinComponent;", "", "i", "", "aid", "Lcom/huami/nfc/base/PayResponse;", "", "notifyActiveApplet", "Lcom/huami/nfc/ble/AppletType;", "type", "notifyDeleteApplet", "imageUrl", "notifyIssueApplet", "name", "notifyAppletInfo", "isClassicDevice", "closeNfcTagReader", "Lcom/huami/nfc/door/NfcTag;", "getNfcTag", "", "bizType", "", "Lcom/huami/nfc/door/DoorCardInfo;", "getCardList", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/huami/nfc/base/PayResponse;", "sessionId", "getCardInfo", "info", "updateCardInfo", "actionType", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "", "id", "agreeProtocol", "query", "frontImage", "backImage", "verify", "Lcom/huami/nfc/door/entity/VerifyEntity;", "snowQuery", "Lcom/huami/nfc/door/entity/IdCardEntity;", "snowVerify", "tag", "phoneNum", "districtName", "nfcTagType", "install", "deleteApp", "setDefaultCard", "Lcom/huami/nfc/web/NfcDevice;", "getNfcDevice", "isMiDevice", "", "aids", "readDefaultCard", "isDefaultCard", "updateNfcCardListSync", "list", "syncAppletList", "key", "getDoorImageUrl", "Lcom/huami/nfc/door/entity/CommunityNameEntity;", "getSupportCommunity", "isSupportCardScheduleTime", "appletType", "Lcom/huami/nfc/applet/CardScheduleTime;", "queryCardScheduleTime", "cardScheduleTime", "setCardScheduleTime", "deleteCardScheduleTime", "Lcom/huami/wallet/accessdoor/api/DataSourceConfig;", "a", "Lcom/huami/wallet/accessdoor/api/DataSourceConfig;", "config", "Lcom/huami/nfc/door/api/IXiaomiDoorApi;", "b", "Lkotlin/Lazy;", "e", "()Lcom/huami/nfc/door/api/IXiaomiDoorApi;", "miDoorApi", "Lcom/huami/nfc/door/api/ISnowballAccessDoorApi;", "c", "f", "()Lcom/huami/nfc/door/api/ISnowballAccessDoorApi;", "snbDoorApi", "Lcom/huami/nfc/ble/NfcBleApi;", GoogleApiAvailabilityLight.a, "()Lcom/huami/nfc/ble/NfcBleApi;", "bleApi", "Lcom/huami/nfc/ble/IDeviceApi;", "()Lcom/huami/nfc/ble/IDeviceApi;", "deviceApi", "Lcom/huami/nfc/applet/api/SeAppletApi;", "()Lcom/huami/nfc/applet/api/SeAppletApi;", "appletApi", "g", "h", "()Lcom/huami/nfc/web/NfcDevice;", "_nfcDevice", "Lcom/huami/wallet/common/api/ImageProviderApi;", "()Lcom/huami/wallet/common/api/ImageProviderApi;", "imageProviderApi", "Lcom/huami/wallet/common/config/WebConfig;", "()Lcom/huami/wallet/common/config/WebConfig;", "webConfig", "<init>", "(Lcom/huami/wallet/accessdoor/api/DataSourceConfig;)V", "Companion", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class HuamiPayApiRepo implements IHuamiPayWrapperApi, KoinComponent {

    @NotNull
    public static final String TAG = "Door-HuamiPayApiRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DataSourceConfig config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy miDoorApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy snbDoorApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy bleApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy appletApi;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy _nfcDevice;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy imageProviderApi;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy webConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<PayResponse<? extends String>, Boolean> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull PayResponse<String> payResponse) {
            return Boolean.valueOf(payResponse.isSuccessful() && Intrinsics.areEqual(payResponse.getData(), this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/applet/AppletState;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<PayResponse<? extends AppletState>, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull PayResponse<AppletState> payResponse) {
            return Boolean.valueOf(payResponse.isSuccessful() && payResponse.getData() != null && payResponse.getData().isActive());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Object> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return "notify to device(notifyDefaultCard): " + HuamiPayApiRepo.this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/applet/AppletState;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<PayResponse<? extends AppletState>, String> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<AppletState> payResponse) {
            if (payResponse.isSuccessful() && payResponse.getData() != null && payResponse.getData().isActive()) {
                return payResponse.getData().getAid();
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Object> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return "notify to device(notifyActiveApplet): " + HuamiPayApiRepo.this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HuamiPayApiRepo(@NotNull DataSourceConfig dataSourceConfig) {
        this.config = dataSourceConfig;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.miDoorApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<IXiaomiDoorApi>() { // from class: com.huami.wallet.accessdoor.api.HuamiPayApiRepo$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.nfc.door.api.IXiaomiDoorApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final IXiaomiDoorApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IXiaomiDoorApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.snbDoorApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<ISnowballAccessDoorApi>() { // from class: com.huami.wallet.accessdoor.api.HuamiPayApiRepo$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.nfc.door.api.ISnowballAccessDoorApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ISnowballAccessDoorApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(ISnowballAccessDoorApi.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.bleApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<NfcBleApi>() { // from class: com.huami.wallet.accessdoor.api.HuamiPayApiRepo$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.nfc.ble.NfcBleApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NfcBleApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(NfcBleApi.class), objArr4, objArr5);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.deviceApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<IDeviceApi>() { // from class: com.huami.wallet.accessdoor.api.HuamiPayApiRepo$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.nfc.ble.IDeviceApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final IDeviceApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IDeviceApi.class), objArr6, objArr7);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode5 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.appletApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode5, (Function0) new Function0<SeAppletApi>() { // from class: com.huami.wallet.accessdoor.api.HuamiPayApiRepo$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.nfc.applet.api.SeAppletApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SeAppletApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SeAppletApi.class), objArr8, objArr9);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode6 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        this._nfcDevice = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode6, (Function0) new Function0<NfcDevice>() { // from class: com.huami.wallet.accessdoor.api.HuamiPayApiRepo$special$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.nfc.web.NfcDevice, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NfcDevice getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(NfcDevice.class), objArr10, objArr11);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode7 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr12 = 0 == true ? 1 : 0;
        final Object[] objArr13 = 0 == true ? 1 : 0;
        this.imageProviderApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode7, (Function0) new Function0<ImageProviderApi>() { // from class: com.huami.wallet.accessdoor.api.HuamiPayApiRepo$special$$inlined$inject$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.common.api.ImageProviderApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ImageProviderApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(ImageProviderApi.class), objArr12, objArr13);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode8 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr14 = 0 == true ? 1 : 0;
        final Object[] objArr15 = 0 == true ? 1 : 0;
        this.webConfig = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode8, (Function0) new Function0<WebConfig>() { // from class: com.huami.wallet.accessdoor.api.HuamiPayApiRepo$special$$inlined$inject$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.common.config.WebConfig, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WebConfig getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(WebConfig.class), objArr14, objArr15);
            }
        });
    }

    private final SeAppletApi a() {
        return (SeAppletApi) this.appletApi.getValue();
    }

    private final NfcBleApi b() {
        return (NfcBleApi) this.bleApi.getValue();
    }

    private final IDeviceApi c() {
        return (IDeviceApi) this.deviceApi.getValue();
    }

    private final ImageProviderApi d() {
        return (ImageProviderApi) this.imageProviderApi.getValue();
    }

    private final IXiaomiDoorApi e() {
        return (IXiaomiDoorApi) this.miDoorApi.getValue();
    }

    private final ISnowballAccessDoorApi f() {
        return (ISnowballAccessDoorApi) this.snbDoorApi.getValue();
    }

    private final WebConfig g() {
        return (WebConfig) this.webConfig.getValue();
    }

    private final NfcDevice h() {
        return (NfcDevice) this._nfcDevice.getValue();
    }

    private final boolean i() {
        return NfcDeviceKt.isXiaomiDevice(h().getDeviceModel());
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<String> agreeProtocol(long id) {
        boolean zI = i();
        if (zI) {
            return e().agreeProtocol(id);
        }
        if (zI) {
            throw new NoWhenBranchMatchedException();
        }
        return f().agreeProtocol(id);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<Unit> closeNfcTagReader() {
        return c().closeNfcTagReader();
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<String> deleteApp(@NotNull String aid) {
        boolean zI = i();
        if (zI) {
            return e().deleteApp(aid);
        }
        if (zI) {
            throw new NoWhenBranchMatchedException();
        }
        return f().deleteApp(aid);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<Boolean> deleteCardScheduleTime(@NotNull CardScheduleTime cardScheduleTime) {
        return c().deleteScheduleTime(cardScheduleTime);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<DoorCardInfo> getCardInfo(@NotNull String sessionId) {
        boolean zI = i();
        if (zI) {
            return e().getCardInfo(sessionId);
        }
        if (zI) {
            throw new NoWhenBranchMatchedException();
        }
        return ISnowballAccessDoorApi.DefaultImpls.getCardInfo$default(f(), sessionId, null, 2, null);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<List<DoorCardInfo>> getCardList(@NotNull String type, @Nullable Integer bizType) {
        boolean zI = i();
        if (zI) {
            return e().getCardList(type, bizType);
        }
        if (zI) {
            throw new NoWhenBranchMatchedException();
        }
        return ISnowballAccessDoorApi.DefaultImpls.getCardList$default(f(), type, null, bizType, 2, null);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<String> getDoorImageUrl(@NotNull String key) {
        return d().getImageUrlByKey(g().getWebAppName(), "huami.preLaunch.nfc_access_img", key);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public NfcDevice getNfcDevice() {
        return h();
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<NfcTag> getNfcTag() {
        boolean zI = i();
        if (zI) {
            return e().getNfcTag();
        }
        if (zI) {
            throw new NoWhenBranchMatchedException();
        }
        return f().getNfcTag();
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<ProtocolEntity> getProtocol(@NotNull String actionType) {
        boolean zI = i();
        if (zI) {
            return e().getProtocol(actionType);
        }
        if (zI) {
            throw new NoWhenBranchMatchedException();
        }
        return f().getProtocol(actionType);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<List<CommunityNameEntity>> getSupportCommunity(@NotNull String type, @NotNull String name) {
        return f().getSupportCommunity(type, name);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<String> install(@Nullable NfcTag tag, @Nullable String phoneNum, @Nullable String districtName, int nfcTagType) {
        boolean zI = i();
        if (zI) {
            return e().install(tag);
        }
        if (zI) {
            throw new NoWhenBranchMatchedException();
        }
        return f().install(tag, phoneNum, districtName, nfcTagType);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    public boolean isClassicDevice() {
        return NfcDeviceKt.isClassicDevice(h().getDeviceModel());
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<Boolean> isDefaultCard(@NotNull String aid) {
        return this.config.getWithBleApi().getA().booleanValue() ? PayResponseKt.map(b().readDefaultCard(), new a(aid)) : PayResponseKt.map(a().getAppletState(aid), b.a);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    public boolean isMiDevice() {
        return i();
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    public boolean isSupportCardScheduleTime() {
        return c().isSupportScheduleTime();
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<Unit> notifyActiveApplet(@NotNull String aid) {
        if (isClassicDevice()) {
            return PayResponse.INSTANCE.success("success", null);
        }
        PayResponse<Unit> payResponseActiveApplet = c().activeApplet(aid, AppletType.DOOR);
        LogcatKt.info$default(Logcat.INSTANCE, null, new c(), 1, null);
        return payResponseActiveApplet;
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<Unit> notifyAppletInfo(@NotNull String name, @NotNull String aid) {
        return isClassicDevice() ? c().notifyAppletInfoForWatch(new AppletEntity(aid, null, 1, null, name, 10, null)) : c().updateAppletInfo(name, aid);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<Unit> notifyDeleteApplet(@NotNull String aid, @NotNull AppletType type) {
        return isClassicDevice() ? c().deleteAppletForWatch(aid, type) : c().deleteApplet(aid, type);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<Unit> notifyIssueApplet(@NotNull String aid, @NotNull AppletType type, @Nullable String imageUrl) {
        return isClassicDevice() ? c().notifyAppletInfoForWatch(new AppletEntity(aid, imageUrl, 1, null, null, 24, null)) : c().issueApplet(aid, type);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<Integer> query() {
        return e().query();
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<List<CardScheduleTime>> queryCardScheduleTime(@NotNull AppletType appletType, @NotNull String aid) {
        return c().queryScheduleTime(appletType, aid);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<String> readDefaultCard(@NotNull List<String> aids) {
        return this.config.getWithBleApi().getA().booleanValue() ? b().readDefaultCard() : PayResponseKt.map(a().getDefaultCard(CollectionsKt___CollectionsKt.toMutableList((Collection) aids)), d.a);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<Boolean> setCardScheduleTime(@NotNull CardScheduleTime cardScheduleTime) {
        return c().setScheduleTime(cardScheduleTime);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<Unit> setDefaultCard(@NotNull String aid) {
        if (this.config.getWithBleApi().getA().booleanValue()) {
            return b().activeDefaultCard(aid, AppletType.DOOR);
        }
        PayResponse<Unit> defaultCard = a().setDefaultCard(aid);
        if (defaultCard.isSuccessful()) {
            notifyActiveApplet(aid);
            LogcatKt.info$default(Logcat.INSTANCE, null, new e(), 1, null);
        }
        return defaultCard;
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<List<VerifyEntity>> snowQuery() {
        return f().query();
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<VerifyEntity> snowVerify(@NotNull IdCardEntity info) {
        return f().verifyByIdCard(info);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<Unit> syncAppletList(@NotNull List<DoorCardInfo> list) {
        if (isClassicDevice()) {
            IDeviceApi iDeviceApiC = c();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (DoorCardInfo doorCardInfo : list) {
                arrayList.add(new AppletEntity(doorCardInfo.getAid(), doorCardInfo.getCardArt(), 1, null, doorCardInfo.getName(), 8, null));
            }
            return iDeviceApiC.notifyAppletInfoListForWatch(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList));
        }
        if (!this.config.getWithBleApi().getA().booleanValue()) {
            return PayResponse.INSTANCE.success("success, do nothing", null);
        }
        NfcBleApi nfcBleApiB = b();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((DoorCardInfo) it2.next()).getAid());
        }
        return nfcBleApiB.updateNfcCardListSync(arrayList2, AppletType.DOOR);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<Unit> updateCardInfo(@NotNull DoorCardInfo info) {
        boolean zI = i();
        if (zI) {
            return e().updateCardInfo(info);
        }
        if (zI) {
            throw new NoWhenBranchMatchedException();
        }
        return ISnowballAccessDoorApi.DefaultImpls.updateCardInfo$default(f(), info, null, 2, null);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<Unit> updateNfcCardListSync(@NotNull List<String> aid, @NotNull AppletType type) {
        return b().updateNfcCardListSync(aid, type);
    }

    @Override // com.huami.wallet.accessdoor.api.IHuamiPayWrapperApi
    @NotNull
    public PayResponse<Unit> verify(@NotNull String type, @NotNull String frontImage, @NotNull String backImage) {
        return e().verify(type, frontImage, backImage);
    }
}
