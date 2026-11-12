package cp;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import cd0.h0;
import com.garmin.android.apps.connectmobile.R;
import com.github.chrisbanes.photoview.PhotoView;
import ez2.i;
import ez2.j;

/* JADX INFO: loaded from: classes7.dex */
public class b extends Fragment implements i, GestureDetector.OnDoubleTapListener, zp0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PhotoView f54871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f54872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProgressBar f54873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f54874d;

    @Override // zp0.b
    public final void H1() {
        this.f54873c.setVisibility(8);
    }

    @Override // zp0.b
    public final void n4() {
        PhotoView photoView = this.f54871a;
        if (photoView != null) {
            photoView.post(new h0(this, 24));
        }
        this.f54873c.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_image_enlarged, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        PhotoView photoView = this.f54871a;
        if (photoView != null) {
            photoView.setOnViewTapListener(null);
            this.f54872b = null;
            this.f54871a = null;
        }
        super.onDestroyView();
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        j jVar = this.f54872b;
        if (jVar == null || this.f54871a == null) {
            return false;
        }
        float fD = jVar.d();
        j jVar2 = this.f54872b;
        if (fD > 1.0f) {
            jVar2.e(1.0f, motionEvent.getX(), motionEvent.getY(), true);
        } else {
            jVar2.e(jVar2.f67548d, motionEvent.getX(), motionEvent.getY(), true);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f54872b == null || this.f54871a == null) {
            return false;
        }
        motionEvent.getX();
        motionEvent.getY();
        u6();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        String string = getArguments().getString("imageUrl");
        this.f54871a = (PhotoView) view2.findViewById(R.id.enlarged_image);
        ProgressBar progressBar = (ProgressBar) view2.findViewById(R.id.photo_progress_bar);
        this.f54873c = progressBar;
        progressBar.setVisibility(0);
        this.f54874d = string;
        if (this.f54871a != null) {
            a.a(requireActivity(), this.f54874d, this.f54871a, this);
        }
        PhotoView photoView = this.f54871a;
        if (photoView != null) {
            j jVar = new j(photoView);
            this.f54872b = jVar;
            jVar.f67560p = this;
            jVar.f67553i.setOnDoubleTapListener(this);
        }
    }

    public final void u6() {
        if (requireActivity() instanceof bp.a) {
            bp.a aVar = (bp.a) requireActivity();
            boolean z14 = false;
            if (aVar.f19358a) {
                aVar.setToolbarVisibility(4);
            } else {
                aVar.setToolbarVisibility(0);
                z14 = true;
            }
            aVar.f19358a = z14;
        }
    }
}
