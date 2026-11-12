package com.xiaomi.fitness.rn.share.request;

import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.rn.share.bean.DeviceShareMsgBean;
import com.xiaomi.fitness.rn.share.bean.ShareMsgDetailBean;
import com.xiaomi.fitness.rn.share.bean.ShareMsgDetailListBean;
import com.xiaomi.fitness.rn.share.bean.ShareMsgDetailListRequestBean;
import com.xiaomi.fitness.rn.share.bean.ShareMsgListBean;
import com.xiaomi.fitness.rn.share.request.ShareRequest;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.h4b;
import defpackage.vo6;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bJ0\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/rn/share/request/ShareRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/rn/share/request/ShareService;", "<init>", "()V", "loadShareMsgList", "", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/rn/share/bean/ShareMsgListBean;", "error", "Lkotlin/Function0;", "getMsgDetail", "msgId", "", "Lcom/xiaomi/fitness/rn/share/bean/ShareMsgDetailBean;", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShareRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareRequest.kt\ncom/xiaomi/fitness/rn/share/request/ShareRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,68:1\n89#2,5:69\n89#2,5:74\n*S KotlinDebug\n*F\n+ 1 ShareRequest.kt\ncom/xiaomi/fitness/rn/share/request/ShareRequest\n*L\n20#1:69,5\n41#1:74,5\n*E\n"})
public final class ShareRequest extends BaseRequest<ShareService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.ShareRequest$getMsgDetail$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/rn/share/bean/ShareMsgDetailListBean;", "it", "Lcom/xiaomi/fitness/rn/share/request/ShareService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.ShareRequest$getMsgDetail$1", f = "ShareRequest.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ShareService, Continuation<? super ShareMsgDetailListBean>, Object> {
        final /* synthetic */ long $msgId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$msgId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$msgId, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ShareService shareService, Continuation<? super ShareMsgDetailListBean> continuation) {
            return ((AnonymousClass1) create(shareService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ShareService shareService = (ShareService) this.L$0;
                ShareMsgDetailListRequestBean shareMsgDetailListRequestBean = new ShareMsgDetailListRequestBean();
                ListExtKt.add(shareMsgDetailListRequestBean.getMsg_ids(), Boxing.boxLong(this.$msgId));
                String strC = h4b.c(shareMsgDetailListRequestBean);
                vo6.c("getMsgDetail " + strC);
                Intrinsics.checkNotNull(strC);
                this.label = 1;
                obj = shareService.getMsgDetail(strC, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((BaseResult) obj).getResult();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.ShareRequest$loadShareMsgList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/rn/share/bean/ShareMsgListBean;", "it", "Lcom/xiaomi/fitness/rn/share/request/ShareService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.ShareRequest$loadShareMsgList$1", f = "ShareRequest.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28871 extends SuspendLambda implements Function2<ShareService, Continuation<? super ShareMsgListBean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C28871(Continuation<? super C28871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C28871 c28871 = new C28871(continuation);
            c28871.L$0 = obj;
            return c28871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ShareService shareService, Continuation<? super ShareMsgListBean> continuation) {
            return ((C28871) create(shareService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ShareService shareService = (ShareService) this.L$0;
                String strB = h4b.b(MapsKt__MapsKt.hashMapOf(TuplesKt.to(RnReportConst.ApiReport.PARAM_MODULE, Boxing.boxInt(2))));
                vo6.c("loadShareMsgList " + strB);
                Intrinsics.checkNotNull(strB);
                this.label = 1;
                obj = shareService.loadShareMsgList(strB, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((BaseResult) obj).getResult();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMsgDetail$lambda$2(Function0 error, ApiException it) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        vo6.b("getMsgDetail", it);
        error.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMsgDetail$lambda$3(Function0 error, Function1 success, ShareMsgDetailListBean beanList) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(beanList, "beanList");
        vo6.c("getMsgDetail " + beanList);
        if (beanList.getMessages().isEmpty()) {
            error.invoke();
        } else {
            ShareMsgDetailBean shareMsgDetailBean = beanList.getMessages().get(0);
            if (shareMsgDetailBean.getModule() == 2 && shareMsgDetailBean.getType() == 1) {
                shareMsgDetailBean.setDeviceShareMsgBean((DeviceShareMsgBean) h4b.d(shareMsgDetailBean.getExtra_data(), DeviceShareMsgBean.class));
            }
            success.invoke2(shareMsgDetailBean);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadShareMsgList$lambda$0(Function0 error, ApiException it) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        vo6.b("loadShareMsgList", it);
        error.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadShareMsgList$lambda$1(Function1 success, ShareMsgListBean bean) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(bean, "bean");
        vo6.c("loadShareMsgList " + bean);
        success.invoke2(bean);
        return Unit.INSTANCE;
    }

    public final void getMsgDetail(long msgId, @NotNull final Function1<? super ShareMsgDetailBean, Unit> success, @NotNull final Function0<Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(msgId, null)).error(new Function1() { // from class: p7m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareRequest.getMsgDetail$lambda$2(error, (ApiException) obj);
            }
        }).success(new Function1() { // from class: q7m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareRequest.getMsgDetail$lambda$3(error, success, (ShareMsgDetailListBean) obj);
            }
        });
    }

    public final void loadShareMsgList(@NotNull final Function1<? super ShareMsgListBean, Unit> success, @NotNull final Function0<Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C28871(null)).error(new Function1() { // from class: n7m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareRequest.loadShareMsgList$lambda$0(error, (ApiException) obj);
            }
        }).success(new Function1() { // from class: o7m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareRequest.loadShareMsgList$lambda$1(success, (ShareMsgListBean) obj);
            }
        });
    }
}
