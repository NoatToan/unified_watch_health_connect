package com.facebook.internal;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.view.result.ActivityResultRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookDialog;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.base.Analysis;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b&\u0018\u0000 E*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0002EFB\u0019\b\u0014\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\bB\u0010CB\u0019\b\u0014\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\bB\u0010DJ!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u001e\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u00120\u000fR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u001e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016J&\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u001e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00172\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H$J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0015H\u0004J\b\u0010%\u001a\u00020\u0007H$R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R.\u0010-\u001a\u001a\u0012\u0014\u0012\u00120\u000fR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010,R\u0016\u00100\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R$\u0010\u000b\u001a\u0004\u0018\u00010\n8A@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\u0016\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010&8D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R,\u0010A\u001a\u0018\u0012\u0014\u0012\u00120\u000fR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u000e8$@$X¤\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006G"}, d2 = {"Lcom/facebook/internal/FacebookDialogBase;", "CONTENT", Analysis.PARAM_RESULT, "Lcom/facebook/FacebookDialog;", "content", "", "mode", "Lcom/facebook/internal/AppCall;", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/internal/AppCall;", "Lcom/facebook/CallbackManager;", "callbackManager", "", "c", "", "Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "a", "setCallbackManager", "Lcom/facebook/FacebookCallback;", "callback", "registerCallback", "", "requestCode", "Lcom/facebook/internal/CallbackManagerImpl;", "registerCallbackImpl", "", "canShow", "(Ljava/lang/Object;)Z", "canShowImpl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "show", "(Ljava/lang/Object;)V", "showImpl", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Landroid/content/Intent;", "intent", "startActivityForResult", "createBaseAppCall", "Landroid/app/Activity;", "Landroid/app/Activity;", "activity", "Lcom/facebook/internal/FragmentWrapper;", "Lcom/facebook/internal/FragmentWrapper;", "fragmentWrapper", "Ljava/util/List;", "modeHandlers", GoogleApiAvailabilityLight.a, LogUtil.I, "requestCodeField", "e", "Lcom/facebook/CallbackManager;", "getCallbackManager$facebook_common_release", "()Lcom/facebook/CallbackManager;", "setCallbackManager$facebook_common_release", "(Lcom/facebook/CallbackManager;)V", "value", "getRequestCode", "()I", "setRequestCode", "(I)V", "getActivityContext", "()Landroid/app/Activity;", "activityContext", "getOrderedModeHandlers", "()Ljava/util/List;", "orderedModeHandlers", "<init>", "(Landroid/app/Activity;I)V", "(Lcom/facebook/internal/FragmentWrapper;I)V", "Companion", "ModeHandler", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public abstract class FacebookDialogBase<CONTENT, RESULT> implements FacebookDialog<CONTENT, RESULT> {
    private static final String f = "FacebookDialog";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Activity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FragmentWrapper fragmentWrapper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private List<? extends FacebookDialogBase<CONTENT, RESULT>.ModeHandler> modeHandlers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int requestCodeField;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private CallbackManager callbackManager;

    @JvmField
    @NotNull
    public static final Object BASE_AUTOMATIC_MODE = new Object();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b¤\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0002\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\u00020\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "", "content", "", "isBestEffort", "canShow", "(Ljava/lang/Object;Z)Z", "Lcom/facebook/internal/AppCall;", "createAppCall", "(Ljava/lang/Object;)Lcom/facebook/internal/AppCall;", "a", "Ljava/lang/Object;", "getMode", "()Ljava/lang/Object;", "setMode", "(Ljava/lang/Object;)V", "mode", "<init>", "(Lcom/facebook/internal/FacebookDialogBase;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public abstract class ModeHandler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private Object mode = FacebookDialogBase.BASE_AUTOMATIC_MODE;

        public ModeHandler() {
        }

        public abstract boolean canShow(CONTENT content, boolean isBestEffort);

        @Nullable
        public abstract AppCall createAppCall(CONTENT content);

        @NotNull
        public Object getMode() {
            return this.mode;
        }

        public void setMode(@NotNull Object obj) {
            this.mode = obj;
        }
    }

    public FacebookDialogBase(@NotNull Activity activity, int i) {
        this.activity = activity;
        this.fragmentWrapper = null;
        this.requestCodeField = i;
        this.callbackManager = null;
    }

    private final List<FacebookDialogBase<CONTENT, RESULT>.ModeHandler> a() {
        if (this.modeHandlers == null) {
            this.modeHandlers = getOrderedModeHandlers();
        }
        List<? extends FacebookDialogBase<CONTENT, RESULT>.ModeHandler> list = this.modeHandlers;
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase<CONTENT, RESULT>.ModeHandler>");
        return list;
    }

    private final AppCall b(CONTENT content, Object mode) {
        boolean z = mode == BASE_AUTOMATIC_MODE;
        AppCall appCallCreateAppCall = null;
        for (FacebookDialogBase<CONTENT, RESULT>.ModeHandler modeHandler : a()) {
            if (z || Utility.areObjectsEqual(modeHandler.getMode(), mode)) {
                if (modeHandler.canShow(content, true)) {
                    try {
                        appCallCreateAppCall = modeHandler.createAppCall(content);
                        break;
                    } catch (FacebookException e) {
                        AppCall appCallCreateBaseAppCall = createBaseAppCall();
                        DialogPresenter.setupAppCallForValidationError(appCallCreateBaseAppCall, e);
                        appCallCreateAppCall = appCallCreateBaseAppCall;
                    }
                }
            }
        }
        if (appCallCreateAppCall != null) {
            return appCallCreateAppCall;
        }
        AppCall appCallCreateBaseAppCall2 = createBaseAppCall();
        DialogPresenter.setupAppCallForCannotShowError(appCallCreateBaseAppCall2);
        return appCallCreateBaseAppCall2;
    }

    private final void c(CallbackManager callbackManager) {
        CallbackManager callbackManager2 = this.callbackManager;
        if (callbackManager2 == null) {
            this.callbackManager = callbackManager;
        } else if (callbackManager2 != callbackManager) {
            Log.w(f, "You're registering a callback on a Facebook dialog with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    @Override // com.facebook.FacebookDialog
    public boolean canShow(CONTENT content) {
        return canShowImpl(content, BASE_AUTOMATIC_MODE);
    }

    public boolean canShowImpl(CONTENT content, @NotNull Object mode) {
        boolean z = mode == BASE_AUTOMATIC_MODE;
        for (FacebookDialogBase<CONTENT, RESULT>.ModeHandler modeHandler : a()) {
            if (z || Utility.areObjectsEqual(modeHandler.getMode(), mode)) {
                if (modeHandler.canShow(content, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public abstract AppCall createBaseAppCall();

    @Nullable
    public final Activity getActivityContext() {
        Activity activity = this.activity;
        if (activity != null) {
            return activity;
        }
        FragmentWrapper fragmentWrapper = this.fragmentWrapper;
        if (fragmentWrapper != null) {
            return fragmentWrapper.getActivity();
        }
        return null;
    }

    @VisibleForTesting(otherwise = 2)
    @Nullable
    /* JADX INFO: renamed from: getCallbackManager$facebook_common_release, reason: from getter */
    public final CallbackManager getCallbackManager() {
        return this.callbackManager;
    }

    @NotNull
    public abstract List<FacebookDialogBase<CONTENT, RESULT>.ModeHandler> getOrderedModeHandlers();

    /* JADX INFO: renamed from: getRequestCode, reason: from getter */
    public final int getRequestCodeField() {
        return this.requestCodeField;
    }

    @Override // com.facebook.FacebookDialog
    public void registerCallback(@NotNull CallbackManager callbackManager, @NotNull FacebookCallback<RESULT> callback) {
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        c(callbackManager);
        registerCallbackImpl((CallbackManagerImpl) callbackManager, callback);
    }

    public abstract void registerCallbackImpl(@NotNull CallbackManagerImpl callbackManager, @NotNull FacebookCallback<RESULT> callback);

    public final void setCallbackManager(@Nullable CallbackManager callbackManager) {
        this.callbackManager = callbackManager;
    }

    public final void setCallbackManager$facebook_common_release(@Nullable CallbackManager callbackManager) {
        this.callbackManager = callbackManager;
    }

    public final void setRequestCode(int i) {
        if (!FacebookSdk.isFacebookRequestCode(i)) {
            this.requestCodeField = i;
            return;
        }
        throw new IllegalArgumentException(("Request code " + i + " cannot be within the range reserved by the Facebook SDK.").toString());
    }

    @Override // com.facebook.FacebookDialog
    public void show(CONTENT content) {
        showImpl(content, BASE_AUTOMATIC_MODE);
    }

    public void showImpl(CONTENT content, @NotNull Object mode) {
        AppCall appCallB = b(content, mode);
        if (appCallB == null) {
            Log.e(f, "No code path should ever result in a null appCall");
            if (!(!FacebookSdk.isDebugEnabled())) {
                throw new IllegalStateException("No code path should ever result in a null appCall".toString());
            }
        } else {
            if (getActivityContext() instanceof ActivityResultRegistryOwner) {
                ComponentCallbacks2 activityContext = getActivityContext();
                Objects.requireNonNull(activityContext, "null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
                DialogPresenter.present(appCallB, ((ActivityResultRegistryOwner) activityContext).getActivityResultRegistry(), this.callbackManager);
                appCallB.setPending();
                return;
            }
            FragmentWrapper fragmentWrapper = this.fragmentWrapper;
            if (fragmentWrapper != null) {
                DialogPresenter.present(appCallB, fragmentWrapper);
                return;
            }
            Activity activity = this.activity;
            if (activity != null) {
                DialogPresenter.present(appCallB, activity);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void startActivityForResult(@NotNull Intent intent, int requestCode) {
        String str;
        Activity activityContext = getActivityContext();
        if (activityContext instanceof ActivityResultRegistryOwner) {
            DialogPresenter.startActivityForResultWithAndroidX(((ActivityResultRegistryOwner) activityContext).getActivityResultRegistry(), this.callbackManager, intent, requestCode);
        } else {
            if (activityContext == 0) {
                FragmentWrapper fragmentWrapper = this.fragmentWrapper;
                if (fragmentWrapper != null) {
                    fragmentWrapper.startActivityForResult(intent, requestCode);
                } else {
                    str = "Failed to find Activity or Fragment to startActivityForResult ";
                }
                if (str != null) {
                    Logger.INSTANCE.log(LoggingBehavior.DEVELOPER_ERRORS, 6, getClass().getName(), str);
                }
            }
            activityContext.startActivityForResult(intent, requestCode);
        }
        str = null;
        if (str != null) {
            Logger.INSTANCE.log(LoggingBehavior.DEVELOPER_ERRORS, 6, getClass().getName(), str);
        }
    }

    public FacebookDialogBase(@NotNull FragmentWrapper fragmentWrapper, int i) {
        this.fragmentWrapper = fragmentWrapper;
        this.activity = null;
        this.requestCodeField = i;
        if (fragmentWrapper.getActivity() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity".toString());
        }
    }

    @Override // com.facebook.FacebookDialog
    public void registerCallback(@NotNull CallbackManager callbackManager, @NotNull FacebookCallback<RESULT> callback, int requestCode) {
        c(callbackManager);
        setRequestCode(requestCode);
        registerCallback(callbackManager, callback);
    }
}
