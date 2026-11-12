package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.user.BirthDateExt;
import com.xiaomi.hm.health.bt.profile.user.GenderExt;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class kks extends a6t implements cj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UUID f23958b;

    public kks(jet jetVar) {
        super(jetVar);
        this.f23958b = tet.C(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AtomicReference atomicReference, CountDownLatch countDownLatch, byte[] bArr) {
        t5t.m(a6t.TAG, "user info:" + tet.x(bArr));
        atomicReference.getAndSet(i(bArr));
        countDownLatch.countDown();
    }

    @Override // defpackage.a6t
    public boolean deInit() {
        return true;
    }

    @Override // defpackage.cj
    public UserInfoExt getUserInfo(@Nullable qd qdVar) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicN = n();
        if (bluetoothGattCharacteristicN == null) {
            return null;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference();
        if (!registerNotification(bluetoothGattCharacteristicN, new zh.b() { // from class: hks
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f20175a.b(atomicReference, countDownLatch, bArr);
            }
        })) {
            t5t.d(a6t.TAG, "registerNotification user info failed!!!");
            return null;
        }
        byte[] bArr = {sv.BASE.a(), sv.READ.a(), 0};
        t5t.m(a6t.TAG, "get user info cmd:" + tet.x(bArr));
        if (write(bluetoothGattCharacteristicN, bArr)) {
            try {
                countDownLatch.await(15000L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
            unregisterNotification(bluetoothGattCharacteristicN);
            return (UserInfoExt) atomicReference.get();
        }
        unregisterNotification(bluetoothGattCharacteristicN);
        t5t.d(a6t.TAG, "write user info failed!!!");
        return null;
    }

    public final UserInfoExt i(byte[] bArr) {
        int i;
        if (bArr == null || bArr.length < 1) {
            return null;
        }
        UserInfoExt userInfoExt = new UserInfoExt();
        byte b2 = bArr[0];
        byte b3 = bArr[1];
        byte b4 = bArr[2];
        if ((sv.BIRTH.a() & b2) != 0) {
            userInfoExt.setBirthDate(new BirthDateExt((short) ((bArr[3] & 255) | ((bArr[4] & 255) << 8)), bArr[5], bArr[6]));
            i = 7;
        } else {
            i = 3;
        }
        if ((sv.GENDER.a() & b2) != 0) {
            userInfoExt.setGender(GenderExt.fromValue(bArr[i]));
            i++;
        }
        if ((sv.HEIGHT.a() & b2) != 0) {
            int i2 = i + 1;
            int i3 = bArr[i] & 255;
            i += 2;
            userInfoExt.setHeight((short) (((bArr[i2] & 255) << 8) | i3));
        }
        if ((sv.WEIGHT.a() & b2) != 0) {
            int i4 = i + 1;
            int i5 = bArr[i] & 255;
            i += 2;
            userInfoExt.setWeight((short) ((((bArr[i4] & 255) << 8) | i5) / 200));
        }
        if ((sv.GOAL.a() & b2) != 0) {
            int i6 = i + 3;
            int i7 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
            i += 4;
            userInfoExt.setGoal(i7 | ((bArr[i6] & 255) << 24));
        }
        if ((b2 & sv.UID.a()) != 0) {
            userInfoExt.setUid(((bArr[i + 3] & 255) << 24) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16));
        }
        return userInfoExt;
    }

    @Override // defpackage.a6t
    public boolean init() {
        return true;
    }

    public BluetoothGattCharacteristic n() {
        UUID uuid = a6t.UUID_SERVICE_MILI_SERVICE;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            t5t.d(a6t.TAG, uuid + " is null!");
            return null;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.f23958b);
        if (characteristic != null) {
            return characteristic;
        }
        t5t.d(a6t.TAG, this.f23958b + " is null!");
        return null;
    }

    @Override // defpackage.cj
    public boolean setGoal(int i) {
        t5t.m(a6t.TAG, "profile set goal: " + i);
        BluetoothGattCharacteristic bluetoothGattCharacteristicN = n();
        if (bluetoothGattCharacteristicN == null) {
            return false;
        }
        byte[] bArr = {sv.GOAL.a(), sv.WRITE.a(), 0, (byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
        t5t.m(a6t.TAG, "cmd:" + tet.x(bArr));
        return write(bluetoothGattCharacteristicN, bArr);
    }

    @Override // defpackage.cj
    public boolean setLocation(@NotNull kk kkVar) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicN = n();
        if (bluetoothGattCharacteristicN == null) {
            return false;
        }
        byte[] bArr = {sv.LOCATION.a(), sv.WRITE.a(), 0, (byte) ((kkVar.a().a() << 7) | kkVar.d().a())};
        t5t.m(a6t.TAG, "cmd:" + tet.x(bArr));
        return write(bluetoothGattCharacteristicN, bArr);
    }

    @Override // defpackage.cj
    public boolean setUserInfo(@NotNull UserInfoExt userInfoExt) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicN = n();
        if (bluetoothGattCharacteristicN == null) {
            return false;
        }
        byte[] bArrBytesOfUserInfo = ProfileUtils.bytesOfUserInfo(userInfoExt);
        t5t.m(a6t.TAG, "cmd:" + tet.x(bArrBytesOfUserInfo));
        return write(bluetoothGattCharacteristicN, bArrBytesOfUserInfo);
    }
}
