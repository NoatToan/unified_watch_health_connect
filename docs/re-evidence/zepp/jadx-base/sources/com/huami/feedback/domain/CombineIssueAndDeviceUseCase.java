package com.huami.feedback.domain;

import com.huami.feedback.entity.DeviceAndIssue;
import com.huami.feedback.entity.Issue;
import com.huami.feedback.repo.DeviceRepository;
import com.huami.feedback.repo.IssueRepository;
import com.huami.feedback.sync.api.device.DeviceType;
import com.huami.feedback.sync.api.device.FeedbackDevice;
import com.huami.feedback.util.ConstantsKt;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0015\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\nH\u0086\u0002R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/feedback/domain/CombineIssueAndDeviceUseCase;", "", "Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "device", "", "b", "", "Lcom/huami/feedback/entity/Issue;", "issues", "a", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/feedback/entity/DeviceAndIssue;", "invoke", "Lcom/huami/feedback/repo/DeviceRepository;", "Lcom/huami/feedback/repo/DeviceRepository;", "deviceRepository", "Lcom/huami/feedback/repo/IssueRepository;", "Lcom/huami/feedback/repo/IssueRepository;", "issueRepository", "<init>", "(Lcom/huami/feedback/repo/DeviceRepository;Lcom/huami/feedback/repo/IssueRepository;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class CombineIssueAndDeviceUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceRepository deviceRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IssueRepository issueRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceType.values().length];
            iArr[DeviceType.WATCH.ordinal()] = 1;
            iArr[DeviceType.SMART_WATCH.ordinal()] = 2;
            iArr[DeviceType.BAND.ordinal()] = 3;
            iArr[DeviceType.EAR_BUD.ordinal()] = 4;
            iArr[DeviceType.HEAD_SET.ordinal()] = 5;
            iArr[DeviceType.HEARING_AID.ordinal()] = 6;
            iArr[DeviceType.SCALE.ordinal()] = 7;
            iArr[DeviceType.TREADMILL.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ FeedbackDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FeedbackDevice feedbackDevice) {
            super(0);
            this.a = feedbackDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getDeviceType() + "设备没有对应的问题类型";
        }
    }

    public CombineIssueAndDeviceUseCase(@NotNull DeviceRepository deviceRepository, @NotNull IssueRepository issueRepository) {
        this.deviceRepository = deviceRepository;
        this.issueRepository = issueRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Issue a(FeedbackDevice device, List<Issue> issues) {
        Object next;
        int iB = b(device);
        Iterator<T> it2 = issues.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!(((Issue) next).getId() == iB));
        Issue issue = (Issue) next;
        if (issue == null) {
            HMLog.warn$default("feedback", null, new a(device), 2, null);
        }
        return issue;
    }

    private final int b(FeedbackDevice device) {
        switch (WhenMappings.$EnumSwitchMapping$0[device.getDeviceType().ordinal()]) {
            case 1:
            case 2:
            case 3:
                return 10000;
            case 4:
            case 5:
            case 6:
                return 12000;
            case 7:
                return 11000;
            case 8:
                return ConstantsKt.ISSUE_ID_TREADMILL_DEVICE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public final Flow<List<DeviceAndIssue>> invoke() {
        final List<FeedbackDevice> activeDevices = this.deviceRepository.getActiveDevices();
        final Flow<List<Issue>> issues = this.issueRepository.getIssues(activeDevices);
        return new Flow<List<? extends DeviceAndIssue>>() { // from class: com.huami.feedback.domain.CombineIssueAndDeviceUseCase$invoke$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.huami.feedback.domain.CombineIssueAndDeviceUseCase$invoke$$inlined$mapNotNull$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends Issue>> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ List b;
                public final /* synthetic */ CombineIssueAndDeviceUseCase c;

                /* JADX INFO: renamed from: com.huami.feedback.domain.CombineIssueAndDeviceUseCase$invoke$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.feedback.domain.CombineIssueAndDeviceUseCase$invoke$$inlined$mapNotNull$1$2", f = "CombineIssueAndDeviceUseCase.kt", i = {}, l = {167}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, List list, CombineIssueAndDeviceUseCase combineIssueAndDeviceUseCase) {
                    this.a = flowCollector;
                    this.b = list;
                    this.c = combineIssueAndDeviceUseCase;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends Issue> list, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object next;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        List<? extends Issue> list2 = list;
                        List listPlus = null;
                        if (!list2.isEmpty()) {
                            List<FeedbackDevice> list3 = this.b;
                            ArrayList arrayList = new ArrayList();
                            for (FeedbackDevice feedbackDevice : list3) {
                                Issue issueA = this.c.a(feedbackDevice, list2);
                                DeviceAndIssue deviceAndIssue = issueA == null ? null : new DeviceAndIssue(feedbackDevice, this.c.deviceRepository.isConnected(feedbackDevice.getDeviceType()), issueA);
                                if (deviceAndIssue != null) {
                                    arrayList.add(deviceAndIssue);
                                }
                            }
                            Iterator<T> it2 = list2.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (!(((Issue) next).getId() == 14000));
                            Issue issue = (Issue) next;
                            listPlus = issue != null ? CollectionsKt___CollectionsKt.plus((Collection) e.listOf(new DeviceAndIssue(null, false, issue)), (Iterable) arrayList) : arrayList;
                        }
                        if (listPlus != null) {
                            anonymousClass1.b = 1;
                            if (flowCollector.emit(listPlus, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super List<? extends DeviceAndIssue>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = issues.collect(new AnonymousClass2(flowCollector, activeDevices, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
