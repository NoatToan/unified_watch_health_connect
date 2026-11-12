package com.garmin.android.apps.connectmobile.bikesensors;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import bs2.c10;
import c22.u1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.bikesensors.VectorGeneralSettingsActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import d53.w;
import fw.p;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Observable;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import tv.l;
import uv.h;
import vg1.k0;
import vg1.s0;
import vv.f;
import vv.g;
import vv.i;
import vv.j;
import vv.k;
import vv.m;
import vv.n;
import zb0.u0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bikesensors/VectorGeneralSettingsActivity;", "Lvv/f;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VectorGeneralSettingsActivity extends f {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f30812w = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f30813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f30814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f30815r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l f30816t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f30817v;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30818a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30818a = iArr;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [tv.l] */
    /* JADX WARN: Type inference failed for: r0v1, types: [tv.l] */
    /* JADX WARN: Type inference failed for: r0v2, types: [tv.l] */
    /* JADX WARN: Type inference failed for: r0v3, types: [tv.l] */
    /* JADX WARN: Type inference failed for: r0v4, types: [tv.l] */
    public VectorGeneralSettingsActivity() {
        final int i14 = 0;
        this.f30813p = new z0(this) { // from class: tv.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VectorGeneralSettingsActivity f166527b;

            {
                this.f166527b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                ea2.b bVar;
                int i15 = i14;
                VectorGeneralSettingsActivity vectorGeneralSettingsActivity = this.f166527b;
                fw.m mVar = (fw.m) obj;
                switch (i15) {
                    case 0:
                        int i16 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        T t7 = mVar.f73770c;
                        fw.p pVar = mVar.f73769b;
                        int i17 = pVar == null ? -1 : VectorGeneralSettingsActivity.b.f30818a[pVar.ordinal()];
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 == 3) {
                                    String str = (String) t7;
                                    if (str == null) {
                                        str = "";
                                    }
                                    String str2 = (String) h0.n0(w.W(str, new String[]{StringUtils.SPACE}));
                                    String str3 = str2 != null ? str2 : "";
                                    String strM = am.j.m("deviceSettingsFetchingObserver: reason=", str3, ", notReadyReason=NOT_READY");
                                    i2.a aVar = i2.f36769a;
                                    a2 a2Var = a2.GENERAL;
                                    aVar.getClass();
                                    i2.a.b(a2Var, "VectorGeneralSettingsActivity", strM);
                                    if (!str3.equals("NOT_READY")) {
                                        vectorGeneralSettingsActivity.hideProgressOverlay();
                                        vectorGeneralSettingsActivity.pa(R.string.txt_something_went_wrong_try_again);
                                    } else {
                                        vectorGeneralSettingsActivity.hideProgressOverlay();
                                    }
                                } else {
                                    i2.a aVar2 = i2.f36769a;
                                    a2 a2Var2 = a2.GENERAL;
                                    aVar2.getClass();
                                    i2.a.b(a2Var2, "VectorGeneralSettingsActivity", "Result is null");
                                }
                                break;
                            } else {
                                vectorGeneralSettingsActivity.hideProgressOverlay();
                                String str4 = (String) t7;
                                if (str4 != null) {
                                    k kVar = new k(str4);
                                    uv.i sensorSettings = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                                    if (sensorSettings != null) {
                                        sensorSettings.f172898a = kVar;
                                    }
                                    vectorGeneralSettingsActivity.f178102a.l();
                                    long deviceUnitId = vectorGeneralSettingsActivity.f178102a.getDeviceUnitId();
                                    c10 c10Var = kVar.f166522a;
                                    uv.f fVar = new uv.f(vectorGeneralSettingsActivity, deviceUnitId, String.valueOf(c10Var != null ? c10Var.j(1, 65535) : null));
                                    l lVar = vectorGeneralSettingsActivity.f30817v;
                                    y0 y0Var = fVar.f172891d;
                                    y0Var.f(vectorGeneralSettingsActivity, lVar);
                                    z9.a.a(fVar.f172888a).b(fVar.f172892e, fVar.f172893f);
                                    y0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
                                    String strA = u1.a(fVar.f172889b);
                                    if (strA != null && (bVar = (ea2.b) hk0.p.f().getCapability(strA, ea2.b.class)) != null) {
                                        bVar.requestMessage(5055);
                                        break;
                                    }
                                }
                            }
                        } else {
                            vectorGeneralSettingsActivity.showProgressOverlay();
                            break;
                        }
                        break;
                    case 1:
                        int i18 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        if (mVar.f73769b != fw.p.SUCCESS) {
                            vectorGeneralSettingsActivity.pa(R.string.txt_something_went_wrong_try_again);
                        } else {
                            vectorGeneralSettingsActivity.pa(R.string.settings_saved_message);
                        }
                        break;
                    case 2:
                        int i19 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        T t14 = mVar.f73770c;
                        if (mVar.f73769b == fw.p.SUCCESS && t14 != 0) {
                            uv.i sensorSettings2 = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                            if (sensorSettings2 != null) {
                                sensorSettings2.f172900c = ((Number) t14).intValue();
                                sensorSettings2.f172901d = new DateTime(System.currentTimeMillis());
                            }
                            vectorGeneralSettingsActivity.f178102a.l();
                            break;
                        }
                        break;
                    case 3:
                        int i24 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        uv.i sensorSettings3 = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                        if (sensorSettings3 != null) {
                            sensorSettings3.f172899b = (uv.e) mVar.f73770c;
                        }
                        vectorGeneralSettingsActivity.f178102a.l();
                        break;
                    default:
                        int i25 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        if (mVar.f73769b == fw.p.SUCCESS) {
                            uv.i sensorSettings4 = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                            Object obj2 = sensorSettings4 != null ? sensorSettings4.f172898a : null;
                            obj2.getClass();
                            ((k) obj2).f166525d = p005kotlin.jvm.internal.s.g(mVar.f73770c, Boolean.TRUE);
                            vectorGeneralSettingsActivity.f178102a.l();
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f30814q = new z0(this) { // from class: tv.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VectorGeneralSettingsActivity f166527b;

            {
                this.f166527b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                ea2.b bVar;
                int i16 = i15;
                VectorGeneralSettingsActivity vectorGeneralSettingsActivity = this.f166527b;
                fw.m mVar = (fw.m) obj;
                switch (i16) {
                    case 0:
                        int i17 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        T t7 = mVar.f73770c;
                        fw.p pVar = mVar.f73769b;
                        int i18 = pVar == null ? -1 : VectorGeneralSettingsActivity.b.f30818a[pVar.ordinal()];
                        if (i18 != 1) {
                            if (i18 != 2) {
                                if (i18 == 3) {
                                    String str = (String) t7;
                                    if (str == null) {
                                        str = "";
                                    }
                                    String str2 = (String) h0.n0(w.W(str, new String[]{StringUtils.SPACE}));
                                    String str3 = str2 != null ? str2 : "";
                                    String strM = am.j.m("deviceSettingsFetchingObserver: reason=", str3, ", notReadyReason=NOT_READY");
                                    i2.a aVar = i2.f36769a;
                                    a2 a2Var = a2.GENERAL;
                                    aVar.getClass();
                                    i2.a.b(a2Var, "VectorGeneralSettingsActivity", strM);
                                    if (!str3.equals("NOT_READY")) {
                                        vectorGeneralSettingsActivity.hideProgressOverlay();
                                        vectorGeneralSettingsActivity.pa(R.string.txt_something_went_wrong_try_again);
                                    } else {
                                        vectorGeneralSettingsActivity.hideProgressOverlay();
                                    }
                                } else {
                                    i2.a aVar2 = i2.f36769a;
                                    a2 a2Var2 = a2.GENERAL;
                                    aVar2.getClass();
                                    i2.a.b(a2Var2, "VectorGeneralSettingsActivity", "Result is null");
                                }
                                break;
                            } else {
                                vectorGeneralSettingsActivity.hideProgressOverlay();
                                String str4 = (String) t7;
                                if (str4 != null) {
                                    k kVar = new k(str4);
                                    uv.i sensorSettings = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                                    if (sensorSettings != null) {
                                        sensorSettings.f172898a = kVar;
                                    }
                                    vectorGeneralSettingsActivity.f178102a.l();
                                    long deviceUnitId = vectorGeneralSettingsActivity.f178102a.getDeviceUnitId();
                                    c10 c10Var = kVar.f166522a;
                                    uv.f fVar = new uv.f(vectorGeneralSettingsActivity, deviceUnitId, String.valueOf(c10Var != null ? c10Var.j(1, 65535) : null));
                                    l lVar = vectorGeneralSettingsActivity.f30817v;
                                    y0 y0Var = fVar.f172891d;
                                    y0Var.f(vectorGeneralSettingsActivity, lVar);
                                    z9.a.a(fVar.f172888a).b(fVar.f172892e, fVar.f172893f);
                                    y0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
                                    String strA = u1.a(fVar.f172889b);
                                    if (strA != null && (bVar = (ea2.b) hk0.p.f().getCapability(strA, ea2.b.class)) != null) {
                                        bVar.requestMessage(5055);
                                        break;
                                    }
                                }
                            }
                        } else {
                            vectorGeneralSettingsActivity.showProgressOverlay();
                            break;
                        }
                        break;
                    case 1:
                        int i19 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        if (mVar.f73769b != fw.p.SUCCESS) {
                            vectorGeneralSettingsActivity.pa(R.string.txt_something_went_wrong_try_again);
                        } else {
                            vectorGeneralSettingsActivity.pa(R.string.settings_saved_message);
                        }
                        break;
                    case 2:
                        int i110 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        T t14 = mVar.f73770c;
                        if (mVar.f73769b == fw.p.SUCCESS && t14 != 0) {
                            uv.i sensorSettings2 = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                            if (sensorSettings2 != null) {
                                sensorSettings2.f172900c = ((Number) t14).intValue();
                                sensorSettings2.f172901d = new DateTime(System.currentTimeMillis());
                            }
                            vectorGeneralSettingsActivity.f178102a.l();
                            break;
                        }
                        break;
                    case 3:
                        int i24 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        uv.i sensorSettings3 = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                        if (sensorSettings3 != null) {
                            sensorSettings3.f172899b = (uv.e) mVar.f73770c;
                        }
                        vectorGeneralSettingsActivity.f178102a.l();
                        break;
                    default:
                        int i25 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        if (mVar.f73769b == fw.p.SUCCESS) {
                            uv.i sensorSettings4 = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                            Object obj2 = sensorSettings4 != null ? sensorSettings4.f172898a : null;
                            obj2.getClass();
                            ((k) obj2).f166525d = p005kotlin.jvm.internal.s.g(mVar.f73770c, Boolean.TRUE);
                            vectorGeneralSettingsActivity.f178102a.l();
                        }
                        break;
                }
            }
        };
        final int i16 = 2;
        this.f30815r = new z0(this) { // from class: tv.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VectorGeneralSettingsActivity f166527b;

            {
                this.f166527b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                ea2.b bVar;
                int i17 = i16;
                VectorGeneralSettingsActivity vectorGeneralSettingsActivity = this.f166527b;
                fw.m mVar = (fw.m) obj;
                switch (i17) {
                    case 0:
                        int i18 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        T t7 = mVar.f73770c;
                        fw.p pVar = mVar.f73769b;
                        int i19 = pVar == null ? -1 : VectorGeneralSettingsActivity.b.f30818a[pVar.ordinal()];
                        if (i19 != 1) {
                            if (i19 != 2) {
                                if (i19 == 3) {
                                    String str = (String) t7;
                                    if (str == null) {
                                        str = "";
                                    }
                                    String str2 = (String) h0.n0(w.W(str, new String[]{StringUtils.SPACE}));
                                    String str3 = str2 != null ? str2 : "";
                                    String strM = am.j.m("deviceSettingsFetchingObserver: reason=", str3, ", notReadyReason=NOT_READY");
                                    i2.a aVar = i2.f36769a;
                                    a2 a2Var = a2.GENERAL;
                                    aVar.getClass();
                                    i2.a.b(a2Var, "VectorGeneralSettingsActivity", strM);
                                    if (!str3.equals("NOT_READY")) {
                                        vectorGeneralSettingsActivity.hideProgressOverlay();
                                        vectorGeneralSettingsActivity.pa(R.string.txt_something_went_wrong_try_again);
                                    } else {
                                        vectorGeneralSettingsActivity.hideProgressOverlay();
                                    }
                                } else {
                                    i2.a aVar2 = i2.f36769a;
                                    a2 a2Var2 = a2.GENERAL;
                                    aVar2.getClass();
                                    i2.a.b(a2Var2, "VectorGeneralSettingsActivity", "Result is null");
                                }
                                break;
                            } else {
                                vectorGeneralSettingsActivity.hideProgressOverlay();
                                String str4 = (String) t7;
                                if (str4 != null) {
                                    k kVar = new k(str4);
                                    uv.i sensorSettings = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                                    if (sensorSettings != null) {
                                        sensorSettings.f172898a = kVar;
                                    }
                                    vectorGeneralSettingsActivity.f178102a.l();
                                    long deviceUnitId = vectorGeneralSettingsActivity.f178102a.getDeviceUnitId();
                                    c10 c10Var = kVar.f166522a;
                                    uv.f fVar = new uv.f(vectorGeneralSettingsActivity, deviceUnitId, String.valueOf(c10Var != null ? c10Var.j(1, 65535) : null));
                                    l lVar = vectorGeneralSettingsActivity.f30817v;
                                    y0 y0Var = fVar.f172891d;
                                    y0Var.f(vectorGeneralSettingsActivity, lVar);
                                    z9.a.a(fVar.f172888a).b(fVar.f172892e, fVar.f172893f);
                                    y0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
                                    String strA = u1.a(fVar.f172889b);
                                    if (strA != null && (bVar = (ea2.b) hk0.p.f().getCapability(strA, ea2.b.class)) != null) {
                                        bVar.requestMessage(5055);
                                        break;
                                    }
                                }
                            }
                        } else {
                            vectorGeneralSettingsActivity.showProgressOverlay();
                            break;
                        }
                        break;
                    case 1:
                        int i110 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        if (mVar.f73769b != fw.p.SUCCESS) {
                            vectorGeneralSettingsActivity.pa(R.string.txt_something_went_wrong_try_again);
                        } else {
                            vectorGeneralSettingsActivity.pa(R.string.settings_saved_message);
                        }
                        break;
                    case 2:
                        int i111 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        T t14 = mVar.f73770c;
                        if (mVar.f73769b == fw.p.SUCCESS && t14 != 0) {
                            uv.i sensorSettings2 = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                            if (sensorSettings2 != null) {
                                sensorSettings2.f172900c = ((Number) t14).intValue();
                                sensorSettings2.f172901d = new DateTime(System.currentTimeMillis());
                            }
                            vectorGeneralSettingsActivity.f178102a.l();
                            break;
                        }
                        break;
                    case 3:
                        int i24 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        uv.i sensorSettings3 = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                        if (sensorSettings3 != null) {
                            sensorSettings3.f172899b = (uv.e) mVar.f73770c;
                        }
                        vectorGeneralSettingsActivity.f178102a.l();
                        break;
                    default:
                        int i25 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        if (mVar.f73769b == fw.p.SUCCESS) {
                            uv.i sensorSettings4 = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                            Object obj2 = sensorSettings4 != null ? sensorSettings4.f172898a : null;
                            obj2.getClass();
                            ((k) obj2).f166525d = p005kotlin.jvm.internal.s.g(mVar.f73770c, Boolean.TRUE);
                            vectorGeneralSettingsActivity.f178102a.l();
                        }
                        break;
                }
            }
        };
        final int i17 = 3;
        this.f30816t = new z0(this) { // from class: tv.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VectorGeneralSettingsActivity f166527b;

            {
                this.f166527b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                ea2.b bVar;
                int i18 = i17;
                VectorGeneralSettingsActivity vectorGeneralSettingsActivity = this.f166527b;
                fw.m mVar = (fw.m) obj;
                switch (i18) {
                    case 0:
                        int i19 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        T t7 = mVar.f73770c;
                        fw.p pVar = mVar.f73769b;
                        int i110 = pVar == null ? -1 : VectorGeneralSettingsActivity.b.f30818a[pVar.ordinal()];
                        if (i110 != 1) {
                            if (i110 != 2) {
                                if (i110 == 3) {
                                    String str = (String) t7;
                                    if (str == null) {
                                        str = "";
                                    }
                                    String str2 = (String) h0.n0(w.W(str, new String[]{StringUtils.SPACE}));
                                    String str3 = str2 != null ? str2 : "";
                                    String strM = am.j.m("deviceSettingsFetchingObserver: reason=", str3, ", notReadyReason=NOT_READY");
                                    i2.a aVar = i2.f36769a;
                                    a2 a2Var = a2.GENERAL;
                                    aVar.getClass();
                                    i2.a.b(a2Var, "VectorGeneralSettingsActivity", strM);
                                    if (!str3.equals("NOT_READY")) {
                                        vectorGeneralSettingsActivity.hideProgressOverlay();
                                        vectorGeneralSettingsActivity.pa(R.string.txt_something_went_wrong_try_again);
                                    } else {
                                        vectorGeneralSettingsActivity.hideProgressOverlay();
                                    }
                                } else {
                                    i2.a aVar2 = i2.f36769a;
                                    a2 a2Var2 = a2.GENERAL;
                                    aVar2.getClass();
                                    i2.a.b(a2Var2, "VectorGeneralSettingsActivity", "Result is null");
                                }
                                break;
                            } else {
                                vectorGeneralSettingsActivity.hideProgressOverlay();
                                String str4 = (String) t7;
                                if (str4 != null) {
                                    k kVar = new k(str4);
                                    uv.i sensorSettings = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                                    if (sensorSettings != null) {
                                        sensorSettings.f172898a = kVar;
                                    }
                                    vectorGeneralSettingsActivity.f178102a.l();
                                    long deviceUnitId = vectorGeneralSettingsActivity.f178102a.getDeviceUnitId();
                                    c10 c10Var = kVar.f166522a;
                                    uv.f fVar = new uv.f(vectorGeneralSettingsActivity, deviceUnitId, String.valueOf(c10Var != null ? c10Var.j(1, 65535) : null));
                                    l lVar = vectorGeneralSettingsActivity.f30817v;
                                    y0 y0Var = fVar.f172891d;
                                    y0Var.f(vectorGeneralSettingsActivity, lVar);
                                    z9.a.a(fVar.f172888a).b(fVar.f172892e, fVar.f172893f);
                                    y0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
                                    String strA = u1.a(fVar.f172889b);
                                    if (strA != null && (bVar = (ea2.b) hk0.p.f().getCapability(strA, ea2.b.class)) != null) {
                                        bVar.requestMessage(5055);
                                        break;
                                    }
                                }
                            }
                        } else {
                            vectorGeneralSettingsActivity.showProgressOverlay();
                            break;
                        }
                        break;
                    case 1:
                        int i111 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        if (mVar.f73769b != fw.p.SUCCESS) {
                            vectorGeneralSettingsActivity.pa(R.string.txt_something_went_wrong_try_again);
                        } else {
                            vectorGeneralSettingsActivity.pa(R.string.settings_saved_message);
                        }
                        break;
                    case 2:
                        int i112 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        T t14 = mVar.f73770c;
                        if (mVar.f73769b == fw.p.SUCCESS && t14 != 0) {
                            uv.i sensorSettings2 = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                            if (sensorSettings2 != null) {
                                sensorSettings2.f172900c = ((Number) t14).intValue();
                                sensorSettings2.f172901d = new DateTime(System.currentTimeMillis());
                            }
                            vectorGeneralSettingsActivity.f178102a.l();
                            break;
                        }
                        break;
                    case 3:
                        int i24 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        uv.i sensorSettings3 = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                        if (sensorSettings3 != null) {
                            sensorSettings3.f172899b = (uv.e) mVar.f73770c;
                        }
                        vectorGeneralSettingsActivity.f178102a.l();
                        break;
                    default:
                        int i25 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        if (mVar.f73769b == fw.p.SUCCESS) {
                            uv.i sensorSettings4 = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                            Object obj2 = sensorSettings4 != null ? sensorSettings4.f172898a : null;
                            obj2.getClass();
                            ((k) obj2).f166525d = p005kotlin.jvm.internal.s.g(mVar.f73770c, Boolean.TRUE);
                            vectorGeneralSettingsActivity.f178102a.l();
                        }
                        break;
                }
            }
        };
        final int i18 = 4;
        this.f30817v = new z0(this) { // from class: tv.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VectorGeneralSettingsActivity f166527b;

            {
                this.f166527b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                ea2.b bVar;
                int i19 = i18;
                VectorGeneralSettingsActivity vectorGeneralSettingsActivity = this.f166527b;
                fw.m mVar = (fw.m) obj;
                switch (i19) {
                    case 0:
                        int i110 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        T t7 = mVar.f73770c;
                        fw.p pVar = mVar.f73769b;
                        int i111 = pVar == null ? -1 : VectorGeneralSettingsActivity.b.f30818a[pVar.ordinal()];
                        if (i111 != 1) {
                            if (i111 != 2) {
                                if (i111 == 3) {
                                    String str = (String) t7;
                                    if (str == null) {
                                        str = "";
                                    }
                                    String str2 = (String) h0.n0(w.W(str, new String[]{StringUtils.SPACE}));
                                    String str3 = str2 != null ? str2 : "";
                                    String strM = am.j.m("deviceSettingsFetchingObserver: reason=", str3, ", notReadyReason=NOT_READY");
                                    i2.a aVar = i2.f36769a;
                                    a2 a2Var = a2.GENERAL;
                                    aVar.getClass();
                                    i2.a.b(a2Var, "VectorGeneralSettingsActivity", strM);
                                    if (!str3.equals("NOT_READY")) {
                                        vectorGeneralSettingsActivity.hideProgressOverlay();
                                        vectorGeneralSettingsActivity.pa(R.string.txt_something_went_wrong_try_again);
                                    } else {
                                        vectorGeneralSettingsActivity.hideProgressOverlay();
                                    }
                                } else {
                                    i2.a aVar2 = i2.f36769a;
                                    a2 a2Var2 = a2.GENERAL;
                                    aVar2.getClass();
                                    i2.a.b(a2Var2, "VectorGeneralSettingsActivity", "Result is null");
                                }
                                break;
                            } else {
                                vectorGeneralSettingsActivity.hideProgressOverlay();
                                String str4 = (String) t7;
                                if (str4 != null) {
                                    k kVar = new k(str4);
                                    uv.i sensorSettings = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                                    if (sensorSettings != null) {
                                        sensorSettings.f172898a = kVar;
                                    }
                                    vectorGeneralSettingsActivity.f178102a.l();
                                    long deviceUnitId = vectorGeneralSettingsActivity.f178102a.getDeviceUnitId();
                                    c10 c10Var = kVar.f166522a;
                                    uv.f fVar = new uv.f(vectorGeneralSettingsActivity, deviceUnitId, String.valueOf(c10Var != null ? c10Var.j(1, 65535) : null));
                                    l lVar = vectorGeneralSettingsActivity.f30817v;
                                    y0 y0Var = fVar.f172891d;
                                    y0Var.f(vectorGeneralSettingsActivity, lVar);
                                    z9.a.a(fVar.f172888a).b(fVar.f172892e, fVar.f172893f);
                                    y0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
                                    String strA = u1.a(fVar.f172889b);
                                    if (strA != null && (bVar = (ea2.b) hk0.p.f().getCapability(strA, ea2.b.class)) != null) {
                                        bVar.requestMessage(5055);
                                        break;
                                    }
                                }
                            }
                        } else {
                            vectorGeneralSettingsActivity.showProgressOverlay();
                            break;
                        }
                        break;
                    case 1:
                        int i112 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        if (mVar.f73769b != fw.p.SUCCESS) {
                            vectorGeneralSettingsActivity.pa(R.string.txt_something_went_wrong_try_again);
                        } else {
                            vectorGeneralSettingsActivity.pa(R.string.settings_saved_message);
                        }
                        break;
                    case 2:
                        int i113 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        T t14 = mVar.f73770c;
                        if (mVar.f73769b == fw.p.SUCCESS && t14 != 0) {
                            uv.i sensorSettings2 = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                            if (sensorSettings2 != null) {
                                sensorSettings2.f172900c = ((Number) t14).intValue();
                                sensorSettings2.f172901d = new DateTime(System.currentTimeMillis());
                            }
                            vectorGeneralSettingsActivity.f178102a.l();
                            break;
                        }
                        break;
                    case 3:
                        int i24 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        uv.i sensorSettings3 = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                        if (sensorSettings3 != null) {
                            sensorSettings3.f172899b = (uv.e) mVar.f73770c;
                        }
                        vectorGeneralSettingsActivity.f178102a.l();
                        break;
                    default:
                        int i25 = VectorGeneralSettingsActivity.f30812w;
                        mVar.getClass();
                        if (mVar.f73769b == fw.p.SUCCESS) {
                            uv.i sensorSettings4 = vectorGeneralSettingsActivity.f178102a.getSensorSettings();
                            Object obj2 = sensorSettings4 != null ? sensorSettings4.f172898a : null;
                            obj2.getClass();
                            ((k) obj2).f166525d = p005kotlin.jvm.internal.s.g(mVar.f73770c, Boolean.TRUE);
                            vectorGeneralSettingsActivity.f178102a.l();
                        }
                        break;
                }
            }
        };
    }

    @Override // vg1.f0
    public final void da() {
        ca(new vv.c(this), 4);
        ca(new m(this, R.string.device_settings_vector_section_title_firmware, null, null, 12, null), 4);
        ca(new g(this), 4);
        ca(new m(this, R.string.device_settings_vector_section_title_status, null, null, 12, null), 4);
        ca(new vv.b(this), 4);
        ca(new n(this), 4);
        ca(new m(this, R.string.device_settings_vector_section_title_pedals, null, null, 12, null), 4);
        ca(new i(this), 4);
        k kVar = new k(this);
        t61.m mVar = new t61.m(this, 7);
        View viewA = kVar.a();
        viewA.getClass();
        ((GCMComplexTwoLineButton) viewA).setSecondActionOnClickListener(mVar);
        ca(kVar, 4);
        ca(new m(this, R.string.action_settings, null, null, 12, null), 4);
        ca(new vv.a(this), 4);
        ca(new vv.d(this), 4);
        ca(new m(this, R.string.device_settings_vector_scale_factor_title, null, null, 12, null), 4);
        ca(new j(this), 4);
        ca(new vv.l(this), 4);
    }

    @Override // vg1.f0
    public final k0 fa() {
        File filesDir = getFilesDir();
        filesDir.getClass();
        return new k0(this, this, 16, p13.w.c(new s0(this, new h.a(27, "SETTINGS.FIT", filesDir), this.f30813p, this.f30814q, this.f30815r, this.f30816t)));
    }

    @Override // vg1.f0
    public final String ga() {
        String string = getString(R.string.devices_settings_device_settings);
        string.getClass();
        return string;
    }

    @Override // vv.f
    public final o13.p<String, String> oa(vv.e eVar) {
        eVar.getClass();
        return eVar == vv.e.DEVICE_NOT_CONNECTED ? new o13.p<>(null, getString(R.string.device_settings_pedals_connecting_message)) : new o13.p<>(getString(R.string.device_settings_pedal_disconnected_title), getString(R.string.device_settings_pedal_disconnected_message));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Bundle extras;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            if (u0.n(this.f178102a.i(), u0.R5) || u0.n(this.f178102a.i(), u0.U5)) {
                HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.RALLY_FW_UPDATE, null, null, 12);
                finish();
                return;
            }
            String strI = this.f178102a.i();
            Intent intent2 = new Intent(this, (Class<?>) VectorSensorErrorsHelpActivity.class);
            intent2.putExtra("isErrorCodeActivity", false);
            intent2.putExtra("GCM_deviceProductNbr", strI);
            startActivity(intent2);
            return;
        }
        if ((i14 == 10 && i15 == 0) || intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        long j8 = extras.getLong("RIGHT_PEDAL_ID", 4294967295L);
        float f14 = extras.getFloat("SETTING_VALUE", -1.0f);
        if (i14 == 1014 || f14 != -1.0f) {
            uv.i sensorSettings = this.f178102a.getSensorSettings();
            tv.k kVar = (tv.k) (sensorSettings != null ? sensorSettings.f172898a : null);
            switch (i14) {
                case 1011:
                    if (kVar != null) {
                        c10 c10Var = kVar.f166522a;
                        if (!s.b(f14, c10Var != null ? c10Var.h(2) : null)) {
                            BigDecimal scale = new BigDecimal(f14).setScale(3, RoundingMode.HALF_EVEN);
                            if (c10Var != null) {
                                c10Var.n(2, scale != null ? Float.valueOf(scale.floatValue()) : null);
                            }
                            kVar.f166524c = true;
                        }
                    }
                    break;
                case 1012:
                    if (kVar != null) {
                        c10 c10Var2 = kVar.f166522a;
                        if (!s.b(f14, c10Var2 != null ? c10Var2.h(3) : null)) {
                            BigDecimal scale2 = new BigDecimal(f14).setScale(3, RoundingMode.HALF_EVEN);
                            if (c10Var2 != null) {
                                c10Var2.n(3, scale2 != null ? Float.valueOf(scale2.floatValue()) : null);
                            }
                            kVar.f166524c = true;
                        }
                    }
                    break;
                case 1013:
                    if (kVar != null) {
                        Float fValueOf = Float.valueOf(f14);
                        c10 c10Var3 = kVar.f166522a;
                        if (!s.b(f14, c10Var3 != null ? c10Var3.h(6) : null)) {
                            if (c10Var3 != null) {
                                c10Var3.n(6, fValueOf);
                            }
                            kVar.f166524c = true;
                        }
                    }
                    break;
                case 1014:
                    if (kVar != null) {
                        kVar.f(Long.valueOf(j8));
                    }
                    break;
            }
            this.f178102a.l();
        }
    }

    public final void pa(int i14) {
        hideProgressOverlay();
        Toast.makeText(this, getString(i14), 0).show();
        finish();
    }

    @Override // vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        c10 c10Var;
        uv.i sensorSettings;
        uv.i sensorSettings2;
        uv.i sensorSettings3;
        String string;
        observable.getClass();
        uv.i sensorSettings4 = this.f178102a.getSensorSettings();
        tv.k kVar = (tv.k) (sensorSettings4 != null ? sensorSettings4.f172898a : null);
        if (observable instanceof vv.c) {
            CalibrationSettingsActivity.a aVar = CalibrationSettingsActivity.f30766m;
            Long lValueOf = Long.valueOf(this.f178102a.getDeviceUnitId());
            String macAddress = this.f178102a.getMacAddress();
            aVar.getClass();
            Intent intent = new Intent(this, (Class<?>) CalibrationSettingsActivity.class);
            intent.putExtra("GCM_deviceUnitID", lValueOf);
            intent.putExtra("GCM_macAddress", macAddress);
            startActivity(intent);
        }
        if (observable instanceof g) {
            g gVar = (g) observable;
            uv.i sensorSettings5 = this.f178102a.getSensorSettings();
            uv.e eVar = sensorSettings5 != null ? sensorSettings5.f172899b : null;
            if (eVar == null || !eVar.a()) {
                if ((eVar != null ? eVar.f172884a : null) == null) {
                    uv.i sensorSettings6 = this.f178102a.getSensorSettings();
                    sensorSettings6.getClass();
                    gVar.v(this, sensorSettings6);
                    this.f178102a.a();
                }
            } else {
                uv.i sensorSettings7 = this.f178102a.getSensorSettings();
                if ((sensorSettings7 == null || sensorSettings7.f172900c != 1) && (((sensorSettings = this.f178102a.getSensorSettings()) == null || sensorSettings.f172900c != 2) && ((sensorSettings2 = this.f178102a.getSensorSettings()) == null || sensorSettings2.f172900c != 3))) {
                    uv.i sensorSettings8 = this.f178102a.getSensorSettings();
                    if ((sensorSettings8 == null || sensorSettings8.f172900c != 4) && ((sensorSettings3 = this.f178102a.getSensorSettings()) == null || sensorSettings3.f172900c != 5)) {
                        string = getString(R.string.msg_device_battery_unknown, getString(R.string.title_garmin));
                        string.getClass();
                    } else {
                        string = getString(R.string.msg_device_battery_too_low, getString(R.string.title_garmin));
                        string.getClass();
                    }
                    new androidx.appcompat.app.e.a(this).setTitle(getString(R.string.device_settings_vector_firmware_update_failed)).setMessage(string).setCancelable(true).setPositiveButton(getString(R.string.lbl_ok), new qh1.j(23)).create().show();
                } else {
                    DeviceSettingsFirmwareUpdate.da(this, new c.b("", eVar.f172884a, eVar.f172885b, eVar.f172886c), this.f178102a.getDeviceUnitId(), this.f178102a.i(), getString(R.string.device_settings_vector_upload_firmware_update));
                }
            }
        }
        if (observable instanceof n) {
            String strI = this.f178102a.i();
            Intent intent2 = new Intent(this, (Class<?>) VectorSensorErrorsHelpActivity.class);
            intent2.putExtra("isErrorCodeActivity", true);
            intent2.putExtra("GCM_deviceProductNbr", strI);
            startActivity(intent2);
        }
        if (observable instanceof vv.d) {
            VectorDeviceSettingsEditActivity.a aVar2 = VectorDeviceSettingsEditActivity.f30808d;
            Float fH = (kVar == null || (c10Var = kVar.f166522a) == null) ? null : c10Var.h(6);
            String string2 = getString(R.string.device_settings_vector_crank_length_title);
            string2.getClass();
            tv.j jVar = new tv.j(string2, getString(R.string.device_settings_vector_crank_length_heading), getString(R.string.device_settings_vector_crank_length_precision), getString(R.string.vector_invalid_crank_length_title), getString(R.string.vector_invalid_crank_length_msg), null, null, getString(R.string.lbl_mm), 110.0f, 236.5f, Float.valueOf(0.5f), 96, null);
            aVar2.getClass();
            VectorDeviceSettingsEditActivity.a.a(this, 1013, fH, jVar);
        }
        if (observable instanceof j) {
            VectorDeviceSettingsEditActivity.a aVar3 = VectorDeviceSettingsEditActivity.f30808d;
            Float fD = kVar != null ? kVar.d() : null;
            String string3 = getString(R.string.device_settings_vector_scale_factor_left);
            string3.getClass();
            tv.j jVar2 = new tv.j(string3, getString(R.string.device_settings_vector_scale_factor_heading_left), null, getString(R.string.vector_invalid_scale_factor_title), getString(R.string.vector_invalid_scale_factor_msg), getString(R.string.device_settings_vector_scale_factor_title), "https://support.garmin.com/en-US/?faq=dcsvFoxXte3Bmd5IMRsKb8", null, 0.75f, 1.25f, null, 1156, null);
            aVar3.getClass();
            VectorDeviceSettingsEditActivity.a.a(this, 1011, fD, jVar2);
        }
        if (observable instanceof vv.l) {
            VectorDeviceSettingsEditActivity.a aVar4 = VectorDeviceSettingsEditActivity.f30808d;
            Float fE = kVar != null ? kVar.e() : null;
            String string4 = getString(R.string.device_settings_vector_scale_factor_right);
            string4.getClass();
            tv.j jVar3 = new tv.j(string4, getString(R.string.device_settings_vector_scale_factor_heading_right), null, getString(R.string.vector_invalid_scale_factor_title), getString(R.string.vector_invalid_scale_factor_msg), getString(R.string.device_settings_vector_scale_factor_title), "https://support.garmin.com/en-US/?faq=dcsvFoxXte3Bmd5IMRsKb8", null, 0.75f, 1.25f, null, 1156, null);
            aVar4.getClass();
            VectorDeviceSettingsEditActivity.a.a(this, 1012, fE, jVar3);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bikesensors/VectorGeneralSettingsActivity$a;", "", "<init>", "()V", "", "RIGHT_PEDAL_ID", "Ljava/lang/String;", "TAG", "", "LEFT_SCALE_FACTOR_REQ_CODE", "I", "RIGHT_SCALE_FACTOR_REQ_CODE", "CRANK_LENGTH_REQ_CODE", "PEDAL_REQ_CODE", "", "DEFAULT_VALUE", "F", "MINIMUM_SCALE_FACTOR_VALUE", "MAXIMUM_SCALE_FACTOR_VALUE", "MINIMUM_CRANK_LENGTH_VALUE", "MAXIMUM_CRANK_LENGTH_VALUE", "CRANK_LENGTH_DECIMAL_VALIDATOR", "VECTOR_SCALE_FACTOR_HELP_URL", "DEVICE_SETTINGS_XML_FILE_INDEX", "DEVICE_SETTINGS_FILE_NAME", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
