package com.mi.health.course.activity;

import com.mi.health.course.activity.CourseOpenVipFragment$requestPay$2$1;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.CourseVipInfo;
import com.xiaomi.fitness.pay.export.PaymentProgressDefaultListener;
import com.xiaomi.fitness.pay.export.data.response.OrderStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/mi/health/course/activity/CourseOpenVipFragment$requestPay$2$1", "Lcom/xiaomi/fitness/pay/export/PaymentProgressDefaultListener;", "onOrderStatus", "", "status", "", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseOpenVipFragment$requestPay$2$1 extends PaymentProgressDefaultListener {
    final /* synthetic */ CourseOpenVipFragment this$0;

    public CourseOpenVipFragment$requestPay$2$1(CourseOpenVipFragment courseOpenVipFragment) {
        this.this$0 = courseOpenVipFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderStatus$lambda$0(CourseOpenVipFragment this$0, CourseVipInfo it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderStatus$lambda$1(CourseOpenVipFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.pay.export.PaymentProgressDefaultListener, com.xiaomi.fitness.pay.export.PaymentProgressListener
    public void onOrderStatus(String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        super.onOrderStatus(status);
        if (!Intrinsics.areEqual(status, OrderStatus.PAYMENT_SUCCESS)) {
            if (Intrinsics.areEqual(status, OrderStatus.PAYMENT_FAIL)) {
                this.this$0.dismissAllowingStateLoss();
            }
        } else {
            CourseApi courseApi = CourseApiKt.getCourseApi();
            final CourseOpenVipFragment courseOpenVipFragment = this.this$0;
            Function1<? super CourseVipInfo, Unit> function1 = new Function1() { // from class: tv4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CourseOpenVipFragment$requestPay$2$1.onOrderStatus$lambda$0(courseOpenVipFragment, (CourseVipInfo) obj);
                }
            };
            final CourseOpenVipFragment courseOpenVipFragment2 = this.this$0;
            courseApi.refreshCourseVipData(function1, new Function0() { // from class: uv4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CourseOpenVipFragment$requestPay$2$1.onOrderStatus$lambda$1(courseOpenVipFragment2);
                }
            });
        }
    }
}
