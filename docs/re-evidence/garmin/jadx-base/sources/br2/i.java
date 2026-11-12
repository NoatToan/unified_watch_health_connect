package br2;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import java.io.Serializable;
import o72.t;
import org.joda.time.Duration;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lbr2/i;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends Fragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f19623g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f19624h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f19625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f19626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f19627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressBar f19628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f19629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f19630f;

    public interface b {
        void a();
    }

    static {
        int i14 = gt2.c.f79010a;
        f19624h = gt2.b.f79005a.h("PAY#DownloadCardFrag");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_garminpay_download_card, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f19625a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        hn2.c cVarF = t.F(this);
        if (cVarF == null) {
            f19624h.error("Failed to cast activity to GarminPayBaseActivity");
            return;
        }
        cVarF.X9(false);
        String string = cVarF.getString(requireArguments().getInt("extra_action_bar_title", 0));
        string.getClass();
        Bundle bundleRequireArguments = requireArguments();
        Serializable serializable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Serializable serializable2 = bundleRequireArguments != null ? bundleRequireArguments.getSerializable("extra.action_bar_home_type") : null;
            serializable = (hn2.c.a) (serializable2 instanceof hn2.c.a ? serializable2 : null);
        } else if (bundleRequireArguments != null) {
            serializable = bundleRequireArguments.getSerializable("extra.action_bar_home_type", hn2.c.a.class);
        }
        serializable.getClass();
        cVarF.W9(string, (hn2.c.a) serializable);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.sync_symbol);
        viewFindViewById.getClass();
        this.f19626b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.progress_percent);
        viewFindViewById2.getClass();
        this.f19627c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.download_card_progress);
        viewFindViewById3.getClass();
        this.f19628d = (ProgressBar) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.download_primary_message);
        viewFindViewById4.getClass();
        this.f19629e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.download_secondary_message);
        viewFindViewById5.getClass();
        this.f19630f = (TextView) viewFindViewById5;
        int i14 = requireArguments().getInt("extra.primary_message");
        int i15 = requireArguments().getInt("extra.secondary_message");
        TextView textView = this.f19629e;
        if (textView == null) {
            s.m("downloadPrimaryMessageView");
            throw null;
        }
        textView.setText(i14);
        TextView textView2 = this.f19630f;
        if (textView2 == null) {
            s.m("downloadSecondaryMessageView");
            throw null;
        }
        textView2.setText(i15);
        ImageView imageView = this.f19626b;
        if (imageView == null) {
            s.m("syncSymbol");
            throw null;
        }
        imageView.setImageTintList(ColorStateList.valueOf(requireContext().getColor(R.color.GPcolorAccent)));
        ImageView imageView2 = this.f19626b;
        if (imageView2 == null) {
            s.m("syncSymbol");
            throw null;
        }
        imageView2.setImageResource(R.drawable.payment_icon_update);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(Duration.standardSeconds(1L).getMillis());
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new q9.b());
        ImageView imageView3 = this.f19626b;
        if (imageView3 == null) {
            s.m("syncSymbol");
            throw null;
        }
        imageView3.startAnimation(rotateAnimation);
        b bVar = this.f19625a;
        if (bVar != null) {
            bVar.a();
        }
    }

    public final void u6() {
        ImageView imageView = this.f19626b;
        if (imageView == null) {
            s.m("syncSymbol");
            throw null;
        }
        imageView.setImageTintList(ColorStateList.valueOf(Color.rgb(40, 180, 78)));
        ImageView imageView2 = this.f19626b;
        if (imageView2 == null) {
            s.m("syncSymbol");
            throw null;
        }
        imageView2.setImageResource(R.drawable.check);
        ImageView imageView3 = this.f19626b;
        if (imageView3 != null) {
            imageView3.clearAnimation();
        } else {
            s.m("syncSymbol");
            throw null;
        }
    }

    public final void v6(int i14) {
        TextView textView = this.f19627c;
        if (textView == null) {
            s.m("progressPercent");
            throw null;
        }
        x0 x0Var = x0.f105818a;
        q6.f.y(new Object[]{Integer.valueOf(i14)}, 1, "%d%%", textView);
        ProgressBar progressBar = this.f19628d;
        if (progressBar != null) {
            progressBar.setProgress(i14);
        } else {
            s.m("downloadCardProgress");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lbr2/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "EXTRA_ACTION_BAR_TITLE", "EXTRA_ACTION_BAR_HOME_TYPE_EXTRA", "EXTRA_PRIMARY_MESSAGE", "EXTRA_SECONDARY_MESSAGE", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static i a(int i14, hn2.c.a aVar, int i15) {
            aVar.getClass();
            i iVar = new i();
            Bundle bundle = new Bundle();
            bundle.putInt("extra_action_bar_title", i14);
            bundle.putSerializable("extra.action_bar_home_type", aVar);
            bundle.putInt("extra.primary_message", i15);
            bundle.putInt("extra.secondary_message", R.string.wallet_dont_disconnect_device);
            iVar.setArguments(bundle);
            return iVar;
        }

        private a() {
        }
    }
}
