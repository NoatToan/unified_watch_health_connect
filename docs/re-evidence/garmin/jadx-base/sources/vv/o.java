package vv;

import android.content.Context;
import android.view.View;
import bs2.q00;
import c22.l3;
import c22.m3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import fb2.z;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvv/o;", "Lfb2/z;", "Luv/i;", "Lzv/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends z<uv.i<zv.a>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f180423e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context) {
        super(context);
        context.getClass();
        this.f180423e = View.generateViewId();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((uv.i) obj).getClass();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    @Override // fb2.z
    public final String q(uv.i<zv.a> iVar) {
        int iIntValue;
        uv.i<zv.a> iVar2 = iVar;
        iVar2.getClass();
        zv.a aVar = (zv.a) iVar2.f172898a;
        if (aVar == null) {
            iIntValue = 0;
        } else {
            q00 q00Var = aVar.f207134a;
            Integer numI = q00Var != null ? q00Var.i(3) : null;
            if (numI != null) {
                iIntValue = numI.intValue();
            } else {
                iIntValue = 0;
            }
        }
        f12.l.f68084a.getClass();
        if (f12.l.a.a().k().a()) {
            return org.apache.commons.lang3.e.d(iIntValue, StringUtils.SPACE, b(R.string.lbl_mm));
        }
        l3.a aVar2 = l3.f23124b;
        double d14 = iIntValue;
        m3 m3Var = m3.MILLIMETER;
        m3 m3Var2 = m3.INCH;
        aVar2.getClass();
        return org.apache.commons.lang3.e.d(MathKt.b(l3.a.g(d14, m3Var, m3Var2)), StringUtils.SPACE, b(R.string.lbl_inch));
    }

    @Override // fb2.z
    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getF180423e() {
        return this.f180423e;
    }

    @Override // fb2.z
    public final String t() {
        String strB = b(R.string.lbl_tire_circumference);
        strB.getClass();
        return strB;
    }
}
