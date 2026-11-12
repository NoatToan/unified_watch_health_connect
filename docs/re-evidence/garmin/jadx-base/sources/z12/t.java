package z12;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lz12/t;", "Lb32/a;", "Lb32/e;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends b32.a implements b32.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f201488b;

    @Override // b32.d
    public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new u(viewGroup);
    }

    @Override // b32.d
    public final int b() {
        return 1;
    }

    @Override // b32.d
    public final b32.e c(b32.c cVar, int i14) {
        cVar.getClass();
        if (!(cVar instanceof com.garmin.android.apps.connectmobile.userprofile.c)) {
            return null;
        }
        this.f201488b = new s((com.garmin.android.apps.connectmobile.userprofile.c) cVar);
        return this;
    }

    @Override // b32.e
    public final void d(RecyclerView.f0 f0Var, int i14) {
        String string;
        f0Var.getClass();
        u uVar = (u) f0Var;
        s sVar = this.f201488b;
        j12.k kVar = sVar != null ? sVar.f201484a.f46549b : null;
        boolean z14 = false;
        boolean z15 = sVar != null && sVar.f201484a.c();
        s sVar2 = this.f201488b;
        boolean z16 = sVar2 != null && sVar2.f201484a.a();
        Context context = uVar.itemView.getContext();
        j12.a sectionPublicity = kVar != null ? kVar.getSectionPublicity() : null;
        j12.c lastUsedDevice = kVar != null ? kVar.getLastUsedDevice() : null;
        if (sectionPublicity == null || lastUsedDevice == null) {
            return;
        }
        TextView textView = uVar.f201493d;
        if (!z16 && z15 && !sectionPublicity.getIsShowRecentDevice()) {
            z14 = true;
        }
        v22.e.r(textView, z14);
        context.getClass();
        zp0.c cVar = new zp0.c(context);
        cVar.f206565e = lastUsedDevice.getImageUrl();
        cVar.f206571k = 2131231969;
        cVar.h(uVar.f201490a);
        uVar.f201491b.setText(lastUsedDevice.getLastUsedDeviceName());
        TextView textView2 = uVar.f201492c;
        long jD = lastUsedDevice.getLastUsedDeviceUploadTime();
        DateTime dateTime = jD > 0 ? new DateTime(jD) : null;
        if (dateTime != null) {
            string = xy2.b.o(context, dateTime);
        } else {
            string = context.getString(R.string.no_value);
            string.getClass();
        }
        textView2.setText(context.getString(R.string.lbl_last_sync) + ": " + string);
    }

    @Override // b32.d
    public final int getItemCount() {
        return 1;
    }

    @Override // b32.d
    public final int getItemViewType(int i14) {
        return 0;
    }

    @Override // b32.a, b32.d
    /* JADX INFO: renamed from: isVisible */
    public final boolean getF120672c() {
        s sVar = this.f201488b;
        if (sVar != null) {
            com.garmin.android.apps.connectmobile.userprofile.c.a aVar = sVar.f201484a;
            j12.k kVar = aVar.f46549b;
            j12.a sectionPublicity = kVar != null ? kVar.getSectionPublicity() : null;
            j12.k kVar2 = aVar.f46549b;
            if ((kVar2 != null ? kVar2.getLastUsedDevice() : null) != null && (aVar.c() || (sectionPublicity != null && sectionPublicity.getIsShowRecentDevice()))) {
                return true;
            }
        }
        return false;
    }
}
