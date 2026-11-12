package y80;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.Pair;
import c22.c2;
import c22.h2;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ly80/a0;", "", "", "densityDpi", "<init>", "(I)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f195083b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f195084a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f195085a;

        static {
            int[] iArr = new int[zb0.u0.values().length];
            try {
                iArr[zb0.u0.f203822u4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zb0.u0.N2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zb0.u0.O2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[zb0.u0.T2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[zb0.u0.U2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[zb0.u0.X2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[zb0.u0.V2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[zb0.u0.f203786o3.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[zb0.u0.G5.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[zb0.u0.K5.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[zb0.u0.f203707c4.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[zb0.u0.f203713d4.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[zb0.u0.f203701b4.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[zb0.u0.f203810s3.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[zb0.u0.Y3.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[zb0.u0.K3.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[zb0.u0.H3.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[zb0.u0.I3.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[zb0.u0.J3.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[zb0.u0.L3.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[zb0.u0.M3.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[zb0.u0.O3.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[zb0.u0.f203840x4.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[zb0.u0.M1.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[zb0.u0.N1.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[zb0.u0.X3.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[zb0.u0.f203771m2.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[zb0.u0.f203778n2.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            f195085a = iArr;
        }
    }

    static {
        new a(null);
    }

    public a0(int i14) {
        this.f195084a = i14;
    }

    public static aa0.d a(String str, dr1.a aVar, Map map, k22.a aVar2, String str2) {
        String strD;
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        List<dr1.b> listA = aVar.a();
        int iA = p13.t0.a(p13.y.r(listA, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator<T> it = listA.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dr1.b bVar = (dr1.b) it.next();
            String title = bVar.getTitle();
            String strD2 = null;
            String str3 = "";
            if (title != null) {
                strD = aVar2.d(title);
                if (strD == null) {
                    Context context = (Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null);
                    Parcelable.Creator<h2> creator = h2.CREATOR;
                    context.getClass();
                    c2.f23014a.getClass();
                    c2 c2VarA = c2.a.a();
                    strD = c2VarA != null ? c2VarA.d(title) : null;
                    if (strD == null) {
                        strD = "";
                    }
                }
            } else {
                strD = null;
            }
            if (strD != null && d53.w.z(strD, "%1$", false) && str2 != null) {
                strD = d(aVar2, bVar.getTitle(), str2);
            }
            String text = bVar.getText();
            if (text != null) {
                String strD3 = aVar2.d(text);
                if (strD3 == null) {
                    Context context2 = (Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null);
                    Parcelable.Creator<h2> creator2 = h2.CREATOR;
                    context2.getClass();
                    c2.f23014a.getClass();
                    c2 c2VarA2 = c2.a.a();
                    strD2 = c2VarA2 != null ? c2VarA2.d(text) : null;
                    if (strD2 == null) {
                        strD2 = "";
                    }
                } else {
                    strD2 = strD3;
                }
            }
            if (strD2 != null && d53.w.z(strD2, "%1$", false) && str2 != null) {
                strD2 = d(aVar2, bVar.getText(), str2);
            }
            if (strD2 != null) {
                str3 = strD2;
            }
            o13.p pVar = new o13.p(bVar.getMarkerName(), new ba0.a(str3, strD));
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
        List<Integer> listB = aVar.b();
        String pairingMarkerName = aVar.getPairingMarkerName();
        Boolean revisitTutorialsAvailable = aVar.getRevisitTutorialsAvailable();
        return new aa0.d(str, linkedHashMap, listB, pairingMarkerName, map, revisitTutorialsAvailable != null ? revisitTutorialsAvailable.booleanValue() : false);
    }

    public static String d(k22.a aVar, String str, String... strArr) {
        if (str == null) {
            return null;
        }
        String strA = aVar.a(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        if (strA != null) {
            return strA;
        }
        Context context = (Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null);
        Parcelable.Creator<h2> creator = h2.CREATOR;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        context.getClass();
        str.getClass();
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
        Parcelable.Creator<h2> creator2 = h2.CREATOR;
        c2.f23014a.getClass();
        c2 c2VarA = c2.a.a();
        String strB = c2VarA != null ? c2VarA.b(str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length)) : null;
        return strB == null ? "" : strB;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0062  */
    public final r0 b(Context context, br1.a aVar, LinkedHashMap<Pair<Integer, Integer>, Drawable> linkedHashMap, List<er1.c> list, String str, int i14) throws Throwable {
        int i15;
        int identifier;
        Drawable[] drawableArr = new Drawable[list.size()];
        String[] strArr = new String[list.size()];
        int[] iArr = new int[list.size()];
        int i16 = 0;
        int i17 = 0;
        for (Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                p13.x.q();
                throw null;
            }
            er1.c cVar = (er1.c) obj;
            if (cVar != null) {
                String deviceBackgroundImage = cVar.getDeviceBackgroundImage();
                if (deviceBackgroundImage != null) {
                    String strC = c(aVar, deviceBackgroundImage);
                    zp0.c.f206560v.getClass();
                    zp0.c cVar2 = new zp0.c(context);
                    cVar2.f206565e = strC;
                    Drawable drawableF = cVar2.f();
                    if (drawableF != null) {
                        linkedHashMap.put(new Pair<>(Integer.valueOf(i14), Integer.valueOf(i17)), drawableF);
                    }
                }
                String deviceFaceImage = cVar.getDeviceFaceImage();
                if (deviceFaceImage != null) {
                    String strC2 = c(aVar, deviceFaceImage);
                    zp0.c.f206560v.getClass();
                    zp0.c cVar3 = new zp0.c(context);
                    cVar3.f206565e = strC2;
                    Drawable drawableF2 = cVar3.f();
                    if (drawableF2 != null) {
                        drawableArr[i17] = drawableF2;
                    } else {
                        String strM = am.j.m("Image downloaded is NULL for URL=[", strC2, "], so set it TRANSPARENT");
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.f(a2Var, "DeviceStorageHelper", strM);
                        drawableArr[i17] = new ColorDrawable(i16);
                    }
                } else {
                    String strG = am.j.g(i14, i17, "deviceFaceImage is NULL for this tutorial [pageIndex=", ", stateIndex=", "], so set it TRANSPARENT");
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.b(a2Var2, "DeviceStorageHelper", strG);
                    drawableArr[i17] = new ColorDrawable(0);
                }
                String description = cVar.getDescription();
                if (description == null || (identifier = context.getResources().getIdentifier(description, "string", context.getPackageName())) == 0) {
                    strArr[i17] = "";
                } else {
                    String string = context.getString(identifier);
                    string.getClass();
                    if (d53.w.z(string, "%1$", false) && str != null) {
                        string = context.getString(identifier, str);
                        string.getClass();
                    }
                    strArr[i17] = string;
                }
                Integer showTime = cVar.getShowTime();
                if (showTime != null) {
                    int iIntValue = showTime.intValue();
                    if (iIntValue == 0) {
                        iArr[i17] = 100000;
                    } else {
                        iArr[i17] = iIntValue;
                    }
                    i15 = 0;
                } else {
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.f(a2Var3, "DeviceStorageHelper", "Tutorial showTime is NULL, This should always have a valid integer value set");
                    i15 = 0;
                    iArr[i17] = 0;
                }
            } else {
                i15 = i16;
            }
            i17 = i18;
            i16 = i15;
        }
        return new r0(drawableArr, strArr, iArr);
    }

    public final String c(br1.a aVar, String str) {
        String str2;
        int i14 = this.f195084a;
        if (i14 <= 160) {
            str2 = "mdpi";
        } else if (i14 <= 240) {
            str2 = "hdpi";
        } else {
            str2 = i14 <= 320 ? "xhdpi" : "xxhdpi";
        }
        String str3 = aVar.f19574a;
        for (Object obj : aVar.f19575b) {
            String str4 = (String) obj;
            boolean z14 = d53.w.z(str4, str.concat(".webp"), false) || d53.w.z(str4, str.concat(".png"), false);
            boolean z15 = d53.w.z(str4, "/".concat(str2), false) || d53.u.y(str4, str2, false);
            if (z14 && z15) {
                return str3 + obj;
            }
        }
        obj = null;
        return str3 + obj;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Ly80/a0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "WEBP_SUFFIX", "PNG_SUFFIX", "PLACEHOLDER", "ECG_TUTORIAL", "LOTTIE_ANIMATION_FILE_SUFFIX", "LOTTIE_ANIMATION_SETUP_FILE", "LOTTIE_ANIMATION_DEVICE_FRAME_FILE", "LOTTIE_ANIMATION_WATCH_FACE_FRAME_FILE", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
