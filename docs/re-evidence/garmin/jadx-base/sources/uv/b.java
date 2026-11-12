package uv;

import android.text.TextUtils;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import fw.m;
import i3.e5;
import java.io.File;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Luv/b;", "", "", "deviceId", "Luv/h$a;", "proprieties", "<init>", "(JLuv/h$a;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f172867f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f172868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h.a f172869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f172870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f172871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3229b f172872e;

    /* JADX INFO: renamed from: uv.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"uv/b$b", "Luv/g;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3229b extends g {
        public C3229b() {
        }

        @Override // uv.g, da2.m
        public final void b(long j8) {
        }

        @Override // uv.g, da2.m
        public final void c(String str) {
            b bVar = b.this;
            bVar.f172870c.debug(b.f172867f + " - Failed to fetch device settings because " + str);
            y0 y0Var = bVar.f172871d;
            y0Var.getClass();
            y0Var.j(m.a.b(m.f73767e, new fw.g(), str, 1));
        }

        @Override // uv.g, da2.m
        public final void f(long j8, String str, String str2, String str3) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            b bVar = b.this;
            if (!zIsEmpty && j8 > 0 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                File file = new File(str2, str3);
                y0 y0Var = bVar.f172871d;
                y0Var.getClass();
                y0Var.j(m.a.g(m.f73767e, file.getAbsolutePath(), 1));
                return;
            }
            Logger logger = bVar.f172870c;
            StringBuilder sbL = e5.l(b.f172867f, " - Unable to fetch device settings. itemId -> ", str, "; fileDir -> ", str2);
            am.j.y(sbL, "; fileName -> ", str3, "; fileSize -> ");
            sbL.append(j8);
            logger.debug(sbL.toString());
            y0 y0Var2 = bVar.f172871d;
            y0Var2.getClass();
            y0Var2.j(m.a.b(m.f73767e, new fw.g(), null, 5));
        }
    }

    static {
        new a(null);
        f172867f = b.class.getSimpleName();
    }

    public b(long j8, h.a aVar) {
        aVar.getClass();
        this.f172868a = j8;
        this.f172869b = aVar;
        this.f172870c = gt2.c.b(a2.DEVICES.f28756a);
        this.f172871d = new y0();
        this.f172872e = new C3229b();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Luv/b$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
