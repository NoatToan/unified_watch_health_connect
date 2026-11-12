package com.miui.circulate.api.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.ArraySet;
import androidx.annotation.RequiresApi;
import com.miui.circulate.api.bean.ExtraBundle;
import com.miui.circulate.device.api.Constant;
import com.miui.circulate.device.api.Icon;
import defpackage.fx3;
import defpackage.gx3;
import defpackage.kx3;
import defpackage.tpe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class CirculateDeviceInfo implements Parcelable {
    public static final String ACCOUNT_ID = "account_id";
    public static final String AUDIO_PLAY_STATE = "audio_play_state";
    public static final String BLUETOOTH_MAC = "bluetooth_mac";
    public static final Parcelable.Creator<CirculateDeviceInfo> CREATOR = new a();
    public static final String DEFAULT_MAC = "DEFAULT_MAC";
    public static final String DEFAULT_P2P_MAC = "DEFAULT_P2P_MAC";
    public static final String DEVICE_MODEL = "device_model";
    public static final String DEVICE_PIN_ICON = "device_pin_icon";
    public static final String DEVICE_PIN_TIME = "device_pin_time";
    public static final String DEVICE_SN = "device_sn";
    public static final String GROUP_ID = "group_id";
    public static final String HAND_OFF_SWITCH = "hand_off_switch";
    public static final String HAS_INACTIVE_HABIT = "has_inactive_habit";
    public static final String IS_GROUP = "is_group";
    public static final String IS_LYRA = "is_lyra";
    public static final String IS_MIHOME_BATCH_CONTROL = "is_iot_batch_control";
    public static final String IS_NFC_CIRCULATE = "is_nfc_circulate";
    public static final String IS_SUPPORT_STOP_FIND = "isSupportStopFind";
    public static final String IS_SUPPORT_SUB_SCREEN = "is_support_sub_screen";
    public static final String LYRA_ID = "lyra_id";
    public static final String MAC = "mac";
    public static final String MIPLAY_ID = "miplay_id";
    public static final String MIRROR_STATUS = "mirror_status";
    public static final String OPEN = "open";
    public static final String P2P_MAC = "p2p_mac";
    public static final String ROM_VERSION = "rom_version";
    public static final String ROOM_NAME = "room_name";
    public static final String SMARTHOME_DEVICE_TYPE = "smarthome_device_type";
    public static final String SOUND_DEVICE_ID = "sound_device_id";
    public static final String SPORT_HEALTH_BATTERY = "sport_health_battery";
    public static final String SPORT_HEALTH_HEIGHT = "sport_health_height";
    public static final String SPORT_HEALTH_RADIUS = "sport_health_radius";
    public static final String SPORT_HEALTH_STATE = "sport_health_state";
    public static final String SPORT_HEALTH_WIDTH = "sport_health_width";
    public static final String STATISTICS_ID = "statistics_id";
    public static final String SUB_SCREEN_STATUS = "sub_screen_status";
    public static final String TV_NOTE_MESSAGE = "tv_note_message";
    public static final String TV_NOTE_SUPPORT = "tv_note_support";
    public static final String TV_PIP_STATE = "tv_PIP_state";
    public static final int TV_PIP_STATE_CLOSE = 0;
    public static final int TV_PIP_STATE_FULL_SCREEN = 1;
    public static final int TV_PIP_STATE_SMALL_SCREEN = 2;
    public static final String TV_PIP_SUPPORT = "tv_PIP_support";
    public static final String TV_SWITCH_ACTION = "tv_switch_action";
    public static final int TV_SWITCH_OFF_SCREEN = 0;
    public static final String TV_SYSTEM_STATE = "tv_system_state";
    public static final int TV_SYSTEM_STATE_OFF = 1;
    public static final int TV_SYSTEM_STATE_ON = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10302b;
    public String c;
    public String d;
    public Map<String, String> f;
    public ExtraBundle h;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10303k;
    public Icon l;
    public Integer m;
    public int n;
    public SynergyEvent p;
    public String e = Constant.DeviceCategory.NEARBY;
    public final Object g = new Object();
    public Set<CirculateServiceInfo> i = new CopyOnWriteArraySet();
    public boolean o = false;
    public int q = Integer.MAX_VALUE;

    public class a implements Parcelable.Creator<CirculateDeviceInfo> {
        @Override // android.os.Parcelable.Creator
        @RequiresApi(api = 29)
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CirculateDeviceInfo createFromParcel(Parcel parcel) {
            return new CirculateDeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CirculateDeviceInfo[] newArray(int i) {
            return new CirculateDeviceInfo[i];
        }
    }

    @RequiresApi(api = 29)
    public CirculateDeviceInfo(Parcel parcel) {
        f(parcel);
    }

    public void a(String str, String str2) {
        if (this.f == null) {
            this.f = new ConcurrentHashMap();
        }
        if (str2 == null) {
            this.f.put(str, "");
        } else {
            this.f.put(str, str2);
        }
    }

    public CirculateServiceInfo c(int i) {
        if (this.i.size() == 0) {
            return null;
        }
        for (CirculateServiceInfo circulateServiceInfo : this.i) {
            if (fx3.b(i, circulateServiceInfo.c) && fx3.b(i, circulateServiceInfo.c)) {
                tpe.a("CirculateDeviceInfo", "find service " + i + " from " + this + " success");
                return circulateServiceInfo;
            }
        }
        tpe.f("CirculateDeviceInfo", "find service " + i + " from " + this + " fail");
        return null;
    }

    public CirculateServiceInfo d(int i, String str) {
        if (this.i.size() == 0) {
            return null;
        }
        for (CirculateServiceInfo circulateServiceInfo : this.i) {
            if (circulateServiceInfo != null && circulateServiceInfo.f10304a != null && fx3.b(i, circulateServiceInfo.c) && circulateServiceInfo.f10304a.equals(str)) {
                tpe.a("CirculateDeviceInfo", "find service " + i + " from " + this + " success");
                return circulateServiceInfo;
            }
        }
        tpe.f("CirculateDeviceInfo", "find service " + i + " from " + this + " fail");
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e(ExtraBundle extraBundle) {
        if (extraBundle == null) {
            return AbstractJsonLexerKt.NULL;
        }
        return "{has_inactive_habit=" + extraBundle.d(HAS_INACTIVE_HABIT, false) + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CirculateDeviceInfo circulateDeviceInfo = (CirculateDeviceInfo) obj;
            try {
                return this.f10301a.equals(circulateDeviceInfo.f10301a) || TextUtils.equals(circulateDeviceInfo.h.f("mac", "0"), this.h.f("mac", "1")) || TextUtils.equals(circulateDeviceInfo.h.f(P2P_MAC, "0"), this.h.f(P2P_MAC, "1"));
            } catch (Exception e) {
                tpe.d("CirculateDeviceInfo", "equals error devices=" + this.c, e);
            }
        }
        return false;
    }

    @RequiresApi(api = 29)
    public void f(Parcel parcel) {
        this.f10301a = parcel.readString();
        this.f10302b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        HashMap hashMap = parcel.readHashMap(Map.class.getClassLoader());
        if (hashMap == null) {
            this.f = new ConcurrentHashMap();
        } else {
            this.f = new ConcurrentHashMap(hashMap);
        }
        this.h = (ExtraBundle) parcel.readParcelable(ExtraBundle.class.getClassLoader());
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(CirculateServiceInfo.CREATOR);
        if (arrayListCreateTypedArrayList == null) {
            this.i = new ArraySet();
        } else {
            this.i = kx3.a(arrayListCreateTypedArrayList);
        }
        this.j = parcel.readInt();
        this.n = parcel.readInt();
    }

    public boolean g(int i) {
        CirculateServiceInfo next;
        if (this.i.size() == 0) {
            return true;
        }
        tpe.f("CirculateDeviceInfo", "remove service " + i + " from device:" + toString());
        Iterator<CirculateServiceInfo> it = this.i.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.c != i);
        if (next == null) {
            return true;
        }
        boolean zRemove = this.i.remove(next);
        tpe.a("CirculateDeviceInfo", "remove service " + next.c + ", connectState=" + next.d + ", remove result=" + zRemove + ", current service size=" + this.i.size());
        return zRemove;
    }

    public boolean h(CirculateServiceInfo circulateServiceInfo) {
        if (circulateServiceInfo == null || this.i.size() == 0) {
            return true;
        }
        return g(circulateServiceInfo.c);
    }

    public int hashCode() {
        return Objects.hash(this.f10301a);
    }

    public void i(String str) {
        Map<String, String> map = this.f;
        if (map != null) {
            map.remove(str);
        }
    }

    public String j() {
        return "id=" + tpe.e(this.f10301a) + ", devicesName=" + this.c + ", devicesType=" + this.d + ", deviceProperties=" + e(this.h);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(tpe.e(this.f10301a));
        sb.append(",idHash=");
        sb.append(tpe.e(this.f10302b));
        sb.append(",devicesName=");
        sb.append(this.c);
        sb.append(",devicesType=");
        sb.append(this.d);
        sb.append(",order=");
        sb.append(this.m);
        sb.append(",alonePlayCapacity=");
        sb.append(this.n);
        sb.append(",deviceCategory=");
        sb.append(this.e);
        sb.append(",synergyEvent=");
        sb.append(this.p);
        sb.append(",canAlonePlay=");
        sb.append(this.j);
        sb.append(",deviceProperties=");
        sb.append(e(this.h));
        Set<CirculateServiceInfo> set = this.i;
        if (set == null || set.isEmpty()) {
            sb.append(", circulateServices=0");
        } else if (gx3.d()) {
            sb.append(", circulateServices:");
            for (CirculateServiceInfo circulateServiceInfo : this.i) {
                sb.append("{");
                sb.append(circulateServiceInfo);
                sb.append("}");
            }
        } else {
            sb.append(", circulateServices=");
            sb.append(this.i.size());
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    @RequiresApi(api = 29)
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10301a);
        parcel.writeString(this.f10302b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeMap(this.f);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelableList(new ArrayList(this.i), i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.n);
    }

    public CirculateDeviceInfo() {
    }
}
