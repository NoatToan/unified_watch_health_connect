package com.xiaomi.fitness.sport_eco.ftp.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.sport_eco.ftp.request.FtpModel;
import com.xiaomi.fitness.sport_eco.ftp.request.FtpRequest;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestHistoryViewModel;
import defpackage.e1j;
import defpackage.xpd;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestHistoryViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "request", "Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpRequest;", "<init>", "(Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpRequest;)V", "ftpListDatas", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpModel$FtpData;", "getFtpListDatas", "()Landroidx/lifecycle/MutableLiveData;", "setFtpListDatas", "(Landroidx/lifecycle/MutableLiveData;)V", "getFtpHistoryList", "", "getDisplayLevel", "", "ftp", "", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FtpTestHistoryViewModel extends AbsViewModel {

    @NotNull
    private static final String TAG = "FtpTestHistoryViewModel";

    @Nullable
    private MutableLiveData<List<FtpModel.FtpData>> ftpListDatas;

    @NotNull
    private final FtpRequest request;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestHistoryViewModel$getFtpHistoryList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestHistoryViewModel$getFtpHistoryList$1", f = "FtpTestHistoryViewModel.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFtpTestHistoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FtpTestHistoryViewModel.kt\ncom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestHistoryViewModel$getFtpHistoryList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1019#2,2:99\n1872#2,3:101\n*S KotlinDebug\n*F\n+ 1 FtpTestHistoryViewModel.kt\ncom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestHistoryViewModel$getFtpHistoryList$1\n*L\n50#1:99,2\n57#1:101,3\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FtpTestHistoryViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            JSONArray jSONArrayOptJSONArray;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("uid", AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
                    FtpRequest ftpRequest = FtpTestHistoryViewModel.this.request;
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    this.label = 1;
                    obj = ftpRequest.requestEcoApi("eco/general-equipment/exercise_bike/ftp/query", string, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                JSONObject jSONObject2 = new JSONObject(((FtpModel.RespData) obj).getResp());
                int iOptInt = jSONObject2.optInt("code");
                ArrayList arrayList = new ArrayList();
                if (iOptInt == 200 && (jSONArrayOptJSONArray = jSONObject2.optJSONArray("data")) != null) {
                    List listG = xpd.g(jSONArrayOptJSONArray.toString(), FtpModel.FtpData.class);
                    Intrinsics.checkNotNull(listG, "null cannot be cast to non-null type java.util.ArrayList<com.xiaomi.fitness.sport_eco.ftp.request.FtpModel.FtpData>");
                    arrayList = (ArrayList) listG;
                    if (arrayList.size() > 1) {
                        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestHistoryViewModel$getFtpHistoryList$1$invokeSuspend$$inlined$sortByDescending$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((FtpModel.FtpData) t2).getCreateTime()), Long.valueOf(((FtpModel.FtpData) t).getCreateTime()));
                            }
                        });
                    }
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = "";
                    FtpTestHistoryViewModel ftpTestHistoryViewModel = FtpTestHistoryViewModel.this;
                    int i2 = 0;
                    for (Object obj2 : arrayList) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        FtpModel.FtpData ftpData = (FtpModel.FtpData) obj2;
                        ftpData.setYear(simpleDateFormat.format(Boxing.boxLong(ftpData.getCreateTime())));
                        ftpData.setDisplayYear(ftpData.getYear() + AppUtil.getApp().getString(e1j.W4));
                        ftpData.setDisplayScore(ftpData.getFtp() + "W");
                        ftpData.setDisplayTime(simpleDateFormat2.format(Boxing.boxLong(ftpData.getCreateTime())));
                        ftpData.setDisplaylevel(ftpTestHistoryViewModel.getDisplayLevel(ftpData.getFtp()));
                        if (i2 == 0) {
                            ftpData.setType(0);
                        } else if (Intrinsics.areEqual(objectRef.element, ftpData.getYear())) {
                            ftpData.setType(1);
                        } else {
                            ftpData.setType(0);
                        }
                        objectRef.element = ftpData.getYear();
                        EcoDeviceModelExtKt.logi("provideHttpLog", "==========" + ftpData + ".toString()");
                        i2 = i3;
                    }
                }
                MutableLiveData<List<FtpModel.FtpData>> ftpListDatas = FtpTestHistoryViewModel.this.getFtpListDatas();
                if (ftpListDatas != null) {
                    ftpListDatas.postValue(arrayList);
                }
            } catch (Exception unused) {
                MutableLiveData<List<FtpModel.FtpData>> ftpListDatas2 = FtpTestHistoryViewModel.this.getFtpListDatas();
                if (ftpListDatas2 != null) {
                    ftpListDatas2.postValue(new ArrayList());
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public FtpTestHistoryViewModel(@NotNull FtpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
        this.ftpListDatas = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getDisplayLevel(int ftp) {
        if (1 <= ftp && ftp < 1000001) {
            String string = AppUtil.getApp().getString(e1j.X2);
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (1000001 <= ftp && ftp < 1500001) {
            String string2 = AppUtil.getApp().getString(e1j.D);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (1500001 > ftp || ftp >= 2000001) {
            String string3 = AppUtil.getApp().getString(e1j.G4);
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        String string4 = AppUtil.getApp().getString(e1j.d4);
        Intrinsics.checkNotNull(string4);
        return string4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFtpHistoryList$lambda$0(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void getFtpHistoryList() {
        ScopeExtKt.scopeNetLife$default(this, null, new AnonymousClass1(null), 1, null).m503catch(new Function2() { // from class: era
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FtpTestHistoryViewModel.getFtpHistoryList$lambda$0((AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    @Nullable
    public final MutableLiveData<List<FtpModel.FtpData>> getFtpListDatas() {
        return this.ftpListDatas;
    }

    public final void setFtpListDatas(@Nullable MutableLiveData<List<FtpModel.FtpData>> mutableLiveData) {
        this.ftpListDatas = mutableLiveData;
    }
}
