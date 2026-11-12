package p006l2;

import android.companion.CompanionDeviceManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.device.companion.data.GCMCompanionDeviceService;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripSetupActivity;
import com.garmin.android.apps.connectmobile.settings.developersettings.TestGoogleAgeSignalsActivity;
import com.garmin.android.lib.legal.LegalGatewayActivity;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.maps.android.compose.CameraPositionState;
import e23.a;
import g6.k;
import g6.l;
import hf.f;
import hf.g;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import lc.u0;
import lc.v;
import le.b;
import lf.i;
import lf.j;
import m30.t;
import me2.z;
import n01.n;
import nd2.e;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.x0;
import p005kotlin.math.MathKt;
import p008y1.b2;
import qc.d;
import vb.h;
import w63.b0.a;
import wf.m;
import xf.c;
import yc.h3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f108825b;

    public /* synthetic */ v0(Object obj, int i14) {
        this.f108824a = i14;
        this.f108825b = obj;
    }

    @Override // e23.a
    public final Object invoke() {
        i iVar;
        boolean z14;
        Bitmap bitmapCreateBitmap;
        int i14;
        int iMin;
        double dMax;
        int i15;
        int i16 = this.f108824a;
        Object obj = this.f108825b;
        switch (i16) {
            case 0:
                return new f3((b2) obj, 0.0f, 2, null);
            case 1:
                return ((b2) obj).d();
            case 2:
                return k.a(((l) obj).c());
            case 3:
                return ParametersHolderKt.parametersOf((u41.a) obj);
            case 4:
                d dVar = ((v) obj).f111888h;
                if (!dVar.f144301i) {
                    h.z("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                } else {
                    if (dVar.f144302j.f7973d != b0.b.DESTROYED) {
                        return ((d.a) x1.b.c(x1.f8070b, dVar.f144293a, (x1.c) dVar.f144305m.getValue(), 4).b(s0.f105811a.b(d.a.class))).f144306a;
                    }
                    h.z("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                return null;
            case 5:
                LegalGatewayActivity legalGatewayActivity = (LegalGatewayActivity) obj;
                LegalGatewayActivity.a aVar = LegalGatewayActivity.f49928n;
                lc2.a aVar2 = legalGatewayActivity.f49932d;
                if (aVar2 == null) {
                    s.m("documentEnum");
                    throw null;
                }
                com.garmin.android.lib.legal.d dVar2 = legalGatewayActivity.f49933e;
                if (dVar2 != null) {
                    return e.d(new URL(aVar2.a(dVar2, legalGatewayActivity.f49934f)));
                }
                s.m("localeEnum");
                throw null;
            case 6:
                boolean z15 = true;
                b bVar = (b) obj;
                Class<?> clsLoadClass = bVar.f112032a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                clsLoadClass.getClass();
                Method declaredMethod = clsLoadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> clsLoadClass2 = bVar.f112032a.loadClass("androidx.window.extensions.WindowExtensions");
                clsLoadClass2.getClass();
                te.a aVar3 = te.a.f163908a;
                declaredMethod.getClass();
                aVar3.getClass();
                if (!declaredMethod.getReturnType().equals(clsLoadClass2) || !Modifier.isPublic(declaredMethod.getModifiers())) {
                    z15 = false;
                }
                return Boolean.valueOf(z15);
            case 7:
                lf.b bVar2 = (lf.b) obj;
                int i17 = lf.b.f112070e;
                BitmapFactory.Options options = new BitmapFactory.Options();
                m mVar = bVar2.f112072b;
                lf.b.C2152b c2152b = new lf.b.C2152b(bVar2.f112071a.source());
                w63.b0 b0Var = new w63.b0(c2152b);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(b0Var.peek().new a(), null, options);
                Exception exc = c2152b.f112075a;
                if (exc != null) {
                    throw exc;
                }
                options.inJustDecodeBounds = false;
                lf.m mVar2 = lf.m.f112101a;
                String str = options.outMimeType;
                lf.l lVar = bVar2.f112074d;
                mVar2.getClass();
                if (lVar.a(str)) {
                    d8.a aVar4 = new d8.a(new j(b0Var.peek().new a()));
                    int iD = aVar4.d(1, "Orientation");
                    boolean z16 = iD == 2 || iD == 7 || iD == 4 || iD == 5;
                    switch (aVar4.d(1, "Orientation")) {
                        case 3:
                        case 4:
                            i15 = 180;
                            break;
                        case 5:
                        case 8:
                            i15 = 270;
                            break;
                        case 6:
                        case 7:
                            i15 = 90;
                            break;
                        default:
                            i15 = 0;
                            break;
                    }
                    iVar = new i(z16, i15);
                } else {
                    iVar = i.f112094c;
                }
                Exception exc2 = c2152b.f112075a;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inMutable = false;
                f.c<ColorSpace> cVar = wf.h.f184987c;
                ColorSpace colorSpace = (ColorSpace) g.b(mVar, cVar);
                Context context = mVar.f184996a;
                if (colorSpace != null) {
                    options.inPreferredColorSpace = (ColorSpace) g.b(mVar, cVar);
                }
                options.inPremultiplied = ((Boolean) g.b(mVar, wf.h.f184988d)).booleanValue();
                Bitmap.Config config = (Bitmap.Config) g.b(mVar, wf.h.f184986b);
                boolean z17 = iVar.f112095a;
                int i18 = iVar.f112096b;
                if ((z17 || i18 > 0) && (config == null || config == Bitmap.Config.HARDWARE)) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (((Boolean) g.b(mVar, wf.h.f184991g)).booleanValue() && config == Bitmap.Config.ARGB_8888 && s.g(options.outMimeType, MimeTypes.IMAGE_JPEG)) {
                    config = Bitmap.Config.RGB_565;
                }
                Bitmap.Config config2 = options.outConfig;
                Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                    config = config3;
                }
                options.inPreferredConfig = config;
                int i19 = options.outWidth;
                try {
                    if (i19 <= 0 || (i14 = options.outHeight) <= 0) {
                        options.inSampleSize = 1;
                        z14 = false;
                        options.inScaled = false;
                    } else {
                        int i24 = (i18 == 90 || i18 == 270) ? i14 : i19;
                        if (i18 != 90 && i18 != 270) {
                            i19 = i14;
                        }
                        xf.g gVar = mVar.f184997b;
                        xf.f fVar = mVar.f184998c;
                        long jA = lf.g.a(i24, i19, gVar, fVar, (xf.g) g.b(mVar, wf.g.f184982b));
                        int i25 = (int) (jA >> 32);
                        int i26 = i24;
                        int i27 = (int) (jA & 4294967295L);
                        int iHighestOneBit = Integer.highestOneBit(i26 / i25);
                        int iHighestOneBit2 = Integer.highestOneBit(i19 / i27);
                        int[] iArr = lf.g.a.f112093a;
                        int i28 = iArr[fVar.ordinal()];
                        if (i28 != 1) {
                            if (i28 == 2) {
                                iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                            } else {
                                u0.r();
                            }
                            return null;
                        }
                        iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                        if (iMin < 1) {
                            iMin = 1;
                        }
                        options.inSampleSize = iMin;
                        double d14 = iMin;
                        double d15 = ((double) i26) / d14;
                        double d16 = ((double) i19) / d14;
                        double d17 = ((double) i25) / d15;
                        double d18 = ((double) i27) / d16;
                        int i29 = iArr[fVar.ordinal()];
                        if (i29 != 1) {
                            if (i29 == 2) {
                                dMax = Math.min(d17, d18);
                            } else {
                                u0.r();
                            }
                            return null;
                        }
                        dMax = Math.max(d17, d18);
                        if (mVar.f184999d == c.INEXACT && dMax > 1.0d) {
                            dMax = 1.0d;
                        }
                        boolean z18 = dMax == 1.0d;
                        options.inScaled = !z18;
                        if (!z18) {
                            if (dMax > 1.0d) {
                                options.inDensity = MathKt.b(((double) Integer.MAX_VALUE) / dMax);
                                options.inTargetDensity = Integer.MAX_VALUE;
                            } else {
                                options.inDensity = Integer.MAX_VALUE;
                                options.inTargetDensity = MathKt.b(((double) Integer.MAX_VALUE) * dMax);
                            }
                        }
                        z14 = false;
                    }
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(b0Var.new a(), null, options);
                    b0Var.close();
                    Exception exc3 = c2152b.f112075a;
                    if (exc3 != null) {
                        throw exc3;
                    }
                    if (bitmapDecodeStream == null) {
                        h.z("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        return null;
                    }
                    bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                    if (z17 != 0 || i18 > 0) {
                        Matrix matrix = new Matrix();
                        float width = bitmapDecodeStream.getWidth() / 2.0f;
                        float height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z17) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i18 > 0) {
                            matrix.postRotate(i18, width, height);
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        float f14 = rectF.left;
                        if (f14 != 0.0f || rectF.top != 0.0f) {
                            matrix.postTranslate(-f14, -rectF.top);
                        }
                        if (i18 == 90 || i18 == 270) {
                            int height2 = bitmapDecodeStream.getHeight();
                            int width2 = bitmapDecodeStream.getWidth();
                            Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                        } else {
                            int width3 = bitmapDecodeStream.getWidth();
                            int height3 = bitmapDecodeStream.getHeight();
                            Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                            if (config5 == null) {
                                config5 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                        }
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, lf.m.f112102b);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    }
                    hf.h hVarB = hf.m.b(new BitmapDrawable(context.getResources(), bitmapDecodeStream));
                    boolean z19 = true;
                    if (options.inSampleSize <= 1 && !options.inScaled) {
                        z19 = z14;
                    }
                    return new lf.f(hVarB, z19);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jg.b.l(b0Var, th3);
                        throw th4;
                    }
                }
            case 8:
                Context applicationContext = ((lg1.a.b) obj).f112179a.getContext().getApplicationContext();
                applicationContext.getClass();
                return applicationContext;
            case 9:
                Context applicationContext2 = ((lg1.a.c) obj).f112184a.getContext().getApplicationContext();
                applicationContext2.getClass();
                return applicationContext2;
            case 10:
                int i30 = TestGoogleAgeSignalsActivity.f41746b;
                ((TestGoogleAgeSignalsActivity) obj).finish();
                return Unit.INSTANCE;
            case 11:
                return ((ll0.f) obj).f113355b.g().a() ? m3.KILOMETER : m3.MILE;
            case 12:
                ll1.e eVar = (ll1.e) obj;
                eVar.getClass();
                ge1.b.T(v1.a(eVar), null, null, new ll1.f(eVar, null), 3);
                return Unit.INSTANCE;
            case 13:
                return (ml2.l) obj;
            case 14:
                TripSetupActivity.a aVar5 = TripSetupActivity.f37081g;
                Bundle extras = ((TripSetupActivity) obj).getIntent().getExtras();
                return Boolean.valueOf(extras != null ? extras.getBoolean("EXTRA_FROM_CALENDAR") : false);
            case 15:
                ((gm2.b) obj).getClass();
                return gm2.b.a();
            case 16:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.b.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.b.f39112g;
                return Integer.valueOf(((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.b) obj).u6().f115192h + 1);
            case 17:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.c.a aVar7 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.c.f39117f;
                Bundle arguments = ((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.c) obj).getArguments();
                return Boolean.valueOf(arguments != null ? arguments.getBoolean("STOP_PREGNANCY_FLOW_KEY", false) : false);
            case 18:
                lx0.g gVar2 = (lx0.g) obj;
                ArrayList arrayList = new ArrayList();
                int iW6 = gVar2.w6();
                int f115158b = gVar2.getF115158b();
                if (iW6 <= f115158b) {
                    while (true) {
                        String string = gVar2.getString(iW6 == 1 ? R.string.mct_next_phase_day : R.string.mct_next_phase_days);
                        string.getClass();
                        x0 x0Var = x0.f105818a;
                        arrayList.add(String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(iW6)}, 1)));
                        if (iW6 != f115158b) {
                            iW6++;
                        }
                    }
                }
                return arrayList;
            case 19:
                n nVar = (n) obj;
                int i34 = m21.g.f116107v;
                h3<Key, Value> h3Var = (h3) nVar.f122148a.invoke();
                nVar.f122149b = h3Var;
                return h3Var;
            case 20:
                return Float.valueOf(((l3.x0) obj).invoke() < 1.0f ? 0.3f : 1.0f);
            case 21:
                t tVar = (t) obj;
                t.a aVar8 = tVar.f116401a;
                if (aVar8 == null) {
                    s.m("actionsListener");
                    throw null;
                }
                aVar8.d();
                tVar.dismiss();
                return Unit.INSTANCE;
            case 22:
                m40.g.a aVar9 = m40.g.f116591h;
                HelpActivity.a.e(HelpActivity.f36653a, ((m40.g) obj).requireActivity(), ro0.l.COURSE_CLIMB_PRO, null, null, 12);
                return Unit.INSTANCE;
            case 23:
                return ParametersHolderKt.parametersOf((r70.s) obj);
            case 24:
                int i35 = GCMCompanionDeviceService.f33735b;
                return (CompanionDeviceManager) ((GCMCompanionDeviceService) obj).getSystemService(CompanionDeviceManager.class);
            case 25:
                ((ma2.a.d) obj).h();
                return null;
            case 26:
                me.l lVar2 = (me.l) obj;
                return BigInteger.valueOf(lVar2.f117980a).shiftLeft(32).or(BigInteger.valueOf(lVar2.f117981b)).shiftLeft(32).or(BigInteger.valueOf(lVar2.f117982c));
            case 27:
                return Float.valueOf(((CameraPositionState) obj).getPosition().zoom);
            case 28:
                return z.f((ie2.l) obj);
            default:
                ((mg2.f) obj).dismiss();
                return Boolean.TRUE;
        }
    }
}
