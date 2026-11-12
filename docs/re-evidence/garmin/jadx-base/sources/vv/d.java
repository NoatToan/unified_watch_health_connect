package vv;

import android.content.Context;
import android.view.View;
import bs2.c10;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import fb2.z;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvv/d;", "Lfb2/z;", "Luv/i;", "Ltv/k;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends z<uv.i<tv.k>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f180400e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        context.getClass();
        this.f180400e = View.generateViewId();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((uv.i) obj).getClass();
        return true;
    }

    @Override // fb2.z
    public final String q(uv.i<tv.k> iVar) {
        String strC;
        uv.i<tv.k> iVar2 = iVar;
        iVar2.getClass();
        tv.k kVar = (tv.k) iVar2.f172898a;
        if (kVar != null) {
            c10 c10Var = kVar.f166522a;
            Float fH = c10Var != null ? c10Var.h(6) : null;
            if (fH != null && (strC = c(R.string.string_space_bullet_training_effect_single_pattern, Float.valueOf(fH.floatValue()))) != null) {
                return strC;
            }
        }
        String strB = b(R.string.no_value);
        strB.getClass();
        return strB;
    }

    @Override // fb2.z
    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getF180400e() {
        return this.f180400e;
    }

    @Override // fb2.z
    public final String t() {
        String strB = b(R.string.device_settings_vector_crank_length_title);
        strB.getClass();
        return strB;
    }
}
