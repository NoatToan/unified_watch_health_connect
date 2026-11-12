package vv;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import bs2.c10;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import fb2.z;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvv/k;", "Lfb2/z;", "Luv/i;", "Ltv/k;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends z<uv.i<tv.k>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f180417e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context) {
        super(context);
        context.getClass();
        this.f180417e = View.generateViewId();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((uv.i) obj).getClass();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, java.lang.Object, uv.i] */
    @Override // fb2.z, fb2.e
    public final boolean k(Object obj) {
        tv.k kVar;
        tv.k kVar2;
        c10 c10Var;
        tv.k kVar3;
        c10 c10Var2;
        ?? r14 = (uv.i) obj;
        r14.getClass();
        this.f70344b = r14;
        View viewA = a();
        viewA.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) viewA;
        uv.i iVar = (uv.i) this.f70344b;
        Long lJ = null;
        Long lJ2 = (iVar == null || (kVar3 = (tv.k) iVar.f172898a) == null || (c10Var2 = kVar3.f166522a) == null) ? null : c10Var2.j(1, 65535);
        if (lJ2 == null) {
            gCMComplexTwoLineButton.setButtonBottomLeftLabel(b(R.string.no_value));
            return true;
        }
        if (lJ2.longValue() == 4294967295L) {
            gCMComplexTwoLineButton.setButtonBottomLeftLabel(b(R.string.device_settings_vector_not_linked_subtitle));
            gCMComplexTwoLineButton.setButtonRightLabel(b(R.string.device_settings_vector_button_link_title));
            return true;
        }
        uv.i iVar2 = (uv.i) this.f70344b;
        if (iVar2 != null && (kVar2 = (tv.k) iVar2.f172898a) != null && (c10Var = kVar2.f166522a) != null) {
            lJ = c10Var.j(1, 65535);
        }
        String strC = c(R.string.device_settings_vector_pedal_id_subtitle, lJ);
        strC.getClass();
        uv.i iVar3 = (uv.i) this.f70344b;
        ImageSpan imageSpan = new ImageSpan(this.f70343a, (iVar3 == null || (kVar = (tv.k) iVar3.f172898a) == null || !kVar.f166525d) ? R.drawable.gcm_device_disconnected_circle : R.drawable.gcm_device_connected_circle, 1);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strC.concat("  "));
        spannableStringBuilder.setSpan(imageSpan, strC.length() + 1, strC.length() + 2, 33);
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(spannableStringBuilder);
        gCMComplexTwoLineButton.setButtonRightLabel(b(R.string.device_settings_vector_button_unlink_title));
        return true;
    }

    @Override // fb2.z
    public final String q(uv.i<tv.k> iVar) {
        iVar.getClass();
        return "";
    }

    @Override // fb2.z
    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getF180417e() {
        return this.f180417e;
    }

    @Override // fb2.z
    public final String t() {
        String strB = b(R.string.activities_details_pco_right_pedal);
        strB.getClass();
        return strB;
    }
}
