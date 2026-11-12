package bi1;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbi1/l;", "Landroidx/fragment/app/i;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends androidx.fragment.app.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18052a = new a(null);

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(requireActivity());
        Context context = getContext();
        androidx.appcompat.app.e.a title = aVar.setTitle(context != null ? context.getString(R.string.device_setting_watch_face_incomplete_watch_face_title) : null);
        Context context2 = getContext();
        androidx.appcompat.app.e eVarCreate = title.setMessage(context2 != null ? context2.getString(R.string.device_setting_watch_face_incomplete_watch_face_message) : null).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).create();
        eVarCreate.getClass();
        return eVarCreate;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbi1/l$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
