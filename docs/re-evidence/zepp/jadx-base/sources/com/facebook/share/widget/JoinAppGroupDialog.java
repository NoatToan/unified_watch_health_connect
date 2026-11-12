package com.facebook.share.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class JoinAppGroupDialog extends FacebookDialogBase<String, Result> {
    private static final String g = "game_group_join";
    private static final int h = CallbackManagerImpl.RequestCodeOffset.AppGroupJoin.toRequestCode();

    @Deprecated
    public static final class Result {
        private final Bundle a;

        public /* synthetic */ Result(Bundle bundle, a aVar) {
            this(bundle);
        }

        public Bundle getData() {
            return this.a;
        }

        private Result(Bundle bundle) {
            this.a = bundle;
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
            this.b.onSuccess(new Result(bundle, null));
        }
    }

    public class b implements CallbackManagerImpl.Callback {
        public final /* synthetic */ ResultProcessor a;

        public b(ResultProcessor resultProcessor) {
            this.a = resultProcessor;
        }

        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public boolean onActivityResult(int i, Intent intent) {
            return ShareInternalUtility.handleActivityResult(JoinAppGroupDialog.this.getRequestCodeField(), i, intent, this.a);
        }
    }

    public class c extends FacebookDialogBase<String, Result>.ModeHandler {
        private c() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean canShow(String str, boolean z) {
            return true;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(String str) {
            AppCall appCallCreateBaseAppCall = JoinAppGroupDialog.this.createBaseAppCall();
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            DialogPresenter.setupAppCallForWebDialog(appCallCreateBaseAppCall, JoinAppGroupDialog.g, bundle);
            return appCallCreateBaseAppCall;
        }

        public /* synthetic */ c(JoinAppGroupDialog joinAppGroupDialog, a aVar) {
            this();
        }
    }

    @Deprecated
    public JoinAppGroupDialog(Activity activity) {
        super(activity, h);
    }

    @Deprecated
    public static boolean canShow() {
        return true;
    }

    private static void d(FragmentWrapper fragmentWrapper, String str) {
        new JoinAppGroupDialog(fragmentWrapper).show(str);
    }

    @Deprecated
    public static void show(Activity activity, String str) {
        new JoinAppGroupDialog(activity).show(str);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCodeField());
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public List<FacebookDialogBase<String, Result>.ModeHandler> getOrderedModeHandlers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(this, null));
        return arrayList;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, FacebookCallback<Result> facebookCallback) {
        callbackManagerImpl.registerCallback(getRequestCodeField(), new b(facebookCallback == null ? null : new a(facebookCallback, facebookCallback)));
    }

    @Deprecated
    public JoinAppGroupDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    @Deprecated
    public static void show(Fragment fragment, String str) {
        d(new FragmentWrapper(fragment), str);
    }

    @Deprecated
    public JoinAppGroupDialog(android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    @Deprecated
    public static void show(android.app.Fragment fragment, String str) {
        d(new FragmentWrapper(fragment), str);
    }

    private JoinAppGroupDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, h);
    }
}
