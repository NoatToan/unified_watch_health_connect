package defpackage;

import android.os.RemoteException;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.miot.spec.entity.SpecValueType;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class btl extends ohh {
    public int d;

    public btl(String str, int i) {
        super(str);
        this.d = r5n.a();
        this.f29177b = i;
    }

    public abstract void d(fhj fhjVar) throws RemoteException;

    public abstract void e(int i, String str) throws RemoteException;

    public abstract byte[] f();

    public int g(int i) {
        return i | 8192;
    }

    public String h() {
        return this.c + this.d;
    }

    public int i(q5n q5nVar) {
        int iByteLength = q5nVar.f().byteLength();
        Object objE = q5nVar.e();
        if (iByteLength == 0) {
            String str = (String) objE;
            iByteLength = str.getBytes().length;
            if (iByteLength > 1024) {
                c("value string :%s, size %d out of 1024,not support!", str, Integer.valueOf(str.length()));
                throw new IllegalArgumentException("string value byte size must less than 1024");
            }
        }
        return iByteLength;
    }

    public int j(q5n q5nVar) {
        SpecValueType specValueTypeF = q5nVar.f();
        Object objE = q5nVar.e();
        int iValue = specValueTypeF.value() << AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
        int iByteLength = specValueTypeF.byteLength();
        if (iByteLength == 0 && objE != null) {
            String str = (String) objE;
            iByteLength = str.getBytes().length;
            if (iByteLength > 1024) {
                c("value string :%s, size %d out of 1024,not support!", str, Integer.valueOf(str.length()));
                throw new IllegalArgumentException("string value byte size must less than 1024");
            }
        }
        return iValue | iByteLength;
    }

    public int k() {
        return this.d;
    }

    public boolean l(ByteBuffer byteBuffer, SpecValueType specValueType, Object obj) {
        if (specValueType.byteLength() == 1) {
            if (specValueType == SpecValueType.BOOL) {
                byteBuffer.put(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
            } else {
                byteBuffer.put(((Byte) obj).byteValue());
            }
        } else if (specValueType.byteLength() == 2) {
            byteBuffer.putShort(((Short) obj).shortValue());
        } else if (specValueType.byteLength() == 4) {
            if (specValueType == SpecValueType.FLOAT) {
                byteBuffer.putFloat(((Float) obj).floatValue());
            } else {
                byteBuffer.putInt(((Integer) obj).intValue());
            }
        } else if (specValueType.byteLength() == 8) {
            byteBuffer.putLong(((Long) obj).longValue());
        } else if (specValueType.byteLength() == 0 && obj != null) {
            byteBuffer.put(((String) obj).getBytes());
        }
        return true;
    }
}
