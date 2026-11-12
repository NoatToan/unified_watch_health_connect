package pb1;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import db1.m;
import java.util.ArrayList;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpb1/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f136832c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f136833d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexOneLineButton f136834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<m> f136835b = new ArrayList<>();

    static {
        int i14 = gt2.c.f79010a;
        f136833d = gt2.b.f79005a.h("PregnancySettingsBottomFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f136835b = Build.VERSION.SDK_INT >= 33 ? arguments.getParcelableArrayList("extra_pregnancy_history_list", m.class) : arguments.getParcelableArrayList("extra_pregnancy_history_list");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_pregnancy_bottom_settings, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ArrayList<m> arrayList = this.f136835b;
        if (arrayList != null) {
            View viewFindViewById = view2.findViewById(R.id.previous_pregnancy);
            viewFindViewById.getClass();
            GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) viewFindViewById;
            this.f136834a = gCMComplexOneLineButton;
            gCMComplexOneLineButton.setButtonLeftLabel(getString(R.string.pregnancy_previous_pregnancy));
            GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f136834a;
            if (gCMComplexOneLineButton2 != null) {
                gCMComplexOneLineButton2.setOnClickListener(new lq.g(26, this, arrayList));
            } else {
                s.m("mPreviousPregnancyButton");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpb1/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "", "PREVIOUS_PREGNANCY_CARD_REQUEST_CODE", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
