package com.facebook.share.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class LikeDialog extends FacebookDialogBase<LikeContent, Result> {
    private static final String g = "LikeDialog";
    private static final int h = CallbackManagerImpl.RequestCodeOffset.Like.toRequestCode();

    @Deprecated
    public static final class Result {
        private final Bundle a;

        public Result(Bundle bundle) {
            this.a = bundle;
        }

        public Bundle getData() {
            return this.a;
        }
    }

    public class a extends ResultProcessor {
        public final /* synthetic */ FacebookCallback b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FacebookCallback facebookCallback, FacebookCallback facebookCallback2) {
            super(facebookCallback);
            this.b = facebookCallback2;
        }

        @Override // com.facebook.share.internal.ResultProcessor
        public void onSuccess(AppCall appCall, Bundle bundle) {
            this.b.onSuccess(new Result(bundle));
        }
    }

    public class b implements CallbackManagerImpl.Callback {
        public final /* synthetic */ ResultProcessor a;

        public b(ResultProcessor resultProcessor) {
            this.a = resultProcessor;
        }

        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public boolean onActivityResult(int i, Intent intent) {
            return ShareInternalUtility.handleActivityResult(LikeDialog.this.getRequestCodeField(), i, intent, this.a);
        }
    }

    public class c extends FacebookDialogBase<LikeContent, Result>.ModeHandler {

        public class a implements DialogPresenter.ParameterProvider {
            public final /* synthetic */ LikeContent a;

            public a(LikeContent likeContent) {
                this.a = likeContent;
            }

            @Override // com.facebook.internal.DialogPresenter.ParameterProvider
            public Bundle getLegacyParameters() {
                Log.e(LikeDialog.g, "Attempting to present the Like Dialog with an outdated Facebook app on the device");
                return new Bundle();
            }

            @Override // com.facebook.internal.DialogPresenter.ParameterProvider
            public Bundle getParameters() {
                return LikeDialog.f(this.a);
            }
        }

        private c() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean canShow(LikeContent likeContent, boolean z) {
            return false;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(LikeContent likeContent) {
            AppCall appCallCreateBaseAppCall = LikeDialog.this.createBaseAppCall();
            DialogPresenter.setupAppCallForNativeDialog(appCallCreateBaseAppCall, new a(likeContent), LikeDialog.g());
            return appCallCreateBaseAppCall;
        }

        public /* synthetic */ c(LikeDialog likeDialog, a aVar) {
            this();
        }
    }

    public class d extends FacebookDialogBase<LikeContent, Result>.ModeHandler {
        private d() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean canShow(LikeContent likeContent, boolean z) {
            return false;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(LikeContent likeContent) {
            AppCall appCallCreateBaseAppCall = LikeDialog.this.createBaseAppCall();
            DialogPresenter.setupAppCallForWebFallbackDialog(appCallCreateBaseAppCall, LikeDialog.f(likeContent), LikeDialog.g());
            return appCallCreateBaseAppCall;
        }

        public /* synthetic */ d(LikeDialog likeDialog, a aVar) {
            this();
        }
    }

    @Deprecated
    public LikeDialog(Activity activity) {
        super(activity, h);
    }

    @Deprecated
    public static boolean canShowNativeDialog() {
        return false;
    }

    @Deprecated
    public static boolean canShowWebFallback() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle f(LikeContent likeContent) {
        Bundle bundle = new Bundle();
        bundle.putString("object_id", likeContent.getObjectId());
        bundle.putString("object_type", likeContent.getObjectType());
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DialogFeature g() {
        return LikeDialogFeature.LIKE_DIALOG;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCodeField());
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public List<FacebookDialogBase<LikeContent, Result>.ModeHandler> getOrderedModeHandlers() {
        ArrayList arrayList = new ArrayList();
        a aVar = null;
        arrayList.add(new c(this, aVar));
        arrayList.add(new d(this, aVar));
        return arrayList;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, FacebookCallback<Result> facebookCallback) {
        callbackManagerImpl.registerCallback(getRequestCodeField(), new b(facebookCallback == null ? null : new a(facebookCallback, facebookCallback)));
    }

    @Override // com.facebook.internal.FacebookDialogBase, com.facebook.FacebookDialog
    @Deprecated
    public void show(LikeContent likeContent) {
    }

    @Deprecated
    public LikeDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    @Deprecated
    public LikeDialog(android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    @Deprecated
    public LikeDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, h);
    }
}
