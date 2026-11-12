package com.xiaomi.fitness.nfc.ui;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.BulletinResponseInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import com.xiaomi.fitness.nfc.ui.CardManagerViewModel;
import defpackage.bg4;
import defpackage.fmg;
import defpackage.jz6;
import defpackage.ltg;
import defpackage.na4;
import defpackage.o0j;
import defpackage.o4h;
import defpackage.s3q;
import defpackage.vqg;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\t\b\u0007¢\u0006\u0004\b&\u0010'J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006JE\u0010\u000b\u001a\u00020\u000426\u0010\n\u001a2\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u00042\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CardManagerViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Lkotlin/Function3;", "", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "callBack", "loadCardList", "(Lkotlin/jvm/functions/Function3;)V", "Lkotlin/Function2;", "", "success", "checkCarOk", "(Lkotlin/jvm/functions/Function2;)V", "cardWrapper", "Lkotlin/Function0;", "Lkotlin/Function1;", "fail", "removeCard", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "tag", "loadBullet", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "<init>", "()V", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCardManagerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardManagerViewModel.kt\ncom/xiaomi/fitness/nfc/ui/CardManagerViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n1872#2,3:183\n*S KotlinDebug\n*F\n+ 1 CardManagerViewModel.kt\ncom/xiaomi/fitness/nfc/ui/CardManagerViewModel\n*L\n164#1:183,3\n*E\n"})
public final class CardManagerViewModel extends AbsViewModel {
    public static final int MEDAL_ASSIST_NFC_DOOR_CARD = 9;
    public static final int MEDAL_ASSIST_NFC_TRANSIT_CARD = 8;
    public static final int sErrorCar = 4;
    public static final int sErrorDoor = 2;
    public static final int sErrorNo = 0;
    public static final int sErrorTrans = 1;

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CardManagerViewModel$loadCardList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CardManagerViewModel$loadCardList$1", f = "CardManagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<List<? extends CardWrapper>, List<? extends CardWrapper>, List<? extends CardWrapper>, Unit> $callBack;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CardManagerViewModel$loadCardList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CardManagerViewModel$loadCardList$1$1", f = "CardManagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function3<List<? extends CardWrapper>, List<? extends CardWrapper>, List<? extends CardWrapper>, Unit> $callBack;
            final /* synthetic */ Ref.ObjectRef<List<CardWrapper>> $carCardList;
            final /* synthetic */ Ref.ObjectRef<List<CardWrapper>> $doorCardList;
            final /* synthetic */ Ref.ObjectRef<List<CardWrapper>> $tranCardList;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06661(Function3<? super List<? extends CardWrapper>, ? super List<? extends CardWrapper>, ? super List<? extends CardWrapper>, Unit> function3, Ref.ObjectRef<List<CardWrapper>> objectRef, Ref.ObjectRef<List<CardWrapper>> objectRef2, Ref.ObjectRef<List<CardWrapper>> objectRef3, Continuation<? super C06661> continuation) {
                super(2, continuation);
                this.$callBack = function3;
                this.$tranCardList = objectRef;
                this.$doorCardList = objectRef2;
                this.$carCardList = objectRef3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06661(this.$callBack, this.$tranCardList, this.$doorCardList, this.$carCardList, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$callBack.invoke(this.$tranCardList.element, this.$doorCardList.element, this.$carCardList.element);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function3<? super List<? extends CardWrapper>, ? super List<? extends CardWrapper>, ? super List<? extends CardWrapper>, Unit> function3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$callBack = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$callBack, continuation);
        }

        /* JADX WARN: Type inference failed for: r0v18, types: [T, java.util.List] */
        /* JADX WARN: Type inference failed for: r0v8, types: [T, java.util.List] */
        /* JADX WARN: Type inference failed for: r8v7, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            vqg.d("getTransCardList pre Scope");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            try {
                ?? X = s3q.f0().X();
                objectRef3.element = X;
                vqg.d("carCardList end, size = " + ((List) X).size());
            } catch (Exception e) {
                vqg.c("carCardList", e);
            }
            try {
                ?? Q0 = s3q.f0().q0();
                objectRef.element = Q0;
                if (!((Collection) Q0).isEmpty()) {
                    MedalManagerExtKt.getInstance(MedalManager.INSTANCE).doMedalAssistWithSp(8);
                }
                vqg.d("getTransCardList end, size = " + ((List) objectRef.element).size());
            } catch (Exception e2) {
                vqg.c("getTransCardList", e2);
            }
            try {
                ?? E0 = s3q.f0().e0();
                objectRef2.element = E0;
                Collection collection = (Collection) E0;
                if (collection != null && !collection.isEmpty()) {
                    MedalManagerExtKt.getInstance(MedalManager.INSTANCE).doMedalAssistWithSp(9);
                }
                vqg.d("getDoorCardList end, size = " + ((List) objectRef2.element).size());
            } catch (Exception e3) {
                vqg.c("getDoorCardList", e3);
            }
            AnyExtKt.main$default(null, new C06661(this.$callBack, objectRef, objectRef2, objectRef3, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBullet$lambda$6(Function1 success, List list) {
        Intrinsics.checkNotNullParameter(success, "$success");
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNull(list);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            sb.append(((BulletinResponseInfo.BulletinInfo) obj).getContent());
            if (i > 0 && i < list.size() - 1) {
                sb.append(" > ");
            }
            i = i2;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        success.invoke2(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBullet$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBullet$lambda$8(String tag, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "$tag");
        vqg.c("loadBulletinList err" + tag, th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBullet$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeCard$lambda$1(CardWrapper cardWrapper, Function0 success, Function1 fail, BaseResponse baseResponse) {
        Intrinsics.checkNotNullParameter(cardWrapper, "$cardWrapper");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        ltg.c().r(cardWrapper);
        if (baseResponse.isSuccess()) {
            success.invoke();
        } else {
            String string = !TextUtils.isEmpty(baseResponse.mMsg) ? baseResponse.mMsg : ResourceExtKt.getString(o0j.o4);
            Intrinsics.checkNotNull(string);
            fail.invoke2(string);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeCard$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeCard$lambda$3(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("deleteCard", th);
        String strC = fmg.c(th);
        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
        fail.invoke2(strC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeCard$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void checkCarOk(@NotNull Function2<? super String, ? super String, Unit> success) {
        Intrinsics.checkNotNullParameter(success, "success");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? carMailboxId = NfcPreference.getCarMailboxId(wearableDeviceModel.getDid());
            objectRef.element = carMailboxId;
            CharSequence charSequence = (CharSequence) carMailboxId;
            if (charSequence == null || charSequence.length() == 0) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new CardManagerViewModel$checkCarOk$1$1(objectRef, wearableDeviceModel, success, null), 2, null);
        }
    }

    @NotNull
    public final na4 getCompositeDisposable() {
        return this.compositeDisposable;
    }

    public final void loadBullet(@NotNull CardWrapper cardWrapper, @NotNull final String tag, @NotNull final Function1<? super String, Unit> success) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(success, "success");
        o4h<List<BulletinResponseInfo.BulletinInfo>> o4hVarI1 = s3q.f0().i1(cardWrapper, tag);
        final Function1 function1 = new Function1() { // from class: fo3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardManagerViewModel.loadBullet$lambda$6(success, (List) obj);
            }
        };
        bg4<? super List<BulletinResponseInfo.BulletinInfo>> bg4Var = new bg4() { // from class: go3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardManagerViewModel.loadBullet$lambda$7(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ho3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardManagerViewModel.loadBullet$lambda$8(tag, (Throwable) obj);
            }
        };
        jz6 jz6VarO = o4hVarI1.O(bg4Var, new bg4() { // from class: io3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardManagerViewModel.loadBullet$lambda$9(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(jz6VarO, "subscribe(...)");
        this.compositeDisposable.a(jz6VarO);
    }

    public final void loadCardList(@NotNull Function3<? super List<? extends CardWrapper>, ? super List<? extends CardWrapper>, ? super List<? extends CardWrapper>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            s3q.f0().t0(wearableDeviceModel);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(callBack, null), 2, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.compositeDisposable.dispose();
    }

    public final void removeCard(@NotNull final CardWrapper cardWrapper, @NotNull final Function0<Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        na4 na4Var = this.compositeDisposable;
        o4h<BaseResponse> o4hVarQ = s3q.f0().Q(cardWrapper);
        final Function1 function1 = new Function1() { // from class: jo3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardManagerViewModel.removeCard$lambda$1(cardWrapper, success, fail, (BaseResponse) obj);
            }
        };
        bg4<? super BaseResponse> bg4Var = new bg4() { // from class: ko3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardManagerViewModel.removeCard$lambda$2(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: lo3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardManagerViewModel.removeCard$lambda$3(fail, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarQ.O(bg4Var, new bg4() { // from class: mo3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardManagerViewModel.removeCard$lambda$4(function2, obj);
            }
        }));
    }

    public final void setCompositeDisposable(@NotNull na4 na4Var) {
        Intrinsics.checkNotNullParameter(na4Var, "<set-?>");
        this.compositeDisposable = na4Var;
    }
}
