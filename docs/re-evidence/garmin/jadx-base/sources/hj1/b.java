package hj1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import gj1.e;
import gj1.f;
import gj1.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.y;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhj1/b;", "", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f83993a = new a(null);

    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final gj1.c a(Context context, f fVar, long j8) {
        gj1.a aVarT;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Long deviceId;
        Long deviceId2;
        Long deviceId3;
        Long deviceId4;
        List<gj1.b> listB;
        List<gj1.b> listB2;
        Long deviceId5;
        f83993a.getClass();
        context.getClass();
        fVar.getClass();
        List<gj1.a> listF = fVar.f();
        gj1.a aVar = null;
        Object obj = null;
        Object obj2 = null;
        gj1.b bVar = null;
        Object obj3 = null;
        gj1.a aVarT2 = listF != null ? gl.b.t(Long.valueOf(j8), listF) : null;
        gj1.d primaryTrainingDeviceDTO = fVar.getPrimaryTrainingDeviceDTO();
        if (primaryTrainingDeviceDTO == null || (deviceId5 = primaryTrainingDeviceDTO.getDeviceId()) == null) {
            aVarT = null;
        } else {
            long jLongValue = deviceId5.longValue();
            List<gj1.a> listF2 = fVar.f();
            if (listF2 != null) {
                aVarT = gl.b.t(Long.valueOf(jLongValue), listF2);
            } else {
                aVarT = null;
            }
        }
        boolean zX = ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).x(j8);
        gj1.b bVarU = gl.b.u(fVar);
        List<gj1.a> listF3 = fVar.f();
        gj1.a aVarT3 = listF3 != null ? gl.b.t(bVarU != null ? bVarU.getDeviceId() : null, listF3) : null;
        i wearableDevices = fVar.getWearableDevices();
        if (wearableDevices == null || (listB2 = wearableDevices.b()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj4 : listB2) {
                Long deviceId6 = ((gj1.b) obj4).getDeviceId();
                if (deviceId6 == null || deviceId6.longValue() != j8) {
                    arrayList.add(obj4);
                }
            }
        }
        e primaryTrainingDevices = fVar.getPrimaryTrainingDevices();
        if (primaryTrainingDevices == null || (listB = primaryTrainingDevices.b()) == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList();
            for (Object obj5 : listB) {
                Long deviceId7 = ((gj1.b) obj5).getDeviceId();
                if (deviceId7 == null || deviceId7.longValue() != j8) {
                    arrayList2.add(obj5);
                }
            }
        }
        if (arrayList != null) {
            arrayList3 = new ArrayList(y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((gj1.b) it.next()).getDeviceId());
            }
        } else {
            arrayList3 = null;
        }
        if (arrayList2 != null) {
            arrayList4 = new ArrayList(y.r(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((gj1.b) it3.next()).getDeviceId());
            }
        } else {
            arrayList4 = null;
        }
        String str = "removeDeviceID " + j8 + ", pwDevicesIds " + arrayList3 + ", ptdDevicesIds " + arrayList4 + " deviceHasInReachSubscription? " + zX;
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "PrimaryDeviceUtil", str);
        if (aVarT2 == null) {
            return new gj1.c(ej1.b.NONE, null, 0, false, a.b(context, zX));
        }
        int i14 = 0;
        if (aVarT3 != null && (deviceId3 = aVarT3.getDeviceId()) != null && deviceId3.longValue() == j8 && aVarT != null && (deviceId4 = aVarT.getDeviceId()) != null && deviceId4.longValue() == j8) {
            if (arrayList == null || !(!arrayList.isEmpty())) {
                if (arrayList2 == null || !(!arrayList2.isEmpty())) {
                    return new gj1.c(ej1.b.NONE, null, 0, (arrayList != null && (arrayList.isEmpty() ^ true)) || (arrayList2 != null && (arrayList2.isEmpty() ^ true)), a.b(context, zX));
                }
                ej1.b bVar2 = ej1.b.TRAINING_DEVICE;
                return new gj1.c(bVar2, (gj1.b) h0.b0(arrayList2), arrayList2.size(), true, a.a(context, bVar2, zX));
            }
            gj1.b bVar3 = (gj1.b) h0.b0(arrayList);
            if (s.g(bVar3.getPrimaryTrainingCapable(), Boolean.TRUE)) {
                ej1.b bVar4 = ej1.b.WEARABLE_TRAINING_DEVICE;
                return new gj1.c(bVar4, bVar3, arrayList.size(), true, a.a(context, bVar4, zX));
            }
            ej1.b bVar5 = ej1.b.WEARABLE_DEVICE;
            return new gj1.c(bVar5, bVar3, arrayList.size(), true, a.a(context, bVar5, zX));
        }
        if (aVarT3 != null && (deviceId2 = aVarT3.getDeviceId()) != null && deviceId2.longValue() == j8) {
            if (aVarT != null && gl.b.G(aVarT) && arrayList != null && !arrayList.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    if (s.g(((gj1.b) it4.next()).getDeviceId(), aVarT.getDeviceId())) {
                        for (Object obj6 : arrayList) {
                            if (s.g(((gj1.b) obj6).getDeviceId(), aVarT.getDeviceId())) {
                                obj = obj6;
                                break;
                            }
                        }
                        ej1.b bVar6 = ej1.b.WEARABLE_DEVICE;
                        return new gj1.c(bVar6, (gj1.b) obj, arrayList.size(), true, a.a(context, bVar6, zX));
                    }
                }
            }
            if (arrayList == null || !(!arrayList.isEmpty())) {
                return new gj1.c(ej1.b.NONE, null, 0, arrayList != null && (arrayList.isEmpty() ^ true), a.b(context, zX));
            }
            gj1.b bVar7 = (gj1.b) h0.b0(arrayList);
            if (aVarT == null && s.g(bVar7.getPrimaryTrainingCapable(), Boolean.TRUE)) {
                return new gj1.c(ej1.b.WEARABLE_TRAINING_DEVICE, bVar7, arrayList.size(), true, a.a(context, ej1.b.WEARABLE_DEVICE, zX));
            }
            ej1.b bVar8 = ej1.b.WEARABLE_DEVICE;
            return new gj1.c(bVar8, bVar7, arrayList.size(), true, a.a(context, bVar8, zX));
        }
        if (aVarT == null || (deviceId = aVarT.getDeviceId()) == null || deviceId.longValue() != j8) {
            return new gj1.c(ej1.b.NONE, null, 0, ((arrayList != null && (arrayList.isEmpty() ^ true)) || (arrayList2 != null && (arrayList2.isEmpty() ^ true))) == true && (gl.b.G(aVarT2) || s.g(aVarT2.getPrimaryTrainingCapable(), Boolean.TRUE)) == true, a.b(context, zX));
        }
        if (aVarT3 != null && s.g(aVarT3.getPrimaryTrainingCapable(), Boolean.TRUE)) {
            if (arrayList2 != null) {
                for (Object obj7 : arrayList2) {
                    if (s.g(((gj1.b) obj7).getDeviceId(), aVarT3.getDeviceId())) {
                        obj2 = obj7;
                        break;
                    }
                }
                bVar = (gj1.b) obj2;
            }
            gj1.b bVar9 = bVar;
            ej1.b bVar10 = ej1.b.TRAINING_DEVICE;
            return new gj1.c(bVar10, bVar9, arrayList2 != null ? arrayList2.size() : 0, true, a.a(context, bVar10, zX));
        }
        if (arrayList2 == null || !(!arrayList2.isEmpty())) {
            ej1.b bVar11 = ej1.b.NONE;
            if (arrayList2 != null && (!arrayList2.isEmpty())) {
                i14 = 1;
            }
            return new gj1.c(bVar11, null, 0, i14, a.b(context, zX));
        }
        gj1.b bVar12 = (gj1.b) h0.b0(arrayList2);
        if (aVarT3 != null) {
            ej1.b bVar13 = ej1.b.TRAINING_DEVICE;
            return new gj1.c(bVar13, (gj1.b) h0.b0(arrayList2), arrayList2.size(), true, a.a(context, bVar13, zX));
        }
        List<gj1.a> listF4 = fVar.f();
        if (listF4 != null) {
            for (Object obj8 : listF4) {
                if (s.g(((gj1.a) obj8).getDeviceId(), bVar12.getDeviceId())) {
                    obj3 = obj8;
                    break;
                }
            }
            aVar = (gj1.a) obj3;
        }
        if (aVar != null && gl.b.G(aVar)) {
            return new gj1.c(ej1.b.WEARABLE_TRAINING_DEVICE, bVar12, arrayList2.size(), true, a.a(context, ej1.b.WEARABLE_DEVICE, zX));
        }
        ej1.b bVar14 = ej1.b.TRAINING_DEVICE;
        return new gj1.c(bVar14, (gj1.b) h0.b0(arrayList2), arrayList2.size(), true, a.a(context, bVar14, zX));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhj1/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: hj1.b$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1664a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f83994a;

            static {
                int[] iArr = new int[ej1.b.values().length];
                try {
                    iArr[ej1.b.WEARABLE_DEVICE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ej1.b.TRAINING_DEVICE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f83994a = iArr;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static String a(Context context, ej1.b bVar, boolean z14) {
            String string;
            StringBuilder sb3 = new StringBuilder();
            if (!z14) {
                sb3.append(context.getString(R.string.device_settings_remove_device_alert_message_1));
            }
            int i14 = C1664a.f83994a[bVar.ordinal()];
            if (i14 != 1) {
                string = i14 != 2 ? context.getString(R.string.remove_primary_wearable_training_confirmation) : context.getString(R.string.remove_primary_training_confirmation);
            } else {
                string = context.getString(R.string.remove_primary_wearable_confirmation);
            }
            sb3.append(fb1.c.n("\n\n", string));
            if (z14) {
                sb3.append("\n\n" + context.getString(R.string.device_settings_remove_device_with_active_inreach_plan_alert_message));
            } else {
                sb3.append("\n\n " + context.getString(R.string.remove_device_confirmation));
            }
            return sb3.toString();
        }

        public static String b(Context context, boolean z14) {
            context.getClass();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(context.getString(R.string.no_longer_able_to_sync));
            if (z14) {
                sb3.append("\n\n");
                sb3.append(context.getString(R.string.device_settings_remove_device_with_active_inreach_plan_alert_message));
            } else {
                sb3.append(StringUtils.SPACE);
                sb3.append(context.getString(R.string.remove_device_confirmation));
            }
            return sb3.toString();
        }

        public static p c(Context context, ej1.b bVar, String str) {
            context.getClass();
            bVar.getClass();
            str.getClass();
            return C1664a.f83994a[bVar.ordinal()] == 2 ? new p(context.getString(R.string.primary_training_device_updated), context.getString(R.string.device_removed_primary_training_updated, str)) : new p(context.getString(R.string.primary_wearable_updated), context.getString(R.string.device_removed_primary_wearable_updated, str));
        }

        private a() {
        }
    }
}
