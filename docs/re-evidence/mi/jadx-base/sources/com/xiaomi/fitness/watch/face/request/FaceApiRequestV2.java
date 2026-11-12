package com.xiaomi.fitness.watch.face.request;

import com.miui.tsmclient.model.ErrorCode;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import com.xiaomi.fitness.watch.face.data.DeviceFaceIndexList;
import com.xiaomi.fitness.watch.face.data.DeviceFaceIndexListRequestParam;
import com.xiaomi.fitness.watch.face.data.DeviceFaceMarketOperation;
import com.xiaomi.fitness.watch.face.data.FaceAllTabInfo;
import com.xiaomi.fitness.watch.face.data.FaceDesignerCapabilityRequest;
import com.xiaomi.fitness.watch.face.data.FaceDesignerCapabilityResult;
import com.xiaomi.fitness.watch.face.data.FaceDesignerCheckWLResult;
import com.xiaomi.fitness.watch.face.data.FaceDesignerLicenseRequest;
import com.xiaomi.fitness.watch.face.data.FaceDesignerLicenseResult;
import com.xiaomi.fitness.watch.face.data.FaceEntranceRequest;
import com.xiaomi.fitness.watch.face.data.FaceEntranceRespV4;
import com.xiaomi.fitness.watch.face.data.FaceOperationRequest;
import com.xiaomi.fitness.watch.face.data.FaceParam;
import com.xiaomi.fitness.watch.face.data.FaceTabAllRequest;
import com.xiaomi.fitness.watch.face.data.FaceTabAllResp;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.data.FaceDownloadResultV2;
import com.xiaomi.fitness.watch.face.request.FaceApiRequestV2;
import com.xiaomi.fitness.watch.face.request.FaceDetailResultV2;
import com.xiaomi.fitness.watch.face.request.FaceListResultV2;
import com.xiaomi.fitness.watch.face.request.FacePaidListResponse;
import com.xiaomi.fitness.watch.face.request.FaceUnavailableListResponse;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004Ji\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020\u000f`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012¢\u0006\u0002\u0010\u0014JX\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172(\u0010\r\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\f\u0012\u0004\u0012\u00020\u00060\u0010j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\f`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012H\u0086@¢\u0006\u0002\u0010\u0019J`\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020\u001e`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012H\u0086@¢\u0006\u0002\u0010\u001fJL\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00172\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020\"`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012H\u0086@¢\u0006\u0002\u0010\u0019JL\u0010#\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020$`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012H\u0086@¢\u0006\u0002\u0010%Jj\u0010&\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\b2\b\u0010(\u001a\u0004\u0018\u00010\u001d2\b\u0010)\u001a\u0004\u0018\u00010\u001d2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020*`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012H\u0086@¢\u0006\u0002\u0010+Jl\u0010,\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2(\u0010\r\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\f\u0012\u0004\u0012\u00020\u00060\u0010j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\f`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012H\u0086@¢\u0006\u0002\u0010\u001fJr\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u00100\u001a\u0002012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\b2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u000203`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012H\u0086@¢\u0006\u0002\u00104JM\u00105\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u000206`\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0002\u00107Ju\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\b2\u0006\u0010(\u001a\u00020\u001d2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020;`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012¢\u0006\u0002\u0010<Ja\u0010=\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u001d2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020>`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012¢\u0006\u0002\u0010?JD\u0010@\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u000201`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012H\u0086@¢\u0006\u0002\u0010AJV\u0010B\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\b2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020\b`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012H\u0086@¢\u0006\u0002\u0010CJT\u0010D\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020F`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012H\u0086@¢\u0006\u0002\u0010C¨\u0006G"}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/watch/face/request/FaceApiServiceV2;", "<init>", "()V", "getFaceDetail", "", "model", "", "id", "version", "ids", "", "success", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/xiaomi/fitness/watch/face/request/FaceDetailResultV2;", "Lkotlin/Function1;", "fail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getFaceList", "params", "Lcom/xiaomi/fitness/watch/face/data/FaceParam;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "(Lcom/xiaomi/fitness/watch/face/data/FaceParam;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaidFaceList", RouteRequest.KEY_NEXT_KEY, "limit", "", "Lcom/xiaomi/fitness/watch/face/request/FacePaidListResponse;", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkFaceUnavailable", "faceParam", "Lcom/xiaomi/fitness/watch/face/request/FaceUnavailableListResponse;", "getDeviceFaceMarketOperation", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketOperation;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDeviceFaceMarketIndex", "firmwareVersion", "page", MediaStoreUtil.MediaInfo.SIZE, "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceIndexList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFaceTabAll", "Lcom/xiaomi/fitness/watch/face/data/FaceAllTabInfo;", "requestDownload", "did", "isTrial", "", "albumChildId", "Lcom/xiaomi/fitness/watch/face/export/data/FaceDownloadResultV2;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFaceEntranceV2", "Lcom/xiaomi/fitness/watch/face/data/FaceEntranceRespV4;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getFaceOperationList", "type", TSMAuthContants.PARAM_KEYWORD, "Lcom/xiaomi/fitness/watch/face/request/FaceOperationListResult;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getUserActionList", "Lcom/xiaomi/fitness/watch/face/request/FaceUserActionResult;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "checkDesignerWhiteList", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestFaceCapability", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestLicense", "hash", "Lcom/xiaomi/fitness/watch/face/data/FaceDesignerLicenseResult;", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceApiRequestV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceApiRequestV2.kt\ncom/xiaomi/fitness/watch/face/request/FaceApiRequestV2\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,306:1\n89#2,5:307\n89#2,5:312\n89#2,5:317\n89#2,5:322\n89#2,5:327\n89#2,5:332\n89#2,5:337\n89#2,5:342\n89#2,5:347\n89#2,5:352\n89#2,5:357\n89#2,5:362\n89#2,5:367\n89#2,5:372\n*S KotlinDebug\n*F\n+ 1 FaceApiRequestV2.kt\ncom/xiaomi/fitness/watch/face/request/FaceApiRequestV2\n*L\n92#1:307,5\n100#1:312,5\n114#1:317,5\n126#1:322,5\n139#1:327,5\n152#1:332,5\n172#1:337,5\n188#1:342,5\n211#1:347,5\n230#1:352,5\n254#1:357,5\n269#1:362,5\n282#1:367,5\n302#1:372,5\n*E\n"})
public final class FaceApiRequestV2 extends BaseRequest<FaceApiServiceV2> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$checkDesignerWhiteList$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/watch/face/data/FaceDesignerCheckWLResult;", "it", "Lcom/xiaomi/fitness/watch/face/request/FaceApiServiceV2;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$checkDesignerWhiteList$2", f = "FaceApiRequestV2.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<FaceApiServiceV2, Continuation<? super BaseResult<FaceDesignerCheckWLResult>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FaceApiServiceV2 faceApiServiceV2, Continuation<? super BaseResult<FaceDesignerCheckWLResult>> continuation) {
            return ((AnonymousClass2) create(faceApiServiceV2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiServiceV2 faceApiServiceV2 = (FaceApiServiceV2) this.L$0;
                this.label = 1;
                obj = faceApiServiceV2.checkDesignerWhiteList("", this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$checkFaceUnavailable$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/watch/face/request/FaceUnavailableListResponse;", "it", "Lcom/xiaomi/fitness/watch/face/request/FaceApiServiceV2;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$checkFaceUnavailable$2", f = "FaceApiRequestV2.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33852 extends SuspendLambda implements Function2<FaceApiServiceV2, Continuation<? super BaseResult<FaceUnavailableListResponse>>, Object> {
        final /* synthetic */ FaceParam $faceParam;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33852(FaceParam faceParam, Continuation<? super C33852> continuation) {
            super(2, continuation);
            this.$faceParam = faceParam;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C33852 c33852 = FaceApiRequestV2.this.new C33852(this.$faceParam, continuation);
            c33852.L$0 = obj;
            return c33852;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FaceApiServiceV2 faceApiServiceV2, Continuation<? super BaseResult<FaceUnavailableListResponse>> continuation) {
            return ((C33852) create(faceApiServiceV2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiServiceV2 faceApiServiceV2 = (FaceApiServiceV2) this.L$0;
                String json = FaceApiRequestV2.this.getMGson().toJson(this.$faceParam);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = faceApiServiceV2.checkFaceUnavailable(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$getDeviceFaceMarketIndex$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceIndexList;", "it", "Lcom/xiaomi/fitness/watch/face/request/FaceApiServiceV2;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$getDeviceFaceMarketIndex$2", f = "FaceApiRequestV2.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33862 extends SuspendLambda implements Function2<FaceApiServiceV2, Continuation<? super BaseResult<DeviceFaceIndexList>>, Object> {
        final /* synthetic */ String $firmwareVersion;
        final /* synthetic */ String $model;
        final /* synthetic */ Integer $page;
        final /* synthetic */ Integer $size;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33862(String str, String str2, Integer num, Integer num2, Continuation<? super C33862> continuation) {
            super(2, continuation);
            this.$model = str;
            this.$firmwareVersion = str2;
            this.$page = num;
            this.$size = num2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C33862 c33862 = FaceApiRequestV2.this.new C33862(this.$model, this.$firmwareVersion, this.$page, this.$size, continuation);
            c33862.L$0 = obj;
            return c33862;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FaceApiServiceV2 faceApiServiceV2, Continuation<? super BaseResult<DeviceFaceIndexList>> continuation) {
            return ((C33862) create(faceApiServiceV2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiServiceV2 faceApiServiceV2 = (FaceApiServiceV2) this.L$0;
                String json = FaceApiRequestV2.this.getMGson().toJson(new DeviceFaceIndexListRequestParam(this.$model, this.$firmwareVersion, this.$page, this.$size));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = faceApiServiceV2.getDeviceFaceMarketIndex(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$getDeviceFaceMarketOperation$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketOperation;", "it", "Lcom/xiaomi/fitness/watch/face/request/FaceApiServiceV2;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$getDeviceFaceMarketOperation$2", f = "FaceApiRequestV2.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33872 extends SuspendLambda implements Function2<FaceApiServiceV2, Continuation<? super BaseResult<DeviceFaceMarketOperation>>, Object> {
        final /* synthetic */ String $model;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33872(String str, Continuation<? super C33872> continuation) {
            super(2, continuation);
            this.$model = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C33872 c33872 = FaceApiRequestV2.this.new C33872(this.$model, continuation);
            c33872.L$0 = obj;
            return c33872;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FaceApiServiceV2 faceApiServiceV2, Continuation<? super BaseResult<DeviceFaceMarketOperation>> continuation) {
            return ((C33872) create(faceApiServiceV2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiServiceV2 faceApiServiceV2 = (FaceApiServiceV2) this.L$0;
                String json = FaceApiRequestV2.this.getMGson().toJson(new FaceOperationRequest(this.$model));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = faceApiServiceV2.getDeviceFaceMarketOperation(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$getFaceDetail$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/watch/face/request/FaceDetailResultV2;", "it", "Lcom/xiaomi/fitness/watch/face/request/FaceApiServiceV2;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$getFaceDetail$1", f = "FaceApiRequestV2.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FaceApiServiceV2, Continuation<? super BaseResult<FaceDetailResultV2>>, Object> {
        final /* synthetic */ String $id;
        final /* synthetic */ List<String> $ids;
        final /* synthetic */ String $model;
        final /* synthetic */ String $version;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, String str3, List<String> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$model = str;
            this.$id = str2;
            this.$version = str3;
            this.$ids = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = FaceApiRequestV2.this.new AnonymousClass1(this.$model, this.$id, this.$version, this.$ids, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FaceApiServiceV2 faceApiServiceV2, Continuation<? super BaseResult<FaceDetailResultV2>> continuation) {
            return ((AnonymousClass1) create(faceApiServiceV2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiServiceV2 faceApiServiceV2 = (FaceApiServiceV2) this.L$0;
                String json = FaceApiRequestV2.this.getMGson().toJson(new FaceDetailRequestV2(this.$model, this.$id, this.$version, this.$ids));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = faceApiServiceV2.getFaceDetail(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$getFaceEntranceV2$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/watch/face/data/FaceEntranceRespV4;", "it", "Lcom/xiaomi/fitness/watch/face/request/FaceApiServiceV2;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$getFaceEntranceV2$1", f = "FaceApiRequestV2.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33881 extends SuspendLambda implements Function2<FaceApiServiceV2, Continuation<? super BaseResult<FaceEntranceRespV4>>, Object> {
        final /* synthetic */ String $firmwareVersion;
        final /* synthetic */ String $model;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33881(String str, String str2, Continuation<? super C33881> continuation) {
            super(2, continuation);
            this.$model = str;
            this.$firmwareVersion = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C33881 c33881 = FaceApiRequestV2.this.new C33881(this.$model, this.$firmwareVersion, continuation);
            c33881.L$0 = obj;
            return c33881;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FaceApiServiceV2 faceApiServiceV2, Continuation<? super BaseResult<FaceEntranceRespV4>> continuation) {
            return ((C33881) create(faceApiServiceV2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiServiceV2 faceApiServiceV2 = (FaceApiServiceV2) this.L$0;
                String json = FaceApiRequestV2.this.getMGson().toJson(new FaceEntranceRequest(this.$model, this.$firmwareVersion));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = faceApiServiceV2.getFaceEntranceV2(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$getFaceList$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/watch/face/request/FaceListResultV2;", "it", "Lcom/xiaomi/fitness/watch/face/request/FaceApiServiceV2;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$getFaceList$2", f = "FaceApiRequestV2.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33892 extends SuspendLambda implements Function2<FaceApiServiceV2, Continuation<? super BaseResult<FaceListResultV2>>, Object> {
        final /* synthetic */ FaceParam $params;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33892(FaceParam faceParam, Continuation<? super C33892> continuation) {
            super(2, continuation);
            this.$params = faceParam;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C33892 c33892 = FaceApiRequestV2.this.new C33892(this.$params, continuation);
            c33892.L$0 = obj;
            return c33892;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FaceApiServiceV2 faceApiServiceV2, Continuation<? super BaseResult<FaceListResultV2>> continuation) {
            return ((C33892) create(faceApiServiceV2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiServiceV2 faceApiServiceV2 = (FaceApiServiceV2) this.L$0;
                String json = FaceApiRequestV2.this.getMGson().toJson(this.$params);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = faceApiServiceV2.getFaceList(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$getFaceOperationList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/watch/face/request/FaceOperationListResult;", "it", "Lcom/xiaomi/fitness/watch/face/request/FaceApiServiceV2;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$getFaceOperationList$1", f = "FaceApiRequestV2.kt", i = {}, l = {ErrorCode.ERROR_SP_NOTICE_NOT_READY}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33901 extends SuspendLambda implements Function2<FaceApiServiceV2, Continuation<? super BaseResult<FaceOperationListResult>>, Object> {
        final /* synthetic */ String $firmwareVersion;
        final /* synthetic */ String $id;
        final /* synthetic */ String $keyword;
        final /* synthetic */ String $model;
        final /* synthetic */ int $page;
        final /* synthetic */ int $type;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33901(int i, String str, String str2, String str3, String str4, int i2, Continuation<? super C33901> continuation) {
            super(2, continuation);
            this.$type = i;
            this.$id = str;
            this.$keyword = str2;
            this.$model = str3;
            this.$firmwareVersion = str4;
            this.$page = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C33901 c33901 = FaceApiRequestV2.this.new C33901(this.$type, this.$id, this.$keyword, this.$model, this.$firmwareVersion, this.$page, continuation);
            c33901.L$0 = obj;
            return c33901;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FaceApiServiceV2 faceApiServiceV2, Continuation<? super BaseResult<FaceOperationListResult>> continuation) {
            return ((C33901) create(faceApiServiceV2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiServiceV2 faceApiServiceV2 = (FaceApiServiceV2) this.L$0;
                String json = FaceApiRequestV2.this.getMGson().toJson(new FaceOperationListRequest(this.$type, this.$id, this.$keyword, this.$model, this.$firmwareVersion, this.$page, 0, 64, null));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = faceApiServiceV2.getFaceOperationList(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$getFaceTabAll$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/watch/face/data/FaceTabAllResp;", "it", "Lcom/xiaomi/fitness/watch/face/request/FaceApiServiceV2;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$getFaceTabAll$2", f = "FaceApiRequestV2.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33912 extends SuspendLambda implements Function2<FaceApiServiceV2, Continuation<? super BaseResult<FaceTabAllResp>>, Object> {
        final /* synthetic */ String $firmwareVersion;
        final /* synthetic */ int $limit;
        final /* synthetic */ String $model;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33912(String str, String str2, int i, Continuation<? super C33912> continuation) {
            super(2, continuation);
            this.$model = str;
            this.$firmwareVersion = str2;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C33912 c33912 = FaceApiRequestV2.this.new C33912(this.$model, this.$firmwareVersion, this.$limit, continuation);
            c33912.L$0 = obj;
            return c33912;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FaceApiServiceV2 faceApiServiceV2, Continuation<? super BaseResult<FaceTabAllResp>> continuation) {
            return ((C33912) create(faceApiServiceV2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiServiceV2 faceApiServiceV2 = (FaceApiServiceV2) this.L$0;
                String json = FaceApiRequestV2.this.getMGson().toJson(new FaceTabAllRequest(this.$model, this.$firmwareVersion, this.$limit));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = faceApiServiceV2.getFaceTabAll(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$getPaidFaceList$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/watch/face/request/FacePaidListResponse;", "it", "Lcom/xiaomi/fitness/watch/face/request/FaceApiServiceV2;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$getPaidFaceList$2", f = "FaceApiRequestV2.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33922 extends SuspendLambda implements Function2<FaceApiServiceV2, Continuation<? super BaseResult<FacePaidListResponse>>, Object> {
        final /* synthetic */ int $limit;
        final /* synthetic */ String $model;
        final /* synthetic */ String $next_key;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33922(String str, int i, String str2, Continuation<? super C33922> continuation) {
            super(2, continuation);
            this.$model = str;
            this.$limit = i;
            this.$next_key = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C33922 c33922 = FaceApiRequestV2.this.new C33922(this.$model, this.$limit, this.$next_key, continuation);
            c33922.L$0 = obj;
            return c33922;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FaceApiServiceV2 faceApiServiceV2, Continuation<? super BaseResult<FacePaidListResponse>> continuation) {
            return ((C33922) create(faceApiServiceV2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiServiceV2 faceApiServiceV2 = (FaceApiServiceV2) this.L$0;
                String json = FaceApiRequestV2.this.getMGson().toJson(new FacePaidListRequest(this.$model, this.$limit, this.$next_key));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = faceApiServiceV2.getPaidFaceList(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$getUserActionList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/watch/face/request/FaceUserActionResult;", "it", "Lcom/xiaomi/fitness/watch/face/request/FaceApiServiceV2;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$getUserActionList$1", f = "FaceApiRequestV2.kt", i = {}, l = {255}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33931 extends SuspendLambda implements Function2<FaceApiServiceV2, Continuation<? super BaseResult<FaceUserActionResult>>, Object> {
        final /* synthetic */ String $firmwareVersion;
        final /* synthetic */ String $id;
        final /* synthetic */ String $model;
        final /* synthetic */ int $page;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33931(String str, String str2, String str3, int i, Continuation<? super C33931> continuation) {
            super(2, continuation);
            this.$id = str;
            this.$model = str2;
            this.$firmwareVersion = str3;
            this.$page = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C33931 c33931 = FaceApiRequestV2.this.new C33931(this.$id, this.$model, this.$firmwareVersion, this.$page, continuation);
            c33931.L$0 = obj;
            return c33931;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FaceApiServiceV2 faceApiServiceV2, Continuation<? super BaseResult<FaceUserActionResult>> continuation) {
            return ((C33931) create(faceApiServiceV2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiServiceV2 faceApiServiceV2 = (FaceApiServiceV2) this.L$0;
                String json = FaceApiRequestV2.this.getMGson().toJson(new FaceUserActionRequest(this.$id, this.$model, this.$firmwareVersion, this.$page, 0, 16, null));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = faceApiServiceV2.getUserActionList(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$requestDownload$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceDownloadResultV2;", "it", "Lcom/xiaomi/fitness/watch/face/request/FaceApiServiceV2;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$requestDownload$2", f = "FaceApiRequestV2.kt", i = {}, l = {SportReportBaseParser.ReportType.descentCount}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33942 extends SuspendLambda implements Function2<FaceApiServiceV2, Continuation<? super BaseResult<FaceDownloadResultV2>>, Object> {
        final /* synthetic */ String $albumChildId;
        final /* synthetic */ String $did;
        final /* synthetic */ String $id;
        final /* synthetic */ boolean $isTrial;
        final /* synthetic */ String $model;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33942(String str, String str2, String str3, boolean z, String str4, Continuation<? super C33942> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$model = str2;
            this.$id = str3;
            this.$isTrial = z;
            this.$albumChildId = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C33942 c33942 = FaceApiRequestV2.this.new C33942(this.$did, this.$model, this.$id, this.$isTrial, this.$albumChildId, continuation);
            c33942.L$0 = obj;
            return c33942;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FaceApiServiceV2 faceApiServiceV2, Continuation<? super BaseResult<FaceDownloadResultV2>> continuation) {
            return ((C33942) create(faceApiServiceV2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiServiceV2 faceApiServiceV2 = (FaceApiServiceV2) this.L$0;
                String json = FaceApiRequestV2.this.getMGson().toJson(new FaceDownloadRequestV2(this.$did, this.$model, this.$id, this.$isTrial, this.$albumChildId));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = faceApiServiceV2.requestDownload(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$requestFaceCapability$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/watch/face/data/FaceDesignerCapabilityResult;", "it", "Lcom/xiaomi/fitness/watch/face/request/FaceApiServiceV2;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$requestFaceCapability$2", f = "FaceApiRequestV2.kt", i = {}, l = {283}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33952 extends SuspendLambda implements Function2<FaceApiServiceV2, Continuation<? super BaseResult<FaceDesignerCapabilityResult>>, Object> {
        final /* synthetic */ String $firmwareVersion;
        final /* synthetic */ String $model;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33952(String str, String str2, Continuation<? super C33952> continuation) {
            super(2, continuation);
            this.$model = str;
            this.$firmwareVersion = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C33952 c33952 = FaceApiRequestV2.this.new C33952(this.$model, this.$firmwareVersion, continuation);
            c33952.L$0 = obj;
            return c33952;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FaceApiServiceV2 faceApiServiceV2, Continuation<? super BaseResult<FaceDesignerCapabilityResult>> continuation) {
            return ((C33952) create(faceApiServiceV2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiServiceV2 faceApiServiceV2 = (FaceApiServiceV2) this.L$0;
                String json = FaceApiRequestV2.this.getMGson().toJson(new FaceDesignerCapabilityRequest(this.$model, this.$firmwareVersion));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = faceApiServiceV2.requestFaceCapability(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$requestLicense$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/watch/face/data/FaceDesignerLicenseResult;", "it", "Lcom/xiaomi/fitness/watch/face/request/FaceApiServiceV2;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.request.FaceApiRequestV2$requestLicense$2", f = "FaceApiRequestV2.kt", i = {}, l = {303}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33962 extends SuspendLambda implements Function2<FaceApiServiceV2, Continuation<? super BaseResult<FaceDesignerLicenseResult>>, Object> {
        final /* synthetic */ String $hash;
        final /* synthetic */ String $id;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33962(String str, String str2, Continuation<? super C33962> continuation) {
            super(2, continuation);
            this.$hash = str;
            this.$id = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C33962 c33962 = FaceApiRequestV2.this.new C33962(this.$hash, this.$id, continuation);
            c33962.L$0 = obj;
            return c33962;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FaceApiServiceV2 faceApiServiceV2, Continuation<? super BaseResult<FaceDesignerLicenseResult>> continuation) {
            return ((C33962) create(faceApiServiceV2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiServiceV2 faceApiServiceV2 = (FaceApiServiceV2) this.L$0;
                String json = FaceApiRequestV2.this.getMGson().toJson(new FaceDesignerLicenseRequest(this.$hash, this.$id));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = faceApiServiceV2.requestLicense(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkDesignerWhiteList$lambda$10(Function1 success, FaceDesignerCheckWLResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(Boolean.valueOf(it.getValid()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkFaceUnavailable$lambda$3(Function1 success, FaceUnavailableListResponse it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDeviceFaceMarketIndex$lambda$5(Function1 success, DeviceFaceIndexList it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDeviceFaceMarketOperation$lambda$4(Function1 success, DeviceFaceMarketOperation it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getFaceDetail$default(FaceApiRequestV2 faceApiRequestV2, String str, String str2, String str3, List list, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            list = new ArrayList();
        }
        faceApiRequestV2.getFaceDetail(str, str2, str3, list, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFaceDetail$lambda$0(Function1 success, FaceDetailResultV2 result) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(result, "result");
        success.invoke2(result);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFaceEntranceV2$lambda$8(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        fail.invoke2(Integer.valueOf(it.getErrorCode()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFaceEntranceV2$lambda$9(Function1 success, FaceEntranceRespV4 it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFaceList$lambda$1(Function1 success, FaceListResultV2 it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it.getWatchface_list());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object getFaceTabAll$default(FaceApiRequestV2 faceApiRequestV2, String str, String str2, int i, Function1 function1, Function1 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 3;
        }
        return faceApiRequestV2.getFaceTabAll(str, str2, i, function1, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFaceTabAll$lambda$6(Function1 success, FaceTabAllResp it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        List<FaceAllTabInfo> tabInfoList = it.getTabInfoList();
        if (tabInfoList == null) {
            tabInfoList = CollectionsKt__CollectionsKt.emptyList();
        }
        success.invoke2(tabInfoList);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object getPaidFaceList$default(FaceApiRequestV2 faceApiRequestV2, String str, String str2, int i, Function1 function1, Function1 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            i = 50;
        }
        return faceApiRequestV2.getPaidFaceList(str, str3, i, function1, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPaidFaceList$lambda$2(Function1 success, FacePaidListResponse it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDownload$lambda$7(Function1 success, FaceDownloadResultV2 it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestFaceCapability$lambda$11(Function1 success, FaceDesignerCapabilityResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it.getCapability());
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object checkDesignerWhiteList(@NotNull final Function1<? super Boolean, Unit> function1, @NotNull Function1<? super ApiException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass2(null)).error(function2).success(new Function1() { // from class: rm8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceApiRequestV2.checkDesignerWhiteList$lambda$10(function1, (FaceDesignerCheckWLResult) obj);
            }
        });
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object checkFaceUnavailable(@NotNull FaceParam faceParam, @NotNull final Function1<? super FaceUnavailableListResponse, Unit> function1, @NotNull Function1<? super ApiException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C33852(faceParam, null)).error(function2).success(new Function1() { // from class: sm8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceApiRequestV2.checkFaceUnavailable$lambda$3(function1, (FaceUnavailableListResponse) obj);
            }
        });
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object getDeviceFaceMarketIndex(@NotNull String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @NotNull final Function1<? super DeviceFaceIndexList, Unit> function1, @NotNull Function1<? super ApiException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C33862(str, str2, num, num2, null)).error(function2).success(new Function1() { // from class: xm8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceApiRequestV2.getDeviceFaceMarketIndex$lambda$5(function1, (DeviceFaceIndexList) obj);
            }
        });
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object getDeviceFaceMarketOperation(@NotNull String str, @NotNull final Function1<? super DeviceFaceMarketOperation, Unit> function1, @NotNull Function1<? super ApiException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C33872(str, null)).error(function2).success(new Function1() { // from class: vm8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceApiRequestV2.getDeviceFaceMarketOperation$lambda$4(function1, (DeviceFaceMarketOperation) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public final void getFaceDetail(@NotNull String model, @NotNull String id, @NotNull String version, @NotNull List<String> ids, @NotNull final Function1<? super FaceDetailResultV2, Unit> success, @NotNull Function1<? super ApiException, Unit> fail) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(model, id, version, ids, null)).error(fail).success(new Function1() { // from class: ym8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceApiRequestV2.getFaceDetail$lambda$0(success, (FaceDetailResultV2) obj);
            }
        });
    }

    public final void getFaceEntranceV2(@NotNull String model, @NotNull String firmwareVersion, @NotNull final Function1<? super FaceEntranceRespV4, Unit> success, @NotNull final Function1<? super Integer, Unit> fail) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C33881(model, firmwareVersion, null)).error(new Function1() { // from class: an8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceApiRequestV2.getFaceEntranceV2$lambda$8(fail, (ApiException) obj);
            }
        }).success(new Function1() { // from class: qm8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceApiRequestV2.getFaceEntranceV2$lambda$9(success, (FaceEntranceRespV4) obj);
            }
        });
    }

    @Nullable
    public final Object getFaceList(@NotNull FaceParam faceParam, @NotNull final Function1<? super List<FaceData>, Unit> function1, @NotNull Function1<? super ApiException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C33892(faceParam, null)).error(function2).success(new Function1() { // from class: wm8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceApiRequestV2.getFaceList$lambda$1(function1, (FaceListResultV2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public final void getFaceOperationList(int type, @NotNull String id, @Nullable String keyword, @NotNull String model, @Nullable String firmwareVersion, int page, @NotNull Function1<? super FaceOperationListResult, Unit> success, @NotNull Function1<? super ApiException, Unit> fail) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C33901(type, id, keyword, model, firmwareVersion, page, null)).error(fail).success(success);
    }

    @Nullable
    public final Object getFaceTabAll(@NotNull String str, @Nullable String str2, int i, @NotNull final Function1<? super List<FaceAllTabInfo>, Unit> function1, @NotNull Function1<? super ApiException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C33912(str, str2, i, null)).error(function2).success(new Function1() { // from class: pm8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceApiRequestV2.getFaceTabAll$lambda$6(function1, (FaceTabAllResp) obj);
            }
        });
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object getPaidFaceList(@NotNull String str, @NotNull String str2, int i, @NotNull final Function1<? super FacePaidListResponse, Unit> function1, @NotNull Function1<? super ApiException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C33922(str, i, str2, null)).error(function2).success(new Function1() { // from class: um8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceApiRequestV2.getPaidFaceList$lambda$2(function1, (FacePaidListResponse) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public final void getUserActionList(@NotNull String id, @NotNull String model, @NotNull String firmwareVersion, int page, @NotNull Function1<? super FaceUserActionResult, Unit> success, @NotNull Function1<? super ApiException, Unit> fail) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C33931(id, model, firmwareVersion, page, null)).error(fail).success(success);
    }

    @Nullable
    public final Object requestDownload(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @Nullable String str4, @NotNull final Function1<? super FaceDownloadResultV2, Unit> function1, @NotNull Function1<? super ApiException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C33942(str, str2, str3, z, str4, null)).error(function2).success(new Function1() { // from class: tm8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceApiRequestV2.requestDownload$lambda$7(function1, (FaceDownloadResultV2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object requestFaceCapability(@NotNull String str, @Nullable String str2, @NotNull final Function1<? super String, Unit> function1, @NotNull Function1<? super ApiException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C33952(str, str2, null)).error(function2).success(new Function1() { // from class: zm8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceApiRequestV2.requestFaceCapability$lambda$11(function1, (FaceDesignerCapabilityResult) obj);
            }
        });
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object requestLicense(@NotNull String str, @NotNull String str2, @NotNull Function1<? super FaceDesignerLicenseResult, Unit> function1, @NotNull Function1<? super ApiException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C33962(str, str2, null)).error(function2).success(function1);
        return Unit.INSTANCE;
    }
}
