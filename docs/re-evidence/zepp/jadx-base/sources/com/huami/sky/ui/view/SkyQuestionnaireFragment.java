package com.huami.sky.ui.view;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.discovery.bridge.WebFragment;
import com.huami.discovery.bridge.WebLoadCallback;
import com.huami.discovery.bridge.model.WebItem;
import com.huami.module.ktx.ContextExtKt;
import com.huami.module.ktx.GlobalFunctionKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.sky.entry.SkySurveyState;
import com.huami.sky.service.SkySurveyService;
import com.huami.sky.ui.R;
import com.huami.sky.ui.analytic.SkyPlayEventKt;
import com.huami.sky.ui.view.SkyQuestionnaireFragment;
import defpackage.yp8;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/huami/sky/ui/view/SkyQuestionnaireFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "", "onViewCreated", "onResume", "<init>", "()V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyQuestionnaireFragment extends AppCompatDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "SKY_URL_KEY";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/sky/ui/view/SkyQuestionnaireFragment$Companion;", "", "", "url", "Lcom/huami/sky/ui/view/SkyQuestionnaireFragment;", "create", "SKY_QUESTION_URL_KEY", "Ljava/lang/String;", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SkyQuestionnaireFragment create(@NotNull String url) {
            SkyQuestionnaireFragment skyQuestionnaireFragment = new SkyQuestionnaireFragment();
            Bundle bundle = new Bundle();
            bundle.putString(SkyQuestionnaireFragment.a, url);
            Unit unit = Unit.INSTANCE;
            skyQuestionnaireFragment.setArguments(bundle);
            return skyQuestionnaireFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/sky/entry/SkySurveyState;", "skySurveyState", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.view.SkyQuestionnaireFragment$onViewCreated$2", f = "SkyQuestionnaireFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<SkySurveyState, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable SkySurveyState skySurveyState, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(skySurveyState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = SkyQuestionnaireFragment.this.new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((SkySurveyState) this.b) instanceof SkySurveyState.ExitSurveyPage) {
                SkyQuestionnaireFragment.this.dismissAllowingStateLoss();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SkyQuestionnaireFragment skyQuestionnaireFragment, View view) {
        skyQuestionnaireFragment.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.requestFeature(1);
            window.setGravity(80);
            window.setBackgroundDrawable(new ColorDrawable(NumberExtKt.addAlpha(ContextExtKt.loadColor(requireContext(), R.color.s40), 0.4d)));
            window.setLayout(-1, -1);
        }
        SkyPlayEventKt.recordEvent(SkyPlayEventKt.AIMUSIC_SURVEY_SHOW);
        View viewInflate = inflater.inflate(R.layout.fragment_sky_questionnaire, container);
        viewInflate.setLayoutParams(new LinearLayout.LayoutParams(GlobalFunctionKt.screenWidth(), GlobalFunctionKt.screenHeight()));
        ((AppCompatImageView) viewInflate.findViewById(R.id.sky_question_close)).setOnClickListener(new View.OnClickListener() { // from class: qy6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyQuestionnaireFragment.b(this.a, view);
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        dialog.setCanceledOnTouchOutside(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Flow<SkySurveyState> flowListenSkySurveyState;
        Flow flowOnEach;
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        WebFragment webFragmentNewInstance = WebFragment.newInstance(new WebItem(arguments == null ? null : arguments.getString(a)));
        webFragmentNewInstance.setLoadingCallback(new WebLoadCallback() { // from class: com.huami.sky.ui.view.SkyQuestionnaireFragment.onViewCreated.1
            @Override // com.huami.discovery.bridge.WebLoadCallback
            public void onError(int errorCode) {
            }

            @Override // com.huami.discovery.bridge.WebLoadCallback
            public void onPageFinish() {
                SkyPlayEventKt.recordEvent(SkyPlayEventKt.AIMUSIC_SURVEY_LOADING_SUCCESS);
            }

            @Override // com.huami.discovery.bridge.WebLoadCallback
            public void onPageStart() {
                SkyPlayEventKt.recordEvent(SkyPlayEventKt.AIMUSIC_SURVEY_LOADING_START);
            }

            @Override // com.huami.discovery.bridge.WebLoadCallback
            public void onProgressChanged(int progress) {
            }

            @Override // com.huami.discovery.bridge.WebLoadCallback
            public void onReceivedTitle(@Nullable String title) {
            }

            @Override // com.huami.discovery.bridge.WebLoadCallback
            public /* synthetic */ void onSslError(SslError sslError) {
                yp8.a(this, sslError);
            }
        });
        getChildFragmentManager().beginTransaction().replace(R.id.sky_question_webview, webFragmentNewInstance).commit();
        SkySurveyService skySurveyService = (SkySurveyService) ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(SkySurveyService.class), null, null);
        if (skySurveyService == null || (flowListenSkySurveyState = skySurveyService.listenSkySurveyState()) == null || (flowOnEach = FlowKt.onEach(flowListenSkySurveyState, new a(null))) == null) {
            return;
        }
        FlowKt.launchIn(flowOnEach, LifecycleOwnerKt.getLifecycleScope(this));
    }
}
