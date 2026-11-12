package com.huami.nps.view;

import android.app.Dialog;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.appcompat.widget.AppCompatImageView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.discovery.bridge.WebFragment;
import com.huami.discovery.bridge.WebLoadCallback;
import com.huami.discovery.bridge.model.WebItem;
import com.huami.module.ktx.GlobalFunctionKt;
import com.huami.nps.R;
import com.huami.nps.api.EventCloseNps;
import com.huami.nps.view.QuestionnaireFragment;
import de.greenrobot.event.EventBus;
import defpackage.yp8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¨\u0006\u0015"}, d2 = {"Lcom/huami/nps/view/QuestionnaireFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "", "onDestroyView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onResume", "Lcom/huami/nps/api/EventCloseNps;", "npsDialog", "onEventMainThread", "<init>", "()V", "Companion", "nps_release"}, k = 1, mv = {1, 5, 1})
public final class QuestionnaireFragment extends AppCompatDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "SKY_URL_KEY";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/nps/view/QuestionnaireFragment$Companion;", "", "", "url", "Lcom/huami/nps/view/QuestionnaireFragment;", "create", "SKY_QUESTION_URL_KEY", "Ljava/lang/String;", "<init>", "()V", "nps_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final QuestionnaireFragment create(@NotNull String url) {
            QuestionnaireFragment questionnaireFragment = new QuestionnaireFragment();
            Bundle bundle = new Bundle();
            bundle.putString(QuestionnaireFragment.a, url);
            Unit unit = Unit.INSTANCE;
            questionnaireFragment.setArguments(bundle);
            return questionnaireFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(QuestionnaireFragment questionnaireFragment, View view) {
        questionnaireFragment.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.requestFeature(1);
            window.setGravity(80);
            window.setBackgroundDrawableResource(R.drawable.nps_window_bg);
            window.setLayout(-1, -1);
        }
        View viewInflate = inflater.inflate(R.layout.nps_questionnaire_layout, container);
        viewInflate.setLayoutParams(new LinearLayout.LayoutParams(GlobalFunctionKt.screenWidth(), GlobalFunctionKt.screenHeight()));
        ((AppCompatImageView) viewInflate.findViewById(R.id.sky_question_close)).setOnClickListener(new View.OnClickListener() { // from class: b66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuestionnaireFragment.b(this.a, view);
            }
        });
        EventBus.getDefault().register(this);
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull EventCloseNps npsDialog) {
        dismissAllowingStateLoss();
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
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        WebFragment webFragmentNewInstance = WebFragment.newInstance(new WebItem(arguments == null ? null : arguments.getString(a)));
        webFragmentNewInstance.setLoadingCallback(new WebLoadCallback() { // from class: com.huami.nps.view.QuestionnaireFragment.onViewCreated.1
            @Override // com.huami.discovery.bridge.WebLoadCallback
            public void onError(int errorCode) {
            }

            @Override // com.huami.discovery.bridge.WebLoadCallback
            public void onPageFinish() {
            }

            @Override // com.huami.discovery.bridge.WebLoadCallback
            public void onPageStart() {
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
    }
}
