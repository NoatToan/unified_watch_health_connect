package ew2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.deeplinking.ConnectIQAppIntroActivity;
import com.garmin.realtimesettings.app.presentationlayer.SettingsDeviceActivity;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import cx2.h;
import gw2.i;
import java.util.Map;
import java.util.Objects;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lew2/g;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f66907a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f66908b = new h("ViewCoordinatorUtility", null, 2, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew2/g$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0049 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:20:0x004b  */
        /* JADX WARN: Code duplicated, block: B:21:0x004e  */
        /* JADX WARN: Code duplicated, block: B:23:0x0051 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:24:0x0053  */
        /* JADX WARN: Code duplicated, block: B:25:0x0056  */
        /* JADX WARN: Code duplicated, block: B:27:0x0059  */
        /* JADX WARN: Code duplicated, block: B:29:0x0071  */
        /* JADX WARN: Code duplicated, block: B:31:0x0079  */
        public static void a(m mVar, dv2.a aVar) {
            String str;
            Uri.Builder builderBuildUpon;
            String str2;
            Object objBuild;
            Uri.Builder builderBuildUpon2;
            String str3;
            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
            long j8 = com.garmin.realtimesettings.app.initialization.b.c().f192453a.f192449a;
            if ((aVar != null ? aVar.f61430b : null) != null) {
                if (aVar != null) {
                    str = aVar.f61433e;
                } else {
                    str = null;
                }
                if (str != null) {
                    g.f66908b.getClass();
                    builderBuildUpon = Uri.parse("connectiq://apps/").buildUpon();
                    builderBuildUpon.appendQueryParameter("deviceId", String.valueOf(j8));
                } else {
                    if (aVar != null) {
                        str2 = aVar.f61430b;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        g.f66908b.getClass();
                        builderBuildUpon = Uri.parse("connectiq://details/").buildUpon();
                        builderBuildUpon.appendQueryParameter("deviceId", String.valueOf(j8));
                        builderBuildUpon.appendQueryParameter(RemoteConfigConstants.RequestFieldKey.APP_ID, aVar != null ? aVar.f61430b : null);
                    } else {
                        g.f66908b.getClass();
                        builderBuildUpon = Uri.parse("connectiq://apps/").buildUpon();
                        builderBuildUpon.appendQueryParameter("deviceId", String.valueOf(j8));
                    }
                }
                objBuild = builderBuildUpon.build();
            } else {
                if ((aVar != null ? aVar.f61433e : null) != null) {
                    g.f66908b.getClass();
                    builderBuildUpon2 = Uri.parse("connectiq://search/").buildUpon();
                    builderBuildUpon2.appendQueryParameter("deviceId", String.valueOf(j8));
                    if (aVar == null || (str3 = aVar.f61433e) == null || builderBuildUpon2.appendQueryParameter("appType", str3) == null) {
                        objBuild = builderBuildUpon2;
                        Logger logger = h.f56678c;
                        Unit unit = Unit.INSTANCE;
                        objBuild = builderBuildUpon2;
                    }
                } else {
                    if (aVar != null) {
                        str = aVar.f61433e;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        g.f66908b.getClass();
                        builderBuildUpon = Uri.parse("connectiq://apps/").buildUpon();
                        builderBuildUpon.appendQueryParameter("deviceId", String.valueOf(j8));
                    } else {
                        if (aVar != null) {
                            str2 = aVar.f61430b;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            g.f66908b.getClass();
                            builderBuildUpon = Uri.parse("connectiq://details/").buildUpon();
                            builderBuildUpon.appendQueryParameter("deviceId", String.valueOf(j8));
                            builderBuildUpon.appendQueryParameter(RemoteConfigConstants.RequestFieldKey.APP_ID, aVar != null ? aVar.f61430b : null);
                        } else {
                            g.f66908b.getClass();
                            builderBuildUpon = Uri.parse("connectiq://apps/").buildUpon();
                            builderBuildUpon.appendQueryParameter("deviceId", String.valueOf(j8));
                        }
                    }
                    objBuild = builderBuildUpon.build();
                }
            }
            objBuild = builderBuildUpon2;
            h hVar = g.f66908b;
            Objects.toString(objBuild);
            hVar.getClass();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.setData(Uri.parse(objBuild.toString()));
            try {
                mVar.startActivity(intent);
            } catch (Exception e4) {
                if (!(e4 instanceof ActivityNotFoundException)) {
                    hVar.getClass();
                    return;
                }
                hVar.getClass();
                ConnectIQAppIntroActivity.f52558r.getClass();
                mVar.startActivity(new Intent(mVar, (Class<?>) ConnectIQAppIntroActivity.class));
            }
        }

        public static void b(int i14, Fragment fragment, boolean z14) {
            fragment.getClass();
            g.f66908b.getClass();
            m activity = fragment.getActivity();
            SettingsDeviceActivity settingsDeviceActivity = activity instanceof SettingsDeviceActivity ? (SettingsDeviceActivity) activity : null;
            if (settingsDeviceActivity != null) {
                SettingsDeviceActivity.a aVar = SettingsDeviceActivity.f52599w;
                int iIntValue = ((Number) settingsDeviceActivity.f52602r.getValue()).intValue();
                aVar.getClass();
                SettingsDeviceActivity.a.a(settingsDeviceActivity, i14, iIntValue, z14);
                return;
            }
            e.a aVar2 = e.f66901a;
            m mVarRequireActivity = fragment.requireActivity();
            mVarRequireActivity.getClass();
            String string = fragment.getString(R.string.txt_something_went_wrong_try_again);
            string.getClass();
            e.a.d(aVar2, mVarRequireActivity, string);
        }

        public static void c(String str, Map map, Fragment fragment) {
            Map map2;
            str.getClass();
            map.getClass();
            fragment.getClass();
            g.f66908b.getClass();
            Object obj = map.get(i.TITLE.f79975a);
            try {
                if (!(obj instanceof Map)) {
                    obj = null;
                }
                map2 = (Map) obj;
            } catch (ClassCastException unused) {
                map2 = null;
            }
            String.valueOf(map2 != null ? map2.get(i.TEXT.f79975a) : null);
            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
            vw2.a aVarA = com.garmin.realtimesettings.app.initialization.b.a();
            Context contextRequireContext = fragment.requireContext();
            contextRequireContext.getClass();
            Intent intentG = aVarA.g(contextRequireContext, str);
            if (intentG == null) {
                g.f66908b.getClass();
                return;
            }
            m activity = fragment.getActivity();
            if (activity != null) {
                activity.startActivity(intentG);
                return;
            }
            a aVar = g.f66907a;
            e.a aVar2 = e.f66901a;
            m mVarRequireActivity = fragment.requireActivity();
            mVarRequireActivity.getClass();
            String string = fragment.getString(R.string.txt_something_went_wrong_try_again);
            string.getClass();
            e.a.d(aVar2, mVarRequireActivity, string);
        }

        private a() {
        }
    }
}
