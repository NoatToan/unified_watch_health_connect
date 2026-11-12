package xe2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxe2/k0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class k0 extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f190509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f190510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.library.mobileauth.ui.b f190511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Logger f190512d;

    public k0() {
        re2.l0.f152316a.getClass();
        this.f190512d = re2.l0.c("CyclicBgCapableFrag");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f190511c = (com.garmin.android.library.mobileauth.ui.b) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(am.j.m("Activity [", requireActivity().getLocalClassName(), "] must implement MobileAuthFragmentListener."));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f190512d.debug("onDestroyView");
        ImageView imageView = this.f190510b;
        if (imageView == null) {
            p005kotlin.jvm.internal.s.m("backgroundImage");
            throw null;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setCallback(null);
        }
        imageView.setImageDrawable(null);
        imageView.setBackground(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f190509a) {
            ImageView imageView = this.f190510b;
            if (imageView == null) {
                p005kotlin.jvm.internal.s.m("backgroundImage");
                throw null;
            }
            Drawable drawable = imageView.getDrawable();
            drawable.getClass();
            ((jt2.a) drawable).a(1000);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.long_clickable_container);
        if (viewFindViewById != null) {
            viewFindViewById.setOnLongClickListener(new gc0.a(this, 5));
        }
        View viewFindViewById2 = view2.findViewById(R.id.background_image);
        viewFindViewById2.getClass();
        this.f190510b = (ImageView) viewFindViewById2;
        re2.b.f152215a.getClass();
        TypedArray typedArray = re2.b.m().f177768i;
        if (typedArray == null) {
            p005kotlin.jvm.internal.s.m("backgroundImageResIds");
            throw null;
        }
        if (typedArray.length() == 0) {
            ImageView imageView = this.f190510b;
            if (imageView != null) {
                imageView.setImageDrawable(null);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("backgroundImage");
                throw null;
            }
        }
        if (typedArray.length() <= 1) {
            this.f190509a = false;
            u6().n6(0);
            ImageView imageView2 = this.f190510b;
            if (imageView2 != null) {
                imageView2.setImageDrawable(a7.b.getDrawable(requireActivity().getApplicationContext(), typedArray.getResourceId(0, -1)));
                return;
            } else {
                p005kotlin.jvm.internal.s.m("backgroundImage");
                throw null;
            }
        }
        Drawable[] drawableArr = new Drawable[typedArray.length()];
        int length = typedArray.length();
        for (int i14 = 0; i14 < length; i14++) {
            drawableArr[i14] = a7.b.getDrawable(requireActivity().getApplicationContext(), typedArray.getResourceId(i14, -1));
        }
        this.f190509a = true;
        jt2.a aVar = new jt2.a(drawableArr, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        aVar.f100855a = new vn2.t0(this, 28);
        ImageView imageView3 = this.f190510b;
        if (imageView3 == null) {
            p005kotlin.jvm.internal.s.m("backgroundImage");
            throw null;
        }
        imageView3.setImageDrawable(aVar);
    }

    public final com.garmin.android.library.mobileauth.ui.b u6() {
        com.garmin.android.library.mobileauth.ui.b bVar = this.f190511c;
        if (bVar != null) {
            return bVar;
        }
        p005kotlin.jvm.internal.s.m("fragListener");
        throw null;
    }
}
