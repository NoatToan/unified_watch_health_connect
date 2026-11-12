package com.huami.wallet.ui.viewmodel;

import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.applet.CardScheduleTime;
import com.huami.nfc.applet.ConstantKt;
import com.huami.nfc.ble.AppletType;
import com.huami.nfc.bus.entities.PayAuthorizationInfo;
import com.huami.nfc.bus.entities.ReturnCardReason;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.BusCardBalance;
import com.huami.wallet.lib.entity.BusCardDetail;
import com.huami.wallet.lib.entity.BusOpenFeeStateEntity;
import com.huami.wallet.lib.entity.BusRefundOpenFeeEntity;
import com.huami.wallet.lib.entity.CarouseInfo;
import com.huami.wallet.lib.entity.NFCCardInfoEntity;
import com.huami.wallet.lib.entity.Protocol;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.entity.XiaomiNotice;
import com.huami.wallet.ui.entity.BusCardDetailAndBalance;
import com.huami.wallet.ui.repository.BusCardRepo;
import com.huami.wallet.ui.viewmodel.BusCardDetailViewModel;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 ¸\u00012\u00020\u0001:\u0002¸\u0001B\u0012\u0012\u0007\u0010µ\u0001\u001a\u00020<¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\u000e\u001a\u00020\rH\u0014J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\rJ\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002J\u001e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\tJ\u001e\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002J\u000e\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002J\u0006\u0010 \u001a\u00020\rJ\u000e\u0010!\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u0010\"\u001a\u00020\u000bJ\u0006\u0010#\u001a\u00020\rJ\u0016\u0010%\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002J\u0016\u0010&\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002J\u000e\u0010'\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0002JA\u0010/\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\r0*J\u000e\u00100\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u00101\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007J\u0006\u00102\u001a\u00020\rJ\u0006\u00103\u001a\u00020\rR\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R%\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\u00040@8\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER%\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0\u00040@8\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bI\u0010ER%\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\u00040@8\u0006@\u0006¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bM\u0010ER\"\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050O8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR%\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040@8\u0006@\u0006¢\u0006\f\n\u0004\bS\u0010C\u001a\u0004\bT\u0010ER%\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040V8\u0006@\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR%\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040@8\u0006@\u0006¢\u0006\f\n\u0004\b\\\u0010C\u001a\u0004\b]\u0010ER%\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040@8\u0006@\u0006¢\u0006\f\n\u0004\b_\u0010C\u001a\u0004\b`\u0010ER+\u0010f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020c0b0\u00040@8\u0006@\u0006¢\u0006\f\n\u0004\bd\u0010C\u001a\u0004\be\u0010ER+\u0010j\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0b0\u00040@8\u0006@\u0006¢\u0006\f\n\u0004\bh\u0010C\u001a\u0004\bi\u0010ER%\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040@8\u0006@\u0006¢\u0006\f\n\u0004\bk\u0010C\u001a\u0004\bl\u0010ER%\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020n0\u00040@8\u0006@\u0006¢\u0006\f\n\u0004\bo\u0010C\u001a\u0004\bp\u0010ER%\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0\u00040@8\u0006@\u0006¢\u0006\f\n\u0004\bs\u0010C\u001a\u0004\bt\u0010ER+\u0010x\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070b0\u00040@8\u0006@\u0006¢\u0006\f\n\u0004\bv\u0010C\u001a\u0004\bw\u0010ER%\u0010{\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040@8\u0006@\u0006¢\u0006\f\n\u0004\by\u0010C\u001a\u0004\bz\u0010ER%\u0010~\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040@8\u0006@\u0006¢\u0006\f\n\u0004\b|\u0010C\u001a\u0004\b}\u0010ER!\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0@8\u0006@\u0006¢\u0006\r\n\u0004\b\u007f\u0010C\u001a\u0005\b\u0080\u0001\u0010ER(\u0010\u0083\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040@8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010C\u001a\u0005\b\u0082\u0001\u0010ER\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0086\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0086\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0086\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u0086\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0086\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0086\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0086\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0086\u0001R\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0086\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0086\u0001R\u001c\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0086\u0001R\u001c\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0086\u0001R\u001c\u0010¡\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u0086\u0001R\u001c\u0010£\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u0086\u0001R\u001c\u0010¥\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010\u0086\u0001R\u001c\u0010§\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010\u0086\u0001R\u001c\u0010©\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010\u0086\u0001R\u001c\u0010«\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u0086\u0001R6\u0010¯\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00ad\u00010\u00040¬\u00010@8\u0006@\u0006¢\u0006\u000e\n\u0005\b®\u0001\u0010C\u001a\u0005\b¯\u0001\u0010ER\u001c\u0010±\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010\u0086\u0001R5\u0010´\u0001\u001a\u001b\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040¬\u00010@8\u0006@\u0006¢\u0006\u000e\n\u0005\b²\u0001\u0010C\u001a\u0005\b³\u0001\u0010E¨\u0006¹\u0001"}, d2 = {"Lcom/huami/wallet/ui/viewmodel/BusCardDetailViewModel;", "Lcom/huami/wallet/ui/viewmodel/BaseViewModel;", "", "cardId", "Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/wallet/lib/entity/BusCardDetail;", "y0", "Lcom/huami/nfc/applet/CardScheduleTime;", "cardScheduleTime", "", "l0", "", "isMiDevice", "", "onCleared", "loadCardDetailAndBalance", "cardName", "aid", "updateCardInfo", "getDefaultBusCardId", "busCardId", "oldBusCardId", "setDefaultBusCard", "appCode", "cityName", "viewId", "checkProtocol", "", "protcolId", "agreeProtocol", "deleteBusCard", "revertBusCard", "loadXiaoNotice", "loadBusBannerData", "isSupportBannerView", "checkHasVerifiedPhone", "cardNo", "getOpenFeeStatus", "applyRefundOpenFee", "isMiSzt", "hour", "minute", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "checkError", "callback", "setCardScheduleTime", "queryScheduleTimes", "deleteScheduleTimes", "isSupportTimeSwitchCard", "validateCardDate", "Lcom/huami/wallet/lib/api/WalletDataSource;", "e", "Lcom/huami/wallet/lib/api/WalletDataSource;", "getWalletDataSource", "()Lcom/huami/wallet/lib/api/WalletDataSource;", "setWalletDataSource", "(Lcom/huami/wallet/lib/api/WalletDataSource;)V", "walletDataSource", "Lcom/huami/wallet/ui/repository/BusCardRepo;", "f", "Lcom/huami/wallet/ui/repository/BusCardRepo;", "busCardRepo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/nfc/bus/entities/ReturnCardReason;", "g", "Landroidx/lifecycle/MutableLiveData;", "getTestLiveData", "()Landroidx/lifecycle/MutableLiveData;", "testLiveData", "Lcom/huami/nfc/bus/entities/PayAuthorizationInfo;", "h", "getAuthorizationLiveData", "authorizationLiveData", "Lcom/huami/wallet/ui/entity/BusCardDetailAndBalance;", "i", "getCardDetailAndBalanceLiveData", "cardDetailAndBalanceLiveData", "Ljava/util/HashMap;", z.j, "Ljava/util/HashMap;", "busCardDetailCache", hl.k, "getDefaultBusCardIdLiveData", "defaultBusCardIdLiveData", "Landroidx/lifecycle/MediatorLiveData;", "l", "Landroidx/lifecycle/MediatorLiveData;", "getChangeDefaultCardResultLiveData", "()Landroidx/lifecycle/MediatorLiveData;", "changeDefaultCardResultLiveData", "m", "getDeleteCardLiveData", "deleteCardLiveData", GoogleApiAvailabilityLight.b, "getRevertCardLiveData", "revertCardLiveData", "", "Lcom/huami/wallet/lib/entity/XiaomiNotice;", "o", "getXiaomiNoticesLiveData", "xiaomiNoticesLiveData", "Lcom/huami/wallet/lib/entity/CarouseInfo;", b.r, "getBusBannerDataLiveData", "busBannerDataLiveData", DTransferConstants.SEARCH_KEY, "getVerifiedPhoneLiveData", "verifiedPhoneLiveData", "Lcom/huami/wallet/lib/entity/BusOpenFeeStateEntity;", "r", "getOpenFeeStateLiveData", "openFeeStateLiveData", "Lcom/huami/wallet/lib/entity/BusRefundOpenFeeEntity;", SOAP.XMLNS, "getRefundOpenFeeLiveData", "refundOpenFeeLiveData", "t", "getCardScheduleTimesLiveData", "cardScheduleTimesLiveData", "u", "getDeleteCardScheduleTimeResultLiveData", "deleteCardScheduleTimeResultLiveData", "v", "getSetCardScheduleTimeResultLiveData", "setCardScheduleTimeResultLiveData", "w", "isSupportTimeSwitchCardLiveData", "x", "getValidateCardDateLiveData", "validateCardDateLiveData", "Lio/reactivex/disposables/Disposable;", "y", "Lio/reactivex/disposables/Disposable;", "updateCardInfoDisposable", "z", "cardDetailAndBalanceDisposable", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "setDefaultCardDisposable", "B", "defaultCardDisposable", "C", "deleteCardDisposable", LogUtil.D, "revertCardDisposable", "E", "xiaoNoticeDisposable", "F", "busBannerDataDisposable", "G", "mCheckPhoneDisposable", "H", "openFeeStateDisposable", LogUtil.I, "refundOpenFeeDisposable", "J", "testDisposable", "K", "authorizationDisposable", "L", "cardScheduleTimesDisposable", "M", "deleteCardScheduleTimeResultDisposable", "N", "setCardScheduleTimeResultDisposable", "O", "isSupportTimeSwitchCardDisposable", "P", "validateCardDateDisposable", "Q", "mCheckProtocolDisposable", "Landroid/util/Pair;", "Lcom/huami/wallet/lib/entity/Protocol;", "R", "isNeedShowProtocol", ExifInterface.LATITUDE_SOUTH, "mAgreeProtocolDisposable", ExifInterface.GPS_DIRECTION_TRUE, "getAgreeProtocolLiveData", "agreeProtocolLiveData", "b", "<init>", "(Lcom/huami/wallet/ui/repository/BusCardRepo;)V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BusCardDetailViewModel extends BaseViewModel {
    public static final int CARD_TIME_SWITCH_MAX_TIMES = 5;
    public static final int CARD_TIME_SWITCH_REPEAT_SET = 66;
    public static final int CARD_TIME_SWITCH_REPEAT_SET_ANOTHER = 53;
    public static final int ERROR_MAX_TIMES = 2;
    public static final int ERROR_NULL = 0;
    public static final int ERROR_REPEAT_TIME = 1;

    @NotNull
    public static final String TAG = "Wallet-BusCardDetailViewModel";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private Disposable setDefaultCardDisposable;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    private Disposable defaultCardDisposable;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    private Disposable deleteCardDisposable;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    private Disposable revertCardDisposable;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    private Disposable xiaoNoticeDisposable;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    private Disposable busBannerDataDisposable;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    private Disposable mCheckPhoneDisposable;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    private Disposable openFeeStateDisposable;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    private Disposable refundOpenFeeDisposable;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    private Disposable testDisposable;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @Nullable
    private Disposable authorizationDisposable;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @Nullable
    private Disposable cardScheduleTimesDisposable;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @Nullable
    private Disposable deleteCardScheduleTimeResultDisposable;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @Nullable
    private Disposable setCardScheduleTimeResultDisposable;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @Nullable
    private Disposable isSupportTimeSwitchCardDisposable;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @Nullable
    private Disposable validateCardDateDisposable;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @Nullable
    private Disposable mCheckProtocolDisposable;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @Nullable
    private Disposable mAgreeProtocolDisposable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private WalletDataSource walletDataSource;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private BusCardRepo busCardRepo;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    private Disposable updateCardInfoDisposable;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private Disposable cardDetailAndBalanceDisposable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<ReturnCardReason>> testLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<PayAuthorizationInfo>> authorizationLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<BusCardDetailAndBalance>> cardDetailAndBalanceLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final HashMap<String, BusCardDetail> busCardDetailCache = new HashMap<>();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<String>> defaultBusCardIdLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Resource<String>> changeDefaultCardResultLiveData = new MediatorLiveData<>();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<String>> deleteCardLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<String>> revertCardLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<List<XiaomiNotice>>> xiaomiNoticesLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<List<CarouseInfo>>> busBannerDataLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<String>> verifiedPhoneLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<BusOpenFeeStateEntity>> openFeeStateLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<BusRefundOpenFeeEntity>> refundOpenFeeLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<List<CardScheduleTime>>> cardScheduleTimesLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Boolean>> deleteCardScheduleTimeResultLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Boolean>> setCardScheduleTimeResultLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> isSupportTimeSwitchCardLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<String>> validateCardDateLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Integer, Resource<Protocol>>> isNeedShowProtocol = new MutableLiveData<>();

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Integer, Resource<String>>> agreeProtocolLiveData = new MutableLiveData<>();

    public BusCardDetailViewModel(@NotNull BusCardRepo busCardRepo) {
        this.walletDataSource = busCardRepo.getDataSource();
        this.busCardRepo = busCardRepo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(Resource resource) {
        HMLog.i(TAG, Intrinsics.stringPlus("已展开的卡片详细信息的加载状态：", resource.status), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resource B0(BusCardDetailViewModel busCardDetailViewModel, String str) {
        return busCardDetailViewModel.y0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Publisher C0(final BusCardDetailViewModel busCardDetailViewModel, final String str, final Resource resource) {
        if (resource.status != Status.SUCCESS) {
            return Flowable.just(resource.map(null));
        }
        BusCardDetail busCardDetail = (BusCardDetail) resource.data;
        return Flowable.fromPublisher((busCardDetail != null ? Boolean.valueOf(busCardDetail.isBalanceFromCached) : null).booleanValue() ? busCardDetailViewModel.getWalletDataSource().loadBusCardBalance(str) : Flowable.fromCallable(new Callable() { // from class: mc0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BusCardDetailViewModel.D0(str, resource);
            }
        })).doOnNext(new Consumer() { // from class: qb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.E0((Resource) obj);
            }
        }).filter(new Predicate() { // from class: jc0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return BusCardDetailViewModel.F0((Resource) obj);
            }
        }).doOnNext(new Consumer() { // from class: dc0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.G0(resource, busCardDetailViewModel, str, (Resource) obj);
            }
        }).map(new Function() { // from class: hc0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BusCardDetailViewModel.H0(str, resource, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Resource D0(String str, Resource resource) {
        BusCardBalance busCardBalance = new BusCardBalance();
        busCardBalance.id = str;
        BusCardDetail busCardDetail = (BusCardDetail) resource.data;
        busCardBalance.balance = (busCardDetail == null ? null : Integer.valueOf(busCardDetail.balance)).intValue();
        return Resource.success(busCardBalance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(Resource resource) {
        HMLog.i(TAG, Intrinsics.stringPlus("已展开的卡片余额的加载状态：", resource.status), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F0(Resource resource) {
        return resource.isCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void G0(Resource resource, BusCardDetailViewModel busCardDetailViewModel, String str, Resource resource2) {
        BusCardBalance busCardBalance;
        String strValueOf = String.valueOf((resource2 == null || (busCardBalance = (BusCardBalance) resource2.data) == null) ? null : Integer.valueOf(busCardBalance.balance));
        BusCardDetail busCardDetail = (BusCardDetail) resource.data;
        String strValueOf2 = String.valueOf(busCardDetail == null ? null : Long.valueOf(busCardDetail.activeDate));
        BusCardDetail busCardDetail2 = (BusCardDetail) resource.data;
        String strValueOf3 = String.valueOf(busCardDetail2 == null ? null : busCardDetail2.number);
        BusCardDetail busCardDetail3 = (BusCardDetail) resource.data;
        busCardDetailViewModel.getWalletDataSource().uploadCardInfo(new NFCCardInfoEntity(strValueOf, strValueOf2, strValueOf3, String.valueOf(busCardDetail3 != null ? Long.valueOf(busCardDetail3.expireDate) : null), System.currentTimeMillis() / ((long) 1000)), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resource H0(final String str, final Resource resource, Resource resource2) {
        return resource2.map(new com.huami.wallet.lib.util.Function() { // from class: sb0
            @Override // com.huami.wallet.lib.util.Function
            public final Object apply(Object obj) {
                return BusCardDetailViewModel.I0(str, resource, (BusCardBalance) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final BusCardDetailAndBalance I0(String str, Resource resource, BusCardBalance busCardBalance) {
        BusCardDetailAndBalance busCardDetailAndBalance = new BusCardDetailAndBalance();
        busCardDetailAndBalance.id = str;
        busCardDetailAndBalance.detail = (BusCardDetail) resource.data;
        busCardDetailAndBalance.balance = busCardBalance;
        return busCardDetailAndBalance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resource J0(final String str, Resource resource) {
        return resource.data == 0 ? resource.map(new com.huami.wallet.lib.util.Function() { // from class: wa0
            @Override // com.huami.wallet.lib.util.Function
            public final Object apply(Object obj) {
                return BusCardDetailViewModel.K0(str, (BusCardDetailAndBalance) obj);
            }
        }) : resource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BusCardDetailAndBalance K0(String str, BusCardDetailAndBalance busCardDetailAndBalance) {
        BusCardDetailAndBalance busCardDetailAndBalance2 = new BusCardDetailAndBalance();
        busCardDetailAndBalance2.id = str;
        return busCardDetailAndBalance2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(BusCardDetailViewModel busCardDetailViewModel, Resource resource) {
        busCardDetailViewModel.getCardDetailAndBalanceLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(Throwable th) {
        HMLog.w(TAG, th, "加载卡详情发生错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N0(BusCardDetailViewModel busCardDetailViewModel, Resource resource) {
        busCardDetailViewModel.getXiaomiNoticesLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(Throwable th) {
        HMLog.w(TAG, th, "getXiaoNotice时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(BusCardDetailViewModel busCardDetailViewModel, Resource resource) {
        busCardDetailViewModel.getCardScheduleTimesLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q0(BusCardDetailViewModel busCardDetailViewModel, Throwable th) {
        busCardDetailViewModel.getCardScheduleTimesLiveData().setValue(Resource.error("queryScheduleTimes时发生错误", null));
        HMLog.w(TAG, th, "queryScheduleTimes时发生错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R0(BusCardDetailViewModel busCardDetailViewModel, Resource resource) {
        busCardDetailViewModel.getRevertCardLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S0(BusCardDetailViewModel busCardDetailViewModel, String str, Throwable th) {
        busCardDetailViewModel.getRevertCardLiveData().setValue(Resource.error(null, null, null));
        HMLog.w(TAG, th, Intrinsics.stringPlus("删除公交卡时发生了意外错误, busCardId:", str), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T0(BusCardDetailViewModel busCardDetailViewModel, CardScheduleTime cardScheduleTime, Resource resource) {
        List<CardScheduleTime> list;
        busCardDetailViewModel.getSetCardScheduleTimeResultLiveData().setValue(resource);
        if (resource.isSuccessful()) {
            Resource<List<CardScheduleTime>> value = busCardDetailViewModel.getCardScheduleTimesLiveData().getValue();
            List arrayList = null;
            if (value != null && (list = value.data) != null) {
                arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(cardScheduleTime);
            busCardDetailViewModel.getCardScheduleTimesLiveData().postValue(Resource.success(arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U0(BusCardDetailViewModel busCardDetailViewModel, Throwable th) {
        busCardDetailViewModel.getSetCardScheduleTimeResultLiveData().setValue(Resource.error("setCardScheduleTime时发生错误", Boolean.FALSE));
        HMLog.w(TAG, th, "setCardScheduleTime时发生错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resource V0(final String str, Resource resource) {
        return resource.map(new com.huami.wallet.lib.util.Function() { // from class: hb0
            @Override // com.huami.wallet.lib.util.Function
            public final Object apply(Object obj) {
                return BusCardDetailViewModel.W0(str, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String W0(String str, Object obj) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X0(BusCardDetailViewModel busCardDetailViewModel, Resource resource) {
        if (resource.status == Status.SUCCESS) {
            busCardDetailViewModel.getDefaultBusCardIdLiveData().setValue(resource);
        }
        busCardDetailViewModel.getChangeDefaultCardResultLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y0(Throwable th) {
        HMLog.e(TAG, th, "设置默认卡异常", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z0(Resource resource) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a1(Throwable th) {
        HMLog.e(TAG, th, "更新卡名称 发生错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b1(BusCardDetailViewModel busCardDetailViewModel, Resource resource) {
        busCardDetailViewModel.getValidateCardDateLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(BusCardDetailViewModel busCardDetailViewModel, int i, Resource resource) {
        busCardDetailViewModel.getAgreeProtocolLiveData().setValue(new Pair<>(Integer.valueOf(i), resource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(Throwable th) {
        HMLog.w(TAG, th, "agreeProtocol时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(BusCardDetailViewModel busCardDetailViewModel, Resource resource) {
        busCardDetailViewModel.getRefundOpenFeeLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(Throwable th) {
        HMLog.w(TAG, th, "applyRefundOpenFee时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(BusCardDetailViewModel busCardDetailViewModel, Resource resource) {
        busCardDetailViewModel.getVerifiedPhoneLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(Throwable th) {
        HMLog.w(TAG, th, "获取用户当前已验证过短信验证码的手机号时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(BusCardDetailViewModel busCardDetailViewModel, int i, Resource resource) {
        busCardDetailViewModel.isNeedShowProtocol().setValue(new Pair<>(Integer.valueOf(i), resource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(Throwable th) {
        HMLog.w(TAG, th, "checkProtocol时发生了意外的错误", new Object[0]);
    }

    private final int l0(CardScheduleTime cardScheduleTime) {
        Resource<List<CardScheduleTime>> value = this.cardScheduleTimesLiveData.getValue();
        List<CardScheduleTime> list = value == null ? null : value.data;
        if ((list == null ? 0 : list.size()) + 1 > 5) {
            return 2;
        }
        return list != null && list.contains(cardScheduleTime) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(BusCardDetailViewModel busCardDetailViewModel, Resource resource) {
        busCardDetailViewModel.getDeleteCardLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(BusCardDetailViewModel busCardDetailViewModel, String str, Throwable th) {
        busCardDetailViewModel.getDeleteCardLiveData().setValue(Resource.error(null, null, null));
        HMLog.w(TAG, th, Intrinsics.stringPlus("删除公交卡时发生了意外错误, busCardId:", str), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(BusCardDetailViewModel busCardDetailViewModel, CardScheduleTime cardScheduleTime, Resource resource) {
        List<CardScheduleTime> list;
        busCardDetailViewModel.getDeleteCardScheduleTimeResultLiveData().setValue(resource);
        if (resource.isSuccessful()) {
            Resource<List<CardScheduleTime>> value = busCardDetailViewModel.getCardScheduleTimesLiveData().getValue();
            List mutableList = null;
            if (value != null && (list = value.data) != null) {
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
            }
            if (mutableList == null) {
                return;
            }
            mutableList.remove(cardScheduleTime);
            busCardDetailViewModel.getCardScheduleTimesLiveData().postValue(Resource.success(mutableList));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(BusCardDetailViewModel busCardDetailViewModel, Throwable th) {
        busCardDetailViewModel.getDeleteCardScheduleTimeResultLiveData().setValue(Resource.error("queryScheduleTimes时发生错误", Boolean.FALSE));
        HMLog.w(TAG, th, "queryScheduleTimes时发生错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(BusCardDetailViewModel busCardDetailViewModel, Resource resource) {
        busCardDetailViewModel.getDefaultBusCardIdLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(Throwable th) {
        HMLog.e(TAG, th, "查询是否有默认卡时发送了意料之外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(BusCardDetailViewModel busCardDetailViewModel, Resource resource) {
        busCardDetailViewModel.getOpenFeeStateLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(Throwable th) {
        HMLog.w(TAG, th, "getOpenFeeStatus时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean u0(BusCardDetailViewModel busCardDetailViewModel) {
        return Boolean.valueOf(busCardDetailViewModel.getWalletDataSource().isSupportTimeSwitchCard());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(BusCardDetailViewModel busCardDetailViewModel, Boolean bool) {
        busCardDetailViewModel.isSupportTimeSwitchCardLiveData().setValue(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(BusCardDetailViewModel busCardDetailViewModel, Resource resource) {
        busCardDetailViewModel.getBusBannerDataLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(Throwable th) {
        HMLog.w(TAG, th, "loadBusBannerData时发生了意外的错误", new Object[0]);
    }

    private final Resource<BusCardDetail> y0(String cardId) {
        BusCardDetail busCardDetail;
        BusCardDetail busCardDetail2 = this.busCardDetailCache.get(cardId);
        if (busCardDetail2 != null) {
            HMLog.i(TAG, "已展开的卡片详细信息的从缓存中读取成功", new Object[0]);
            busCardDetail2.isBalanceFromCached = true;
            return Resource.success(busCardDetail2);
        }
        Resource<BusCardDetail> resource = (Resource) Flowable.fromPublisher(this.walletDataSource.loadBusCardDetailInfo(cardId)).doOnNext(new Consumer() { // from class: pb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.A0((Resource) obj);
            }
        }).filter(new Predicate() { // from class: ic0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return BusCardDetailViewModel.z0((Resource) obj);
            }
        }).blockingFirst(null);
        if (resource == null) {
            HMLog.w(TAG, Intrinsics.stringPlus("没有获取到已展开的卡片详细信息, busCardId:", cardId), new Object[0]);
            return Resource.error("w10000", "没有获取到已展开的卡片详细信息", null);
        }
        if (resource.status == Status.SUCCESS && (busCardDetail = resource.data) != null) {
            BusCardDetail busCardDetail3 = busCardDetail;
            this.busCardDetailCache.put(busCardDetail3.id, busCardDetail3);
        }
        return resource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z0(Resource resource) {
        return resource.isCompleted();
    }

    public final void agreeProtocol(final int viewId, @NotNull String appCode, long protcolId) {
        this.mAgreeProtocolDisposable = Flowable.fromPublisher(this.walletDataSource.agreeProtocol(appCode, protcolId)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: ib0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.d0(this.a, viewId, (Resource) obj);
            }
        }, new Consumer() { // from class: ac0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.e0((Throwable) obj);
            }
        });
    }

    public final void applyRefundOpenFee(@NotNull String appCode, @NotNull String cardNo) {
        this.refundOpenFeeDisposable = Flowable.fromPublisher(this.walletDataSource.applyRefundOpenFee(appCode, cardNo)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: qc0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.f0(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: xb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.g0((Throwable) obj);
            }
        });
    }

    public final void checkHasVerifiedPhone() {
        this.mCheckPhoneDisposable = Flowable.fromPublisher(this.walletDataSource.loadVerifiedPhone()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: xa0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.h0(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: cc0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.i0((Throwable) obj);
            }
        });
    }

    public final void checkProtocol(@NotNull String appCode, @NotNull String cityName, final int viewId) {
        this.mCheckProtocolDisposable = Flowable.fromPublisher(this.walletDataSource.getProtocol(appCode, cityName, "RECHARGE")).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: jb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.j0(this.a, viewId, (Resource) obj);
            }
        }, new Consumer() { // from class: yb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.k0((Throwable) obj);
            }
        });
    }

    public final void deleteBusCard(@NotNull final String busCardId) {
        Disposable disposable;
        Disposable disposable2 = this.deleteCardDisposable;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.deleteCardDisposable) != null) {
            disposable.dispose();
        }
        this.deleteCardDisposable = this.busCardRepo.deleteBusCard(busCardId).startWith(Resource.loading(null)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: oc0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.m0(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: nb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.n0(this.a, busCardId, (Throwable) obj);
            }
        });
    }

    public final void deleteScheduleTimes(@NotNull final CardScheduleTime cardScheduleTime) {
        this.deleteCardScheduleTimeResultDisposable = Flowable.fromPublisher(this.walletDataSource.deleteCardScheduleTime(cardScheduleTime)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: lb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.o0(this.a, cardScheduleTime, (Resource) obj);
            }
        }, new Consumer() { // from class: fb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.p0(this.a, (Throwable) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Pair<Integer, Resource<String>>> getAgreeProtocolLiveData() {
        return this.agreeProtocolLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<PayAuthorizationInfo>> getAuthorizationLiveData() {
        return this.authorizationLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<List<CarouseInfo>>> getBusBannerDataLiveData() {
        return this.busBannerDataLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<BusCardDetailAndBalance>> getCardDetailAndBalanceLiveData() {
        return this.cardDetailAndBalanceLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<List<CardScheduleTime>>> getCardScheduleTimesLiveData() {
        return this.cardScheduleTimesLiveData;
    }

    @NotNull
    public final MediatorLiveData<Resource<String>> getChangeDefaultCardResultLiveData() {
        return this.changeDefaultCardResultLiveData;
    }

    public final void getDefaultBusCardId() {
        Disposable disposable;
        Disposable disposable2 = this.defaultCardDisposable;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.defaultCardDisposable) != null) {
            disposable.dispose();
        }
        this.defaultCardDisposable = Flowable.fromPublisher(this.walletDataSource.getDefaultBusCardId()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: za0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.q0(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: bc0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.r0((Throwable) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getDefaultBusCardIdLiveData() {
        return this.defaultBusCardIdLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getDeleteCardLiveData() {
        return this.deleteCardLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<Boolean>> getDeleteCardScheduleTimeResultLiveData() {
        return this.deleteCardScheduleTimeResultLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<BusOpenFeeStateEntity>> getOpenFeeStateLiveData() {
        return this.openFeeStateLiveData;
    }

    public final void getOpenFeeStatus(@NotNull String appCode, @NotNull String cardNo) {
        this.openFeeStateDisposable = Flowable.fromPublisher(this.walletDataSource.getOpenFeeStatus(appCode, cardNo)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: rc0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.s0(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: vb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.t0((Throwable) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Resource<BusRefundOpenFeeEntity>> getRefundOpenFeeLiveData() {
        return this.refundOpenFeeLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getRevertCardLiveData() {
        return this.revertCardLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<Boolean>> getSetCardScheduleTimeResultLiveData() {
        return this.setCardScheduleTimeResultLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<ReturnCardReason>> getTestLiveData() {
        return this.testLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getValidateCardDateLiveData() {
        return this.validateCardDateLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getVerifiedPhoneLiveData() {
        return this.verifiedPhoneLiveData;
    }

    @NotNull
    public final WalletDataSource getWalletDataSource() {
        return this.walletDataSource;
    }

    @NotNull
    public final MutableLiveData<Resource<List<XiaomiNotice>>> getXiaomiNoticesLiveData() {
        return this.xiaomiNoticesLiveData;
    }

    public final boolean isMiDevice() {
        return this.walletDataSource.isForMi();
    }

    public final boolean isMiSzt(@NotNull String appCode) {
        return this.walletDataSource.isForMi() && Intrinsics.areEqual(appCode, ConstantKt.APP_CODE_SHEN_ZHEN_MOT);
    }

    @NotNull
    public final MutableLiveData<Pair<Integer, Resource<Protocol>>> isNeedShowProtocol() {
        return this.isNeedShowProtocol;
    }

    public final boolean isSupportBannerView() {
        return this.walletDataSource.isSupportBannerView();
    }

    public final void isSupportTimeSwitchCard() {
        this.isSupportTimeSwitchCardDisposable = Flowable.fromCallable(new Callable() { // from class: kc0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BusCardDetailViewModel.u0(this.a);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: db0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.v0(this.a, (Boolean) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Boolean> isSupportTimeSwitchCardLiveData() {
        return this.isSupportTimeSwitchCardLiveData;
    }

    public final void loadBusBannerData(@NotNull String appCode) {
        Disposable disposable;
        Disposable disposable2 = this.busBannerDataDisposable;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.busBannerDataDisposable) != null) {
            disposable.dispose();
        }
        this.busBannerDataDisposable = Flowable.fromPublisher(this.walletDataSource.getCarouselList(appCode)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: ya0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.w0(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: tb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.x0((Throwable) obj);
            }
        });
    }

    public final void loadCardDetailAndBalance(@NotNull final String cardId) {
        Disposable disposable;
        HMLog.w(TAG, "loadOpenedBusCards", new Object[0]);
        Disposable disposable2 = this.cardDetailAndBalanceDisposable;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.cardDetailAndBalanceDisposable) != null) {
            disposable.dispose();
        }
        this.cardDetailAndBalanceDisposable = Flowable.fromCallable(new Callable() { // from class: lc0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BusCardDetailViewModel.B0(this.a, cardId);
            }
        }).flatMap(new Function() { // from class: ec0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BusCardDetailViewModel.C0(this.a, cardId, (Resource) obj);
            }
        }).startWith(new Resource(Status.LOADING, "", "", null)).map(new Function() { // from class: fc0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BusCardDetailViewModel.J0(cardId, (Resource) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: sc0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.L0(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: wb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.M0((Throwable) obj);
            }
        });
    }

    public final void loadXiaoNotice() {
        Disposable disposable;
        Disposable disposable2 = this.xiaoNoticeDisposable;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.xiaoNoticeDisposable) != null) {
            disposable.dispose();
        }
        this.xiaoNoticeDisposable = Flowable.fromPublisher(this.walletDataSource.getXiaomiNotice()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: nc0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.N0(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: ub0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.O0((Throwable) obj);
            }
        });
    }

    @Override // com.huami.wallet.ui.viewmodel.BaseViewModel, androidx.p008lifecycle.ViewModel
    public void onCleared() {
        Disposable disposable;
        Disposable disposable2;
        Disposable disposable3;
        Disposable disposable4;
        Disposable disposable5;
        Disposable disposable6;
        Disposable disposable7;
        super.onCleared();
        Disposable disposable8 = this.cardDetailAndBalanceDisposable;
        if (disposable8 != null) {
            if (!(disposable8 == null ? null : Boolean.valueOf(disposable8.isDisposed())).booleanValue() && (disposable7 = this.cardDetailAndBalanceDisposable) != null) {
                disposable7.dispose();
            }
        }
        Disposable disposable9 = this.setDefaultCardDisposable;
        if (disposable9 != null) {
            if (!(disposable9 == null ? null : Boolean.valueOf(disposable9.isDisposed())).booleanValue() && (disposable6 = this.setDefaultCardDisposable) != null) {
                disposable6.dispose();
            }
        }
        Disposable disposable10 = this.defaultCardDisposable;
        if (disposable10 != null && !disposable10.isDisposed() && (disposable5 = this.defaultCardDisposable) != null) {
            disposable5.dispose();
        }
        Disposable disposable11 = this.xiaoNoticeDisposable;
        if (disposable11 != null && !disposable11.isDisposed() && (disposable4 = this.xiaoNoticeDisposable) != null) {
            disposable4.dispose();
        }
        Disposable disposable12 = this.openFeeStateDisposable;
        if (disposable12 != null && !disposable12.isDisposed() && (disposable3 = this.openFeeStateDisposable) != null) {
            disposable3.dispose();
        }
        Disposable disposable13 = this.refundOpenFeeDisposable;
        if (disposable13 != null && !disposable13.isDisposed() && (disposable2 = this.refundOpenFeeDisposable) != null) {
            disposable2.dispose();
        }
        Disposable disposable14 = this.revertCardDisposable;
        if (disposable14 != null && !disposable14.isDisposed() && (disposable = this.revertCardDisposable) != null) {
            disposable.dispose();
        }
        Disposable disposable15 = this.cardScheduleTimesDisposable;
        if (disposable15 != null) {
            if (!(!disposable15.isDisposed())) {
                disposable15 = null;
            }
            if (disposable15 != null) {
                disposable15.dispose();
            }
        }
        Disposable disposable16 = this.setCardScheduleTimeResultDisposable;
        if (disposable16 != null) {
            if (!(!disposable16.isDisposed())) {
                disposable16 = null;
            }
            if (disposable16 != null) {
                disposable16.dispose();
            }
        }
        Disposable disposable17 = this.deleteCardScheduleTimeResultDisposable;
        if (disposable17 != null) {
            if (!(!disposable17.isDisposed())) {
                disposable17 = null;
            }
            if (disposable17 != null) {
                disposable17.dispose();
            }
        }
        Disposable disposable18 = this.isSupportTimeSwitchCardDisposable;
        if (disposable18 == null) {
            return;
        }
        Disposable disposable19 = disposable18.isDisposed() ^ true ? disposable18 : null;
        if (disposable19 == null) {
            return;
        }
        disposable19.dispose();
    }

    public final void queryScheduleTimes(@NotNull String cardId) {
        WalletDataSource walletDataSource = this.walletDataSource;
        this.cardScheduleTimesDisposable = Flowable.fromPublisher(walletDataSource.queryCardScheduleTime(AppletType.BUS, walletDataSource.getAid(cardId))).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: pc0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.P0(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: gb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.Q0(this.a, (Throwable) obj);
            }
        });
    }

    public final void revertBusCard(@NotNull final String busCardId) {
        this.revertCardDisposable = this.busCardRepo.deleteBusCard(busCardId).startWith(Resource.loading(null)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: bb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.R0(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: mb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.S0(this.a, busCardId, (Throwable) obj);
            }
        });
    }

    public final void setCardScheduleTime(@NotNull String cardId, int hour, int minute, @NotNull Function1<? super Integer, Unit> callback) {
        String lowerCase;
        String aid = this.walletDataSource.getAid(cardId);
        final CardScheduleTime cardScheduleTime = new CardScheduleTime(AppletType.BUS.getBleValue(), (aid == null || (lowerCase = aid.toLowerCase()) == null) ? "" : lowerCase, 2L, hour, minute);
        int iL0 = l0(cardScheduleTime);
        if (iL0 != 0) {
            callback.invoke(Integer.valueOf(iL0));
        } else {
            this.setCardScheduleTimeResultDisposable = Flowable.fromPublisher(this.walletDataSource.setCardScheduleTime(cardScheduleTime)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: kb0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BusCardDetailViewModel.T0(this.a, cardScheduleTime, (Resource) obj);
                }
            }, new Consumer() { // from class: eb0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BusCardDetailViewModel.U0(this.a, (Throwable) obj);
                }
            });
        }
    }

    public final void setDefaultBusCard(@NotNull final String busCardId, @io.reactivex.annotations.Nullable @Nullable String oldBusCardId) {
        Disposable disposable;
        Disposable disposable2 = this.setDefaultCardDisposable;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.setDefaultCardDisposable) != null) {
            disposable.dispose();
        }
        this.setDefaultCardDisposable = Flowable.fromPublisher(this.walletDataSource.setDefaultBusCard(busCardId, oldBusCardId)).map(new Function() { // from class: gc0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BusCardDetailViewModel.V0(busCardId, (Resource) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: cb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.X0(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: rb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.Y0((Throwable) obj);
            }
        });
    }

    public final void setWalletDataSource(@NotNull WalletDataSource walletDataSource) {
        this.walletDataSource = walletDataSource;
    }

    public final void updateCardInfo(@NotNull String cardName, @NotNull String aid) {
        Disposable disposable;
        Disposable disposable2 = this.updateCardInfoDisposable;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.updateCardInfoDisposable) != null) {
            disposable.dispose();
        }
        this.updateCardInfoDisposable = Flowable.fromPublisher(this.walletDataSource.updateCardName(cardName, aid)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: ob0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.Z0((Resource) obj);
            }
        }, new Consumer() { // from class: zb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.a1((Throwable) obj);
            }
        });
    }

    public final void validateCardDate() {
        BusCardDetailAndBalance busCardDetailAndBalance;
        BusCardDetail busCardDetail;
        if (this.cardDetailAndBalanceLiveData.getValue() == null) {
            return;
        }
        Resource<BusCardDetailAndBalance> value = this.cardDetailAndBalanceLiveData.getValue();
        Objects.requireNonNull(value, "null cannot be cast to non-null type com.huami.wallet.lib.entity.Resource<com.huami.wallet.ui.entity.BusCardDetailAndBalance>");
        Resource<BusCardDetailAndBalance> resource = value;
        if (!resource.isSuccessful() || (busCardDetailAndBalance = resource.data) == null || (busCardDetail = busCardDetailAndBalance.detail) == null) {
            return;
        }
        this.validateCardDateDisposable = Flowable.fromPublisher(getWalletDataSource().validateCardDate(busCardDetail.activeDate, busCardDetail.expireDate)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: ab0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardDetailViewModel.b1(this.a, (Resource) obj);
            }
        });
    }
}
