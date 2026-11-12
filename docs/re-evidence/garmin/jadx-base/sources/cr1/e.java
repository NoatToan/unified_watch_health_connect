package cr1;

import android.content.Context;
import d53.w;
import java.util.ArrayList;
import java.util.Map;
import p005kotlin.Metadata;
import p13.y;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcr1/e;", "", "", "densityDpi", "<init>", "(I)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55361a;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.f203822u4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.N2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u0.O2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u0.f203786o3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[u0.G5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[u0.K5.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[u0.f203707c4.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[u0.f203713d4.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[u0.f203701b4.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[u0.f203810s3.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[u0.Y3.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[u0.M1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[u0.N1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[u0.X3.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[u0.f203771m2.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[u0.f203778n2.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            f55361a = iArr;
        }
    }

    static {
        new a(null);
    }

    public e(int i14) {
    }

    public static String a(Context context, String str) {
        context.getClass();
        str.getClass();
        return com.nimbusds.jose.shaded.gson.internal.a.h(context.getCacheDir().getCanonicalPath(), "/", str, "_ecg_tutorial.mp4");
    }

    public static Map b(e eVar, br1.a aVar, cr1.a aVar2) {
        aVar2.getClass();
        String str = aVar2.f55356a;
        ArrayList<String> arrayList = aVar.f19575b;
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (w.z((String) obj, str, false)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
        for (String str2 : arrayList2) {
            com.nimbusds.jose.shaded.gson.internal.a.u(w.e0(str2, str), aVar.f19574a.concat(str2), arrayList3);
        }
        return p13.u0.l(arrayList3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcr1/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "WEBP_SUFFIX", "PNG_SUFFIX", "PLACEHOLDER", "ECG_TUTORIAL", "LOTTIE_ANIMATION_FILE_SUFFIX", "LOTTIE_ANIMATION_SETUP_FILE", "LOTTIE_ANIMATION_DEVICE_FRAME_FILE", "LOTTIE_ANIMATION_WATCH_FACE_FRAME_FILE", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
