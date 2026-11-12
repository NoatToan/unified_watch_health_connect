package com.xiaomi.fitness.privacy.permission;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.baseui.AbsViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\"\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0010J\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/SystemPermissionViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "mPermissionItemsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/fitness/privacy/permission/PermissionAdapter$PermissionItem;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "observerPermissionItems", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "loadPermissionList", "Lkotlinx/coroutines/Job;", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SystemPermissionViewModel extends AbsViewModel {

    @NotNull
    private final MutableLiveData<List<PermissionAdapter.PermissionItem>> mPermissionItemsLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.privacy.permission.SystemPermissionViewModel$loadPermissionList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.privacy.permission.SystemPermissionViewModel$loadPermissionList$1", f = "SystemPermissionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSystemPermissionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemPermissionViewModel.kt\ncom/xiaomi/fitness/privacy/permission/SystemPermissionViewModel$loadPermissionList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1557#2:41\n1628#2,3:42\n*S KotlinDebug\n*F\n+ 1 SystemPermissionViewModel.kt\ncom/xiaomi/fitness/privacy/permission/SystemPermissionViewModel$loadPermissionList$1\n*L\n33#1:41\n33#1:42,3\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SystemPermissionViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<PermissionHelper.Permission> listDefaultPrivacyPermissions = PermissionHelper.INSTANCE.defaultPrivacyPermissions();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listDefaultPrivacyPermissions, 10));
            Iterator<T> it = listDefaultPrivacyPermissions.iterator();
            while (it.hasNext()) {
                arrayList.add(new PermissionAdapter.PermissionItem((PermissionHelper.Permission) it.next()));
            }
            SystemPermissionViewModel.this.mPermissionItemsLiveData.postValue(arrayList);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final Job loadPermissionList() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    public final void observerPermissionItems(@NotNull LifecycleOwner owner, @NotNull Observer<List<PermissionAdapter.PermissionItem>> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.mPermissionItemsLiveData.observe(owner, observer);
    }
}
