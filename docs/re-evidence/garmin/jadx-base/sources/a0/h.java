package a0;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.camera.core.impl.o1;
import androidx.fragment.app.v;
import androidx.preference.Preference;
import bi1.k;
import c22.l3;
import ch1.d0;
import ch1.d4;
import ch1.e6;
import ch1.f3;
import ch1.g2;
import ch1.g6;
import ch1.h2;
import ch1.j2;
import ch1.n4;
import ch1.r3;
import ch1.x3;
import ch1.y2;
import ch1.z3;
import ch1.z4;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusSoundsAndAlertsSettingActivity;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.h0;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.ListenerSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import jw.y;
import l52.u;
import org.apache.commons.lang3.function.FailableBooleanSupplier;
import org.apache.commons.lang3.function.FailableConsumer;
import org.apache.commons.lang3.function.FailableFunction;
import org.apache.commons.lang3.function.FailablePredicate;
import org.apache.commons.lang3.function.FailableRunnable;
import org.apache.commons.lang3.function.FailableSupplier;
import org.apache.commons.lang3.function.TriFunction;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.p0;
import wi1.j;
import xg1.p;
import xg1.q;
import xg1.s;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements FailableBooleanSupplier, FailableRunnable, FailableSupplier, TriFunction, e22.c, o1.a, Preference.d, u, y, xg1.c, SynchronizationGuard.CriticalSection, ListenerSet.Event, ListenerSet.IterationFinishedEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35c;

    public /* synthetic */ h(int i14, Object obj, Object obj2) {
        this.f33a = i14;
        this.f34b = obj;
        this.f35c = obj2;
    }

    @Override // androidx.preference.Preference.d
    public boolean X3(Preference preference) {
        bi1.d dVar = (bi1.d) this.f34b;
        bi1.u uVar = (bi1.u) this.f35c;
        bi1.d.a aVar = bi1.d.f18024j;
        v fragmentManager = dVar.getFragmentManager();
        if (fragmentManager == null) {
            return true;
        }
        k.f18044d.getClass();
        uVar.getClass();
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putSerializable("WATCH_FACE_POSITION_KEY", uVar);
        kVar.setArguments(bundle);
        kVar.show(fragmentManager, "ComplicationPickerDialog");
        return true;
    }

    @Override // androidx.camera.core.impl.o1.a
    public void a(o1 o1Var) {
        ((o1.a) this.f35c).a((androidx.camera.core.g) this.f34b);
    }

    @Override // org.apache.commons.lang3.function.TriFunction
    public Object apply(Object obj, Object obj2, Object obj3) {
        return ((TriFunction) this.f34b).lambda$andThen$0((Function) this.f35c, obj, obj2, obj3);
    }

    @Override // jw.y
    public void c() {
        cc0.g gVar = (cc0.g) this.f34b;
        String str = (String) this.f35c;
        if (str != null) {
            gVar.b(new jw.d(gVar, str));
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        switch (this.f33a) {
            case 23:
                return ((Uploader) this.f34b).lambda$logAndUpdateState$5((Iterable) this.f35c);
            default:
                return ((Uploader) this.f34b).lambda$logAndUpdateState$7((HashMap) this.f35c);
        }
    }

    @Override // org.apache.commons.lang3.function.FailableSupplier
    public Object get() {
        return ((FailableFunction) this.f34b).apply(this.f35c);
    }

    @Override // org.apache.commons.lang3.function.FailableBooleanSupplier
    public boolean getAsBoolean() {
        return ((FailablePredicate) this.f34b).test(this.f35c);
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f33a) {
            case 25:
                ((AnalyticsListener) obj).onAudioAttributesChanged((AnalyticsListener.EventTime) this.f34b, (AudioAttributes) this.f35c);
                break;
            case 26:
                ((AnalyticsListener) obj).onPlaybackParametersChanged((AnalyticsListener.EventTime) this.f34b, (PlaybackParameters) this.f35c);
                break;
            case 27:
            default:
                ((AnalyticsListener) obj).onAvailableCommandsChanged((AnalyticsListener.EventTime) this.f34b, (Player.Commands) this.f35c);
                break;
            case 28:
                ((AnalyticsListener) obj).onTracksInfoChanged((AnalyticsListener.EventTime) this.f34b, (TracksInfo) this.f35c);
                break;
        }
    }

    @Override // e22.c
    public void k(Object obj) {
        Fenix5PlusSoundsAndAlertsSettingActivity fenix5PlusSoundsAndAlertsSettingActivity = (Fenix5PlusSoundsAndAlertsSettingActivity) this.f34b;
        LinearLayout linearLayout = (LinearLayout) this.f35c;
        fb2.e eVar = (fb2.e) obj;
        int i14 = Fenix5PlusSoundsAndAlertsSettingActivity.f42964o;
        if (eVar.h(fenix5PlusSoundsAndAlertsSettingActivity.f125985k)) {
            boolean z14 = eVar instanceof f3;
            if (z14 || (eVar instanceof d4) || (eVar instanceof g2) || (eVar instanceof y2)) {
                linearLayout.addView(fb2.g.a(fenix5PlusSoundsAndAlertsSettingActivity));
            }
            linearLayout.addView(eVar.a());
            if (eVar instanceof g2) {
                linearLayout.addView(fb2.g.c(fenix5PlusSoundsAndAlertsSettingActivity, fenix5PlusSoundsAndAlertsSettingActivity.getString(R.string.device_settings_key_tones_help)));
            }
            if (eVar instanceof h2) {
                linearLayout.addView(fb2.g.c(fenix5PlusSoundsAndAlertsSettingActivity, fenix5PlusSoundsAndAlertsSettingActivity.getString(R.string.device_settings_key_vibration_help)));
            }
            if (z14 || (eVar instanceof d4) || (eVar instanceof d0)) {
                linearLayout.addView(fb2.g.a(fenix5PlusSoundsAndAlertsSettingActivity));
            }
        }
    }

    @Override // xg1.c
    public s l() {
        int i14 = this.f33a;
        Object obj = this.f35c;
        Object obj2 = this.f34b;
        switch (i14) {
            case 11:
                ch1.h hVar = (ch1.h) obj2;
                int i15 = ch1.h.f27357f;
                Integer numY = hVar.y((DeviceSettingsDTO) obj);
                xg1.e.a aVar = xg1.e.f190893b;
                String strU = hVar.u();
                ArrayList<String> arrayList = hVar.f27358e;
                aVar.getClass();
                return xg1.e.a.b(strU, numY, arrayList);
            case 12:
                ch1.e eVar = (ch1.e) obj2;
                int i16 = ch1.e.f27324h;
                Integer numY2 = eVar.y((DeviceSettingsDTO) obj);
                xg1.e.a aVar2 = xg1.e.f190893b;
                String strU2 = eVar.u();
                ArrayList<String> arrayList2 = eVar.f27327g;
                aVar2.getClass();
                return xg1.e.a.b(strU2, numY2, arrayList2);
            case 13:
                int i17 = ch1.o1.f27424e;
                Double dValueOf = Double.valueOf(((UserSettingsDTO) obj).I());
                String strB = ((ch1.o1) obj2).b(R.string.lbl_height);
                float fFloatValue = dValueOf.floatValue();
                Bundle bundle = new Bundle();
                bundle.putString("DIALOG_TITLE", strB);
                bundle.putFloat("CENTIMETERS", fFloatValue);
                xg1.f fVar = new xg1.f();
                fVar.setArguments(bundle);
                return fVar;
            case 14:
                j2 j2Var = (j2) obj2;
                vk1.f fVar2 = (vk1.f) obj;
                int i18 = j2.f27387h;
                fVar2.getClass();
                Integer numValueOf = Integer.valueOf(fVar2.f178614d);
                xg1.e.a aVar3 = xg1.e.f190893b;
                String strU3 = j2Var.u();
                int i19 = j2Var.f27388e;
                int i24 = j2Var.f27389f;
                aVar3.getClass();
                return xg1.e.a.a(strU3, i19, i24, numValueOf);
            case 15:
                r3 r3Var = (r3) obj2;
                vk1.f fVar3 = (vk1.f) obj;
                int i25 = r3.f27445g;
                xg1.e.a aVar4 = xg1.e.f190893b;
                String strU4 = r3Var.u();
                fVar3.getClass();
                Integer numValueOf2 = Integer.valueOf(fVar3.f178613c);
                int i26 = r3Var.f27447f;
                aVar4.getClass();
                return xg1.e.a.a(strU4, 30, i26, numValueOf2);
            case 16:
                x3 x3Var = (x3) obj2;
                int i27 = x3.f27496e;
                double dZ = ((UserSettingsDTO) obj).Z();
                if (dZ < 0.0d) {
                    dZ = 21600.0d;
                }
                Double dValueOf2 = Double.valueOf(dZ);
                String strB2 = x3Var.b(R.string.settings_users_sleep_wake_time);
                long jLongValue = dValueOf2.longValue();
                Bundle bundle2 = new Bundle();
                bundle2.putString("DIALOG_TITLE", strB2);
                bundle2.putLong("SECOND_SINCE_MIDNIGHT", jLongValue);
                p pVar = new p();
                pVar.setArguments(bundle2);
                return pVar;
            case 17:
                z3 z3Var = (z3) obj2;
                int i28 = z3.f27513e;
                double dM = ((UserSettingsDTO) obj).M();
                if (dM < 0.0d) {
                    dM = 79200.0d;
                }
                Double dValueOf3 = Double.valueOf(dM);
                String strB3 = z3Var.b(R.string.settings_users_sleep_start_time);
                long jLongValue2 = dValueOf3.longValue();
                Bundle bundle3 = new Bundle();
                bundle3.putString("DIALOG_TITLE", strB3);
                bundle3.putLong("SECOND_SINCE_MIDNIGHT", jLongValue2);
                p pVar2 = new p();
                pVar2.setArguments(bundle3);
                return pVar2;
            case 18:
                n4 n4Var = (n4) obj2;
                DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
                int i29 = n4.f27422e;
                deviceSettingsDTO.getClass();
                com.garmin.android.apps.connectmobile.devices.model.h hVar2 = deviceSettingsDTO.f33885m;
                int iO = hVar2 != null ? hVar2.getSpo2Threshold() : 0;
                xg1.k.a aVar5 = xg1.k.f190898b;
                String strU5 = n4Var.u();
                aVar5.getClass();
                Bundle bundle4 = new Bundle();
                bundle4.putString("Dialog Title", strU5);
                bundle4.putInt("percentage value", iO);
                xg1.k kVar = new xg1.k();
                kVar.setArguments(bundle4);
                return kVar;
            case 19:
                z4 z4Var = (z4) obj2;
                UserSettingsDTO userSettingsDTO = (UserSettingsDTO) obj;
                int i30 = z4.f27514f;
                int i34 = -1;
                if (z4Var.f27515e) {
                    j jVar = userSettingsDTO.f43524b;
                    if (jVar != null) {
                        i34 = jVar.f185550m;
                    }
                } else {
                    j jVar2 = userSettingsDTO.f43524b;
                    if (jVar2 != null) {
                        i34 = jVar2.f185549l;
                    }
                }
                String strU6 = z4Var.u();
                Bundle bundle5 = new Bundle();
                q qVar = new q();
                bundle5.putString("DIALOG_TITLE", strU6);
                bundle5.putInt("DIALOG_VALUE", i34);
                qVar.setArguments(bundle5);
                return qVar;
            case 20:
                int i35 = e6.f27337e;
                return ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).q(false, ((e6) obj2).b(R.string.card_weight_title), ((UserSettingsDTO) obj).E2() / 1000.0d);
            default:
                zk0.e eVar2 = (zk0.e) obj;
                int i36 = g6.f27356e;
                eVar2.getClass();
                l3.a aVar6 = l3.f23124b;
                double d14 = eVar2.getGoalValue();
                aVar6.getClass();
                return ((zb0.d0) KoinJavaComponent.get$default(zb0.d0.class, null, null, 6, null)).q(true, ((g6) obj2).u(), l3.a.P1(d14));
        }
    }

    @Override // l52.u
    public void o(l52.i.a aVar) {
        int i14 = this.f33a;
        Object obj = this.f35c;
        Object obj2 = this.f34b;
        switch (i14) {
            case 8:
                com.garmin.android.apps.connectmobile.repcounting.model.c cVar = (com.garmin.android.apps.connectmobile.repcounting.model.c) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (aVar.k()) {
                    String str = ((j0) aVar.getData()).H0;
                    String strG = ((j0) aVar.getData()).g();
                    if (str != null && strG != null) {
                        if ((cVar != null ? cVar.D(str, strG) : null) == null) {
                            arrayList.add(new com.garmin.android.apps.connectmobile.repcounting.model.d(str, null, null, false, strG, null));
                        }
                        break;
                    }
                }
                break;
            default:
                p0 p0Var = (p0) obj2;
                p0 p0Var2 = (p0) obj;
                h0.a aVar2 = h0.f48185j;
                int iMax = 1;
                if (((j0) aVar.getData()).f48217c != m52.d.REST && ((j0) aVar.getData()).f48217c != m52.d.REPEAT) {
                    p0Var.f105807a++;
                }
                m52.d dVar = ((j0) aVar.getData()).f48217c;
                m52.d dVar2 = m52.d.REPEAT;
                if (dVar == dVar2) {
                    l52.f.a parent = aVar.getParent();
                    int iMax2 = Math.max(((j0) aVar.getData()).f48219e, 1);
                    if (parent != null) {
                        T t7 = parent.f110251e;
                        if (((j0) t7).f48217c == dVar2) {
                            iMax = Math.max(((j0) t7).f48219e, 1);
                        }
                    }
                    p0Var2.f105807a = (iMax2 * p0Var.f105807a * iMax) + p0Var2.f105807a;
                    p0Var.f105807a = 0;
                }
                break;
        }
    }

    @Override // org.apache.commons.lang3.function.FailableRunnable
    public void run() {
        ((FailableConsumer) this.f34b).accept(this.f35c);
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        ((DefaultAnalyticsCollector) this.f34b).lambda$setPlayer$1((Player) this.f35c, (AnalyticsListener) obj, flagSet);
    }
}
