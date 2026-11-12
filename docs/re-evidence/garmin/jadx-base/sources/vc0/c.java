package vc0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lvc0/c;", "Lei2/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsd2/f;", "databaseRecord", "<init>", "(Landroid/content/Context;Lsd2/f;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends ei2.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sd2.f f176976c;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, sd2.f fVar) {
        super(context);
        context.getClass();
        fVar.getClass();
        this.f176976c = fVar;
    }

    @Override // ei2.c
    public final String r(String str, String str2) {
        String strL;
        String strV0;
        sd2.f fVar = this.f176976c;
        if (str != null) {
            switch (str) {
                case "sideProfileImage":
                    strL = fVar.L();
                    break;
                case "defaultWatchFaceImage":
                    strL = fVar.t0();
                    break;
                case "defaultWatchFaceBlankImage":
                    strL = fVar.a1();
                    break;
                case "option1Image":
                    strL = fVar.r2();
                    break;
                case "option2Image":
                    strL = fVar.f3();
                    break;
                case "option3Image":
                    strL = fVar.w1();
                    break;
                default:
                    strL = null;
                    break;
            }
        } else {
            strL = null;
        }
        if (strL != null) {
            return strL;
        }
        if (str2 == null || (strV0 = fVar.v0()) == null) {
            return null;
        }
        String string = this.f64388a.getString(2132085973);
        string.getClass();
        String str3 = "/images/" + string + "/" + str2;
        return GCMSettingManager.k().d().concat(d53.w.z(strV0, ".json", false) ? d53.u.v(strV0, ".json", str3, false) : strV0.concat(str3));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lvc0/c$a;", "", "<init>", "()V", "", "IMAGES_PATH", "Ljava/lang/String;", "DEFAULT_WATCH_FACE_IMAGE_FIELD", "DEFAULT_WATCH_FACE_BLANK_IMAGE_FIELD", "SIDE_PROFILE_IMAGE_FIELD", "OPTION_1_IMAGE_FIELD", "OPTION_2_IMAGE_FIELD", "OPTION_3_IMAGE_FIELD", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
