package pl1;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.r1;
import com.garmin.android.apps.connectmobile.view.GCMMapPreview;
import com.garmin.android.library.mapsdkadapter.f;
import com.garmin.android.library.mapsdkadapter.i;
import java.util.ArrayList;
import java.util.List;
import mt0.b2;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p3.q1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lpl1/e;", "Lcom/garmin/android/apps/connectmobile/r1;", "<init>", "()V", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends r1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f138542h = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<GeoPointDTO> f138543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i.b f138544f = i.b.WGS84;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f138545g;

    public interface b {
        void V();
    }

    @Override // com.garmin.android.apps.connectmobile.r1, com.garmin.android.library.mapsdkadapter.i.l
    public final void h1(i iVar) {
        iVar.O(new b2(this, 29));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof b) {
            this.f138545g = (b) context;
            return;
        }
        throw new RuntimeException(context + " must implement InteractionListener.");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f138545g = null;
    }

    @Override // com.garmin.android.apps.connectmobile.r1, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        ArrayList parcelableArrayList;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? arguments.getParcelableArrayList("courseDetailsDTOExtraKey", GeoPointDTO.class) : arguments.getParcelableArrayList("courseDetailsDTOExtraKey");
        } else {
            parcelableArrayList = null;
        }
        this.f138543e = parcelableArrayList;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            this.f138544f = i.b.values()[arguments2.getInt("courseGeodeticSystemExtraKey")];
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r1
    public final void v6() {
    }

    @Override // com.garmin.android.apps.connectmobile.r1
    public final void w6() {
        GCMMapPreview gCMMapPreview = this.f41077c;
        if (gCMMapPreview != null) {
            gCMMapPreview.b();
        }
        GCMMapPreview gCMMapPreview2 = this.f41077c;
        if (gCMMapPreview2 != null) {
            gCMMapPreview2.d(new q1(this, 18));
        }
    }

    public final f y6(GeoPointDTO geoPointDTO) {
        Double d14 = geoPointDTO.latitude;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        Double d15 = geoPointDTO.longitude;
        return new f(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d, this.f138544f);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lpl1/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "BUNDLE_EXTRA_KEY_COURSE_DETAILS_DTO", "BUNDLE_EXTRA_KEY_COURSE_GEODETIC_SYSTEM", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
