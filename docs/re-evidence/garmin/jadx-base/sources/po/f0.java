package po;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.view.GCMMapPreview;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import ps.d1;
import yr.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpo/f0;", "Lpo/h0;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 extends h0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f138835p = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<d1> f138836n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o0 f138837o;

    @Override // po.h0, com.garmin.android.apps.connectmobile.r1, com.garmin.android.library.mapsdkadapter.i.l
    public final void h1(com.garmin.android.library.mapsdkadapter.i iVar) {
        GCMMapPreview gCMMapPreview = this.f41077c;
        if (gCMMapPreview != null) {
            gCMMapPreview.setOnMarkerClickListener(new e0(this));
        }
        GCMMapPreview gCMMapPreview2 = this.f41077c;
        if (gCMMapPreview2 != null) {
            gCMMapPreview2.setOnMapClickListener(new e0(this));
        }
    }

    @Override // po.z, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable[] parcelableArray;
        List<d1> arrayList;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableArray = (Parcelable[]) arguments.getParcelableArray("extra_multisport_legs", d1.class);
            } else {
                parcelableArray = arguments.getParcelableArray("extra_multisport_legs");
                if (parcelableArray == null) {
                    parcelableArray = null;
                }
            }
            d1[] d1VarArr = (d1[]) parcelableArray;
            if (d1VarArr == null || (arrayList = p13.u.i0(d1VarArr)) == null) {
                arrayList = new ArrayList<>();
            }
            this.f138836n = arrayList;
            if (isResumed()) {
                A6();
            }
        }
    }

    @Override // po.h0, com.garmin.android.apps.connectmobile.r1
    public final void w6() {
        y6();
    }

    @Override // po.h0
    public final uo.a z6() {
        com.garmin.android.apps.connectmobile.activities.newmodel.w wVarD;
        Resources resources = requireContext().getResources();
        resources.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        l22.a aVar = new l22.a(contextRequireContext);
        List<d1> list = this.f138836n;
        com.garmin.android.apps.connectmobile.activities.newmodel.a aVar2 = this.f138890h;
        return c0.c(resources, aVar, list, (aVar2 == null || (wVarD = aVar2.D()) == null) ? null : wVarD.C());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpo/f0$a;", "", "<init>", "()V", "", "EXTRA_MULTISPORT_LEGS", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
