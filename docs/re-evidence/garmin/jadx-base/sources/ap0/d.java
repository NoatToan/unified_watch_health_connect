package ap0;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.i;
import androidx.fragment.app.v;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r22.u0;
import r22.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lap0/d;", "Landroidx/fragment/app/i;", "Lr22/v0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends i implements v0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11660e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f11661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f11662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u0 f11663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11664d = "OnboardingWelcomeDialogFragment";

    @Override // r22.v0
    public final void L3(u0 u0Var) {
        this.f11663c = u0Var;
    }

    @Override // r22.v0
    /* JADX INFO: renamed from: b5, reason: from getter */
    public final String getF11664d() {
        return this.f11664d;
    }

    @Override // r22.v0
    public final void g(v vVar) {
        showNow(vVar, this.f11664d);
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        ArrayList<String> arrayList;
        Object next;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("EXTRA_TITLE", "") : null;
        String str = string == null ? "" : string;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("EXTRA_SUBTITLE", "") : null;
        String str2 = string2 == null ? "" : string2;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (arrayList = arguments3.getStringArrayList("EXTRA_FEATURE_NAMES")) == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str3 : arrayList) {
            w13.c cVar = g.f11676i;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!s.g(((g) next).name(), str3));
            g gVar = (g) next;
            if (gVar != null) {
                arrayList2.add(gVar);
            }
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new z3.e(497720160, true, new b(str, str2, arrayList2, this, 0)));
        Dialog dialog = new Dialog(requireContext());
        dialog.setContentView(composeView);
        u0 u0Var = this.f11663c;
        if (u0Var != null) {
            u0Var.a();
        }
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        u0 u0Var = this.f11663c;
        if (u0Var != null) {
            u0Var.onDismiss();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lap0/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_TITLE", "EXTRA_SUBTITLE", "EXTRA_FEATURE_NAMES", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
