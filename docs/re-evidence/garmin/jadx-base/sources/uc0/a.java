package uc0;

import android.content.Context;
import bz0.o;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.settings.dynamic.DSLSettingsException;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import okhttp3.OkHttpClient;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import sd2.f;
import zh2.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Luc0/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lni2/b;", "sectionType", "Lsd2/f;", "deviceDatabaseRecord", "Lgj1/c;", "primaryDevice", "<init>", "(Landroid/content/Context;Lni2/b;Lsd2/f;Lgj1/c;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f169936e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f169937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ni2.b f169938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f169939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gj1.c f169940d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f169941a;

        static {
            int[] iArr = new int[ni2.b.values().length];
            try {
                iArr[ni2.b.DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ni2.b.USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f169941a = iArr;
        }
    }

    static {
        new C3175a(null);
        int i14 = gt2.c.f79010a;
        f169936e = gt2.b.f79005a.h("DSL-DynamicSettingsInitializer");
    }

    public a(Context context, ni2.b bVar, f fVar, gj1.c cVar) {
        context.getClass();
        bVar.getClass();
        this.f169937a = context;
        this.f169938b = bVar;
        this.f169939c = fVar;
        this.f169940d = cVar;
    }

    public final zh2.f a() {
        OkHttpClient okHttpClientB;
        Logger logger = f169936e;
        logger.debug("frameDeviceSettingsConfiguration:");
        f fVar = this.f169939c;
        if (fVar == null) {
            logger.error("No Device Database Record.");
            return null;
        }
        String strV0 = fVar.v0();
        if (strV0 == null) {
            logger.error("No device settings filename from API");
            return null;
        }
        logger.debug("frameOkHttpClient:");
        if (((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).c()) {
            o.f22274a.getClass();
            okHttpClientB = o.b();
        } else {
            okHttpClientB = null;
        }
        if (okHttpClientB == null) {
            logger.error("No GCM credentials.");
            return null;
        }
        return new zh2.f(R.layout.settings_loading_view, null, 0, null, null, false, false, null, null, 0, new li2.d(okHttpClientB, GCMSettingManager.k().a(), GCMSettingManager.k().d()), new li2.a(fVar.getUnitID(), strV0, fVar.getSoftwareVersion(), ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName(), null, null, null, km2.a.i(fVar.getUnitID(), null, SupportedCapability.CIQ_AUDIO_CONTENT_PROVIDER.ordinal()), fVar.L2(), 112, null), 1022, null);
    }

    public final void b(i.c cVar) {
        Logger logger = f169936e;
        logger.debug("launch: initializing dynamic settings lib...");
        int[] iArr = b.f169941a;
        ni2.b bVar = this.f169938b;
        int i14 = iArr[bVar.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                logger.error("Do not know the sectiontype " + bVar);
                return;
            }
            return;
        }
        f fVar = this.f169939c;
        if (fVar == null) {
            throw new DSLSettingsException("launch: DeviceRecord must not be null to initialize device settings! ");
        }
        d dVar = new d(cVar, fVar, this.f169940d);
        zh2.f fVarA = a();
        if (fVarA == null) {
            logger.error("Unable to frame settings data object");
            return;
        }
        e eVar = e.f204807a;
        String str = ni2.b.DEVICE.f126214a;
        m80.a.C2223a c2223a = m80.a.f117132a;
        String productNumber = fVar.getProductNumber();
        c2223a.getClass();
        boolean zA = m80.a.C2223a.a(productNumber);
        eVar.getClass();
        e.c(this.f169937a, str, dVar, zA, fVarA);
    }

    /* JADX INFO: renamed from: uc0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luc0/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3175a {
        public /* synthetic */ C3175a(j jVar) {
            this();
        }

        private C3175a() {
        }
    }

    public /* synthetic */ a(Context context, ni2.b bVar, f fVar, gj1.c cVar, int i14, j jVar) {
        this(context, bVar, fVar, (i14 & 8) != 0 ? null : cVar);
    }
}
