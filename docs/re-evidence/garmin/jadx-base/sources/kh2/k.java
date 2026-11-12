package kh2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import ch.qos.logback.classic.Logger;
import ci2.m;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQStorageManagementActivity;
import com.garmin.android.apps.connectmobile.connectiq.l;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import com.garmin.android.apps.connectmobile.onboarding.presentation.DeviceOnboardingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.AlarmsSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.CannedTextResponsesActivity;
import com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceNameActivity;
import com.garmin.android.apps.connectmobile.settings.devices.music.MusicSetupActivity;
import com.garmin.android.apps.connectmobile.settings.devices.quartz.QuartzWatchFaceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.vivomove3.Vivomove3ReorderableWidgetActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivomove3.Vivomove3SportWatchFaceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.GCMWiFiNetworksActivity;
import com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionManagerActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.HRZonesConfigActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.HRZonesConfigVivosportActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.PowerZonesListActivity;
import com.garmin.android.apps.connectmobile.solarintensity.presentation.activity.SolarIntensityActivity;
import com.garmin.androiddynamicsettings.app.presentationlayer.SettingsActivity;
import hk0.p;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.y0;
import yc.l2;
import zb0.n0;
import zb0.t;
import zb0.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkh2/k;", "", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f104801a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hi2.d f104802b = new hi2.d("ViewCoordinatorUtility", null, 2, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkh2/k$a;", "", "<init>", "()V", "Lhi2/d;", "logger", "Lhi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Fragment fragment, ii2.b bVar, Map map, Map map2) {
            String string;
            fragment.getClass();
            bVar.getClass();
            map.getClass();
            if (map2 == null) {
                map2 = bVar.z4(map);
            }
            if (map2 == null) {
                hi2.d dVar = k.f104802b;
                Objects.toString(map.get(mh2.i.TITLE.f118617a));
                dVar.getClass();
                return;
            }
            hi2.d dVar2 = k.f104802b;
            mh2.i iVar = mh2.i.TITLE;
            String str = iVar.f118617a;
            String str2 = iVar.f118617a;
            Objects.toString(map.get(str));
            dVar2.getClass();
            nh2.d dVar3 = new nh2.d();
            Object obj = map2.get(mh2.i.MENU_ITEMS.f118617a);
            if (!y0.g(obj)) {
                obj = null;
            }
            dVar3.f126170j = (List) obj;
            Object obj2 = map2.get(mh2.i.SETTINGS.f118617a);
            if (!y0.g(obj2)) {
                obj2 = null;
            }
            List<Map<String, Object>> list = (List) obj2;
            if (list == null) {
                Objects.toString(map.get(str2));
                Logger logger = hi2.d.f83889c;
                return;
            }
            dVar3.f126167g = list;
            Map<String, Object> map3 = bVar.f93791a.f126168h;
            map3.getClass();
            dVar3.f126168h = map3;
            Object obj3 = map.get(mh2.i.CHILD.f118617a);
            if (!(obj3 instanceof Map)) {
                obj3 = null;
            }
            Map map4 = (Map) obj3;
            if (map4 != null) {
                Boolean bool = (Boolean) map4.get(mh2.i.PERSIST_ON_SELECTION.f118617a);
                dVar3.f126166f = bool != null ? bool.booleanValue() : false;
                string = String.valueOf(map4.get(str2));
            } else {
                string = fragment.getString(R.string.setting_device);
            }
            dVar3.f126164d = string;
            m.f27713k.getClass();
            m mVarA = m.a.a(dVar3);
            v supportFragmentManager = fragment.requireActivity().getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.l(R.id.settings_fragment_container, mVarA, null);
            aVar.d(mVarA.getTag());
            aVar.e();
        }

        /* JADX WARN: Code duplicated, block: B:67:0x02ee  */
        public static void b(String str, Map map, ii2.b bVar, Fragment fragment) {
            Intent intent;
            Intent intentA;
            Intent intent2;
            bVar.getClass();
            k.f104802b.getClass();
            com.garmin.androiddynamicsettings.app.util.a.C1021a c1021a = com.garmin.androiddynamicsettings.app.util.a.f50704a;
            Map<String, Object> map2 = bVar.f93791a.f126168h;
            c1021a.getClass();
            String strD = com.garmin.androiddynamicsettings.app.util.a.C1021a.d(map2);
            zh2.e.f204807a.getClass();
            zh2.a aVarA = zh2.e.a();
            Context contextRequireContext = fragment.requireContext();
            contextRequireContext.getClass();
            uc0.d.f169948i.debug("getExternalSettingsActivity: ExternalSettings: ".concat(str));
            wc0.a.C3412a c3412a = wc0.a.f184266a;
            sd2.f fVar = ((uc0.d) aVarA).f169950b;
            c3412a.getClass();
            fVar.getClass();
            Unit unit = null;
            if (str.equals(wc0.c.ACTIVITY_AND_APPLICATIONS.f184293a)) {
                intentA = wc0.a.C3412a.b(contextRequireContext, fVar, l.APPS);
            } else if (str.equals(wc0.c.ALARMS.f184293a)) {
                DeviceSettingsDTO deviceSettingsDTO = new DeviceSettingsDTO(new JSONObject(strD));
                AlarmsSettingsActivity.a aVar = AlarmsSettingsActivity.f41854n;
                long unitID = fVar.getUnitID();
                u0 u0Var = (u0) u0.f203782n6.get(fVar.getProductNumber());
                aVar.getClass();
                intentA = AlarmsSettingsActivity.a.a(contextRequireContext, unitID, u0Var, deviceSettingsDTO);
                intentA.putExtra("dynamicSettingsRequestCodeKey", 9630);
            } else if (str.equals(wc0.c.DATA_FIELD.f184293a)) {
                intentA = wc0.a.C3412a.b(contextRequireContext, fVar, l.DATA_FIELDS);
            } else if (str.equals(wc0.c.GARMIN_PAY.f184293a)) {
                GarminPayLaunchScreenActivity.a aVar2 = GarminPayLaunchScreenActivity.f35305d;
                kj0.a.c cVar = new kj0.a.c(Long.valueOf(fVar.getUnitID()), fVar.getImageURL(), fVar.getProductDisplayName());
                aVar2.getClass();
                intentA = GarminPayLaunchScreenActivity.a.a(contextRequireContext, cVar);
            } else if (str.equals(wc0.c.HEART_RATE_ZONES.f184293a)) {
                intentA = new Intent(contextRequireContext, (Class<?>) HRZonesConfigActivity.class);
                intentA.putExtra("GCM_deviceUnitID", fVar.getUnitID());
                intentA.putExtra("GCM_deviceProductNbr", fVar.getProductNumber());
            } else if (str.equals(wc0.c.HEART_RATE_ZONES_MAX_ONLY.f184293a)) {
                intentA = new Intent(contextRequireContext, (Class<?>) HRZonesConfigVivosportActivity.class);
                intentA.putExtra("GCM_deviceUnitID", fVar.getUnitID());
                intentA.putExtra("GCM_deviceProductNbr", fVar.getProductNumber());
            } else if (str.equals(wc0.c.HELP_AND_INFO.f184293a)) {
                intent = new Intent("android.intent.action.VIEW", n0.e(fVar.getUnitID()));
                if (intent.resolveActivity(contextRequireContext.getPackageManager()) != null) {
                    intentA = intent;
                } else {
                    intentA = null;
                }
            } else if (str.equals(wc0.c.FEATURE_SETUP.f184293a)) {
                intentA = new Intent(contextRequireContext, (Class<?>) DeviceOnboardingActivity.class);
                intentA.putExtra("GCM_deviceUnitID", fVar.getUnitID());
            } else if (str.equals(wc0.c.LTE.f184293a)) {
                intentA = LTESubscriptionManagerActivity.a.a(LTESubscriptionManagerActivity.f43457e, contextRequireContext, fVar.getUnitID(), false, 12);
            } else if (str.equals(wc0.c.MUSIC.f184293a)) {
                MusicSetupActivity.a aVar3 = MusicSetupActivity.f43129f;
                long unitID2 = fVar.getUnitID();
                String displayName = fVar.getDisplayName();
                aVar3.getClass();
                intentA = MusicSetupActivity.a.a(contextRequireContext, unitID2, displayName);
            } else {
                if (str.equals(wc0.c.POWER_ZONES.f184293a)) {
                    PowerZonesListActivity.a aVar4 = PowerZonesListActivity.f44065e;
                    long unitID3 = fVar.getUnitID();
                    aVar4.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putLong("EXTRA_DEVICE_UNIT_ID", unitID3);
                    intent = new Intent(contextRequireContext, (Class<?>) PowerZonesListActivity.class);
                    intent.putExtras(bundle);
                } else if (str.equals(wc0.c.TEXT_RESPONSE.f184293a)) {
                    CannedTextResponsesActivity.a aVar5 = CannedTextResponsesActivity.f41931o;
                    long unitID4 = fVar.getUnitID();
                    String productNumber = fVar.getProductNumber();
                    productNumber.getClass();
                    String productDisplayName = fVar.getProductDisplayName();
                    productDisplayName.getClass();
                    String strD0 = fVar.d0();
                    String strD2 = t.d(fVar);
                    aVar5.getClass();
                    intentA = CannedTextResponsesActivity.a.a(contextRequireContext, unitID4, productNumber, productDisplayName, strD0, strD2);
                } else if (str.equals(wc0.c.WATCH_FACES.f184293a)) {
                    intentA = wc0.a.C3412a.b(contextRequireContext, fVar, l.WATCH_FACES);
                } else if (str.equals(wc0.c.LEGACY_WATCH_FACES.f184293a)) {
                    if (strD != null) {
                        DeviceSettingsDTO deviceSettingsDTO2 = new DeviceSettingsDTO(new JSONObject(strD));
                        String string = contextRequireContext.getString(R.string.device_setting_watch_face);
                        string.getClass();
                        u0 u0Var2 = (u0) u0.f203782n6.get(fVar.getProductNumber());
                        if (u0Var2 == null) {
                            intentA = null;
                        } else {
                            if (wc0.a.C3412a.C3413a.f184268a[u0Var2.ordinal()] == 1) {
                                QuartzWatchFaceSettings.f43140j.getClass();
                                intent2 = new Intent(contextRequireContext, (Class<?>) QuartzWatchFaceSettings.class);
                                intent2.putExtra("GCM_deviceSettings", deviceSettingsDTO2);
                                intent2.putExtra("GCM_deviceSettingsTitle", string);
                            } else {
                                Vivomove3SportWatchFaceSettings.f43206g.getClass();
                                intent2 = new Intent(contextRequireContext, (Class<?>) Vivomove3SportWatchFaceSettings.class);
                                intent2.putExtra("GCM_deviceSettings", deviceSettingsDTO2);
                                intent2.putExtra("GCM_deviceSettingsTitle", string);
                            }
                            intentA = intent2;
                        }
                    } else {
                        intentA = null;
                    }
                } else if (str.equals(wc0.c.WIDGETS.f184293a)) {
                    intentA = wc0.a.C3412a.b(contextRequireContext, fVar, l.WIDGETS);
                } else if (str.equals(wc0.c.REORDERABLE_WIDGETS.f184293a)) {
                    if (strD != null) {
                        DeviceSettingsDTO deviceSettingsDTO3 = new DeviceSettingsDTO(new JSONObject(strD));
                        Vivomove3ReorderableWidgetActivity.f43205j.getClass();
                        intent = new Intent(contextRequireContext, (Class<?>) Vivomove3ReorderableWidgetActivity.class);
                        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO3);
                    } else {
                        intentA = null;
                    }
                } else if (str.equals(wc0.c.WIFI.f184293a)) {
                    if (p.k(fVar.getUnitID())) {
                        GCMWiFiNetworksActivity.a aVar6 = GCMWiFiNetworksActivity.f43245f;
                        long unitID5 = fVar.getUnitID();
                        String productNumber2 = fVar.getProductNumber();
                        String productDisplayName2 = fVar.getProductDisplayName();
                        String strD3 = t.d(fVar);
                        aVar6.getClass();
                        intentA = GCMWiFiNetworksActivity.a.b(contextRequireContext, unitID5, productNumber2, productDisplayName2, strD3, false);
                    } else {
                        new androidx.appcompat.app.e.a(contextRequireContext).setMessage(contextRequireContext.getString(R.string.wifi_no_connection_error_msg)).setCancelable(false).setPositiveButton(contextRequireContext.getString(R.string.lbl_dismiss), new vu1.k(4)).create().show();
                        intentA = null;
                    }
                } else if (str.equals(wc0.c.BIRTHDAY.f184293a)) {
                    intentA = new Intent(contextRequireContext, (Class<?>) UpdateBirthdateActivity.class);
                } else {
                    wc0.c cVar2 = wc0.c.MANAGE_CONNECT_IQ_STORAGE;
                    if (str.equals(cVar2.f184293a)) {
                        if (wc0.a.C3412a.a(contextRequireContext, fVar.getUnitID())) {
                            intentA = new Intent(contextRequireContext, (Class<?>) ConnectIQStorageManagementActivity.class);
                            intentA.putExtra("CONNECT_IQ_DEVICE_UNIT_ID", fVar.getUnitID());
                        } else {
                            intentA = null;
                        }
                    } else if (str.equals(cVar2.f184293a)) {
                        intentA = new Intent(contextRequireContext, (Class<?>) ConnectIQStorageManagementActivity.class);
                        intentA.putExtra("GCM_deviceUnitID", fVar.getUnitID());
                    } else if (str.equals(wc0.c.SOLAR_INTENSITY.f184293a)) {
                        SolarIntensityActivity.a aVar7 = SolarIntensityActivity.f44787a;
                        long unitID6 = fVar.getUnitID();
                        aVar7.getClass();
                        intentA = SolarIntensityActivity.a.a(contextRequireContext, unitID6);
                    } else if (str.equals(wc0.c.DISPLAYED_ACTIVITIES.f184293a)) {
                        int iIntValue = n0.f(fVar).intValue();
                        ActivityOptionsActivity.b bVar2 = ActivityOptionsActivity.f42526m;
                        long unitID7 = fVar.getUnitID();
                        String productNumber3 = fVar.getProductNumber();
                        productNumber3.getClass();
                        bVar2.getClass();
                        intent = l2.d(contextRequireContext, ActivityOptionsActivity.class, "GCM_deviceUnitID", unitID7);
                        intent.putExtra("GCM_deviceEnumValue", (u0) u0.f203782n6.get(productNumber3));
                        intent.putExtra("GCM_displayActivitiesMaxLimit", iIntValue);
                    } else {
                        if (!str.equals(wc0.c.DEVICE_NAME.f184293a)) {
                            wc0.a.f184267b.error("Did not find an intent for external ".concat(str));
                        } else if (strD != null) {
                            DeviceSettingsDTO deviceSettingsDTO4 = new DeviceSettingsDTO(new JSONObject(strD));
                            DeviceNameActivity.f42630c.getClass();
                            intent = new Intent(contextRequireContext, (Class<?>) DeviceNameActivity.class);
                            intent.putExtra("GCM_deviceSettings", deviceSettingsDTO4);
                        }
                        intentA = null;
                    }
                }
                intentA = intent;
            }
            if (intentA != null) {
                int intExtra = intentA.hasExtra("dynamicSettingsRequestCodeKey") ? intentA.getIntExtra("dynamicSettingsRequestCodeKey", 963) : 963;
                androidx.fragment.app.m activity = fragment.getActivity();
                if (activity != null) {
                    activity.startActivityForResult(intentA, intExtra);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    Toast.makeText(fragment.requireContext(), fragment.getString(R.string.txt_something_went_wrong_try_again), 0).show();
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }

        public static void c(Fragment fragment, String str) {
            Unit unit;
            k.f104802b.getClass();
            androidx.fragment.app.m activity = fragment.getActivity();
            if (activity != null) {
                Intent intent = new Intent(activity, (Class<?>) SettingsActivity.class);
                intent.putExtra("DynamicSettingInitializer_Section", str);
                activity.startActivity(intent);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                Toast.makeText(fragment.requireContext(), fragment.getString(R.string.txt_something_went_wrong_try_again), 0).show();
            }
        }

        public static void d(ii2.b bVar, Map map) {
            bVar.getClass();
            bVar.L4(null, String.valueOf(map.get(mh2.i.VALUE_ID.f118617a)));
        }

        private a() {
        }
    }
}
