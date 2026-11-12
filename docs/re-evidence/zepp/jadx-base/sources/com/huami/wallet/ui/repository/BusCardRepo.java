package com.huami.wallet.ui.repository;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.BusSiteInfo;
import com.huami.wallet.lib.entity.NFCTransEntity;
import com.huami.wallet.lib.entity.Order;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.ui.function.Consumer;
import com.huami.wallet.ui.function.Function;
import com.huami.wallet.ui.function.Supplier;
import com.huami.wallet.ui.repository.BusCardRepo;
import com.huami.wallet.ui.utils.AnalyticConst;
import com.huami.wallet.ui.utils.ErrorMsgUtils;
import defpackage.oe0;
import io.reactivex.Flowable;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes16.dex */
public class BusCardRepo {
    private static final String b = "Wallet-BusCardRepo";
    private final Context a;
    public final WalletDataSource mDataSource;

    public static class OpenCardResult {
        public String a;
        public String b;
        public String busCardId;
        public String c;
        public String d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;
        public String orderId;
        public String rawMsg;
        public String uiErrorMsg;
    }

    public BusCardRepo(Context context, WalletDataSource walletDataSource) {
        this.a = context;
        this.mDataSource = walletDataSource;
    }

    private Flowable<OpenCardResult> K(final boolean z, final String str, String str2, final Order order, final Function<Throwable, Function<Resource<?>, Consumer<String>>> function, final Function<Resource<?>, Consumer<String>> function2, final Consumer<String> consumer, final OpenCardResult openCardResult) {
        return Flowable.fromPublisher(z ? this.mDataSource.chargeToDevice(str, str2) : Flowable.just(Resource.success(""))).filter(oe0.a).doOnNext(new io.reactivex.functions.Consumer() { // from class: vd0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BusCardRepo.L(z, consumer, function2, (Resource) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: de0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.N(str, order, function, function2, consumer, (Resource) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: ee0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.O(str, function2, consumer, openCardResult, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(boolean z, Consumer consumer, Function function, Resource resource) throws Exception {
        if (resource.status != Status.SUCCESS) {
            ((Consumer) function.apply(resource)).accept("充值信息未能成功写入设备");
        } else if (z) {
            consumer.accept("充值信息已成功写入设备");
        } else {
            consumer.accept("无需充值");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Resource M(Resource resource, Boolean bool) throws Exception {
        return resource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Publisher N(String str, Order order, Function function, Function function2, Consumer consumer, final Resource resource) throws Exception {
        return x0(str, order, function, function2, consumer).map(new io.reactivex.functions.Function() { // from class: zd0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BusCardRepo.M(resource, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String P(String str, Resource resource, String str2) {
        Locale locale = Locale.CHINA;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (!TextUtils.isEmpty((CharSequence) resource.data)) {
            str2 = str2 + ((String) resource.data);
        }
        objArr[1] = str2;
        return String.format(locale, "code: %s, msg: %s", objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Function Q(final Resource resource, final String str) {
        return new Function() { // from class: te0
            @Override // com.huami.wallet.ui.function.Function
            public final Object apply(Object obj) {
                return BusCardRepo.P(str, resource, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean R(Resource resource) throws Exception {
        return resource.status == Status.SUCCESS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String S(Resource resource) throws Exception {
        return (String) resource.data;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String T(Throwable th) throws Exception {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String U() {
        return (String) Flowable.fromPublisher(this.mDataSource.loadCplc()).filter(new Predicate() { // from class: qe0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return BusCardRepo.R((Resource) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: le0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BusCardRepo.S((Resource) obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: me0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BusCardRepo.T((Throwable) obj);
            }
        }).blockingFirst("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(String str, String str2, final Resource resource) throws Exception {
        if (resource.isCompleted()) {
            Function function = new Function() { // from class: je0
                @Override // com.huami.wallet.ui.function.Function
                public final Object apply(Object obj) {
                    return BusCardRepo.Q(resource, (String) obj);
                }
            };
            Supplier supplier = new Supplier() { // from class: xe0
                @Override // com.huami.wallet.ui.function.Supplier
                public final Object get() {
                    return this.a.U();
                }
            };
            HashMap map = new HashMap(2);
            map.put(AnalyticConst.ParamKey.CITY, str);
            map.put("DeviceSource", this.mDataSource.getDeviceModel());
            Status status = resource.status;
            if (status == Status.SUCCESS) {
                Analytics.recordEvent(new CountEventBuilder(AnalyticConst.EventId.NFC_CHARGE_SUCCESS).putExtras(map));
                return;
            }
            if (status == Status.ERROR) {
                map.put("ErrorMsg", (String) ((Function) function.apply("充值失败" + resource.code)).apply(resource.message));
                map.put(AnalyticConst.ParamKey.CPLC, (String) supplier.get());
                map.put(AnalyticConst.ParamKey.ORDER_NUM, str2);
                Analytics.recordEvent(new CountEventBuilder(AnalyticConst.EventId.NFC_CHARGE_FAIL).putExtras(map));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void W(String str, Resource resource) throws Exception {
        Status status = resource.status;
        if (status == Status.SUCCESS) {
            HMLog.i(b, "已成功从设备中删除公交卡, busCardId:" + str, new Object[0]);
            return;
        }
        if (status == Status.ERROR) {
            HMLog.w(b, "未能从设备中删除公交卡, busCardId:" + str + ", code:" + resource.code + ", msg:" + resource.message, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void X(String str, String str2, String str3) {
        HMLog.i(b, String.format(Locale.CHINA, "%s. busCardId:%s, orderId:%s, ", str3, str, str2), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Y(Resource resource, Throwable th, String str, String str2, String str3) {
        HMLog.w(b, th, String.format(Locale.CHINA, "%s. busCardId:%s, orderId:%s%s", str3, str, str2, resource != null ? String.format(Locale.CHINA, ", code:%s, msg:%s", resource.code, resource.message) : ""), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Consumer Z(final Throwable th, final String str, final String str2, final Resource resource) {
        return new Consumer() { // from class: nd0
            @Override // com.huami.wallet.ui.function.Consumer
            public final void accept(Object obj) {
                BusCardRepo.Y(resource, th, str, str2, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Function a0(final String str, final String str2, final Throwable th) {
        return new Function() { // from class: we0
            @Override // com.huami.wallet.ui.function.Function
            public final Object apply(Object obj) {
                return BusCardRepo.Z(th, str, str2, (Resource) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b0(Consumer consumer, Function function, Resource resource) throws Exception {
        if (resource.status == Status.SUCCESS) {
            consumer.accept("卡片信息已成功写入设备");
        } else {
            ((Consumer) function.apply(resource)).accept("卡片信息未能成功写入设备");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Publisher c0(String str, String str2, boolean z, Order order, Function function, Function function2, Consumer consumer, Resource resource) throws Exception {
        OpenCardResult openCardResult = new OpenCardResult();
        openCardResult.rawMsg = TextUtils.isEmpty((CharSequence) resource.data) ? "" : (String) resource.data;
        openCardResult.busCardId = str;
        openCardResult.orderId = str2;
        openCardResult.e = resource.status == Status.SUCCESS;
        openCardResult.f = false;
        openCardResult.g = false;
        openCardResult.a = resource.code;
        openCardResult.c = resource.message;
        openCardResult.h = z;
        if (z && !this.mDataSource.isForMi() && this.mDataSource.isForSnowballShanghai(str).booleanValue()) {
            openCardResult.h = false;
        }
        if (openCardResult.e) {
            return K(z, str, str2, order, function, function2, consumer, openCardResult);
        }
        openCardResult.uiErrorMsg = ErrorMsgUtils.parseOpenCardErrorMsg(this.a, resource);
        return Flowable.just(openCardResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String e0(Resource resource) throws Exception {
        return (String) resource.data;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f0(Throwable th) throws Exception {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String g0() {
        return (String) Flowable.fromPublisher(this.mDataSource.loadCplc()).filter(new Predicate() { // from class: re0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return BusCardRepo.j0((Resource) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: ke0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BusCardRepo.e0((Resource) obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: ne0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BusCardRepo.f0((Throwable) obj);
            }
        }).blockingFirst("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h0(String str, OpenCardResult openCardResult, String str2) {
        return String.format(Locale.CHINA, "code: %s, msg: %s", str, str2 + openCardResult.rawMsg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Function i0(final OpenCardResult openCardResult, final String str) {
        return new Function() { // from class: ue0
            @Override // com.huami.wallet.ui.function.Function
            public final Object apply(Object obj) {
                return BusCardRepo.h0(str, openCardResult, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean j0(Resource resource) throws Exception {
        return resource.status == Status.SUCCESS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k0(Consumer consumer, Function function, Resource resource) throws Exception {
        if (resource.status == Status.SUCCESS) {
            consumer.accept("设置默认卡成功");
        } else {
            ((Consumer) function.apply(resource)).accept("设置默认卡失败");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ OpenCardResult l0(OpenCardResult openCardResult, Resource resource, Resource resource2) throws Exception {
        Status status = resource.status;
        Status status2 = Status.SUCCESS;
        openCardResult.f = status == status2;
        openCardResult.g = resource2.status == status2;
        openCardResult.uiErrorMsg = ErrorMsgUtils.parseRechargeErrorMsg(this.a, resource);
        openCardResult.b = resource.code;
        openCardResult.d = resource.message;
        return openCardResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m0(Resource resource) throws Exception {
        Status status = resource.status;
        if (status == Status.SUCCESS) {
            HMLog.i(b, "交易事件上传 获取卡号成功", new Object[0]);
        } else if (status == Status.ERROR) {
            HMLog.w(b, "交易事件上传 获取卡号失败" + resource.message, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String n0(Resource resource) throws Exception {
        return (String) resource.data;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Publisher o0(String str, List list, String str2) throws Exception {
        return this.mDataSource.uploadNfcTransEntitys(str, str2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p0(String str, Resource resource) throws Exception {
        Status status = resource.status;
        if (status == Status.SUCCESS) {
            HMLog.i(b, "交易事件上传成功", new Object[0]);
            return;
        }
        if (status == Status.ERROR) {
            HMLog.w(b, "未能从设备中删除公交卡, busCardId:" + str + ", code:" + resource.code + ", msg:" + resource.message, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q0(Throwable th) throws Exception {
        HMLog.i(b, "交易事件上传发生异常" + th.getMessage(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r0(Consumer consumer, Function function, Resource resource) throws Exception {
        if (resource.status == Status.SUCCESS) {
            consumer.accept("上传开卡记录成功");
        } else {
            ((Consumer) function.apply(resource)).accept("上传开卡记录发生错误");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean s0(Resource resource) throws Exception {
        return Boolean.valueOf(resource.status == Status.SUCCESS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Publisher t0(String str, Order order, final Consumer consumer, final Function function, Resource resource) throws Exception {
        String str2 = (String) resource.data;
        return str2 != null ? Flowable.fromPublisher(this.mDataSource.uploadTransactionRecord(str, str2, Collections.singletonList(order))).filter(oe0.a).doOnNext(new io.reactivex.functions.Consumer() { // from class: od0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BusCardRepo.r0(consumer, function, (Resource) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: he0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BusCardRepo.s0((Resource) obj);
            }
        }) : Flowable.just(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean u0(Function function, Throwable th) throws Exception {
        ((Consumer) ((Function) function.apply(th)).apply(null)).accept("上传开卡记录和绑定卡片时发生了意料之外的错误");
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void d0(final OpenCardResult openCardResult, String str, String str2) {
        Function function = new Function() { // from class: se0
            @Override // com.huami.wallet.ui.function.Function
            public final Object apply(Object obj) {
                return BusCardRepo.i0(openCardResult, (String) obj);
            }
        };
        Supplier supplier = new Supplier() { // from class: ye0
            @Override // com.huami.wallet.ui.function.Supplier
            public final Object get() {
                return this.a.g0();
            }
        };
        HashMap map = new HashMap(2);
        map.put(AnalyticConst.ParamKey.CITY, str);
        map.put("DeviceSource", this.mDataSource.getDeviceModel());
        if (!openCardResult.e) {
            map.put("ErrorMsg", (String) ((Function) function.apply("开卡失败" + openCardResult.a)).apply(openCardResult.c));
            map.put(AnalyticConst.ParamKey.CPLC, (String) supplier.get());
            map.put(AnalyticConst.ParamKey.ORDER_NUM, str2);
            Analytics.recordEvent(new CountEventBuilder(AnalyticConst.EventId.NFC_OPEN_CARD_FAIL).putExtras(map));
        }
        if (openCardResult.e && (openCardResult.f || !openCardResult.h)) {
            Analytics.recordEvent(new CountEventBuilder(AnalyticConst.EventId.NFC_OPEN_CARD_SUCCESS).putExtras(map));
        }
        if (openCardResult.e && !openCardResult.f && openCardResult.h) {
            map.put("ErrorMsg", (String) ((Function) function.apply("开卡成功，充值失败" + openCardResult.b)).apply(openCardResult.d));
            map.put(AnalyticConst.ParamKey.CPLC, (String) supplier.get());
            map.put(AnalyticConst.ParamKey.ORDER_NUM, str2);
            Analytics.recordEvent(new CountEventBuilder(AnalyticConst.EventId.NFC_OPEN_CARD_SUCCESS_BUT_CHARGE_FAIL).putExtras(map));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public Flowable<OpenCardResult> O(String str, final Function<Resource<?>, Consumer<String>> function, final Consumer<String> consumer, final OpenCardResult openCardResult, final Resource<String> resource) {
        return Flowable.fromPublisher(this.mDataSource.setDefaultBusCard(str, null)).filter(oe0.a).doOnNext(new io.reactivex.functions.Consumer() { // from class: qd0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BusCardRepo.k0(consumer, function, (Resource) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: be0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.l0(openCardResult, resource, (Resource) obj);
            }
        });
    }

    private Flowable<Boolean> x0(final String str, final Order order, final Function<Throwable, Function<Resource<?>, Consumer<String>>> function, final Function<Resource<?>, Consumer<String>> function2, final Consumer<String> consumer) {
        return Flowable.fromPublisher(this.mDataSource.loadBusCardNumber(str)).subscribeOn(Schedulers.io()).filter(oe0.a).flatMap(new io.reactivex.functions.Function() { // from class: ce0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.t0(str, order, consumer, function2, (Resource) obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: ae0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BusCardRepo.u0(function, (Throwable) obj);
            }
        });
    }

    public Flowable<Resource<String>> chargeToDevice(@NonNull final String str, @NonNull final String str2) {
        return Flowable.fromPublisher(this.mDataSource.chargeToDevice(str, str2)).subscribeOn(Schedulers.io()).doOnNext(new io.reactivex.functions.Consumer() { // from class: rd0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.V(str, str2, (Resource) obj);
            }
        });
    }

    public Flowable<Resource<String>> deleteBusCard(final String str) {
        return Flowable.fromPublisher(this.mDataSource.deleteBusCard(str)).filter(oe0.a).doOnNext(new io.reactivex.functions.Consumer() { // from class: td0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BusCardRepo.W(str, (Resource) obj);
            }
        });
    }

    public WalletDataSource getDataSource() {
        return this.mDataSource;
    }

    public Resource<BusSiteInfo> getSiteInfo(String str, String str2) {
        return (Resource) Flowable.fromPublisher(this.mDataSource.getSiteInfo(str, str2)).filter(oe0.a).subscribeOn(Schedulers.io()).blockingFirst();
    }

    public boolean isForSnowballShanghai(String str) {
        return this.mDataSource.isForSnowballShanghai(str).booleanValue();
    }

    public boolean isSupportMiPay() {
        return this.mDataSource.isSupportMiuiPay();
    }

    public boolean isSupportTimeSwitchCard() {
        return this.mDataSource.isSupportTimeSwitchCard();
    }

    public Flowable<OpenCardResult> openCardToDevice(final String str, final String str2, final Order order, @NonNull String str3, final boolean z) {
        final Consumer consumer = new Consumer() { // from class: yd0
            @Override // com.huami.wallet.ui.function.Consumer
            public final void accept(Object obj) {
                BusCardRepo.X(str, str2, (String) obj);
            }
        };
        final Function function = new Function() { // from class: ve0
            @Override // com.huami.wallet.ui.function.Function
            public final Object apply(Object obj) {
                return BusCardRepo.a0(str, str2, (Throwable) obj);
            }
        };
        final Function function2 = (Function) function.apply(null);
        return Flowable.fromPublisher(this.mDataSource.issueCardToDevice(str, str2, str3)).subscribeOn(Schedulers.io()).filter(oe0.a).doOnNext(new io.reactivex.functions.Consumer() { // from class: pd0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BusCardRepo.b0(consumer, function2, (Resource) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: fe0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.c0(str, str2, z, order, function, function2, consumer, (Resource) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: sd0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.d0(str, str2, (BusCardRepo.OpenCardResult) obj);
            }
        });
    }

    @SuppressLint({"CheckResult"})
    public void upLoadNfcTradeInfo(@NonNull final String str, final List<NFCTransEntity> list) {
        Flowable.fromPublisher(this.mDataSource.loadBusCardNumber(str)).doOnNext(new io.reactivex.functions.Consumer() { // from class: wd0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BusCardRepo.m0((Resource) obj);
            }
        }).filter(new Predicate() { // from class: pe0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return ((Resource) obj).isSuccessful();
            }
        }).map(new io.reactivex.functions.Function() { // from class: ie0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BusCardRepo.n0((Resource) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: ge0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.o0(str, list, (String) obj);
            }
        }).subscribeOn(Schedulers.io()).subscribe(new io.reactivex.functions.Consumer() { // from class: ud0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BusCardRepo.p0(str, (Resource) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: xd0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BusCardRepo.q0((Throwable) obj);
            }
        });
    }
}
