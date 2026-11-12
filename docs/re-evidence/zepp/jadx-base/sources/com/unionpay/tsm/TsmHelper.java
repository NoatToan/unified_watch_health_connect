package com.unionpay.tsm;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.nfc.watch.unionpay.entity.BankCardBindStatus;
import com.huami.tools.log.HMLog;
import com.unionpay.di.ModuleKt;
import com.unionpay.entity.SupportBank;
import com.unionpay.entity.UnionPayResource;
import com.unionpay.entity.UnionPayStatus;
import com.unionpay.repo.WatchUnionpayRepo;
import com.unionpay.tsm.TsmHelper;
import com.unionpay.tsm.constant.TsmErrorMsg;
import com.unionpay.tsmservice.ITsmCallback;
import com.unionpay.tsmservice.ITsmProgressCallback;
import com.unionpay.tsmservice.UPTsmAddon;
import com.unionpay.tsmservice.data.AppUniteApplyRecord;
import com.unionpay.tsmservice.data.CardTypeListItem;
import com.unionpay.tsmservice.data.CheckBinCodeInfo;
import com.unionpay.tsmservice.data.Constant;
import com.unionpay.tsmservice.data.UniteAppDetail;
import com.unionpay.tsmservice.data.UpdateInfo;
import com.unionpay.tsmservice.request.CheckBinRequestParams;
import com.unionpay.tsmservice.request.GetActiveCodeRequestParams;
import com.unionpay.tsmservice.request.GetUniteAppListRequestParams;
import com.unionpay.tsmservice.request.InitRequestParams;
import com.unionpay.tsmservice.request.OpenUniteCardApplyActivityWithRiskInfoRequestParams;
import com.unionpay.tsmservice.request.UniteAppDeleteRequestParams;
import com.unionpay.tsmservice.request.UniteAppDownloadRequestParams;
import com.unionpay.tsmservice.request.UniteCardActiveRequestParams;
import com.unionpay.tsmservice.result.CheckBinCodeResult;
import com.unionpay.tsmservice.result.GetActivityUniteApplyResult;
import com.unionpay.tsmservice.result.GetSMSAuthCodeResult;
import com.unionpay.tsmservice.result.GetSupportedCardTypeListResult;
import com.unionpay.tsmservice.result.GetUniteAppListResult;
import com.unionpay.tsmservice.result.InitResult;
import com.unionpay.util.BankRx;
import com.unionpay.util.UnionPayUtil;
import com.unionpay.util.WatchUnionpayConfig;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
public class TsmHelper {
    private static final String f = "UnionPay-TsmHelper";
    private static final int g = 3;
    private static final String h = "DownloadProgress";
    private static TsmHelper i;
    private UPTsmAddon a;
    private UPTsmAddon.UPTsmConnectionListener b;
    private Map<String, Integer> c = new HashMap();
    private Lazy<WatchUnionpayRepo> d = KoinJavaComponent.inject(WatchUnionpayRepo.class);
    private Lazy<WatchUnionpayConfig> e = KoinJavaComponent.inject(WatchUnionpayConfig.class);

    public interface Function {
        int apply() throws RemoteException;
    }

    public class a implements UPTsmAddon.UPTsmConnectionListener {
        public final /* synthetic */ ObservableEmitter a;

        public a(ObservableEmitter observableEmitter) {
            this.a = observableEmitter;
        }

        @Override // com.unionpay.tsmservice.UPTsmAddon.UPTsmConnectionListener
        public void onTsmConnected() {
            HMLog.i(TsmHelper.f, "TsmService connected.", new Object[0]);
            TsmHelper.this.G(this.a);
        }

        @Override // com.unionpay.tsmservice.UPTsmAddon.UPTsmConnectionListener
        public void onTsmDisconnected() {
            HMLog.i(TsmHelper.f, "TsmService disconnected.", new Object[0]);
        }
    }

    public class b extends ITsmProgressCallback.Stub {
        public b() {
        }

        @Override // com.unionpay.tsmservice.ITsmProgressCallback
        public void onProgress(int i) {
        }
    }

    public class c extends ITsmCallback.Stub {
        public c() {
        }

        @Override // com.unionpay.tsmservice.ITsmCallback
        public void onError(String str, String str2) {
            HMLog.i(TsmHelper.f, "用户卡片绑定失败，删除卡片失败,<Code:" + str + ",Message:" + str2 + SearchCriteria.GT, new Object[0]);
        }

        @Override // com.unionpay.tsmservice.ITsmCallback
        public void onResult(Bundle bundle) {
            HMLog.i(TsmHelper.f, "用户卡片绑定失败，删除卡片成功", new Object[0]);
        }
    }

    public class d extends ITsmProgressCallback.Stub {
        public d() {
        }

        @Override // com.unionpay.tsmservice.ITsmProgressCallback
        public void onProgress(int i) {
        }
    }

    public class e extends ITsmProgressCallback.Stub {
        public final /* synthetic */ ObservableEmitter c;

        public e(ObservableEmitter observableEmitter) {
            this.c = observableEmitter;
        }

        @Override // com.unionpay.tsmservice.ITsmProgressCallback
        public void onProgress(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt(TsmHelper.h, i);
            this.c.onNext(UnionPayResource.loading(bundle));
        }
    }

    public static class f extends ITsmCallback.Stub {
        public ObservableEmitter<UnionPayResource<Bundle>> d;

        public f(@NonNull ObservableEmitter<UnionPayResource<Bundle>> observableEmitter) {
            this.d = observableEmitter;
        }

        @Override // com.unionpay.tsmservice.ITsmCallback
        public void onError(String str, String str2) {
            this.d.onNext(UnionPayResource.error(str, str2, null));
        }

        @Override // com.unionpay.tsmservice.ITsmCallback
        public void onResult(Bundle bundle) {
            this.d.onNext(UnionPayResource.success(bundle));
        }
    }

    private TsmHelper(@NonNull Context context) {
        this.a = UPTsmAddon.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(ObservableEmitter<UnionPayResource<Bundle>> observableEmitter) {
        a aVar = new a(observableEmitter);
        this.b = aVar;
        this.a.addConnectionListener(aVar);
        if (this.a.bind()) {
            return;
        }
        observableEmitter.onNext(UnionPayResource.error(String.valueOf(-1), "", null));
    }

    private void D(AppUniteApplyRecord appUniteApplyRecord) throws RemoteException {
        int i2 = 0;
        boolean zBindCard = false;
        while (true) {
            int i3 = i2 + 1;
            if (i2 >= 3 || zBindCard) {
                break;
            }
            zBindCard = this.d.getValue().bindCard(appUniteApplyRecord.getAppId());
            i2 = i3;
        }
        if (zBindCard) {
            return;
        }
        UniteAppDeleteRequestParams uniteAppDeleteRequestParams = new UniteAppDeleteRequestParams();
        uniteAppDeleteRequestParams.setMPanId(appUniteApplyRecord.getMPanId());
        this.a.uniteAppDelete(uniteAppDeleteRequestParams, new c(), new d());
    }

    private boolean E(@NonNull ObservableEmitter<UnionPayResource<Bundle>> observableEmitter) {
        if (!H(this.a.getContext())) {
            observableEmitter.onNext(UnionPayResource.error(String.valueOf(-100), "", null));
            return false;
        }
        if (this.e.getValue().isConnected()) {
            return true;
        }
        observableEmitter.onNext(UnionPayResource.error(String.valueOf(-101), "", null));
        return false;
    }

    private void F(@NonNull Function function, @NonNull ObservableEmitter<UnionPayResource<Bundle>> observableEmitter) {
        if (E(observableEmitter)) {
            observableEmitter.onNext(UnionPayResource.loading(null));
            try {
                int iApply = function.apply();
                if (iApply != 0) {
                    observableEmitter.onNext(UnionPayResource.error(String.valueOf(iApply), "", null));
                }
            } catch (RemoteException e2) {
                HMLog.w(f, e2.getMessage(), e2);
                observableEmitter.onNext(UnionPayResource.error(String.valueOf(-99), "", null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(final ObservableEmitter<UnionPayResource<Bundle>> observableEmitter) {
        F(new Function() { // from class: i08
            @Override // com.unionpay.tsm.TsmHelper.Function
            public final int apply() {
                return this.a.Z(observableEmitter);
            }
        }, observableEmitter);
    }

    private boolean H(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo == null || activeNetworkInfo.getState() == NetworkInfo.State.DISCONNECTED) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(final String str, final ObservableEmitter observableEmitter) throws Exception {
        F(new Function() { // from class: m08
            @Override // com.unionpay.tsm.TsmHelper.Function
            public final int apply() {
                return this.a.K(str, observableEmitter);
            }
        }, observableEmitter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnionPayResource J(UnionPayResource unionPayResource) throws Exception {
        CheckBinCodeResult checkBinCodeResult;
        T t = unionPayResource.data;
        if (t != 0) {
            Bundle bundle = (Bundle) t;
            bundle.setClassLoader(CheckBinCodeResult.class.getClassLoader());
            checkBinCodeResult = (CheckBinCodeResult) bundle.get("result");
        } else {
            checkBinCodeResult = null;
        }
        return new UnionPayResource(unionPayResource.status, unionPayResource.code, unionPayResource.message, checkBinCodeResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int K(String str, ObservableEmitter observableEmitter) throws RemoteException {
        CheckBinRequestParams checkBinRequestParams = new CheckBinRequestParams();
        checkBinRequestParams.setSPan(str);
        return this.a.checkBinCode(checkBinRequestParams, new f(observableEmitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int L(UniteAppDetail uniteAppDetail, ObservableEmitter observableEmitter, ITsmProgressCallback.Stub stub) throws RemoteException {
        UniteAppDeleteRequestParams uniteAppDeleteRequestParams = new UniteAppDeleteRequestParams();
        uniteAppDeleteRequestParams.setMPanId(uniteAppDetail.getMPanId());
        return this.a.uniteAppDelete(uniteAppDeleteRequestParams, new f(observableEmitter), stub);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(final UniteAppDetail uniteAppDetail, final ITsmProgressCallback.Stub stub, final ObservableEmitter observableEmitter) throws Exception {
        F(new Function() { // from class: pz7
            @Override // com.unionpay.tsm.TsmHelper.Function
            public final int apply() {
                return this.a.L(uniteAppDetail, observableEmitter, stub);
            }
        }, observableEmitter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(boolean z, UniteAppDetail uniteAppDetail, UnionPayResource unionPayResource) throws Exception {
        if (unionPayResource.isSuccessful() && z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(uniteAppDetail.getAppID());
            this.d.getValue().deleteCards(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ UnionPayResource O(UniteAppDetail uniteAppDetail, UnionPayResource unionPayResource) throws Exception {
        return new UnionPayResource(unionPayResource.status, unionPayResource.code, unionPayResource.message, uniteAppDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int P(String str, ObservableEmitter observableEmitter) throws RemoteException {
        UniteAppDownloadRequestParams uniteAppDownloadRequestParams = new UniteAppDownloadRequestParams();
        uniteAppDownloadRequestParams.setMPanId(str);
        return this.a.UniteAppDownload(uniteAppDownloadRequestParams, new f(observableEmitter), new e(observableEmitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(final String str, final ObservableEmitter observableEmitter) throws Exception {
        F(new Function() { // from class: l08
            @Override // com.unionpay.tsm.TsmHelper.Function
            public final int apply() {
                return this.a.P(str, observableEmitter);
            }
        }, observableEmitter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ UnionPayResource R(String str, UnionPayResource unionPayResource) throws Exception {
        T t = unionPayResource.data;
        Integer numValueOf = (t == 0 || !((Bundle) t).containsKey(h)) ? null : Integer.valueOf(((Bundle) unionPayResource.data).getInt(h));
        if (unionPayResource.isSuccessful()) {
            numValueOf = 100;
        }
        String strValueOf = unionPayResource.code;
        if (unionPayResource.status == UnionPayStatus.ERROR && TsmErrorMsg.CARD_DOWNLOAD_ERROR == TsmErrorMsg.codeOf(strValueOf)) {
            Integer num = this.c.get(str);
            if (num == null) {
                num = 0;
            }
            Map<String, Integer> map = this.c;
            Integer numValueOf2 = Integer.valueOf(num.intValue() + 1);
            map.put(str, numValueOf2);
            HMLog.i(f, "Card:" + str + ", Download Fail,Times:" + numValueOf2, new Object[0]);
            if (numValueOf2.intValue() >= 3) {
                strValueOf = String.valueOf(-102);
            }
        }
        return new UnionPayResource(unionPayResource.status, strValueOf, unionPayResource.message, numValueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int S(String str, ObservableEmitter observableEmitter) throws RemoteException {
        GetActiveCodeRequestParams getActiveCodeRequestParams = new GetActiveCodeRequestParams();
        getActiveCodeRequestParams.setMPanId(str);
        getActiveCodeRequestParams.setActiveType(Constant.SMS_OTP_METHOD_STR);
        return this.a.getActiveCode(getActiveCodeRequestParams, new f(observableEmitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(final String str, final ObservableEmitter observableEmitter) throws Exception {
        F(new Function() { // from class: k08
            @Override // com.unionpay.tsm.TsmHelper.Function
            public final int apply() {
                return this.a.S(str, observableEmitter);
            }
        }, observableEmitter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnionPayResource U(UnionPayResource unionPayResource) throws Exception {
        GetSMSAuthCodeResult getSMSAuthCodeResult;
        T t = unionPayResource.data;
        if (t != 0) {
            Bundle bundle = (Bundle) t;
            bundle.setClassLoader(GetSMSAuthCodeResult.class.getClassLoader());
            getSMSAuthCodeResult = (GetSMSAuthCodeResult) bundle.get("result");
        } else {
            getSMSAuthCodeResult = null;
        }
        return new UnionPayResource(unionPayResource.status, unionPayResource.code, unionPayResource.message, getSMSAuthCodeResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int V(ObservableEmitter observableEmitter) throws RemoteException {
        return this.a.getSupportedCardTypeList(new f(observableEmitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(final ObservableEmitter observableEmitter) throws Exception {
        F(new Function() { // from class: a08
            @Override // com.unionpay.tsm.TsmHelper.Function
            public final int apply() {
                return this.a.V(observableEmitter);
            }
        }, observableEmitter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnionPayResource X(UnionPayResource unionPayResource) throws Exception {
        ArrayList arrayList;
        SupportBank supportBank;
        T t = unionPayResource.data;
        if (t != 0) {
            Bundle bundle = (Bundle) t;
            bundle.setClassLoader(GetSupportedCardTypeListResult.class.getClassLoader());
            GetSupportedCardTypeListResult getSupportedCardTypeListResult = (GetSupportedCardTypeListResult) bundle.get("result");
            List<CardTypeListItem> arrayList2 = (getSupportedCardTypeListResult == null || getSupportedCardTypeListResult.getAppList() == null) ? new ArrayList() : Arrays.asList(getSupportedCardTypeListResult.getAppList());
            HashMap map = new HashMap(8);
            for (CardTypeListItem cardTypeListItem : arrayList2) {
                if (map.containsKey(cardTypeListItem.getBankName())) {
                    supportBank = (SupportBank) map.get(cardTypeListItem.getBankName());
                } else {
                    supportBank = new SupportBank();
                    supportBank.bankName = cardTypeListItem.getBankName();
                }
                if (supportBank != null) {
                    supportBank.supportTypes.add(cardTypeListItem.getCardType());
                    map.put(cardTypeListItem.getBankName(), supportBank);
                }
            }
            arrayList = new ArrayList(map.values());
        } else {
            arrayList = null;
        }
        return new UnionPayResource(unionPayResource.status, unionPayResource.code, unionPayResource.message, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnionPayResource Y(UnionPayResource unionPayResource) throws Exception {
        UpdateInfo updateInfo;
        T t = unionPayResource.data;
        if (t != 0) {
            Bundle bundle = (Bundle) t;
            bundle.setClassLoader(InitResult.class.getClassLoader());
            InitResult initResult = (InitResult) bundle.get("result");
            if (initResult != null) {
                updateInfo = initResult.getUpdateInfo();
            } else {
                updateInfo = null;
            }
        } else {
            updateInfo = null;
        }
        return new UnionPayResource(unionPayResource.status, unionPayResource.code, unionPayResource.message, updateInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int Z(ObservableEmitter observableEmitter) throws RemoteException {
        InitRequestParams initRequestParams = new InitRequestParams();
        initRequestParams.setType(3);
        return this.a.init(initRequestParams, new f(observableEmitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int a0(String[] strArr, ObservableEmitter observableEmitter) throws RemoteException {
        GetUniteAppListRequestParams getUniteAppListRequestParams = new GetUniteAppListRequestParams();
        getUniteAppListRequestParams.setStatus(strArr);
        return this.a.getUniteAppList(getUniteAppListRequestParams, new f(observableEmitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(final String[] strArr, final ObservableEmitter observableEmitter) throws Exception {
        F(new Function() { // from class: o08
            @Override // com.unionpay.tsm.TsmHelper.Function
            public final int apply() {
                return this.a.a0(strArr, observableEmitter);
            }
        }, observableEmitter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ UnionPayResource c0(UnionPayResource unionPayResource) throws Exception {
        ArrayList arrayList = new ArrayList();
        T t = unionPayResource.data;
        if (t != 0) {
            Bundle bundle = (Bundle) t;
            bundle.setClassLoader(GetUniteAppListResult.class.getClassLoader());
            GetUniteAppListResult getUniteAppListResult = (GetUniteAppListResult) bundle.get("result");
            List<UniteAppDetail> arrayList2 = new ArrayList();
            if (getUniteAppListResult != null && getUniteAppListResult.getAppList() != null) {
                arrayList2 = Arrays.asList(getUniteAppListResult.getAppList());
            }
            HMLog.i(f, "Watch installed cards:" + UnionPayUtil.resourceToString(unionPayResource), new Object[0]);
            List<BankCardBindStatus> bindCards = this.d.getValue().getBindCards();
            String userId = ModuleKt.getUserId();
            HashMap map = new HashMap(8);
            if (!UnionPayUtil.isEmptyList(bindCards)) {
                for (BankCardBindStatus bankCardBindStatus : bindCards) {
                    map.put(bankCardBindStatus.getAid(), Boolean.valueOf(bankCardBindStatus.isBinding() && userId.equals(bankCardBindStatus.getUserId())));
                }
            }
            for (UniteAppDetail uniteAppDetail : arrayList2) {
                if (map.containsKey(uniteAppDetail.getAppID())) {
                    Boolean bool = (Boolean) map.get(uniteAppDetail.getAppID());
                    if (bool == null) {
                        bool = Boolean.FALSE;
                    }
                    if (bool.booleanValue()) {
                        arrayList.add(uniteAppDetail);
                    } else {
                        deleteCard(uniteAppDetail, new b(), false).subscribe();
                    }
                } else {
                    arrayList.add(uniteAppDetail);
                    this.d.getValue().bindCard(uniteAppDetail.getAppID());
                }
            }
        }
        if (!UnionPayUtil.isEmptyList(arrayList)) {
            Collections.reverse(arrayList);
        }
        return new UnionPayResource(unionPayResource.status, unionPayResource.code, unionPayResource.message, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int d0(String str, CheckBinCodeInfo checkBinCodeInfo, Activity activity, ObservableEmitter observableEmitter) throws RemoteException {
        OpenUniteCardApplyActivityWithRiskInfoRequestParams openUniteCardApplyActivityWithRiskInfoRequestParams = new OpenUniteCardApplyActivityWithRiskInfoRequestParams();
        openUniteCardApplyActivityWithRiskInfoRequestParams.setSpan(str);
        openUniteCardApplyActivityWithRiskInfoRequestParams.setBankName(checkBinCodeInfo.getBankName());
        openUniteCardApplyActivityWithRiskInfoRequestParams.setTCUrl(checkBinCodeInfo.getTCUrl());
        openUniteCardApplyActivityWithRiskInfoRequestParams.setCardType(checkBinCodeInfo.getCardType());
        openUniteCardApplyActivityWithRiskInfoRequestParams.setCaptureMethod(2);
        return this.a.openUniteCardApplyActivity(openUniteCardApplyActivityWithRiskInfoRequestParams, activity, new f(observableEmitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0(final String str, final CheckBinCodeInfo checkBinCodeInfo, final Activity activity, final ObservableEmitter observableEmitter) throws Exception {
        F(new Function() { // from class: j08
            @Override // com.unionpay.tsm.TsmHelper.Function
            public final int apply() {
                return this.a.d0(str, checkBinCodeInfo, activity, observableEmitter);
            }
        }, observableEmitter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ UnionPayResource f0(UnionPayResource unionPayResource) throws Exception {
        GetActivityUniteApplyResult getActivityUniteApplyResult;
        T t;
        T t2 = unionPayResource.data;
        if (t2 != 0) {
            Bundle bundle = (Bundle) t2;
            bundle.setClassLoader(GetActivityUniteApplyResult.class.getClassLoader());
            getActivityUniteApplyResult = (GetActivityUniteApplyResult) bundle.get("result");
        } else {
            getActivityUniteApplyResult = null;
        }
        UnionPayResource unionPayResource2 = new UnionPayResource(unionPayResource.status, unionPayResource.code, unionPayResource.message, getActivityUniteApplyResult);
        if (unionPayResource2.isSuccessful() && (t = unionPayResource2.data) != 0 && ((GetActivityUniteApplyResult) t).getApplyResult() != null && !TextUtils.isEmpty(((GetActivityUniteApplyResult) unionPayResource2.data).getApplyResult().getAppId())) {
            D(((GetActivityUniteApplyResult) unionPayResource2.data).getApplyResult());
        }
        return unionPayResource2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int g0(String str, String str2, ObservableEmitter observableEmitter) throws RemoteException {
        UniteCardActiveRequestParams uniteCardActiveRequestParams = new UniteCardActiveRequestParams();
        uniteCardActiveRequestParams.setActiveCode(str);
        uniteCardActiveRequestParams.setMPanId(str2);
        return this.a.uniteCardActive(uniteCardActiveRequestParams, new f(observableEmitter));
    }

    public static TsmHelper getHelper(@NonNull Context context) {
        if (i == null) {
            i = new TsmHelper(context);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0(final String str, final String str2, final ObservableEmitter observableEmitter) throws Exception {
        F(new Function() { // from class: n08
            @Override // com.unionpay.tsm.TsmHelper.Function
            public final int apply() {
                return this.a.g0(str, str2, observableEmitter);
            }
        }, observableEmitter);
    }

    public Observable<UnionPayResource<CheckBinCodeResult>> checkBinCode(final String str) {
        return BankRx.io(new ObservableOnSubscribe() { // from class: tz7
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.I(str, observableEmitter);
            }
        }).observable().map(new io.reactivex.functions.Function() { // from class: h08
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TsmHelper.J((UnionPayResource) obj);
            }
        });
    }

    public Observable<UnionPayResource<UniteAppDetail>> deleteCard(@NonNull final UniteAppDetail uniteAppDetail, final ITsmProgressCallback.Stub stub, final boolean z) {
        return BankRx.io(new ObservableOnSubscribe() { // from class: rz7
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.M(uniteAppDetail, stub, observableEmitter);
            }
        }).observable().observeOn(Schedulers.io()).doOnNext(new Consumer() { // from class: yz7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.N(z, uniteAppDetail, (UnionPayResource) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: d08
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TsmHelper.O(uniteAppDetail, (UnionPayResource) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<UnionPayResource<Integer>> downloadCard(final String str) {
        return BankRx.io(new ObservableOnSubscribe() { // from class: uz7
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.Q(str, observableEmitter);
            }
        }).observable().map(new io.reactivex.functions.Function() { // from class: c08
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.R(str, (UnionPayResource) obj);
            }
        });
    }

    public Observable<UnionPayResource<GetSMSAuthCodeResult>> getSmsCode(final String str) {
        return BankRx.io(new ObservableOnSubscribe() { // from class: sz7
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.T(str, observableEmitter);
            }
        }).observable().map(new io.reactivex.functions.Function() { // from class: g08
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TsmHelper.U((UnionPayResource) obj);
            }
        });
    }

    public Observable<UnionPayResource<List<SupportBank>>> getSupportBank() {
        return BankRx.io(new ObservableOnSubscribe() { // from class: p08
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.W(observableEmitter);
            }
        }).observable().map(new io.reactivex.functions.Function() { // from class: f08
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TsmHelper.X((UnionPayResource) obj);
            }
        });
    }

    public Observable<UnionPayResource<UpdateInfo>> init() {
        release();
        return BankRx.io(new ObservableOnSubscribe() { // from class: qz7
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                this.a.C(observableEmitter);
            }
        }).observable().map(new io.reactivex.functions.Function() { // from class: e08
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TsmHelper.Y((UnionPayResource) obj);
            }
        });
    }

    public Observable<UnionPayResource<List<UniteAppDetail>>> loadCardList(@NonNull final String... strArr) {
        return BankRx.io(new ObservableOnSubscribe() { // from class: xz7
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.b0(strArr, observableEmitter);
            }
        }).observable().observeOn(Schedulers.io()).map(new io.reactivex.functions.Function() { // from class: zz7
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.c0((UnionPayResource) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<UnionPayResource<GetActivityUniteApplyResult>> openUniteCardApply(final Activity activity, final String str, final CheckBinCodeInfo checkBinCodeInfo) {
        return BankRx.io(new ObservableOnSubscribe() { // from class: vz7
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.e0(str, checkBinCodeInfo, activity, observableEmitter);
            }
        }).observable().observeOn(Schedulers.io()).map(new io.reactivex.functions.Function() { // from class: b08
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.f0((UnionPayResource) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
    }

    public void release() {
        UPTsmAddon uPTsmAddon = this.a;
        if (uPTsmAddon == null) {
            return;
        }
        uPTsmAddon.removeConnectionListener(this.b);
        if (this.a.isConnected()) {
            try {
                this.a.unbind();
            } catch (RemoteException e2) {
                HMLog.e(f, e2.getMessage(), e2);
            }
        }
    }

    public BankRx.RxBuilder<UnionPayResource<Bundle>> verifySmsCode(final String str, final String str2) {
        return BankRx.io(new ObservableOnSubscribe() { // from class: wz7
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.h0(str2, str, observableEmitter);
            }
        });
    }
}
