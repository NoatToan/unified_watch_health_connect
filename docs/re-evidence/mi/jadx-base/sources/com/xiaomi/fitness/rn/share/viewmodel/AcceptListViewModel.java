package com.xiaomi.fitness.rn.share.viewmodel;

import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.login.bean.PrivacyAgreeModel;
import com.xiaomi.fitness.rn.share.bean.AcceptItemBean;
import com.xiaomi.fitness.rn.share.request.MijiaRequest;
import com.xiaomi.fitness.rn.share.viewmodel.AcceptListViewModel;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.vo6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0004\u001a\u00020\u00052'\u0010\u0006\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\u000728\u0010\r\u001a4\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\u000eJd\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u000728\u0010\r\u001a4\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\u000eJ\\\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00112\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u000728\u0010\r\u001a4\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\u000e¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/rn/share/viewmodel/AcceptListViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "loadAcceptList", "", "success", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/rn/share/bean/AcceptItemBean;", "Lkotlin/ParameterName;", "name", "devices", "error", "Lkotlin/Function2;", "", "code", "", "msg", PrivacyAgreeModel.TYPE_ACCEPT, "acceptItemBean", "isAccept", "", BroadcastsKt.SILENT_PUSHING_CANCEL, "did", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AcceptListViewModel extends AbsViewModel {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit accept$lambda$2(Function1 success, boolean z) {
        Intrinsics.checkNotNullParameter(success, "$success");
        AnyExtKt.main$default(null, new AcceptListViewModel$accept$1$1(success, z, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit accept$lambda$3(Function2 error, int i, String str) {
        Intrinsics.checkNotNullParameter(error, "$error");
        AnyExtKt.main$default(null, new AcceptListViewModel$accept$2$1(error, i, str, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancel$lambda$4(Function1 success, boolean z) {
        Intrinsics.checkNotNullParameter(success, "$success");
        AnyExtKt.main$default(null, new AcceptListViewModel$cancel$1$1(success, z, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancel$lambda$5(Function2 error, int i, String str) {
        Intrinsics.checkNotNullParameter(error, "$error");
        AnyExtKt.main$default(null, new AcceptListViewModel$cancel$2$1(error, i, str, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAcceptList$lambda$0(Function1 success, List it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new AcceptListViewModel$loadAcceptList$1$1(success, it, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAcceptList$lambda$1(Function1 success, int i, String str) {
        Intrinsics.checkNotNullParameter(success, "$success");
        success.invoke2(new ArrayList());
        vo6.a("loadAcceptList code:" + i + " msg:" + str);
        return Unit.INSTANCE;
    }

    public final void accept(@NotNull AcceptItemBean acceptItemBean, boolean isAccept, @NotNull final Function1<? super Boolean, Unit> success, @NotNull final Function2<? super Integer, ? super String, Unit> error) {
        Intrinsics.checkNotNullParameter(acceptItemBean, "acceptItemBean");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        MijiaRequest.INSTANCE.accept(acceptItemBean.getInv_id(), isAccept, new Function1() { // from class: b30
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AcceptListViewModel.accept$lambda$2(success, ((Boolean) obj).booleanValue());
            }
        }, new Function2() { // from class: c30
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcceptListViewModel.accept$lambda$3(error, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    public final void cancel(@NotNull String did, @NotNull final Function1<? super Boolean, Unit> success, @NotNull final Function2<? super Integer, ? super String, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        MijiaRequest.INSTANCE.cancelShare(did, new Function1() { // from class: d30
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AcceptListViewModel.cancel$lambda$4(success, ((Boolean) obj).booleanValue());
            }
        }, new Function2() { // from class: e30
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcceptListViewModel.cancel$lambda$5(error, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    public final void loadAcceptList(@NotNull final Function1<? super List<AcceptItemBean>, Unit> success, @NotNull Function2<? super Integer, ? super String, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        MijiaRequest.INSTANCE.loadAcceptList(new Function1() { // from class: z20
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AcceptListViewModel.loadAcceptList$lambda$0(success, (List) obj);
            }
        }, new Function2() { // from class: a30
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcceptListViewModel.loadAcceptList$lambda$1(success, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }
}
