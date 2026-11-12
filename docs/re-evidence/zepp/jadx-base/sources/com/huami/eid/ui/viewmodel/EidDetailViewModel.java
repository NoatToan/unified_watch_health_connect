package com.huami.eid.ui.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.eid.ui.api.EidRepo;
import com.huami.eid.ui.extensions.EidStatusExtensionKt;
import com.huami.nfc.eid.entities.EidStatus;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.qualifier.QualifierKt;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\b\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/eid/ui/viewmodel/EidDetailViewModel;", "Lcom/huami/eid/ui/viewmodel/EidBaseViewModel;", "", "bizSerialNumber", "", "c", "a", "b", "getEidStatus", "deleteEidCard", "navigateToFaq", "navigateToProtocol", "Lcom/huami/eid/ui/api/EidRepo;", "Lcom/huami/eid/ui/api/EidRepo;", "eidRepo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/core/State;", "Landroidx/lifecycle/MutableLiveData;", "getDeleteResultLiveData", "()Landroidx/lifecycle/MutableLiveData;", "deleteResultLiveData", "", "isOpenLiveDate", "Lcom/huami/nfc/eid/entities/EidStatus;", "eidStatus", "Lcom/huami/nfc/eid/entities/EidStatus;", "()Lcom/huami/nfc/eid/entities/EidStatus;", "setEidStatus", "(Lcom/huami/nfc/eid/entities/EidStatus;)V", "<init>", "(Lcom/huami/eid/ui/api/EidRepo;)V", "Companion", "eid_release"}, k = 1, mv = {1, 5, 1})
public final class EidDetailViewModel extends EidBaseViewModel {

    @NotNull
    private static final String d = "WALLET_USER";

    @NotNull
    private static final String e = "WALLET_USER_ID";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final EidRepo eidRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<Unit>> deleteResultLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<Boolean>> isOpenLiveDate = new MutableLiveData<>();
    public EidStatus eidStatus;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.eid.ui.viewmodel.EidDetailViewModel$deleteEidCard$1", f = "EidDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super State<? extends Unit>>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(1, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return EidDetailViewModel.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Unit>> continuation) {
            return invoke2((Continuation<? super State<Unit>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Unit>> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EidDetailViewModel.this.eidRepo.deleteEidCard(this.c);
            EidDetailViewModel eidDetailViewModel = EidDetailViewModel.this;
            eidDetailViewModel.setEidStatus(EidStatus.copy$default(eidDetailViewModel.getEidStatus(), "0", null, null, 6, null));
            return new Success(Unit.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.eid.ui.viewmodel.EidDetailViewModel$getEidStatus$1", f = "EidDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function1<Continuation<? super State<? extends Boolean>>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return EidDetailViewModel.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Boolean>> continuation) {
            return invoke2((Continuation<? super State<Boolean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Boolean>> continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EidDetailViewModel eidDetailViewModel = EidDetailViewModel.this;
            eidDetailViewModel.setEidStatus(EidRepo.DefaultImpls.getEidStatus$default(eidDetailViewModel.eidRepo, "2", null, 2, null));
            if (!EidStatusExtensionKt.installedInCurrentDevice(EidDetailViewModel.this.getEidStatus())) {
                return new Success(Boxing.boxBoolean(false));
            }
            if (Intrinsics.areEqual((String) Koin.getOrCreateScope$default(KoinJavaComponent.getKoin(), "WALLET_USER", QualifierKt.named("WALLET_USER"), null, 4, null).get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named("WALLET_USER_ID"), null), EidDetailViewModel.this.getEidStatus().getUserId())) {
                return new Success(Boxing.boxBoolean(true));
            }
            EidDetailViewModel eidDetailViewModel2 = EidDetailViewModel.this;
            eidDetailViewModel2.c(eidDetailViewModel2.getEidStatus().getOrderNum());
            return new Success(Boxing.boxBoolean(false));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<State<? extends Unit>> {
        public final /* synthetic */ String b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Object> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                return "开始删除不属于当前用户的eID";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final State<Unit> invoke() {
            LogcatKt.info$default(Logcat.INSTANCE, null, a.a, 1, null);
            EidDetailViewModel.this.eidRepo.deleteEidCard(this.b);
            return new Success(Unit.INSTANCE);
        }
    }

    public EidDetailViewModel(@NotNull EidRepo eidRepo) {
        this.eidRepo = eidRepo;
    }

    private final String a() {
        return "t/posts/watch?category=32&meta_key=tag&meta_value=faq";
    }

    private final String b() {
        return "t/posts/watch?category=31&meta_key=tag&meta_value=faq";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(String bizSerialNumber) {
        launch(this, new c(bizSerialNumber));
    }

    public final void deleteEidCard(@NotNull String bizSerialNumber) {
        startWithLoading(this.deleteResultLiveData, new a(bizSerialNumber, null));
    }

    @NotNull
    public final MutableLiveData<State<Unit>> getDeleteResultLiveData() {
        return this.deleteResultLiveData;
    }

    @NotNull
    public final EidStatus getEidStatus() {
        EidStatus eidStatus = this.eidStatus;
        Objects.requireNonNull(eidStatus);
        return eidStatus;
    }

    @NotNull
    public final MutableLiveData<State<Boolean>> isOpenLiveDate() {
        return this.isOpenLiveDate;
    }

    public final void navigateToFaq() {
        this.eidRepo.gotoWeb(a());
    }

    public final void navigateToProtocol() {
        this.eidRepo.gotoWeb(b());
    }

    public final void setEidStatus(@NotNull EidStatus eidStatus) {
        this.eidStatus = eidStatus;
    }

    /* JADX INFO: renamed from: getEidStatus, reason: collision with other method in class */
    public final void m3332getEidStatus() {
        startWithLoading(this.isOpenLiveDate, new b(null));
    }
}
