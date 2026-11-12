package rw0;

import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import com.garmin.android.apps.connectmobile.view.GCMMapPreview;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrw0/j;", "Landroidx/lifecycle/k0;", "Lcom/garmin/android/apps/connectmobile/view/GCMMapPreview;", "mapView", "<init>", "(Lcom/garmin/android/apps/connectmobile/view/GCMMapPreview;)V", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GCMMapPreview f154839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0.b f154840b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f154841a;

        static {
            int[] iArr = new int[b0.a.values().length];
            try {
                iArr[b0.a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b0.a.ON_CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b0.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b0.a.ON_RESUME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b0.a.ON_PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b0.a.ON_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f154841a = iArr;
        }
    }

    public j(GCMMapPreview gCMMapPreview) {
        gCMMapPreview.getClass();
        this.f154839a = gCMMapPreview;
        this.f154840b = b0.b.INITIALIZED;
    }

    public final void a(b0.a aVar) {
        int i14 = a.f154841a[aVar.ordinal()];
        GCMMapPreview gCMMapPreview = this.f154839a;
        switch (i14) {
            case 1:
                gCMMapPreview.onDestroy();
                break;
            case 2:
                gCMMapPreview.onCreate(new Bundle());
                break;
            case 3:
                gCMMapPreview.onStart();
                break;
            case 4:
                gCMMapPreview.onResume();
                break;
            case 5:
                gCMMapPreview.onPause();
                break;
            case 6:
                gCMMapPreview.onStop();
                break;
            default:
                e0.t(aVar, "Unsupported lifecycle event: ");
                return;
        }
        this.f154840b = aVar.a();
    }

    public final void b(b0.b bVar) {
        while (true) {
            b0.b bVar2 = this.f154840b;
            if (bVar2 == bVar) {
                return;
            }
            if (bVar2.compareTo(bVar) < 0) {
                b0.a.Companion companion = b0.a.INSTANCE;
                b0.b bVar3 = this.f154840b;
                companion.getClass();
                b0.a aVarB = b0.a.Companion.b(bVar3);
                if (aVarB == null) {
                    androidx.core.view.j.x(this.f154840b, "no event up from ");
                    return;
                }
                a(aVarB);
            } else if (this.f154840b.compareTo(bVar) > 0) {
                b0.a.Companion companion2 = b0.a.INSTANCE;
                b0.b bVar4 = this.f154840b;
                companion2.getClass();
                b0.a aVarA = b0.a.Companion.a(bVar4);
                if (aVarA == null) {
                    androidx.core.view.j.x(this.f154840b, "no event down from ");
                    return;
                }
                a(aVarA);
            } else {
                continue;
            }
        }
    }

    @Override // androidx.lifecycle.k0
    public final void onStateChanged(n0 n0Var, b0.a aVar) {
        if (a.f154841a[aVar.ordinal()] != 1) {
            b(aVar.a());
            return;
        }
        b0.b bVar = this.f154840b;
        b0.b bVar2 = b0.b.CREATED;
        if (bVar.compareTo(bVar2) > 0) {
            b(bVar2);
        }
    }
}
