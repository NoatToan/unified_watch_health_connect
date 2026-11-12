package com.garmin.feature.garminpay.ui.developer;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import java.io.File;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/ui/developer/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f51991b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f51992a;

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        j22.b.f96736a.getClass();
        if (!j22.b.d()) {
            j22.b.y(this, 0, x.k(j22.a.f96722k, j22.a.f96721j));
            return;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        File file = null;
        File fileA = pi1.b.a(contextRequireContext, null);
        if (!fileA.exists() && !fileA.mkdirs()) {
            u6("Error", "Could not create external file directory");
        } else if (fileA.canWrite()) {
            File file2 = new File(fileA, "garminpay_logs");
            if (file2.exists() || file2.mkdir()) {
                file = file2;
            } else {
                u6("Error", "failed to create public GCM logs directory");
            }
        } else {
            u6("Error", "cannot be written to [" + fileA.getAbsolutePath() + "]");
        }
        if (file != null) {
            String absolutePath = file.getAbsolutePath();
            absolutePath.getClass();
            int i14 = gt2.c.f79010a;
            gt2.b.a aVar = gt2.b.f79005a;
            aVar.d(new gt2.a("MoveFirebasePushNotifLoggingToPublicDirFragment", absolutePath), false, true);
            String name = file.getName();
            name.getClass();
            aVar.h(name).debug("file logger initialized by MoveFirebasePushNotifLoggingToPublicDirFragment");
            u6("Success", e0.g("Logger for '", getTag(), "' moved to:\n", absolutePath, "\n\nUse the 'LogcatViewerApp' to tail logs."));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        e eVar = this.f51992a;
        if (eVar != null) {
            eVar.dismiss();
        }
    }

    public final void u6(String str, String str2) {
        m activity = getActivity();
        if (activity != null) {
            this.f51992a = new e.a(activity).setIcon(R.drawable.ic_dialog_alert).setTitle(str).setMessage(str2).setNeutralButton("Ok", (DialogInterface.OnClickListener) null).setCancelable(true).show();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/feature/garminpay/ui/developer/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "REQUEST_CODE_ASK_FOR_PERMS", "I", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
