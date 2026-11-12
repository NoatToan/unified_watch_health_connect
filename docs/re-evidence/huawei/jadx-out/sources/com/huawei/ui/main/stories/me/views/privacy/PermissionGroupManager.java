package com.huawei.ui.main.stories.me.views.privacy;

import android.content.Context;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.me.views.privacy.PermissionGroup;
import defpackage.mir;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes19.dex */
public class PermissionGroupManager {
    private final Context d;
    private final List<PermissionGroup> e = new ArrayList();

    public PermissionGroupManager(Context context) {
        this.d = context;
    }

    public List<PermissionGroup> a() {
        return this.e;
    }

    public void b() {
        this.e.clear();
        h();
        j();
        n();
        i();
        l();
        m();
        o();
        c();
        f();
        e();
        r();
        g();
        k();
        d();
        p();
    }

    public void d() {
        for (PermissionGroup permissionGroup : this.e) {
            if (!permissionGroup.g()) {
                a(permissionGroup);
            }
        }
    }

    private void p() {
        this.e.sort(Comparator.comparingInt(new ToIntFunction() { // from class: vxh
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((PermissionGroup) obj).f();
            }
        }).thenComparingInt(new ToIntFunction() { // from class: vxi
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((PermissionGroup) obj).a();
            }
        }));
    }

    private void h() {
        if (CommonUtil.bg()) {
            return;
        }
        PermissionGroup permissionGroupC = PermissionGroup.c(R.string.IDS_keepalive_background_protection, R.string.IDS_hwh_permission_keepalive_desc);
        permissionGroupC.a(0);
        this.e.add(permissionGroupC);
    }

    private void j() {
        PermissionGroup permissionGroup = new PermissionGroup("android.permission-group.ACTIVITY_RECOGNITION", R.string.IDS_hwh_permission_fitness, R.string.IDS_hwh_permission_fitness_desc, Collections.singletonList("android.permission.ACTIVITY_RECOGNITION"));
        permissionGroup.a(1);
        this.e.add(permissionGroup);
    }

    private void n() {
        PermissionGroup permissionGroup = new PermissionGroup("NOTIFICATIONS_ACCESS", R.string.IDS_hwh_permission_notification, R.string.IDS_hwh_permission_notification_desc, null);
        permissionGroup.a(2);
        this.e.add(permissionGroup);
    }

    private void i() {
        PermissionGroup permissionGroup = new PermissionGroup("android.permission-group.LOCATION", R.string.IDS_hwh_permission_location, R.string.IDS_hwh_permission_location_desc, Arrays.asList("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"));
        permissionGroup.a(3);
        this.e.add(permissionGroup);
    }

    private void l() {
        PermissionGroup permissionGroup;
        if (Build.VERSION.SDK_INT >= 33) {
            permissionGroup = new PermissionGroup("android.permission-group.NEARBY_DEVICES", R.string.IDS_hwh_permission_nearby_devices, R.string.IDS_hwh_permission_nearby_devices_desc, Arrays.asList("android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT", "android.permission.NEARBY_WIFI_DEVICES"));
        } else if (Build.VERSION.SDK_INT >= 31) {
            permissionGroup = new PermissionGroup("android.permission-group.NEARBY_DEVICES", R.string.IDS_hwh_permission_nearby_devices, R.string.IDS_hwh_permission_nearby_devices_desc, Arrays.asList("android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"));
        } else {
            permissionGroup = new PermissionGroup("android.permission-group.NEARBY_DEVICES", R.string.IDS_hwh_permission_nearby_devices, R.string.IDS_hwh_permission_nearby_devices_desc, Arrays.asList("android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN"));
        }
        permissionGroup.a(4);
        this.e.add(permissionGroup);
    }

    private void m() {
        PermissionGroup permissionGroup = new PermissionGroup("android.permission-group.PHONE", R.string.IDS_hwh_permission_phone, R.string.IDS_hwh_permission_phone_desc, Arrays.asList("android.permission.READ_PHONE_STATE", "android.permission.READ_PHONE_NUMBERS", "android.permission.CALL_PHONE", "android.permission.ANSWER_PHONE_CALLS"));
        permissionGroup.a(5);
        this.e.add(permissionGroup);
    }

    private void o() {
        PermissionGroup permissionGroup = new PermissionGroup("android.permission-group.SMS", R.string.IDS_hwh_permission_sms, R.string.IDS_hwh_permission_sms_desc, Arrays.asList("android.permission.READ_SMS", "android.permission.SEND_SMS"));
        permissionGroup.a(6);
        this.e.add(permissionGroup);
    }

    private void c() {
        PermissionGroup permissionGroup = new PermissionGroup("android.permission-group.CALL_LOG", R.string.IDS_hwh_permission_call_log, R.string.IDS_hwh_permission_call_log_desc, Collections.singletonList("android.permission.READ_CALL_LOG"));
        permissionGroup.a(7);
        this.e.add(permissionGroup);
    }

    private void f() {
        PermissionGroup permissionGroup = new PermissionGroup("android.permission-group.CONTACTS", R.string.IDS_hwh_permission_contacts, R.string.IDS_hwh_permission_contacts_desc, Collections.singletonList("android.permission.READ_CONTACTS"));
        permissionGroup.a(8);
        this.e.add(permissionGroup);
    }

    private void e() {
        PermissionGroup permissionGroup = new PermissionGroup("android.permission-group.CALENDAR", R.string.IDS_hwh_permission_calendar, R.string.IDS_hwh_permission_calendar_desc, Arrays.asList("android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"));
        permissionGroup.a(9);
        this.e.add(permissionGroup);
    }

    private void r() {
        PermissionGroup permissionGroup;
        if (Build.VERSION.SDK_INT >= 34) {
            permissionGroup = new PermissionGroup("android.permission-group.STORAGE", R.string.IDS_hwh_permission_storage, R.string.IDS_hwh_permission_storage_desc, Arrays.asList("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_AUDIO"));
        } else if (Build.VERSION.SDK_INT >= 33) {
            permissionGroup = new PermissionGroup("android.permission-group.STORAGE", R.string.IDS_hwh_permission_storage, R.string.IDS_hwh_permission_storage_desc, Arrays.asList("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"));
        } else {
            permissionGroup = new PermissionGroup("android.permission-group.STORAGE", R.string.IDS_hwh_permission_storage, R.string.IDS_hwh_permission_storage_desc, Collections.singletonList("android.permission.READ_EXTERNAL_STORAGE"));
        }
        permissionGroup.a(10);
        this.e.add(permissionGroup);
    }

    private void g() {
        PermissionGroup permissionGroup = new PermissionGroup("android.permission-group.CAMERA", R.string.IDS_hwh_permission_camera, R.string.IDS_hwh_permission_camera_desc, Collections.singletonList("android.permission.CAMERA"));
        permissionGroup.a(11);
        this.e.add(permissionGroup);
    }

    private void k() {
        PermissionGroup permissionGroup = new PermissionGroup("android.permission-group.MICROPHONE", R.string.IDS_hwh_permission_microphone, R.string.IDS_hwh_permission_microphone_desc, Collections.singletonList("android.permission.RECORD_AUDIO"));
        permissionGroup.a(12);
        this.e.add(permissionGroup);
    }

    private void a(PermissionGroup permissionGroup) {
        if (permissionGroup.g()) {
            return;
        }
        if ("NOTIFICATIONS_ACCESS".equals(permissionGroup.e())) {
            e(permissionGroup);
        } else {
            b(permissionGroup);
        }
    }

    private void e(PermissionGroup permissionGroup) {
        permissionGroup.e(mir.a() ? PermissionGroup.PermissionStatus.GRANTED : PermissionGroup.PermissionStatus.NOT_GRANTED);
    }

    private void b(PermissionGroup permissionGroup) {
        List<String> listC = permissionGroup.c();
        if (listC == null || listC.isEmpty()) {
            permissionGroup.e(PermissionGroup.PermissionStatus.GRANTED);
            return;
        }
        Iterator<String> it = listC.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (ContextCompat.checkSelfPermission(this.d, it.next()) == 0) {
                i++;
            }
        }
        permissionGroup.e(d(i, listC.size()));
    }

    private PermissionGroup.PermissionStatus d(int i, int i2) {
        if (i == 0) {
            return PermissionGroup.PermissionStatus.NOT_GRANTED;
        }
        if (i == i2) {
            return PermissionGroup.PermissionStatus.GRANTED;
        }
        return PermissionGroup.PermissionStatus.PARTIAL_GRANTED;
    }
}
