package ro1;

import android.graphics.Bitmap;
import androidx.lifecycle.u1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lro1/u;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends u1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f154011k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f154012a = new f0(null, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final av.g f154013b = (av.g) KoinJavaComponent.get$default(av.g.class, null, null, 6, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final am.m f154014c = (am.m) KoinJavaComponent.get$default(am.m.class, null, null, 6, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pc0.j f154015d = (pc0.j) KoinJavaComponent.get$default(pc0.j.class, null, null, 6, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zu.k f154016e = (zu.k) KoinJavaComponent.get$default(zu.k.class, null, null, 6, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<ro1.b> f154017f = new y0<>(ro1.b.Default);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0<ro1.a> f154018g = new y0<>(ro1.a.White);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w0<g3<List<l0>>> f154019h = new w0<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0<l0> f154020i = new y0<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0<g3<Bitmap>> f154021j = new y0<>();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f154022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f154023b;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f154022a = iArr;
            int[] iArr2 = new int[so1.e.values().length];
            try {
                iArr2[so1.e.BADGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[so1.e.DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f154023b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f154024a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f154024a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f154024a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f154024a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    public final void x4() {
        this.f154012a.getClass();
        if (GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_activity_stats_color_change_hint), true)) {
            com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_activity_stats_color_change_hint, GCMSettingManager.f41536b.edit(), false);
        }
    }

    public final void y4() {
        this.f154012a.getClass();
        if (GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_sticker_tap_for_more_hint), true)) {
            com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_sticker_tap_for_more_hint, GCMSettingManager.f41536b.edit(), false);
        }
    }

    public final void z4(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            p13.c0.u(arrayList, new z());
        }
        g3.f35298f.getClass();
        this.f154019h.m(g3.a.d(arrayList));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lro1/u$a;", "", "<init>", "()V", "", "MIN_IMAGE_SIZE", "I", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
