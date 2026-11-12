package y40;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ly40/i;", "Lm30/m;", "", "<init>", "()V", "b", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class i extends m30.m {

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final /* synthetic */ int f194412l1 = 0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final boolean f194413i1 = true;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final boolean f194414j1 = true;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public b f194415k1;

    public interface b {
        void f4(com.garmin.android.library.mapsdkadapter.f fVar, Integer num);
    }

    static {
        new a(null);
    }

    @Override // m30.m, j40.c
    public final void d7(com.garmin.android.library.mapsdkadapter.f fVar) {
    }

    @Override // m30.m
    public final void e8(Context context) {
    }

    public final com.garmin.android.library.mapsdkadapter.p g8(com.garmin.android.library.mapsdkadapter.f fVar) {
        com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
        pVar.d(fVar);
        pVar.e("extra_route_point_marker_tag", fVar);
        pVar.f50327a.f50315g = true;
        i8(pVar, 2131232000);
        return pVar;
    }

    @Override // m30.m, j40.c, qw0.a, com.garmin.android.library.mapsdkadapter.i.l
    public final void h1(com.garmin.android.library.mapsdkadapter.i iVar) {
        super.h1(iVar);
        iVar.r(this);
    }

    public final void h8(com.garmin.android.library.mapsdkadapter.f fVar) {
        b bVar;
        if (!this.f194413i1 || this.M0 || (bVar = this.f194415k1) == null) {
            return;
        }
        qe2.h hVar = this.f148294e;
        bVar.f4(fVar, hVar != null ? Integer.valueOf((int) hVar.f144584a.getF50270z()) : null);
    }

    public final com.garmin.android.library.mapsdkadapter.p i8(com.garmin.android.library.mapsdkadapter.p pVar, int i14) {
        Drawable drawableA;
        Context context = getContext();
        Bitmap bitmapB = null;
        if (context != null && (drawableA = j.a.a(context, i14)) != null) {
            bitmapB = d7.b.b(drawableA, 0, 0, 7);
        }
        if (context == null || bitmapB == null) {
            pVar.a(0.5f, 0.9f);
            pVar.b(i14);
            return pVar;
        }
        Bitmap bitmapA = s20.c.a(context, bitmapB);
        pVar.a(((bitmapB.getWidth() * 0.5f) + ((bitmapA.getWidth() - bitmapB.getWidth()) / 2.0f)) / bitmapA.getWidth(), ((bitmapB.getHeight() * 0.9f) + ((bitmapA.getHeight() - bitmapB.getHeight()) / 2.0f)) / bitmapA.getHeight());
        pVar.c(bitmapA);
        return pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m30.m, j40.c, qw0.a, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f194415k1 = (b) context;
        } catch (ClassCastException unused) {
            p6.b.m(context, b.class.getSimpleName());
        }
    }

    @Override // j40.c, qw0.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        this.f97017v = R.layout.gcm3_course_create_custom_fragment;
        this.f97018w = R.id.custom_course_map_container;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ly40/i$a;", "", "<init>", "()V", "", "MAIN_POLYLINE_Z_INDEX", "F", "UNDERLAY_MAIN_POLYLINE_Z_INDEX", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
