package com.xiaomi.fitness.detail;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import defpackage.j1j;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.detail.SportDetailFragment$initTitleBar$1$1$1", f = "SportDetailFragment.kt", i = {}, l = {476}, m = "invokeSuspend", n = {}, s = {})
public final class SportDetailFragment$initTitleBar$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ImageView $it;
    int label;
    final /* synthetic */ SportDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportDetailFragment$initTitleBar$1$1$1(SportDetailFragment sportDetailFragment, ImageView imageView, Continuation<? super SportDetailFragment$initTitleBar$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = sportDetailFragment;
        this.$it = imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(final SportDetailFragment sportDetailFragment, final ImageView imageView, Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            sportDetailFragment.generateLongShareBitmapIfNeed(new Function2() { // from class: com.xiaomi.fitness.detail.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SportDetailFragment$initTitleBar$1$1$1.invokeSuspend$lambda$1$lambda$0(imageView, sportDetailFragment, (Uri) obj, (Bitmap) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(ImageView imageView, SportDetailFragment sportDetailFragment, Uri uri, Bitmap bitmap) {
        Logger.i("SportDetailFragment", "intentToShareLongPic uri=" + imageView);
        sportDetailFragment.hideLoading();
        sportDetailFragment.goToSportReportShareActivity(uri);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(ImageView imageView, SportDetailFragment sportDetailFragment, Uri uri, Bitmap bitmap) {
        Logger.i("SportDetailFragment", "intentToShareLongPic uri=" + imageView);
        sportDetailFragment.hideLoading();
        sportDetailFragment.goToSportReportShareActivity(uri);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportDetailFragment$initTitleBar$1$1$1(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = SportReportShareExtKt.checkIfAllResourcesExist(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Logger.d("SportDetailFragment", "checkIfAllResourcesExist exist=" + zBooleanValue);
        boolean zIsNetworkConnected = NetworkUtils.isNetworkConnected(ApplicationExtKt.getApplication());
        if (!zBooleanValue && !zIsNetworkConnected) {
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ToastExtKt.toastShort(fragmentActivityRequireActivity, j1j.H);
        } else if (zBooleanValue) {
            final SportDetailFragment sportDetailFragment = this.this$0;
            final ImageView imageView = this.$it;
            sportDetailFragment.generateLongShareBitmapIfNeed(new Function2() { // from class: com.xiaomi.fitness.detail.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SportDetailFragment$initTitleBar$1$1$1.invokeSuspend$lambda$2(imageView, sportDetailFragment, (Uri) obj2, (Bitmap) obj3);
                }
            });
        } else {
            MutableLiveData<Boolean> mutableLiveDataDownloadResourcesAndGetIfDoneLiveData = SportReportShareExtKt.downloadResourcesAndGetIfDoneLiveData(this.this$0);
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            final SportDetailFragment sportDetailFragment2 = this.this$0;
            final ImageView imageView2 = this.$it;
            mutableLiveDataDownloadResourcesAndGetIfDoneLiveData.observe(viewLifecycleOwner, new SportDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.xiaomi.fitness.detail.b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return SportDetailFragment$initTitleBar$1$1$1.invokeSuspend$lambda$1(sportDetailFragment2, imageView2, (Boolean) obj2);
                }
            }));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SportDetailFragment$initTitleBar$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
