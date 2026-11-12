package com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat;

import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.a6t;
import defpackage.f4s;
import defpackage.jet;
import defpackage.lk;
import defpackage.tet;
import defpackage.wns;
import defpackage.zh;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class a extends HMProSyncDataBaseProfile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13481a;

    public a(jet jetVar) {
        super(jetVar);
        this.f13481a = -1;
    }

    public f4s a(Calendar calendar) {
        return a(calendar, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE);
    }

    public f4s b(Calendar calendar) {
        return a(calendar, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL);
    }

    public BleFirstbeat.Config c(int i) {
        this.f13481a = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        setDataCallback(new zh.b() { // from class: v1s
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f36391a.a(atomicBoolean, byteArrayOutputStream, bArr);
            }
        });
        setControlCallback(new zh.b() { // from class: w1s
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f37462a.a(atomicBoolean, bArr);
            }
        });
        if (startTransfer()) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(ErrorCode.ERROR_CODE_INVALID_PARAM);
            }
        }
        if (i == byteArrayOutputStream.size()) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            lk.b(a6t.TAG, "BleFirstbeatConfig, Bytes: " + wns.a(byteArray), new Object[0]);
            return BleFirstbeat.parseConfig(byteArray);
        }
        lk.b(a6t.TAG, "get size is not match target size<" + i + "," + byteArrayOutputStream.size() + ">", new Object[0]);
        return null;
    }

    public BleFirstbeat d(int i) {
        this.f13481a = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        setDataCallback(new zh.b() { // from class: x1s
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f38590a.b(atomicBoolean, byteArrayOutputStream, bArr);
            }
        });
        setControlCallback(new zh.b() { // from class: y1s
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f39696a.b(atomicBoolean, bArr);
            }
        });
        if (startTransfer()) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(ErrorCode.ERROR_CODE_INVALID_PARAM);
            }
        }
        if (i == byteArrayOutputStream.size()) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            lk.b(a6t.TAG, "BleFirstbeat, Bytes: " + wns.a(byteArray), new Object[0]);
            return BleFirstbeat.parse(byteArray);
        }
        lk.b(a6t.TAG, "get size is not match target size<" + i + "," + byteArrayOutputStream.size() + ">", new Object[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AtomicBoolean atomicBoolean, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        lk.d(a6t.TAG, "Receive Firstbeat Pack: " + tet.x(bArr), new Object[0]);
        int i = bArr[0] & 255;
        int i2 = this.f13481a;
        if (i2 + 1 == i || (i2 == 255 && i == 0)) {
            try {
                byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
                atomicBoolean.getAndSet(false);
            } catch (Exception e) {
                lk.b(a6t.TAG, "exception:" + e.getMessage(), new Object[0]);
                atomicBoolean.getAndSet(true);
                waitingNotify();
            }
        } else {
            lk.b(a6t.TAG, "missing package!!!", new Object[0]);
            atomicBoolean.getAndSet(true);
            waitingNotify();
        }
        this.f13481a = i;
    }

    public final f4s a(Calendar calendar, byte b2) {
        f4s dataHeader = getDataHeader(b2, (short) calendar.get(1), (byte) (calendar.get(2) + 1), (byte) calendar.get(5), (byte) calendar.get(11), (byte) calendar.get(12), (byte) calendar.get(13), (byte) ProfileUtils.getTimezoneKey(calendar.getTimeZone().getOffset(calendar.getTimeInMillis())));
        if (dataHeader != null) {
            Calendar calendar2 = dataHeader.f17406a;
            calendar2.setTimeInMillis(calendar2.getTimeInMillis() + ((long) ProfileUtils.getDstOffset(calendar2)));
        }
        return dataHeader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AtomicBoolean atomicBoolean, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        lk.d(a6t.TAG, "Receive FirstbeatConfig Pack: " + tet.x(bArr), new Object[0]);
        int i = bArr[0] & 255;
        int i2 = this.f13481a;
        if (i2 + 1 != i && (i2 != 255 || i != 0)) {
            lk.b(a6t.TAG, "missing package!!!", new Object[0]);
            atomicBoolean.getAndSet(true);
            waitingNotify();
        } else {
            try {
                byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
                atomicBoolean.getAndSet(false);
            } catch (Exception e) {
                lk.b(a6t.TAG, "exception:" + e.getMessage(), new Object[0]);
                atomicBoolean.getAndSet(true);
                waitingNotify();
            }
        }
        this.f13481a = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AtomicBoolean atomicBoolean, byte[] bArr) {
        lk.b(a6t.TAG, "Firstbeat control:" + tet.x(bArr), new Object[0]);
        atomicBoolean.set(true);
        waitingNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AtomicBoolean atomicBoolean, byte[] bArr) {
        lk.b(a6t.TAG, "FirstbeatConfig control:" + tet.x(bArr), new Object[0]);
        atomicBoolean.set(true);
        waitingNotify();
    }
}
