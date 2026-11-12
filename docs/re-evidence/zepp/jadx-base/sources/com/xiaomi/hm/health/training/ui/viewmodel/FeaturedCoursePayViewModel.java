package com.xiaomi.hm.health.training.ui.viewmodel;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.xiaomi.hm.health.training.api.TrainingDataSource;
import com.xiaomi.hm.health.training.api.entity.ErrorCode;
import com.xiaomi.hm.health.training.api.entity.PayChannel;
import com.xiaomi.hm.health.training.api.entity.PayOrderParams;
import com.xiaomi.hm.health.training.api.entity.PayOrderResult;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.Status;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCoursePayViewModel extends ViewModel {
    private final MutableLiveData<b> a;
    private final MediatorLiveData<Resource<Void>> b;
    private final MediatorLiveData<Resource<PayChannel>> c;
    private final MediatorLiveData<Resource<Boolean>> d;
    private String e;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            a = iArr;
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b {
        public Activity a;
        public PayOrderParams b;

        public b(Activity activity, PayOrderParams payOrderParams) {
            this.a = activity;
            this.b = payOrderParams;
        }
    }

    @Inject
    public FeaturedCoursePayViewModel(final TrainingDataSource trainingDataSource) {
        MutableLiveData<b> mutableLiveData = new MutableLiveData<>();
        this.a = mutableLiveData;
        MediatorLiveData<Resource<Void>> mediatorLiveData = new MediatorLiveData<>();
        this.b = mediatorLiveData;
        MediatorLiveData<Resource<PayChannel>> mediatorLiveData2 = new MediatorLiveData<>();
        this.c = mediatorLiveData2;
        MediatorLiveData<Resource<Boolean>> mediatorLiveData3 = new MediatorLiveData<>();
        this.d = mediatorLiveData3;
        LiveData<S> liveDataSwitchMap = Transformations.switchMap(mutableLiveData, new Function() { // from class: com.xiaomi.hm.health.training.ui.viewmodel.c
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return FeaturedCoursePayViewModel.f(trainingDataSource, (FeaturedCoursePayViewModel.b) obj);
            }
        });
        mediatorLiveData.addSource(liveDataSwitchMap, new Observer() { // from class: n22
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.g((PayOrderResult) obj);
            }
        });
        mediatorLiveData2.addSource(liveDataSwitchMap, new Observer() { // from class: o22
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.h((PayOrderResult) obj);
            }
        });
        mediatorLiveData3.addSource(liveDataSwitchMap, new Observer() { // from class: p22
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.i((PayOrderResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ LiveData f(TrainingDataSource trainingDataSource, b bVar) {
        return trainingDataSource.generateOrderAndPayForFeaturedCourse(bVar.a, bVar.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(PayOrderResult payOrderResult) {
        if (payOrderResult instanceof PayOrderResult.OrderResult) {
            this.b.setValue(payOrderResult.getResult());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(PayOrderResult payOrderResult) {
        if (payOrderResult instanceof PayOrderResult.PayResult) {
            this.c.setValue(payOrderResult.getResult());
            if (payOrderResult.getResult() == null || payOrderResult.getResult().getData() == null) {
                return;
            }
            String str = payOrderResult.getResult().getData() == PayChannel.ALIPAY ? TrainingAnalytics.ParamValue.PurchaseMethod.ALIPAY : TrainingAnalytics.ParamValue.PurchaseMethod.WECHAT;
            int i = a.a[payOrderResult.getResult().getStatus().ordinal()];
            if (i == 1) {
                Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.PURCHASE_SUCCESS).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, String.valueOf(this.e)).addExtra(TrainingAnalytics.ParamKey.PURCHASE_METHOD, str));
            } else if (i == 2 && !ErrorCode.PAYMENT_CANCELLED.equals(payOrderResult.getResult().getCode())) {
                Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.PURCHASE_FAILED).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, String.valueOf(this.e)).addExtra(TrainingAnalytics.ParamKey.PURCHASE_METHOD, str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(PayOrderResult payOrderResult) {
        if (payOrderResult instanceof PayOrderResult.JoinResult) {
            this.d.setValue(payOrderResult.getResult());
        }
    }

    public void generateOrderAndPay(@NonNull Activity activity, @NonNull PayOrderParams payOrderParams) {
        this.a.setValue(new b(activity, payOrderParams));
    }

    public LiveData<Resource<Boolean>> getJoinResultLiveData() {
        return this.d;
    }

    public LiveData<Resource<Void>> getOrderResultLiveData() {
        return this.b;
    }

    public LiveData<Resource<PayChannel>> getPayResultLiveData() {
        return this.c;
    }

    public void setCourseId(String str) {
        this.e = str;
    }
}
