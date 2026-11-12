package com.garmin.android.apps.connectmobile.bikesensors;

import android.text.TextUtils;
import bd0.b0;
import com.garmin.gcsprotos.generated.FitnessDeviceProto;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class e implements gk0.c<FitnessDeviceProto.FitnessDeviceServiceResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f30872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f30873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f30874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f30875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f30876e;

    public e(c cVar, List list, List list2, List list3, List list4) {
        this.f30876e = cVar;
        this.f30872a = list;
        this.f30873b = list2;
        this.f30874c = list3;
        this.f30875d = list4;
    }

    @Override // gk0.c
    public final void a(Exception exc) {
        c cVar = this.f30876e;
        if (cVar.f30862b.get() != null) {
            b0 b0Var = b0.DEVICE_MESSAGE_FAILED;
            exc.getMessage();
            b0Var.getClass();
            cVar.f30862b.get().c(b0Var);
        }
    }

    @Override // gk0.c
    public final void b(FitnessDeviceProto.FitnessDeviceServiceResponse fitnessDeviceServiceResponse) {
        String str;
        String string;
        FitnessDeviceProto.FitnessDeviceServiceResponse fitnessDeviceServiceResponse2 = fitnessDeviceServiceResponse;
        c cVar = this.f30876e;
        if (fitnessDeviceServiceResponse2 == null || !fitnessDeviceServiceResponse2.hasMessageListResponse()) {
            if (cVar.f30862b.get() != null) {
                cVar.f30862b.get().c(b0.EMPTY_DEVICE_MESSAGE);
                return;
            }
            return;
        }
        List<FitnessDeviceProto.DeviceMessage> deviceMessagesList = fitnessDeviceServiceResponse2.getMessageListResponse().getDeviceMessagesList();
        int i14 = c.f30860e;
        cVar.getClass();
        if (deviceMessagesList != null && !deviceMessagesList.isEmpty()) {
            for (FitnessDeviceProto.DeviceMessage deviceMessage : deviceMessagesList) {
                deviceMessage.getMessageId();
                Objects.toString(deviceMessage.getMessageType());
                if (deviceMessage.hasMessageName()) {
                    deviceMessage.getMessageName();
                }
                if (deviceMessage.hasFileName()) {
                    deviceMessage.getFileName();
                }
                if (deviceMessage.hasFileSize()) {
                    deviceMessage.getFileSize();
                }
            }
        }
        List list = this.f30875d;
        List list2 = this.f30874c;
        List list3 = this.f30873b;
        List list4 = this.f30872a;
        if (deviceMessagesList != null) {
            String firmwareVersion = null;
            for (FitnessDeviceProto.DeviceMessage deviceMessage2 : deviceMessagesList) {
                if (deviceMessage2.getMessageType() == FitnessDeviceProto.MessageType.SOFTWARE_UPDATE) {
                    String strTrim = deviceMessage2.hasServerPath() ? deviceMessage2.getServerPath().trim() : null;
                    String strTrim2 = deviceMessage2.hasFileName() ? deviceMessage2.getFileName().trim() : null;
                    if (TextUtils.isEmpty(strTrim) || TextUtils.isEmpty(strTrim2)) {
                        string = null;
                    } else {
                        StringBuilder sb3 = new StringBuilder(strTrim);
                        if (!strTrim.endsWith("/") && !strTrim2.startsWith("/")) {
                            sb3.append("/");
                        }
                        sb3.append(strTrim2);
                        string = sb3.toString();
                    }
                    list4.add(string);
                    StringBuilder sb4 = new StringBuilder();
                    for (int i15 = 0; i15 < deviceMessage2.getDeviceMessageChangeLogCount(); i15++) {
                        if (deviceMessage2.getDeviceMessageChangeLog(i15).hasChangeDetails()) {
                            sb4.append(deviceMessage2.getDeviceMessageChangeLog(i15).getChangeDetails());
                        }
                    }
                    list3.add(sb4.toString());
                    if (deviceMessage2.hasVersion()) {
                        list2.add(deviceMessage2.getVersion());
                    }
                    list.add(Long.valueOf(deviceMessage2.getMessageId()));
                    if (deviceMessage2.hasFirmwareVersion()) {
                        firmwareVersion = deviceMessage2.getFirmwareVersion();
                    }
                }
                if (deviceMessage2.getMessageType() == FitnessDeviceProto.MessageType.DEVICE_SETTINGS) {
                    firmwareVersion = deviceMessage2.getFirmwareVersion();
                }
            }
            str = firmwareVersion;
        } else {
            str = null;
        }
        if (cVar.f30862b.get() != null) {
            if (list.isEmpty() || list2.isEmpty() || list3.isEmpty() || list4.isEmpty()) {
                cVar.f30862b.get().a(new c.b(str, "", "", "", -1L));
            } else {
                cVar.f30862b.get().a(new c.b(str, (String) list2.get(0), (String) list3.get(0), (String) list4.get(0), ((Long) list.get(0)).longValue()));
            }
        }
    }
}
