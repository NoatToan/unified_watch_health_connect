package r22;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lr22/y;", "Landroidx/fragment/app/i;", "<init>", "()V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y extends androidx.fragment.app.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f149923b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.l<? super View, Unit> f149924a;

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String string = getString(R.string.title_exit_without_saving);
        string.getClass();
        String string2 = getString(R.string.lbl_unsaved_changes_discarded);
        string2.getClass();
        return new k0(contextRequireContext, new k0.a(string, string2, false, false, null, null, getString(R.string.lbl_exit), null, new qw0.y(this, 6), getString(R.string.common_cancel), null, new qv1.l(this), 1208, null));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr22/y$a;", "", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
