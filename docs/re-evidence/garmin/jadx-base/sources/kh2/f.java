package kh2;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import fi2.x;
import fi2.y;
import fi2.z;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkh2/f;", "", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f104790a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hi2.d f104791b = new hi2.d("SwitchClick", null, 2, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkh2/f$a;", "", "<init>", "()V", "Lhi2/d;", "logger", "Lhi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Fragment fragment, final SwitchCompat switchCompat, final ii2.b bVar, final ei2.h hVar, final Map map) {
            switchCompat.getClass();
            bVar.getClass();
            m activity = fragment.getActivity();
            if (!(activity instanceof com.garmin.androiddynamicsettings.app.presentationlayer.b)) {
                activity = null;
            }
            com.garmin.androiddynamicsettings.app.presentationlayer.b bVar2 = (com.garmin.androiddynamicsettings.app.presentationlayer.b) activity;
            if (bVar2 == null || !bVar2.S9()) {
                if (bVar2 != null) {
                    return;
                }
                zh2.e.f204807a.getClass();
                if (!((uc0.d) zh2.e.a()).i()) {
                    return;
                }
            }
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kh2.e
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                    SwitchCompat switchCompat2 = switchCompat;
                    switchCompat2.getClass();
                    ii2.b bVar3 = bVar;
                    bVar3.getClass();
                    int id3 = switchCompat2.getId();
                    ei2.h hVar2 = hVar;
                    Map<String, ? extends Object> map2 = map;
                    if (id3 == R.id.acclimation_switch_view) {
                        if (!(hVar2 instanceof z)) {
                            hVar2 = null;
                        }
                        z zVar = (z) hVar2;
                        if (zVar == null || !compoundButton.isPressed()) {
                            return;
                        }
                        f.f104791b.getClass();
                        Boolean boolValueOf = Boolean.valueOf(z14);
                        hi2.a.C1658a c1658a = hi2.a.f83879a;
                        String string = boolValueOf.toString();
                        c1658a.getClass();
                        boolean zF = hi2.a.C1658a.f(string);
                        zVar.r(zF, new x(zF, zVar, bVar3, map2));
                        return;
                    }
                    if (id3 != R.id.sleep_tracking_switch_view) {
                        if (compoundButton.isPressed()) {
                            f.f104791b.getClass();
                            hVar2.n(bVar3, map2, Boolean.valueOf(z14));
                            return;
                        } else {
                            f.f104791b.getClass();
                            hVar2.q(switchCompat2, bVar3, map2);
                            return;
                        }
                    }
                    if (!(hVar2 instanceof z)) {
                        hVar2 = null;
                    }
                    z zVar2 = (z) hVar2;
                    if (zVar2 == null || !compoundButton.isPressed()) {
                        return;
                    }
                    f.f104791b.getClass();
                    Boolean boolValueOf2 = Boolean.valueOf(z14);
                    hi2.a.C1658a c1658a2 = hi2.a.f83879a;
                    String string2 = boolValueOf2.toString();
                    c1658a2.getClass();
                    boolean zF2 = hi2.a.C1658a.f(string2);
                    zVar2.s(zF2, new y(zVar2, bVar3, map2, zF2));
                }
            });
        }

        private a() {
        }
    }
}
