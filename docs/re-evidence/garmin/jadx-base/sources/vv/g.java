package vv;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import fb2.z;
import p005kotlin.Metadata;
import vg1.z0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvv/g;", "Lfb2/z;", "Luv/i;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends z<uv.i<?>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GCMComplexTwoLineButton f180413e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        context.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = new GCMComplexTwoLineButton(context);
        gCMComplexTwoLineButton.f47790j.setVisibility(8);
        gCMComplexTwoLineButton.setId(View.generateViewId());
        this.f180413e = gCMComplexTwoLineButton;
    }

    public static void u(g gVar) {
        gVar.setChanged();
        gVar.notifyObservers();
    }

    @Override // fb2.z, fb2.e
    public final View a() {
        return this.f180413e;
    }

    @Override // fb2.z, fb2.e
    public final /* bridge */ /* synthetic */ boolean g(i.c cVar, Object obj) {
        v(cVar, (uv.i) obj);
        return true;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((uv.i) obj).getClass();
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, uv.i] */
    @Override // fb2.z, fb2.e
    public final boolean k(Object obj) {
        ?? r14 = (uv.i) obj;
        r14.getClass();
        this.f70344b = r14;
        w();
        return true;
    }

    @Override // fb2.e
    public final void m(boolean z14) {
        this.f180413e.setVisible(z14);
    }

    @Override // fb2.z
    public final String q(uv.i<?> iVar) {
        iVar.getClass();
        return "";
    }

    @Override // fb2.z
    /* JADX INFO: renamed from: s */
    public final int getF93393e() {
        return this.f180413e.getId();
    }

    @Override // fb2.z
    public final String t() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v(i.c cVar, uv.i<?> iVar) {
        cVar.getClass();
        iVar.getClass();
        this.f70344b = iVar;
        w();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w() {
        uv.e eVar;
        uv.i iVar = (uv.i) this.f70344b;
        String str = (iVar == null || (eVar = iVar.f172899b) == null) ? null : eVar.f172884a;
        uv.e eVar2 = iVar != null ? iVar.f172899b : null;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f180413e;
        if (eVar2 == null) {
            gCMComplexTwoLineButton.setOnClickListener(null);
            gCMComplexTwoLineButton.setButtonTopLabel(b(R.string.device_settings_vector_firmware_update_checking_status_title));
            gCMComplexTwoLineButton.e(true);
            gCMComplexTwoLineButton.c(false);
            gCMComplexTwoLineButton.d(false);
            return;
        }
        if (str == null) {
            gCMComplexTwoLineButton.setOnClickListener(null);
            gCMComplexTwoLineButton.setButtonTopLabel(b(R.string.device_settings_vector_firmware_unknown_title));
            gCMComplexTwoLineButton.e(false);
            gCMComplexTwoLineButton.c(false);
            gCMComplexTwoLineButton.d(true);
            gCMComplexTwoLineButton.setRightIcon(a7.b.getDrawable(this.f70343a, 2131231971));
            gCMComplexTwoLineButton.setClickable(false);
            return;
        }
        if (!str.equals("")) {
            uv.i iVar2 = (uv.i) this.f70344b;
            if (!str.equals(iVar2 != null ? iVar2.f172902e : null)) {
                gCMComplexTwoLineButton.setOnClickListener(new z0(this, 4));
                gCMComplexTwoLineButton.setButtonTopLabel(b(R.string.devices_update_available));
                gCMComplexTwoLineButton.e(false);
                gCMComplexTwoLineButton.c(false);
                gCMComplexTwoLineButton.d(false);
                return;
            }
        }
        gCMComplexTwoLineButton.setOnClickListener(null);
        uv.i iVar3 = (uv.i) this.f70344b;
        gCMComplexTwoLineButton.setButtonTopLabel(c(R.string.device_settings_vector_firmware_version, iVar3 != null ? iVar3.f172902e : null));
        gCMComplexTwoLineButton.e(false);
        gCMComplexTwoLineButton.c(true);
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(b(R.string.lbl_software_up_to_date));
        gCMComplexTwoLineButton.d(false);
    }
}
